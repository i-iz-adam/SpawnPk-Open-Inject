package rs.p_l;

public final class C_n {
   private static final int a = 128;
   private static final int b = 32;
   private static final int c = 4;
   private static final int d = 65536;
   private static final C_F_uc[] e = new C_F_uc[128];
   private static final C_F_uc[] f = new C_F_uc[128];
   private static final int[] g = new int[128];
   private static final int[] h = new int[128];
   private static final int[] i = new int[32];

   private C_n() {
   }

   public static C_F_uc a(C_F_uc var0, int var1) {
      return a(var0, var1, 0);
   }

   public static C_F_uc a(C_F_uc var0, int var1, int var2) {
      if (var0 != null && (var1 != 0 || var2 != 0)) {
         int var3 = var0.n + var2;
         int var4 = var0.o + var2;
         if ((long)var3 * (long)var4 > 65536L) {
            return var0;
         } else {
            int var5 = System.identityHashCode(var0) * 31 + var1 * 17 + var2 & 31;
            int var6 = var5 * 4;

            for (int var7 = 0; var7 < 4; var7++) {
               int var8 = var6 + var7;
               if (e[var8] == var0 && g[var8] == var1 && h[var8] == var2) {
                  return f[var8];
               }
            }

            int var17 = var6 + i[var5];
            i[var5] = i[var5] + 1 & 3;
            C_F_uc var18 = new C_F_uc(var3, var4);
            var18.r = var3;
            var18.s = var4;
            var18.p = 0;
            var18.q = 0;
            boolean var9 = var1 > 255;
            int var10 = var9 ? var1 - 256 : C_L_uc.a(var1);

            for (int var11 = 0; var11 < var4; var11++) {
               int var12 = var11 * var0.o / var4;
               int var13 = var9 ? var10 + var11 * 255 / Math.max(1, var4 - 1) & 0xFF : var10;

               for (int var14 = 0; var14 < var3; var14++) {
                  int var15 = var14 * var0.n / var3;
                  int var16 = var0.m[var15 + var12 * var0.n];
                  var18.m[var14 + var11 * var3] = var16 != 0 && var13 != 0 ? var16 & 0xFF000000 | C_L_uc.b(var16 & 16777215, var13) : var16;
               }
            }

            e[var17] = var0;
            g[var17] = var1;
            h[var17] = var2;
            f[var17] = var18;
            return var18;
         }
      } else {
         return var0;
      }
   }
}
