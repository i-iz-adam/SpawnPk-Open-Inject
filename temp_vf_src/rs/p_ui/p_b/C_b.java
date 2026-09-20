package rs.p_ui.p_b;

import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import rs.C_Client_mc;
import rs.C_Q_uc;
import rs.C_T_uc;
import rs.C_U_uc;
import rs.C_l;
import rs.C_m;
import rs.p_a.C_c;
import rs.p_a.C_h;
import rs.p_a.C_j;
import rs.p_a.C_k;
import rs.p_d.C_d;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_a.C_f;

@Singleton
public class C_b {
   private static final int a = 50;
   private static final int b = 4;
   private static final int c = 10;
   private final int[] d = new int[6500];
   private final int[] e = new int[6500];
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int[] p = new int[0];
   private final C_a q = new C_a();
   private int[][] r = new int[0][];
   private int[] s = new int[0];
   private int[] t;
   private int u;
   private C_b.b[][][] v = new C_b.b[0][][];
   private C_b.a[][][] w = new C_b.a[0][][];
   private static final C_b x = new C_b();

   public static C_b a() {
      return x;
   }

   private static int a(int var0) {
      var0 = --var0 | var0 >> 1;
      var0 |= var0 >> 2;
      var0 |= var0 >> 4;
      var0 |= var0 >> 8;
      var0 |= var0 >> 16;
      return var0 + 1;
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (var3 - var1) * (var4 - var2) - (var2 - var0) * (var5 - var3) <= 0;
   }

   private C_b.b[] a(int var1, int var2) {
      if (this.v.length <= var1) {
         this.v = Arrays.copyOf(this.v, var1 + 1);
      }

      if (this.v[var1] == null) {
         this.v[var1] = new C_b.b[var2 + 1][];
      } else if (this.v[var1].length <= var2) {
         this.v[var1] = Arrays.copyOf(this.v[var1], var2 + 1);
      }

      if (this.v[var1][var2] == null) {
         double var3 = (double)var2 / 4.0 * ((double)var1 - 0.5);
         ArrayList var5 = new ArrayList();

         for (int var6 = 0; var6 <= var1; var6++) {
            for (int var7 = 0; var7 <= var1; var7++) {
               if (var6 != 0 || var7 != 0) {
                  double var8 = Math.hypot((double)var6, (double)var7);
                  if (!(var8 > (double)var1)) {
                     double var10 = (double)var1 - var8 + 0.5;
                     double var12 = var10 < var3 ? var10 / var3 : 1.0;
                     var5.add(new C_b.b(var8, var6 + var7 * this.u, var12));
                  }
               }
            }
         }

         var5.sort(Comparator.comparingDouble(var0 -> var0.a()));
         this.v[var1][var2] = var5.toArray(new C_b.b[0]);
      }

      return this.v[var1][var2];
   }

   private void b(int var1) {
      if (this.w.length <= var1) {
         this.w = Arrays.copyOf(this.w, var1 + 1);
      }

      if (this.w[var1] == null) {
         this.w[var1] = new C_b.a[4][];
      }

      if (this.w[var1][0] == null) {
         ArrayList var2 = new ArrayList();

         for (int var3 = -var1; var3 <= var1; var3++) {
            for (int var4 = 1; var4 <= var1; var4++) {
               if (Math.abs(var3) <= var4) {
                  double var5 = Math.hypot((double)var4, (double)var3);
                  if (!(var5 > (double)var1)) {
                     var2.add(new C_b.a(var4, var3));
                  }
               }
            }
         }

         for (int var7 = 0; var7 < 4; var7++) {
            this.w[var1][var7] = var2.toArray(new C_b.a[0]);

            for (int var8 = 0; var8 < var2.size(); var8++) {
               C_b.a var9 = (C_b.a)var2.get(var8);
               var2.set(var8, new C_b.a(var9.b, -var9.a));
            }
         }
      }
   }

