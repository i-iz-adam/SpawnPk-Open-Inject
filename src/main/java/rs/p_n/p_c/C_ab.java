package rs.p_n.p_c;

import java.util.HashMap;
import java.util.Map;

public class C_ab extends rs.p_n.C_c {
   public static final int c = 47505;
   public static final int d = 47704;
   public static final int e = 47709;
   public static final int f = 47808;
   public static final int g = 7;
   public static rs.p_a.C_h bI = null;
   public static rs.p_a.C_h bJ = null;
   public static Map<String, Integer> bK = new HashMap<>();
   public static int bL = 808;
   public static boolean bM = false;
   public static int bN;
   public static int bO;
   public static int bP;
   public static int bQ;
   public static int bR;
   public static int bS;
   public static boolean bT;

   public static void a(boolean var0) {
      if (var0) {
         for (int var1 = 47819; var1 <= 47837; var1++) {
            rs.p_n.C_e.H[var1].bf = true;
         }
      } else {
         for (int var2 = 47819; var2 <= 47837; var2++) {
            rs.p_n.C_e.H[var2].bf = false;
         }
      }

      bT = var0;
   }

   public static void h() {
      for (int var0 = 47505; var0 <= 47704; var0++) {
         rs.p_n.C_e.a(var0, "", rs.p_n.C_d.b, 0, 16751360, false, true);
      }

      bN = 47505;
      bO = 3;
      bP = 3;
   }

   public static void i() {
      if (bQ < 47808) {
         for (int var0 = bQ; var0 < 47808; var0++) {
            rs.p_n.C_e.H[var0].at = "";
            if (rs.p_n.C_e.H[var0].aI == 5) {
               rs.p_n.C_e.H[var0].E = null;
               rs.p_n.C_e.H[var0].aG = null;
            }
         }
      }
   }

   public static void j() {
      if (bN < 47704) {
         for (int var0 = bN; var0 < 47704; var0++) {
            rs.p_n.C_e.H[var0].at = "";
         }
      }
   }

   public static void k() {
      h(47706, "wiki/item 1");
      rs.p_n.C_e.H['멜'].am[3] = 16;
      rs.p_n.C_e.H['멜'].am[4] = 16;
      rs.p_n.C_e.H['멜'].V = 0;
      bQ = 47709;
      bR = 3;
      bS = 210;
   }

   public static void l() {
      bK.clear();
      bM = false;
      bI = null;
      bJ = null;
      bL = 808;

      for (int var0 = 0; var0 < 15; var0++) {
         H['멛'].az[var0] = 0;
         H['멛'].ax[var0] = 0;
      }
   }

   public static void m() {
      bI = null;
      bJ = null;
      rs.p_n.C_e.aO.a();
   }

   public static void a(String var0, boolean var1, boolean var2) {
      if (bN == 0) {
         h();
      }

      if (bN >= 47704) {
         System.out.println("[ERROR] OVERFLOW CATEGORY");
      } else {
         int var3 = bN - 47505;
         if (var1) {
            bO = var2 ? 15 : 3;
            if (var3 > 0) {
               bP += 3;
            }

            if (!var2) {
               var0 = "<u=16776960>" + var0 + ":";
            } else {
               var0 = "<col=C0981F>" + var0;
            }

            a(bN, var0, rs.p_n.C_d.b, 2, 16751360, false, true);
            rs.p_n.C_e.H['릐'].b(var3, bN, bO, bP);
            bP += 19;
            bO = var2 ? 30 : 15;
         } else {
            a(bN, var0, var0, rs.p_n.C_d.b, 0, 16750623, false, true, 125);
            rs.p_n.C_e.H['릐'].b(var3, bN, bO, bP);
            bP += 15;
         }

         bN++;
      }
   }

