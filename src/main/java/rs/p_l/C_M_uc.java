package rs.p_l;

public class C_M_uc extends C_c {
   public static int q;
   public static int r = 0;
   public static int[] s;
   public static int t = 0;
   public static int u;
   public static int[] v;
   public static int w = 0;
   public static int x = 0;
   public static int[] y;

   public static void f(int var0, int var1, int var2, int var3, int var4) {
      h(var0, var1, var2, var4);
      h(var0, var1 + var3 - 1, var2, var4);
      i(var0, var1, var3, var4);
      i(var0 + var2 - 1, var1, var3, var4);
   }

   public static void e() {
      t = 0;
      w = 0;
      r = u;
      x = q;
      h();
   }

   public static void g(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            h(var0, var1, var2 + 1, var4);
         } else {
            h(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            i(var0, var1, var3 + 1, var4);
         } else {
            i(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5);
            var2 += var0;
            if (var0 < t) {
               var1 += var5 * (t - var0);
               var0 = t;
            }

            if (var2 >= r) {
               var2 = r - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= w && var6 < x) {
                  v[var0 + var6 * var2] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / (double)var3 + 0.5);
            var3 += var1;
            if (var1 < w) {
               var0 += var17 * (w - var1);
               var1 = w;
            }

            if (var3 >= x) {
               var3 = x - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= t && var18 < r) {
                  v[var18 + var1 * var2] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   public static void f() {
      int var0 = 0;

      int var1;
      for (var1 = u * q - 7; var0 < var1; v[var0++] = 0) {
         v[var0++] = 0;
         v[var0++] = 0;
         v[var0++] = 0;
         v[var0++] = 0;
         v[var0++] = 0;
         v[var0++] = 0;
         v[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         v[var0++] = 0;
      }
   }

   public static void a(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * u;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            v[var6++] = var2;
         }

         var5 += u;
      }
   }

   public static void g() {
      v = null;
      s = null;
      y = null;
   }

   public static void h(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= t && var0 < r) {
         if (var1 < w) {
            var2 -= w - var1;
            var1 = w;
         }

         if (var1 + var2 > x) {
            var2 = x - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var9 = var0 + var1 * u;

         for (int var10 = 0; var10 < var2; var10++) {
            int var11 = (v[var9] >> 16 & 0xFF) * var5;
            int var12 = (v[var9] >> 8 & 0xFF) * var5;
            int var13 = (v[var9] & 0xFF) * var5;
            int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
            v[var9] = var14;
            var9 += u;
         }
      }
   }

   public static void a(int[] var0) {
      t = var0[0];
      w = var0[1];
      r = var0[2];
      x = var0[3];
      h();
   }

   public static void b(int var0, int var1, int var2) {
      if (var0 >= t && var1 >= w && var0 < r && var1 < x) {
         v[var0 + var1 * u] = var2;
      }
   }

   public static void a(int[] var0, int[] var1) {
      if (var0.length == x - w && var1.length == x - w) {
         s = var0;
         y = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static void e(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         b(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < w) {
            var4 = w;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > x) {
            var5 = x;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < t) {
               var12 = t;
            }

            int var13 = var0 + var8;
            if (var13 > r) {
               var13 = r;
            }

            int var14 = var12 + var6 * u;

            for (int var15 = var12; var15 < var13; var15++) {
               v[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < t) {
               var21 = t;
            }

            int var22 = var0 + var8;
            if (var22 > r - 1) {
               var22 = r - 1;
            }

            int var23 = var21 + var6 * u;

            for (int var24 = var21; var24 <= var22; var24++) {
               v[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   public static void f(int var0, int var1, int var2, int var3) {
      if (t < var0) {
         t = var0;
      }

      if (w < var1) {
         w = var1;
      }

      if (r > var2) {
         r = var2;
      }

      if (x > var3) {
         x = var3;
      }

      h();
   }

   public static void g(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > u) {
         var2 = u;
      }

      if (var3 > q) {
         var3 = q;
      }

      t = var0;
      w = var1;
      r = var2;
      x = var3;
      h();
   }

   public static void h(int var0, int var1, int var2, int var3) {
      if (var1 >= w && var1 < x) {
         if (var0 < t) {
            var2 -= t - var0;
            var0 = t;
         }

         if (var0 + var2 > r) {
            var2 = r - var0;
         }

         int var4 = var0 + var1 * u;

         for (int var5 = 0; var5 < var2; var5++) {
            v[var4 + var5] = var3;
         }
      }
   }

   public static void i(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= w && var1 < x) {
         if (var0 < t) {
            var2 -= t - var0;
            var0 = t;
         }

         if (var0 + var2 > r) {
            var2 = r - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var9 = var0 + var1 * u;

         for (int var10 = 0; var10 < var2; var10++) {
            int var11 = (v[var9] >> 16 & 0xFF) * var5;
            int var12 = (v[var9] >> 8 & 0xFF) * var5;
            int var13 = (v[var9] & 0xFF) * var5;
            int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
            v[var9++] = var14;
         }
      }
   }

   public static void i(int var0, int var1, int var2, int var3) {
      if (var0 >= t && var0 < r) {
         if (var1 < w) {
            var2 -= w - var1;
            var1 = w;
         }

         if (var1 + var2 > x) {
            var2 = x - var1;
         }

         int var4 = var0 + var1 * u;

         for (int var5 = 0; var5 < var2; var5++) {
            v[var4 + var5 * u] = var3;
         }
      }
   }

   public static void b(int[] var0, int var1, int var2) {
      v = var0;
      u = var1;
      q = var2;
      g(0, 0, var1, var2);
   }

   public static void g(int var0, int var1, int var2, int var3, int var4, int var5) {
      i(var0, var1, var2, var4, var5);
      i(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         h(var0, var1 + 1, var3 - 2, var4, var5);
         h(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   public static void j(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            e(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 0xFF) * var4;
            int var8 = (var3 & 0xFF) * var4;
            int var9 = var1 - var2;
            if (var9 < w) {
               var9 = w;
            }

            int var10 = var1 + var2 + 1;
            if (var10 > x) {
               var10 = x;
            }

            int var11 = var9;
            int var12 = var2 * var2;
            int var13 = 0;
            int var14 = var1 - var9;
            int var15 = var14 * var14;
            int var16 = var15 - var14;
            if (var1 > var10) {
               var1 = var10;
            }

            while (var11 < var1) {
               while (var16 <= var12 || var15 <= var12) {
                  var15 += var13 + var13;
                  var16 += var13++ + var13;
               }

               int var17 = var0 - var13 + 1;
               if (var17 < t) {
                  var17 = t;
               }

               int var18 = var0 + var13;
               if (var18 > r) {
                  var18 = r;
               }

               int var19 = var17 + var11 * u;

               for (int var20 = var17; var20 < var18; var20++) {
                  int var21 = (v[var19] >> 16 & 0xFF) * var5;
                  int var22 = (v[var19] >> 8 & 0xFF) * var5;
                  int var23 = (v[var19] & 0xFF) * var5;
                  int var24 = (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8) + (var8 + var23 >> 8);
                  v[var19++] = var24;
               }

               var11++;
               var15 -= var14-- + var14;
               var16 -= var14 + var14;
            }

            var13 = var2;
            var14 = -var14;
            var16 = var14 * var14 + var12;
            var15 = var16 - var2;

            for (int var29 = var16 - var14; var11 < var10; var15 += var14++ + var14) {
               while (var29 > var12 && var15 > var12) {
                  var29 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               int var30 = var0 - var13;
               if (var30 < t) {
                  var30 = t;
               }

               int var31 = var0 + var13;
               if (var31 > r - 1) {
                  var31 = r - 1;
               }

               int var32 = var30 + var11 * u;

               for (int var33 = var30; var33 <= var31; var33++) {
                  int var34 = (v[var32] >> 16 & 0xFF) * var5;
                  int var35 = (v[var32] >> 8 & 0xFF) * var5;
                  int var36 = (v[var32] & 0xFF) * var5;
                  int var37 = (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8) + (var8 + var36 >> 8);
                  v[var32++] = var37;
               }

               var11++;
               var29 += var14 + var14;
            }
         }
      }
   }

   public static void h(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < t) {
         var2 -= t - var0;
         var0 = t;
      }

      if (var1 < w) {
         var3 -= w - var1;
         var1 = w;
      }

      if (var0 + var2 > r) {
         var2 = r - var0;
      }

      if (var1 + var3 > x) {
         var3 = x - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = u - var2;
      int var8 = var0 + var1 * u;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = v[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
            v[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   public static void b(int[] var0) {
      var0[0] = t;
      var0[1] = w;
      var0[2] = r;
      var0[3] = x;
   }

   public static void i(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 65536 / var3;
      if (var0 < t) {
         var2 -= t - var0;
         var0 = t;
      }

      if (var1 < w) {
         var6 += (w - var1) * var7;
         var3 -= w - var1;
         var1 = w;
      }

      if (var0 + var2 > r) {
         var2 = r - var0;
      }

      if (var1 + var3 > x) {
         var3 = x - var1;
      }

      int var8 = u - var2;
      int var9 = var0 + var1 * u;

      for (int var10 = -var3; var10 < 0; var10++) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000) >>> 8;

         for (int var14 = -var2; var14 < 0; var14++) {
            v[var9++] = var13;
         }

         var9 += var8;
         var6 += var7;
      }
   }

   public static void h() {
      s = null;
      y = null;
   }

   public static void k(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < t) {
         var2 -= t - var0;
         var0 = t;
      }

      if (var1 < w) {
         var3 -= w - var1;
         var1 = w;
      }

      if (var0 + var2 > r) {
         var2 = r - var0;
      }

      if (var1 + var3 > x) {
         var3 = x - var1;
      }

      int var5 = u - var2;
      int var6 = var0 + var1 * u;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            v[var6++] = var4;
         }

         var6 += var5;
      }
   }
}
