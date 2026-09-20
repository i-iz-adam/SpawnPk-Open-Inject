package rs.p_a;

import rs.C_Client_mc;
import rs.p_d.C_r;
import rs.p_d.C_y;

public final class C_m extends C_a {
   private int j;
   private final int[] k;
   private final int l;
   private final int m;
   private final int n;
   private final int o;
   private final int p;
   private final int q;
   private rs.p_d.C_a r;
   private int s;
   public static C_Client_mc h;
   public final int i;
   private final int t;
   private final int u;

   @Override
   public C_h c() {
      int var1 = -1;
      if (this.r != null) {
         int var2 = C_Client_mc.ff - this.s;
         if (var2 > 100 && this.r.h > 0) {
            var2 = 100;
         }

         if (this.r.b()) {
            int var3 = this.r.c();
            this.j += var2;
            byte var4 = 0;
            if (this.j >= var3) {
               this.j = var3 - this.r.h;
               if (this.j < 0 || this.j > var3) {
                  this.r = null;
               }
            }

            this.s = C_Client_mc.ff - var4;
            var1 = this.j;
         } else {
            while (var2 > this.r.a(this.j)) {
               var2 -= this.r.a(this.j);
               this.j++;
               if (this.j >= this.r.d) {
                  this.j = this.j - this.r.h;
                  if (this.j < 0 || this.j >= this.r.d) {
                     this.r = null;
                     break;
                  }
               }
            }

            this.s = C_Client_mc.ff - var2;
            if (this.r != null) {
               var1 = this.r.e[this.j];
            }
         }
      }

      C_r var5;
      if (this.k != null) {
         var5 = this.d();
      } else {
         var5 = C_r.c(this.i);
      }

      return var5 == null ? null : var5.a(this.t, this.u, this.n, this.o, this.p, this.q, var1, this.r != null ? this.r.r : -1);
   }

   private C_r d() {
      int var1 = -1;
      if (this.l != -1) {
         try {
            C_y var2 = C_y.a[this.l];
            int var3 = var2.b;
            int var4 = var2.c;
            int var5 = var2.d;
            int var6 = C_Client_mc.fQ[var5 - var4];
            var1 = h.dP[var3] >> var4 & var6;
         } catch (Exception var7) {
         }
      } else if (this.m != -1 && this.m < h.dP.length) {
         var1 = h.dP[this.m];
      }

      int var8;
      if (var1 >= 0 && var1 < this.k.length) {
         var8 = this.k[var1];
      } else {
         var8 = this.k[this.k.length - 1];
      }

      if (var1 == -1) {
         return null;
      } else {
         return var8 != -1 ? C_r.c(this.k[var1]) : null;
      }
   }

   public C_m(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public C_m(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, C_a var10) {
      this.i = var1;
      this.t = var3;
      this.u = var2;
      this.n = var6;
      this.o = var4;
      this.p = var5;
      this.q = var7;
      C_r var11 = C_r.c(this.i);
      this.l = var11.ao;
      this.m = var11.Y;
      this.k = var11.ad;
      if (var8 != -1) {
         this.r = rs.p_d.C_a.a[var8];
         this.j = 0;
         this.s = C_Client_mc.ff;
         if (this.r.q == 0 && var10 != null && var10 instanceof C_m) {
            C_m var12 = (C_m)var10;
            if (var12.r == this.r) {
               this.j = var12.j;
               this.s = var12.s;
               return;
            }
         }

         if (var9 && this.r.h != -1) {
            if (this.r.b()) {
               this.j = (int)(Math.random() * (double)this.r.c());
            } else {
               this.j = (int)(Math.random() * (double)this.r.d);
               this.s = this.s - (int)(Math.random() * (double)this.r.a(this.j));
            }
         }
      }
   }
}