   public static void a(String var0, boolean var1) {
      if (bQ == 0) {
         k();
      }

      if (bQ >= 47808) {
         System.out.println("[ERROR] OVERFLOW DESCRIPTION");
      } else {
         boolean var2 = false;
         boolean var3 = false;
         if (var0.startsWith("{C}")) {
            var0 = var0.replace("{C}", "");
            var2 = true;
         }

         if (var0.contains("{B}")) {
            var0 = var0.replace("{B}", "");
            var3 = true;
         }

         if (rs.p_n.C_e.H[bQ] != null && rs.p_n.C_e.H[bQ].aI == 5) {
            rs.p_n.C_e.H[bQ].E = null;
            rs.p_n.C_e.H[bQ].aG = null;
         }

         if (var1) {
            a(bQ, var0, "Select option", rs.p_n.C_d.b, 0, 16750623, var2, true, 500);
         } else if (var3) {
            a(bQ, var0, rs.p_n.C_d.b, 2, 16751360, var2, true);
         } else {
            a(bQ, var0, rs.p_n.C_d.b, 1, 16751360, var2, true);
         }

         int var4 = bQ - 47709 + 7;
         rs.p_n.C_e.H['멜'].b(var4, bQ, bR + (var2 ? (var1 ? -116 : 134) + 150 : 0), bS + 30);
         bS += 15 + (var3 ? 5 : 0);
         bQ++;
      }
   }

   public static void b(String var0) {
      if (bQ == 0) {
         k();
      }

      if (bQ >= 47808) {
         System.out.println("[ERROR] OVERFLOW DESCRIPTION");
      } else {
         String[] var1 = var0.split(",");
         int var2 = Integer.parseInt(var1[0]);
         int var3 = Integer.parseInt(var1[1]);
         int var4 = Integer.parseInt(var1[2]);
         int var5 = Integer.parseInt(var1[3]);
         if (var2 == -1) {
            bS += var5;
         } else {
            int var6 = bQ - 47709 + 7;
            h(bQ, "wiki/guide " + var2);
            rs.p_n.C_e.H[bQ].l = true;
            rs.p_n.C_e.H['멜'].b(var6, bQ, bR + var3, bS + var4);
            bS += var5;
            bQ++;
         }
      }
   }

   public static void c(String var0) {
      int var1 = Integer.parseInt(var0.replace("ITEM_GUIDE_SELECTED_", ""));

      for (int var2 = 47505; var2 < 47704; var2++) {
         if (rs.p_n.C_e.H[var2] != null && rs.p_n.C_e.H[var2].at != null) {
            String var3 = "<img=24>";
            if (rs.p_n.C_e.H[var2].at.contains(var3)) {
               rs.p_n.C_e.H[var2].at = rs.p_n.C_e.H[var2].at.replaceAll("<img=24> ", "");
            }

            if (var2 == var1) {
               rs.p_n.C_e.H[var2].at = "<img=24> " + rs.p_n.C_e.H[var2].at;
            }
         }
      }
   }

