package rs.p_runelite.p_a;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_h {
   public static final int a = 7;
   public static final int b = 128;
   public static final int c = 104;
   public static final double d = 0.0030679615757712823;
   public static final int[] e = new int[2048];
   public static final int[] f = new int[2048];

   public static C_i a(@Nonnull C_f var0, int var1) {
      return a(var0, var1, 0);
   }

   public static C_i a(@Nonnull C_f var0, int var1, int var2) {
      int var3 = d(var0, var1);
      return a(var0.b(), var0.c(), var3 - var2);
   }

   public static C_i a(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         C_Client_mc var3 = C_Launcher_mc.n().o();
         var0 -= C_Client_mc.cJ;
         var1 -= C_Client_mc.cL;
         var2 -= C_Client_mc.cK;
         int var4 = var3.cR;
         int var5 = var3.cS;
         int var6 = e[var4];
         int var7 = f[var4];
         int var8 = e[var5];
         int var9 = f[var5];
         int var10 = var0 * var9 + var1 * var8 >> 16;
         int var11 = var1 * var9 - var0 * var8 >> 16;
         int var12 = var2 * var7 - var11 * var6 >> 16;
         int var13 = var11 * var7 + var2 * var6 >> 16;
         if (var13 >= 50) {
            int var14 = var3.aL();
            int var15 = var3.at() / 2 + var10 * var14 / var13;
            int var16 = var3.as() / 2 + var12 * var14 / var13;
            return new C_i(var15 + var3.ag(), var16 + var3.ah());
         }
      }

      return null;
   }

   public static Polygon a(@Nonnull C_f var0) {
      return c(var0, 1);
   }

   public static Polygon b(@Nonnull C_f var0, int var1) {
      return a(var0, 1, 1, C_Client_mc.dw, var1);
   }

   public static Polygon c(@Nonnull C_f var0, int var1) {
      return a(var0, var1, var1, C_Client_mc.dw, 0);
   }

   public static Polygon a(@Nonnull C_f var0, int var1, int var2, int var3, int var4) {
      if (!var0.a()) {
         return null;
      } else {
         byte[][][] var5 = C_Launcher_mc.n().o().gc;
         int var6 = var0.d();
         int var7 = var0.e();
         int var8 = var3;
         if (var3 < 3 && (var5[1][var6][var7] & 2) == 2) {
            var8 = var3 + 1;
         }

         int var9 = var0.b() - var1 * 128 / 2;
         int var10 = var0.c() - var2 * 128 / 2;
         int var11 = var0.b() + var1 * 128 / 2;
         int var12 = var0.c() + var2 * 128 / 2;
         int var17 = b(var9, var10, var8) - var4;
         int var18 = b(var11, var10, var8) - var4;
         int var19 = b(var11, var12, var8) - var4;
         int var20 = b(var9, var12, var8) - var4;
         C_i var21 = a(var9, var10, var17);
         C_i var22 = a(var11, var10, var18);
         C_i var23 = a(var11, var12, var19);
         C_i var24 = a(var9, var12, var20);
         if (var21 != null && var22 != null && var23 != null && var24 != null) {
            Polygon var25 = new Polygon();
            var25.addPoint(var21.a(), var21.b());
            var25.addPoint(var22.a(), var22.b());
            var25.addPoint(var23.a(), var23.b());
            var25.addPoint(var24.a(), var24.b());
            return var25;
         } else {
            return null;
         }
      }
   }

   public static int d(@Nonnull C_f var0, int var1) {
      int var2 = var0.d();
      int var3 = var0.e();
      if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
         byte[][][] var4 = C_Launcher_mc.n().o().gc;
         int[][][] var5 = C_Launcher_mc.n().o().fC;
         int var6 = var1;
         if (var1 < 3 && (var4[1][var2][var3] & 2) == 2) {
            var6 = var1 + 1;
         }

         int var7 = var0.b() & 127;
         int var8 = var0.c() & 127;
         int var9 = var7 * var5[var6][var2 + 1][var3] + (128 - var7) * var5[var6][var2][var3] >> 7;
         int var10 = var5[var6][var2][var3 + 1] * (128 - var7) + var7 * var5[var6][var2 + 1][var3 + 1] >> 7;
         return (128 - var8) * var9 + var8 * var10 >> 7;
      } else {
         return 0;
      }
   }

   private static int b(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
         int[][][] var5 = C_Launcher_mc.n().o().fC;
         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = var6 * var5[var2][var3 + 1][var4] + (128 - var6) * var5[var2][var3][var4] >> 7;
         int var9 = var5[var2][var3][var4 + 1] * (128 - var6) + var6 * var5[var2][var3 + 1][var4 + 1] >> 7;
         return (128 - var7) * var8 + var7 * var9 >> 7;
      } else {
         return 0;
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9) {
      if (rs.p_k.C_e.a()) {
         b(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      } else {
         c(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   private static void b(int var0, int var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9) {
      C_Client_mc var10 = C_Launcher_mc.n().o();
      int var11 = var10.cR;
      int var12 = var10.cS;
      float var13 = (float)e[var11] / 65536.0F;
      float var14 = (float)f[var11] / 65536.0F;
      float var15 = (float)e[var12] / 65536.0F;
      float var16 = (float)f[var12] / 65536.0F;
      float var17 = (float)e[var4] / 65536.0F;
      float var18 = (float)f[var4] / 65536.0F;
      float var19 = (float)(var1 - C_Client_mc.cJ);
      float var20 = (float)(var2 - C_Client_mc.cL);
      float var21 = (float)(var3 - C_Client_mc.cK);
      float var22 = (float)var10.at() / 2.0F;
      float var23 = (float)var10.as() / 2.0F;
      float var24 = 4.0F;
      float var25 = 4.0F;
      float var26 = (float)var10.aL();

      for (int var27 = 0; var27 < var0; var27++) {
         float var28 = (float)var5[var27];
         float var29 = (float)var6[var27];
         float var30 = (float)var7[var27];
         if (var4 != 0) {
            float var31 = var28;
            var28 = var28 * var18 + var29 * var17;
            var29 = var29 * var18 - var31 * var17;
         }

         var28 += var19;
         var29 += var20;
         var30 += var21;
         float var40 = var28 * var16 + var29 * var15;
         float var32 = var29 * var16 - var28 * var15;
         float var33 = var30 * var14 - var32 * var13;
         float var34 = var32 * var14 + var30 * var13;
         int var35;
         int var36;
         if (var34 < 50.0F) {
            var35 = Integer.MIN_VALUE;
            var36 = Integer.MIN_VALUE;
         } else {
            var35 = Math.round(var22 + var40 * var26 / var34 + 4.0F);
            var36 = Math.round(var23 + var33 * var26 / var34 + 4.0F);
         }

         var8[var27] = var35;
         var9[var27] = var36;
      }
   }

   private static void c(int var0, int var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9) {
      C_Client_mc var10 = C_Launcher_mc.n().o();
      int var11 = var10.cR;
      int var12 = var10.cS;
      int var13 = e[var11];
      int var14 = f[var11];
      int var15 = e[var12];
      int var16 = f[var12];
      int var17 = e[var4];
      int var18 = f[var4];
      int var19 = var1 - C_Client_mc.cJ;
      int var20 = var2 - C_Client_mc.cL;
      int var21 = var3 - C_Client_mc.cK;
      int var22 = var10.at() / 2;
      int var23 = var10.as() / 2;
      int var24 = var10.ag();
      int var25 = var10.ah();
      int var26 = var10.aL();

      for (int var27 = 0; var27 < var0; var27++) {
         int var28 = var5[var27];
         int var29 = var6[var27];
         int var30 = var7[var27];
         if (var4 != 0) {
            int var31 = var28;
            var28 = var28 * var18 + var29 * var17 >> 16;
            var29 = var29 * var18 - var31 * var17 >> 16;
         }

         var28 += var19;
         var29 += var20;
         var30 += var21;
         int var40 = var28 * var16 + var29 * var15 >> 16;
         int var32 = var29 * var16 - var28 * var15 >> 16;
         int var33 = var30 * var14 - var32 * var13 >> 16;
         int var34 = var32 * var14 + var30 * var13 >> 16;
         int var35;
         int var36;
         if (var34 < 50) {
            var35 = Integer.MIN_VALUE;
            var36 = Integer.MIN_VALUE;
         } else {
            var35 = var22 + var40 * var26 / var34 + var24;
            var36 = var23 + var33 * var26 / var34 + var25;
         }

         var8[var27] = var35;
         var9[var27] = var36;
      }
   }

   public static C_i a(@Nonnull Graphics2D var0, @Nonnull C_f var1, @Nullable String var2, int var3) {
      if (var2 == null) {
         return null;
      } else {
         int var4 = C_Client_mc.dw;
         C_i var5 = a(var1, var4, var3);
         return var5 == null ? null : new C_i(var5.a(), var5.b());
      }
   }

   @Nullable
   public static Shape a(rs.p_a.C_h var0, int var1, int var2, int var3, int var4) {
      C_Client_mc var5 = C_Launcher_mc.n().o();
      if (var0 == null) {
         return null;
      } else {
         C_m var6 = b(var0, var1, var2, var3, var4);
         if (var6 == null) {
            return null;
         } else if (var0.aN) {
            return var6;
         } else {
            C_l var7 = c(var0, var1, var2, var3, var4);
            if (var7 == null) {
               return null;
            } else {
               for (C_m var9 : var7.a()) {
                  var9.b(var6);
               }

               return var7;
            }
         }
      }
   }

   private static C_m b(rs.p_a.C_h var0, int var1, int var2, int var3, int var4) {
      C_Client_mc var5 = C_Launcher_mc.n().o();
      C_a var6 = var0.p(var1);
      int var7 = var6.a();
      int var8 = var6.c();
      int var9 = var6.b();
      int var10 = var6.d();
      int var11 = var6.f();
      int var12 = var6.e();
      int var13 = var7 + var10;
      int var14 = var8 + var11;
      int var15 = var9 + var12;
      var7 -= var10;
      var8 -= var11;
      var9 -= var12;
      int[] var16 = new int[]{var7, var13, var7, var13, var7, var13, var7, var13};
      int[] var17 = new int[]{var8, var8, var14, var14, var8, var8, var14, var14};
      int[] var18 = new int[]{var9, var9, var9, var9, var15, var15, var15, var15};
      int[] var19 = new int[8];
      int[] var20 = new int[8];
      c(8, var2, var3, var4, 0, var16, var17, var18, var19, var20);
      return C_e.a(var19, var20);
   }

   private static C_l<C_m> c(rs.p_a.C_h var0, int var1, int var2, int var3, int var4) {
      C_Client_mc var5 = C_Launcher_mc.n().o();
      int[] var6 = new int[var0.z()];
      int[] var7 = new int[var0.z()];
      int[] var8 = var0.an;
      c(var0.z(), var2, var3, var4, var1, var0.A(), var0.C(), var0.B(), var6, var7);
      byte var9 = 5;
      int[][] var10 = new int[][]{var0.D(), var0.E(), var0.F()};
      int var11 = var5.ag();
      int var12 = var5.ag();
      int var13 = var11 + var5.at();
      int var14 = var12 + var5.as();
      ArrayList var15 = new ArrayList(var0.G());

      label56:
      for (int var16 = 0; var16 < var0.G(); var16++) {
         if (var8[var16] != -2) {
            int var17 = Integer.MAX_VALUE;
            int var18 = Integer.MAX_VALUE;
            int var19 = Integer.MIN_VALUE;
            int var20 = Integer.MIN_VALUE;

            for (int[] var24 : var10) {
               int var25 = var24[var16];
               int var26 = var6[var25];
               int var27 = var7[var25];
               if (var26 == Integer.MIN_VALUE || var27 == Integer.MIN_VALUE) {
                  continue label56;
               }

               if (var26 < var17) {
                  var17 = var26;
               }

               if (var26 > var19) {
                  var19 = var26;
               }

               if (var27 < var18) {
                  var18 = var27;
               }

               if (var27 > var20) {
                  var20 = var27;
               }
            }

            var17 -= 5;
            var18 -= 5;
            var19 += 5;
            var20 += 5;
            if (var11 <= var19 && var13 >= var17 && var12 <= var20 && var14 >= var18) {
               C_j.c var32 = new C_j.c(var17, var18, var19, var20);
               var15.add(var32);
            }
         }
      }

      return C_j.a(var15);
   }

   static {
      for (int var0 = 0; var0 < 2048; var0++) {
         e[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615757712823));
         f[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615757712823));
      }
   }
}
