package rs.p_n.p_c;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.C_Client_mc;

public class C_G_uc extends rs.p_n.C_c {
   public static Map<Integer, List<String>> c = new HashMap<>();
   public static int d = 50247;
   public static int e = 50244;
   public static int f = 50241;
   public static int[] g = new int[]{d, e, f};
   public static rs.p_l.C_F_uc bI = null;
   public static rs.p_l.C_F_uc bJ = null;
   public static int bK = 1;
   public static int bL = 287;
   public static int bM = 0;
   public static int bN = -1;

   public C_G_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void m(int var0) {
      bM = var0;
      if (var0 < 2) {
         bL = 0;
      } else {
         bL = 285;
      }

      if (var0 == 2) {
         bN = 150;
      }
   }

   public static void h() {
      if (C_Client_mc.cH == 31244 && bM != 0) {
         int var0 = 197;
         int var1 = 283;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var1 += C_Client_mc.ah / 2 - 230;
            var0 += C_Client_mc.ai / 2 - 356;
         } else {
            var1 += 4;
            var0 += 4;
         }

         int var2 = 16776960;
         if (!rs.p_l.p_b.C_a.a() && bL < 285) {
            bL += 10;
            if (bL > 285) {
               bL = 285;
            }
         }

         if (bL >= 285 && bM >= 2) {
            var2 = bM == 2 ? '\uff00' : 16718848;
         }

         rs.p_l.C_c.b(13, var1, var0, var2, bL, 255);
         if (bL < 285 || bM < 2) {
            C_Client_mc.gl.c("@bla@Preparing enchantment..", var0 + 144, var1 + 11, 16777215, -1);
         } else if (bM == 2) {
            int var3 = 16775680;
            int var4 = 150 - C_Client_mc.bN;
            if (var4 < 50) {
               var3 = 16711680 + 5 * var4;
            } else if (var4 < 100) {
               var3 = 16711935 - 327680 * (var4 - 50);
            } else if (var4 < 150) {
               var3 = 255 + 327680 * (var4 - 100) - 5 * (var4 - 100);
            }

            C_Client_mc.gh.a(150 - bN, "Congratulations!", C_Client_mc.gg, var1 + 11, var0 + 144, var3);
            C_Client_mc.gh.a(150 - bN, "Congratulations!", C_Client_mc.gg, var1 + 11 + 1, var0 + 144 + 1, var3);
            if (bN > 1 && !rs.p_l.p_b.C_a.a()) {
               bN--;
            }
         } else {
            C_Client_mc.gl.c(bM == 2 ? "<img=24> @dgr@Success! Congratulations! <img=24>" : "@bla@Enchantment failed!", var0 + 144, var1 + 11, 16777215, -1);
         }
      }
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(31244);
      c(49999, 17, "fountain/sprite");
      a(49998, "@or1@Item Enchantment Chest", this.a, 2, 16751360, true, true);
      a(49997, "Enchantments", this.a, 2, 16751360, false, true);
      a(49996, "Item name", this.a, 2, 16751360, false, true);
      a(49995, "Categories", this.a, 2, 16751360, false, true);
      a(49991, "fountain/SPRITE", 27, 250, 34, "Enchant", -1, 49990, 1);
      a(49990, "fountain/SPRITE", 28, 250, 34, 49989);
      a(49988, "Attempt Enchantment", this.a, 2, 16751360, true, true);
      c(49987, 2, "fountain/icon");
      rs.p_n.C_e var2 = d(50241);
      var2.aw = 50241;
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
      var2.aR = 1;
      var2.P = 1;
      var2.aI = 2;
      a(50242, 5, "achievements/SPRITE", 54, 21, 50243);
      a(50245, "Category", this.a, 1, 16751360, false, true);
      a(50248, "", this.a, 0, 16751360, true, true);
      a(50249, "Success chance: @gre@N/A", this.a, 1, 16751360, false, true);
      a(50250, "Select a category", this.a, 2, 16751360, false, true);
      a(50251, "", this.a, 1, 16751360, false, true);
      a(50252, "Ingredients @yel@(cost to attempt)", this.a, 1, 16751360, false, true);
      rs.p_n.C_e var3 = d(49994);
      var3.aH = 420;
      var3.P = 299;
      var3.aR = 87;
      a(49993, Boolean.valueOf(false));
      H['썉'].ac = 15;
      H['썉'].ap = 10;
      H['썉'].P = 6;
      H['썉'].aR = 5;
      int var4 = H['썉'].P * H['썉'].aR;
      H['썉'].az = new int[var4];
      H['썉'].ax = new int[var4];
      var3.k(1);
      var3.b(0, 49993, 27, 8);
      rs.p_n.C_e var5 = d(49992);
      var5.aw = 49992;
      var5.W = new String[5];
      var5.K = new int[20];
      var5.ax = new int[30];
      var5.az = new int[30];
      var5.as = new int[20];
      var5.al = new int[0];
      var5.am = new int[0];
      var5.bc = new int[0];
      var5.t = false;
      var5.ac = 24;
      var5.ap = 24;
      var5.aR = 5;
      var5.P = 6;
      var5.aI = 2;
      rs.p_n.C_e var6 = d(49986);
      var6.aH = 420;
      var6.P = 170;
      var6.aR = 202;
      var6.k(16);

