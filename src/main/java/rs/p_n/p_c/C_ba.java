package rs.p_n.p_c;

import java.lang.invoke.StringConcatFactory;

public class C_ba extends rs.p_n.C_c {
   public static int c = 46500;
   public static final int d = 46506;
   public static final int e = 46606;
   public static final int f = 46608;
   public static final int g = 46758;
   public static int bI;
   public static int bJ;
   public static int bK;
   public static int bL;
   public static int bM;
   public static int bN;

   public static void h() {
      bI = 46506;
      bJ = 3;
      bK = 3;
   }

   public static void i() {
      rs.p_n.C_e.H['똏'].V = 0;
      bL = 46608;
      bM = 3;
      bN = 3;
   }

   public static void a(String var0, boolean var1) {
      if (bI == 0) {
         h();
      }

      if (bI >= 46606) {
         System.out.println("[ERROR] OVERFLOW CATEGORY");
      } else {
         int var2 = bI - 46506;
         if (var1) {
            bJ = 3;
            if (var2 > 0) {
               bK += 3;
            }

            a(bI, var0, rs.p_n.C_d.b, 2, 16751360, false, true);
            rs.p_n.C_e.H['떩'].b(var2, bI, bJ, bK);
            bK += 19;
            bJ = 10;
         } else {
            a(bI, var0, var0, rs.p_n.C_d.b, 0, 16750623, false, true, 125);
            rs.p_n.C_e.H['떩'].b(var2, bI, bJ, bK);
            bK += 15;
         }

         bI++;
      }
   }

   public static void b(String var0) {
      if (bL == 0) {
         i();
      }

      if (bL >= 46758) {
         System.out.println("[ERROR] OVERFLOW DESCRIPTION");
      } else {
         String[] var1 = var0.split(",");
         int var2 = Integer.parseInt(var1[0]);
         int var3 = Integer.parseInt(var1[1]);
         int var4 = Integer.parseInt(var1[2]);
         int var5 = Integer.parseInt(var1[3]);
         if (var2 == -1) {
            bN += var5;
         } else {
            int var6 = bL - 46608;
            h(bL, "wiki/guide " + var2);
            rs.p_n.C_e.H[bL].l = true;
            rs.p_n.C_e.H['똏'].b(var6, bL, bM + var3, bN + var4);
            bN += var5;
            bL++;
         }
      }
   }

   public static void b(String var0, boolean var1) {
      if (bL == 0) {
         i();
      }

      if (bL >= 46758) {
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

         if (rs.p_n.C_e.H[bL] != null && rs.p_n.C_e.H[bL].aI == 5) {
            rs.p_n.C_e.H[bL].E = null;
            rs.p_n.C_e.H[bL].aG = null;
         }

         if (var1) {
            if (var0.startsWith("{")) {
               String var4 = var0.split("}")[1];
               String var5 = var0.split("}")[0];
               int var6 = Integer.parseInt(var5.replace("{", ""));
               a(bL, var4, "Select option", rs.p_n.C_d.b, 0, var6, var2, true, 500);
            } else {
               a(bL, var0, "Select option", rs.p_n.C_d.b, 0, 16750623, var2, true, 500);
            }
         } else if (var3) {
            a(bL, var0, rs.p_n.C_d.b, 1, 16751360, var2, true);
         } else {
            a(bL, var0, rs.p_n.C_d.b, 0, 16751360, var2, true);
         }

         int var7 = bL - 46608;
         rs.p_n.C_e.H['똏'].b(var7, bL, bM + (var2 ? (var1 ? -116 : 134) : 0), bN);
         bN += 15 + (var3 ? 4 : 0);
         bL++;
      }
   }

   public static void j() {
      if (bI < 46606) {
         for (int var0 = bI; var0 < 46606; var0++) {
            rs.p_n.C_e.H[var0].at = "";
         }
      }
   }

   public static void k() {
      if (bL < 46758) {
         for (int var0 = bL; var0 < 46758; var0++) {
            rs.p_n.C_e.H[var0].at = "";
            if (rs.p_n.C_e.H[var0].aI == 5) {
               rs.p_n.C_e.H[var0].E = null;
               rs.p_n.C_e.H[var0].aG = null;
            }
         }
      }
   }

   public static void c(String var0) {
      int var1 = Integer.parseInt(var0.replace("WIKI_SELECTED_", ""));

      for (int var2 = 46506; var2 < 46606; var2++) {
         if (rs.p_n.C_e.H[var2] != null && rs.p_n.C_e.H[var2].at != null) {
            String var3 = "<img=39> ";
            if (rs.p_n.C_e.H[var2].at.contains(var3)) {
               rs.p_n.C_e.H[var2].at = rs.p_n.C_e.H[var2]
                  .at
                  .replaceAll(String.valueOf(var3), "");
            }

            if (var2 == var1) {
               rs.p_n.C_e.H[var2].at = var3 + rs.p_n.C_e.H[var2].at;
            }
         }
      }
   }

   public C_ba(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(c);
      h(46501, "wiki/sprite 0");
      a(46502, "Official SpawnPK Knowledgebase", this.a, 2, 16751360, true, true);
      a(46503, "Category List", this.a, 2, 16751360, false, true);
      a(46504, "Selected Article Title Text", this.a, 2, 16751360, false, true);
      byte var2 = 100;
      rs.p_n.C_e var3 = d(46505);
      var3.aH = 1000;
      var3.P = 168;
      var3.aR = 261;
      var3.k(var2);

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = 46506 + var4;
         a(var5, "", this.a, 0, 16751360, false, true);
         var3.b(var4, var5, 3, 3 + var4 * 15);
      }

      short var8 = 150;
      rs.p_n.C_e var9 = d(46607);
      var9.aH = 2000;
      var9.P = 277;
      var9.aR = 261;
      var9.k(var8);

      for (int var6 = 0; var6 < var8; var6++) {
         int var7 = 46608 + var6;
         a(var7, "", this.a, 0, 16751360, false, true);
         var9.b(var6, var7, 3, 3 + var6 * 15);
      }

      h();
      j();
      a(46759, "drops/sprite", 3, 17, 17, "Go back", -1, 46760, 1);
      a(46760, "drops/sprite", 4, 17, 17, 46761);
      var1.k(10);
      var1.b(0, 46501, 2, 2);
      var1.b(1, 65418, 487, 9);
      var1.b(2, 65419, 487, 9);
      var1.b(3, 46502, 270, 10);
      var1.b(4, 46503, 16, 40);
      var1.b(5, 46504, 208, 40);
      var1.b(6, 46505, 13, 61);
      var1.b(7, 46607, 208, 61);
      var1.b(8, 46759, 9, 9);
      var1.b(9, 46760, 9, 9);
   }
}
