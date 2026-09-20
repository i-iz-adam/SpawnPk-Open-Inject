import os

client_fp = r'src/main/java/rs/C_Client_mc.java'
if os.path.exists(client_fp):
    with open(client_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    content = content.replace('C_a.c.a', 'rs.p_f.C_a.c.a')
    content = content.replace('C_a.c.b', 'rs.p_f.C_a.c.b')
    content = content.replace('C_a.c.c', 'rs.p_f.C_a.c.c')
    content = content.replace('C_a.c.d', 'rs.p_f.C_a.c.d')
    content = content.replace('C_h.a.a', 'rs.p_d.C_h.a.a')
    content = content.replace('C_h.a.b', 'rs.p_d.C_h.a.b')
    content = content.replace('C_h.a.c', 'rs.p_d.C_h.a.c')
    content = content.replace('C_r.a.a', 'rs.p_d.C_r.a.a')
    content = content.replace('C_r.a.b', 'rs.p_d.C_r.a.b')
    content = content.replace('C_r.a.c', 'rs.p_d.C_r.a.c')
    content = content.replace('C_r.a.d', 'rs.p_d.C_r.a.d')
    
    with open(client_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Fixed C_Client_mc.java enum references!")
