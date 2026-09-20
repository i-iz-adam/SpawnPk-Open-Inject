package rs.p_n.p_a;

import rs.p_l.C_F_uc;

public class C_b extends C_a {
   public static rs.p_n.C_e k(int var0, String var1) {
      rs.p_n.C_e var2 = j(var0);
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.P = 512;
      var2.aR = 334;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = new C_F_uc(false, var1);
      var2.aG = new C_F_uc(false, var1);
      return var2;
   }

   public static rs.p_n.C_e c(int var0, C_F_uc var1) {
      rs.p_n.C_e var2 = j(var0);
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.P = 512;
      var2.aR = 334;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = var1;
      var2.aG = var1;
      return var2;
   }

   public C_b h(int var1, int var2) {
      this.P = var1;
      this.aR = var2;
      return this;
   }
}
