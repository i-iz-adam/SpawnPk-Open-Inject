package rs.p_d;

import rs.C_F_uc;
import rs.p_l.C_E_uc;

public class C_e {
   public static C_F_uc a = new C_F_uc(20);
   public static C_F_uc b = new C_F_uc(20);

   public static void a() {
      a.a();
      b.a();
   }

   public static rs.p_l.C_F_uc a(C_e.a var0, int var1, int var2) {
      C_F_uc var3 = null;
      switch (var0) {
         case a:
            var3 = a;
            break;
         case b:
            var3 = b;
      }

      rs.p_l.C_F_uc var4 = (rs.p_l.C_F_uc)var3.a((long)var1);
      if (var4 != null && var4.s != var2 && var4.s != -1) {
         var4.b();
         var4 = null;
      }

      if (var4 != null) {
         return var4;
      } else {
         rs.p_a.C_h var5 = null;
         int var6 = 2750;
         byte var7 = 40;
         short var8 = 1882;
         boolean var9 = false;
         boolean var10 = false;
         int var11 = 0;
         switch (var0) {
            case a:
               C_d var12 = C_d.c(var1);
               if (var12 == null) {
                  return null;
               }

               var5 = var12.b();
               var11 = 25;
               break;
            case b:
               C_r.I = true;

               try {
                  C_r var13 = C_r.c(var1);
                  if (var13 == null) {
                     return null;
                  }

                  var5 = var13.a(10, -1, 0, -1);
                  if (var5 == null) {
                     return null;
                  }

                  var11 = var5.g / 2;
               } finally {
                  C_r.I = false;
               }
         }

         if (var5 == null) {
            return null;
         } else {
            int var35 = var2 > 32 ? var2 : 32;
            rs.p_l.C_F_uc var36 = new rs.p_l.C_F_uc(var35, var35);
            int var38 = C_E_uc.s;
            int var15 = C_E_uc.t;
            int[] var16 = C_E_uc.x;
            int[] var17 = rs.p_l.C_c.g;
            int var18 = rs.p_l.C_c.h;
            int var19 = rs.p_l.C_c.i;
            int var20 = rs.p_l.C_c.l;
            int var21 = rs.p_l.C_c.m;
            int var22 = rs.p_l.C_c.j;
            int var23 = rs.p_l.C_c.k;
            C_E_uc.p = false;
            C_E_uc.q = false;
            rs.p_l.C_c.a(var35, var35, var36.m, null);
            rs.p_l.C_c.a(0, 0, var35, var35, 0, true);
            C_E_uc.f();
            var6 = (int)Math.floor((double)((float)var6 * (32.0F / (float)var2)));
            int var24 = C_E_uc.v[var7] * var6 >> 16;
            int var25 = C_E_uc.w[var7] * var6 >> 16;
            C_E_uc.h = true;

            try {
               if (var0 == C_e.a.a) {
                  var5.b(64, 768, -50, -10, -50, true);
               }

               var5.a(var8, 0, var7, 0, var24 + var11, var25 + var11);
            } finally {
               C_E_uc.h = false;
            }

            for (int var26 = var2 > 32 ? var2 - 1 : 31; var26 >= 0; var26--) {
               for (int var27 = var2 > 32 ? var2 - 1 : 31; var27 >= 0; var27--) {
                  if (var36.m[var26 + var27 * (var2 > 32 ? var2 : 32)] == 0) {
                     if (var26 > 0 && var36.m[var26 - 1 + var27 * (var2 > 32 ? var2 : 32)] > 1) {
                        var36.m[var26 + var27 * (var2 > 32 ? var2 : 32)] = 0;
                     } else if (var27 > 0 && var36.m[var26 + (var27 - 1) * (var2 > 32 ? var2 : 32)] > 1) {
                        var36.m[var26 + var27 * (var2 > 32 ? var2 : 32)] = 0;
                     } else if (var26 < (var2 > 32 ? var2 - 1 : 31) && var36.m[var26 + 1 + var27 * (var2 > 32 ? var2 : 32)] > 1) {
                        var36.m[var26 + var27 * (var2 > 32 ? var2 : 32)] = 0;
                     } else if (var27 < (var2 > 32 ? var2 - 1 : 31) && var36.m[var26 + (var27 + 1) * (var2 > 32 ? var2 : 32)] > 1) {
                        var36.m[var26 + var27 * (var2 > 32 ? var2 : 32)] = 0;
                     }
                  }
               }
            }

            if (var2 <= 32) {
               for (int var39 = var2 > 32 ? var2 - 1 : 31; var39 >= 0; var39--) {
                  for (int var40 = var2 > 32 ? var2 - 1 : 31; var40 >= 0; var40--) {
                     if (var36.m[var39 + var40 * (var2 > 32 ? var2 : 32)] == 0 && var39 > 0 && var40 > 0 && var36.m[var39 - 1 + (var40 - 1) * 32] > 0) {
                        var36.m[var39 + var40 * (var2 > 32 ? var2 : 32)] = 3153952;
                     }
                  }
               }
            }

            var3.a(var36, (long)var1);
            rs.p_l.C_c.a(var18, var19, var17, null);
            rs.p_l.C_c.c(var23, var20, var21, var22);
            C_E_uc.s = var38;
            C_E_uc.t = var15;
            C_E_uc.x = var16;
            C_E_uc.p = true;
            C_E_uc.q = true;
            var36.r = var2;
            var36.s = var2;
            var36.h = var2;
            return var36;
         }
      }
   }

   public static enum a {
      a,
      b;
   }
}
