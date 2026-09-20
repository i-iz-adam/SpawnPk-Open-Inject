package rs.p_runelite.p_a;

import java.util.List;

public class C_e {
   @Deprecated
   public static List<C_i> a(List<C_i> var0) {
      int[] var1 = new int[var0.size()];
      int[] var2 = new int[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         C_i var4 = (C_i)var0.get(var3);
         var1[var3] = var4.a();
         var2[var3] = var4.b();
      }

      C_m var5 = a(var1, var2);
      return var5 == null ? null : var5.e();
   }

   public static C_m a(int[] var0, int[] var1) {
      int var2 = var0.length;
      int var3 = 0;

      int var4;
      for (var4 = 0; var3 < var2; var3++) {
         if (var0[var3] == Integer.MIN_VALUE) {
            var4++;
            var3++;
            break;
         }
      }

      for (; var3 < var2; var3++) {
         if (var0[var3] == Integer.MIN_VALUE) {
            var4++;
         } else {
            var0[var3 - var4] = var0[var3];
            var1[var3 - var4] = var1[var3];
         }
      }

      var2 -= var4;
      if (var2 < 3) {
         return null;
      } else {
         var3 = a(var0, var1, var2);
         var4 = var3;
         C_m var5 = new C_m(new int[16], new int[16], 0);

         int var8;
         do {
            int var6 = var0[var4];
            int var7 = var1[var4];
            var5.b(var6, var7);
            if (var5.d() > var2) {
               return null;
            }

            var8 = 0;
            int var9 = var0[var8];
            int var10 = var1[var8];

            for (int var11 = 1; var11 < var2; var11++) {
               long var12 = a(var6, var7, var0[var11], var1[var11], var9, var10);
               if (var12 > 0L || var12 == 0L && a(var6 - var0[var11]) + a(var7 - var1[var11]) > a(var6 - var9) + a(var7 - var10)) {
                  var8 = var11;
                  var9 = var0[var11];
                  var10 = var1[var11];
               }
            }

            var4 = var8;
         } while (var8 != var3);

         return var5;
      }
   }

   private static int a(int var0) {
      return var0 * var0;
   }

   private static int a(int[] var0, int[] var1, int var2) {
      int var3 = 0;
      int var4 = var0[var3];
      int var5 = var1[var3];

      for (int var6 = 1; var6 < var2; var6++) {
         int var7 = var0[var6];
         if (var7 < var4 || var7 == var4 && var1[var6] < var5) {
            var3 = var6;
            var4 = var0[var6];
            var5 = var1[var6];
         }
      }

      return var3;
   }

   private static long a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (long)(var3 - var1) * (long)(var4 - var2) - (long)(var2 - var0) * (long)(var5 - var3);
   }
}
