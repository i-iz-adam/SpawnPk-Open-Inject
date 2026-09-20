package rs;

public class C_p {
   private static final int a = 2048;
   private static final double b = 0.17578125;
   private static final double c = Math.toRadians(0.17578125);
   private static final int[] d = new int[2048];
   private static final int[] e = new int[2048];

   public static int a(int var0, int var1) {
      int var2 = a(var0 + 45365, var1 + 91923, 4) - 128 + (a(10294 + var0, var1 + 37821, 2) - 128 >> 1) + (a(var0, var1, 1) - 128 >> 2);
      var2 = 35 + (int)((double)var2 * 0.3);
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   public static int a(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = b(var3, var5);
      int var8 = b(var3 + 1, var5);
      int var9 = b(var3, var5 + 1);
      int var10 = b(1 + var3, 1 + var5);
      int var11 = a(var7, var8, var4, var2);
      int var12 = a(var9, var10, var4, var2);
      return a(var11, var12, var6, var2);
   }

   public static int b(int var0, int var1) {
      int var2 = c(var0 - 1, var1 - 1) + c(var0 + 1, var1 - 1) + c(var0 - 1, 1 + var1) + c(var0 + 1, var1 + 1);
      int var3 = c(var0 - 1, var1) + c(1 + var0, var1) + c(var0, var1 - 1) + c(var0, 1 + var1);
      int var4 = c(var0, var1);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   public static int c(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      return (var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & 2147483647) >> 19 & 0xFF;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - e[1024 * var2 / var3] >> 1;
      return (var4 * var1 >> 16) + (var0 * (65536 - var4) >> 16);
   }

   static {
      for (int var0 = 0; var0 < 2048; var0++) {
         d[var0] = (int)(65536.0 * Math.sin((double)var0 * c));
         e[var0] = (int)(65536.0 * Math.cos((double)var0 * c));
      }
   }
}
