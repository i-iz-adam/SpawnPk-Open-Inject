package rs.p_l;

import java.util.Arrays;
import java.util.Map;
import rs.C_Client_mc;

public final class C_t {
   public static final int a = -1;
   public static final int b = -2;
   public static final int c = 0;
   private static final int d = 16777216;
   private static final int e = 50;
   private static final int f = 512;
   private static final int[] g = new int[0];
   private static final int[][] h = new int[][]{
      {16724016, 16752640, 16777008, 3211104, 3203071, 5267711, 12599551, 16728256},
      {16717824, 16730112, 16742400, 16756736, 16776992},
      {1477887, 3421439, 7874815, 12595455, 16732111},
      {2146336, 5303856, 10288944, 14221104, 16777024},
      {16777008, 16764960, 16752656, 16740368, 16728064},
      {0, 328965, 1052688, 1842204, 2631720},
      {16777215, 16316671, 15794175, 15263976},
      {0, 3158064, 7368816, 11579568, 16777215}
   };
   private static final Map<Long, Long> i = new C_u(64, 0.75F, true);

   private C_t() {
   }

   public static int a(String var0, int var1) {
      if (var0.startsWith("@par@", var1)) {
         return 0;
      } else {
         if (var1 + 5 < var0.length()
            && var0.charAt(var1) == '@'
            && var0.charAt(var1 + 1) == 'p'
            && var0.charAt(var1 + 2) == 'a'
            && var0.charAt(var1 + 3) == 'r'
            && var0.charAt(var1 + 5) == '@') {
            char var2 = var0.charAt(var1 + 4);
            if (var2 >= '2' && var2 <= '8') {
               return var2 - 49;
            }
         }

         return -1;
      }
   }

   public static int a(String var0, int var1, int var2) {
      int var3 = var1 - var2 - 1;
      if (var3 == 3 && a(var0, var2 + 1, "par")) {
         return 0;
      } else {
         if (var3 == 4 && a(var0, var2 + 1, "par")) {
            char var4 = var0.charAt(var2 + 4);
            if (var4 >= '2' && var4 <= '8') {
               return var4 - 49;
            }
         }

         if (var3 == 4 && var0.charAt(var2 + 1) == '/' && a(var0, var2 + 2, "par")) {
            return -2;
         } else {
            if (var3 == 5 && var0.charAt(var2 + 1) == '/' && a(var0, var2 + 2, "par")) {
               char var5 = var0.charAt(var2 + 5);
               if (var5 >= '2' && var5 <= '8') {
                  return -2;
               }
            }

            if (var3 > 4 && a(var0, var2 + 1, "par") && var0.charAt(var2 + 4) == '=') {
               int var6 = e(var0, var2 + 5, var1);
               if (var6 != -1) {
                  return 16777216 | var6;
               }
            }

            return -1;
         }
      }
   }

   public static int b(String var0, int var1, int var2) {
      if (var1 - var2 > 5 && var0.charAt(var2 + 1) == 'p' && a(var0, var2 + 2, "img") && var0.charAt(var2 + 5) == '=') {
         return 0;
      } else {
         return var1 - var2 > 6
               && var0.charAt(var2 + 1) == 112
               && var0.charAt(var2 + 2) >= 50
               && var0.charAt(var2 + 2) <= 56
               && a(var0, var2 + 3, "img")
               && var0.charAt(var2 + 6) == 61
            ? var0.charAt(var2 + 2) - 49
            : -1;
      }
   }

   public static int c(String var0, int var1, int var2) {
      int var3 = b(var0, var1, var2);
      if (var3 == -1) {
         return -1;
      } else {
         int var4 = var2 + (var3 == 0 ? 6 : 7);
         if (var4 >= var1) {
            return -1;
         } else {
            int var5 = 0;

            for (int var6 = var4; var6 < var1; var6++) {
               char var7 = var0.charAt(var6);
               if (var7 < '0' || var7 > '9') {
                  return -1;
               }

               var5 = var5 * 10 + var7 - 48;
            }

            return var5;
         }
      }
   }

