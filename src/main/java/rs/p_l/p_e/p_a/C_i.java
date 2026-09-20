package rs.p_l.p_e.p_a;

import java.lang.invoke.StringConcatFactory;
import java.text.NumberFormat;

class C_i extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = 0;

      while ((var1 = this.e()) != 0) {
         switch (var1) {
            case 1:
               C_h.C.clear();
               int var2 = 0;

               while ((var2 = this.c()) > 0) {
                  C_h.C.put(var2 - 1, true);
               }
               break;
            case 2:
               boolean var3 = this.e() == 1;
               int var4 = this.c();
               int var5 = this.c();
               int var6 = this.g();
               int var7 = var4 * var6;
               int var8 = var6 * var5;
               int var9 = var8 - var7;
               C_h.A = (int)((double)((float)var7 / (float)var8) * 100.0) + "% (" + NumberFormat.getIntegerInstance().format((long)var9) + " tokens left)";
               rs.p_n.C_e.H['\uecd1'].at = "@yel@"
                  + var4
                  + " / "
                  + var5
                  + " rolls @or1@("
                  + NumberFormat.getIntegerInstance().format((long)var7)
                  + " / "
                  + NumberFormat.getIntegerInstance().format((long)var8)
                  + " tokens)";
               if (var8 > 0) {
                  if (var3) {
                     C_h.w = (int)((double)C_h.x * ((double)var7 / (double)var8));
                     if (C_h.w > C_h.x) {
                        C_h.w = C_h.x;
                     }

                     if (C_h.w < 0) {
                        C_h.w = 0;
                     }
                  } else {
                     C_h.y = C_h.w = (int)((double)C_h.x * ((double)var7 / (double)var8));
                  }
               }
               break;
            case 3:
               int var10 = C_h.s = this.e();
               C_h.r = this.e();
               if (var10 == 1) {
                  rs.p_n.C_e.H['\uecc9'].E = rs.p_n.C_e.H['\uecca'].E = C_h.f();
                  rs.p_n.C_e.H['\ueccd'].E = C_h.g();
               } else {
                  rs.p_n.C_e.H['\uecc9'].E = rs.p_n.C_e.H['\uecca'].E = C_h.g();
                  rs.p_n.C_e.H['\ueccd'].E = C_h.f();
               }

               if (rs.p_n.C_e.H['\uecc3'].az[0] > 0) {
                  rs.p_d.C_k var11 = rs.p_d.C_k.f(rs.p_n.C_e.H['\uecc3'].az[0] - 1);
                  C_h.B = " Pay @yel@"
                     + rs.p_n.C_e.H['\uecc3'].ax[0]
                     + "x <col=FFBD5C>"
                     + String.valueOf(var11.w).replace("@gre@", "")
                     + "s    ";
               }
               break;
            case 4:
               C_h.q = this.e() == 1;
         }
      }
   }
}
