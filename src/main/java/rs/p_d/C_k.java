package rs.p_d;

import java.awt.Color;
import java.awt.Image;
import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_Client_mc;
import rs.C_F_uc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_E_uc;

public final class C_k {
   public static int a = 30000;
   public static rs.p_t.p_a.C_d b;
   public static C_cc<C_k> c = new C_cc(a + 1, 1.0F);
   public static String d = "Dwarf remains";
   private static long[][][] ay = new long[][][]{
      {{19042L, 0L, 0L}, {1038L, 1040L, 1042L, 1044L, 1046L, 1048L}},
      {{19043L, 0L, 0L}, {1053L, 1055L, 1057L}},
      {{20699L, 0L, 0L}, {20542L, 20543L, 20544L, 20545L, 20546L}},
      {{21096L, 0L, 0L}, {20539L, 20540L, 20541L}}
   };
   public static long e = 0L;
   private static String[] az = new String[]{null, null, "Take", null, null};
   private static String[][] aA = new String[][]{
      {null, "Wear", null, null, "Drop"},
      {null, "Wield", null, null, "Drop"},
      {null, null, null, null, "Drop"},
      {null, "Wear", null, null, "Destroy"},
      {null, "Wield", null, null, "Destroy"},
      {null, null, null, null, "Destroy"}
   };
   public int f;
   public int[] g;
   public int[] h;
   public int i;
   public static C_F_uc j = new C_F_uc(1000);
   public static C_F_uc k = new C_F_uc(100);
   public static C_F_uc l = new C_F_uc(50);
   public static C_F_uc m = new C_F_uc(50);
   public boolean n;
   public int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   public String[] u;
   public int v;
   public String w;
   public String x;
   public static C_k[] y;
   public int z;
   public int A;
   public int B;
   public boolean C;
   public boolean D;
   public byte[] E;
   public int F;
   private static int aB;
   public int G;
   public static boolean H = true;
   private static rs.p_x.C_e aC;
   private static rs.p_x.C_e aD;
   private static rs.p_x.C_e aE;
   public int I;
   public int J;
   public int K;
   public String[] L;
   public int M;
   public int N;
   public int O;
   public int[] P;
   public int[][][] Q;
   public int R;
   public int[] S;
   public int[] T;
   public boolean U;
   public boolean V;
   public int W;
   private static int[] aF;
   public int X;
   public int Y;
   public int Z;
   public int aa;
   public int[] ab;
   public int ac;
   public static int ad;
   public int ae;
   public byte af;
   public byte ag;
   public byte ah;
   public byte ai;
   public byte aj;
   public byte ak;
   public byte al;
   public byte am;
   public byte an;
   public byte ao;
   public byte ap;
   public byte aq;
   public boolean ar = false;
   public int as = -1;
   public int at = -1;
   public int au = -3;
   public int av = -1;
   public rs.p_a.p_b.C_c aw;
   public boolean ax = false;

   public static boolean a(C_k var0, int var1) {
      if (var1 == 22146 || var1 == 22147) {
         C_Launcher_mc.n().o().a(60, 20L);
         C_Launcher_mc.n().o().a(61, 20L);
         return true;
      } else if (var1 != 24043 && var1 != 24237) {
         if ((var1 < 23941 || var1 > 23944) && var1 != 23955) {
            if (var1 == 22273 || var1 == 22274 || var1 == 22276) {
               C_Launcher_mc.n().o().a(105, 20L);
               return true;
            } else if (var1 == 22282) {
               C_Launcher_mc.n().o().a(56, 20L);
               return true;
            } else if (var1 != 22260 && var1 != 22261 && var1 != 28789) {
               if (var1 > 0 && var0 != null && var0.U) {
                  if (var0.R > 0) {
                     C_Launcher_mc.n().o().a(var0.R, 20L);
                     return true;
                  }

                  if (var0.T != null && var0.T.length > 0) {
                     for (int var9 : var0.T) {
                        C_Launcher_mc.n().o().a(var9, 20L);
                     }

                     return true;
                  }

                  if (var0.aw != null && var0.aw.c()) {
                     for (int var5 : var0.aw.g().a()) {
                        C_Launcher_mc.n().o().a(var5, 20L);
                     }

                     return true;
                  }
               }

               return false;
            } else {
               C_Launcher_mc.n().o().a(61, 20L);
               C_Launcher_mc.n().o().a(60, 20L);
               C_Launcher_mc.n().o().a(70, 20L);
               C_Launcher_mc.n().o().a(55, 20L);
               C_Launcher_mc.n().o().a(68, 20L);
               C_Launcher_mc.n().o().a(337, 20L);
               C_Launcher_mc.n().o().a(261, 20L);
               return true;
            }
         } else {
            C_Launcher_mc.n().o().a(261, 20L);
            return true;
         }
      } else {
         C_Launcher_mc.n().o().a(58, 20L);
         C_Launcher_mc.n().o().a(62, 20L);
         return true;
      }
   }

   public static boolean a(rs.p_a.C_h var0, int var1) {
      try {
         return c(null, var0, var1);
      } catch (Exception var3) {
         return false;
      }
   }

