package rs;

import java.io.File;
import java.io.IOException;
import p_gnu.p_trove.p_f.p_b.C_bU_mc;
import p_gnu.p_trove.p_f.p_b.C_cc;

public final class C_k {
   public static final C_cc<Boolean> a = new C_cc();
   public static final C_bU_mc b = new C_bU_mc();
   private static final int[] p = new int[]{3502, 3353, 382, 55780, 13, 57784, 182};
   public static final int[] c = new int[]{4674, 4675, 7351, 8081, 8080};
   public static C_k[][] d;
   public static C_k[][] e;
   public int f;
   public C_K_uc g;
   public int h;
   public static byte[][] i = null;
   public static byte[][] j = null;
   public int[] k;
   public int[] l;
   public int[] m;
   public int[] n;
   public static boolean[] o;

   public static byte[] a(int var0, int var1) {
      return var0 == 0 ? i[var1] : j[var1];
   }

   public static void a(int var0) {
      d = new C_k[4000][0];
      e = new C_k[4000][0];
      rs.p_cache.p_osrs.C_c.a(new C_k[15000][0]);
   }

   public static void a(int var0, byte[] var1, boolean var2) {
      try {
         rs.p_x.C_e var3 = new rs.p_x.C_e(var1);
         C_K_uc var4 = new C_K_uc(var3, var2);
         int var5 = 0;
         if (var2) {
            var5 = var3.A();
         }

         int var6 = var3.A();
         a(var2)[var0] = new C_k[var6 * 3];
         int[] var7 = new int[500];
         int[] var8 = new int[500];
         int[] var9 = new int[500];
         int[] var10 = new int[500];

         for (int var11 = 0; var11 < var6; var11++) {
            int var12 = var2 ? var3.o() : var3.A();
            C_k var13 = a(var2)[var0][var12] = new C_k();
            var13.g = var4;
            int var14 = var3.y();
            int var15 = -1;
            int var16 = 0;

            for (int var17 = 0; var17 < var14; var17++) {
               int var18 = var3.y();
               if (var18 > 0) {
                  if (var4.d[var17] != 0) {
                     for (int var19 = var17 - 1; var19 > var15; var19--) {
                        if (var4.d[var19] == 0) {
                           var7[var16] = var19;
                           var8[var16] = 0;
                           var9[var16] = 0;
                           var10[var16] = 0;
                           var16++;
                           break;
                        }
                     }
                  }

                  var7[var16] = var17;
                  short var23 = 0;
                  if (var4.d[var17] == 3) {
                     var23 = 128;
                  }

                  if ((var18 & 1) != 0) {
                     var8[var16] = var3.x();
                  } else {
                     var8[var16] = var23;
                  }

                  if ((var18 & 2) != 0) {
                     var9[var16] = var3.x();
                  } else {
                     var9[var16] = var23;
                  }

                  if ((var18 & 4) != 0) {
                     var10[var16] = var3.x();
                  } else {
                     var10[var16] = var23;
                  }

                  var15 = var17;
                  var16++;
               }
            }

            var13.h = var16;
            var13.k = new int[var16];
            var13.l = new int[var16];
            var13.m = new int[var16];
            var13.n = new int[var16];

            for (int var22 = 0; var22 < var16; var22++) {
               var13.k[var22] = var7[var22];
               var13.l[var22] = var8[var22];
               var13.m[var22] = var9[var22];
               var13.n[var22] = var10[var22];
            }
         }
      } catch (Exception var20) {
         System.out.println("Anim error for file: " + var0 + " [osrs=" + var2 + "]");
         var20.printStackTrace();
      }
   }

   public static void b(int var0) {
      try {
         rs.p_x.C_e var1 = new rs.p_x.C_e(C_i.a(rs.p_v.C_a.f() + "/old_osrs_anims/" + var0 + ".dat"));
         C_K_uc var2 = new C_K_uc(var1);
         int var3 = var1.A();
         e[var0] = new C_k[(int)((double)var3 * 1.5)];
         int[] var4 = new int[500];
         int[] var5 = new int[500];
         int[] var6 = new int[500];
         int[] var7 = new int[500];

         for (int var8 = 0; var8 < var3; var8++) {
            int var9 = var1.A();
            C_k var10 = e[var0][var9] = new C_k();
            var10.g = var2;
            int var11 = var1.y();
            int var12 = 0;
            int var13 = -1;

            for (int var14 = 0; var14 < var11; var14++) {
               int var15 = var1.y();
               if (var15 > 0) {
                  if (var2.d[var14] != 0) {
                     for (int var16 = var14 - 1; var16 > var13; var16--) {
                        if (var2.d[var16] == 0) {
                           var4[var12] = var16;
                           var5[var12] = 0;
                           var6[var12] = 0;
                           var7[var12] = 0;
                           var12++;
                           break;
                        }
                     }
                  }

                  var4[var12] = var14;
                  short var19 = 0;
                  if (var2.d[var14] == 3) {
                     var19 = 128;
                  }

                  if ((var15 & 1) != 0) {
                     var5[var12] = (short)var1.x();
                  } else {
                     var5[var12] = var19;
                  }

                  if ((var15 & 2) != 0) {
                     var6[var12] = var1.x();
                  } else {
                     var6[var12] = var19;
                  }

                  if ((var15 & 4) != 0) {
                     var7[var12] = var1.x();
                  } else {
                     var7[var12] = var19;
                  }

                  var13 = var14;
                  var12++;
               }
            }

            var10.h = var12;
            var10.k = new int[var12];
            var10.l = new int[var12];
            var10.m = new int[var12];
            var10.n = new int[var12];

            for (int var18 = 0; var18 < var12; var18++) {
               var10.k[var18] = var4[var18];
               var10.l[var18] = var5[var18];
               var10.m[var18] = var6[var18];
               var10.n[var18] = var7[var18];
            }
         }
      } catch (Exception var17) {
      }
   }

