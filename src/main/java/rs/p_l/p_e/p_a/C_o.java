package rs.p_l.p_e.p_a;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_o extends rs.p_l.p_e.C_f {
   private static final String O = "HG";
   private static final String P = "<img=79> @gre@H'ween Hunger Games Lobby <img=79>";
   private static final String Q = "<img=244> @gr1@(There must be 5-15 players for a match to start) <img=244>";
   private static final String R = "<img=233>";
   private static final String S = "<img=121>";
   private static final String T = "@or1@Next event: @whi@<img=230>";
   private static final String U = "@or1@Next power-up: @whi@<img=231>";
   private static final String V = "@gre@Ceasefire time: <img=37>";
   private static final String W = "<img=91> @lre@Players can't fight yet";
   private static final String X = "<img=246> @gre@Players can open chests!";
   private static final String Y = "@cya@Safety Countdown: <img=37>";
   private static final String Z = "<img=91> @lre@Players can't fight yet";
   private static final String aa = "<img=247> @lre@Players can't open chests yet";
   private static final String ab = "@or1@Match Type:";
   public static String p = "";
   public static String q = "";
   public static String r = "";
   public static String s = "@whi@Wins: 0 | Matches: 0 | Points: 0";
   public static String t = "";
   public static String u = "";
   public static final String v = "...";
   public static final String w = "...";
   public static long x = 0L;
   public static long y = 0L;
   public static long z = 0L;
   public static boolean A = false;
   public static boolean B = false;
   public static int C = 0;
   public static final int D = 135;
   public static boolean E = false;
   public static int F = -1;
   public static long G = 0L;
   public static long H = 0L;
   public static int I = 0;
   public static String J = "Match Style: @gre@N/A";
   public static String K = "";
   public static String L = "";
   public static String M = "";
   public static C_F_uc N;

   @Override
   public void b() {
      N = new C_F_uc("popups/cancel");
      this.a(new int[]{18032, 18033, 18034, 18041, 18042, 18043, 18044}, new C_p(this));
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.Mode var2) {
      if (var2 == rs.p_l.p_e.C_f.Mode.a) {
         if (B && !var1.aJ) {
            int var3 = rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? 180 : 10;
            var1.gm.c("<img=50> You're in the fog! Go to the <img=73> Safe Zone, south of the map! <img=50>", 256, C_Client_mc.ak - var3, 16777215, 0);
            rs.p_l.C_c.b(C_Client_mc.ak, 0, 0, 15282688, C_Client_mc.aj, 60);
         }

         if (C_Client_mc.ed == 197 && rs.p_n.C_e.H[199].at.contains("HG")) {
            this.d(var1);
         }
      } else {
         if (var1.aJ) {
            this.b(var1);
         } else if (C_Client_mc.ed == 197 && rs.p_n.C_e.H[199].at.contains("HG")) {
            this.c(var1);
         }
      }
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return var1.aJ || C_Client_mc.ed == 197 && rs.p_n.C_e.H[199].at.contains("HG");
   }

   public void b(C_Client_mc var1) {
      int var2 = 120;
      byte var3 = 15;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         var3 = 5;
         var2 = C_Client_mc.aj / 2 - 150;
      }

      int var4 = rs.p_l.C_h.ap;
      byte var5 = 125;
      rs.p_l.C_c.b(60, var3, var2, 4884594, 300, var5);
      rs.p_l.C_c.b(58, var3 + 1, var2 + 1, 4863488, 298, var5);
      var1.gm.c(r, var2 + 150, var3 + 18, 16777215, 0);
      C_Client_mc.gl.c("<img=244> @gr1@(There must be 5-15 players for a match to start) <img=244>", var2 + 150, var3 + 35, 16777215, 0);
      C_Client_mc.gl.c(s, var2 + 150, var3 + 53, 16777215, 0);
      rs.p_l.C_h.ap = var4;
   }

   public void c(C_Client_mc var1) {
      int var2 = 397;
      byte var3 = 2;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         var2 = 200 + (C_Client_mc.ai - 560);
         var3 = 25;
      }

      rs.p_l.C_c.b(41, var3, var2, 12884294, 113, 50);
      rs.p_l.C_c.b(35, var3 + 3, var2 + 3, 4863488, 107, 100);
      C_Client_mc.gl.b("<img=233>", var2 + 9, var3 + 17, 16777215, 0);
      C_Client_mc.gl.b("<img=121>", var2 + 8, var3 + 18 + 14 + 1, 16777215, 0);
      C_Client_mc.gl.b(t, var2 + 8 + 17, var3 + 17 + 1, 16777215, 0);
      C_Client_mc.gl.b(u, var2 + 8 + 17, var3 + 18 + 14 + 1, 16777215, 0);
      if (A) {
         if (C <= 1) {
            var1.gm.a(C == 0 ? "@cya@Safety Countdown: <img=37>" : "@gre@Ceasefire time: <img=37>", var2 + 110 - 15, var3 + 55, 16777215, 0);
            long var4 = (z - System.currentTimeMillis()) / 1000L;
            if (var4 < 0L) {
               var4 = 0L;
            }

            if (F == C) {
               this.f();
               F++;
            }

            var1.gm.b(var4 + "", var2 + 97, var3 + 55, 16777215, 0);
            C_Client_mc.gl
               .a(C == 0 ? "<img=247> @lre@Players can't open chests yet" : "<img=246> @gre@Players can open chests!", var2 + 110, var3 + 55 + 16, 16777215, 0);
            C_Client_mc.gl
               .a(C == 0 ? "<img=91> @lre@Players can't fight yet" : "<img=91> @lre@Players can't fight yet", var2 + 110, var3 + 55 + 16 + 16, 16777215, 0);
         } else {
            C_Client_mc.gl.a("@or1@Next event: @whi@<img=230>", var2 + 110 - 15, var3 + 54, 16777215, 0);
            if (x > System.currentTimeMillis()) {
               long var6 = (x - System.currentTimeMillis()) / 1000L;
               C_Client_mc.gl.b(var6 + "", var2 + 97, var3 + 54, 16777215, 0);
            } else {
               C_Client_mc.gl.b("...", var2 + 97, var3 + 54, 16777215, 0);
            }

            C_Client_mc.gl.a("@or1@Next power-up: @whi@<img=231>", var2 + 110 - 15, var3 + 54 + 15, 16777215, 0);
            if (y > System.currentTimeMillis()) {
               long var7 = (y - System.currentTimeMillis()) / 1000L;
               C_Client_mc.gl.b(var7 + "", var2 + 97, var3 + 55 + 15, 16777215, 0);
            } else {
               C_Client_mc.gl.b("...", var2 + 97, var3 + 55 + 15, 16777215, 0);
            }
         }
      }
   }

   public void d(C_Client_mc var1) {
      int var2 = 397;
      short var3 = 2;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         var2 = 200 + (C_Client_mc.ai - 560);
         var3 = (byte)25;
      }

      if (I > 0 || E) {
         if (E) {
            I += 2;
            if (I >= 135) {
               E = false;
            }
         } else {
            if (H == 0L) {
               H = System.currentTimeMillis() + G;
            }

            if (System.currentTimeMillis() > H) {
               I--;
            }
         }

         if (I <= 0) {
            I = 0;
         }

         if (I > 135) {
            I = 135;
         }

         var2 = 120;
         var3 = 250;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var3 = 300;
            var2 = C_Client_mc.aj / 2 - 150;
         }

         long var4 = (z - System.currentTimeMillis()) / 1000L;
         if (var4 < 0L) {
            var4 = 0L;
         }

         if (C == 0) {
            K = "<img=49> @gre@Safety Countdown <img=49>";
            L = "Contestants can not fight or open chests yet!";
            M = "<img=247> @yel@Chests unlock in " + var4 + " seconds! <img=247>";
         }

         if (C == 1) {
            K = "<img=73> @gre@Ceasefire Stage <img=73>";
            L = "@yel@Contestants can now safely loot chests!";
            M = "<img=50> @or1@PvP enables in " + var4 + " seconds! <img=50>";
         }

         rs.p_l.C_c.b(65, var3, var2, 12884294, 300, I);
         rs.p_l.C_c.b(59, var3 + 3, var2 + 3, 4863488, 294, I);
         int var6 = rs.p_l.C_h.ap;
         rs.p_l.C_h.ap = (int)((double)I * 1.5);
         if (rs.p_l.C_h.ap > 255) {
            rs.p_l.C_h.ap = 255;
         }

         var1.gn.c(K, var2 + 150, var3 + 20, 16777215, 0);
         var1.gm.c(L, var2 + 150, var3 + 3 + 34, 16777215, 0);
         var1.gm.c(M, var2 + 150, var3 + 3 + 51, 16777215, 0);
         rs.p_l.C_h.ap = var6;
      }
   }

   @Override
   public void c() {
   }

   private void f() {
      E = true;
      G = 3500L;
      H = 0L;
   }
}