   private void a(int var1, int var2, int var3) {
      if (this.t[var1] == 1024) {
         int var4 = this.s[var1] + 1;
         if (var4 > this.r[var1].length) {
            this.r[var1] = Arrays.copyOf(this.r[var1], a(var4));
         }

         this.r[var1][this.s[var1]] = this.q.b();
         this.s[var1]++;
         this.t[var1] = 0;
      }

      int[] var7 = this.q.a();
      int var5 = this.r[var1][this.s[var1] - 1];
      int var6 = this.t[var1]++;
      var7[(var5 << 10) + var6] = var3 << 16 | var2;
   }

   private void c(int var1) {
      int var2 = var1 >>> 5;
      if (this.p.length < var2) {
         this.p = new int[a(var2)];
      }

      Arrays.fill(this.p, 0, var2, 0);
   }

   private void b() {
      int var1 = this.u * this.u;
      if (this.s.length < var1) {
         this.r = new int[var1][];
         this.s = new int[var1];
         this.t = new int[var1];

         for (int var2 = 0; var2 < var1; var2++) {
            this.r[var2] = new int[0];
         }
      }

      for (int var3 = 0; var3 < var1; var3++) {
         this.t[var3] = 1024;
      }
   }

   private void c() {
      for (int var1 = 0; var1 < this.u * this.u; var1++) {
         while (this.s[var1] > 0) {
            this.s[var1]--;
            this.q.a(this.r[var1][this.s[var1]]);
         }

         this.t[var1] = 1024;
      }
   }

   private void b(int var1, int var2, int var3) {
      if (var3 > this.h) {
         var3 = this.h;
      }

      if (var2 < this.f) {
         var2 = this.f;
      }

      if (var2 < var3) {
         int var4 = (var1 - this.k) * this.n + (var2 - this.j);
         int var5 = var4 + var3 - var2;
         int var6 = var4 >> 5;
         int var7 = var5 >> 5;
         if (var6 == var7) {
            this.p[var6] = this.p[var6] | (1 << (var5 & 31)) - 1 ^ (1 << (var4 & 31)) - 1;
         } else {
            this.p[var6] = this.p[var6] | -(1 << (var4 & 31));
            this.p[var7] = this.p[var7] | (1 << (var5 & 31)) - 1;

            for (int var8 = var6 + 1; var8 < var7; var8++) {
               this.p[var8] = -1;
            }
         }
      }
   }