   public static boolean a(C_k var0, rs.p_a.C_h var1, int var2) {
      if (var2 != 28789) {
         return false;
      } else {
         if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.f || rs.p_f.C_a.n == rs.p_f.C_a.d_mode.e) {
            a(var1, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{56, 56, 56, 56, 72, 56});
         } else if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.d) {
            a(var1, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{60, 60, 60, 60, 68, 60});
         } else if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.b) {
            a(var1, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{179, 179, 179, 179, 56, 179});
         } else {
            a(var1, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{337, 261, 337, 337, 261, 337});
         }

         return true;
      }
   }

   public static boolean b(C_k var0, rs.p_a.C_h var1, int var2) {
      if (!rs.p_f.C_a.M) {
         return false;
      } else if (var1 == null) {
         return true;
      } else {
         switch (var2) {
            case 21661:
               a(var1, new int[]{37, 49, 41, 57, 33, 16, 156, 142, 20}, new int[]{62, 61, 62, 62, 62, 62, 61, 62, 61});
               return true;
            case 21662:
               a(var1, new int[]{43150, 43034, 43047, 43059, 43030, 43090, 43113}, new int[]{61, 60, 60, 60, 60, 61, 61});
               return true;
            case 21664:
               a(var1, 43117, 62);
               return true;
            case 21767:
               a(var1, new int[]{38350, 37295, 40094}, new int[]{62, 62, 62});
               return true;
            case 21809:
            case 21810:
            case 21811:
               a(var1, new int[]{54546, 105, 24}, new int[]{var2 == 21811 ? 102 : 118, 118, 72});
               return true;
            case 21812:
            case 21813:
            case 21814:
               a(var1, new int[]{54546, 105, 24}, new int[]{118, 102, 62});
               return true;
            case 21815:
            case 21816:
            case 21817:
               a(var1, new int[]{54546, 105, 24}, new int[]{var2 == 21817 ? 102 : 118, 118, 58});
               return true;
            case 21818:
               a(var1, new int[]{11144}, new int[]{56});
               return true;
            case 21819:
               a(var1, new int[]{41, 16, 8, 24, 33, 13223, 14236}, new int[]{56, 72, 72, 101, 56, 81, 81});
               return true;
            case 21872:
               if (var1 != null) {
                  var1.a(3008, new int[]{3010, 3011, 3012, 3013, 3014});
               }

               a(var1, new int[]{43164, 5056, 43061, 43053, 43026, 3010, 3011, 3012, 3013, 3014}, new int[]{60, 89, 58, 89, 58, 58, 91, 91, 58, 91});
               return true;
            case 21873:
               if (var1 != null) {
                  var1.a(5018, new int[]{100, 100, 127, 127, 100});
               }

               a(var1, new int[]{11177, 61, 10351, 127, 100}, new int[]{60, 60, 60, 80, 80});
               return true;
            case 21956:
               if (var1 != null) {
                  var1.a(new int[]{25, 24});
                  var1.b(new int[]{25, 24}, new int[]{55, 72});
               }

               return true;
            case 22001:
               a(var1, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 109, 109, 109, 109, 60, 109});
               return true;
            case 22002:
               a(var1, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 62, 62, 62, 62, 60, 62});
               return true;
            case 22029:
               if (var1 != null) {
                  var1.a(new int[]{25, 24});
                  var1.b(new int[]{25, 24}, new int[]{60, 62});
               }

               return true;
            case 22030:
               if (var1 != null) {
                  var1.a(new int[]{25, 24});
                  var1.b(new int[]{25, 24}, new int[]{81, 109});
               }

               return true;
            case 22068:
               byte var3 = 62;
               byte var4 = 109;
               if (var1 != null) {
                  var1.g(70, -1);
               }

               a(
                  var1,
                  new int[]{9779, 9803, 9772, 9797, 9786, 9806, 9781, 9764, 9793, 9810, 9789, 9799, 9778, 9773, 9792, 9808, 9828, 9827, 9756, 9782, 9790},
                  new int[]{109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109}
               );
               return true;
            case 22069:
               byte var5 = 109;
               if (var1 != null) {
                  var1.g(70, -1);
               }

               a(var1, new int[]{21779, 21777, 21775, 21787, 21797}, new int[]{109, 109, 109, 109, 109});
               return true;
            case 22072:
            case 22075:
               if (var1 != null) {
                  var1.a(new int[]{302770, 302770, 302770, 306770, 306770, 296770});
               }

               if (var2 == 22075) {
                  a(var1, new int[]{296770, 306770, 302770}, new int[]{72, 72, 79});
               }

               return true;
            case 22073:
               a(
                  var1,
                  new int[]{
                     2983,
                     914,
                     6082,
                     23492,
                     23483,
                     4013,
                     4011,
                     8150,
                     4013,
                     2733,
                     4011,
                     2880,
                     28,
                     10167,
                     1946,
                     2983,
                     914,
                     4013,
                     2733,
                     4011,
                     2880,
                     28,
                     29867,
                     6084
                  },
                  new int[]{60, 109, 109, 109, 109, 109, 109, 60, 109, 109, 109, 60, 109, 109, 109, 109, 109, 60, 109, 109, 109, 109, 109, 109}
               );
               return true;
            case 22074:
               a(var1, new int[]{43150, 43034, 37, 33}, new int[]{62, 62, 62, 62});
               return true;
            case 22083:
            case 22084:
               if (var1 != null) {
                  var1.a(61962, new int[]{52122});
                  var1.a(61718, new int[]{52106});
                  var1.b(new int[]{18215, 18200, 18229, 18118, 18000, 16, 18, 39, 35, 28}, new int[]{60, 60, 107, 107, 60, 60, 108, 60, 102, 102});
               }

               return true;
            case 22094:
            case 22095:
               a(var1, new int[]{22424}, new int[]{71});
               return true;
            case 22096:
            case 22097:
               a(var1, new int[]{50062, 48035, 8, 41, 34, 24, 31, 18, 50078}, new int[]{71, 71, 71, 71, 71, 71, 71, 71, 71});
               return true;
            case 22098:
               a(var1, new int[]{7748, 7892, 7739, 7752, 7888, 7756}, new int[]{71, 71, 54, 54, 54, 54});
               return true;
            case 22128:
               if (var1 != null) {
                  var1.a(new int[]{44938, 44948});
               }

               return true;
            case 22129:
               if (var1 != null) {
                  var1.a(new int[]{25, 24});
                  var1.b(new int[]{25, 24}, new int[]{60, 54});
               }

               return true;
            case 22157:
               if (var1 != null) {
                  var1.a(90, new int[]{95, 70, 95, 70, 95});
                  var1.a(10304, new int[]{95, 70, 95, 70, 95});
                  var1.b(new int[]{70, 95, 10291, 10304}, new int[]{62, 60, 62, 60});
               }

               return true;
            case 22158:
               if (var1 != null) {
                  var1.b(
                     new int[]{61, 57, 53, 49, 41, 37, 33, 28, 7208, 7233, 7231, 7213, 7221, 7226, 7228, 7223},
                     new int[]{62, 60, 62, 60, 60, 60, 60, 60, 62, 60, 60, 60, 61, 60, 62, 60}
                  );
               }

               return true;
            case 22159:
               if (var1 != null) {
                  var1.b(new int[]{7114, 3018, 7112, 2756, 9166}, new int[]{62, 62, 60, 60, 60});
               }

               return true;
            case 22160:
               a(var1, new int[]{5219, 910, 1938, 1690, 912, 962, 8, 78, 910, 912}, 60);
               return true;
            case 22161:
               if (var1 != null) {
                  var1.b(
                     new int[]{32850, 8410, 8660, 8404, 32834, 10318, 7607, 8396, 8388, 7624, 10326, 10334, 8412, 32786, 555, 10339, 280},
                     new int[]{62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 60, 60}
                  );
               }

               return true;
            case 23945:
               var1.b(
                  new int[]{110343, 15413, 15421, 15405, 16433, 900, 0, 908, 907, 904, 903, 911, 915, 899, 31420, 16441, 16656},
                  new int[]{261, 261, 60, 68, 60, 60, 68, 60, 80, 60, 80, 60, 60, 68, 70, 261, 261}
               );
               var1.h(5, 265);
               var1.g(35, -1);
               return true;
            case 24016:
               var1.a(new int[]{1, 1, 1, 1, 1, 2});
               var1.b(new int[]{1, 2}, new int[]{60, 66});
               return true;
            case 24017:
               var1.a(new int[]{1, 1, 2});
               var1.b(new int[]{1, 2}, new int[]{69, 57});
               return true;
            case 24018:
               var1.a(new int[]{1, 1, 2});
               var1.b(new int[]{1, 2}, new int[]{63, 72});
               return true;
            case 24019:
               var1.a(new int[]{1, 1, 1, 1, 2});
               var1.b(new int[]{1, 2}, new int[]{140, 76});
               return true;
            case 24020:
            case 24021:
            case 24022:
               var1.b(
                  new int[]{0, 45, 28, 16, 37, 410, 412, 5400, 3346, 268, 398, 4550, 278},
                  new int[]{140, 221, 221, 140, 221, 221, 221, 140, 221, 221, 221, 221, 140}
               );
               return true;
            case 24050:
               var1.a(new int[]{43119}, new int[]{374770});
               var1.a(new int[]{43123}, new int[]{15});
               var1.a(new int[]{43183, 43105, 7322, 33595, 33604, 34927, 43059, 43063}, new int[]{1});
               var1.a(new int[]{38119, 37099, 35955, 35949}, new int[]{2});
               var1.b(new int[]{1, 2}, new int[]{120, 277});
               return true;
            case 24145:
               var1.b(
                  new int[]{
                     5524,
                     5400,
                     5404,
                     4013,
                     5014,
                     4009,
                     3889,
                     5648,
                     2977,
                     4783,
                     4665,
                     4903,
                     43086,
                     43094,
                     4669,
                     4674,
                     5002,
                     5840,
                     5832,
                     4653,
                     4005,
                     3881,
                     3757,
                     3761,
                     4001,
                     4003,
                     4785,
                     4779,
                     3982,
                     4657,
                     6717,
                     6713,
                     6709,
                     3885,
                     4649,
                     6722,
                     4661,
                     4781,
                     4777,
                     3765
                  },
                  new int[]{
                     180,
                     180,
                     180,
                     180,
                     212,
                     180,
                     212,
                     60,
                     60,
                     212,
                     60,
                     212,
                     180,
                     212,
                     180,
                     212,
                     180,
                     60,
                     180,
                     212,
                     212,
                     60,
                     60,
                     180,
                     212,
                     180,
                     212,
                     180,
                     212,
                     212,
                     212,
                     212,
                     212,
                     60,
                     212,
                     60,
                     81,
                     60,
                     60,
                     60
                  }
               );
               var1.h(5);
               break;
            case 24170:
               var1.a(new int[]{20288, 0, 6466, -17221, 5318, 5202, 5330, 5210, 6241, 289, 6439, 6445, 1327, 1139, 6453, 5305, -15164, 5309}, new int[]{1});
               var1.a(new int[]{1226, 204, -18381, -15193, 214, -15202, -4004, 6245, 1319, 293, 6443, 6447, 6451}, new int[]{2});
               var1.a(new int[]{-15185, 6449, -15189, 277, 6435, 6261, -4024, 6455, 1209, 313, 6457, -15168}, new int[]{5});
               var1.b(new int[]{1, 2}, new int[]{208, 277});
               break;
            case 24210:
               var1.a(61718, new int[]{17});
               var1.a(new int[]{43086, 43076}, new int[]{20, 20});
               var1.a(new int[]{38036, 38044}, new int[]{35, 35});
               var1.a(new int[]{62748, 58642, 38049}, new int[]{25, 25, 25});
               a(var1, new int[]{35, 20}, new int[]{279, 279});
               return true;
            case 24211:
               var1.a(61718, new int[]{17});
               var1.a(new int[]{43086, 43076}, new int[]{20, 20});
               var1.a(new int[]{38036, 38044}, new int[]{35, 35});
               var1.a(new int[]{62748, 58642, 38049}, new int[]{25, 25, 25});
               a(var1, new int[]{35, 20}, new int[]{180, 180});
               return true;
            case 24238:
               var1.a(new int[]{898}, new int[]{0});
               var1.b(
                  new int[]{156, 278, 3509, 6323, 7500, 8410, 3621, 3501, 167, 972, 2576, 2368, 38119, 163, 6323, 8410, 2368, 3621},
                  new int[]{339, 339, 262, 339, 339, 339, 262, 262, 262, 262, 262, 339, 262, 262, 339, 339, 339, 339}
               );
               break;
            case 25405:
               var1.a(61718, new int[]{491752});
               var1.a(new int[]{43086, 43076}, new int[]{491765, 491765});
               var1.a(new int[]{38036, 38044}, new int[]{359770, 359770});
               var1.a(new int[]{62748, 58642, 38049}, new int[]{491770, 491770, 491770});
               return true;
            case 25415:
               var1.a(43063, new int[]{5});
               var1.a(8404, new int[]{15});
               var1.a(43084, new int[]{15});
               var1.a(7378, new int[]{15});
               var1.a(43072, new int[]{5});
               var1.a(43224, new int[]{5});
               var1.a(49, new int[]{25});
               var1.a(57, new int[]{25});
               var1.a(8398, new int[]{15});
               var1.a(43080, new int[]{5});
               var1.a(66, new int[]{15});
               var1.a(7362, new int[]{15});
               var1.a(8377, new int[]{15});
               var1.b(new int[]{8286, 8390, 25, 15, 5}, new int[]{91, 91, 91, 61, 62});
               var1.g(0, -1);
               var1.g(950);
               var1.a(950, new int[]{926, 936, 946});
               return true;
            case 25425:
               var1.a(43063, new int[]{5});
               var1.a(8404, new int[]{15});
               var1.a(43084, new int[]{15});
               var1.a(7378, new int[]{15});
               var1.a(43072, new int[]{5});
               var1.a(43224, new int[]{5});
               var1.a(49, new int[]{25});
               var1.a(57, new int[]{25});
               var1.a(8398, new int[]{15});
               var1.a(43080, new int[]{5});
               var1.a(66, new int[]{15});
               var1.a(7362, new int[]{15});
               var1.a(8377, new int[]{15});
               var1.b(new int[]{8286, 15, 25, 15, 5}, new int[]{91, 61, 61, 60, 60});
               var1.g(10);
               return true;
         }

         return false;
      }
   }

   public static boolean c(C_k var0, rs.p_a.C_h var1, int var2) {
      if (var1 == null) {
         return true;
      } else {
         if (var0 != null) {
            if (var0.R != 0) {
               b(var1, var0.R);
               return true;
            }

            if (var0.S != null && var0.S.length > 0) {
               if (var0.S.length != var0.T.length) {
                  return false;
               }

               a(var1, var0.S, var0.T);
            }
         }

         if (b(var0, var1, var2)) {
            return true;
         } else if (a(var0, var1, var2)) {
            return true;
         } else {
            switch (var2) {
               case 1481:
                  b(var1, 55);
                  return true;
               case 1482:
                  b(var1, 53);
                  return true;
               case 1483:
                  b(var1, 61);
                  return true;
               case 1484:
                  b(var1, 60);
                  return true;
               case 6200:
                  a(var1, new int[]{22410}, new int[]{54});
                  return true;
               case 6202:
                  a(var1, new int[]{2999}, new int[]{60});
                  return true;
               case 6203:
                  a(var1, new int[]{2999}, new int[]{61});
                  return true;
               case 10506:
               case 22807:
                  var1.a(new int[]{50, 55, 60});
                  return true;
               case 10524:
                  a(var1, new int[]{7587}, new int[]{54});
                  return true;
               case 10954:
                  a(var1, new int[]{8596, 8720}, new int[]{29, 29});
                  if (var1 != null) {
                     var1.a(7566, new int[]{15252});
                     var1.a(7690, new int[]{15260});
                     var1.a(7446, new int[]{15250});
                     var1.a(8720, new int[]{15260});
                     var1.a(8596, new int[]{15209});
                     var1.a(7326, new int[]{15252});
                  }

                  return true;
               case 10956:
                  a(var1, new int[]{7566, 8070}, new int[]{29, 29});
                  if (var1 != null) {
                     var1.a(7566, new int[]{15252});
                     var1.a(7690, new int[]{15260});
                     var1.a(7446, new int[]{15250});
                     var1.a(8720, new int[]{15260});
                     var1.a(8596, new int[]{15209});
                     var1.a(7326, new int[]{15252});
                  }

                  return true;
               case 10958:
                  if (var1 != null) {
                     var1.a(6674, new int[]{15252, 10005, 15252, 10005, 15252});
                  }

                  a(var1, new int[]{10005}, new int[]{29});
                  return true;
               case 11674:
               case 11676:
                  if (var1 != null) {
                     var1.a(12, new int[]{6});
                     var1.a(7050, new int[]{18});
                     var1.a(90, new int[]{12});
                     var1.a(85, new int[]{6});
                     var1.a(78, new int[]{4});
                     var1.a(74, new int[]{4});
                     var1.a(61, new int[]{4});
                     var1.a(53, new int[]{4});
                     var1.a(45, new int[]{4});
                     var1.a(0, new int[]{1});
                     a(
                        var1,
                        new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 70},
                        new int[]{62, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62}
                     );
                  }

                  return true;
               case 11675:
                  if (var1 != null) {
                     var1.a(12, new int[]{6});
                     var1.a(90, new int[]{6});
                     var1.a(85, new int[]{6});
                     var1.a(70, new int[]{4});
                     var1.a(61, new int[]{4});
                     var1.a(53, new int[]{4});
                     var1.a(45, new int[]{4});
                     var1.a(0, new int[]{1});
                     a(
                        var1,
                        new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 74, 7050, 88, 78},
                        new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62}
                     );
                  }

                  return true;
               case 13999:
                  a(var1, new int[]{22410}, new int[]{55});
                  return true;
               case 14486:
               case 14487:
               case 22041:
               case 22042:
               case 22043:
               case 22044:
               case 22045:
               case 22046:
               case 22047:
               case 22048:
               case 22049:
               case 22050:
               case 22051:
               case 22052:
                  if (var1 != null) {
                     var1.g(30, -1);
                  }

                  return true;
               case 14523:
                  a(var1, new int[]{4510, 4502}, new int[]{54, 54});
                  return true;
               case 15005:
                  a(var1, new int[]{9643, 9763, 8406, 8070, 9647, 9878}, 54);
                  return true;
               case 16000:
                  var1.b(new int[]{22464}, new int[]{34});
                  return true;
               case 16001:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464},
                     new int[]{52, 52, 52, 52, 52, 52, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34}
                  );
                  return true;
               case 16002:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464},
                     new int[]{258, 258, 258, 258, 258, 258, 46, 46, 46, 46, 46, 10, 10, 10, 10, 10, 10, 34}
                  );
                  return true;
               case 16003:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464},
                     new int[]{138, 138, 138, 138, 138, 138, 46, 46, 46, 46, 46, 10, 10, 10, 10, 10, 10, 34}
                  );
                  return true;
               case 16004:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464},
                     new int[]{54, 54, 54, 54, 54, 54, 58, 58, 58, 58, 58, 10, 10, 10, 10, 10, 10, 34}
                  );
                  return true;
               case 16005:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464},
                     new int[]{273, 273, 273, 273, 273, 273, 60, 60, 60, 60, 60, 10, 10, 10, 10, 10, 10, 34}
                  );
                  return true;
               case 16006:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, 32821, 32846, 7997, 8117, 32829, 32838, 22464},
                     new int[]{53, 53, 53, 53, 53, 53, 60, 60, 60, 60, 60, 60, 60, 60, 10, 10, 10, 34}
                  );
                  return true;
               case 16007:
                  a(
                     var1,
                     new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, 32821, 32846, 7997, 8117, 32829, 32838, 22464},
                     new int[]{208, 208, 208, 208, 208, 208, 249, 249, 249, 249, 249, 249, 249, 249, 240, 240, 240, 34}
                  );
                  return true;
               case 16428:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{2839, 2826, 2837});
                  }

                  return true;
               case 20521:
                  a(var1, 115, 40);
                  return true;
               case 20523:
                  a(var1, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 40);
                  return true;
               case 20524:
                  a(var1, new int[]{22410, 2999}, new int[]{55, 56});
                  return true;
               case 20539:
                  a(var1, new int[]{926}, new int[]{54});
                  return true;
               case 20540:
                  a(var1, new int[]{926}, new int[]{40});
                  return true;
               case 20541:
                  a(var1, new int[]{926}, new int[]{24});
                  return true;
               case 20549:
                  a(var1, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451}, new int[]{56, 54, 56, 54, 56, 54, 54});
                  return true;
               case 20550:
                  a(var1, 6573, 54);
                  return true;
               case 20551:
                  return true;
               case 20558:
                  byte var40 = 54;
                  byte var42 = 60;
                  byte var44 = 61;
                  a(
                     var1,
                     new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935},
                     new int[]{60, 54, 54, 54, 54, 54, 54, 60, 60, 60, 60, 61}
                  );
                  return true;
               case 20570:
                  var1.a(127, new int[]{1});
                  return true;
               case 20571:
                  b(var1, 57);
                  return true;
               case 20577:
                  a(var1, new int[]{22410, 2999}, new int[]{62, 55});
                  return true;
               case 20687:
                  a(var1, new int[]{127}, new int[]{56});
                  return true;
               case 20689:
                  a(var1, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 56);
                  return true;
               case 20694:
                  var1.a(20, new int[]{7});
                  a(var1, new int[]{8396, 8417}, new int[]{53, 53});
                  return true;
               case 20695:
                  a(var1, new int[]{7502, 29976, 27819, 29980, 28302}, new int[]{54, 58, 54, 54, 54, 58, 54, 54, 54, 54});
                  return true;
               case 20701:
               case 24175:
                  a(var1, new int[]{22410, 2999}, new int[]{53, 55});
                  return true;
               case 20722:
                  a(var1, new int[]{22410, 2999}, new int[]{60, 59});
                  return true;
               case 20723:
                  a(var1, new int[]{10475, 33}, new int[]{30, 29});
                  return true;
               case 20724:
                  b(var1, 30);
                  return true;
               case 20725:
                  byte var28 = 61;
                  byte var29 = 62;
                  a(
                     var1,
                     new int[]{3379, 3491, 78, 86, 3363, 18, 41, 109, 127, 59, 82, 75, 52, 57, 119, 97, 112, 73, 70, 48, 26},
                     new int[]{61, 61, 62, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62}
                  );
                  return true;
               case 20729:
               case 20730:
                  a(var1, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 36007, 6573}, new int[]{56, 54, 56, 54, 56, 54, 54, 54, 54});
                  return true;
               case 20731:
                  a(var1, new int[]{4510, 4502, 8128, 7093}, new int[]{53, 53, 61, 60});
                  return true;
               case 20737:
                  a(var1, new int[]{933}, new int[]{56});
                  return true;
               case 20738:
                  a(var1, new int[]{5799, 6594, 5559, 5524}, 56);
                  return true;
               case 20743:
                  a(var1, new int[]{22410, 2999}, new int[]{62, 58});
                  return true;
               case 20774:
                  a(var1, new int[]{37, 7114, 933, 935}, new int[]{42, 56, 72, 56});
                  return true;
               case 20775:
                  a(var1, new int[]{33300, 6573, 410}, new int[]{60, 60, 62});
                  return true;
               case 20776:
                  a(var1, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{61, 62, 60, 60, 60});
                  return true;
               case 20793:
               case 20794:
               case 20795:
                  a(var1, new int[]{695, 9152, 41920, 8755, 43550, 46016}, new int[]{60, 54, 54, 54, 54, 54});
                  return true;
               case 20796:
                  a(var1, new int[]{32878, 38015, 38101, 37980, 21554, 32803, 21534, 38089, 10304, 10316}, new int[]{53, 55, 55, 55, 54, 54, 54, 55, 54, 61});
                  return true;
               case 20798:
                  a(var1, new int[]{4515, 16425, 14490}, 54);
                  return true;
               case 20799:
                  a(var1, new int[]{43123, 8877, 9024, 9015, 9009, 5652}, new int[]{55, 55, 55, 54, 54, 54});
                  return true;
               case 20807:
                  b(var1, 54);
                  return true;
               case 20811:
                  a(var1, new int[]{8128}, new int[]{40});
                  return true;
               case 20952:
                  a(var1, 43117, 62);
                  return true;
               case 20992:
               case 21558:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{60, 54, 54, 54, 60, 60});
                  return true;
               case 20995:
                  a(var1, new int[]{5813, 26006, 9139}, new int[]{30, 58, 58});
                  return true;
               case 20996:
                  a(
                     var1,
                     new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535},
                     new int[]{30, 60, 30, 60, 30, 29, 30, 29, 30, 60, 60, 60}
                  );
                  return true;
               case 20997:
                  a(var1, new int[]{920, 0, 103}, new int[]{30, 29, 30});
                  return true;
               case 20998:
                  a(var1, new int[]{0, 78, 920}, new int[]{29, 30, 29});
                  return true;
               case 20999:
                  a(var1, new int[]{78, 103, 920, 0}, new int[]{30, 29, 30, 29});
                  return true;
               case 21000:
                  b(var1, 29);
                  return true;
               case 21001:
               case 21002:
               case 21003:
                  b(var1, 61);
                  return true;
               case 21004:
                  a(var1, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{102, 102, 102, 102, 102});
                  var1.g(0, -1);
                  return true;
               case 21008:
                  a(var1, new int[]{10279, 127, 11}, new int[]{54, 56, 56});
                  return true;
               case 21009:
                  b(var1, 54);
                  return true;
               case 21010:
                  a(var1, new int[]{21, 24, 12, 941}, new int[]{60, 60, 60, 62});
                  return true;
               case 21011:
               case 21012:
                  byte var46 = 60;
                  byte var48 = 62;
                  a(var1, new int[]{12, 0, 28, 941, 943, 406, 530, 280, 148, 152}, new int[]{60, 60, 60, 62, 62, 62, 60, 60, 60, 60});
                  return true;
               case 21013:
                  a(var1, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{60, 60, 62, 62, 60, 60, 60, 62});
                  return true;
               case 21014:
                  a(var1, 9164, 40);
                  return true;
               case 21015:
                  a(var1, 9164, 56);
                  return true;
               case 21024:
                  a(var1, new int[]{127}, 40);
                  return true;
               case 21026:
               case 21560:
                  var1.a(127, new int[]{1});
                  return true;
               case 21036:
                  a(var1, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{40, 40, 40, 40, 40, 40, 40, 40});
                  return true;
               case 21037:
                  a(var1, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{56, 56, 56, 56, 56, 56, 56, 56});
                  return true;
               case 21038:
                  byte var38 = 40;
                  byte var18 = 60;
                  a(var1, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 40, 40, 40, 40, 40, 40, 60, 60});
                  return true;
               case 21039:
                  byte var19 = 56;
                  byte var20 = 60;
                  a(var1, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 56, 56, 56, 56, 56, 56, 60, 60});
                  return true;
               case 21040:
                  a(var1, new int[]{22410, 2999}, new int[]{56, 60});
                  return true;
               case 21041:
               case 21605:
                  a(
                     var1,
                     new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                     new int[]{54, 58, 54, 58, 54, 58, 54, 58, 54, 58, 54, 58, 54}
                  );
                  return true;
               case 21062:
                  a(var1, new int[]{11171, 11175, 14102}, new int[]{56, 55, 56});
                  return true;
               case 21067:
                  b(var1, 5);
                  return true;
               case 21068:
                  a(var1, 10283, 56);
                  return true;
               case 21069:
                  a(var1, new int[]{4510, 8128, 7093}, new int[]{55, 56, 56});
                  return true;
               case 21071:
                  b(var1, 54);
                  return true;
               case 21072:
                  b(var1, 62);
                  return true;
               case 21074:
                  a(var1, new int[]{5070, 5086, 5056, 5062, 5054, 5058, 5094, 5050, 5068, 5084, 5088, 5074, 5078, 5112, 5102, 5092}, 53);
                  return true;
               case 21075:
                  a(var1, new int[]{22418, 22451, 37}, new int[]{62, 62, 60});
                  return true;
               case 21076:
                  a(var1, new int[]{0, 528, 652, 43150, 7326, 7446, 16545, 16425, 16540, 7331}, new int[]{62, 62, 62, 62, 60, 60, 60, 60, 60, 62});
                  return true;
               case 21077:
                  byte var37 = 61;
                  a(
                     var1,
                     new int[]{33817, 40003, 39996, 40967, 39992, 39999, 40007, 40000, 39995, 39988, 39953, 4363, 4375, 4369, 4357, 661, 258},
                     new int[]{61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 55, 55, 55, 55, 55, 55}
                  );
                  return true;
               case 21083:
                  a(var1, new int[]{8396, 8417, 20}, new int[]{55, 63, 62});
                  return true;
               case 21084:
                  a(var1, 10351, 61);
                  return true;
               case 21087:
                  b(var1, 53);
                  return true;
               case 21088:
                  a(
                     var1,
                     new int[]{123, 127, 22410, 29113, 908, 937, 5933, 123, 22410, 4550, 947, 5813, 11200},
                     new int[]{60, 59, 59, 59, 59, 59, 60, 60, 60, 63, 60, 60, 59}
                  );
                  return true;
               case 21090:
                  a(
                     var1,
                     new int[]{10004, 25238, 8741, 4550, 908, 7073, 0, 5231, 5353, 10004, 61, 72, 98, 89},
                     new int[]{60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62, 62, 62, 62}
                  );
                  return true;
               case 21095:
                  b(var1, 54);
                  return true;
               case 21101:
                  var1.a(127, new int[]{1});
                  var1.a(0, new int[]{1});
                  return true;
               case 21106:
                  a(var1, new int[]{908, 54162, 41137, 41149, 41143, 6998, 40107, 14734}, new int[]{60, 60, 60, 60, 60, 60, 60, 60});
                  return true;
               case 21107:
               case 22839:
               case 28044:
                  a(
                     var1,
                     new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24},
                     new int[]{62, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62}
                  );
                  return true;
               case 21108:
               case 22840:
               case 28045:
                  a(var1, new int[]{21563, 21580, 21559, 33678, 21555, 28, 82}, new int[]{60, 62, 60, 60, 60, 62, 62});
                  return true;
               case 21127:
               case 21559:
                  a(var1, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 60, 60, 54, 60, 60, 60, 54});
                  return true;
               case 21130:
                  a(
                     var1,
                     new int[]{
                        10343,
                        37929,
                        37925,
                        38044,
                        35720,
                        38049,
                        38040,
                        31419,
                        43059,
                        43057,
                        43916,
                        43076,
                        43908,
                        43061,
                        43043,
                        43113,
                        43220,
                        43080,
                        43055,
                        43038,
                        43051,
                        43034
                     },
                     new int[]{56, 54, 54, 56, 56, 56, 54, 54, 54, 54, 54, 54, 54, 54, 56, 54, 54, 56, 54, 54, 56, 54}
                  );
                  return true;
               case 21131:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{56, 54, 54, 56, 56, 56});
                  return true;
               case 21133:
                  b(var1, 62);
                  return true;
               case 21134:
                  a(var1, new int[]{11175}, new int[]{62});
                  return true;
               case 21162:
                  a(var1, new int[]{3974, 3594, 2576, 2454, 1571, 1436, 1575}, 30);
                  return true;
               case 21163:
                  if (var1 != null) {
                     var1.a(6583, new int[]{6});
                     var1.a(6604, new int[]{8, 7, 6});
                     var1.a(6587, new int[]{6, 5, 4});
                     var1.a(6464, new int[]{4});
                     var1.a(60065, new int[]{4});
                     var1.a(60184, new int[]{4});
                     a(var1, new int[]{4, 5, 6, 7, 8}, new int[]{277, 82, 60, 60, 277});
                  }

                  return true;
               case 21250:
                  a(var1, new int[]{55180, 57228}, new int[]{60, 60});
                  return true;
               case 21253:
                  var1.a(5640, new int[]{915});
                  var1.a(4502, new int[]{5});
                  var1.a(4750, new int[]{15});
                  var1.a(9135, new int[]{7114});
                  var1.a(5388, new int[]{925});
                  a(var1, new int[]{8363}, new int[]{60});
                  return true;
               case 21261:
                  if (var1 != null) {
                     var1.a(51111, new int[]{8});
                     var1.a(8398, new int[]{8});
                     var1.a(8390, new int[]{8});
                     var1.a(8386, new int[]{8});
                     var1.a(8394, new int[]{8});
                     var1.a(8384, new int[]{8});
                     var1.a(8377, new int[]{8});
                     var1.a(7349, new int[]{8});
                     var1.a(54534, new int[]{955});
                     a(var1, new int[]{61340, 54534, 51111}, new int[]{60, 40, 60});
                  }

                  return true;
               case 21262:
                  if (var1 != null) {
                     var1.a(8398, new int[]{5});
                     var1.a(8390, new int[]{5});
                     var1.a(8386, new int[]{5});
                     var1.a(8394, new int[]{5});
                     var1.a(8384, new int[]{5});
                     var1.a(8377, new int[]{5});
                     var1.a(7349, new int[]{5});
                     a(var1, new int[]{61340, 54534, 51111, 5}, new int[]{60, 62, 60, 77});
                  }

                  return true;
               case 21263:
                  if (var1 != null) {
                     var1.a(8398, new int[]{5});
                     var1.a(8390, new int[]{5});
                     var1.a(8386, new int[]{5});
                     var1.a(8394, new int[]{5});
                     var1.a(8384, new int[]{5});
                     var1.a(8377, new int[]{5});
                     var1.a(7349, new int[]{5});
                     a(var1, new int[]{61340, 54534, 51111, 5}, new int[]{60, 61, 60, 63});
                  }

                  return true;
               case 21276:
                  a(var1, new int[]{7079, 8111, 8107, 11175}, new int[]{30, 29, 29, 60});
                  return true;
               case 21282:
                  a(var1, new int[]{5405, 6449, 5409, 7390}, new int[]{60, 60, 30, 29});
                  return true;
               case 21283:
               case 21284:
               case 21285:
                  a(var1, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411, 960}, new int[]{63, 63, 63, 63, 63, 63, 63, 63, 63, 34});
                  return true;
               case 21286:
                  var1.a(new int[]{10, 15, 5});
                  return true;
               case 21563:
                  a(
                     var1,
                     new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                     new int[]{62, 55, 62, 55, 62, 55, 62, 55, 62, 55, 62, 55, 62}
                  );
                  return true;
               case 21574:
                  a(var1, new int[]{33300, 6573, 410}, new int[]{63, 63, 62});
                  return true;
               case 21575:
                  var1.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                  a(
                     var1,
                     new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355},
                     new int[]{60, 40, 60, 40, 60, 40, 60, 40, 60, 40, 40, 60}
                  );
                  return true;
               case 21576:
                  var1.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                  a(
                     var1,
                     new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355},
                     new int[]{60, 56, 60, 56, 60, 56, 60, 56, 60, 56, 56, 60}
                  );
                  return true;
               case 21599:
                  b(var1, 60);
                  return true;
               case 21601:
                  a(var1, new int[]{5070, 5086, 5056, 5062, 5054, 5058, 5094, 5050, 5068, 5084, 5088, 5074, 5078, 5112, 5102, 5092}, 54);
                  return true;
               case 21602:
                  a(var1, new int[]{-11234, -11238, -10719, 54298, 54298, 54817}, new int[]{54, 54, 54, 54, 54, 54});
                  return true;
               case 21603:
                  a(var1, new int[]{59449, 43294, 43311, 59437, 43088, 43105, 6736}, new int[]{54, 54, 54, 54, 54, 54, 54});
                  return true;
               case 21604:
                  a(var1, new int[]{284, 960, 939}, new int[]{54, 54, 54});
                  return true;
               case 21607:
                  a(var1, new int[]{62127, 62131, 62135, 62011, 61888}, 53);
                  return true;
               case 21608:
                  a(var1, new int[]{61718, 61714, 61594, 61598, 61603}, 54);
                  return true;
               case 21625:
                  var1.a(6707, new int[]{8120, 8130, 8140});
                  var1.a(7952, new int[]{6707});
                  var1.a(7585, new int[]{6707});
                  return true;
               case 21629:
                  a(var1, new int[]{5784, 9152, 11187, 5404}, new int[]{56, 54, 54, 60});
                  return true;
               case 21630:
                  a(var1, new int[]{9017, 6715, 10345, 4391, 8879, 5322}, new int[]{56, 54, 54, 56, 54, 54});
                  return true;
               case 21633:
                  var1.a(127, new int[]{1});
                  var1.a(new int[]{89, 98, 72, 71, 97, 88, 72, 98, 89, 5056, 5066, 8, 12, 924, 57, 3005, 20, 24, 28, 16}, new int[]{80, 100, 100});
                  return true;
               case 21640:
                  if (var1 != null) {
                     var1.a(0, new int[]{6});
                  }

                  return true;
               case 21641:
                  if (var1 != null) {
                     var1.a(0, new int[]{1});
                     var1.a(19379, new int[]{127});
                     var1.a(26537, new int[]{127});
                     var1.a(49, new int[]{6810});
                     var1.a(66, new int[]{6810});
                  }

                  return true;
               case 21642:
                  if (var1 != null) {
                     var1.a(0, new int[]{1});
                     var1.a(19379, new int[]{126});
                     var1.a(26537, new int[]{126});
                     var1.a(49, new int[]{960});
                     var1.a(66, new int[]{960});
                     var1.a(127, new int[]{78});
                     var1.a(103, new int[]{66});
                     var1.a(86, new int[]{62});
                  }

                  return true;
               case 21643:
                  if (var1 != null) {
                     var1.a(0, new int[]{1});
                     a(var1, new int[]{49, 66, 19379, 26537}, new int[]{80, 80, 77, 77});
                  }

                  return true;
               case 21644:
                  if (var1 != null) {
                     var1.a(0, new int[]{1});
                     a(var1, new int[]{49, 66, 19379, 26537, 127, 103, 86}, new int[]{62, 62, 60, 60, 93, 93, 93});
                  }

                  return true;
               case 21648:
                  if (var1 != null) {
                     var1.a(10283, new int[]{7100});
                     var1.a(10287, new int[]{7124});
                     var1.a(10279, new int[]{7110});
                     var1.a(10291, new int[]{7144});
                     var1.a(10275, new int[]{7114});
                  }

                  return true;
               case 21660:
                  b(var1, 61);
                  return true;
               case 21663:
                  a(var1, new int[]{12, 57, 28, 20, 24, 16}, new int[]{61, 61, 62, 62, 62, 62});
                  return true;
               case 21665:
                  a(var1, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{54, 60, 54, 54, 60, 54});
                  return true;
               case 21666:
                  a(
                     var1,
                     new int[]{
                        54371,
                        52323,
                        54348,
                        54484,
                        52446,
                        52442,
                        55527,
                        57575,
                        2588,
                        2469,
                        2593,
                        11815,
                        8377,
                        8381,
                        8390,
                        2595,
                        2590,
                        10324,
                        1934,
                        10332,
                        10295,
                        10308,
                        54480,
                        54472,
                        54476,
                        54488,
                        56545,
                        55646,
                        49226,
                        49234,
                        48198,
                        54443
                     },
                     new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60}
                  );
                  return true;
               case 21667:
                  a(
                     var1,
                     new int[]{
                        898,
                        54443,
                        54447,
                        54435,
                        59437,
                        54329,
                        528,
                        54321,
                        7362,
                        8381,
                        284,
                        280,
                        404,
                        8390,
                        2217,
                        2213,
                        51078,
                        24,
                        2221,
                        274,
                        8377,
                        7349,
                        8369,
                        7341,
                        8361,
                        2337,
                        45245,
                        45254,
                        45241,
                        45237,
                        45250,
                        54410,
                        50450,
                        50330,
                        50334,
                        45361,
                        8386,
                        8394,
                        278,
                        61,
                        49,
                        54333,
                        54338,
                        54342,
                        22,
                        18,
                        289,
                        165
                     },
                     new int[]{
                        60,
                        60,
                        60,
                        60,
                        60,
                        54,
                        54,
                        54,
                        54,
                        54,
                        60,
                        60,
                        60,
                        60,
                        60,
                        54,
                        54,
                        54,
                        54,
                        54,
                        60,
                        60,
                        60,
                        60,
                        60,
                        54,
                        54,
                        54,
                        54,
                        54,
                        60,
                        60,
                        60,
                        60,
                        60,
                        54,
                        54,
                        54,
                        54,
                        54,
                        60,
                        60,
                        60,
                        60,
                        60,
                        54,
                        54,
                        54
                     }
                  );
                  return true;
               case 21668:
                  a(
                     var1,
                     new int[]{
                        54319,
                        58526,
                        58646,
                        54315,
                        8421,
                        8425,
                        58539,
                        3414,
                        181,
                        35,
                        8417,
                        54323,
                        3406,
                        1329,
                        7628,
                        7632,
                        7764,
                        1709,
                        54311,
                        305,
                        301,
                        297,
                        417,
                        3604,
                        293,
                        2578,
                        2954
                     },
                     new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54}
                  );
                  return true;
               case 21669:
                  a(
                     var1,
                     new int[]{
                        3261,
                        3266,
                        301,
                        293,
                        3253,
                        59548,
                        59544,
                        59664,
                        3369,
                        3373,
                        8410,
                        8414,
                        59553,
                        7390,
                        7510,
                        59429,
                        7399,
                        59540,
                        198,
                        7403,
                        206,
                        202,
                        3365,
                        214,
                        111,
                        3377
                     },
                     new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54}
                  );
                  return true;
               case 21670:
                  b(var1, 61);
                  return true;
               case 21671:
                  b(var1, 60);
                  return true;
               case 21672:
                  a(var1, new int[]{5799, 6594, 5559, 5524}, 61);
                  return true;
               case 21673:
                  a(var1, new int[]{11171, 11175, 14102}, new int[]{37, 61, 61});
                  return true;
               case 21674:
                  a(var1, new int[]{6032, 40, 920, 8, 937, 0, 43057, 924}, new int[]{61, 34, 61, 61, 61, 61, 61, 34});
                  b(var1, 61);
                  return true;
               case 21675:
                  a(var1, new int[]{6032, 40, 920, 8, 937, 0, 43057, 924}, new int[]{60, 34, 60, 60, 60, 60, 60, 34});
                  b(var1, 60);
                  return true;
               case 21677:
               case 21684:
                  a(var1, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{53, 53, 61, 61, 61});
                  return true;
               case 21678:
               case 21685:
                  a(var1, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{52, 52, 54, 54, 54});
                  return true;
               case 21679:
               case 21686:
                  a(var1, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{57, 57, 60, 60, 60});
                  return true;
               case 21680:
                  a(var1, new int[]{5799, 6594, 5559, 5524}, 60);
                  return true;
               case 21681:
                  a(var1, new int[]{11171, 11175, 14102}, new int[]{37, 60, 60});
                  return true;
               case 21682:
                  a(var1, new int[]{5799, 6594, 5559, 5524}, 54);
                  return true;
               case 21683:
                  a(var1, new int[]{11171, 11175, 14102}, new int[]{37, 54, 54});
                  return true;
               case 21690:
                  var1.b(new int[]{4510, 4502, 8128, 7093}, new int[]{60, 60, 68, 68});
                  return true;
               case 21691:
                  var1.b(
                     new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                     new int[]{60, 60, 60, 60, 60, 60, 60, 60, 68, 60, 68, 60, 68}
                  );
                  return true;
               case 21692:
                  var1.b(new int[]{5404, 8481, 6554}, new int[]{60, 68, 60});
                  return true;
               case 21693:
                  var1.b(
                     new int[]{
                        10472,
                        655,
                        8845,
                        8610,
                        7104,
                        5056,
                        786,
                        4750,
                        790,
                        7452,
                        817,
                        906,
                        926,
                        933,
                        937,
                        7333,
                        8664,
                        8656,
                        8146,
                        0,
                        569,
                        37,
                        313,
                        7341,
                        7326,
                        7335,
                        7447,
                        905,
                        306,
                        63823,
                        432,
                        323,
                        11201,
                        228,
                        2472,
                        317,
                        2838,
                        142,
                        8421,
                        8660,
                        8524,
                        297,
                        2714,
                        2590,
                        2595,
                        65535,
                        20287
                     },
                     new int[]{
                        60,
                        60,
                        60,
                        60,
                        61,
                        61,
                        61,
                        61,
                        61,
                        61,
                        61,
                        61,
                        61,
                        60,
                        60,
                        60,
                        60,
                        60,
                        60,
                        61,
                        56,
                        60,
                        60,
                        60,
                        60,
                        60,
                        60,
                        60,
                        61,
                        60,
                        61,
                        57,
                        61,
                        57,
                        61,
                        61,
                        60,
                        56,
                        57,
                        61,
                        61,
                        61,
                        61,
                        61,
                        60,
                        60,
                        60
                     }
                  );
                  var1.g(3);
                  return true;
               case 21694:
                  var1.g(0, -1);
                  var1.b(new int[]{3862, 2842}, new int[]{68, 68});
                  var1.g(3);
                  return true;
               case 21695:
               case 21696:
               case 21697:
               case 21698:
                  if (var1 != null) {
                     var1.g(0, -1);
                  }

                  a(var1, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{68, 69, 69, 69, 69, 60, 60, 68, 60});
                  if (var1 != null) {
                     var1.g(3);
                  }

                  return true;
               case 21699:
                  a(var1, new int[]{926, 10349, 0, 127}, new int[]{60, 68, 68, 68});
                  return true;
               case 21700:
                  a(var1, new int[]{926}, new int[]{68});
                  return true;
               case 21701:
                  var1.g(0, -1);
                  a(var1, new int[]{61}, new int[]{68});
                  var1.g(3);
                  return true;
               case 21702:
                  var1.b(new int[]{63, 56, 56, 56, 63});
                  return true;
               case 21703:
                  a(var1, new int[]{10052, 8119, 9152, 13, 51111, 50972}, new int[]{60, 60, 60, 54, 54, 54});
                  return true;
               case 21704:
                  b(var1, 54);
                  return true;
               case 21706:
               case 21707:
               case 21708:
                  a(var1, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, 60);
                  return true;
               case 21709:
                  a(var1, new int[]{44948, 7104, 9152}, new int[]{60, 54, 54});
                  return true;
               case 21710:
                  a(var1, new int[]{1955, 127, 929, 0, 6994}, new int[]{54, 60, 60, 60, 54});
                  return true;
               case 21711:
                  a(var1, new int[]{1955, 794, 792, 929, 127, 6994}, new int[]{54, 60, 60, 60, 54, 60});
                  return true;
               case 21712:
                  a(var1, new int[]{852, 935, 9152, 9015, 10060, 9019, 9174}, new int[]{54, 60, 54, 60, 54, 60, 60});
                  return true;
               case 21713:
                  a(var1, new int[]{5219, 910, 1938, 1690, 912, 962, 8, 78, 910, 912}, 54);
                  return true;
               case 21714:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{61, 51, 51, 53, 53, 61});
                  return true;
               case 21715:
                  a(
                     var1,
                     new int[]{
                        7334,
                        46115,
                        7366,
                        7361,
                        7338,
                        7396,
                        7357,
                        7342,
                        7362,
                        46268,
                        7380,
                        46248,
                        46243,
                        7376,
                        7353,
                        7346,
                        7358,
                        7368,
                        7372,
                        7349,
                        7354,
                        43098,
                        43108,
                        46130,
                        46278,
                        10679,
                        10427,
                        46273,
                        20,
                        43118,
                        43077
                     },
                     new int[]{61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 51}
                  );
                  return true;
               case 21716:
                  a(var1, new int[]{5272, 5276, 5392, 5281, 8656}, new int[]{51, 53, 61, 61, 61});
                  return true;
               case 21717:
                  a(var1, new int[]{21568, 0, 127, 55192, 54951, 55770, 54414, 52166}, new int[]{51, 61, 51, 51, 61, 53, 53, 53});
                  return true;
               case 21718:
                  a(var1, new int[]{36007}, new int[]{53});
                  return true;
               case 21719:
                  a(var1, new int[]{914, 675, 784, 4820, 945, 685, 5458, 972}, new int[]{61, 61, 61, 51, 51, 51, 51, 51});
                  return true;
               case 21720:
                  a(
                     var1,
                     new int[]{54306, 54311, 54288, 54313, 54320, 54310, 54315, 54327, 54299, 54829, 54843, 54301, 54298, 54302, 54318},
                     new int[]{61, 34, 51, 61, 51, 61, 61, 34, 60, 60, 60, 60, 60, 60, 60}
                  );
                  return true;
               case 21721:
                  a(
                     var1,
                     new int[]{5165, 5160, 5155, 1315, 1325, 5150, 5140, 26802, 26807, 26817, 26827, 1320, 1310, 5157},
                     new int[]{60, 60, 51, 51, 51, 61, 61, 51, 61, 51, 61, 60, 60, 60}
                  );
                  return true;
               case 21722:
                  a(
                     var1,
                     new int[]{16459, 8598, 16465, 16474, 16471, 16468, 16464, 16484, 16481, 16461, 16439, 16434, 16429, 8592, 8595, 8601, 8604},
                     new int[]{61, 51, 60, 61, 60, 61, 60, 51, 60, 60, 60, 60, 60, 60, 60, 60, 60}
                  );
                  return true;
               case 21723:
                  var1.a(61, new int[]{11151});
                  a(var1, new int[]{11177, 5018, 10351, 11151}, new int[]{60, 53, 60, 60});
                  return true;
               case 21724:
               case 21730:
                  byte var39 = 53;
                  byte var41 = 60;
                  byte var43 = 53;
                  a(
                     var1,
                     new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935},
                     new int[]{60, 53, 53, 53, 53, 53, 53, 60, 60, 60, 60, 53}
                  );
                  return true;
               case 21725:
                  a(
                     var1,
                     new int[]{103, 10291, 0, 43280, 38040, 40094, 40210, 6028, 10279, 36007, 929, 28, 33},
                     new int[]{60, 53, 60, 51, 60, 53, 61, 61, 60, 61, 51, 60, 60, 53}
                  );
                  return true;
               case 21729:
                  b(var1, 53);
                  return true;
               case 21732:
                  a(var1, new int[]{22410, 2999}, new int[]{56, 54});
                  return true;
               case 21734:
                  a(
                     var1,
                     new int[]{2983, 914, 6082, 23492, 23483, 4013, 4011, 8150, 4013, 2733, 4011, 2880, 28, 10167, 1946, 2983, 914, 29867, 6084},
                     new int[]{62, 62, 62, 62, 62, 62, 61, 61, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 62}
                  );
                  return true;
               case 21738:
                  byte var21 = 58;
                  byte var22 = 60;
                  a(var1, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 58, 58, 58, 58, 58, 58, 60, 60});
                  return true;
               case 21739:
                  a(var1, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{58, 58, 58, 58, 58, 58, 58, 58});
                  return true;
               case 21768:
               case 21769:
               case 21770:
                  if (var1 != null) {
                     var1.a(7516, new int[]{117});
                     var1.a(8497, new int[]{127});
                     var1.a(8493, new int[]{80});
                     var1.a(7636, new int[]{70});
                     var1.a(0, new int[]{1});
                     a(var1, new int[]{3489, 3369, 3373, 8377}, new int[]{93, 56, 56, 56});
                  }

                  return true;
               case 21771:
               case 21772:
                  if (var1 != null) {
                     var1.a(5169, new int[]{940, 945});
                     var1.a(55172, new int[]{920, 915});
                     var1.a(9133, new int[]{940, 930});
                     var1.a(11187, new int[]{920, 915});
                     var1.a(105, new int[]{127, 115, 120});
                     var1.a(88, new int[]{930, 940});
                     var1.a(26, new int[]{935, 945});
                     var1.a(64, new int[]{110, 100, 95});
                     var1.a(35, new int[]{107, 95, 100});
                  }

                  return true;
               case 21773:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{70, 70, 93, 70, 70, 93, 93, 70, 70});
                  return true;
               case 21774:
                  if (var1 != null) {
                     var1.a(6554, new int[]{127, 120});
                     var1.a(5404, new int[]{930, 940});
                     a(var1, new int[]{8481}, new int[]{70});
                  }

                  return true;
               case 21775:
                  a(var1, new int[]{1718, 1150, 20906, 20891, 20902, 20895}, new int[]{56, 70, 70, 70, 70, 70});
                  return true;
               case 21776:
                  a(var1, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 70);
                  return true;
               case 21777:
                  a(var1, new int[]{119, 103, 127, 111}, new int[]{155, 155, 155, 155});
                  return true;
               case 21778:
                  a(var1, new int[]{926, 10350, 0, 128}, new int[]{155, 97, 93, 97});
                  return true;
               case 21779:
                  a(var1, new int[]{926}, new int[]{155});
                  return true;
               case 21780:
                  a(var1, new int[]{5784, 9152, 11187, 5405}, new int[]{56, 93, 70, 10});
                  return true;
               case 21781:
                  a(var1, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{93, 93, 70, 70, 70});
                  return true;
               case 21782:
                  a(var1, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{93, 56, 56, 56, 56, 93, 56});
                  return true;
               case 21783:
                  a(var1, new int[]{7079}, 70);
                  return true;
               case 21784:
                  a(var1, new int[]{119, 103, 127, 111}, new int[]{70, 93, 70, 93});
                  return true;
               case 21785:
                  a(var1, new int[]{668, 0, 4, 8, 673, 12, 16, 20, 24, 549, 553}, new int[]{120, 70, 70, 70, 119, 70, 70, 70, 70, 119, 119});
                  return true;
               case 21786:
                  a(var1, new int[]{933, 127}, new int[]{119, 119});
                  return true;
               case 21801:
                  if (var1 != null) {
                     var1.a(5828, new int[]{117});
                     var1.a(5714, new int[]{127});
                     a(var1, new int[]{24, 16, 33, 2768}, new int[]{70, 102, 70, 60});
                  }

                  return true;
               case 21802:
                  if (var1 != null) {
                     var1.a(5828, new int[]{117});
                     var1.a(5714, new int[]{127});
                     a(var1, new int[]{24, 16, 33, 2768}, new int[]{56, 101, 56, 60});
                  }

                  return true;
               case 21803:
                  if (var1 != null) {
                     var1.a(5828, new int[]{117});
                     var1.a(5714, new int[]{127});
                     a(var1, new int[]{24, 16, 33, 2768}, new int[]{119, 119, 119, 119});
                  }

                  return true;
               case 21804:
                  if (var1 != null) {
                     var1.a(7516, new int[]{117});
                     var1.a(8497, new int[]{127});
                     var1.a(8493, new int[]{80});
                     var1.a(7636, new int[]{70});
                     var1.a(0, new int[]{1});
                     a(var1, new int[]{3489, 3369, 3373, 8377, 39896, 39872, 7446, 7393}, new int[]{93, 56, 56, 56, 56, 56, 56, 56});
                  }

                  return true;
               case 21805:
                  a(var1, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 56, 56, 56, 56, 60, 56});
                  return true;
               case 21820:
                  a(var1, new int[]{4515, 16425, 14490}, 120);
                  return true;
               case 21823:
               case 21824:
               case 21825:
               case 21826:
                  if (var1 != null) {
                     var1.a(14395, new int[]{7, 8, 9});
                     a(var1, new int[]{14387, 127, 85}, new int[]{62, 62, 62});
                  }

                  return true;
               case 21830:
                  a(var1, new int[]{6806, 6563, 61, 6439, 6443}, new int[]{62, 62, 60, 60, 62});
                  if (var1 != null) {
                     var1.a(6558, new int[]{3});
                     var1.a(6439, new int[]{3});
                  }

                  return true;
               case 21831:
                  var1.a(10351, new int[]{41257});
                  return true;
               case 21832:
                  var1.a(10351, new int[]{21541});
                  return true;
               case 21833:
                  if (var1 != null) {
                     var1.a(111, new int[]{7114});
                     var1.a(918, new int[]{7114});
                     var1.a(912, new int[]{7114});
                     var1.a(914, new int[]{7114});
                     var1.a(931, new int[]{7114});
                  }

                  return true;
               case 21834:
               case 21835:
               case 21836:
               case 21837:
               case 21838:
               case 21839:
               case 21840:
               case 21841:
               case 21842:
               case 21843:
               case 22156:
                  a(var1, new int[]{43906, 41366, 20, 8, 12, 24, 926, 941, 918}, new int[]{60, 60, 60, 60, 60, 60, 62, 62, 62});
                  var1.g(10);
                  var1.g(0, -1);
                  return true;
               case 21857:
               case 21858:
               case 21859:
                  a(var1, new int[]{10351}, new int[]{54});
                  return true;
               case 21860:
                  a(var1, new int[]{7607}, new int[]{29});
                  return true;
               case 21861:
                  a(var1, new int[]{8596, 8720, 7566, 7690}, new int[]{180, 180, 62, 180});
                  if (var1 != null) {
                     var1.a(7446, new int[]{6});
                     var1.a(8720, new int[]{12, 11});
                     var1.a(8596, new int[]{6});
                     var1.a(7326, new int[]{12, 11});
                  }

                  return true;
               case 21862:
                  a(var1, new int[]{7566, 8070, 7326}, new int[]{180, 180, 62});
                  if (var1 != null) {
                     var1.a(7566, new int[]{6, 5});
                     var1.a(7690, new int[]{12, 10});
                     var1.a(7446, new int[]{6, 5});
                     var1.a(8596, new int[]{6, 5});
                  }

                  return true;
               case 21863:
                  a(var1, new int[]{9164, 6583, 6604, 6587, 6464, 6742}, new int[]{60, 57, 60, 57, 57, 57});
                  return true;
               case 21864:
                  a(var1, new int[]{43063, 10339, 23876, 43080, 16912, 16912, 43080}, new int[]{72, 55, 55, 55, 72, 55, 55});
                  var1.a(new int[]{43055}, new int[]{36170});
                  var1.a(new int[]{16912, 14765}, new int[]{36170});
                  var1.a(new int[]{43069, 43063, 43076}, new int[]{61889, 59728, 36170, 59734});
                  return true;
               case 21865:
                  a(var1, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{60, 52, 60, 60, 52});
                  var1.g(0, -1);
                  return true;
               case 21866:
                  if (var1 != null) {
                     var1.a(914, new int[]{7114, 7115});
                     var1.a(918, new int[]{7114, 7115});
                     var1.a(37, new int[]{10, 11, 10, 11, 10, 11, 10, 11, 7110, 11, 10, 11, 10, 11, 7110});
                  }

                  return true;
               case 21867:
                  a(
                     var1,
                     new int[]{930, 906, 927, 922, 926, 921, 925, 920, 911, 909, 917, 913, 915, 923, 919, 907, 908, 910, 916, 931, 936, 932},
                     new int[]{60, 102, 60, 102, 60, 60, 60, 60, 60, 60, 102, 102, 60, 102, 60, 102, 60, 60, 60, 60, 60, 60}
                  );
                  var1.g(5);
                  return true;
               case 21868:
                  if (var1 != null) {
                     var1.a(12, new int[]{6});
                     var1.a(90, new int[]{8, 7, 6});
                     var1.a(84, new int[]{6, 5, 4});
                     var1.a(70, new int[]{4});
                     var1.a(61, new int[]{4});
                     var1.a(53, new int[]{4});
                     var1.a(45, new int[]{4});
                     var1.a(0, new int[]{1});
                     a(
                        var1,
                        new int[]{8381, 6350, 6340, 8371, 38169, 38161, 38155, 91, 85, 547, 557, 842, 6345},
                        new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 60}
                     );
                  }

                  return true;
               case 21869:
                  a(var1, new int[]{7607}, new int[]{62});
                  return true;
               case 21870:
                  a(var1, new int[]{7607}, new int[]{108});
                  return true;
               case 21871:
                  a(var1, new int[]{152, 274, 520, 268, 156, 33753, 33460, 33473, 33906}, new int[]{108, 108, 108, 108, 108, 108, 108, 108, 108});
                  return true;
               case 21880:
               case 22517:
               case 24112:
                  a(var1, new int[]{61, 8757}, new int[]{55, 72});
                  return true;
               case 21899:
                  byte var49 = 55;
                  byte var50 = 56;
                  byte var51 = 56;
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{55, 56, 55, 56, 56, 55, 55, 56, 56});
                  return true;
               case 21915:
                  var1.a(1938, new int[]{59730});
                  var1.a(910, new int[]{59705});
                  var1.a(1814, new int[]{59715});
                  a(
                     var1,
                     new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535},
                     new int[]{55, 56, 55, 55, 24, 56, 56, 56, 55, 56, 55, 56}
                  );
                  return true;
               case 21923:
               case 21924:
                  a(var1, new int[]{43059, 8128}, new int[]{55, 55});
                  return true;
               case 21937:
                  if (var1 != null) {
                     var1.a(22024, new int[]{5});
                     var1.a(21776, new int[]{905});
                     var1.a(22402, new int[]{905});
                     var1.b(new int[]{905, 904, 929, 103, 910}, new int[]{75, 75, 75, 75, 80});
                  }

                  return true;
               case 21940:
                  a(var1, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{55, 55, 56, 56, 56});
                  return true;
               case 21943:
                  a(var1, new int[]{71, 97, 72, 98}, new int[]{62, 62, 62, 62});
                  return true;
               case 21944:
                  if (var1 != null) {
                     var1.g(0, -1);
                  }

                  if (var1 != null) {
                     var1.g(3);
                  }

                  return true;
               case 21946:
                  a(var1, new int[]{4515, 16425, 14490}, new int[]{56, 55, 56});
                  return true;
               case 21958:
               case 27520:
               case 27524:
                  a(var1, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{61, 93, 61, 93, 93});
                  return true;
               case 21959:
               case 21961:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{74, 54, 54, 54, 74, 74});
                  return true;
               case 21960:
               case 21962:
                  a(var1, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 74, 60, 54, 60, 60, 60, 54});
                  return true;
               case 22006:
                  a(var1, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{93, 60, 86, 60, 60});
                  return true;
               case 22007:
                  a(var1, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{89, 78, 86, 60, 60});
                  return true;
               case 22008:
                  a(var1, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{58, 83, 83, 60, 60});
                  return true;
               case 22012:
               case 22013:
                  b(var1, 40);
                  return true;
               case 22014:
                  if (var1 != null) {
                     var1.a(new int[]{10147, 10157, 10167}, new int[]{6});
                  }

                  a(var1, new int[]{10165, 10176, 9812, 22451}, new int[]{62, 62, 62, 62});
                  return true;
               case 22015:
                  if (var1 != null) {
                     var1.a(new int[]{10147, 10157, 10167}, new int[]{6});
                  }

                  a(var1, new int[]{10165, 10176, 9812, 22451}, new int[]{109, 109, 109, 109});
                  return true;
               case 22017:
                  a(var1, new int[]{10417, 3974, 3594, 2576, 2454, 1571, 1436, 1575, 6808, 7331}, new int[]{60, 62, 62, 60, 62, 62, 60, 60, 40, 40});
                  return true;
               case 22018:
                  a(var1, new int[]{47168}, new int[]{62});
                  return true;
               case 22019:
                  a(var1, new int[]{47168}, new int[]{109});
                  return true;
               case 22023:
               case 22024:
               case 22025:
                  if (var1 != null) {
                     var1.a(24, new int[]{3});
                     var1.a(41, new int[]{3});
                     var1.a(12, new int[]{3});
                     var1.a(0, new int[]{1});
                     var1.a(926, new int[]{3});
                     a(var1, new int[]{41, 61}, new int[]{40, 62});
                  }

                  return true;
               case 22027:
                  a(var1, new int[]{61, 924, 916, 932}, new int[]{60, 109, 60, 60});
                  return true;
               case 22028:
                  a(var1, new int[]{61, 924, 916, 932}, new int[]{85, 75, 85, 85});
                  return true;
               case 22031:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{75, 85, 75, 85, 85, 75, 75, 62, 62});
                  return true;
               case 22032:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{109, 81, 109, 81, 109, 109, 109, 81, 81});
                  return true;
               case 22033:
                  a(var1, new int[]{5421, 5334, 12459, 1455, 2733, 2613}, new int[]{62, 80, 63, 34, 62, 80});
                  return true;
               case 22034:
               case 22035:
                  var1.g(3);
                  a(var1, new int[]{3}, new int[]{87});
                  return true;
               case 22040:
                  b(var1, 212);
                  return true;
               case 22055:
               case 22056:
                  if (var1 != null) {
                     var1.a(105, new int[]{2});
                     a(var1, new int[]{916, 90, 84, 115, 92}, new int[]{109, 81, 81, 109, 81});
                     var1.g(70, -1);
                  }

                  return true;
               case 22059:
                  b(var1, 212);
                  return true;
               case 22060:
                  if (var1 != null) {
                     var1.a(35, new int[]{32});
                     var1.a(72, new int[]{6});
                     var1.a(76, new int[]{11});
                     var1.a(8635, new int[]{904});
                     var1.a(68, new int[]{904});
                     a(var1, new int[]{8636, 73, 77, 80, 36, 0, 8625, 68, 8644, 8646, 55, 119, 123}, new int[]{61, 61, 61, 60, 60, 76, 60, 54, 62, 62, 61, 61});
                  }

                  return true;
               case 22067:
                  a(var1, new int[]{4515, 16425, 14490}, new int[]{55, 62, 55});
                  return true;
               case 22070:
               case 22071:
                  a(var1, new int[]{43059, 8128}, new int[]{62, 62});
                  return true;
               case 22085:
                  a(var1, new int[]{43059, 8128}, new int[]{54, 54});
                  return true;
               case 22086:
                  if (var1 != null) {
                     a(var1, new int[]{10351}, new int[]{231});
                  }

                  return true;
               case 22099:
               case 22876:
               case 22877:
                  a(var1, new int[]{43059, 8128}, new int[]{59, 59});
                  return true;
               case 22100:
                  a(var1, new int[]{43059, 8128}, new int[]{61, 61});
                  if (var1 != null) {
                     var1.a(new int[]{4510, 4502, 7093}, new int[]{5, 10, 15});
                  }

                  return true;
               case 22104:
                  if (var1 != null) {
                     a(var1, new int[]{6589, 6674}, new int[]{60, 54});
                  }

                  return true;
               case 22105:
               case 22106:
               case 22107:
                  byte var11 = 60;
                  byte var12 = 54;
                  var1.a(0, new int[]{1});
                  var1.b(
                     new int[]{43449, 36007, 20, 8418, 1, 935, 28969, 43116, 43340, 43450, 43440, 6573, 411, 10258, 24, 12, 20, 16},
                     new int[]{54, 54, 60, 60, 54, 54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54}
                  );
                  var1.g(80);
                  var1.a(80, new int[]{7, 8, 10});
                  var1.a(94, new int[]{20, 25, 30});
                  return true;
               case 22108:
                  if (var1 != null) {
                     var1.a(49, new int[]{11, 12, 11, 11, 11, 12});
                     a(var1, new int[]{11, 12}, new int[]{60, 61});
                  }

                  return true;
               case 22109:
               case 22111:
                  if (var1 != null) {
                     var1.a(43164, new int[]{15});
                     var1.a(43061, new int[]{3});
                     var1.a(43053, new int[]{3});
                     var1.a(43026, new int[]{3});
                     var1.a(5056, new int[]{902});
                     var1.a(3008, new int[]{950});
                     var1.a(24, new int[]{950});
                     var1.a(576, new int[]{920});
                     var1.a(594, new int[]{902});
                     var1.a(687, new int[]{905});
                     var1.a(703, new int[]{920});
                     var1.a(691, new int[]{920});
                     var1.a(671, new int[]{920});
                  }

                  return true;
               case 22112:
                  a(var1, new int[]{152, 274, 520, 268, 156, 33753, 33460, 33473, 33906}, new int[]{76, 76, 76, 76, 76, 76, 76, 76, 76});
                  return true;
               case 22113:
                  a(var1, new int[]{32889, 32875, 33891, 32844, 32858, 24, 33, 13223, 14236, 15256}, new int[]{54, 60, 60, 60, 60, 54, 54, 76, 76, 76});
                  return true;
               case 22114:
                  a(
                     var1,
                     new int[]{12484, 16, 12475, 12, 28, 20, 37, 41, 30643, 13493, 0, 29601, 24, 33, 29609},
                     new int[]{54, 60, 60, 60, 60, 60, 60, 60, 76, 76, 76, 76, 60, 60, 76}
                  );
                  return true;
               case 22115:
                  a(var1, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{54, 60, 54, 54, 54});
                  return true;
               case 22116:
                  a(
                     var1,
                     new int[]{
                        35255,
                        17500,
                        16462,
                        35247,
                        35251,
                        35259,
                        35270,
                        35264,
                        16450,
                        54317,
                        58419,
                        16466,
                        15434,
                        58539,
                        54302,
                        40757,
                        40871,
                        35012,
                        103,
                        34991,
                        0,
                        10291,
                        37060,
                        10279,
                        6028,
                        929,
                        28,
                        33
                     },
                     new int[]{60, 54, 54, 60, 60, 76, 76, 60, 54, 65, 54, 65, 60, 65, 60, 54, 60, 54, 77, 60, 76, 60, 76, 54, 76, 54, 77, 77}
                  );
                  return true;
               case 22117:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{108, 60, 60, 60, 108, 108});
                  return true;
               case 22118:
                  var1.a(12, new int[]{6});
                  var1.a(47653, new int[]{11});
                  var1.a(8, new int[]{10});
                  a(var1, new int[]{16, 43286, 43282, 47772, 47777, 63, 67, 47657, 47708, 43292, 47533}, new int[]{75, 75, 60, 60, 60, 75, 60, 75, 60, 60, 60});
                  var1.g(8);
                  return true;
               case 22119:
               case 22120:
                  a(var1, new int[]{947, 3776, 3546, 305, 3996, 3895, 5051, 945}, new int[]{61, 61, 61, 61, 61, 61, 61, 61});
                  var1.a(22, new int[]{16});
                  var1.a(74, new int[]{12});
                  var1.a(49, new int[]{8});
                  var1.a(37, new int[]{10});
                  var1.a(28, new int[]{4});
                  var1.a(57, new int[]{5});
                  var1.a(20, new int[]{3});
                  var1.a(24, new int[]{7});
                  var1.a(33, new int[]{2});
                  var1.a(41, new int[]{11});
                  var1.a(45, new int[]{14});
                  var1.a(99, new int[]{14});
                  var1.a(101, new int[]{11});
                  var1.a(103, new int[]{10});
                  var1.a(86, new int[]{10});
                  var1.a(82, new int[]{9});
                  var1.a(78, new int[]{10});
                  var1.a(51, new int[]{8});
                  var1.a(53, new int[]{12});
                  var1.a(18, new int[]{3});
                  var1.a(26, new int[]{6});
                  return true;
               case 22121:
                  a(var1, new int[]{4382, 4502, 7616, 7731}, new int[]{96, 96, 95, 95});
                  return true;
               case 22122:
                  var1.a(new int[]{44948, 44940, 44935});
                  return true;
               case 22123:
                  var1.a(71, new int[]{90});
                  var1.a(72, new int[]{90});
                  var1.a(97, new int[]{95});
                  var1.a(98, new int[]{95});
                  var1.a(88, new int[]{110});
                  var1.a(89, new int[]{110});
                  a(var1, new int[]{90, 95, 110}, new int[]{60, 60, 54});
                  return true;
               case 22124:
                  var1.a(22428, new int[]{7114});
                  var1.a(22433, new int[]{44948});
                  var1.a(22437, new int[]{5});
                  var1.a(19129, new int[]{44948});
                  var1.a(19119, new int[]{44948});
                  var1.a(12853, new int[]{7114});
                  var1.a(12989, new int[]{5});
                  var1.a(933, new int[]{44948});
                  var1.a(939, new int[]{44948});
                  return true;
               case 22125:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{60, 54, 60, 54, 54, 60, 60, 54, 54});
                  return true;
               case 22130:
                  a(var1, new int[]{926}, new int[]{74});
                  return true;
               case 22131:
                  a(var1, new int[]{926}, new int[]{76});
                  return true;
               case 22132:
                  a(var1, new int[]{926}, new int[]{80});
                  return true;
               case 22133:
                  a(var1, new int[]{926}, new int[]{71});
                  return true;
               case 22134:
                  var1.a(278, new int[]{266});
                  var1.a(412, new int[]{422});
                  var1.a(156, new int[]{412});
                  var1.a(28, new int[]{16});
                  var1.a(20, new int[]{14});
                  var1.a(22, new int[]{12});
                  return true;
               case 22136:
               case 22138:
                  var1.a(16, new int[]{8, 10, 11});
                  var1.a(20, new int[]{14});
                  var1.b(new int[]{12, 24, 920, 7104, 7097}, new int[]{180, 180, 61, 71, 71});
                  return true;
               case 22137:
                  var1.a(20, new int[]{10});
                  var1.b(new int[]{12, 24, 16}, new int[]{180, 180, 61});
                  return true;
               case 22139:
                  var1.a(40, new int[]{74});
                  var1.a(924, new int[]{12});
                  var1.a(6032, new int[]{34});
                  return true;
               case 22144:
               case 22149:
               case 22150:
               case 22151:
               case 22255:
                  var1.g(4);
                  var1.g(0, -1);
                  return true;
               case 22145:
                  a(
                     var1,
                     new int[]{54306, 54312, 54289, 54313, 54321, 54310, 54315, 54328, 54299, 54829, 54843, 54301, 54298, 54302, 54318},
                     new int[]{76, 34, 51, 76, 51, 76, 76, 34, 76, 76, 76, 76, 60, 60, 60}
                  );
                  var1.g(2);
                  var1.g(50, -1);
                  return true;
               case 22146:
               case 22147:
                  var1.b(
                     new int[]{
                        8367,
                        8384,
                        8375,
                        10266,
                        9523,
                        10502,
                        9515,
                        22,
                        21662,
                        17566,
                        10275,
                        21782,
                        274,
                        163,
                        142,
                        9403,
                        8076,
                        21902,
                        21772,
                        21658,
                        10291,
                        21667,
                        9152,
                        9147,
                        7378,
                        898,
                        26,
                        8379,
                        8390,
                        39,
                        55244,
                        10283,
                        10287
                     },
                     new int[]{
                        61, 61, 61, 60, 85, 85, 60, 60, 55, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 61, 61, 60, 0, 60, 61, 61, 60, 60, 60, 60
                     }
                  );
                  return true;
               case 22152:
                  var1.g(23);
                  var1.a(23, new int[]{302770, 419770, 419770, 302770});
                  return true;
               case 22153:
                  var1.g(23);
                  var1.a(23, new int[]{127, 955, 955, 127});
                  return true;
               case 22154:
                  var1.g(23);
                  var1.a(23, new int[]{461770, 76770});
                  return true;
               case 22155:
                  var1.g(23);
                  var1.a(23, new int[]{920, 960});
                  return true;
               case 22167:
               case 22168:
               case 22169:
                  a(var1, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, new int[]{77, 77, 77, 77, 77, 77, 77, 77, 77});
                  return true;
               case 22179:
                  b(var1, 57);
                  return true;
               case 22180:
                  a(var1, new int[]{5799, 6594, 5559, 5524}, 57);
                  return true;
               case 22181:
                  a(var1, new int[]{11171, 11175, 14102}, new int[]{60, 57, 60});
                  return true;
               case 22183:
                  a(var1, new int[]{7079, 11175}, new int[]{61, 60});
                  return true;
               case 22184:
                  a(var1, new int[]{7079, 11175}, new int[]{60, 60});
                  return true;
               case 22185:
                  a(var1, new int[]{7079, 11175}, new int[]{54, 60});
                  return true;
               case 22189:
               case 22190:
                  var1.a(74, new int[]{33031});
                  var1.a(57, new int[]{1});
                  var1.a(86, new int[]{33031});
                  var1.a(90, new int[]{1});
                  var1.a(66, new int[]{33031});
                  var1.a(33030, new int[]{1});
                  var1.a(10262, new int[]{1});
                  a(var1, new int[]{33031, 2, 10264}, new int[]{54, 60, 60});
                  return true;
               case 22191:
                  var1.a(78, new int[]{33031});
                  var1.a(86, new int[]{1});
                  var1.a(94, new int[]{33031});
                  var1.a(33030, new int[]{1});
                  a(var1, new int[]{33031, 2, 10264}, new int[]{54, 60, 60});
                  return true;
               case 22218:
                  if (var1 != null) {
                     var1.a(127, new int[]{4382});
                  }

                  return true;
               case 22220:
                  a(var1, new int[]{20, 924, 30, 10308, 14395, 39, 47}, new int[]{60, 75, 60, 77, 77, 75, 75});
                  return true;
               case 22243:
               case 23065:
                  var1.a(new int[]{347770, 311770, 347770, 311770});
                  return true;
               case 22250:
                  var1.a(90, new int[]{33031});
                  var1.a(21766, new int[]{1});
                  var1.a(28, new int[]{1});
                  var1.a(37, new int[]{1});
                  var1.a(20, new int[]{1});
                  var1.a(43150, new int[]{1});
                  var1.a(43146, new int[]{1});
                  var1.a(43270, new int[]{1});
                  var1.a(26, new int[]{1});
                  var1.a(18, new int[]{1});
                  a(var1, new int[]{33031, 91, 72, 82, 65, 25, 45, 65, 3230, 3226, 26, 18, 88}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54});
                  return true;
               case 22251:
                  var1.a(17069, new int[]{5});
                  var1.a(8755, new int[]{4007});
                  var1.a(8631, new int[]{4020});
                  var1.a(8635, new int[]{4030});
                  var1.a(9901, new int[]{12});
                  var1.a(10149, new int[]{4040});
                  var1.a(957, new int[]{25});
                  var1.a(559, new int[]{40});
                  var1.a(941, new int[]{35});
                  a(var1, new int[]{12}, new int[]{60});
                  return true;
               case 22260:
                  if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.f || rs.p_f.C_a.n == rs.p_f.C_a.d_mode.e) {
                     a(var1, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{56, 56, 56, 56, 72, 56});
                  } else if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.d) {
                     a(var1, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{60, 60, 68, 60, 68, 60});
                  } else if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.b) {
                     a(var1, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{179, 179, 179, 179, 56, 179});
                  } else {
                     a(var1, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{337, 261, 337, 337, 261, 337});
                  }

                  return true;
               case 22261:
                  if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.f || rs.p_f.C_a.n == rs.p_f.C_a.d_mode.e) {
                     a(
                        var1,
                        new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                        new int[]{56, 72, 56, 72, 56, 72, 56, 72, 56, 72, 56, 72, 56}
                     );
                  } else if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.d) {
                     a(
                        var1,
                        new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                        new int[]{60, 68, 60, 68, 60, 68, 68, 68, 60, 68, 60, 68, 60}
                     );
                  } else if (rs.p_f.C_a.n == rs.p_f.C_a.d_mode.b) {
                     a(
                        var1,
                        new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                        new int[]{179, 56, 179, 56, 179, 56, 179, 56, 179, 56, 179, 56, 179}
                     );
                  } else {
                     a(
                        var1,
                        new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12},
                        new int[]{261, 261, 337, 261, 261, 261, 337, 261, 337, 261, 337, 261, 337}
                     );
                  }

                  return true;
               case 22262:
               case 22263:
               case 22264:
                  var1.a(6356, new int[]{16});
                  var1.a(6364, new int[]{12});
                  var1.a(6348, new int[]{10});
                  var1.a(6323, new int[]{8});
                  var1.a(43305, new int[]{8});
                  a(
                     var1,
                     new int[]{49218, 6331, 43311, 7108, 49197, 6973, 43301, 5268, 49209, 43544, 6340},
                     new int[]{102, 102, 54, 60, 54, 102, 102, 54, 54, 102, 54, 54, 60}
                  );
                  return true;
               case 22270:
               case 22271:
               case 22272:
                  if (var1 != null) {
                     var1.g(70, -1);
                     var1.a(4382, new int[]{36190, 36195, 36185});
                     var1.a(4785, new int[]{36185, 36192, 36180});
                     var1.a(4661, new int[]{36170, 36175, 36160});
                     var1.a(4626, new int[]{36190, 36195});
                     var1.a(4781, new int[]{127});
                     var1.a(8427, new int[]{127});
                     var1.b(new int[]{127}, new int[]{116});
                  }

                  return true;
               case 22273:
                  var1.b(new int[]{926}, new int[]{105});
                  return true;
               case 22274:
                  var1.b(new int[]{933, 10351}, new int[]{105, 60});
                  return true;
               case 22276:
                  byte var34 = 105;
                  byte var35 = 56;
                  byte var36 = 56;
                  var1.b(new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{105, 56, 105, 56, 56, 105, 105, 56, 56});
                  return true;
               case 22282:
                  var1.a(61, new int[]{62, 63});
                  var1.b(new int[]{62, 63, 8757}, new int[]{56, 101, 90});
                  return true;
               case 22283:
               case 22284:
                  var1.a(5652, new int[]{940, 935});
                  var1.a(12820, new int[]{960, 955});
                  var1.a(10543, new int[]{127});
                  var1.a(43270, new int[]{100});
                  var1.a(4550, new int[]{80});
                  var1.b(new int[]{8}, new int[]{70});
                  return true;
               case 22286:
                  a(
                     var1,
                     new int[]{
                        35255,
                        17500,
                        16462,
                        35247,
                        35251,
                        35259,
                        35270,
                        35264,
                        16450,
                        54317,
                        58419,
                        16466,
                        15434,
                        58539,
                        54302,
                        40757,
                        40871,
                        35012,
                        103,
                        34991,
                        0,
                        10291,
                        37060,
                        10279,
                        6028,
                        929,
                        28,
                        33
                     },
                     new int[]{105, 56, 56, 105, 105, 76, 76, 105, 56, 65, 56, 65, 105, 65, 105, 56, 105, 56, 77, 105, 76, 105, 76, 56, 76, 56, 77, 77}
                  );
                  return true;
               case 22287:
               case 22289:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{56, 105, 105, 105, 56, 56});
                  return true;
               case 22288:
               case 22290:
                  a(var1, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 105, 60, 56, 60, 60, 60, 56});
                  return true;
               case 22358:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{10, 15, 20, 10, 5810, 5810});
                  }

                  return true;
               case 22359:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{64585, 64590, 64595, 64585, 5810, 5810});
                  }

                  return true;
               case 22360:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{9767, 9772, 9777, 9767, 5810, 5810});
                  }

                  return true;
               case 22361:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{65046, 65051, 65056, 65046, 5810, 5810});
                  }

                  return true;
               case 22362:
               case 22366:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{10, 15, 20, 10, 5810});
                  }

                  return true;
               case 22363:
               case 22367:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{64585, 64590, 64595, 64585, 5810});
                  }

                  return true;
               case 22364:
               case 22368:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{9767, 9772, 9777, 9767, 5810});
                  }

                  return true;
               case 22365:
               case 22369:
                  if (rs.p_f.C_a.aj) {
                     var1.a(new int[]{65046, 65051, 65056, 65046, 5810});
                  }

                  return true;
               case 22450:
               case 22451:
               case 22452:
                  byte var6 = 101;
                  byte var7 = 56;
                  byte var8 = 101;
                  byte var9 = 101;
                  byte var10 = 56;
                  var1.g(100, -1);
                  var1.a(8650, new int[]{36190, 36195, 36185});
                  var1.a(43047, new int[]{36190, 36195, 36185});
                  var1.a(43088, new int[]{36190, 36195, 36185});
                  var1.a(43047, new int[]{36190, 36195, 36185});
                  var1.a(43072, new int[]{36170, 36195, 36185});
                  var1.a(43063, new int[]{36180, 36195, 36185});
                  var1.a(43096, new int[]{36155, 36165, 36150});
                  var1.b(
                     new int[]{8650, 43096, 43047, 43088, 0, 43072, 43063, 43080, 8658, 43030, 43084, 43076},
                     new int[]{101, 56, 101, 101, 101, 56, 101, 56, 101, 101, 56, 101}
                  );
                  return true;
               case 22455:
                  var1.a(33680, new int[]{6926});
                  var1.a(33690, new int[]{6926});
                  var1.a(33674, new int[]{6926});
                  var1.a(48055, new int[]{6926});
                  var1.a(48045, new int[]{6926});
                  var1.a(49083, new int[]{6926});
                  var1.b(
                     new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083},
                     new int[]{60, 54, 60, 60, 54, 54, 60, 54, 60, 54, 60, 54}
                  );
                  return true;
               case 22456:
                  var1.a(33680, new int[]{6920});
                  var1.a(33690, new int[]{6920});
                  var1.a(33674, new int[]{6920});
                  var1.b(
                     new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083},
                     new int[]{60, 96, 60, 60, 96, 96, 60, 96, 60, 96, 60, 96}
                  );
                  return true;
               case 22457:
                  var1.b(
                     new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083},
                     new int[]{60, 96, 60, 60, 96, 96, 60, 96, 60, 96, 60, 96}
                  );
                  return true;
               case 22494:
                  a(var1, new int[]{4626}, new int[]{55});
                  return true;
               case 22514:
               case 22515:
               case 22516:
                  var1.b(
                     new int[]{10306, 10314, 1944, 1934, 0, 20, 12, 152, 43286, 1940, 1938, 3974, 70},
                     new int[]{72, 55, 72, 55, 72, 55, 55, 72, 55, 72, 72, 72, 72}
                  );
                  return true;
               case 22518:
                  a(var1, new int[]{668, 673, 553, 549, 0, 4, 8, 12, 16, 20, 24}, new int[]{55, 55, 55, 55, 72, 72, 72, 72, 72, 72, 72});
                  return true;
               case 22522:
                  a(var1, new int[]{37093, 39137, 38003, 7471, 7479, 40161, 6435, 7467, 7463}, new int[]{72, 72, 72, 55, 55, 72, 55, 55, 55});
                  return true;
               case 22777:
                  a(var1, new int[]{7104}, new int[]{56});
                  return true;
               case 22778:
                  a(var1, new int[]{6067, 7104}, new int[]{56, 56});
                  return true;
               case 22779:
               case 22780:
                  a(var1, new int[]{935}, new int[]{56});
                  return true;
               case 22781:
                  a(var1, new int[]{972}, new int[]{70});
                  return true;
               case 22782:
                  a(var1, new int[]{984, 972}, new int[]{70, 70});
                  return true;
               case 22783:
               case 22784:
                  a(var1, new int[]{11187}, new int[]{70});
                  return true;
               case 22786:
                  a(var1, new int[]{29456}, new int[]{56});
                  return true;
               case 22787:
               case 22797:
               case 22799:
                  b(var1, 56);
                  return true;
               case 22789:
               case 22798:
               case 22800:
                  b(var1, 70);
                  return true;
               case 22790:
                  a(var1, new int[]{926}, new int[]{70});
                  return true;
               case 22791:
                  a(var1, new int[]{933}, new int[]{70});
                  return true;
               case 22801:
                  a(var1, new int[]{61, 924, 916, 932}, new int[]{50, 56, 50, 50});
                  return true;
               case 22803:
               case 22804:
                  a(var1, new int[]{935, 939, 929, 931}, new int[]{56, 56, 56, 56});
                  return true;
               case 22805:
               case 22806:
                  a(var1, new int[]{935, 939, 929, 931}, new int[]{70, 70, 70, 70});
                  return true;
               case 22809:
                  a(var1, new int[]{35868, 35895, 35912, 35865, 35882, 35875, 35889, 35906}, new int[]{70, 70, 70, 70, 70, 70, 70, 70});
                  var1.g(127);
                  return true;
               case 22810:
                  b(var1, 56);
                  return true;
               case 22812:
                  var1.b(new int[]{63, 63, 56, 56, 56});
                  return true;
               case 22813:
                  a(var1, new int[]{8396, 8417, 20}, new int[]{71, 71, 54});
                  return true;
               case 22814:
                  var1.b(
                     new int[]{4363, 4375, 4369, 4357, 661, 258, 33817, 40003, 39996, 40967, 39992, 39999, 40007, 40000, 39995, 39988, 39953},
                     new int[]{71, 59, 59, 59, 71, 71, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54}
                  );
                  return true;
               case 22825:
                  b(var1, 58);
                  return true;
               case 22832:
                  a(var1, new int[]{21, 24, 12, 941}, new int[]{71, 71, 71, 54});
                  return true;
               case 22833:
               case 22834:
                  byte var45 = 71;
                  byte var47 = 54;
                  a(var1, new int[]{12, 0, 28, 941, 943, 406, 530, 280, 148, 152}, new int[]{71, 71, 71, 54, 54, 54, 71, 71, 71, 71});
                  return true;
               case 22838:
                  a(var1, new int[]{7607}, new int[]{71});
                  return true;
               case 22842:
                  a(var1, new int[]{21652, 21658}, 62);
                  return true;
               case 22843:
                  a(var1, new int[]{5813, 26006, 9139}, new int[]{62, 61, 61});
                  return true;
               case 22847:
               case 22848:
               case 22849:
                  a(var1, new int[]{82, 6709, 7073}, new int[]{60, 54, 54});
                  return true;
               case 22850:
                  b(var1, 40);
                  return true;
               case 22851:
                  b(var1, 56);
                  return true;
               case 22852:
                  a(var1, new int[]{4027, 7105, 5056}, new int[]{40, 46, 40});
                  return true;
               case 22853:
                  a(var1, new int[]{32878, 38015, 38101, 37980}, new int[]{56, 56, 56, 56});
                  return true;
               case 22854:
                  if (var1 != null) {
                     var1.g(110, -1);
                     var1.g(8);
                  }

                  return true;
               case 22860:
                  a(var1, 9164, 60);
                  if (var1 != null) {
                     var1.g(0, -1);
                  }

                  if (var1 != null) {
                     var1.g(3);
                  }

                  return true;
               case 22861:
                  a(var1, 9164, 60);
                  if (var1 != null) {
                     var1.g(0, -1);
                  }

                  if (var1 != null) {
                     var1.g(127);
                  }

                  return true;
               case 22870:
                  b(var1, 53);
                  return true;
               case 22871:
                  a(
                     var1,
                     new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535},
                     new int[]{60, 54, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60}
                  );
                  return true;
               case 22873:
                  a(var1, new int[]{9152, 82, 123, 127}, new int[]{60, 54, 60, 54});
                  return true;
               case 22878:
                  a(var1, new int[]{3346, 5058, 6084, 8134, 37, 1441, 82, 7834, 1321, 24, 20, 7700}, new int[]{60, 54, 60, 54, 60, 54, 60, 54, 60, 60, 60, 54});
                  return true;
               case 22879:
                  a(var1, new int[]{61, 8758}, new int[]{60, 60});
                  return true;
               case 22881:
               case 27287:
                  a(var1, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 61, 60, 80, 60, 60, 60, 53});
                  return true;
               case 22882:
               case 27288:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{80, 61, 61, 61, 80, 80});
                  return true;
               case 22885:
               case 22886:
                  a(var1, new int[]{127, 815, 914, 675, 784, 4820, 945, 685, 5458, 972}, 52);
                  return true;
               case 22888:
                  a(var1, new int[]{8602, 49, 10520, 10529, 8722}, new int[]{60, 62, 60, 62, 62});
                  return true;
               case 22928:
                  a(
                     var1,
                     new int[]{21568, 0, 127, 55192, 54951, 55770, 54414, 52166, 55888, 55884, 56018, 56020},
                     new int[]{60, 54, 54, 60, 54, 54, 60, 60, 54, 54, 60, 60}
                  );
                  return true;
               case 22933:
                  a(var1, new int[]{960}, 52);
                  return true;
               case 22934:
                  a(var1, new int[]{960}, 54);
                  return true;
               case 22935:
                  a(var1, new int[]{5018}, 54);
                  return true;
               case 22947:
                  short var32 = 212;
                  byte var33 = 80;
                  var1.b(
                     new int[]{21652, 21658, 16904, 13248, 13204, 32920, 15320, 10448, 10462, 16656, 14259, 18, 22, 26},
                     new int[]{212, 212, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 212, 212}
                  );
                  return true;
               case 22948:
                  var1.b(
                     new int[]{38119, 127, 9118, 76, 9121, 68, 8097, 64, 198, 8092, 59, 4, 107, 10638, 61625, 10142},
                     new int[]{54, 54, 54, 60, 60, 60, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60}
                  );
                  return true;
               case 22949:
               case 27519:
                  a(var1, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{61, 60, 61, 60, 60});
                  return true;
               case 22950:
                  var1.a(914, new int[]{7114});
                  var1.a(918, new int[]{7114});
                  var1.a(934, new int[]{7114});
                  return true;
               case 22951:
               case 22952:
               case 22953:
                  if (var1 != null) {
                     var1.g(926);
                     var1.a(926, new int[]{926, 910, 905, 918, 7114});
                  }

                  return true;
               case 22964:
                  b(var1, 54);
                  return true;
               case 23003:
                  var1.a(5712, new int[]{2391});
                  var1.a(10714, new int[]{90});
                  return true;
               case 23007:
                  a(var1, new int[]{11171, 11175, 14102}, new int[]{60, 72, 60});
                  return true;
               case 23008:
               case 23009:
               case 23010:
               case 23011:
               case 23012:
                  a(var1, new int[]{10351, 2361, 2378, 220}, new int[]{55, 55, 55, 55});
                  return true;
               case 23017:
                  var1.a(
                     new int[]{
                        5084,
                        5088,
                        278,
                        266,
                        5074,
                        5078,
                        408,
                        5056,
                        5062,
                        4,
                        5070,
                        143,
                        273,
                        5054,
                        5058,
                        5094,
                        5050,
                        5068,
                        133,
                        2,
                        5086,
                        280,
                        7321,
                        267,
                        5092,
                        265,
                        5102,
                        5112,
                        270
                     },
                     5
                  );
                  return true;
               case 23018:
                  var1.b(
                     new int[]{
                        5084,
                        5088,
                        278,
                        266,
                        5074,
                        5078,
                        408,
                        5056,
                        5062,
                        4,
                        5070,
                        143,
                        273,
                        5054,
                        5058,
                        5094,
                        5050,
                        5068,
                        133,
                        2,
                        5086,
                        280,
                        7321,
                        267,
                        5092,
                        265,
                        5102,
                        5112,
                        270,
                        409,
                        406,
                        414,
                        411,
                        139,
                        137,
                        135,
                        816
                     },
                     new int[]{
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        179,
                        338,
                        338,
                        338,
                        338,
                        338,
                        338,
                        338,
                        338
                     }
                  );
                  return true;
               case 23019:
                  var1.b(new int[]{78, 5790, 5788}, new int[]{55, 72, 72});
                  return true;
               case 23020:
                  var1.b(new int[]{6032, 3994, 2974, 2983, 5010, 3990, 3996}, new int[]{55, 72, 55, 72, 72, 55, 55});
                  return true;
               case 23021:
                  var1.b(new int[]{8088, 7060, 5006, 528, 9123, 6034, 3982, 7845}, new int[]{55, 72, 55, 72, 72, 72, 59, 59});
                  return true;
               case 23026:
               case 23027:
               case 23028:
                  a(var1, new int[]{43992, 924, 11200, 78, 3738, 1556, 528, 4750}, new int[]{72, 55, 55, 55, 27, 72, 27, 27});
                  return true;
               case 23029:
                  a(var1, new int[]{10351, 7070}, new int[]{72, 55});
                  return true;
               case 23030:
                  a(var1, new int[]{127, 476, 960, 0, 9672}, new int[]{72, 55, 72, 55, 55});
                  return true;
               case 23033:
                  a(var1, new int[]{7335, 203, 7343, 5166, 7376, 7340, 5162, 5170, 911, 65535}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60});
                  return true;
               case 23038:
                  a(var1, new int[]{5268, 5392}, 54);
                  return true;
               case 23039:
                  a(var1, new int[]{10403, 10407}, 54);
                  return true;
               case 23040:
                  a(var1, new int[]{5276, 5293, 5289, 5285}, 54);
                  return true;
               case 23041:
                  a(var1, new int[]{5169, 5161}, 54);
                  return true;
               case 23042:
                  a(
                     var1,
                     new int[]{
                        7613,
                        7596,
                        133,
                        151,
                        35868,
                        35895,
                        35912,
                        35865,
                        35882,
                        35875,
                        35888,
                        35905,
                        35856,
                        35873,
                        35866,
                        6303,
                        35879,
                        35840,
                        35862,
                        35855,
                        6317,
                        35886,
                        6292,
                        1058,
                        1070,
                        1051,
                        1097,
                        54,
                        49,
                        39,
                        32,
                        64,
                        59,
                        45,
                        31,
                        6297,
                        40,
                        50,
                        85,
                        23,
                        6302,
                        35900
                     },
                     new int[]{
                        55,
                        55,
                        55,
                        55,
                        72,
                        72,
                        72,
                        55,
                        72,
                        72,
                        55,
                        72,
                        72,
                        55,
                        72,
                        55,
                        72,
                        72,
                        72,
                        72,
                        55,
                        72,
                        55,
                        55,
                        55,
                        55,
                        72,
                        55,
                        72,
                        72,
                        72,
                        72,
                        72,
                        72,
                        72,
                        55,
                        55,
                        55,
                        55,
                        55,
                        55,
                        72
                     }
                  );
                  return true;
               case 23047:
                  a(var1, new int[]{10270, 10285}, new int[]{63, 71});
                  return true;
               case 23048:
                  a(var1, new int[]{852, 935, 9152, 9015, 10060, 9019, 9174}, new int[]{71, 63, 71, 63, 71, 63, 63});
                  return true;
               case 23049:
               case 23050:
               case 23051:
               case 23052:
                  b(var1, 66);
                  return true;
               case 23054:
                  var1.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                  a(
                     var1,
                     new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355},
                     new int[]{60, 57, 60, 57, 60, 57, 60, 57, 60, 57, 57, 60}
                  );
                  return true;
               case 23055:
                  b(var1, 111);
                  return true;
               case 23056:
                  a(var1, new int[]{920, 0, 103}, new int[]{111, 73, 111});
                  return true;
               case 23057:
               case 25954:
                  a(var1, new int[]{65535, 0, 78, 920}, new int[]{73, 73, 111, 73});
                  return true;
               case 23058:
                  a(var1, new int[]{78, 103, 920, 0}, new int[]{111, 111, 73, 73});
                  return true;
               case 23060:
                  a(var1, new int[]{86, 0, 103, 82, 90, 78, 66}, new int[]{60, 86, 60, 97, 97, 86, 86});
                  var1.g(30, -1);
                  var1.g(2);
                  return true;
               case 23061:
                  a(var1, new int[]{10266, 10258, 10283, 10291, 10275, 10262}, new int[]{60, 60, 86, 86, 60, 86});
                  var1.g(30, -1);
                  var1.g(2);
                  return true;
               case 23062:
                  a(var1, new int[]{33690, 33701, 6067, 68, 51, 39}, new int[]{60, 62, 61, 40, 57, 40});
                  return true;
               case 23064:
                  a(var1, new int[]{10462, 10448, 127, 10475, 52797, 52919, 51763, 55207, 52777}, new int[]{60, 62, 61, 40, 57, 57, 62, 57, 40});
                  return true;
               case 23067:
                  a(var1, new int[]{9529, 5008}, new int[]{59, 59});
                  return true;
               case 23068:
                  a(var1, new int[]{9529, 5008}, new int[]{62, 62});
                  return true;
               case 23069:
                  a(var1, new int[]{61, 57, 70, 5912, 6930}, new int[]{59, 59, 59, 62, 62});
                  return true;
               case 23071:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989}, new int[]{60, 62, 60, 62, 62, 60, 60});
                  return true;
               case 23072:
                  a(var1, new int[]{61, 924, 916, 932}, new int[]{60, 62, 60, 60});
                  return true;
               case 23073:
                  a(var1, new int[]{7690}, new int[]{62});
                  return true;
               case 23074:
                  byte var4 = 62;
                  byte var5 = 60;
                  a(
                     var1,
                     new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535},
                     new int[]{62, 60, 62, 60, 62, 60, 60, 60, 60, 60, 60, 60}
                  );
                  return true;
               case 23075:
                  byte var3 = 62;
                  a(
                     var1,
                     new int[]{
                        35251,
                        35247,
                        32856,
                        32852,
                        35255,
                        16462,
                        17500,
                        35259,
                        35264,
                        22464,
                        35270,
                        15434,
                        16450,
                        16466,
                        58419,
                        16470,
                        54313,
                        54317,
                        54309,
                        54290,
                        58539,
                        54302,
                        54298,
                        40757,
                        40637,
                        37828,
                        40871
                     },
                     new int[]{62, 62, 62, 62, 62, 62, 60, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62}
                  );
                  return true;
               case 23109:
                  a(var1, new int[]{33569, 24474}, new int[]{56, 58});
                  return true;
               case 23110:
                  a(var1, new int[]{43115, 41783, 127}, new int[]{72, 81, 72});
                  return true;
               case 23112:
                  a(var1, new int[]{929, 918, 924, 935, 24}, new int[]{62, 62, 62, 62, 60});
                  return true;
               case 23137:
                  var1.a(127, new int[]{1});
                  var1.a(90, new int[]{5});
                  var1.a(107, new int[]{10});
                  var1.a(115, new int[]{15});
                  a(var1, new int[]{38333}, new int[]{61});
                  return true;
               case 23141:
               case 23142:
               case 23143:
                  a(var1, new int[]{36253, 36133, 37165, 51111, 51133, 10502, 52122, 36257}, new int[]{60, 60, 60, 54, 54, 54, 54, 54});
                  return true;
               case 23160:
                  a(var1, new int[]{22, 21656, 21656, 18, 16656, 14259}, 80);
                  return true;
               case 23162:
               case 23163:
                  a(var1, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{63, 63, 60, 60, 60});
                  return true;
               case 23170:
                  a(
                     var1,
                     new int[]{
                        37403, 8004, 8136, 38672, 38305, 38313, 38309, 38424, 38300, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411
                     },
                     new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54}
                  );
                  if (var1 != null) {
                     var1.g(311770);
                     var1.g(0, -1);
                  }

                  return true;
               case 23172:
                  byte var15 = 69;
                  var1.b(
                     new int[]{
                        10266, 21662, 10270, 10274, 10280, 10282, 9402, 10288, 10284, 10277, 10296, 10291, 10262, 21657, 7176, 11320, 7217, 11333, 11343, 7208
                     },
                     new int[]{54, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 54}
                  );
                  var1.g(3);
                  var1.g(0, -1);
                  return true;
               case 23174:
                  a(var1, new int[]{52, 103, 1945, 50, 42, 162, 5301, 5293, 10281}, new int[]{2, 60, 5, 2, 2, 2, 2, 60, 60});
                  var1.g(0, -1);
                  return true;
               case 23175:
                  var1.a(20, new int[]{7});
                  a(var1, new int[]{8396, 8417}, new int[]{52, 52});
                  return true;
               case 23180:
                  a(var1, new int[]{22447, 22451, 22457, 906, 898, 910, 908, 904, 902}, new int[]{61, 61, 61, 61, 61, 62, 61, 62, 61});
                  return true;
               case 23202:
                  var1.a(24, new int[]{1});
                  var1.a(16, new int[]{1});
                  var1.a(33, new int[]{1});
                  var1.a(41, new int[]{1});
                  var1.a(61, new int[]{62});
                  var1.a(20, new int[]{1});
                  var1.a(28, new int[]{1});
                  var1.a(37, new int[]{1});
                  var1.b(new int[]{1}, 10);
                  a(var1, new int[]{790, 796, 784, 536, 78, 49, 62}, new int[]{61, 61, 61, 61, 61, 53, 53});
                  return true;
               case 23203:
                  a(var1, new int[]{5231, 0}, new int[]{75, 60});
                  return true;
               case 23205:
                  a(var1, new int[]{933, 10351}, new int[]{68, 60});
                  return true;
               case 23206:
                  if (var1 != null) {
                     var1.a(8741, new int[]{3});
                  }

                  if (var1 != null) {
                     var1.a(7281, new int[]{15, 16, 17});
                  }

                  if (var1 != null) {
                     a(var1, new int[]{28318, 8078, 4550}, new int[]{61, 60, 60});
                  }

                  return true;
               case 23207:
                  if (var1 != null) {
                     var1.a(4626, new int[]{3});
                  }

                  if (var1 != null) {
                     var1.a(908, new int[]{3});
                  }

                  if (var1 != null) {
                     a(var1, new int[]{25238}, new int[]{60});
                  }

                  return true;
               case 23208:
                  if (var1 != null) {
                     var1.a(22412, new int[]{3, 4});
                  }

                  if (var1 != null) {
                     var1.a(26520, new int[]{10, 11, 12});
                  }

                  if (var1 != null) {
                     var1.a(25490, new int[]{15, 16, 17});
                  }

                  if (var1 != null) {
                     a(var1, new int[]{90}, new int[]{97});
                  }

                  return true;
               case 23209:
                  a(var1, new int[]{6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266}, new int[]{68, 68, 68, 60, 76, 76, 76, 76});
                  return true;
               case 23210:
                  if (var1 != null) {
                     var1.a(12, new int[]{1});
                     var1.a(0, new int[]{10});
                     a(var1, new int[]{127, 107}, new int[]{61, 61});
                  }

                  return true;
               case 23211:
               case 23212:
                  if (var1 != null) {
                     var1.a(12, new int[]{1});
                     var1.a(0, new int[]{10});
                     a(var1, new int[]{16}, new int[]{61});
                  }

                  return true;
               case 23213:
               case 23214:
               case 23215:
               case 23216:
                  if (var1 != null) {
                     var1.a(11200, new int[]{3});
                     var1.a(19367, new int[]{3});
                     var1.a(11177, new int[]{8, 9});
                     var1.a(9917, new int[]{3, 4});
                     a(var1, new int[]{939}, new int[]{61});
                  }

                  return true;
               case 23217:
                  a(var1, new int[]{61, 8757}, new int[]{110, 60});
                  return true;
               case 23218:
                  a(var1, new int[]{926, 10349, 0, 127}, new int[]{61, 60, 60, 60});
                  return true;
               case 23219:
                  a(var1, new int[]{926}, new int[]{61});
                  return true;
               case 23222:
                  if (var1 != null) {
                     var1.a(61, new int[]{3, 4});
                     var1.a(82, new int[]{3, 4});
                     a(var1, new int[]{8757, 22459, 82, 926, 5012}, new int[]{68, 68, 68, 68, 68});
                     var1.g(0, -1);
                  }

                  return true;
               case 23223:
                  var1.a(22410, new int[]{40});
                  a(var1, new int[]{2999}, new int[]{68});
                  var1.g(0, -1);
                  return true;
               case 23224:
                  var1.a(12, new int[]{1});
                  a(var1, new int[]{127, 107, 0}, new int[]{61, 61, 60});
                  return true;
               case 23225:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{60, 68, 60, 68, 68, 60, 60, 60, 60});
                  return true;
               case 23228:
                  b(var1, 53);
                  return true;
               case 23229:
                  a(var1, new int[]{4515, 16425, 14490}, 68);
                  return true;
               case 23460:
                  var1.b(new int[]{4510, 4502, 8128, 7093}, new int[]{60, 62, 62, 60});
                  return true;
               case 23462:
                  var1.a(7062, new int[]{16});
                  a(var1, new int[]{43059, 8128, 13248}, new int[]{53, 53, 53});
                  return true;
               case 23465:
                  var1.a(71, new int[]{1});
                  var1.a(72, new int[]{1});
                  var1.a(97, new int[]{3});
                  var1.a(98, new int[]{22});
                  var1.a(88, new int[]{127});
                  var1.a(89, new int[]{127});
                  a(var1, new int[]{3, 22}, new int[]{60, 60});
                  var1.g(0, -1);
                  return true;
               case 23466:
                  var1.a(7721, new int[]{127});
                  var1.a(20, new int[]{1});
                  var1.a(0, new int[]{127});
                  var1.a(6932, new int[]{3});
                  var1.g(0, -1);
                  return true;
               case 23467:
                  var1.a(20, new int[]{7114});
                  var1.a(6932, new int[]{7114});
                  return true;
               case 23468:
                  var1.a(7721, new int[]{1});
                  var1.a(20, new int[]{7114});
                  var1.a(0, new int[]{127});
                  var1.a(6932, new int[]{7114});
                  a(var1, new int[]{7114}, new int[]{54});
                  return true;
               case 23471:
                  var1.a(33001, new int[]{9});
                  var1.a(6430, new int[]{9});
                  var1.a(6435, new int[]{29});
                  var1.a(6439, new int[]{29});
                  var1.a(6315, new int[]{29});
                  var1.a(6554, new int[]{29});
                  a(var1, new int[]{32995, 9}, new int[]{76, 105});
                  return true;
               case 23472:
                  var1.a(6439, new int[]{3});
                  var1.a(6323, new int[]{2});
                  var1.a(33001, new int[]{3, 4, 5, 6, 7});
                  a(var1, new int[]{3, 4, 5, 6, 7}, new int[]{76, 60, 60, 105, 60});
                  return true;
               case 23474:
                  var1.a(new int[]{712, 152}, new int[]{13});
                  var1.a(new int[]{262, 167, 0, 980, 962, 272, 582, 158}, new int[]{5});
                  var1.a(new int[]{955}, new int[]{1});
                  var1.a(new int[]{65459, 43968, 20288}, new int[]{380770});
                  var1.b(new int[]{846, 728, 945}, new int[]{74, 74, 54});
                  return true;
               case 23478:
                  var1.a(new int[]{5, 15, 25});
                  return true;
               case 23479:
                  var1.a(new int[]{33001});
                  return true;
               case 23480:
                  var1.g(45000);
                  return true;
               case 23481:
                  var1.g(64);
                  return true;
               case 23482:
                  var1.g(6100);
                  return true;
               case 23483:
                  var1.g(58000);
                  return true;
               case 23485:
                  a(var1, new int[]{10283, 8377, 24, 7333, 8390}, new int[]{57, 57, 57, 57, 57});
                  return true;
               case 23486:
                  if (var1 != null) {
                     var1.a(35, new int[]{12});
                     var1.a(72, new int[]{3});
                     var1.a(76, new int[]{6});
                     var1.a(8635, new int[]{22});
                     a(var1, new int[]{8636, 73, 77, 80, 36, 0, 8625, 68, 8644, 8646, 55, 119, 123}, new int[]{57, 57, 57, 60, 60, 76, 60, 57, 57, 40, 57, 57});
                  }

                  return true;
               case 23487:
               case 23488:
               case 23489:
                  a(var1, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, 57);
                  return true;
               case 23490:
                  var1.a(71, new int[]{1});
                  var1.a(72, new int[]{1});
                  var1.a(97, new int[]{3});
                  var1.a(98, new int[]{22});
                  var1.a(88, new int[]{4});
                  var1.a(89, new int[]{4});
                  a(var1, new int[]{3, 22, 4}, new int[]{57, 57, 57});
                  return true;
               case 23491:
                  byte var23 = 109;
                  byte var24 = 102;
                  byte var25 = 81;
                  a(
                     var1,
                     new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935},
                     new int[]{102, 109, 109, 109, 109, 109, 109, 102, 102, 102, 102, 81}
                  );
                  return true;
               case 23492:
                  var1.a(43113, new int[]{4});
                  var1.a(43092, new int[]{4});
                  var1.a(43121, new int[]{4});
                  var1.a(43117, new int[]{4});
                  var1.a(43096, new int[]{4});
                  a(var1, new int[]{4}, new int[]{93});
                  return true;
               case 23493:
                  if (var1 != null) {
                     a(var1, new int[]{10351}, new int[]{139});
                  }

                  return true;
               case 23494:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{109, 102, 102, 102, 109, 109});
                  return true;
               case 23621:
               case 26108:
                  if (var1 != null) {
                     var1.a(6583, new int[]{6});
                     var1.a(6604, new int[]{8, 7, 6});
                     var1.a(6587, new int[]{6, 5, 4});
                     var1.a(6464, new int[]{4});
                     var1.a(60065, new int[]{4});
                     var1.a(60184, new int[]{4});
                     a(var1, new int[]{4, 5, 6, 7, 8}, new int[]{51, 51, 60, 60, 51});
                  }

                  return true;
               case 23622:
                  if (var1 != null) {
                     var1.a(6583, new int[]{6});
                     var1.a(6604, new int[]{8, 7, 6});
                     var1.a(6587, new int[]{6, 5, 4});
                     var1.a(6464, new int[]{4});
                     var1.a(60065, new int[]{4});
                     var1.a(60184, new int[]{4});
                     a(var1, new int[]{4, 5, 6, 7, 8}, new int[]{61, 61, 60, 60, 61});
                  }

                  return true;
               case 23624:
                  if (var1 != null) {
                     var1.g(23);
                     var1.b(new int[]{23}, new int[]{74});
                  }

                  return true;
               case 23625:
               case 27525:
               case 27526:
                  if (var1 != null) {
                     var1.b(new int[]{5916, 4882, 54177}, new int[]{76, 157, 172});
                  }

                  return true;
               case 23626:
               case 27529:
               case 27530:
                  if (var1 != null) {
                     var1.b(new int[]{10283, 6829}, new int[]{157, 60});
                  }

                  return true;
               case 23627:
                  if (var1 != null) {
                     var1.a(22024, new int[]{374390});
                     var1.a(21776, new int[]{905});
                     var1.a(22402, new int[]{905});
                     var1.b(new int[]{905, 904, 929, 103, 910, 374390}, new int[]{54, 54, 54, 54, 74, 148});
                  }

                  return true;
               case 23628:
                  if (var1 != null) {
                     var1.a(22024, new int[]{47627});
                     var1.a(21776, new int[]{905});
                     var1.a(22402, new int[]{905});
                     var1.b(new int[]{905, 904, 929, 103, 910, 47627}, new int[]{52, 52, 52, 52, 63, 179});
                  }

                  return true;
               case 23629:
                  if (var1 != null) {
                     var1.a(22024, new int[]{127});
                     var1.a(21776, new int[]{905});
                     var1.a(22402, new int[]{905});
                     var1.b(new int[]{905, 904, 929, 103, 910, 127}, new int[]{60, 60, 60, 60, 97, 254});
                     var1.g(0, -1);
                  }

                  return true;
               case 23630:
               case 27531:
               case 27532:
                  if (var1 != null) {
                     var1.b(new int[]{10283, 6829}, new int[]{159, 76});
                  }

                  return true;
               case 23631:
                  if (var1 != null) {
                     var1.g(23);
                     var1.a(23, new int[]{24, 23});
                     var1.b(new int[]{23, 24}, new int[]{157, 60});
                  }

                  return true;
               case 23632:
                  if (var1 != null) {
                     var1.g(23);
                     var1.a(23, new int[]{24, 23});
                     var1.b(new int[]{23, 24}, new int[]{159, 76});
                  }

                  return true;
               case 23633:
                  a(var1, new int[]{6464, 25129}, new int[]{152, 172});
                  return true;
               case 23635:
                  a(var1, new int[]{43059}, new int[]{124});
                  return true;
               case 23636:
                  if (var1 != null) {
                     a(var1, new int[]{10351}, new int[]{131});
                  }

                  return true;
               case 23637:
                  if (var1 != null) {
                     a(var1, new int[]{10351}, new int[]{76});
                  }

                  return true;
               case 23638:
                  if (var1 != null) {
                     var1.g(23);
                     var1.a(23, new int[]{24, 23});
                     var1.b(new int[]{23, 24}, new int[]{124, 102});
                  }

                  return true;
               case 23650:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{102, 124, 118, 124, 102, 118, 102, 124, 124});
                  return true;
               case 23651:
                  if (var1 != null) {
                     var1.g(23);
                     var1.a(23, new int[]{24, 23});
                     var1.b(new int[]{23, 24}, new int[]{156, 102});
                  }

                  return true;
               case 23652:
                  a(var1, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{102, 156, 118, 156, 102, 118, 102, 156, 156});
                  return true;
               case 23653:
                  a(var1, new int[]{5318}, new int[]{142});
                  return true;
               case 23654:
                  a(var1, new int[]{926}, new int[]{156});
                  return true;
               case 23655:
                  if (var1 != null) {
                     var1.a(0, new int[]{1});
                     var1.a(24, new int[]{1});
                     var1.a(37, new int[]{1});
                     a(var1, new int[]{49, 66, 19379, 26537, 128, 104, 87}, new int[]{194, 194, 60, 60, 58, 58, 58});
                  }

                  return true;
               case 23656:
                  if (var1 != null) {
                     var1.a(0, new int[]{1});
                     var1.a(24, new int[]{1});
                     var1.a(37, new int[]{1});
                     a(var1, new int[]{49, 66, 19379, 26537, 127, 103, 86}, new int[]{156, 156, 60, 60, 139, 139, 139});
                  }

                  return true;
               case 23657:
               case 23658:
               case 23659:
                  var1.i(7114);
                  return true;
               case 23660:
               case 23661:
               case 23662:
                  a(var1, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411, 960}, new int[]{93, 93, 93, 93, 93, 93, 93, 93, 93, 212});
                  return true;
               case 23663:
               case 23664:
               case 23665:
                  var1.a(8741, new int[]{25092});
                  var1.a(25238, new int[]{25092});
                  var1.a(38814, new int[]{25092});
                  var1.a(24, new int[]{37642});
                  a(var1, new int[]{37642}, new int[]{156});
                  return true;
               case 23666:
                  var1.a(40, new int[]{212});
                  var1.a(924, new int[]{12});
                  var1.a(6032, new int[]{34});
                  return true;
               case 23905:
                  a(var1, new int[]{933, 10351}, new int[]{156, 102});
                  return true;
               case 23906:
                  var1.a(6674, new int[]{25092});
                  var1.a(6430, new int[]{25092});
                  var1.a(6554, new int[]{25092});
                  var1.a(6550, new int[]{25092});
                  a(var1, new int[]{18}, new int[]{156});
                  return true;
               case 23907:
                  a(var1, new int[]{61, 8757}, new int[]{213, 60});
                  return true;
               case 23908:
                  a(
                     var1,
                     new int[]{54298, 54298, 54817, 16, 12, 54302, 54294, 54290, 54298, 54817, 16, -11234, -11242, -11246, -11238, -10719},
                     new int[]{213, 213, 213, 102, 60, 61, 102, 102, 102, 102, 213, 213, 102, 102, 213, 213}
                  );
                  return true;
               case 23909:
                  a(
                     var1,
                     new int[]{
                        59449, 43294, 43311, 59437, 43088, 43105, 6736, 43096, 6736, 6709, 59449, 6602, 43294, 43311, 3346, 6699, 59437, 43088, 43105, 7124
                     },
                     new int[]{213, 213, 213, 61, 213, 213, 61, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102}
                  );
                  return true;
               case 23910:
                  a(
                     var1,
                     new int[]{284, 960, 939, 53, 33, 12, 28, 284, 417, 555, 20, 960, 939},
                     new int[]{213, 213, 213, 102, 102, 61, 102, 102, 102, 102, 102, 102, 102}
                  );
                  return true;
               case 23930:
                  var1.a(0, new int[]{5});
                  var1.a(8, new int[]{461745});
                  var1.a(20, new int[]{461745});
                  var1.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{461745});
                  var1.g(-10, -1);
                  return true;
               case 23932:
                  a(
                     var1,
                     new int[]{
                        7613,
                        7596,
                        133,
                        151,
                        35868,
                        35895,
                        35912,
                        35865,
                        35882,
                        35875,
                        35888,
                        35905,
                        35856,
                        35873,
                        35866,
                        6303,
                        35879,
                        35840,
                        35862,
                        35855,
                        6317,
                        35886,
                        6292,
                        1058,
                        1070,
                        1051,
                        1097,
                        54,
                        49,
                        39,
                        32,
                        64,
                        59,
                        45,
                        31,
                        6297,
                        40,
                        50,
                        85,
                        23,
                        6302,
                        35900
                     },
                     new int[]{
                        111,
                        111,
                        111,
                        111,
                        60,
                        60,
                        60,
                        111,
                        60,
                        60,
                        111,
                        60,
                        60,
                        111,
                        60,
                        111,
                        60,
                        60,
                        60,
                        60,
                        111,
                        60,
                        111,
                        111,
                        111,
                        111,
                        60,
                        111,
                        60,
                        60,
                        60,
                        60,
                        60,
                        60,
                        60,
                        111,
                        111,
                        111,
                        111,
                        111,
                        111,
                        60
                     }
                  );
                  return true;
               case 23933:
                  var1.b(new int[]{256, 256, 71, 71, 71});
                  return true;
               case 23934:
                  var1.a(5231, new int[]{3, 4});
                  a(var1, new int[]{3, 4, 0}, new int[]{60, 57, 60});
                  return true;
               case 23935:
               case 23936:
               case 23937:
               case 23938:
               case 23939:
                  var1.a(127, new int[]{6});
                  var1.a(111, new int[]{4});
                  var1.a(0, new int[]{930});
                  var1.a(557, new int[]{900});
                  var1.a(563, new int[]{930});
                  var1.a(571, new int[]{915});
                  var1.a(43456, new int[]{8});
                  var1.a(10948, new int[]{11});
                  var1.a(43445, new int[]{10});
                  var1.a(43462, new int[]{7});
                  var1.a(21941, new int[]{6});
                  var1.a(21956, new int[]{5});
                  var1.a(11059, new int[]{14});
                  var1.a(10939, new int[]{14});
                  var1.a(21947, new int[]{11});
                  var1.a(8, new int[]{905});
                  var1.a(16, new int[]{910});
                  return true;
               case 23940:
                  var1.a(78, new int[]{925});
                  var1.a(5790, new int[]{2});
                  return true;
               case 23941:
                  if (var1 != null) {
                     var1.g(23);
                     var1.b(new int[]{23}, new int[]{261});
                  }

                  return true;
               case 23942:
                  a(var1, new int[]{933, 10351}, new int[]{261, 258});
                  return true;
               case 23943:
                  a(var1, new int[]{926, 10349, 0, 127}, new int[]{261, 258, 258, 258});
                  return true;
               case 23944:
                  a(var1, new int[]{926}, new int[]{261});
                  return true;
               case 23950:
                  var1.a(new int[]{20}, new int[]{1, 1, 1, 1, 2, 2, 2});
                  var1.b(new int[]{1, 2, 28, 127}, new int[]{262, 120, 140, 140});
                  return true;
               case 23952:
                  var1.a(new int[]{163, 167, 138, 70}, new int[]{1337});
                  var1.a(new int[]{158, 154, 26, 30, 53, 61, 35}, new int[]{1338});
                  var1.a(new int[]{66, 57}, new int[]{1339});
                  var1.b(new int[]{1337, 1338, 1339}, new int[]{120, 262, 140});
                  return true;
               case 23953:
                  a(var1, new int[]{5813, 26006, 9139}, new int[]{60, 59, 59});
                  return true;
               case 23954:
                  var1.g(23);
                  var1.g(0, -1);
                  return true;
               case 23955:
                  if (var1 != null) {
                     var1.b(new int[]{16425, 14490, 4515, 7349, 8361}, new int[]{261, 261, 68, 68, 68});
                  }

                  return true;
               case 23956:
                  var1.a(new int[]{2225, 2229, 2237, 2221}, new int[]{1});
                  var1.a(new int[]{3235, 3239, 3230, 3243, 43074, 43090}, new int[]{2});
                  var1.b(new int[]{1, 2}, new int[]{261, 186});
                  return true;
               case 23958:
                  a(var1, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 20416}, new int[]{57, 60, 57, 60, 57, 60, 60, 62});
                  return true;
               case 23959:
                  a(var1, new int[]{6573, 410, 33300, 33676, 33036}, new int[]{57, 60, 60, 60, 57});
                  return true;
               case 23960:
                  a(var1, new int[]{10279, 127, 11}, new int[]{60, 57, 57});
                  return true;
               case 23961:
                  var1.a(new int[]{2, 1, 2});
                  a(var1, new int[]{1, 2}, new int[]{57, 60});
                  return true;
               case 23962:
               case 23963:
                  a(var1, new int[]{10165, 10176, 9812, 22451, 36007, 6573, 410, 33300, 33676}, new int[]{57, 57, 57, 57, 57, 57, 60, 60, 60});
                  return true;
               case 23964:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{57, 57, 57, 60, 60, 60});
                  return true;
               case 23965:
               case 23971:
               case 23977:
                  b(var1, 163);
                  return true;
               case 23966:
               case 23972:
               case 23978:
                  b(var1, 56);
                  return true;
               case 23967:
               case 23973:
               case 23979:
                  b(var1, 221);
                  return true;
               case 23968:
               case 23974:
               case 23980:
                  b(var1, 63);
                  return true;
               case 23969:
               case 23975:
               case 23981:
                  b(var1, 206);
                  return true;
               case 23970:
               case 23976:
               case 23982:
                  b(var1, 71);
                  return true;
               case 23984:
               case 27527:
               case 27528:
                  if (var1 != null) {
                     var1.b(new int[]{5916, 4882, 54177}, new int[]{207, 159, 159});
                  }

                  return true;
               case 23988:
                  if (var1 != null) {
                     var1.a(22024, new int[]{127, 126});
                     var1.a(21776, new int[]{905});
                     var1.a(22402, new int[]{905});
                     short var16 = 259;
                     short var17 = 197;
                     var1.b(new int[]{905, 904, 929, 103, 910, 127, 126}, new int[]{259, 259, 259, 259, 259, 197, 197});
                     var1.g(0, -1);
                  }

                  return true;
               case 24023:
               case 24024:
                  var1.a(61, new int[]{62});
                  if (var2 == 24024) {
                     var1.a(24, new int[]{1});
                     var1.a(16, new int[]{1});
                     var1.a(33, new int[]{1});
                     var1.a(41, new int[]{1});
                     var1.a(20, new int[]{790});
                     var1.a(28, new int[]{1});
                     var1.a(37, new int[]{1});
                     var1.b(new int[]{1}, 10);
                     a(var1, new int[]{790, 796, 784, 536, 78, 49, 62}, new int[]{140, 140, 140, 140, 140, 140, 140});
                  } else {
                     a(var1, new int[]{790, 796, 784, 536, 49, 62}, new int[]{58, 58, 58, 58, 58, 58});
                  }

                  return true;
               case 24025:
                  var1.b(new int[]{61}, new int[]{140});
                  return true;
               case 24042:
               case 24043:
                  var1.a(0, new int[]{34770, 380770, 380770, 34770, 34770, 380770});
                  var1.a(8, new int[]{380770});
                  var1.a(20, new int[]{34770});
                  var1.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{380770});
                  if (var2 == 24043) {
                     var1.b(new int[]{380770, 34770}, new int[]{72, 55});
                  }

                  return true;
               case 24049:
                  var1.a(914, new int[]{350770});
                  var1.a(918, new int[]{350770});
                  var1.a(934, new int[]{350770});
                  return true;
               case 24069:
               case 24076:
                  a(var1, new int[]{21, 24, 12, 941}, new int[]{60, 54, 60, 54});
                  return true;
               case 24070:
               case 24071:
               case 24077:
               case 24078:
                  byte var26 = 54;
                  byte var27 = 60;
                  a(var1, new int[]{12, 0, 28, 941, 943, 406, 530, 280, 148, 152}, new int[]{54, 54, 54, 60, 60, 60, 54, 54, 54, 54});
                  return true;
               case 24072:
               case 24074:
               case 28046:
                  a(
                     var1,
                     new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24},
                     new int[]{54, 60, 54, 60, 54, 60, 54, 60, 60, 60, 60, 60, 54}
                  );
                  return true;
               case 24073:
               case 24075:
               case 28047:
                  a(var1, new int[]{21563, 21580, 21559, 33678, 21555, 28, 82}, new int[]{60, 54, 60, 60, 60, 54, 54});
                  return true;
               case 24079:
               case 24080:
               case 24081:
               case 24082:
                  if (var1 != null) {
                     var1.a(14395, new int[]{7, 8, 9});
                     a(var1, new int[]{14387, 127, 85}, new int[]{54, 54, 54});
                  }

                  return true;
               case 24083:
                  var1.a(61, new int[]{7, 8, 9});
                  a(var1, new int[]{7, 8, 9, 8757}, new int[]{54, 60, 60, 60});
                  return true;
               case 24093:
                  var1.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                  a(
                     var1,
                     new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355},
                     new int[]{60, 53, 60, 53, 60, 53, 60, 53, 60, 53, 53, 60}
                  );
                  return true;
               case 24095:
                  a(var1, new int[]{7079, 8111, 8107}, new int[]{53, 61, 61});
                  return true;
               case 24100:
                  if (var1 != null) {
                     var1.a(12, new int[]{6});
                     var1.a(90, new int[]{6});
                     var1.a(85, new int[]{6});
                     var1.a(70, new int[]{4});
                     var1.a(61, new int[]{4});
                     var1.a(53, new int[]{4});
                     var1.a(45, new int[]{4});
                     var1.a(0, new int[]{1});
                     a(
                        var1,
                        new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 74, 7050, 88, 78},
                        new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54}
                     );
                  }

                  return true;
               case 24101:
               case 24102:
                  if (var1 != null) {
                     var1.a(12, new int[]{6});
                     var1.a(7050, new int[]{18});
                     var1.a(90, new int[]{12});
                     var1.a(85, new int[]{6});
                     var1.a(78, new int[]{4});
                     var1.a(74, new int[]{4});
                     var1.a(61, new int[]{4});
                     var1.a(53, new int[]{4});
                     var1.a(45, new int[]{4});
                     var1.a(0, new int[]{1});
                     a(
                        var1,
                        new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 70},
                        new int[]{54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54}
                     );
                  }

                  return true;
               case 24110:
                  if (var1 != null) {
                     var1.b(
                        new int[]{
                           5525,
                           5401,
                           5405,
                           4013,
                           5014,
                           4009,
                           3889,
                           5648,
                           2977,
                           4783,
                           4665,
                           4903,
                           43086,
                           43094,
                           4669,
                           4674,
                           5002,
                           5840,
                           5832,
                           4653,
                           4005,
                           3881,
                           3757,
                           3761,
                           4001,
                           4003,
                           4785,
                           4779,
                           3982,
                           4657,
                           6717,
                           6713,
                           6709,
                           3885,
                           4649,
                           6722,
                           4661,
                           4781,
                           4777,
                           3765
                        },
                        new int[]{
                           104,
                           132,
                           132,
                           132,
                           132,
                           132,
                           132,
                           128,
                           128,
                           55,
                           128,
                           55,
                           132,
                           132,
                           132,
                           132,
                           132,
                           104,
                           132,
                           128,
                           55,
                           128,
                           128,
                           132,
                           132,
                           132,
                           132,
                           132,
                           55,
                           55,
                           55,
                           55,
                           55,
                           128,
                           55,
                           128,
                           81,
                           128,
                           128,
                           128
                        }
                     );
                     var1.h(37226);
                  }

                  return true;
               case 24114:
                  a(var1, new int[]{3346, 5058, 6084, 8134, 37, 1441, 82, 7834, 1321, 24, 20, 7700}, new int[]{72, 55, 55, 72, 55, 72, 55, 72, 72, 72, 72, 72});
                  return true;
               case 24115:
                  var1.a(35, new int[]{36172});
                  var1.a(72, new int[]{59728});
                  var1.a(76, new int[]{59708});
                  var1.a(8635, new int[]{59728});
                  var1.a(68, new int[]{59708});
                  a(
                     var1,
                     new int[]{8636, 73, 77, 80, 36, 0, 8625, 68, 8644, 8646, 55, 119, 123},
                     new int[]{132, 132, 132, 132, 132, 72, 132, 132, 132, 132, 132, 132}
                  );
                  return true;
               case 24116:
                  if (var1 != null) {
                     var1.a(107, new int[]{7646});
                     var1.a(910, new int[]{37216});
                     var1.a(912, new int[]{37212});
                     var1.a(1814, new int[]{37222});
                     var1.a(1938, new int[]{37212});
                     var1.a(1690, new int[]{37212});
                     var1.a(43908, new int[]{37162});
                  }

                  return true;
               case 24117:
                  if (var1 != null) {
                     var1.a(12, new int[]{7896});
                     var1.a(8, new int[]{7886});
                     var1.a(4, new int[]{7876});
                     var1.a(8412, new int[]{59738});
                     var1.a(900, new int[]{59738});
                     var1.a(0, new int[]{7646});
                     var1.a(898, new int[]{7646});
                     var1.a(55207, new int[]{59738});
                  }

                  return true;
               case 24118:
                  var1.a(9127, new int[]{36202});
                  var1.a(14990, new int[]{59755});
                  var1.a(14746, new int[]{59765});
                  var1.a(14742, new int[]{59735});
                  var1.a(14622, new int[]{59765});
                  var1.a(962, new int[]{59705});
                  var1.a(14866, new int[]{59755});
                  return true;
               case 24119:
               case 24120:
               case 24121:
                  if (var1 != null) {
                     var1.a(929, new int[]{7896});
                     var1.a(914, new int[]{7616});
                     var1.a(2954, new int[]{7606});
                     var1.a(127, new int[]{126});
                  }

                  return true;
               case 24122:
                  if (var1 != null) {
                     var1.g(23);
                     var1.a(23, new int[]{24, 23});
                     var1.b(new int[]{23, 24}, new int[]{256, 259});
                  }

                  return true;
               case 24123:
                  a(var1, new int[]{926}, new int[]{259});
                  return true;
               case 24124:
                  a(var1, new int[]{933, 10351}, new int[]{259, 256});
                  return true;
               case 24125:
                  if (var1 != null) {
                     var1.g(7646);
                  }

                  return true;
               case 24126:
                  var1.a(7335, new int[]{36172});
                  var1.a(202, new int[]{59724});
                  var1.a(7343, new int[]{59724});
                  var1.a(5165, new int[]{59724});
                  var1.a(7376, new int[]{36172});
                  var1.a(7339, new int[]{59724});
                  var1.a(5161, new int[]{36172});
                  var1.a(5169, new int[]{59724});
                  var1.a(910, new int[]{36172});
                  var1.a(65535, new int[]{36172});
                  return true;
               case 24127:
                  var1.a(7343, new int[]{59734});
                  var1.a(5165, new int[]{36172});
                  var1.a(7339, new int[]{36172});
                  var1.a(5161, new int[]{36172});
                  var1.a(5169, new int[]{59744});
                  var1.a(910, new int[]{36172});
                  var1.a(65535, new int[]{36172});
                  a(var1, new int[]{7335, 202, 7376}, new int[]{72, 72, 72});
                  return true;
               case 24128:
                  a(var1, new int[]{7335, 202, 7343, 5165, 7376, 7339, 5161, 5169, 910, 65535}, new int[]{55, 72, 55, 72, 55, 72, 55, 72, 55, 72});
                  return true;
               case 24130:
                  if (var1 != null) {
                     var1.a(7073, new int[]{36192});
                     var1.a(61, new int[]{59724});
                     var1.a(43117, new int[]{59724});
                  }

                  return true;
               case 24131:
                  if (var1 != null) {
                     var1.a(43117, new int[]{59954});
                     var1.a(61, new int[]{59724});
                     var1.a(7073, new int[]{5, 6});
                  }

                  a(var1, new int[]{5, 6}, new int[]{55, 72});
                  return true;
               case 24132:
                  a(var1, new int[]{7073, 43117}, new int[]{55, 72});
                  if (var1 != null) {
                     var1.a(61, new int[]{59724});
                  }

                  return true;
               case 24133:
                  if (var1 != null) {
                     var1.a(33, new int[]{36192});
                     var1.a(37, new int[]{59724});
                     var1.a(24, new int[]{36192});
                     var1.a(922, new int[]{59724});
                     var1.a(933, new int[]{36192});
                  }

                  return true;
               case 24134:
                  if (var1 != null) {
                     var1.a(922, new int[]{36192});
                     a(var1, new int[]{933, 33, 37, 24}, new int[]{55, 55, 55, 55});
                  }

                  return true;
               case 24135:
                  if (var1 != null) {
                     a(var1, new int[]{933, 33, 37, 24, 922}, new int[]{72, 72, 72, 72, 55});
                  }

                  return true;
               case 24139:
                  if (var1 != null) {
                     a(var1, new int[]{55772, 55733, 33, 57, 37, 49, 61}, new int[]{55, 55, 72, 72, 72, 72, 72});
                     var1.a(9026, new int[]{36192});
                     var1.a(8406, new int[]{59724});
                  }

                  return true;
               case 24171:
                  a(var1, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{66, 66, 66, 66, 96, 96});
                  return true;
               case 24176:
               case 24177:
               case 24178:
                  var1.a(8, new int[]{10});
                  var1.a(12, new int[]{12});
                  var1.a(16, new int[]{19});
                  var1.a(new int[]{43059, 43067, 36252, 43049}, new int[]{15});
                  a(var1, new int[]{36253, 36133, 37165, 51111, 51133, 10502, 52122, 36257, 20}, new int[]{140, 60, 140, 60, 140, 60, 60, 60, 140});
                  return true;
               case 24179:
                  a(var1, new int[]{4510, 4502, 8128, 7093}, new int[]{53, 55, 55, 53});
                  return true;
               case 24180:
                  a(var1, new int[]{4510, 4502}, new int[]{74, 74});
                  return true;
               case 24181:
                  a(var1, new int[]{4510, 4502, 8128, 7093}, new int[]{55, 89, 89, 55});
                  return true;
               case 24183:
                  a(var1, new int[]{4510, 4502, 8128, 7093}, new int[]{22, 71, 71, 22});
                  return true;
               case 24188:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{91, 115, 115, 115, 91, 91});
                  return true;
               case 24189:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{86, 130, 130, 130, 86, 86});
                  return true;
               case 24190:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{256, 191, 191, 191, 256, 256});
                  return true;
               case 24191:
                  a(var1, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{134, 263, 263, 263, 134, 134});
                  return true;
               case 24192:
               case 24193:
                  var1.a(61, new int[]{7, 8, 9});
                  a(var1, new int[]{7, 8, 9, 8757}, new int[]{60, 54, 60, 54});
                  return true;
               case 24194:
                  var1.a(914, new int[]{350770});
                  var1.a(918, new int[]{350770});
                  var1.a(934, new int[]{350770});
                  a(var1, new int[]{922, 929, 350770}, new int[]{60, 60, 54});
                  return true;
               case 24195:
                  var1.a(43113, new int[]{4});
                  var1.a(43092, new int[]{4});
                  var1.a(43121, new int[]{4});
                  var1.a(43117, new int[]{4});
                  var1.a(43096, new int[]{4});
                  a(var1, new int[]{4, 41372, 43328, 41257}, new int[]{60, 54, 54, 54});
                  return true;
               case 24204:
                  if (var1 != null) {
                     var1.a(43164, new int[]{15});
                     var1.a(43061, new int[]{3});
                     var1.a(43053, new int[]{3});
                     var1.a(43026, new int[]{3});
                     var1.a(5056, new int[]{902});
                     var1.a(3008, new int[]{950});
                     var1.a(24, new int[]{950});
                     var1.a(576, new int[]{920});
                     var1.a(594, new int[]{902});
                     var1.a(687, new int[]{905});
                     var1.a(703, new int[]{920});
                     var1.a(691, new int[]{920});
                     var1.a(671, new int[]{920});
                     a(var1, new int[]{950}, new int[]{113});
                  }

                  return true;
               case 24205:
                  if (var1 != null) {
                     var1.a(43164, new int[]{15});
                     var1.a(43061, new int[]{3});
                     var1.a(43053, new int[]{3});
                     var1.a(43026, new int[]{3});
                     var1.a(5056, new int[]{902});
                     var1.a(3008, new int[]{950});
                     var1.a(24, new int[]{950});
                     var1.a(576, new int[]{920});
                     var1.a(594, new int[]{902});
                     var1.a(687, new int[]{905});
                     var1.a(703, new int[]{920});
                     var1.a(691, new int[]{920});
                     var1.a(671, new int[]{920});
                     a(var1, new int[]{950}, new int[]{136});
                  }

                  return true;
               case 24206:
                  if (var1 != null) {
                     var1.a(43164, new int[]{15});
                     var1.a(43061, new int[]{3});
                     var1.a(43053, new int[]{3});
                     var1.a(43026, new int[]{3});
                     var1.a(5056, new int[]{902});
                     var1.a(3008, new int[]{950});
                     var1.a(24, new int[]{950});
                     var1.a(576, new int[]{920});
                     var1.a(594, new int[]{902});
                     var1.a(687, new int[]{905});
                     var1.a(703, new int[]{920});
                     var1.a(691, new int[]{920});
                     var1.a(671, new int[]{920});
                     a(var1, new int[]{950}, new int[]{138});
                  }

                  return true;
               case 24207:
                  if (var1 != null) {
                     var1.a(43164, new int[]{15});
                     var1.a(43061, new int[]{3});
                     var1.a(43053, new int[]{3});
                     var1.a(43026, new int[]{3});
                     var1.a(5056, new int[]{902});
                     var1.a(3008, new int[]{950});
                     var1.a(24, new int[]{950});
                     var1.a(576, new int[]{920});
                     var1.a(594, new int[]{902});
                     var1.a(687, new int[]{905});
                     var1.a(703, new int[]{920});
                     var1.a(691, new int[]{920});
                     var1.a(671, new int[]{920});
                     a(var1, new int[]{950}, new int[]{283});
                  }

                  return true;
               case 24221:
                  if (var1 != null) {
                     var1.g(0, -1);
                  }

                  a(var1, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{70, 70, 70, 70, 70, 60, 60, 70, 60});
                  if (var1 != null) {
                     var1.g(925);
                  }

                  return true;
               case 24225:
                  if (var1 != null) {
                     var1.g(50, -1);
                  }

                  a(var1, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{70, 70, 70, 70, 70, 60, 60, 70, 60});
                  if (var1 != null) {
                     var1.g(127);
                  }

                  return true;
               case 24236:
               case 24237:
               case 28790:
               case 28791:
                  var1.a(0, new int[]{350770, 933, 933, 350770, 350770, 933});
                  var1.a(8, new int[]{933});
                  var1.a(20, new int[]{350770});
                  var1.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{933});
                  if (var2 == 24237) {
                     var1.b(new int[]{933, 350770}, new int[]{58, 62});
                  }

                  return true;
               case 24249:
                  if (var1 != null) {
                     var1.g(0, -1);
                  }

                  byte var30 = 76;
                  byte var31 = 74;
                  a(
                     var1,
                     new int[]{3379, 3491, 78, 86, 3363, 18, 41, 109, 127, 59, 82, 75, 52, 57, 119, 97, 112, 73, 70, 48, 26},
                     new int[]{76, 76, 74, 76, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74}
                  );
                  if (var1 != null) {
                     var1.g(3);
                  }

                  return true;
               case 24250:
                  a(var1, new int[]{984}, new int[]{54});
                  return true;
               case 24262:
                  a(
                     var1,
                     new int[]{
                        37403, 8004, 8136, 38672, 38305, 38313, 38309, 38424, 38300, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411
                     },
                     new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71}
                  );
                  var1.g(7114);
                  return true;
               case 24419:
                  a(var1, new int[]{7608, 7624, 7632}, 53);
                  return true;
               case 25000:
                  a(var1, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 53);
                  return true;
               case 25001:
                  a(var1, new int[]{6447, 6443, 5652, 7479}, 53);
                  return true;
               case 25002:
                  a(var1, new int[]{3974, 3594, 2576, 2454, 1571, 1436, 1575}, 53);
                  return true;
               case 25003:
                  a(var1, new int[]{55180, 57228}, 53);
                  return true;
               case 25022:
               case 25023:
               case 25024:
                  a(var1, new int[]{695, 9152, 41920, 8755, 43550, 46016, 55977, 24512, 35365, 58316}, new int[]{54, 54, 54, 54, 54, 54, 60, 60, 60, 60});
                  return true;
               case 25106:
                  a(var1, new int[]{123, 127, 22410, 11200, 29113, 908, 937}, new int[]{54, 54, 54, 54, 54, 54, 54});
                  return true;
               case 25407:
                  var1.b(new int[]{5813, 26006, 9139}, new int[]{58, 72, 72});
                  return true;
               case 25424:
                  a(var1, new int[]{43059, 8128}, new int[]{58, 58});
                  if (var1 != null) {
                     var1.a(new int[]{4510, 4502, 7093}, new int[]{5, 10, 15});
                  }

                  return true;
               case 25537:
                  if (var1 != null) {
                     a(var1, new int[]{10351}, new int[]{124});
                  }

                  return true;
               case 27422:
                  var1.a(new int[]{5, 10, 5, 347770});
                  return true;
               case 27423:
                  var1.a(new int[]{5, 10, 5, 51136});
                  return true;
               case 27424:
                  var1.a(new int[]{5, 10, 5, 461770});
                  return true;
               case 28709:
               case 28710:
               case 28711:
                  byte var13 = 60;
                  byte var14 = 53;
                  var1.a(0, new int[]{1});
                  var1.b(
                     new int[]{43449, 36007, 20, 8418, 1, 935, 28969, 43116, 43340, 43450, 43440, 6573, 411, 10258, 24, 12, 20, 16},
                     new int[]{53, 53, 60, 60, 53, 53, 60, 60, 60, 60, 60, 60, 60, 60, 60, 53, 53, 53}
                  );
                  var1.g(80);
                  var1.a(80, new int[]{7, 8, 10});
                  var1.a(94, new int[]{20, 25, 30});
                  return true;
               default:
                  return false;
            }
         }
      }
   }

   public static void b(rs.p_a.C_h var0, int var1) {
      if (var0 != null) {
         var0.b(var1);
      }
   }

   public static void a(rs.p_a.C_h var0, int var1, int var2) {
      if (var0 != null) {
         var0.e(var1, var2);
      }
   }

   public static void a(rs.p_a.C_h var0, int[] var1, int var2) {
      if (var0 != null) {
         var0.a(var1, var2);
      }
   }

   public static void a(rs.p_a.C_h var0, int[] var1, int[] var2) {
      if (var0 != null) {
         var0.b(var1, var2);
      }
   }

   public static Image a(int var0, int var1) {
      rs.p_l.C_F_uc var2 = a(var0, var1, 0);
      if (var2 == null) {
         return null;
      } else {
         for (int var3 = 0; var3 < var2.m.length; var3++) {
            if (var2.m[var3] == 0 || var2.m[var3] == -1) {
               var2.m[var3] = 0;
            }
         }

         Image var4 = var2.a(32, 32);
         return rs.p_l.C_F_uc.a(var4, new Color(0, 0, 0));
      }
   }

   public static void a() {
      l = null;
      k = null;
      aF = null;
      y = null;
      aC = null;
   }

   public boolean a(int var1) {
      int var2 = this.B;
      int var3 = this.s;
      if (var1 == 1) {
         var2 = this.Y;
         var3 = this.z;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!rs.p_a.C_h.b(var2, this.ar)) {
            var4 = false;
         }

         if (var3 != -1 && !rs.p_a.C_h.b(var3, this.ar)) {
            var4 = false;
         }

         return var4;
      }
   }

   public static void a(rs.p_x.C_f var0) {
      a(var0, true);
   }

   public static void a(rs.p_x.C_f var0, boolean var1) {
      if (!var1) {
         aC = new rs.p_x.C_e(C_Client_mc.a(rs.p_v.C_a.f() + "obj.dat"));
      } else {
         aC = new rs.p_x.C_e(var0.a("obj.dat"));
      }

      rs.p_x.C_e var2 = null;
      if (!var1) {
         var2 = new rs.p_x.C_e(C_Client_mc.a(rs.p_v.C_a.f() + "obj.idx"));
      } else {
         var2 = new rs.p_x.C_e(var0.a("obj.idx"));
      }

      ad = var2.A();
      aF = new int[a];
      int var3 = 2;

      for (int var4 = 0; var4 < ad - 21; var4++) {
         aF[var4] = var3;
         var3 += var2.A();
      }

      y = new C_k[10];

      for (int var6 = 0; var6 < 10; var6++) {
         y[var6] = new C_k();
      }

      if (b == null) {
         b = new rs.p_t.p_a.C_d();
         b.a();
      }
   }

   public rs.p_a.C_h b(int var1) {
      int var2 = this.B;
      int var3 = this.s;
      if (var1 == 1) {
         var2 = this.Y;
         var3 = this.z;
      }

      if (var2 == -1) {
         return null;
      } else {
         rs.p_cache.p_osrs.C_c.a(this.ar);

         rs.p_a.C_h var11;
         try {
            rs.p_a.C_h var4 = rs.p_a.C_h.e(var2);
            if (var3 != -1) {
               var11 = rs.p_a.C_h.e(var3);
               rs.p_a.C_h[] var6 = new rs.p_a.C_h[]{var4, var11};
               var4 = new rs.p_a.C_h(2, var6);
            }

            if (this.g != null) {
               for (int var10 = 0; var10 < this.g.length; var10++) {
                  var4.i(this.g[var10], this.h[var10]);
               }
            }

            var11 = var4;
         } finally {
            rs.p_cache.p_osrs.C_c.a(false);
         }

         return var11;
      }
   }

   public boolean b() {
      return this.p != -1 && this.F != -1;
   }

   public boolean c(int var1) {
      int var2 = this.r;
      int var3 = this.K;
      int var4 = this.J;
      if (var1 == 1) {
         var2 = this.aa;
         var3 = this.q;
         var4 = this.o;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!rs.p_a.C_h.b(var2, this.ar)) {
            var5 = false;
         }

         if (var3 != -1 && !rs.p_a.C_h.b(var3, this.ar)) {
            var5 = false;
         }

         if (var4 != -1 && !rs.p_a.C_h.b(var4, this.ar)) {
            var5 = false;
         }

         return var5;
      }
   }

   public rs.p_a.C_h d(int var1) {
      int var2 = this.r;
      int var3 = this.K;
      int var4 = this.J;
      if (var1 == 1) {
         var2 = this.aa;
         var3 = this.q;
         var4 = this.o;
      }

      if (var2 == -1) {
         return null;
      } else {
         rs.p_a.C_h var5 = rs.p_a.C_h.a(var2, this.ar);
         if (this.i == 19051 && !rs.p_f.C_a.ah) {
            for (int var6 = 0; var6 < var5.L.length; var6++) {
               if (var5.L[var6] == 11) {
                  var5.L[var6] = 12;
               }
            }
         }

         if (var3 != -1) {
            if (var4 != -1) {
               rs.p_a.C_h var13 = rs.p_a.C_h.a(var3, this.ar);
               rs.p_a.C_h var7 = rs.p_a.C_h.a(var4, this.ar);
               rs.p_a.C_h[] var8 = new rs.p_a.C_h[]{var5, var13, var7};
               var5 = new rs.p_a.C_h(3, var8);
            } else {
               rs.p_a.C_h var14 = rs.p_a.C_h.a(var3, this.ar);
               rs.p_a.C_h[] var16 = new rs.p_a.C_h[]{var5, var14};
               var5 = new rs.p_a.C_h(2, var16);
            }
         }

         if (var5 == null) {
            return null;
         } else {
            if (this.i == 19050 || this.i == 19051 || this.i == 23063 || this.i == 21963 || this.i == 21964) {
               var5.a(0, 0, 7);
            }

            if (this.i == 20473) {
               var5.a(0, 0, 3);
            }

            if (this.i == 15621 || this.i == 20570 || this.i == 21560) {
               var5.a(0, 0, 4);
            }

            if (this.i == 21633) {
               var5.a(0, 0, 6);
            }

            if ((this.i == 21083 || this.i == 22813) && !rs.p_f.C_a.aj) {
               var5.a(0, 0, 4);
            }

            if (this.i == 20694 && !rs.p_f.C_a.aj) {
               var5.a(0, 0, 5);
            }

            if (this.i >= 20780 && this.i <= 20782 && !rs.p_f.C_a.aj) {
               var5.a(0, 0, 5);
            }

            byte var15 = var1 == 0 ? this.af : this.ai;
            if (this.i == 23174) {
               var15 = 7;
            }

            if (this.i == 21767) {
               var15 = 10;
            }

            boolean var17 = false;
            if (!rs.p_f.C_a.aj) {
               if (this.ag == 0 && this.ak == 0 && rs.p_a.C_h.bG == 3 && !rs.p_a.C_h.p[var2]) {
                  var5.a(var15, var1 == 0 ? 12 : -5, (int)(var1 == 0 ? this.ah : this.ah));
                  var17 = true;
               }

               byte var18 = var1 == 0 ? this.al : this.ao;
               byte var9 = var1 == 0 ? this.am : this.aq;
               byte var10 = var1 == 0 ? this.an : this.ap;
               if (var18 != 0 || var9 != 0 || var10 != 0) {
                  var5.a(var18, var9, (int)var10);
                  var17 = true;
               }
            }

            if (!var17) {
               if (this.i != 28759 && this.i != 28760) {
                  if (var1 == 0 && (this.ag != 0 || this.af != 0 || this.ah != 0)) {
                     var5.a(var15, this.ag, this.ah);
                  }

                  if (var1 == 1 && (this.ak != 0 || this.ai != 0 || this.aj != 0)) {
                     var5.a(var15, this.ak, this.aj);
                  }
               } else {
                  var5.a(var15, this.ag - 450, (int)this.ah);
               }
            }

            rs.p_l.p_b.p_a.p_a.C_b var19 = null;
            if (rs.p_l.p_b.p_a.C_d.c) {
               for (rs.p_l.p_b.p_a.p_a.C_a var22 : rs.p_l.p_b.p_a.C_d.b.h()) {
                  if (var22 instanceof rs.p_l.p_b.p_a.p_a.C_b) {
                     rs.p_l.p_b.p_a.p_a.C_b var11 = (rs.p_l.p_b.p_a.p_a.C_b)var22;
                     if (var11.n() == this.i) {
                        var19 = var11;
                        var11.i().clear();
                        break;
                     }
                  }
               }
            }

            rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.a, this, var5);
            if (this.aw != null) {
               this.aw.a(var5);
            } else {
               try {
                  c(this, var5, this.i);
               } catch (Exception var12) {
                  var12.printStackTrace();
               }
            }

            if (this.t != 128 || this.O != 128 || this.N != 128) {
               var5.b(this.t, this.N, this.O);
            }

            if (this.g != null) {
               for (int var21 = 0; var21 < this.g.length; var21++) {
                  var5.i(this.g[var21], this.h[var21]);
               }
            }

            if (var19 != null) {
               var5.a(var19.i());
            }

            return var5;
         }
      }
   }

   public void c() {
      this.A = 0;
      this.w = null;
      this.x = null;
      this.E = null;
      this.g = null;
      this.h = null;
      this.G = 2000;
      this.M = 0;
      this.Z = 0;
      this.ae = 0;
      this.v = 0;
      this.W = 0;
      this.C = false;
      this.f = 1;
      this.n = false;
      this.u = null;
      this.L = null;
      this.r = -1;
      this.K = -1;
      this.ag = 0;
      this.af = 0;
      this.ah = 0;
      this.aa = -1;
      this.q = -1;
      this.ak = 0;
      this.ai = 0;
      this.aj = 0;
      this.J = -1;
      this.o = -1;
      this.B = -1;
      this.s = -1;
      this.Y = -1;
      this.z = -1;
      this.P = null;
      this.ab = null;
      this.F = -1;
      this.p = -1;
      this.t = 128;
      this.O = 128;
      this.N = 128;
      this.X = 0;
      this.I = 0;
      this.ac = 0;
      this.ar = false;
   }

   public static C_k e(int var0) {
      if (var0 >= aF.length) {
         return new C_k();
      } else {
         aB = (aB + 1) % 10;
         aC.h = aF[var0];
         C_k var1 = new C_k();
         var1.i = var0;
         var1.c();
         var1.a(aC);
         return var1;
      }
   }

   public static C_k f(int var0) {
      return a(var0, true, true);
   }

   public static C_k a(int var0, boolean var1, boolean var2) {
      if (!C_Client_mc.ba) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (y[var3].i == var0) {
               return y[var3];
            }
         }
      }

      aB = (aB + 1) % 10;
      C_k var4 = y[aB];
      if (var2 && b != null && var0 > 0 && b.a(var0) != null) {
         var4 = b.a(var0);
      } else {
         aC.h = aF[var0];
         var4.i = var0;
         var4.c();
         var4.a(aC);
      }

      if (C_Client_mc.ba && var4.i == C_Client_mc.bb) {
         var4.w = "Debugging " + C_Client_mc.bb;
         var4.Z = C_Client_mc.bd != 0 ? C_Client_mc.bd : var4.Z;
         var4.G = C_Client_mc.be != 0 ? C_Client_mc.be : var4.G;
         var4.M = C_Client_mc.bc != 0 ? C_Client_mc.bc : var4.M;
         var4.v = C_Client_mc.bf != 0 ? C_Client_mc.bf : var4.v;
         var4.W = C_Client_mc.bg != 0 ? C_Client_mc.bg : var4.W;
      }

      if (var4 != null && var4.w != null) {
         if (var4.w.contains("Goliath") && var4.w.contains("black")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2301;
               var4.aa = 2323;
            }
         }

         if (var4.w.contains("Goliath") && var4.w.contains("white")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2301;
               var4.aa = 2323;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{64585, 64590, 64595};
            }
         }

         if (var4.w.contains("Goliath") && var4.w.contains("yellow")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2301;
               var4.aa = 2323;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{9767, 9772, 9777};
            }
         }

         if (var4.w.contains("Goliath") && var4.w.contains("red")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2301;
               var4.aa = 2323;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{65046, 65051, 65056};
            }
         }

         if (var4.w.contains("Swift") && var4.w.contains("black")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2302;
               var4.aa = 2314;
            }
         }

         if (var4.w.contains("Swift") && var4.w.contains("white")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2302;
               var4.aa = 2314;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{64585, 64590, 64595};
            }
         }

         if (var4.w.contains("Swift") && var4.w.contains("yellow")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2302;
               var4.aa = 2314;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{9767, 9772, 9777};
            }
         }

         if (var4.w.contains("Swift") && var4.w.contains("red")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 33207;
               var4.aa = 33259;
            } else {
               var4.r = 2302;
               var4.aa = 2314;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{65046, 65051, 65056};
            }
         }

         if (var4.w.contains("Spellcaster") && var4.w.contains("black")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 179;
               var4.aa = 356;
            } else {
               var4.r = 2300;
               var4.aa = 2326;
            }
         }

         if (var4.w.contains("Spellcaster") && var4.w.contains("white")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 179;
               var4.aa = 356;
            } else {
               var4.r = 2300;
               var4.aa = 2326;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{64585, 64590, 64595};
            }
         }

         if (var4.w.contains("Spellcaster") && var4.w.contains("yellow")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 179;
               var4.aa = 356;
            } else {
               var4.r = 2300;
               var4.aa = 2326;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{9767, 9772, 9777};
            }
         }

         if (var4.w.contains("Spellcaster") && var4.w.contains("red")) {
            if (rs.p_f.C_a.aj) {
               var4.r = 179;
               var4.aa = 356;
            } else {
               var4.r = 2300;
               var4.aa = 2326;
               var4.g = new int[]{10, 15, 20};
               var4.h = new int[]{65046, 65051, 65056};
            }
         }

         if (var4.w.contains("Primal platebody") || var4.w.contains("Torva platebody")) {
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -5;
               var4.aj = -1;
               var4.ah = 1;
               var4.ai = -1;
               var4.t = 120;
               var4.O = 120;
               var4.N = 120;
            } else {
               var4.ag = 0;
               var4.ak = 0;
               var4.aj = 0;
               var4.ah = 0;
               var4.ai = 0;
               var4.t = 128;
               var4.O = 128;
               var4.N = 128;
            }
         }

         if (var4.w.contains("Primal platelegs") || var4.w.contains("Torva platelegs")) {
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -5;
               var4.aj = -1;
               var4.ah = 1;
               var4.ai = -1;
               var4.t = 120;
               var4.O = 120;
               var4.N = 120;
            } else {
               var4.ag = 0;
               var4.ak = 0;
               var4.aj = 0;
               var4.ah = 0;
               var4.ai = 0;
               var4.t = 128;
               var4.O = 128;
               var4.N = 128;
            }
         }
      }

      switch (var0) {
         case 2653:
            var4.o = 3381;
            break;
         case 2669:
            var4.o = 3380;
            break;
         case 5609:
            if (!rs.p_f.C_a.aj) {
               var4.ag = -15;
               var4.ak = -15;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
         case 5608:
            if (!rs.p_f.C_a.aj) {
               var4.ag = -25;
               var4.ak = -25;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 7806:
         case 7807:
         case 16957:
         case 20997:
         case 20998:
         case 22889:
         case 23056:
         case 23057:
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -12;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 7808:
         case 20999:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 10;
               var4.ak = 10;
            } else {
               var4.ag = 1;
               var4.ak = 1;
            }
            break;
         case 9975:
            var4.A = 1;
            break;
         case 11283:
         case 11284:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 17;
               var4.ak = 5;
            } else {
               var4.ag = 5;
               var4.ak = 10;
            }
            break;
         case 11694:
         case 14487:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 15;
               var4.ak = 0;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 11730:
         case 12424:
         case 12899:
         case 13045:
         case 13047:
         case 13576:
         case 14490:
         case 20567:
         case 21059:
         case 21712:
         case 23062:
         case 23180:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 15;
               var4.ak = -3;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 11785:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 20;
               var4.ak = 20;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 11791:
         case 11908:
         case 12904:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 15;
               var4.ak = 15;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 12006:
         case 20679:
         case 20680:
         case 20684:
         case 20685:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 10;
               var4.ak = 0;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 12422:
         case 12426:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 15;
               var4.ak = 15;
            } else {
               var4.ag = 1;
               var4.ak = 1;
            }
            break;
         case 12704:
         case 12706:
         case 20483:
         case 20485:
         case 20486:
         case 20810:
         case 21819:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 10;
               var4.ak = -1;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 12926:
         case 21577:
            if (rs.p_f.C_a.aj) {
               var4.ag = 2;
               var4.ak = 2;
            } else {
               var4.ag = 15;
               var4.ak = 15;
            }
            break;
         case 12954:
         case 20532:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 12;
               var4.ak = -6;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 13738:
         case 13744:
            if (rs.p_f.C_a.aj) {
               var4.G = 1600;
               var4.M = 396;
               var4.Z = 27;
               var4.v = 0;
               var4.W = 14;
            } else {
               var4.G = 1616;
               var4.M = 396;
               var4.Z = 1050;
               var4.v = -3;
               var4.W = 4;
            }

            var4.ag = 0;
            var4.ak = 0;
            break;
         case 13740:
            if (rs.p_f.C_a.aj) {
               var4.ag = -11;
               var4.ak = 3;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 13742:
            if (rs.p_f.C_a.aj) {
               var4.G = 1789;
               var4.M = 431;
               var4.Z = 27;
               var4.v = 0;
               var4.W = 13;
            } else {
               var4.G = 1616;
               var4.M = 396;
               var4.Z = 1050;
               var4.v = -3;
               var4.W = 4;
            }

            var4.ag = 0;
            var4.ak = 0;
            break;
         case 13858:
         case 22043:
            var4.r = rs.p_f.C_a.aj ? '豰' : 'ꚃ';
            var4.aa = rs.p_f.C_a.aj ? '豾' : 'Ꚓ';
            break;
         case 13859:
            var4.r = rs.p_f.C_a.aj ? '貃' : 'ꙹ';
            var4.aa = rs.p_f.C_a.aj ? '貃' : 'ꙹ';
            break;
         case 13861:
         case 22044:
            var4.r = rs.p_f.C_a.aj ? '豭' : 'Ꚋ';
            var4.aa = rs.p_f.C_a.aj ? '豺' : 'ꚕ';
            break;
         case 13864:
            var4.r = rs.p_f.C_a.aj ? '豨' : 'Ꚏ';
            var4.aa = rs.p_f.C_a.aj ? '豵' : 'ꚝ';
            break;
         case 13870:
         case 22045:
            var4.r = rs.p_f.C_a.aj ? '豲' : 'Ꚃ';
            var4.aa = rs.p_f.C_a.aj ? '豻' : 'ꚓ';
            break;
         case 13873:
         case 22046:
            var4.r = rs.p_f.C_a.aj ? '豬' : 'ꚇ';
            var4.aa = rs.p_f.C_a.aj ? '豷' : 'Ꚗ';
            break;
         case 13876:
            var4.r = rs.p_f.C_a.aj ? '豩' : 'Ꚍ';
            var4.aa = rs.p_f.C_a.aj ? '豴' : 'ꚜ';
            break;
         case 13879:
         case 15034:
            if (rs.p_f.C_a.aj) {
               var4.ag = -24;
               var4.ak = -24;
            } else {
               var4.ag = -10;
               var4.ak = -25;
            }
            break;
         case 13884:
            var4.r = rs.p_f.C_a.aj ? '豯' : 'ꚁ';
            var4.aa = rs.p_f.C_a.aj ? '豼' : 'ꚑ';
            break;
         case 13887:
         case 22041:
            var4.r = rs.p_f.C_a.aj ? '豱' : 'Ꚁ';
            var4.aa = rs.p_f.C_a.aj ? '豽' : 'Ꚕ';
            break;
         case 13890:
            var4.r = rs.p_f.C_a.aj ? '豫' : 'Ꚉ';
            var4.aa = rs.p_f.C_a.aj ? '豹' : 'ꚗ';
            break;
         case 13893:
         case 22042:
            var4.r = rs.p_f.C_a.aj ? '豮' : 'ꚉ';
            var4.aa = rs.p_f.C_a.aj ? '豸' : 'ꚙ';
            break;
         case 13896:
            var4.r = rs.p_f.C_a.aj ? '豧' : 'ꚏ';
            var4.aa = rs.p_f.C_a.aj ? '豶' : 'ꚟ';
            break;
         case 13899:
         case 22157:
            if (rs.p_f.C_a.aj) {
               var4.ag = 0;
               var4.ak = 4;
            } else {
               var4.ag = 0;
               var4.ak = -9;
            }

            var4.r = rs.p_f.C_a.aj ? '貁' : 'ꙷ';
            var4.aa = rs.p_f.C_a.aj ? '貁' : 'ꙷ';
            break;
         case 13902:
         case 22158:
            if (rs.p_f.C_a.aj) {
               var4.ag = 0;
               var4.ak = 4;
            } else {
               var4.ag = 0;
               var4.ak = -9;
            }

            var4.r = rs.p_f.C_a.aj ? '貀' : 'ꙿ';
            var4.aa = rs.p_f.C_a.aj ? '貀' : 'ꙿ';
            break;
         case 13905:
         case 20696:
         case 21720:
         case 21721:
         case 21722:
            if (rs.p_f.C_a.aj) {
               var4.ag = -13;
               var4.ak = -6;
            } else {
               var4.ag = 0;
               var4.ak = -8;
            }
            break;
         case 14484:
         case 14486:
         case 22950:
         case 24049:
         case 24194:
            if (rs.p_f.C_a.aj) {
               var4.ag = -13;
               var4.ak = -13;
            } else {
               var4.ag = 0;
               var4.ak = -5;
            }
            break;
         case 14491:
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -5;
            } else {
               var4.ag = 2;
               var4.ak = -5;
            }
            break;
         case 14990:
         case 22145:
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -12;
            } else {
               var4.ag = 0;
               var4.ak = -12;
            }
            break;
         case 15037:
         case 16955:
         case 21073:
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -12;
            } else {
               var4.ag = 0;
               var4.ak = -10;
            }
            break;
         case 15038:
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -12;
            } else {
               var4.ag = 0;
               var4.ak = -12;
            }
            break;
         case 15039:
         case 16425:
            if (rs.p_f.C_a.aj) {
               var4.ag = -10;
               var4.ak = -10;
            } else {
               var4.ag = 0;
               var4.ak = -10;
            }
            break;
         case 15040:
            if (rs.p_f.C_a.aj) {
               var4.ag = -10;
               var4.ak = -10;
            } else {
               var4.ag = 0;
               var4.ak = -15;
            }
            break;
         case 15135:
         case 21868:
            if (rs.p_f.C_a.aj) {
               var4.ag = -14;
               var4.ak = 3;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 15621:
         case 19050:
         case 21963:
         case 21964:
         case 23063:
            if (rs.p_f.C_a.aj) {
               var4.ag = 3;
               var4.ak = 10;
            } else {
               var4.ag = 3;
               var4.ak = 5;
            }
            break;
         case 16427:
            if (rs.p_f.C_a.aj) {
               var4.r = 29250;
               var4.aa = 29255;
               var4.g = new int[]{280, 924, 920, 43166, 538, 43156, 520, 127};
               var4.h = new int[]{2853, 2840, 2836, 2830, 2836, 2836, 2836, 0};
            } else {
               var4.r = 55673;
               var4.aa = 56353;
            }
            break;
         case 16843:
            if (rs.p_f.C_a.aj) {
               var4.ag = -12;
               var4.ak = -10;
            } else {
               var4.ag = 0;
               var4.ak = -8;
            }
            break;
         case 17273:
         case 20741:
            if (rs.p_f.C_a.aj) {
               var4.ag = -15;
               var4.ak = 5;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 19051:
            if (rs.p_f.C_a.aj) {
               var4.ag = 3;
               var4.ak = 10;
            } else {
               var4.ag = 3;
               var4.ak = 5;
            }
            break;
         case 19335:
            if (rs.p_f.C_a.aj) {
               var4.G = 550;
               var4.M = 340;
               var4.Z = 26;
               var4.v = 1;
               var4.W = 29;
            } else {
               var4.G = 676;
               var4.M = 539;
               var4.Z = 110;
               var4.v = 5;
               var4.W = 11;
            }
            break;
         case 19544:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 11;
               var4.ak = -6;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 19918:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 15;
               var4.ak = 5;
            } else {
               var4.ag = 1;
               var4.ak = 1;
            }
            break;
         case 20400:
            var4.ag = 12;
            var4.ak = 10;
            break;
         case 20449:
         case 20690:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 9;
               var4.ak = -3;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 20482:
         case 21089:
         case 21098:
         case 21099:
         case 23066:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 13;
               var4.ak = 2;
            } else {
               var4.ag = 0;
               var4.ak = 8;
            }
            break;
         case 20553:
         case 21032:
         case 21033:
         case 21034:
         case 21035:
         case 21565:
         case 21566:
         case 21570:
         case 21571:
         case 21848:
         case 21850:
         case 21851:
         case 21852:
         case 21853:
         case 21947:
         case 21948:
         case 21949:
         case 24023:
         case 24024:
         case 24152:
         case 25422:
         case 25423:
         case 27271:
         case 27272:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 12;
               var4.ak = -5;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 20772:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 14;
               var4.ak = 6;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 20992:
         case 21714:
         case 21959:
         case 27288:
            if (rs.p_f.C_a.aj) {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 21005:
         case 23154:
            var4.g = new int[]{5056, 8125, 16, 0, 33, 20};
            var4.h = new int[]{5, 8, 461770, 5, 5, 5};
            break;
         case 21038:
         case 21039:
         case 21724:
         case 21738:
            var4.g = new int[]{50068};
            var4.h = new int[]{5};
            break;
         case 21582:
         case 21583:
         case 21584:
         case 21585:
         case 21586:
         case 21587:
         case 21602:
         case 21603:
         case 21604:
         case 23202:
         case 23908:
         case 23909:
         case 23910:
         case 24250:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 15;
               var4.ak = 5;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 21633:
            var4.K = 40024;
            break;
         case 21645:
            if (rs.p_f.C_a.aj) {
               var4.ag = -3;
               var4.ak = -3;
            } else {
               var4.ag = 8;
               var4.ak = -3;
            }
            break;
         case 21767:
            if (rs.p_f.C_a.aj) {
               var4.ag = -25;
               var4.ak = -21;
            } else {
               var4.ag = -8;
               var4.ak = -25;
            }
            break;
         case 22134:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 30;
               var4.ak = -1;
            } else {
               var4.ag = 18;
               var4.ak = 0;
            }
            break;
         case 22218:
            if (rs.p_f.C_a.aj) {
               var4.ag = 7;
               var4.ak = 7;
            } else {
               var4.ag = 15;
               var4.ak = 7;
            }
            break;
         case 22826:
            if (rs.p_f.C_a.aj) {
               var4.ag = 0;
               var4.ak = 0;
            } else {
               var4.ag = 14;
               var4.ak = 14;
            }
            break;
         case 22905:
         case 22906:
         case 22907:
            var4.ac = 1337;
            break;
         case 23174:
            if (rs.p_f.C_a.aj) {
               var4.ag = 20;
               var4.ak = 20;
            } else {
               var4.ag = 28;
               var4.ak = 28;
            }
            break;
         case 24029:
         case 24030:
         case 24031:
         case 24032:
            if (!rs.p_f.C_a.aj) {
               var4.ag = 12;
               var4.ak = -5;
            } else {
               var4.ag = 0;
               var4.ak = 0;
            }
            break;
         case 25105:
            var4.G = 9500;
            break;
         case 25410:
         case 25411:
         case 25412:
            if (rs.p_f.C_a.aj) {
               var4.ag = 12;
               var4.ak = 20;
               var4.af = 14;
               var4.ai = 14;
               var4.ah = 12;
               var4.aj = 10;
            } else {
               var4.ag = 6;
               var4.ak = 5;
               var4.af = 10;
               var4.ai = 12;
               var4.ah = 15;
               var4.aj = 15;
            }
            break;
         case 27686:
         case 27687:
         case 27688:
         case 27689:
            if (rs.p_f.C_a.aj) {
               var4.ag = -50;
            } else {
               var4.ag = -35;
            }
      }

      if (var4.p != -1 && var2) {
         var4.d();
      }

      if (var4.w != null) {
         var4.E = null;
         if (C_p.a.w_(var0) && var4.w.contains("@gre@")) {
            var4.w = ((C_p.b)C_p.a.b(var0)).d + var4.w.substring(5);
         }
      }

      if (var4.x == null) {
         var4.x = String.valueOf(var4.w);
      }

      return var4;
   }

   private void d() {
      C_k var1 = f(this.p);
      this.A = var1.A;
      this.G = var1.G;
      this.M = var1.M;
      this.Z = var1.Z;
      this.ae = var1.ae;
      this.v = var1.v;
      this.W = var1.W;
      this.g = var1.g;
      this.h = var1.h;
      C_k var2 = f(this.F);
      this.w = var2.w;
      this.x = var2.x;
      this.n = var2.n;
      this.f = var2.f;
      String var3 = "a";
      this.C = true;
   }

   public static rs.p_l.C_F_uc g(int var0) {
      if (j.a((long)var0) != null) {
         return (rs.p_l.C_F_uc)j.a((long)var0);
      } else {
         rs.p_l.C_F_uc var1 = a(var0, Integer.MAX_VALUE, 0, 19, true);
         if (var1 != null) {
            j.a(var1, (long)var0);
            return var1;
         } else {
            return null;
         }
      }
   }

   public static rs.p_l.C_F_uc a(int var0, int var1, int var2) {
      return a(var0, var1, var2, 32);
   }

   public static rs.p_l.C_F_uc a(int var0, int var1, int var2, int var3) {
      return a(var0, var1, var2, var3, false);
   }

   public static rs.p_l.C_F_uc a(int var0, int var1, int var2, int var3, boolean var4) {
      boolean var5 = var4;
      int var6 = -1;
      if (!var4) {
         if (var0 == 3241) {
            var4 = true;
         }

         if (var0 == 28807) {
            var4 = true;
         }

         for (long[][] var10 : ay) {
            if (var10[0][0] == (long)var0) {
               if (System.currentTimeMillis() - var10[0][1] >= 300L) {
                  var10[0][2]++;
                  if (var10[0][2] >= (long)var10[1].length) {
                     var10[0][2] = 0L;
                  }

                  var10[0][1] = System.currentTimeMillis();
               }

               var6 = (int)var10[1][(int)var10[0][2]];
               var4 = true;
            }
         }
      }

      if (!var5 && var2 == 0 && !C_Client_mc.ba && !var4) {
         rs.p_l.C_F_uc var27 = (rs.p_l.C_F_uc)k.a((long)var0);
         if (var27 != null && var27.s != var1 && var27.s != -1) {
            var27.b();
            var27 = null;
         }

         if (var27 != null && var27.h != null && var27.h instanceof Integer && (Integer)var27.h != var3) {
            var27.b();
            var27 = null;
         }

         if (var27 != null) {
            return var27;
         }
      }

      int var28 = var6 != -1 ? var6 : var0;
      if (var28 >= 0 && var28 < aF.length) {
         C_k var29 = f(var28);
         if (var29 == null) {
            return null;
         } else {
            if (var29.P == null) {
               var1 = -1;
            }

            if (var1 > 1) {
               int var30 = -1;

               for (int var32 = 0; var32 < 10; var32++) {
                  if (var1 >= var29.ab[var32] && var29.ab[var32] != 0) {
                     var30 = var29.P[var32];
                  }
               }

               if (var30 != -1) {
                  var29 = f(var30);
               }
            }

            C_E_uc.h = true;
            rs.p_a.C_h var31 = var29.h(1);
            C_E_uc.h = false;
            if (var31 == null) {
               return null;
            } else {
               rs.p_l.C_F_uc var33 = null;
               if (var29.p != -1) {
                  var33 = a(var29.F, 10, -1);
                  if (var33 == null) {
                     return null;
                  }
               }

               rs.p_l.C_F_uc var11 = new rs.p_l.C_F_uc(var3 > 32 ? var3 : 32, var3 > 32 ? var3 : 32);
               int var12 = C_E_uc.s;
               int var13 = C_E_uc.t;
               int[] var14 = C_E_uc.x;
               int[] var15 = rs.p_l.C_c.g;
               int var16 = rs.p_l.C_c.h;
               int var17 = rs.p_l.C_c.i;
               int var18 = rs.p_l.C_c.l;
               int var19 = rs.p_l.C_c.m;
               int var20 = rs.p_l.C_c.j;
               int var21 = rs.p_l.C_c.k;
               C_E_uc.p = false;
               C_E_uc.q = false;
               rs.p_l.C_c.a(var3 > 32 ? var3 : 32, var3 > 32 ? var3 : 32, var11.m, null);
               rs.p_l.C_c.a(0, 0, var3 > 32 ? var3 : 32, var3 > 32 ? var3 : 32, 0, true);
               C_E_uc.f();
               int var22 = var29.G;
               if (var2 == -1) {
                  var22 = (int)((double)var22 * 1.5);
               }

               if (var2 > 0) {
                  var22 = (int)((double)var22 * 1.04);
               }

               if (var2 == 16705) {
                  var2 = 0;
               }

               if (var3 != 32) {
                  var22 = (int)Math.floor((double)((float)var29.G * (32.0F / (float)var3)));
               }

               int var23 = C_E_uc.v[var29.M] * var22 >> 16;
               int var24 = C_E_uc.w[var29.M] * var22 >> 16;
               C_E_uc.h = true;
               var31.a(var29.Z, var29.ae, var29.M, var29.v, var23 + var31.g / 2 + var29.W, var24 + var29.W);
               C_E_uc.h = false;

               for (int var25 = var3 > 32 ? var3 - 1 : 31; var25 >= 0; var25--) {
                  for (int var26 = var3 > 32 ? var3 - 1 : 31; var26 >= 0; var26--) {
                     if (var11.m[var25 + var26 * (var3 > 32 ? var3 : 32)] == 0) {
                        if (var25 > 0 && var11.m[var25 - 1 + var26 * (var3 > 32 ? var3 : 32)] > 1) {
                           var11.m[var25 + var26 * (var3 > 32 ? var3 : 32)] = 1;
                        } else if (var26 > 0 && var11.m[var25 + (var26 - 1) * (var3 > 32 ? var3 : 32)] > 1) {
                           var11.m[var25 + var26 * (var3 > 32 ? var3 : 32)] = 1;
                        } else if (var25 < (var3 > 32 ? var3 - 1 : 31) && var11.m[var25 + 1 + var26 * (var3 > 32 ? var3 : 32)] > 1) {
                           var11.m[var25 + var26 * (var3 > 32 ? var3 : 32)] = 1;
                        } else if (var26 < (var3 > 32 ? var3 - 1 : 31) && var11.m[var25 + (var26 + 1) * (var3 > 32 ? var3 : 32)] > 1) {
                           var11.m[var25 + var26 * (var3 > 32 ? var3 : 32)] = 1;
                        }
                     }
                  }
               }

               if (var3 <= 32) {
                  if (var2 > 0) {
                     for (int var34 = var3 > 32 ? var3 - 1 : 31; var34 >= 0; var34--) {
                        for (int var37 = var3 > 32 ? var3 - 1 : 31; var37 >= 0; var37--) {
                           if (var11.m[var34 + var37 * (var3 > 32 ? var3 : 32)] == 0) {
                              if (var34 > 0 && var11.m[var34 - 1 + var37 * (var3 > 32 ? var3 : 32)] == 1) {
                                 var11.m[var34 + var37 * (var3 > 32 ? var3 : 32)] = var2;
                              } else if (var37 > 0 && var11.m[var34 + (var37 - 1) * (var3 > 32 ? var3 : 32)] == 1) {
                                 var11.m[var34 + var37 * (var3 > 32 ? var3 : 32)] = var2;
                              } else if (var34 < (var3 > 32 ? var3 - 1 : 31) && var11.m[var34 + 1 + var37 * (var3 > 32 ? var3 : 32)] == 1) {
                                 var11.m[var34 + var37 * (var3 > 32 ? var3 : 32)] = var2;
                              } else if (var37 < (var3 > 32 ? var3 - 1 : 31) && var11.m[var34 + (var37 + 1) * (var3 > 32 ? var3 : 32)] == 1) {
                                 var11.m[var34 + var37 * (var3 > 32 ? var3 : 32)] = var2;
                              }
                           }
                        }
                     }
                  } else if (var2 == 0) {
                     for (int var35 = var3 > 32 ? var3 - 1 : 31; var35 >= 0; var35--) {
                        for (int var38 = var3 > 32 ? var3 - 1 : 31; var38 >= 0; var38--) {
                           if (var11.m[var35 + var38 * (var3 > 32 ? var3 : 32)] == 0 && var35 > 0 && var38 > 0 && var11.m[var35 - 1 + (var38 - 1) * 32] > 0) {
                              var11.m[var35 + var38 * (var3 > 32 ? var3 : 32)] = 3153952;
                           }
                        }
                     }
                  }
               }

               if (var29.p != -1) {
                  int var36 = var33.r;
                  int var39 = var33.s;
                  var33.r = var3 > 32 ? var3 : 32;
                  var33.s = var3 > 32 ? var3 : 32;
                  if (var29.p == 1850) {
                     var33.f(0, -1);
                  } else {
                     var33.f(0, 0);
                  }

                  var33.r = var36;
                  var33.s = var39;
               }

               if (!var5 && var2 == 0) {
                  k.a(var11, (long)var0);
               }

               rs.p_l.C_c.a(var16, var17, var15, null);
               rs.p_l.C_c.c(var21, var18, var19, var20);
               C_E_uc.s = var12;
               C_E_uc.t = var13;
               C_E_uc.x = var14;
               C_E_uc.p = true;
               C_E_uc.q = true;
               if (var29.C) {
                  var11.r = var3 > 32 ? var3 + 1 : 33;
               } else {
                  var11.r = var3 > 32 ? var3 : 32;
               }

               var11.s = var1;
               var11.h = var3;
               if (var6 == -1 && a(var29, var0)) {
                  var11.h = -1;
               }

               return var11;
            }
         }
      } else {
         return null;
      }
   }

   public rs.p_a.C_h h(int var1) {
      if (this.P != null && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.ab[var3] && this.ab[var3] != 0) {
               var2 = this.P[var3];
            }
         }

         if (var2 != -1) {
            return f(var2).h(1);
         }
      }

      if (this.i == 3241 || this.i == 28807) {
         boolean var23 = rs.p_f.C_a.N;

         try {
            if (!rs.p_f.C_a.N) {
               rs.p_f.C_a.N = true;
            }

            rs.p_a.C_k.aJ = true;
            rs.p_a.C_k.aK = true;
            if (C_Client_mc.eR.c() != null) {
               rs.p_a.C_h var26 = null;

               try {
                  var26 = C_Client_mc.eR.c(false);
               } finally {
                  rs.p_a.C_k.aK = false;
                  rs.p_a.C_k.aJ = false;
               }

               rs.p_f.C_a.N = var23;
               return var26;
            }
         } finally {
            rs.p_f.C_a.N = var23;
            rs.p_a.C_k.aJ = false;
            rs.p_a.C_k.aK = false;
         }
      }

      C_F_uc var24 = C_E_uc.h && rs.p_k.C_e.a() ? m : l;
      boolean var25 = C_Client_mc.ba && C_Client_mc.bb == this.i;
      rs.p_a.C_h var4 = var25 ? null : (rs.p_a.C_h)var24.a((long)this.i);
      if (var4 != null) {
         var4.A = true;
         return var4;
      } else {
         rs.p_a.p_a.C_a var5 = rs.p_a.C_h.h;
         rs.p_cache.p_osrs.C_c.a(this.ar);

         try {
            var4 = rs.p_a.C_h.a(this.A, var5);
         } finally {
            rs.p_cache.p_osrs.C_c.a(false);
         }

         if (var4 == null) {
            return null;
         } else {
            var4.A = true;
            rs.p_l.p_f.C_e.d().a(rs.p_l.p_f.C_a.a, this, var4);
            if (this.aw != null) {
               this.aw.a(var4);
            } else if (this.i >= 21706 && this.i <= 21708) {
               b(var4, 60);
            } else {
               try {
                  c(this, var4, this.i);
               } catch (Exception var20) {
                  var20.printStackTrace();
               }
            }

            if (this.t != 128 || this.O != 128 || this.N != 128) {
               var4.b(this.t, this.N, this.O);
            }

            if (this.g != null) {
               for (int var6 = 0; var6 < this.g.length; var6++) {
                  var4.i(this.g[var6], this.h[var6]);
               }
            }

            if (this.V) {
               var4.b(20 + this.X, 768 + this.I, -50, -10, -50, true);
            } else if (this.w == null || !this.w.toLowerCase().contains("token (20") && !this.w.toLowerCase().contains(" icon")) {
               if (this.i == 20698) {
                  var4.b(120 + this.X, 768 + this.I, -50, -10, -50, true);
               } else {
                  var4.b(74 + this.X, 768 + this.I, -50, -10, -50, true);
               }
            } else {
               var4.b(90 + this.X, 768 + this.I, -50, -10, -50, true);
            }

            var4.aN = true;
            if (!var25) {
               var24.a(var4, (long)this.i);
            }

            return var4;
         }
      }
   }

   public rs.p_a.C_h i(int var1) {
      if (this.P != null && var1 > 1) {
         int var2 = -1;

         for (int var3 = 0; var3 < 10; var3++) {
            if (var1 >= this.ab[var3] && this.ab[var3] != 0) {
               var2 = this.P[var3];
            }
         }

         if (var2 != -1) {
            return f(var2).i(1);
         }
      }

      rs.p_a.C_h var4 = rs.p_a.C_h.a(this.A, this.ar);
      if (var4 == null) {
         return null;
      } else {
         if (this.g != null) {
            for (int var5 = 0; var5 < this.g.length; var5++) {
               var4.i(this.g[var5], this.h[var5]);
            }
         }

         return var4;
      }
   }

   public static int j(int var0) {
      C_k var2 = f(var0);
      return var2.A;
   }

   public void a(rs.p_x.C_e var1) {
      while (true) {
         int var2 = var1.y();
         if (var2 == 0) {
            return;
         }

         if (var2 == 1) {
            this.A = var1.A();
         } else if (var2 == 2) {
            if (rs.p_f.C_a.aa && c.w_(this.i)) {
               this.w = this.x = ((C_k)c.b(this.i)).w;
               var1.G();
            } else {
               this.w = this.x = var1.F();
            }
         } else if (var2 == 3) {
            var1.I();
         } else if (var2 == 4) {
            this.G = var1.A();
         } else if (var2 == 5) {
            this.M = var1.A();
         } else if (var2 == 6) {
            this.Z = var1.A();
         } else if (var2 == 7) {
            this.v = var1.A();
            if (this.v > 32767) {
               this.v -= 65536;
            }
         } else if (var2 == 8) {
            this.W = var1.A();
            if (this.W > 32767) {
               this.W -= 65536;
            }
         } else if (var2 == 10) {
            var1.A();
         } else if (var2 == 11) {
            this.C = true;
         } else if (var2 == 12) {
            this.f = var1.A();
         } else if (var2 == 16) {
            this.n = true;
         } else if (var2 == 23) {
            this.r = var1.A();
            this.ag = var1.z();
         } else if (var2 == 24) {
            this.K = var1.A();
         } else if (var2 == 25) {
            this.aa = var1.A();
            this.ak = var1.z();
         } else if (var2 == 26) {
            this.q = var1.A();
         } else if (var2 >= 30 && var2 < 35) {
            if (rs.p_f.C_a.aa && c.w_(this.i)) {
               this.u = ((C_k)c.b(this.i)).u;
               var1.G();
            } else {
               if (this.u == null) {
                  this.u = new String[5];
               }

               this.u[var2 - 30] = var1.F();
               if (this.u[var2 - 30].equalsIgnoreCase("hidden")) {
                  this.u[var2 - 30] = null;
               }
            }
         } else if (var2 >= 35 && var2 < 40) {
            if (rs.p_f.C_a.aa && c.w_(this.i)) {
               this.L = ((C_k)c.b(this.i)).L;
               var1.G();
            } else {
               if (this.L == null) {
                  this.L = new String[5];
               }

               this.L[var2 - 35] = var1.F();
               if (this.L[var2 - 35].equalsIgnoreCase("null")) {
                  this.L[var2 - 35] = null;
               }
            }
         } else if (var2 == 40) {
            int var6 = var1.y();
            this.g = new int[var6];
            this.h = new int[var6];

            for (int var4 = 0; var4 < var6; var4++) {
               this.g[var4] = var1.A();
               this.h[var4] = var1.A();
            }
         } else if (var2 == 78) {
            this.J = var1.A();
         } else if (var2 == 79) {
            this.o = var1.A();
         } else if (var2 == 90) {
            this.B = var1.A();
         } else if (var2 == 91) {
            this.Y = var1.A();
         } else if (var2 == 92) {
            this.s = var1.A();
         } else if (var2 == 93) {
            this.z = var1.A();
         } else if (var2 == 95) {
            this.ae = var1.A();
         } else if (var2 == 97) {
            this.F = var1.A();
         } else if (var2 == 98) {
            this.p = var1.A();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.P == null) {
               this.P = new int[10];
               this.ab = new int[10];
            }

            this.P[var2 - 100] = var1.A();
            this.ab[var2 - 100] = var1.A();
         } else if (var2 == 110) {
            this.t = var1.A();
         } else if (var2 == 111) {
            this.O = var1.A();
         } else if (var2 == 112) {
            this.N = var1.A();
         } else if (var2 == 113) {
            this.X = var1.z();
         } else if (var2 == 114) {
            this.I = var1.z() * 5;
         } else if (var2 == 115) {
            this.ac = var1.y();
         } else if (var2 == 116) {
            int var5 = var1.A();
         } else if (var2 == 117) {
            int var3 = var1.A();
         }
      }
   }

   public C_k() {
      this.i = -1;
   }

   public C_k(C_k var1) {
      this.i = var1.i;
      this.ar = var1.ar;
      this.ak = var1.ak;
      this.aj = var1.aj;
      this.ai = var1.ai;
      this.ah = var1.ah;
      this.af = var1.af;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.n = var1.n;
      this.o = var1.o;
      this.p = var1.p;
      this.q = var1.q;
      this.r = var1.r;
      this.s = var1.s;
      this.t = var1.t;
      this.u = var1.u;
      this.v = var1.v;
      this.w = var1.w;
      this.x = var1.x;
      this.z = var1.z;
      this.A = var1.A;
      this.B = var1.B;
      this.C = var1.C;
      this.E = var1.E;
      this.F = var1.F;
      this.G = var1.G;
      this.I = var1.I;
      this.J = var1.J;
      this.K = var1.K;
      this.L = var1.L;
      this.M = var1.M;
      this.N = var1.N;
      this.O = var1.O;
      this.P = var1.P;
      this.W = var1.W;
      this.X = var1.X;
      this.Y = var1.Y;
      this.Z = var1.Z;
      this.aa = var1.aa;
      this.ab = var1.ab;
      this.ac = var1.ac;
      this.ae = var1.ae;
      this.ag = var1.ag;
   }

   public void a(C_k var1) {
      this.ar = var1.ar;
      this.ak = var1.ak;
      this.aj = var1.aj;
      this.ai = var1.ai;
      this.ah = var1.ah;
      this.af = var1.af;
      this.f = var1.f;
      this.g = this.a(var1.g);
      this.h = this.a(var1.h);
      this.n = var1.n;
      this.o = var1.o;
      this.q = var1.q;
      this.r = var1.r;
      this.s = var1.s;
      this.t = var1.t;
      this.u = this.b(var1.u);
      this.v = var1.v;
      this.w = var1.w;
      this.x = var1.x;
      this.z = var1.z;
      this.A = var1.A;
      this.B = var1.B;
      this.C = var1.C;
      this.E = var1.E;
      this.G = var1.G;
      this.I = var1.I;
      this.J = var1.J;
      this.K = var1.K;
      this.L = var1.L;
      this.M = var1.M;
      this.N = var1.N;
      this.O = var1.O;
      this.W = var1.W;
      this.X = var1.X;
      this.Y = var1.Y;
      this.Z = var1.Z;
      this.aa = var1.aa;
      this.P = this.a(var1.P);
      this.ab = this.a(var1.ab);
      this.ac = var1.ac;
      this.ae = var1.ae;
      this.ag = var1.ag;
      this.as = var1.as;
      this.at = var1.at;
      this.au = var1.au;
      this.av = var1.av;
      this.ax = var1.ax;
   }

   public static void a(C_k var0, C_k var1) {
      for (String[] var5 : aA) {
         if (a(var0.L, var5)) {
            var1.L = var5;
            return;
         }
      }

      var1.L = new String[var0.L.length];
      System.arraycopy(var0.L, 0, var1.L, 0, var1.L.length);
   }

   public static void b(C_k var0, C_k var1) {
      if (a(var0.u, az)) {
         var1.u = az;
      } else {
         var1.u = new String[var0.u.length];
         System.arraycopy(var0.u, 0, var1.u, 0, var1.u.length);
      }
   }

   private static boolean a(String[] var0, String[] var1) {
      if (var0 != null && var1 != null && var0.length == var1.length) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if ((var0[var2] != null || var1[var2] != null)
               && (
                  var0[var2] != null && var1[var2] == null && !var0[var2].equals("null")
                     || var0[var2] == null && var1[var2] != null && !var1[var2].equals("null")
                     || !var0[var2].equals(var1[var2])
               )) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private int[] a(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         int[] var2 = (int[])var1;
         return Arrays.copyOf(var2, var2.length);
      }
   }

   private String[] b(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var2 = (String[])var1;
         return Arrays.copyOf(var2, var2.length);
      }
   }
}
