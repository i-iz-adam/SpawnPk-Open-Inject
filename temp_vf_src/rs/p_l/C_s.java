package rs.p_l;

public final class C_s {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = Integer.MIN_VALUE;
   public static final int g = -2147483647;
   private static final int h = 40;
   private static final double i = 180.0;
   private static volatile long j;
   private static boolean k;

   private C_s() {
   }

   public static int a(String var0, int var1) {
      if (var0.startsWith("@hov@", var1)) {
         return 1;
      } else {
         return var0.startsWith("@shi@", var1) ? 3 : 0;
      }
   }

   public static int a(String var0, int var1, int var2) {
      int var3 = var1 - var2 - 1;
      if (var3 == 5 && a(var0, var2 + 1, "hover")) {
         return 1;
      } else if (var3 == 6 && var0.charAt(var2 + 1) == '/' && a(var0, var2 + 2, "hover")) {
         return 2;
      } else if (var3 == 5 && a(var0, var2 + 1, "shift")) {
         return 3;
      } else {
         return var3 == 6 && var0.charAt(var2 + 1) == 47 && a(var0, var2 + 2, "shift") ? 4 : 0;
      }
   }

   public static int b(String var0, int var1, int var2) {
      if (var1 - var2 == 6 && var0.charAt(var2 + 1) == '/' && a(var0, var2 + 2, "lift")) {
         return -2147483647;
      } else if (var1 > var2 + 6 && a(var0, var2 + 1, "lift=")) {
         int var3 = var2 + 6;
         boolean var4 = false;
         if (var0.charAt(var3) == '-' || var0.charAt(var3) == '+') {
            var4 = var0.charAt(var3) == '-';
            var3++;
         }

         if (var3 >= var1) {
            return Integer.MIN_VALUE;
         } else {
            int var5;
            for (var5 = 0; var3 < var1; var3++) {
               char var6 = var0.charAt(var3);
               if (var6 < '0' || var6 > '9') {
                  return Integer.MIN_VALUE;
               }

               var5 = Math.min(40, var5 * 10 + var6 - 48);
            }

            return var4 ? -var5 : var5;
         }
      } else {
         return Integer.MIN_VALUE;
      }
   }

   public static int a() {
      return (int)Math.round(Math.sin((double)e() / 180.0) * 2.0);
   }

   public static int b() {
      return (int)Math.round(Math.sin((double)e() / 180.0) * 3.0);
   }

   public static void c() {
      j = e();
      k = true;
   }

   public static boolean d() {
      if (e() - j < 100L) {
         return true;
      } else if (!k) {
         return false;
      } else {
         k = false;
         return true;
      }
   }

   private static boolean a(String var0, int var1, String var2) {
      if (var1 >= 0 && var1 + var2.length() <= var0.length()) {
         for (int var3 = 0; var3 < var2.length(); var3++) {
            if (var0.charAt(var1 + var3) != var2.charAt(var3)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static long e() {
      return System.nanoTime() / 1000000L;
   }
}