      for (int var7 = 49970; var7 <= 49985; var7++) {
         int var8 = var7 - 49970;
         a(var7, "Category #" + (var8 + 1), "Select enchantment", this.a, 2, 16776960, false, false, 100);
         var6.b(var8, var7, 40, 4 + var8 * 18);
      }

      rs.p_n.C_e var16 = d(50244);
      var16.aH = 845;
      var16.P = 170;
      var16.aR = 202;
      var16.k(1);
      a(50253, Boolean.valueOf(false), 60);
      H['쑍'].ac = 10;
      H['쑍'].ap = 10;
      H['쑍'].W = new String[]{"Select item", null, null, null, null};
      H['쑍'].P = 3;
      H['쑍'].aR = 20;
      var16.k(61);
      byte var17 = 44;
      byte var9 = 8;
      bI = new rs.p_l.C_F_uc("fountain/sprite 30");
      bJ = new rs.p_l.C_F_uc("fountain/sprite 29");

      for (int var10 = 0; var10 < 60; var10++) {
         a(50254 + var10, var10 == 0 ? bI : bJ);
         var16.b(var10, 50254 + var10, var17 - 3, var9 - 3);
         var17 += 42;
         if (var17 == 170) {
            var17 = 44;
            var9 += 42;
         }
      }

