package rs.p_l.p_f;

import java.util.function.Supplier;

class C_j extends rs.p_A_uc.C_i {
   C_j(C_i var1, Supplier var2) {
      super(var2);
      this.a = var1;
   }

   @Override
   public void b() {
      C_i.a(this.a, true);
   }

   @Override
   public void c() {
      if (C_i.a(this.a)) {
         C_i.a(this.a, false);
         C_i.b(this.a);
      }
   }
}
