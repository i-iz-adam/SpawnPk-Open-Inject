package rs.p_n.p_c;

class C_L_uc extends rs.p_n.p_b.p_a.C_a {
   C_L_uc(C_J_uc var1, long var2) {
      super(var2);
      this.g = var1;
   }

   @Override
   public void c() {
      short var1 = 30333;

      for (C_J_uc.a var3 : C_J_uc.h()) {
         rs.p_n.C_e.H[var1].at = var3.a();
         var1 += 6;
      }
   }
}
