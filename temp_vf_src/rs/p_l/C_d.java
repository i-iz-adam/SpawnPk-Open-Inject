package rs.p_l;

public class C_d {
   private float b;
   public static int a = 0;

   public void a(boolean var1, int var2, int var3, int var4) {
      this.a(a);
      int var5 = C_E_uc.x[0];
      int var9 = (int)((float)var2 + this.b);
      int var10 = (int)((float)var3 + this.b);

      for (int var11 = 0; var11 < C_c.k; var11++) {
         for (int var12 = 0; var12 < C_c.n; var12++) {
            if (C_c.f[var5] >= (float)var10) {
               C_c.g[var5] = a;
            } else if (C_c.f[var5] >= (float)var9) {
               int var8 = (int)(C_c.f[var5] - (float)var9) / var4;
               int var6 = ((a & 16711935) * var8 >> 8 & 16711935) + ((a & 0xFF00) * var8 >> 8 & 0xFF00);
               var8 = 256 - var8;
               int var7 = C_c.g[var5];
               var7 = ((var7 & 16711935) * var8 >> 8 & 16711935) + ((var7 & 0xFF00) * var8 >> 8 & 0xFF00);
               C_c.g[var5] = var6 + var7;
            }

            var5++;
         }

         var5 += C_c.h - C_c.n;
      }
   }

   public void a(float var1) {
      this.b = var1;
   }

   public void a(int var1) {
      a = var1;
   }
}
