package rs.p_l;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public final class C_E_uc extends C_B_uc {
   public static int f = 512;
   public static boolean g = false;
   public static boolean h = false;
   public static boolean i = !rs.p_f.C_a.ah;
   public static double j;
   private static final p_gnu.p_trove.p_i.p_a.C_i C = new p_gnu.p_trove.p_i.p_a.C_i();
   public static float[] k;
   public static final int l = 340;
   public static final int m = -477;
   public static boolean n = true;
   public static boolean o;
   private static boolean D;
   public static boolean p = true;
   public static boolean q = true;
   public static int r;
   public static int s;
   public static int t;
   private static int[] E = new int[512];
   public static final int[] u = new int[2048];
   public static int[] v = new int[2048];
   public static int[] w = new int[2048];
   public static int[] x;
   private static int F;
   public static C_a[] y = new C_a[340];
   private static boolean[] G = new boolean[340];
   private static int[] H = new int[340];
   private static int I;
   private static int[][] J;
   private static int[][] K = new int[340][];
   public static int[] z = new int[340];
   public static int A;
   public static int[] B = new int[65536];
   private static int[][] L = new int[340][];

   public static double c() {
      return j;
   }

   public static void a(double var0) {
      j = var0;
   }

   public static int d() {
      return C_Client_mc.aj + 4 + (C_Client_mc.ak + 4) * 765;
   }

   public static boolean a(int var0) {
      return false;
   }

   public static void e() {
      E = null;
      E = null;
      v = null;
      w = null;
      x = null;
      y = null;
      G = null;
      H = null;
      J = null;
      K = null;
      z = null;
      B = null;
      L = null;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return var0 * var1 + var2 * var2;
   }

   public static int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = var2 - var0;
      int var12 = var3 - var1;
      int var13 = var4 - var0;
      int var14 = var5 - var1;
      int var15 = var9 - var0;
      int var16 = var10 - var1;
      float var17 = (float)a(var11, var11, var12, var12);
      float var18 = (float)a(var11, var13, var12, var14);
      float var19 = (float)a(var13, var13, var14, var14);
      float var20 = (float)a(var15, var11, var16, var12);
      float var21 = (float)a(var15, var13, var16, var14);
      float var22 = var17 * var19 - var18 * var18;
      float var23 = (var19 * var20 - var18 * var21) / var22;
      float var24 = (var17 * var21 - var18 * var20) / var22;
      float var25 = 1.0F - var23 - var24;
      return (int)(var25 * (float)var6 + var23 * (float)var7 + var24 * (float)var8);
   }

   public static void f() {
      x = new int[C_c.i];

      for (int var0 = 0; var0 < C_c.i; var0++) {
         x[var0] = C_c.h * var0;
      }

      s = C_c.h / 2;
      t = C_c.i / 2;
   }

   public static void a(int var0, int var1) {
      x = new int[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         x[var2] = var0 * var2;
      }

      s = var0 / 2;
      t = var1 / 2;
   }

   public static void g() {
      J = null;

      for (int var0 = 0; var0 < 340; var0++) {
         K[var0] = null;
      }
   }

   public static void h() {
      if (J == null) {
         I = 20;
         if (n) {
            J = new int[I][16384];
         } else {
            J = new int[I][65536];
         }

         for (int var0 = 0; var0 < 340; var0++) {
            K[var0] = null;
         }
      }
   }

   public static void a(rs.p_x.C_f var0) {
      F = 0;

      for (int var1 = 0; var1 < 340; var1++) {
         try {
            y[var1] = new C_a(var0, String.valueOf(var1), 0);
            if (y[var1].n * y[var1].o > 16384) {
               if (rs.p_f.C_a.f) {
                  System.out
                     .println("[!!!] Invalid texture size (too big) for ID " + var1 + ": " + y[var1].n + "x" + y[var1].o + " (replacing it to texture ID 0)");
               }

               y[var1] = null;
               y[var1] = y[0];
            }

            if (n && y[var1].n == 128) {
               y[var1].e();
            } else {
               y[var1].f();
            }

            F++;
         } catch (Exception var3) {
         }
      }
   }

   public static int b(int var0) {
      if (H[var0] != 0) {
         return H[var0];
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = L[var0].length;

         for (int var5 = 0; var5 < var4; var5++) {
            var1 += L[var0][var5] >> 16 & 0xFF;
            var2 += L[var0][var5] >> 8 & 0xFF;
            var3 += L[var0][var5] & 0xFF;
         }

         int var6 = (var1 / var4 << 16) + (var2 / var4 << 8) + var3 / var4;
         var6 = a(var6, 1.4);
         if (var6 == 0) {
            var6 = 1;
         }

         H[var0] = var6;
         return var6;
      }
   }

   public static void c(int var0) {
      if (K[var0] != null) {
         J[I++] = K[var0];
         K[var0] = null;
      }
   }

   public static int[] d(int var0) {
      z[var0] = A++;
      if (K[var0] != null) {
         return K[var0];
      } else {
         int[] var1;
         if (I > 0 && J != null) {
            var1 = J[--I];
            J[I] = null;
         } else {
            int var2 = 0;
            int var3 = -1;

            for (int var4 = 0; var4 < F; var4++) {
               if (K[var4] != null && (z[var4] < var2 || var3 == -1)) {
                  var2 = z[var4];
                  var3 = var4;
               }
            }

            var1 = K[var3];
            K[var3] = null;
         }

         K[var0] = var1;
         C_a var6 = y[var0];
         int[] var7 = L[var0];
         if (n) {
            G[var0] = false;

            for (int var8 = 0; var8 < 4096; var8++) {
               int var5 = var1[var8] = var7[var6.i[var8]] & 16316671;
               if (var5 == 0) {
                  G[var0] = true;
               }

               var1[4096 + var8] = var5 - (var5 >>> 3) & 16316671;
               var1[8192 + var8] = var5 - (var5 >>> 2) & 16316671;
               var1[12288 + var8] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
            }
         } else {
            if (var6.j != 64) {
               for (int var10 = 0; var10 < 16384; var10++) {
                  var1[var10] = var7[var6.i[var10]];
               }
            } else {
               for (int var9 = 0; var9 < 128; var9++) {
                  for (int var12 = 0; var12 < 128; var12++) {
                     var1[var12 + (var9 << 7)] = var7[var6.i[(var12 >> 1) + (var9 >> 1 << 6)]];
                  }
               }
            }

            G[var0] = false;

            for (int var11 = 0; var11 < 16384; var11++) {
               var1[var11] &= 16316671;
               int var13 = var1[var11];
               if (var13 == 0) {
                  G[var0] = true;
               }

               var1[16384 + var11] = var13 - (var13 >>> 3) & 16316671;
               var1[32768 + var11] = var13 - (var13 >>> 2) & 16316671;
               var1[49152 + var11] = var13 - (var13 >>> 2) - (var13 >>> 3) & 16316671;
            }
         }

         return var1;
      }
   }

   public static void b(double var0) {
      j = var0;
      var0 += Math.random() * 0.03 - 0.015;
      int var2 = 0;

      for (int var3 = 0; var3 < 512; var3++) {
         double var4 = (double)(var3 / 8) / 64.0 + 0.0078125;
         double var6 = (double)(var3 & 7) / 8.0 + 0.0625;

         for (int var8 = 0; var8 < 128; var8++) {
            double var9 = (double)var8 / 128.0;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var6 != 0.0) {
               double var17;
               if (var9 < 0.5) {
                  var17 = var9 * (1.0 + var6);
               } else {
                  var17 = var9 + var6 - var9 * var6;
               }

               double var19 = 2.0 * var9 - var17;
               double var21 = var4 + 0.3333333333333333;
               if (var21 > 1.0) {
                  var21--;
               }

               double var25 = var4 - 0.3333333333333333;
               if (var25 < 0.0) {
                  var25++;
               }

               if (6.0 * var21 < 1.0) {
                  var11 = var19 + (var17 - var19) * 6.0 * var21;
               } else if (2.0 * var21 < 1.0) {
                  var11 = var17;
               } else if (3.0 * var21 < 2.0) {
                  var11 = var19 + (var17 - var19) * (0.6666666666666666 - var21) * 6.0;
               } else {
                  var11 = var19;
               }

               if (6.0 * var4 < 1.0) {
                  var13 = var19 + (var17 - var19) * 6.0 * var4;
               } else if (2.0 * var4 < 1.0) {
                  var13 = var17;
               } else if (3.0 * var4 < 2.0) {
                  var13 = var19 + (var17 - var19) * (0.6666666666666666 - var4) * 6.0;
               } else {
                  var13 = var19;
               }

               if (6.0 * var25 < 1.0) {
                  var15 = var19 + (var17 - var19) * 6.0 * var25;
               } else if (2.0 * var25 < 1.0) {
                  var15 = var17;
               } else if (3.0 * var25 < 2.0) {
                  var15 = var19 + (var17 - var19) * (0.6666666666666666 - var25) * 6.0;
               } else {
                  var15 = var19;
               }
            }

            int var31 = (int)(var11 * 256.0);
            int var18 = (int)(var13 * 256.0);
            int var32 = (int)(var15 * 256.0);
            int var20 = (var31 << 16) + (var18 << 8) + var32;
            var20 = a(var20, var0);
            if (var20 == 0) {
               var20 = 1;
            }

            B[var2++] = var20;
         }
      }

      for (int var28 = 0; var28 < 340; var28++) {
         if (y[var28] != null) {
            int[] var30 = y[var28].h;
            L[var28] = new int[var30.length];

            for (int var5 = 0; var5 < var30.length; var5++) {
               L[var28][var5] = a(var30[var5], var0);
               if ((L[var28][var5] & 16316671) == 0 && var5 != 0) {
                  L[var28][var5] = 1;
               }
            }
         }
      }

      for (int var29 = 0; var29 < 340; var29++) {
         c(var29);
      }
   }

   public static int a(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 0xFF) / 256.0;
      double var7 = (double)(var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   public static int a(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (var2 != -1) {
         var6 += var8 * (var2 - var6) >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if ((i || rs.p_k.C_e.a()) && p) {
         c(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         b(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public static void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (!rs.p_k.C_e.a() || h) {
         int var9 = 0;
         int var10 = 0;
         if (var1 != var0) {
            var9 = (var4 - var3 << 16) / (var1 - var0);
            var10 = (var7 - var6 << 15) / (var1 - var0);
         }

         int var11 = 0;
         int var12 = 0;
         if (var2 != var1) {
            var11 = (var5 - var4 << 16) / (var2 - var1);
            var12 = (var8 - var7 << 15) / (var2 - var1);
         }

         int var13 = 0;
         int var14 = 0;
         if (var2 != var0) {
            var13 = (var3 - var5 << 16) / (var0 - var2);
            var14 = (var6 - var8 << 15) / (var0 - var2);
         }

         if (var0 <= var1 && var0 <= var2) {
            if (var0 < C_c.k) {
               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var1 < var2) {
                  int var56;
                  var5 = var56 = var3 << 16;
                  int var74;
                  var8 = var74 = var6 << 15;
                  if (var0 < 0) {
                     var5 -= var13 * var0;
                     var56 -= var9 * var0;
                     var8 -= var14 * var0;
                     var74 -= var10 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  var7 <<= 15;
                  if (var1 < 0) {
                     var4 -= var11 * var1;
                     var7 -= var12 * var1;
                     var1 = 0;
                  }

                  if ((var0 == var1 || var13 >= var9) && (var0 != var1 || var13 <= var11)) {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var56 >> 16, var5 >> 16, var74 >> 7, var8 >> 7);
                        var5 += var13;
                        var56 += var9;
                        var8 += var14;
                        var74 += var10;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                        var5 += var13;
                        var4 += var11;
                        var8 += var14;
                        var7 += var12;
                        var0 += C_c.h;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var5 >> 16, var56 >> 16, var8 >> 7, var74 >> 7);
                        var5 += var13;
                        var56 += var9;
                        var8 += var14;
                        var74 += var10;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                        var5 += var13;
                        var4 += var11;
                        var8 += var14;
                        var7 += var12;
                        var0 += C_c.h;
                     }
                  }
               } else {
                  int var55;
                  var4 = var55 = var3 << 16;
                  int var73;
                  var7 = var73 = var6 << 15;
                  if (var0 < 0) {
                     var4 -= var13 * var0;
                     var55 -= var9 * var0;
                     var7 -= var14 * var0;
                     var73 -= var10 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 15;
                  if (var2 < 0) {
                     var5 -= var11 * var2;
                     var8 -= var12 * var2;
                     var2 = 0;
                  }

                  if ((var0 == var2 || var13 >= var9) && (var0 != var2 || var11 <= var9)) {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var55 >> 16, var4 >> 16, var73 >> 7, var7 >> 7);
                        var4 += var13;
                        var55 += var9;
                        var7 += var14;
                        var73 += var10;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var0, var55 >> 16, var5 >> 16, var73 >> 7, var8 >> 7);
                        var5 += var11;
                        var55 += var9;
                        var8 += var12;
                        var73 += var10;
                        var0 += C_c.h;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var4 >> 16, var55 >> 16, var7 >> 7, var73 >> 7);
                        var4 += var13;
                        var55 += var9;
                        var7 += var14;
                        var73 += var10;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var0, var5 >> 16, var55 >> 16, var8 >> 7, var73 >> 7);
                        var5 += var11;
                        var55 += var9;
                        var8 += var12;
                        var73 += var10;
                        var0 += C_c.h;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < C_c.k) {
               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var2 < var0) {
                  int var60;
                  var3 = var60 = var4 << 16;
                  int var78;
                  var6 = var78 = var7 << 15;
                  if (var1 < 0) {
                     var3 -= var9 * var1;
                     var60 -= var11 * var1;
                     var6 -= var10 * var1;
                     var78 -= var12 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 15;
                  if (var2 < 0) {
                     var5 -= var13 * var2;
                     var8 -= var14 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var9 >= var11) && (var1 != var2 || var9 <= var13)) {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var60 >> 16, var3 >> 16, var78 >> 7, var6 >> 7);
                        var3 += var9;
                        var60 += var11;
                        var6 += var10;
                        var78 += var12;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var1, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                        var3 += var9;
                        var5 += var13;
                        var6 += var10;
                        var8 += var14;
                        var1 += C_c.h;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var3 >> 16, var60 >> 16, var6 >> 7, var78 >> 7);
                        var3 += var9;
                        var60 += var11;
                        var6 += var10;
                        var78 += var12;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var1, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                        var3 += var9;
                        var5 += var13;
                        var6 += var10;
                        var8 += var14;
                        var1 += C_c.h;
                     }
                  }
               } else {
                  int var59;
                  var5 = var59 = var4 << 16;
                  int var77;
                  var8 = var77 = var7 << 15;
                  if (var1 < 0) {
                     var5 -= var9 * var1;
                     var59 -= var11 * var1;
                     var8 -= var10 * var1;
                     var77 -= var12 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  var6 <<= 15;
                  if (var0 < 0) {
                     var3 -= var13 * var0;
                     var6 -= var14 * var0;
                     var0 = 0;
                  }

                  if (var9 < var11) {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var5 >> 16, var59 >> 16, var8 >> 7, var77 >> 7);
                        var5 += var9;
                        var59 += var11;
                        var8 += var10;
                        var77 += var12;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var1, var3 >> 16, var59 >> 16, var6 >> 7, var77 >> 7);
                        var3 += var13;
                        var59 += var11;
                        var6 += var14;
                        var77 += var12;
                        var1 += C_c.h;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var59 >> 16, var5 >> 16, var77 >> 7, var8 >> 7);
                        var5 += var9;
                        var59 += var11;
                        var8 += var10;
                        var77 += var12;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var1, var59 >> 16, var3 >> 16, var77 >> 7, var6 >> 7);
                        var3 += var13;
                        var59 += var11;
                        var6 += var14;
                        var77 += var12;
                        var1 += C_c.h;
                     }
                  }
               }
            }
         } else if (var2 < C_c.k) {
            if (var0 > C_c.k) {
               var0 = C_c.k;
            }

            if (var1 > C_c.k) {
               var1 = C_c.k;
            }

            if (var0 < var1) {
               int var64;
               var4 = var64 = var5 << 16;
               int var82;
               var7 = var82 = var8 << 15;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var64 -= var13 * var2;
                  var7 -= var12 * var2;
                  var82 -= var14 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               var6 <<= 15;
               if (var0 < 0) {
                  var3 -= var9 * var0;
                  var6 -= var10 * var0;
                  var0 = 0;
               }

               if (var11 < var13) {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var4 >> 16, var64 >> 16, var7 >> 7, var82 >> 7);
                     var4 += var11;
                     var64 += var13;
                     var7 += var12;
                     var82 += var14;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var2, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                     var4 += var11;
                     var3 += var9;
                     var7 += var12;
                     var6 += var10;
                     var2 += C_c.h;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var64 >> 16, var4 >> 16, var82 >> 7, var7 >> 7);
                     var4 += var11;
                     var64 += var13;
                     var7 += var12;
                     var82 += var14;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var2, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                     var4 += var11;
                     var3 += var9;
                     var7 += var12;
                     var6 += var10;
                     var2 += C_c.h;
                  }
               }
            } else {
               int var63;
               var3 = var63 = var5 << 16;
               int var81;
               var6 = var81 = var8 << 15;
               if (var2 < 0) {
                  var3 -= var11 * var2;
                  var63 -= var13 * var2;
                  var6 -= var12 * var2;
                  var81 -= var14 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               var7 <<= 15;
               if (var1 < 0) {
                  var4 -= var9 * var1;
                  var7 -= var10 * var1;
                  var1 = 0;
               }

               if (var11 < var13) {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var3 >> 16, var63 >> 16, var6 >> 7, var81 >> 7);
                     var3 += var11;
                     var63 += var13;
                     var6 += var12;
                     var81 += var14;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var2, var4 >> 16, var63 >> 16, var7 >> 7, var81 >> 7);
                     var4 += var9;
                     var63 += var13;
                     var7 += var10;
                     var81 += var14;
                     var2 += C_c.h;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var63 >> 16, var3 >> 16, var81 >> 7, var6 >> 7);
                     var3 += var11;
                     var63 += var13;
                     var6 += var12;
                     var81 += var14;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var2, var63 >> 16, var4 >> 16, var81 >> 7, var7 >> 7);
                     var4 += var9;
                     var63 += var13;
                     var7 += var10;
                     var81 += var14;
                     var2 += C_c.h;
                  }
               }
            }
         }
      }
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var1 <= d()) {
            var1 += 3064;
         }

         if (p) {
            int var26;
            int var30;
            if (o) {
               if (var3 - var2 > 3) {
                  var30 = (var5 - var4) / (var3 - var2);
               } else {
                  var30 = 0;
               }

               if (var3 > C_c.n) {
                  var3 = C_c.n;
               }

               if (var2 < 0) {
                  var4 -= var2 * var30;
                  var2 = 0;
               }

               if (var2 >= var3) {
                  return;
               }

               var1 += var2;
               var26 = var3 - var2 >> 2;
               var30 <<= 2;
            } else {
               if (var2 >= var3) {
                  return;
               }

               var1 += var2;
               var26 = var3 - var2 >> 2;
               if (var26 > 0) {
                  var30 = (var5 - var4) * E[var26] >> 15;
               } else {
                  var30 = 0;
               }
            }

            if (r != 0) {
               int var31 = r;
               int var32 = 256 - r;

               while (--var26 >= 0) {
                  int var22 = B[var4 >> 8];
                  var4 += var30;
                  var22 = ((var22 & 16711935) * var32 >> 8 & 16711935) + ((var22 & 0xFF00) * var32 >> 8 & 0xFF00);
                  var0[var1++] = var22 + ((var0[var1] & 16711935) * var31 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var31 >> 8 & 0xFF00);
                  var0[var1++] = var22 + ((var0[var1] & 16711935) * var31 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var31 >> 8 & 0xFF00);
                  var0[var1++] = var22 + ((var0[var1] & 16711935) * var31 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var31 >> 8 & 0xFF00);
                  var0[var1++] = var22 + ((var0[var1] & 16711935) * var31 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var31 >> 8 & 0xFF00);
               }

               var26 = var3 - var2 & 3;
               if (var26 > 0) {
                  int var24 = B[var4 >> 8];
                  var24 = ((var24 & 16711935) * var32 >> 8 & 16711935) + ((var24 & 0xFF00) * var32 >> 8 & 0xFF00);

                  do {
                     var0[var1++] = var24 + ((var0[var1] & 16711935) * var31 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var31 >> 8 & 0xFF00);
                  } while (--var26 > 0);
               }
            } else {
               while (--var26 >= 0) {
                  int var20 = B[var4 >> 8];
                  var4 += var30;
                  var0[var1++] = var20;
                  var0[var1++] = var20;
                  var0[var1++] = var20;
                  var0[var1++] = var20;
               }

               var26 = var3 - var2 & 3;
               if (var26 > 0) {
                  int var21 = B[var4 >> 8];

                  do {
                     var0[var1++] = var21;
                  } while (--var26 > 0);

                  return;
               }
            }
         } else if (var2 < var3) {
            int var8 = (var5 - var4) / (var3 - var2);
            if (o) {
               if (var3 > C_c.n) {
                  var3 = C_c.n;
               }

               if (var2 < 0) {
                  var4 -= var2 * var8;
                  var2 = 0;
               }

               if (var2 >= var3) {
                  return;
               }
            }

            var1 += var2;
            int var7 = var3 - var2;
            if (r == 0) {
               do {
                  var0[var1++] = B[var4 >> 8];
                  var4 += var8;
               } while (--var7 > 0);
            } else {
               int var9 = r;
               int var10 = 256 - r;

               do {
                  int var6 = B[var4 >> 8];
                  var4 += var8;
                  var6 = ((var6 & 16711935) * var10 >> 8 & 16711935) + ((var6 & 0xFF00) * var10 >> 8 & 0xFF00);
                  var0[var1++] = var6 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var9 >> 8 & 0xFF00);
               } while (--var7 > 0);
            }
         }
      }
   }

   public static void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.util.collections.FastSparseSetFactory$FastSparseSet.getCopy(FastSparseSetFactory.java:95)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.getCopy(SFormsFastMapDirect.java:67)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.getFilteredOutMap(SFormsConstructor.java:279)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.mergeInVarMaps(SFormsConstructor.java:241)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:94)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:65)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:224)
      //
      // Bytecode:
      // 0000: invokestatic rs/p_k/C_e.a ()Z
      // 0003: ifeq 000d
      // 0006: getstatic rs/p_l/C_E_uc.h Z
      // 0009: ifne 000d
      // 000c: return
      // 000d: getstatic rs/p_l/C_E_uc.B [I
      // 0010: iload 6
      // 0012: iaload
      // 0013: istore 9
      // 0015: getstatic rs/p_l/C_E_uc.B [I
      // 0018: iload 7
      // 001a: iaload
      // 001b: istore 10
      // 001d: getstatic rs/p_l/C_E_uc.B [I
      // 0020: iload 8
      // 0022: iaload
      // 0023: istore 11
      // 0025: iload 9
      // 0027: bipush 16
      // 0029: ishr
      // 002a: sipush 255
      // 002d: iand
      // 002e: istore 12
      // 0030: iload 9
      // 0032: bipush 8
      // 0034: ishr
      // 0035: sipush 255
      // 0038: iand
      // 0039: istore 13
      // 003b: iload 9
      // 003d: sipush 255
      // 0040: iand
      // 0041: istore 14
      // 0043: iload 10
      // 0045: bipush 16
      // 0047: ishr
      // 0048: sipush 255
      // 004b: iand
      // 004c: istore 15
      // 004e: iload 10
      // 0050: bipush 8
      // 0052: ishr
      // 0053: sipush 255
      // 0056: iand
      // 0057: istore 16
      // 0059: iload 10
      // 005b: sipush 255
      // 005e: iand
      // 005f: istore 17
      // 0061: iload 11
      // 0063: bipush 16
      // 0065: ishr
      // 0066: sipush 255
      // 0069: iand
      // 006a: istore 18
      // 006c: iload 11
      // 006e: bipush 8
      // 0070: ishr
      // 0071: sipush 255
      // 0074: iand
      // 0075: istore 19
      // 0077: iload 11
      // 0079: sipush 255
      // 007c: iand
      // 007d: istore 20
      // 007f: bipush 0
      // 0080: istore 21
      // 0082: bipush 0
      // 0083: istore 22
      // 0085: bipush 0
      // 0086: istore 23
      // 0088: bipush 0
      // 0089: istore 24
      // 008b: iload 1
      // 008c: iload 0
      // 008d: if_icmpeq 00c7
      // 0090: iload 4
      // 0092: iload 3
      // 0093: isub
      // 0094: bipush 16
      // 0096: ishl
      // 0097: iload 1
      // 0098: iload 0
      // 0099: isub
      // 009a: idiv
      // 009b: istore 21
      // 009d: iload 15
      // 009f: iload 12
      // 00a1: isub
      // 00a2: bipush 16
      // 00a4: ishl
      // 00a5: iload 1
      // 00a6: iload 0
      // 00a7: isub
      // 00a8: idiv
      // 00a9: istore 22
      // 00ab: iload 16
      // 00ad: iload 13
      // 00af: isub
      // 00b0: bipush 16
      // 00b2: ishl
      // 00b3: iload 1
      // 00b4: iload 0
      // 00b5: isub
      // 00b6: idiv
      // 00b7: istore 23
      // 00b9: iload 17
      // 00bb: iload 14
      // 00bd: isub
      // 00be: bipush 16
      // 00c0: ishl
      // 00c1: iload 1
      // 00c2: iload 0
      // 00c3: isub
      // 00c4: idiv
      // 00c5: istore 24
      // 00c7: bipush 0
      // 00c8: istore 25
      // 00ca: bipush 0
      // 00cb: istore 26
      // 00cd: bipush 0
      // 00ce: istore 27
      // 00d0: bipush 0
      // 00d1: istore 28
      // 00d3: iload 2
      // 00d4: iload 1
      // 00d5: if_icmpeq 0110
      // 00d8: iload 5
      // 00da: iload 4
      // 00dc: isub
      // 00dd: bipush 16
      // 00df: ishl
      // 00e0: iload 2
      // 00e1: iload 1
      // 00e2: isub
      // 00e3: idiv
      // 00e4: istore 25
      // 00e6: iload 18
      // 00e8: iload 15
      // 00ea: isub
      // 00eb: bipush 16
      // 00ed: ishl
      // 00ee: iload 2
      // 00ef: iload 1
      // 00f0: isub
      // 00f1: idiv
      // 00f2: istore 26
      // 00f4: iload 19
      // 00f6: iload 16
      // 00f8: isub
      // 00f9: bipush 16
      // 00fb: ishl
      // 00fc: iload 2
      // 00fd: iload 1
      // 00fe: isub
      // 00ff: idiv
      // 0100: istore 27
      // 0102: iload 20
      // 0104: iload 17
      // 0106: isub
      // 0107: bipush 16
      // 0109: ishl
      // 010a: iload 2
      // 010b: iload 1
      // 010c: isub
      // 010d: idiv
      // 010e: istore 28
      // 0110: bipush 0
      // 0111: istore 29
      // 0113: bipush 0
      // 0114: istore 30
      // 0116: bipush 0
      // 0117: istore 31
      // 0119: bipush 0
      // 011a: istore 32
      // 011c: iload 2
      // 011d: iload 0
      // 011e: if_icmpeq 0158
      // 0121: iload 3
      // 0122: iload 5
      // 0124: isub
      // 0125: bipush 16
      // 0127: ishl
      // 0128: iload 0
      // 0129: iload 2
      // 012a: isub
      // 012b: idiv
      // 012c: istore 29
      // 012e: iload 12
      // 0130: iload 18
      // 0132: isub
      // 0133: bipush 16
      // 0135: ishl
      // 0136: iload 0
      // 0137: iload 2
      // 0138: isub
      // 0139: idiv
      // 013a: istore 30
      // 013c: iload 13
      // 013e: iload 19
      // 0140: isub
      // 0141: bipush 16
      // 0143: ishl
      // 0144: iload 0
      // 0145: iload 2
      // 0146: isub
      // 0147: idiv
      // 0148: istore 31
      // 014a: iload 14
      // 014c: iload 20
      // 014e: isub
      // 014f: bipush 16
      // 0151: ishl
      // 0152: iload 0
      // 0153: iload 2
      // 0154: isub
      // 0155: idiv
      // 0156: istore 32
      // 0158: iload 0
      // 0159: iload 1
      // 015a: if_icmpgt 0677
      // 015d: iload 0
      // 015e: iload 2
      // 015f: if_icmpgt 0677
      // 0162: iload 0
      // 0163: getstatic rs/p_l/C_c.k I
      // 0166: if_icmplt 016a
      // 0169: return
      // 016a: iload 1
      // 016b: getstatic rs/p_l/C_c.k I
      // 016e: if_icmple 0175
      // 0171: getstatic rs/p_l/C_c.k I
      // 0174: istore 1
      // 0175: iload 2
      // 0176: getstatic rs/p_l/C_c.k I
      // 0179: if_icmple 0180
      // 017c: getstatic rs/p_l/C_c.k I
      // 017f: istore 2
      // 0180: iload 1
      // 0181: iload 2
      // 0182: if_icmpge 0401
      // 0185: iload 3
      // 0186: bipush 16
      // 0188: ishl
      // 0189: dup
      // 018a: istore 3
      // 018b: istore 5
      // 018d: iload 12
      // 018f: bipush 16
      // 0191: ishl
      // 0192: dup
      // 0193: istore 12
      // 0195: istore 18
      // 0197: iload 13
      // 0199: bipush 16
      // 019b: ishl
      // 019c: dup
      // 019d: istore 13
      // 019f: istore 19
      // 01a1: iload 14
      // 01a3: bipush 16
      // 01a5: ishl
      // 01a6: dup
      // 01a7: istore 14
      // 01a9: istore 20
      // 01ab: iload 0
      // 01ac: ifge 01f7
      // 01af: iload 5
      // 01b1: iload 29
      // 01b3: iload 0
      // 01b4: imul
      // 01b5: isub
      // 01b6: istore 5
      // 01b8: iload 3
      // 01b9: iload 21
      // 01bb: iload 0
      // 01bc: imul
      // 01bd: isub
      // 01be: istore 3
      // 01bf: iload 18
      // 01c1: iload 30
      // 01c3: iload 0
      // 01c4: imul
      // 01c5: isub
      // 01c6: istore 18
      // 01c8: iload 19
      // 01ca: iload 31
      // 01cc: iload 0
      // 01cd: imul
      // 01ce: isub
      // 01cf: istore 19
      // 01d1: iload 20
      // 01d3: iload 32
      // 01d5: iload 0
      // 01d6: imul
      // 01d7: isub
      // 01d8: istore 20
      // 01da: iload 12
      // 01dc: iload 22
      // 01de: iload 0
      // 01df: imul
      // 01e0: isub
      // 01e1: istore 12
      // 01e3: iload 13
      // 01e5: iload 23
      // 01e7: iload 0
      // 01e8: imul
      // 01e9: isub
      // 01ea: istore 13
      // 01ec: iload 14
      // 01ee: iload 24
      // 01f0: iload 0
      // 01f1: imul
      // 01f2: isub
      // 01f3: istore 14
      // 01f5: bipush 0
      // 01f6: istore 0
      // 01f7: iload 4
      // 01f9: bipush 16
      // 01fb: ishl
      // 01fc: istore 4
      // 01fe: iload 15
      // 0200: bipush 16
      // 0202: ishl
      // 0203: istore 15
      // 0205: iload 16
      // 0207: bipush 16
      // 0209: ishl
      // 020a: istore 16
      // 020c: iload 17
      // 020e: bipush 16
      // 0210: ishl
      // 0211: istore 17
      // 0213: iload 1
      // 0214: ifge 023d
      // 0217: iload 4
      // 0219: iload 25
      // 021b: iload 1
      // 021c: imul
      // 021d: isub
      // 021e: istore 4
      // 0220: iload 15
      // 0222: iload 26
      // 0224: iload 1
      // 0225: imul
      // 0226: isub
      // 0227: istore 15
      // 0229: iload 16
      // 022b: iload 27
      // 022d: iload 1
      // 022e: imul
      // 022f: isub
      // 0230: istore 16
      // 0232: iload 17
      // 0234: iload 28
      // 0236: iload 1
      // 0237: imul
      // 0238: isub
      // 0239: istore 17
      // 023b: bipush 0
      // 023c: istore 1
      // 023d: iload 0
      // 023e: iload 1
      // 023f: if_icmpeq 0249
      // 0242: iload 29
      // 0244: iload 21
      // 0246: if_icmplt 0255
      // 0249: iload 0
      // 024a: iload 1
      // 024b: if_icmpne 032b
      // 024e: iload 29
      // 0250: iload 25
      // 0252: if_icmple 032b
      // 0255: iload 2
      // 0256: iload 1
      // 0257: isub
      // 0258: istore 2
      // 0259: iload 1
      // 025a: iload 0
      // 025b: isub
      // 025c: istore 1
      // 025d: getstatic rs/p_l/C_E_uc.x [I
      // 0260: iload 0
      // 0261: iaload
      // 0262: istore 0
      // 0263: iinc 1 -1
      // 0266: iload 1
      // 0267: iflt 02c5
      // 026a: getstatic rs/p_l/C_c.g [I
      // 026d: iload 0
      // 026e: iload 5
      // 0270: bipush 16
      // 0272: ishr
      // 0273: iload 3
      // 0274: bipush 16
      // 0276: ishr
      // 0277: iload 18
      // 0279: iload 19
      // 027b: iload 20
      // 027d: iload 12
      // 027f: iload 13
      // 0281: iload 14
      // 0283: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0286: iload 5
      // 0288: iload 29
      // 028a: iadd
      // 028b: istore 5
      // 028d: iload 3
      // 028e: iload 21
      // 0290: iadd
      // 0291: istore 3
      // 0292: iload 18
      // 0294: iload 30
      // 0296: iadd
      // 0297: istore 18
      // 0299: iload 19
      // 029b: iload 31
      // 029d: iadd
      // 029e: istore 19
      // 02a0: iload 20
      // 02a2: iload 32
      // 02a4: iadd
      // 02a5: istore 20
      // 02a7: iload 12
      // 02a9: iload 22
      // 02ab: iadd
      // 02ac: istore 12
      // 02ae: iload 13
      // 02b0: iload 23
      // 02b2: iadd
      // 02b3: istore 13
      // 02b5: iload 14
      // 02b7: iload 24
      // 02b9: iadd
      // 02ba: istore 14
      // 02bc: iload 0
      // 02bd: getstatic rs/p_l/C_c.h I
      // 02c0: iadd
      // 02c1: istore 0
      // 02c2: goto 0263
      // 02c5: iinc 2 -1
      // 02c8: iload 2
      // 02c9: iflt 032a
      // 02cc: getstatic rs/p_l/C_c.g [I
      // 02cf: iload 0
      // 02d0: iload 5
      // 02d2: bipush 16
      // 02d4: ishr
      // 02d5: iload 4
      // 02d7: bipush 16
      // 02d9: ishr
      // 02da: iload 18
      // 02dc: iload 19
      // 02de: iload 20
      // 02e0: iload 15
      // 02e2: iload 16
      // 02e4: iload 17
      // 02e6: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 02e9: iload 5
      // 02eb: iload 29
      // 02ed: iadd
      // 02ee: istore 5
      // 02f0: iload 4
      // 02f2: iload 25
      // 02f4: iadd
      // 02f5: istore 4
      // 02f7: iload 18
      // 02f9: iload 30
      // 02fb: iadd
      // 02fc: istore 18
      // 02fe: iload 19
      // 0300: iload 31
      // 0302: iadd
      // 0303: istore 19
      // 0305: iload 20
      // 0307: iload 32
      // 0309: iadd
      // 030a: istore 20
      // 030c: iload 15
      // 030e: iload 26
      // 0310: iadd
      // 0311: istore 15
      // 0313: iload 16
      // 0315: iload 27
      // 0317: iadd
      // 0318: istore 16
      // 031a: iload 17
      // 031c: iload 28
      // 031e: iadd
      // 031f: istore 17
      // 0321: iload 0
      // 0322: getstatic rs/p_l/C_c.h I
      // 0325: iadd
      // 0326: istore 0
      // 0327: goto 02c5
      // 032a: return
      // 032b: iload 2
      // 032c: iload 1
      // 032d: isub
      // 032e: istore 2
      // 032f: iload 1
      // 0330: iload 0
      // 0331: isub
      // 0332: istore 1
      // 0333: getstatic rs/p_l/C_E_uc.x [I
      // 0336: iload 0
      // 0337: iaload
      // 0338: istore 0
      // 0339: iinc 1 -1
      // 033c: iload 1
      // 033d: iflt 039b
      // 0340: getstatic rs/p_l/C_c.g [I
      // 0343: iload 0
      // 0344: iload 3
      // 0345: bipush 16
      // 0347: ishr
      // 0348: iload 5
      // 034a: bipush 16
      // 034c: ishr
      // 034d: iload 12
      // 034f: iload 13
      // 0351: iload 14
      // 0353: iload 18
      // 0355: iload 19
      // 0357: iload 20
      // 0359: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 035c: iload 5
      // 035e: iload 29
      // 0360: iadd
      // 0361: istore 5
      // 0363: iload 3
      // 0364: iload 21
      // 0366: iadd
      // 0367: istore 3
      // 0368: iload 18
      // 036a: iload 30
      // 036c: iadd
      // 036d: istore 18
      // 036f: iload 19
      // 0371: iload 31
      // 0373: iadd
      // 0374: istore 19
      // 0376: iload 20
      // 0378: iload 32
      // 037a: iadd
      // 037b: istore 20
      // 037d: iload 12
      // 037f: iload 22
      // 0381: iadd
      // 0382: istore 12
      // 0384: iload 13
      // 0386: iload 23
      // 0388: iadd
      // 0389: istore 13
      // 038b: iload 14
      // 038d: iload 24
      // 038f: iadd
      // 0390: istore 14
      // 0392: iload 0
      // 0393: getstatic rs/p_l/C_c.h I
      // 0396: iadd
      // 0397: istore 0
      // 0398: goto 0339
      // 039b: iinc 2 -1
      // 039e: iload 2
      // 039f: iflt 0400
      // 03a2: getstatic rs/p_l/C_c.g [I
      // 03a5: iload 0
      // 03a6: iload 4
      // 03a8: bipush 16
      // 03aa: ishr
      // 03ab: iload 5
      // 03ad: bipush 16
      // 03af: ishr
      // 03b0: iload 15
      // 03b2: iload 16
      // 03b4: iload 17
      // 03b6: iload 18
      // 03b8: iload 19
      // 03ba: iload 20
      // 03bc: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 03bf: iload 5
      // 03c1: iload 29
      // 03c3: iadd
      // 03c4: istore 5
      // 03c6: iload 4
      // 03c8: iload 25
      // 03ca: iadd
      // 03cb: istore 4
      // 03cd: iload 18
      // 03cf: iload 30
      // 03d1: iadd
      // 03d2: istore 18
      // 03d4: iload 19
      // 03d6: iload 31
      // 03d8: iadd
      // 03d9: istore 19
      // 03db: iload 20
      // 03dd: iload 32
      // 03df: iadd
      // 03e0: istore 20
      // 03e2: iload 15
      // 03e4: iload 26
      // 03e6: iadd
      // 03e7: istore 15
      // 03e9: iload 16
      // 03eb: iload 27
      // 03ed: iadd
      // 03ee: istore 16
      // 03f0: iload 17
      // 03f2: iload 28
      // 03f4: iadd
      // 03f5: istore 17
      // 03f7: iload 0
      // 03f8: getstatic rs/p_l/C_c.h I
      // 03fb: iadd
      // 03fc: istore 0
      // 03fd: goto 039b
      // 0400: return
      // 0401: iload 3
      // 0402: bipush 16
      // 0404: ishl
      // 0405: dup
      // 0406: istore 3
      // 0407: istore 4
      // 0409: iload 12
      // 040b: bipush 16
      // 040d: ishl
      // 040e: dup
      // 040f: istore 12
      // 0411: istore 15
      // 0413: iload 13
      // 0415: bipush 16
      // 0417: ishl
      // 0418: dup
      // 0419: istore 13
      // 041b: istore 16
      // 041d: iload 14
      // 041f: bipush 16
      // 0421: ishl
      // 0422: dup
      // 0423: istore 14
      // 0425: istore 17
      // 0427: iload 0
      // 0428: ifge 0473
      // 042b: iload 4
      // 042d: iload 29
      // 042f: iload 0
      // 0430: imul
      // 0431: isub
      // 0432: istore 4
      // 0434: iload 3
      // 0435: iload 21
      // 0437: iload 0
      // 0438: imul
      // 0439: isub
      // 043a: istore 3
      // 043b: iload 15
      // 043d: iload 30
      // 043f: iload 0
      // 0440: imul
      // 0441: isub
      // 0442: istore 15
      // 0444: iload 16
      // 0446: iload 31
      // 0448: iload 0
      // 0449: imul
      // 044a: isub
      // 044b: istore 16
      // 044d: iload 17
      // 044f: iload 32
      // 0451: iload 0
      // 0452: imul
      // 0453: isub
      // 0454: istore 17
      // 0456: iload 12
      // 0458: iload 22
      // 045a: iload 0
      // 045b: imul
      // 045c: isub
      // 045d: istore 12
      // 045f: iload 13
      // 0461: iload 23
      // 0463: iload 0
      // 0464: imul
      // 0465: isub
      // 0466: istore 13
      // 0468: iload 14
      // 046a: iload 24
      // 046c: iload 0
      // 046d: imul
      // 046e: isub
      // 046f: istore 14
      // 0471: bipush 0
      // 0472: istore 0
      // 0473: iload 5
      // 0475: bipush 16
      // 0477: ishl
      // 0478: istore 5
      // 047a: iload 18
      // 047c: bipush 16
      // 047e: ishl
      // 047f: istore 18
      // 0481: iload 19
      // 0483: bipush 16
      // 0485: ishl
      // 0486: istore 19
      // 0488: iload 20
      // 048a: bipush 16
      // 048c: ishl
      // 048d: istore 20
      // 048f: iload 2
      // 0490: ifge 04b9
      // 0493: iload 5
      // 0495: iload 25
      // 0497: iload 2
      // 0498: imul
      // 0499: isub
      // 049a: istore 5
      // 049c: iload 18
      // 049e: iload 26
      // 04a0: iload 2
      // 04a1: imul
      // 04a2: isub
      // 04a3: istore 18
      // 04a5: iload 19
      // 04a7: iload 27
      // 04a9: iload 2
      // 04aa: imul
      // 04ab: isub
      // 04ac: istore 19
      // 04ae: iload 20
      // 04b0: iload 28
      // 04b2: iload 2
      // 04b3: imul
      // 04b4: isub
      // 04b5: istore 20
      // 04b7: bipush 0
      // 04b8: istore 2
      // 04b9: iload 0
      // 04ba: iload 2
      // 04bb: if_icmpeq 04c5
      // 04be: iload 29
      // 04c0: iload 21
      // 04c2: if_icmplt 04d1
      // 04c5: iload 0
      // 04c6: iload 2
      // 04c7: if_icmpne 05a4
      // 04ca: iload 25
      // 04cc: iload 21
      // 04ce: if_icmple 05a4
      // 04d1: iload 1
      // 04d2: iload 2
      // 04d3: isub
      // 04d4: istore 1
      // 04d5: iload 2
      // 04d6: iload 0
      // 04d7: isub
      // 04d8: istore 2
      // 04d9: getstatic rs/p_l/C_E_uc.x [I
      // 04dc: iload 0
      // 04dd: iaload
      // 04de: istore 0
      // 04df: iinc 2 -1
      // 04e2: iload 2
      // 04e3: iflt 0541
      // 04e6: getstatic rs/p_l/C_c.g [I
      // 04e9: iload 0
      // 04ea: iload 4
      // 04ec: bipush 16
      // 04ee: ishr
      // 04ef: iload 3
      // 04f0: bipush 16
      // 04f2: ishr
      // 04f3: iload 15
      // 04f5: iload 16
      // 04f7: iload 17
      // 04f9: iload 12
      // 04fb: iload 13
      // 04fd: iload 14
      // 04ff: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0502: iload 4
      // 0504: iload 29
      // 0506: iadd
      // 0507: istore 4
      // 0509: iload 3
      // 050a: iload 21
      // 050c: iadd
      // 050d: istore 3
      // 050e: iload 15
      // 0510: iload 30
      // 0512: iadd
      // 0513: istore 15
      // 0515: iload 16
      // 0517: iload 31
      // 0519: iadd
      // 051a: istore 16
      // 051c: iload 17
      // 051e: iload 32
      // 0520: iadd
      // 0521: istore 17
      // 0523: iload 12
      // 0525: iload 22
      // 0527: iadd
      // 0528: istore 12
      // 052a: iload 13
      // 052c: iload 23
      // 052e: iadd
      // 052f: istore 13
      // 0531: iload 14
      // 0533: iload 24
      // 0535: iadd
      // 0536: istore 14
      // 0538: iload 0
      // 0539: getstatic rs/p_l/C_c.h I
      // 053c: iadd
      // 053d: istore 0
      // 053e: goto 04df
      // 0541: iinc 1 -1
      // 0544: iload 1
      // 0545: iflt 05a3
      // 0548: getstatic rs/p_l/C_c.g [I
      // 054b: iload 0
      // 054c: iload 5
      // 054e: bipush 16
      // 0550: ishr
      // 0551: iload 3
      // 0552: bipush 16
      // 0554: ishr
      // 0555: iload 18
      // 0557: iload 19
      // 0559: iload 20
      // 055b: iload 12
      // 055d: iload 13
      // 055f: iload 14
      // 0561: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0564: iload 5
      // 0566: iload 25
      // 0568: iadd
      // 0569: istore 5
      // 056b: iload 3
      // 056c: iload 21
      // 056e: iadd
      // 056f: istore 3
      // 0570: iload 18
      // 0572: iload 26
      // 0574: iadd
      // 0575: istore 18
      // 0577: iload 19
      // 0579: iload 27
      // 057b: iadd
      // 057c: istore 19
      // 057e: iload 20
      // 0580: iload 28
      // 0582: iadd
      // 0583: istore 20
      // 0585: iload 12
      // 0587: iload 22
      // 0589: iadd
      // 058a: istore 12
      // 058c: iload 13
      // 058e: iload 23
      // 0590: iadd
      // 0591: istore 13
      // 0593: iload 14
      // 0595: iload 24
      // 0597: iadd
      // 0598: istore 14
      // 059a: iload 0
      // 059b: getstatic rs/p_l/C_c.h I
      // 059e: iadd
      // 059f: istore 0
      // 05a0: goto 0541
      // 05a3: return
      // 05a4: iload 1
      // 05a5: iload 2
      // 05a6: isub
      // 05a7: istore 1
      // 05a8: iload 2
      // 05a9: iload 0
      // 05aa: isub
      // 05ab: istore 2
      // 05ac: getstatic rs/p_l/C_E_uc.x [I
      // 05af: iload 0
      // 05b0: iaload
      // 05b1: istore 0
      // 05b2: iinc 2 -1
      // 05b5: iload 2
      // 05b6: iflt 0614
      // 05b9: getstatic rs/p_l/C_c.g [I
      // 05bc: iload 0
      // 05bd: iload 3
      // 05be: bipush 16
      // 05c0: ishr
      // 05c1: iload 4
      // 05c3: bipush 16
      // 05c5: ishr
      // 05c6: iload 12
      // 05c8: iload 13
      // 05ca: iload 14
      // 05cc: iload 15
      // 05ce: iload 16
      // 05d0: iload 17
      // 05d2: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 05d5: iload 4
      // 05d7: iload 29
      // 05d9: iadd
      // 05da: istore 4
      // 05dc: iload 3
      // 05dd: iload 21
      // 05df: iadd
      // 05e0: istore 3
      // 05e1: iload 15
      // 05e3: iload 30
      // 05e5: iadd
      // 05e6: istore 15
      // 05e8: iload 16
      // 05ea: iload 31
      // 05ec: iadd
      // 05ed: istore 16
      // 05ef: iload 17
      // 05f1: iload 32
      // 05f3: iadd
      // 05f4: istore 17
      // 05f6: iload 12
      // 05f8: iload 22
      // 05fa: iadd
      // 05fb: istore 12
      // 05fd: iload 13
      // 05ff: iload 23
      // 0601: iadd
      // 0602: istore 13
      // 0604: iload 14
      // 0606: iload 24
      // 0608: iadd
      // 0609: istore 14
      // 060b: iload 0
      // 060c: getstatic rs/p_l/C_c.h I
      // 060f: iadd
      // 0610: istore 0
      // 0611: goto 05b2
      // 0614: iinc 1 -1
      // 0617: iload 1
      // 0618: iflt 0676
      // 061b: getstatic rs/p_l/C_c.g [I
      // 061e: iload 0
      // 061f: iload 3
      // 0620: bipush 16
      // 0622: ishr
      // 0623: iload 5
      // 0625: bipush 16
      // 0627: ishr
      // 0628: iload 12
      // 062a: iload 13
      // 062c: iload 14
      // 062e: iload 18
      // 0630: iload 19
      // 0632: iload 20
      // 0634: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0637: iload 5
      // 0639: iload 25
      // 063b: iadd
      // 063c: istore 5
      // 063e: iload 3
      // 063f: iload 21
      // 0641: iadd
      // 0642: istore 3
      // 0643: iload 18
      // 0645: iload 26
      // 0647: iadd
      // 0648: istore 18
      // 064a: iload 19
      // 064c: iload 27
      // 064e: iadd
      // 064f: istore 19
      // 0651: iload 20
      // 0653: iload 28
      // 0655: iadd
      // 0656: istore 20
      // 0658: iload 12
      // 065a: iload 22
      // 065c: iadd
      // 065d: istore 12
      // 065f: iload 13
      // 0661: iload 23
      // 0663: iadd
      // 0664: istore 13
      // 0666: iload 14
      // 0668: iload 24
      // 066a: iadd
      // 066b: istore 14
      // 066d: iload 0
      // 066e: getstatic rs/p_l/C_c.h I
      // 0671: iadd
      // 0672: istore 0
      // 0673: goto 0614
      // 0676: return
      // 0677: iload 1
      // 0678: iload 2
      // 0679: if_icmpgt 0b81
      // 067c: iload 1
      // 067d: getstatic rs/p_l/C_c.k I
      // 0680: if_icmplt 0684
      // 0683: return
      // 0684: iload 2
      // 0685: getstatic rs/p_l/C_c.k I
      // 0688: if_icmple 068f
      // 068b: getstatic rs/p_l/C_c.k I
      // 068e: istore 2
      // 068f: iload 0
      // 0690: getstatic rs/p_l/C_c.k I
      // 0693: if_icmple 069a
      // 0696: getstatic rs/p_l/C_c.k I
      // 0699: istore 0
      // 069a: iload 2
      // 069b: iload 0
      // 069c: if_icmpge 0916
      // 069f: iload 4
      // 06a1: bipush 16
      // 06a3: ishl
      // 06a4: dup
      // 06a5: istore 4
      // 06a7: istore 3
      // 06a8: iload 15
      // 06aa: bipush 16
      // 06ac: ishl
      // 06ad: dup
      // 06ae: istore 15
      // 06b0: istore 12
      // 06b2: iload 16
      // 06b4: bipush 16
      // 06b6: ishl
      // 06b7: dup
      // 06b8: istore 16
      // 06ba: istore 13
      // 06bc: iload 17
      // 06be: bipush 16
      // 06c0: ishl
      // 06c1: dup
      // 06c2: istore 17
      // 06c4: istore 14
      // 06c6: iload 1
      // 06c7: ifge 0712
      // 06ca: iload 3
      // 06cb: iload 21
      // 06cd: iload 1
      // 06ce: imul
      // 06cf: isub
      // 06d0: istore 3
      // 06d1: iload 4
      // 06d3: iload 25
      // 06d5: iload 1
      // 06d6: imul
      // 06d7: isub
      // 06d8: istore 4
      // 06da: iload 12
      // 06dc: iload 22
      // 06de: iload 1
      // 06df: imul
      // 06e0: isub
      // 06e1: istore 12
      // 06e3: iload 13
      // 06e5: iload 23
      // 06e7: iload 1
      // 06e8: imul
      // 06e9: isub
      // 06ea: istore 13
      // 06ec: iload 14
      // 06ee: iload 24
      // 06f0: iload 1
      // 06f1: imul
      // 06f2: isub
      // 06f3: istore 14
      // 06f5: iload 15
      // 06f7: iload 26
      // 06f9: iload 1
      // 06fa: imul
      // 06fb: isub
      // 06fc: istore 15
      // 06fe: iload 16
      // 0700: iload 27
      // 0702: iload 1
      // 0703: imul
      // 0704: isub
      // 0705: istore 16
      // 0707: iload 17
      // 0709: iload 28
      // 070b: iload 1
      // 070c: imul
      // 070d: isub
      // 070e: istore 17
      // 0710: bipush 0
      // 0711: istore 1
      // 0712: iload 5
      // 0714: bipush 16
      // 0716: ishl
      // 0717: istore 5
      // 0719: iload 18
      // 071b: bipush 16
      // 071d: ishl
      // 071e: istore 18
      // 0720: iload 19
      // 0722: bipush 16
      // 0724: ishl
      // 0725: istore 19
      // 0727: iload 20
      // 0729: bipush 16
      // 072b: ishl
      // 072c: istore 20
      // 072e: iload 2
      // 072f: ifge 0758
      // 0732: iload 5
      // 0734: iload 29
      // 0736: iload 2
      // 0737: imul
      // 0738: isub
      // 0739: istore 5
      // 073b: iload 18
      // 073d: iload 30
      // 073f: iload 2
      // 0740: imul
      // 0741: isub
      // 0742: istore 18
      // 0744: iload 19
      // 0746: iload 31
      // 0748: iload 2
      // 0749: imul
      // 074a: isub
      // 074b: istore 19
      // 074d: iload 20
      // 074f: iload 32
      // 0751: iload 2
      // 0752: imul
      // 0753: isub
      // 0754: istore 20
      // 0756: bipush 0
      // 0757: istore 2
      // 0758: iload 1
      // 0759: iload 2
      // 075a: if_icmpeq 0764
      // 075d: iload 21
      // 075f: iload 25
      // 0761: if_icmplt 0770
      // 0764: iload 1
      // 0765: iload 2
      // 0766: if_icmpne 0843
      // 0769: iload 21
      // 076b: iload 29
      // 076d: if_icmple 0843
      // 0770: iload 0
      // 0771: iload 2
      // 0772: isub
      // 0773: istore 0
      // 0774: iload 2
      // 0775: iload 1
      // 0776: isub
      // 0777: istore 2
      // 0778: getstatic rs/p_l/C_E_uc.x [I
      // 077b: iload 1
      // 077c: iaload
      // 077d: istore 1
      // 077e: iinc 2 -1
      // 0781: iload 2
      // 0782: iflt 07e0
      // 0785: getstatic rs/p_l/C_c.g [I
      // 0788: iload 1
      // 0789: iload 3
      // 078a: bipush 16
      // 078c: ishr
      // 078d: iload 4
      // 078f: bipush 16
      // 0791: ishr
      // 0792: iload 12
      // 0794: iload 13
      // 0796: iload 14
      // 0798: iload 15
      // 079a: iload 16
      // 079c: iload 17
      // 079e: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 07a1: iload 3
      // 07a2: iload 21
      // 07a4: iadd
      // 07a5: istore 3
      // 07a6: iload 4
      // 07a8: iload 25
      // 07aa: iadd
      // 07ab: istore 4
      // 07ad: iload 12
      // 07af: iload 22
      // 07b1: iadd
      // 07b2: istore 12
      // 07b4: iload 13
      // 07b6: iload 23
      // 07b8: iadd
      // 07b9: istore 13
      // 07bb: iload 14
      // 07bd: iload 24
      // 07bf: iadd
      // 07c0: istore 14
      // 07c2: iload 15
      // 07c4: iload 26
      // 07c6: iadd
      // 07c7: istore 15
      // 07c9: iload 16
      // 07cb: iload 27
      // 07cd: iadd
      // 07ce: istore 16
      // 07d0: iload 17
      // 07d2: iload 28
      // 07d4: iadd
      // 07d5: istore 17
      // 07d7: iload 1
      // 07d8: getstatic rs/p_l/C_c.h I
      // 07db: iadd
      // 07dc: istore 1
      // 07dd: goto 077e
      // 07e0: iinc 0 -1
      // 07e3: iload 0
      // 07e4: iflt 0842
      // 07e7: getstatic rs/p_l/C_c.g [I
      // 07ea: iload 1
      // 07eb: iload 3
      // 07ec: bipush 16
      // 07ee: ishr
      // 07ef: iload 5
      // 07f1: bipush 16
      // 07f3: ishr
      // 07f4: iload 12
      // 07f6: iload 13
      // 07f8: iload 14
      // 07fa: iload 18
      // 07fc: iload 19
      // 07fe: iload 20
      // 0800: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0803: iload 3
      // 0804: iload 21
      // 0806: iadd
      // 0807: istore 3
      // 0808: iload 5
      // 080a: iload 29
      // 080c: iadd
      // 080d: istore 5
      // 080f: iload 12
      // 0811: iload 22
      // 0813: iadd
      // 0814: istore 12
      // 0816: iload 13
      // 0818: iload 23
      // 081a: iadd
      // 081b: istore 13
      // 081d: iload 14
      // 081f: iload 24
      // 0821: iadd
      // 0822: istore 14
      // 0824: iload 18
      // 0826: iload 30
      // 0828: iadd
      // 0829: istore 18
      // 082b: iload 19
      // 082d: iload 31
      // 082f: iadd
      // 0830: istore 19
      // 0832: iload 20
      // 0834: iload 32
      // 0836: iadd
      // 0837: istore 20
      // 0839: iload 1
      // 083a: getstatic rs/p_l/C_c.h I
      // 083d: iadd
      // 083e: istore 1
      // 083f: goto 07e0
      // 0842: return
      // 0843: iload 0
      // 0844: iload 2
      // 0845: isub
      // 0846: istore 0
      // 0847: iload 2
      // 0848: iload 1
      // 0849: isub
      // 084a: istore 2
      // 084b: getstatic rs/p_l/C_E_uc.x [I
      // 084e: iload 1
      // 084f: iaload
      // 0850: istore 1
      // 0851: iinc 2 -1
      // 0854: iload 2
      // 0855: iflt 08b3
      // 0858: getstatic rs/p_l/C_c.g [I
      // 085b: iload 1
      // 085c: iload 4
      // 085e: bipush 16
      // 0860: ishr
      // 0861: iload 3
      // 0862: bipush 16
      // 0864: ishr
      // 0865: iload 15
      // 0867: iload 16
      // 0869: iload 17
      // 086b: iload 12
      // 086d: iload 13
      // 086f: iload 14
      // 0871: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0874: iload 3
      // 0875: iload 21
      // 0877: iadd
      // 0878: istore 3
      // 0879: iload 4
      // 087b: iload 25
      // 087d: iadd
      // 087e: istore 4
      // 0880: iload 12
      // 0882: iload 22
      // 0884: iadd
      // 0885: istore 12
      // 0887: iload 13
      // 0889: iload 23
      // 088b: iadd
      // 088c: istore 13
      // 088e: iload 14
      // 0890: iload 24
      // 0892: iadd
      // 0893: istore 14
      // 0895: iload 15
      // 0897: iload 26
      // 0899: iadd
      // 089a: istore 15
      // 089c: iload 16
      // 089e: iload 27
      // 08a0: iadd
      // 08a1: istore 16
      // 08a3: iload 17
      // 08a5: iload 28
      // 08a7: iadd
      // 08a8: istore 17
      // 08aa: iload 1
      // 08ab: getstatic rs/p_l/C_c.h I
      // 08ae: iadd
      // 08af: istore 1
      // 08b0: goto 0851
      // 08b3: iinc 0 -1
      // 08b6: iload 0
      // 08b7: iflt 0915
      // 08ba: getstatic rs/p_l/C_c.g [I
      // 08bd: iload 1
      // 08be: iload 5
      // 08c0: bipush 16
      // 08c2: ishr
      // 08c3: iload 3
      // 08c4: bipush 16
      // 08c6: ishr
      // 08c7: iload 18
      // 08c9: iload 19
      // 08cb: iload 20
      // 08cd: iload 12
      // 08cf: iload 13
      // 08d1: iload 14
      // 08d3: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 08d6: iload 3
      // 08d7: iload 21
      // 08d9: iadd
      // 08da: istore 3
      // 08db: iload 5
      // 08dd: iload 29
      // 08df: iadd
      // 08e0: istore 5
      // 08e2: iload 12
      // 08e4: iload 22
      // 08e6: iadd
      // 08e7: istore 12
      // 08e9: iload 13
      // 08eb: iload 23
      // 08ed: iadd
      // 08ee: istore 13
      // 08f0: iload 14
      // 08f2: iload 24
      // 08f4: iadd
      // 08f5: istore 14
      // 08f7: iload 18
      // 08f9: iload 30
      // 08fb: iadd
      // 08fc: istore 18
      // 08fe: iload 19
      // 0900: iload 31
      // 0902: iadd
      // 0903: istore 19
      // 0905: iload 20
      // 0907: iload 32
      // 0909: iadd
      // 090a: istore 20
      // 090c: iload 1
      // 090d: getstatic rs/p_l/C_c.h I
      // 0910: iadd
      // 0911: istore 1
      // 0912: goto 08b3
      // 0915: return
      // 0916: iload 4
      // 0918: bipush 16
      // 091a: ishl
      // 091b: dup
      // 091c: istore 4
      // 091e: istore 5
      // 0920: iload 15
      // 0922: bipush 16
      // 0924: ishl
      // 0925: dup
      // 0926: istore 15
      // 0928: istore 18
      // 092a: iload 16
      // 092c: bipush 16
      // 092e: ishl
      // 092f: dup
      // 0930: istore 16
      // 0932: istore 19
      // 0934: iload 17
      // 0936: bipush 16
      // 0938: ishl
      // 0939: dup
      // 093a: istore 17
      // 093c: istore 20
      // 093e: iload 1
      // 093f: ifge 098c
      // 0942: iload 5
      // 0944: iload 21
      // 0946: iload 1
      // 0947: imul
      // 0948: isub
      // 0949: istore 5
      // 094b: iload 4
      // 094d: iload 25
      // 094f: iload 1
      // 0950: imul
      // 0951: isub
      // 0952: istore 4
      // 0954: iload 18
      // 0956: iload 22
      // 0958: iload 1
      // 0959: imul
      // 095a: isub
      // 095b: istore 18
      // 095d: iload 19
      // 095f: iload 23
      // 0961: iload 1
      // 0962: imul
      // 0963: isub
      // 0964: istore 19
      // 0966: iload 20
      // 0968: iload 24
      // 096a: iload 1
      // 096b: imul
      // 096c: isub
      // 096d: istore 20
      // 096f: iload 15
      // 0971: iload 26
      // 0973: iload 1
      // 0974: imul
      // 0975: isub
      // 0976: istore 15
      // 0978: iload 16
      // 097a: iload 27
      // 097c: iload 1
      // 097d: imul
      // 097e: isub
      // 097f: istore 16
      // 0981: iload 17
      // 0983: iload 28
      // 0985: iload 1
      // 0986: imul
      // 0987: isub
      // 0988: istore 17
      // 098a: bipush 0
      // 098b: istore 1
      // 098c: iload 3
      // 098d: bipush 16
      // 098f: ishl
      // 0990: istore 3
      // 0991: iload 12
      // 0993: bipush 16
      // 0995: ishl
      // 0996: istore 12
      // 0998: iload 13
      // 099a: bipush 16
      // 099c: ishl
      // 099d: istore 13
      // 099f: iload 14
      // 09a1: bipush 16
      // 09a3: ishl
      // 09a4: istore 14
      // 09a6: iload 0
      // 09a7: ifge 09ce
      // 09aa: iload 3
      // 09ab: iload 29
      // 09ad: iload 0
      // 09ae: imul
      // 09af: isub
      // 09b0: istore 3
      // 09b1: iload 12
      // 09b3: iload 30
      // 09b5: iload 0
      // 09b6: imul
      // 09b7: isub
      // 09b8: istore 12
      // 09ba: iload 13
      // 09bc: iload 31
      // 09be: iload 0
      // 09bf: imul
      // 09c0: isub
      // 09c1: istore 13
      // 09c3: iload 14
      // 09c5: iload 32
      // 09c7: iload 0
      // 09c8: imul
      // 09c9: isub
      // 09ca: istore 14
      // 09cc: bipush 0
      // 09cd: istore 0
      // 09ce: iload 21
      // 09d0: iload 25
      // 09d2: if_icmpge 0aab
      // 09d5: iload 2
      // 09d6: iload 0
      // 09d7: isub
      // 09d8: istore 2
      // 09d9: iload 0
      // 09da: iload 1
      // 09db: isub
      // 09dc: istore 0
      // 09dd: getstatic rs/p_l/C_E_uc.x [I
      // 09e0: iload 1
      // 09e1: iaload
      // 09e2: istore 1
      // 09e3: iinc 0 -1
      // 09e6: iload 0
      // 09e7: iflt 0a48
      // 09ea: getstatic rs/p_l/C_c.g [I
      // 09ed: iload 1
      // 09ee: iload 5
      // 09f0: bipush 16
      // 09f2: ishr
      // 09f3: iload 4
      // 09f5: bipush 16
      // 09f7: ishr
      // 09f8: iload 18
      // 09fa: iload 19
      // 09fc: iload 20
      // 09fe: iload 15
      // 0a00: iload 16
      // 0a02: iload 17
      // 0a04: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0a07: iload 5
      // 0a09: iload 21
      // 0a0b: iadd
      // 0a0c: istore 5
      // 0a0e: iload 4
      // 0a10: iload 25
      // 0a12: iadd
      // 0a13: istore 4
      // 0a15: iload 18
      // 0a17: iload 22
      // 0a19: iadd
      // 0a1a: istore 18
      // 0a1c: iload 19
      // 0a1e: iload 23
      // 0a20: iadd
      // 0a21: istore 19
      // 0a23: iload 20
      // 0a25: iload 24
      // 0a27: iadd
      // 0a28: istore 20
      // 0a2a: iload 15
      // 0a2c: iload 26
      // 0a2e: iadd
      // 0a2f: istore 15
      // 0a31: iload 16
      // 0a33: iload 27
      // 0a35: iadd
      // 0a36: istore 16
      // 0a38: iload 17
      // 0a3a: iload 28
      // 0a3c: iadd
      // 0a3d: istore 17
      // 0a3f: iload 1
      // 0a40: getstatic rs/p_l/C_c.h I
      // 0a43: iadd
      // 0a44: istore 1
      // 0a45: goto 09e3
      // 0a48: iinc 2 -1
      // 0a4b: iload 2
      // 0a4c: iflt 0aaa
      // 0a4f: getstatic rs/p_l/C_c.g [I
      // 0a52: iload 1
      // 0a53: iload 3
      // 0a54: bipush 16
      // 0a56: ishr
      // 0a57: iload 4
      // 0a59: bipush 16
      // 0a5b: ishr
      // 0a5c: iload 12
      // 0a5e: iload 13
      // 0a60: iload 14
      // 0a62: iload 15
      // 0a64: iload 16
      // 0a66: iload 17
      // 0a68: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0a6b: iload 3
      // 0a6c: iload 29
      // 0a6e: iadd
      // 0a6f: istore 3
      // 0a70: iload 4
      // 0a72: iload 25
      // 0a74: iadd
      // 0a75: istore 4
      // 0a77: iload 12
      // 0a79: iload 30
      // 0a7b: iadd
      // 0a7c: istore 12
      // 0a7e: iload 13
      // 0a80: iload 31
      // 0a82: iadd
      // 0a83: istore 13
      // 0a85: iload 14
      // 0a87: iload 32
      // 0a89: iadd
      // 0a8a: istore 14
      // 0a8c: iload 15
      // 0a8e: iload 26
      // 0a90: iadd
      // 0a91: istore 15
      // 0a93: iload 16
      // 0a95: iload 27
      // 0a97: iadd
      // 0a98: istore 16
      // 0a9a: iload 17
      // 0a9c: iload 28
      // 0a9e: iadd
      // 0a9f: istore 17
      // 0aa1: iload 1
      // 0aa2: getstatic rs/p_l/C_c.h I
      // 0aa5: iadd
      // 0aa6: istore 1
      // 0aa7: goto 0a48
      // 0aaa: return
      // 0aab: iload 2
      // 0aac: iload 0
      // 0aad: isub
      // 0aae: istore 2
      // 0aaf: iload 0
      // 0ab0: iload 1
      // 0ab1: isub
      // 0ab2: istore 0
      // 0ab3: getstatic rs/p_l/C_E_uc.x [I
      // 0ab6: iload 1
      // 0ab7: iaload
      // 0ab8: istore 1
      // 0ab9: iinc 0 -1
      // 0abc: iload 0
      // 0abd: iflt 0b1e
      // 0ac0: getstatic rs/p_l/C_c.g [I
      // 0ac3: iload 1
      // 0ac4: iload 4
      // 0ac6: bipush 16
      // 0ac8: ishr
      // 0ac9: iload 5
      // 0acb: bipush 16
      // 0acd: ishr
      // 0ace: iload 15
      // 0ad0: iload 16
      // 0ad2: iload 17
      // 0ad4: iload 18
      // 0ad6: iload 19
      // 0ad8: iload 20
      // 0ada: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0add: iload 5
      // 0adf: iload 21
      // 0ae1: iadd
      // 0ae2: istore 5
      // 0ae4: iload 4
      // 0ae6: iload 25
      // 0ae8: iadd
      // 0ae9: istore 4
      // 0aeb: iload 18
      // 0aed: iload 22
      // 0aef: iadd
      // 0af0: istore 18
      // 0af2: iload 19
      // 0af4: iload 23
      // 0af6: iadd
      // 0af7: istore 19
      // 0af9: iload 20
      // 0afb: iload 24
      // 0afd: iadd
      // 0afe: istore 20
      // 0b00: iload 15
      // 0b02: iload 26
      // 0b04: iadd
      // 0b05: istore 15
      // 0b07: iload 16
      // 0b09: iload 27
      // 0b0b: iadd
      // 0b0c: istore 16
      // 0b0e: iload 17
      // 0b10: iload 28
      // 0b12: iadd
      // 0b13: istore 17
      // 0b15: iload 1
      // 0b16: getstatic rs/p_l/C_c.h I
      // 0b19: iadd
      // 0b1a: istore 1
      // 0b1b: goto 0ab9
      // 0b1e: iinc 2 -1
      // 0b21: iload 2
      // 0b22: iflt 0b80
      // 0b25: getstatic rs/p_l/C_c.g [I
      // 0b28: iload 1
      // 0b29: iload 4
      // 0b2b: bipush 16
      // 0b2d: ishr
      // 0b2e: iload 3
      // 0b2f: bipush 16
      // 0b31: ishr
      // 0b32: iload 15
      // 0b34: iload 16
      // 0b36: iload 17
      // 0b38: iload 12
      // 0b3a: iload 13
      // 0b3c: iload 14
      // 0b3e: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0b41: iload 3
      // 0b42: iload 29
      // 0b44: iadd
      // 0b45: istore 3
      // 0b46: iload 4
      // 0b48: iload 25
      // 0b4a: iadd
      // 0b4b: istore 4
      // 0b4d: iload 12
      // 0b4f: iload 30
      // 0b51: iadd
      // 0b52: istore 12
      // 0b54: iload 13
      // 0b56: iload 31
      // 0b58: iadd
      // 0b59: istore 13
      // 0b5b: iload 14
      // 0b5d: iload 32
      // 0b5f: iadd
      // 0b60: istore 14
      // 0b62: iload 15
      // 0b64: iload 26
      // 0b66: iadd
      // 0b67: istore 15
      // 0b69: iload 16
      // 0b6b: iload 27
      // 0b6d: iadd
      // 0b6e: istore 16
      // 0b70: iload 17
      // 0b72: iload 28
      // 0b74: iadd
      // 0b75: istore 17
      // 0b77: iload 1
      // 0b78: getstatic rs/p_l/C_c.h I
      // 0b7b: iadd
      // 0b7c: istore 1
      // 0b7d: goto 0b1e
      // 0b80: return
      // 0b81: iload 2
      // 0b82: getstatic rs/p_l/C_c.k I
      // 0b85: if_icmplt 0b89
      // 0b88: return
      // 0b89: iload 0
      // 0b8a: getstatic rs/p_l/C_c.k I
      // 0b8d: if_icmple 0b94
      // 0b90: getstatic rs/p_l/C_c.k I
      // 0b93: istore 0
      // 0b94: iload 1
      // 0b95: getstatic rs/p_l/C_c.k I
      // 0b98: if_icmple 0b9f
      // 0b9b: getstatic rs/p_l/C_c.k I
      // 0b9e: istore 1
      // 0b9f: iload 0
      // 0ba0: iload 1
      // 0ba1: if_icmpge 0e0f
      // 0ba4: iload 5
      // 0ba6: bipush 16
      // 0ba8: ishl
      // 0ba9: dup
      // 0baa: istore 5
      // 0bac: istore 4
      // 0bae: iload 18
      // 0bb0: bipush 16
      // 0bb2: ishl
      // 0bb3: dup
      // 0bb4: istore 18
      // 0bb6: istore 15
      // 0bb8: iload 19
      // 0bba: bipush 16
      // 0bbc: ishl
      // 0bbd: dup
      // 0bbe: istore 19
      // 0bc0: istore 16
      // 0bc2: iload 20
      // 0bc4: bipush 16
      // 0bc6: ishl
      // 0bc7: dup
      // 0bc8: istore 20
      // 0bca: istore 17
      // 0bcc: iload 2
      // 0bcd: ifge 0c1a
      // 0bd0: iload 4
      // 0bd2: iload 25
      // 0bd4: iload 2
      // 0bd5: imul
      // 0bd6: isub
      // 0bd7: istore 4
      // 0bd9: iload 5
      // 0bdb: iload 29
      // 0bdd: iload 2
      // 0bde: imul
      // 0bdf: isub
      // 0be0: istore 5
      // 0be2: iload 15
      // 0be4: iload 26
      // 0be6: iload 2
      // 0be7: imul
      // 0be8: isub
      // 0be9: istore 15
      // 0beb: iload 16
      // 0bed: iload 27
      // 0bef: iload 2
      // 0bf0: imul
      // 0bf1: isub
      // 0bf2: istore 16
      // 0bf4: iload 17
      // 0bf6: iload 28
      // 0bf8: iload 2
      // 0bf9: imul
      // 0bfa: isub
      // 0bfb: istore 17
      // 0bfd: iload 18
      // 0bff: iload 30
      // 0c01: iload 2
      // 0c02: imul
      // 0c03: isub
      // 0c04: istore 18
      // 0c06: iload 19
      // 0c08: iload 31
      // 0c0a: iload 2
      // 0c0b: imul
      // 0c0c: isub
      // 0c0d: istore 19
      // 0c0f: iload 20
      // 0c11: iload 32
      // 0c13: iload 2
      // 0c14: imul
      // 0c15: isub
      // 0c16: istore 20
      // 0c18: bipush 0
      // 0c19: istore 2
      // 0c1a: iload 3
      // 0c1b: bipush 16
      // 0c1d: ishl
      // 0c1e: istore 3
      // 0c1f: iload 12
      // 0c21: bipush 16
      // 0c23: ishl
      // 0c24: istore 12
      // 0c26: iload 13
      // 0c28: bipush 16
      // 0c2a: ishl
      // 0c2b: istore 13
      // 0c2d: iload 14
      // 0c2f: bipush 16
      // 0c31: ishl
      // 0c32: istore 14
      // 0c34: iload 0
      // 0c35: ifge 0c5c
      // 0c38: iload 3
      // 0c39: iload 21
      // 0c3b: iload 0
      // 0c3c: imul
      // 0c3d: isub
      // 0c3e: istore 3
      // 0c3f: iload 12
      // 0c41: iload 22
      // 0c43: iload 0
      // 0c44: imul
      // 0c45: isub
      // 0c46: istore 12
      // 0c48: iload 13
      // 0c4a: iload 23
      // 0c4c: iload 0
      // 0c4d: imul
      // 0c4e: isub
      // 0c4f: istore 13
      // 0c51: iload 14
      // 0c53: iload 24
      // 0c55: iload 0
      // 0c56: imul
      // 0c57: isub
      // 0c58: istore 14
      // 0c5a: bipush 0
      // 0c5b: istore 0
      // 0c5c: iload 25
      // 0c5e: iload 29
      // 0c60: if_icmpge 0d39
      // 0c63: iload 1
      // 0c64: iload 0
      // 0c65: isub
      // 0c66: istore 1
      // 0c67: iload 0
      // 0c68: iload 2
      // 0c69: isub
      // 0c6a: istore 0
      // 0c6b: getstatic rs/p_l/C_E_uc.x [I
      // 0c6e: iload 2
      // 0c6f: iaload
      // 0c70: istore 2
      // 0c71: iinc 0 -1
      // 0c74: iload 0
      // 0c75: iflt 0cd6
      // 0c78: getstatic rs/p_l/C_c.g [I
      // 0c7b: iload 2
      // 0c7c: iload 4
      // 0c7e: bipush 16
      // 0c80: ishr
      // 0c81: iload 5
      // 0c83: bipush 16
      // 0c85: ishr
      // 0c86: iload 15
      // 0c88: iload 16
      // 0c8a: iload 17
      // 0c8c: iload 18
      // 0c8e: iload 19
      // 0c90: iload 20
      // 0c92: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0c95: iload 4
      // 0c97: iload 25
      // 0c99: iadd
      // 0c9a: istore 4
      // 0c9c: iload 5
      // 0c9e: iload 29
      // 0ca0: iadd
      // 0ca1: istore 5
      // 0ca3: iload 15
      // 0ca5: iload 26
      // 0ca7: iadd
      // 0ca8: istore 15
      // 0caa: iload 16
      // 0cac: iload 27
      // 0cae: iadd
      // 0caf: istore 16
      // 0cb1: iload 17
      // 0cb3: iload 28
      // 0cb5: iadd
      // 0cb6: istore 17
      // 0cb8: iload 18
      // 0cba: iload 30
      // 0cbc: iadd
      // 0cbd: istore 18
      // 0cbf: iload 19
      // 0cc1: iload 31
      // 0cc3: iadd
      // 0cc4: istore 19
      // 0cc6: iload 20
      // 0cc8: iload 32
      // 0cca: iadd
      // 0ccb: istore 20
      // 0ccd: iload 2
      // 0cce: getstatic rs/p_l/C_c.h I
      // 0cd1: iadd
      // 0cd2: istore 2
      // 0cd3: goto 0c71
      // 0cd6: iinc 1 -1
      // 0cd9: iload 1
      // 0cda: iflt 0d38
      // 0cdd: getstatic rs/p_l/C_c.g [I
      // 0ce0: iload 2
      // 0ce1: iload 4
      // 0ce3: bipush 16
      // 0ce5: ishr
      // 0ce6: iload 3
      // 0ce7: bipush 16
      // 0ce9: ishr
      // 0cea: iload 15
      // 0cec: iload 16
      // 0cee: iload 17
      // 0cf0: iload 12
      // 0cf2: iload 13
      // 0cf4: iload 14
      // 0cf6: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0cf9: iload 4
      // 0cfb: iload 25
      // 0cfd: iadd
      // 0cfe: istore 4
      // 0d00: iload 3
      // 0d01: iload 21
      // 0d03: iadd
      // 0d04: istore 3
      // 0d05: iload 15
      // 0d07: iload 26
      // 0d09: iadd
      // 0d0a: istore 15
      // 0d0c: iload 16
      // 0d0e: iload 27
      // 0d10: iadd
      // 0d11: istore 16
      // 0d13: iload 17
      // 0d15: iload 28
      // 0d17: iadd
      // 0d18: istore 17
      // 0d1a: iload 12
      // 0d1c: iload 22
      // 0d1e: iadd
      // 0d1f: istore 12
      // 0d21: iload 13
      // 0d23: iload 23
      // 0d25: iadd
      // 0d26: istore 13
      // 0d28: iload 14
      // 0d2a: iload 24
      // 0d2c: iadd
      // 0d2d: istore 14
      // 0d2f: iload 2
      // 0d30: getstatic rs/p_l/C_c.h I
      // 0d33: iadd
      // 0d34: istore 2
      // 0d35: goto 0cd6
      // 0d38: return
      // 0d39: iload 1
      // 0d3a: iload 0
      // 0d3b: isub
      // 0d3c: istore 1
      // 0d3d: iload 0
      // 0d3e: iload 2
      // 0d3f: isub
      // 0d40: istore 0
      // 0d41: getstatic rs/p_l/C_E_uc.x [I
      // 0d44: iload 2
      // 0d45: iaload
      // 0d46: istore 2
      // 0d47: iinc 0 -1
      // 0d4a: iload 0
      // 0d4b: iflt 0dac
      // 0d4e: getstatic rs/p_l/C_c.g [I
      // 0d51: iload 2
      // 0d52: iload 5
      // 0d54: bipush 16
      // 0d56: ishr
      // 0d57: iload 4
      // 0d59: bipush 16
      // 0d5b: ishr
      // 0d5c: iload 18
      // 0d5e: iload 19
      // 0d60: iload 20
      // 0d62: iload 15
      // 0d64: iload 16
      // 0d66: iload 17
      // 0d68: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0d6b: iload 4
      // 0d6d: iload 25
      // 0d6f: iadd
      // 0d70: istore 4
      // 0d72: iload 5
      // 0d74: iload 29
      // 0d76: iadd
      // 0d77: istore 5
      // 0d79: iload 15
      // 0d7b: iload 26
      // 0d7d: iadd
      // 0d7e: istore 15
      // 0d80: iload 16
      // 0d82: iload 27
      // 0d84: iadd
      // 0d85: istore 16
      // 0d87: iload 17
      // 0d89: iload 28
      // 0d8b: iadd
      // 0d8c: istore 17
      // 0d8e: iload 18
      // 0d90: iload 30
      // 0d92: iadd
      // 0d93: istore 18
      // 0d95: iload 19
      // 0d97: iload 31
      // 0d99: iadd
      // 0d9a: istore 19
      // 0d9c: iload 20
      // 0d9e: iload 32
      // 0da0: iadd
      // 0da1: istore 20
      // 0da3: iload 2
      // 0da4: getstatic rs/p_l/C_c.h I
      // 0da7: iadd
      // 0da8: istore 2
      // 0da9: goto 0d47
      // 0dac: iinc 1 -1
      // 0daf: iload 1
      // 0db0: iflt 0e0e
      // 0db3: getstatic rs/p_l/C_c.g [I
      // 0db6: iload 2
      // 0db7: iload 3
      // 0db8: bipush 16
      // 0dba: ishr
      // 0dbb: iload 4
      // 0dbd: bipush 16
      // 0dbf: ishr
      // 0dc0: iload 12
      // 0dc2: iload 13
      // 0dc4: iload 14
      // 0dc6: iload 15
      // 0dc8: iload 16
      // 0dca: iload 17
      // 0dcc: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0dcf: iload 4
      // 0dd1: iload 25
      // 0dd3: iadd
      // 0dd4: istore 4
      // 0dd6: iload 3
      // 0dd7: iload 21
      // 0dd9: iadd
      // 0dda: istore 3
      // 0ddb: iload 15
      // 0ddd: iload 26
      // 0ddf: iadd
      // 0de0: istore 15
      // 0de2: iload 16
      // 0de4: iload 27
      // 0de6: iadd
      // 0de7: istore 16
      // 0de9: iload 17
      // 0deb: iload 28
      // 0ded: iadd
      // 0dee: istore 17
      // 0df0: iload 12
      // 0df2: iload 22
      // 0df4: iadd
      // 0df5: istore 12
      // 0df7: iload 13
      // 0df9: iload 23
      // 0dfb: iadd
      // 0dfc: istore 13
      // 0dfe: iload 14
      // 0e00: iload 24
      // 0e02: iadd
      // 0e03: istore 14
      // 0e05: iload 2
      // 0e06: getstatic rs/p_l/C_c.h I
      // 0e09: iadd
      // 0e0a: istore 2
      // 0e0b: goto 0dac
      // 0e0e: return
      // 0e0f: iload 5
      // 0e11: bipush 16
      // 0e13: ishl
      // 0e14: dup
      // 0e15: istore 5
      // 0e17: istore 3
      // 0e18: iload 18
      // 0e1a: bipush 16
      // 0e1c: ishl
      // 0e1d: dup
      // 0e1e: istore 18
      // 0e20: istore 12
      // 0e22: iload 19
      // 0e24: bipush 16
      // 0e26: ishl
      // 0e27: dup
      // 0e28: istore 19
      // 0e2a: istore 13
      // 0e2c: iload 20
      // 0e2e: bipush 16
      // 0e30: ishl
      // 0e31: dup
      // 0e32: istore 20
      // 0e34: istore 14
      // 0e36: iload 2
      // 0e37: ifge 0e82
      // 0e3a: iload 3
      // 0e3b: iload 25
      // 0e3d: iload 2
      // 0e3e: imul
      // 0e3f: isub
      // 0e40: istore 3
      // 0e41: iload 5
      // 0e43: iload 29
      // 0e45: iload 2
      // 0e46: imul
      // 0e47: isub
      // 0e48: istore 5
      // 0e4a: iload 12
      // 0e4c: iload 26
      // 0e4e: iload 2
      // 0e4f: imul
      // 0e50: isub
      // 0e51: istore 12
      // 0e53: iload 13
      // 0e55: iload 27
      // 0e57: iload 2
      // 0e58: imul
      // 0e59: isub
      // 0e5a: istore 13
      // 0e5c: iload 14
      // 0e5e: iload 28
      // 0e60: iload 2
      // 0e61: imul
      // 0e62: isub
      // 0e63: istore 14
      // 0e65: iload 18
      // 0e67: iload 30
      // 0e69: iload 2
      // 0e6a: imul
      // 0e6b: isub
      // 0e6c: istore 18
      // 0e6e: iload 19
      // 0e70: iload 31
      // 0e72: iload 2
      // 0e73: imul
      // 0e74: isub
      // 0e75: istore 19
      // 0e77: iload 20
      // 0e79: iload 32
      // 0e7b: iload 2
      // 0e7c: imul
      // 0e7d: isub
      // 0e7e: istore 20
      // 0e80: bipush 0
      // 0e81: istore 2
      // 0e82: iload 4
      // 0e84: bipush 16
      // 0e86: ishl
      // 0e87: istore 4
      // 0e89: iload 15
      // 0e8b: bipush 16
      // 0e8d: ishl
      // 0e8e: istore 15
      // 0e90: iload 16
      // 0e92: bipush 16
      // 0e94: ishl
      // 0e95: istore 16
      // 0e97: iload 17
      // 0e99: bipush 16
      // 0e9b: ishl
      // 0e9c: istore 17
      // 0e9e: iload 1
      // 0e9f: ifge 0ec8
      // 0ea2: iload 4
      // 0ea4: iload 21
      // 0ea6: iload 1
      // 0ea7: imul
      // 0ea8: isub
      // 0ea9: istore 4
      // 0eab: iload 15
      // 0ead: iload 22
      // 0eaf: iload 1
      // 0eb0: imul
      // 0eb1: isub
      // 0eb2: istore 15
      // 0eb4: iload 16
      // 0eb6: iload 23
      // 0eb8: iload 1
      // 0eb9: imul
      // 0eba: isub
      // 0ebb: istore 16
      // 0ebd: iload 17
      // 0ebf: iload 24
      // 0ec1: iload 1
      // 0ec2: imul
      // 0ec3: isub
      // 0ec4: istore 17
      // 0ec6: bipush 0
      // 0ec7: istore 1
      // 0ec8: iload 25
      // 0eca: iload 29
      // 0ecc: if_icmpge 0fa5
      // 0ecf: iload 0
      // 0ed0: iload 1
      // 0ed1: isub
      // 0ed2: istore 0
      // 0ed3: iload 1
      // 0ed4: iload 2
      // 0ed5: isub
      // 0ed6: istore 1
      // 0ed7: getstatic rs/p_l/C_E_uc.x [I
      // 0eda: iload 2
      // 0edb: iaload
      // 0edc: istore 2
      // 0edd: iinc 1 -1
      // 0ee0: iload 1
      // 0ee1: iflt 0f3f
      // 0ee4: getstatic rs/p_l/C_c.g [I
      // 0ee7: iload 2
      // 0ee8: iload 3
      // 0ee9: bipush 16
      // 0eeb: ishr
      // 0eec: iload 5
      // 0eee: bipush 16
      // 0ef0: ishr
      // 0ef1: iload 12
      // 0ef3: iload 13
      // 0ef5: iload 14
      // 0ef7: iload 18
      // 0ef9: iload 19
      // 0efb: iload 20
      // 0efd: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0f00: iload 3
      // 0f01: iload 25
      // 0f03: iadd
      // 0f04: istore 3
      // 0f05: iload 5
      // 0f07: iload 29
      // 0f09: iadd
      // 0f0a: istore 5
      // 0f0c: iload 12
      // 0f0e: iload 26
      // 0f10: iadd
      // 0f11: istore 12
      // 0f13: iload 13
      // 0f15: iload 27
      // 0f17: iadd
      // 0f18: istore 13
      // 0f1a: iload 14
      // 0f1c: iload 28
      // 0f1e: iadd
      // 0f1f: istore 14
      // 0f21: iload 18
      // 0f23: iload 30
      // 0f25: iadd
      // 0f26: istore 18
      // 0f28: iload 19
      // 0f2a: iload 31
      // 0f2c: iadd
      // 0f2d: istore 19
      // 0f2f: iload 20
      // 0f31: iload 32
      // 0f33: iadd
      // 0f34: istore 20
      // 0f36: iload 2
      // 0f37: getstatic rs/p_l/C_c.h I
      // 0f3a: iadd
      // 0f3b: istore 2
      // 0f3c: goto 0edd
      // 0f3f: iinc 0 -1
      // 0f42: iload 0
      // 0f43: iflt 0fa4
      // 0f46: getstatic rs/p_l/C_c.g [I
      // 0f49: iload 2
      // 0f4a: iload 4
      // 0f4c: bipush 16
      // 0f4e: ishr
      // 0f4f: iload 5
      // 0f51: bipush 16
      // 0f53: ishr
      // 0f54: iload 15
      // 0f56: iload 16
      // 0f58: iload 17
      // 0f5a: iload 18
      // 0f5c: iload 19
      // 0f5e: iload 20
      // 0f60: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0f63: iload 4
      // 0f65: iload 21
      // 0f67: iadd
      // 0f68: istore 4
      // 0f6a: iload 5
      // 0f6c: iload 29
      // 0f6e: iadd
      // 0f6f: istore 5
      // 0f71: iload 15
      // 0f73: iload 22
      // 0f75: iadd
      // 0f76: istore 15
      // 0f78: iload 16
      // 0f7a: iload 23
      // 0f7c: iadd
      // 0f7d: istore 16
      // 0f7f: iload 17
      // 0f81: iload 24
      // 0f83: iadd
      // 0f84: istore 17
      // 0f86: iload 18
      // 0f88: iload 30
      // 0f8a: iadd
      // 0f8b: istore 18
      // 0f8d: iload 19
      // 0f8f: iload 31
      // 0f91: iadd
      // 0f92: istore 19
      // 0f94: iload 20
      // 0f96: iload 32
      // 0f98: iadd
      // 0f99: istore 20
      // 0f9b: iload 2
      // 0f9c: getstatic rs/p_l/C_c.h I
      // 0f9f: iadd
      // 0fa0: istore 2
      // 0fa1: goto 0f3f
      // 0fa4: return
      // 0fa5: iload 0
      // 0fa6: iload 1
      // 0fa7: isub
      // 0fa8: istore 0
      // 0fa9: iload 1
      // 0faa: iload 2
      // 0fab: isub
      // 0fac: istore 1
      // 0fad: getstatic rs/p_l/C_E_uc.x [I
      // 0fb0: iload 2
      // 0fb1: iaload
      // 0fb2: istore 2
      // 0fb3: iinc 1 -1
      // 0fb6: iload 1
      // 0fb7: iflt 1015
      // 0fba: getstatic rs/p_l/C_c.g [I
      // 0fbd: iload 2
      // 0fbe: iload 5
      // 0fc0: bipush 16
      // 0fc2: ishr
      // 0fc3: iload 3
      // 0fc4: bipush 16
      // 0fc6: ishr
      // 0fc7: iload 18
      // 0fc9: iload 19
      // 0fcb: iload 20
      // 0fcd: iload 12
      // 0fcf: iload 13
      // 0fd1: iload 14
      // 0fd3: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 0fd6: iload 3
      // 0fd7: iload 25
      // 0fd9: iadd
      // 0fda: istore 3
      // 0fdb: iload 5
      // 0fdd: iload 29
      // 0fdf: iadd
      // 0fe0: istore 5
      // 0fe2: iload 12
      // 0fe4: iload 26
      // 0fe6: iadd
      // 0fe7: istore 12
      // 0fe9: iload 13
      // 0feb: iload 27
      // 0fed: iadd
      // 0fee: istore 13
      // 0ff0: iload 14
      // 0ff2: iload 28
      // 0ff4: iadd
      // 0ff5: istore 14
      // 0ff7: iload 18
      // 0ff9: iload 30
      // 0ffb: iadd
      // 0ffc: istore 18
      // 0ffe: iload 19
      // 1000: iload 31
      // 1002: iadd
      // 1003: istore 19
      // 1005: iload 20
      // 1007: iload 32
      // 1009: iadd
      // 100a: istore 20
      // 100c: iload 2
      // 100d: getstatic rs/p_l/C_c.h I
      // 1010: iadd
      // 1011: istore 2
      // 1012: goto 0fb3
      // 1015: iinc 0 -1
      // 1018: iload 0
      // 1019: iflt 107a
      // 101c: getstatic rs/p_l/C_c.g [I
      // 101f: iload 2
      // 1020: iload 5
      // 1022: bipush 16
      // 1024: ishr
      // 1025: iload 4
      // 1027: bipush 16
      // 1029: ishr
      // 102a: iload 18
      // 102c: iload 19
      // 102e: iload 20
      // 1030: iload 15
      // 1032: iload 16
      // 1034: iload 17
      // 1036: invokestatic rs/p_l/C_E_uc.a ([IIIIIIIIII)V
      // 1039: iload 4
      // 103b: iload 21
      // 103d: iadd
      // 103e: istore 4
      // 1040: iload 5
      // 1042: iload 29
      // 1044: iadd
      // 1045: istore 5
      // 1047: iload 15
      // 1049: iload 22
      // 104b: iadd
      // 104c: istore 15
      // 104e: iload 16
      // 1050: iload 23
      // 1052: iadd
      // 1053: istore 16
      // 1055: iload 17
      // 1057: iload 24
      // 1059: iadd
      // 105a: istore 17
      // 105c: iload 18
      // 105e: iload 30
      // 1060: iadd
      // 1061: istore 18
      // 1063: iload 19
      // 1065: iload 31
      // 1067: iadd
      // 1068: istore 19
      // 106a: iload 20
      // 106c: iload 32
      // 106e: iadd
      // 106f: istore 20
      // 1071: iload 2
      // 1072: getstatic rs/p_l/C_c.h I
      // 1075: iadd
      // 1076: istore 2
      // 1077: goto 1015
      // 107a: return
   }

   public static void a(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (!rs.p_k.C_e.a() || h) {
         int var10 = var3 - var2;
         if (var10 > 0) {
            C_Launcher_mc.n().o();
            if (!C_Client_mc.ai() && q && var1 <= d()) {
               var1 += 3064;
            }

            var7 = (var7 - var4) / var10;
            var8 = (var8 - var5) / var10;
            var9 = (var9 - var6) / var10;
            if (o) {
               if (var3 > C_c.n) {
                  var10 -= var3 - C_c.n;
                  var3 = C_c.n;
               }

               if (var2 < 0) {
                  var10 = var3;
                  var4 -= var2 * var7;
                  var5 -= var2 * var8;
                  var6 -= var2 * var9;
                  var2 = 0;
               }
            }

            if (var2 < var3) {
               var1 += var2;
               if (r == 0) {
                  while (--var10 >= 0) {
                     if (rs.p_k.C_e.a()) {
                        C_c.a(
                           var0, var1, var4 & 0xFF0000 | var5 >> 8 & 0xFF00 | var6 >> 16 & 0xFF, var4 & 0xFF0000 | var5 >> 8 & 0xFF00 | var6 >> 16 & 0xFF, 255
                        );
                     } else {
                        var0[var1] = var4 & 0xFF0000 | var5 >> 8 & 0xFF00 | var6 >> 16 & 0xFF;
                     }

                     var4 += var7;
                     var5 += var8;
                     var6 += var9;
                     var1++;
                  }
               } else {
                  int var11 = r;

                  for (int var12 = 256 - r; --var10 >= 0; var1++) {
                     int var13 = var4 & 0xFF0000 | var5 >> 8 & 0xFF00 | var6 >> 16 & 0xFF;
                     var13 = ((var13 & 16711935) * var12 >> 8 & 16711935) + ((var13 & 0xFF00) * var12 >> 8 & 0xFF00);
                     int var14 = var0[var1];
                     if (rs.p_k.C_e.a()) {
                        C_c.a(
                           var0,
                           var1,
                           var13 + ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 0xFF00) * var11 >> 8 & 0xFF00),
                           var13 + ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 0xFF00) * var11 >> 8 & 0xFF00),
                           255
                        );
                     } else {
                        var0[var1] = var13 + ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 0xFF00) * var11 >> 8 & 0xFF00);
                     }

                     var4 += var7;
                     var5 += var8;
                     var6 += var9;
                  }
               }
            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (!rs.p_k.C_e.a() || h) {
         int var7 = 0;
         if (var1 != var0) {
            var7 = (var4 - var3 << 16) / (var1 - var0);
         }

         int var8 = 0;
         if (var2 != var1) {
            var8 = (var5 - var4 << 16) / (var2 - var1);
         }

         int var9 = 0;
         if (var2 != var0) {
            var9 = (var3 - var5 << 16) / (var0 - var2);
         }

         if (var0 <= var1 && var0 <= var2) {
            if (var0 < C_c.k) {
               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var1 < var2) {
                  int var51;
                  var5 = var51 = var3 << 16;
                  if (var0 < 0) {
                     var5 -= var9 * var0;
                     var51 -= var7 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  if (var1 < 0) {
                     var4 -= var8 * var1;
                     var1 = 0;
                  }

                  if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var51 >> 16, var5 >> 16);
                        var5 += var9;
                        var51 += var7;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var0, var6, var4 >> 16, var5 >> 16);
                        var5 += var9;
                        var4 += var8;
                        var0 += C_c.h;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var5 >> 16, var51 >> 16);
                        var5 += var9;
                        var51 += var7;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var0, var6, var5 >> 16, var4 >> 16);
                        var5 += var9;
                        var4 += var8;
                        var0 += C_c.h;
                     }
                  }
               } else {
                  int var50;
                  var4 = var50 = var3 << 16;
                  if (var0 < 0) {
                     var4 -= var9 * var0;
                     var50 -= var7 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  if (var2 < 0) {
                     var5 -= var8 * var2;
                     var2 = 0;
                  }

                  if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var50 >> 16, var4 >> 16);
                        var4 += var9;
                        var50 += var7;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var0, var6, var50 >> 16, var5 >> 16);
                        var5 += var8;
                        var50 += var7;
                        var0 += C_c.h;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var4 >> 16, var50 >> 16);
                        var4 += var9;
                        var50 += var7;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var0, var6, var5 >> 16, var50 >> 16);
                        var5 += var8;
                        var50 += var7;
                        var0 += C_c.h;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < C_c.k) {
               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var2 < var0) {
                  int var55;
                  var3 = var55 = var4 << 16;
                  if (var1 < 0) {
                     var3 -= var7 * var1;
                     var55 -= var8 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  if (var2 < 0) {
                     var5 -= var9 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var55 >> 16, var3 >> 16);
                        var3 += var7;
                        var55 += var8;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var1, var6, var5 >> 16, var3 >> 16);
                        var3 += var7;
                        var5 += var9;
                        var1 += C_c.h;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var3 >> 16, var55 >> 16);
                        var3 += var7;
                        var55 += var8;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var1, var6, var3 >> 16, var5 >> 16);
                        var3 += var7;
                        var5 += var9;
                        var1 += C_c.h;
                     }
                  }
               } else {
                  int var54;
                  var5 = var54 = var4 << 16;
                  if (var1 < 0) {
                     var5 -= var7 * var1;
                     var54 -= var8 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  if (var0 < 0) {
                     var3 -= var9 * var0;
                     var0 = 0;
                  }

                  if (var7 < var8) {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var5 >> 16, var54 >> 16);
                        var5 += var7;
                        var54 += var8;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var1, var6, var3 >> 16, var54 >> 16);
                        var3 += var9;
                        var54 += var8;
                        var1 += C_c.h;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var54 >> 16, var5 >> 16);
                        var5 += var7;
                        var54 += var8;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var1, var6, var54 >> 16, var3 >> 16);
                        var3 += var9;
                        var54 += var8;
                        var1 += C_c.h;
                     }
                  }
               }
            }
         } else if (var2 < C_c.k) {
            if (var0 > C_c.k) {
               var0 = C_c.k;
            }

            if (var1 > C_c.k) {
               var1 = C_c.k;
            }

            if (var0 < var1) {
               int var59;
               var4 = var59 = var5 << 16;
               if (var2 < 0) {
                  var4 -= var8 * var2;
                  var59 -= var9 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               if (var0 < 0) {
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               if (var8 < var9) {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var4 >> 16, var59 >> 16);
                     var4 += var8;
                     var59 += var9;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var2, var6, var4 >> 16, var3 >> 16);
                     var4 += var8;
                     var3 += var7;
                     var2 += C_c.h;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var59 >> 16, var4 >> 16);
                     var4 += var8;
                     var59 += var9;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var2, var6, var3 >> 16, var4 >> 16);
                     var4 += var8;
                     var3 += var7;
                     var2 += C_c.h;
                  }
               }
            } else {
               int var58;
               var3 = var58 = var5 << 16;
               if (var2 < 0) {
                  var3 -= var8 * var2;
                  var58 -= var9 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               if (var1 < 0) {
                  var4 -= var7 * var1;
                  var1 = 0;
               }

               if (var8 < var9) {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var3 >> 16, var58 >> 16);
                     var3 += var8;
                     var58 += var9;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var2, var6, var4 >> 16, var58 >> 16);
                     var4 += var7;
                     var58 += var9;
                     var2 += C_c.h;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var58 >> 16, var3 >> 16);
                     var3 += var8;
                     var58 += var9;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var2, var6, var58 >> 16, var4 >> 16);
                     var4 += var7;
                     var58 += var9;
                     var2 += C_c.h;
                  }
               }
            }
         }
      }
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var1 <= d()) {
            var1 += 3064;
         }

         if (o) {
            if (var4 > C_c.n) {
               var4 = C_c.n;
            }

            if (var3 < 0) {
               var3 = 0;
            }
         }

         if (var3 < var4) {
            var1 += var3;
            int var5 = var4 - var3 >> 2;
            if (r == 0) {
               while (--var5 >= 0) {
                  if (rs.p_k.C_e.a()) {
                     C_c.a(var0, var1++, var2, var2, 256 - r);
                     C_c.a(var0, var1++, var2, var2, 256 - r);
                     C_c.a(var0, var1++, var2, var2, 256 - r);
                     C_c.a(var0, var1++, var2, var2, 256 - r);
                  } else {
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                  }
               }

               var5 = var4 - var3 & 3;

               while (--var5 >= 0) {
                  if (rs.p_k.C_e.a()) {
                     C_c.a(var0, var1++, var2, var2, 256 - r);
                  } else {
                     var0[var1++] = var2;
                  }
               }
            } else {
               int var6 = r;
               int var7 = 256 - r;
               var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & 0xFF00) * var7 >> 8 & 0xFF00);

               while (--var5 >= 0) {
                  if (rs.p_k.C_e.a()) {
                     int var8 = var2 + ((var0[var1 + 1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1 + 1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     C_c.a(var0, var1++, var8, var8, var6);
                     var8 = var2 + ((var0[var1 + 1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1 + 1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     C_c.a(var0, var1++, var8, var8, var6);
                     var8 = var2 + ((var0[var1 + 1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1 + 1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     C_c.a(var0, var1++, var8, var8, var6);
                     var8 = var2 + ((var0[var1 + 1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1 + 1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     C_c.a(var0, var1++, var8, var8, var6);
                  } else {
                     var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00);
                     var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00);
                  }
               }

               var5 = var4 - var3 & 3;

               while (--var5 >= 0) {
                  if (rs.p_k.C_e.a()) {
                     C_c.a(
                        var0,
                        var1++,
                        var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00),
                        var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00),
                        var6
                     );
                  } else {
                     var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var6 >> 8 & 0xFF00);
                  }
               }
            }
         }
      }
   }

   public static void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18
   ) {
      if (!rs.p_k.C_e.a() || h) {
         if ((rs.p_k.C_e.a() || i) && p) {
            c(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18);
         } else {
            b(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18);
         }
      }
   }

   public static void b(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18
   ) {
      if (!rs.p_k.C_e.a() || h) {
         int[] var19 = d(var18);
         D = !G[var18];
         var10 = var9 - var10;
         var13 = var12 - var13;
         var16 = var15 - var16;
         var11 -= var9;
         var14 -= var12;
         var17 -= var15;
         int var20 = var11 * var12 - var14 * var9 << 14;
         int var21 = var14 * var15 - var17 * var12 << 8;
         int var22 = var17 * var9 - var11 * var15 << 5;
         int var23 = var10 * var12 - var13 * var9 << 14;
         int var24 = var13 * var15 - var16 * var12 << 8;
         int var25 = var16 * var9 - var10 * var15 << 5;
         int var26 = var13 * var11 - var10 * var14 << 14;
         int var27 = var16 * var14 - var13 * var17 << 8;
         int var28 = var10 * var17 - var16 * var11 << 5;
         int var29 = 0;
         int var30 = 0;
         if (var1 != var0) {
            var29 = (var4 - var3 << 16) / (var1 - var0);
            var30 = (var7 - var6 << 16) / (var1 - var0);
         }

         int var31 = 0;
         int var32 = 0;
         if (var2 != var1) {
            var31 = (var5 - var4 << 16) / (var2 - var1);
            var32 = (var8 - var7 << 16) / (var2 - var1);
         }

         int var33 = 0;
         int var34 = 0;
         if (var2 != var0) {
            var33 = (var3 - var5 << 16) / (var0 - var2);
            var34 = (var6 - var8 << 16) / (var0 - var2);
         }

         if (var0 <= var1 && var0 <= var2) {
            if (var0 < C_c.k) {
               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var1 < var2) {
                  int var77;
                  var5 = var77 = var3 << 16;
                  int var95;
                  var8 = var95 = var6 << 16;
                  if (var0 < 0) {
                     var5 -= var33 * var0;
                     var77 -= var29 * var0;
                     var8 -= var34 * var0;
                     var95 -= var30 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  var7 <<= 16;
                  if (var1 < 0) {
                     var4 -= var31 * var1;
                     var7 -= var32 * var1;
                     var1 = 0;
                  }

                  int var136 = var0 - t;
                  var20 += var22 * var136;
                  var23 += var25 * var136;
                  var26 += var28 * var136;
                  if ((var0 == var1 || var33 >= var29) && (var0 != var1 || var33 <= var31)) {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var26 += var28) {
                        a(C_c.g, var19, var0, var77 >> 16, var5 >> 16, var95 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var77 += var29;
                        var8 += var34;
                        var95 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var19, var0, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var4 += var31;
                        var8 += var34;
                        var7 += var32;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var26 += var28) {
                        a(C_c.g, var19, var0, var5 >> 16, var77 >> 16, var8 >> 8, var95 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var77 += var29;
                        var8 += var34;
                        var95 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var19, var0, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var4 += var31;
                        var8 += var34;
                        var7 += var32;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               } else {
                  int var76;
                  var4 = var76 = var3 << 16;
                  int var94;
                  var7 = var94 = var6 << 16;
                  if (var0 < 0) {
                     var4 -= var33 * var0;
                     var76 -= var29 * var0;
                     var7 -= var34 * var0;
                     var94 -= var30 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 16;
                  if (var2 < 0) {
                     var5 -= var31 * var2;
                     var8 -= var32 * var2;
                     var2 = 0;
                  }

                  int var135 = var0 - t;
                  var20 += var22 * var135;
                  var23 += var25 * var135;
                  var26 += var28 * var135;
                  if ((var0 == var2 || var33 >= var29) && (var0 != var2 || var31 <= var29)) {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var26 += var28) {
                        a(C_c.g, var19, var0, var76 >> 16, var4 >> 16, var94 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
                        var4 += var33;
                        var76 += var29;
                        var7 += var34;
                        var94 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var19, var0, var76 >> 16, var5 >> 16, var94 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var31;
                        var76 += var29;
                        var8 += var32;
                        var94 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var26 += var28) {
                        a(C_c.g, var19, var0, var4 >> 16, var76 >> 16, var7 >> 8, var94 >> 8, var20, var23, var26, var21, var24, var27);
                        var4 += var33;
                        var76 += var29;
                        var7 += var34;
                        var94 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var19, var0, var5 >> 16, var76 >> 16, var8 >> 8, var94 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var31;
                        var76 += var29;
                        var8 += var32;
                        var94 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < C_c.k) {
               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var2 < var0) {
                  int var81;
                  var3 = var81 = var4 << 16;
                  int var99;
                  var6 = var99 = var7 << 16;
                  if (var1 < 0) {
                     var3 -= var29 * var1;
                     var81 -= var31 * var1;
                     var6 -= var30 * var1;
                     var99 -= var32 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 16;
                  if (var2 < 0) {
                     var5 -= var33 * var2;
                     var8 -= var34 * var2;
                     var2 = 0;
                  }

                  int var134 = var1 - t;
                  var20 += var22 * var134;
                  var23 += var25 * var134;
                  var26 += var28 * var134;
                  if ((var1 == var2 || var29 >= var31) && (var1 != var2 || var29 <= var33)) {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var26 += var28) {
                        a(C_c.g, var19, var1, var81 >> 16, var3 >> 16, var99 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var81 += var31;
                        var6 += var30;
                        var99 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var19, var1, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var5 += var33;
                        var6 += var30;
                        var8 += var34;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var26 += var28) {
                        a(C_c.g, var19, var1, var3 >> 16, var81 >> 16, var6 >> 8, var99 >> 8, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var81 += var31;
                        var6 += var30;
                        var99 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var19, var1, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var5 += var33;
                        var6 += var30;
                        var8 += var34;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               } else {
                  int var80;
                  var5 = var80 = var4 << 16;
                  int var98;
                  var8 = var98 = var7 << 16;
                  if (var1 < 0) {
                     var5 -= var29 * var1;
                     var80 -= var31 * var1;
                     var8 -= var30 * var1;
                     var98 -= var32 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  var6 <<= 16;
                  if (var0 < 0) {
                     var3 -= var33 * var0;
                     var6 -= var34 * var0;
                     var0 = 0;
                  }

                  int var133 = var1 - t;
                  var20 += var22 * var133;
                  var23 += var25 * var133;
                  var26 += var28 * var133;
                  if (var29 < var31) {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var26 += var28) {
                        a(C_c.g, var19, var1, var5 >> 16, var80 >> 16, var8 >> 8, var98 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var29;
                        var80 += var31;
                        var8 += var30;
                        var98 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var19, var1, var3 >> 16, var80 >> 16, var6 >> 8, var98 >> 8, var20, var23, var26, var21, var24, var27);
                        var3 += var33;
                        var80 += var31;
                        var6 += var34;
                        var98 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var26 += var28) {
                        a(C_c.g, var19, var1, var80 >> 16, var5 >> 16, var98 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
                        var5 += var29;
                        var80 += var31;
                        var8 += var30;
                        var98 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var19, var1, var80 >> 16, var3 >> 16, var98 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
                        var3 += var33;
                        var80 += var31;
                        var6 += var34;
                        var98 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               }
            }
         } else if (var2 < C_c.k) {
            if (var0 > C_c.k) {
               var0 = C_c.k;
            }

            if (var1 > C_c.k) {
               var1 = C_c.k;
            }

            if (var0 < var1) {
               int var85;
               var4 = var85 = var5 << 16;
               int var103;
               var7 = var103 = var8 << 16;
               if (var2 < 0) {
                  var4 -= var31 * var2;
                  var85 -= var33 * var2;
                  var7 -= var32 * var2;
                  var103 -= var34 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               var6 <<= 16;
               if (var0 < 0) {
                  var3 -= var29 * var0;
                  var6 -= var30 * var0;
                  var0 = 0;
               }

               int var132 = var2 - t;
               var20 += var22 * var132;
               var23 += var25 * var132;
               var26 += var28 * var132;
               if (var31 < var33) {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var26 += var28) {
                     a(C_c.g, var19, var2, var4 >> 16, var85 >> 16, var7 >> 8, var103 >> 8, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var85 += var33;
                     var7 += var32;
                     var103 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var19, var2, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var3 += var29;
                     var7 += var32;
                     var6 += var30;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var26 += var28) {
                     a(C_c.g, var19, var2, var85 >> 16, var4 >> 16, var103 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var85 += var33;
                     var7 += var32;
                     var103 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var19, var2, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var3 += var29;
                     var7 += var32;
                     var6 += var30;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               }
            } else {
               int var84;
               var3 = var84 = var5 << 16;
               int var102;
               var6 = var102 = var8 << 16;
               if (var2 < 0) {
                  var3 -= var31 * var2;
                  var84 -= var33 * var2;
                  var6 -= var32 * var2;
                  var102 -= var34 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               var7 <<= 16;
               if (var1 < 0) {
                  var4 -= var29 * var1;
                  var7 -= var30 * var1;
                  var1 = 0;
               }

               int var35 = var2 - t;
               var20 += var22 * var35;
               var23 += var25 * var35;
               var26 += var28 * var35;
               if (var31 < var33) {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var26 += var28) {
                     a(C_c.g, var19, var2, var3 >> 16, var84 >> 16, var6 >> 8, var102 >> 8, var20, var23, var26, var21, var24, var27);
                     var3 += var31;
                     var84 += var33;
                     var6 += var32;
                     var102 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var19, var2, var4 >> 16, var84 >> 16, var7 >> 8, var102 >> 8, var20, var23, var26, var21, var24, var27);
                     var4 += var29;
                     var84 += var33;
                     var7 += var30;
                     var102 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var26 += var28) {
                     a(C_c.g, var19, var2, var84 >> 16, var3 >> 16, var102 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
                     var3 += var31;
                     var84 += var33;
                     var6 += var32;
                     var102 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var19, var2, var84 >> 16, var4 >> 16, var102 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
                     var4 += var29;
                     var84 += var33;
                     var7 += var30;
                     var102 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               }
            }
         }
      }
   }

   private static void a(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var2 <= d()) {
            var2 += 3064;
         }

         int var13 = 0;
         int var14 = 0;
         if (var3 < var4) {
            int var16;
            int var130;
            if (o) {
               var130 = (var6 - var5) / (var4 - var3);
               if (var4 > C_c.n) {
                  var4 = C_c.n;
               }

               if (var3 < 0) {
                  var5 -= var3 * var130;
                  var3 = 0;
               }

               if (var3 >= var4) {
                  return;
               }

               var16 = var4 - var3 >> 3;
               var130 <<= 12;
               var5 <<= 9;
            } else {
               if (var4 - var3 > 7) {
                  var16 = var4 - var3 >> 3;
                  var130 = (var6 - var5) * E[var16] >> 6;
               } else {
                  var16 = 0;
                  var130 = 0;
               }

               var5 <<= 9;
            }

            var2 += var3;
            if (n) {
               int var134 = 0;
               int var135 = 0;
               int var136 = var3 - s;
               var7 += (var10 >> 3) * var136;
               var8 += (var11 >> 3) * var136;
               var9 += (var12 >> 3) * var136;
               int var138 = var9 >> 12;
               if (var138 != 0) {
                  var13 = var7 / var138;
                  var14 = var8 / var138;
                  if (var13 < 0) {
                     var13 = 0;
                  } else if (var13 > 4032) {
                     var13 = 4032;
                  }
               }

               var7 += var10;
               var8 += var11;
               var9 += var12;
               var138 = var9 >> 12;
               if (var138 != 0) {
                  var134 = var7 / var138;
                  var135 = var8 / var138;
                  if (var134 < 7) {
                     var134 = 7;
                  } else if (var134 > 4032) {
                     var134 = 4032;
                  }
               }

               int var140 = var134 - var13 >> 3;
               int var141 = var135 - var14 >> 3;
               var13 += (var5 & 6291456) >> 3;
               int var142 = var5 >> 23;
               if (!D) {
                  while (var16-- > 0) {
                     int var153;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 += var140;
                     var14 += var141;
                     if ((var153 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var153;
                     }

                     var2++;
                     var13 = var134;
                     var14 = var135;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var163 = var9 >> 12;
                     if (var163 != 0) {
                        var134 = var7 / var163;
                        var135 = var8 / var163;
                        if (var134 < 7) {
                           var134 = 7;
                        } else if (var134 > 4032) {
                           var134 = 4032;
                        }
                     }

                     var140 = var134 - var13 >> 3;
                     var141 = var135 - var14 >> 3;
                     var5 += var130;
                     var13 += (var5 & 6291456) >> 3;
                     var142 = var5 >> 23;
                  }

                  for (int var133 = var4 - var3 & 7; var133-- > 0; var14 += var141) {
                     int var161;
                     if ((var161 = var1[(var14 & 4032) + (var13 >> 6)] >>> var142) != 0) {
                        var0[var2] = var161;
                     }

                     var2++;
                     var13 += var140;
                  }
               } else {
                  while (var16-- > 0) {
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                     var14 += var141;
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 = var134;
                     var14 = var135;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var152 = var9 >> 12;
                     if (var152 != 0) {
                        var134 = var7 / var152;
                        var135 = var8 / var152;
                        if (var134 < 7) {
                           var134 = 7;
                        } else if (var134 > 4032) {
                           var134 = 4032;
                        }
                     }

                     var140 = var134 - var13 >> 3;
                     var141 = var135 - var14 >> 3;
                     var5 += var130;
                     var13 += (var5 & 6291456) >> 3;
                     var142 = var5 >> 23;
                  }

                  for (int var132 = var4 - var3 & 7; var132-- > 0; var14 += var141) {
                     var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var142;
                     var13 += var140;
                  }
               }
            } else {
               int var17 = 0;
               int var18 = 0;
               int var19 = var3 - s;
               var7 += (var10 >> 3) * var19;
               var8 += (var11 >> 3) * var19;
               var9 += (var12 >> 3) * var19;
               int var20 = var9 >> 14;
               if (var20 != 0) {
                  var13 = var7 / var20;
                  var14 = var8 / var20;
                  if (var13 < 0) {
                     var13 = 0;
                  } else if (var13 > 16256) {
                     var13 = 16256;
                  }
               }

               var7 += var10;
               var8 += var11;
               var9 += var12;
               var20 = var9 >> 14;
               if (var20 != 0) {
                  var17 = var7 / var20;
                  var18 = var8 / var20;
                  if (var17 < 7) {
                     var17 = 7;
                  } else if (var17 > 16256) {
                     var17 = 16256;
                  }
               }

               int var21 = var17 - var13 >> 3;
               int var22 = var18 - var14 >> 3;
               var13 += var5 & 6291456;
               int var23 = var5 >> 23;
               if (!D) {
                  while (var16-- > 0) {
                     int var143;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 += var21;
                     var14 += var22;
                     if ((var143 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var143;
                     }

                     var2++;
                     var13 = var17;
                     var14 = var18;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var25 = var9 >> 14;
                     if (var25 != 0) {
                        var17 = var7 / var25;
                        var18 = var8 / var25;
                        if (var17 < 7) {
                           var17 = 7;
                        } else if (var17 > 16256) {
                           var17 = 16256;
                        }
                     }

                     var21 = var17 - var13 >> 3;
                     var22 = var18 - var14 >> 3;
                     var5 += var130;
                     var13 += var5 & 6291456;
                     var23 = var5 >> 23;
                  }

                  for (int var151 = var4 - var3 & 7; var151-- > 0; var14 += var22) {
                     int var162;
                     if ((var162 = var1[(var14 & 16256) + (var13 >> 7)] >>> var23) != 0) {
                        var0[var2] = var162;
                     }

                     var2++;
                     var13 += var21;
                  }
               } else {
                  while (var16-- > 0) {
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                     var14 += var22;
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 = var17;
                     var14 = var18;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var24 = var9 >> 14;
                     if (var24 != 0) {
                        var17 = var7 / var24;
                        var18 = var8 / var24;
                        if (var17 < 7) {
                           var17 = 7;
                        } else if (var17 > 16256) {
                           var17 = 16256;
                        }
                     }

                     var21 = var17 - var13 >> 3;
                     var22 = var18 - var14 >> 3;
                     var5 += var130;
                     var13 += var5 & 6291456;
                     var23 = var5 >> 23;
                  }

                  for (int var131 = var4 - var3 & 7; var131-- > 0; var14 += var22) {
                     var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var23;
                     var13 += var21;
                  }
               }
            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11) {
      if (!rs.p_k.C_e.a() || h) {
         if (g) {
            c(var0, var1, var2, var3, var4, var5, var6, var7, var8);
         } else if (!(var9 < 0.0F) && !(var10 < 0.0F) && !(var11 < 0.0F)) {
            int var12 = B[var6];
            int var13 = B[var7];
            int var14 = B[var8];
            int var15 = var12 >> 16 & 0xFF;
            int var16 = var12 >> 8 & 0xFF;
            int var17 = var12 & 0xFF;
            int var18 = var13 >> 16 & 0xFF;
            int var19 = var13 >> 8 & 0xFF;
            int var20 = var13 & 0xFF;
            int var21 = var14 >> 16 & 0xFF;
            int var22 = var14 >> 8 & 0xFF;
            int var23 = var14 & 0xFF;
            int var24 = 0;
            int var25 = 0;
            int var26 = 0;
            int var27 = 0;
            if (var1 != var0) {
               var24 = (var4 - var3 << 16) / (var1 - var0);
               var25 = (var18 - var15 << 16) / (var1 - var0);
               var26 = (var19 - var16 << 16) / (var1 - var0);
               var27 = (var20 - var17 << 16) / (var1 - var0);
            }

            int var28 = 0;
            int var29 = 0;
            int var30 = 0;
            int var31 = 0;
            if (var2 != var1) {
               var28 = (var5 - var4 << 16) / (var2 - var1);
               var29 = (var21 - var18 << 16) / (var2 - var1);
               var30 = (var22 - var19 << 16) / (var2 - var1);
               var31 = (var23 - var20 << 16) / (var2 - var1);
            }

            int var32 = 0;
            int var33 = 0;
            int var34 = 0;
            int var35 = 0;
            if (var2 != var0) {
               var32 = (var3 - var5 << 16) / (var0 - var2);
               var33 = (var15 - var21 << 16) / (var0 - var2);
               var34 = (var16 - var22 << 16) / (var0 - var2);
               var35 = (var17 - var23 << 16) / (var0 - var2);
            }

            float var36 = (float)(var4 - var3);
            float var37 = (float)(var1 - var0);
            float var38 = (float)(var5 - var3);
            float var39 = (float)(var2 - var0);
            float var40 = var10 - var9;
            float var41 = var11 - var9;
            float var42 = var36 * var39 - var38 * var37;
            float var43 = (var40 * var39 - var41 * var37) / var42;
            float var44 = (var41 * var36 - var40 * var38) / var42;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < C_c.k) {
                  if (var1 > C_c.k) {
                     var1 = C_c.k;
                  }

                  if (var2 > C_c.k) {
                     var2 = C_c.k;
                  }

                  var9 = var9 - var43 * (float)var3 + var43;
                  if (var1 < var2) {
                     int var86;
                     var5 = var86 = var3 << 16;
                     int var107;
                     var21 = var107 = var15 << 16;
                     int var113;
                     var22 = var113 = var16 << 16;
                     int var119;
                     var23 = var119 = var17 << 16;
                     if (var0 < 0) {
                        var5 -= var32 * var0;
                        var86 -= var24 * var0;
                        var21 -= var33 * var0;
                        var22 -= var34 * var0;
                        var23 -= var35 * var0;
                        var107 -= var25 * var0;
                        var113 -= var26 * var0;
                        var119 -= var27 * var0;
                        var9 -= var44 * (float)var0;
                        var0 = 0;
                     }

                     var4 <<= 16;
                     var18 <<= 16;
                     var19 <<= 16;
                     var20 <<= 16;
                     if (var1 < 0) {
                        var4 -= var28 * var1;
                        var18 -= var29 * var1;
                        var19 -= var30 * var1;
                        var20 -= var31 * var1;
                        var1 = 0;
                     }

                     if ((var0 == var1 || var32 >= var24) && (var0 != var1 || var32 <= var28)) {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var86 >> 16, var5 >> 16, var107, var113, var119, var21, var22, var23, var9, var43);
                           var5 += var32;
                           var86 += var24;
                           var21 += var33;
                           var22 += var34;
                           var23 += var35;
                           var107 += var25;
                           var113 += var26;
                           var119 += var27;
                           var9 += var44;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var0, var4 >> 16, var5 >> 16, var18, var19, var20, var21, var22, var23, var9, var43);
                           var5 += var32;
                           var4 += var28;
                           var21 += var33;
                           var22 += var34;
                           var23 += var35;
                           var18 += var29;
                           var19 += var30;
                           var20 += var31;
                           var0 += C_c.h;
                           var9 += var44;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var5 >> 16, var86 >> 16, var21, var22, var23, var107, var113, var119, var9, var43);
                           var5 += var32;
                           var86 += var24;
                           var21 += var33;
                           var22 += var34;
                           var23 += var35;
                           var107 += var25;
                           var113 += var26;
                           var119 += var27;
                           var9 += var44;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var0, var5 >> 16, var4 >> 16, var21, var22, var23, var18, var19, var20, var9, var43);
                           var5 += var32;
                           var4 += var28;
                           var21 += var33;
                           var22 += var34;
                           var23 += var35;
                           var18 += var29;
                           var19 += var30;
                           var20 += var31;
                           var0 += C_c.h;
                           var9 += var44;
                        }
                     }
                  } else {
                     int var85;
                     var4 = var85 = var3 << 16;
                     int var106;
                     var18 = var106 = var15 << 16;
                     int var112;
                     var19 = var112 = var16 << 16;
                     int var118;
                     var20 = var118 = var17 << 16;
                     if (var0 < 0) {
                        var4 -= var32 * var0;
                        var85 -= var24 * var0;
                        var18 -= var33 * var0;
                        var19 -= var34 * var0;
                        var20 -= var35 * var0;
                        var106 -= var25 * var0;
                        var112 -= var26 * var0;
                        var118 -= var27 * var0;
                        var9 -= var44 * (float)var0;
                        var0 = 0;
                     }

                     var5 <<= 16;
                     var21 <<= 16;
                     var22 <<= 16;
                     var23 <<= 16;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var21 -= var29 * var2;
                        var22 -= var30 * var2;
                        var23 -= var31 * var2;
                        var2 = 0;
                     }

                     if ((var0 == var2 || var32 >= var24) && (var0 != var2 || var28 <= var24)) {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var85 >> 16, var4 >> 16, var106, var112, var118, var18, var19, var20, var9, var43);
                           var4 += var32;
                           var85 += var24;
                           var18 += var33;
                           var19 += var34;
                           var20 += var35;
                           var106 += var25;
                           var112 += var26;
                           var118 += var27;
                           var9 += var44;
                        }

                        while (--var1 >= 0) {
                           a(C_c.g, var0, var85 >> 16, var5 >> 16, var106, var112, var118, var21, var22, var23, var9, var43);
                           var5 += var28;
                           var85 += var24;
                           var21 += var29;
                           var22 += var30;
                           var23 += var31;
                           var106 += var25;
                           var112 += var26;
                           var118 += var27;
                           var0 += C_c.h;
                           var9 += var44;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var4 >> 16, var85 >> 16, var18, var19, var20, var106, var112, var118, var9, var43);
                           var4 += var32;
                           var85 += var24;
                           var18 += var33;
                           var19 += var34;
                           var20 += var35;
                           var106 += var25;
                           var112 += var26;
                           var118 += var27;
                           var9 += var44;
                        }

                        while (--var1 >= 0) {
                           a(C_c.g, var0, var5 >> 16, var85 >> 16, var21, var22, var23, var106, var112, var118, var9, var43);
                           var5 += var28;
                           var85 += var24;
                           var21 += var29;
                           var22 += var30;
                           var23 += var31;
                           var106 += var25;
                           var112 += var26;
                           var118 += var27;
                           var0 += C_c.h;
                           var9 += var44;
                        }
                     }
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < C_c.k) {
                  if (var2 > C_c.k) {
                     var2 = C_c.k;
                  }

                  if (var0 > C_c.k) {
                     var0 = C_c.k;
                  }

                  var10 = var10 - var43 * (float)var4 + var43;
                  if (var2 < var0) {
                     int var90;
                     var3 = var90 = var4 << 16;
                     int var123;
                     var15 = var123 = var18 << 16;
                     int var129;
                     var16 = var129 = var19 << 16;
                     int var135;
                     var17 = var135 = var20 << 16;
                     if (var1 < 0) {
                        var3 -= var24 * var1;
                        var90 -= var28 * var1;
                        var15 -= var25 * var1;
                        var16 -= var26 * var1;
                        var17 -= var27 * var1;
                        var123 -= var29 * var1;
                        var129 -= var30 * var1;
                        var135 -= var31 * var1;
                        var10 -= var44 * (float)var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     var21 <<= 16;
                     var22 <<= 16;
                     var23 <<= 16;
                     if (var2 < 0) {
                        var5 -= var32 * var2;
                        var21 -= var33 * var2;
                        var22 -= var34 * var2;
                        var23 -= var35 * var2;
                        var2 = 0;
                     }

                     if ((var1 == var2 || var24 >= var28) && (var1 != var2 || var24 <= var32)) {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var90 >> 16, var3 >> 16, var123, var129, var135, var15, var16, var17, var10, var43);
                           var3 += var24;
                           var90 += var28;
                           var15 += var25;
                           var16 += var26;
                           var17 += var27;
                           var123 += var29;
                           var129 += var30;
                           var135 += var31;
                           var10 += var44;
                        }

                        while (--var0 >= 0) {
                           a(C_c.g, var1, var5 >> 16, var3 >> 16, var21, var22, var23, var15, var16, var17, var10, var43);
                           var3 += var24;
                           var5 += var32;
                           var15 += var25;
                           var16 += var26;
                           var17 += var27;
                           var21 += var33;
                           var22 += var34;
                           var23 += var35;
                           var1 += C_c.h;
                           var10 += var44;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var3 >> 16, var90 >> 16, var15, var16, var17, var123, var129, var135, var10, var43);
                           var3 += var24;
                           var90 += var28;
                           var15 += var25;
                           var16 += var26;
                           var17 += var27;
                           var123 += var29;
                           var129 += var30;
                           var135 += var31;
                           var10 += var44;
                        }

                        while (--var0 >= 0) {
                           a(C_c.g, var1, var3 >> 16, var5 >> 16, var15, var16, var17, var21, var22, var23, var10, var43);
                           var3 += var24;
                           var5 += var32;
                           var15 += var25;
                           var16 += var26;
                           var17 += var27;
                           var21 += var33;
                           var22 += var34;
                           var23 += var35;
                           var1 += C_c.h;
                           var10 += var44;
                        }
                     }
                  } else {
                     int var89;
                     var5 = var89 = var4 << 16;
                     int var122;
                     var21 = var122 = var18 << 16;
                     int var128;
                     var22 = var128 = var19 << 16;
                     int var134;
                     var23 = var134 = var20 << 16;
                     if (var1 < 0) {
                        var5 -= var24 * var1;
                        var89 -= var28 * var1;
                        var21 -= var25 * var1;
                        var22 -= var26 * var1;
                        var23 -= var27 * var1;
                        var122 -= var29 * var1;
                        var128 -= var30 * var1;
                        var134 -= var31 * var1;
                        var10 -= var44 * (float)var1;
                        var1 = 0;
                     }

                     var3 <<= 16;
                     var15 <<= 16;
                     var16 <<= 16;
                     var17 <<= 16;
                     if (var0 < 0) {
                        var3 -= var32 * var0;
                        var15 -= var33 * var0;
                        var16 -= var34 * var0;
                        var17 -= var35 * var0;
                        var0 = 0;
                     }

                     if (var24 < var28) {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var5 >> 16, var89 >> 16, var21, var22, var23, var122, var128, var134, var10, var43);
                           var5 += var24;
                           var89 += var28;
                           var21 += var25;
                           var22 += var26;
                           var23 += var27;
                           var122 += var29;
                           var128 += var30;
                           var134 += var31;
                           var10 += var44;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var1, var3 >> 16, var89 >> 16, var15, var16, var17, var122, var128, var134, var10, var43);
                           var3 += var32;
                           var89 += var28;
                           var15 += var33;
                           var16 += var34;
                           var17 += var35;
                           var122 += var29;
                           var128 += var30;
                           var134 += var31;
                           var1 += C_c.h;
                           var10 += var44;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var89 >> 16, var5 >> 16, var122, var128, var134, var21, var22, var23, var10, var43);
                           var5 += var24;
                           var89 += var28;
                           var21 += var25;
                           var22 += var26;
                           var23 += var27;
                           var122 += var29;
                           var128 += var30;
                           var134 += var31;
                           var10 += var44;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var1, var89 >> 16, var3 >> 16, var122, var128, var134, var15, var16, var17, var10, var43);
                           var3 += var32;
                           var89 += var28;
                           var15 += var33;
                           var16 += var34;
                           var17 += var35;
                           var122 += var29;
                           var128 += var30;
                           var134 += var31;
                           var1 += C_c.h;
                           var10 += var44;
                        }
                     }
                  }
               }
            } else if (var2 < C_c.k) {
               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               var11 = var11 - var43 * (float)var5 + var43;
               if (var0 < var1) {
                  int var94;
                  var4 = var94 = var5 << 16;
                  int var139;
                  var18 = var139 = var21 << 16;
                  int var145;
                  var19 = var145 = var22 << 16;
                  int var151;
                  var20 = var151 = var23 << 16;
                  if (var2 < 0) {
                     var4 -= var28 * var2;
                     var94 -= var32 * var2;
                     var18 -= var29 * var2;
                     var19 -= var30 * var2;
                     var20 -= var31 * var2;
                     var139 -= var33 * var2;
                     var145 -= var34 * var2;
                     var151 -= var35 * var2;
                     var11 -= var44 * (float)var2;
                     var2 = 0;
                  }

                  var3 <<= 16;
                  var15 <<= 16;
                  var16 <<= 16;
                  var17 <<= 16;
                  if (var0 < 0) {
                     var3 -= var24 * var0;
                     var15 -= var25 * var0;
                     var16 -= var26 * var0;
                     var17 -= var27 * var0;
                     var0 = 0;
                  }

                  if (var28 < var32) {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var4 >> 16, var94 >> 16, var18, var19, var20, var139, var145, var151, var11, var43);
                        var4 += var28;
                        var94 += var32;
                        var18 += var29;
                        var19 += var30;
                        var20 += var31;
                        var139 += var33;
                        var145 += var34;
                        var151 += var35;
                        var11 += var44;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var2, var4 >> 16, var3 >> 16, var18, var19, var20, var15, var16, var17, var11, var43);
                        var4 += var28;
                        var3 += var24;
                        var18 += var29;
                        var19 += var30;
                        var20 += var31;
                        var15 += var25;
                        var16 += var26;
                        var17 += var27;
                        var2 += C_c.h;
                        var11 += var44;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var94 >> 16, var4 >> 16, var139, var145, var151, var18, var19, var20, var11, var43);
                        var4 += var28;
                        var94 += var32;
                        var18 += var29;
                        var19 += var30;
                        var20 += var31;
                        var139 += var33;
                        var145 += var34;
                        var151 += var35;
                        var11 += var44;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var2, var3 >> 16, var4 >> 16, var15, var16, var17, var18, var19, var20, var11, var43);
                        var4 += var28;
                        var3 += var24;
                        var18 += var29;
                        var19 += var30;
                        var20 += var31;
                        var15 += var25;
                        var16 += var26;
                        var17 += var27;
                        var11 += var44;
                        var2 += C_c.h;
                     }
                  }
               } else {
                  int var93;
                  var3 = var93 = var5 << 16;
                  int var138;
                  var15 = var138 = var21 << 16;
                  int var144;
                  var16 = var144 = var22 << 16;
                  int var150;
                  var17 = var150 = var23 << 16;
                  if (var2 < 0) {
                     var3 -= var28 * var2;
                     var93 -= var32 * var2;
                     var15 -= var29 * var2;
                     var16 -= var30 * var2;
                     var17 -= var31 * var2;
                     var138 -= var33 * var2;
                     var144 -= var34 * var2;
                     var150 -= var35 * var2;
                     var11 -= var44 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 16;
                  var18 <<= 16;
                  var19 <<= 16;
                  var20 <<= 16;
                  if (var1 < 0) {
                     var4 -= var24 * var1;
                     var18 -= var25 * var1;
                     var19 -= var26 * var1;
                     var20 -= var27 * var1;
                     var1 = 0;
                  }

                  if (var28 < var32) {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var3 >> 16, var93 >> 16, var15, var16, var17, var138, var144, var150, var11, var43);
                        var3 += var28;
                        var93 += var32;
                        var15 += var29;
                        var16 += var30;
                        var17 += var31;
                        var138 += var33;
                        var144 += var34;
                        var150 += var35;
                        var11 += var44;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var2, var4 >> 16, var93 >> 16, var18, var19, var20, var138, var144, var150, var11, var43);
                        var4 += var24;
                        var93 += var32;
                        var18 += var25;
                        var19 += var26;
                        var20 += var27;
                        var138 += var33;
                        var144 += var34;
                        var150 += var35;
                        var11 += var44;
                        var2 += C_c.h;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var93 >> 16, var3 >> 16, var138, var144, var150, var15, var16, var17, var11, var43);
                        var3 += var28;
                        var93 += var32;
                        var15 += var29;
                        var16 += var30;
                        var17 += var31;
                        var138 += var33;
                        var144 += var34;
                        var150 += var35;
                        var11 += var44;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var2, var93 >> 16, var4 >> 16, var138, var144, var150, var18, var19, var20, var11, var43);
                        var4 += var24;
                        var93 += var32;
                        var18 += var25;
                        var19 += var26;
                        var20 += var27;
                        var138 += var33;
                        var144 += var34;
                        var150 += var35;
                        var2 += C_c.h;
                        var11 += var44;
                     }
                  }
               }
            }
         }
      }
   }

   public static void a(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var1 <= d()) {
            var1 += 3064;
         }

         int var12 = var3 - var2;
         if (var12 > 0) {
            var7 = (var7 - var4) / var12;
            var8 = (var8 - var5) / var12;
            var9 = (var9 - var6) / var12;
            if (o) {
               if (var3 > C_c.n) {
                  var12 -= var3 - C_c.n;
                  var3 = C_c.n;
               }

               if (var2 < 0) {
                  var12 = var3;
                  var4 -= var2 * var7;
                  var5 -= var2 * var8;
                  var6 -= var2 * var9;
                  var2 = 0;
               }
            }

            if (var2 < var3) {
               var1 += var2;
               var10 += var11 * (float)var2;
               if (r == 0) {
                  while (--var12 >= 0) {
                     var0[var1] = var4 & 0xFF0000 | var5 >> 8 & 0xFF00 | var6 >> 16 & 0xFF;
                     C_c.f[var1] = var10;
                     var10 += var11;
                     var4 += var7;
                     var5 += var8;
                     var6 += var9;
                     var1++;
                  }
               } else {
                  int var13 = r;

                  for (int var14 = 256 - r; --var12 >= 0; var1++) {
                     int var15 = var4 & 0xFF0000 | var5 >> 8 & 0xFF00 | var6 >> 16 & 0xFF;
                     var15 = ((var15 & 16711935) * var14 >> 8 & 16711935) + ((var15 & 0xFF00) * var14 >> 8 & 0xFF00);
                     int var16 = var0[var1];
                     var0[var1] = var15 + ((var16 & 16711935) * var13 >> 8 & 16711935) + ((var16 & 0xFF00) * var13 >> 8 & 0xFF00);
                     C_c.f[var1] = var10;
                     var10 += var11;
                     var4 += var7;
                     var5 += var8;
                     var6 += var9;
                  }
               }
            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      if (!rs.p_k.C_e.a() || h) {
         if (!(var7 < 0.0F) && !(var8 < 0.0F) && !(var9 < 0.0F)) {
            int var10 = 0;
            if (var1 != var0) {
               var10 = (var4 - var3 << 16) / (var1 - var0);
            }

            int var11 = 0;
            if (var2 != var1) {
               var11 = (var5 - var4 << 16) / (var2 - var1);
            }

            int var12 = 0;
            if (var2 != var0) {
               var12 = (var3 - var5 << 16) / (var0 - var2);
            }

            float var13 = (float)(var4 - var3);
            float var14 = (float)(var1 - var0);
            float var15 = (float)(var5 - var3);
            float var16 = (float)(var2 - var0);
            float var17 = var8 - var7;
            float var18 = var9 - var7;
            float var19 = var13 * var16 - var15 * var14;
            float var20 = (var17 * var16 - var18 * var14) / var19;
            float var21 = (var18 * var13 - var17 * var15) / var19;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < C_c.k) {
                  if (var1 > C_c.k) {
                     var1 = C_c.k;
                  }

                  if (var2 > C_c.k) {
                     var2 = C_c.k;
                  }

                  var7 = var7 - var20 * (float)var3 + var20;
                  if (var1 < var2) {
                     int var63;
                     var5 = var63 = var3 << 16;
                     if (var0 < 0) {
                        var5 -= var12 * var0;
                        var63 -= var10 * var0;
                        var7 -= var21 * (float)var0;
                        var0 = 0;
                     }

                     var4 <<= 16;
                     if (var1 < 0) {
                        var4 -= var11 * var1;
                        var1 = 0;
                     }

                     if ((var0 == var1 || var12 >= var10) && (var0 != var1 || var12 <= var11)) {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var6, var63 >> 16, var5 >> 16, var7, var20);
                           var5 += var12;
                           var63 += var10;
                           var7 += var21;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var0, var6, var4 >> 16, var5 >> 16, var7, var20);
                           var5 += var12;
                           var4 += var11;
                           var0 += C_c.h;
                           var7 += var21;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var6, var5 >> 16, var63 >> 16, var7, var20);
                           var5 += var12;
                           var63 += var10;
                           var7 += var21;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var0, var6, var5 >> 16, var4 >> 16, var7, var20);
                           var5 += var12;
                           var4 += var11;
                           var0 += C_c.h;
                           var7 += var21;
                        }
                     }
                  } else {
                     int var62;
                     var4 = var62 = var3 << 16;
                     if (var0 < 0) {
                        var4 -= var12 * var0;
                        var62 -= var10 * var0;
                        var7 -= var21 * (float)var0;
                        var0 = 0;
                     }

                     var5 <<= 16;
                     if (var2 < 0) {
                        var5 -= var11 * var2;
                        var2 = 0;
                     }

                     if ((var0 == var2 || var12 >= var10) && (var0 != var2 || var11 <= var10)) {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var6, var62 >> 16, var4 >> 16, var7, var20);
                           var7 += var21;
                           var4 += var12;
                           var62 += var10;
                        }

                        while (--var1 >= 0) {
                           a(C_c.g, var0, var6, var62 >> 16, var5 >> 16, var7, var20);
                           var7 += var21;
                           var5 += var11;
                           var62 += var10;
                           var0 += C_c.h;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                           a(C_c.g, var0, var6, var4 >> 16, var62 >> 16, var7, var20);
                           var7 += var21;
                           var4 += var12;
                           var62 += var10;
                        }

                        while (--var1 >= 0) {
                           a(C_c.g, var0, var6, var5 >> 16, var62 >> 16, var7, var20);
                           var7 += var21;
                           var5 += var11;
                           var62 += var10;
                           var0 += C_c.h;
                        }
                     }
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < C_c.k) {
                  if (var2 > C_c.k) {
                     var2 = C_c.k;
                  }

                  if (var0 > C_c.k) {
                     var0 = C_c.k;
                  }

                  var8 = var8 - var20 * (float)var4 + var20;
                  if (var2 < var0) {
                     int var67;
                     var3 = var67 = var4 << 16;
                     if (var1 < 0) {
                        var3 -= var10 * var1;
                        var67 -= var11 * var1;
                        var8 -= var21 * (float)var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     if (var2 < 0) {
                        var5 -= var12 * var2;
                        var2 = 0;
                     }

                     if ((var1 == var2 || var10 >= var11) && (var1 != var2 || var10 <= var12)) {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var6, var67 >> 16, var3 >> 16, var8, var20);
                           var8 += var21;
                           var3 += var10;
                           var67 += var11;
                        }

                        while (--var0 >= 0) {
                           a(C_c.g, var1, var6, var5 >> 16, var3 >> 16, var8, var20);
                           var8 += var21;
                           var3 += var10;
                           var5 += var12;
                           var1 += C_c.h;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var6, var3 >> 16, var67 >> 16, var8, var20);
                           var8 += var21;
                           var3 += var10;
                           var67 += var11;
                        }

                        while (--var0 >= 0) {
                           a(C_c.g, var1, var6, var3 >> 16, var5 >> 16, var8, var20);
                           var8 += var21;
                           var3 += var10;
                           var5 += var12;
                           var1 += C_c.h;
                        }
                     }
                  } else {
                     int var66;
                     var5 = var66 = var4 << 16;
                     if (var1 < 0) {
                        var5 -= var10 * var1;
                        var66 -= var11 * var1;
                        var8 -= var21 * (float)var1;
                        var1 = 0;
                     }

                     var3 <<= 16;
                     if (var0 < 0) {
                        var3 -= var12 * var0;
                        var0 = 0;
                     }

                     if (var10 < var11) {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var6, var5 >> 16, var66 >> 16, var8, var20);
                           var8 += var21;
                           var5 += var10;
                           var66 += var11;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var1, var6, var3 >> 16, var66 >> 16, var8, var20);
                           var8 += var21;
                           var3 += var12;
                           var66 += var11;
                           var1 += C_c.h;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                           a(C_c.g, var1, var6, var66 >> 16, var5 >> 16, var8, var20);
                           var8 += var21;
                           var5 += var10;
                           var66 += var11;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var1, var6, var66 >> 16, var3 >> 16, var8, var20);
                           var8 += var21;
                           var3 += var12;
                           var66 += var11;
                           var1 += C_c.h;
                        }
                     }
                  }
               }
            } else if (var2 < C_c.k) {
               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               var9 = var9 - var20 * (float)var5 + var20;
               if (var0 < var1) {
                  int var71;
                  var4 = var71 = var5 << 16;
                  if (var2 < 0) {
                     var4 -= var11 * var2;
                     var71 -= var12 * var2;
                     var9 -= var21 * (float)var2;
                     var2 = 0;
                  }

                  var3 <<= 16;
                  if (var0 < 0) {
                     var3 -= var10 * var0;
                     var0 = 0;
                  }

                  if (var11 < var12) {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var6, var4 >> 16, var71 >> 16, var9, var20);
                        var9 += var21;
                        var4 += var11;
                        var71 += var12;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var2, var6, var4 >> 16, var3 >> 16, var9, var20);
                        var9 += var21;
                        var4 += var11;
                        var3 += var10;
                        var2 += C_c.h;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var6, var71 >> 16, var4 >> 16, var9, var20);
                        var9 += var21;
                        var4 += var11;
                        var71 += var12;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var2, var6, var3 >> 16, var4 >> 16, var9, var20);
                        var9 += var21;
                        var4 += var11;
                        var3 += var10;
                        var2 += C_c.h;
                     }
                  }
               } else {
                  int var70;
                  var3 = var70 = var5 << 16;
                  if (var2 < 0) {
                     var3 -= var11 * var2;
                     var70 -= var12 * var2;
                     var9 -= var21 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 16;
                  if (var1 < 0) {
                     var4 -= var10 * var1;
                     var1 = 0;
                  }

                  if (var11 < var12) {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var6, var3 >> 16, var70 >> 16, var9, var20);
                        var9 += var21;
                        var3 += var11;
                        var70 += var12;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var2, var6, var4 >> 16, var70 >> 16, var9, var20);
                        var9 += var21;
                        var4 += var10;
                        var70 += var12;
                        var2 += C_c.h;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                        a(C_c.g, var2, var6, var70 >> 16, var3 >> 16, var9, var20);
                        var9 += var21;
                        var3 += var11;
                        var70 += var12;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var2, var6, var70 >> 16, var4 >> 16, var9, var20);
                        var9 += var21;
                        var4 += var10;
                        var70 += var12;
                        var2 += C_c.h;
                     }
                  }
               }
            }
         }
      }
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4, float var5, float var6) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var1 <= d()) {
            var1 += 3064;
         }

         if (o) {
            if (var4 > C_c.n) {
               var4 = C_c.n;
            }

            if (var3 < 0) {
               var3 = 0;
            }
         }

         if (var3 < var4) {
            var1 += var3;
            int var7 = var4 - var3 >> 2;
            var5 += var6 * (float)var3;
            if (r == 0) {
               while (--var7 >= 0) {
                  for (int var16 = 0; var16 < 4; var16++) {
                     if (rs.p_k.C_e.a()) {
                        C_c.a(var0, var1, var2, var2, 256 - r);
                     } else {
                        var0[var1] = var2;
                     }

                     C_c.f[var1] = var5;
                     var1++;
                     var5 += var6;
                  }
               }

               for (int var15 = var4 - var3 & 3; --var15 >= 0; var5 += var6) {
                  if (rs.p_k.C_e.a()) {
                     C_c.a(var0, var1, var2, var2, 256 - r);
                  } else {
                     var0[var1] = var2;
                  }

                  C_c.f[var1] = var5;
                  var1++;
               }
            } else {
               int var8 = r;
               int var9 = 256 - r;
               var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & 0xFF00) * var9 >> 8 & 0xFF00);

               while (--var7 >= 0) {
                  for (int var10 = 0; var10 < 4; var10++) {
                     if (rs.p_k.C_e.a()) {
                        C_c.a(var0, var1, var2 + (var0[var1] & 16711935) + (var0[var1] & 0xFF00), var2 + (var0[var1] & 16711935) + (var0[var1] & 0xFF00), var8);
                     } else {
                        var0[var1] = var2 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var8 >> 8 & 0xFF00);
                     }

                     C_c.f[var1] = var5;
                     var1++;
                     var5 += var6;
                  }
               }

               for (int var14 = var4 - var3 & 3; --var14 >= 0; var5 += var6) {
                  if (rs.p_k.C_e.a()) {
                     C_c.a(var0, var1, var2 + (var0[var1] & 16711935) + (var0[var1] & 0xFF00), var2 + (var0[var1] & 16711935) + (var0[var1] & 0xFF00), var8);
                  } else {
                     var0[var1] = var2 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var8 >> 8 & 0xFF00);
                  }

                  C_c.f[var1] = var5;
                  var1++;
               }
            }
         }
      }
   }

   private static void b(int[] var0, int var1, int var2, int var3, int var4, float var5, float var6) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var1 <= d()) {
            var1 += 3064;
         }

         if (o) {
            if (var4 > C_c.n) {
               var4 = C_c.n;
            }

            if (var3 < 0) {
               var3 = 0;
            }
         }

         if (var3 < var4) {
            var1 += var3;
            int var7 = var4 - var3 >> 2;
            var5 += var6 * (float)var3;
            if (r == 0) {
               while (--var7 >= 0) {
                  for (int var16 = 0; var16 < 4; var16++) {
                     var0[var1] = var2;
                     C_c.f[var1] = var5;
                     var1++;
                     var5 += var6;
                  }
               }

               for (int var15 = var4 - var3 & 3; --var15 >= 0; var5 += var6) {
                  var0[var1] = var2;
                  C_c.f[var1] = var5;
                  var1++;
               }
            } else {
               int var8 = r;
               int var9 = 256 - r;
               var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & 0xFF00) * var9 >> 8 & 0xFF00);

               while (--var7 >= 0) {
                  for (int var10 = 0; var10 < 4; var10++) {
                     var0[var1] = var2 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var8 >> 8 & 0xFF00);
                     C_c.f[var1] = var5;
                     var1++;
                     var5 += var6;
                  }
               }

               for (int var14 = var4 - var3 & 3; --var14 >= 0; var5 += var6) {
                  var0[var1] = var2 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & 0xFF00) * var8 >> 8 & 0xFF00);
                  C_c.f[var1] = var5;
                  var1++;
               }
            }
         }
      }
   }

   public static void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      float var19,
      float var20,
      float var21
   ) {
      if (rs.p_k.C_e.a() && !p) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18);
      } else {
         a(-1, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
      }
   }

   public static void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      float var20,
      float var21,
      float var22
   ) {
      if (!rs.p_k.C_e.a() || h) {
         if (g) {
            c(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
         } else if (!(var20 < 0.0F) && !(var21 < 0.0F) && !(var22 < 0.0F)) {
            int[] var23 = d(var19);
            D = !G[var19];
            var11 = var10 - var11;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var12 -= var10;
            var15 -= var13;
            var18 -= var16;
            int var24 = var12 * var13 - var15 * var10 << 14;
            int var25 = var15 * var16 - var18 * var13 << 8;
            int var26 = var18 * var10 - var12 * var16 << 5;
            int var27 = var11 * var13 - var14 * var10 << 14;
            int var28 = var14 * var16 - var17 * var13 << 8;
            int var29 = var17 * var10 - var11 * var16 << 5;
            int var30 = var14 * var12 - var11 * var15 << 14;
            int var31 = var17 * var15 - var14 * var18 << 8;
            int var32 = var11 * var18 - var17 * var12 << 5;
            int var33 = 0;
            int var34 = 0;
            if (var2 != var1) {
               var33 = (var5 - var4 << 16) / (var2 - var1);
               var34 = (var8 - var7 << 16) / (var2 - var1);
            }

            int var35 = 0;
            int var36 = 0;
            if (var3 != var2) {
               var35 = (var6 - var5 << 16) / (var3 - var2);
               var36 = (var9 - var8 << 16) / (var3 - var2);
            }

            int var37 = 0;
            int var38 = 0;
            if (var3 != var1) {
               var37 = (var4 - var6 << 16) / (var1 - var3);
               var38 = (var7 - var9 << 16) / (var1 - var3);
            }

            float var39 = (float)(var5 - var4);
            float var40 = (float)(var2 - var1);
            float var41 = (float)(var6 - var4);
            float var42 = (float)(var3 - var1);
            float var43 = var21 - var20;
            float var44 = var22 - var20;
            float var45 = var39 * var42 - var41 * var40;
            float var46 = (var43 * var42 - var44 * var40) / var45;
            float var47 = (var44 * var39 - var43 * var41) / var45;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < C_c.k) {
                  if (var2 > C_c.k) {
                     var2 = C_c.k;
                  }

                  if (var3 > C_c.k) {
                     var3 = C_c.k;
                  }

                  var20 = var20 - var46 * (float)var4 + var46;
                  if (var2 < var3) {
                     int var90;
                     var6 = var90 = var4 << 16;
                     int var108;
                     var9 = var108 = var7 << 16;
                     if (var1 < 0) {
                        var6 -= var37 * var1;
                        var90 -= var33 * var1;
                        var20 -= var47 * (float)var1;
                        var9 -= var38 * var1;
                        var108 -= var34 * var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     var8 <<= 16;
                     if (var2 < 0) {
                        var5 -= var35 * var2;
                        var8 -= var36 * var2;
                        var2 = 0;
                     }

                     int var152 = var1 - t;
                     var24 += var26 * var152;
                     var27 += var29 * var152;
                     var30 += var32 * var152;
                     if ((var1 == var2 || var37 >= var33) && (var1 != var2 || var37 <= var35)) {
                        var3 -= var2;
                        var2 -= var1;

                        for (var1 = x[var1]; --var2 >= 0; var30 += var32) {
                           a(C_c.g, var23, var1, var90 >> 16, var6 >> 16, var108 >> 8, var9 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var6 += var37;
                           var90 += var33;
                           var20 += var47;
                           var9 += var38;
                           var108 += var34;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var3 >= 0) {
                           a(C_c.g, var23, var1, var5 >> 16, var6 >> 16, var8 >> 8, var9 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var6 += var37;
                           var5 += var35;
                           var20 += var47;
                           var9 += var38;
                           var8 += var36;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;

                        for (var1 = x[var1]; --var2 >= 0; var30 += var32) {
                           a(C_c.g, var23, var1, var6 >> 16, var90 >> 16, var9 >> 8, var108 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var6 += var37;
                           var90 += var33;
                           var20 += var47;
                           var9 += var38;
                           var108 += var34;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var3 >= 0) {
                           a(C_c.g, var23, var1, var6 >> 16, var5 >> 16, var9 >> 8, var8 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var6 += var37;
                           var5 += var35;
                           var20 += var47;
                           var9 += var38;
                           var8 += var36;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     }
                  } else {
                     int var89;
                     var5 = var89 = var4 << 16;
                     int var107;
                     var8 = var107 = var7 << 16;
                     if (var1 < 0) {
                        var5 -= var37 * var1;
                        var89 -= var33 * var1;
                        var20 -= var47 * (float)var1;
                        var8 -= var38 * var1;
                        var107 -= var34 * var1;
                        var1 = 0;
                     }

                     var6 <<= 16;
                     var9 <<= 16;
                     if (var3 < 0) {
                        var6 -= var35 * var3;
                        var9 -= var36 * var3;
                        var3 = 0;
                     }

                     int var151 = var1 - t;
                     var24 += var26 * var151;
                     var27 += var29 * var151;
                     var30 += var32 * var151;
                     if ((var1 == var3 || var37 >= var33) && (var1 != var3 || var35 <= var33)) {
                        var2 -= var3;
                        var3 -= var1;

                        for (var1 = x[var1]; --var3 >= 0; var30 += var32) {
                           a(C_c.g, var23, var1, var89 >> 16, var5 >> 16, var107 >> 8, var8 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var5 += var37;
                           var89 += var33;
                           var8 += var38;
                           var107 += var34;
                           var20 += var47;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var23, var1, var89 >> 16, var6 >> 16, var107 >> 8, var9 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var6 += var35;
                           var89 += var33;
                           var9 += var36;
                           var107 += var34;
                           var20 += var47;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;

                        for (var1 = x[var1]; --var3 >= 0; var30 += var32) {
                           a(C_c.g, var23, var1, var5 >> 16, var89 >> 16, var8 >> 8, var107 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var5 += var37;
                           var89 += var33;
                           var8 += var38;
                           var107 += var34;
                           var20 += var47;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var2 >= 0) {
                           a(C_c.g, var23, var1, var6 >> 16, var89 >> 16, var9 >> 8, var107 >> 8, var24, var27, var30, var25, var28, var31, var20, var46);
                           var6 += var35;
                           var89 += var33;
                           var9 += var36;
                           var107 += var34;
                           var20 += var47;
                           var1 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < C_c.k) {
                  if (var3 > C_c.k) {
                     var3 = C_c.k;
                  }

                  if (var1 > C_c.k) {
                     var1 = C_c.k;
                  }

                  var21 = var21 - var46 * (float)var5 + var46;
                  if (var3 < var1) {
                     int var94;
                     var4 = var94 = var5 << 16;
                     int var112;
                     var7 = var112 = var8 << 16;
                     if (var2 < 0) {
                        var4 -= var33 * var2;
                        var94 -= var35 * var2;
                        var21 -= var47 * (float)var2;
                        var7 -= var34 * var2;
                        var112 -= var36 * var2;
                        var2 = 0;
                     }

                     var6 <<= 16;
                     var9 <<= 16;
                     if (var3 < 0) {
                        var6 -= var37 * var3;
                        var9 -= var38 * var3;
                        var3 = 0;
                     }

                     int var150 = var2 - t;
                     var24 += var26 * var150;
                     var27 += var29 * var150;
                     var30 += var32 * var150;
                     if ((var2 == var3 || var33 >= var35) && (var2 != var3 || var33 <= var37)) {
                        var1 -= var3;
                        var3 -= var2;

                        for (var2 = x[var2]; --var3 >= 0; var30 += var32) {
                           a(C_c.g, var23, var2, var94 >> 16, var4 >> 16, var112 >> 8, var7 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var4 += var33;
                           var94 += var35;
                           var7 += var34;
                           var112 += var36;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var1 >= 0) {
                           a(C_c.g, var23, var2, var6 >> 16, var4 >> 16, var9 >> 8, var7 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var4 += var33;
                           var6 += var37;
                           var7 += var34;
                           var9 += var38;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;

                        for (var2 = x[var2]; --var3 >= 0; var30 += var32) {
                           a(C_c.g, var23, var2, var4 >> 16, var94 >> 16, var7 >> 8, var112 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var4 += var33;
                           var94 += var35;
                           var7 += var34;
                           var112 += var36;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var1 >= 0) {
                           a(C_c.g, var23, var2, var4 >> 16, var6 >> 16, var7 >> 8, var9 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var4 += var33;
                           var6 += var37;
                           var7 += var34;
                           var9 += var38;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     }
                  } else {
                     int var93;
                     var6 = var93 = var5 << 16;
                     int var111;
                     var9 = var111 = var8 << 16;
                     if (var2 < 0) {
                        var6 -= var33 * var2;
                        var93 -= var35 * var2;
                        var21 -= var47 * (float)var2;
                        var9 -= var34 * var2;
                        var111 -= var36 * var2;
                        var2 = 0;
                     }

                     var4 <<= 16;
                     var7 <<= 16;
                     if (var1 < 0) {
                        var4 -= var37 * var1;
                        var7 -= var38 * var1;
                        var1 = 0;
                     }

                     int var149 = var2 - t;
                     var24 += var26 * var149;
                     var27 += var29 * var149;
                     var30 += var32 * var149;
                     if (var33 < var35) {
                        var3 -= var1;
                        var1 -= var2;

                        for (var2 = x[var2]; --var1 >= 0; var30 += var32) {
                           a(C_c.g, var23, var2, var6 >> 16, var93 >> 16, var9 >> 8, var111 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var6 += var33;
                           var93 += var35;
                           var9 += var34;
                           var111 += var36;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var3 >= 0) {
                           a(C_c.g, var23, var2, var4 >> 16, var93 >> 16, var7 >> 8, var111 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var4 += var37;
                           var93 += var35;
                           var7 += var38;
                           var111 += var36;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;

                        for (var2 = x[var2]; --var1 >= 0; var30 += var32) {
                           a(C_c.g, var23, var2, var93 >> 16, var6 >> 16, var111 >> 8, var9 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var6 += var33;
                           var93 += var35;
                           var9 += var34;
                           var111 += var36;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                        }

                        while (--var3 >= 0) {
                           a(C_c.g, var23, var2, var93 >> 16, var4 >> 16, var111 >> 8, var7 >> 8, var24, var27, var30, var25, var28, var31, var21, var46);
                           var4 += var37;
                           var93 += var35;
                           var7 += var38;
                           var111 += var36;
                           var21 += var47;
                           var2 += C_c.h;
                           var24 += var26;
                           var27 += var29;
                           var30 += var32;
                        }
                     }
                  }
               }
            } else if (var3 < C_c.k) {
               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               var22 = var22 - var46 * (float)var6 + var46;
               if (var1 < var2) {
                  int var98;
                  var5 = var98 = var6 << 16;
                  int var116;
                  var8 = var116 = var9 << 16;
                  if (var3 < 0) {
                     var5 -= var35 * var3;
                     var98 -= var37 * var3;
                     var22 -= var47 * (float)var3;
                     var8 -= var36 * var3;
                     var116 -= var38 * var3;
                     var3 = 0;
                  }

                  var4 <<= 16;
                  var7 <<= 16;
                  if (var1 < 0) {
                     var4 -= var33 * var1;
                     var7 -= var34 * var1;
                     var1 = 0;
                  }

                  int var148 = var3 - t;
                  var24 += var26 * var148;
                  var27 += var29 * var148;
                  var30 += var32 * var148;
                  if (var35 < var37) {
                     var2 -= var1;
                     var1 -= var3;

                     for (var3 = x[var3]; --var1 >= 0; var30 += var32) {
                        a(C_c.g, var23, var3, var5 >> 16, var98 >> 16, var8 >> 8, var116 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var5 += var35;
                        var98 += var37;
                        var8 += var36;
                        var116 += var38;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var23, var3, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var5 += var35;
                        var4 += var33;
                        var8 += var36;
                        var7 += var34;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                        var30 += var32;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;

                     for (var3 = x[var3]; --var1 >= 0; var30 += var32) {
                        a(C_c.g, var23, var3, var98 >> 16, var5 >> 16, var116 >> 8, var8 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var5 += var35;
                        var98 += var37;
                        var8 += var36;
                        var116 += var38;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var23, var3, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var5 += var35;
                        var4 += var33;
                        var8 += var36;
                        var7 += var34;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                        var30 += var32;
                     }
                  }
               } else {
                  int var97;
                  var4 = var97 = var6 << 16;
                  int var115;
                  var7 = var115 = var9 << 16;
                  if (var3 < 0) {
                     var4 -= var35 * var3;
                     var97 -= var37 * var3;
                     var22 -= var47 * (float)var3;
                     var7 -= var36 * var3;
                     var115 -= var38 * var3;
                     var3 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 16;
                  if (var2 < 0) {
                     var5 -= var33 * var2;
                     var8 -= var34 * var2;
                     var2 = 0;
                  }

                  int var48 = var3 - t;
                  var24 += var26 * var48;
                  var27 += var29 * var48;
                  var30 += var32 * var48;
                  if (var35 < var37) {
                     var1 -= var2;
                     var2 -= var3;

                     for (var3 = x[var3]; --var2 >= 0; var30 += var32) {
                        a(C_c.g, var23, var3, var4 >> 16, var97 >> 16, var7 >> 8, var115 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var4 += var35;
                        var97 += var37;
                        var7 += var36;
                        var115 += var38;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var23, var3, var5 >> 16, var97 >> 16, var8 >> 8, var115 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var5 += var33;
                        var97 += var37;
                        var8 += var34;
                        var115 += var38;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                        var30 += var32;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;

                     for (var3 = x[var3]; --var2 >= 0; var30 += var32) {
                        a(C_c.g, var23, var3, var97 >> 16, var4 >> 16, var115 >> 8, var7 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var4 += var35;
                        var97 += var37;
                        var7 += var36;
                        var115 += var38;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var23, var3, var97 >> 16, var5 >> 16, var115 >> 8, var8 >> 8, var24, var27, var30, var25, var28, var31, var22, var46);
                        var5 += var33;
                        var97 += var37;
                        var8 += var34;
                        var115 += var38;
                        var22 += var47;
                        var3 += C_c.h;
                        var24 += var26;
                        var27 += var29;
                        var30 += var32;
                     }
                  }
               }
            }
         }
      }
   }

   public static void a(
      int[] var0,
      int[] var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      float var13,
      float var14
   ) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var2 <= d()) {
            var2 += 3064;
         }

         int var15 = 0;
         int var16 = 0;
         if (var3 < var4) {
            int var18;
            int var49;
            if (o) {
               var49 = (var6 - var5) / (var4 - var3);
               if (var4 > C_c.n) {
                  var4 = C_c.n;
               }

               if (var3 < 0) {
                  var5 -= var3 * var49;
                  var3 = 0;
               }

               if (var3 >= var4) {
                  return;
               }

               var18 = var4 - var3 >> 3;
               var49 <<= 12;
               var5 <<= 9;
            } else {
               if (var4 - var3 > 7) {
                  var18 = var4 - var3 >> 3;
                  var49 = (var6 - var5) * E[var18] >> 6;
               } else {
                  var18 = 0;
                  var49 = 0;
               }

               var5 <<= 9;
            }

            var2 += var3;
            var13 += var14 * (float)var3;
            if (n) {
               int var53 = 0;
               int var54 = 0;
               int var55 = var3 - s;
               var7 += (var10 >> 3) * var55;
               var8 += (var11 >> 3) * var55;
               var9 += (var12 >> 3) * var55;
               int var57 = var9 >> 12;
               if (var57 != 0) {
                  var15 = var7 / var57;
                  var16 = var8 / var57;
                  if (var15 < 0) {
                     var15 = 0;
                  } else if (var15 > 4032) {
                     var15 = 4032;
                  }
               }

               var7 += var10;
               var8 += var11;
               var9 += var12;
               var57 = var9 >> 12;
               if (var57 != 0) {
                  var53 = var7 / var57;
                  var54 = var8 / var57;
                  if (var53 < 7) {
                     var53 = 7;
                  } else if (var53 > 4032) {
                     var53 = 4032;
                  }
               }

               int var59 = var53 - var15 >> 3;
               int var60 = var54 - var16 >> 3;
               var15 += (var5 & 6291456) >> 3;
               int var61 = var5 >> 23;
               if (D) {
                  while (var18-- > 0) {
                     for (int var67 = 0; var67 < 8; var67++) {
                        C_c.a(var0, var2, var1[(var16 & 4032) + (var15 >> 6)] >>> var61, var1[(var16 & 4032) + (var15 >> 6)] >>> var61, 255);
                        C_c.f[var2] = var13;
                        var2++;
                        var13 += var14;
                        var15 += var59;
                        var16 += var60;
                     }

                     var15 = var53;
                     var16 = var54;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var68 = var9 >> 12;
                     if (var68 != 0) {
                        var53 = var7 / var68;
                        var54 = var8 / var68;
                        if (var53 < 7) {
                           var53 = 7;
                        } else if (var53 > 4032) {
                           var53 = 4032;
                        }
                     }

                     var59 = var53 - var15 >> 3;
                     var60 = var54 - var16 >> 3;
                     var5 += var49;
                     var15 += (var5 & 6291456) >> 3;
                     var61 = var5 >> 23;
                  }

                  for (int var52 = var4 - var3 & 7; var52-- > 0; var16 += var60) {
                     C_c.a(var0, var2, var1[(var16 & 4032) + (var15 >> 6)] >>> var61, var1[(var16 & 4032) + (var15 >> 6)] >>> var61, 255);
                     C_c.f[var2] = var13;
                     var2++;
                     var13 += var14;
                     var15 += var59;
                  }
               } else {
                  while (var18-- > 0) {
                     for (int var71 = 0; var71 < 8; var71++) {
                        int var65;
                        if ((var65 = var1[(var16 & 4032) + (var15 >> 6)] >>> var61) != 0) {
                           C_c.a(var0, var2, var65, var65, 255);
                           C_c.f[var2] = var13;
                        }

                        var2++;
                        var13 += var14;
                        var15 += var59;
                        var16 += var60;
                     }

                     var15 = var53;
                     var16 = var54;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var72 = var9 >> 12;
                     if (var72 != 0) {
                        var53 = var7 / var72;
                        var54 = var8 / var72;
                        if (var53 < 7) {
                           var53 = 7;
                        } else if (var53 > 4032) {
                           var53 = 4032;
                        }
                     }

                     var59 = var53 - var15 >> 3;
                     var60 = var54 - var16 >> 3;
                     var5 += var49;
                     var15 += (var5 & 6291456) >> 3;
                     var61 = var5 >> 23;
                  }

                  for (int var51 = var4 - var3 & 7; var51-- > 0; var16 += var60) {
                     int var66;
                     if ((var66 = var1[(var16 & 4032) + (var15 >> 6)] >>> var61) != 0) {
                        C_c.a(var0, var2, var66, var66, 255);
                        C_c.f[var2] = var13;
                     }

                     var2++;
                     var13 += var14;
                     var15 += var59;
                  }
               }
            } else {
               int var19 = 0;
               int var20 = 0;
               int var21 = var3 - s;
               var7 += (var10 >> 3) * var21;
               var8 += (var11 >> 3) * var21;
               var9 += (var12 >> 3) * var21;
               int var22 = var9 >> 14;
               if (var22 != 0) {
                  var15 = var7 / var22;
                  var16 = var8 / var22;
                  if (var15 < 0) {
                     var15 = 0;
                  } else if (var15 > 16256) {
                     var15 = 16256;
                  }
               }

               var7 += var10;
               var8 += var11;
               var9 += var12;
               var22 = var9 >> 14;
               if (var22 != 0) {
                  var19 = var7 / var22;
                  var20 = var8 / var22;
                  if (var19 < 7) {
                     var19 = 7;
                  } else if (var19 > 16256) {
                     var19 = 16256;
                  }
               }

               int var23 = var19 - var15 >> 3;
               int var24 = var20 - var16 >> 3;
               var15 += var5 & 6291456;
               int var25 = var5 >> 23;
               if (D) {
                  while (var18-- > 0) {
                     for (int var63 = 0; var63 < 8; var63++) {
                        C_c.a(var0, var2, var1[(var16 & 16256) + (var15 >> 7)] >>> var25, var1[(var16 & 16256) + (var15 >> 7)] >>> var25, 255);
                        C_c.f[var2] = var13;
                        var13 += var14;
                        var2++;
                        var15 += var23;
                        var16 += var24;
                     }

                     var15 = var19;
                     var16 = var20;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var64 = var9 >> 14;
                     if (var64 != 0) {
                        var19 = var7 / var64;
                        var20 = var8 / var64;
                        if (var19 < 7) {
                           var19 = 7;
                        } else if (var19 > 16256) {
                           var19 = 16256;
                        }
                     }

                     var23 = var19 - var15 >> 3;
                     var24 = var20 - var16 >> 3;
                     var5 += var49;
                     var15 += var5 & 6291456;
                     var25 = var5 >> 23;
                  }

                  for (int var50 = var4 - var3 & 7; var50-- > 0; var16 += var24) {
                     C_c.a(var0, var2, var1[(var16 & 16256) + (var15 >> 7)] >>> var25, var1[(var16 & 16256) + (var15 >> 7)] >>> var25, 255);
                     C_c.f[var2] = var13;
                     var2++;
                     var13 += var14;
                     var15 += var23;
                  }
               } else {
                  while (var18-- > 0) {
                     for (int var27 = 0; var27 < 8; var27++) {
                        int var26;
                        if ((var26 = var1[(var16 & 16256) + (var15 >> 7)] >>> var25) != 0) {
                           C_c.a(var0, var2, var26, var26, 255);
                           C_c.f[var2] = var13;
                        }

                        var2++;
                        var13 += var14;
                        var15 += var23;
                        var16 += var24;
                     }

                     var15 = var19;
                     var16 = var20;
                     var7 += var10;
                     var8 += var11;
                     var9 += var12;
                     int var69 = var9 >> 14;
                     if (var69 != 0) {
                        var19 = var7 / var69;
                        var20 = var8 / var69;
                        if (var19 < 7) {
                           var19 = 7;
                        } else if (var19 > 16256) {
                           var19 = 16256;
                        }
                     }

                     var23 = var19 - var15 >> 3;
                     var24 = var20 - var16 >> 3;
                     var5 += var49;
                     var15 += var5 & 6291456;
                     var25 = var5 >> 23;
                  }

                  for (int var62 = var4 - var3 & 7; var62-- > 0; var16 += var24) {
                     int var70;
                     if ((var70 = var1[(var16 & 16256) + (var15 >> 7)] >>> var25) != 0) {
                        C_c.a(var0, var2, var70, var70, 255);
                        C_c.f[var2] = var13;
                     }

                     var13 += var14;
                     var2++;
                     var15 += var23;
                  }
               }
            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      if (!rs.p_k.C_e.a() || h) {
         int var9 = 0;
         if (var4 != var3) {
            var9 = (var1 - var0 << 16) / (var4 - var3);
         }

         int var10 = 0;
         if (var5 != var4) {
            var10 = (var2 - var1 << 16) / (var5 - var4);
         }

         int var11 = 0;
         if (var5 != var3) {
            var11 = (var0 - var2 << 16) / (var3 - var5);
         }

         float var12 = (float)(var1 - var0);
         float var13 = (float)(var4 - var3);
         float var14 = (float)(var2 - var0);
         float var15 = (float)(var5 - var3);
         float var16 = var7 - var6;
         float var17 = var8 - var6;
         float var18 = var12 * var15 - var14 * var13;
         float var19 = (var16 * var15 - var17 * var13) / var18;
         float var20 = (var17 * var12 - var16 * var14) / var18;
         if (var3 <= var4 && var3 <= var5) {
            if (var3 < C_c.k) {
               if (var4 > C_c.k) {
                  var4 = C_c.k;
               }

               if (var5 > C_c.k) {
                  var5 = C_c.k;
               }

               var6 = var6 - var19 * (float)var0 + var19;
               if (var4 < var5) {
                  int var25;
                  var2 = var25 = var0 << 16;
                  if (var3 < 0) {
                     var2 -= var11 * var3;
                     var25 -= var9 * var3;
                     var6 -= var20 * (float)var3;
                     var3 = 0;
                  }

                  var1 <<= 16;
                  if (var4 < 0) {
                     var1 -= var10 * var4;
                     var4 = 0;
                  }

                  if (var3 != var4 && var11 < var9 || var3 == var4 && var11 > var10) {
                     var5 -= var4;
                     var4 -= var3;

                     for (var3 = x[var3]; --var4 >= 0; var3 += C_c.h) {
                        a(var3, var2 >> 16, var25 >> 16, var6, var19);
                        var2 += var11;
                        var25 += var9;
                        var6 += var20;
                     }

                     while (--var5 >= 0) {
                        a(var3, var2 >> 16, var1 >> 16, var6, var19);
                        var2 += var11;
                        var1 += var10;
                        var6 += var20;
                        var3 += C_c.h;
                     }
                  } else {
                     var5 -= var4;
                     var4 -= var3;

                     for (var3 = x[var3]; --var4 >= 0; var3 += C_c.h) {
                        a(var3, var25 >> 16, var2 >> 16, var6, var19);
                        var2 += var11;
                        var25 += var9;
                        var6 += var20;
                     }

                     while (--var5 >= 0) {
                        a(var3, var1 >> 16, var2 >> 16, var6, var19);
                        var2 += var11;
                        var1 += var10;
                        var6 += var20;
                        var3 += C_c.h;
                     }
                  }
               } else {
                  int var26;
                  var1 = var26 = var0 << 16;
                  if (var3 < 0) {
                     var1 -= var11 * var3;
                     var26 -= var9 * var3;
                     var6 -= var20 * (float)var3;
                     var3 = 0;
                  }

                  var2 <<= 16;
                  if (var5 < 0) {
                     var2 -= var10 * var5;
                     var5 = 0;
                  }

                  if (var3 != var5 && var11 < var9 || var3 == var5 && var10 > var9) {
                     var4 -= var5;
                     var5 -= var3;

                     for (var3 = x[var3]; --var5 >= 0; var3 += C_c.h) {
                        a(var3, var1 >> 16, var26 >> 16, var6, var19);
                        var1 += var11;
                        var26 += var9;
                        var6 += var20;
                     }

                     while (--var4 >= 0) {
                        a(var3, var2 >> 16, var26 >> 16, var6, var19);
                        var2 += var10;
                        var26 += var9;
                        var6 += var20;
                        var3 += C_c.h;
                     }
                  } else {
                     var4 -= var5;
                     var5 -= var3;

                     for (var3 = x[var3]; --var5 >= 0; var3 += C_c.h) {
                        a(var3, var26 >> 16, var1 >> 16, var6, var19);
                        var1 += var11;
                        var26 += var9;
                        var6 += var20;
                     }

                     while (--var4 >= 0) {
                        a(var3, var26 >> 16, var2 >> 16, var6, var19);
                        var2 += var10;
                        var26 += var9;
                        var6 += var20;
                        var3 += C_c.h;
                     }
                  }
               }
            }
         } else if (var4 <= var5) {
            if (var4 < C_c.k) {
               if (var5 > C_c.k) {
                  var5 = C_c.k;
               }

               if (var3 > C_c.k) {
                  var3 = C_c.k;
               }

               var7 = var7 - var19 * (float)var1 + var19;
               if (var5 < var3) {
                  int var27;
                  var0 = var27 = var1 << 16;
                  if (var4 < 0) {
                     var0 -= var9 * var4;
                     var27 -= var10 * var4;
                     var7 -= var20 * (float)var4;
                     var4 = 0;
                  }

                  var2 <<= 16;
                  if (var5 < 0) {
                     var2 -= var11 * var5;
                     var5 = 0;
                  }

                  if (var4 != var5 && var9 < var10 || var4 == var5 && var9 > var11) {
                     var3 -= var5;
                     var5 -= var4;

                     for (var4 = x[var4]; --var5 >= 0; var4 += C_c.h) {
                        a(var4, var0 >> 16, var27 >> 16, var7, var19);
                        var0 += var9;
                        var27 += var10;
                        var7 += var20;
                     }

                     while (--var3 >= 0) {
                        a(var4, var0 >> 16, var2 >> 16, var7, var19);
                        var0 += var9;
                        var2 += var11;
                        var7 += var20;
                        var4 += C_c.h;
                     }
                  } else {
                     var3 -= var5;
                     var5 -= var4;

                     for (var4 = x[var4]; --var5 >= 0; var4 += C_c.h) {
                        a(var4, var27 >> 16, var0 >> 16, var7, var19);
                        var0 += var9;
                        var27 += var10;
                        var7 += var20;
                     }

                     while (--var3 >= 0) {
                        a(var4, var2 >> 16, var0 >> 16, var7, var19);
                        var0 += var9;
                        var2 += var11;
                        var7 += var20;
                        var4 += C_c.h;
                     }
                  }
               } else {
                  int var28;
                  var2 = var28 = var1 << 16;
                  if (var4 < 0) {
                     var2 -= var9 * var4;
                     var28 -= var10 * var4;
                     var7 -= var20 * (float)var4;
                     var4 = 0;
                  }

                  var0 <<= 16;
                  if (var3 < 0) {
                     var0 -= var11 * var3;
                     var3 = 0;
                  }

                  if (var9 < var10) {
                     var5 -= var3;
                     var3 -= var4;

                     for (var4 = x[var4]; --var3 >= 0; var4 += C_c.h) {
                        a(var4, var2 >> 16, var28 >> 16, var7, var19);
                        var2 += var9;
                        var28 += var10;
                        var7 += var20;
                     }

                     while (--var5 >= 0) {
                        a(var4, var0 >> 16, var28 >> 16, var7, var19);
                        var0 += var11;
                        var28 += var10;
                        var7 += var20;
                        var4 += C_c.h;
                     }
                  } else {
                     var5 -= var3;
                     var3 -= var4;

                     for (var4 = x[var4]; --var3 >= 0; var4 += C_c.h) {
                        a(var4, var28 >> 16, var2 >> 16, var7, var19);
                        var2 += var9;
                        var28 += var10;
                        var7 += var20;
                     }

                     while (--var5 >= 0) {
                        a(var4, var28 >> 16, var0 >> 16, var7, var19);
                        var0 += var11;
                        var28 += var10;
                        var7 += var20;
                        var4 += C_c.h;
                     }
                  }
               }
            }
         } else if (var5 < C_c.k) {
            if (var3 > C_c.k) {
               var3 = C_c.k;
            }

            if (var4 > C_c.k) {
               var4 = C_c.k;
            }

            var8 = var8 - var19 * (float)var2 + var19;
            if (var3 < var4) {
               int var35;
               var1 = var35 = var2 << 16;
               if (var5 < 0) {
                  var1 -= var10 * var5;
                  var35 -= var11 * var5;
                  var8 -= var20 * (float)var5;
                  var5 = 0;
               }

               var0 <<= 16;
               if (var3 < 0) {
                  var0 -= var9 * var3;
                  var3 = 0;
               }

               if (var10 < var11) {
                  var4 -= var3;
                  var3 -= var5;

                  for (var5 = x[var5]; --var3 >= 0; var5 += C_c.h) {
                     a(var5, var1 >> 16, var35 >> 16, var8, var19);
                     var1 += var10;
                     var35 += var11;
                     var8 += var20;
                  }

                  while (--var4 >= 0) {
                     a(var5, var1 >> 16, var0 >> 16, var8, var19);
                     var1 += var10;
                     var0 += var9;
                     var8 += var20;
                     var5 += C_c.h;
                  }
               } else {
                  var4 -= var3;
                  var3 -= var5;

                  for (var5 = x[var5]; --var3 >= 0; var5 += C_c.h) {
                     a(var5, var35 >> 16, var1 >> 16, var8, var19);
                     var1 += var10;
                     var35 += var11;
                     var8 += var20;
                  }

                  while (--var4 >= 0) {
                     a(var5, var0 >> 16, var1 >> 16, var8, var19);
                     var1 += var10;
                     var0 += var9;
                     var8 += var20;
                     var5 += C_c.h;
                  }
               }
            } else {
               int var36;
               var0 = var36 = var2 << 16;
               if (var5 < 0) {
                  var0 -= var10 * var5;
                  var36 -= var11 * var5;
                  var8 -= var20 * (float)var5;
                  var5 = 0;
               }

               var1 <<= 16;
               if (var4 < 0) {
                  var1 -= var9 * var4;
                  var4 = 0;
               }

               if (var10 < var11) {
                  var3 -= var4;
                  var4 -= var5;

                  for (var5 = x[var5]; --var4 >= 0; var5 += C_c.h) {
                     a(var5, var0 >> 16, var36 >> 16, var8, var19);
                     var0 += var10;
                     var36 += var11;
                     var8 += var20;
                  }

                  while (--var3 >= 0) {
                     a(var5, var1 >> 16, var36 >> 16, var8, var19);
                     var1 += var9;
                     var36 += var11;
                     var8 += var20;
                     var5 += C_c.h;
                  }
               } else {
                  var3 -= var4;
                  var4 -= var5;

                  for (var5 = x[var5]; --var4 >= 0; var5 += C_c.h) {
                     a(var5, var36 >> 16, var0 >> 16, var8, var19);
                     var0 += var10;
                     var36 += var11;
                     var8 += var20;
                  }

                  while (--var3 >= 0) {
                     a(var5, var36 >> 16, var1 >> 16, var8, var19);
                     var1 += var9;
                     var36 += var11;
                     var8 += var20;
                     var5 += C_c.h;
                  }
               }
            }
         }
      }
   }

   private static void a(int var0, int var1, int var2, float var3, float var4) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var0 <= d()) {
            var0 += 3064;
         }

         int var5 = C_c.f.length;
         if (o) {
            if (var2 > C_c.h) {
               var2 = C_c.h;
            }

            if (var1 < 0) {
               var1 = 0;
            }
         }

         if (var1 < var2) {
            var0 += var1 - 1;
            int var6 = var2 - var1 >> 2;
            var3 += var4 * (float)var1;
            if (r == 0) {
               while (--var6 >= 0) {
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
               }

               for (int var22 = var2 - var1 & 3; --var22 >= 0; var3 += var4) {
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }
               }
            } else {
               while (--var6 >= 0) {
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }

                  var3 += var4;
               }

               for (int var21 = var2 - var1 & 3; --var21 >= 0; var3 += var4) {
                  var0++;
                  if (var0 >= 0 && var0 < var5) {
                     C_c.f[var0] = var3;
                  }
               }
            }
         }
      }
   }

   public static void c(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18
   ) {
      if (!rs.p_k.C_e.a() || h) {
         var6 = 127 - var6 << 1;
         var7 = 127 - var7 << 1;
         var8 = 127 - var8 << 1;
         int[] var19 = d(var18);
         D = !G[var18];
         var10 = var9 - var10;
         var13 = var12 - var13;
         var16 = var15 - var16;
         var11 -= var9;
         var14 -= var12;
         var17 -= var15;
         int var20 = var11 * var12 - var14 * var9 << 14;
         int var21 = var14 * var15 - var17 * var12 << 8;
         int var22 = var17 * var9 - var11 * var15 << 5;
         int var23 = var10 * var12 - var13 * var9 << 14;
         int var24 = var13 * var15 - var16 * var12 << 8;
         int var25 = var16 * var9 - var10 * var15 << 5;
         int var26 = var13 * var11 - var10 * var14 << 14;
         int var27 = var16 * var14 - var13 * var17 << 8;
         int var28 = var10 * var17 - var16 * var11 << 5;
         int var29 = 0;
         int var30 = 0;
         if (var1 != var0) {
            var29 = (var4 - var3 << 16) / (var1 - var0);
            var30 = (var7 - var6 << 16) / (var1 - var0);
         }

         int var31 = 0;
         int var32 = 0;
         if (var2 != var1) {
            var31 = (var5 - var4 << 16) / (var2 - var1);
            var32 = (var8 - var7 << 16) / (var2 - var1);
         }

         int var33 = 0;
         int var34 = 0;
         if (var2 != var0) {
            var33 = (var3 - var5 << 16) / (var0 - var2);
            var34 = (var6 - var8 << 16) / (var0 - var2);
         }

         if (var0 <= var1 && var0 <= var2) {
            if (var0 < C_c.k) {
               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var1 < var2) {
                  int var77;
                  var5 = var77 = var3 << 16;
                  int var96;
                  var8 = var96 = var6 << 16;
                  if (var0 < 0) {
                     var5 -= var33 * var0;
                     var77 -= var29 * var0;
                     var8 -= var34 * var0;
                     var96 -= var30 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  var7 <<= 16;
                  if (var1 < 0) {
                     var4 -= var31 * var1;
                     var7 -= var32 * var1;
                     var1 = 0;
                  }

                  int var139 = var0 - t;
                  var20 += var22 * var139;
                  var23 += var25 * var139;
                  var26 += var28 * var139;
                  if ((var0 == var1 || var33 >= var29) && (var0 != var1 || var33 <= var31)) {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var26 += var28) {
                        b(C_c.g, var19, var0, var77 >> 16, var5 >> 16, var96, var8, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var77 += var29;
                        var8 += var34;
                        var96 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        b(C_c.g, var19, var0, var4 >> 16, var5 >> 16, var7, var8, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var4 += var31;
                        var8 += var34;
                        var7 += var32;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var26 += var28) {
                        b(C_c.g, var19, var0, var5 >> 16, var77 >> 16, var8, var96, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var77 += var29;
                        var8 += var34;
                        var96 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        b(C_c.g, var19, var0, var5 >> 16, var4 >> 16, var8, var7, var20, var23, var26, var21, var24, var27);
                        var5 += var33;
                        var4 += var31;
                        var8 += var34;
                        var7 += var32;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               } else {
                  int var76;
                  var4 = var76 = var3 << 16;
                  int var95;
                  var7 = var95 = var6 << 16;
                  if (var0 < 0) {
                     var4 -= var33 * var0;
                     var76 -= var29 * var0;
                     var7 -= var34 * var0;
                     var95 -= var30 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 16;
                  if (var2 < 0) {
                     var5 -= var31 * var2;
                     var8 -= var32 * var2;
                     var2 = 0;
                  }

                  int var138 = var0 - t;
                  var20 += var22 * var138;
                  var23 += var25 * var138;
                  var26 += var28 * var138;
                  if ((var0 == var2 || var33 >= var29) && (var0 != var2 || var31 <= var29)) {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var26 += var28) {
                        b(C_c.g, var19, var0, var76 >> 16, var4 >> 16, var95, var7, var20, var23, var26, var21, var24, var27);
                        var4 += var33;
                        var76 += var29;
                        var7 += var34;
                        var95 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var1 >= 0) {
                        b(C_c.g, var19, var0, var76 >> 16, var5 >> 16, var95, var8, var20, var23, var26, var21, var24, var27);
                        var5 += var31;
                        var76 += var29;
                        var8 += var32;
                        var95 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var26 += var28) {
                        b(C_c.g, var19, var0, var4 >> 16, var76 >> 16, var7, var95, var20, var23, var26, var21, var24, var27);
                        var4 += var33;
                        var76 += var29;
                        var7 += var34;
                        var95 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var1 >= 0) {
                        b(C_c.g, var19, var0, var5 >> 16, var76 >> 16, var8, var95, var20, var23, var26, var21, var24, var27);
                        var5 += var31;
                        var76 += var29;
                        var8 += var32;
                        var95 += var30;
                        var0 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < C_c.k) {
               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var2 < var0) {
                  int var81;
                  var3 = var81 = var4 << 16;
                  int var101;
                  var6 = var101 = var7 << 16;
                  if (var1 < 0) {
                     var3 -= var29 * var1;
                     var81 -= var31 * var1;
                     var6 -= var30 * var1;
                     var101 -= var32 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  var8 <<= 16;
                  if (var2 < 0) {
                     var5 -= var33 * var2;
                     var8 -= var34 * var2;
                     var2 = 0;
                  }

                  int var137 = var1 - t;
                  var20 += var22 * var137;
                  var23 += var25 * var137;
                  var26 += var28 * var137;
                  if ((var1 == var2 || var29 >= var31) && (var1 != var2 || var29 <= var33)) {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var26 += var28) {
                        b(C_c.g, var19, var1, var81 >> 16, var3 >> 16, var101, var6, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var81 += var31;
                        var6 += var30;
                        var101 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var0 >= 0) {
                        b(C_c.g, var19, var1, var5 >> 16, var3 >> 16, var8, var6, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var5 += var33;
                        var6 += var30;
                        var8 += var34;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var26 += var28) {
                        b(C_c.g, var19, var1, var3 >> 16, var81 >> 16, var6, var101, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var81 += var31;
                        var6 += var30;
                        var101 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var0 >= 0) {
                        b(C_c.g, var19, var1, var3 >> 16, var5 >> 16, var6, var8, var20, var23, var26, var21, var24, var27);
                        var3 += var29;
                        var5 += var33;
                        var6 += var30;
                        var8 += var34;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               } else {
                  int var80;
                  var5 = var80 = var4 << 16;
                  int var100;
                  var8 = var100 = var7 << 16;
                  if (var1 < 0) {
                     var5 -= var29 * var1;
                     var80 -= var31 * var1;
                     var8 -= var30 * var1;
                     var100 -= var32 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  var6 <<= 16;
                  if (var0 < 0) {
                     var3 -= var33 * var0;
                     var6 -= var34 * var0;
                     var0 = 0;
                  }

                  int var136 = var1 - t;
                  var20 += var22 * var136;
                  var23 += var25 * var136;
                  var26 += var28 * var136;
                  if (var29 < var31) {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var26 += var28) {
                        b(C_c.g, var19, var1, var5 >> 16, var80 >> 16, var8, var100, var20, var23, var26, var21, var24, var27);
                        var5 += var29;
                        var80 += var31;
                        var8 += var30;
                        var100 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        b(C_c.g, var19, var1, var3 >> 16, var80 >> 16, var6, var100, var20, var23, var26, var21, var24, var27);
                        var3 += var33;
                        var80 += var31;
                        var6 += var34;
                        var100 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var26 += var28) {
                        b(C_c.g, var19, var1, var80 >> 16, var5 >> 16, var100, var8, var20, var23, var26, var21, var24, var27);
                        var5 += var29;
                        var80 += var31;
                        var8 += var30;
                        var100 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                     }

                     while (--var2 >= 0) {
                        b(C_c.g, var19, var1, var80 >> 16, var3 >> 16, var100, var6, var20, var23, var26, var21, var24, var27);
                        var3 += var33;
                        var80 += var31;
                        var6 += var34;
                        var100 += var32;
                        var1 += C_c.h;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                     }
                  }
               }
            }
         } else if (var2 < C_c.k) {
            if (var0 > C_c.k) {
               var0 = C_c.k;
            }

            if (var1 > C_c.k) {
               var1 = C_c.k;
            }

            if (var0 < var1) {
               int var85;
               var4 = var85 = var5 << 16;
               int var106;
               var7 = var106 = var8 << 16;
               if (var2 < 0) {
                  var4 -= var31 * var2;
                  var85 -= var33 * var2;
                  var7 -= var32 * var2;
                  var106 -= var34 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               var6 <<= 16;
               if (var0 < 0) {
                  var3 -= var29 * var0;
                  var6 -= var30 * var0;
                  var0 = 0;
               }

               int var135 = var2 - t;
               var20 += var22 * var135;
               var23 += var25 * var135;
               var26 += var28 * var135;
               if (var31 < var33) {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var26 += var28) {
                     b(C_c.g, var19, var2, var4 >> 16, var85 >> 16, var7, var106, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var85 += var33;
                     var7 += var32;
                     var106 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var1 >= 0) {
                     b(C_c.g, var19, var2, var4 >> 16, var3 >> 16, var7, var6, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var3 += var29;
                     var7 += var32;
                     var6 += var30;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var26 += var28) {
                     b(C_c.g, var19, var2, var85 >> 16, var4 >> 16, var106, var7, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var85 += var33;
                     var7 += var32;
                     var106 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var1 >= 0) {
                     b(C_c.g, var19, var2, var3 >> 16, var4 >> 16, var6, var7, var20, var23, var26, var21, var24, var27);
                     var4 += var31;
                     var3 += var29;
                     var7 += var32;
                     var6 += var30;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               }
            } else {
               int var84;
               var3 = var84 = var5 << 16;
               int var105;
               var6 = var105 = var8 << 16;
               if (var2 < 0) {
                  var3 -= var31 * var2;
                  var84 -= var33 * var2;
                  var6 -= var32 * var2;
                  var105 -= var34 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               var7 <<= 16;
               if (var1 < 0) {
                  var4 -= var29 * var1;
                  var7 -= var30 * var1;
                  var1 = 0;
               }

               int var35 = var2 - t;
               var20 += var22 * var35;
               var23 += var25 * var35;
               var26 += var28 * var35;
               if (var31 < var33) {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var26 += var28) {
                     b(C_c.g, var19, var2, var3 >> 16, var84 >> 16, var6, var105, var20, var23, var26, var21, var24, var27);
                     var3 += var31;
                     var84 += var33;
                     var6 += var32;
                     var105 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var0 >= 0) {
                     b(C_c.g, var19, var2, var4 >> 16, var84 >> 16, var7, var105, var20, var23, var26, var21, var24, var27);
                     var4 += var29;
                     var84 += var33;
                     var7 += var30;
                     var105 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var26 += var28) {
                     b(C_c.g, var19, var2, var84 >> 16, var3 >> 16, var105, var6, var20, var23, var26, var21, var24, var27);
                     var3 += var31;
                     var84 += var33;
                     var6 += var32;
                     var105 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                  }

                  while (--var0 >= 0) {
                     b(C_c.g, var19, var2, var84 >> 16, var4 >> 16, var105, var7, var20, var23, var26, var21, var24, var27);
                     var4 += var29;
                     var84 += var33;
                     var7 += var30;
                     var105 += var34;
                     var2 += C_c.h;
                     var20 += var22;
                     var23 += var25;
                     var26 += var28;
                  }
               }
            }
         }
      }
   }

   private static void b(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      if (!rs.p_k.C_e.a() || h) {
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai() && q && var2 <= d()) {
            var2 += 3064;
         }

         int var13 = 0;
         int var14 = 0;
         if (var3 < var4) {
            int var15 = (var6 - var5) / (var4 - var3);
            if (o) {
               if (var4 > C_c.n) {
                  var4 = C_c.n;
               }

               if (var3 < 0) {
                  var5 -= var3 * var15;
                  var3 = 0;
               }
            }

            if (var3 < var4) {
               int var16 = var4 - var3 >> 3;
               var2 += var3;
               if (!n && !rs.p_k.C_e.a()) {
                  int var158 = 0;
                  int var159 = 0;
                  int var160 = var3 - s;
                  var7 += (var10 >> 3) * var160;
                  var8 += (var11 >> 3) * var160;
                  var9 += (var12 >> 3) * var160;
                  int var162 = var9 >> 14;
                  if (var162 != 0) {
                     var13 = var7 / var162;
                     var14 = var8 / var162;
                     if (var13 < 0) {
                        var13 = 0;
                     } else if (var13 > 16256) {
                        var13 = 16256;
                     }
                  }

                  var7 += var10;
                  var8 += var11;
                  var9 += var12;
                  var162 = var9 >> 14;
                  if (var162 != 0) {
                     var158 = var7 / var162;
                     var159 = var8 / var162;
                     if (var158 < 7) {
                        var158 = 7;
                     } else if (var158 > 16256) {
                        var158 = 16256;
                     }
                  }

                  int var164 = var158 - var13 >> 3;
                  int var165 = var159 - var14 >> 3;
                  if (!D) {
                     while (var16-- > 0) {
                        int var192;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var227 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var227 & -16711936) + ((var192 & 0xFF00) * var227 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var228 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var228 & -16711936) + ((var192 & 0xFF00) * var228 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var229 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var229 & -16711936) + ((var192 & 0xFF00) * var229 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var230 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var230 & -16711936) + ((var192 & 0xFF00) * var230 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var231 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var231 & -16711936) + ((var192 & 0xFF00) * var231 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var232 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var232 & -16711936) + ((var192 & 0xFF00) * var232 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var233 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var233 & -16711936) + ((var192 & 0xFF00) * var233 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        if ((var192 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var234 = var5 >> 16;
                           var0[var2] = ((var192 & 16711935) * var234 & -16711936) + ((var192 & 0xFF00) * var234 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var7 += var10;
                        var8 += var11;
                        var9 += var12;
                        int var238 = var9 >> 14;
                        if (var238 != 0) {
                           var158 = var7 / var238;
                           var159 = var8 / var238;
                           if (var158 < 7) {
                              var158 = 7;
                           } else if (var158 > 16256) {
                              var158 = 16256;
                           }
                        }

                        var164 = var158 - var13 >> 3;
                        var165 = var159 - var14 >> 3;
                        var5 += var15;
                     }

                     for (int var200 = var4 - var3 & 7; var200-- > 0; var5 += var15) {
                        int var235;
                        if ((var235 = var1[(var14 & 16256) + (var13 >> 7)]) != 0) {
                           int var239 = var5 >> 16;
                           var0[var2] = ((var235 & 16711935) * var239 & -16711936) + ((var235 & 0xFF00) * var239 & 0xFF0000) >> 8;
                        }

                        var2++;
                        var13 += var164;
                        var14 += var165;
                     }
                  } else {
                     while (var16-- > 0) {
                        int var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        int var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var183 = var1[(var14 & 16256) + (var13 >> 7)];
                        var218 = var5 >> 16;
                        var0[var2++] = ((var183 & 16711935) * var218 & -16711936) + ((var183 & 0xFF00) * var218 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                        var5 += var15;
                        var7 += var10;
                        var8 += var11;
                        var9 += var12;
                        int var237 = var9 >> 14;
                        if (var237 != 0) {
                           var158 = var7 / var237;
                           var159 = var8 / var237;
                           if (var158 < 7) {
                              var158 = 7;
                           } else if (var158 > 16256) {
                              var158 = 16256;
                           }
                        }

                        var164 = var158 - var13 >> 3;
                        var165 = var159 - var14 >> 3;
                        var5 += var15;
                     }

                     for (int var157 = var4 - var3 & 7; var157-- > 0; var5 += var15) {
                        int var191 = var1[(var14 & 16256) + (var13 >> 7)];
                        int var226 = var5 >> 16;
                        var0[var2++] = ((var191 & 16711935) * var226 & -16711936) + ((var191 & 0xFF00) * var226 & 0xFF0000) >> 8;
                        var13 += var164;
                        var14 += var165;
                     }
                  }
               } else {
                  int var17 = 0;
                  int var18 = 0;
                  int var19 = var3 - s;
                  var7 += (var10 >> 3) * var19;
                  var8 += (var11 >> 3) * var19;
                  var9 += (var12 >> 3) * var19;
                  int var20 = var9 >> 12;
                  if (var20 != 0) {
                     var13 = var7 / var20;
                     var14 = var8 / var20;
                     if (var13 < 0) {
                        var13 = 0;
                     } else if (var13 > 4032) {
                        var13 = 4032;
                     }
                  }

                  var7 += var10;
                  var8 += var11;
                  var9 += var12;
                  var20 = var9 >> 12;
                  if (var20 != 0) {
                     var17 = var7 / var20;
                     var18 = var8 / var20;
                     if (var17 < 7) {
                        var17 = 7;
                     } else if (var17 > 4032) {
                        var17 = 4032;
                     }
                  }

                  int var21 = var17 - var13 >> 3;
                  int var22 = var18 - var14 >> 3;
                  if (!D) {
                     while (var16-- > 0) {
                        int var174;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var209 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var209 & -16711936) + ((var174 & 0xFF00) * var209 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var209 & -16711936) + ((var174 & 0xFF00) * var209 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var210 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var210 & -16711936) + ((var174 & 0xFF00) * var210 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var210 & -16711936) + ((var174 & 0xFF00) * var210 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var211 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var211 & -16711936) + ((var174 & 0xFF00) * var211 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var211 & -16711936) + ((var174 & 0xFF00) * var211 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var212 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var212 & -16711936) + ((var174 & 0xFF00) * var212 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var212 & -16711936) + ((var174 & 0xFF00) * var212 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var213 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var213 & -16711936) + ((var174 & 0xFF00) * var213 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var213 & -16711936) + ((var174 & 0xFF00) * var213 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var214 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var214 & -16711936) + ((var174 & 0xFF00) * var214 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var214 & -16711936) + ((var174 & 0xFF00) * var214 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var215 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var215 & -16711936) + ((var174 & 0xFF00) * var215 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var215 & -16711936) + ((var174 & 0xFF00) * var215 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        if ((var174 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var216 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var174 & 16711935) * var216 & -16711936) + ((var174 & 0xFF00) * var216 & 0xFF0000) >> 8,
                              ((var174 & 16711935) * var216 & -16711936) + ((var174 & 0xFF00) * var216 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var7 += var10;
                        var8 += var11;
                        var9 += var12;
                        int var236 = var9 >> 12;
                        if (var236 != 0) {
                           var17 = var7 / var236;
                           var18 = var8 / var236;
                           if (var17 < 7) {
                              var17 = 7;
                           } else if (var17 > 4032) {
                              var17 = 4032;
                           }
                        }

                        var21 = var17 - var13 >> 3;
                        var22 = var18 - var14 >> 3;
                        var5 += var15;
                     }

                     for (int var156 = var4 - var3 & 7; var156-- > 0; var5 += var15) {
                        int var182;
                        if ((var182 = var1[(var14 & 4032) + (var13 >> 6)]) != 0) {
                           int var217 = var5 >> 16;
                           C_c.a(
                              var0,
                              var2,
                              ((var182 & 16711935) * var217 & -16711936) + ((var182 & 0xFF00) * var217 & 0xFF0000) >> 8,
                              ((var182 & 16711935) * var217 & -16711936) + ((var182 & 0xFF00) * var217 & 0xFF0000) >> 8,
                              255
                           );
                        }

                        var2++;
                        var13 += var21;
                        var14 += var22;
                     }
                  } else {
                     while (var16-- > 0) {
                        int var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        int var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var23 = var1[(var14 & 4032) + (var13 >> 6)];
                        var24 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           ((var23 & 16711935) * var24 & -16711936) + ((var23 & 0xFF00) * var24 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                        var5 += var15;
                        var7 += var10;
                        var8 += var11;
                        var9 += var12;
                        int var25 = var9 >> 12;
                        if (var25 != 0) {
                           var17 = var7 / var25;
                           var18 = var8 / var25;
                           if (var17 < 7) {
                              var17 = 7;
                           } else if (var17 > 4032) {
                              var17 = 4032;
                           }
                        }

                        var21 = var17 - var13 >> 3;
                        var22 = var18 - var14 >> 3;
                        var5 += var15;
                     }

                     for (int var155 = var4 - var3 & 7; var155-- > 0; var5 += var15) {
                        int var173 = var1[(var14 & 4032) + (var13 >> 6)];
                        int var208 = var5 >> 16;
                        C_c.a(
                           var0,
                           var2++,
                           ((var173 & 16711935) * var208 & -16711936) + ((var173 & 0xFF00) * var208 & 0xFF0000) >> 8,
                           ((var173 & 16711935) * var208 & -16711936) + ((var173 & 0xFF00) * var208 & 0xFF0000) >> 8,
                           255
                        );
                        var13 += var21;
                        var14 += var22;
                     }
                  }
               }
            }
         }
      }
   }

   public static void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (!rs.p_k.C_e.a() || h) {
         int var7 = 0;
         if (var1 != var0) {
            var7 = (var4 - var3 << 16) / (var1 - var0);
         }

         int var8 = 0;
         if (var2 != var1) {
            var8 = (var5 - var4 << 16) / (var2 - var1);
         }

         int var9 = 0;
         if (var2 != var0) {
            var9 = (var3 - var5 << 16) / (var0 - var2);
         }

         if (var0 <= var1 && var0 <= var2) {
            if (var0 < C_c.k) {
               if (var1 > C_c.k) {
                  var1 = C_c.k;
               }

               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var1 < var2) {
                  int var51;
                  var5 = var51 = var3 << 16;
                  if (var0 < 0) {
                     var5 -= var9 * var0;
                     var51 -= var7 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  if (var1 < 0) {
                     var4 -= var8 * var1;
                     var1 = 0;
                  }

                  if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var51 >> 16, var5 >> 16);
                        var5 += var9;
                        var51 += var7;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var0, var6, var4 >> 16, var5 >> 16);
                        var5 += var9;
                        var4 += var8;
                        var0 += C_c.h;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = x[var0]; --var1 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var5 >> 16, var51 >> 16);
                        var5 += var9;
                        var51 += var7;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var0, var6, var5 >> 16, var4 >> 16);
                        var5 += var9;
                        var4 += var8;
                        var0 += C_c.h;
                     }
                  }
               } else {
                  int var50;
                  var4 = var50 = var3 << 16;
                  if (var0 < 0) {
                     var4 -= var9 * var0;
                     var50 -= var7 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  if (var2 < 0) {
                     var5 -= var8 * var2;
                     var2 = 0;
                  }

                  if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var50 >> 16, var4 >> 16);
                        var4 += var9;
                        var50 += var7;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var0, var6, var50 >> 16, var5 >> 16);
                        var5 += var8;
                        var50 += var7;
                        var0 += C_c.h;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = x[var0]; --var2 >= 0; var0 += C_c.h) {
                        a(C_c.g, var0, var6, var4 >> 16, var50 >> 16);
                        var4 += var9;
                        var50 += var7;
                     }

                     while (--var1 >= 0) {
                        a(C_c.g, var0, var6, var5 >> 16, var50 >> 16);
                        var5 += var8;
                        var50 += var7;
                        var0 += C_c.h;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < C_c.k) {
               if (var2 > C_c.k) {
                  var2 = C_c.k;
               }

               if (var0 > C_c.k) {
                  var0 = C_c.k;
               }

               if (var2 < var0) {
                  int var55;
                  var3 = var55 = var4 << 16;
                  if (var1 < 0) {
                     var3 -= var7 * var1;
                     var55 -= var8 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  if (var2 < 0) {
                     var5 -= var9 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var55 >> 16, var3 >> 16);
                        var3 += var7;
                        var55 += var8;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var1, var6, var5 >> 16, var3 >> 16);
                        var3 += var7;
                        var5 += var9;
                        var1 += C_c.h;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = x[var1]; --var2 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var3 >> 16, var55 >> 16);
                        var3 += var7;
                        var55 += var8;
                     }

                     while (--var0 >= 0) {
                        a(C_c.g, var1, var6, var3 >> 16, var5 >> 16);
                        var3 += var7;
                        var5 += var9;
                        var1 += C_c.h;
                     }
                  }
               } else {
                  int var54;
                  var5 = var54 = var4 << 16;
                  if (var1 < 0) {
                     var5 -= var7 * var1;
                     var54 -= var8 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  if (var0 < 0) {
                     var3 -= var9 * var0;
                     var0 = 0;
                  }

                  if (var7 < var8) {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var5 >> 16, var54 >> 16);
                        var5 += var7;
                        var54 += var8;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var1, var6, var3 >> 16, var54 >> 16);
                        var3 += var9;
                        var54 += var8;
                        var1 += C_c.h;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = x[var1]; --var0 >= 0; var1 += C_c.h) {
                        a(C_c.g, var1, var6, var54 >> 16, var5 >> 16);
                        var5 += var7;
                        var54 += var8;
                     }

                     while (--var2 >= 0) {
                        a(C_c.g, var1, var6, var54 >> 16, var3 >> 16);
                        var3 += var9;
                        var54 += var8;
                        var1 += C_c.h;
                     }
                  }
               }
            }
         } else if (var2 < C_c.k) {
            if (var0 > C_c.k) {
               var0 = C_c.k;
            }

            if (var1 > C_c.k) {
               var1 = C_c.k;
            }

            if (var0 < var1) {
               int var59;
               var4 = var59 = var5 << 16;
               if (var2 < 0) {
                  var4 -= var8 * var2;
                  var59 -= var9 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               if (var0 < 0) {
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               if (var8 < var9) {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var4 >> 16, var59 >> 16);
                     var4 += var8;
                     var59 += var9;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var2, var6, var4 >> 16, var3 >> 16);
                     var4 += var8;
                     var3 += var7;
                     var2 += C_c.h;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = x[var2]; --var0 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var59 >> 16, var4 >> 16);
                     var4 += var8;
                     var59 += var9;
                  }

                  while (--var1 >= 0) {
                     a(C_c.g, var2, var6, var3 >> 16, var4 >> 16);
                     var4 += var8;
                     var3 += var7;
                     var2 += C_c.h;
                  }
               }
            } else {
               int var58;
               var3 = var58 = var5 << 16;
               if (var2 < 0) {
                  var3 -= var8 * var2;
                  var58 -= var9 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               if (var1 < 0) {
                  var4 -= var7 * var1;
                  var1 = 0;
               }

               if (var8 < var9) {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var3 >> 16, var58 >> 16);
                     var3 += var8;
                     var58 += var9;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var2, var6, var4 >> 16, var58 >> 16);
                     var4 += var7;
                     var58 += var9;
                     var2 += C_c.h;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = x[var2]; --var1 >= 0; var2 += C_c.h) {
                     a(C_c.g, var2, var6, var58 >> 16, var3 >> 16);
                     var3 += var8;
                     var58 += var9;
                  }

                  while (--var0 >= 0) {
                     a(C_c.g, var2, var6, var58 >> 16, var4 >> 16);
                     var4 += var7;
                     var58 += var9;
                     var2 += C_c.h;
                  }
               }
            }
         }
      }
   }

   public static final int b(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }

   public static final int c(int var0, int var1, int var2, int var3) {
      return var3 * var0 + var2 * var1 >> 16;
   }

   public static final int d(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   public static final int e(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
   }

   static {
      for (int var0 = 1; var0 < 512; var0++) {
         E[var0] = 32768 / var0;
      }

      for (int var1 = 1; var1 < 2048; var1++) {
         u[var1] = 65536 / var1;
      }

      for (int var2 = 0; var2 < 2048; var2++) {
         v[var2] = (int)(65536.0 * Math.sin((double)var2 * 0.0030679615));
         w[var2] = (int)(65536.0 * Math.cos((double)var2 * 0.0030679615));
      }
   }
}
