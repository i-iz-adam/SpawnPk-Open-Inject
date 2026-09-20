package rs.p_n.p_c;

import rs.C_Client_mc;

public class C_h extends rs.p_n.C_c {
   private static final int bM = 4000;
   public static rs.p_l.C_F_uc c;
   public static rs.p_l.C_F_uc d;
   public static rs.p_l.C_F_uc e;
   public static rs.p_l.C_F_uc f;
   public static rs.p_l.C_F_uc g;
   public static final int[][] bI = new int[][]{
      {10325, 10335}, {10326, 10336}, {10327, 10337}, {10328, 10338}, {10329, 10339}, {10330, 10340}, {10331, 10341}, {10332, 10342}
   };
   public static String[] bJ = new String[]{"Release"};
   public static String[] bK = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw 14", "Withdraw All But One"};
   public static String[] bL = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw 14", "Bag-exchange"};

   public static void m(int var0) {
      bK[5] = "Withdraw " + var0;
      bL[5] = "Withdraw " + var0;
   }

   public static void a(C_Client_mc var0) {
      var0.ev = 0;
      C_Client_mc.fM = true;
      var0.fN = 25;
      var0.gb = true;
      var0.fB = "";
      var0.eQ = "Enter name of item to search";
   }

   public C_h(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      c = new rs.p_l.C_F_uc("bank/TAB 0");
      d = new rs.p_l.C_F_uc("bank/TAB 1");
      e = new rs.p_l.C_F_uc("bank/TAB 2");
      f = new rs.p_l.C_F_uc("bank/TAB 3");
      g = new rs.p_l.C_F_uc("bank/TAB 4");
      int var1 = (int)Math.ceil(400.0);
      byte var2 = 10;
      int var3 = var2 * var1;
      rs.p_n.C_e var4 = H[5385];
      var4.aH = var1 * 38;
      rs.p_n.C_e var5 = H[5382];
      var5.az = new int[var3];
      var5.ax = new int[var3];
      var5.aR = var1;
      var5.e();
      var5.P = var2;
      rs.p_n.C_e var6 = H[5292];
      a(5384, "", this.a, 0, 16756736, false);

      for (int var7 = 92; var7 < var6.am.length; var7++) {
         byte var8 = 40;
         if (var7 >= 92 && var7 <= 95 || var7 == 97) {
            var8 = 90;
         }

         var6.am[var7] = var6.am[var7] - var8;
      }

      var6.am[90] = 410;
      var6.bc[90] = 288;
      rs.p_n.C_e var9 = j(23000);
      var9.az = new int[var3];
      var9.ax = new int[var3];
      var9.al = new int[1];
      var9.am = new int[1];
      var9.bc = new int[1];
      var9.al[0] = 5292;
      var9.am[0] = 0;
      var9.bc[0] = 0;
      c(this.a);
      b(this.a);
   }

