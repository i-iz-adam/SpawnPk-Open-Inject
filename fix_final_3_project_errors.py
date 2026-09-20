import os

# 1. Fix C_Client_mc.java line 293
client_fp = r'src/main/java/rs/C_Client_mc.java'
if os.path.exists(client_fp):
    with open(client_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('private final C_a.a[] iM = rs.p_m.C_a.a();', 'private final rs.p_m.C_a.a[] iM = rs.p_m.C_a.a();')
    with open(client_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Fixed C_Client_mc.java line 293!")

# 2. Fix rs/p_s/p_f/C_e.java
ce_fp = r'src/main/java/rs/p_s/p_f/C_e.java'
if os.path.exists(ce_fp):
    with open(ce_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('import com.google.c.c.a;', 'import com.google.gson.reflect.TypeToken;')
    content = content.replace('class C_e extends a<List<C_f>>', 'class C_e extends TypeToken<List<C_f>>')
    with open(ce_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Fixed C_e.java Gson TypeToken references!")
