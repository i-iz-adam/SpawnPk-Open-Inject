import zipfile
import struct
import os
import sys
import re
import time
import subprocess
import shutil
from collections import defaultdict

JAVA_KEYWORDS = {
    'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class',
    'const', 'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final',
    'finally', 'float', 'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int',
    'interface', 'long', 'native', 'new', 'package', 'private', 'protected', 'public',
    'return', 'short', 'static', 'strictfp', 'super', 'switch', 'synchronized', 'this',
    'throw', 'throws', 'transient', 'try', 'void', 'volatile', 'while', 'record', 'yield', 'var'
}

client_jar_path = r"C:\Users\naxos\.spawnpk-data\client.jar"

def should_remap_path(path):
    if path.startswith('rs/') or path.startswith('a/') or path.startswith('gnu/trove/'):
        return True
    return False

with zipfile.ZipFile(client_jar_path, 'r') as z:
    all_names = z.namelist()
    all_classes = [name[:-6] for name in all_names if name.endswith('.class') and should_remap_path(name)]

def map_single_name(p, is_class=False):
    if p == 'rs' and not is_class:
        return 'rs'
    if p.startswith('C_') or p.startswith('p_'):
        return p
    prefix = 'C_' if is_class else 'p_'
    if p in JAVA_KEYWORDS:
        return prefix + p + '_kw'
    elif len(p) <= 3:
        if p.isupper():
            return prefix + p + '_uc'
        elif p.islower():
            return prefix + p
        else:
            return prefix + p + '_mc'
    else:
        if p.isupper():
            return prefix + p + '_uc'
        elif p.islower():
            return prefix + p
        else:
            return prefix + p + '_mc'

def map_package_segment(s):
    return map_single_name(s, is_class=False)

def map_class_name(cls_name):
    parts = cls_name.split('$')
    outer = map_single_name(parts[0], is_class=True)
    inners = parts[1:]
    if inners:
        return outer + '$' + '$'.join(inners)
    return outer

def map_full_path(full_path):
    if not should_remap_path(full_path):
        return full_path
    parts = full_path.split('/')
    mapped_pkg = [map_package_segment(p) for p in parts[:-1]]
    mapped_cls = map_class_name(parts[-1])
    if mapped_pkg:
        return '/'.join(mapped_pkg) + '/' + mapped_cls
    return mapped_cls

class_map = {orig: map_full_path(orig) for orig in all_classes}

dot_map = {}
for orig, mapped in class_map.items():
    mapped_dot = mapped.replace('/', '.')
    
    orig_dot = orig.replace('/', '.').replace('$', '.')
    dot_map[orig_dot] = mapped_dot
    
    orig_dot_dollar = orig.replace('/', '.')
    dot_map[orig_dot_dollar] = mapped_dot

sig_regex = re.compile(r'L([a-zA-Z0-9_\/$]+)')

def replace_sig_class(match):
    cls = match.group(1)
    if cls in class_map:
        return 'L' + class_map[cls]
    return match.group(0)

def replace_utf8(s):
    if s in JAVA_KEYWORDS:
        return 'kw_' + s
    if s in class_map:
        return class_map[s]
    if s in dot_map:
        return dot_map[s]
    if 'L' in s:
        return sig_regex.sub(replace_sig_class, s)
    return s

def remap_class_bytes(data):
    if len(data) < 10:
        return data
    magic = struct.unpack('>I', data[:4])[0]
    if magic != 0xCAFEBABE:
        return data
    magic, minor, major, cp_count = struct.unpack('>IHHH', data[:10])
    offset = 10
    cp_bytes = bytearray()
    i = 1
    while i < cp_count:
        tag = data[offset]
        offset += 1
        cp_bytes.append(tag)
        if tag == 1:
            length = struct.unpack('>H', data[offset:offset+2])[0]
            offset += 2
            raw_str = data[offset:offset+length].decode('utf-8', errors='replace')
            offset += length
            new_str = replace_utf8(raw_str)
            new_encoded = new_str.encode('utf-8')
            cp_bytes.extend(struct.pack('>H', len(new_encoded)))
            cp_bytes.extend(new_encoded)
        elif tag in (3, 4):
            cp_bytes.extend(data[offset:offset+4])
            offset += 4
        elif tag in (5, 6):
            cp_bytes.extend(data[offset:offset+8])
            offset += 8
            i += 1
        elif tag in (7, 8, 16, 19, 20):
            cp_bytes.extend(data[offset:offset+2])
            offset += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            cp_bytes.extend(data[offset:offset+4])
            offset += 4
        elif tag == 15:
            cp_bytes.extend(data[offset:offset+3])
            offset += 3
        else:
            raise ValueError(f'Unknown CP tag {tag}')
        i += 1
    return data[:10] + bytes(cp_bytes) + data[offset:]

