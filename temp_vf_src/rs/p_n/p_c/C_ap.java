package rs.p_n.p_c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_ap extends rs.p_n.C_c {
   private static int[] g;
   private static int[] bI;
   public static int c = 0;
   public static boolean d = true;
   public static boolean e = true;
   public static final List<C_ap.a> f = new ArrayList<>();
   private static rs.p_l.C_F_uc bJ;
   private static rs.p_l.C_F_uc bK;
   private static rs.p_l.C_F_uc bL;
   private static rs.p_l.C_F_uc bM;
   private static rs.p_l.C_F_uc bN;
   private static rs.p_l.C_F_uc bO;
   private static rs.p_l.C_F_uc bP;
   private static int bQ = -1;

   public static void h() {
      d = !d;
      j();
      i();
      rs.p_f.C_a.d();
   }

   public static void i() {
      if (d) {
         rs.p_n.C_e.H[1151].bc[0] = 5;
         rs.p_n.C_e.H[1151].am[1] = 75;
         rs.p_n.C_e.H[1151].am[2] = 82;
      } else {
         rs.p_n.C_e.H[1151].bc[0] = 15;
         rs.p_n.C_e.H[1151].am[1] = -5000;
         rs.p_n.C_e.H[1151].am[2] = -5000;
         rs.p_n.C_e.H[12424].am = Arrays.copyOf(g, g.length);
         rs.p_n.C_e.H[12424].bc = Arrays.copyOf(bI, bI.length);
      }
   }

   public static void j() {
      for (C_ap.c var3 : C_ap.c.values()) {
         a(var3);
      }
   }

   public static void a(C_ap.c var0) {
      if (d) {
         if (var0 == C_ap.c.a) {
            rs.p_n.C_e var1 = H[12424];
            ArrayList var2 = new ArrayList();
            ArrayList var3 = new ArrayList();

            for (int var4 = 0; var4 < var1.al.length; var4++) {
               int var5 = 0;
               C_ap.a var6 = C_ap.a.c;
               C_ap.b var7 = C_ap.b.a(var1.al[var4]);
               if (var7 != null) {
                  var6 = var7.R;
                  var5 = var7.Q;
               }

               boolean var8 = true;
               if (e || var5 >= C_Launcher_mc.n().o().eo[6] / 2) {
                  for (C_ap.a var10 : f) {
                     if (var6 == var10) {
                        var8 = false;
                     }
                  }
               }

               if (!var8) {
                  if (var1.al[var4] == 7455) {
                     var3.add(var1.al[var4]);
                  } else {
                     var2.add(var1.al[var4]);
                  }
               }
            }

            byte var13 = 3;
            byte var14 = 5;
            int var15 = 0;
            byte var16 = 5;
            byte var17 = 35;
            byte var18 = 35;
            if (var2.size() <= 32) {
               var13 = 5;
               var16 = 4;
               var17 = 45;
               if (var2.size() <= 24) {
                  var18 = 38;
               } else {
                  var18 = 29;
               }
            }

            if (var2.size() > 35) {
               var13 = 0;
               var16 = 7;
               var17 = 25;
               var18 = 25;
            }

            byte var19 = var13;
            byte var11 = var14;

            for (int var12 = 0; var12 < var1.al.length; var12++) {
               if (!var2.contains(var1.al[var12])) {
                  var1.am[var12] = -5000;
               } else {
                  var1.am[var12] = var19;
                  var1.bc[var12] = var11;
                  var19 += var17;
                  if (++var15 >= var16) {
                     var15 = 0;
                     var19 = var13;
                     var11 += var18;
                  }
               }
            }

            for (int var20 = 0; var20 < var1.al.length; var20++) {
               if (var3.contains(var1.al[var20])) {
                  var1.am[var20] = var19 - 1;
                  var1.bc[var20] = var11 - 1;
                  var19 += var17;
                  if (++var15 >= var16) {
                     var15 = 0;
                     var19 = var13;
                     var11 += var18;
                  }
               }
            }
         }
      }
   }

   public C_ap(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      f.add(C_ap.a.a);
      f.add(C_ap.a.b);
      this.l();
      this.m();
      this.n();
      this.o();
      j();
      bJ = new rs.p_l.C_F_uc("icons/pktele");
      bK = new rs.p_l.C_F_uc("icons/skilltele");
      bL = new rs.p_l.C_F_uc("icons/moneytele");
      bO = new rs.p_l.C_F_uc("magic/home 2");
      bP = new rs.p_l.C_F_uc("magic/bounty");
      bM = new rs.p_l.C_F_uc("icons/bosstele");
      bN = new rs.p_l.C_F_uc("icons/storetele");
      rs.p_n.C_e.H[30064].E = rs.p_n.C_e.H[30064].aG = bL;
      rs.p_n.C_e.H[13035].E = rs.p_n.C_e.H[13035].aG = bL;
      rs.p_n.C_e.H[1164].E = rs.p_n.C_e.H[1164].aG = bL;
      rs.p_n.C_e.H[1300].at = rs.p_n.C_e.H[13037].at = "@gre@Money Making Teleports";
      rs.p_n.C_e.H[1301].at = rs.p_n.C_e.H[13038].at = rs.p_n.C_e.H[30065].at = "Opens a selection of teleports";
      rs.p_n.C_e.H[30075].E = rs.p_n.C_e.H[30075].aG = bK;
      rs.p_n.C_e.H[13045].E = rs.p_n.C_e.H[13045].aG = bK;
      rs.p_n.C_e.H[1167].E = rs.p_n.C_e.H[1167].aG = bK;
      rs.p_n.C_e.H[1325].at = rs.p_n.C_e.H[13047].at = "@gre@Training Teleports";
      rs.p_n.C_e.H[1326].at = rs.p_n.C_e.H[13048].at = rs.p_n.C_e.H[30076].at = "Opens a selection of teleports";
      rs.p_n.C_e.H[30083].E = rs.p_n.C_e.H[30083].aG = bM;
      rs.p_n.C_e.H[13053].E = rs.p_n.C_e.H[13053].aG = bM;
      rs.p_n.C_e.H[1170].E = rs.p_n.C_e.H[1170].aG = bM;
      rs.p_n.C_e.H[1350].at = rs.p_n.C_e.H[13055].at = "@gre@Boss Teleports";
      rs.p_n.C_e.H[1351].at = rs.p_n.C_e.H[13056].at = rs.p_n.C_e.H[30084].at = "Opens a selection of teleports";
      rs.p_n.C_e.H[13061].E = rs.p_n.C_e.H[13061].aG = bJ;
      rs.p_n.C_e.H[30106].E = rs.p_n.C_e.H[30106].aG = bJ;
      rs.p_n.C_e.H[1174].E = rs.p_n.C_e.H[1174].aG = bJ;
      rs.p_n.C_e.H[1382].at = rs.p_n.C_e.H[13063].at = "@gre@PK Teleports";
      rs.p_n.C_e.H[1383].at = rs.p_n.C_e.H[13064].at = rs.p_n.C_e.H[30107].at = "Opens a selection of teleports";
      rs.p_n.C_e.H[30114].E = rs.p_n.C_e.H[30114].aG = bN;
      rs.p_n.C_e.H[13069].E = rs.p_n.C_e.H[13069].aG = bN;
      rs.p_n.C_e.H[1540].E = rs.p_n.C_e.H[1540].aG = bN;
      rs.p_n.C_e.H[1415].at = rs.p_n.C_e.H[13071].at = "@gre@Minigame Teleports";
      rs.p_n.C_e.H[1416].at = rs.p_n.C_e.H[13072].at = rs.p_n.C_e.H[30115].at = "Opens a selection of teleports";
      rs.p_n.C_e.H[13079].E = rs.p_n.C_e.H[13079].aG = bO;
      rs.p_n.C_e.H[30138].E = rs.p_n.C_e.H[30138].aG = bO;
      rs.p_n.C_e.H[1541].E = rs.p_n.C_e.H[1541].aG = bO;
      rs.p_n.C_e.H[1454].at = rs.p_n.C_e.H[13081].at = "@gre@Teleport to House";
      rs.p_n.C_e.H[1455].at = rs.p_n.C_e.H[13082].at = rs.p_n.C_e.H[30139].at = "Teleport to your PoH";
      rs.p_n.C_e.H[13095].E = rs.p_n.C_e.H[13095].aG = bP;
      rs.p_n.C_e.H[30162].E = rs.p_n.C_e.H[30162].aG = bP;
      rs.p_n.C_e.H[7455].E = rs.p_n.C_e.H[7455].aG = bP;
      rs.p_n.C_e.H[7457].at = rs.p_n.C_e.H[13097].at = "@gre@Teleport to Bounty Target";
      rs.p_n.C_e.H[7458].at = rs.p_n.C_e.H[13098].at = rs.p_n.C_e.H[30163].at = "Surprise your opponent!";
   }

   public static void m(int var0) {
      if (var0 == 41900) {
         if (C_Client_mc.eT[6] != 41902) {
            bQ = C_Client_mc.eT[6];
         }

         k();
         C_Client_mc.eT[6] = 41902;
      }

      if (var0 == 41903 && bQ != -1) {
         j();
         C_Client_mc.eT[6] = bQ;
      }

      if (var0 == 41910 || var0 == 41911 || var0 == 41912) {
         C_ap.a var1 = C_ap.a.a;
         if (var0 == 41911) {
            var1 = C_ap.a.b;
         }

         if (var0 == 41912) {
            var1 = C_ap.a.c;
         }

         if (f.contains(var1)) {
            f.remove(var1);
         } else {
            f.add(var1);
         }

         k();
         rs.p_f.C_a.d();
      }

      if (var0 == 41913) {
         e = !e;
         k();
         rs.p_f.C_a.d();
      }
   }

   public static void k() {
      rs.p_n.C_e.H['ꎲ'].E = f.contains(C_ap.a.a) ? C_V_uc.f : C_V_uc.g;
      rs.p_n.C_e.H['ꎳ'].E = f.contains(C_ap.a.b) ? C_V_uc.f : C_V_uc.g;
      rs.p_n.C_e.H['ꎴ'].E = f.contains(C_ap.a.c) ? C_V_uc.f : C_V_uc.g;
      rs.p_n.C_e.H['ꎵ'].E = e ? C_V_uc.f : C_V_uc.g;
   }

   public void l() {
      rs.p_n.C_e var1 = d(41902);
      var1.k(12);
      a(41903, "magic/filter 2", "Magic spellbook filter");
      a(41904, "Filters", this.a, 0, 16750623);
      h(41905, "magic/filter 3");
      c(41906, 1, "gambling/SPRITE");
      c(41907, 1, "gambling/SPRITE");
      c(41908, 1, "gambling/SPRITE");
      c(41909, 1, "gambling/SPRITE");
      a(41910, "<tab=20><col=0xFF981F>Show @whi@Combat</col><col=0xFF981F> spells", "Select filter", this.a, 0, 16750623, false, true, 150);
      a(41911, "<tab=20><col=0xFF981F>Show @whi@Teleport</col><col=0xFF981F> spells", "Select filter", this.a, 0, 16750623, false, true, 150);
      a(41912, "<tab=20><col=0xFF981F>Show @whi@Utility</col><col=0xFF981F> spells", "Select filter", this.a, 0, 16750623, false, true, 150);
      a(
         41913,
         "<tab=20><col=0xFF981F>Show spells that require less\\n<tab=20><col=0xFF981F>than half your magic level",
         "Select filter",
         this.a,
         0,
         16750623,
         false,
         true,
         150
      );
      a(41914, "Spell Filters", this.a, 2, 16750623);
      var1.b(0, 41903, 75, 240);
      var1.b(1, 41904, 82, 243);
      var1.b(2, 41905, 7, 25);
      var1.b(3, 41914, 56, 30);
      var1.b(4, 41906, 15, 57);
      var1.b(5, 41907, 15, 82);
      var1.b(6, 41908, 15, 107);
      var1.b(7, 41909, 15, 132);
      var1.b(8, 41910, 15, 59);
      var1.b(9, 41911, 15, 84);
      var1.b(10, 41912, 15, 109);
      var1.b(11, 41913, 15, 131);
   }

   public void m() {
      rs.p_n.C_e var1 = j(1151);
      rs.p_n.C_e var2 = j(1196);
      rs.p_n.C_e var3 = H[12424];
      var3.aH = 0;
      var3.aR = 260;
      var3.P = 190;
      int[] var4 = new int[]{
         1196,
         1199,
         1206,
         1215,
         1224,
         1231,
         1240,
         1249,
         1258,
         1267,
         1274,
         1283,
         1573,
         1290,
         1299,
         1308,
         1315,
         1324,
         1333,
         1340,
         1349,
         1358,
         1367,
         1374,
         1381,
         1388,
         1397,
         1404,
         1583,
         12038,
         1414,
         1421,
         1430,
         1437,
         1446,
         1453,
         1460,
         1469,
         15878,
         1602,
         1613,
         1624,
         7456,
         1478,
         1485,
         1494,
         1503,
         1512,
         1521,
         1530,
         1544,
         1553,
         1563,
         1593,
         1635,
         12426,
         12436,
         12446,
         12456,
         6004,
         18471,
         19101,
         19111,
         19151,
         19131
      };
      int var5 = 0;
      int var6 = var3.al.length;
      int[] var7 = Arrays.copyOf(var3.al, var6);
      int[] var8 = Arrays.copyOf(var3.am, var6);
      int[] var9 = Arrays.copyOf(var3.bc, var6);
      var3.k(var4.length);
      var3.b(var5++, 1195, 0, 0);

      for (int var10 = 0; var10 < var6; var10++) {
         var3.b(var5++, var7[var10], var8[var10], var9[var10]);
      }

      var3.b(var5++, 19100, 122, 196);
      var3.b(var5++, 19110, 145, 196);
      var3.b(var5++, 19150, 1, 220);
      var3.b(var5++, 19130, 26, 220);
      var1.k(68);
      byte var19 = 5;
      var1.b(0, 12424, 13, 24 - var19 - 14);
      b(1195, 1, "magic/home", "Cast @gre@Home Teleport");
      a(19100, 20987, 556, 0, 6, 30005, 81, "Air surge", "A single attack surge spell", this.a, 9, 10, 2);
      rs.p_n.C_e.H[19100].X[1] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      rs.p_n.C_e.H[19106].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      a(19110, 20987, 555, 556, 0, 9, 6, 30004, 30005, 85, "Water surge", "A single attack surge spell", this.a, 10, 10, 2);
      rs.p_n.C_e.H[19110].X[1] = new int[]{
         4, 3214, 555, 4, 3214, 4694, 4, 3214, 4695, 4, 3214, 4698, 10, 1688, 1383, 10, 1688, 1395, 10, 1688, 1403, 10, 1688, 6562, 10, 1688, 6563, 0
      };
      rs.p_n.C_e.H[19116].X[0] = new int[]{
         4, 3214, 555, 4, 3214, 4694, 4, 3214, 4695, 4, 3214, 4698, 10, 1688, 1383, 10, 1688, 1395, 10, 1688, 1403, 10, 1688, 6562, 10, 1688, 6563, 0
      };
      rs.p_n.C_e.H[19110].X[2] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      rs.p_n.C_e.H[19117].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      a(19150, 20987, 557, 556, 0, 9, 6, 30006, 30005, 90, "Earth surge", "A single attack surge spell", this.a, 11, 10, 2);
      rs.p_n.C_e.H[19150].X[1] = new int[]{
         4,
         3214,
         557,
         4,
         3214,
         4696,
         4,
         3214,
         4699,
         4,
         3214,
         4698,
         10,
         1688,
         1385,
         10,
         1688,
         1399,
         10,
         1688,
         1407,
         10,
         1688,
         3053,
         10,
         1688,
         3054,
         10,
         1688,
         6562,
         10,
         1688,
         6563,
         0
      };
      rs.p_n.C_e.H[19156].X[0] = new int[]{
         4,
         3214,
         557,
         4,
         3214,
         4696,
         4,
         3214,
         4699,
         4,
         3214,
         4698,
         10,
         1688,
         1385,
         10,
         1688,
         1399,
         10,
         1688,
         1407,
         10,
         1688,
         3053,
         10,
         1688,
         3054,
         10,
         1688,
         6562,
         10,
         1688,
         6563,
         0
      };
      rs.p_n.C_e.H[19150].X[2] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      rs.p_n.C_e.H[19157].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      a(19130, 20987, 554, 556, 0, 9, 6, 30003, 30005, 95, "Fire surge", "A single attack surge spell", this.a, 12, 10, 2);
      rs.p_n.C_e.H[19130].X[1] = new int[]{4, 3214, 554, 10, 1688, 1387, 0};
      rs.p_n.C_e.H[19136].X[0] = new int[]{4, 3214, 554, 10, 1688, 1387, 0};
      rs.p_n.C_e.H[19130].X[2] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
      rs.p_n.C_e.H[19137].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};

      for (int var11 = 0; var11 < var4.length; var11++) {
         int var12 = var11 > 35 ? 8 : 183;
         var1.b(var11 + 1 + 2, var4[var11], 5, var12);
         rs.p_n.C_e var13 = H[1195];
         var13.ab = 1196;
      }

      a(41900, "magic/filter 1", "Magic spellbook filter");
      a(41901, "Filters", this.a, 0, 16750623);
      var1.b(1, 41900, 75, 240);
      var1.b(2, 41901, 82, 243);

      for (int var20 = 0; var20 < var4.length; var20++) {
         if (var20 < 61 && var20 != 0) {
            var3.am[var20] = var3.am[var20] + 24;
         }

         if (var20 == 7 || var20 == 13 || var20 == 20 || var20 == 36 || var20 == 42 || var20 == 45 || var20 == 50 || var20 == 52) {
            var3.am[var20] = 0;
         }
      }

      var3.bc[7] = 24;
      var3.bc[13] = 48;
      var3.bc[20] = 72;
      var3.bc[50] = 96;
      var3.bc[45] = 120;
      var3.bc[52] = 144;
      var3.bc[36] = 170;
      var3.bc[42] = 192;
      var2.aQ = true;
      a(1197, "Level 0: Home Teleport", this.a, 1, 16685087, true, true);
      rs.p_n.C_e var21 = H[1197];
      var21.P = 174;
      var21.aR = 68;
      a(1198, "A teleport which requires no", this.a, 0, 11495962, true, true);
      a(18998, "runes and no required level that", this.a, 0, 11495962, true, true);
      a(18999, "teleports you to the main land.", this.a, 0, 11495962, true, true);
      var2.k(4);
      var2.b(0, 1197, 3, 4);
      var2.b(1, 1198, 91, 23);
      var2.b(2, 18998, 91, 34);
      var2.b(3, 18999, 91, 45);
      g = Arrays.copyOf(var3.am, var3.am.length);
      bI = Arrays.copyOf(var3.bc, var3.bc.length);
   }

   public void n() {
      rs.p_n.C_e var1 = d(12855);
      b(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
      rs.p_n.C_e var2 = H[12856];
      var2.ab = 1196;
      c(45149, 9075, 562, 557, 0, 1, 0, 30011, 30006, 60, "Miasmic rush", "A single attack miasmic spell", this.a, 8, 10, 2);
      c(45751, 9075, 562, 557, 1, 3, 1, 30011, 30006, 72, "Miasmic burst", "A multi-target miasmic spell", this.a, 7, 10, 2);
      c(45743, 9075, 565, 557, 2, 1, 2, 30014, 30006, 84, "Miasmic blitz", "A single target miasmic spell", this.a, 6, 10, 2);
      c(45694, 9075, 565, 557, 3, 3, 3, 30014, 30006, 96, "Miasmic barrage", "A multi-target miasmic spell", this.a, 5, 10, 2);
      int[] var3 = new int[]{
         12856,
         12939,
         12987,
         13035,
         12901,
         12861,
         13045,
         12963,
         13011,
         13053,
         12919,
         12881,
         13061,
         12951,
         12999,
         13069,
         12911,
         12871,
         13079,
         13095,
         12975,
         13023,
         13087,
         12929,
         12891,
         45149,
         45751,
         45743,
         45694,
         1196,
         12940,
         12988,
         13036,
         12902,
         12862,
         13046,
         12964,
         13012,
         13054,
         12920,
         12882,
         13062,
         12952,
         13000,
         13070,
         12912,
         12872,
         13080,
         12976,
         13024,
         13088,
         12930,
         12892,
         13096,
         45150,
         45752,
         45744,
         45695
      };
      var1.k(var3.length);
      byte var4 = 30;
      int var5 = 0;
      byte var6 = 18;

      for (int var7 = 8; var5 < var3.length; var6 += 45) {
         if (var6 > 175) {
            var6 = 18;
            var7 += 28;
         }

         int var8 = var6;
         int var9 = var7;
         if (var5 <= 28) {
            var8 = var6 + 4;
            var9 = var7 + 2;
         }

         if (var5 < var4) {
            if (var3[var5] == 45149) {
               var8 -= 3;
               var9 += 3;
            }

            if (var3[var5] == 45751) {
               var9--;
               var8--;
            }

            if (var3[var5] == 45743) {
               var8 -= 2;
            }

            if (var3[var5] == 45694) {
               var8--;
               var9++;
            }
         }

         if (var5 < var4) {
            var1.b(var5, var3[var5], var8, var9);
         }

         if (var5 > var4 - 1) {
            var7 = var5 < 41 ? 181 : 1;
            var1.b(var5, var3[var5], 4, var7);
         }

         var5++;
      }
   }

   public void o() {
      this.p();
      d();
      b(30003, 1, "Fire");
      b(30004, 2, "Water");
      b(30005, 3, "Air");
      b(30006, 4, "Earth");
      b(30007, 5, "Mind");
      b(30008, 6, "Body");
      b(30009, 7, "Death");
      b(30010, 8, "Nature");
      b(30011, 9, "Chaos");
      b(30012, 10, "Law");
      b(30013, 11, "Cosmic");
      b(30014, 12, "Blood");
      b(30015, 13, "Soul");
      b(30016, 14, "Astral");
      b(19200, 15, "Wrath");
      b(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", this.a, 0, 16, 2);
      b(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", this.a, 1, 4, 2);
      d(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", this.a, 2, 2, 2);
      b(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", this.a, 3, 0, 2);
      b(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", this.a, 4, 8, 2);
      b(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify", "fills certain vessels with water", this.a, 5, 0, 5);
      b(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "@gre@Money Making", "Teleport to money areas", this.a, 6, 0, 5);
      d(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "@gre@Training & Slayer", "Teleport to various monsters", this.a, 7, 0, 5);
      b(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "@gre@Boss Teleports", "Teleport to powerful foes", this.a, 8, 0, 5);
      b(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", this.a, 9, 0, 5);
      b(30099, 9075, 557, 1, 1, 30006, 70, "Skilling Kit", "Get skilling tools!", this.a, 10, 0, 5);
      b(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004, 71, "@gre@PK Teleports", "Teleport Pking spots", this.a, 11, 0, 5);
      d(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72, "@gre@Minigame Teleport", "Teleport to shop areas", this.a, 12, 0, 5);
      b(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", this.a, 13, 0, 5);
      d(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", this.a, 14, 8, 2);
      d(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "@gre@Teleport to House", "Teleports you to your PoH", this.a, 15, 0, 5);
      d(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", this.a, 16, 0, 5);
      b(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", this.a, 17, 16, 2);
      b(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "@gre@Teleport to Target", "Teleports you to Bounty Target", this.a, 18, 0, 5);
      b(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Tele Group Khazard", "Teleports players to Port khazard", this.a, 19, 0, 5);
      d(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints 3\\n times faster", this.a, 20, 0, 5);
      b(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", this.a, 21, 0, 5);
      e(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", this.a, 22, 0, 5);
      b(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", this.a, 23, 0, 5);
      d(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", this.a, 24, 4, 2);
      d(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", this.a, 25, 0, 5);
      b(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport", "Teleports you to the fishing guild", this.a, 26, 0, 5);
      e(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004, 85, "Tele Group Fishing\\nGuild", "Teleports players to the Fishing\\nGuild", this.a, 27, 0, 5);
      b(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", this.a, 28, 16, 5);
      b(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", this.a, 29, 0, 5);
      b(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", this.a, 30, 0, 5);
      b(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", this.a, 31, 0, 5);
      d(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau", "Teleports players to Ice Plateau", this.a, 32, 0, 5);
      d(
         30282,
         9075,
         563,
         561,
         2,
         1,
         0,
         30012,
         30010,
         90,
         "Energy Transfer",
         "Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy",
         this.a,
         33,
         8,
         2
      );
      d(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", this.a, 34, 8, 2);
      d(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", this.a, 35, 8, 2);
      b(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", this.a, 36, 0, 5);
      d(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints to a group", this.a, 37, 0, 5);
      d(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", this.a, 38, 0, 5);
   }

   public void p() {
      rs.p_n.C_e var1 = d(29999);
      var1.k(80);
      b(30000, 11, 10, 0, var1);
      b(30017, 40, 9, 1, var1);
      b(30025, 71, 12, 2, var1);
      b(30032, 103, 10, 3, var1);
      b(30040, 135, 12, 4, var1);
      b(30048, 165, 10, 5, var1);
      b(30056, 8, 38, 6, var1);
      b(30064, 39, 39, 7, var1);
      b(30075, 71, 39, 8, var1);
      b(30083, 103, 39, 9, var1);
      b(30091, 135, 39, 10, var1);
      b(30099, 165, 37, 11, var1);
      b(30106, 12, 68, 12, var1);
      b(30114, 42, 68, 13, var1);
      b(30122, 71, 68, 14, var1);
      b(30130, 103, 68, 15, var1);
      b(30138, 135, 68, 16, var1);
      b(30146, 165, 68, 17, var1);
      b(30154, 14, 97, 18, var1);
      b(30162, 42, 97, 19, var1);
      b(30170, 71, 97, 20, var1);
      b(30178, 101, 97, 21, var1);
      b(30186, 135, 98, 22, var1);
      b(30194, 168, 98, 23, var1);
      b(30202, 11, 125, 24, var1);
      b(30210, 42, 124, 25, var1);
      b(30218, 74, 125, 26, var1);
      b(30226, 103, 125, 27, var1);
      b(30234, 135, 125, 28, var1);
      b(30242, 164, 126, 29, var1);
      b(30250, 10, 155, 30, var1);
      b(30258, 42, 155, 31, var1);
      b(30266, 71, 155, 32, var1);
      b(30274, 103, 155, 33, var1);
      b(30282, 136, 155, 34, var1);
      b(30290, 165, 155, 35, var1);
      b(30298, 13, 185, 36, var1);
      b(30306, 42, 185, 37, var1);
      b(30314, 71, 184, 38, var1);
      b(30322, 104, 184, 39, var1);
      b(30001, 6, 184, 40, var1);
      b(30018, 5, 176, 41, var1);
      b(30026, 5, 176, 42, var1);
      b(30033, 5, 163, 43, var1);
      b(30041, 5, 176, 44, var1);
      b(30049, 5, 176, 45, var1);
      b(30057, 5, 176, 46, var1);
      b(30065, 5, 176, 47, var1);
      b(30076, 5, 163, 48, var1);
      b(30084, 5, 176, 49, var1);
      b(30092, 5, 176, 50, var1);
      b(30100, 5, 176, 51, var1);
      b(30107, 5, 176, 52, var1);
      b(30115, 5, 163, 53, var1);
      b(30123, 5, 176, 54, var1);
      b(30131, 5, 163, 55, var1);
      b(30139, 5, 163, 56, var1);
      b(30147, 5, 163, 57, var1);
      b(30155, 5, 176, 58, var1);
      b(30163, 5, 176, 59, var1);
      b(30171, 5, 176, 60, var1);
      b(30179, 5, 163, 61, var1);
      b(30187, 5, 176, 62, var1);
      b(30195, 5, 149, 63, var1);
      b(30203, 5, 176, 64, var1);
      b(30211, 5, 163, 65, var1);
      b(30219, 5, 163, 66, var1);
      b(30227, 5, 176, 67, var1);
      b(30235, 5, 149, 68, var1);
      b(30243, 5, 176, 69, var1);
      b(30251, 5, 5, 70, var1);
      b(30259, 5, 5, 71, var1);
      b(30267, 5, 5, 72, var1);
      b(30275, 5, 5, 73, var1);
      b(30283, 5, 5, 74, var1);
      b(30291, 5, 5, 75, var1);
      b(30299, 5, 5, 76, var1);
      b(30307, 5, 5, 77, var1);
      b(30323, 5, 5, 78, var1);
      b(30315, 5, 5, 79, var1);
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static enum b {
      a(1152, 1, C_ap.a.a),
      b(1153, 3, C_ap.a.a),
      c(1154, 5, C_ap.a.a),
      d(1156, 9, C_ap.a.a),
      e(1157, 11, C_ap.a.a),
      f(1158, 13, C_ap.a.a),
      g(1160, 17, C_ap.a.a),
      h(1161, 19, C_ap.a.a),
      i(1163, 23, C_ap.a.a),
      j(1166, 29, C_ap.a.a),
      k(1169, 35, C_ap.a.a),
      l(1171, 39, C_ap.a.a),
      m(1172, 41, C_ap.a.a),
      n(1175, 47, C_ap.a.a),
      o(1177, 53, C_ap.a.a),
      p(1181, 59, C_ap.a.a),
      q(1183, 62, C_ap.a.a),
      r(1185, 65, C_ap.a.a),
      s(1188, 70, C_ap.a.a),
      t(1189, 75, C_ap.a.a),
      u(1190, 60, C_ap.a.a),
      v(1191, 60, C_ap.a.a),
      w(1192, 60, C_ap.a.a),
      x(1193, 80, C_ap.a.a),
      y(1562, 80, C_ap.a.a),
      z(1572, 20, C_ap.a.a),
      A(1582, 50, C_ap.a.a),
      B(1592, 79, C_ap.a.a),
      C(12445, 85, C_ap.a.a),
      D(19100, 82, C_ap.a.a),
      E(19110, 86, C_ap.a.a),
      F(19150, 91, C_ap.a.a),
      G(19130, 96, C_ap.a.a),
      H(1195, 100, C_ap.a.b),
      I(1164, 100, C_ap.a.b),
      J(1167, 100, C_ap.a.b),
      K(1170, 100, C_ap.a.b),
      L(1174, 100, C_ap.a.b),
      M(1540, 100, C_ap.a.b),
      N(1541, 100, C_ap.a.b),
      O(7455, 100, C_ap.a.b);

      public int P;
      public int Q;
      public C_ap.a R;

      private b(int var3, int var4, C_ap.a var5) {
         this.P = var3;
         this.Q = var4;
         this.R = var5;
      }

      public static C_ap.b a(int var0) {
         for (C_ap.b var4 : values()) {
            if (var4.P == var0) {
               return var4;
            }
         }

         return null;
      }
   }

   public static enum c {
      a,
      b,
      c;
   }
}
