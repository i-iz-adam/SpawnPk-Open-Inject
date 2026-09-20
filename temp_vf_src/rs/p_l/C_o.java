package rs.p_l;

final class C_o {
   static final int a = 16777215;
   static final int b = 2;
   private static final int c = 256;
   private static final String[] d = new String[256];
   private static final int[] e = new int[256];
   private static final int[] f = new int[256];
   private static final C_o.a[] g = new C_o.a[256];

   private C_o() {
   }

   static C_o.a a(String var0, int var1, int var2) {
      return var0 != null
            && var2 > var1 + 5
            && var0.charAt(var1 + 1) == 'i'
            && var0.charAt(var1 + 2) == 'm'
            && var0.charAt(var1 + 3) == 'g'
            && var0.charAt(var1 + 4) == '='
         ? b(var0, var1 + 5, var2)
         : null;
   }

   static C_o.a b(String var0, int var1, int var2) {
      int var3 = System.identityHashCode(var0) * 31 + var1 * 17 + var2 & 0xFF;
      if (d[var3] == var0 && e[var3] == var1 && f[var3] == var2) {
         return g[var3];
      } else {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;

         for (int var11 = var1; var11 < var2; var11++) {
            char var12 = var0.charAt(var11);
            if (var12 == ':') {
               if (var10 == 0 || var9 == 4) {
                  return null;
               }

               var9++;
               var10 = 0;
            } else {
               int var13 = Character.digit(var12, var9 >= 3 ? 16 : 10);
               if (var13 < 0) {
                  return null;
               }

               if (var9 == 0) {
                  var4 = var4 * 10 + var13;
               } else if (var9 == 1) {
                  var5 = var5 * 10 + var13;
               } else if (var9 == 2) {
                  var6 = var6 * 10 + var13;
               } else if (var9 == 3) {
                  var7 = var7 * 16 + var13;
               } else {
                  var8 = var8 * 16 + var13;
               }

               if (++var10 > 6) {
                  return null;
               }
            }
         }

         if (var10 != 0 && var4 <= 100000 && var5 <= 511 && var6 <= 99 && (var9 < 3 || var7 <= 16777215) && (var9 < 4 || var8 <= 16777215)) {
            C_o.a var14 = new C_o.a(var4, var5, var6, var9 >= 3 ? var7 : -1, var9 >= 4 ? var8 : 16777215, null);
            d[var3] = var0;
            e[var3] = var1;
            f[var3] = var2;
            g[var3] = var14;
            return var14;
         } else {
            return null;
         }
      }
   }

   static final class a {
      final int a;
      final int b;
      final int c;
      final int d;
      final int e;

      private a(int var1, int var2, int var3, int var4, int var5) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
      }

      boolean a() {
         return this.d >= 0;
      }

      int b() {
         return this.a() ? 2 : 0;
      }
   }
}
