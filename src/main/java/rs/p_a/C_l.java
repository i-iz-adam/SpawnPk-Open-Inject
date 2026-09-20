package rs.p_a;

import rs.p_d.C_x;

public final class C_l extends C_a {
   public final int h;
   public final int i;
   private double q;
   private double r;
   private double s;
   private double t;
   private double u;
   private boolean v = false;
   private final int w;
   private final int x;
   private final int y;
   public final int j;
   public double k;
   public double l;
   public double m;
   private final int z;
   private final int A;
   public final int n;
   private final C_x B;
   private int C;
   private int D;
   public int o;
   private int E;
   public final int p;

   public void a(int var1, int var2, int var3, int var4) {
      if (!this.v) {
         double var5 = (double)(var4 - this.w);
         double var7 = (double)(var2 - this.x);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.k = (double)this.w + var5 * (double)this.A / var9;
         this.l = (double)this.x + var7 * (double)this.A / var9;
         this.m = (double)this.y;
      }

      double var11 = (double)(this.i + 1 - var1);
      this.q = ((double)var4 - this.k) / var11;
      this.r = ((double)var2 - this.l) / var11;
      this.s = Math.sqrt(this.q * this.q + this.r * this.r);
      if (!this.v) {
         this.t = -this.s * Math.tan((double)this.z * 0.02454369);
      }

      this.u = 2.0 * ((double)var3 - this.m - this.t * var11) / (var11 * var11);
   }

   @Override
   public C_h c() {
      C_h var1 = this.B.a();
      if (var1 == null) {
         return null;
      } else {
         int var2 = -1;
         if (this.B.g != null) {
            if (this.B.g.e != null && this.B.g.e.length > 0) {
               var2 = this.B.g.e[this.C];
            } else {
               var2 = this.D;
            }
         }

         boolean var3 = false;
         rs.p_a.p_a.C_a var4 = C_h.h;
         C_h var5 = null;
         if (var2 != -1) {
            if (this.B.g.b()) {
               var5 = this.B.g.a(var1, var2);
            } else {
               var4 = (rs.p_a.p_a.C_a)C_x.q.a((long)this.B.d);
               if (var4 == null) {
                  var4 = new rs.p_a.p_a.C_a(true);
                  var3 = true;
                  var4.e();
               }

               var5 = new C_h(true, rs.C_k.g(var2), false, var1);
               var5.i = var4;
               var5.n();
               var5.f(var2, this.B.g.r);
            }

            var5.aM = null;
            var5.aL = null;
         } else {
            var5 = new C_h(true, rs.C_k.g(var2), false, var1, var4);
            var5.i = var4;
         }

         if (var5 != null) {
            if (this.B.j != 128 || this.B.k != 128) {
               var5.b(this.B.j, this.B.j, this.B.k);
            }

            var5.j(this.E);
            var5.b(64 + this.B.m, 850 + this.B.n, -30, -50, -30, true);
            var5.i = C_h.h;
            if (var3) {
               C_x.q.a(var4, (long)this.B.d);
            }
         }

         return var5;
      }
   }

   public C_l(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.B = C_x.c[var11];
      this.p = var6;
      this.w = var9;
      this.x = var8;
      this.y = var7;
      this.h = var3;
      this.i = var4;
      this.z = var1;
      this.A = var5;
      this.n = var10;
      this.j = var2;
      this.v = false;
   }

   public void a(int var1) {
      this.v = true;
      this.k = this.k + this.q * (double)var1;
      this.l = this.l + this.r * (double)var1;
      this.m = this.m + this.t * (double)var1 + 0.5 * this.u * (double)var1 * (double)var1;
      this.t = this.t + this.u * (double)var1;
      this.o = (int)(Math.atan2(this.q, this.r) * 325.949) + 1024 & 2047;
      this.E = (int)(Math.atan2(this.t, this.s) * 325.949) & 2047;
      if (this.B.g != null) {
         if (this.B.g.b()) {
            this.D += var1;
            int var2 = this.B.g.c();
            if (this.D >= var2) {
               this.D = var2 - this.B.g.h;
            }
         } else {
            this.D += var1;

            while (this.D > this.B.g.a(this.C)) {
               this.D = this.D - (this.B.g.a(this.C) + 1);
               this.C++;
               if (this.C >= this.B.g.d) {
                  this.C = 0;
               }
            }
         }
      }
   }
}
