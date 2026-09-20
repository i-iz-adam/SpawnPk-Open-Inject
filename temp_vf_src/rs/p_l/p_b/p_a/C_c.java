package rs.p_l.p_b.p_a;

public class C_c {
   public static void a(String var0, String[] var1, rs.p_l.p_b.p_a.p_a.C_d var2) {
      String var3 = var0.toLowerCase();
      switch (var3) {
         case "reset":
            var2.p();
            break;
         case "male":
            var2.q();
            C_d.b("@whi@<img=24> Entity transformed to male!");
            break;
         case "female":
            var2.r();
            C_d.b("@whi@<img=24> Entity transformed to female!");
            break;
         case "weapon":
         case "wep":
            var2.g(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player weapon!");
            break;
         case "body":
         case "chest":
         case "top":
            var2.h(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set chest piece!");
            break;
         case "cape":
         case "back":
            var2.l(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player cape!");
            break;
         case "neck":
         case "ammy":
            var2.m(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player amulet!");
            break;
         case "legs":
         case "leg":
            var2.i(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player legs!");
            break;
         case "hand":
         case "hands":
         case "glove":
         case "gloves":
            var2.n(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player gloves!");
            break;
         case "feet":
         case "boot":
         case "boots":
            var2.k(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player boots!");
            break;
         case "shield":
         case "off":
            var2.o(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player shield!");
            break;
         case "hat":
         case "head":
         case "helm":
         case "helmet":
            var2.j(Integer.parseInt(var1[0]));
            C_d.b("@whi@<img=24> Set player helmet!");
            break;
         case "full_helm":
         case "fullhelm":
            boolean var5 = !var2.t();
            var2.d(var5);
            var2.c(var5);
            C_d.b("@whi@<img=24> Toggled full helm flag: " + (var5 ? "@gre@ON" : "@red@OFF"));
            break;
         case "full_mask":
         case "fullmask":
            boolean var6 = !var2.t();
            var2.c(var6);
            C_d.b("@whi@<img=24> Toggled full mask flag: " + (var6 ? "@gre@ON" : "@red@OFF"));
            break;
         case "full_hat":
         case "fullhat":
            boolean var7 = !var2.u();
            var2.d(var7);
            C_d.b("@whi@<img=24> Toggled full hat flag: " + (var7 ? "@gre@ON" : "@red@OFF"));
            break;
         case "full_body":
         case "full_chest":
         case "fullbody":
         case "fullchest":
            boolean var8 = !var2.s();
            var2.b(var8);
            C_d.b("@whi@<img=24> Toggled full body flag: " + (var8 ? "@gre@ON" : "@red@OFF"));
      }
   }
}