      var16.b(60, 50253, 44, 8);
      a(50314, "drops/button", 1, 100, 32, "Search by name", -1, 50315, 1);
      a(50315, "drops/button", 2, 100, 32, 50316);
      a(50317, "Search item", this.a, 0, 16751360, false, true);
      c(50318, 0, "drops/icon");
      a(50319, "fountain/sprite", 31, 30, 19, "Back", -1, 50320, 1);
      a(50320, "fountain/sprite", 32, 30, 19, 50321);
      a(50322, "Back @yel@(Categories)", this.a, 1, 16751360, false, true);
      c(50323, 12, "teleport/sprite");
      c(50324, 13, "teleport/sprite");
      c(50325, 17, "teleport/sprite");
      c(50326, 18, "teleport/sprite");
      rs.p_n.C_e.H['쒔'].E = new rs.p_l.C_F_uc("teleport/sprite 13", 0, 15);
      rs.p_n.C_e.H['쒕'].E = new rs.p_l.C_F_uc("teleport/sprite 17", 0, 15);
      rs.p_n.C_e.H['쒖'].E = new rs.p_l.C_F_uc("teleport/sprite 18", 0, 15);
      byte var18 = -40;
      byte var11 = -30;
      var1.k(27);
      var1.b(0, 49999, 10, 19);
      var1.b(1, 49998, 268, 26);
      var1.b(2, 49997, 27, 83);
      var1.b(3, 49996, 281 + var18 - 3, 85 + var11);
      var1.b(4, 49995, -2264, 208);
      var1.b(5, 49994, 172, 119);
      var1.b(6, 49992, 195, 56);
      var1.b(7, 49991, 215, 242);
      var1.b(8, 49990, 215, 242);
      var1.b(9, 49987, -5000, 0);
      var1.b(10, 49988, 342, 252);
      var1.b(11, 50244, -14, 101);
      var1.b(12, 65418, 478, 25);
      var1.b(13, 65419, 478, 25);
      byte var12 = 90;
      byte var13 = 50;
      var1.b(14, 50241, -451, 56);
      var1.b(15, 50245, 238, 73);
      var1.b(16, 50248, 264, 223);
      var1.b(17, 50249, 220, 216);
      var1.b(18, 50251, 373, 100);
      var1.b(19, 50252, 221, 101);
      var1.b(20, 50322, 69, 59);
      var1.b(21, 50319, 31, 57);
      var1.b(22, 50320, 31, 57);
      var1.b(23, 50323, 196, 282);
      var1.b(24, 50324, 196, 282);
      var1.b(25, 50325, 196, 282);
      var1.b(26, 50326, 196, 282);
      rs.p_n.C_e var14 = d(31243);
      b(50327, 33, "fountain/sprite", "Select category");
      a(50328, "@yel@Armor", this.a, 1, 16751360, true, true);
      b(50329, 33, "fountain/sprite", "Select category");
      a(50330, "@yel@Weapons", this.a, 1, 16751360, true, true);
      b(50331, 33, "fountain/sprite", "Select category");
      a(50332, "@yel@Capes", this.a, 1, 16751360, true, true);
      b(50333, 33, "fountain/sprite", "Select category");
      a(50334, "@yel@Trinkets & Tools", this.a, 1, 16751360, true, true);
      b(50335, 33, "fountain/sprite", "Select category");
      a(50336, "@yel@Pets/Accessories", this.a, 1, 16751360, true, true);
      b(50337, 33, "fountain/sprite", "Select category");
      a(50338, "@yel@Cosmetics", this.a, 1, 16751360, true, true);
      b(50339, 33, "fountain/sprite", "Select category");
      a(50340, "@yel@Miscellaneous", this.a, 1, 16751360, true, true);
      var14.k(39);
      var14.b(0, 49999, 10, 19);
      var14.b(1, 49998, 268, 26);
      var14.b(2, 49995, 27, 83);
      var14.b(3, 49996, 281 + var18 - 3, 85 + var11);
      var14.b(4, 49995, -2264, 208);
      var14.b(5, 49994, 172, 119);
      var14.b(6, 49992, 195, 56);
      var14.b(7, 49991, 215, 242);
      var14.b(8, 49990, 215, 242);
      var14.b(9, 49988, 342, 252);
      var14.b(10, 65418, 478, 25);
      var14.b(11, 65419, 478, 25);
      var14.b(12, 50248, 264, 223);
      var14.b(13, 50249, 220, 216);
      var14.b(14, 50251, 373, 100);
      var14.b(15, 50252, 221, 101);
      var14.b(16, 50314, 22, 48);
      var14.b(17, 50315, 22, 48);
      var14.b(18, 50317, 49, 59);
      var14.b(19, 50318, 28, 55);
      var14.b(20, 50323, 196, 282);
      var14.b(21, 50324, 196, 282);
      var14.b(22, 50325, 196, 282);
      var14.b(23, 50326, 196, 282);
      var14.b(24, 50245, 238, 73);
      byte var15 = 27;
      var14.b(25, 50327, 37, 111);
      var14.b(26, 50328, 98, 114);
      var14.b(27, 50329, 37, 109 + var15);
      var14.b(28, 50330, 98, 112 + var15);
      var14.b(29, 50331, 37, 109 + var15 * 2);
      var14.b(30, 50332, 98, 112 + var15 * 2);
      var14.b(31, 50333, 37, 109 + var15 * 3);
      var14.b(32, 50334, 98, 112 + var15 * 3);
      var14.b(33, 50335, 37, 109 + var15 * 4);
      var14.b(34, 50336, 98, 112 + var15 * 4);
      var14.b(35, 50337, 37, 109 + var15 * 5);
      var14.b(36, 50338, 98, 112 + var15 * 5);
      var14.b(37, 50339, 37, 109 + var15 * 6);
      var14.b(38, 50340, 98, 112 + var15 * 6);
   }
}
