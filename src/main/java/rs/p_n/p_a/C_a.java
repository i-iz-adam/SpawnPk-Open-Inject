package rs.p_n.p_a;

import rs.p_l.C_F_uc;

public class C_a extends rs.p_n.C_e {
   private boolean a;

   public static C_a b(int var0, String var1, String var2) {
      C_a var3 = new C_a();
      H[var0] = var3;
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 1;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = new C_F_uc(false, var1);
      var3.aG = new C_F_uc(false, var1);
      var3.P = var3.E.n;
      var3.aR = var3.aG.o;
      var3.Q = var2;
      return var3;
   }

   public static C_a a(int var0, C_F_uc var1, String var2) {
      C_a var3 = new C_a();
      H[var0] = var3;
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 1;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = var1;
      var3.aG = var1;
      var3.P = var3.E.n;
      var3.aR = var3.aG.o;
      var3.Q = var2;
      return var3;
   }

   public C_a g(int var1, int var2) {
      this.P = var1;
      this.aR = var2;
      return this;
   }

   public C_a a(C_F_uc var1) {
      this.aG = var1;
      this.bz = true;
      return this;
   }

   public C_a b(String var1) {
      this.aG = new C_F_uc(false, var1);
      this.bz = true;
      return this;
   }

   public C_a c(String var1) {
      this.a(this.aw + 1, var1);
      return this;
   }

   public C_a b(C_F_uc var1) {
      this.b(this.aw + 1, var1);
      return this;
   }

   public C_b a(int var1, String var2) {
      this.a = true;
      this.J = -1;
      this.ab = var1;
      int var3 = var1 + 1;
      rs.p_n.C_e var4 = C_b.k(var3, var2);
      C_b var5 = new C_b();
      H[var1] = var5;
      var5.ah = var1;
      var5.aw = var1;
      var5.aI = 0;
      var5.M = 0;
      var5.P = var4.E.n;
      var5.aR = var4.aG.o;
      var5.aQ = true;
      var5.aC = 0;
      var5.ab = -1;
      var5.aH = 0;
      var5.k(1);
      var5.b(0, var3, 0, 0);
      return var5;
   }

   public C_b b(int var1, C_F_uc var2) {
      this.a = true;
      this.J = -1;
      this.ab = var1;
      int var3 = var1 + 1;
      rs.p_n.C_e var4 = C_b.c(var3, var2);
      C_b var5 = new C_b();
      H[var1] = var5;
      var5.ah = var1;
      var5.aw = var1;
      var5.aI = 0;
      var5.M = 0;
      var5.P = var4.E.n;
      var5.aR = var4.aG.o;
      var5.aQ = true;
      var5.aC = 0;
      var5.ab = -1;
      var5.aH = 0;
      var5.k(1);
      var5.b(0, var3, 0, 0);
      return var5;
   }

   public C_a a() {
      this.bx = true;
      return this;
   }

   public C_a d(String var1) {
      this.by = var1;
      this.bx = true;
      return this;
   }

   public boolean b() {
      return this.a;
   }
}
