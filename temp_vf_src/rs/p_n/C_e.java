package rs.p_n;

import rs.C_Client_mc;
import rs.C_O_uc;
import rs.p_a.C_h;
import rs.p_d.C_k;
import rs.p_l.C_E_uc;
import rs.p_l.C_F_uc;
import rs.p_l.C_K_uc;
import rs.p_n.p_c.C_aD_mc;
import rs.p_x.C_f;

public class C_e {
   public static int[] h = new int[]{
      4041, 4077, 4113, 4047, 4083, 4119, 4053, 4089, 4125, 4059, 4095, 4131, 4065, 4101, 4137, 4071, 4107, 4143, 4154, 12168, 13918
   };
   private int a;
   public C_F_uc i;
   public C_F_uc j;
   public String k;
   public boolean l;
   public boolean m;
   public static final rs.C_F_uc n = new rs.C_F_uc(50);
   public int o = -1;
   public int p = -1;
   public int q = -1;
   public int r = -1;
   public int s = 0;
   public boolean t = true;
   public static C_f u;
   public boolean v;
   public int w;
   public int x;
   public int y;
   public int z;
   public int A;
   public int B;
   public int C = Integer.MAX_VALUE;
   public int D = Integer.MAX_VALUE;
   public C_F_uc E;
   public int F;
   public C_F_uc[] G;
   public static C_e[] H;
   public int[] I;
   public int J;
   public int[] K;
   public int L;
   public int M;
   public String N;
   public int O;
   public int P;
   public String Q;
   public String R;
   public boolean S;
   public boolean T;
   public boolean U;
   public int V;
   public String[] W;
   public int[][] X;
   public boolean Y;
   public String Z;
   public String aa;
   public int ab;
   public int ac;
   public int ad;
   public int ae;
   public int af;
   public boolean ag;
   public int ah;
   public int ai;
   private static rs.C_F_uc b;
   private static rs.C_F_uc c;
   public int aj;
   public int ak;
   public int[] al;
   public int[] am;
   public boolean an;
   public C_K_uc ao;
   public int ap;
   public int[] aq;
   public int ar;
   public int[] as;
   public String at;
   public String au;
   public boolean av;
   public int aw;
   public int[] ax;
   public String[] ay;
   public int[] az;
   public boolean aA = false;
   public int aB = 0;
   public byte aC;
   private int d;
   private int e;
   public int aD;
   public int aE;
   public boolean aF;
   public C_F_uc aG;
   public int aH;
   public int aI;
   public int aJ;
   public boolean aK;
   public int aL = 0;
   public int aM = 0;
   public int aN = 0;
   public static final rs.C_F_uc aO = new rs.C_F_uc(30);
   public int aP;
   public boolean aQ;
   public int aR;
   public boolean aS;
   public int aT;
   public int aU;
   public int aV;
   public int aW = 128;
   public int aX = 128;
   public boolean aY = false;
   public boolean aZ = false;
   public int ba;
   public int bb;
   public int[] bc;
   public int bd;
   public boolean be;
   public boolean bf = true;
   public boolean bg = true;
   public boolean bh;
   public byte bi;
   public int bj;
   public int[] bk;
   public int[] bl;
   public boolean bm;
   public boolean bn = true;
   public boolean bo = false;
   public boolean bp = false;
   public int bq;
   public int br = 0;
   public short bs = 0;
   public short bt = 0;
   public int bu = 0;
   public boolean bv = false;
   public boolean bw = false;
   public boolean bx = false;
   public String by = null;
   public boolean bz = false;
   public int bA;
   public int bB;
   public int bC;
   public int bD = 32;
   public boolean bE;
   public boolean bF = false;
   public rs.p_n.p_b.p_a.C_b bG = null;
   public rs.p_n.p_b.p_a.C_b bH = null;

   public void a(int var1, int var2) {
      int var3 = this.az[var1];
      this.az[var1] = this.az[var2];
      this.az[var2] = var3;
      var3 = this.ax[var1];
      this.ax[var1] = this.ax[var2];
      this.ax[var2] = var3;
   }

   public static void a(C_f var0, C_K_uc[] var1, C_f var2) {
      b = new rs.C_F_uc(50000);
      c = new rs.C_F_uc(25000);
      rs.p_x.C_e var3 = new rs.p_x.C_e(var0.a("data"));
      int var4 = -1;
      int var5 = var3.A();
      H = new C_e[var5 + 70000];

      while (var3.h < var3.g.length) {
         int var6 = var3.A();
         if (var6 == 65535) {
            var4 = var3.A();
            var6 = var3.A();
         }

         C_e var7 = H[var6] = new C_e();
         var7.aw = var6;
         var7.ah = var4;
         var7.aI = var3.y();
         var7.M = var3.y();
         var7.J = var3.A();
         var7.P = var3.A();
         var7.aR = var3.A();
         var7.aC = (byte)var3.y();
         var7.ab = var3.y();
         if (var7.ab != 0) {
            var7.ab = (var7.ab - 1 << 8) + var3.y();
         } else {
            var7.ab = -1;
         }

         int var8 = var3.y();
         if (var8 > 0) {
            var7.aq = new int[var8];
            var7.I = new int[var8];

            for (int var9 = 0; var9 < var8; var9++) {
               var7.aq[var9] = var3.y();
               var7.I[var9] = var3.A();
            }
         }

         int var15 = var3.y();
         if (var15 > 0) {
            var7.X = new int[var15][];

            for (int var10 = 0; var10 < var15; var10++) {
               int var11 = var3.A();
               var7.X[var10] = new int[var11];

               for (int var12 = 0; var12 < var11; var12++) {
                  var7.X[var10][var12] = var3.A();
               }
            }
         }

         if (var7.aI == 0) {
            var7.v = false;
            var7.aH = var3.A();
            var7.aQ = var3.y() == 1;
            int var16 = var3.A();
            var7.al = new int[var16];
            var7.am = new int[var16];
            var7.bc = new int[var16];

            for (int var27 = 0; var27 < var16; var27++) {
               var7.al[var27] = var3.A();
               var7.am[var27] = var3.B();
               var7.bc[var27] = var3.B();
            }
         }

         if (var7.aI == 1) {
            var3.A();
            var3.y();
         }

         if (var7.aI == 2) {
            var7.az = new int[var7.P * var7.aR];
            var7.ax = new int[var7.P * var7.aR];
            var7.aF = var3.y() == 1;
            var7.av = var3.y() == 1;
            var7.an = var3.y() == 1;
            var7.ag = var3.y() == 1;
            var7.ac = var3.y();
            var7.ap = var3.y();
            var7.K = new int[20];
            var7.as = new int[20];
            var7.G = new C_F_uc[20];

            for (int var17 = 0; var17 < 20; var17++) {
               int var28 = var3.y();
               if (var28 == 1) {
                  var7.K[var17] = var3.B();
                  var7.as[var17] = var3.B();
                  String var32 = var3.F();
                  if (var2 != null && var32.length() > 0) {
                     int var13 = var32.lastIndexOf(",");
                     var7.G[var17] = a(Integer.parseInt(var32.substring(var13 + 1)), var2, var32.substring(0, var13));
                  }
               }
            }

            var7.W = new String[6];

            for (int var18 = 0; var18 < 5; var18++) {
               var7.W[var18] = var3.F();
               if (var7.W[var18].length() == 0) {
                  var7.W[var18] = null;
               }

               if (var7.ah == 3824) {
                  var7.W[4] = "Buy 100";
                  var7.W[5] = "Buy 1000";
               }

               if (var7.ah == 1644) {
                  var7.W[2] = "Operate";
               }
            }
         }

         if (var7.aI == 3) {
            var7.Y = var3.y() == 1;
         }

         if (var7.aI == 4 || var7.aI == 1) {
            var7.S = var3.y() == 1;
            int var19 = var3.y();
            if (var1 != null) {
               var7.ao = var1[var19];
            }

            var7.aS = var3.y() == 1;
         }

         if (var7.aI == 4) {
            var7.at = var3.F();
            var7.Z = var3.F();
         }

         if (var7.aI == 1 || var7.aI == 3 || var7.aI == 4) {
            var7.ad = var3.D();
         }

         if (var7.aI == 3 || var7.aI == 4) {
            var7.O = var3.D();
            var7.L = var3.D();
            var7.ak = var3.D();
         }

         if (var7.aI == 5) {
            var7.v = false;
            String var20 = var3.F();
            if (var2 != null && var20.length() > 0) {
               int var29 = var20.lastIndexOf(",");
               var7.E = a(Integer.parseInt(var20.substring(var29 + 1)), var2, var20.substring(0, var29));
            }

            var20 = var3.F();
            if (var2 != null && var20.length() > 0) {
               int var30 = var20.lastIndexOf(",");
               var7.aG = a(Integer.parseInt(var20.substring(var30 + 1)), var2, var20.substring(0, var30));
            }
         }

         if (var7.aI == 6) {
            int var22 = var3.y();
            if (var22 != 0) {
               var7.ae = 1;
               var7.af = (var22 - 1 << 8) + var3.y();
            }

            var22 = var3.y();
            if (var22 != 0) {
               var7.d = 1;
               var7.e = (var22 - 1 << 8) + var3.y();
            }

            var22 = var3.y();
            if (var22 != 0) {
               var7.aD = (var22 - 1 << 8) + var3.y();
            } else {
               var7.aD = -1;
            }

            var22 = var3.y();
            if (var22 != 0) {
               var7.aE = (var22 - 1 << 8) + var3.y();
            } else {
               var7.aE = -1;
            }

            var7.aT = var3.A();
            var7.aU = var3.A();
            var7.aV = var3.A();
         }

         if (var7.aI == 7) {
            var7.az = new int[var7.P * var7.aR];
            var7.ax = new int[var7.P * var7.aR];
            var7.S = var3.y() == 1;
            int var26 = var3.y();
            if (var1 != null) {
               var7.ao = var1[var26];
            }

            var7.aS = var3.y() == 1;
            var7.ad = var3.D();
            var7.ac = var3.B();
            var7.ap = var3.B();
            var7.av = var3.y() == 1;
            var7.W = new String[5];

            for (int var31 = 0; var31 < 5; var31++) {
               var7.W[var31] = var3.F();
               if (var7.W[var31].length() == 0) {
                  var7.W[var31] = null;
               }
            }
         }

         if (var7.M == 2 || var7.aI == 2) {
            var7.R = var3.F();
            var7.N = var3.F();
            var7.ai = var3.A();
         }

         if (var7.aI == 8) {
            var7.at = var3.F();
         }

         if (var7.M == 1 || var7.M == 4 || var7.M == 5 || var7.M == 6) {
            var7.Q = var3.F();
            if (var7.Q.length() == 0) {
               if (var7.M == 1) {
                  var7.Q = "Ok";
               }

               if (var7.M == 4) {
                  var7.Q = "Select";
               }

               if (var7.M == 5) {
                  var7.Q = "Select";
               }

               if (var7.M == 6) {
                  var7.Q = "Continue";
               }
            }
         }

         if (var7.at != null) {
            var7.at = var7.at.replace("Runescape", rs.p_f.C_a.A);
            var7.at = var7.at.replace("RuneScape", rs.p_f.C_a.A);
            var7.at = var7.at.replace("runescape", rs.p_f.C_a.A.toLowerCase());
         }
      }

      u = var0;
      C_d.a(var0, var1);
      b = null;
      c = null;

      for (int var14 = 15239; var14 <= 15244; var14++) {
         H[var14].ao = var1[0];
         H[var14].S = true;
      }

      H[15239].at = " @gre@Random player";
      H[15240].at = " Mountain";
      H[15241].at = " Trinity Outpost";
      H[15242].at = " M. Settlement";
      H[15243].at = " Debtor Hideout";
   }

