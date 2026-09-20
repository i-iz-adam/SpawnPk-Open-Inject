import os

ca_fp = r'src/main/java/rs/p_f/C_a.java'
if os.path.exists(ca_fp):
    with open(ca_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    content = content.replace('public static C_a.c a(String var0)', 'public static C_a.Mode a(String var0)')
    content = content.replace('public static c a(String var0)', 'public static Mode a(String var0)')
    
    with open(ca_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Fixed line 772 in C_a.java!")