print("Step 1: Remapping client.jar and client-obfuscated-deps.jar...")
t0 = time.time()

libs_dir = 'libs'
os.makedirs(libs_dir, exist_ok=True)
obf_deps_jar = os.path.join(libs_dir, 'client-obfuscated-deps.jar')

with zipfile.ZipFile(client_jar_path, 'r') as z_in, \
     zipfile.ZipFile('client-remapped.jar', 'w') as z_remapped, \
     zipfile.ZipFile('rs-only-remapped.jar', 'w') as z_rs_only, \
     zipfile.ZipFile(obf_deps_jar, 'w') as z_deps:
    
    written_remapped = set()
    written_deps = set()
    
    for item in z_in.infolist():
        name = item.filename
        data = z_in.read(name)
        
        if name.endswith('.class'):
            orig_cls = name[:-6]
            if orig_cls in class_map:
                new_cls = class_map[orig_cls]
                new_name = new_cls + '.class'
                remapped_data = remap_class_bytes(data)
                
                if new_name not in written_remapped:
                    z_remapped.writestr(new_name, remapped_data)
                    written_remapped.add(new_name)
                
                if name.startswith('rs/'):
                    z_rs_only.writestr(new_name, remapped_data)
                else:
                    if new_name not in written_deps:
                        z_deps.writestr(new_name, remapped_data)
                        written_deps.add(new_name)
            else:
                remapped_data = remap_class_bytes(data)
                z_remapped.writestr(name, remapped_data)
                if not name.startswith('rs/'):
                    z_deps.writestr(name, remapped_data)
        else:
            z_remapped.writestr(item, data)
            if not name.startswith('rs/'):
                z_deps.writestr(item, data)

t1 = time.time()
print(f"Step 1 finished in {t1-t0:.2f} seconds!")

print("Step 2: Decompiling rs-only-remapped.jar with Vineflower...")
java_bin = r"C:\Users\naxos\.jdks\corretto-21.0.10\bin\java.exe"

# Clean old decompiled directories
for d in ['temp_vf_src', 'temp_cfr_src']:
    if os.path.exists(d):
        shutil.rmtree(d)
    os.makedirs(d, exist_ok=True)

# Vineflower
cmd_vf = [java_bin, '-jar', r"tools\vineflower-1.10.1.jar", 'rs-only-remapped.jar', 'temp_vf_src']
res_vf = subprocess.run(cmd_vf, capture_output=True, text=True)

target_dir = r"src\main\java\rs"
if os.path.exists(target_dir):
    shutil.rmtree(target_dir)

# Copy base from Vineflower
if os.path.exists(r"temp_vf_src\rs"):
    shutil.copytree(r"temp_vf_src\rs", target_dir)
elif os.path.exists(r"temp_vf_src\p_rs"):
    shutil.copytree(r"temp_vf_src\p_rs", target_dir)

# Check if any Vineflower files failed
failed_files = []
for root, dirs, files in os.walk(target_dir):
    for f in files:
        if f.endswith('.java'):
            fp = os.path.join(root, f)
            with open(fp, encoding='utf-8', errors='replace') as file:
                if "Couldn't be decompiled" in file.read():
                    failed_files.append(fp)