   public static void a(int var0, String var1, C_K_uc[] var2, int var3, int var4, boolean var5) {
      C_e var6 = H[var0] = new C_e();
      if (var5) {
         var6.S = true;
      }

      var6.aS = true;
      var6.ao = var2[var3];
      var6.at = var1;
      var6.ad = var4;
      var6.aw = var0;
      var6.aI = 4;
   }

   public static void b(int var0, int var1) {
      C_e var2 = H[var0] = new C_e();
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.P = 26;
      var2.aR = 34;
      var2.aC = 0;
      var2.ab = 0;
      var2.E = j(var1, "Interfaces/Skill");
      var2.aG = j(var1, "Interfaces/Skill");
   }

   public static void b(int var0, String var1) {
      C_e var2 = j(var0);
      var2.ah = var0;
      var2.aI = 0;
      var2.aQ = true;
      var2.ab = -1;
      e(var0 + 1, var1);
      var2.k(1);
      var2.b(0, var0 + 1, 0, 0);
   }

   public static void d() {
      C_e var0 = d(30000);
      var0.Q = "Cast @gre@Lunar Home Teleport";
      var0.aw = 30000;
      var0.ah = 30000;
      var0.aI = 5;
      var0.M = 5;
      var0.J = 0;
      var0.aC = 0;
      var0.ab = 30001;
      var0.E = j(1, "lunar/SPRITE");
      var0.P = 20;
      var0.aR = 20;
      C_e var1 = d(30001);
      var1.aQ = true;
      var1.ab = -1;
      a(1, var1);
      a(30002, 0, "SPRITE");
      b(30002, 0, 0, 0, var1);
   }

   public static void a(int var0, String var1, int var2, int var3) {
      C_e var4 = j(var0);
      var4.aw = var0;
      var4.aI = 0;
      var4.aQ = true;
      var4.ab = -1;
      e(var0 + 1, var1);
      var4.k(1);
      var4.b(0, var0 + 1, 0, 0);
      var4.aR = var2;
      var4.P = var3;
   }

   public static void a(int var0, int var1, int var2, String var3, String var4, int var5, int var6, int var7) {
      C_e var8 = j(var0);
      var8.ah = var0;
      var8.aw = var0;
      var8.aI = 5;
      var8.M = var6;
      var8.J = 0;
      var8.aC = 0;
      var8.ab = -1;
      var8.aq = new int[1];
      var8.I = new int[1];
      var8.aq[0] = 1;
      var8.I[0] = var5;
      var8.X = new int[1][3];
      var8.X[0][0] = 5;
      var8.X[0][1] = var7;
      var8.X[0][2] = 0;
      var8.E = j(var1, var3);
      var8.aG = j(var2, var3);
      var8.P = var8.E.n;
      var8.aR = var8.E.o;
      var8.Q = var4;
   }

