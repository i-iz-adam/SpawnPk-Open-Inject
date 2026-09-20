package rs.p_q.p_a.p_a.p_a;

public class C_c extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 1) {
         int var2 = this.g();
         rs.p_a.C_j var3 = this.b(var2);
         if (var3 != null) {
            var3.h.c().clear();
         }
      }
   }

   private rs.p_a.C_j b(int var1) {
      return var1 >= 0 && var1 < this.c.cA.length ? this.c.cA[var1] : null;
   }
}
