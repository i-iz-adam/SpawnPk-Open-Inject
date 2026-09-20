import os
import re

for fp in [r'src/main/java/rs/C_C_uc.java', r'src/main/java/rs/C_Client_mc.java']:
    if os.path.exists(fp):
        with open(fp, encoding='utf-8', errors='replace') as f:
            content = f.read()
        
        # Remove conflicting static inner imports
        content = content.replace('import rs.p_f.C_a.a;\n', '')
        content = content.replace('import rs.p_f.C_a.b;\n', '')
        content = content.replace('import rs.p_f.C_a.c;\n', '')
        content = content.replace('import rs.p_d.C_r.a;\n', '')
        content = content.replace('import rs.p_d.C_h.a;\n', '')
        
        with open(fp, 'w', encoding='utf-8') as f:
            f.write(content)
        print(f"Cleaned import shadowing in {fp}")
