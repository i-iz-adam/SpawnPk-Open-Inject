package rs.p_k;

import rs.C_Client_mc;
import rs.C_H_uc;
import rs.C_I_uc;
import rs.C_J_uc;
import rs.C_T_uc;
import rs.C_U_uc;
import rs.C_V_uc;
import rs.p_d.C_r;
import rs.p_gui.C_Launcher_mc;

class C_l {
   final int a = 10;
   int b = (int)System.nanoTime();
   private int c;
   private int d;
   private int e;
   private int f;
   private static int[] g;
   private static char[] h;
   private static char[][] i;
   private static float[] j;
   private static float[] k;
   private static int[] l;
   private static int[] m;
   private static int[] n;
   private static int[] o;
   private static int[] p;
   private static int[] q;
   private static int[] r;
   private static int[][] s;

   void a(C_V_uc var1, C_d var2, C_c var3) {
      this.b++;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      var2.b();
      var3.b();

      for (int var4 = 0; var4 < 4; var4++) {
         for (int var5 = 0; var5 < 104; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
               C_H_uc var7 = var1.c()[var4][var5][var6];
               if (var7 != null) {
                  this.a(var7, var2, var3);
               }
            }
         }
      }

      if (rs.p_f.C_a.d) {
         System.out.println();
         System.out.println("Objects loaded: " + this.e + " (reloadAttempts=" + this.f + "\tobj_type=" + C_r.E.name() + ")");
      }

