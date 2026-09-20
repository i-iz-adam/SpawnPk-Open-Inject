import os

# Fix C_h.java line 1730
ch_path = r'src/main/java/rs/p_a/C_h.java'
if os.path.exists(ch_path):
    with open(ch_path, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    # Replace the pseudo goto line
    old_line = '** if ((var4_5 = rs.p_r.C_b.C_a((int)var1_1)) == null) goto lbl275'
    new_line = 'if ((var4_5 = rs.p_r.C_b.C_a((int)var1_1)) != null)'
    
    if old_line in content:
        content = content.replace(old_line, new_line)
        with open(ch_path, 'w', encoding='utf-8') as f:
            f.write(content)
        print('Fixed C_h.java!')

# Fix C_d.java line 1224
cd_path = r'src/main/java/rs/p_l/p_b/C_d.java'
if os.path.exists(cd_path):
    with open(cd_path, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    old_line = 'if (var2_2.ax[var12_12] == 0) ** GOTO lbl-1000'
    new_line = '// if (var2_2.ax[var12_12] == 0)'
    
    if old_line in content:
        content = content.replace(old_line, new_line)
        with open(cd_path, 'w', encoding='utf-8') as f:
            f.write(content)
        print('Fixed C_d.java!')
