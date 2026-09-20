package rs.p_l;

public final class C_l {
   static final int a = -11;
   static final int b = -12;
   private static final String d = "@fla@";
   private static final String e = "@fla2@";
   private static final String f = "<fla>";
   private static final String g = "<fla2>";
   private static final String h = "<fla=";
   private static final String i = "<fla2=";
   private static final String j = "</fla>";
   private static final String k = "</fla2>";
   static final int c = 65535;
   private static final long l = 200L;
   private static final long m = 600L;
   private static final long n = 1200L;
   private long o;
   private long p;
   private boolean q;
   private boolean r;

   public String a(String var1) {
      if (var1 != null && e(var1)) {
         StringBuilder var2 = new StringBuilder(var1.length());
         int var3 = 0;

         while (var3 < var1.length()) {
            if (var1.startsWith("@fla@", var3)) {
               var3 += "@fla@".length();
            } else if (var1.startsWith("@fla2@", var3)) {
               var3 += "@fla2@".length();
            } else if (var1.startsWith("<fla>", var3)) {
               var3 += "<fla>".length();
            } else if (var1.startsWith("<fla2>", var3)) {
               var3 += "<fla2>".length();
            } else if (var1.startsWith("</fla>", var3)) {
               var3 += "</fla>".length();
            } else if (var1.startsWith("</fla2>", var3)) {
               var3 += "</fla2>".length();
            } else if (var1.startsWith("<fla=", var3)) {
               int var4 = var1.indexOf(62, var3 + "<fla=".length());
               if (var4 == -1) {
                  var2.append(var1.charAt(var3++));
               } else {
                  var3 = var4 + 1;
               }
            } else if (var1.startsWith("<fla2=", var3)) {
               int var5 = var1.indexOf(62, var3 + "<fla2=".length());
               if (var5 == -1) {
                  var2.append(var1.charAt(var3++));
               } else {
                  var3 = var5 + 1;
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
         long var3 = c();
         boolean var5 = false;
         boolean var6 = false;
         StringBuilder var7 = new StringBuilder(var1.length() + 24);
         int var8 = 0;

         while (var8 < var1.length()) {
            if (var1.startsWith("@fla@", var8)) {
               a(var7, 65535, var3);
               var8 += "@fla@".length();
               var5 = true;
            } else if (var1.startsWith("@fla2@", var8)) {
               b(var7, 65535, var3);
               var8 += "@fla2@".length();
               var5 = true;
               var6 = true;
            } else if (var1.startsWith("<fla>", var8)) {
               a(var7, 65535, var3);
               var8 += "<fla>".length();
               var5 = true;
            } else if (var1.startsWith("<fla2>", var8)) {
               b(var7, 65535, var3);
               var8 += "<fla2>".length();
               var5 = true;
               var6 = true;
            } else if (var1.startsWith("<fla=", var8)) {
               int var11 = var8 + "<fla=".length();
               int var12 = var1.indexOf(62, var11);
               if (var12 != -1 && c(var1, var11, var12)) {
                  var7.append("<fla=").append(var1, var11, var12).append(':').append(var3).append('>');
                  var8 = var12 + 1;
                  var5 = true;
               } else {
                  var7.append(var1.charAt(var8++));
               }
            } else if (var1.startsWith("<fla2=", var8)) {
               int var9 = var8 + "<fla2=".length();
               int var10 = var1.indexOf(62, var9);
               if (var10 != -1 && c(var1, var9, var10)) {
                  var7.append("<fla2=").append(var1, var9, var10).append(':').append(var3).append('>');
                  var8 = var10 + 1;
                  var5 = true;
                  var6 = true;
               } else {
                  var7.append(var1.charAt(var8++));
               }
            } else {
               var7.append(var1.charAt(var8++));
            }
         }

         if (!var5) {
            return var1;
         } else {
            if (var2) {
               this.p = var3 + (var6 ? 1200L : 600L);
               this.r = true;
            }

            return var7.toString();
         }
      } else {
         return var1;
      }
   }

   private static void a(StringBuilder var0, int var1, long var2) {
      var0.append("<fla=").append(var1).append(':').append(var2).append('>');
   }

   private static void b(StringBuilder var0, int var1, long var2) {
      var0.append("<fla2=").append(var1).append(':').append(var2).append('>');
   }

   private static boolean d(String var0) {
      return var0.contains("@fla@")
         || var0.contains("@fla2@")
         || var0.contains("<fla>")
         || var0.contains("<fla2>")
         || var0.contains("<fla=")
         || var0.contains("<fla2=");
   }

   private static boolean e(String var0) {
      return d(var0) || var0.contains("</fla>") || var0.contains("</fla2>");
   }

   private static boolean c(String var0, int var1, int var2) {
      if (var1 == var2) {
         return false;
      } else {
         int var3 = var2 - var1 >= 6 ? 16 : 10;

         for (int var4 = var1; var4 < var2; var4++) {
            if (Character.digit(var0.charAt(var4), var3) == -1) {
               return false;
            }
         }

         return true;
      }
   }

   public void a() {
      this.o = c();
      this.q = true;
   }

   public int a(int var1) {
      int var2 = a(this.o, 65535);
      return var2 == -11 ? var1 : var2;
   }

   public boolean b() {
      long var1 = c();
      if (a(this.o, var1) || var1 < this.p) {
         return true;
      } else if (!this.q && !this.r) {
         return false;
      } else {
         this.q = false;
         this.r = false;
         return true;
      }
   }

   static int a(long var0, int var2) {
      return a(var0, var2, false);
   }

   static int a(long var0, int var2, boolean var3) {
      long var4 = c();
      if (!a(var0, var4, var3 ? 1200L : 600L)) {
         return -11;
      } else {
         long var6 = (var4 - var0) / 200L;
         return var6 % 2L == 0L ? var2 : -11;
      }
   }

   static boolean a(String var0, int var1, int var2) {
      return var1 > var2 + 6
         && var0.charAt(var2 + 1) == 'f'
         && var0.charAt(var2 + 2) == 'l'
         && var0.charAt(var2 + 3) == 'a'
         && var0.charAt(var2 + 4) == '2'
         && var0.charAt(var2 + 5) == '=';
   }

   static long b(String var0, int var1, int var2) {
      int var3 = var2 + 6;

      while (var3 < var1 && var0.charAt(var3) != ':') {
         var3++;
      }

      if (var3 != var1 && var3 + 1 != var1) {
         long var4 = 0L;

         for (int var6 = var3 + 1; var6 < var1; var6++) {
            char var7 = var0.charAt(var6);
            if (var7 < '0' || var7 > '9') {
               return 0L;
            }

            var4 = var4 * 10L + (long)var7 - 48L;
         }

         return var4;
      } else {
         return 0L;
      }
   }

   static int b(long var0, int var2) {
      long var3 = c();
      if (!a(var0, var3, 1200L)) {
         return 0;
      } else {
         long var5 = var3 - var0;
         double var7 = 5.0;
         if (var5 > 600L) {
            var7 *= (double)(1200L - var5) / 600.0;
         }

         return (int)Math.round(Math.sin((double)var2 / 2.0 + (double)var5 / 100.0) * var7);
      }
   }

   private static boolean a(long var0, long var2) {
      return a(var0, var2, 600L);
   }

   private static boolean a(long var0, long var2, long var4) {
      long var6 = var2 - var0;
      return var0 != 0L && var6 >= 0L && var6 < var4;
   }

   private static long c() {
      return System.nanoTime() / 1000000L;
   }
}
