package rs.p_t.p_a;

import java.io.File;
import java.util.Map;
import rs.p_d.C_r;

public class C_f extends rs.p_t.C_c<C_r> {
   private static final String a = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "objects.yaml";
   private static final String b = rs.p_v.C_a.f() + File.separator + "configs" + File.separator + "o.bin";

   public C_f() {
      super(a, b);
   }

   @Override
   public C_r a(int var1, Map<String, Object> var2) {
      if (var2.containsKey("osrs")) {
         if (C_r.E != C_r.a.d) {
            C_r.a(C_r.a.d);
         }
      } else if (C_r.E != C_r.a.a) {
         C_r.a(C_r.a.a);
      }

      C_r var3 = C_r.b(var1);
      var3.aa = var1;

      for (String var5 : var2.keySet()) {
         Object var6 = var2.get(var5);
         String var7 = var5.toLowerCase();
         switch (var7) {
            case "randomanimstart":
               var3.at = (Boolean)var6;
               break;
            case "name":
               var3.R = (String)var6;
               break;
            case "actions":
               var3.ay = this.e(var6);
               break;
            case "models":
               var3.an = this.a(var6);
               break;
            case "ambient":
               var3.Q = (byte)((Integer)var6).intValue();
               break;
            case "contrast":
               var3.T = (byte)((Integer)var6).intValue();
               break;
            case "mergenormals":
               var3.al = (Boolean)var6;
               break;
            case "anim":
            case "animid":
            case "animation":
               var3.au = (Integer)var6;
               break;
            case "osrs":
               if ((Boolean)var6) {
                  var3.av = 1;
               } else {
                  var3.av = 0;
               }
               break;
            case "tilex":
               var3.U = (Integer)var6;
               break;
            case "tiley":
               var3.af = (Integer)var6;
               break;
            case "resize":
               int[] var9 = this.a(var6);
               var3.X = var9[0];
               var3.am = var9[1];
               var3.S = var9[2];
               break;
            case "contouredground":
               var3.ag = (Boolean)var6;
               break;
            case "interacttype":
               var3.aj = (Boolean)var6;
               break;
            case "hasactions":
               var3.ar = (Boolean)var6;
               break;
            case "srccolors":
            case "srccolor":
               var3.ax = this.a(var6);
               break;
            case "destcolors":
            case "destcolor":
               var3.W = this.a(var6);
               break;
            case "forceallrevisions":
               var3.aw = true;
         }
      }

      return var3;
   }
}
