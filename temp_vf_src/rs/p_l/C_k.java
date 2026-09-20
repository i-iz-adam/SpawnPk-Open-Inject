package rs.p_l;

import rs.C_Client_mc;

public class C_k {
   public static int a = -10;
   public static C_i b = new C_i(25);
   public static C_i c = new C_i(50);
   public static C_i d = new C_i(125);
   public static C_i e = new C_i(250);

   public static int a(String var0, int var1, int var2) {
      int var3 = C_Client_mc.bN;
      if (var0.length() < var2 + 2 + 1) {
         return a;
      } else {
         char var4 = var0.charAt(var2);
         char var5 = var0.charAt(var2 + 1);
         char var6 = var0.charAt(var2 + 2);
         if (var4 == 'p' && var5 == 'u' && var6 == '1') {
            byte var7 = 1;
            return 4784273 + 256 * var7 * e.b();
         } else {
            return var4 == 112 && var5 == 117 && var6 == 50 ? 4784273 + 1 * Math.min(100, var3 / 2) + 131072 * (var3 / 2) : a;
         }
      }
   }

   public static int b(String var0, int var1, int var2) {
      if (var1 == var2 + 5 && var0.charAt(var2 + 1) == '/' && var0.charAt(var2 + 2) == 'f' && var0.charAt(var2 + 3) == 'l' && var0.charAt(var2 + 4) == 'a') {
         return -12;
      } else if (var1 == var2 + 6
         && var0.charAt(var2 + 1) == '/'
         && var0.charAt(var2 + 2) == 'f'
         && var0.charAt(var2 + 3) == 'l'
         && var0.charAt(var2 + 4) == 'a'
         && var0.charAt(var2 + 5) == '2') {
         return -12;
      } else {
         boolean var3 = var1 > var2 + 5 && var0.charAt(var2 + 4) == '2' && var0.charAt(var2 + 5) == '=';
         int var4 = var3 ? var2 + 5 : var2 + 4;
         if (var1 > var4 + 1 && var0.charAt(var2 + 1) == 'f' && var0.charAt(var2 + 2) == 'l' && var0.charAt(var2 + 3) == 'a' && var0.charAt(var4) == '=') {
            int var5 = var4 + 1;
            int var6 = var5;

            while (var6 < var1 && var0.charAt(var6) != ':') {
               var6++;
            }

            if (var6 == var5) {
               return a;
            } else {
               int var7 = 0;
               boolean var8 = var6 - var5 >= 6;
               int var9 = var8 ? 16 : 10;

               for (int var10 = var5; var10 < var6; var10++) {
                  char var11 = var0.charAt(var10);
                  if (Character.digit(var11, var9) == -1) {
                     return a;
                  }

                  var7 = var8 ? C_h.a(var7, var11, var9) : C_h.a(var7, var11);
               }

               if (var8) {
                  var7 = -var7;
               }

               if (var6 != var1 && var6 + 1 != var1) {
                  long var14 = 0L;

                  for (int var12 = var6 + 1; var12 < var1; var12++) {
                     char var13 = var0.charAt(var12);
                     if (var13 < '0' || var13 > '9') {
                        return a;
                     }

                     var14 = var14 * 10L + (long)var13 - 48L;
                  }

                  return C_l.a(var14, var7, var3);
               } else {
                  return a;
               }
            }
         } else {
            return a;
         }
      }
   }

   public static int c(String var0, int var1, int var2) {
      return C_m.a(var0, var1, var2);
   }

   public static int d(String var0, int var1, int var2) {
      return C_A_uc.a(var0, var1, var2);
   }

   public static int e(String var0, int var1, int var2) {
      int var3 = C_t.c(var0, var1, var2);
      if (var3 != -1) {
         return var3;
      } else {
         C_o.a var4 = C_o.a(var0, var2, var1);
         return var4 == null ? a : var4.a;
      }
   }

   public static int f(String var0, int var1, int var2) {
      C_o.a var3 = C_o.a(var0, var2, var1);
      return var3 == null ? 0 : var3.b;
   }

   public static int g(String var0, int var1, int var2) {
      if (var1 <= var2 + 5) {
         return a;
      } else if (var0.charAt(var2 + 1) == 'i'
         && var0.charAt(var2 + 2) == 't'
         && var0.charAt(var2 + 3) == 'e'
         && var0.charAt(var2 + 4) == 'm'
         && var0.charAt(var2 + 5) == '=') {
         int var3 = 0;

         for (int var4 = var2 + 5 + 1; var4 < var1; var4++) {
            var3 = C_h.a(var3, var0.charAt(var4));
         }

         return var3;
      } else {
         return a;
      }
   }

   public static int h(String var0, int var1, int var2) {
      if (var1 <= var2 + 4) {
         return a;
      } else if (var0.charAt(var2 + 1) == '/' && var0.charAt(var2 + 2) == 'c' && var0.charAt(var2 + 3) == 'o' && var0.charAt(var2 + 4) == 'l') {
         return C_h.ac;
      } else if (var0.charAt(var2 + 1) == 'c' && var0.charAt(var2 + 2) == 'o' && var0.charAt(var2 + 3) == 'l' && var0.charAt(var2 + 4) == '=') {
         int var3 = a(var0, var1, var2 + 5);
         if (var3 != a) {
            return var3;
         } else {
            int var4 = 0;
            boolean var5 = var1 - (var2 + 4 + 1) >= 6;

            for (int var6 = var2 + 4 + 1; var6 < var1; var6++) {
               if (var5) {
                  var4 = C_h.a(var4, var0.charAt(var6), 16);
               } else {
                  var4 = C_h.a(var4, var0.charAt(var6));
               }
            }

            return var5 ? -var4 : var4;
         }
      } else {
         return a;
      }
   }