      if (this.e == 0) {
         if (rs.p_f.C_a.d) {
            System.out.println("..checking reload validity");
         }

         if (this.f < 10 && C_r.E == C_r.a.d) {
            if (rs.p_f.C_a.d) {
               System.out.println("..attempting reload");
            }

            rs.p_h.C_c.a(() -> {
               C_Launcher_mc.n().o();
               C_Client_mc.ee = 1;
            });
            this.f++;
         }
      } else {
         if (rs.p_f.C_a.d) {
            System.out.println("..reset attempt counter");
         }

         this.f = 0;
      }
   }

   private void a(C_H_uc var1, C_d var2, C_c var3) {
      C_H_uc var4 = var1.d();
      if (var4 != null) {
         this.a(var4, var2, var3);
      }

      C_J_uc var5 = var1.a();
      if (var5 != null) {
         var5.a(this.c);
         if (var5.e() != -1) {
            var5.b(this.d);
         } else {
            var5.b(-1);
         }

         rs.p_runelite.p_a.C_i var6 = new rs.p_runelite.p_a.C_i(var1.k(), var1.l());
         int var7 = this.a(var5, var1.j(), var6.a(), var6.b(), var2, var3, false);
         var5.c(var7);
         this.c += var7;
         if (var5.e() != -1) {
            this.d += var7;
         }
      }

      C_I_uc var16 = var1.c();
      if (var16 != null) {
         var16.a(this.c);
         if (var16.g() != null) {
            var16.b(this.d);
         } else {
            var16.b(-1);
         }

         int var17 = this.a(var16, var1.k(), var1.l(), var2, var3);
         var16.c(var17);
         this.c += var17;
         if (var16.g() != null) {
            this.d += var17;
         }
      }

      C_U_uc var18 = var1.e();
      if (var18 != null) {
         rs.p_a.C_a var8 = var18.a();
         if (var8 instanceof rs.p_a.C_h) {
            this.a((rs.p_a.C_h)var8, var2, var3);
         }

         rs.p_a.C_a var9 = var18.b();
         if (var9 instanceof rs.p_a.C_h) {
            this.a((rs.p_a.C_h)var9, var2, var3);
         }
      }

      rs.C_m var19 = var1.g();
      if (var19 != null) {
         rs.p_a.C_a var20 = var19.a();
         if (var20 instanceof rs.p_a.C_h) {
            this.a((rs.p_a.C_h)var20, var2, var3);
         }
      }

      C_T_uc var21 = var1.f();
      if (var21 != null) {
         rs.p_a.C_a var10 = var21.a();
         if (var10 instanceof rs.p_a.C_h) {
            this.a((rs.p_a.C_h)var10, var2, var3);
         }
      }

      rs.C_l[] var22 = var1.i();

      for (rs.C_l var14 : var22) {
         if (var14 != null) {
            rs.p_a.C_a var15 = var14.a();
            if (var15 instanceof rs.p_a.C_h) {
               this.a((rs.p_a.C_h)var14.a(), var2, var3);
               this.e++;
            }
         }
      }
   }

   public int a(C_J_uc var1, int var2, int var3, int var4, C_d var5, C_c var6, boolean var7) {
      int[][][] var8 = C_Launcher_mc.n().o().aQ();
      int var9 = var7 ? 128 * var3 : 0;
      int var10 = var7 ? 128 * var4 : 0;
      int var11 = var8[var2][var3][var4];
      int var12 = var8[var2][var3 + 1][var4];
      int var13 = var8[var2][var3 + 1][var4 + 1];
      int var14 = var8[var2][var3][var4 + 1];
      int var15 = var1.c();
      int var16 = var1.d();
      int var17 = var1.b();
      int var18 = var1.a();
      if (var15 == 12345678) {
         return 0;
      } else {
         var5.a(24);
         var6.a(24);
         int var23 = var9 + 128;
         int var27 = var9 + 128;
         int var28 = var10 + 128;
         int var32 = var10 + 128;
         var5.a(var27, var13, var28, var15);
         var5.a(var9, var14, var32, var16);
         var5.a(var23, var12, var10, var17);
         var5.a(var9, var11, var10, var18);
         var5.a(var23, var12, var10, var17);
         var5.a(var9, var14, var32, var16);
         if (var7 || var1.e() != -1) {
            float var35 = (float)var1.e() + 1.0F;
            var6.a(var35, 1.0F, 1.0F, 0.0F);
            var6.a(var35, 0.0F, 1.0F, 0.0F);
            var6.a(var35, 1.0F, 0.0F, 0.0F);
            var6.a(var35, 0.0F, 0.0F, 0.0F);
            var6.a(var35, 1.0F, 0.0F, 0.0F);
            var6.a(var35, 0.0F, 1.0F, 0.0F);
         }

         return 6;
      }
   }

   private int a(C_I_uc var1, int var2, int var3, C_d var4, C_c var5) {
      int[] var6 = var1.h();
      int[] var7 = var1.i();
      int[] var8 = var1.j();
      int[] var9 = var1.d();
      int[] var10 = var1.e();
      int[] var11 = var1.f();
      int[] var12 = var1.k();
      int[] var13 = var1.l();
      int[] var14 = var1.m();
      int[] var15 = var1.g();
      int var16 = var6.length;
      var4.a(var16 * 12);
      var5.a(var16 * 12);
      int var17 = 128 * var2;
      int var18 = 128 * var3;
      byte var19 = 0;

      for (int var20 = 0; var20 < var16; var20++) {
         int var21 = var6[var20];
         int var22 = var7[var20];
         int var23 = var8[var20];
         int var24 = var12[var20];
         int var25 = var13[var20];
         int var26 = var14[var20];
         if (var24 != 12345678) {
            var19 += 3;
            int var27 = var9[var21] - var17;
            int var28 = var11[var21] - var18;
            int var29 = var9[var22] - var17;
            int var30 = var11[var22] - var18;
            int var31 = var9[var23] - var17;
            int var32 = var11[var23] - var18;
            var4.a(var27, var10[var21], var28, var24);
            var4.a(var29, var10[var22], var30, var25);
            var4.a(var31, var10[var23], var32, var26);
            if (var15 != null) {
               if (var15[var20] != -1) {
                  float var33 = (float)var15[var20] + 1.0F;
                  var5.a(var33, (float)var27 / 128.0F, (float)var28 / 128.0F, 0.0F);
                  var5.a(var33, (float)var29 / 128.0F, (float)var30 / 128.0F, 0.0F);
                  var5.a(var33, (float)var31 / 128.0F, (float)var32 / 128.0F, 0.0F);
               } else {
                  var5.a(0.0F, 0.0F, 0.0F, 0.0F);
                  var5.a(0.0F, 0.0F, 0.0F, 0.0F);
                  var5.a(0.0F, 0.0F, 0.0F, 0.0F);
               }
            }
         }
      }

      return var19;
   }

   int a(C_J_uc var1, int var2, int var3, int var4, C_d var5, C_c var6, int var7, int var8, boolean var9) {
      int[][][] var10 = C_Launcher_mc.n().o().aQ();
      int var13 = var10[var2][var3][var4];
      int var14 = var10[var2][var3 + 1][var4];
      int var15 = var10[var2][var3 + 1][var4 + 1];
      int var16 = var10[var2][var3][var4 + 1];
      int var17 = var1.c();
      int var18 = var1.d();
      int var19 = var1.b();
      int var20 = var1.a();
      if (var17 == 12345678) {
         return 0;
      } else {
         var5.a(24);
         var6.a(24);
         int var25 = var7 + 128;
         int var29 = var7 + 128;
         int var30 = var8 + 128;
         int var34 = var8 + 128;
         var5.a(var29, var15, var30, var17);
         var5.a(var7, var16, var34, var18);
         var5.a(var25, var14, var8, var19);
         var5.a(var7, var13, var8, var20);
         var5.a(var25, var14, var8, var19);
         var5.a(var7, var16, var34, var18);
         if (var9 || var1.e() != -1) {
            float var37 = (float)var1.e() + 1.0F;
            var6.a(var37, 1.0F, 1.0F, 0.0F);
            var6.a(var37, 0.0F, 1.0F, 0.0F);
            var6.a(var37, 1.0F, 0.0F, 0.0F);
            var6.a(var37, 0.0F, 0.0F, 0.0F);
            var6.a(var37, 1.0F, 0.0F, 0.0F);
            var6.a(var37, 0.0F, 1.0F, 0.0F);
         }

         return 6;
      }
   }

   private void a(rs.p_a.C_h var1, C_d var2, C_c var3) {
      if (var1.t() <= 0) {
         var1.n(this.c);
         if (!C_e.a || var1.Y == null && !var1.d()) {
            var1.o(-1);
         } else {
            var1.o(this.d);
         }

         var1.m(this.b);
         var2.a(var1.ah * 12);
         var3.a(var1.ah * 12);
         int var4 = var1.ah;
         int var5 = 0;

         for (int var6 = 0; var6 < var4; var6++) {
            var5 += this.a(var1, var6, var2, var3);
         }

         this.c += var5;
         if (C_e.a && (var1.Y != null || var1.d())) {
            this.d += var5;
         }
      }
   }

   int a(rs.p_a.C_h var1, int var2, C_d var3, C_c var4) {
      int[] var5 = var1.ae;
      int[] var6 = var1.af;
      int[] var7 = var1.ag;
      int[] var8 = var1.ai;
      int[] var9 = var1.aj;
      int[] var10 = var1.ak;
      int[] var11 = var1.al;
      int[] var12 = var1.am;
      int[] var13 = var1.an;
      int[] var14 = var1.aq;
      short[] var15 = var1.Y;
      int[] var16 = var1.ap;
      byte var17 = var1.V;
      byte var18 = var1.S;
      byte var19 = var1.T;
      byte var20 = var1.U;
      boolean var21 = var1.d();
      int var22 = var8[var2];
      int var23 = var9[var2];
      int var24 = var10[var2];
      int var25 = var11[var2];
      int var26 = var12[var2];
      int var27 = var13[var2];
      char var28 = '\uffff';
      boolean var29 = false;
      int var30 = 0;
      if (var14 != null && (var15 == null || var15[var2] == -1)) {
         var30 = (var14[var2] & 0xFF) << 24;
         if (var14[var2] == 255) {
            var27 = -2;
         }
      }

      int var31 = 0;
      if (var16 != null) {
         var31 = (var16[var2] & 0xFF) << 16;
      }

      if (var27 == -1) {
         var27 = var25;
         var26 = var25;
      } else if (var27 == -2) {
         var3.a(0, 0, 0, 0);
         var3.a(0, 0, 0, 0);
         var3.a(0, 0, 0, 0);
         if (C_e.a && (var15 != null || var21)) {
            var4.a(0.0F, 0.0F, 0.0F, 0.0F);
            var4.a(0.0F, 0.0F, 0.0F, 0.0F);
            var4.a(0.0F, 0.0F, 0.0F, 0.0F);
         }

         return 3;
      }

      if ((var15 == null || var15[var2] == -1) && var17 > 0) {
         var25 = a(var25, var18, var19, var20, var17);
         var26 = a(var26, var18, var19, var20, var17);
         var27 = a(var27, var18, var19, var20, var17);
      }

      int var32 = var5[var22];
      int var33 = var6[var22];
      int var34 = var7[var22];
      var3.a(var32, var33, var34, var30 | var31 | (var29 ? var28 : var25));
      var32 = var5[var23];
      var33 = var6[var23];
      var34 = var7[var23];
      var3.a(var32, var33, var34, var30 | var31 | (var29 ? var28 : var26));
      var32 = var5[var24];
      var33 = var6[var24];
      var34 = var7[var24];
      var3.a(var32, var33, var34, var30 | var31 | (var29 ? var28 : var27));
      if (C_e.a && (var15 != null || var1.d())) {
         try {
            if (var1.e() != null) {
               float var35 = 0.0F;
               if (var1.d() && (var15 == null || var15[var2] <= 0)) {
                  if (var1.ao == null) {
                     var35 = 0.0F;
                  } else if ((var1.ao[var2] & 1) == 1) {
                     if (var1.ao[var2] >= 3) {
                        var35 = var1.ao[var2] > 0 ? (float)var1.ar[var2] + 1.0F : 0.0F;
                     } else {
                        var35 = 0.0F;
                     }
                  } else {
                     var35 = var1.ao[var2] > 0 ? (float)var1.ar[var2] + 1.0F : 0.0F;
                  }
               } else {
                  var35 = (float)var15[var2] + 1.0F;
               }

               var4.a(var35, var1.a(var2, 0), var1.b(var2, 0), 0.0F);
               var4.a(var35, var1.a(var2, 1), var1.b(var2, 1), 0.0F);
               var4.a(var35, var1.a(var2, 2), var1.b(var2, 2), 0.0F);
            } else {
               var4.a(0.0F, 0.0F, 0.0F, 0.0F);
               var4.a(0.0F, 0.0F, 0.0F, 0.0F);
               var4.a(0.0F, 0.0F, 0.0F, 0.0F);
            }
         } catch (Exception var36) {
            var36.printStackTrace();
            var1.l = false;
         }
      }

      return 3;
   }

   private static int a(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (var2 != -1) {
         var6 += var8 * (var2 - var6) >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   void a() {
      short var1 = 6500;
      short var2 = 6000;
      g = new int[var1];
      h = new char[var2];
      i = new char[var2][512];
      j = new float[var1];
      k = new float[var1];
      l = new int[var1];
      m = new int[var1];
      n = new int[var1];
      o = new int[12];
      p = new int[2000];
      q = new int[2000];
      r = new int[12];
      s = new int[12][2000];
   }

   void b() {
      g = null;
      h = null;
      i = null;
      j = null;
      k = null;
      l = null;
      m = null;
      n = null;
      o = null;
      p = null;
      q = null;
      r = null;
      s = null;
   }
}
