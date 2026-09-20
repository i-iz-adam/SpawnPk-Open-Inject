import os

# 1. Fix src/main/java/rs/p_A_uc/C_a.java
ca_path = r'src/main/java/rs/p_A_uc/C_a.java'
if os.path.exists(ca_path):
    with open(ca_path, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('private static final class a {', 'public static final class a {')
    content = content.replace('private static final class b {', 'public static final class b {')
    with open(ca_path, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_a.java access modifiers!")

# 2. Fix src/main/java/rs/C_Client_mc.java
client_path = r'src/main/java/rs/C_Client_mc.java'
if os.path.exists(client_path):
    with open(client_path, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('private final C_a.a[] iM = rs.p_m.C_a.a();', 'private final rs.p_m.C_a.a[] iM = rs.p_m.C_a.a();')
    content = content.replace('public void a(C_a.c c2)', 'public void a(rs.p_f.C_a.c c2)')
    content = content.replace('public void a(C_a.c c2, int n, int n2)', 'public void a(rs.p_f.C_a.c c2, int n, int n2)')
    with open(client_path, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_Client_mc.java inner class references!")
