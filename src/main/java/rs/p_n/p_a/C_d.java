package rs.p_n.p_a;

public class C_d extends rs.p_n.C_e {
   protected rs.p_n.p_d.C_c a;

   public static C_d a(int var0) {
      C_d var1 = new C_d();
      H[var0] = var1;
      var1.aw = var0;
      var1.al = new int[0];
      var1.am = new int[0];
      var1.bc = new int[0];
      var1.aH = 500;
      var1.bj = 87;
      var1.k(0);
      return var1;
   }

   public static C_d f(int var0, int var1, int var2) {
      return a(var0).g(var1, var2);
   }

   public C_d g(int var1, int var2) {
      this.P = var1;
      this.aR = var2;
      return this;
   }

   public C_d m(int var1) {
      this.aH = var1;
      return this;
   }

   public rs.p_n.p_d.C_b a(rs.p_n.p_d.C_b var1) {
      return this.n(var1.c());
   }

   public rs.p_n.p_d.C_b a(rs.p_n.C_e var1) {
      return this.n(var1.aw);
   }

   public rs.p_n.p_d.C_b n(int var1) {
      if (this.a == null) {
         this.a = new rs.p_n.p_d.C_c(this);
      }

      return this.a.a(var1);
   }

   public void a() {
      if (this.a != null) {
         this.a.a();
      }
   }
}
