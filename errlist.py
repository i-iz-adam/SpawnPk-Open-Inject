import re

lines = open('verify_all.txt', encoding='utf-8', errors='replace').read().split('\n')
out = []
for i, ln in enumerate(lines):
    m = re.match(r'.+\\src\\(.+?\.java):(\d+): error: (.+)', ln)
    if m:
        sym = loc = code = ''
        for j in range(i+1, min(i+4, len(lines))):
            s = lines[j].strip()
            if s.startswith('symbol:'):
                sym = s
            elif s.startswith('location:'):
                loc = s
            elif s and not s.startswith('^') and not code:
                code = s[:110]
        out.append(f"{m.group(1)}:{m.group(2)} [{m.group(3)}] {code} | {sym} | {loc}")
with open('errlist.txt', 'w') as f:
    f.write('\n'.join(out))
print(f"{len(out)} errors listed")
