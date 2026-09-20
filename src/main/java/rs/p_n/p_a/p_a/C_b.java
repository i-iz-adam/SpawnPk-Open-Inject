package rs.p_n.p_a.p_a;

import rs.C_Client_mc;
import rs.p_n.p_a.C_f;

public class C_b extends rs.p_n.p_a.C_d {
   public static final int b = 32431;
   public static final int c = 32432;
   public static final int d = 32457;
   static final int e = 1;
   static final int f = 20;
   private final C_e[] g = new C_e[25];
   private C_a bI;
   private int bJ;

   public C_b() {
      this.aw = 32431;
      this.al = new int[0];
      this.am = new int[0];
      this.bc = new int[0];
      this.aH = 500;
      this.bj = 87;
      this.k(0);
      this.bf = false;
      H[32431] = this;
   }

   @Override
   public void f(int var1, int var2) {
      if (this.bI != null) {
         int var3 = this.bI.h() % 2 != 0 ? 4668980 : 3814187;
         rs.p_l.C_c.a(var1 - 1, var2, this.bI.P, this.bI.n(), var3, 255);
         rs.p_l.C_c.d(var1 - 1, this.bI.P + 2, this.aR + 2, 2630172, var2 - 1);
      }
   }

   public boolean b() {
      return C_Client_mc.hP >= this.bB
         && C_Client_mc.hP <= this.bB + this.P + (this.k() ? 20 : 0)
         && C_Client_mc.hQ >= this.bC
         && C_Client_mc.hQ <= this.bC + this.aR;
   }

   public void a(C_a var1) {
      for (int var2 = 0; var2 < this.g.length; var2++) {
         this.g[var2] = C_e.k(32432 + var2, "test");
      }

      this.bI = var1;
      this.bJ = var1.p();
      int var4 = var1.k() == 1 ? 5 : 0;
      if (var1.o() == 0) {
         var1.n(20 * var1.h() - 1 + var4);
      }

      for (int var3 = 0; var3 < var1.h(); var3++) {
         this.g[var3].bA = var1.aw;
         this.g[var3].at = var1.i().get(var3).a();
         this.g[var3].ao = C_f.a[var1.k()];
         this.g[var3].m(var1.l());
         this.g[var3].a(var1.P);
         if (var1.m()) {
            this.g[var3].b();
         } else {
            this.g[var3].h();
         }

         if (var1.i().get(var3).b().equalsIgnoreCase("Select")) {
            this.g[var3].bx = false;
         } else {
            this.g[var3].by = var1.i().get(var3).b();
            this.g[var3].bx = true;
         }

         this.g[var3].Q = "Select";
      }

      this.aR = var1.n();
      this.aH = Math.max(var1.n(), 20 * var1.h() + var4);
      this.bA = var1.aw;
      this.P = var1.P - (this.k() ? 15 : 0);
      this.j();
   }

   private void j() {
      if (super.a != null) {
         super.a.b();
      }

      int var1 = this.m();
      int var2 = this.l();
      if (this.k()) {
         var1 -= 7;
      }

      for (int var3 = 0; var3 < this.bI.h(); var3++) {
         byte var4 = 0;
         this.n(this.g[var3].aw).a(var1, var2 + var3 * 20 + var4);
      }

      super.a();
   }

   private boolean k() {
      return this.bI.n() < this.aH;
   }

   private int l() {
      return 10 - this.g[0].aR / 2;
   }

   private int m() {
      return this.g[0].S ? 1 : 12;
   }

   public C_e[] c() {
      return this.g;
   }

   public C_a h() {
      return this.bI;
   }

   public int i() {
      return this.bJ;
   }
}
