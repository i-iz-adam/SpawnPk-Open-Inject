package rs.p_w;

public final class C_b {
   public final int[] a = new int[2];
   private final int[][][] d = new int[2][2][4];
   private final int[][][] e = new int[2][2][4];
   private final int[] f = new int[2];
   private static final float[][] g = new float[2][8];
   public static final int[][] b = new int[2][8];
   private static float h;
   public static int c;

   private float a(int var1, int var2, float var3) {
      float var4 = (float)this.e[var1][0][var2] + var3 * (float)(this.e[var1][1][var2] - this.e[var1][0][var2]);
      var4 *= 0.001525879F;
      return 1.0F - (float)Math.pow(10.0, (double)(-var4 / 20.0F));
   }

   private float a(float var1) {
      float var2 = 32.7032F * (float)Math.pow(2.0, (double)var1);
      return var2 * 3.141593F / 11025.0F;
   }

   private float a(float var1, int var2, int var3) {
      float var4 = (float)this.d[var3][0][var2] + var1 * (float)(this.d[var3][1][var2] - this.d[var3][0][var2]);
      var4 *= 1.220703E-4F;
      return this.a(var4);
   }

   public int a(int var1, float var2) {
      if (var1 == 0) {
         float var3 = (float)this.f[0] + (float)(this.f[1] - this.f[0]) * var2;
         var3 *= 0.003051758F;
         h = (float)Math.pow(0.1, (double)(var3 / 20.0F));
         c = (int)(h * 65536.0F);
      }

      if (this.a[var1] == 0) {
         return 0;
      } else {
         float var10 = this.a(var1, 0, var2);
         g[var1][0] = -2.0F * var10 * (float)Math.cos((double)this.a(var2, 0, var1));
         g[var1][1] = var10 * var10;

         for (int var4 = 1; var4 < this.a[var1]; var4++) {
            float var5 = this.a(var1, var4, var2);
            float var6 = -2.0F * var5 * (float)Math.cos((double)this.a(var2, var4, var1));
            float var7 = var5 * var5;
            g[var1][var4 * 2 + 1] = g[var1][var4 * 2 - 1] * var7;
            g[var1][var4 * 2] = g[var1][var4 * 2 - 1] * var6 + g[var1][var4 * 2 - 2] * var7;

            for (int var8 = var4 * 2 - 1; var8 >= 2; var8--) {
               g[var1][var8] = g[var1][var8] + g[var1][var8 - 1] * var6 + g[var1][var8 - 2] * var7;
            }

            g[var1][1] = g[var1][1] + g[var1][0] * var6 + var7;
            g[var1][0] = g[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var11 = 0; var11 < this.a[0] * 2; var11++) {
               g[0][var11] = g[0][var11] * h;
            }
         }

         for (int var12 = 0; var12 < this.a[var1] * 2; var12++) {
            b[var1][var12] = (int)(g[var1][var12] * 65536.0F);
         }

         return this.a[var1] * 2;
      }
   }

   public void a(rs.p_x.C_e var1, C_a var2) {
      int var3 = var1.y();
      this.a[0] = var3 >> 4;
      this.a[1] = var3 & 15;
      if (var3 != 0) {
         this.f[0] = var1.A();
         this.f[1] = var1.A();
         int var4 = var1.y();

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.a[var5]; var6++) {
               this.d[var5][0][var6] = var1.A();
               this.e[var5][0][var6] = var1.A();
            }
         }

         for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.a[var7]; var8++) {
               if ((var4 & 1 << var7 * 4 << var8) != 0) {
                  this.d[var7][1][var8] = var1.A();
                  this.e[var7][1][var8] = var1.A();
               } else {
                  this.d[var7][1][var8] = this.d[var7][0][var8];
                  this.e[var7][1][var8] = this.e[var7][0][var8];
               }
            }
         }

         if (var4 != 0 || this.f[1] != this.f[0]) {
            var2.b(var1);
         }
      } else {
         this.f[0] = this.f[1] = 0;
      }
   }
}
