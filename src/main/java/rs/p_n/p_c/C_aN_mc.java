package rs.p_n.p_c;

class C_aN_mc extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         C_aM_mc.bJ = 10;
         C_aM_mc.bI = 0;
         C_aM_mc.g = 40405;

         for (int var2 = 0; var2 < 50; var2++) {
            rs.p_n.C_e.H[40405 + var2].ao = C_aM_mc.e[0];
            rs.p_n.C_e.H[40405 + var2].at = "";
         }
      }

      if (var1 == 1) {
         int var5 = this.e();
         boolean var3 = this.e() == 1;
         String var4 = this.h();
         C_aM_mc.b(var5, var4, var3);
      }

      if (var1 == 2) {
         int var6 = this.c();
         String var7 = this.h();
         C_aM_mc.k(var6, var7);
      }
   }
}
