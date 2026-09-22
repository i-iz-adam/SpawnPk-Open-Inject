import os, re

MAPPING = {
    'rs.s': 'rs.plugins', 'rs.l': 'rs.lpkg', 'rs.p': 'rs.ppkg',
    'rs.gui.a': 'rs.gui.apkg', 'rs.gui.b': 'rs.gui.bpkg',
    'rs.gui.b.a': 'rs.gui.bpkg.apkg', 'rs.gui.b.b': 'rs.gui.bpkg.bpkg',
    'rs.gui.b.c': 'rs.gui.bpkg.cpkg', 'rs.gui.c': 'rs.gui.cpkg',
    'rs.l.a': 'rs.lpkg.apkg', 'rs.l.b': 'rs.lpkg.bpkg',
    'rs.l.c': 'rs.lpkg.cpkg', 'rs.l.d': 'rs.lpkg.dpkg',
    'rs.s.a': 'rs.plugins.apkg', 'rs.s.b': 'rs.plugins.bpkg',
    'rs.s.c': 'rs.plugins.cpkg', 'rs.s.d': 'rs.plugins.dpkg',
    'rs.s.e': 'rs.plugins.epkg', 'rs.s.f': 'rs.plugins.fpkg',
    'rs.s.g': 'rs.plugins.gpkg', 'rs.s.h': 'rs.plugins.hpkg',
    'rs.s.q.a': 'rs.plugins.q.apkg', 'rs.s.q.b': 'rs.plugins.q.bpkg',
    'rs.ui.a': 'rs.ui.apkg', 'rs.ui.b': 'rs.ui.bpkg', 'rs.ui.c': 'rs.ui.cpkg',
    'rs.ui.components.a': 'rs.ui.components.apkg',
    'rs.ui.components.b': 'rs.ui.components.bpkg',
}

pats = []
for old, new in MAPPING.items():
    if '.' in old.rsplit('.', 1)[0]:
        parent_new = new.rsplit('.', 1)[0]
        oldlast = old.rsplit('.', 1)[1]
        pats.append((parent_new + '.' + oldlast + '.', new))

java_files = []
for dirpath, _, fns in os.walk('src'):
    for fn in fns:
        if fn.endswith('.java'):
            java_files.append(os.path.join(dirpath, fn))

for fp in java_files:
    lines = open(fp, encoding='utf-8', errors='replace').read().split('\n')
    for li, line in enumerate(lines):
        parts = line.split('"')
        for pi in range(0, len(parts), 2):
            seg = parts[pi]
            if seg.lstrip().startswith('package '):
                continue
            for bad, new in pats:
                for m in re.finditer(r'(?<![\w])' + re.escape(bad) + r'(\w+)', seg):
                    print(f"{fp}:{li+1}: [{bad}{m.group(1)}] {line.strip()[:130]}")