   public C_ab(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(47500);
      var1.f();
      a(47501, "Official SpawnPK Item Library", this.a, 2, 16751360, true, true);
      a(47502, "", this.a, 2, 16751360, false, true);
      a(47503, "Selected Item Guide Title Text", this.a, 2, 16751360, false, true);
      rs.p_n.C_e var2 = d(47504);
      var2.aH = 2350;
      var2.P = 168;
      var2.aR = 436;
      var2.k(200);

      for (int var3 = 0; var3 < 200; var3++) {
         int var4 = 47505 + var3;
         a(var4, "", this.a, 0, 16751360, false, true);
         var2.b(var3, var4, 3, 3 + var3 * 15);
      }

      a(47705, 110, 250);
      short var8 = 4907;
      rs.p_n.C_e.H['멙'].af = var8;
      rs.p_n.C_e.H['멙'].aT = 750;
      rs.p_n.C_e.H['멙'].aV = 1550;
      rs.p_n.C_e.H['멙'].ar = 0;
      rs.p_n.C_e.H['멙'].F = 0;
      rs.p_n.C_e.H['멙'].aD = rs.p_d.C_d.c(var8).w;
      rs.p_n.C_e.H['멙'].aE = rs.p_d.C_d.c(var8).w;
      a(47813, 110, 250);
      var8 = 4908;
      rs.p_n.C_e.H['뫅'].af = var8;
      rs.p_n.C_e.H['뫅'].aT = 750;
      rs.p_n.C_e.H['뫅'].aV = 1550;
      rs.p_n.C_e.H['뫅'].ar = 0;
      rs.p_n.C_e.H['뫅'].F = 0;
      rs.p_n.C_e.H['뫅'].aD = rs.p_d.C_d.c(var8).w;
      rs.p_n.C_e.H['뫅'].aE = rs.p_d.C_d.c(var8).w;
      h(47706, "wiki/item 1");
      h(47839, "wiki/item 8");
      a(47707, Boolean.valueOf(false));
      H['멛'].P = 3;
      H['멛'].ac = 9;
      H['멛'].ap = 8;
      rs.p_n.C_e var10 = d(47708);
      a(47816, "wiki/item", 3, 37, 35, "View equipment bonuses", -1, 47817, 1);
      a(47817, "wiki/item", 4, 37, 35, 47818);
      var10.aH = 1000;
      var10.P = 536;
      var10.aR = 436;
      var10.k(107);
      byte var5 = 20;
      var10.b(0, 47706, 10, 5 + var5 - 10);
      var10.b(1, 47707, 27, 6 + var5 - 10);
      var10.b(2, 47705, 215, 0 + var5 - 5);
      var10.b(3, 47816, 26, 7 + var5 - 10);
      var10.b(4, 47817, 26, 7 + var5 - 10);
      var10.b(5, 47813, 375, 0 + var5 - 5);
      var10.b(6, 47839, 0, 230);

      for (int var6 = 0; var6 < 100; var6++) {
         int var7 = 47709 + var6;
         a(var7, "", this.a, 0, 16751360, false, true);
         var10.b(7 + var6, var7, 253, 210 + var6 * 15 + 25);
      }

      a(47809, "wiki/button", 1, 185, 32, "Search by item", -1, 47810, 1);
      a(47810, "wiki/button", 2, 185, 25, 47811);
      a(47812, "<img=39> Search for an item", this.a, 0, 16751360, true, true);
      c(47814, 1, "wiki/sprite");
      c(47815, 2, "wiki/sprite");
      c(47819, 5, "wiki/item");
      a(47820, "Attack bonus", this.a, 2, 14983494, false, true);
      a(47821, "Stab: +0", this.a, 1, 14983494, false, true);
      a(47822, "Slash: +0", this.a, 1, 14983494, false, true);
      a(47823, "Crush: +0", this.a, 1, 14983494, false, true);
      a(47824, "Magic: +0", this.a, 1, 14983494, false, true);
      a(47825, "Range: +0", this.a, 1, 14983494, false, true);
      a(47826, "Defence bonus", this.a, 2, 14983494, false, true);
      a(47827, "Stab: +0", this.a, 1, 14983494, false, true);
      a(47828, "Slash: +0", this.a, 1, 14983494, false, true);
      a(47829, "Crush: +0", this.a, 1, 14983494, false, true);
      a(47830, "Magic: +0", this.a, 1, 14983494, false, true);
      a(47831, "Range: +0", this.a, 1, 14983494, false, true);
      a(47832, "Other bonuses", this.a, 2, 14983494, false, true);
      a(47833, "Strength: +0", this.a, 1, 14983494, false, true);
      a(47834, "Range strength: +0", this.a, 1, 14983494, false, true);
      a(47835, "Prayer: +0", this.a, 1, 14983494, false, true);
      a(47836, "wiki/item", 6, 24, 23, "Close preview", -1, 47837, 1);
      a(47837, "wiki/item", 7, 24, 23, 47838);
      a(false);
      h();
      j();
      var1.k(32);
      var1.b(0, 47814, 2, 2);
      var1.b(1, 65418, 746, 9);
      var1.b(2, 65419, 746, 9);
      var1.b(3, 47501, 395, 10);
      var1.b(4, 47502, 16, 40);
      var1.b(5, 47504, 13, 61);
      var1.b(6, 47708, 208, 61);
      var1.b(7, 47809, 11, 31);
      var1.b(8, 47810, 11, 31);
      var1.b(9, 47812, 100, 42);
      var1.b(10, 47815, 442, 26);
      var1.b(11, 47815, 242, 26);
      var1.b(12, 47503, 208, 40);
      var1.b(13, 47819, 11, 61);
      var1.b(14, 47820, 17, 64);
      var1.b(15, 47821, 22, 80);
      var1.b(16, 47822, 22, 95);
      var1.b(17, 47823, 22, 110);
      var1.b(18, 47824, 22, 125);
      var1.b(19, 47825, 22, 140);
      var1.b(20, 47826, 17, 162);
      var1.b(21, 47827, 22, 178);
      var1.b(22, 47828, 22, 193);
      var1.b(23, 47829, 22, 208);
      var1.b(24, 47830, 22, 223);
      var1.b(25, 47831, 22, 238);
      var1.b(26, 47832, 17, 260);
      var1.b(27, 47833, 22, 275);
      var1.b(28, 47834, 22, 289);
      var1.b(29, 47835, 22, 304);
      var1.b(30, 47836, 169, 64);
      var1.b(31, 47837, 169, 64);
   }

