package rs.p_a;

import com.a.b.a.b;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.C_C_uc;
import rs.C_Client_mc;
import rs.C_K_uc;
import rs.C_S_uc;
import rs.C_v;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_E_uc;
import rs.p_r.C_J_uc;
import rs.p_runelite.p_a.C_o;

public class C_h extends C_a {
   public static rs.p_a.p_a.C_a h = new rs.p_a.p_a.C_a(false);
   public rs.p_a.p_a.C_a i = h;
   public static int j = 30000;
   public int k;
   public boolean l = false;
   public transient float[] m;
   private int bJ;
   public int n;
   public static C_v[] o;
   public static boolean[] p;
   public int q = 0;
   public int r = 0;
   public static int[] s = new int[256];
   public static int[] t = new int[256];
   public static int[] u = new int[256];
   public static String v = "Cla";
   public static String w = "at Cl";
   public static String x = "nt";
   public static String y = v + "n Ch" + w + "ie" + x + " ";
   public boolean z = false;
   public boolean A = false;
   public int B = 0;
   public int C = 0;
   public int D = 0;
   public int E = 0;
   public boolean F = false;
   public boolean G;
   public static int H = -1;
   public int I = -1;
   public int J = 0;
   public short K = 256;
   public int[] L;
   public byte[] M;
   public boolean N = false;
   public int O = 20;
   public int P = -1;
   public int Q = -1;
   public int R = -1;
   public byte S;
   public byte T;
   public byte U;
   public byte V;
   public int[][] W;
   public int[][] X;
   public short[] Y;
   public short[] Z;
   public byte[] aa;
   private int bK;
   private boolean bL;
   private int bM;
   private int bN;
   private boolean bO;
   private static int bP = -192;
   public static int ab;
   public static C_h ac = new C_h(true);
   private static int[] bQ = new int[2000];
   private static byte[] bR = new byte[2000];
   private static int[] bS = new int[2000];
   private static int[] bT = new int[2000];
   private static int[] bU = new int[2000];
   private static int[] bV = new int[2000];
   public int ad;
   public int[] ae;
   public int[] af;
   public int[] ag;
   public int ah;
   public int[] ai;
   public int[] aj;
   public int[] ak;
   public int[] al;
   public int[] am;
   public int[] an;
   public int[] ao;
   public int[] ap;
   public int[] aq;
   public int[] ar;
   public boolean[] as;
   public boolean[] at;
   public int au;
   public int av;
   public int[] aw;
   public int[] ax;
   public int[] ay;
   public int az;
   public int aA;
   public int aB;
   public int aC;
   public int aD;
   public int aE;
   public int aF;
   public int aG;
   public int aH;
   public int aI;
   public int[] aJ;
   public int[] aK;
   public int[][] aL;
   public int[][] aM;
   public boolean aN;
   public C_S_uc aO;
   public C_S_uc aP;
   public C_d aQ;
   static b aR = new b();
   static b aS = new b();
   static b aT = new b();
   static rs.p_cache.C_e aU;
   static int aV = 3;
   static final int aW = 8192;
   static boolean[] aX = new boolean[8192];
   static boolean[] aY = new boolean[8192];
   static int[] aZ = new int[8192];
   static int[] ba = new int[8192];
   static int[] bb = new int[8192];
   static int[] bc = new int[8192];
   static int[] bd = new int[8192];
   static int[] be = new int[8192];
   static int[] bf = new int[8192];
   static int[] bg = new int[8192];
   static int[][] bh = new int[8192][512];
   static int[] bi = new int[12];
   static int[][] bj = new int[12][2000];
   static int[] bk = new int[2000];
   static int[] bl = new int[2000];
   static int[] bm = new int[12];
   static int[] bn = new int[10];
   static int[] bo = new int[10];
   static int[] bp = new int[10];
   static int bq;
   static int br;
   static int bs;
   public static boolean bt;
   public static int bu;
   public static int bv;
   public static int bw;
   public static int[] bx = new int[1000];
   public static int[] by = new int[1000];
   public static int[] bz = new int[1000];
   public static int[] bA = C_E_uc.v;
   public static int[] bB = C_E_uc.w;
   static int[] bC = C_E_uc.B;
   static int[] bD = C_E_uc.u;
   public static boolean bE;
   public static boolean bF;
   public static int bG;
   HashMap<Integer, rs.p_runelite.p_a.C_a> bH = new HashMap<>();
   public int bI = -1;

   public boolean d() {
      return this.av > 0;
   }

   public boolean a(int var1) {
      if (!this.d() || this.ao == null || var1 >= this.ao.length) {
         return false;
      } else if (this.ao[var1] <= 0) {
         return false;
      } else {
         return (this.ao[var1] & 1) == 1 && this.ao[var1] < 3 ? false : this.ao[var1] > 0;
      }
   }

   public float a(int var1, int var2) {
      return this.m[this.c(var1, var2)];
   }

   public float b(int var1, int var2) {
      return this.m[this.d(var1, var2)];
   }

   public int c(int var1, int var2) {
      return var1 * 6 + var2;
   }

   public int d(int var1, int var2) {
      return var1 * 6 + var2 + 3;
   }

   public float[] e() {
      return this.m;
   }

   public void f() {
      if (rs.p_k.C_e.a()) {
         if (this.m == null) {
            if (this.Z != null || this.d()) {
               if (this.i.f()) {
                  this.i.c();
                  this.m = this.i.n;
               } else {
                  this.m = new float[this.ah * 6];
               }

               for (int var1 = 0; var1 < this.ah; var1++) {
                  int var2;
                  if (this.Y == null) {
                     var2 = -1;
                  } else {
                     var2 = this.Y[var1] & '\uffff';
                  }

                  boolean var3 = this.ao != null && (var2 == -1 || this.Y != null && this.Y[var1] <= 0) && this.a(var1);
                  if (var3) {
                     var2 = this.ar[var1];
                  }

                  this.m[this.c(var1, 0)] = 1.0F;
                  this.m[this.d(var1, 0)] = 1.0F;
                  this.m[this.c(var1, 1)] = 1.0F;
                  this.m[this.d(var1, 1)] = 1.0F;
                  this.m[this.c(var1, 2)] = 0.0F;
                  this.m[this.d(var1, 2)] = 0.0F;
                  if (this.aq != null && this.aq[var1] == 255) {
                     var2 = -1;
                  }

                  if (var2 != -1) {
                     int var4 = -1;
                     if (var3) {
                        var4 = this.ao[var1] >> 2;
                     } else if (this.Z != null && this.Z[var1] != -1) {
                        var4 = this.Z[var1];
                     } else {
                        var4 = this.ai[var1];
                     }

                     if (var3 && this.aw[this.ao[var1] >> 2] > this.ae.length) {
                        var4 = this.ai[var1];
                        var3 = false;
                     }

                     if (var4 != -1) {
                        int var5 = this.ai[var1];
                        int var6 = this.aj[var1];
                        int var7 = this.ak[var1];
                        int var8;
                        int var9;
                        int var10;
                        if (var3) {
                           var8 = this.aw[this.ao[var1] >> 2];
                           var9 = this.ax[this.ao[var1] >> 2];
                           var10 = this.ay[this.ao[var1] >> 2];
                        } else if (this.Z != null && this.Z[var1] >= 0) {
                           if (this.aw.length <= 0) {
                              return;
                           }

                           var8 = this.aw[this.Z[var1]];
                           var9 = this.ax[this.Z[var1]];
                           var10 = this.ay[this.Z[var1]];
                        } else {
                           var8 = this.ai[var1];
                           var9 = this.aj[var1];
                           var10 = this.ak[var1];
                        }

                        float var11 = (float)this.ae[var8];
                        float var12 = (float)this.af[var8];
                        float var13 = (float)this.ag[var8];
                        float var14 = (float)this.ae[var9] - var11;
                        float var15 = (float)this.af[var9] - var12;
                        float var16 = (float)this.ag[var9] - var13;
                        float var17 = (float)this.ae[var10] - var11;
                        float var18 = (float)this.af[var10] - var12;
                        float var19 = (float)this.ag[var10] - var13;
                        float var20 = (float)this.ae[var5] - var11;
                        float var21 = (float)this.af[var5] - var12;
                        float var22 = (float)this.ag[var5] - var13;
                        float var23 = (float)this.ae[var6] - var11;
                        float var24 = (float)this.af[var6] - var12;
                        float var25 = (float)this.ag[var6] - var13;
                        float var26 = (float)this.ae[var7] - var11;
                        float var27 = (float)this.af[var7] - var12;
                        float var28 = (float)this.ag[var7] - var13;
                        float var29 = var15 * var19 - var16 * var18;
                        float var30 = var16 * var17 - var14 * var19;
                        float var31 = var14 * var18 - var15 * var17;
                        float var32 = var18 * var31 - var19 * var30;
                        float var33 = var19 * var29 - var17 * var31;
                        float var34 = var17 * var30 - var18 * var29;
                        float var35 = 1.0F / (var32 * var14 + var33 * var15 + var34 * var16);
                        this.m[this.c(var1, 0)] = (var32 * var20 + var33 * var21 + var34 * var22) * var35;
                        this.m[this.c(var1, 1)] = (var32 * var23 + var33 * var24 + var34 * var25) * var35;
                        this.m[this.c(var1, 2)] = (var32 * var26 + var33 * var27 + var34 * var28) * var35;
                        var32 = var15 * var31 - var16 * var30;
                        var33 = var16 * var29 - var14 * var31;
                        var34 = var14 * var30 - var15 * var29;
                        var35 = 1.0F / (var32 * var17 + var33 * var18 + var34 * var19);
                        this.m[this.d(var1, 0)] = (var32 * var20 + var33 * var21 + var34 * var22) * var35;
                        this.m[this.d(var1, 1)] = (var32 * var23 + var33 * var24 + var34 * var25) * var35;
                        this.m[this.d(var1, 2)] = (var32 * var26 + var33 * var27 + var34 * var28) * var35;
                     }
                  }
               }

               this.l = true;
            }
         }
      }
   }

   public static void g() {
      o = null;
      aX = null;
      aY = null;
      ba = null;
      bb = null;
      bd = null;
      be = null;
      bf = null;
      bg = null;
      bh = null;
      bi = null;
      bj = null;
      bk = null;
      bl = null;
      bm = null;
      bA = null;
      bB = null;
      bC = null;
      bD = null;
   }

   public rs.p_runelite.p_a.C_m a(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[this.z()];
      int[] var6 = new int[this.z()];
      rs.p_runelite.p_a.C_h.a(this.z(), var1, var2, var4, var3, this.A(), this.C(), this.B(), var5, var6);
      return rs.p_runelite.p_a.C_e.a(var5, var6);
   }

   public Polygon b(int var1, int var2, int var3, int var4) {
      ArrayList<C_o> var5 = new ArrayList<>();

      for (int var6 = 0; var6 < this.ad; var6++) {
         int var7 = this.ae[var6];
         int var8 = this.af[var6];
         int var9 = this.ag[var6];
         C_o var10 = new C_o(var7, var8, var9);
         var10 = var10.a(var4);
         var5.add(var10);
      }

      ArrayList<rs.p_runelite.p_a.C_i> var11 = new ArrayList<>();

      for (C_o var15 : var5) {
         rs.p_runelite.p_a.C_i var17 = C_C_uc.a(C_Launcher_mc.n().o(), var1 - var15.a(), var2 - var15.c(), var3 + var15.b());
         if (var17 != null) {
            var11.add(var17);
         }
      }

      List<rs.p_runelite.p_a.C_i> var12 = C_C_uc.a(var11);
      if (var12 == null) {
         return null;
      } else {
         Polygon var14 = new Polygon();

         for (rs.p_runelite.p_a.C_i var18 : var12) {
            var14.addPoint(var18.a(), var18.b());
         }

         return var14;
      }
   }

   public void a(int var1, int var2, byte var3) {
      this.L[var1] = var2;
      this.M[var1] = var3;
   }

   public void e(int var1, int var2) {
      int var3 = 0;
      byte var4 = 0;
      if (this.ar != null) {
         for (int var5 = 0; var5 < this.ar.length; var5++) {
            if (var1 == this.ar[var5]) {
               var3++;
            }
         }

         this.av = var3;
         if (this.ao == null) {
            this.ao = new int[this.ah];
         }

         if (this.ar == null) {
            this.ar = new int[var3];
         }

         this.aw = new int[var3];
         this.ax = new int[var3];
         this.ay = new int[var3];
         this.as = new boolean[this.ah];
         int var7 = 0;

         for (int var6 = 0; var6 < this.ah; var6++) {
            if (var1 == this.ar[var6]) {
               this.ar[var6] = var2;
               this.ao[var6] = 3 + var4;
               this.as[var6] = true;
               var4 += 4;
               this.aw[var7] = this.ai[var6];
               this.ax[var7] = this.aj[var6];
               this.ay[var7] = this.ak[var6];
               var7++;
            }
         }
      }
   }

   public void a(int[] var1, int var2) {
      int var3 = 0;
      byte var4 = 0;

      for (int var5 = 0; var5 < this.ar.length; var5++) {
         for (int var9 : var1) {
            if (var9 == this.ar[var5]) {
               var3++;
            }
         }
      }

      this.av = var3;
      if (this.ao == null) {
         this.ao = new int[this.ah];
      }

      if (this.ar == null) {
         this.ar = new int[var3];
      }

      this.aw = new int[var3];
      this.ax = new int[var3];
      this.ay = new int[var3];
      int var11 = 0;

      for (int var12 = 0; var12 < this.ah; var12++) {
         for (int var10 : var1) {
            if (var10 == this.ar[var12]) {
               this.ar[var12] = var2;
               this.ao[var12] = 3 + var4;
               var4 += 4;
               this.aw[var11] = this.ai[var12];
               this.ax[var11] = this.aj[var12];
               this.ay[var11] = this.ak[var12];
               var11++;
            }
         }
      }
   }

   public void h() {
      HashMap var1 = new HashMap();
      int var2 = 0;
      String var3 = "";

      for (int var4 = 0; var4 < this.ah; var4++) {
         if (var1.get(this.ar[var4]) == null) {
            var3 = var3 + this.ar[var4] + ",";
            var1.put(this.ar[var4], true);
            var2++;
         }
      }

      System.out.println();
      System.out.println(var3);
      System.out.println("Total colors: " + (var2 + 1));
      System.out.println();
   }

   public void a(Map<Integer, Boolean> var1) {
      try {
         int var2 = 0;
         String var3 = "";

         for (int var4 = 0; var4 < this.ah; var4++) {
            if (var1.get(this.ar[var4]) == null) {
               var3 = var3 + this.ar[var4] + ",";
               var1.put(this.ar[var4], true);
               var2++;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void a(int[] var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.ah; var3++) {
         this.ar[var3] = var1[var2++];
         if (var2 >= var1.length) {
            var2 = 0;
         }
      }
   }

   public void a(int var1, int[] var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < this.ah; var4++) {
         if (var1 == this.ar[var4]) {
            this.ar[var4] = var2[var3++];
            if (var3 >= var2.length) {
               var3 = 0;
            }
         }
      }
   }

   public void a(int[] var1, int[] var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < this.ah; var4++) {
         for (int var8 : var1) {
            if (var8 == this.ar[var4]) {
               this.ar[var4] = var2[var3++];
               if (var3 >= var2.length) {
                  var3 = 0;
               }
            }
         }
      }
   }

   public void b(int[] var1, int[] var2) {
      int var3 = 0;
      byte var4 = 0;

      for (int var5 = 0; var5 < this.ar.length; var5++) {
         for (int var9 : var1) {
            if (var9 == this.ar[var5]) {
               var3++;
            }
         }
      }

      this.av = var3;
      if (this.ao == null) {
         this.ao = new int[this.ah];
      }

      if (this.ar == null) {
         this.ar = new int[var3];
      }

      this.aw = new int[var3];
      this.ax = new int[var3];
      this.ay = new int[var3];
      int var10 = 0;

      for (int var11 = 0; var11 < this.ah; var11++) {
         for (int var12 = 0; var12 < var1.length; var12++) {
            int var13 = var1[var12];
            if (var13 == this.ar[var11]) {
               this.ar[var11] = var2[var12];
               this.ao[var11] = 3 + var4;
               var4 += 4;
               this.aw[var10] = this.ai[var11];
               this.ax[var10] = this.aj[var11];
               this.ay[var10] = this.ak[var11];
               var10++;
            }
         }
      }
   }

   public void b(int var1) {
      this.av = this.ah;
      byte var2 = 0;
      if (this.ao == null) {
         this.ao = new int[this.ah];
      }

      if (this.ar == null) {
         this.ar = new int[this.ah];
      }

      this.aw = new int[this.ah];
      this.ax = new int[this.ah];
      this.ay = new int[this.ah];

      for (int var3 = 0; var3 < this.ah; var3++) {
         this.ar[var3] = var1;
         this.ao[var3] = 3 + var2;
         var2 += 4;
         this.aw[var3] = this.ai[var3];
         this.ax[var3] = this.aj[var3];
         this.ay[var3] = this.ak[var3];
      }
   }

   public void b(int[] var1) {
      this.av = this.ah;
      byte var2 = 0;
      if (this.ao == null) {
         this.ao = new int[this.ah];
      }

      if (this.ar == null) {
         this.ar = new int[this.ah];
      }

      this.aw = new int[this.ah];
      this.ax = new int[this.ah];
      this.ay = new int[this.ah];
      int var3 = 0;

      for (int var4 = 0; var4 < this.ah; var4++) {
         if (var3 >= var1.length - 1) {
            var3 = 0;
         } else {
            var3++;
         }

         this.ar[var4] = var1[var3];
         this.ao[var4] = 3 + var2;
         var2 += 4;
         this.aw[var4] = this.ai[var4];
         this.ax[var4] = this.aj[var4];
         this.ay[var4] = this.ak[var4];
      }
   }

   public void a(byte[] var1, int var2) {
      rs.p_x.C_e var3 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var4 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var5 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var6 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var7 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var8 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var9 = new rs.p_x.C_e(var1);
      var3.h = var1.length - 26;
      int var10 = var3.o();
      int var11 = var3.o();
      int var12 = var3.y();
      int var13 = var3.y();
      int var14 = var3.y();
      int var15 = var3.y();
      int var16 = var3.y();
      int var17 = var3.y();
      int var18 = var3.y();
      int var19 = var3.y();
      int var20 = var3.o();
      int var21 = var3.o();
      int var22 = var3.o();
      int var23 = var3.o();
      int var24 = var3.o();
      int var25 = var3.o();
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;
      byte[] var30 = new byte[0];
      if (var12 > 0) {
         var30 = new byte[var12];
         var3.h = 0;

         for (int var29 = 0; var29 < var12; var29++) {
            byte var31 = var30[var29] = var3.z();
            if (var31 == 0) {
               var26++;
            }

            if (var31 >= 1 && var31 <= 3) {
               var27++;
            }

            if (var31 == 2) {
               var28++;
            }
         }
      }

      int var60 = var12 + var10;
      int var75 = var60;
      if (var13 == 1) {
         var60 += var11;
      }

      var60 += var11;
      int var33 = var60;
      if (var14 == 255) {
         var60 += var11;
      }

      int var34 = var60;
      if (var16 == 1) {
         var60 += var11;
      }

      var60 += var25;
      int var36 = var60;
      if (var15 == 1) {
         var60 += var11;
      }

      var60 += var23;
      int var38 = var60;
      if (var17 == 1) {
         var60 += var11 * 2;
      }

      var60 += var24;
      var60 += var11 * 2;
      var60 += var20;
      var60 += var21;
      var60 += var22;
      var60 += var26 * 6;
      var60 += var27 * 6;
      var60 += var27 * 6;
      var60 += var27 * 2;
      var60 += var27;
      var60 = var60 + var27 * 2 + var28 * 2;
      this.L = new int[var10];
      this.M = new byte[var10];
      this.ad = var10;
      this.ah = var11;
      this.av = var12;
      this.ae = new int[var10];
      this.af = new int[var10];
      this.ag = new int[var10];
      this.ai = new int[var11];
      this.aj = new int[var11];
      this.ak = new int[var11];
      if (var18 == 1) {
         this.aJ = new int[var10];
      }

      if (var13 == 1) {
         this.ao = new int[var11];
      }

      if (var14 == 255) {
         this.ap = new int[var11];
      } else {
         this.au = (byte)var14;
      }

      if (var15 == 1) {
         this.aq = new int[var11];
      }

      if (var16 == 1) {
         this.aK = new int[var11];
      }

      if (var17 == 1) {
         this.Y = new short[var11];
      }

      if (var17 == 1 && var12 > 0) {
         this.Z = new short[var11];
      }

      if (var19 == 1) {
         this.W = new int[var10][];
         this.X = new int[var10][];
      }

      this.ar = new int[var11];
      if (var12 > 0) {
         this.aw = new int[var12];
         this.ax = new int[var12];
         this.ay = new int[var12];
      }

      var3.h = var12;
      var4.h = var60;
      var5.h = var60;
      var6.h = var60;
      var7.h = var60;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      for (int var53 = 0; var53 < var10; var53++) {
         int var54 = var3.y();
         int var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var4.n();
         }

         int var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var5.n();
         }

         int var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var6.n();
         }

