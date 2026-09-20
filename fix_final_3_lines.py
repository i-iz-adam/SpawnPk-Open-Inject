import os

client_fp = r'src/main/java/rs/C_Client_mc.java'
if os.path.exists(client_fp):
    with open(client_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    content = content.replace('private final C_a.a[] iM = rs.p_m.C_a.a();', 'private final rs.p_m.C_a.a[] iM = rs.p_m.C_a.a();')
    content = content.replace('public void a(C_a.c c2) {', 'public void a(rs.p_f.C_a.c c2) {')
    content = content.replace('public void a(C_a.c c2, int n, int n2) {', 'public void a(rs.p_f.C_a.c c2, int n, int n2) {')
    
    with open(client_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Fixed final 3 lines in C_Client_mc.java!")
