package rs.p_n.p_c;

import java.util.ArrayList;
import java.util.List;

public class C_c extends rs.p_n.C_c {
   public static final int c = 30378;
   public static rs.p_n.p_d.C_c d;
   public static rs.p_n.p_d.C_c e;
   private static final int bM = 30394;
   private static final int bN = 30379;
   private static final int bO = 25;
   private static final int bP = 11;
   private static final String bQ = "<str=3145472>                                                    ";
   public static List<C_c.b> f = new ArrayList<>();
   public static List<C_c.b> g = new ArrayList<>();
   public static int bI = 0;
   public static int bJ = 0;
   public static int bK = 0;
   private static rs.p_l.p_f.p_a.p_k.C_a bR = new rs.p_l.p_f.p_a.p_k.C_a();
   public static rs.p_q.p_a.p_a.C_a bL = new C_d();

   public C_c(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   private static void a(C_c.b var0, int var1) {
      byte var2 = 25;
      int var3 = var1 * 70 + 5;
      int var4 = bI == 0 ? 30395 : bI;
      if (var0.h) {
         rs.p_n.p_a.C_e.a(++var4, "teleport/sprite 31");
      } else if (var0.f >= var0.g) {
         rs.p_n.p_a.C_e.a(++var4, "teleport/sprite 32");
      } else {
         rs.p_n.p_a.C_e.a(++var4, "teleport/sprite 20");
      }

      e.a(var4).a(var2, var3);
      switch (var0.a) {
         case a:
            a(++var4, var0.b, 10000, 32);
            break;
         case b:
            d(++var4, 32);
            rs.p_n.C_e.H[var4].af = var0.b;
            break;
         case c:
            d(++var4, 32);
            rs.p_n.C_e.H[var4].af = var0.b;
            rs.p_n.C_e.H[var4].aI = 22;
      }

      e.a(var4).a(var2 + 5, var3 + 3);
      if (var0.d == null) {
         e.a(rs.p_n.p_a.C_f.a(++var4, var0.a(1)).m(16777215).i()).a(var2 + 43, var3 + 12);
         e.a(rs.p_n.p_a.C_f.a(++var4, " ").m(16777215).a()).a(var2 + 43, var3 + 6 + 15);
      } else {
         e.a(rs.p_n.p_a.C_f.a(++var4, var0.a(1)).m(16777215).a()).a(var2 + 43, var3 + 6);
         e.a(rs.p_n.p_a.C_f.a(++var4, var0.a(2)).m(16777215).a()).a(var2 + 43, var3 + 6 + 15);
      }

      rs.p_n.p_a.C_a.b(++var4, "teleport/sprite 23", "Tips & Information").a(++var4, "teleport/sprite 24");
      int var5 = var4 - 1;
      e.a(var4 - 1).a(var2 + 318, var3 + 3);
      e.a(var4).a(var2 + 318, var3 + 3);
      var4++;
      rs.p_n.p_a.C_a.b(++var4, "teleport/sprite 25", "Teleport to Task").a(++var4, "teleport/sprite 26");
      int var6 = var4 - 1;
      e.a(var4 - 1).a(var2 + 318, var3 + 21);
      e.a(var4).a(var2 + 318, var3 + 21);
      var4++;
      rs.p_n.p_a.C_c.g(++var4, 4).a(4).h(0, 0);
      rs.p_n.C_e.H[var4].bD = 20;
      if (var0.e.length > 0) {
         for (int var7 = 0; var7 < Math.min(3, var0.e.length); var7++) {
            rs.p_n.C_e.H[var4].az[var7] = var0.e[var7][0] + 1;
            rs.p_n.C_e.H[var4].ax[var7] = var0.e[var7][1];
         }
      }

      e.a(var4).a(var2 + 80, var3 + 35);
      if (var0.h) {
         e.a(rs.p_n.p_a.C_f.a(++var4, "<img=24> @gre@CLAIMED").j().b()).a(var2 + 285, var3 + 45);
         var4 += 3;
         rs.p_n.C_e.H[var6].bf = false;
         rs.p_n.C_e.H[var6 + 1].bf = false;
         rs.p_n.C_e.H[var5].bf = false;
         rs.p_n.C_e.H[var5 + 1].bf = false;
      } else {
         rs.p_n.C_e.H[var6].bf = true;
         rs.p_n.C_e.H[var6 + 1].bf = true;
         rs.p_n.C_e.H[var5].bf = true;
         rs.p_n.C_e.H[var5 + 1].bf = true;
         if (var0.f >= var0.g) {
            rs.p_n.p_a.C_a.b(++var4, "teleport/sprite 21", "Claim reward").a(++var4, "teleport/sprite 22");
            e.a(var4 - 1).a(var2 + 236, var3 + 38);
            e.a(var4).a(var2 + 236, var3 + 38);
            var4++;
            e.a(rs.p_n.p_a.C_f.a(++var4, "@yel@CLAIM!").j().b()).a(var2 + 285, var3 + 44);
         } else {
            if (var0.g == 1) {
               e.a(rs.p_n.p_a.C_f.a(++var4, "(In-progress)").a().b().m(12171349)).a(var2 + 285, var3 + 45);
            } else {
               e.a(rs.p_n.p_a.C_f.a(++var4, "(" + (var0.g > 999 ? "Prog" : "Progress") + ": " + var0.a("{prog}") + ")").a().b().m(12171349))
                  .a(var2 + 285, var3 + 45);
            }

            var4 += 3;
         }
      }

      bI = var4;
   }

   private static void b(C_c.a var0, int var1, String var2, String var3, int[][] var4, int var5, int var6, boolean var7) {
      if (g.size() + f.size() < 25) {
         C_c.b var8 = new C_c.b();
         var8.a = var0;
         var8.b = var1;
         var8.c = var2;
         var8.d = var3;
         var8.e = var4;
         var8.f = var5;
         var8.g = var6;
         var8.h = var7;
         if (var7) {
            g.add(var8);
         } else {
            f.add(var8);
         }
      }
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(30378);
      d = new rs.p_n.p_d.C_c(var1);
      d.a(rs.p_n.p_a.C_e.a(30379, "teleport/sprite 19")).a(7, 14);
      rs.p_n.p_a.C_a.b(30380, "teleport/sprite 30", "Next chapter").a(30381, "teleport/sprite 27");
      d.a(30380).a(405, 25);
      d.a(30381).a(405, 25);
      rs.p_n.p_a.C_a.b(30383, "teleport/sprite 28", "Previous chapter").a(30384, "teleport/sprite 29");
      d.a(30383).a(30379, 125, 11);
      d.a(30384).a(30379, 125, 11);
      d.a(rs.p_n.p_a.C_f.a(30386, "No mail message selected!").i().m(12171349).b()).a(30379, 275, 13);
      d.a(rs.p_n.p_a.C_f.a(38387, "Chapter Progress").i().m(12171349).b()).a(30379, 67, 45);
      d.a(rs.p_n.p_a.C_f.a(38388, "0 / 5").j().m(12171349).b()).a(30379, 67, 99);
      if (bR.s() > 0) {
         try {
            rs.p_l.p_f.C_e.d().a((rs.p_l.p_f.p_b.C_d)bR);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

      rs.p_l.p_f.C_e.d().a(bR, 38388);
      d.a(rs.p_n.p_a.C_c.g(30389, 4).a(2).h(10, 5)).a(30379, 30, 170);

      for (int var2 = 0; var2 < 4; var2++) {
         rs.p_n.C_e.H[30389].az[var2] = 996;
         rs.p_n.C_e.H[30389].ax[var2] = 10000;
      }

      rs.p_n.p_a.C_a.b(30390, "teleport/sprite 21", "Claim rewards").a(30391, "teleport/sprite 22");
      d.a(30390).a(30379, 17, 255);
      d.a(30391).a(30379, 17, 255);
      d.a(rs.p_n.p_a.C_f.a(30393, "<img=9> Claim all").a().b().m(12171349)).a(30379, 64, 262);
      e = new rs.p_n.p_d.C_c(rs.p_n.p_a.C_d.f(30394, 366, 250));
      e.a();
      h();
      b(
         C_c.a.a,
         1464,
         "Vote for SPK @or1@(::vote)@whi@ then @or1@(::redeem)@whi@ your vote points!",
         "Then, swap the vote points for @or1@vote tickets@whi@ (via shop)",
         new int[][]{{1464, 1}},
         0,
         1,
         false
      );
      b(C_c.a.c, 12110, "List vote ticket(s) for sale via @or1@Trading Post", null, new int[][]{{20808, 1}}, 0, 1, false);
      b(C_c.a.b, 2831, "Complete the @or1@Undead PKer@whi@ daily activity", null, new int[][]{{4278, 25}, {10834, 10}}, 0, 1, false);
      b(
         C_c.a.a,
         12926,
         "Purchase a @or1@Toxic Blowpipe@whi@ from the Trading Post.",
         "This is a great starter item for PvM!",
         new int[][]{{4278, 25}, {10834, 10}},
         0,
         1,
         false
      );
      b(C_c.a.a, 24263, "Earn 50 @or1@Vintage tickets@whi@ at the @or1@Vintage cave", null, new int[][]{{4278, 50}, {24260, 3}}, 0, 50, false);
      b(C_c.a.c, 2654, "Unlock the @or1@Blood Vengeance I@whi@ perk", null, new int[][]{{10877, 1}}, 0, 1, false);
      b(C_c.a.a, 23912, "Kill {prog} blood-revenants", null, new int[][]{{4278, 50}}, 0, 10, false);
      b(C_c.a.c, 2654, "Unlock the @or1@Blood Whip@whi@ perk", null, new int[][]{{10834, 25}}, 0, 1, false);
      b(C_c.a.c, 2654, "Dip an abyssal whip in the blood fountain", "to create a Blood whip (perk required)", new int[][]{{20808, 1}}, 0, 1, false);
      i();
      d.a(30394).a(30379, 110, 42);
      d.a(63740).a(30379, 475, 13);
      d.a(63741).a(30379, 475, 13);
      d.a();
   }

   public static void h() {
      e.b();
      f.clear();
      g.clear();
      bI = 0;
   }

   public static void i() {
      int var0 = 0;

      for (C_c.b var2 : f) {
         a(var2, var0++);
      }

      for (C_c.b var5 : g) {
         a(var5, var0++);
      }

      int var4 = f.size() + g.size();
      j().aH = var4 * 74;
      e.a();
   }

   public static rs.p_n.C_e j() {
      return rs.p_n.C_e.H[30394];
   }

   public static enum a {
      a,
      b,
      c;
   }

   static class b {
      public C_c.a a;
      public int b;
      public String c;
      public String d;
      public int[][] e;
      public int f;
      public int g;
      public boolean h;

      public String a(int var1) {
         String var2 = null;
         if (var1 == 1) {
            var2 = this.a(this.c);
         }

         if (var1 == 2 && this.d != null) {
            var2 = this.a(this.d);
         }

         return var2;
      }

      private String a(String var1) {
         return var1.replace("{prog}", this.f + "/" + this.g);
      }
   }
}
