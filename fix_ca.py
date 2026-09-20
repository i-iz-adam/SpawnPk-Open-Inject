import os

ca_path = r'src/main/java/rs/p_A_uc/C_a.java'
if os.path.exists(ca_path):
    with open(ca_path, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('private static final class a {', 'public static final class a {')
    content = content.replace('private static final class b {', 'public static final class b {')
    with open(ca_path, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_a.java access modifiers!")
