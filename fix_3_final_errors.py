import os

# 1. Update rs/p_f/C_a.java enum c -> CanvasMode
ca_fp = r'src/main/java/rs/p_f/C_a.java'
if os.path.exists(ca_fp):
    with open(ca_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('public static enum c {', 'public static enum CanvasMode {')
    content = content.replace('public static C_a.c ai = C_a.c.a;', 'public static CanvasMode ai = CanvasMode.a;')
    content = content.replace('public static C_a.c a(String', 'public static CanvasMode a(String')
    content = content.replace('public static c a(String', 'public static CanvasMode a(String')
    content = content.replace('ai = C_a.c.a(var1.getProperty("screen_mode"));', 'ai = CanvasMode.a(var1.getProperty("screen_mode"));')
    with open(ca_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_a.java CanvasMode enum!")

# 2. Update C_Client_mc.java
client_fp = r'src/main/java/rs/C_Client_mc.java'
if os.path.exists(client_fp):
    with open(client_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    content = content.replace('private final C_a.a[] iM = rs.p_m.C_a.a();', 'private final rs.p_m.C_a.a[] iM = rs.p_m.C_a.a();')
    content = content.replace('public void a(C_a.c c2)', 'public void a(rs.p_f.C_a.CanvasMode c2)')
    content = content.replace('public void a(C_a.c c2, int n, int n2)', 'public void a(rs.p_f.C_a.CanvasMode c2, int n, int n2)')
    content = content.replace('c2 == C_a.c.a', 'c2 == rs.p_f.C_a.CanvasMode.a')
    content = content.replace('c2 == C_a.c.b', 'c2 == rs.p_f.C_a.CanvasMode.b')
    content = content.replace('c2 == C_a.c.c', 'c2 == rs.p_f.C_a.CanvasMode.c')
    content = content.replace('c2 != C_a.c.a', 'c2 != rs.p_f.C_a.CanvasMode.a')
    content = content.replace('rs.p_f.C_a.ai == C_a.c.a', 'rs.p_f.C_a.ai == rs.p_f.C_a.CanvasMode.a')
    content = content.replace('rs.p_f.C_a.ai == C_a.c.b', 'rs.p_f.C_a.ai == rs.p_f.C_a.CanvasMode.b')
    content = content.replace('rs.p_f.C_a.ai != C_a.c.a', 'rs.p_f.C_a.ai != rs.p_f.C_a.CanvasMode.a')
    content = content.replace('rs.p_f.C_a.ai = C_a.c.a', 'rs.p_f.C_a.ai = rs.p_f.C_a.CanvasMode.a')
    content = content.replace('rs.p_f.C_a.ai = C_a.c.b', 'rs.p_f.C_a.ai = rs.p_f.C_a.CanvasMode.b')
    content = content.replace('this.a(C_a.c.a);', 'this.a(rs.p_f.C_a.CanvasMode.a);')
    content = content.replace('this.a(C_a.c.b);', 'this.a(rs.p_f.C_a.CanvasMode.b);')
    
    with open(client_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_Client_mc.java final fixes!")

# 3. Update C_C_uc.java
c_uc_fp = r'src/main/java/rs/C_C_uc.java'
if os.path.exists(c_uc_fp):
    with open(c_uc_fp, encoding='utf-8', errors='replace') as f:
        content = f.read()
    content = content.replace('rs.p_f.C_a.c.a', 'rs.p_f.C_a.CanvasMode.a')
    content = content.replace('rs.p_f.C_a.c.b', 'rs.p_f.C_a.CanvasMode.b')
    with open(c_uc_fp, 'w', encoding='utf-8') as f:
        f.write(content)
    print("Updated C_C_uc.java CanvasMode references!")
