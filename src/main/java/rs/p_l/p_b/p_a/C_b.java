package rs.p_l.p_b.p_a;

public class C_b {
   public static void a(String var0, String[] var1, rs.p_l.p_b.p_a.p_a.C_c var2) {
      String var3 = var0.toLowerCase();
      switch (var3) {
         case "set_id":
         case "setid":
         case "setnpc":
         case "set":
            int var5 = Integer.parseInt(var1[0]);
            var2.g(var5);
            C_d.b("@whi@<img=24> Entity transformed to @gre@" + var2.n().o + " (" + var5 + ")!");
            break;
         case "reset":
            var2.p();
            break;
         case "walk":
            var2.q();
            break;
         case "stand":
            var2.r();
            break;
         case "select":
            var2.a(true);
         case "sizex":
      }
   }
}