         this.ae[var53] = var50 + var55;
         this.af[var53] = var51 + var56;
         this.ag[var53] = var52 + var57;
         var50 = this.ae[var53];
         var51 = this.af[var53];
         var52 = this.ag[var53];
         if (var18 == 1) {
            this.aJ[var53] = var7.y();
         }
      }

      if (var19 == 1) {
         for (int var76 = 0; var76 < var10; var76++) {
            int var79 = var7.y();
            this.W[var76] = new int[var79];
            this.X[var76] = new int[var79];

            for (int var81 = 0; var81 < var79; var81++) {
               this.W[var76][var81] = var7.y();
               this.X[var76][var81] = var7.y();
            }
         }
      }

      var3.h = var60;
      var4.h = var75;
      var5.h = var33;
      var6.h = var36;
      var7.h = var34;
      var8.h = var38;
      var9.h = var60;

      for (int var77 = 0; var77 < var11; var77++) {
         this.ar[var77] = (short)var3.o();
         if (var13 == 1) {
            this.ao[var77] = var4.z();
         }

         if (var14 == 255) {
            this.ap[var77] = var5.z();
         }

         if (var15 == 1) {
            this.aq[var77] = var6.z();
            if (this.aq[var77] < 0) {
               this.aq[var77] = 256 + this.aq[var77];
            }
         }

         if (var16 == 1) {
            this.aK[var77] = var7.y();
         }

         if (var17 == 1) {
            this.Y[var77] = (short)((byte)(var8.o() - 1));
            if (this.Y[var77] != -1) {
               if (this.Y[var77] == 90 || this.Y[var77] == 96 || this.Y[var77] == 97) {
                  this.Y[var77] = -1;
               } else if (this.Y[var77] == 116) {
                  this.Y[var77] = -1;
               } else if (this.Y[var77] == 60) {
                  this.Y[var77] = 8;
               }
            }
         }

         if (this.Z != null && this.Y[var77] != -1) {
            this.Z[var77] = (short)((byte)(var9.y() - 1));
         }
      }

      var3.h = var60;
      var4.h = var60;
      int var78 = 0;
      int var80 = 0;
      int var82 = 0;
      int var83 = 0;

      for (int var84 = 0; var84 < var11; var84++) {
         int var58 = var4.y();
         if (var58 == 1) {
            var78 = var3.n() + var83;
            var80 = var3.n() + var78;
            var82 = var3.n() + var80;
            var83 = var82;
            this.ai[var84] = var78;
            this.aj[var84] = var80;
            this.ak[var84] = var82;
         }

         if (var58 == 2) {
            var80 = var82;
            var82 = var3.n() + var83;
            var83 = var82;
            this.ai[var84] = var78;
            this.aj[var84] = var80;
            this.ak[var84] = var82;
         }

         if (var58 == 3) {
            var78 = var82;
            var82 = var3.n() + var83;
            var83 = var82;
            this.ai[var84] = var78;
            this.aj[var84] = var80;
            this.ak[var84] = var82;
         }

         if (var58 == 4) {
            int var59 = var78;
            var78 = var80;
            var80 = var59;
            var82 = var3.n() + var83;
            var83 = var82;
            this.ai[var84] = var78;
            this.aj[var84] = var59;
            this.ak[var84] = var82;
         }
      }

      var3.h = var60;
      var4.h = var60;
      var5.h = var60;
      var6.h = var60;
      var7.h = var60;
      var8.h = var60;

      for (int var85 = 0; var85 < var12; var85++) {
         int var87 = var30[var85] & 255;
         if (var87 == 0) {
            this.aw[var85] = (short)var3.o();
            this.ax[var85] = (short)var3.o();
            this.ay[var85] = (short)var3.o();
         }
      }

      var3.h = var60;
      int var86 = var3.y();
      if (var86 != 0) {
         var3.o();
         var3.o();
         var3.o();
         var3.p();
      }
   }

   public void b(byte[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      rs.p_x.C_e var5 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var6 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var7 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var8 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var9 = new rs.p_x.C_e(var1);
      var5.h = var1.length - 23;
      int var10 = var5.A();
      int var11 = var5.A();
      int var12 = var5.y();
      int var13 = var5.y();
      int var14 = var5.y();
      int var15 = var5.y();
      int var16 = var5.y();
      int var17 = var5.y();
      int var18 = var5.y();
      int var19 = var5.A();
      int var20 = var5.A();
      int var21 = var5.A();
      int var22 = var5.A();
      int var23 = var5.A();
      C_v var24 = j()[var2] = new C_v();
      var24.a = var1;
      var24.b = var10;
      var24.c = var11;
      var24.d = var12;
      byte var25 = 0;
      int var26 = var25 + var10;
      var26 += var11;
      int var28 = var26;
      if (var14 == 255) {
         var26 += var11;
      }

      int var29 = var26;
      if (var16 == 1) {
         var26 += var11;
      }

      int var30 = var26;
      if (var13 == 1) {
         var26 += var11;
      }

      var26 += var23;
      int var32 = var26;
      if (var15 == 1) {
         var26 += var11;
      }

      var26 += var22;
      var26 += var11 * 2;
      var26 += var12 * 6;
      var26 += var19;
      var26 += var20;
      int var38 = var26 + var21;
      this.ad = var10;
      this.ah = var11;
      this.av = var12;
      this.L = new int[var10];
      this.M = new byte[var10];
      this.ae = new int[var10];
      this.af = new int[var10];
      this.ag = new int[var10];
      this.ai = new int[var11];
      this.aj = new int[var11];
      this.ak = new int[var11];
      if (this.av > 0) {
         this.aw = new int[var12];
         this.ax = new int[var12];
         this.ay = new int[var12];
      }

      if (var17 == 1) {
         this.aJ = new int[var10];
      }

      if (var13 == 1) {
         this.ao = new int[var11];
         this.Z = new short[var11];
         this.Y = new short[var11];
      }

      if (var14 == 255) {
         this.ap = new int[var11];
      } else {
         this.au = (byte)var14;
      }

      if (var15 == 1) {
         this.aq = new int[var11];
      }

      if (var16 == 1) {
         this.aK = new int[var11];
      }

      if (var18 == 1) {
         this.W = new int[var10][];
         this.X = new int[var10][];
      }

      this.ar = new int[var11];
      var5.h = var25;
      var6.h = var26;
      var7.h = var26;
      var8.h = var26;
      var9.h = var26;
      int var39 = 0;
      int var40 = 0;
      int var41 = 0;

      for (int var42 = 0; var42 < var10; var42++) {
         int var43 = var5.y();
         int var44 = 0;
         if ((var43 & 1) != 0) {
            var44 = var6.n();
         }

         int var45 = 0;
         if ((var43 & 2) != 0) {
            var45 = var7.n();
         }

         int var46 = 0;
         if ((var43 & 4) != 0) {
            var46 = var8.n();
         }

         this.ae[var42] = var39 + var44;
         this.af[var42] = var40 + var45;
         this.ag[var42] = var41 + var46;
         var39 = this.ae[var42];
         var40 = this.af[var42];
         var41 = this.ag[var42];
         if (var17 == 1) {
            this.aJ[var42] = var9.y();
         }
      }

      if (var18 == 1) {
         for (int var57 = 0; var57 < var10; var57++) {
            int var60 = var9.y();
            this.W[var57] = new int[var60];
            this.X[var57] = new int[var60];

            for (int var63 = 0; var63 < var60; var63++) {
               this.W[var57][var63] = var9.y();
               this.X[var57][var63] = var9.y();
            }
         }
      }

      var5.h = var26;
      var6.h = var30;
      var7.h = var28;
      var8.h = var32;
      var9.h = var29;

      for (int var58 = 0; var58 < var11; var58++) {
         this.ar[var58] = (short)var5.o();
         if (var13 == 1) {
            int var61 = var6.y();
            if ((var61 & 1) == 1) {
               this.ao[var58] = 1;
               var3 = true;
            } else {
               this.ao[var58] = 0;
            }

            if ((var61 & 2) == 2) {
               this.Z[var58] = (short)((byte)(var61 >> 2));
               this.Y[var58] = (short)this.ar[var58];
               this.ar[var58] = 127;
               if (this.Y[var58] != -1) {
                  var4 = true;
               }
            } else {
               this.Z[var58] = -1;
               this.Y[var58] = -1;
            }
         }

         if (var14 == 255) {
            this.ap[var58] = var7.z();
         }

         if (var15 == 1) {
            this.aq[var58] = var8.z();
            if (this.aq[var58] < 0) {
               this.aq[var58] = 256 + this.aq[var58];
            }
         }

         if (var16 == 1) {
            this.aK[var58] = var9.y();
         }
      }

      var5.h = var26;
      var6.h = var26;
      int var59 = 0;
      int var62 = 0;
      int var64 = 0;
      int var65 = 0;

      for (int var66 = 0; var66 < var11; var66++) {
         int var47 = var6.y();
         if (var47 == 1) {
            var59 = var5.n() + var65;
            var62 = var5.n() + var59;
            var64 = var5.n() + var62;
            var65 = var64;
            this.ai[var66] = var59;
            this.aj[var66] = var62;
            this.ak[var66] = var64;
         }

         if (var47 == 2) {
            var62 = var64;
            var64 = var5.n() + var65;
            var65 = var64;
            this.ai[var66] = var59;
            this.aj[var66] = var62;
            this.ak[var66] = var64;
         }

         if (var47 == 3) {
            var59 = var64;
            var64 = var5.n() + var65;
            var65 = var64;
            this.ai[var66] = var59;
            this.aj[var66] = var62;
            this.ak[var66] = var64;
         }

         if (var47 == 4) {
            int var48 = var59;
            var59 = var62;
            var62 = var48;
            var64 = var5.n() + var65;
            var65 = var64;
            this.ai[var66] = var59;
            this.aj[var66] = var48;
            this.ak[var66] = var64;
         }
      }

      var5.h = var26;

      for (int var67 = 0; var67 < var12; var67++) {
         this.aw[var67] = (short)var5.o();
         this.ax[var67] = (short)var5.o();
         this.ay[var67] = (short)var5.o();
      }

      if (this.Z != null) {
         boolean var49 = false;

         for (int var68 = 0; var68 < var11; var68++) {
            int var69 = this.Z[var68] & 255;
            if (var69 != 255) {
               if (this.ai[var68] == (this.aw[var69] & 65535) && this.aj[var68] == (this.ax[var69] & 65535) && this.ak[var68] == (this.ay[var69] & 65535)) {
                  this.Z[var68] = -1;
               } else {
                  var49 = true;
               }
            }
         }

         if (!var49) {
            this.Z = null;
         }
      }

      if (!var4) {
         this.Y = null;
      }

      if (!var3) {
         this.ao = null;
      }
   }

   public void c(byte[] var1, int var2) {
      rs.p_x.C_e var3 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var4 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var5 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var6 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var7 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var8 = new rs.p_x.C_e(var1);
      rs.p_x.C_e var9 = new rs.p_x.C_e(var1);
      var3.h = var1.length - 23;
      int var10 = var3.A();
      int var11 = var3.A();
      int var12 = var3.y();
      C_v var13 = j()[var2] = new C_v();
      var13.a = var1;
      var13.b = var10;
      var13.c = var11;
      var13.d = var12;
      int var14 = var3.y();
      boolean var15 = ~(1 & var14) == -2;
      boolean var16 = ~(var14 & 2) == -3;
      int var17 = var3.y();
      int var18 = var3.y();
      int var19 = var3.y();
      int var20 = var3.y();
      int var21 = var3.y();
      int var22 = var3.A();
      int var23 = var3.A();
      int var24 = var3.A();
      int var25 = var3.A();
      int var26 = var3.A();
      int var27 = 0;
      int var28 = 0;
      int var29 = 0;
      boolean var30 = false;
      boolean var31 = false;
      boolean var32 = false;
      boolean var33 = false;
      byte[] var34 = null;
      byte[] var35 = null;
      short[] var36 = null;
      if (var12 > 0) {
         var35 = new byte[var12];
         var3.h = 0;

         for (int var37 = 0; var37 < var12; var37++) {
            byte var38 = var35[var37] = var3.z();
            if (var38 == 0) {
               var27++;
            }

            if (var38 >= 1 && var38 <= 3) {
               var28++;
            }

            if (var38 == 2) {
               var29++;
            }
         }
      }

      int var76 = var12 + var10;
      int var39 = var76;
      if (var14 == 1) {
         var76 += var11;
      }

      var76 += var11;
      int var41 = var76;
      if (var17 == 255) {
         var76 += var11;
      }

      int var42 = var76;
      if (var19 == 1) {
         var76 += var11;
      }

      int var43 = var76;
      if (var21 == 1) {
         var76 += var10;
      }

      int var44 = var76;
      if (var18 == 1) {
         var76 += var11;
      }

      var76 += var25;
      int var46 = var76;
      if (var20 == 1) {
         var76 += var11 * 2;
      }

      var76 += var26;
      var76 += var11 * 2;
      var76 += var22;
      var76 += var23;
      var76 += var24;
      var76 += var27 * 6;
      var76 += var28 * 6;
      var76 += var28 * 6;
      var76 += var28;
      var76 += var28;
      var76 += var28 + var29 * 2;
      this.L = rs.p_f.C_a.ah ? new int[0] : new int[var10];
      this.M = new byte[var10];
      int[] var58 = new int[var10];
      int[] var59 = new int[var10];
      int[] var60 = new int[var10];
      int[] var61 = new int[var11];
      int[] var62 = new int[var11];
      int[] var63 = new int[var11];
      this.aJ = new int[var10];
      this.ao = new int[var11];
      this.ap = new int[var11];
      this.aq = new int[var11];
      this.aK = new int[var11];
      if (var21 == 1) {
         this.aJ = new int[var10];
      }

      if (var15) {
         this.ao = new int[var11];
      }

      if (var17 == 255) {
         this.ap = new int[var11];
      } else {
         this.au = (byte)var17;
      }

      if (var18 == 1) {
         this.aq = new int[var11];
      }

      if (var19 == 1) {
         this.aK = new int[var11];
      }

      if (var20 == 1) {
         var36 = new short[var11];
      }

      if (var20 == 1 && var12 > 0) {
         var34 = new byte[var11];
      }

      int[] var64 = new int[var11];
      var3.h = var12;
      var4.h = var76;
      var5.h = var76;
      var6.h = var76;
      var7.h = var43;
      int var66 = 0;
      int var67 = 0;
      int var68 = 0;

      for (int var69 = 0; var69 < var10; var69++) {
         int var70 = var3.y();
         int var71 = 0;
         if ((var70 & 1) != 0) {
            var71 = var4.L();
         }

         int var72 = 0;
         if ((var70 & 2) != 0) {
            var72 = var5.L();
         }

         int var73 = 0;
         if ((var70 & 4) != 0) {
            var73 = var6.L();
         }

         var58[var69] = var66 + var71;
         var59[var69] = var67 + var72;
         var60[var69] = var68 + var73;
         var66 = var58[var69];
         var67 = var59[var69];
         var68 = var60[var69];
         if (this.aJ != null) {
            this.aJ[var69] = var7.y();
         }
      }

      var3.h = var76;
      var4.h = var39;
      var5.h = var41;
      var6.h = var44;
      var7.h = var42;
      var8.h = var46;
      var9.h = var76;

      for (int var90 = 0; var90 < var11; var90++) {
         var64[var90] = var3.A();
         if (var14 == 1) {
            this.ao[var90] = var4.z();
            if (this.ao[var90] == 2) {
               var64[var90] = 65535;
            }

            this.ao[var90] = 0;
         }

         if (var17 == 255) {
            this.ap[var90] = var5.z();
         }

         if (var18 == 1) {
            this.aq[var90] = var6.z();
            if (this.aq[var90] < 0) {
               this.aq[var90] = 256 + this.aq[var90];
            }
         }

         if (var19 == 1) {
            this.aK[var90] = var7.y();
         }

         if (var20 == 1) {
            var36[var90] = (short)(var8.A() - 1);
         }

         if (var34 != null) {
            if (var36[var90] != -1) {
               var34[var90] = (byte)(var9.y() - 1);
            } else {
               var34[var90] = -1;
            }
         }
      }

      var3.h = var76;
      var4.h = var76;
      int var91 = 0;
      int var92 = 0;
      int var93 = 0;
      int var94 = 0;

      for (int var95 = 0; var95 < var11; var95++) {
         int var74 = var4.y();
         if (var74 == 1) {
            var91 = var3.L() + var94;
            var92 = var3.L() + var91;
            var93 = var3.L() + var92;
            var94 = var93;
            var61[var95] = var91;
            var62[var95] = var92;
            var63[var95] = var93;
         }

         if (var74 == 2) {
            var92 = var93;
            var93 = var3.L() + var94;
            var94 = var93;
            var61[var95] = var91;
            var62[var95] = var92;
            var63[var95] = var93;
         }

         if (var74 == 3) {
            var91 = var93;
            var93 = var3.L() + var94;
            var94 = var93;
            var61[var95] = var91;
            var62[var95] = var92;
            var63[var95] = var93;
         }

         if (var74 == 4) {
            int var75 = var91;
            var91 = var92;
            var92 = var75;
            var93 = var3.L() + var94;
            var94 = var93;
            var61[var95] = var91;
            var62[var95] = var75;
            var63[var95] = var93;
         }
      }

      var3.h = var76;
      var4.h = var76;
      var5.h = var76;
      var6.h = var76;
      var7.h = var76;
      var8.h = var76;

      for (int var96 = 0; var96 < var12; var96++) {
         int var98 = var35[var96] & 255;
         if (var98 == 0) {
            var3.A();
            var3.A();
            var3.A();
         }

         if (var98 == 1) {
            var4.A();
            var4.A();
            var4.A();
            var5.A();
            var5.A();
            var5.A();
            var6.z();
            var7.z();
            var8.z();
         }

         if (var98 == 2) {
            var4.A();
            var4.A();
            var4.A();
            var5.A();
            var5.A();
            var5.A();
            var6.z();
            var7.z();
            var8.z();
            var8.z();
            var8.z();
         }

         if (var98 == 3) {
            var4.A();
            var4.A();
            var4.A();
            var5.A();
            var5.A();
            var5.A();
            var6.z();
            var7.z();
            var8.z();
         }
      }

      if (var17 != 255) {
         for (int var97 = 0; var97 < var11; var97++) {
            this.ap[var97] = var17;
         }
      }

      this.ar = var64;
      this.ad = var10;
      this.ah = var11;
      this.ae = var58;
      this.af = var59;
      this.ag = var60;
      this.ai = var61;
      this.aj = var62;
      this.ak = var63;
   }

   public boolean i() {
      return this.k == 1 || this.bJ == 2467 || this.bJ == 42467;
   }

   public C_h(int var1) {
      this(var1, h);
   }

   public C_h(int var1, rs.p_a.p_a.C_a var2) {
      this.bJ = var1;
      byte[] var3 = j()[var1].a;
      if (var3.length > 0) {
         if (var3[var3.length - 1] == -3 && var3[var3.length - 2] == -1) {
            this.a(var3, var1);
            this.k = 3;
         } else if (var3[var3.length - 1] == -2 && var3[var3.length - 2] == -1) {
            this.b(var3, var1);
            this.k = 2;
         } else if (var3[var3.length - 1] == -1 && var3[var3.length - 2] == -1) {
            rs.p_a.p_a.C_c.a();
            this.a(var3, var1, var2);
            this.k = 1;
         } else {
            this.k = 0;
            rs.p_a.p_a.C_c.a();
            this.b(var1, var2);
         }
      }

      if (p[var1]) {
         this.b(32, 32, 32);
         this.a(0, 6, 0);
      }

      if (var1 == 2361) {
         this.ap = new int[this.ah];

         for (int var4 = 0; var4 < this.ah; var4++) {
            this.ap[var4] = 10;
         }
      }

      if ((p[var1] || var1 == 2467 || var1 == 42467) && bG >= 0 && this.ap != null) {
         for (int var8 = 0; var8 < this.ap.length; var8++) {
            switch (bG) {
               case 0:
                  if ((var1 == 62739 || var1 == 62756) && this.ap[var8] == 0) {
                     this.ap[var8] = 7;
                  }
                  break;
               case 1:
                  this.ap[var8] = 10;
               case 2:
               case 3:
               case 5:
               case 6:
               default:
                  break;
               case 4:
                  if (this.ap[var8] == 5) {
                     this.ap[var8] = 3;
                  }

                  if (this.ap[var8] == 0) {
                     this.ap[var8] = 4;
                  }
                  break;
               case 7:
                  if (this.ap[var8] == 4) {
                     this.ap[var8] = 2;
                  }

                  if (this.ap[var8] == 0) {
                     this.ap[var8] = 10;
                  }
            }
         }
      }

      if (!rs.p_f.C_a.ah) {
         if (var1 == 41893 || var1 == 41895 || var1 == 49546 || var1 == 41886 || var1 == 49560 || var1 == 41890 || var1 == 49554) {
            byte var9 = 25;
            byte var5 = 15;
            if (var1 == 41895 || var1 == 49546) {
               var9 = 19;
            }

            if (var1 == 41886 || var1 == 49560) {
               var9 = 30;
               var5 = 14;
            }

            if (var1 == 41890 || var1 == 49554) {
               var9 = 17;
               var5 = 10;
            }

            int var6 = 0;

            for (int var7 = 0; var7 < this.L.length; var7++) {
               if (var6 < var5) {
                  var6++;
               } else {
                  var6 = 0;
                  this.a(var7, var9 + 1, (byte)2);
               }
            }
         }

         if (var1 == 42671) {
            int var10 = 0;

            for (int var32 = 0; var32 < this.L.length; var32++) {
               if (var10 < 2) {
                  var10++;
               } else {
                  var10 = 0;
                  this.a(var32, 2, (byte)1);
               }
            }
         }

         if (var1 == 56202 || var1 == 56208) {
            int var11 = 0;

            for (int var33 = 0; var33 < this.L.length; var33++) {
               if (var11 < 4) {
                  var11++;
               } else {
                  var11 = 0;
                  this.a(var33, (var1 == 56202 ? 26 : 29) + 1, (byte)0);
               }
            }
         }

         if (var1 == 42001 || var1 == 42002) {
            for (int var12 = 10; var12 < 60; var12++) {
               if ((var12 < 20 || var12 > 40) && (var12 < 10 || var12 > 15) && var12 != 19) {
                  this.a(var12, (var1 == 42001 ? 26 : 29) + 1, (byte)0);
               }
            }
         }

         if (var1 >= 56203 && var1 <= 56207) {
            byte var13 = 27;
            int var34 = 0;

            for (int var48 = 0; var48 < this.L.length; var48++) {
               if (var34 < 6) {
                  var34++;
               } else {
                  var34 = 0;
                  this.a(var48, var13 + 1, (byte)0);
               }
            }
         }

         if (var1 == 22012) {
            byte var14 = 17;

            for (int var35 = 0; var35 < this.L.length; var35++) {
               this.a(var35, var14 + 1, (byte)0);
            }
         }

         if (var1 == 42669) {
            byte var15 = 21;

            for (int var36 = 0; var36 < this.L.length; var36++) {
               if (var36 % 2 != 0) {
                  this.a(var36, var15 + 1, (byte)0);
               }
            }
         }

         if (var1 == 41037 || var1 == 41038) {
            for (int var16 = 0; var16 < this.L.length; var16++) {
               if (var16 % 4 != 0) {
                  this.L[var16] = 23;
               }
            }
         }

         if (var1 == 48626) {
            boolean var17 = false;

            for (int var37 = 0; var37 < this.L.length; var37++) {
               if (var37 % 4 != 0) {
                  this.L[var37] = 24;
               }
            }
         }

         if (var1 == 40024) {
            byte var18 = 3;

            for (int var38 = 60; var38 < 65; var38++) {
               this.L[var38] = var18 + 1;
            }

            int var39 = 0;

            for (int var49 = 0; var49 < 40; var49++) {
               if (var49 <= 50 && var49 % 2 != 0) {
                  int var55 = var1 != 40319 && var1 != 40318 ? 1 : 3;
                  if (var39 < var55) {
                     var39++;
                  } else {
                     var39 = 0;
                     this.L[var49] = var18 + 1;
                  }
               }
            }
         }

         if (var1 == 40948 || var1 == 40947 || var1 == 40946) {
            int var19 = 0;
            byte var40 = 26;
            if (var1 == 40947) {
               var40 = 2;
            }

            if (var1 == 40946) {
               var40 = 13;
            }

            for (int var50 = 0; var50 < 168; var50++) {
               if (var19 == 3) {
                  this.L[var50] = var40 + 1;
                  var19 = 0;
               } else {
                  var19++;
               }
            }
         }

         if (var1 >= 40949 && var1 <= 40954) {
            int var20 = 0;
            byte var41 = 26;
            if (var1 == 40953 || var1 == 40954) {
               var41 = 19;
            }

            if (var1 == 40949 || var1 == 40950) {
               var41 = 13;
            }

            for (int var51 = 0; var51 < this.L.length; var51++) {
               if (var20 == 20) {
                  this.L[var51] = var41 + 1;
                  var20 = 0;
               } else {
                  var20++;
               }
            }
         }

         if (var1 == 209 || var1 == 386) {
            int var21 = 0;
            byte var42 = 13;

            for (int var52 = 0; var52 < this.L.length; var52++) {
               if (var21 == 2) {
                  this.L[var52] = var42 + 1;
                  if (C_Client_mc.d(3) == 1) {
                     this.L[var52] = 18;
                  }

                  var21 = 0;
               } else {
                  var21++;
               }
            }
         }

         if (var1 == 40319 || var1 == 40318) {
            int var22 = var1 != 40019 && var1 != 40018 ? 11 : 2;

            for (int var43 = 60; var43 < 65; var43++) {
               this.L[var43] = var22 + 1;
            }

            int var44 = 0;

            for (int var53 = 0; var53 < 40; var53++) {
               if (var53 <= 50) {
                  int var56 = var1 != 40319 && var1 != 40318 ? 1 : 3;
                  if (var44 < var56) {
                     var44++;
                  } else {
                     var44 = 0;
                     this.L[var53] = var22 + 1;
                  }
               }
            }
         }

         if (var1 == 41052) {
            for (int var23 = 0; var23 < this.L.length; var23++) {
               if (var23 % 4 != 0) {
                  this.L[var23] = 2;
               }
            }
         }

         if (var1 == 44403) {
            for (int var24 = 0; var24 < this.L.length; var24++) {
               if (var24 % 4 != 0 && var24 % 2 != 0) {
                  this.L[var24] = 23;
               }
            }
         }

         if (var1 == 50939) {
            int var25 = 0;

            for (int var45 = 0; var45 < 130; var45++) {
               if (var25 != 2) {
                  var25++;
               } else {
                  var25 = 0;
                  this.L[var45] = 21;
               }
            }
         }

         if (var1 == 47780) {
            int var26 = 0;

            for (int var46 = 0; var46 < 30; var46++) {
               if (var26 != 10) {
                  var26++;
               } else {
                  this.L[var46] = 19;
               }
            }
         }

         int[][] var27 = rs.p_r.C_b.a(var1);
         if (var27 != null) {
            for (int var47 = 0; var47 < var27.length; var47++) {
               int[] var54 = var27[var47];
               if (var54[0] == -1) {
                  for (int var62 = 0; var62 < this.ai.length; var62++) {
                     this.L[this.ai[var62]] = var54[1] + 1;
                  }
               } else if (var54[0] == -2) {
                  for (int var61 = 0; var61 < this.aj.length; var61++) {
                     this.L[this.aj[var61]] = var54[1] + 1;
                  }
               } else if (var54[0] == -3) {
                  for (int var60 = 0; var60 < this.ak.length; var60++) {
                     this.L[this.ak[var60]] = var54[1] + 1;
                  }
               } else if (var54[0] != -4) {
                  this.L[var54[0]] = var54[1] + 1;
               } else {
                  for (int var57 = 0; var57 < this.ai.length; var57++) {
                     this.L[this.ai[var57]] = var54[1] + 1;
                  }

                  for (int var58 = 0; var58 < this.aj.length; var58++) {
                     this.L[this.aj[var58]] = var54[1] + 1;
                  }

                  for (int var59 = 0; var59 < this.ak.length; var59++) {
                     this.L[this.ak[var59]] = var54[1] + 1;
                  }
               }
            }
         }
      }

      if (var1 == 40017) {
         this.e(127, rs.p_f.C_a.aQ ? 57 : 117);
      }

      if (var1 == 40019 || var1 == 40018 || var1 == 40319 || var1 == 40318 || var1 == 40024) {
         this.av = 3;
         this.ao = new int[]{
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            2
         };
         this.ar = new int[]{
            5056,
            5066,
            8,
            8,
            8,
            12,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            5056,
            5056,
            924,
            924,
            8,
            8,
            12,
            12,
            924,
            924,
            924,
            12,
            127,
            127,
            127,
            12,
            924,
            924,
            924,
            924,
            924,
            924,
            12,
            8,
            924,
            924,
            924,
            8,
            8,
            8,
            924,
            924,
            924,
            8,
            8,
            8,
            924,
            924,
            8,
            8,
            924,
            924,
            8,
            8,
            8,
            924,
            924,
            924,
            924,
            8,
            8,
            8,
            924,
            924,
            8,
            8,
            924,
            924,
            8,
            8,
            8,
            924,
            924,
            924,
            8,
            8,
            12,
            12,
            8,
            924,
            924,
            924,
            924,
            924,
            8,
            8,
            5066,
            5056,
            924,
            924,
            924,
            924,
            8,
            5056,
            924,
            924,
            5056,
            12,
            12,
            924,
            924,
            924,
            12,
            12,
            8,
            8,
            8,
            924,
            924,
            924,
            924,
            924,
            924,
            12,
            12,
            8,
            924,
            924,
            8,
            12,
            127,
            127,
            127,
            127,
            924,
            924,
            924,
            924,
            924,
            8,
            8,
            12,
            12,
            924,
            924,
            924,
            924,
            12,
            12,
            12,
            8,
            924,
            924,
            924,
            924,
            127,
            127,
            12,
            12,
            924,
            924,
            924,
            127,
            12,
            12,
            12,
            924,
            924,
            924,
            924,
            12,
            12,
            924,
            924,
            12,
            12,
            12,
            12,
            12,
            924,
            924,
            924,
            924,
            12,
            12,
            12,
            924,
            924,
            12,
            5056,
            5056,
            8,
            8,
            5056,
            5056,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            3005,
            3005,
            924,
            8,
            12,
            12,
            12,
            8,
            924,
            924,
            924,
            924,
            8,
            8,
            924,
            924,
            8,
            8,
            3005,
            3005,
            924,
            924,
            924,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            8,
            12,
            12,
            924,
            924,
            924,
            20,
            12,
            24,
            24,
            24,
            924,
            924,
            924,
            924,
            924,
            12,
            24,
            924,
            924,
            24,
            28,
            28,
            28,
            28,
            924,
            924,
            924,
            924,
            924,
            28,
            28,
            924,
            924,
            28,
            20,
            924,
            924,
            20,
            16,
            924,
            924,
            16,
            8,
            924,
            924,
            8,
            8,
            924,
            924,
            924,
            8,
            8,
            12,
            20,
            924,
            924,
            924,
            16,
            16,
            20,
            20,
            924,
            924,
            924,
            127,
            8,
            8,
            8,
            924,
            924,
            924,
            924,
            924,
            127,
            8,
            8,
            20,
            20,
            924,
            924,
            924,
            20,
            20,
            924,
            924,
            20,
            12,
            924,
            924,
            12,
            12,
            24,
            24,
            924,
            924,
            924,
            924,
            12,
            24,
            924,
            924,
            24,
            28,
            924,
            924,
            28,
            20,
            924,
            127,
            924,
            924,
            127,
            127,
            924,
            924,
            127,
            127,
            924,
            924,
            127,
            127,
            127,
            924,
            924,
            924,
            127,
            127,
            127,
            924,
            924,
            24,
            924,
            924,
            28,
            28,
            924,
            20,
            20,
            924,
            924,
            12,
            924,
            924,
            24,
            924,
            924,
            12,
            16,
            924,
            12,
            20,
            20,
            20,
            16,
            16,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            8,
            8,
            8,
            8,
            924,
            924,
            924,
            16,
            24,
            28,
            28,
            924,
            924,
            924,
            20,
            28,
            924,
            924,
            924,
            20,
            16,
            16,
            924,
            924,
            20,
            924,
            8,
            924,
            924,
            924,
            924,
            924,
            924,
            924,
            0
         };
         this.aw = new int[]{133, 130, 132};
         this.ax = new int[]{134, 131, 136};
         this.ay = new int[]{135, 132, 133};
         this.Y = new short[]{
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            59,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            59,
            59,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            -1,
            -1,
            59,
            59,
            -1,
            -1,
            59,
            59,
            -1,
            -1,
            59,
            59,
            59,
            -1,
            -1,
            -1,
            59,
            59,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1
         };
         this.Z = new short[]{
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            2,
            2,
            2,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            0,
            0,
            2,
            2,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            2,
            2,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
         };
         this.aa = new byte[]{0, 0, 0};

         for (int var28 = 0; var28 < this.Y.length; var28++) {
            if (this.Y[var28] != -1) {
               if (var1 == 40319 || var1 == 40318) {
                  this.Y[var28] = 64;
               } else if (var1 == 40024) {
                  this.Y[var28] = 66;
               } else {
                  this.Y[var28] = (short)(rs.p_f.C_a.aQ ? 57 : 117);
               }

               this.ar[var28] = this.Y[var28];
            }
         }

         for (int var29 = 0; var29 < this.ar.length; var29++) {
            if (this.ar[var29] == 0) {
               this.ar[var29] = 65535;
            }
         }
      }

      if (var1 == 32815) {
         this.e(127, 57);
      }

      if (var1 == 32809) {
         this.av = 3;
         this.ao = new int[]{
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            2
         };
         this.ar = new int[]{
            24,
            24,
            0,
            0,
            0,
            24,
            24,
            24,
            12,
            24,
            24,
            12,
            24,
            24,
            24,
            24,
            24,
            24,
            0,
            0,
            24,
            24,
            24,
            24,
            0,
            0,
            24,
            24,
            24,
            24,
            24,
            24,
            12,
            24,
            41,
            12,
            12,
            12,
            12,
            12,
            12,
            41,
            41,
            24,
            12,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            12,
            12,
            12,
            12,
            12,
            0,
            24,
            24,
            12,
            24,
            0,
            0,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            12,
            12,
            12,
            12,
            12,
            24,
            24,
            0,
            24,
            24,
            12,
            12,
            12,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            24,
            0,
            24,
            24,
            24,
            12,
            41,
            41,
            33,
            33,
            33,
            41,
            41,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            20,
            41,
            41,
            41,
            41,
            20,
            20,
            902,
            902,
            902,
            902,
            902,
            902,
            0,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            0,
            0,
            902,
            902,
            902,
            902,
            902,
            20,
            20,
            33,
            33,
            945,
            945,
            945,
            945,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            33,
            20,
            20,
            20,
            20,
            12,
            12,
            12,
            12,
            12,
            0,
            0,
            0,
            0,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            0,
            0,
            0,
            33,
            -22479,
            41,
            12,
            12,
            12,
            902,
            12,
            20,
            20,
            20,
            20,
            33,
            33,
            33,
            41,
            41,
            0,
            33,
            33,
            33,
            41,
            12,
            12,
            12,
            24,
            24,
            8,
            8,
            33,
            33,
            960,
            960,
            960,
            33,
            33,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            24,
            41,
            41,
            41,
            33,
            33,
            960,
            968,
            978,
            978,
            968,
            33,
            -22479,
            41,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            24,
            12,
            12,
            0,
            0,
            24,
            24,
            24,
            24,
            0,
            0,
            12,
            12,
            12,
            0,
            24,
            24,
            24,
            24,
            24,
            522,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            24,
            24,
            0,
            41,
            24,
            12,
            12,
            12,
            12,
            12,
            0,
            127,
            12,
            12,
            0,
            12,
            8,
            8,
            127,
            12,
            960,
            960,
            968,
            978,
            960,
            960,
            33,
            33,
            33,
            33,
            33,
            33,
            -22479,
            -22479,
            -22479,
            20,
            20,
            20,
            12,
            12,
            20,
            20,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            20,
            20,
            12,
            12,
            12,
            12,
            24,
            41,
            -22479,
            -22479,
            33,
            960,
            960,
            33,
            41,
            41,
            24,
            24,
            24,
            24,
            33,
            33,
            12,
            12,
            12,
            12,
            12,
            12,
            0,
            0,
            12,
            12,
            12,
            12,
            24,
            0,
            24,
            24,
            0,
            24,
            0,
            12,
            33,
            24,
            41,
            41,
            24,
            12,
            24,
            24,
            24,
            0,
            24,
            24,
            24,
            24,
            24,
            24,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            12,
            0,
            24,
            24,
            12,
            12,
            12,
            12,
            0,
            24,
            24,
            0,
            0,
            0,
            12,
            12,
            12,
            24,
            24,
            24,
            12,
            0,
            522,
            24,
            24,
            24,
            24,
            24,
            12,
            12,
            0,
            24,
            0,
            8,
            127,
            127,
            12,
            12,
            8,
            12,
            960,
            33,
            33,
            0,
            0,
            968,
            -22479,
            -22479,
            33,
            960,
            978,
            20,
            20,
            20,
            41,
            -22479,
            33,
            33,
            33,
            945,
            945,
            945,
            945,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            127,
            12,
            12,
            12,
            0
         };
         this.aw = new int[]{343, 340, 342};
         this.ax = new int[]{344, 341, 346};
         this.ay = new int[]{345, 342, 343};
         this.Y = new short[]{
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            59,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            59,
            -1,
            -1,
            -1,
            -1
         };
         this.Z = new short[]{
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            2,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            2,
            2,
            2,
            2,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            2,
            2,
            2,
            2,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
         };
         this.aa = new byte[]{0, 0, 0};

         for (int var30 = 0; var30 < this.Y.length; var30++) {
            if (this.Y[var30] == 59) {
               this.Y[var30] = (short)(rs.p_f.C_a.aQ ? 57 : 117);
               this.ar[var30] = this.Y[var30];
            }
         }

         for (int var31 = 0; var31 < this.ar.length; var31++) {
            if (this.ar[var31] == 0) {
               this.ar[var31] = 65535;
            }
         }
      }
   }

   public void c(int var1) {
      for (int var2 = 0; var2 < this.ad; var2++) {
         this.ae[var2] = this.ae[var2] / var1;
         this.af[var2] = this.af[var2] / var1;
         this.ag[var2] = this.ag[var2] / var1;
      }
   }

   public void a(byte[] var1, int var2, rs.p_a.p_a.C_a var3) {
      rs.p_x.C_e var4 = rs.p_a.p_a.C_c.a(var1);
      rs.p_x.C_e var5 = rs.p_a.p_a.C_c.a(var1);
      rs.p_x.C_e var6 = rs.p_a.p_a.C_c.a(var1);
      rs.p_x.C_e var7 = rs.p_a.p_a.C_c.a(var1);
      rs.p_x.C_e var8 = rs.p_a.p_a.C_c.a(var1);
      rs.p_x.C_e var9 = rs.p_a.p_a.C_c.a(var1);
      rs.p_x.C_e var10 = rs.p_a.p_a.C_c.a(var1);
      var4.h = var1.length - 23;
      int var11 = var4.A();
      int var12 = var4.A();
      int var13 = var4.y();
      C_v var14 = j()[var2] = new C_v();
      var14.a = var1;
      var14.b = var11;
      var14.c = var12;
      var14.d = var13;
      int var15 = var4.y();
      boolean var16 = ~(1 & var15) == -2;
      boolean var17 = ~(var15 & 2) == -3;
      boolean var18 = (4 & var15) == 4;
      boolean var19 = (8 & var15) == 8;
      if (!var19) {
         this.c(var1, var2);
      } else {
         int var20 = 0;
         if (var19) {
            var4.h -= 7;
            var20 = var4.y();
            var4.h += 6;
         }

         if (var20 == 15) {
            p[var2] = true;
         }

         this.n = var20;
         int var21 = var4.y();
         int var22 = var4.y();
         int var23 = var4.y();
         int var24 = var4.y();
         int var25 = var4.y();
         int var26 = var4.A();
         int var27 = var4.A();
         int var28 = var4.A();
         int var29 = var4.A();
         int var30 = var4.A();
         int var31 = 0;
         int var32 = 0;
         int var33 = 0;
         boolean var34 = false;
         boolean var35 = false;
         boolean var36 = false;
         boolean var37 = false;
         byte[] var38 = null;
         if (var13 > 0) {
            var38 = new byte[var13];
            var4.h = 0;

            for (int var39 = 0; var39 < var13; var39++) {
               byte var40 = var38[var39] = var4.z();
               if (var40 == 0) {
                  var31++;
               }

               if (var40 >= 1 && var40 <= 3) {
                  var32++;
               }

               if (var40 == 2) {
                  var33++;
               }
            }
         }

         int var80 = var13 + var11;
         int var41 = var80;
         if (var16) {
            var80 += var12;
         }

         if (var15 == 1) {
            var80 += var12;
         }

         var80 += var12;
         int var43 = var80;
         if (var21 == 255) {
            var80 += var12;
         }

         int var44 = var80;
         if (var23 == 1) {
            var80 += var12;
         }

         int var45 = var80;
         if (var25 == 1) {
            var80 += var11;
         }

         int var46 = var80;
         if (var22 == 1) {
            var80 += var12;
         }

         var80 += var29;
         int var48 = var80;
         if (var24 == 1) {
            var80 += var12 * 2;
         }

         var80 += var30;
         var80 += var12 * 2;
         var80 += var26;
         var80 += var27;
         var80 += var28;
         var80 += var31 * 6;
         var80 += var32 * 6;
         byte var56 = 6;
         if (var20 != 14) {
            if (var20 >= 15) {
               var56 = 9;
            }
         } else {
            var56 = 7;
         }

         var80 += var56 * var32;
         var80 += var32;
         var80 += var32;
         var80 += var32 + var33 * 2;
         var3.b(var12, var11);
         var3.e();
         this.L = var3.a(rs.p_a.p_a.C_a.b_type.p);
         this.M = var3.c(rs.p_a.p_a.C_a.b_type.q);
         int[] var61 = var3.a(rs.p_a.p_a.C_a.b_type.m);
         int[] var62 = var3.a(rs.p_a.p_a.C_a.b_type.n);
         int[] var63 = var3.a(rs.p_a.p_a.C_a.b_type.o);
         int[] var64 = var3.a(rs.p_a.p_a.C_a.b_type.a);
         int[] var65 = var3.a(rs.p_a.p_a.C_a.b_type.b);
         int[] var66 = var3.a(rs.p_a.p_a.C_a.b_type.c);
         this.aJ = var3.a(rs.p_a.p_a.C_a.b_type.l);
         this.ao = var3.a(rs.p_a.p_a.C_a.b_type.g);
         this.ap = var3.a(rs.p_a.p_a.C_a.b_type.h);
         this.aq = var3.a(rs.p_a.p_a.C_a.b_type.i);
         this.aK = var3.a(rs.p_a.p_a.C_a.b_type.k);
         if (var25 == 1) {
            this.aJ = var3.a(rs.p_a.p_a.C_a.b_type.l);
         }

         if (var16) {
            this.ao = var3.a(rs.p_a.p_a.C_a.b_type.g);
         }

         if (var21 == 255) {
            this.ap = var3.a(rs.p_a.p_a.C_a.b_type.h);
         } else {
            this.au = var21;
         }

         if (var22 == 1) {
            this.aq = var3.a(rs.p_a.p_a.C_a.b_type.i);
         }

         if (var23 == 1) {
            this.aK = var3.a(rs.p_a.p_a.C_a.b_type.k);
         }

         int[] var67 = var3.a(rs.p_a.p_a.C_a.b_type.j);
         boolean var68 = false;
         if (var24 == 1 && var13 > 0) {
            var68 = true;
         }

         if (var13 > 0) {
            if (var32 > 0) {
            }

            if (var33 > 0) {
            }
         }

         var4.h = var13;
         var5.h = var80;
         var6.h = var80;
         var7.h = var80;
         var8.h = var45;
         int var70 = 0;
         int var71 = 0;
         int var72 = 0;

         for (int var73 = 0; var73 < var11; var73++) {
            int var74 = var4.y();
            int var75 = 0;
            if ((var74 & 1) != 0) {
               var75 = var5.L();
            }

            int var76 = 0;
            if ((var74 & 2) != 0) {
               var76 = var6.L();
            }

            int var77 = 0;
            if ((var74 & 4) != 0) {
               var77 = var7.L();
            }

            var61[var73] = var70 + var75;
            var62[var73] = var71 + var76;
            var63[var73] = var72 + var77;
            var70 = var61[var73];
            var71 = var62[var73];
            var72 = var63[var73];
            if (this.aJ != null) {
               this.aJ[var73] = var8.y();
            }
         }

         var4.h = var80;
         var5.h = var41;
         var6.h = var43;
         var7.h = var46;
         var8.h = var44;
         var9.h = var48;
         var10.h = var80;

         for (int var94 = 0; var94 < var12; var94++) {
            var67[var94] = var4.A();
            if (var67[var94] == 0) {
               var67[var94] = 65535;
            }

            if (var15 == 1) {
               this.ao[var94] = var5.z();
               if (this.ao[var94] == 2) {
                  var67[var94] = 65535;
               }

               this.ao[var94] = 0;
            }

            if (var21 == 255) {
               this.ap[var94] = var6.z();
            }

            if (var22 == 1) {
               this.aq[var94] = var7.z();
               if (this.aq[var94] < 0) {
                  this.aq[var94] = 256 + this.aq[var94];
               }
            }

            if (var23 == 1) {
               this.aK[var94] = var8.y();
            }

            short var96 = 0;
            if (var24 == 1) {
               var96 = (short)(var9.A() - 1);
            }

            if (var68 && var96 != -1) {
               var10.y();
            }
         }

         var4.h = var80;
         var5.h = var80;
         int var95 = 0;
         int var97 = 0;
         int var98 = 0;
         int var99 = 0;

         for (int var100 = 0; var100 < var12; var100++) {
            int var78 = var5.y();
            if (var78 == 1) {
               var95 = var4.L() + var99;
               var97 = var4.L() + var95;
               var98 = var4.L() + var97;
               var99 = var98;
               var64[var100] = var95;
               var65[var100] = var97;
               var66[var100] = var98;
            }

            if (var78 == 2) {
               var97 = var98;
               var98 = var4.L() + var99;
               var99 = var98;
               var64[var100] = var95;
               var65[var100] = var97;
               var66[var100] = var98;
            }

            if (var78 == 3) {
               var95 = var98;
               var98 = var4.L() + var99;
               var99 = var98;
               var64[var100] = var95;
               var65[var100] = var97;
               var66[var100] = var98;
            }

            if (var78 == 4) {
               int var79 = var95;
               var95 = var97;
               var97 = var79;
               var98 = var4.L() + var99;
               var99 = var98;
               var64[var100] = var95;
               var65[var100] = var79;
               var66[var100] = var98;
            }
         }

         var4.h = var80;
         var5.h = var80;
         var6.h = var80;
         var7.h = var80;
         var8.h = var80;
         var9.h = var80;

         for (int var101 = 0; var101 < var13; var101++) {
            int var103 = var38[var101] & 255;
            if (var103 == 0) {
               var4.A();
               var4.A();
               var4.A();
            }

            if (var103 == 1) {
               var5.A();
               var5.A();
               var5.A();
               if (var20 < 15) {
                  var6.A();
                  if (var20 >= 14) {
                     var6.c(-1);
                  } else {
                     var6.A();
                  }

                  var6.A();
               } else {
                  var6.c(-1);
                  var6.c(-1);
                  var6.c(-1);
               }

               var7.z();
               var7.z();
               var7.z();
            }

            if (var103 == 2) {
               var5.A();
               var5.A();
               var5.A();
               if (var20 >= 15) {
                  var6.c(-1);
                  var6.c(-1);
                  var6.c(-1);
               } else {
                  var6.A();
                  if (var20 < 14) {
                     var6.A();
                  } else {
                     var6.c(-1);
                  }

                  var6.A();
               }

               var7.z();
               var7.z();
               var7.z();
               var7.z();
               var7.z();
            }

            if (var103 == 3) {
               var5.A();
               var5.A();
               var5.A();
               if (var20 < 15) {
                  var6.A();
                  if (var20 < 14) {
                     var6.A();
                  } else {
                     var6.c(-1);
                  }

                  var6.A();
               } else {
                  var6.c(-1);
                  var6.c(-1);
                  var6.c(-1);
               }

               var7.z();
               var7.z();
               var7.z();
            }
         }

         if (var21 != 255) {
            for (int var102 = 0; var102 < var12; var102++) {
               this.ap[var102] = var21;
            }
         }

         this.ar = var67;
         this.ad = var11;
         this.ah = var12;
         this.ae = var61;
         this.af = var62;
         this.ag = var63;
         this.ai = var64;
         this.aj = var65;
         this.ak = var66;
      }
   }

   private void b(int var1, rs.p_a.p_a.C_a var2) {
      short var3 = -870;
      this.bK = 9;
      this.bL = false;
      this.bM = 360;
      this.bN = 1;
      this.bO = true;
      this.aN = false;
      ab++;
      C_v var4 = j()[var1];
      this.ad = var4.b;
      this.ah = var4.c;
      this.av = var4.d;
      var2.b(this.ah, this.ad);
      var2.e();
      this.L = var2.a(rs.p_a.p_a.C_a.b_type.p);
      this.M = var2.c(rs.p_a.p_a.C_a.b_type.q);
      this.ae = var2.a(rs.p_a.p_a.C_a.b_type.m);
      this.af = var2.a(rs.p_a.p_a.C_a.b_type.n);
      this.ag = var2.a(rs.p_a.p_a.C_a.b_type.o);
      this.ai = var2.a(rs.p_a.p_a.C_a.b_type.a);
      this.aj = var2.a(rs.p_a.p_a.C_a.b_type.b);

      while (var3 >= 0) {
         this.bO = !this.bO;
      }

      this.ak = var2.a(rs.p_a.p_a.C_a.b_type.c);
      this.aw = new int[this.av];
      this.ax = new int[this.av];
      this.ay = new int[this.av];
      if (var4.i >= 0) {
         this.aJ = var2.a(rs.p_a.p_a.C_a.b_type.l);
      }

      if (var4.m >= 0) {
         this.ao = var2.a(rs.p_a.p_a.C_a.b_type.g);
      }

      if (var4.n >= 0) {
         this.ap = var2.a(rs.p_a.p_a.C_a.b_type.h);
      } else {
         this.au = -var4.n - 1;
      }

      if (var4.o >= 0) {
         this.aq = var2.a(rs.p_a.p_a.C_a.b_type.i);
      }

      if (var4.p >= 0) {
         this.aK = var2.a(rs.p_a.p_a.C_a.b_type.k);
      }

      this.ar = var2.a(rs.p_a.p_a.C_a.b_type.j);
      rs.p_x.C_e var5 = rs.p_a.p_a.C_c.a(var4.a);
      var5.h = var4.e;
      rs.p_x.C_e var6 = rs.p_a.p_a.C_c.a(var4.a);
      var6.h = var4.f;
      rs.p_x.C_e var7 = rs.p_a.p_a.C_c.a(var4.a);
      var7.h = var4.g;
      rs.p_x.C_e var8 = rs.p_a.p_a.C_c.a(var4.a);
      var8.h = var4.h;
      rs.p_x.C_e var9 = rs.p_a.p_a.C_c.a(var4.a);
      var9.h = var4.i;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      for (int var13 = 0; var13 < this.ad; var13++) {
         int var14 = var5.y();
         int var15 = 0;
         if ((var14 & 1) != 0) {
            var15 = var6.L();
         }

         int var16 = 0;
         if ((var14 & 2) != 0) {
            var16 = var7.L();
         }

         int var17 = 0;
         if ((var14 & 4) != 0) {
            var17 = var8.L();
         }

         this.ae[var13] = var10 + var15;
         this.af[var13] = var11 + var16;
         this.ag[var13] = var12 + var17;
         var10 = this.ae[var13];
         var11 = this.af[var13];
         var12 = this.ag[var13];
         if (this.aJ != null) {
            this.aJ[var13] = var9.y();
         }
      }

      var5.h = var4.l;
      var6.h = var4.m;
      var7.h = var4.n;
      var8.h = var4.o;
      var9.h = var4.p;

      for (int var20 = 0; var20 < this.ah; var20++) {
         this.ar[var20] = var5.A();
         if (this.ao != null) {
            this.ao[var20] = var6.y();
         }

         if (this.ap != null) {
            this.ap[var20] = var7.y();
         }

         if (this.aq != null) {
            this.aq[var20] = var8.y();
         }

         if (this.aK != null) {
            this.aK[var20] = var9.y();
         }
      }

      var5.h = var4.j;
      var6.h = var4.k;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;

      for (int var25 = 0; var25 < this.ah; var25++) {
         int var18 = var6.y();
         if (var18 == 1) {
            var21 = var5.L() + var24;
            var22 = var5.L() + var21;
            var23 = var5.L() + var22;
            var24 = var23;
            this.ai[var25] = var21;
            this.aj[var25] = var22;
            this.ak[var25] = var23;
         }

         if (var18 == 2) {
            var21 = var21;
            var22 = var23;
            var23 = var5.L() + var24;
            var24 = var23;
            this.ai[var25] = var21;
            this.aj[var25] = var22;
            this.ak[var25] = var23;
         }

         if (var18 == 3) {
            var21 = var23;
            var22 = var22;
            var23 = var5.L() + var24;
            var24 = var23;
            this.ai[var25] = var21;
            this.aj[var25] = var22;
            this.ak[var25] = var23;
         }

         if (var18 == 4) {
            int var19 = var21;
            var21 = var22;
            var22 = var19;
            var23 = var5.L() + var24;
            var24 = var23;
            this.ai[var25] = var21;
            this.aj[var25] = var19;
            this.ak[var25] = var23;
         }
      }

      var5.h = var4.q;

      for (int var26 = 0; var26 < this.av; var26++) {
         this.aw[var26] = var5.A();
         this.ax[var26] = var5.A();
         this.ay[var26] = var5.A();
      }
   }

   public static C_v[] j() {
      return b(rs.p_cache.p_osrs.C_c.a());
   }

   public static C_v[] b(boolean var0) {
      return var0 ? rs.p_cache.p_osrs.C_c.b() : o;
   }

   public static void a(byte[] var0, int var1, boolean var2) {
      if (var0 == null) {
         C_v var15 = b(var2)[var1] = new C_v();
         var15.b = 0;
         var15.c = 0;
         var15.d = 0;
      } else {
         rs.p_x.C_e var3 = new rs.p_x.C_e(var0);
         var3.h = var0.length - 18;
         C_v var4 = b(var2)[var1] = new C_v();
         var4.a = var0;
         var4.b = var3.A();
         var4.c = var3.A();
         if (var3.h < 0) {
            var3.h = 0;
         } else {
            var4.d = var3.y();
            int var5 = var3.y();
            int var6 = var3.y();
            int var7 = var3.y();
            int var8 = var3.y();
            int var9 = var3.y();
            int var10 = var3.A();
            int var11 = var3.A();
            int var12 = var3.A();
            int var13 = var3.A();
            int var14 = 0;
            var4.e = var14;
            var14 += var4.b;
            var4.k = var14;
            var14 += var4.c;
            var4.n = var14;
            if (var6 == 255) {
               var14 += var4.c;
            } else {
               var4.n = -var6 - 1;
            }

            var4.p = var14;
            if (var8 == 1) {
               var14 += var4.c;
            } else {
               var4.p = -1;
            }

            var4.m = var14;
            if (var5 == 1) {
               var14 += var4.c;
            } else {
               var4.m = -1;
            }

            var4.i = var14;
            if (var9 == 1) {
               var14 += var4.b;
            } else {
               var4.i = -1;
            }

            var4.o = var14;
            if (var7 == 1) {
               var14 += var4.c;
            } else {
               var4.o = -1;
            }

            var4.j = var14;
            var14 += var13;
            var4.l = var14;
            var14 += var4.c * 2;
            var4.q = var14;
            var14 += var4.d * 6;
            var4.f = var14;
            var14 += var10;
            var4.g = var14;
            var14 += var11;
            var4.h = var14;
            var14 += var12;
         }
      }
   }

   public static void a(int var0, rs.p_cache.C_e var1) {
      rs.p_cache.p_osrs.C_c.a(new C_v[70000]);
      o = new C_v[80000];
      p = new boolean[100000];
      aU = var1;
   }

   public static void d(int var0) {
      rs.p_cache.p_osrs.C_c.a((rs.C_v[])null);
      o[var0] = null;
   }

   public static C_h e(int var0) {
      return a(var0, h);
   }

   public static C_h a(int var0, boolean var1) {
      rs.p_cache.p_osrs.C_c.a(var1);

      C_h var2;
      try {
         var2 = a(var0, h);
      } finally {
         rs.p_cache.p_osrs.C_c.a(false);
      }

      return var2;
   }

   public static C_h a(int var0, rs.p_a.p_a.C_a var1) {
      if (j() == null) {
         return null;
      } else {
         C_v var2 = j()[var0];
         if (var2 == null) {
            aU.a(var0);
            return null;
         } else {
            return new C_h(var0, var1);
         }
      }
   }

   public static boolean b(int var0, boolean var1) {
      rs.p_cache.p_osrs.C_c.a(var1);

      boolean var2;
      try {
         var2 = f(var0);
      } finally {
         rs.p_cache.p_osrs.C_c.a(false);
      }

      return var2;
   }

   public static boolean f(int var0) {
      if (j() == null) {
         return false;
      } else {
         C_v var1 = j()[var0];
         if (var1 == null) {
            aU.a(var0);
            return false;
         } else {
            return true;
         }
      }
   }

   private C_h(boolean var1) {
      this.bK = 9;
      this.bL = false;
      this.bM = 360;
      this.bN = 1;
      this.bO = true;
      this.aN = false;
      if (!var1) {
         this.bO = !this.bO;
      }
   }

   public C_h(int var1, C_h[] var2, boolean var3) {
      this.bO = true;
      this.aN = false;
      ab++;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      this.ad = 0;
      this.ah = 0;
      this.av = 0;
      this.au = -1;

      for (int var9 = 0; var9 < var1; var9++) {
         C_h var8 = var2[var9];
         if (var8 != null) {
            this.ad = this.ad + var8.ad;
            this.ah = this.ah + var8.ah;
            this.av = this.av + var8.av;
            var4 |= var8.ao != null;
            if (var8.ap != null) {
               var5 = true;
            } else {
               if (this.au == -1) {
                  this.au = var8.au;
               }

               if (this.au != var8.au) {
                  var5 = true;
               }
            }

            var6 |= var8.aq != null;
            var7 |= var8.aK != null;
         }
      }

      this.ae = new int[this.ad];
      this.af = new int[this.ad];
      this.ag = new int[this.ad];
      this.aJ = new int[this.ad];
      this.ai = new int[this.ah];
      this.aj = new int[this.ah];
      this.ak = new int[this.ah];
      this.aw = new int[this.av];
      this.ax = new int[this.av];
      this.ay = new int[this.av];
      if (var4) {
         this.ao = new int[this.ah];
      }

      if (var5) {
         this.ap = new int[this.ah];
      }

      if (var6) {
         this.aq = new int[this.ah];
      }

      if (var7) {
         this.aK = new int[this.ah];
      }

      this.ar = new int[this.ah];
      this.ad = 0;
      this.ah = 0;
      this.av = 0;
      int var14 = 0;

      for (int var10 = 0; var10 < var1; var10++) {
         C_h var13 = var2[var10];
         if (var13 != null) {
            for (int var11 = 0; var11 < var13.ah; var11++) {
               if (var4) {
                  if (var13.ao == null) {
                     this.ao[this.ah] = 0;
                  } else {
                     int var12 = var13.ao[var11];
                     if ((var12 & 2) == 2) {
                        var12 += var14 << 2;
                     }

                     this.ao[this.ah] = var12;
                  }
               }

               if (var5) {
                  if (var13.ap == null) {
                     this.ap[this.ah] = var13.au;
                  } else {
                     this.ap[this.ah] = var13.ap[var11];
                  }
               }

               if (var6) {
                  if (var13.aq == null) {
                     this.aq[this.ah] = 0;
                  } else {
                     this.aq[this.ah] = var13.aq[var11];
                  }
               }

               if (var7 && var13.aK != null) {
                  this.aK[this.ah] = var13.aK[var11];
               }

               this.ar[this.ah] = var13.ar[var11];
               this.ai[this.ah] = this.a(var13, var13.ai[var11]);
               this.aj[this.ah] = this.a(var13, var13.aj[var11]);
               this.ak[this.ah] = this.a(var13, var13.ak[var11]);
               this.ah++;
            }

            for (int var15 = 0; var15 < var13.av; var15++) {
               this.aw[this.av] = this.a(var13, var13.aw[var15]);
               this.ax[this.av] = this.a(var13, var13.ax[var15]);
               this.ay[this.av] = this.a(var13, var13.ay[var15]);
               this.av++;
            }

            var14 += var13.av;
         }
      }
   }

   public C_h(int var1, C_h[] var2) {
      this(var1, var2, h);
   }

   public C_h(int var1, C_h[] var2, rs.p_a.p_a.C_a var3) {
      this.bK = 9;
      this.bL = false;
      this.bM = 360;
      this.bN = 1;
      this.bO = true;
      this.aN = false;
      ab++;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      this.ad = 0;
      this.ah = 0;
      this.av = 0;
      this.au = -1;

      for (int var12 = 0; var12 < var1; var12++) {
         C_h var11 = var2[var12];
         if (var11 != null) {
            this.ad = this.ad + var11.ad;
            this.ah = this.ah + var11.ah;
            this.av = this.av + var11.av;
            var4 |= var11.ao != null;
            if (var11.ap != null) {
               var5 = true;
            } else {
               if (this.au == -1) {
                  this.au = var11.au;
               }

               if (this.au != var11.au) {
                  var5 = true;
               }
            }

            var6 |= var11.aq != null;
            var7 |= var11.aK != null;
            var8 |= var11.Y != null;
            var9 |= var11.Z != null;
            var10 |= var11.W != null;
            if (var11.I != -1) {
               this.I = var11.I;
            }
         }
      }

      var3.a(this.ah, this.ad);
      this.L = var3.a(rs.p_a.p_a.C_a.b_type.p);
      this.M = var3.c(rs.p_a.p_a.C_a.b_type.q);
      this.ae = var3.a(rs.p_a.p_a.C_a.b_type.m);
      this.af = var3.a(rs.p_a.p_a.C_a.b_type.n);
      this.ag = var3.a(rs.p_a.p_a.C_a.b_type.o);
      this.aJ = var3.a(rs.p_a.p_a.C_a.b_type.l);
      this.ai = var3.a(rs.p_a.p_a.C_a.b_type.a);
      this.aj = var3.a(rs.p_a.p_a.C_a.b_type.b);
      this.ak = var3.a(rs.p_a.p_a.C_a.b_type.c);
      this.ar = var3.a(rs.p_a.p_a.C_a.b_type.j);
      this.aw = new int[this.av];
      this.ax = new int[this.av];
      this.ay = new int[this.av];
      if (var4) {
         this.ao = var3.a(rs.p_a.p_a.C_a.b_type.g);
      }

      if (var5) {
         this.ap = var3.a(rs.p_a.p_a.C_a.b_type.h);
      }

      if (var6) {
         this.aq = var3.a(rs.p_a.p_a.C_a.b_type.i);
      }

      if (var7) {
         this.aK = var3.a(rs.p_a.p_a.C_a.b_type.k);
      }

      if (var8) {
         this.Y = new short[this.ah];
      }

      if (var9) {
         this.Z = new short[this.ah];
      }

      if (var10) {
         this.W = new int[this.ad][];
         this.X = new int[this.ad][];
      }

      this.ad = 0;
      this.ah = 0;
      this.av = 0;
      if (this.av > 0) {
         this.aa = new byte[this.av];
      }

      int var17 = 0;

      for (int var13 = 0; var13 < var1; var13++) {
         C_h var16 = var2[var13];
         if (var16 != null) {
            for (int var14 = 0; var14 < var16.ah; var14++) {
               if (var4) {
                  if (var16.ao == null) {
                     this.ao[this.ah] = 0;
                  } else {
                     int var15 = var16.ao[var14];
                     if ((var15 & 2) == 2) {
                        var15 += var17 << 2;
                     }

                     this.ao[this.ah] = var15;
                  }
               }

               if (var5) {
                  if (var16.ap == null) {
                     this.ap[this.ah] = var16.au;
                  } else {
                     this.ap[this.ah] = var16.ap[var14];
                  }
               }

               if (var6) {
                  if (var16.aq == null) {
                     this.aq[this.ah] = 0;
                  } else {
                     this.aq[this.ah] = var16.aq[var14];
                  }
               }

               if (var8) {
                  if (var16.Y != null) {
                     this.Y[this.ah] = var16.Y[var14];
                  } else {
                     this.Y[this.ah] = -1;
                  }
               }

               if (var9) {
                  if (var16.Z != null && var16.Z[var14] != -1) {
                     int var19 = var16.Z[var14] + var17;
                     this.Z[this.ah] = (short)(var16.Z[var14] + var17);
                     if (var19 != this.Z[this.ah]) {
                        System.out.println(var19 + " -> " + this.Z[this.ah]);
                     }
                  } else {
                     this.Z[this.ah] = -1;
                  }
               }

               if (var7 && var16.aK != null && var14 < var16.aK.length) {
                  this.aK[this.ah] = var16.aK[var14];
               }

               this.ar[this.ah] = var16.ar[var14];
               this.ai[this.ah] = this.a(var16, var16.ai[var14]);
               this.aj[this.ah] = this.a(var16, var16.aj[var14]);
               this.ak[this.ah] = this.a(var16, var16.ak[var14]);
               this.ah++;
            }

            for (int var18 = 0; var18 < var16.av; var18++) {
               this.aw[this.av] = this.a(var16, var16.aw[var18]);
               this.ax[this.av] = this.a(var16, var16.ax[var18]);
               this.ay[this.av] = this.a(var16, var16.ay[var18]);
               this.av++;
            }

            var17 += var16.av;
         }
      }
   }

   public C_h(C_h[] var1) {
      this(var1, h);
   }

   public C_h(C_h[] var1, rs.p_a.p_a.C_a var2) {
      byte var3 = 2;
      this.bK = 9;
      this.bL = false;
      this.bM = 360;
      this.bN = 1;
      this.bO = true;
      this.aN = false;
      ab++;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      this.ad = 0;
      this.ah = 0;
      this.av = 0;
      this.au = -1;

      for (int var11 = 0; var11 < var3; var11++) {
         if (var1[var11] != null) {
            this.ad = this.ad + var1[var11].ad;
            this.ah = this.ah + var1[var11].ah;
            this.av = this.av + var1[var11].av;
            var4 |= var1[var11].ao != null;
            if (var1[var11].ap != null) {
               var5 = true;
            } else {
               if (this.au == -1) {
                  this.au = var1[var11].au;
               }

               if (this.au != var1[var11].au) {
                  var5 = true;
               }
            }

            var6 |= var1[var11].aq != null;
            var7 |= var1[var11].ar != null;
            var8 |= var1[var11].Y != null;
            var9 |= var1[var11].Z != null;
            var10 |= var1[var11].W != null;
            if (var1[var11].I != -1) {
               this.I = var1[var11].I;
            }
         }
      }

      var2.a(this.ah, this.ad);
      this.L = var2.a(rs.p_a.p_a.C_a.b_type.p);
      this.M = var2.c(rs.p_a.p_a.C_a.b_type.q);
      this.ae = var2.a(rs.p_a.p_a.C_a.b_type.m);
      this.af = var2.a(rs.p_a.p_a.C_a.b_type.n);
      this.ag = var2.a(rs.p_a.p_a.C_a.b_type.o);
      this.aJ = var2.a(rs.p_a.p_a.C_a.b_type.l);
      this.ai = var2.a(rs.p_a.p_a.C_a.b_type.a);
      this.aj = var2.a(rs.p_a.p_a.C_a.b_type.b);
      this.ak = var2.a(rs.p_a.p_a.C_a.b_type.c);
      this.al = var2.a(rs.p_a.p_a.C_a.b_type.d);
      this.am = var2.a(rs.p_a.p_a.C_a.b_type.e);
      this.an = var2.a(rs.p_a.p_a.C_a.b_type.f);
      this.ar = var2.a(rs.p_a.p_a.C_a.b_type.j);
      this.aw = new int[this.av];
      this.ax = new int[this.av];
      this.ay = new int[this.av];
      if (var4) {
         this.ao = var2.a(rs.p_a.p_a.C_a.b_type.g);
      }

      if (var5) {
         this.ap = var2.a(rs.p_a.p_a.C_a.b_type.h);
      }

      if (var6) {
         this.aq = var2.a(rs.p_a.p_a.C_a.b_type.i);
      }

      if (var7) {
         this.aK = var2.a(rs.p_a.p_a.C_a.b_type.k);
      }

      if (var8) {
         this.Y = new short[this.ah];
      }

      if (var9) {
         this.Z = new short[this.ah];
      }

      if (var10) {
         this.W = new int[this.ad][];
         this.X = new int[this.ad][];
      }

      this.ad = 0;
      this.ah = 0;
      this.av = 0;
      int var16 = 0;

      for (int var12 = 0; var12 < var3; var12++) {
         if (var1[var12] != null) {
            int var13 = this.ad;

            for (int var14 = 0; var14 < var1[var12].ad; var14++) {
               if (var2.f()) {
                  var2.e(this.ad);
               }

               if (!rs.p_f.C_a.ah) {
                  this.L[this.ad] = var1[var12].L[var14];
                  this.M[this.ad] = var1[var12].M[var14];
               }

               this.ae[this.ad] = var1[var12].ae[var14];
               this.af[this.ad] = var1[var12].af[var14];
               this.ag[this.ad] = var1[var12].ag[var14];
               this.ad++;
            }

            for (int var17 = 0; var17 < var1[var12].ah; var17++) {
               if (var2.f()) {
                  var2.d(this.ah);
               }

               this.ai[this.ah] = var1[var12].ai[var17] + var13;
               this.aj[this.ah] = var1[var12].aj[var17] + var13;
               this.ak[this.ah] = var1[var12].ak[var17] + var13;
               this.al[this.ah] = var1[var12].al[var17];
               this.am[this.ah] = var1[var12].am[var17];
               this.an[this.ah] = var1[var12].an[var17];
               if (var4) {
                  if (var1[var12].ao == null) {
                     this.ao[this.ah] = 0;
                  } else {
                     int var15 = var1[var12].ao[var17];
                     if ((var15 & 2) == 2) {
                        var15 += var16 << 2;
                     }

                     this.ao[this.ah] = var15;
                  }
               }

               if (var5) {
                  if (var1[var12].ap == null) {
                     this.ap[this.ah] = var1[var12].au;
                  } else {
                     this.ap[this.ah] = var1[var12].ap[var17];
                  }
               }

               if (var6) {
                  if (var1[var12].aq == null) {
                     this.aq[this.ah] = 0;
                  } else {
                     this.aq[this.ah] = var1[var12].aq[var17];
                  }
               }

               if (var7 && var1[var12].ar != null) {
                  this.ar[this.ah] = var1[var12].ar[var17];
               }

               if (var8) {
                  if (var1[var12].Y != null) {
                     this.Y[this.ah] = var1[var12].Y[this.ah];
                  } else {
                     this.Y[this.ah] = -1;
                  }
               }

               if (var9) {
                  if (var1[var12].Z != null && var1[var12].Z[this.ah] != -1) {
                     this.Z[this.ah] = (short)(var1[var12].Z[this.ah] + this.av);
                  } else {
                     this.Z[this.ah] = -1;
                  }
               }

               this.ah++;
            }

            for (int var18 = 0; var18 < var1[var12].av; var18++) {
               this.aw[this.av] = var1[var12].aw[var18] + var13;
               this.ax[this.av] = var1[var12].ax[var18] + var13;
               this.ay[this.av] = var1[var12].ay[var18] + var13;
               this.av++;
            }

            var16 += var1[var12].av;
         }
      }

      this.k();
   }

   public C_h(boolean var1, boolean var2, boolean var3, C_h var4) {
      this(var1, var2, var3, var4, h);
   }

   public C_h(boolean var1, boolean var2, boolean var3, C_h var4, rs.p_a.p_a.C_a var5) {
      this.bK = 9;
      this.bL = false;
      this.bM = 360;
      this.bN = 1;
      this.bO = true;
      this.aN = false;
      ab++;
      this.ad = var4.ad;
      this.ah = var4.ah;
      this.av = var4.av;
      var5.a(this.ah, this.ad);
      boolean var6 = !var5.f();
      if (!var3 && var4.Y != null) {
         this.Y = new short[this.ah];

         for (int var7 = 0; var7 < this.ah; var7++) {
            if (!var6) {
               var5.d(var7);
               var6 = true;
            }

            this.Y[var7] = var4.Y[var7];
         }
      } else {
         this.Y = var4.Y;
      }

      if (var3) {
         this.L = var4.L;
         this.M = var4.M;
         this.ae = var4.ae;
         this.af = var4.af;
         this.ag = var4.ag;
      } else {
         if (var4.L != null) {
            this.L = var5.a(rs.p_a.p_a.C_a.b_type.p);
            this.M = var5.c(rs.p_a.p_a.C_a.b_type.q);
         }

         this.ae = var5.a(rs.p_a.p_a.C_a.b_type.m);
         this.af = var5.a(rs.p_a.p_a.C_a.b_type.n);
         this.ag = var5.a(rs.p_a.p_a.C_a.b_type.o);

         for (int var8 = 0; var8 < this.ad; var8++) {
            if (var5.f()) {
               var5.e(var8);
            }

            if (!rs.p_f.C_a.ah && var4.L != null) {
               this.L[var8] = var4.L[var8];
               this.M[var8] = var4.M[var8];
            }

            this.ae[var8] = var4.ae[var8];
            this.af[var8] = var4.af[var8];
            this.ag[var8] = var4.ag[var8];
         }
      }

      if (var1) {
         this.ar = var4.ar;
      } else {
         this.ar = var5.a(rs.p_a.p_a.C_a.b_type.j);

         for (int var9 = 0; var9 < this.ah; var9++) {
            if (!var6) {
               var5.d(var9);
               var6 = true;
            }

            this.ar[var9] = var4.ar[var9];
         }
      }

      if (var2) {
         this.aq = var4.aq;
      } else {
         this.aq = var5.a(rs.p_a.p_a.C_a.b_type.i);
         if (var4.aq == null) {
            for (int var10 = 0; var10 < this.ah; var10++) {
               if (!var6) {
                  var5.d(var10);
                  var6 = true;
               }

               this.aq[var10] = 0;
            }
         } else {
            for (int var11 = 0; var11 < this.ah; var11++) {
               if (!var6) {
                  var5.d(var11);
                  var6 = true;
               }

               this.aq[var11] = var4.aq[var11];
            }
         }
      }

      this.I = var4.I;
      this.L = var4.L;
      this.M = var4.M;
      this.aJ = var4.aJ;
      this.aK = var4.aK;
      this.ao = var4.ao;
      this.ai = var4.ai;
      this.aj = var4.aj;
      this.ak = var4.ak;
      this.ap = var4.ap;
      this.Z = var4.Z;
      this.aa = var4.aa;
      this.au = var4.au;
      this.aw = var4.aw;
      this.ax = var4.ax;
      this.ay = var4.ay;
      this.X = var4.X;
      this.W = var4.W;
   }

   public C_h(boolean var1, boolean var2, C_h var3) {
      this.bK = 9;
      this.bL = false;
      this.bM = 360;
      this.bN = 1;
      this.bO = true;
      this.aN = false;
      ab++;
      this.ad = var3.ad;
      this.ah = var3.ah;
      this.av = var3.av;
      if (var1) {
         this.af = new int[this.ad];
         if (var3.ae != null) {
            System.arraycopy(var3.af, 0, this.af, 0, this.ad);
         } else {
            this.af = null;
         }
      } else {
         this.af = var3.af;
      }

      if (var2) {
         this.al = new int[this.ah];
         this.am = new int[this.ah];
         this.an = new int[this.ah];

         for (int var4 = 0; var4 < this.ah; var4++) {
            this.al[var4] = var3.al[var4];
            this.am[var4] = var3.am[var4];
            this.an[var4] = var3.an[var4];
         }

         this.ao = new int[this.ah];
         if (var3.ao == null) {
            for (int var6 = 0; var6 < this.ah; var6++) {
               this.ao[var6] = 0;
            }
         } else {
            for (int var5 = 0; var5 < this.ah; var5++) {
               this.ao[var5] = var3.ao[var5];
            }
         }

         super.f = new C_S_uc(this.ad);

         for (int var7 = 0; var7 < this.ad; var7++) {
            super.f.a(var7, var3.f.a(var7));
            super.f.b(var7, var3.f.b(var7));
            super.f.c(var7, var3.f.c(var7));
            super.f.d(var7, var3.f.d(var7));
         }

         this.aO = var3.aO;
      } else {
         this.al = var3.al;
         this.am = var3.am;
         this.an = var3.an;
         this.ao = var3.ao;
      }

      this.ae = var3.ae;
      this.ag = var3.ag;
      this.ar = var3.ar;
      this.aq = var3.aq;
      this.Y = var3.Y;
      this.Z = var3.Z;
      this.aa = var3.aa;
      this.ap = var3.ap;
      this.au = var3.au;
      this.ai = var3.ai;
      this.aj = var3.aj;
      this.ak = var3.ak;
      this.aw = var3.aw;
      this.ax = var3.ax;
      this.ay = var3.ay;
      super.g = var3.g;
      this.aD = var3.aD;
      this.aG = var3.aG;
      this.aF = var3.aF;
      this.W = var3.W;
      this.X = var3.X;
      this.az = var3.az;
      this.aB = var3.aB;
      this.aC = var3.aC;
      this.aA = var3.aA;
   }

   public void a(C_h var1, boolean var2) {
      this.m = var1.m;
      this.ad = var1.ad;
      this.ah = var1.ah;
      this.av = var1.av;
      if (bS.length < this.ad) {
         bS = new int[this.ad + 10000];
         bT = new int[this.ad + 10000];
         bU = new int[this.ad + 10000];
         bQ = new int[this.ad + 10000];
         bR = new byte[this.ad + 10000];
      }

      this.L = bQ;
      this.M = bR;
      this.ae = bS;
      this.af = bT;
      this.ag = bU;

      for (int var3 = 0; var3 < this.ad; var3++) {
         if (!rs.p_f.C_a.ah && this.L != null) {
            this.L[var3] = var1.L[var3];
            if (this.M != null) {
               this.M[var3] = var1.M[var3];
            }
         }

         this.ae[var3] = var1.ae[var3];
         this.af[var3] = var1.af[var3];
         this.ag[var3] = var1.ag[var3];
      }

      if (var2) {
         this.aq = var1.aq;
      } else {
         if (bV.length < this.ah) {
            bV = new int[this.ah + 100];
         }

         this.aq = bV;
         if (var1.aq == null) {
            for (int var4 = 0; var4 < this.ah; var4++) {
               this.aq[var4] = 0;
            }
         } else {
            for (int var5 = 0; var5 < this.ah; var5++) {
               this.aq[var5] = var1.aq[var5];
            }
         }
      }

      this.ao = var1.ao;
      this.ar = var1.ar;
      this.ap = var1.ap;
      this.au = var1.au;
      this.aM = var1.aM;
      this.aL = var1.aL;
      this.ai = var1.ai;
      this.aj = var1.aj;
      this.ak = var1.ak;
      this.al = var1.al;
      this.am = var1.am;
      this.an = var1.an;
      this.aw = var1.aw;
      this.ax = var1.ax;
      this.ay = var1.ay;
      this.Z = var1.Z;
      this.aa = var1.aa;
      this.Y = var1.Y;
      this.I = var1.I;
      this.W = var1.W;
      this.X = var1.X;
   }

   private final int a(C_h var1, int var2) {
      int var3 = -1;
      int var4 = !rs.p_f.C_a.ah && var1.L != null ? var1.L[var2] : 0;
      byte var5 = !rs.p_f.C_a.ah && var1.M != null ? var1.M[var2] : 0;
      int var6 = var1.ae[var2];
      int var7 = var1.af[var2];
      int var8 = var1.ag[var2];

      for (int var9 = 0; var9 < this.ad; var9++) {
         if (var6 == this.ae[var9] && var7 == this.af[var9] && var8 == this.ag[var9]) {
            var3 = var9;
            break;
         }
      }

      if (var3 == -1) {
         if (!rs.p_f.C_a.ah && var1.L != null) {
            this.L[this.ad] = var4;
         }

         if (!rs.p_f.C_a.ah && var1.M != null) {
            this.M[this.ad] = var5;
         }

         this.ae[this.ad] = var6;
         this.af[this.ad] = var7;
         this.ag[this.ad] = var8;
         if (var1.aJ != null) {
            this.aJ[this.ad] = var1.aJ[var2];
         }

         if (var1.W != null) {
            this.W[this.ad] = var1.W[var2];
            this.X[this.ad] = var1.X[var2];
         }

         var3 = this.ad++;
      }

      return var3;
   }

   public void k() {
      super.g = 0;
      this.aD = 0;
      this.aE = 0;

      for (int var1 = 0; var1 < this.ad; var1++) {
         int var2 = this.ae[var1];
         int var3 = this.af[var1];
         int var4 = this.ag[var1];
         if (-var3 > super.g) {
            super.g = -var3;
         }

         if (var3 > this.aE) {
            this.aE = var3;
         }

         int var5 = var2 * var2 + var4 * var4;
         if (var5 > this.aD) {
            this.aD = var5;
         }
      }

      this.aD = (int)(Math.sqrt((double)this.aD) + 0.99);
      this.aG = (int)(Math.sqrt((double)(this.aD * this.aD + super.g * super.g)) + 0.99);
      this.aF = this.aG + (int)(Math.sqrt((double)(this.aD * this.aD + this.aE * this.aE)) + 0.99);
   }

   public void a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.l();
      int var7 = var2 - this.aD;
      int var8 = var2 + this.aD;
      int var9 = var4 - this.aD;
      int var10 = var4 + this.aD;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return;
         }

         if (var6 == 0) {
            for (int var11 = 0; var11 < this.ad; var11++) {
               int var12 = var2 + this.ae[var11];
               int var13 = var4 + this.ag[var11];
               int var14 = var12 & 127;
               int var15 = var13 & 127;
               int var16 = var12 >> 7;
               int var17 = var13 >> 7;
               int var18 = var1[var16][var17] * (128 - var14) + var1[var16 + 1][var17] * var14 >> 7;
               int var19 = var1[var16][var17 + 1] * (128 - var14) + var14 * var1[var16 + 1][var17 + 1] >> 7;
               int var20 = var18 * (128 - var15) + var19 * var15 >> 7;
               this.af[var11] = var20 + this.af[var11] - var3;
            }
         }

         this.l();
      }
   }

   public void l() {
      super.g = 0;
      this.aE = 0;

      for (int var1 = 0; var1 < this.ad; var1++) {
         int var2 = this.af[var1];
         if (-var2 > super.g) {
            super.g = -var2;
         }

         if (var2 > this.aE) {
            this.aE = var2;
         }
      }

      this.aG = (int)(Math.sqrt((double)(this.aD * this.aD + super.g * super.g)) + 0.99);
      this.aF = this.aG + (int)(Math.sqrt((double)(this.aD * this.aD + this.aE * this.aE)) + 0.99);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      byte var9 = 0;
      int var10 = this.aA - this.az;
      int var11 = this.aE - this.g;
      int var12 = this.aB - this.aC;
      double var13 = (double)var7 / (double)var10;
      double var15 = -((double)var8 / (double)var11);
      double var17 = Math.min(var13, var15);
      var5 = Math.abs(var11 / 2);
      int var19 = (int)((double)var12 / var17);
      var19 -= var11;
      int var20 = var19 < var6 / 2 ? var6 / 2 : var6;
      var19 = (int)Math.ceil((double)var19 / (double)var20) * var20;
      var19 = Math.max(var19, var6 / 2);
      var19 = (int)((double)var19 - (double)var3 / var17 * 4.0);
      var6 = C_E_uc.w[var9] * Math.max(var6 / 2, var19) >> 16;
      this.a(var1, var2, 0, var4, var5, var6);
      this.r = var7 * var8;
   }

   public void m() {
      super.g = 0;
      this.aD = 0;
      this.aE = 0;
      this.az = 999999;
      this.aA = -999999;
      this.aB = -99999;
      this.aC = 99999;

      for (int var1 = 0; var1 < this.ad; var1++) {
         int var2 = this.ae[var1];
         int var3 = this.af[var1];
         int var4 = this.ag[var1];
         if (var2 < this.az) {
            this.az = var2;
         }

         if (var2 > this.aA) {
            this.aA = var2;
         }

         if (var4 < this.aC) {
            this.aC = var4;
         }

         if (var4 > this.aB) {
            this.aB = var4;
         }

         if (-var3 > super.g) {
            super.g = -var3;
         }

         if (var3 > this.aE) {
            this.aE = var3;
         }

         int var5 = var2 * var2 + var4 * var4;
         if (var5 > this.aD) {
            this.aD = var5;
         }
      }

      this.aD = (int)Math.sqrt((double)this.aD);
      this.aG = (int)Math.sqrt((double)(this.aD * this.aD + super.g * super.g));
      this.aF = this.aG + (int)Math.sqrt((double)(this.aD * this.aD + this.aE * this.aE));
   }

   public void n() {
      if (this.i.l != null) {
         this.aL = this.i.l;
         this.aJ = null;
      }

      if (this.i.m != null) {
         this.aM = this.i.m;
         this.aK = null;
      }

      if (this.aJ != null) {
         int var1 = 0;
         System.arraycopy(s, 0, t, 0, 256);

         for (int var2 = 0; var2 < this.ad; var2++) {
            int var3 = this.aJ[var2];
            t[var3]++;
            if (var3 > var1) {
               var1 = var3;
            }
         }

         this.aL = new int[var1 + 1][];

         for (int var5 = 0; var5 <= var1; var5++) {
            this.aL[var5] = new int[t[var5]];
            t[var5] = 0;
         }

         int var6 = 0;

         while (var6 < this.ad) {
            int var10 = this.aJ[var6];
            this.aL[var10][t[var10]++] = var6++;
         }

         if (this.i.f()) {
            this.i.l = Arrays.copyOf(this.aL, this.aL.length);
         }

         this.aJ = null;
      }

      if (this.aK != null) {
         System.arraycopy(s, 0, u, 0, 256);
         int var4 = 0;

         for (int var7 = 0; var7 < this.ah; var7++) {
            int var11 = this.aK[var7];
            u[var11]++;
            if (var11 > var4) {
               var4 = var11;
            }
         }

         this.aM = new int[var4 + 1][];

         for (int var8 = 0; var8 <= var4; var8++) {
            this.aM[var8] = new int[u[var8]];
            u[var8] = 0;
         }

         int var9 = 0;

         while (var9 < this.ah) {
            int var12 = this.aK[var9];
            this.aM[var12][u[var12]++] = var9++;
         }

         if (this.i.f()) {
            this.i.m = Arrays.copyOf(this.aM, this.aM.length);
         }

         this.aK = null;
      }
   }

   public C_h c(boolean var1) {
      C_h var2 = new C_h(true, var1, false, this);
      var2.n();
      return var2;
   }

   public C_h d(boolean var1) {
      C_h var2 = ac;
      var2.a(this, var1);
      var2.k();
      var2.n();
      return var2;
   }

   public void a(rs.p_u.C_b var1, int var2) {
      if (var2 != -1) {
         if (var1 != null) {
            C_K_uc var3 = var1.base;
            rs.p_u.C_j var4 = var3.b();
            if (var4 != null) {
               var4.a(var1, var2);
               this.a(var4, var1.c());
            }

            if (var1.d()) {
               this.b(var1, var2);
            }

            this.k();
            this.aM = null;
            this.aL = null;
         }
      }
   }

   void a(rs.p_u.C_j var1, int var2) {
      if (this.W != null) {
         for (int var3 = 0; var3 < this.ad; var3++) {
            int[] var4 = this.W[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.X[var3];
               aR.f();

               for (int var6 = 0; var6 < var4.length; var6++) {
                  int var7 = var4[var6];
                  rs.p_u.C_d var8 = var1.a(var7);
                  if (var8 != null) {
                     aS.a((float)var5[var6] / 255.0F);
                     aT.a(var8.d(var2));
                     aT.c(aS);
                     aR.b(aT);
                  }
               }

               this.a(var3, aR);
            }
         }
      }
   }

   void a(int var1, b var2) {
      float var3 = (float)this.ae[var1];
      float var4 = (float)(-this.af[var1]);
      float var5 = (float)(-this.ag[var1]);
      float var6 = 1.0F;
      this.ae[var1] = (int)(var2.e[0] * var3 + var2.e[4] * var4 + var2.e[8] * var5 + var2.e[12] * var6);
      this.af[var1] = -((int)(var2.e[1] * var3 + var2.e[5] * var4 + var2.e[9] * var5 + var2.e[13] * var6));
      this.ag[var1] = -((int)(var2.e[2] * var3 + var2.e[6] * var4 + var2.e[10] * var5 + var2.e[14] * var6));
   }

   void b(rs.p_u.C_b var1, int var2) {
      C_K_uc var3 = var1.base;

      for (int var4 = 0; var4 < var3.b; var4++) {
         int var5 = var3.d[var4];
         if (var5 == 5 && var1.e != null && var1.e[var4] != null && var1.e[var4][0] != null && this.aM != null && this.aq != null) {
            rs.p_u.C_g var6 = var1.e[var4][0];

            for (int var10 : var3.e[var4]) {
               if (var10 < this.aM.length) {
                  int[] var11 = this.aM[var10];

                  for (int var12 = 0; var12 < var11.length; var12++) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.aq[var13] & 0xFF) + var6.a(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.aq[var13] = var14;
                  }
               }
            }
         }
      }
   }

   public void a(C_K_uc var1, rs.p_u.C_b var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      rs.p_u.C_j var7 = var1.b();
      if (var7 != null) {
         var7.a(var2, var3, var4, var5);
         if (var6) {
            this.a(var7, var2.c());
         }
      }

      if (!var5 && var2.d()) {
         this.b(var2, var3);
      }
   }

   public void f(int var1, int var2) {
      if (this.aL != null) {
         if (var1 != -1) {
            rs.C_k var3;
            try {
               rs.p_cache.p_osrs.C_c.a(rs.p_d.C_a.a[var2].w);
               var3 = rs.C_k.c(var1, var2);
            } finally {
               rs.p_cache.p_osrs.C_c.a(false);
            }

            if (var3 != null) {
               C_K_uc var4 = var3.g;
               bq = 0;
               br = 0;
               bs = 0;

               for (int var5 = 0; var5 < var3.h; var5++) {
                  int var6 = var3.k[var5];
                  this.a(var4.d[var6], var4.e[var6], var3.l[var5], var3.m[var5], var3.n[var5]);
               }
            }
         }
      }
   }

   public void a(int[] var1, int var2, int var3, int var4) {
      if (var3 != -1) {
         if (var1 != null && var2 != -1) {
            rs.C_k var5 = null;

            try {
               rs.p_cache.p_osrs.C_c.a(rs.p_d.C_a.a[var4].w);
               var5 = rs.C_k.c(var3, var4);
            } finally {
               rs.p_cache.p_osrs.C_c.a(false);
            }

            if (var5 != null) {
               rs.C_k var6 = null;

               try {
                  rs.p_cache.p_osrs.C_c.a(rs.p_d.C_a.a[var4].w);
                  var6 = rs.C_k.c(var2, var4);
               } finally {
                  rs.p_cache.p_osrs.C_c.a(false);
               }

               if (var6 == null) {
                  this.f(var3, var4);
               } else {
                  C_K_uc var7 = var5.g;
                  bq = 0;
                  br = 0;
                  bs = 0;
                  int var8 = 0;
                  if (var8 > var1.length - 1) {
                     this.f(var3, var4);
                  } else {
                     int var9 = var1[var8++];

                     for (int var10 = 0; var10 < var5.h; var10++) {
                        int var11 = var5.k[var10];

                        while (var11 > var9) {
                           var9 = var1[var8++];
                        }

                        if (var11 != var9 || var7.d[var11] == 0) {
                           this.a(var7.d[var11], var7.e[var11], var5.l[var10], var5.m[var10], var5.n[var10]);
                        }
                     }

                     bq = 0;
                     br = 0;
                     bs = 0;
                     var8 = 0;
                     if (var8 > var1.length - 1) {
                        this.f(var3, var4);
                     } else {
                        var9 = var1[var8++];

                        for (int var24 = 0; var24 < var6.h; var24++) {
                           int var25 = var6.k[var24];

                           while (var25 > var9) {
                              var9 = var1[var8++];
                           }

                           if (var25 == var9 || var7.d[var25] == 0) {
                              this.a(var7.d[var25], var7.e[var25], var6.l[var24], var6.m[var24], var6.n[var24]);
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.f(var3, var4);
         }
      }
   }

   private void a(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      if (var1 == 0) {
         int var21 = 0;
         bq = 0;
         br = 0;
         bs = 0;

         for (int var25 = 0; var25 < var6; var25++) {
            int var29 = var2[var25];
            if (var29 < this.aL.length) {
               int[] var33 = this.aL[var29];

               for (int var37 = 0; var37 < var33.length; var37++) {
                  int var38 = var33[var37];
                  bq = bq + this.ae[var38];
                  br = br + this.af[var38];
                  bs = bs + this.ag[var38];
                  var21++;
               }
            }
         }

         if (var21 > 0) {
            bq = bq / var21 + var3;
            br = br / var21 + var4;
            bs = bs / var21 + var5;
         } else {
            bq = var3;
            br = var4;
            bs = var5;
         }
      } else if (var1 == 1) {
         for (int var20 = 0; var20 < var6; var20++) {
            int var24 = var2[var20];
            if (var24 < this.aL.length) {
               int[] var28 = this.aL[var24];

               for (int var32 = 0; var32 < var28.length; var32++) {
                  int var36 = var28[var32];
                  this.ae[var36] = this.ae[var36] + var3;
                  this.af[var36] = this.af[var36] + var4;
                  this.ag[var36] = this.ag[var36] + var5;
               }
            }
         }
      } else if (var1 == 2) {
         for (int var19 = 0; var19 < var6; var19++) {
            int var23 = var2[var19];
            if (var23 < this.aL.length) {
               int[] var27 = this.aL[var23];

               for (int var31 = 0; var31 < var27.length; var31++) {
                  int var35 = var27[var31];
                  this.ae[var35] = this.ae[var35] - bq;
                  this.af[var35] = this.af[var35] - br;
                  this.ag[var35] = this.ag[var35] - bs;
                  int var12 = (var3 & 0xFF) * 8;
                  int var13 = (var4 & 0xFF) * 8;
                  int var14 = (var5 & 0xFF) * 8;
                  if (var14 != 0) {
                     int var15 = bA[var14];
                     int var16 = bB[var14];
                     int var17 = this.af[var35] * var15 + this.ae[var35] * var16 >> 16;
                     this.af[var35] = this.af[var35] * var16 - this.ae[var35] * var15 >> 16;
                     this.ae[var35] = var17;
                  }

                  if (var12 != 0) {
                     int var39 = bA[var12];
                     int var41 = bB[var12];
                     int var43 = this.af[var35] * var41 - this.ag[var35] * var39 >> 16;
                     this.ag[var35] = this.af[var35] * var39 + this.ag[var35] * var41 >> 16;
                     this.af[var35] = var43;
                  }

                  if (var13 != 0) {
                     int var40 = bA[var13];
                     int var42 = bB[var13];
                     int var44 = this.ag[var35] * var40 + this.ae[var35] * var42 >> 16;
                     this.ag[var35] = this.ag[var35] * var42 - this.ae[var35] * var40 >> 16;
                     this.ae[var35] = var44;
                  }

                  this.ae[var35] = this.ae[var35] + bq;
                  this.af[var35] = this.af[var35] + br;
                  this.ag[var35] = this.ag[var35] + bs;
               }
            }
         }
      } else if (var1 == 3) {
         for (int var18 = 0; var18 < var6; var18++) {
            int var22 = var2[var18];
            if (var22 < this.aL.length) {
               int[] var26 = this.aL[var22];

               for (int var30 = 0; var30 < var26.length; var30++) {
                  int var34 = var26[var30];
                  this.ae[var34] = this.ae[var34] - bq;
                  this.af[var34] = this.af[var34] - br;
                  this.ag[var34] = this.ag[var34] - bs;
                  this.ae[var34] = this.ae[var34] * var3 / 128;
                  this.af[var34] = this.af[var34] * var4 / 128;
                  this.ag[var34] = this.ag[var34] * var5 / 128;
                  this.ae[var34] = this.ae[var34] + bq;
                  this.af[var34] = this.af[var34] + br;
                  this.ag[var34] = this.ag[var34] + bs;
               }
            }
         }
      } else {
         if (var1 == 5 && this.aM != null && this.aq != null) {
            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var2[var7];
               if (var8 < this.aM.length) {
                  int[] var9 = this.aM[var8];

                  for (int var10 = 0; var10 < var9.length; var10++) {
                     int var11 = var9[var10];
                     this.aq[var11] = this.aq[var11] + var3 * 8;
                     if (this.aq[var11] < 0) {
                        this.aq[var11] = 0;
                     }

                     if (this.aq[var11] > 255) {
                        this.aq[var11] = 255;
                     }
                  }
               }
            }
         }
      }
   }

   public void b(int[] var1, int var2) {
      if (this.aq == null) {
         this.aq = new int[this.ah];
      }

      for (int var3 = 0; var3 < this.ah; var3++) {
         for (int var7 : var1) {
            if (var7 == this.ar[var3]) {
               this.aq[var3] = 100 - var2;
            }
         }
      }
   }

   public void g(int var1, int var2) {
      if (this.aq == null) {
         this.aq = new int[this.ah];
      }

      if (var2 != -1) {
         this.aq[var2] = var1;
      } else {
         for (int var3 = 0; var3 < this.ah; var3++) {
            this.aq[var3] = 100 - var1;
         }
      }
   }

   public void g(int var1) {
      for (int var2 = 0; var2 < this.ah; var2++) {
         if (this.ar[var2] < 40 || this.ar[var2] > 100) {
            this.ar[var2] = var1;
         }
      }
   }

   public void h(int var1) {
      for (int var2 = 0; var2 < this.ah; var2++) {
         if (this.ar[var2] < 15 || this.ar[var2] > 255) {
            this.ar[var2] = var1;
         }
      }
   }

   public void h(int var1, int var2) {
      for (int var3 = 0; var3 < this.ah; var3++) {
         if (this.ar[var3] > var2) {
            this.ar[var3] = var1;
         }
      }
   }

   public void i(int var1) {
      for (int var2 = 0; var2 < this.ah; var2++) {
         if (this.ar[var2] > 1) {
            this.ar[var2] = var1;
         }
      }
   }

   public void o() {
      for (int var1 = 0; var1 < this.ad; var1++) {
         int var2 = this.ae[var1];
         this.ae[var1] = this.ag[var1];
         this.ag[var1] = -var2;
      }
   }

   public void j(int var1) {
      int var2 = bA[var1];
      int var3 = bB[var1];

      for (int var4 = 0; var4 < this.ad; var4++) {
         int var5 = this.af[var4] * var3 - this.ag[var4] * var2 >> 16;
         this.ag[var4] = this.af[var4] * var2 + this.ag[var4] * var3 >> 16;
         this.af[var4] = var5;
      }
   }

   public void a(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.ad; var4++) {
         this.ae[var4] = this.ae[var4] + var1;
         this.af[var4] = this.af[var4] + var2;
         this.ag[var4] = this.ag[var4] + var3;
      }
   }

   public void i(int var1, int var2) {
      for (int var3 = 0; var3 < this.ah; var3++) {
         if (this.ar[var3] == var1) {
            this.ar[var3] = var2;
         }
      }
   }

   public void p() {
      for (int var1 = 0; var1 < this.ad; var1++) {
         this.ag[var1] = -this.ag[var1];
      }

      for (int var3 = 0; var3 < this.ah; var3++) {
         int var2 = this.ai[var3];
         this.ai[var3] = this.ak[var3];
         this.ak[var3] = var2;
      }
   }

   public void b(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.ad; var4++) {
         this.ae[var4] = this.ae[var4] * var1 / 128;
         this.af[var4] = this.af[var4] * var3 / 128;
         this.ag[var4] = this.ag[var4] * var2 / 128;
      }
   }

   public void q() {
      if (super.f == null) {
         super.f = this.i.b(this.ad);

         for (int var1 = 0; var1 < this.ah; var1++) {
            int var2 = this.ai[var1];
            int var3 = this.aj[var1];
            int var4 = this.ak[var1];
            int var5 = this.ae[var3] - this.ae[var2];
            int var6 = this.af[var3] - this.af[var2];
            int var7 = this.ag[var3] - this.ag[var2];
            int var8 = this.ae[var4] - this.ae[var2];
            int var9 = this.af[var4] - this.af[var2];
            int var10 = this.ag[var4] - this.ag[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for (var13 = var5 * var9 - var8 * var6;
               var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192;
               var13 >>= 1
            ) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            boolean var15;
            if (this.ao == null) {
               var15 = false;
            } else {
               var15 = (this.ao[var1] & 1) == 1;
            }

            if (!var15) {
               super.f.e(var2, var11);
               super.f.f(var2, var12);
               super.f.g(var2, var13);
               super.f.h(var2, 1);
               super.f.e(var3, var11);
               super.f.f(var3, var12);
               super.f.g(var3, var13);
               super.f.h(var3, 1);
               super.f.e(var4, var11);
               super.f.f(var4, var12);
               super.f.g(var4, var13);
               super.f.h(var4, 1);
            } else if (var15) {
               if (this.aQ == null) {
                  this.aQ = this.i.a(this.ah);
               }

               this.aQ.a(var1, var11);
               this.aQ.b(var1, var12);
               this.aQ.c(var1, var13);
            }
         }
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var8 = var2 * var7 >> 8;
      if (this.al == null) {
         this.i.a(this.ah, this.ad);
         this.al = this.i.a(rs.p_a.p_a.C_a.b_type.d);
         this.am = this.i.a(rs.p_a.p_a.C_a.b_type.e);
         this.an = this.i.a(rs.p_a.p_a.C_a.b_type.f);
      }

      if (super.f == null) {
         super.f = this.i.b(this.ad);
      }

      for (int var9 = 0; var9 < this.ah; var9++) {
         if (this.ar != null && this.aq != null && (this.ar[var9] == 65535 || this.ar[var9] == 0 && this.k == 1 || this.ar[var9] == 16705)) {
            this.aq[var9] = 255;
         }

         int var10 = this.ai[var9];
         int var11 = this.aj[var9];
         int var12 = this.ak[var9];
         int var13 = this.ae[var11] - this.ae[var10];
         int var14 = this.af[var11] - this.af[var10];
         int var15 = this.ag[var11] - this.ag[var10];
         int var16 = this.ae[var12] - this.ae[var10];
         int var17 = this.af[var12] - this.af[var10];
         int var18 = this.ag[var12] - this.ag[var10];
         int var19 = var14 * var18 - var17 * var15;
         int var20 = var15 * var16 - var18 * var13;

         int var21;
         for (var21 = var13 * var17 - var16 * var14;
            var19 > 8192 || var20 > 8192 || var21 > 8192 || var19 < -8192 || var20 < -8192 || var21 < -8192;
            var21 >>= 1
         ) {
            var19 >>= 1;
            var20 >>= 1;
         }

         int var22 = (int)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21));
         if (var22 <= 0) {
            var22 = 1;
         }

         var19 = var19 * 256 / var22;
         var20 = var20 * 256 / var22;
         var21 = var21 * 256 / var22;
         if (this.ao != null && (this.ao[var9] & 1) != 0) {
            int var23 = var1;
            int var24 = var3;
            int var25 = var4;
            int var26 = var5;
            if (this.Y != null && var9 < this.Y.length && var9 > 0 && this.Y[var9] != -1) {
               var23 = 64;
               var24 = -30;
               var25 = -50;
               var26 = -30;
            }

            int var27 = var23 + (var24 * var19 + var25 * var20 + var26 * var21) / (var8 + var8 / 2);
            this.al[var9] = c(this.ar[var9], var27, this.ao[var9]);
         } else {
            super.f.e(var10, var19);
            super.f.f(var10, var20);
            super.f.g(var10, var21);
            super.f.h(var10, 1);
            super.f.e(var11, var19);
            super.f.f(var11, var20);
            super.f.g(var11, var21);
            super.f.h(var11, 1);
            super.f.e(var12, var19);
            super.f.f(var12, var20);
            super.f.g(var12, var21);
            super.f.h(var12, 1);
         }
      }

      if (var6) {
         this.a(var1, var8, var3, var4, var5);
      } else {
         this.aO = this.i.c(this.ad);

         for (int var28 = 0; var28 < this.ad; var28++) {
            this.aO.a(var28, super.f.a(var28));
            this.aO.b(var28, super.f.b(var28));
            this.aO.c(var28, super.f.c(var28));
            this.aO.d(var28, super.f.d(var28));
         }
      }

      if (var6) {
         this.k();
      } else {
         this.m();
      }
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (rs.p_k.C_e.a() && !C_E_uc.h) {
         int var7 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
         int var8 = var2 * var7 >> 8;
         if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(rs.p_a.p_a.C_a.b_type.d);
            this.am = this.i.a(rs.p_a.p_a.C_a.b_type.e);
            this.an = this.i.a(rs.p_a.p_a.C_a.b_type.f);
         }

         this.q();

         for (int var9 = 0; var9 < this.ah; var9++) {
            if (this.ar != null && this.aq != null && (this.ar[var9] == 65535 || this.ar[var9] == 0 && this.k == 1 || this.ar[var9] == 16705)) {
               this.aq[var9] = 255;
            }

            int var10;
            if (this.ao == null) {
               var10 = 0;
            } else {
               var10 = (this.ao[var9] & 1) == 1 ? 1 : 0;
            }

            int var11;
            if (this.aq == null) {
               var11 = 0;
            } else {
               var11 = this.aq[var9];
            }

            short var12;
            if (this.Y == null) {
               if (this.a(var9)) {
                  var12 = (short)this.ar[var9];
               } else {
                  var12 = -1;
               }
            } else if (this.Y[var9] <= 0 && this.a(var9)) {
               var12 = (short)this.ar[var9];
            } else {
               var12 = this.Y[var9];
            }

            if (var11 == -2) {
               var10 = 3;
            }

            if (var11 == -1) {
               var10 = 2;
            }

            if (var12 == -1) {
               if (var10 == 0) {
                  int var15 = this.ar[var9] & 65535;
                  int var16 = this.ai[var9];
                  C_S_uc var13;
                  if (this.aP != null && !this.aP.e(this.ai[var9])) {
                     var13 = this.aP;
                  } else {
                     var13 = super.f;
                  }

                  int var14 = (var4 * var13.b(var16) + var5 * var13.c(var16) + var3 * var13.a(var16)) / (var8 * var13.d(var16)) + var1;
                  var16 = this.aj[var9];
                  this.al[var9] = j(var15, var14);
                  if (this.aP != null && !this.aP.e(this.aj[var9])) {
                     var13 = this.aP;
                  } else {
                     var13 = super.f;
                  }

                  var14 = (var4 * var13.b(var16) + var5 * var13.c(var16) + var3 * var13.a(var16)) / (var8 * var13.d(var16)) + var1;
                  var16 = this.ak[var9];
                  this.am[var9] = j(var15, var14);
                  if (this.aP != null && !this.aP.e(this.ak[var9])) {
                     var13 = this.aP;
                  } else {
                     var13 = super.f;
                  }

                  var14 = (var4 * var13.b(var16) + var5 * var13.c(var16) + var3 * var13.a(var16)) / (var8 * var13.d(var16)) + var1;
                  this.an[var9] = j(var15, var14);
               } else if (var10 == 1) {
                  int var25 = (var4 * this.aQ.b(var9) + var5 * this.aQ.c(var9) + var3 * this.aQ.a(var9)) / (var8 / 2 + var8) + var1;
                  this.al[var9] = j(this.ar[var9] & 65535, var25);
                  this.an[var9] = -1;
               } else if (var10 == 3) {
                  this.al[var9] = 128;
                  this.an[var9] = -1;
               } else {
                  this.an[var9] = -2;
               }
            } else if (var10 == 0) {
               int var30 = this.ai[var9];
               C_S_uc var20;
               if (this.aP != null && !this.aP.e(this.ai[var9])) {
                  var20 = this.aP;
               } else {
                  var20 = super.f;
               }

               int var26 = (var4 * var20.b(var30) + var5 * var20.c(var30) + var3 * var20.a(var30)) / (var8 * var20.d(var30)) + var1;
               var30 = this.aj[var9];
               this.al[var9] = k(var26);
               if (this.aP != null && !this.aP.e(this.aj[var9])) {
                  var20 = this.aP;
               } else {
                  var20 = super.f;
               }

               var26 = (var4 * var20.b(var30) + var5 * var20.c(var30) + var3 * var20.a(var30)) / (var8 * var20.d(var30)) + var1;
               var30 = this.ak[var9];
               this.am[var9] = k(var26);
               if (this.aP != null && !this.aP.e(this.ak[var9])) {
                  var20 = this.aP;
               } else {
                  var20 = super.f;
               }

               var26 = (var4 * var20.b(var30) + var5 * var20.c(var30) + var3 * var20.a(var30)) / (var8 * var20.d(var30)) + var1;
               this.an[var9] = k(var26);
            } else if (var10 == 1) {
               int var29 = (var4 * this.aQ.b(var9) + var5 * this.aQ.c(var9) + var3 * this.aQ.a(var9)) / (var8 / 2 + var8) + var1;
               this.al[var9] = k(var29);
               this.an[var9] = -1;
            } else {
               this.an[var9] = -2;
            }
         }

         if (var6) {
            this.a(var1, var8, var3, var4, var5);
         } else {
            this.aO = this.i.c(this.ad);

            for (int var17 = 0; var17 < this.ad; var17++) {
               this.aO.a(var17, super.f.a(var17));
               this.aO.b(var17, super.f.b(var17));
               this.aO.c(var17, super.f.c(var17));
               this.aO.d(var17, super.f.d(var17));
            }
         }

         if (var6) {
            this.k();
         } else {
            this.m();
         }
      } else {
         this.a(var1, var2, var3, var4, var5, var6);
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      C_S_uc var6 = null;

      for (int var7 = 0; var7 < this.ah; var7++) {
         int var8 = this.ai[var7];
         int var9 = this.aj[var7];
         int var10 = this.ak[var7];
         int var11 = var1;
         int var13 = var3;
         int var15 = var5;
         if (rs.p_k.C_e.a() && var7 >= 0 && this.a(var7) && (this.z || this.A)) {
            var13 = var3 * -1;
            var15 = var5 * -1;
            var11 = 50;
         }

         var6 = super.f;
         if (this.ao == null) {
            int var16 = this.ar[var7];
            int var17 = var11 + (var13 * var6.a(var8) + var4 * var6.b(var8) + var15 * var6.c(var8)) / (var2 * var6.d(var8));
            this.al[var7] = c(var16, var17, 0);
            var17 = var11 + (var13 * var6.a(var9) + var4 * var6.b(var9) + var15 * var6.c(var9)) / (var2 * var6.d(var9));
            this.am[var7] = c(var16, var17, 0);
            var17 = var11 + (var13 * var6.a(var10) + var4 * var6.b(var10) + var15 * var6.c(var10)) / (var2 * var6.d(var10));
            this.an[var7] = c(var16, var17, 0);
         } else if ((this.ao[var7] & 1) == 0) {
            int var21 = this.ar[var7];
            int var24 = this.ao[var7];
            int var18 = var11 + (var13 * var6.a(var8) + var4 * var6.b(var8) + var15 * var6.c(var8)) / (var2 * var6.d(var8));
            this.al[var7] = c(var21, var18, var24);
            var18 = var11 + (var13 * var6.a(var9) + var4 * var6.b(var9) + var15 * var6.c(var9)) / (var2 * var6.d(var9));
            this.am[var7] = c(var21, var18, var24);
            var18 = var11 + (var13 * var6.a(var10) + var4 * var6.b(var10) + var15 * var6.c(var10)) / (var2 * var6.d(var10));
            this.an[var7] = c(var21, var18, var24);
         }
      }

      if (rs.p_k.C_e.a()) {
         this.f();
      }

      super.f = null;
      this.aO = null;
      this.aJ = null;
      this.aK = null;
      if (this.ao != null) {
         for (int var20 = 0; var20 < this.ah; var20++) {
            if ((this.ao[var20] & 2) == 2) {
               return;
            }
         }
      }

      this.ar = null;
   }

   static final int k(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static final int j(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   public static final int c(int var0, int var1, int var2) {
      if (var0 == 65535) {
         return 0;
      } else if ((var2 & 2) == 2) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         return 127 - var1;
      } else {
         var1 = var1 * (var0 & 127) >> 7;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 0;
      int var8 = C_E_uc.s;
      int var9 = C_E_uc.t;
      int var10 = bA[var7];
      int var11 = bB[var7];
      int var12 = bA[var1];
      int var13 = bB[var1];
      int var14 = bA[var2];
      int var15 = bB[var2];
      int var16 = bA[var3];
      int var17 = bB[var3];
      int var18 = var5 * var16 + var6 * var17 >> 16;

      for (int var19 = 0; var19 < this.ad; var19++) {
         int var20 = this.ae[var19];
         int var21 = this.af[var19];
         int var22 = this.ag[var19];
         if (var2 != 0) {
            int var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var7 != 0) {
            int var29 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var29;
         }

         if (var1 != 0) {
            int var30 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var30;
         }

         var20 += var4;
         var21 += var5;
         var22 += var6;
         int var31 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         bb[var19] = var22 - var18;
         if (rs.p_f.C_a.av) {
            bc[var19] = 0;
         }

         aZ[var19] = var8 + (var20 << 9) / var22;
         ba[var19] = var9 + (var31 << 9) / var22;
         if (this.av > 0) {
            bd[var19] = var20;
            be[var19] = var31;
            bf[var19] = var22;
         }
      }

      try {
         this.a(false, false, 0, 0);
      } catch (Exception var24) {
      }
   }

   void a(rs.p_k.p_c.C_d var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var1 != null) {
         for (int var8 = 0; var8 < var1.e(); var8++) {
            rs.p_k.p_c.C_a var9 = var1.a(var8);
            if (var9 != null) {
               if (var9.h() != 1 && !this.N) {
                  if (var9.h() == 2) {
                     if (!var7) {
                        C_Launcher_mc.n().o().a.a(var9, var2, var3, var4, var5, true);
                        C_Launcher_mc.n().o().a.a(var9, var2, var3, var4, var5, false);
                     }
                  } else {
                     C_Launcher_mc.n().o().a.a(var9, var2, var3, var4, var5, var7);
                  }
               } else if (var7) {
                  C_Launcher_mc.n().o().a.a(var9, var2, var3, var4, var5, true);
                  C_Launcher_mc.n().o().a.a(var9, var2, var3, var4, var5, false);
               }
            }
         }
      }
   }

   void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (this.L != null && this.M != null && rs.p_f.C_a.az && !rs.p_f.C_a.ah && !rs.p_l.p_b.C_a.b() && !rs.p_k.p_c.C_c.a()) {
            int var10 = -1;
            int var11 = -1;
            int var12 = 0;
            byte var13 = 100;

            for (int var14 = 0; var14 < this.ad && var14 < this.L.length; var14++) {
               int var15 = this.L[var14] - 1;
               if (var15 >= 0) {
                  rs.p_k.p_c.C_d var16 = rs.p_k.p_c.C_c.a(var9, true);
                  if (var16 == null || !var16.b()) {
                     break;
                  }

                  if (var10 == -1) {
                     int var17 = C_Client_mc.eR.ac;
                     int var18 = C_Client_mc.eR.ad;
                     int var19 = var6 + C_Client_mc.cJ;
                     int var20 = this.aD;
                     int var21 = var8 + C_Client_mc.cL;
                     int var22 = C_Client_mc.cJ;
                     int var23 = -C_Client_mc.cK;
                     int var24 = C_Client_mc.cL;
                     var11 = (int)Math.sqrt((double)((var19 - var17) * (var19 - var17) + (var21 - var18) * (var21 - var18)));
                     var10 = (int)Math.sqrt((double)((var19 - var22) * (var19 - var22) + (var21 - var24) * (var21 - var24)));
                  }

                  rs.p_r.C_c var30 = rs.p_r.C_c.c[var15];
                  int var31 = this.ae[var14];
                  int var32 = this.af[var14] * -1;
                  int var33 = this.ag[var14];
                  if (var15 == 2 || var15 == 3) {
                     var32 -= 11;
                  }

                  int var34 = var30.h();
                  float var35 = 0.0F;
                  short var36 = 750;
                  if (var11 == 0) {
                     var36 *= 2;
                  }

                  int var37 = var10 / var36;
                  if (var37 > 0) {
                     var34 = var30.a(0, var37 * 4) <= Math.max(1, var37 / 2) ? 1 : 0;
                     var35 = (float)(var37 * 4 - 1);
                  }

                  if (var34 < 0 || var37 > 10) {
                     var34 = 0;
                  }

                  for (int var25 = 0; var25 < var34 && var12++ < var13; var25++) {
                     this.J++;
                     rs.p_k.p_c.C_a var26 = rs.p_k.p_c.C_c.a(var30, var31, var32, var33, var14);
                     if (var26 != null) {
                        var26.e(var9);
                        if (var30.p() && this.I != -1) {
                           var26.a(this.I);
                        }

                        var26.a(this.M[var14]);
                        var26.a(Math.min(12.0F, var26.f() + var35));
                        boolean var27 = this.J % 2 != 0;
                        if (var27) {
                           var16.a(var26);
                        }
                     }
                  }
               }
            }
         }

         rs.p_k.p_c.C_d var29 = null;
         if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && (var29 = rs.p_k.p_c.C_c.a(var9, false)) != null) {
            var29.c();
         }

         if (var29 != null) {
            this.a(var29, var1, var6, var7, var8, var9, false);
         }

         C_Launcher_mc.n().o().a.a(this, var1, var2, var3, var4, var5, var6, var7, var8, (long)var9);
         if (var29 != null) {
            this.a(var29, var1, var6, var7, var8, var9, true);
         }
      } catch (Exception var28) {
         var28.printStackTrace();
      }
   }

   private final void a(boolean var1, boolean var2, int var3, int var4) {
      boolean var5 = rs.p_k.C_e.a() && C_E_uc.p && !C_E_uc.h;

      for (int var6 = 0; var6 < this.aF; var6++) {
         bg[var6] = 0;
      }

      for (int var17 = 0; var17 < this.ah; var17++) {
         if ((this.ao == null || this.ao[var17] != -1) && (this.aq == null || this.aq[var17] < 255)) {
            int var7 = this.ai[var17];
            int var8 = this.aj[var17];
            int var9 = this.ak[var17];
            int var10 = aZ[var7];
            int var11 = aZ[var8];
            int var12 = aZ[var9];
            if (var5) {
               if (var10 != -5000 && var11 != -5000 && var12 != -5000 && var2 && this.b(bu, bv, ba[var7], ba[var8], ba[var9], var10, var11, var12)) {
                  bz[bw] = var4;
                  by[bw] = var4;
                  bx[bw++] = var3;
                  var2 = false;
               }
            } else if (!var1 || var10 != -5000 && var11 != -5000 && var12 != -5000) {
               if (var2 && this.b(bu, bv, ba[var7], ba[var8], ba[var9], var10, var11, var12)) {
                  bz[bw] = var4;
                  by[bw] = var4;
                  bx[bw++] = var3;
                  var2 = false;
               }

               if ((var10 - var11) * (ba[var9] - ba[var8]) - (ba[var7] - ba[var8]) * (var12 - var11) > 0) {
                  aY[var17] = false;
                  aX[var17] = var10 < 0 || var11 < 0 || var12 < 0 || var10 > rs.p_l.C_c.n || var11 > rs.p_l.C_c.n || var12 > rs.p_l.C_c.n;
                  int var43 = (bb[var7] + bb[var8] + bb[var9]) / 3 + this.aG;
                  bh[var43][bg[var43]++] = var17;
               }
            } else {
               aY[var17] = true;
               int var13 = (bb[var7] + bb[var8] + bb[var9]) / 3 + this.aG;
               bh[var13][bg[var13]++] = var17;
            }
         }
      }

      if (!var5) {
         if (this.L != null && this.L.length > 0) {
            for (int var18 = 0; var18 < this.ad; var18++) {
               int var26 = this.L[var18] - 1;
               if (var26 >= 0) {
                  rs.p_r.C_c var30 = rs.p_r.C_c.c[var26];
                  int var33 = this.ae[var18];
                  int var37 = this.af[var18];
                  int var40 = this.ag[var18];
                  int var44 = bc[var18];
                  if (this.E != 0) {
                     int var14 = bA[this.E];
                     int var15 = bB[this.E];
                     int var16 = var40 * var14 + var33 * var15 >> 16;
                     var40 = var40 * var15 - var33 * var14 >> 16;
                     var33 = var16;
                  }

                  var33 += this.B;
                  var40 += this.D;
                  if (var26 == 2 || var26 == 3) {
                     var37 -= 11;
                  }

                  for (int var46 = 0; var46 < var30.h(); var46++) {
                     this.J++;
                     if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && this.J % 2 != 0) {
                        rs.p_r.C_a var49 = C_J_uc.a(var30, var44, var33, -var37, var40);
                        if (var49 == null) {
                           break;
                        }

                        if (var30.p() && this.I != -1) {
                           var49.c(this.I);
                        }

                        C_Client_mc.a(var49);
                     }
                  }
               }
            }
         }

         if (this.ap == null) {
            for (int var22 = this.aF - 1; var22 >= 0; var22--) {
               int var25 = bg[var22];
               if (var25 > 0) {
                  for (int var29 = 0; var29 < var25; var29++) {
                     this.q(bh[var22][var29]);
                  }
               }
            }
         } else {
            for (int var19 = 0; var19 < 12; var19++) {
               bi[var19] = 0;
               bm[var19] = 0;
            }

            for (int var20 = this.aF - 1; var20 >= 0; var20--) {
               int var23 = bg[var20];
               if (var23 > 0) {
                  for (int var27 = 0; var27 < var23; var27++) {
                     int var31 = bh[var20][var27];
                     int var35 = this.ap[var31];
                     int var38 = bi[var35]++;
                     bj[var35][var38] = var31;
                     if (var35 < 10) {
                        bm[var35] = bm[var35] + var20;
                     } else if (var35 == 10) {
                        bk[var38] = var20;
                     } else {
                        bl[var38] = var20;
                     }
                  }
               }
            }

            int var21 = 0;
            if (bi[1] > 0 || bi[2] > 0) {
               var21 = (bm[1] + bm[2]) / (bi[1] + bi[2]);
            }

            int var24 = 0;
            if (bi[3] > 0 || bi[4] > 0) {
               var24 = (bm[3] + bm[4]) / (bi[3] + bi[4]);
            }

            int var28 = 0;
            if (bi[6] > 0 || bi[8] > 0) {
               var28 = (bm[6] + bm[8]) / (bi[6] + bi[8]);
            }

            int var32 = 0;
            int var36 = bi[10];
            byte var39 = 10;
            boolean var42 = false;
            if (var32 == var36) {
               var32 = 0;
               var36 = bi[11];
               var39 = 11;
               var42 = true;
            }

            int var45;
            if (var32 < var36) {
               var45 = var42 ? bl[var32] : bk[var32];
            } else {
               var45 = -1000;
            }

            for (int var47 = 0; var47 < 10; var47++) {
               while (var47 == 0 && var45 > var21) {
                  this.q(bj[var39][var32++]);
                  if (var32 == var36 && var39 != 11) {
                     var32 = 0;
                     var36 = bi[11];
                     var39 = 11;
                     var42 = true;
                  }

                  if (var32 < var36) {
                     var45 = var42 ? bl[var32] : bk[var32];
                  } else {
                     var45 = -1000;
                  }
               }

               while (var47 == 3 && var45 > var24) {
                  this.q(bj[var39][var32++]);
                  if (var32 == var36 && var39 != 11) {
                     var32 = 0;
                     var36 = bi[11];
                     var39 = 11;
                     var42 = true;
                  }

                  if (var32 < var36) {
                     var45 = var42 ? bl[var32] : bk[var32];
                  } else {
                     var45 = -1000;
                  }
               }

               while (var47 == 5 && var45 > var28) {
                  this.q(bj[var39][var32++]);
                  if (var32 == var36 && var39 != 11) {
                     var32 = 0;
                     var36 = bi[11];
                     var39 = 11;
                     var42 = true;
                  }

                  if (var32 < var36) {
                     var45 = var42 ? bl[var32] : bk[var32];
                  } else {
                     var45 = -1000;
                  }
               }

               int var50 = bi[var47];

               for (int var51 = 0; var51 < var50; var51++) {
                  this.q(bj[var47][var51]);
               }
            }

            int var48 = 0;

            while (var45 != -1000) {
               var48++;
               this.q(bj[var39][var32++]);
               if (var32 == var36 && var39 != 11) {
                  var32 = 0;
                  var39 = 11;
                  var36 = bi[11];
                  var42 = true;
               }

               if (var32 < var36) {
                  var45 = var42 ? bl[var32] : bk[var32];
               } else {
                  var45 = -1000;
               }
            }
         }
      }
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.B = var6 + C_Client_mc.cJ;
      this.C = var7 + C_Client_mc.cK;
      this.D = var8 + C_Client_mc.cL;
      this.E = var1;
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.aD * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < j) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = var15 - this.aD << 9;
         if (var16 / var14 < rs.p_l.C_c.o) {
            int var17 = var15 + this.aD << 9;
            if (var17 / var14 > -rs.p_l.C_c.o) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.aD * var2 >> 16;
               int var20 = var18 + var19 << 9;
               if (var20 / var14 > -rs.p_l.C_c.p) {
                  int var21 = var19 + (super.g * var3 >> 16);
                  int var22 = var18 - var21 << 9;
                  if (var22 / var14 < rs.p_l.C_c.p) {
                     int var23 = var13 + (super.g * var2 >> 16);
                     boolean var24 = false;
                     if (var12 - var23 <= 50) {
                        var24 = true;
                     }

                     boolean var25 = false;
                     if (var9 > 0 && bt) {
                        int var26 = var12 - var13;
                        if (var26 <= 50) {
                           var26 = 50;
                        }

                        if (var15 > 0) {
                           var16 /= var14;
                           var17 /= var26;
                        } else {
                           var17 /= var14;
                           var16 /= var26;
                        }

                        if (var18 > 0) {
                           var22 /= var14;
                           var20 /= var26;
                        } else {
                           var20 /= var14;
                           var22 /= var26;
                        }

                        int var27 = bu - C_E_uc.s;
                        int var28 = bv - C_E_uc.t;
                        Object var29 = null;
                        boolean var30 = false;
                        boolean var31 = false;
                        byte var32 = 0;
                        boolean var33 = false;
                        if (var33 || var27 > var16 && var27 < var17 && var28 > var22 && var28 < var20) {
                           if (!var33 && !this.aN) {
                              var25 = true;
                           } else {
                              by[bw] = var10;
                              bx[bw++] = var31 && var32 != 0 ? var32 : var9;
                              if (var30) {
                                 ((rs.p_l.p_e.C_j)var29).g = true;
                              }
                           }
                        }

                        var31 = false;
                     }
                  }
               }
            }
         }
      }
   }

   public void l(int var1) {
      if (!this.bH.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = bB[var1];
         int var9 = bA[var1];

         for (int var10 = 0; var10 < this.ad; var10++) {
            int var11 = C_E_uc.e(this.ae[var10], this.ag[var10], var8, var9);
            int var12 = this.af[var10];
            int var13 = C_E_uc.e(this.ae[var10], this.ag[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         C_i var14 = new C_i((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         if (var14.d < 32) {
            var14.d = 32;
         }

         if (var14.f < 32) {
            var14.f = 32;
         }

         if (this.aN) {
            var14.d += 8;
            var14.f += 8;
         }

         this.bH.put(var1, var14);
      }
   }

   @Override
   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.B = var6 + C_Client_mc.cJ;
      this.C = var7 + C_Client_mc.cK;
      this.D = var8 + C_Client_mc.cL;
      this.E = var1;
      if (rs.p_f.C_a.I || var10 == 0) {
         int var11 = var8 * var5 - var6 * var4 >> 16;
         int var12 = var7 * var2 + var11 * var3 >> 16;
         int var13 = this.aD * var3 >> 16;
         int var14 = var12 + var13;
         boolean var15 = rs.p_k.C_e.a() && C_E_uc.p;
         if (var14 > 50 && var12 < j) {
            int var16 = var8 * var4 + var6 * var5 >> 16;
            int var17 = var16 - this.aD << 9;
            if (var17 / var14 < rs.p_l.C_c.o) {
               int var18 = var16 + this.aD << 9;
               if (var18 / var14 > -rs.p_l.C_c.o) {
                  int var19 = var7 * var3 - var11 * var2 >> 16;
                  int var20 = this.aD * var2 >> 16;
                  int var21 = var19 + var20 << 9;
                  if (var21 / var14 > -rs.p_l.C_c.p) {
                     int var22 = var20 + (super.g * var3 >> 16);
                     int var23 = var19 - var22 << 9;
                     if (var23 / var14 < rs.p_l.C_c.p) {
                        int var24 = var13 + (super.g * var2 >> 16);
                        boolean var25 = false;
                        if (var12 - var24 <= 50) {
                           var25 = true;
                        }

                        boolean var26 = false;
                        if (var9 > 0 && bt) {
                           int var27 = var12 - var13;
                           if (var27 <= 50) {
                              var27 = 50;
                           }

                           if (var16 > 0) {
                              var17 /= var14;
                              var18 /= var27;
                           } else {
                              var18 /= var14;
                              var17 /= var27;
                           }

                           if (var19 > 0) {
                              var23 /= var14;
                              var21 /= var27;
                           } else {
                              var21 /= var14;
                              var23 /= var27;
                           }

                           int var28 = bu - C_E_uc.s;
                           int var29 = bv - C_E_uc.t;
                           rs.p_l.p_e.C_j var30 = null;
                           boolean var31 = false;
                           boolean var32 = false;
                           int var33 = 0;
                           if ((var9 >> 29 & 3) == 1 || rs.p_l.p_b.p_a.C_d.d) {
                              var30 = (rs.p_l.p_e.C_j)C_Client_mc.ab.c.b(var9);
                              var31 = var30 != null && var30.b != null && var30.a != null;
                              if (var31) {
                                 var30.g = false;
                                 if (var30.a.contains(bu, bv)) {
                                    var32 = true;
                                    var33 = var30.h;
                                    var30.g = true;
                                 }
                              }
                           }

                           if ((var9 >> 29 & 3) == 2 && C_Client_mc.ab.e.size() > 0) {
                              var30 = (rs.p_l.p_e.C_j)C_Client_mc.ab.e.b(var9);
                              var31 = var30 != null && var30.b != null && var30.a != null;
                              if (var31) {
                                 var30.g = false;
                                 if (var30.a.contains(bu, bv)) {
                                    var32 = true;
                                    var33 = var30.h;
                                    var30.g = true;
                                 }
                              }
                           }

                           boolean var34 = var32 && var33 != 0;
                           if (var34 || var28 > var17 && var28 < var18 && var29 > var23 && var29 < var21) {
                              if (!var34 && !this.aN) {
                                 var26 = true;
                              } else {
                                 by[bw] = var10;
                                 bx[bw++] = var32 && var33 != 0 ? var33 : var9;
                                 if (var31) {
                                    var30.g = true;
                                 }

                                 if (var15) {
                                    this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                                    return;
                                 }
                              }
                           }

                           var32 = false;
                        }

                        int var41 = C_E_uc.s;
                        int var42 = C_E_uc.t;
                        int var43 = 0;
                        int var44 = 0;
                        if (var1 != 0) {
                           var43 = bA[var1];
                           var44 = bB[var1];
                        }

                        for (int var45 = 0; var45 < this.ad; var45++) {
                           int var47 = this.ae[var45];
                           int var50 = this.af[var45];
                           int var52 = this.ag[var45];
                           if (var1 != 0) {
                              int var35 = var52 * var43 + var47 * var44 >> 16;
                              var52 = var52 * var44 - var47 * var43 >> 16;
                              var47 = var35;
                           }

                           var47 += var6;
                           var50 += var7;
                           var52 += var8;
                           int var56 = var52 * var4 + var47 * var5 >> 16;
                           var52 = var52 * var5 - var47 * var4 >> 16;
                           var56 = var50 * var3 - var52 * var2 >> 16;
                           var52 = var50 * var2 + var52 * var3 >> 16;
                           bb[var45] = var52 - var12;
                           if (rs.p_f.C_a.av) {
                              bc[var45] = var52;
                           }

                           if (var52 >= 50) {
                              aZ[var45] = var41 + (var56 << 9) / var52;
                              ba[var45] = var42 + (var56 << 9) / var52;
                           } else {
                              aZ[var45] = -5000;
                              var25 = true;
                           }

                           if ((var25 || this.av > 0) && !var15) {
                              bd[var45] = var56;
                              be[var45] = var56;
                              bf[var45] = var52;
                           }
                        }

                        try {
                           if (!var15 || var26 && !(Math.sqrt((double)(var6 * var6 + var8 * var8)) > 4480.0)) {
                              this.a(var25, var26, var9, var10);
                           }

                           if (var15) {
                              this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
                           }
                        } catch (Exception var36) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private final void q(int var1) {
      if (aY[var1]) {
         this.r(var1);
      } else {
         int var2 = this.ai[var1];
         int var3 = this.aj[var1];
         int var4 = this.ak[var1];
         C_E_uc.o = aX[var1];
         if (this.aq == null) {
            C_E_uc.r = 0;
         } else {
            C_E_uc.r = this.aq[var1];
         }

         if (this.K <= 255) {
            C_E_uc.r = this.K;
         }

         int var5;
         if (this.ao == null) {
            var5 = 0;
         } else {
            var5 = H != -1 ? H : this.ao[var1] & 3;
            if (H != -1) {
               var5 = 1;
            }
         }

         if (!this.F || ba[this.ai[var1]] >= rs.p_l.C_c.j - 20 && ba[this.aj[var1]] >= rs.p_l.C_c.j - 20 && ba[this.ak[var1]] >= rs.p_l.C_c.j - 20) {
            if (!C_E_uc.q) {
               if (ba[this.ai[var1]] < rs.p_l.C_c.j - this.O) {
                  ba[this.ai[var1]] = rs.p_l.C_c.j - this.O;
               }

               if (ba[this.aj[var1]] < rs.p_l.C_c.j - this.O) {
                  ba[this.aj[var1]] = rs.p_l.C_c.j - this.O;
               }

               if (ba[this.ak[var1]] < rs.p_l.C_c.j - this.O) {
                  ba[this.ak[var1]] = rs.p_l.C_c.j - this.O;
               }

               if (aZ[this.ai[var1]] < rs.p_l.C_c.l) {
                  aZ[this.ai[var1]] = rs.p_l.C_c.l;
               }

               if (aZ[this.aj[var1]] < rs.p_l.C_c.l) {
                  aZ[this.aj[var1]] = rs.p_l.C_c.l;
               }

               if (aZ[this.ak[var1]] < rs.p_l.C_c.l) {
                  aZ[this.ak[var1]] = rs.p_l.C_c.l;
               }
            }

            if (this.Y != null && this.Y[var1] != -1 && H == -1) {
               int var17 = var2;
               int var21 = var3;
               int var25 = var4;
               if (this.Z != null && this.Z[var1] != -1) {
                  short var27 = this.Z[var1];
                  var17 = this.aw[var27];
                  var21 = this.ax[var27];
                  var25 = this.ay[var27];
               }

               int var28 = H != -1 ? H : this.an[var1];
               if (var28 != -1 && var5 != 3) {
                  if (rs.p_f.C_a.ah) {
                     C_E_uc.a(
                        ba[var2],
                        ba[var3],
                        ba[var4],
                        aZ[var2],
                        aZ[var3],
                        aZ[var4],
                        H != -1 ? H : this.al[var1],
                        H != -1 ? H : this.am[var1],
                        H != -1 ? H : this.an[var1],
                        bd[var17],
                        bd[var21],
                        bd[var25],
                        be[var17],
                        be[var21],
                        be[var25],
                        bf[var17],
                        bf[var21],
                        bf[var25],
                        this.Y[var1]
                     );
                  } else {
                     C_E_uc.a(
                        ba[var2],
                        ba[var3],
                        ba[var4],
                        aZ[var2],
                        aZ[var3],
                        aZ[var4],
                        H != -1 ? H : this.al[var1],
                        H != -1 ? H : this.am[var1],
                        H != -1 ? H : this.an[var1],
                        bd[var17],
                        bd[var21],
                        bd[var25],
                        be[var17],
                        be[var21],
                        be[var25],
                        bf[var17],
                        bf[var21],
                        bf[var25],
                        this.Y[var1],
                        (float)bc[var2],
                        (float)bc[var3],
                        (float)bc[var4]
                     );
                  }
               } else {
                  C_E_uc.a(
                     ba[var2],
                     ba[var3],
                     ba[var4],
                     aZ[var2],
                     aZ[var3],
                     aZ[var4],
                     H != -1 ? H : this.al[var1],
                     H != -1 ? H : this.al[var1],
                     H != -1 ? H : this.al[var1],
                     bd[var17],
                     bd[var21],
                     bd[var25],
                     be[var17],
                     be[var21],
                     be[var25],
                     bf[var17],
                     bf[var21],
                     bf[var25],
                     this.Y[var1],
                     (float)bc[var2],
                     (float)bc[var3],
                     (float)bc[var4]
                  );
               }
            } else if (var5 == 0) {
               if (rs.p_f.C_a.av && !rs.p_k.C_e.a()) {
                  if (this.V > 0) {
                     int var16 = C_E_uc.a(this.al[var1], this.S, this.T, this.U, this.V);
                     int var20 = C_E_uc.a(this.am[var1], this.S, this.T, this.U, this.V);
                     int var24 = C_E_uc.a(this.an[var1], this.S, this.T, this.U, this.V);
                     C_E_uc.a(
                        ba[this.ai[var1]],
                        ba[this.aj[var1]],
                        ba[this.ak[var1]],
                        aZ[this.ai[var1]],
                        aZ[this.aj[var1]],
                        aZ[this.ak[var1]],
                        H != -1 ? H : var16,
                        H != -1 ? H : var20,
                        H != -1 ? H : var24,
                        (float)bc[this.ai[var1]],
                        (float)bc[this.aj[var1]],
                        (float)bc[this.ak[var1]]
                     );
                  } else {
                     C_E_uc.a(
                        ba[var2],
                        ba[var3],
                        ba[var4],
                        aZ[var2],
                        aZ[var3],
                        aZ[var4],
                        H != -1 ? H : this.al[var1],
                        H != -1 ? H : this.am[var1],
                        H != -1 ? H : this.an[var1],
                        (float)bc[var2],
                        (float)bc[var3],
                        (float)bc[var4]
                     );
                  }
               } else if (this.V > 0) {
                  int var15 = C_E_uc.a(this.al[var1], this.S, this.T, this.U, this.V);
                  int var19 = C_E_uc.a(this.am[var1], this.S, this.T, this.U, this.V);
                  int var23 = C_E_uc.a(this.an[var1], this.S, this.T, this.U, this.V);
                  C_E_uc.a(
                     ba[this.ai[var1]], ba[this.aj[var1]], ba[this.ak[var1]], aZ[this.ai[var1]], aZ[this.aj[var1]], aZ[this.ak[var1]], var15, var19, var23
                  );
               } else {
                  C_E_uc.a(
                     ba[var2],
                     ba[var3],
                     ba[var4],
                     aZ[var2],
                     aZ[var3],
                     aZ[var4],
                     H != -1 ? H : this.al[var1],
                     H != -1 ? H : this.am[var1],
                     H != -1 ? H : this.an[var1]
                  );
               }
            } else if (var5 == 1) {
               int var14 = bC[H != -1 ? H : this.al[var1]];
               if (this.aI > 0) {
                  var14 = this.aI;
               }

               if (rs.p_f.C_a.av) {
                  C_E_uc.a(ba[var2], ba[var3], ba[var4], aZ[var2], aZ[var3], aZ[var4], var14, (float)bc[var2], (float)bc[var3], (float)bc[var4]);
               } else {
                  C_E_uc.a(ba[var2], ba[var3], ba[var4], aZ[var2], aZ[var3], aZ[var4], var14);
               }
            } else if (var5 == 2) {
               int var13 = (H != -1 ? H : this.ao[var1]) >> 2;
               int var18 = this.aw[var13];
               int var22 = this.ax[var13];
               int var26 = this.ay[var13];
               if (rs.p_f.C_a.av && (!rs.p_k.C_e.a() || rs.p_k.C_e.a() && C_E_uc.p)) {
                  C_E_uc.a(
                     this.bJ,
                     ba[var2],
                     ba[var3],
                     ba[var4],
                     aZ[var2],
                     aZ[var3],
                     aZ[var4],
                     H != -1 ? H : this.al[var1],
                     H != -1 ? H : this.am[var1],
                     H != -1 ? H : this.an[var1],
                     bd[var18],
                     bd[var22],
                     bd[var26],
                     be[var18],
                     be[var22],
                     be[var26],
                     bf[var18],
                     bf[var22],
                     bf[var26],
                     this.ar[var1],
                     (float)bc[var2],
                     (float)bc[var3],
                     (float)bc[var4]
                  );
               } else {
                  C_E_uc.a(
                     ba[var2],
                     ba[var3],
                     ba[var4],
                     aZ[var2],
                     aZ[var3],
                     aZ[var4],
                     H != -1 ? H : this.al[var1],
                     H != -1 ? H : this.am[var1],
                     H != -1 ? H : this.an[var1],
                     bd[var18],
                     bd[var22],
                     bd[var26],
                     be[var18],
                     be[var22],
                     be[var26],
                     bf[var18],
                     bf[var22],
                     bf[var26],
                     this.ar[var1]
                  );
               }
            } else {
               if (var5 == 3) {
                  int var6 = this.ao[var1] >> 2;
                  int var7 = 0;
                  int var8 = 0;
                  int var9 = 0;
                  if (var6 >= this.aw.length) {
                     boolean var10 = false;
                  } else {
                     var7 = this.aw[var6];
                     var8 = this.ax[var6];
                     var9 = this.ay[var6];
                  }

                  if (!rs.p_f.C_a.av && !rs.p_k.C_e.a()) {
                     if (this.V > 0) {
                        int var30 = C_E_uc.a(this.al[var1], this.S, this.T, this.U, this.V);
                        int var31 = C_E_uc.a(this.am[var1], this.S, this.T, this.U, this.V);
                        int var32 = C_E_uc.a(this.an[var1], this.S, this.T, this.U, this.V);
                        C_E_uc.a(
                           ba[this.ai[var1]],
                           ba[this.aj[var1]],
                           ba[this.ak[var1]],
                           aZ[this.ai[var1]],
                           aZ[this.aj[var1]],
                           aZ[this.ak[var1]],
                           var30,
                           var31,
                           var32
                        );
                     } else {
                        C_E_uc.a(
                           ba[var2],
                           ba[var3],
                           ba[var4],
                           aZ[var2],
                           aZ[var3],
                           aZ[var4],
                           H != -1 ? H : this.al[var1],
                           H != -1 ? H : this.al[var1],
                           H != -1 ? H : this.al[var1],
                           bd[var7],
                           bd[var8],
                           bd[var9],
                           be[var7],
                           be[var8],
                           be[var9],
                           bf[var7],
                           bf[var8],
                           bf[var9],
                           this.ar[var1]
                        );
                     }
                  } else if (this.V > 0) {
                     int var29 = C_E_uc.a(this.al[var1], this.S, this.T, this.U, this.V);
                     int var11 = C_E_uc.a(this.am[var1], this.S, this.T, this.U, this.V);
                     int var12 = C_E_uc.a(this.an[var1], this.S, this.T, this.U, this.V);
                     C_E_uc.a(
                        ba[this.ai[var1]],
                        ba[this.aj[var1]],
                        ba[this.ak[var1]],
                        aZ[this.ai[var1]],
                        aZ[this.aj[var1]],
                        aZ[this.ak[var1]],
                        var29,
                        var11,
                        var12,
                        (float)bc[this.ai[var1]],
                        (float)bc[this.aj[var1]],
                        (float)bc[this.ak[var1]]
                     );
                  } else {
                     C_E_uc.a(
                        ba[var2],
                        ba[var3],
                        ba[var4],
                        aZ[var2],
                        aZ[var3],
                        aZ[var4],
                        H != -1 ? H : this.al[var1],
                        H != -1 ? H : this.al[var1],
                        H != -1 ? H : this.al[var1],
                        bd[var7],
                        bd[var8],
                        bd[var9],
                        be[var7],
                        be[var8],
                        be[var9],
                        bf[var7],
                        bf[var8],
                        bf[var9],
                        this.ar[var1],
                        (float)bc[var2],
                        (float)bc[var3],
                        (float)bc[var4]
                     );
                  }
               }
            }
         }
      }
   }

   private final void r(int var1) {
      if (this.ar == null || this.ar[var1] != 65535) {
         int var2 = C_E_uc.s;
         int var3 = C_E_uc.t;
         int var4 = 0;
         int var5 = this.ai[var1];
         int var6 = this.aj[var1];
         int var7 = this.ak[var1];
         int var8 = bf[var5];
         int var9 = bf[var6];
         int var10 = bf[var7];
         if (var8 >= 50) {
            bn[var4] = aZ[var5];
            bo[var4] = ba[var5];
            bp[var4++] = this.al[var1];
         } else {
            int var11 = bd[var5];
            int var12 = be[var5];
            int var13 = this.al[var1];
            if (var10 >= 50) {
               int var14 = (50 - var8) * bD[var10 - var8];
               bn[var4] = var2 + (var11 + ((bd[var7] - var11) * var14 >> 16) << 9) / 50;
               bo[var4] = var3 + (var12 + ((be[var7] - var12) * var14 >> 16) << 9) / 50;
               bp[var4++] = var13 + ((this.an[var1] - var13) * var14 >> 16);
            }

            if (var9 >= 50) {
               int var34 = (50 - var8) * bD[var9 - var8];
               bn[var4] = var2 + (var11 + ((bd[var6] - var11) * var34 >> 16) << 9) / 50;
               bo[var4] = var3 + (var12 + ((be[var6] - var12) * var34 >> 16) << 9) / 50;
               bp[var4++] = var13 + ((this.am[var1] - var13) * var34 >> 16);
            }
         }

         if (var9 >= 50) {
            bn[var4] = aZ[var6];
            bo[var4] = ba[var6];
            bp[var4++] = this.am[var1];
         } else {
            int var25 = bd[var6];
            int var28 = be[var6];
            int var31 = this.am[var1];
            if (var8 >= 50) {
               int var35 = (50 - var9) * bD[var8 - var9];
               bn[var4] = var2 + (var25 + ((bd[var5] - var25) * var35 >> 16) << 9) / 50;
               bo[var4] = var3 + (var28 + ((be[var5] - var28) * var35 >> 16) << 9) / 50;
               bp[var4++] = var31 + ((this.al[var1] - var31) * var35 >> 16);
            }

            if (var10 >= 50) {
               int var36 = (50 - var9) * bD[var10 - var9];
               bn[var4] = var2 + (var25 + ((bd[var7] - var25) * var36 >> 16) << 9) / 50;
               bo[var4] = var3 + (var28 + ((be[var7] - var28) * var36 >> 16) << 9) / 50;
               bp[var4++] = var31 + ((this.an[var1] - var31) * var36 >> 16);
            }
         }

         if (var10 >= 50) {
            bn[var4] = aZ[var7];
            bo[var4] = ba[var7];
            bp[var4++] = this.an[var1];
         } else {
            int var26 = bd[var7];
            int var29 = be[var7];
            int var32 = this.an[var1];
            if (var9 >= 50) {
               int var37 = (50 - var10) * bD[var9 - var10];
               bn[var4] = var2 + (var26 + ((bd[var6] - var26) * var37 >> 16) << 9) / 50;
               bo[var4] = var3 + (var29 + ((be[var6] - var29) * var37 >> 16) << 9) / 50;
               bp[var4++] = var32 + ((this.am[var1] - var32) * var37 >> 16);
            }

            if (var8 >= 50) {
               int var38 = (50 - var10) * bD[var8 - var10];
               bn[var4] = var2 + (var26 + ((bd[var5] - var26) * var38 >> 16) << 9) / 50;
               bo[var4] = var3 + (var29 + ((be[var5] - var29) * var38 >> 16) << 9) / 50;
               bp[var4++] = var32 + ((this.al[var1] - var32) * var38 >> 16);
            }
         }

         int var27 = bn[0];
         int var30 = bn[1];
         int var33 = bn[2];
         int var39 = bo[0];
         int var15 = bo[1];
         int var16 = bo[2];
         if ((var27 - var30) * (var16 - var15) - (var39 - var15) * (var33 - var30) > 0) {
            C_E_uc.o = false;
            int var17 = var5;
            int var18 = var6;
            int var19 = var7;
            if (var4 == 3) {
               if (var27 < 0 || var30 < 0 || var33 < 0 || var27 > rs.p_l.C_c.n || var30 > rs.p_l.C_c.n || var33 > rs.p_l.C_c.n) {
                  C_E_uc.o = true;
               }

               int var20;
               if (this.ao == null) {
                  var20 = 0;
               } else {
                  var20 = this.ao[var1] & 3;
               }

               if (this.Y != null && this.Y[var1] != -1) {
                  if (this.Z != null && this.Z[var1] != -1) {
                     short var42 = this.Z[var1];
                     var17 = this.aw[var42];
                     var18 = this.ax[var42];
                     var19 = this.ay[var42];
                  }

                  if (this.an[var1] == -1) {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        this.al[var1],
                        this.al[var1],
                        this.al[var1],
                        bd[var17],
                        bd[var18],
                        bd[var19],
                        be[var17],
                        be[var18],
                        be[var19],
                        bf[var17],
                        bf[var18],
                        bf[var19],
                        this.Y[var1],
                        (float)bc[var5],
                        (float)bc[var6],
                        (float)bc[var7]
                     );
                  } else {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        bp[0],
                        bp[1],
                        bp[2],
                        bd[var17],
                        bd[var18],
                        bd[var19],
                        be[var17],
                        be[var18],
                        be[var19],
                        bf[var17],
                        bf[var18],
                        bf[var19],
                        this.Y[var1],
                        (float)bc[var5],
                        (float)bc[var6],
                        (float)bc[var7]
                     );
                  }
               } else if (var20 == 0) {
                  if (rs.p_f.C_a.av) {
                     C_E_uc.a(var39, var15, var16, var27, var30, var33, bp[0], bp[1], bp[2], -1.0F, -1.0F, -1.0F);
                  } else {
                     C_E_uc.a(var39, var15, var16, var27, var30, var33, bp[0], bp[1], bp[2]);
                  }
               } else if (var20 == 1) {
                  if (rs.p_f.C_a.av) {
                     C_E_uc.a(var39, var15, var16, var27, var30, var33, bC[this.al[var1]], -1.0F, -1.0F, -1.0F);
                  } else {
                     C_E_uc.a(var39, var15, var16, var27, var30, var33, bC[this.al[var1]]);
                  }
               } else if (var20 == 2) {
                  int var21 = this.ao[var1] >> 2;
                  int var22 = this.aw[var21];
                  int var23 = this.ax[var21];
                  int var24 = this.ay[var21];
                  if (rs.p_f.C_a.av) {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        bp[0],
                        bp[1],
                        bp[2],
                        bd[var22],
                        bd[var23],
                        bd[var24],
                        be[var22],
                        be[var23],
                        be[var24],
                        bf[var22],
                        bf[var23],
                        bf[var24],
                        this.ar[var1],
                        (float)bc[var5],
                        (float)bc[var6],
                        (float)bc[var7]
                     );
                  } else {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        bp[0],
                        bp[1],
                        bp[2],
                        bd[var22],
                        bd[var23],
                        bd[var24],
                        be[var22],
                        be[var23],
                        be[var24],
                        bf[var22],
                        bf[var23],
                        bf[var24],
                        this.ar[var1]
                     );
                  }
               } else if (var20 == 3) {
                  int var41 = this.ao[var1] >> 2;
                  int var47 = this.aw[var41];
                  int var50 = this.ax[var41];
                  int var53 = this.ay[var41];
                  if (rs.p_f.C_a.av) {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        this.al[var1],
                        this.al[var1],
                        this.al[var1],
                        bd[var47],
                        bd[var50],
                        bd[var53],
                        be[var47],
                        be[var50],
                        be[var53],
                        bf[var47],
                        bf[var50],
                        bf[var53],
                        this.ar[var1],
                        (float)bc[var5],
                        (float)bc[var6],
                        (float)bc[var7]
                     );
                  } else {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        this.al[var1],
                        this.al[var1],
                        this.al[var1],
                        bd[var47],
                        bd[var50],
                        bd[var53],
                        be[var47],
                        be[var50],
                        be[var53],
                        bf[var47],
                        bf[var50],
                        bf[var53],
                        this.ar[var1]
                     );
                  }
               }
            }

            if (var4 == 4) {
               if (var27 < 0
                  || var30 < 0
                  || var33 < 0
                  || var27 > rs.p_l.C_c.n
                  || var30 > rs.p_l.C_c.n
                  || var33 > rs.p_l.C_c.n
                  || bn[3] < 0
                  || bn[3] > rs.p_l.C_c.n) {
                  C_E_uc.o = true;
               }

               int var40;
               if (this.ao == null) {
                  var40 = 0;
               } else {
                  var40 = this.ao[var1] & 3;
               }

               if (this.Y != null && this.Y[var1] != -1) {
                  if (this.Z != null && this.Z[var1] != -1) {
                     short var46 = this.Z[var1];
                     var17 = this.aw[var46];
                     var18 = this.ax[var46];
                     var19 = this.ay[var46];
                  }

                  if (this.an[var1] != -1) {
                     C_E_uc.a(
                        var39,
                        var15,
                        var16,
                        var27,
                        var30,
                        var33,
                        bp[0],
                        bp[1],
                        bp[2],
                        bd[var17],
                        bd[var18],
                        bd[var19],
                        be[var17],
                        be[var18],
                        be[var19],
                        bf[var17],
                        bf[var18],
                        bf[var19],
                        this.Y[var1],
                        (float)bc[var5],
                        (float)bc[var6],
                        (float)bc[var7]
                     );
                     C_E_uc.a(
                        var39,
                        var16,
                        bo[3],
                        var27,
                        var33,
                        bn[3],
                        bp[0],
                        bp[2],
                        bp[3],
                        bd[var17],
                        bd[var18],
                        bd[var19],
                        be[var17],
                        be[var18],
                        be[var19],
                        bf[var17],
                        bf[var18],
                        bf[var19],
                        this.Y[var1],
                        (float)bc[var5],
                        (float)bc[var6],
                        (float)bc[var7]
                     );
                     return;
                  }

                  C_E_uc.a(
                     var39,
                     var15,
                     var16,
                     var27,
                     var30,
                     var33,
                     this.al[var1],
                     this.al[var1],
                     this.al[var1],
                     bd[var17],
                     bd[var18],
                     bd[var19],
                     be[var17],
                     be[var18],
                     be[var19],
                     bf[var17],
                     bf[var18],
                     bf[var19],
                     this.Y[var1],
                     (float)bc[var5],
                     (float)bc[var6],
                     (float)bc[var7]
                  );
                  C_E_uc.a(
                     var39,
                     var16,
                     bo[3],
                     var27,
                     var33,
                     bn[3],
                     this.al[var1],
                     this.al[var1],
                     this.al[var1],
                     bd[var17],
                     bd[var18],
                     bd[var19],
                     be[var17],
                     be[var18],
                     be[var19],
                     bf[var17],
                     bf[var18],
                     bf[var19],
                     this.Y[var1],
                     (float)bc[var5],
                     (float)bc[var6],
                     (float)bc[var7]
                  );
               } else {
                  if (var40 == 0) {
                     if (rs.p_f.C_a.av) {
                        C_E_uc.a(var39, var15, var16, var27, var30, var33, bp[0], bp[1], bp[2], -1.0F, -1.0F, -1.0F);
                        C_E_uc.a(var39, var16, bo[3], var27, var33, bn[3], bp[0], bp[2], bp[3], (float)bc[var5], (float)bc[var6], (float)bc[var7]);
                     } else {
                        C_E_uc.a(var39, var15, var16, var27, var30, var33, bp[0], bp[1], bp[2]);
                        C_E_uc.a(var39, var16, bo[3], var27, var33, bn[3], bp[0], bp[2], bp[3]);
                     }

                     return;
                  }

                  if (var40 == 1) {
                     int var45 = bC[this.al[var1]];
                     if (rs.p_f.C_a.av) {
                        C_E_uc.a(var39, var15, var16, var27, var30, var33, var45, -1.0F, -1.0F, -1.0F);
                        C_E_uc.a(var39, var16, bo[3], var27, var33, bn[3], var45, (float)bc[var5], (float)bc[var6], (float)bc[var7]);
                     } else {
                        C_E_uc.a(var39, var15, var16, var27, var30, var33, var45);
                        C_E_uc.a(var39, var16, bo[3], var27, var33, bn[3], var45);
                     }

                     return;
                  }

                  if (var40 == 2) {
                     int var44 = this.ao[var1] >> 2;
                     int var49 = this.aw[var44];
                     int var52 = this.ax[var44];
                     int var55 = this.ay[var44];
                     if (rs.p_f.C_a.av) {
                        C_E_uc.a(
                           var39,
                           var15,
                           var16,
                           var27,
                           var30,
                           var33,
                           bp[0],
                           bp[1],
                           bp[2],
                           bd[var49],
                           bd[var52],
                           bd[var55],
                           be[var49],
                           be[var52],
                           be[var55],
                           bf[var49],
                           bf[var52],
                           bf[var55],
                           this.ar[var1],
                           (float)bc[var5],
                           (float)bc[var6],
                           (float)bc[var7]
                        );
                        C_E_uc.a(
                           var39,
                           var16,
                           bo[3],
                           var27,
                           var33,
                           bn[3],
                           bp[0],
                           bp[2],
                           bp[3],
                           bd[var49],
                           bd[var52],
                           bd[var55],
                           be[var49],
                           be[var52],
                           be[var55],
                           bf[var49],
                           bf[var52],
                           bf[var55],
                           this.ar[var1],
                           (float)bc[var5],
                           (float)bc[var6],
                           (float)bc[var7]
                        );
                     } else {
                        C_E_uc.a(
                           var39,
                           var15,
                           var16,
                           var27,
                           var30,
                           var33,
                           bp[0],
                           bp[1],
                           bp[2],
                           bd[var49],
                           bd[var52],
                           bd[var55],
                           be[var49],
                           be[var52],
                           be[var55],
                           bf[var49],
                           bf[var52],
                           bf[var55],
                           this.ar[var1]
                        );
                        C_E_uc.a(
                           var39,
                           var16,
                           bo[3],
                           var27,
                           var33,
                           bn[3],
                           bp[0],
                           bp[2],
                           bp[3],
                           bd[var49],
                           bd[var52],
                           bd[var55],
                           be[var49],
                           be[var52],
                           be[var55],
                           bf[var49],
                           bf[var52],
                           bf[var55],
                           this.ar[var1]
                        );
                     }

                     return;
                  }

                  if (var40 == 3) {
                     int var43 = this.ao[var1] >> 2;
                     int var48 = this.aw[var43];
                     int var51 = this.ax[var43];
                     int var54 = this.ay[var43];
                     if (rs.p_f.C_a.av) {
                        C_E_uc.a(
                           var39,
                           var15,
                           var16,
                           var27,
                           var30,
                           var33,
                           this.al[var1],
                           this.al[var1],
                           this.al[var1],
                           bd[var48],
                           bd[var51],
                           bd[var54],
                           be[var48],
                           be[var51],
                           be[var54],
                           bf[var48],
                           bf[var51],
                           bf[var54],
                           this.ar[var1],
                           (float)bc[var5],
                           (float)bc[var6],
                           (float)bc[var7]
                        );
                        C_E_uc.a(
                           var39,
                           var16,
                           bo[3],
                           var27,
                           var33,
                           bn[3],
                           this.al[var1],
                           this.al[var1],
                           this.al[var1],
                           bd[var48],
                           bd[var51],
                           bd[var54],
                           be[var48],
                           be[var51],
                           be[var54],
                           bf[var48],
                           bf[var51],
                           bf[var54],
                           this.ar[var1],
                           (float)bc[var5],
                           (float)bc[var6],
                           (float)bc[var7]
                        );
                     } else {
                        C_E_uc.a(
                           var39,
                           var15,
                           var16,
                           var27,
                           var30,
                           var33,
                           this.al[var1],
                           this.al[var1],
                           this.al[var1],
                           bd[var48],
                           bd[var51],
                           bd[var54],
                           be[var48],
                           be[var51],
                           be[var54],
                           bf[var48],
                           bf[var51],
                           bf[var54],
                           this.ar[var1]
                        );
                        C_E_uc.a(
                           var39,
                           var16,
                           bo[3],
                           var27,
                           var33,
                           bn[3],
                           this.al[var1],
                           this.al[var1],
                           this.al[var1],
                           bd[var48],
                           bd[var51],
                           bd[var54],
                           be[var48],
                           be[var51],
                           be[var54],
                           bf[var48],
                           bf[var51],
                           bf[var54],
                           this.ar[var1]
                        );
                     }
                  }
               }
            }
         }
      }
   }

   private final boolean b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if (var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else {
         return var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8;
      }
   }

   public void m(int var1) {
      this.P = var1;
   }

   public int r() {
      return this.P;
   }

   public void n(int var1) {
      this.Q = var1;
   }

   public void o(int var1) {
      this.R = var1;
   }

   public int s() {
      return this.R;
   }

   public int t() {
      return this.Q;
   }

   public int u() {
      return this.aD;
   }

   public int v() {
      return this.aG;
   }

   public int w() {
      return this.aF;
   }

   public static void e(boolean var0) {
      bE = var0;
   }

   public int x() {
      return this.bI;
   }

   public HashMap<Integer, rs.p_runelite.p_a.C_a> y() {
      return this.bH;
   }

   public rs.p_runelite.p_a.C_a p(int var1) {
      this.l(var1);
      this.bI = var1;
      return this.y().get(this.bI);
   }

   public int z() {
      return this.ad;
   }

   public int[] A() {
      return this.ae;
   }

   public int[] B() {
      return this.af;
   }

   public int[] C() {
      return this.ag;
   }

   public int[] D() {
      return this.ai;
   }

   public int[] E() {
      return this.aj;
   }

   public int[] F() {
      return this.ak;
   }

   public int G() {
      return this.ah;
   }

   public int[] H() {
      return this.aq;
   }
}