   private void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 > var4) {
         int var7 = var2;
         int var8 = var1;
         var2 = var4;
         var4 = var7;
         var1 = var3;
         var3 = var8;
      }

      if (var4 > var6) {
         int var16 = var4;
         int var19 = var3;
         var4 = var6;
         var6 = var16;
         var3 = var5;
         var5 = var19;
      }

      if (var2 > var4) {
         int var17 = var2;
         int var20 = var1;
         var2 = var4;
         var4 = var17;
         var1 = var3;
         var3 = var20;
      }

      if (var2 <= this.i) {
         int var18 = 0;
         if (var2 != var4) {
            var18 = (var3 - var1 << 14) / (var4 - var2);
         }

         int var21 = 0;
         if (var6 != var4) {
            var21 = (var5 - var3 << 14) / (var6 - var4);
         }

         int var9 = 0;
         if (var2 != var6) {
            var9 = (var1 - var5 << 14) / (var2 - var6);
         }

         if (var4 > this.i) {
            var4 = this.i;
         }

         if (var6 > this.i) {
            var6 = this.i;
         }

         if (var2 != var6 && var6 >= this.g) {
            var1 <<= 14;
            var3 <<= 14;
            var5 = var1;
            if (var2 < this.g) {
               var5 = var1 - (var2 - this.g) * var9;
               var1 -= (var2 - this.g) * var18;
               var2 = this.g;
            }

            if (var4 < this.g) {
               var3 -= (var4 - this.g) * var21;
               var4 = this.g;
            }

            int var10 = var2;
            int var11 = var4 - var2;
            int var12 = var6 - var4;
            if ((var2 == var4 || var9 >= var18) && (var2 != var4 || var9 <= var21)) {
               while (var11-- > 0) {
                  this.b(var10, var1 >> 14, var5 >> 14);
                  var1 += var18;
                  var5 += var9;
                  var10++;
               }

               while (var12-- > 0) {
                  this.b(var10, var3 >> 14, var5 >> 14);
                  var5 += var9;
                  var3 += var21;
                  var10++;
               }
            } else {
               while (var11-- > 0) {
                  this.b(var10, var5 >> 14, var1 >> 14);
                  var5 += var9;
                  var1 += var18;
                  var10++;
               }

               while (var12-- > 0) {
                  this.b(var10, var5 >> 14, var3 >> 14);
                  var5 += var9;
                  var3 += var21;
                  var10++;
               }
            }
         }
      }
   }

   private boolean a(C_h var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.z();
      rs.p_runelite.p_a.C_h.a(var6, var2, var3, var4, var5, var1.A(), var1.C(), var1.B(), this.d, this.e);
      boolean var7 = false;

      for (int var8 = 0; var8 < var6; var8++) {
         int var9 = this.d[var8];
         int var10 = this.e[var8];
         if (var10 != Integer.MIN_VALUE) {
            boolean var11 = var9 >= this.f && var9 < this.h;
            boolean var12 = var10 >= this.g && var10 < this.i;
            var7 |= var11 && var12;
            this.j = Math.min(this.j, var9);
            this.l = Math.max(this.l, var9 + 1);
            this.k = Math.min(this.k, var10);
            this.m = Math.max(this.m, var10 + 1);
         } else {
            this.e[var8] = Integer.MIN_VALUE;
         }
      }

      return var7;
   }

   private void a(C_h var1) {
      int var2 = var1.G();
      int[] var3 = var1.D();
      int[] var4 = var1.E();
      int[] var5 = var1.F();
      int[] var6 = var1.H();

      for (int var7 = 0; var7 < var2; var7++) {
         if (this.e[var3[var7]] != Integer.MIN_VALUE
            && this.e[var4[var7]] != Integer.MIN_VALUE
            && this.e[var5[var7]] != Integer.MIN_VALUE
            && (var6 == null || (var6[var7] & 0xFF) < 254)) {
            int var8 = var3[var7];
            int var9 = var4[var7];
            int var10 = var5[var7];
            int var11 = this.d[var8];
            int var12 = this.e[var8];
            int var13 = this.d[var9];
            int var14 = this.e[var9];
            int var15 = this.d[var10];
            int var16 = this.e[var10];
            if (!a(var11, var12, var13, var14, var15, var16)) {
               this.b(var11, var12, var13, var14, var15, var16);
            }
         }
      }
   }

   private void a(int[] var1, int var2, int var3, int var4, C_b.a[] var5, int var6) {
      for (C_b.a var10 : var5) {
         int var11 = var3 + var10.a;
         int var12 = var4 + var10.b;
         int var13 = (var12 - this.k) * this.n + (var11 - this.j);
         if (var11 >= this.f && var11 < this.h && var12 >= this.g && var12 < this.i && (this.p[var13 >> 5] & 1 << (var13 & 31)) == 0) {
            var1[var12 * var2 + var11] = var6;
         }
      }
   }

   private void a(boolean var1, Color var2, int var3) {
      BufferedImage var4 = C_Launcher_mc.n().o().gZ.e;
      int var5 = var4.getWidth();
      int[] var6 = ((DataBufferInt)var4.getRaster().getDataBuffer()).getData();
      int var7 = var2.getRGB();

      for (byte var8 = 0; var8 < this.n; var8 += 32) {
         int var9 = this.p[var8 >> 5];

         for (int var10 = 1; var10 < this.o; var10++) {
            int var11 = this.p[var10 * this.n + var8 >> 5];
            if (var9 != var11) {
               if (!var1) {
                  for (int var24 = 0; var24 < 32; var24++) {
                     int var27 = var9 >>> var24 & 1;
                     int var32 = var11 >>> var24 & 1;
                     if (var27 != var32) {
                        this.a(this.u, this.j + var8 + var24, this.k + var10 - var32);
                     }
                  }
               } else if (var3 == 1) {
                  for (int var23 = 0; var23 < 32; var23++) {
                     int var26 = var9 >>> var23 & 1;
                     int var31 = var11 >>> var23 & 1;
                     if (var26 != var31) {
                        var6[(this.k + var10 - var31) * var5 + this.j + var8 + var23] = var7;
                     }
                  }
               } else {
                  C_b.a[] var12 = this.w[var3][3];
                  C_b.a[] var13 = this.w[var3][1];

                  for (int var14 = 0; var14 < 32; var14++) {
                     int var15 = var9 >>> var14 & 1;
                     int var16 = var11 >>> var14 & 1;
                     if (var15 == 1 && var16 == 0) {
                        this.a(var6, var5, this.j + var8 + var14, this.k + var10 - 1, var12, var7);
                     } else if (var15 == 0 && var16 == 1) {
                        this.a(var6, var5, this.j + var8 + var14, this.k + var10, var13, var7);
                     }
                  }
               }
            }

            var9 = var11;
         }
      }

      for (int var19 = 0; var19 < this.o; var19++) {
         int var20 = var19 * this.n;
         int var21 = 0;

         for (byte var22 = 0; var22 < this.n; var22 += 32) {
            int var25 = this.p[var20 + var22 >> 5];
            if (var25 != 0 && var25 != -1) {
               int var28 = Math.min(32, this.h - this.j - var22);
               int var33 = var25 & 1;
               if (!var1) {
                  for (int var36 = 1; var36 < var28; var36++) {
                     int var39 = var25 >>> var36 & 1;
                     if (var39 != var33) {
                        this.a(1, this.j + var22 + var36 - var39, this.k + var19);
                     }

                     var33 = var39;
                  }
               } else if (var3 == 1) {
                  for (int var35 = 1; var35 < var28; var35++) {
                     int var38 = var25 >>> var35 & 1;
                     if (var38 != var33) {
                        var6[(this.k + var19) * var5 + (this.j + var22 + var35 - var38)] = var7;
                     }

                     var33 = var38;
                  }
               } else {
                  C_b.a[] var34 = this.w[var3][0];
                  C_b.a[] var37 = this.w[var3][2];

                  for (int var17 = 1; var17 < var28; var17++) {
                     int var18 = var25 >>> var17 & 1;
                     if (var18 == 1 && var33 == 0) {
                        this.a(var6, var5, this.j + var22 + var17, this.k + var19, var37, var7);
                     } else if (var18 == 0 && var33 == 1) {
                        this.a(var6, var5, this.j + var22 + var17 - 1, this.k + var19, var34, var7);
                     }

                     var33 = var18;
                  }
               }
            }

            if (var21 >>> 31 != (var25 & 1) && var22 > 0) {
               if (var1) {
                  if (var3 == 1) {
                     var6[(this.k + var19) * var5 + (this.j + var22 - (var25 & 1))] = var7;
                  } else if ((var25 & 1) == 1) {
                     C_b.a[] var29 = this.w[var3][2];
                     this.a(var6, var5, this.j + var22, this.k + var19, var29, var7);
                  } else {
                     C_b.a[] var30 = this.w[var3][0];
                     this.a(var6, var5, this.j + var22 - 1, this.k + var19, var30, var7);
                  }
               } else {
                  this.a(1, this.j + var22 - (var25 & 1), this.k + var19);
               }
            }

            var21 = var25;
         }
      }
   }

   private void a(int var1, Color var2, int var3) {
      BufferedImage var4 = C_Launcher_mc.n().o().gZ.e;
      int var5 = var4.getWidth();
      int[] var6 = ((DataBufferInt)var4.getRaster().getDataBuffer()).getData();
      C_b.b[] var7 = this.a(var1, var3);

      for (C_b.b var11 : var7) {
         int[] var12 = this.q.a();
         int var15 = (int)Math.round((double)var2.getAlpha() * var11.c);
         int var14 = 256 - var15;
         int var13 = var15 << 24 | var2.getRed() * var15 / 255 << 16 | var2.getGreen() * var15 / 255 << 8 | var2.getBlue() * var15 / 255;
         var15 = var11.b;
         int var16 = var15 + this.u;

         for (int var17 = var15 + 1; this.s[var15] > 0; this.t[var15] = 1024) {
            int var18 = this.r[var15][this.s[var15] - 1];
            int var19 = var18 << 10;
            int var20 = var19 + this.t[var15];

            for (int var21 = var19; var21 < var20; var21++) {
               int var22 = var12[var21] & 65535;
               int var23 = var12[var21] >>> 16;
               int var24 = (var23 - this.k) * this.n + (var22 - this.j);
               if ((this.p[var24 >> 5] & 1 << (var24 & 31)) == 0) {
                  this.p[var24 >> 5] = this.p[var24 >> 5] | 1 << (var24 & 31);
                  int var25 = var23 * var5 + var22;
                  int var26 = var6[var25];
                  var6[var25] = (var13 & -16711936) + ((var26 & -16711936) * var14 >>> 8) & -16711936
                     | (var13 & 16711935) + ((var26 & 16711935) * var14 >>> 8) & 16711935;
                  if (var22 - 1 >= this.f) {
                     this.a(var17, var22 - 1, var23);
                  }

                  if (var22 + 1 < this.h) {
                     this.a(var17, var22 + 1, var23);
                  }

                  if (var23 - 1 >= this.g) {
                     this.a(var16, var22, var23 - 1);
                  }

                  if (var23 + 1 < this.i) {
                     this.a(var16, var22, var23 + 1);
                  }
               }
            }

            this.q.a(var18);
            this.s[var15]--;
         }
      }
   }

   private void a(C_h var1, int var2, int var3, int var4, int var5, int var6, Color var7, int var8) {
      if (var6 > 0 && var7.getAlpha() != 0 && var1 != null) {
         if (var6 > 50) {
            var6 = 50;
         }

         if (var8 < 0) {
            var8 = 0;
         } else if (var8 > 4) {
            var8 = 4;
         }

         this.j = Integer.MAX_VALUE;
         this.l = Integer.MIN_VALUE;
         this.k = Integer.MAX_VALUE;
         this.m = Integer.MIN_VALUE;
         this.f = C_Launcher_mc.n().o().ag();
         this.g = C_Launcher_mc.n().o().ah();
         this.h = C_Launcher_mc.n().o().at() + this.f;
         this.i = C_Launcher_mc.n().o().as() + this.g;
         if (this.a(var1, var2, var3, var4, var5)) {
            this.j = Math.max(this.j - var6, this.f);
            this.l = Math.min(this.l + var6, this.h);
            this.l = this.l + (~(this.l - this.j - 1) & 31);
            this.k = Math.max(this.k - var6, this.g);
            this.m = Math.min(this.m + var6, this.i);
            this.n = this.l - this.j;
            this.o = this.m - this.k;
            this.c(this.n * this.o);
            this.a(var1);
            boolean var9 = var7.getAlpha() == 255 && var6 <= 10 && (var8 == 0 || var6 == 1);
            if (var9) {
               this.b(var6);
            } else {
               this.u = var6 + 2;
               this.b();
            }

            try {
               this.a(var9, var7, var6);
               if (!var9) {
                  this.a(var6, var7, var8);
               }
            } finally {
               this.c();
            }
         }
      }
   }

   public void a(C_j var1, int var2, Color var3, int var4) {
      byte var5 = 1;
      C_d var6 = var1.aG;
      if (var6 != null) {
         var5 = var6.r;
      }

      C_f var7 = new C_f(var1.ac, var1.ad);
      if (var7 != null) {
         this.a(var1.c(), var7.b(), var7.c(), rs.p_runelite.p_a.C_h.d(var7, C_Client_mc.dw), var1.ae, var2, var3, var4);
      }
   }

   public void a(C_k var1, int var2, Color var3, int var4) {
      C_f var5 = new C_f(var1.ac, var1.ad);
      if (var5 != null) {
         this.a(var1.c(), var5.b(), var5.c(), rs.p_runelite.p_a.C_h.d(var5, C_Client_mc.dw), var1.ae, var2, var3, var4);
      }
   }

   public void a(C_c var1, int var2, Color var3, int var4) {
      if (var1 instanceof C_j) {
         this.a((C_j)var1, var2, var3, var4);
      } else if (var1 instanceof C_k) {
         this.a((C_k)var1, var2, var3, var4);
      }
   }

   private void a(C_l var1, int var2, Color var3, int var4) {
      rs.p_a.C_a var5 = var1.a();
      if (var5 != null) {
         C_h var6 = var5 instanceof C_h ? (C_h)var5 : var5.c();
         if (var6 != null) {
            this.a(var6, var1.n, var1.o, var1.c, var1.e, var2, var3, var4);
         }
      }
   }

   private void a(C_m var1, int var2, Color var3, int var4) {
      rs.p_a.C_a var5 = var1.a();
      if (var5 != null) {
         C_h var6 = var5 instanceof C_h ? (C_h)var5 : var5.c();
         if (var6 != null) {
            this.a(var6, var1.n, var1.o, var1.b, 0, var2, var3, var4);
         }
      }
   }

   private void a(C_U_uc var1, int var2, Color var3, int var4) {
      rs.p_a.C_a var5 = var1.a();
      if (var5 != null) {
         C_h var6 = var5 instanceof C_h ? (C_h)var5 : var5.c();
         if (var6 != null) {
            this.a(var6, var1.n, var1.o, var1.c, 0, var2, var3, var4);
         }
      }

      rs.p_a.C_a var8 = var1.b();
      if (var8 != null) {
         C_h var7 = var8 instanceof C_h ? (C_h)var8 : var8.c();
         if (var7 != null) {
            this.a(var7, var1.n, var1.o, var1.c, 0, var2, var3, var4);
         }
      }
   }

   private void a(C_T_uc var1, int var2, Color var3, int var4) {
      rs.p_a.C_a var5 = var1.a();
      if (var5 != null) {
         C_h var6 = var5 instanceof C_h ? (C_h)var5 : var5.c();
         if (var6 != null) {
            this.a(var6, var1.n, var1.o, var1.b, var1.d, var2, var3, var4);
         }
      }
   }

   public void a(C_Q_uc var1, int var2, Color var3, int var4) {
      if (var1 instanceof C_l) {
         this.a((C_l)var1, var2, var3, var4);
      } else if (var1 instanceof C_m) {
         this.a((C_m)var1, var2, var3, var4);
      } else if (var1 instanceof C_T_uc) {
         this.a((C_T_uc)var1, var2, var3, var4);
      } else if (var1 instanceof C_U_uc) {
         this.a((C_U_uc)var1, var2, var3, var4);
      }
   }

   private static class a {
      private final int a;
      private final int b;

      public a(int var1, int var2) {
         this.a = var1;
         this.b = var2;
      }
   }

   private static class b {
      private final double a;
      private final int b;
      private final double c;

      public b(double var1, int var3, double var4) {
         this.a = var1;
         this.b = var3;
         this.c = var4;
      }

      private double a() {
         return this.a;
      }
   }
}
