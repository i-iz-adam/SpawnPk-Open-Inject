package rs.p_n.p_c;

import java.util.HashMap;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_aq extends rs.p_n.C_c {
   private static HashMap<Integer, Integer> g = new HashMap<>();
   private static final int[] bI = new int[]{55303, 55304, 55305, 55306, 55307, 55308, 55309, 55310, 55311, 55312};
   private static final int[] bJ = new int[]{55290, 55291, 55292, 55293, 55333};
   private static final int[][] bK = new int[][]{{55313, 55321}, {55315, 55323}, {55317, 55325}, {55319, 55327}, {55329}};
   public static long[] c = new long[5];
   public static rs.p_l.C_F_uc d = null;
   public static rs.p_l.C_F_uc e = null;
   public static rs.p_q.p_a.p_a.C_a f = new C_ar();

   public C_aq(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static boolean a(String var0, int var1) {
      rs.p_l.C_F_uc var2;
      if (var0.startsWith("npc_")) {
         int var3 = Integer.parseInt(var0.substring(4));
         var2 = rs.p_d.C_e.a(rs.p_d.C_e.a.a, var3, 64);
         if (var2 == null) {
            long var4 = c[var1];
            String var6 = "load_npc_head_" + var3;
            if (!rs.p_h.C_c.a(var6)) {
               rs.p_h.C_c.a(var6, () -> System.currentTimeMillis() - var4 >= 10000L || c[var1] != var4 ? false : !a(var0, var1));
            }
         }
      } else {
         var2 = new rs.p_l.C_F_uc(var0);
         if (var2.n < 32 && var2.o < 32) {
            var2.b(var2.n * 2, var2.o * 2);
         }
      }

      if (var2 == null) {
         a(C_Client_mc.fE[291], var1);
         return false;
      } else {
         a(var2, var1);
         return true;
      }
   }

   public static void a(rs.p_l.C_F_uc var0, int var1) {
      char var2 = '\ud812';
      if (var1 == 1) {
         var2 = '\ud814';
      }

      if (var1 == 2) {
         var2 = '\ud816';
      }

      if (var1 == 3) {
         var2 = '\ud818';
      }

      a(var2, var0);
      rs.p_n.C_e.H[var2].bn = false;
      rs.p_n.C_e.H[var2].aJ = (64 - var0.n) / 2;
      rs.p_n.C_e.H[var2].aP = (64 - var0.o) / 2;
      var2 = '\ud81a';
      if (var1 == 1) {
         var2 = '\ud81c';
      }

      if (var1 == 2) {
         var2 = '\ud81e';
      }

      if (var1 == 3) {
         var2 = '\ud820';
      }

      if (var1 == 4) {
         var2 = '\ud822';
      }

      a(var2, var0);
      rs.p_n.C_e.H[var2].bn = false;
      rs.p_n.C_e.H[var2].aJ = (55 - var0.n) / 2;
      rs.p_n.C_e.H[var2].aP = (55 - var0.o) / 2;
   }

   @Override
   public void a() {
      e = new rs.p_l.C_F_uc("options/make/sprite 3");
      d = new rs.p_l.C_F_uc("options/make/sprite 4");
      a(55301, "How many would you like to make?", this.a, 2, 4206624, true, false);
      a(55302, "Choose a quantity, then click an image to begin.", this.a, 0, 6312008, true, false);
      b(55303, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
      a(55304, "1", this.a, 0, 4206624, true, false);
      b(55305, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
      a(55306, "5", this.a, 0, 4206624, true, false);
      b(55307, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
      a(55308, "10", this.a, 0, 4206624, true, false);
      b(55309, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
      a(55310, "X", this.a, 0, 4206624, true, false);
      b(55311, 4, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
      a(55312, "@whi@All", this.a, 0, 4206624, true, false);
      b(55313, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
      c(55314, 379, 64);
      rs.p_n.C_e.H['\ud812'].bq = 100;
      b(55315, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
      c(55316, 379, 64);
      rs.p_n.C_e.H['\ud814'].bq = 100;
      b(55317, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
      c(55318, 379, 64);
      rs.p_n.C_e.H['\ud816'].bq = 100;
      b(55319, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
      c(55320, 379, 64);
      rs.p_n.C_e.H['\ud818'].bq = 100;
      b(55321, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
      c(55322, 379, 55);
      rs.p_n.C_e.H['\ud81a'].bq = 100;
      b(55323, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
      c(55324, 379, 55);
      rs.p_n.C_e.H['\ud81c'].bq = 100;
      b(55325, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
      c(55326, 379, 55);
      rs.p_n.C_e.H['\ud81e'].bq = 100;
      b(55327, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
      c(55328, 379, 55);
      rs.p_n.C_e.H['\ud820'].bq = 100;
      b(55329, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
      c(55330, 379, 55);
      rs.p_n.C_e.H['\ud822'].bq = 100;

      for (int var1 = 0; var1 < bK.length; var1++) {
         int[] var2 = bK[var1];

         for (int var6 : var2) {
            rs.p_n.C_e.H[var6].bG = (var1x, var2x) -> {
               if (rs.p_n.C_e.H[var6].bx) {
                  int var3 = 45;
                  if (var6 >= 55321) {
                     var3 -= 3;
                  }

                  C_Client_mc.gl.c(rs.p_n.C_e.H[var6].Q, var1x + rs.p_n.C_e.H[var6].E.n / 2 - 1, var2x - 5, 0, -1);
               }
            };
            String var7 = var1 + 1 + ".";
            rs.p_n.C_e.H[var6].bH = (var2x, var3) -> {
               if (rs.p_n.C_e.H[var6].bx) {
                  C_Launcher_mc.n().o().gm.b(var7, var2x + 6, var3 + 17, 16777215, 0);
               }
            };
         }
      }

      int var10 = 0;
      rs.p_n.C_e var46 = d(55290);
      var46.k(14);
      var10 = this.a(var46);
      var46.b(var10++, 55313, 195, 36);
      var46.b(var10++, 55314, 212, 41);
      rs.p_n.C_e var47 = d(55291);
      var47.k(16);
      var10 = this.a(var47);
      var47.b(var10++, 55313, 135, 36);
      var47.b(var10++, 55314, 152, 41);
      var47.b(var10++, 55315, 255, 36);
      var47.b(var10++, 55316, 272, 41);
      rs.p_n.C_e var48 = d(55292);
      var48.k(18);
      var10 = this.a(var48);
      var48.b(var10++, 55313, 85, 36);
      var48.b(var10++, 55314, 102, 41);
      var48.b(var10++, 55315, 195, 36);
      var48.b(var10++, 55316, 212, 41);
      var48.b(var10++, 55317, 305, 36);
      var48.b(var10++, 55318, 322, 41);
      rs.p_n.C_e var49 = d(55293);
      var49.k(20);
      var10 = this.a(var49);
      var49.b(var10++, 55313, 15, 36);
      var49.b(var10++, 55314, 32, 41);
      var49.b(var10++, 55315, 135, 36);
      var49.b(var10++, 55316, 152, 41);
      var49.b(var10++, 55317, 255, 36);
      var49.b(var10++, 55318, 272, 41);
      var49.b(var10++, 55319, 375, 36);
      var49.b(var10++, 55320, 392, 41);
      rs.p_n.C_e var50 = d(55333);
      var50.k(22);
      var10 = this.a(var50);
      byte var51 = -5;
      int var8 = -2 + var51;
      byte var9 = 0;
      var50.b(var10++, 55321, 5 + var51, 36);
      var50.b(var10++, 55322, 22 + var8, 41 + var9);
      var50.b(var10++, 55323, 103 + var51, 36);
      var50.b(var10++, 55324, 120 + var8, 41 + var9);
      var50.b(var10++, 55325, 201 + var51, 36);
      var50.b(var10++, 55326, 218 + var8, 41 + var9);
      var50.b(var10++, 55327, 299 + var51, 36);
      var50.b(var10++, 55328, 316 + var8, 41 + var9);
      var50.b(var10++, 55329, 397 + var51, 36);
      var50.b(var10++, 55330, 414 + var8, 41 + var9);
   }

   public int a(rs.p_n.C_e var1) {
      int var2 = 0;
      var1.b(var2++, 55301, 150, 0);
      var1.b(var2++, 55302, 150, 17);
      var1.b(var2++, 55303, 285, 0);
      var1.b(var2++, 55304, 302, 9);
      var1.b(var2++, 55305, 325, 0);
      var1.b(var2++, 55306, 342, 9);
      var1.b(var2++, 55307, 365, 0);
      var1.b(var2++, 55308, 382, 9);
      var1.b(var2++, 55309, 405, 0);
      var1.b(var2++, 55310, 422, 9);
      var1.b(var2++, 55311, 445, 0);
      var1.b(var2++, 55312, 462, 9);
      return var2;
   }
}
