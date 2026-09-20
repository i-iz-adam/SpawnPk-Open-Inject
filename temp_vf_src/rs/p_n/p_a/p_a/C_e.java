package rs.p_n.p_a.p_a;

import rs.C_Client_mc;
import rs.p_n.p_a.C_f;

public class C_e extends C_f {
   @Override
   public void f(int var1, int var2) {
      if (C_Client_mc.cI > 0) {
         C_a var3 = (C_a)rs.p_n.C_e.l(C_Client_mc.cI);
         if (var3 != null) {
            var1 -= 3;
            var2 = var2 - this.ao.r / 4 - 3;
            int var4 = 20 - this.ao.r / 4;
            if (var3.k() == 1) {
               var2 += 3;
               var4 += 6;
            }

            boolean var5 = this.aw % 2 != 0;
            int var6 = var5 ? 4668980 : 3814187;
            rs.p_l.C_c.a(var1 + 1, var2, 3 + var3.P - 2, var4 + 2, var6, 255);
            if (this.aw != 32432 + var3.h() - 1) {
               rs.p_l.C_c.a(var1 + 1, var2 + var4 + 1, 3 + var3.P - 2, 1, 3156516, 255);
            }
         }
      }
   }

   public static C_e k(int var0, String var1) {
      C_e var2 = new C_e();
      H[var0] = var2;
      var2.ah = var0;
      var2.aw = var0;
      var2.aI = 4;
      var2.M = 0;
      var2.P = 0;
      var2.aR = 11;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = -1;
      var2.S = false;
      var2.aS = true;
      var2.at = var1;
      var2.Z = "";
      var2.O = 0;
      var2.L = 0;
      var2.ak = 0;
      var2.a();
      return var2;
   }
}
