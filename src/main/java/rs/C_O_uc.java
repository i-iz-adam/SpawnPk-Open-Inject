package rs;

public final class C_O_uc {
   public static final String a = ":";
   public static final String b = "*";
   private static final char[] c = new char[]{
      '_',
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9'
   };

   public static long a(String var0) {
      long var1 = 0L;

      for (int var3 = 0; var3 < var0.length() && var3 < 12; var3++) {
         char var4 = var0.charAt(var3);
         var1 *= 37L;
         if (var4 >= 'A' && var4 <= 'Z') {
            var1 += (long)(1 + var4 - 65);
         } else if (var4 >= 'a' && var4 <= 'z') {
            var1 += (long)(1 + var4 - 97);
         } else if (var4 >= '0' && var4 <= '9') {
            var1 += (long)(27 + var4 - 48);
         }
      }

      while (var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   public static String a(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return "invalid_name";
            } else {
               int var2 = 0;
               char[] var3 = new char[12];

               while (var0 != 0L) {
                  long var4 = var0;
                  var0 /= 37L;
                  var3[11 - var2++] = c[(int)(var4 - var0 * 37L)];
               }

               return new String(var3, 12 - var2, var2);
            }
         } else {
            return "invalid_name";
         }
      } catch (RuntimeException var6) {
         rs.p_v.C_a.e("81570, " + var0 + ", -99, " + var6.toString());
         throw new RuntimeException();
      }
   }

   public static long b(String var0) {
      var0 = var0.toUpperCase();
      long var1 = 0L;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         var1 = var1 * 61L + (long)var0.charAt(var3) - 32L;
         var1 = var1 + (var1 >> 56) & 72057594037927935L;
      }

      return var1;
   }

   public static String a(int var0) {
      return (var0 >> 24 & 0xFF) + "." + (var0 >> 16 & 0xFF) + "." + (var0 >> 8 & 0xFF) + "." + (var0 & 0xFF);
   }

   public static String c(String var0) {
      if (var0.length() > 0) {
         char[] var1 = var0.toCharArray();

         for (int var2 = 0; var2 < var1.length; var2++) {
            if (var1[var2] == '_') {
               var1[var2] = ' ';
               if (var2 + 1 < var1.length && var1[var2 + 1] >= 'a' && var1[var2 + 1] <= 'z') {
                  var1[var2 + 1] = (char)(var1[var2 + 1] + 'A' - 97);
               }
            }
         }

         if (var1[0] >= 'a' && var1[0] <= 'z') {
            var1[0] = (char)(var1[0] + 'A' - 97);
         }

         return d(new String(var1));
      } else {
         return var0;
      }
   }

   public static String d(String var0) {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         if (var2 != 0 && (var2 <= 0 || var0.charAt(var2 - 1) != ' ')) {
            var1.append((var0.charAt(var2) + "").toLowerCase());
         } else {
            var1.append((var0.charAt(var2) + "").toUpperCase());
         }
      }

      return var1.toString();
   }

   public static String e(String var0) {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         var1.append("*");
      }

      return var1.toString();
   }
}
