import os
import shutil
import re

vf_dir = 'temp_vf_src'
cfr_dir = 'temp_cfr_src'
target_dir = r'src\main\java\rs'

if os.path.exists(target_dir):
    shutil.rmtree(target_dir)

# Copy Vineflower output to src/main/java/rs
if os.path.exists(os.path.join(vf_dir, 'rs')):
    shutil.copytree(os.path.join(vf_dir, 'rs'), target_dir)
elif os.path.exists(os.path.join(vf_dir, 'p_rs')):
    shutil.copytree(os.path.join(vf_dir, 'p_rs'), target_dir)

print("Base copied from Vineflower!")

# Replace any failed Vineflower files with CFR output
replaced_count = 0
for root, dirs, files in os.walk(target_dir):
    for f in files:
        if f.endswith('.java'):
            fp = os.path.join(root, f)
            with open(fp, encoding='utf-8', errors='replace') as file:
                content = file.read()
            if "Couldn't be decompiled" in content:
                rel_path = os.path.relpath(fp, target_dir)
                cfr_fp = os.path.join(cfr_dir, 'rs', rel_path)
                if not os.path.exists(cfr_fp):
                    cfr_fp = os.path.join(cfr_dir, rel_path)
                if os.path.exists(cfr_fp):
                    shutil.copyfile(cfr_fp, fp)
                    replaced_count += 1
                    print(f"Replaced failed file with CFR version: {rel_path}")

print(f"Replaced {replaced_count} failed Vineflower files with CFR versions!")

# Clean up synthetic CFR goto lines across target_dir
goto_pattern = re.compile(r'.*\*\*.*GOTO.*')
lbl_pattern = re.compile(r'^\s*lbl[0-9\-]+:\s*$')

cleaned_goto = 0
for root, dirs, files in os.walk(target_dir):
    for f in files:
        if f.endswith('.java'):
            fp = os.path.join(root, f)
            with open(fp, encoding='utf-8', errors='replace') as file:
                lines = file.readlines()
            new_lines = []
            modified = False
            for line in lines:
                if '**' in line and ('GOTO' in line or 'goto' in line or 'if' in line):
                    new_lines.append('// ' + line)
                    modified = True
                elif lbl_pattern.match(line):
                    new_lines.append('// ' + line)
                    modified = True
                else:
                    new_lines.append(line)
            if modified:
                with open(fp, 'w', encoding='utf-8') as file:
                    file.writelines(new_lines)
                cleaned_goto += 1

print(f"Cleaned synthetic GOTO lines in {cleaned_goto} files!")
