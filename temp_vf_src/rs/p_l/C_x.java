package rs.p_l;

public class C_x {
   private static final C_x a = new C_x();
   private C_x.a b;
   private int c;

   public static C_x a(String var0) {
      a.c();
      int var1 = -1;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == '<') {
            var1 = var2;
         } else {
            if (var1 != -1) {
               a.a(var0, var1, var2);
               a.b(var0, var1, var2);
            }

            if (var3 == '>'
               && var1 != -1
               && var2 > var1 + 5
               && var0.charAt(var1 + 1) == 'a'
               && var0.charAt(var1 + 2) == 'l'
               && var0.charAt(var1 + 3) == 'i'
               && var0.charAt(var1 + 4) == 'g'
               && var0.charAt(var1 + 5) == 'n') {
               a.a(C_x.a.a);
            }
         }
      }

      return a;
   }

   public C_x.a a() {
      return this.b;
   }

   public void a(C_x.a var1) {
      this.b = var1;
   }

   public int b() {
      return this.c;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public void c() {
      this.b = null;
      this.c = -1;
   }

   public boolean a(String var1, int var2, int var3) {
      char var4 = var1.charAt(var3);
      if (var4 == '>'
         && var3 > var2 + 5
         && var1.charAt(var2 + 1) == 'a'
         && var1.charAt(var2 + 2) == 'l'
         && var1.charAt(var2 + 3) == 'i'
         && var1.charAt(var2 + 4) == 'g'
         && var1.charAt(var2 + 5) == 'n') {
         this.a(C_x.a.a);
         return true;
      } else {
         return false;
      }
   }

   public boolean b(String var1, int var2, int var3) {
      char var4 = var1.charAt(var3);
      if (var4 == '>'
         && var3 > var2 + 4
         && var1.charAt(var2 + 1) == 'h'
         && var1.charAt(var2 + 2) == 'o'
         && var1.charAt(var2 + 3) == 'v'
         && var1.charAt(var2 + 4) == '=') {
         int var5 = 0;
         boolean var6 = var3 - (var2 + 4 + 1) >= 6;

         for (int var7 = var2 + 4 + 1; var7 < var3; var7++) {
            if (var6) {
               var5 = C_h.a(var5, var1.charAt(var7), 16);
            } else {
               var5 = C_h.a(var5, var1.charAt(var7));
            }
         }

         this.a(var5);
         return true;
      } else {
         return false;
      }
   }

   public static enum a {
      a,
      b,
      c;
   }
}
