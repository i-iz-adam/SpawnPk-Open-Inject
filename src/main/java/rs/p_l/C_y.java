package rs.p_l;

public final class C_y {
   private static final String a = "</timg>";
   private static final int b = 256;
   private static final String[] c = new String[256];
   private static final int[] d = new int[256];
   private static final int[] e = new int[256];
   private static final C_y.a[] f = new C_y.a[256];

   private C_y() {
   }

   public static C_y.a a(String var0, int var1, int var2) {
      if (var0 != null
         && var2 > var1 + 6
         && var0.charAt(var1 + 1) == 't'
         && var0.charAt(var1 + 2) == 'i'
         && var0.charAt(var1 + 3) == 'm'
         && var0.charAt(var1 + 4) == 'g'
         && var0.charAt(var1 + 5) == '=') {
         int var3 = System.identityHashCode(var0) * 31 + var1 * 17 + var2 & 0xFF;
         if (c[var3] == var0 && d[var3] == var1 && e[var3] == var2) {
            return f[var3];
         } else {
            C_o.a var4 = C_o.b(var0, var1 + 6, var2);
            if (var4 == null) {
               return null;
            } else {
               int var5 = var0.indexOf("</timg>", var2 + 1);
               if (var5 == -1) {
                  return null;
               } else {
                  C_y.a var6 = new C_y.a(var4, var0.substring(var2 + 1, var5), var5 + "</timg>".length() - 1);
                  c[var3] = var0;
                  d[var3] = var1;
                  e[var3] = var2;
                  f[var3] = var6;
                  return var6;
               }
            }
         }
      } else {
         return null;
      }
   }

   public static final class a {
      public final int a;
      public final int b;
      final C_o.a c;
      public final String d;
      public final int e;

      private a(C_o.a var1, String var2, int var3) {
         this.c = var1;
         this.a = var1.a;
         this.b = var1.b;
         this.d = var2;
         this.e = var3;
      }
   }
}