   public static void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      String var5,
      int var6,
      int var7,
      int var8,
      int var9,
      String var10,
      int var11,
      int var12,
      int var13,
      String var14,
      int var15,
      String var16,
      String var17,
      int var18,
      int var19
   ) {
      C_e var20 = j(var0);
      var20.aw = var0;
      var20.ah = var0;
      var20.aI = 5;
      var20.M = var1;
      var20.J = 0;
      var20.aC = 0;
      var20.ab = var2;
      var20.E = j(var3, var5);
      var20.aG = j(var4, var5);
      var20.P = var6;
      var20.Q = var10;
      var20.aR = var7;
      var20.aq = new int[1];
      var20.I = new int[1];
      var20.aq[0] = 1;
      var20.I[0] = var9;
      var20.X = new int[1][3];
      var20.X[0][0] = 5;
      var20.X[0][1] = var8;
      var20.X[0][2] = 0;
      var20 = j(var2);
      var20.ah = var2;
      var20.aw = var2;
      var20.aI = 0;
      var20.M = 0;
      var20.P = 550;
      var20.aR = 334;
      var20.aQ = true;
      var20.ab = -1;
      a(var11, var12, var13, var14, var9, var8);
      a(var15, var0, var16, var17, var9, var8);
      a(2, var20);
      b(var11, 15, 60, 0, var20);
      b(var15, var18, var19, 1, var20);
   }

   public static void a(int var0, int var1, String var2, String var3, int var4, int var5) {
      C_e var6 = j(var0);
      var6.aw = var0;
      var6.ah = var1;
      var6.ao = C_Client_mc.bk[0];
      var6.aI = 8;
      var6.Z = var2;
      var6.at = var3;
      var6.aq = new int[1];
      var6.I = new int[1];
      var6.aq[0] = 1;
      var6.I[0] = var4;
      var6.X = new int[1][3];
      var6.X[0][0] = 5;
      var6.X[0][1] = var5;
      var6.X[0][2] = 0;
   }

   public static void a(int var0, int var1, int var2, String var3, int var4, int var5) {
      C_e var6 = j(var0);
      var6.aw = var0;
      var6.ah = var0;
      var6.aI = 5;
      var6.M = 0;
      var6.J = 0;
      var6.P = 512;
      var6.aR = 334;
      var6.aC = 0;
      var6.ab = -1;
      var6.aq = new int[1];
      var6.I = new int[1];
      var6.aq[0] = 1;
      var6.I[0] = var4;
      var6.X = new int[1][3];
      var6.X[0][0] = 5;
      var6.X[0][1] = var5;
      var6.X[0][2] = 0;
      if (var3 == null) {
         var6.q = -1;
         var6.o = var1;
         var6.r = 70;
         var6.p = var2;
      } else {
         var6.E = j(var1, var3);
         var6.aG = j(var2, var3);
      }
   }

   public static void b(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.W = new String[5];
      var1.K = new int[20];
      var1.ax = new int[30];
      var1.az = new int[30];
      var1.as = new int[20];
      var1.al = new int[0];
      var1.am = new int[0];
      var1.bc = new int[0];
      var1.W[0] = "Take 1";
      var1.W[1] = "Take 5";
      var1.W[2] = "Take 10";
      var1.W[3] = "Take All";
      var1.S = false;
      var1.Y = false;
      var1.ag = false;
      var1.an = false;
      var1.av = false;
      var1.aF = true;
      var1.aS = false;
      var1.bj = -1;
      var1.ac = 24;
      var1.ap = 21;
      var1.aR = 5;
      var1.P = 6;
      var1.ah = 40601;
      var1.aw = 40600;
      var1.aI = 2;
   }

   public static void a(C_K_uc[] var0) {
      C_e var1 = j(2700);
      c(2701, 20, "popups/kharazi/SUMMON");
      c(2702);
      a(2703, "popups/kharazi/SPRITE", 1, 21, 21, "Close", 250, 2704, 3);
      a(2704, "popups/kharazi/SPRITE", 3, 21, 21, 2705);
      var1.k(4);
      var1.b(0, 2701, 90, 14);
      var1.b(1, 2702, 100, 56);
      var1.b(2, 2703, 431, 23);
      var1.b(3, 2704, 431, 23);
      C_e var2 = j(40600);
      b(40601);
      a(40602, "Kharazi storage chest", var0, 2, 16750623, true);
      a(40603, "popups/kharazi/extend", 1, 16, 16, "Extend slots", -1, 40604, 1);
      a(40604, "popups/kharazi/extend", 2, 16, 16, 40605);
      var2.k(7);
      var2.b(0, 2701, 90, 14);
      var2.b(1, 40601, 100, 56);
      var2.b(2, 2703, 431, 23);
      var2.b(3, 2704, 431, 23);
      var2.b(4, 40602, 277, 23);
      var2.b(5, 40603, 428, 64);
      var2.b(6, 40604, 428, 64);
   }

   public static void c(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.W = new String[5];
      var1.K = new int[20];
      var1.ax = new int[30];
      var1.az = new int[30];
      var1.as = new int[20];
      var1.al = new int[0];
      var1.am = new int[0];
      var1.bc = new int[0];
      var1.W[0] = "Take 1";
      var1.W[1] = "Take 5";
      var1.W[2] = "Take 10";
      var1.W[3] = "Take All";
      var1.S = false;
      var1.Y = false;
      var1.ag = false;
      var1.an = false;
      var1.av = false;
      var1.aF = true;
      var1.aS = false;
      var1.bj = -1;
      var1.ac = 24;
      var1.ap = 24;
      var1.aR = 5;
      var1.P = 6;
      var1.ah = 2702;
      var1.aw = 2700;
      var1.aI = 2;
   }

   public static void a(
      int var0,
      int var1,
      int var2,
      int var3,
      String var4,
      int var5,
      int var6,
      String var7,
      int var8,
      int var9,
      String var10,
      int var11,
      String var12,
      int var13,
      int var14
   ) {
      C_e var15 = j(var0);
      var15.aw = var0;
      var15.ah = var0;
      var15.aI = 5;
      var15.M = var1;
      var15.J = 0;
      var15.aC = 0;
      var15.ab = var2;
      var15.E = j(var3, var4);
      var15.P = var5;
      var15.Q = var7;
      var15.aR = var6;
      var15 = j(var2);
      var15.ah = var2;
      var15.aw = var2;
      var15.aI = 0;
      var15.M = 0;
      var15.P = 550;
      var15.aR = 334;
      var15.aQ = true;
      var15.ab = -1;
      a(var8, var9, var9, var10, 0, 0);
      a(1, var15);
      b(var8, 15, 60, 0, var15);
   }

   public static void b(
      int var0,
      int var1,
      int var2,
      int var3,
      String var4,
      int var5,
      int var6,
      String var7,
      int var8,
      int var9,
      String var10,
      int var11,
      String var12,
      int var13,
      int var14
   ) {
      C_e var15 = j(var0);
      var15.aw = var0;
      var15.ah = var0;
      var15.aI = 5;
      var15.M = var1;
      var15.J = 0;
      var15.aC = 0;
      var15.ab = var2;
      var15.E = j(var3, var4);
      var15.P = var5;
      var15.Q = var7;
      var15.aR = var6;
      var15 = j(var2);
      var15.ah = var2;
      var15.aw = var2;
      var15.aI = 0;
      var15.M = 0;
      var15.P = 550;
      var15.aR = 334;
      var15.aQ = true;
      var15.ab = -1;
      a(var8, var9, var9, var10, 0, 0);
      a(1, var15);
      b(var8, 15, 65, 0, var15);
   }

   public static void a(int var0, C_F_uc var1) {
      C_e var2 = H[var0] = new C_e();
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = var1;
      var2.aG = var1;
      var2.P = 512;
      var2.aR = 334;
   }

   public static void a(int var0, Boolean var1, int var2) {
      C_e var3 = H[var0] = new C_e();
      var3.W = new String[5];
      var3.K = new int[20];
      var3.ax = new int[var2];
      var3.az = new int[var2];
      var3.as = new int[20];
      var3.al = new int[0];
      var3.am = new int[0];
      var3.bc = new int[0];
      var3.t = false;
      var3.ac = 24;
      var3.ap = 24;
      var3.aR = 5;
      var3.P = 6;
      var3.ah = 5292;
      var3.aw = var0;
      var3.aI = 2;
   }

   public static void a(int var0, Boolean var1) {
      C_e var2 = H[var0] = new C_e();
      var2.W = new String[5];
      var2.K = new int[20];
      var2.ax = new int[30];
      var2.az = new int[30];
      var2.as = new int[20];
      var2.al = new int[0];
      var2.am = new int[0];
      var2.bc = new int[0];
      var2.t = false;
      var2.ac = 24;
      var2.ap = 24;
      var2.aR = 5;
      var2.P = 6;
      var2.ah = 5292;
      var2.aw = var0;
      var2.aI = 2;
   }

   public static void a(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7, String var8, C_K_uc[] var9, int var10, int var11, int var12
   ) {
      C_e var13 = d(var0);
      var13.aw = var0;
      var13.ah = 1151;
      var13.aI = 5;
      var13.M = var12;
      var13.J = 0;
      var13.ab = var0 + 1;
      var13.ai = var11;
      var13.R = "Cast on";
      var13.P = 20;
      var13.aR = 20;
      var13.Q = "Cast @gre@" + var7;
      var13.N = var7;
      var13.aq = new int[3];
      var13.I = new int[3];
      var13.aq[0] = 3;
      var13.I[0] = var3;
      var13.aq[1] = 3;
      var13.I[1] = var4;
      var13.aq[2] = 3;
      var13.I[2] = var6;
      var13.X = new int[4][];
      var13.X[0] = new int[4];
      var13.X[0][0] = 4;
      var13.X[0][1] = 3214;
      var13.X[0][2] = var1;
      var13.X[0][3] = 0;
      var13.X[1] = new int[4];
      var13.X[1][0] = 4;
      var13.X[1][1] = 3214;
      var13.X[1][2] = var2;
      var13.X[1][3] = 0;
      var13.X[2] = new int[3];
      var13.X[2][0] = 1;
      var13.X[2][1] = 6;
      var13.X[2][2] = 0;
      var13.aG = j(var10, "magic/on");
      var13.E = j(var10, "magic/off");
      C_e var14 = d(var0 + 1);
      var14.aQ = true;
      var14.ab = -1;
      a(7, var14);
      a(var0 + 2, 0, "BOX");
      b(var0 + 2, 0, 0, 0, var14);
      a(var0 + 3, "Level " + (var6 + 1) + ": " + var7, 16750623, true, true, 52, var9, 1);
      b(var0 + 3, 90, 4, 1, var14);
      a(var0 + 4, var8, 11495962, true, true, 52, var9, 0);
      b(var0 + 4, 90, 19, 2, var14);
      b(19200, 14, 35, 3, var14);
      b(var5, 74, 35, 4, var14);
      a(var0 + 5, var3 + 1, var1, var9);
      b(var0 + 5, 26, 66, 5, var14);
      a(var0 + 6, var4 + 1, var2, var9);
      b(var0 + 6, 87, 66, 6, var14);
   }

   public static void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      String var10,
      String var11,
      C_K_uc[] var12,
      int var13,
      int var14,
      int var15
   ) {
      C_e var16 = d(var0);
      var16.aw = var0;
      var16.ah = 1151;
      var16.aI = 5;
      var16.M = var15;
      var16.J = 0;
      var16.ab = var0 + 1;
      var16.ai = var14;
      var16.R = "Cast on";
      var16.P = 20;
      var16.aR = 20;
      var16.Q = "Cast @gre@" + var10;
      var16.N = var10;
      var16.aq = new int[4];
      var16.I = new int[4];
      var16.aq[0] = 3;
      var16.I[0] = var4;
      var16.aq[1] = 3;
      var16.I[1] = var5;
      var16.aq[2] = 3;
      var16.I[2] = var6;
      var16.aq[3] = 3;
      var16.I[3] = var9;
      var16.X = new int[4][];
      var16.X[0] = new int[4];
      var16.X[0][0] = 4;
      var16.X[0][1] = 3214;
      var16.X[0][2] = var1;
      var16.X[0][3] = 0;
      var16.X[1] = new int[4];
      var16.X[1][0] = 4;
      var16.X[1][1] = 3214;
      var16.X[1][2] = var2;
      var16.X[1][3] = 0;
      var16.X[2] = new int[4];
      var16.X[2][0] = 4;
      var16.X[2][1] = 3214;
      var16.X[2][2] = var3;
      var16.X[2][3] = 0;
      var16.X[3] = new int[3];
      var16.X[3][0] = 1;
      var16.X[3][1] = 6;
      var16.X[3][2] = 0;
      var16.aG = j(var13, "magic/on");
      var16.E = j(var13, "magic/off");
      C_e var17 = d(var0 + 1);
      var17.aQ = true;
      var17.ab = -1;
      a(9, var17);
      a(var0 + 2, 0, "BOX");
      b(var0 + 2, 0, 0, 0, var17);
      a(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      b(var0 + 3, 90, 4, 1, var17);
      a(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      b(var0 + 4, 90, 19, 2, var17);
      b(19200, 14, 35, 3, var17);
      b(var7, 74, 35, 4, var17);
      b(var8, 130, 35, 5, var17);
      a(var0 + 5, var4 + 1, var1, var12);
      b(var0 + 5, 26, 66, 6, var17);
      a(var0 + 6, var5 + 1, var2, var12);
      b(var0 + 6, 87, 66, 7, var17);
      a(var0 + 7, var6 + 1, var3, var12);
      b(var0 + 7, 142, 66, 8, var17);
   }

   public static void a(int var0, int var1, String var2) {
      C_e var3 = d(var0);
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 5;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = a(var1, var2);
      var3.P = 500;
      var3.aR = 500;
      var3.Q = "";
   }

   public static void b(int var0, int var1, String var2) {
      C_e var3 = d(var0);
      var3.aI = 5;
      var3.M = 0;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = a(var1, "RUNE");
      var3.P = 500;
      var3.aR = 500;
   }

   public static void b(int var0, int var1, String var2, String var3, int var4, int var5) {
      C_e var6 = H[var0] = new C_e();
      var6.aw = var0;
      var6.ah = var0;
      var6.aI = 5;
      var6.M = var5;
      var6.J = 0;
      var6.aC = 0;
      var6.ab = var4;
      var6.E = j(var1, var2);
      var6.aG = j(var1, var2);
      var6.P = var6.E.n;
      var6.aR = var6.aG.o;
      var6.Q = var3;
      var6.bh = true;
   }

   public static void b(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7, String var8, C_K_uc[] var9, int var10, int var11, int var12
   ) {
      C_e var13 = d(var0);
      var13.aw = var0;
      var13.ah = 1151;
      var13.aI = 5;
      var13.M = var12;
      var13.J = 0;
      var13.ab = var0 + 1;
      var13.ai = var11;
      var13.R = "Cast On";
      var13.P = 20;
      var13.aR = 20;
      var13.Q = "Cast @gre@" + var7;
      var13.N = var7;
      var13.aq = new int[3];
      var13.I = new int[3];
      var13.aq[0] = 3;
      var13.I[0] = var3;
      var13.aq[1] = 3;
      var13.I[1] = var4;
      var13.aq[2] = 3;
      var13.I[2] = var6;
      var13.X = new int[3][];
      var13.X[0] = new int[4];
      var13.X[0][0] = 4;
      var13.X[0][1] = 3214;
      var13.X[0][2] = var1;
      var13.X[0][3] = 0;
      var13.X[1] = new int[4];
      var13.X[1][0] = 4;
      var13.X[1][1] = 3214;
      var13.X[1][2] = var2;
      var13.X[1][3] = 0;
      var13.X[2] = new int[3];
      var13.X[2][0] = 1;
      var13.X[2][1] = 6;
      var13.X[2][2] = 0;
      var13.aG = j(var10, "lunar/LUNARON");
      var13.E = j(var10, "lunar/LUNAROFF");
      C_e var14 = d(var0 + 1);
      var14.aQ = true;
      var14.ab = -1;
      a(7, var14);
      a(var0 + 2, 0, "BOX");
      b(var0 + 2, 0, 0, 0, var14);
      a(var0 + 3, "Level " + (var6 + 1) + ": " + var7, 16750623, true, true, 52, var9, 1);
      b(var0 + 3, 90, 4, 1, var14);
      a(var0 + 4, var8, 11495962, true, true, 52, var9, 0);
      b(var0 + 4, 90, 19, 2, var14);
      b(30016, 37, 35, 3, var14);
      b(var5, 112, 35, 4, var14);
      a(var0 + 5, var3 + 1, var1, var9);
      b(var0 + 5, 50, 66, 5, var14);
      a(var0 + 6, var4 + 1, var2, var9);
      b(var0 + 6, 123, 66, 6, var14);
   }

   public static void a(int var0, int var1, int var2, C_K_uc[] var3) {
      C_e var4 = d(var0);
      var4.aw = var0;
      var4.ah = 1151;
      var4.aI = 4;
      var4.M = 0;
      var4.J = 0;
      var4.P = 0;
      var4.aR = 14;
      var4.aC = 0;
      var4.ab = -1;
      var4.aq = new int[1];
      var4.I = new int[1];
      var4.aq[0] = 3;
      var4.I[0] = var1;
      var4.X = new int[1][4];
      var4.X[0][0] = 4;
      var4.X[0][1] = 3214;
      var4.X[0][2] = var2;
      var4.X[0][3] = 0;
      var4.S = true;
      var4.ao = var3[0];
      var4.aS = true;
      var4.at = "%1/" + var1;
      var4.Z = "";
      var4.ad = 12582912;
      var4.O = 49152;
   }

   public static void a(int var0, int var1, int var2) {
      C_e var3 = j(var0);
      var3.aI = 6;
      var3.ae = 10;
      var3.af = 941;
      rs.p_d.C_d var4 = rs.p_d.C_d.c(var3.af);
      if (var4.r == 1) {
         var3.aT = 1750;
      } else {
         var3.aT = var4.r * 500;
      }

      var3.aK = true;
      var3.aD = var4.w;
      var3.aU = 40;
      var3.aV = 1900;
      var3.aR = var2;
      var3.P = var1;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      C_e var5 = H[var0] = new C_e();
      C_k var6 = C_k.f(var1);
      var5.aU = var6.M;
      var5.aV = var6.Z;
      var5.aI = 6;
      var5.ae = 4;
      var5.af = var1;
      var5.aT = var4;
      var5.P = var2;
      var5.aR = var3;
   }

   public static void b(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      String var10,
      String var11,
      C_K_uc[] var12,
      int var13,
      int var14,
      int var15
   ) {
      C_e var16 = d(var0);
      var16.aw = var0;
      var16.ah = 1151;
      var16.aI = 5;
      var16.M = var15;
      var16.J = 0;
      var16.ab = var0 + 1;
      var16.ai = var14;
      var16.R = "Cast on";
      var16.P = 20;
      var16.aR = 20;
      var16.Q = "Cast @gre@" + var10;
      var16.N = var10;
      var16.aq = new int[4];
      var16.I = new int[4];
      var16.aq[0] = 3;
      var16.I[0] = var4;
      var16.aq[1] = 3;
      var16.I[1] = var5;
      var16.aq[2] = 3;
      var16.I[2] = var6;
      var16.aq[3] = 3;
      var16.I[3] = var9;
      var16.X = new int[4][];
      var16.X[0] = new int[4];
      var16.X[0][0] = 4;
      var16.X[0][1] = 3214;
      var16.X[0][2] = var1;
      var16.X[0][3] = 0;
      var16.X[1] = new int[4];
      var16.X[1][0] = 4;
      var16.X[1][1] = 3214;
      var16.X[1][2] = var2;
      var16.X[1][3] = 0;
      var16.X[2] = new int[4];
      var16.X[2][0] = 4;
      var16.X[2][1] = 3214;
      var16.X[2][2] = var3;
      var16.X[2][3] = 0;
      var16.X[3] = new int[3];
      var16.X[3][0] = 1;
      var16.X[3][1] = 6;
      var16.X[3][2] = 0;
      var16.aG = j(var13, "lunar/LUNARON");
      var16.E = j(var13, "lunar/LUNAROFF");
      C_e var17 = d(var0 + 1);
      var17.aQ = true;
      var17.ab = -1;
      a(9, var17);
      a(var0 + 2, 0, "BOX");
      b(var0 + 2, 0, 0, 0, var17);
      a(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      b(var0 + 3, 90, 4, 1, var17);
      a(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      b(var0 + 4, 90, 19, 2, var17);
      b(30016, 14, 35, 3, var17);
      b(var7, 74, 35, 4, var17);
      b(var8, 130, 35, 5, var17);
      a(var0 + 5, var4 + 1, var1, var12);
      b(var0 + 5, 26, 66, 6, var17);
      a(var0 + 6, var5 + 1, var2, var12);
      b(var0 + 6, 87, 66, 7, var17);
      a(var0 + 7, var6 + 1, var3, var12);
      b(var0 + 7, 142, 66, 8, var17);
   }

   public static void c(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      String var10,
      String var11,
      C_K_uc[] var12,
      int var13,
      int var14,
      int var15
   ) {
      C_e var16 = d(var0);
      var16.aw = var0;
      var16.ah = 1151;
      var16.aI = 5;
      var16.M = var15;
      var16.J = 0;
      var16.ab = var0 + 1;
      var16.ai = var14;
      var16.R = "Cast on";
      var16.P = 20;
      var16.aR = 20;
      var16.Q = "Cast @gre@" + var10;
      var16.N = var10;
      var16.aq = new int[4];
      var16.I = new int[4];
      var16.aq[0] = 3;
      var16.I[0] = var4;
      var16.aq[1] = 3;
      var16.I[1] = var5;
      var16.aq[2] = 3;
      var16.I[2] = var6;
      var16.aq[3] = 3;
      var16.I[3] = var9;
      var16.X = new int[4][];
      var16.X[0] = new int[4];
      var16.X[0][0] = 4;
      var16.X[0][1] = 3214;
      var16.X[0][2] = var1;
      var16.X[0][3] = 0;
      var16.X[1] = new int[4];
      var16.X[1][0] = 4;
      var16.X[1][1] = 3214;
      var16.X[1][2] = var2;
      var16.X[1][3] = 0;
      var16.X[2] = new int[4];
      var16.X[2][0] = 4;
      var16.X[2][1] = 3214;
      var16.X[2][2] = var3;
      var16.X[2][3] = 0;
      var16.X[3] = new int[3];
      var16.X[3][0] = 1;
      var16.X[3][1] = 6;
      var16.X[3][2] = 0;
      var16.aG = j(var13, "magic/on");
      var16.E = j(var13, "magic/off");
      C_e var17 = d(var0 + 1);
      var17.aQ = true;
      var17.ab = -1;
      a(9, var17);
      a(var0 + 2, 0, "BOX");
      b(var0 + 2, 0, 0, 0, var17);
      a(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      b(var0 + 3, 90, 4, 1, var17);
      a(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      b(var0 + 4, 90, 19, 2, var17);
      b(30016, 14, 35, 3, var17);
      b(var7, 74, 35, 4, var17);
      b(var8, 130, 35, 5, var17);
      a(var0 + 5, var4 + 1, var1, var12);
      b(var0 + 5, 26, 66, 6, var17);
      a(var0 + 6, var5 + 1, var2, var12);
      b(var0 + 6, 87, 66, 7, var17);
      a(var0 + 7, var6 + 1, var3, var12);
      b(var0 + 7, 142, 66, 8, var17);
   }

   protected static void a(int var0, int var1, String var2, int var3) {
      C_e var4 = H[var0] = new C_e();
      var4.aw = var0;
      var4.ah = var0;
      var4.aI = 5;
      var4.M = 0;
      var4.J = 0;
      var4.a = (byte)var3;
      var4.bj = 52;
      var4.E = j(var1, var2);
      var4.aG = j(var1, var2);
      var4.P = 512;
      var4.aR = 334;
      var4.v = true;
   }

   public static void d(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      String var10,
      String var11,
      C_K_uc[] var12,
      int var13,
      int var14,
      int var15
   ) {
      C_e var16 = d(var0);
      var16.aw = var0;
      var16.ah = 1151;
      var16.aI = 5;
      var16.M = var15;
      var16.J = 0;
      var16.ab = var0 + 1;
      var16.ai = var14;
      var16.R = "Cast on";
      var16.P = 20;
      var16.aR = 20;
      var16.Q = "Cast @gre@" + var10;
      var16.N = var10;
      var16.aq = new int[4];
      var16.I = new int[4];
      var16.aq[0] = 3;
      var16.I[0] = var4;
      var16.aq[1] = 3;
      var16.I[1] = var5;
      var16.aq[2] = 3;
      var16.I[2] = var6;
      var16.aq[3] = 3;
      var16.I[3] = var9;
      var16.X = new int[4][];
      var16.X[0] = new int[4];
      var16.X[0][0] = 4;
      var16.X[0][1] = 3214;
      var16.X[0][2] = var1;
      var16.X[0][3] = 0;
      var16.X[1] = new int[4];
      var16.X[1][0] = 4;
      var16.X[1][1] = 3214;
      var16.X[1][2] = var2;
      var16.X[1][3] = 0;
      var16.X[2] = new int[4];
      var16.X[2][0] = 4;
      var16.X[2][1] = 3214;
      var16.X[2][2] = var3;
      var16.X[2][3] = 0;
      var16.X[3] = new int[3];
      var16.X[3][0] = 1;
      var16.X[3][1] = 6;
      var16.X[3][2] = 0;
      var16.aG = j(var13, "lunar/LUNARON");
      var16.E = j(var13, "lunar/LUNAROFF");
      C_e var17 = d(var0 + 1);
      var17.aQ = true;
      var17.ab = -1;
      a(9, var17);
      a(var0 + 2, 1, "BOX");
      b(var0 + 2, 0, 0, 0, var17);
      a(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      b(var0 + 3, 90, 4, 1, var17);
      a(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      b(var0 + 4, 90, 21, 2, var17);
      b(30016, 14, 48, 3, var17);
      b(var7, 74, 48, 4, var17);
      b(var8, 130, 48, 5, var17);
      a(var0 + 5, var4 + 1, var1, var12);
      b(var0 + 5, 26, 79, 6, var17);
      a(var0 + 6, var5 + 1, var2, var12);
      b(var0 + 6, 87, 79, 7, var17);
      a(var0 + 7, var6 + 1, var3, var12);
      b(var0 + 7, 142, 79, 8, var17);
   }

   public static void e(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      String var10,
      String var11,
      C_K_uc[] var12,
      int var13,
      int var14,
      int var15
   ) {
      C_e var16 = d(var0);
      var16.aw = var0;
      var16.ah = 1151;
      var16.aI = 5;
      var16.M = var15;
      var16.J = 0;
      var16.ab = var0 + 1;
      var16.ai = var14;
      var16.R = "Cast on";
      var16.P = 20;
      var16.aR = 20;
      var16.Q = "Cast @gre@" + var10;
      var16.N = var10;
      var16.aq = new int[4];
      var16.I = new int[4];
      var16.aq[0] = 3;
      var16.I[0] = var4;
      var16.aq[1] = 3;
      var16.I[1] = var5;
      var16.aq[2] = 3;
      var16.I[2] = var6;
      var16.aq[3] = 3;
      var16.I[3] = var9;
      var16.X = new int[4][];
      var16.X[0] = new int[4];
      var16.X[0][0] = 4;
      var16.X[0][1] = 3214;
      var16.X[0][2] = var1;
      var16.X[0][3] = 0;
      var16.X[1] = new int[4];
      var16.X[1][0] = 4;
      var16.X[1][1] = 3214;
      var16.X[1][2] = var2;
      var16.X[1][3] = 0;
      var16.X[2] = new int[4];
      var16.X[2][0] = 4;
      var16.X[2][1] = 3214;
      var16.X[2][2] = var3;
      var16.X[2][3] = 0;
      var16.X[3] = new int[3];
      var16.X[3][0] = 1;
      var16.X[3][1] = 6;
      var16.X[3][2] = 0;
      var16.aG = j(var13, "lunar/LUNARON");
      var16.E = j(var13, "lunar/LUNAROFF");
      C_e var17 = d(var0 + 1);
      var17.aQ = true;
      var17.ab = -1;
      a(9, var17);
      a(var0 + 2, 2, "BOX");
      b(var0 + 2, 0, 0, 0, var17);
      a(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      b(var0 + 3, 90, 4, 1, var17);
      a(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      b(var0 + 4, 90, 34, 2, var17);
      b(30016, 14, 61, 3, var17);
      b(var7, 74, 61, 4, var17);
      b(var8, 130, 61, 5, var17);
      a(var0 + 5, var4 + 1, var1, var12);
      b(var0 + 5, 26, 92, 6, var17);
      a(var0 + 6, var5 + 1, var2, var12);
      b(var0 + 6, 87, 92, 7, var17);
      a(var0 + 7, var6 + 1, var3, var12);
      b(var0 + 7, 142, 92, 8, var17);
   }

   private static C_F_uc a(int var0, String var1) {
      return j(var0, "/Lunar/" + var1);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, String var5) {
      C_e var6 = H[var0] = new C_e();
      var6.E = d(var1, "");
      if (var2 == var1) {
         var6.aG = d(var1, "a");
      } else {
         var6.aG = d(var2, "");
      }

      var6.Q = var5;
      var6.J = 0;
      var6.M = 1;
      var6.P = var3;
      var6.ab = 52;
      var6.ah = var0;
      var6.aw = var0;
      var6.aI = 5;
      var6.aR = var4;
   }

   public static void a(int var0, int var1, String var2, String var3, int var4, int var5, int var6, int var7) {
      C_e var8 = H[var0] = new C_e();
      var8.aw = var0;
      var8.ah = var0;
      var8.aI = 5;
      var8.M = var5;
      var8.J = 0;
      var8.aC = 0;
      var8.ab = var4;
      var8.E = j(var1, var2);
      var8.aG = j(var1, var2);
      var8.P = var6;
      var8.aR = var7;
      var8.Q = var3;
      var8.bh = true;
   }

   public static void a(int var0, String var1, C_K_uc[] var2, int var3, int var4) {
      C_e var5 = f(var0);
      var5.aw = var0;
      var5.ah = var0;
      var5.aI = 4;
      var5.M = 0;
      var5.P = 174;
      var5.aR = 11;
      var5.J = 0;
      var5.aC = 0;
      var5.ab = -1;
      var5.S = false;
      var5.aS = true;
      var5.ao = var2[var3];
      var5.at = var1;
      var5.Z = "";
      var5.ad = var4;
      var5.O = 0;
      var5.L = 0;
      var5.ak = 0;
   }

   public static void c(int var0, int var1) {
      C_e var2 = H[var0];
      var2.E = d(var1, "");
   }

   public static C_e d(int var0) {
      H[var0] = new C_e();
      H[var0].aw = var0;
      H[var0].ah = var0;
      H[var0].P = 512;
      H[var0].aR = 334;
      return H[var0];
   }

   public static void b(int var0, int var1, int var2) {
      C_e var3 = j(var0);
      var3.aI = 6;
      var3.ae = 10;
      var3.af = 941;
      rs.p_d.C_d var4 = rs.p_d.C_d.c(var3.af);
      if (var4.r == 1) {
         var3.aT = 1750;
      } else {
         var3.aT = var4.r * 500;
      }

      var3.aD = var4.w;
      var3.aU = 40;
      var3.aV = 1900;
      var3.aR = var2;
      var3.P = var1;
   }

   public static void d(int var0, int var1) {
      C_e var2 = j(var0);
      var2.aI = 21;
      var2.af = 941;
      var2.aR = var1;
      var2.P = var1;
   }

   public static void a(int var0, int var1, int var2, int var3, C_e var4) {
      var4.al[var0] = var1;
      var4.am[var0] = var2;
      var4.bc[var0] = var3;
   }

   public static void a(int var0, int var1, int var2, boolean var3, int var4, int var5, String var6) {
      C_e var7 = H[var0] = new C_e();
      var7.bd = var2;
      var7.be = var3;
      var7.aw = var0;
      var7.ah = var0;
      var7.aI = 3;
      var7.M = 5;
      var7.J = 0;
      var7.bi = (byte)var1;
      var7.P = var4;
      var7.aR = var5;
      var7.Q = "Build " + var6;
   }

   public static void e(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.W = new String[5];
      var1.W = new String[]{"Build", null, null, null, null};
      var1.K = new int[20];
      var1.ax = new int[30];
      var1.az = new int[30];
      var1.as = new int[20];
      var1.al = new int[0];
      var1.am = new int[0];
      var1.bc = new int[0];
      var1.be = false;
      var1.an = false;
      var1.av = false;
      var1.ac = 164;
      var1.ap = 37;
      var1.aI = 2;
      var1.ah = 39982;
      var1.aw = 39980;
      var1.P = 2;
      var1.aR = 4;
   }

   public static void b(int var0, int var1, int var2, int var3, int var4) {
      C_e var5 = d(var0);
      var5.P = var1;
      var5.aR = var2;
      var5.az = new int[var1 * var2];
      var5.ax = new int[var1 * var2];
      var5.an = false;
      var5.av = false;
      var5.ac = var3;
      var5.ap = var4;
      var5.K = new int[20];
      var5.as = new int[20];
      var5.G = new C_F_uc[20];
      var5.aI = 2;
   }

   public static void c(int var0, int var1, int var2) {
      a(var0, var1, 0, var2);
   }

   public static void a(int var0, int var1, int var2, int var3) {
      C_e var4 = j(var0);
      if (var1 != 0) {
         var4.aI = 20;
         var4.af = var1;
         var4.aR = var3;
         var4.P = var3;
         var4.bq = var2;
      }
   }

   public static void a(int var0, String var1, String var2, C_K_uc[] var3, int var4, int var5, boolean var6, boolean var7, int var8) {
      C_e var9 = d(var0);
      var9.aw = var0;
      var9.ah = var0;
      var9.aI = 4;
      var9.M = 1;
      var9.P = var8;
      var9.aR = 11;
      var9.J = 0;
      var9.aC = 0;
      var9.ab = -1;
      var9.S = var6;
      var9.aS = var7;
      var9.ao = var3[var4];
      var9.at = var1;
      var9.Z = "";
      var9.ad = var5;
      var9.O = 0;
      var9.L = 16777215;
      var9.ak = 0;
      var9.Q = var2;
   }

   public static void b(int var0, String var1, String var2, C_K_uc[] var3, int var4, int var5, boolean var6, boolean var7, int var8) {
      C_e var9 = d(var0);
      var9.aw = var0;
      var9.ah = var0;
      var9.aI = 4;
      var9.M = 1;
      var9.P = var8;
      var9.aR = 11;
      var9.J = 0;
      var9.aC = 0;
      var9.ab = -1;
      var9.S = var6;
      var9.aS = var7;
      var9.ao = var3[var4];
      var9.at = var1;
      var9.Z = "";
      var9.ad = var5;
      var9.O = 0;
      var9.L = 16777215;
      var9.ak = 0;
      var9.Q = var2;
      var9.bo = true;
   }

   public static C_e f(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.aw = var0;
      var1.ah = var0;
      var1.aI = 0;
      var1.M = 0;
      var1.J = 0;
      var1.P = 512;
      var1.aR = 334;
      var1.aC = 0;
      var1.ab = 0;
      return var1;
   }

   public static void a(int var0, String var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      C_e var8 = d(var0);
      var8.E = j(var2, var1);
      var8.aG = j(var3, var1);
      var8.I = new int[1];
      var8.I[0] = 1;
      var8.aq = new int[1];
      var8.aq[0] = 1;
      var8.X = new int[1][3];
      var8.X[0][0] = 5;
      var8.X[0][1] = var4;
      var8.X[0][2] = 0;
      var8.M = 4;
      var8.P = var5;
      var8.ab = -1;
      var8.ah = var0;
      var8.aw = var0;
      var8.aI = 5;
      var8.aR = var6;
      var8.Q = var7;
   }

   public static void a(int var0, int var1, int var2, int var3, String var4, int var5, int var6, String var7, int var8, int var9, int var10) {
      C_e var11 = j(var0);
      var11.ah = var1;
      var11.aw = var0;
      var11.aI = 5;
      var11.M = var9;
      var11.J = 0;
      var11.P = var5;
      var11.aR = var6;
      var11.aC = 0;
      var11.ab = -1;
      var11.aq = new int[1];
      var11.I = new int[1];
      var11.aq[0] = 1;
      var11.I[0] = var8;
      var11.X = new int[1][3];
      var11.X[0][0] = 5;
      var11.X[0][1] = var10;
      var11.X[0][2] = 0;
      var11.E = j(var2, var4);
      var11.aG = j(var3, var4);
      var11.Q = var7;
   }

   public static void e(int var0, int var1) {
      rs.p_l.C_c.a(71, var1 - 1, var0 - 2, 7496785, 1);
      rs.p_l.C_c.a(69, var1, var0 + 174, 7496785, 1);
      rs.p_l.C_c.a(1, var1 - 2, var0 - 2, 7496785, 178);
      rs.p_l.C_c.a(1, var1 + 68, var0, 7496785, 174);
      rs.p_l.C_c.a(71, var1 - 1, var0 - 1, 3025699, 1);
      rs.p_l.C_c.a(71, var1 - 1, var0 + 175, 3025699, 1);
      rs.p_l.C_c.a(1, var1 - 1, var0, 3025699, 175);
      rs.p_l.C_c.a(1, var1 + 69, var0, 3025699, 175);
      rs.p_l.C_c.d(var0, var1, 174, 68, 0, 220);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, String var5, int var6) {
      C_e var7 = j(var0);
      var7.aw = var0;
      var7.ah = 22500;
      var7.aI = 5;
      var7.M = 4;
      var7.J = 0;
      var7.aC = 0;
      var7.ab = var6;
      var7.E = j(0, "prayer/curses/GLOW");
      var7.aG = j(1, "prayer/curses/GLOW");
      var7.P = 34;
      var7.aR = 34;
      var7.aq = new int[1];
      var7.I = new int[1];
      var7.aq[0] = 1;
      var7.I[0] = var1;
      var7.X = new int[1][3];
      var7.X[0][0] = 5;
      var7.X[0][1] = var2;
      var7.X[0][2] = 0;
      var7.Q = "Activate@or1@ " + var5;
      var7 = j(var0 + 1);
      var7.aw = var0 + 1;
      var7.ah = 22500;
      var7.aI = 5;
      var7.M = 0;
      var7.J = 0;
      var7.aC = 0;
      var7.E = j(var4, "prayer/curses/PRAYON");
      var7.aG = j(var4, "prayer/curses/PRAYOFF");
      var7.P = 34;
      var7.aR = 34;
      var7.aq = new int[1];
      var7.I = new int[1];
      var7.aq[0] = 2;
      var7.I[0] = var3 + 1;
      var7.X = new int[1][3];
      var7.X[0][0] = 2;
      var7.X[0][1] = 5;
      var7.X[0][2] = 0;
   }

   public static void b(int var0, int var1, int var2, int var3, int var4, String var5) {
      C_e var6 = j(var0);
      var6.aw = var0;
      var6.ah = 5608;
      var6.aI = 5;
      var6.M = 4;
      var6.J = 0;
      var6.aC = 0;
      var6.ab = -1;
      var6.E = a(0, "PRAYERGLOW", true);
      var6.aG = a(1, "PRAYERGLOW", true);
      var6.P = 34;
      var6.aR = 34;
      var6.aq = new int[1];
      var6.I = new int[1];
      var6.aq[0] = 1;
      var6.I[0] = var1;
      var6.X = new int[1][3];
      var6.X[0][0] = 5;
      var6.X[0][1] = var2;
      var6.X[0][2] = 0;
      var6.Q = "Activate@or2@ " + var5;
      C_e var7 = j(var0 + 1);
      var7.aw = var0 + 1;
      var7.ah = 5608;
      var7.aI = 5;
      var7.M = 0;
      var7.J = 0;
      var7.aC = 0;
      var7.ab = -1;
      var7.E = j(var4, "Prayer/PRAYON");
      var7.aG = j(var4, "Prayer/PRAYOFF");
      var7.P = 34;
      var7.aR = 34;
      var7.aq = new int[1];
      var7.I = new int[1];
      var7.aq[0] = 2;
      var7.I[0] = var3 + 1;
      var7.X = new int[1][3];
      var7.X[0][0] = 2;
      var7.X[0][1] = 5;
      var7.X[0][2] = 0;
   }

   public static void c(int var0, int var1, int var2, int var3, int var4, String var5) {
      C_e var6 = d(var0);
      var6.E = d(var1, "");
      var6.aG = d(var1, "a");
      var6.I = new int[1];
      var6.I[0] = 1;
      var6.aq = new int[1];
      var6.aq[0] = 1;
      var6.X = new int[1][3];
      var6.X[0][0] = 5;
      var6.X[0][1] = var2;
      var6.X[0][2] = 0;
      var6.M = 4;
      var6.P = var3;
      var6.ab = -1;
      var6.ah = var0;
      var6.aw = var0;
      var6.aI = 5;
      var6.aR = var4;
      var6.Q = var5;
   }

   public static void g(int var0) {
      C_e var1 = H[var0] = new C_e();
   }

   public static void b(int var0, int var1, int var2, int var3, C_e var4) {
      var4.al[var3] = var0;
      var4.am[var3] = var1;
      var4.bc[var3] = var2;
   }

   public static void a(int var0, C_K_uc[] var1, int var2) {
      C_e var3 = H[var0];
      var3.ao = var1[var2];
   }

   protected static void c(int var0, String var1) {
      C_e var2 = H[var0];
      var2.Q = "Activate@or2@ " + var1;
   }

   public static void a(int var0, int var1, int var2, String var3) {
      C_e var4 = j(var0);
      var4.aw = var0;
      var4.ah = 5608;
      var4.aI = 5;
      var4.M = 0;
      var4.J = 0;
      var4.aC = 0;
      var4.ab = var1;
      var4.aG = j(0, "tabs/prayer/hover/PRAYERH");
      var4.E = j(0, "tabs/prayer/hover/PRAYERH");
      var4.P = 34;
      var4.aR = 34;
      var4 = j(var1);
      var4.aw = var1;
      var4.ah = 5608;
      var4.aI = 0;
      var4.M = 0;
      var4.J = 0;
      var4.aC = 0;
      var4.ab = -1;
      var4.P = 512;
      var4.aR = 334;
      var4.aQ = true;
      a(var1 + 1, 0, false, 0, var3);
      a(1, var4);
      b(var1 + 1, 0, 0, 0, var4);
   }

   public static void h(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.aw = var0;
      var1.ah = var0;
      var1.aI = 6;
      var1.M = 0;
      var1.J = 328;
      var1.P = 136;
      var1.aR = 168;
      var1.aC = 0;
      var1.ab = 0;
      var1.aT = 560;
      var1.aU = 150;
      var1.aV = 0;
      var1.aD = -1;
      var1.aE = -1;
   }

   public static void b(int var0, int var1, int var2, String var3) {
      C_e var4 = H[var0] = new C_e();
      var4.E = a(var1, u, var3);
      var4.aG = a(var2, u, var3);
      var4.ah = var0;
      var4.aw = var0;
      var4.aI = 5;
   }

   public void a(int var1, C_K_uc[] var2) {
      a(var1 - 12, 7587, -1, 150, 26, "Use @gre@Special Attack");

      for (int var3 = var1 - 11; var3 < var1; var3++) {
         g(var3);
      }

      C_e var5 = H[var1 - 12];
      var5.P = 150;
      var5.aR = 26;
      var5.ab = 40005;
      var5 = H[var1];
      var5.P = 150;
      var5.aR = 26;
      var5.b(0, var1 - 12, 0, 0);
      var5.b(12, var1 + 1, 3, 7);
      var5.b(23, var1 + 12, 16, 8);

      for (int var4 = 13; var4 < 23; var4++) {
         var5.bc[var4]--;
      }

      var5 = H[var1 + 1];
      var5.aI = 5;
      var5.E = d(7600, "");

      for (int var10 = var1 + 2; var10 < var1 + 12; var10++) {
         var5 = H[var10];
         var5.aI = 5;
      }

      c(var1 + 2, 7601);
      c(var1 + 3, 7602);
      c(var1 + 4, 7603);
      c(var1 + 5, 7604);
      c(var1 + 6, 7605);
      c(var1 + 7, 7606);
      c(var1 + 8, 7607);
      c(var1 + 9, 7608);
      c(var1 + 10, 7609);
      c(var1 + 11, 7610);
      var5 = d(40005);
      var5.aQ = true;
      var5.aI = 0;
      var5.M = 0;
      var5.ab = -1;
      var5.ah = 40005;
      var5.aw = 40005;
      a(40006, 0, false, 0, "Select to perform a special\nattack.");
      a(1, var5);
      b(40006, 0, 0, 0, var5);
   }

   public static void a(int var0, int var1, String var2, C_K_uc[] var3) {
      C_e var4 = H[var0];
      var4.ab = var1;
      var4 = d(var1);
      var4.aQ = true;
      var4.aI = 0;
      var4.M = 0;
      var4.ab = -1;
      var4.ah = var1;
      var4.aw = var1;
      a(var1 + 1, 0, false, 0, var2);
      a(1, var4);
      b(var1 + 1, 0, 0, 0, var4);
   }

   public static void b(int var0, String var1, C_K_uc[] var2, int var3, int var4, boolean var5) {
      C_e var6 = H[var0] = new C_e();
      if (var5) {
         var6.S = true;
      }

      var6.aS = true;
      var6.ao = var2[var3];
      var6.at = var1;
      var6.ad = var4;
      var6.aw = var0;
      var6.aI = 4;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, String var5, int var6, int var7, int var8, String var9, C_K_uc[] var10) {
      C_e var11 = d(var0);
      var11.E = d(var1, "");
      var11.aG = d(var1, "a");
      var11.aq = new int[1];
      var11.aq[0] = 1;
      var11.I = new int[1];
      var11.I[0] = 1;
      var11.X = new int[1][3];
      var11.X[0][0] = 5;
      var11.X[0][1] = var2;
      var11.X[0][2] = 0;
      var11.M = 4;
      var11.P = var3;
      var11.ab = var6;
      var11.ah = var0;
      var11.aw = var0;
      var11.aI = 5;
      var11.aR = var4;
      var11.Q = var5;
      var11 = d(var6);
      var11.aQ = true;
      var11.aI = 0;
      var11.M = 0;
      var11.ab = -1;
      var11.ah = var6;
      var11.aw = var6;
   }

   public static void a(int var0, int var1, boolean var2, int var3, String var4) {
      C_e var5 = d(var0);
      var5.aw = var0;
      var5.ah = var0;
      var5.aI = 9;
      var5.aC = (byte)var1;
      var5.Y = var2;
      var5.ab = -1;
      var5.M = 0;
      var5.J = 0;
      var5.ad = var3;
      var5.at = var4;
   }

   public static void a(int var0, C_e var1) {
      var1.al = new int[var0];
      var1.am = new int[var0];
      var1.bc = new int[var0];
   }

   protected static C_F_uc d(int var0, String var1) {
      long var2 = (C_O_uc.b(var1) << 8) + (long)var0;
      C_F_uc var4 = (C_F_uc)b.a(var2);
      if (var4 != null) {
         return var4;
      } else {
         try {
            var4 = new C_F_uc("/Attack/" + var0 + var1);
            b.a(var4, var2);
            return var4;
         } catch (Exception var6) {
            return null;
         }
      }
   }

   public static void e(int var0, String var1) {
      C_e var2 = d(var0);
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 9;
      var2.at = var1;
   }

   public static void f(int var0, String var1) {
      C_e var2 = d(var0);
      var2.aw = var0;
      var2.aI = 0;
      var2.aQ = true;
      var2.ab = -1;
      e(var0 + 1, var1);
      var2.k(1);
      var2.b(0, var0 + 1, 0, 0);
   }

   public static void c(int var0, String var1, C_K_uc[] var2, int var3, int var4, boolean var5) {
      C_e var6 = j(var0);
      var6.ah = var0;
      var6.aw = var0;
      var6.aI = 4;
      var6.M = 0;
      var6.P = 0;
      var6.aR = 11;
      var6.J = 0;
      var6.aC = 0;
      var6.ab = -1;
      var6.U = true;
      var6.aS = var5;
      var6.ao = var2[var3];
      var6.at = var1;
      var6.Z = "";
      var6.ad = var4;
      var6.O = 0;
      var6.L = 0;
      var6.ak = 0;
   }

   public static void a(int var0, String var1, int var2, boolean var3, boolean var4, int var5, C_K_uc[] var6, int var7) {
      C_e var8 = d(var0);
      var8.ah = var0;
      var8.aw = var0;
      var8.aI = 4;
      var8.M = 0;
      var8.P = 0;
      var8.aR = 0;
      var8.J = 0;
      var8.aC = 0;
      var8.ab = var5;
      var8.S = var3;
      var8.aS = var4;
      var8.ao = var6[var7];
      var8.at = var1;
      var8.Z = "";
      var8.ad = var2;
   }

   public static void d(int var0, int var1, int var2) {
      C_e var3 = H[var0] = new C_e();
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 1;
      var3.J = 0;
      var3.P = 20;
      var3.aR = 20;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = j(var1, "Equipment/SPRITE");
      var3.aG = j(var2, "Equipment/SPRITE");
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, String var5, int var6, int var7, String var8) {
      C_e var9 = d(var0);
      var9.aw = var0;
      var9.ah = var0;
      var9.aI = 5;
      var9.M = var1;
      var9.J = var2;
      var9.ab = var3;
      var9.E = j(var4, var5);
      var9.aG = j(var4, var5);
      var9.P = var6;
      var9.aR = var7;
      var9.Q = var8;
   }

   public static void a(int var0, int var1, String var2, int var3, int var4, int var5) {
      C_e var6 = d(var0);
      var6.ah = var0;
      var6.aw = var0;
      var6.aI = 0;
      var6.M = 0;
      var6.P = var3;
      var6.aR = var4;
      var6.aQ = true;
      var6.ab = -1;
      c(var5, var1, var2);
      a(1, var6);
      b(var5, 0, 0, 0, var6);
   }

   public static void a(int var0, String var1, C_K_uc[] var2, int var3, int var4, boolean var5, boolean var6) {
      C_e var7 = j(var0);
      var7.ah = var0;
      var7.aw = var0;
      var7.aI = 4;
      var7.M = 0;
      var7.P = 0;
      var7.aR = 11;
      var7.J = 0;
      var7.aC = 0;
      var7.ab = -1;
      var7.S = var5;
      var7.aS = var6;
      var7.ao = var2[var3];
      var7.at = var1;
      var7.Z = "";
      var7.ad = var4;
      var7.O = 0;
      var7.L = 0;
      var7.ak = 0;
   }

   public C_e e() {
      this.ay = new String[this.az.length];
      return this;
   }

   public static void a(int var0, String var1, C_K_uc[] var2, C_K_uc var3, int var4, boolean var5, boolean var6) {
      C_e var7 = j(var0);
      var7.ah = var0;
      var7.aw = var0;
      var7.aI = 4;
      var7.M = 0;
      var7.P = 0;
      var7.aR = 11;
      var7.J = 0;
      var7.aC = 0;
      var7.ab = -1;
      var7.S = var5;
      var7.aS = var6;
      var7.ao = var3;
      var7.at = var1;
      var7.Z = "";
      var7.ad = var4;
      var7.O = 0;
      var7.L = 0;
      var7.ak = 0;
   }

   public static void g(int var0, String var1) {
      C_e var2 = H[var0];
      var2.aw = var0;
      var2.ah = var0;
      var2.aQ = true;
      var2.aI = 8;
      var2.k = var1;
   }

   public static void a(int var0, int var1, String var2, String var3) {
      var2 = var2.toLowerCase();
      C_e var4 = H[var0] = new C_e();
      var4.aw = var0;
      var4.ah = var0;
      var4.aI = 5;
      var4.l = true;
      var4.M = 1;
      var4.J = 0;
      var4.aC = 0;
      var4.ab = 52;
      if (var2.equalsIgnoreCase("fountain/sprite") && var1 == 1) {
         var4.E = C_aD_mc.c;
         var4.aG = C_aD_mc.c;
      } else {
         var4.E = j(var1, var2);
         var4.aG = j(var1, var2);
      }

      var4.P = var4.E.n;
      var4.aR = var4.aG.o;
      var4.Q = var3;
   }

   public static C_e b(int var0, int var1, String var2, String var3) {
      C_e var4 = H[var0] = new C_e();
      var4.aw = var0;
      var4.ah = var0;
      var4.aI = 5;
      var4.M = 1;
      var4.J = 0;
      var4.aC = 0;
      var4.ab = 52;
      var4.E = j(var1, var2);
      var4.aG = j(var1, var2);
      var4.P = var4.E.n;
      var4.aR = var4.aG.o;
      var4.Q = var3;
      return var4;
   }

   public static void a(int var0, String var1, String var2) {
      C_e var3 = H[var0] = new C_e();
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 1;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = new C_F_uc(false, var1);
      var3.aG = new C_F_uc(false, var1);
      var3.P = var3.E.n;
      var3.aR = var3.aG.o;
      var3.Q = var2;
   }

   public C_e a(String var1) {
      this.aG = new C_F_uc(false, var1);
      this.bz = true;
      return this;
   }

   public static void c(int var0, int var1, String var2) {
      C_e var3 = H[var0] = new C_e();
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 0;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = j(var1, var2);
      var3.aG = j(var1, var2);
      var3.P = 512;
      var3.aR = 334;
   }

   public void f() {
      this.bp = true;
      this.P = 765;
      this.aR = 503;
   }

   public static void h(int var0, String var1) {
      C_e var2 = H[var0] = new C_e();
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = new C_F_uc(false, var1);
      var2.aG = new C_F_uc(false, var1);
      var2.P = 512;
      var2.aR = 334;
   }

   public static void i(int var0, String var1) {
      C_e var2 = H[var0] = new C_e();
      var2.aw = var0;
      var2.ah = var0;
      var2.aI = 5;
      var2.M = 0;
      var2.J = 0;
      var2.aC = 0;
      var2.ab = 52;
      var2.E = new C_F_uc(false, var1);
      var2.aG = new C_F_uc(false, var1);
      var2.E.j = true;
      var2.aG.j = true;
      var2.P = 512;
      var2.aR = 334;
   }

   public static void a(int var0, String var1, int var2, int var3, int var4, String var5, int var6, int var7, int var8) {
      C_e var9 = j(var0);
      var9.aw = var0;
      var9.ah = var0;
      var9.aI = 5;
      var9.M = var8;
      var9.J = var6;
      var9.aC = 0;
      var9.ab = var7;
      var9.E = j(var2, var1);
      var9.aG = j(var2, var1);
      var9.P = var3;
      var9.aR = var4;
      var9.Q = var5;
   }

   public static void a(int var0, String var1, int var2, int var3, int var4, int var5) {
      C_e var6 = j(var0);
      var6.ah = var0;
      var6.aw = var0;
      var6.aI = 0;
      var6.M = 0;
      var6.P = var3;
      var6.aR = var4;
      var6.aQ = true;
      var6.aC = 0;
      var6.ab = -1;
      var6.aH = 0;
      c(var5, var2, var2, var1);
      var6.k(1);
      var6.b(0, var5, 0, 0);
   }

   public static void c(int var0, int var1, int var2, String var3) {
      C_e var4 = j(var0);
      var4.aw = var0;
      var4.ah = var0;
      var4.aI = 5;
      var4.M = 0;
      var4.J = 0;
      var4.P = 512;
      var4.aR = 334;
      var4.aC = 0;
      var4.ab = 52;
      var4.E = j(var1, var3);
      var4.aG = j(var2, var3);
   }

   public static void d(int var0, int var1, String var2) {
      C_e var3 = H[var0] = new C_e();
      var3.aw = var0;
      var3.ah = var0;
      var3.aI = 5;
      var3.M = 0;
      var3.J = 0;
      var3.aC = 0;
      var3.ab = 52;
      var3.E = j(var1, var2);
      var3.aG = j(var1, var2);
      var3.P = 512;
      var3.aR = 334;
      var3.v = true;
   }

   public static C_e i(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.aw = var0;
      var1.ah = var0;
      var1.aI = 0;
      var1.M = 0;
      var1.J = 0;
      var1.P = 512;
      var1.aR = 334;
      var1.aC = 0;
      var1.ab = 0;
      return var1;
   }

   public static C_e j(int var0) {
      C_e var1 = H[var0] = new C_e();
      var1.aw = var0;
      var1.ah = var0;
      var1.aI = 0;
      var1.M = 0;
      var1.J = 0;
      var1.P = 512;
      var1.aR = 700;
      var1.aC = 0;
      var1.ab = -1;
      return var1;
   }

   public static C_e a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      C_e var8 = H[var0] = new C_e();
      var8.aw = var0;
      var8.ah = var0;
      var8.aI = 15;
      var8.M = 0;
      var8.J = 0;
      var8.aC = 0;
      var8.ab = -1;
      var8.P = var1;
      var8.aR = var2;
      var8.B = var3;
      var8.A = var4;
      var8.x = var5;
      var8.y = var6;
      var8.z = var7;
      return var8;
   }

   public static C_e e(int var0, int var1, int var2) {
      return a(var0, var1, var2, 1, 1, 7960953, 16760832, 65280);
   }

   public static C_F_uc j(int var0, String var1) {
      return a(var0, var1, false);
   }

   public static C_F_uc a(int var0, String var1, boolean var2) {
      if (var1 == null) {
         return null;
      } else {
         long var3 = (C_O_uc.b(var1) << 8) + (long)var0;
         C_F_uc var5 = null;
         rs.C_F_uc var6 = var2 ? b : c;
         if (c != null && var5 == null) {
            var5 = (C_F_uc)var6.a(var3);
         }

         if (b != null && var5 == null) {
            var5 = (C_F_uc)var6.a(var3);
         }

         if (var5 != null) {
            return var5;
         } else {
            try {
               if (var2) {
                  if (var1.endsWith("/")) {
                     var5 = new C_F_uc(var1 + var0);
                  } else {
                     var5 = new C_F_uc(var1 + " " + var0);
                  }
               } else if (var1.endsWith("/")) {
                  var5 = new C_F_uc(false, var1 + var0);
               } else {
                  var5 = new C_F_uc(false, var1 + " " + var0);
               }

               if (var6 != null) {
                  var6.a(var5, var3);
               }

               return var5;
            } catch (Exception var8) {
               return null;
            }
         }
      }
   }

   public void g() {
      if (this.E != null && !this.E.i) {
         this.E.c();
      }

      if (this.aG != null && !this.aG.i) {
         this.aG.c();
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.al[var1] = var2;
      this.am[var1] = var3;
      this.bc[var1] = var4;
   }

   public void c(int var1, int var2, int var3, int var4) {
      this.al[var1] = var2;
      this.am[var1] = var3;
      this.bc[var1] = var4 - 19;
   }

   public void k(int var1) {
      this.al = new int[var1];
      this.am = new int[var1];
      this.bc = new int[var1];
   }

   private C_h g(int var1, int var2) {
      C_h var3 = (C_h)aO.a(((long)var1 << 16) + (long)var2);
      if (var3 != null) {
         return var3;
      } else {
         if (var1 == 1) {
            var3 = C_h.e(var2);
         }

         if (var1 == 2) {
            var3 = rs.p_d.C_d.c(var2).b();
         }

         if (var1 == 3) {
            var3 = C_Client_mc.eR.n();
         }

         if (var1 == 4) {
            var3 = C_k.f(var2).i(50);
         }

         if (var1 == 5) {
            var3 = null;
         }

         if (var1 == 10) {
            var3 = rs.p_d.C_d.c(var2).a();
         }

         if (var3 != null) {
            aO.a(var3, (long)((var1 << 16) + var2));
         }

         return var3;
      }
   }

   private static C_F_uc a(int var0, C_f var1, String var2) {
      long var3 = (C_O_uc.b(var2) << 8) + (long)var0;
      C_F_uc var5 = (C_F_uc)b.a(var3);
      if (var5 != null) {
         return var5;
      } else {
         try {
            var5 = new C_F_uc(var1, var2, var0);
            b.a(var5, var3);
            return var5;
         } catch (Exception var7) {
            return null;
         }
      }
   }

   public static void a(boolean var0, C_h var1) {
      byte var2 = 0;
      byte var3 = 5;
      if (!var0) {
         aO.a();
         if (var1 != null && var3 != 4) {
            aO.a(var1, (long)((var3 << 16) + var2));
         }
      }
   }

   public static void a(int var0, String var1, String var2, int var3, int var4, boolean var5, boolean var6, int var7, int var8) {
      try {
         C_e var9 = j(var0);
         var9.ah = var0;
         var9.aw = var0;
         var9.aI = 4;
         var9.M = 0;
         var9.P = 0;
         var9.aR = 0;
         var9.J = 0;
         var9.aC = 0;
         var9.bj = var7;
         var9.S = var5;
         var9.bm = var6;
         var9.ao = C_Client_mc.bk[var8];
         var9.at = var1;
         var9.Z = var2;
         var9.bd = var3;
         var9.ad = var4;
         var9.O = var4;
      } catch (Exception var10) {
      }
   }

   public C_h a(int var1, int var2, boolean var3, int var4, int var5) {
      C_h var6;
      if (var3) {
         var6 = this.g(this.d, this.e);
      } else {
         var6 = this.g(this.ae, this.af);
      }

      if (var6 == null) {
         return null;
      } else if (var2 == -1 && var1 == -1 && var6.ar == null) {
         return var6;
      } else {
         C_h var7 = null;
         if (var4 <= 0 || !rs.p_d.C_a.a[var4].b()) {
            var7 = new C_h(true, rs.C_k.g(var2) & rs.C_k.g(var1), false, var6);
            if (var2 != -1 || var1 != -1) {
               var7.n();
            }

            if (var2 != -1) {
               var7.f(var2, var4);
            }

            if (var1 != -1) {
               var7.f(var1, var5);
            }
         } else if (var5 > 0 && var5 != var4) {
            var7 = rs.p_d.C_a.a[var4].a(var6, var2, rs.p_d.C_a.a[var5], var1);
         } else {
            var7 = rs.p_d.C_a.a[var4].a(var6, var2);
         }

         if (this.af == 4907) {
            if (var7 != null && var7.ar != null) {
               try {
                  var7.b(84, 1000, -90, -580, -90, true);
               } catch (Exception var15) {
               }
            }
         } else {
            if (this.aN > 0) {
               C_k var8 = C_k.f(this.aN);
               if (var8 != null) {
                  boolean var9 = var8.U;
                  var8.U = true;

                  C_h var10;
                  try {
                     C_k.a(var8, this.aN);
                     var10 = var8.h(this.bq);
                  } finally {
                     var8.U = var9;
                  }

                  return var10;
               }
            }

            C_E_uc.h = true;
            var7.b(64, 768, -50, -10, -50, true);
            C_E_uc.h = false;
         }

         if (this.aW != 128 || this.aX != 128) {
            var7.b(this.aW, this.aW, this.aW);
         }

         if (this.aY && var7 != null) {
            rs.p_runelite.p_a.C_d var17 = (rs.p_runelite.p_a.C_d)n.a((long)this.af);
            if (var17 == null) {
               var7.m();
               var17 = new rs.p_runelite.p_a.C_d();
               var17.f = var7.az;
               var17.i = var7.aA;
               var17.g = var7.g;
               var17.j = var7.aE;
               var17.h = var7.aC;
               var17.k = var7.aB;
               var17.l = var7.aG;
               var17.m = var7.aF;
            }

            var7.g = var17.g;
            var7.aE = var17.j;
            var7.aA = var17.i;
            var7.az = var17.f;
            var7.aB = var17.k;
            var7.aC = var17.h;
            var7.aF = var17.m;
            var7.aG = var17.l;
            n.a(var17, (long)this.af);
         }

         return var7;
      }
   }

   public void f(int var1, int var2) {
   }

   public static C_e l(int var0) {
      return H[var0];
   }
}
