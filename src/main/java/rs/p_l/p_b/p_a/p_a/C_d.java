package rs.p_l.p_b.p_a.p_a;

import java.awt.Color;
import java.awt.Polygon;
import rs.C_Client_mc;
import rs.C_V_uc;
import rs.C_k;
import rs.p_a.C_h;
import rs.p_l.p_e.C_j;

public class C_d extends C_a {
   private int t;
   private int[] u = new int[]{0, 10, 18, 26, 33, 36, 42};
   private int[] v = new int[]{0, 0, 0, 0, 0};
   private int w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private boolean F;
   private boolean G;
   private boolean H;

   @Override
   protected void b() {
      this.q();
      this.d(808);
   }

   @Override
   protected void c() {
      rs.p_d.C_a var1 = rs.p_d.C_a.a[this.h];
      int var2 = var1.e[this.i];
      C_h var3 = this.o();
      if (var3 != null) {
         C_h var4 = C_h.ac;
         var4.a(var3, C_k.g(var2) & C_k.g(-1));
         var4.f(var2, this.h);
         var4.k();
         var4.aM = null;
         var4.aL = null;
         var4.aN = true;
         Polygon var5 = var4.b(this.b, this.c, this.d - C_V_uc.k + C_Client_mc.cK, 0);
         C_j var6 = new C_j(this, var5, Color.GREEN, Color.BLACK, this.f);
         var6.f = Color.BLACK;
         C_Client_mc.ab.c.a(this.f, var6);
         var4.a(this.e, C_V_uc.m, C_V_uc.n, C_V_uc.o, C_V_uc.p, this.b - C_V_uc.j, this.d - C_V_uc.k, this.c - C_V_uc.l, this.f, 0);
         var4.K = 256;
         if (var6.g && rs.p_l.p_b.p_a.C_d.b.j) {
            if (rs.p_l.p_b.p_a.C_d.b.k == 1) {
               rs.p_l.p_b.p_a.C_d.b.c("Selected @gre@Player entity #" + (this.m + 1));
               this.n = true;
               rs.p_l.p_b.p_a.C_d.b.f();
            } else {
               this.o = false;
               rs.p_l.p_b.p_a.C_d.b.c("Deleted @red@Player entity #" + (this.m + 1));
            }

            rs.p_l.p_b.p_a.C_d.b.j = false;
         }

         this.c(var4.g + 10);
         if (rs.p_l.p_b.p_a.C_d.e) {
            C_Client_mc.gl.a((this.n ? "@gre@" : "") + (this.m + 1), this.k, this.l, 16777215, 0, false);
         }
      }
   }

   public rs.p_a.C_k n() {
      rs.p_a.C_k var1 = new rs.p_a.C_k();
      var1.aY = this.t;
      System.arraycopy(this.v, 0, var1.aV, 0, var1.aV.length);
      var1.br[0] = this.a(this.z, 512);
      var1.br[1] = this.a(this.B, 512);
      var1.br[2] = this.a(this.C, 512);
      var1.br[3] = this.a(this.w, 512);
      var1.br[4] = this.x == 0 ? this.a(this.u[2], 256) : this.a(this.x, 512);
      var1.br[5] = this.a(this.E, 512);
      var1.br[6] = this.x != 0 && this.s() ? 0 : this.a(this.u[3], 256);
      var1.br[7] = this.y == 0 ? this.a(this.u[5], 256) : this.a(this.y, 512);
      var1.br[8] = this.z != 0 && (this.t() || this.u()) ? 0 : this.a(this.u[0], 256);
      var1.br[9] = this.D == 0 ? this.a(this.u[4], 256) : this.a(this.D, 512);
      var1.br[10] = this.A == 0 ? this.a(this.u[6], 256) : this.a(this.A, 512);
      var1.br[11] = (this.z == 0 || !this.t()) && this.t != 1 ? this.a(this.u[1], 256) : 0;
      var1.t = super.h;
      var1.bm = true;
      var1.aU = true;
      return var1;
   }

   private int a(int var1, int var2) {
      return var1 == 0 && var2 != 256 ? 0 : var2 + var1;
   }

   public C_h o() {
      C_h var1 = this.n().m();
      if (var1 == null) {
         return null;
      } else {
         var1.aN = true;
         return var1;
      }
   }

   public void p() {
      this.d(808);
      this.w = 0;
      this.x = 0;
      this.y = 0;
      this.z = 0;
      this.A = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.E = 0;
      this.F = false;
      this.G = false;
      this.H = false;
   }

   public void q() {
      this.t = 0;
   }

   public void r() {
      this.t = 1;
   }

   public void g(int var1) {
      this.w = var1;
   }

   public void h(int var1) {
      this.x = var1;
   }

   public void i(int var1) {
      this.y = var1;
   }

   public void j(int var1) {
      this.z = var1;
   }

   public void k(int var1) {
      this.A = var1;
   }

   public void l(int var1) {
      this.B = var1;
   }

   public void m(int var1) {
      this.C = var1;
   }

   public void n(int var1) {
      this.D = var1;
   }

   public void o(int var1) {
      this.E = var1;
   }

   public boolean s() {
      return this.F;
   }

   public void b(boolean var1) {
      this.F = var1;
   }

   public boolean t() {
      return this.G;
   }

   public void c(boolean var1) {
      this.G = var1;
   }

   public boolean u() {
      return this.H;
   }

   public void d(boolean var1) {
      this.H = var1;
   }
}
