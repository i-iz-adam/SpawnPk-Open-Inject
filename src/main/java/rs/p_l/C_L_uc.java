package rs.p_l;

public final class C_L_uc {
   public static final int a = 256;

   private C_L_uc() {
   }

   public static int a(int var0) {
      return var0 > 0 && var0 < 256 ? var0 : 0;
   }

   public static int b(int var0) {
      return Math.max(0, Math.min(100, var0));
   }

   public static int a(int var0, int var1) {
      int var2 = a(var1);
      if (var2 == 0) {
         return var0;
      } else {
         int var3 = (var0 >> 10 & 63) + (var2 * 64 + 255) / 256 & 63;
         return var3 << 10 | var0 & 1023;
      }
   }

   public static int b(int var0, int var1) {
      return a(var0, var1, 100);
   }

   public static int a(int var0, int var1, int var2) {
      int var3 = a(var1);
      int var4 = b(var2);
      if (var0 != 0 && var3 != 0 && var4 != 0) {
         int var5 = var0 >> 16 & 0xFF;
         int var6 = var0 >> 8 & 0xFF;
         int var7 = var0 & 0xFF;
         int var8 = Math.max(var5, Math.max(var6, var7));
         int var9 = Math.min(var5, Math.min(var6, var7));
         int var10 = var8 - var9;
         if (var10 == 0) {
            return var0;
         } else {
            int var11;
            if (var8 == var5) {
               var11 = 256 * (var6 - var7) / var10;
            } else if (var8 == var6) {
               var11 = 512 + 256 * (var7 - var5) / var10;
            } else {
               var11 = 1024 + 256 * (var5 - var6) / var10;
            }

            var11 = (var11 + var3 * 6) % 1536;
            if (var11 < 0) {
               var11 += 1536;
            }

            int var12 = var8 == 0 ? 0 : var10 * 255 / var8;
            int var13 = var11 >> 8;
            int var14 = var11 & 0xFF;
            int var15 = var8 * (255 - var12) / 255;
            int var16 = var8 * (255 - var12 * var14 / 255) / 255;
            int var17 = var8 * (255 - var12 * (255 - var14) / 255) / 255;
            int var18;
            switch (var13) {
               case 0:
                  var18 = var8 << 16 | var17 << 8 | var15;
                  break;
               case 1:
                  var18 = var16 << 16 | var8 << 8 | var15;
                  break;
               case 2:
                  var18 = var15 << 16 | var8 << 8 | var17;
                  break;
               case 3:
                  var18 = var15 << 16 | var16 << 8 | var8;
                  break;
               case 4:
                  var18 = var17 << 16 | var15 << 8 | var8;
                  break;
               default:
                  var18 = var8 << 16 | var15 << 8 | var16;
            }

            if (var4 == 100) {
               return var18;
            } else {
               int var19 = 100 - var4;
               int var20 = var18 >> 16 & 0xFF;
               int var21 = var18 >> 8 & 0xFF;
               int var22 = var18 & 0xFF;
               int var23 = (var5 * var19 + var20 * var4 + 50) / 100;
               int var24 = (var6 * var19 + var21 * var4 + 50) / 100;
               int var25 = (var7 * var19 + var22 * var4 + 50) / 100;
               return var23 << 16 | var24 << 8 | var25;
            }
         }
      } else {
         return var0;
      }
   }
}
