package rs.p_l.p_d;

import java.awt.Color;
import rs.C_C_uc;
import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_a {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private static final int h = 8;
   private static final int i = 256;
   private static final int j = 256;
   private final Color k = new Color(178, 120, 208);
   public static final Color[] g = C_c.i;
   private static final C_F_uc[][] l = new C_F_uc[9][g.length];
   private static boolean m = false;
   private C_Client_mc n;
   private C_F_uc o;
   private int p;
   private int q;
   private int r;
   private int s;
   private final int t;
   private int u;
   private int v;
   private boolean w;
   private boolean x;
   private boolean y;
   private int z;

   public C_a(C_Client_mc var1, int var2, int var3, int var4) {
      this.n = var1;
      this.p = var2;
      this.q = var3;
      this.r = var2 << 8;
      this.s = var3 << 8;
      this.t = var4;
      this.b();
   }

   public void a(boolean var1, int var2, int var3, int var4, int var5, boolean var6, int var7, int var8, int var9, int var10, int var11) {
      boolean var12 = var6 && this.a(var8, var9, var10);
      if (this.x || var12) {
         if (!var6) {
            this.x = false;
            this.y = true;
         } else {
            if (!this.x) {
               this.d();
               this.x = true;
            }

            this.a(var7, var8, var9, var10, var11);
         }
      }

      if (!this.x && var1) {
         if (!this.w) {
            this.d();
         }

         this.b(var2, var3, var4, var5);
      } else if (!this.x && this.y) {
         this.e();
      } else if (!this.x) {
         this.g();
      }

      this.w = var1;
      this.o.c(this.p, this.q);
   }

   private void d() {
      this.u = this.r;
      this.v = this.s;
      this.y = true;
   }

   private boolean a(int var1, int var2, int var3) {
      int var4 = this.p + this.o.n / 2;
      int var5 = this.q + this.o.o / 2;
      int var6 = var4 - var1;
      int var7 = var5 - var2;
      int var8 = Math.max(this.o.n, this.o.o) / 2;
      int var9 = var3 + var8;
      return var6 * var6 + var7 * var7 <= var9 * var9;
   }

   public boolean a() {
      return this.x;
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      switch (var5) {
         case 1:
            this.a(var1, var2, var3, var4, 10, true);
            break;
         case 2:
            this.a(var1, var2, var3, var4, 3, false);
            break;
         case 3:
            this.a(var1, var2, var3, var4, 4, false);
            break;
         case 4:
            this.a(var1, var2, var3, var4);
            break;
         default:
            this.b(var1, var2, var3, var4);
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = this.t * var5;
      int var8 = var7 >> 11;
      int var9 = var7 & 2047;
      int var10 = (var8 + 1) % var5;
      int var11 = var1 - 512;
      int var12 = var6 && (var8 & 1) == 1 ? var4 * 2 / 5 : var4;
      int var13 = var6 && (var10 & 1) == 1 ? var4 * 2 / 5 : var4;
      int var14 = var11 + var8 * 2048 / var5 & 2047;
      int var15 = var11 + var10 * 2048 / var5 & 2047;
      int var16 = C_C_uc.hB[var14] * var12 >> 16;
      int var17 = C_C_uc.hA[var14] * var12 >> 16;
      int var18 = C_C_uc.hB[var15] * var13 >> 16;
      int var19 = C_C_uc.hA[var15] * var13 >> 16;
      int var20 = var16 * (2048 - var9) + var18 * var9 >> 11;
      int var21 = var17 * (2048 - var9) + var19 * var9 >> 11;
      this.a(var2 + var20, var3 + var21);
   }

   private void a(int var1, int var2, int var3, int var4) {
      int var5 = this.t >> 10;
      int var6 = this.t & 1023;
      int var7 = (var6 * var4 * 2 >> 10) - var4;
      int var8 = var1 + 256 + var5 * 512 & 2047;
      int var9 = C_C_uc.hB[var8] * var7 >> 16;
      int var10 = C_C_uc.hA[var8] * var7 >> 16;
      this.a(var2 + var9, var3 + var10);
   }

   private void a(int var1, int var2) {
      int var3 = var1 - this.o.n / 2;
      int var4 = var2 - this.o.o / 2;
      this.r = this.r + ((var3 << 8) - this.r >> 3);
      this.s = this.s + ((var4 << 8) - this.s >> 3);
      this.f();
   }

   private void b(int var1, int var2, int var3, int var4) {
      int var5 = var1 + this.t & 2047;
      int var6 = var2 + (C_C_uc.hB[var5] * var4 >> 16) - this.o.n / 2;
      int var7 = var3 + (C_C_uc.hA[var5] * var4 >> 16) - this.o.o / 2;
      this.a(var6 + this.o.n / 2, var7 + this.o.o / 2);
   }

   private void e() {
      int var1 = this.u - this.r;
      int var2 = this.v - this.s;
      if (Math.abs(var1) <= 256 && Math.abs(var2) <= 256) {
         this.r = this.u;
         this.s = this.v;
         this.y = false;
      } else {
         this.r += var1 >> 1;
         this.s += var2 >> 1;
      }

      this.f();
   }

   private void f() {
      this.p = this.r >> 8;
      this.q = this.s >> 8;
   }

   public void b() {
      this.z = C_Client_mc.c(7, 9);
      if (C_Client_mc.c(0, 20) == 0) {
         this.z = 9;
      }

      if (C_Client_mc.c(0, 10) == 0) {
         this.z = C_Client_mc.c(1, 3) == 3 ? 1 : 6;
      }

      if (!m) {
         for (int var1 = 0; var1 < l.length; var1++) {
            int var2 = 0;

            for (Color var6 : g) {
               String var7 = "orb " + (var1 + 1);
               if (var1 + 1 >= 7) {
                  l[var1][var2++] = new C_F_uc("/assets/", var7);
               } else {
                  new C_F_uc("/assets/", var7, this.k, var6);
                  C_F_uc var8 = new C_F_uc("/assets/", var7, this.k, var6);
                  l[var1][var2++] = var8;
               }
            }
         }

         m = true;
      }

      int var9 = C_Client_mc.c(0, g.length - 1);
      this.o = l[this.z - 1][var9];
   }

   public int c() {
      return this.z;
   }

   private void g() {
      if (this.z > 3) {
         this.z = C_Client_mc.c(1, 3);
      }

      this.r = this.r + (this.z << 8);
      this.s = this.s + (this.z << 8);
      this.f();
      if (this.p >= this.n.hE + this.o.n) {
         this.b();
         this.p = -1 * this.o.n;
         this.r = this.p << 8;
      }

      if (this.q >= this.n.hF + this.o.o) {
         this.b();
         this.q = -1 * this.o.o;
         this.s = this.q << 8;
      }
   }
}