   public static void b(int var0, Boolean var1) {
      rs.p_n.C_e var2 = H[var0];
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

   public static void b(rs.p_l.C_K_uc[] var0) {
      rs.p_n.C_e var1 = H[5385];
      a(19, var1);
      c(43604, 1, "bank/SEP");
      a(43605, "Tab 1", var0, 0, 16750623, true, false);
      c(43606, 1, "bank/SEP");
      a(43607, "Tab 2", var0, 0, 16750623, true, false);
      c(43608, 1, "bank/SEP");
      a(43609, "Tab 3", var0, 0, 16750623, true, false);
      c(43610, 1, "bank/SEP");
      a(43611, "Tab 4", var0, 0, 16750623, true, false);
      c(43612, 1, "bank/SEP");
      a(43613, "Tab 5", var0, 0, 16750623, true, false);
      c(43614, 1, "bank/SEP");
      a(43615, "Tab 6", var0, 0, 16750623, true, false);
      c(43616, 1, "bank/SEP");
      a(43617, "Tab 7", var0, 0, 16750623, true, false);
      c(43618, 1, "bank/SEP");
      a(43619, "Tab 8", var0, 0, 16750623, true, false);
      c(43620, 1, "bank/SEP");
      a(43621, "Tab 9", var0, 0, 16750623, true, false);
      b(43604, 30, -10, 1, var1);
      b(43605, 40, -19, 2, var1);
      b(43606, 30, -10, 3, var1);
      b(43607, 40, -19, 4, var1);
      b(43608, 30, -10, 5, var1);
      b(43609, 40, -19, 6, var1);
      b(43610, 30, -10, 7, var1);
      b(43611, 40, -19, 8, var1);
      b(43612, 30, -10, 9, var1);
      b(43613, 40, -19, 10, var1);
      b(43614, 30, -10, 11, var1);
      b(43615, 40, -19, 12, var1);
      b(43616, 30, -10, 13, var1);
      b(43617, 40, -19, 14, var1);
      b(43618, 30, -10, 15, var1);
      b(43619, 40, -19, 16, var1);
      b(43620, 30, -10, 17, var1);
      b(43621, 40, -19, 0, var1);
      b(5382, 38, 3, 18, var1);
   }

   public static void c(rs.p_l.C_K_uc[] var0) {
      rs.p_n.C_e var1 = d(5292);
      int var2 = 0;
      a(43, var1);
      c(5293, 0, "bank/BANK");
      b(5293, 13, 13, var2++, var1);
      a(5383, "The Bank of SpawnPK", var0, 2, 16750623, true, true);
      b(5383, 265, 17, var2++, var1);
      a(5384, 3, 0, 5380, 1, "bank/BANK", 17, 17, "Close Window");
      a(5380, 2, "bank/BANK", 17, 17, 5379);
      b(5384, 476, 16, var2++, var1);
      b(5380, 476, 16, var2++, var1);
      rs.p_n.p_a.C_a.b(5294, "bank/BANK 3", "Repair items\n@gre@[CTRL+R]").a().a("bank/BANK 4");
      b(5294, 150, 285, var2++, var1);
      a(
         26000,
         4,
         26001,
         5,
         8,
         "bank/BANK",
         35,
         25,
         304,
         1,
         "Swap Withdraw Mode",
         26002,
         7,
         6,
         "bank/BANK",
         26003,
         "Switch to insert items \nmode",
         "Switch to swap items \nmode.",
         12,
         20
      );
      b(26000, 25, 285, var2++, var1);
      b(26001, 10, 225, var2++, var1);
      rs.p_n.p_a.C_a.b(26004, "bank/BANK 13", "Search for item\n@gre@[CTRL+S]").a().a("bank/BANK 15");
      b(26004, 65, 285, var2++, var1);
      a(
         26008,
         4,
         26009,
         9,
         11,
         "bank/BANK",
         35,
         25,
         115,
         1,
         "Toggle note",
         26010,
         10,
         12,
         "bank/BANK",
         26011,
         "Switch to note withdrawal \nmode",
         "Switch to item withdrawal \nmode",
         12,
         20
      );
      b(26008, 250, 285, var2++, var1);
      b(26009, 235, 225, var2++, var1);
      a(26012, 5, 26013, 17, "bank/BANK", 35, 25, "Deposit carried tems", 26014, 18, "bank/BANK", 26015, "Empty your backpack into\nyour bank", 0, 20);
      b(26012, 375, 285, var2++, var1);
      b(26013, 360, 225, var2++, var1);
      a(
         26016,
         5,
         26017,
         19,
         "bank/BANK",
         35,
         25,
         "Deposit worn items",
         26018,
         20,
         "bank/BANK",
         26019,
         "Empty the items your are\nwearing into your bank",
         0,
         20
      );
      b(26016, 415, 285, var2++, var1);
      b(26017, 400, 225, var2++, var1);
      a(26020, 5, 26021, 21, "bank/BANK", 35, 25, "Decant potions", 26022, 22, "bank/BANK", 26023, "Decant all potions in your bank", 0, 20);
      b(26020, 455, 285, var2++, var1);
      b(26021, 440, 225, var2++, var1);
      b(10325, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10325, 70, 36, var2++, var1);
      b(10326, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10326, 118, 36, var2++, var1);
      b(10327, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10327, 166, 36, var2++, var1);
      b(10328, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10328, 214, 36, var2++, var1);
      b(10329, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10329, 262, 36, var2++, var1);
      b(10330, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10330, 310, 36, var2++, var1);
      b(10331, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10331, 358, 36, var2++, var1);
      b(10332, 4, "bank/TAB", "Drag an item here to create a new tab");
      b(10332, 406, 36, var2++, var1);
      a(19995, "0", var0, 0, 11834970, true, false);
      b(19995, 474, 43, var2++, var1);
      a(19996, "495", var0, 0, 11834970, true, false);
      b(19996, 474, 56, var2++, var1);
      a(19997, "Repairs", var0, 0, 16750623, false, true);
      b(19997, -1476, 301, var2++, var1);
      c(10335, true);
      b(10335, 77, 39, var2++, var1);
      c(10336, false);
      b(10336, 125, 39, var2++, var1);
      c(10337, false);
      b(10337, 173, 39, var2++, var1);
      c(10338, false);
      b(10338, 221, 39, var2++, var1);
      c(10339, false);
      b(10339, 269, 39, var2++, var1);
      c(10340, false);
      b(10340, 317, 39, var2++, var1);
      c(10341, false);
      b(10341, 365, 39, var2++, var1);
      c(10342, false);
      b(10342, 413, 39, var2++, var1);
      b(10324, 0, "bank/TAB", "Click here to view the full contents of your bank");
      b(10324, 22, 36, var2++, var1);
      a(27000, "1", var0, 0, 16772659);
      a(27001, "0", var0, 0, 16772659);
      a(27002, "0", var0, 0, 16772659);
      b(5385, -4, 74, var2++, var1);
      a(
         39971,
         4,
         39970,
         24,
         26,
         "bank/BANK",
         35,
         25,
         116,
         1,
         "Toggle placeholders",
         39969,
         25,
         27,
         "bank/BANK",
         39968,
         "Always set as placeholders",
         "Do not set as placeholders",
         12,
         20
      );
      b(39971, 290, 285, var2++, var1);
      b(39970, 275, 225, var2++, var1);
      b(19997, 187, 292, var2++, var1);
      a(38976, 5, 38977, 28, "bank/BANK", 35, 25, "Deposit pet", 38978, 29, "bank/BANK", 38979, "Deposit your pet to your bank", 0, 20);
      b(38976, 335, 285, var2++, var1);
      b(38977, 320, 225, var2++, var1);
      rs.p_n.p_a.C_a.b(38980, "bank/BANK 14", "Filter by currencies\n@gre@[CTRL+C]").a().a("bank/BANK 16");
      b(38980, 106, 285, var2++, var1);
      var1 = H[5385];
      var1.aR = 206;
      var1.P = 480;
      var1 = H[5382];
      var1.ac = 12;
   }

   public static void c(int var0, Boolean var1) {
      rs.p_n.C_e var2 = H[var0];
      var2.W = new String[]{null, "Select tab", "Collapse tab", null, null};
      var2.K = new int[20];
      var2.ax = new int[30];
      var2.az = new int[30];
      var2.as = new int[20];
      var2.al = new int[0];
      var2.am = new int[0];
      var2.bc = new int[0];
      var2.t = false;
      var2.ag = true;
      var2.aF = true;
      var2.ac = 24;
      var2.ap = 24;
      var2.aR = 5;
      var2.P = 6;
      var2.ah = 5292;
      var2.aw = var0;
      var2.aI = 2;
   }
}