   public static rs.p_a.C_h b(boolean var0) {
      int var1 = 0;
      if (bK.get("WEAPON") != null) {
         var1 = bK.get("WEAPON") + 512;
      }

      int var2 = var0 ? 313 : 274;
      if (bK.get("CHEST") != null) {
         var2 = bK.get("CHEST") + 512;
      }

      int var3 = 0;
      if (bK.get("ARM") != null) {
         var3 = bK.get("ARM") + 512;
      }

      int var4 = var0 ? 319 : 282;
      if (bK.get("WRIST") != null) {
         var4 = bK.get("WRIST");
      }

      int var5 = 0;
      if (bK.get("HEAD") != null) {
         var5 = bK.get("HEAD") + 512;
      }

      int var6 = var0 ? 306 : 256;
      if (bK.get("HAIR") != null) {
         var6 = bK.get("HAIR");
      }

      int var7 = var0 ? 0 : 266;
      if (bK.get("BEARD") != null) {
         var7 = bK.get("BEARD");
      }

      int var8 = 298;
      if (bK.get("FEET") != null) {
         var8 = bK.get("FEET") + 512;
      }

      int var9 = var0 ? 330 : 292;
      if (bK.get("LEGS") != null) {
         var9 = bK.get("LEGS") + 512;
      }

      int var10 = var0 ? 323 : 289;
      if (bK.get("HANDS") != null) {
         var10 = bK.get("HANDS") + 512;
      }

      int var11 = 0;
      if (bK.get("AMULET") != null) {
         var11 = bK.get("AMULET") + 512;
      }

      int var12 = 0;
      if (bK.get("CAPE") != null) {
         var12 = bK.get("CAPE") + 512;
      }

      rs.p_n.C_e.H['멙'].aD = bL;
      rs.p_n.C_e.H['멙'].aE = bL;
      rs.p_n.C_e.H['뫅'].aD = bL;
      rs.p_n.C_e.H['뫅'].aE = bL;
      return var0
         ? rs.p_a.C_k.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 1)
         : rs.p_a.C_k.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
   }

   public static void a(String var0, int var1) {
      if (var0.startsWith("SLOT_")) {
         int var5 = Integer.parseInt(var0.replace("SLOT_", "")) - 1;
         H['멛'].az[var5] = var1 + 1;
         H['멛'].ax[var5] = 1;
      } else if (var0.equals("ANIMATION")) {
         bL = var1;
      } else {
         byte var2 = -1;
         switch (var0) {
            case "HEAD":
               var2 = 1;
               break;
            case "WEAPON":
               var2 = 6;
               break;
            case "CHEST":
               var2 = 7;
               break;
            case "FEET":
               var2 = 13;
               break;
            case "LEGS":
               var2 = 10;
               break;
            case "HANDS":
               var2 = 12;
               break;
            case "AMULET":
               var2 = 4;
               break;
            case "CAPE":
               var2 = 3;
               break;
            case "RING":
               var2 = 14;
               break;
            case "ARROWS":
               var2 = 5;
               break;
            case "ARM":
               var2 = 8;
         }

         if (var2 != -1 && rs.p_n.C_e.H['멜'].am[3] != -5000) {
            H['멛'].az[var2] = var1 + 1;
            H['멛'].ax[var2] = 1;
            if (var2 == 5) {
               rs.p_d.C_k var3 = rs.p_d.C_k.f(var1);
               if (var3 != null && var3.w != null && !var3.w.toLowerCase().contains("blessing")) {
                  H['멛'].ax[var2] = 1000;
               }
            }
         }

         bK.put(var0, var1);
      }
   }
}