   public static void c(int var0) {
      try {
         rs.p_x.C_e var1 = new rs.p_x.C_e(C_i.a(rs.p_v.C_a.f() + "/misc/" + var0 + ".dat"));
         C_K_uc var2 = new C_K_uc(var1);
         int var3 = var1.A();
         a()[var0] = new C_k[(int)((double)var3 * 3.0)];
         int[] var4 = new int[500];
         int[] var5 = new int[500];
         int[] var6 = new int[500];
         int[] var7 = new int[500];

         for (int var8 = 0; var8 < var3; var8++) {
            int var9 = var1.A();
            C_k var10 = a()[var0][var9] = new C_k();
            var10.g = var2;
            int var11 = var1.y();
            int var12 = 0;
            int var13 = -1;

            for (int var14 = 0; var14 < var11; var14++) {
               int var15 = var1.y();
               if (var15 > 0) {
                  if (var2.d[var14] != 0) {
                     for (int var16 = var14 - 1; var16 > var13; var16--) {
                        if (var2.d[var16] == 0) {
                           var4[var12] = var16;
                           var5[var12] = 0;
                           var6[var12] = 0;
                           var7[var12] = 0;
                           var12++;
                           break;
                        }
                     }
                  }

                  var4[var12] = var14;
                  short var19 = 0;
                  if (var2.d[var14] == 3) {
                     var19 = 128;
                  }

                  if ((var15 & 1) != 0) {
                     var5[var12] = (short)var1.q();
                  } else {
                     var5[var12] = var19;
                  }

                  if ((var15 & 2) != 0) {
                     var6[var12] = var1.q();
                  } else {
                     var6[var12] = var19;
                  }

                  if ((var15 & 4) != 0) {
                     var7[var12] = var1.q();
                  } else {
                     var7[var12] = var19;
                  }

                  var13 = var14;
                  var12++;
               }
            }

            var10.h = var12;
            var10.k = new int[var12];
            var10.l = new int[var12];
            var10.m = new int[var12];
            var10.n = new int[var12];

            for (int var18 = 0; var18 < var12; var18++) {
               var10.k[var18] = var4[var18];
               var10.l[var18] = var5[var18];
               var10.m[var18] = var6[var18];
               var10.n[var18] = var7[var18];
            }
         }
      } catch (Exception var17) {
      }
   }

   public static C_k[][] a() {
      return a(rs.p_cache.p_osrs.C_c.a());
   }

   public static C_k[][] a(boolean var0) {
      return var0 ? rs.p_cache.p_osrs.C_c.c() : d;
   }

   public static void b() {
      d = null;
      e = null;
      rs.p_cache.p_osrs.C_c.a((rs.C_k[][])null);
   }

   public static boolean b(int var0, int var1) {
      return false;
   }

   public static C_k c(int var0, int var1) {
      boolean var2 = rs.p_d.C_a.a[var1].w;
      int var3 = var0 >> 16;
      int var4 = var0 & 4095;
      if (var3 == 0) {
         System.out.println(var3 + " " + var1 + " " + var2);
      }

      if (a.b(var1) != null && var3 < e.length && !rs.p_cache.p_osrs.C_c.a()) {
         if (e[var3].length == 0) {
            System.out.println("Loading OSRS: " + var3);
            File var5 = new File(rs.p_v.C_a.f() + "/old_osrs_anims/" + var3 + ".dat");
            if (var5.exists()) {
               b(var3);
            } else {
               System.out.println("[Animations] Could not find OSRS animation file " + var3);
            }
         }

         if (e[var3].length != 0 && var4 < e[var3].length) {
            return e[var3][var4];
         }
      }

      if (var3 >= a().length) {
         return null;
      } else {
         if (a()[var3].length == 0) {
            boolean var13 = false;
            if (!rs.p_cache.p_osrs.C_c.a()) {
               for (int var9 : p) {
                  if (var3 == var9) {
                     c(var3);
                     var13 = true;
                     break;
                  }
               }
            }

            if (!var13) {
               rs.p_cache.p_osrs.C_c.a(var2);

               try {
                  a(var3, var2);
               } finally {
                  rs.p_cache.p_osrs.C_c.a(false);
               }
            }
         }

         return var3 < a(var2).length && var4 < a(var2)[var3].length ? a(var2)[var3][var4] : null;
      }
   }

   public static void a(int var0, boolean var1) {
      byte[] var2;
      try {
         var2 = C_Client_mc.ew.a(1, var0, var1 ? 1 : 0);
      } catch (IOException var4) {
         return;
      }

      if (var2 != null) {
         int var3 = (var2[1] & 255) + ((var2[0] & 255) << 8);
         if (var3 == 420) {
            rs.p_u.C_b.a(var0, var2);
         } else {
            a(var0, var2, var1);
         }
      }
   }

   public static C_k[][] d(int var0) {
      return a.b(var0) != null && !rs.p_cache.p_osrs.C_c.a() ? e : a();
   }

   public static int e(int var0) {
      String var1;
      return Integer.parseInt((var1 = Integer.toHexString(var0)).substring(0, var1.length() - 4), 16);
   }

   public boolean f(int var1) {
      return g(var1);
   }

   public static boolean g(int var0) {
      return var0 == -1;
   }
}
