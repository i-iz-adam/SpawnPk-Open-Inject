package rs.p_n.p_a;

import rs.p_l.C_F_uc;

public class C_e extends rs.p_n.C_e {
   public static C_e a(int var0, String var1) {
      C_e var2 = new C_e();
      H[var0] = var2;
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = new C_F_uc(false, var1);
      var2.aG = new C_F_uc(false, var1);
      var2.P = var2.E.n;
      var2.aR = var2.E.o;
      return var2;
   }

   public static C_e b(int var0, C_F_uc var1) {
      C_e var2 = new C_e();
      H[var0] = var2;
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = var1;
      var2.aG = var1;
      var2.P = var2.E.n;
      var2.aR = var2.E.o;
      return var2;
   }

   public C_e a() {
      this.l = true;
      return this;
   }

   public C_e g(int var1, int var2) {
      this.P = var1;
      this.aR = var2;
      return this;
   }
}
