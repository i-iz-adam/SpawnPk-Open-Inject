package rs;

public final class C_P_uc {
   private static final char[] a = new char[100];
   private static final rs.p_x.C_e b = new rs.p_x.C_e(new byte[100]);
   private static char[] c = new char[]{
      ' ',
      'e',
      't',
      'a',
      'o',
      'i',
      'h',
      'n',
      's',
      'r',
      'd',
      'l',
      'u',
      'm',
      'w',
      'c',
      'y',
      'f',
      'g',
      'p',
      'b',
      'v',
      'k',
      'x',
      'j',
      'q',
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
      '9',
      ' ',
      '!',
      '?',
      '.',
      ',',
      ':',
      ';',
      '(',
      ')',
      '-',
      '&',
      '*',
      '\\',
      '\'',
      '@',
      '#',
      '+',
      '=',
      '£',
      '$',
      '%',
      '"',
      '[',
      ']',
      '>',
      '<',
      '^',
      '/',
      '_'
   };

   public static String a(int var0, rs.p_x.C_e var1) {
      int var2 = 0;
      byte var3 = -1;

      for (int var4 = 0; var4 < var0; var4++) {
         int var5 = var1.y();
         a[var2++] = c[var5];
      }

      boolean var7 = true;

      for (int var8 = 0; var8 < var2; var8++) {
         char var6 = a[var8];
         if (var7 && var6 >= 'a' && var6 <= 'z') {
            a[var8] = (char)(a[var8] + '￠');
            var7 = false;
         }

         if (var6 == '.' || var6 == '!' || var6 == '?') {
            var7 = true;
         }
      }

      return new String(a, 0, var2);
   }

   public static void a(String var0, rs.p_x.C_e var1) {
      if (var0.length() > 80) {
         var0 = var0.substring(0, 80);
      }

      var0 = var0.toLowerCase();
      byte var2 = -1;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         int var5 = 0;

         for (int var6 = 0; var6 < c.length; var6++) {
            if (var4 == c[var6]) {
               var5 = var6;
               break;
            }
         }

         var1.b(var5);
      }
   }

   public static String a(String var0) {
      b.h = 0;
      a(var0, b);
      int var1 = b.h;
      b.h = 0;
      return a(var1, b);
   }
}