   public static int[] d(String var0, int var1, int var2) {
      rs.p_l.p_f.C_e var3 = rs.p_l.p_f.C_e.d();
      if (var3 != null && !rs.p_l.p_b.C_a.a()) {
         long var4 = (long)var0.hashCode();
         var4 = var4 * 31L + (long)var1;
         var4 = var4 * 31L + (long)var2;
         long var6 = System.nanoTime() / 1000000L;
         Long var8 = i.get(var4);
         if (var8 != null && var6 - var8 < 50L) {
            return g;
         } else {
            i.put(var4, var6);
            int var9 = a(var0);
            int var10 = Math.min(3, var9);
            int[] var11 = new int[var10];

            for (int var12 = 0; var12 < var10; var12++) {
               int var13;
               boolean var14;
               do {
                  var13 = C_Client_mc.d(var9 - 1);
                  var14 = false;

                  for (int var15 = 0; var15 < var12; var15++) {
                     if (var11[var15] == var13) {
                        var14 = true;
                        break;
                     }
                  }
               } while (var14);

               var11[var12] = var13;
            }

            Arrays.sort(var11);
            return var11;
         }
      } else {
         return g;
      }
   }

   private static int a(String var0) {
      int var1 = 0;
      int var2 = -1;
      int var3 = 0;

      while (var3 < var0.length()) {
         if (var0.charAt(var3) == '@') {
            int var4 = a(var0, var3);
            if (var4 != -1) {
               var2 = var4;
               var3 += var4 == 0 ? 5 : 6;
               continue;
            }

            int var5 = var0.indexOf(64, var3 + 1);
            if (var5 > var3 && var5 - var3 <= 6) {
               var3 = var5 + 1;
               continue;
            }
         }

         if (var0.charAt(var3) == '<') {
            int var6 = var0.indexOf(62, var3 + 1);
            if (var6 != -1) {
               int var7 = a(var0, var6, var3);
               if (var7 != -1) {
                  var2 = var7 == -2 ? -1 : var7;
               } else if (b(var0, var6, var3) != -1) {
                  var1++;
               }

               var3 = var6 + 1;
               continue;
            }
         }

         if (var2 != -1 && !Character.isWhitespace(var0.charAt(var3))) {
            var1++;
         }

         var3++;
      }

      return var1;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      rs.p_l.p_f.C_e var5 = rs.p_l.p_f.C_e.d();
      if (var5 != null && var2 > 0 && var3 > 0 && var0 < C_c.m && var0 + var2 > C_c.l && var1 < C_c.k && var1 + var3 > C_c.j) {
         int var6 = var0 + C_Client_mc.d(Math.max(0, var2 - 1));
         int var7 = var1 + C_Client_mc.d(Math.max(0, var3 - 1));
         rs.p_l.p_f.p_a.p_f.C_a var8 = new rs.p_l.p_f.p_a.p_f.C_a(var6, var7, a(var4));
         var8.a(C_Client_mc.d(1) == 0 ? rs.p_l.p_f.p_a.p_f.C_b.b : rs.p_l.p_f.p_a.p_f.C_b.a);
         var8.b(C_Client_mc.d(1) == 0 ? -0.075 : 0.075);
         var8.a((double)(1 + C_Client_mc.d(25)));
         int var9 = C_Client_mc.d(4) == 0 ? 3 : 2;
         var8.b(var9, var9);
         var8.e(1);
         var8.i(220);
         var8.b(250L + 100L * (long)C_Client_mc.d(3));
         var5.g().a(var8);
      }
   }

   private static int a(int var0) {
      if ((var0 & 16777216) != 0) {
         return var0 & 16777215;
      } else {
         int var1 = Math.max(0, Math.min(h.length - 1, var0));
         int[] var2 = h[var1];
         return var2[C_Client_mc.d(var2.length - 1)];
      }
   }

   private static int e(String var0, int var1, int var2) {
      if (var1 >= var2) {
         return -1;
      } else {
         int var3 = var2 - var1 >= 6 ? 16 : 10;
         int var4 = 0;

         for (int var5 = var1; var5 < var2; var5++) {
            int var6 = Character.digit(var0.charAt(var5), var3);
            if (var6 == -1) {
               return -1;
            }

            var4 = var4 * var3 + var6;
            if (var4 > 16777215) {
               return -1;
            }
         }

         return var4;
      }
   }

   private static boolean a(String var0, int var1, String var2) {
      return var1 >= 0 && var1 + var2.length() <= var0.length() && var0.regionMatches(var1, var2, 0, var2.length());
   }
}
