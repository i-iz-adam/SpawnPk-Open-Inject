package rs.p_l.p_e.p_a;

import rs.C_Client_mc;
import rs.p_l.C_E_uc;

public class C_u extends rs.p_l.p_e.C_a {
   public static int p = 8;
   public static int q = 5;
   public boolean r = false;
   public int s;

   @Override
   public void b() {
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.Mode var2) {
      if (var2 != rs.p_l.p_e.C_f.Mode.a) {
         if (this.s < C_E_uc.y.length) {
            if (rs.p_l.p_b.p_a.C_d.d) {
               p = C_Client_mc.ai / 64 - 2;
               q = C_Client_mc.ah / 64 - 2;
            }

            byte var3 = 1;
            byte var4 = 1;
            int var5 = 0;

            for (int var6 = this.s; var6 < this.s + p * q && var6 < C_E_uc.y.length; var6++) {
               if (var6 >= 40) {
                  try {
                     var1.a(var6, 50L);
                  } catch (Exception var8) {
                  }
               }

               var5++;
               C_E_uc.y[var6].b(var3, var4);
               var1.gn.c("@gre@ID " + var6, var3 + 32, var4 + 62, 0, 0);
               var3 += 65;
               if (var5 >= p) {
                  var5 = 0;
                  var3 = 0;
                  var4 += 65;
               }
            }
         }
      }
   }

   @Override
   public boolean a(int var1) {
      return var1 == 1 ? true : var1 == 2;
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return this.r;
   }

   @Override
   public void c() {
   }
}
