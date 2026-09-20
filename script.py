from pathlib import Path
root=Path('src/main/java/rs/p_l')
for p in root.rglob('*.java'):
 s=p.read_text()
 # Type declarations/uses are identifiable by contexts; enum declaration first.
 s=s.replace('public static enum a {', 'public static enum Mode {')
 s=s.replace('C_f.a.a', 'C_f.Mode.a').replace('C_f.a.b', 'C_f.Mode.b')
 s=s.replace('C_f.a var2', 'C_f.Mode var2')
 # Base class's own type references that don't have C_f qualifier.
 if p.as_posix().endswith('/p_l/p_e/C_f.java'):
  s=s.replace('var2 == a ?', 'var2 == Mode.a ?')
  s=s.replace('public void a(C_f.a var2)', 'public void a(C_f.Mode var2)')
  s=s.replace('public abstract void b(C_Client_mc var1, C_f.a var2)', 'public abstract void b(C_Client_mc var1, C_f.Mode var2)')
  s=s.replace('public static enum a {', 'public static enum Mode {')
 p.write_text(s)
