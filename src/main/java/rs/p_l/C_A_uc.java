package rs.p_l;

public final class C_A_uc {
   public static final int a = -1;
   public static final int b = -2;
   private static final String c = "@type@";
   private static final String d = "<type>";
   private static final String e = "<type=";
   private static final String f = "</type>";
   private static final int g = 75;
   private static final int h = 10;
   private static final int i = 2000;
   private long j;
   private boolean k;

   public String a(String var1) {
      if (var1 != null && e(var1)) {
         StringBuilder var2 = new StringBuilder(var1.length());
         int var3 = 0;

         while (var3 < var1.length()) {
            if (var1.startsWith("@type@", var3)) {
               var3 += "@type@".length();
            } else if (var1.startsWith("<type>", var3)) {
               var3 += "<type>".length();
            } else if (var1.startsWith("</type>", var3)) {
               var3 += "</type>".length();
            } else if (var1.startsWith("<type=", var3)) {
               int var4 = var1.indexOf(62, var3 + "<type=".length());
               if (var4 == -1) {
                  var2.append(var1.charAt(var3++));
               } else {
                  var3 = var4 + 1;
               }
            } else {
               var2.append(var1.charAt(var3++));
            }
         }

         return var2.toString();
      } else {
         return var1;
      }
   }

   public String b(String var1) {
      return this.a(var1, true);
   }

   public String c(String var1) {
      return this.a(var1, false);
   }

   private String a(String var1, boolean var2) {
      if (var1 != null && d(var1)) {
         long var3 = b();
         int var5 = 0;
         boolean var6 = false;
         StringBuilder var7 = new StringBuilder(var1.length() + 24);
         int var8 = 0;

         while (var8 < var1.length()) {
            if (var1.startsWith("@type@", var8)) {
               a(var7, 75, var3);
               var5 = Math.max(var5, 75);
               var8 += "@type@".length();
               var6 = true;
            } else if (var1.startsWith("<type>", var8)) {
               a(var7, 75, var3);
               var5 = Math.max(var5, 75);
               var8 += "<type>".length();
               var6 = true;
            } else if (var1.startsWith("<type=", var8)) {
               int var9 = var8 + "<type=".length();
               int var10 = var1.indexOf(62, var9);
               int var11 = c(var1, var9, var10);
               if (var11 != -1) {
                  var11 = Math.max(10, Math.min(2000, var11));
                  a(var7, var11, var3);
                  var5 = Math.max(var5, var11);
                  var8 = var10 + 1;
                  var6 = true;
               } else {
                  var7.append(var1.charAt(var8++));
               }
            } else {
               var7.append(var1.charAt(var8++));
            }
         }

         if (!var6) {
            return var1;
         } else {
            if (var2) {
               this.j = var3 + (long)var5 * (long)f(var1);
               this.k = true;
            }

            return var7.toString();
         }
      } else {
         return var1;
      }
   }

   private static void a(StringBuilder var0, int var1, long var2) {
      var0.append("<type=").append(var1).append(':').append(var2).append('>');
   }

   public static int a(String var0, int var1, int var2) {
      if (var1 - var2 == 6
         && var0.charAt(var2 + 1) == '/'
         && var0.charAt(var2 + 2) == 't'
         && var0.charAt(var2 + 3) == 'y'
         && var0.charAt(var2 + 4) == 'p'
         && var0.charAt(var2 + 5) == 'e') {
         return -2;
      } else if (var1 - var2 > 7
         && var0.charAt(var2 + 1) == 't'
         && var0.charAt(var2 + 2) == 'y'
         && var0.charAt(var2 + 3) == 'p'
         && var0.charAt(var2 + 4) == 'e'
         && var0.charAt(var2 + 5) == '=') {
         int var3 = var2 + 6;

         while (var3 < var1 && var0.charAt(var3) != ':') {
            var3++;
         }

         int var4 = c(var0, var2 + 6, var3);
         if (var4 != -1 && var3 != var1) {
            long var5 = d(var0, var3 + 1, var1);
            if (var5 == 0L) {
               return -1;
            } else {
               long var7 = Math.max(0L, b() - var5);
               return (int)Math.min(2147483647L, var7 / (long)var4 + 1L);
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static boolean b(String var0, int var1, int var2) {
      return var1 - var2 == 5 && var0.charAt(var2 + 1) == 't' && var0.charAt(var2 + 2) == 'y' && var0.charAt(var2 + 3) == 'p' && var0.charAt(var2 + 4) == 'e'
         ? true
         : a(var0, var1, var2) != -1;
   }

   public boolean a() {
      long var1 = b();
      if (var1 < this.j) {
         return true;
      } else if (!this.k) {
         return false;
      } else {
         this.k = false;
         return true;
      }
   }

   private static boolean d(String var0) {
      return var0.contains("@type@") || var0.contains("<type>") || var0.contains("<type=");
   }

   private static boolean e(String var0) {
      return d(var0) || var0.contains("</type>");
   }

   private static int f(String var0) {
      int var1 = 0;
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '<') {
            var2 = true;
         } else if (var4 == '>' && var2) {
            var2 = false;
         } else if (!var2) {
            if (var0.startsWith("@type@", var3)) {
               var3 += "@type@".length() - 1;
            } else if (var4 == '@' && var3 + 4 < var0.length() && var0.charAt(var3 + 4) == '@') {
               var3 += 4;
            } else {
               var1++;
            }
         }
      }

      return Math.max(1, var1);
   }

   private static int c(String var0, int var1, int var2) {
      if (var2 <= var1) {
         return -1;
      } else {
         int var3 = 0;

         for (int var4 = var1; var4 < var2; var4++) {
            char var5 = var0.charAt(var4);
            if (var5 < '0' || var5 > '9') {
               return -1;
            }

            var3 = var3 * 10 + var5 - 48;
            if (var3 > 2000) {
               return 2000;
            }
         }

         return var3 <= 0 ? -1 : var3;
      }
   }

   private static long d(String var0, int var1, int var2) {
      if (var2 <= var1) {
         return 0L;
      } else {
         long var3 = 0L;

         for (int var5 = var1; var5 < var2; var5++) {
            char var6 = var0.charAt(var5);
            if (var6 < '0' || var6 > '9') {
               return 0L;
            }

            var3 = var3 * 10L + (long)var6 - 48L;
         }

         return var3;
      }
   }

   private static long b() {
      return System.nanoTime() / 1000000L;
   }
}
