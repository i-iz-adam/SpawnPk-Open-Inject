package rs.p_l;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.util.Hashtable;

public class C_c extends C_B_uc {
   private static final ColorModel q = new DirectColorModel(32, 16711680, 65280, 255);
   public static float[] f;
   public static int[] g;
   public static int h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   public static int p;

   public static void a(int var0, int var1, int[] var2, float[] var3) {
      g = var2;
      h = var0;
      i = var1;
      c(var1, 0, var0, 0);
      if (rs.p_f.C_a.av && var3 != null) {
         C_E_uc.k = var3;
         f = var3;
      }
   }

   public static void a(int var0, int var1, int[] var2) {
      g = var2;
      h = var0;
      i = var1;
      c(var1, 0, var0, 0);
      if (rs.p_f.C_a.av) {
         C_E_uc.k = f;
      }
   }

   public static void a(int[] var0, int var1, int var2, int var3, int var4) {
      if (!rs.p_k.C_e.a()) {
         var0[var1] = var2;
      } else if (var4 > 0 && var1 < var0.length && var1 >= 0) {
         int var5 = var0[var1];
         if ((var5 & 0xFF000000) != 0 && var4 != 255) {
            if ((var5 & 0xFF000000) == -16777216) {
               var0[var1] = var2 | 0xFF000000;
            } else {
               int var6 = (var5 >>> 24) * (255 - var4) >>> 8;
               int var7 = var4 + var6;
               int var8 = (var4 << 8) / var7;
               int var9 = (var6 << 8) / var7;
               int var10 = ((var3 & 16711935) * var8 + (var5 & 16711935) * var9 & -16711936 | (var3 & 0xFF00) * var8 + (var5 & 0xFF00) * var9 & 0xFF0000) >>> 8;
               var0[var1] = var10 | var7 << 24;
            }
         } else {
            var0[var1] = var3 & 16777215 | var4 << 24;
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      b(var3, var1, var0, var4, var2, var5);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 256 - var6;
      if (var2 < l) {
         var4 -= l - var2;
         var2 = l;
      }

      if (var1 < j) {
         var0 -= j - var1;
         var1 = j;
      }

      if (var2 + var4 > m) {
         var4 = m - var2;
      }

      if (var1 + var0 > k) {
         var0 = k - var1;
      }

      int var8 = h - var4;
      int var9 = var2 + var1 * h;
      if (var5 != 0) {
         p = -374;
      }

      for (int var10 = -var0; var10 < 0; var10++) {
         for (int var11 = -var4; var11 < 0; var11++) {
            int var12 = g[var9];
            a(
               g,
               var9++,
               ((var3 & 16711935) * var6 + (var12 & 16711935) * var7 & -16711936) + ((var3 & 0xFF00) * var6 + (var12 & 0xFF00) * var7 & 0xFF0000) >> 8,
               ((var3 & 16711935) * var6 + (var12 & 16711935) * var7 & -16711936) + ((var3 & 0xFF00) * var6 + (var12 & 0xFF00) * var7 & 0xFF0000) >> 8,
               var6
            );
         }

         var9 += var8;
      }
   }

   public static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 256 - var5;
      if (var2 < l) {
         var4 -= l - var2;
         var2 = l;
      }

      if (var1 < j) {
         var0 -= j - var1;
         var1 = j;
      }

      if (var2 + var4 > m) {
         var4 = m - var2;
      }

      if (var1 + var0 > k) {
         var0 = k - var1;
      }

      int var7 = h - var4;
      int var8 = var2 + var1 * h;

      for (int var9 = -var0; var9 < 0; var9++) {
         for (int var10 = -var4; var10 < 0; var10++) {
            int var11 = g[var8];
            a(
               g,
               var8++,
               ((var3 & 16711935) * var5 + (var11 & 16711935) * var6 & -16711936) + ((var3 & 0xFF00) * var5 + (var11 & 0xFF00) * var6 & 0xFF0000) >> 8,
               ((var3 & 16711935) * var5 + (var11 & 16711935) * var6 & -16711936) + ((var3 & 0xFF00) * var5 + (var11 & 0xFF00) * var6 & 0xFF0000) >> 8,
               var5
            );
         }

         var8 += var7;
      }
   }

   public static void a(int var0, int var1, int var2, int var3) {
      if (var1 >= j && var1 < k) {
         if (var0 < l) {
            var2 -= l - var0;
            var0 = l;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         int var4 = var0 + var1 * h;

         for (int var5 = 0; var5 < var2; var5++) {
            a(g, var4 + var5, var3, var3, 255);
         }
      }
   }

   public static void b(int var0, int var1, int var2, int var3) {
      if (var1 > j && var1 < k) {
         if (var0 < l) {
            var2 -= l - var0;
            var0 = l;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         int var4 = var0 + var1 * h;

         for (int var5 = 0; var5 < var2; var5++) {
            a(g, var4 + var5, var3, var3, 255);
         }
      }
   }

   public static void c() {
      l = 0;
      j = 0;
      m = h;
      k = i;
      n = m - 1;
      o = m / 2;
   }

   public static void c(int var0, int var1, int var2, int var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      if (var2 > h) {
         var2 = h;
      }

      if (var0 > i) {
         var0 = i;
      }

      l = var1;
      j = var3;
      m = var2;
      k = var0;
      n = m - 1;
      o = m / 2;
      p = k / 2;
   }

   public static void d() {
      int var0 = h * i;

      for (int var1 = 0; var1 < var0 && var1 < g.length; var1++) {
         g[var1] = 0;
         if (rs.p_f.C_a.av && var1 < f.length) {
            f[var1] = Float.MAX_VALUE;
         }
      }
   }

   public static void c(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var5 < l) {
         var2 -= l - var5;
         var5 = l;
      }

      if (var1 < j) {
         var3 -= j - var1;
         var1 = j;
      }

      if (var5 + var2 > m) {
         var2 = m - var5;
      }

      if (var1 + var3 > k) {
         var3 = k - var1;
      }

      int var6 = 256 - var4;
      int var7 = (var0 >> 16 & 0xFF) * var4;
      int var8 = (var0 >> 8 & 0xFF) * var4;
      int var9 = (var0 & 0xFF) * var4;
      int var10 = h - var2;
      int var11 = var5 + var1 * h;

      for (int var12 = 0; var12 < var3; var12++) {
         for (int var13 = -var2; var13 < 0; var13++) {
            int var14 = (g[var11] >> 16 & 0xFF) * var6;
            int var15 = (g[var11] >> 8 & 0xFF) * var6;
            int var16 = (g[var11] & 0xFF) * var6;
            int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
            a(g, var11++, var17, var17, 255);
         }

         var11 += var10;
      }
   }

   public static Graphics2D a(int[] var0, int var1, int var2) {
      return new BufferedImage(
            q, Raster.createWritableRaster(q.createCompatibleSampleModel(var1, var2), new DataBufferInt(var0, var1 * var2), null), false, new Hashtable()
         )
         .createGraphics();
   }

   public static void d(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < l) {
         var2 -= l - var0;
         var0 = l;
      }

      if (var1 < j) {
         var3 -= j - var1;
         var1 = j;
      }

      if (var0 + var2 > m) {
         var2 = m - var0;
      }

      if (var1 + var3 > k) {
         var3 = k - var1;
      }

      int var6 = 256 - var5;
      int var7 = (var4 >> 16 & 0xFF) * var5;
      int var8 = (var4 >> 8 & 0xFF) * var5;
      int var9 = (var4 & 0xFF) * var5;
      int var10 = h - var2;
      int var11 = var0 + var1 * h;

      for (int var12 = 0; var12 < var3; var12++) {
         for (int var13 = -var2; var13 < 0; var13++) {
            int var14 = (g[var11] >> 16 & 0xFF) * var6;
            int var15 = (g[var11] >> 8 & 0xFF) * var6;
            int var16 = (g[var11] & 0xFF) * var6;
            int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
            a(g, var11++, var17, var17, var5);
         }

         var11 += var10;
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      if (var2 < l) {
         var4 -= l - var2;
         var2 = l;
      }

      if (var1 < j) {
         var0 -= j - var1;
         var1 = j;
      }

      if (var2 + var4 > m) {
         var4 = m - var2;
      }

      if (var1 + var0 > k) {
         var0 = k - var1;
      }

      int var5 = h - var4;
      int var6 = var2 + var1 * h;

      for (int var7 = -var0; var7 < 0; var7++) {
         for (int var8 = -var4; var8 < 0; var8++) {
            a(g, var6++, var3, var3, 255);
         }

         var6 += var5;
      }
   }

   public static int a(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      int var4 = g[var1];
      return ((var0 & 16711935) * var2 + (var4 & 16711935) * var3 & -16711936) + ((var0 & 0xFF00) * var2 + (var4 & 0xFF00) * var3 & 0xFF0000) >> 8;
   }

   public static void e(int var0, int var1, int var2, int var3, int var4, int var5) {
      b(var4, var3, var1, var0, var5);
      b(var4 + var2 - 1, var3, var1, var0, var5);
      c(var4, var3, var2, var0, var5);
      c(var4, var3, var2, var0 + var1 - 1, var5);
   }

   public static void b(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= j && var0 < k) {
         if (var3 < l) {
            var2 -= l - var3;
            var3 = l;
         }

         if (var3 + var2 > m) {
            var2 = m - var3;
         }

         int var5 = var3 + var0 * h;

         for (int var6 = 0; var6 < var2; var6++) {
            a(g, var5 + var6, a(var1, var5 + var6, var4), a(var1, var5 + var6, var4), var4);
         }
      }
   }

   public static void c(int var0, int var1, int var2, int var3, int var4) {
      if (var3 >= l && var3 < m) {
         if (var0 < j) {
            var2 -= j - var0;
            var0 = j;
         }

         if (var0 + var2 > k) {
            var2 = k - var0;
         }

         int var5 = var3 + var0 * h;

         for (int var6 = 0; var6 < var2; var6++) {
            a(g, var5 + var6 * h, a(var1, var5 + var6 * h, var4), a(var1, var5 + var6 * h, var4), var4);
         }
      }
   }

   public static void d(int var0, int var1, int var2, int var3, int var4) {
      b(var0, var4, var1, var3);
      b(var0, var4 + var2 - 1, var1, var3);
      d(var4, var3, var2, var0);
      d(var4, var3, var2, var0 + var1 - 1);
   }

   public static void f(int var0, int var1, int var2, int var3, int var4, int var5) {
      f(var3, var4, var0, var2, var5);
      f(var3, var4, var0 + var1 - 1, var2, var5);
      if (var1 >= 3) {
         g(var3, var5, var2, var0 + 1, var1 - 2);
         g(var3, var5 + var4 - 1, var2, var0 + 1, var1 - 2);
      }
   }

   private static void f(int var0, int var1, int var2, int var3, int var4) {
      if (var2 >= j && var2 < k) {
         if (var4 < l) {
            var1 -= l - var4;
            var4 = l;
         }

         if (var4 + var1 > m) {
            var1 = m - var4;
         }

         int var5 = 256 - var3;
         int var6 = (var0 >> 16 & 0xFF) * var3;
         int var7 = (var0 >> 8 & 0xFF) * var3;
         int var8 = (var0 & 0xFF) * var3;
         int var9 = var4 + var2 * h;

         for (int var10 = 0; var10 < var1; var10++) {
            int var11 = (g[var9] >> 16 & 0xFF) * var5;
            int var12 = (g[var9] >> 8 & 0xFF) * var5;
            int var13 = (g[var9] & 0xFF) * var5;
            int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
            a(g, var9++, var14, var14, var3);
         }
      }
   }

   public static void d(int var0, int var1, int var2, int var3) {
      if (var3 >= l && var3 < m) {
         if (var0 < j) {
            var2 -= j - var0;
            var0 = j;
         }

         if (var0 + var2 > k) {
            var2 = k - var0;
         }

         int var4 = var3 + var0 * h;

         for (int var5 = 0; var5 < var2; var5++) {
            a(g, var4 + var5 * h, var1, var1, 255);
         }
      }
   }

   private static void g(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= l && var1 < m) {
         if (var3 < j) {
            var4 -= j - var3;
            var3 = j;
         }

         if (var3 + var4 > k) {
            var4 = k - var3;
         }

         int var5 = 256 - var2;
         int var6 = (var0 >> 16 & 0xFF) * var2;
         int var7 = (var0 >> 8 & 0xFF) * var2;
         int var8 = (var0 & 0xFF) * var2;
         int var9 = var1 + var3 * h;

         for (int var10 = 0; var10 < var4; var10++) {
            int var11 = (g[var9] >> 16 & 0xFF) * var5;
            int var12 = (g[var9] >> 8 & 0xFF) * var5;
            int var13 = (g[var9] & 0xFF) * var5;
            int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
            int var15;
            a(g, var15 = var9 + h, var14, var14, var2);
            var9 = var15 + h;
         }
      }
   }

   public static void e(int var0, int var1, int var2, int var3, int var4) {
      a(var0, var1, var2, var3, var4, false);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var0 < l) {
         var2 -= l - var0;
         var0 = l;
      }

      if (var1 < j) {
         var3 -= j - var1;
         var1 = j;
      }

      if (var0 + var2 > m) {
         var2 = m - var0;
      }

      if (var1 + var3 > k) {
         var3 = k - var1;
      }

      int var6 = h - var2;
      int var7 = var0 + var1 * h;

      for (int var8 = -var3; var8 < 0; var8++) {
         for (int var9 = -var2; var9 < 0; var9++) {
            a(g, var7++, var4, var4, var5 ? 0 : 255);
         }

         var7 += var6;
      }
   }

   C_c() {
   }
}