   public static int i(String var0, int var1, int var2) {
      if (var1 <= var2 + 6) {
         return a;
      } else if (var0.charAt(var2 + 1) == '/'
         && var0.charAt(var2 + 2) == 't'
         && var0.charAt(var2 + 3) == 'r'
         && var0.charAt(var2 + 4) == 'a'
         && var0.charAt(var2 + 5) == 'n'
         && var0.charAt(var2 + 6) == 's') {
         return C_h.af;
      } else if (var0.charAt(var2 + 1) == 't'
         && var0.charAt(var2 + 2) == 'r'
         && var0.charAt(var2 + 3) == 'a'
         && var0.charAt(var2 + 4) == 'n'
         && var0.charAt(var2 + 5) == 's'
         && var0.charAt(var2 + 6) == '=') {
         int var3 = 0;
         boolean var4 = var1 - (var2 + 5 + 1) >= 6;

         for (int var5 = var2 + 5 + 1; var5 < var1; var5++) {
            if (var4) {
               var3 = C_h.a(var3, var0.charAt(var5), 16);
            } else {
               var3 = C_h.a(var3, var0.charAt(var5));
            }
         }

         return var4 ? -var3 : var3;
      } else {
         return a;
      }
   }

   public static int j(String var0, int var1, int var2) {
      if (var1 <= var2 + 5) {
         return a;
      } else if (var0.charAt(var2 + 1) == '/'
         && var0.charAt(var2 + 2) == 's'
         && var0.charAt(var2 + 3) == 'h'
         && var0.charAt(var2 + 4) == 'a'
         && var0.charAt(var2 + 5) == 'd') {
         return C_h.ai;
      } else if (var0.charAt(var2 + 1) == 's'
         && var0.charAt(var2 + 2) == 'h'
         && var0.charAt(var2 + 3) == 'a'
         && var0.charAt(var2 + 4) == 'd'
         && var0.charAt(var2 + 5) == '=') {
         int var3 = a(var0, var1, var2 + 6);
         if (var3 != a) {
            return var3;
         } else {
            int var4 = 0;
            boolean var5 = var1 - (var2 + 5 + 1) >= 6;

            for (int var6 = var2 + 5 + 1; var6 < var1; var6++) {
               if (var5) {
                  var4 = C_h.a(var4, var0.charAt(var6), 16);
               } else {
                  var4 = C_h.a(var4, var0.charAt(var6));
               }
            }

            return var5 ? -var4 : var4;
         }
      } else {
         return a;
      }
   }

   public static int k(String var0, int var1, int var2) {
      if (var1 > var2 + 2 && var0.charAt(var2 + 1) == '/' && var0.charAt(var2 + 2) == 'u') {
         return -1;
      } else if (var1 <= var2 + 1 || var0.charAt(var2 + 1) != 'u') {
         return a;
      } else if (var1 > var2 + 2 && var0.charAt(var2 + 2) == '=') {
         int var3 = 0;

         for (int var4 = var2 + 2 + 1; var4 < var1; var4++) {
            var3 = C_h.a(var3, var0.charAt(var4));
         }

         return var3;
      } else {
         return 1;
      }
   }

   public static int l(String var0, int var1, int var2) {
      if (var1 > var2 + 4 && var0.charAt(var2 + 1) == '/' && var0.charAt(var2 + 2) == 's' && var0.charAt(var2 + 3) == 't' && var0.charAt(var2 + 4) == 'r') {
         return -1;
      } else if (var1 <= var2 + 3 || var0.charAt(var2 + 1) != 's' || var0.charAt(var2 + 2) != 't' || var0.charAt(var2 + 3) != 'r') {
         return a;
      } else if (var1 > var2 + 4 && var0.charAt(var2 + 4) == '=') {
         int var3 = 0;

         for (int var4 = var2 + 4 + 1; var4 < var1; var4++) {
            var3 = C_h.a(var3, var0.charAt(var4));
         }

         return var3;
      } else {
         return 8388608;
      }
   }

   public static int m(String var0, int var1, int var2) {
      if (var1 <= var2 + 4) {
         return a;
      } else if (var0.charAt(var2 + 1) == 't' && var0.charAt(var2 + 2) == 'a' && var0.charAt(var2 + 3) == 'b' && var0.charAt(var2 + 4) == '=') {
         boolean var3 = false;
         int var4 = 0;

         for (int var5 = var2 + 4 + 1; var5 < var1; var5++) {
            var4 = C_h.a(var4, var0.charAt(var5));
         }

         return var4;
      } else {
         return a;
      }
   }

   public static int n(String var0, int var1, int var2) {
      if (var1 <= var2 + 5) {
         return a;
      } else if (var0.charAt(var2 + 1) == 'y'
         && var0.charAt(var2 + 2) == 'o'
         && var0.charAt(var2 + 3) == 'f'
         && var0.charAt(var2 + 4) == 'f'
         && var0.charAt(var2 + 5) == '=') {
         boolean var3 = false;
         int var4 = 0;

         for (int var5 = var2 + 5 + 1; var5 < var1; var5++) {
            var4 = C_h.a(var4, var0.charAt(var5));
         }

         return var4;
      } else {
         return a;
      }
   }
}