if failed_files:
    print(f"Found {len(failed_files)} failed Vineflower files. Running CFR fallback...")
    cmd_cfr = [java_bin, '-jar', r"tools\cfr-0.152.jar", 'rs-only-remapped.jar', '--outputdir', 'temp_cfr_src']
    subprocess.run(cmd_cfr, capture_output=True, text=True)
    
    for fp in failed_files:
        rel_path = os.path.relpath(fp, target_dir)
        cfr_fp = os.path.join('temp_cfr_src', 'rs', rel_path)
        if not os.path.exists(cfr_fp):
            cfr_fp = os.path.join('temp_cfr_src', rel_path)
        if os.path.exists(cfr_fp):
            shutil.copyfile(cfr_fp, fp)
            print(f"Replaced {rel_path} with CFR version.")

print("Step 3: Post-processing fixes (StringConcatFactory, synthetic GOTO, import cleanup)...")
concat_pattern = re.compile(r'StringConcatFactory\.makeConcatWithConstants<[^>]+>\((.*?)\)')
import_dollar_pattern = re.compile(r'import\s+([a-zA-Z0-9_\.\$]+);')
lbl_pattern = re.compile(r'^\s*lbl[0-9\-]+:\s*$')

# Collect all class simple names per package in target_dir
pkg_classes = defaultdict(set)
for root, dirs, files in os.walk(target_dir):
    rel_pkg = os.path.relpath(root, 'src/main/java').replace('\\', '.').replace('/', '.')
    for f in files:
        if f.endswith('.java') and '$' not in f:
            cls_simple = f[:-5]
            pkg_classes[rel_pkg].add(cls_simple)

def fix_import(match):
    path = match.group(1).replace('$', '.')
    return f"import {path};"

def resolve_import_conflicts(fp, content):
    rel_dir = os.path.dirname(os.path.relpath(fp, 'src/main/java')).replace('\\', '.').replace('/', '.')
    current_pkg_classes = pkg_classes.get(rel_dir, set())

    import_lines = re.findall(r'import\s+([a-zA-Z0-9_\.]+);', content)
    simple_to_full = defaultdict(list)
    for imp in import_lines:
        simple = imp.split('.')[-1]
        simple_to_full[simple].append(imp)
        
    conflicts = {simple: fulls for simple, fulls in simple_to_full.items() if len(fulls) > 1}
    
    new_content = content
    for simple, fulls in conflicts.items():
        for full in fulls:
            new_content = new_content.replace(f'import {full};\n', '')
            new_content = new_content.replace(f'import {full};', '')
            
    # Also remove imports of classes that match a class in current package
    for imp in import_lines:
        simple = imp.split('.')[-1]
        pkg_of_imp = '.'.join(imp.split('.')[:-1])
        if simple in current_pkg_classes and pkg_of_imp != rel_dir:
            new_content = new_content.replace(f'import {imp};\n', '')
            new_content = new_content.replace(f'import {imp};', '')

    return new_content

updated_files = 0

for root, dirs, files in os.walk(target_dir):
    for f in files:
        if f.endswith('.java'):
            # Remove standalone Outer$Inner.java files if Outer.java exists in same directory
            if '$' in f:
                outer_name = f.split('$')[0] + '.java'
                if os.path.exists(os.path.join(root, outer_name)):
                    os.remove(os.path.join(root, f))
                    continue
            
            fp = os.path.join(root, f)
            with open(fp, encoding='utf-8', errors='replace') as file:
                lines = file.readlines()
            
            new_lines = []
            modified = False
            
            for line in lines:
                l = line
                if '**' in l and ('GOTO' in l or 'goto' in l or 'if' in l):
                    l = '// ' + l
                    modified = True
                elif lbl_pattern.match(l):
                    l = '// ' + l
                    modified = True
                
                if 'makeConcatWithConstants' in l:
                    l = concat_pattern.sub(r'String.valueOf(\1)', l)
                    modified = True

                if 'import ' in l and '$' in l:
                    l = import_dollar_pattern.sub(fix_import, l)
                    modified = True
                    
                new_lines.append(l)
                
            full_text = "".join(new_lines)
            cleaned_text = resolve_import_conflicts(fp, full_text)
            if cleaned_text != full_text or modified:
                with open(fp, 'w', encoding='utf-8') as file:
                    file.write(cleaned_text)
                updated_files += 1

print(f"Done! Post-processed {updated_files} files.")
