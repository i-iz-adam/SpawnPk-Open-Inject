package rs.p_l.p_e.p_a;

class C_p implements rs.p_l.p_e.C_i {
   C_p(C_o var1) {
      this.a = var1;
   }

   @Override
   public void a(rs.p_n.C_e var1, int var2, int var3) {
      if (var1.aw >= 18041) {
         C_o.N.f(var2 - 3, var3);
      } else {
         C_o.N.f(var2 - 5, var3 - 3);
      }
   }
}
