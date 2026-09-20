package rs.p_n.p_c;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_av extends rs.p_n.C_c {
   public static int c = 55021;
   public static int d = 55018;
   public static int e = 55015;
   public static int[] f = new int[]{c, d, e};
   public static Map<Integer, List<String>> g = new HashMap<>();
   public static int bI = 1;

   public C_av(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void m(int var0) {
      int var1 = -1;
      bI = var0;
      if (var0 == 1) {
         var1 = c;
      } else if (var0 == 2) {
         var1 = d;
      } else if (var0 == 3) {
         var1 = e;
      }

      for (int var5 : f) {
         if (var5 != var1) {
            rs.p_n.C_e.H[var5].E = new rs.p_l.C_F_uc("achievements/sprite 6");
            rs.p_n.C_e.H[var5 + 1].E = new rs.p_l.C_F_uc("achievements/sprite 6");
         } else {
            rs.p_n.C_e.H[var5].E = new rs.p_l.C_F_uc("achievements/sprite 5");
            rs.p_n.C_e.H[var5 + 1].E = new rs.p_l.C_F_uc("achievements/sprite 5");
         }
      }

      for (int var6 = 60412; var6 <= 60424; var6++) {
         if (rs.p_n.C_e.H[var6] != null && rs.p_n.C_e.H[var6].at != null) {
            rs.p_n.C_e.H[var6].at = "";
         }
      }

      int var7 = 60412;
      List var8 = g.get(var0);
      if (var8 != null && var8.size() != 0) {
         for (String var10 : var8) {
            rs.p_n.C_e.H[var7].at = var10;
            var7++;
         }
      }
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = j(18551);
      c(55000, 16, "teleport/SPRITE");
      rs.p_n.C_e var2 = d(55001);
      var2.aH = 250;
      var2.P = 165;
      var2.aR = 78;
      var2.bj = 87;
      var2.k(17);

      for (int var3 = 0; var3 < 17; var3++) {
         var2.b(var3, 60427 + var3, 0, 3 + var3 * 13);
      }

      a(55002, "teleport/button", 1, 91, 41, "Track this activity", -1, 55003, 1);
      a(55003, "teleport/button", 2, 91, 41, 55036);
      a(55004, "Track", this.a, 1, 16751360, false, true);
      a(55005, "Fill up the bar for rewards!", this.a, 1, 16751360, false, true);
      a(55789, "@or1@Daily reward bonus", this.a, 1, 16751360, false, true);
      a(55788, "@or1@Daily Money Making Activities", this.a, 2, 16751360, true, true);
      rs.p_n.C_e var13 = d(55006);
      var13.aH = 350;
      var13.P = 325;
      var13.aR = 42;
      var13.bj = 87;
      var13.k(1);
      a(55007, Boolean.valueOf(false));
      H['훟'].P = 6;
      H['훟'].ac = 18;
      H['훟'].ap = 10;

      for (int var4 = 0; var4 < 12; var4++) {
         H['훟'].az[var4] = 995;
         H['훟'].ax[var4] = var4 + 1;
      }

      var13.b(0, 55007, 33, 5);
      c(55790, 12, "teleport/sprite");
      c(55791, 13, "teleport/sprite");
      rs.p_n.C_e.H['\ud9ef'].E = new rs.p_l.C_F_uc("teleport/sprite 13", 0, 15);
      a(55792, "0% (0/100)", this.a, 0, 0, true, false);
      a(55793, "Kill 100 green dragons", this.a, 1, 16751360, true, true);
      a(55794, "@or1@Activities", this.a, 1, 16751360, true, true);
      c(55009, 12, "teleport/sprite");
      c(55010, 13, "teleport/sprite");
      rs.p_n.C_e.H['훢'].E = new rs.p_l.C_F_uc("teleport/sprite 13", 0, 15);
      a(55011, "0% (0/100)", this.a, 0, 0, true, false);
      a(55012, "teleport/button", 1, 91, 41, "Teleport to this activity", -1, 55013, 1);
      a(55013, "teleport/button", 2, 91, 41, 55035);
      a(55014, "Teleport", this.a, 1, 16751360, true, true);
      a(55015, 5, 0, 55016, 6, "achievements/SPRITE", 54, 21, "Hard money making tasks");
      a(55016, 5, "achievements/SPRITE", 54, 21, 55017);
      a(55018, 5, 0, 55019, 6, "achievements/SPRITE", 54, 21, "Medium money making tasks");
      a(55019, 5, "achievements/SPRITE", 54, 21, 55020);
      a(55021, 5, 0, 55022, 6, "achievements/SPRITE", 54, 21, "Easy money making tasks");
      a(55022, 5, "achievements/SPRITE", 54, 21, 55023);
      a(55024, "@or1@Easy", this.a, 0, 16751360, false, true);
      a(55025, "@or1@Med.", this.a, 0, 16751360, false, true);
      a(55026, "@or1@Hard", this.a, 0, 16751360, false, true);
      a(55030, "<u=16776960>Location</u>", this.a, 2, 16751360, true, true);
      a(55032, "<img=8> @or2@Lvl. 46 wild <img=8>", this.a, 1, 16751360, true, true);
      a(55031, "<img=53> @or2@Singles <img=53>", this.a, 1, 16751360, true, true);
      h(55027, "teleport/icon 1");
      h(55028, "teleport/icon 2");
      a(55029, "@or1@Activity name", this.a, 0, 16751360, true, true);
      byte var14 = 10;
      var1.k(50);
      var1.b(0, 55000, 7, 16);
      var1.b(1, 60405, -10321, 54 + var14);
      var1.b(2, 55794, 73, 51 + var14);
      var1.b(3, 60407, 319, -1000);
      var1.b(4, 60408, 281, 183 + var14);
      var1.b(5, 55789, 190, 165 + var14);
      var1.b(6, 55788, 310, 18 + var14);
      var1.b(7, 60411, 180, 112 + var14 + 7);
      byte var5 = 75;
      byte var6 = -3;
      byte var7 = 18;
      var1.b(8, 60412, var6, var5 + var14);
      var1.b(9, 60413, var6, var5 + var7 * 1 + var14);
      var1.b(10, 60414, var6, var5 + var7 * 2 + var14);
      var1.b(11, 60415, var6, var5 + var7 * 3 + var14);
      var1.b(12, 60416, var6, var5 + var7 * 4 + var14);
      var1.b(13, 60417, var6, var5 + var7 * 5 + var14);
      var1.b(14, 60418, var6, var5 + var7 * 6 + var14);
      var1.b(15, 60419, var6, var5 + var7 * 7 + var14);
      var1.b(16, 60420, var6, var5 + var7 * 8 + var14);
      var1.b(17, 60421, var6, var5 + var7 * 9 + var14);
      var1.b(18, 60422, var6, var5 + var7 * 10 + var14);
      var1.b(19, 60423, var6, var5 + var7 * 11 + var14);
      var1.b(20, 60424, var6, var5 + var7 * 12 + var14);
      var1.b(21, 55012, 292, 68);
      var1.b(22, 55013, 292, 68);
      var1.b(23, 55014, 348, 81);
      var1.b(24, 63740, 479, 22 + var14 - 5);
      var1.b(25, 63741, 479, 22 + var14 - 5);
      byte var8 = -70;
      var1.b(26, 55790, 176, 258 + var8 + var14 + 2);
      var1.b(27, 55791, 176, 258 + var8 + var14 + 2);
      var1.b(28, 55792, 325, 260 + var8 + var14 + 2);
      var1.b(29, 55793, 324, 219);
      var1.b(30, 55002, 292, 120);
      var1.b(31, 55003, 292, 120);
      var1.b(32, 55004, 330, 132);
      var1.b(33, 55005, 189, 249);
      var1.b(34, 55006, 136, 267);
      byte var9 = 3;
      byte var10 = -4;
      var1.b(35, 55015, 107 + var9, 30 + var10);
      var1.b(36, 55016, 107 + var9, 30 + var10);
      var1.b(37, 55018, 59 + var9, 30 + var10);
      var1.b(38, 55019, 59 + var9, 30 + var10);
      var1.b(39, 55021, 11 + var9, 30 + var10);
      var1.b(40, 55022, 11 + var9, 30 + var10);
      var1.b(41, 55024, 21 + var9, 36 + var10);
      var1.b(42, 55025, 69 + var9, 36 + var10);
      var1.b(43, 55026, 114 + var9, 36 + var10);
      var1.b(44, 55030, 446, 79);
      var1.b(45, 55032, 447, 99);
      var1.b(46, 55031, 446, 116);
      var1.b(47, 55027, 301, 78);
      var1.b(48, 55028, 309, 130);
      var1.b(49, 55029, 222, 64);
      rs.p_n.C_e var11 = d(55008);
      var11.k(3);
      byte var12 = -80;
      var8 = 55;
      var11.b(0, 55009, 176 + var12, 6);
      var11.b(1, 55010, 176 + var12, 6);
      var11.b(2, 55011, 325 + var12, 8);
   }
}
