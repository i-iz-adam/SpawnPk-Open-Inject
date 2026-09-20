package rs.p_n.p_c;

import rs.C_Client_mc;

class C_X_uc extends rs.p_l.p_e.C_f {
   @Override
   public void b() {
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return C_Client_mc.cH == 59835 && C_V_uc.c;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 == rs.p_l.p_e.C_f.a.b) {
         int var3 = 125 + (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ai / 2 - 356);
         int var4 = 204 + (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ah / 2 - 230);
         C_Client_mc.gl.c("@or2@The rules", var3 + 40, var4 + 35, 16750623, 0);
         C_Client_mc.gl.c("@or2@have been", var3 + 40, var4 + 35 + 15, 16750623, 0);
         C_Client_mc.gl.c("@or2@switched!", var3 + 40, var4 + 35 + 30, 16750623, 0);
         if (System.currentTimeMillis() - C_V_uc.d <= 500L) {
            C_V_uc.e.f(var3, var4);
            C_V_uc.e.f(var3, var4 + 40);
            C_V_uc.e.f(var3, var4 + 80);
         }

         if (System.currentTimeMillis() - C_V_uc.d >= 1000L) {
            C_V_uc.d = System.currentTimeMillis();
         }
      }
   }

   @Override
   public void c() {
   }
}
