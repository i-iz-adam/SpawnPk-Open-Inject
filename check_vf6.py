import os

files_to_check = [
    r'temp_vf_src\rs\p_a\C_h.java',
    r'temp_vf_src\rs\p_A_uc\C_j.java',
    r'temp_vf_src\rs\p_i\C_b.java',
    r'temp_vf_src\rs\p_l\p_b\C_b.java',
    r'temp_vf_src\rs\p_l\p_b\C_d.java',
    r'temp_vf_src\rs\p_x\C_a.java'
]

for fp in files_to_check:
    if os.path.exists(fp):
        with open(fp, encoding='utf-8', errors='replace') as f:
            content = f.read()
            failed = "Couldn't be decompiled" in content
            print(f'{fp}: {"FAILED" if failed else "OK"}')
    else:
        print(f'{fp}: MISSING')
