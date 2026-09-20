import os
import subprocess

print("Running clean_run...")
subprocess.run(['python', 'clean_run.py'])
subprocess.run(['python', 'fix_last_file.py'])

# 1. Fix C_a.java Integer c field name
ca_fp = r'src/main/java/rs/p_f/C_a.java'
if os.path.exists(ca_fp):
    with open(ca_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('public static final Integer c = 307;', 'public static final Integer c_val = 307;')
    content = content.replace('!d && c == 1', '!d && c_val == 1')
    content = content.replace('boolean k = c == 1', 'boolean k = c_val == 1')
    with open(ca_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Renamed Integer c to c_val in C_a.java!")

# 2. Fix C_Client_mc.java parameters
client_fp = r'src/main/java/rs/C_Client_mc.java'
if os.path.exists(client_fp):
    with open(client_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('private final C_a.a[] iM = rs.p_m.C_a.a();', 'private final rs.p_m.C_a.a[] iM = rs.p_m.C_a.a();')
    content = content.replace('public void a(C_a.c c2)', 'public void a(rs.p_f.C_a.c c2)')
    content = content.replace('public void a(C_a.c c2, int n, int n2)', 'public void a(rs.p_f.C_a.c c2, int n, int n2)')
    with open(client_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_Client_mc.java parameters!")
