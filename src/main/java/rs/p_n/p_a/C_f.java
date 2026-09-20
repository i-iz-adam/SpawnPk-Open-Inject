package rs.p_n.p_a;

import rs.p_l.C_K_uc;

public class C_f extends rs.p_n.C_e {
   public static C_K_uc[] a = null;

   public static C_f a(int var0, String var1) {
      C_f var2 = new C_f();
      H[var0] = var2;
      var2.ah = var0;
      var2.aw = var0;
      var2.aI = 4;
      var2.M = 0;
      var2.P = 0;
      var2.aR = 11;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = -1;
      var2.S = false;
      var2.aS = true;
      var2.at = var1;
      var2.Z = "";
      var2.O = 0;
      var2.L = 0;
      var2.ak = 0;
      var2.a();
      return var2;
   }

   public C_f a(String var1, int var2) {
      this.Q = var1;
      this.M = 1;
      this.P = var2;
      this.aR = 11;
      this.bo = true;
      this.L = 16777215;
      return this;
   }

   public C_f a(int var1) {
      return this.a("Select option", var1);
   }

   public C_f a() {
      this.ao = a[0];
      return this;
   }

   public C_f b() {
      this.S = true;
      this.U = false;
      return this;
   }

   public C_f c() {
      this.U = true;
      this.S = false;
      return this;
   }

   public C_f h() {
      this.U = false;
      this.S = false;
      return this;
   }

   public C_f i() {
      this.ao = a[1];
      return this;
   }

   public C_f j() {
      this.ao = a[2];
      return this;
   }

   public C_f m(int var1) {
      this.ad = var1;
      return this;
   }

   public C_f k() {
      return this.m(16777215);
   }

   public C_f l() {
      return this.m(12171349);
   }

   public C_f m() {
      return this.m(16750623);
   }

   public C_f n() {
      return this.b().j();
   }

   public C_f o() {
      return this.b().i();
   }
}
