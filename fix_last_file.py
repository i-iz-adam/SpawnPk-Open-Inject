import os

cd_path = r'src/main/java/rs/p_l/p_b/C_d.java'
if os.path.exists(cd_path):
    with open(cd_path, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    content = content.replace('lbl-1000:', '')
    content = content.replace('//  lbl-1000:', '')
    
    with open(cd_path, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Fixed C_d.java label line!")
