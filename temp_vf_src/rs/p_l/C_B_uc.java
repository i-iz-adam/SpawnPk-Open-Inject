package rs.p_l;

public class C_B_uc extends rs.C_a {
   public static void b(int[] var0, int var1, int var2, int var3, int var4) {
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
}
