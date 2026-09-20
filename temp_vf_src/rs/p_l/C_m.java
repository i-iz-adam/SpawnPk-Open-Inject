package rs.p_l;

public final class C_m {
   public static final int a = -1;
   public static final int b = -2;
   public static final int c = 0;
   private static final int l = 256;
   private static final int m = 255;
   private static final int n = 21;
   private static final long o = 40L;
   public static final int d = 256;
   public static final int e = 512;
   public static final int f = 768;
   public static final int g = 1024;
   public static final int h = 1280;
   public static final int i = 1536;
   public static final int j = 1792;
   public static final int k = 2048;
   private static final int[][] p = new int[9][256];

   private C_m() {
   }

   public static int a() {
      return (int)(System.nanoTime() / 1000000L / 40L & 255L);
   }

   public static int a(int var0, int var1, int var2) {
      int var3 = var0 + (var2 & 0xFF) + var1 * 21 & 0xFF;
      return p[var2 / 256][var3];
   }

   public static int a(String var0, int var1) {
      if (var0.startsWith("@glo@", var1)) {
         return 0;
      } else {
         if (var1 + 5 < var0.length()
            && var0.charAt(var1) == '@'
            && var0.charAt(var1 + 1) == 'g'
            && var0.charAt(var1 + 2) == 'l'
            && var0.charAt(var1 + 3) == 'o'
            && var0.charAt(var1 + 5) == '@') {
            char var2 = var0.charAt(var1 + 4);
            if (var2 >= '2' && var2 <= '9') {
               return (var2 - 49) * 256;
            }
         }

         return -1;
      }
   }

   public static int a(String var0, int var1, int var2) {
      int var3 = var1 - var2 - 1;
      if (var3 == 3 && var0.charAt(var2 + 1) == 'g' && var0.charAt(var2 + 2) == 'l' && var0.charAt(var2 + 3) == 'o') {
         return 0;
      } else {
         if (var3 == 4 && var0.charAt(var2 + 1) == 'g' && var0.charAt(var2 + 2) == 'l' && var0.charAt(var2 + 3) == 'o') {
            char var4 = var0.charAt(var2 + 4);
            if (var4 >= '2' && var4 <= '9') {
               return (var4 - 49) * 256;
            }
         }

         if (var3 == 4 && var0.charAt(var2 + 1) == '/' && var0.charAt(var2 + 2) == 'g' && var0.charAt(var2 + 3) == 'l' && var0.charAt(var2 + 4) == 'o') {
            return -2;
         } else {
            if (var3 == 5 && var0.charAt(var2 + 1) == '/' && var0.charAt(var2 + 2) == 'g' && var0.charAt(var2 + 3) == 'l' && var0.charAt(var2 + 4) == 'o') {
               char var10 = var0.charAt(var2 + 5);
               if (var10 >= '2' && var10 <= '9') {
                  return -2;
               }
            }

            if (var3 > 4 && var0.charAt(var2 + 1) == 'g' && var0.charAt(var2 + 2) == 'l' && var0.charAt(var2 + 3) == 'o' && var0.charAt(var2 + 4) == '=') {
               int var11 = var2 + 5;
               int var5 = var1 - var11;
               int var6 = var5 >= 6 ? 16 : 10;
               int var7 = 0;

               for (int var8 = var11; var8 < var1; var8++) {
                  int var9 = Character.digit(var0.charAt(var8), var6);
                  if (var9 == -1) {
                     return -1;
                  }

                  var7 = var7 * var6 + var9;
               }

               return a(var7);
            } else {
               return -1;
            }
         }
      }
   }

   private static int a(int var0) {
      int var1 = var0 >> 16 & 0xFF;
      int var2 = var0 >> 8 & 0xFF;
      int var3 = var0 & 0xFF;
      int var4 = Math.max(var1, Math.max(var2, var3));
      int var5 = Math.min(var1, Math.min(var2, var3));
      int var6 = var4 - var5;
      if (var6 == 0) {
         return 0;
      } else {
         int var7;
         if (var4 == var1) {
            var7 = 43 * (var2 - var3) / var6;
         } else if (var4 == var2) {
            var7 = 85 + 43 * (var3 - var1) / var6;
         } else {
            var7 = 171 + 43 * (var1 - var2) / var6;
         }

         return var7 & 0xFF;
      }
   }

   private static int b(int var0) {
      int var1 = var0 / 43;
      int var2 = (var0 - var1 * 43) * 6;
      int var4 = 255 - var2;
      switch (var1) {
         case 0:
            return 0xFF0000 | var2 << 8;
         case 1:
            return var4 << 16 | 0xFF00;
         case 2:
            return 0xFF00 | var2;
         case 3:
            return var4 << 8 | 0xFF;
         case 4:
            return var2 << 16 | 0xFF;
         default:
            return 0xFF0000 | var4;
      }
   }

   private static int a(int var0, int var1, int var2, int var3) {
      int var4 = var0 * 3;
      int var5 = var4 >>> 8;
      int var6 = var4 & 0xFF;
      if (var5 == 0) {
         return b(var1, var2, var6);
      } else {
         return var5 == 1 ? b(var2, var3, var6) : b(var3, var1, var6);
      }
   }

   private static int a(int var0, int var1, int var2, int var3, int var4) {
      int var5 = var0 * 4;
      int var6 = var5 >>> 8;
      int var7 = var5 & 0xFF;
      if (var6 == 0) {
         return b(var1, var2, var7);
      } else if (var6 == 1) {
         return b(var2, var3, var7);
      } else {
         return var6 == 2 ? b(var3, var4, var7) : b(var4, var1, var7);
      }
   }

   private static int b(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      int var4 = ((var0 >> 16 & 0xFF) * var3 + (var1 >> 16 & 0xFF) * var2) / 255;
      int var5 = ((var0 >> 8 & 0xFF) * var3 + (var1 >> 8 & 0xFF) * var2) / 255;
      int var6 = ((var0 & 0xFF) * var3 + (var1 & 0xFF) * var2) / 255;
      return var4 << 16 | var5 << 8 | var6;
   }

   static {
      for (int var0 = 0; var0 < 256; var0++) {
         p[0][var0] = b(var0);
         int var1 = 255 - Math.min(255, Math.abs(128 - var0) * 2);
         p[1][var0] = var1 << 16 | var1 << 8 | var1;
         p[2][var0] = a(var0, 16711680, 16744448, 16776960);
         p[3][var0] = a(var0, 65535, 255, 8388863);
         p[4][var0] = a(var0, 65280, 255, 65535);
         p[5][var0] = a(var0, 8388863, 16711680, 16744448);
         p[6][var0] = a(var0, 16732111, 10170623, 26367);
         p[7][var0] = a(var0, 14129920, 16777011, 16761856);
         p[8][var0] = a(var0, 49151, 16720343, 7995647, 3800852);
      }
   }
}
