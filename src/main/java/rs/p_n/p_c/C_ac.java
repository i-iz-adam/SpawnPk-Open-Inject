package rs.p_n.p_c;

public class C_ac extends rs.p_n.C_c {
   public static rs.p_n.p_d.C_c c;
   public static int d = 0;
   public static final int e = 5;
   public static int f = 0;
   public static int g = 32;
   public static int bI = 20;
   public static boolean bJ = true;
   private static final int bU = 32;
   private static final int bV = 20;
   public static int bK = 431;
   public static int bL = 431;
   public static final String bM = "";
   public static final int bN = 700;
   public static final int[] bO = new int[700];
   public static final int[] bP = new int[700];
   public static final String[] bQ = new String[700];
   public static final String[] bR = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", null};
   public static final String[] bS = new String[]{"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All", null};
   public static final int[] bT = new int[]{36004, 36005, 36006, 36008, 36009, 36010};

   public C_ac(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(36000);
      c = new rs.p_n.p_d.C_c(var1);
      rs.p_n.p_a.C_e.a(36800, "list/bg");
      rs.p_n.p_a.C_e.a(36801, "list/bg bottom");
      rs.p_n.p_a.C_e.a(36802, "list/bg top").bf = false;
      rs.p_n.p_a.C_e.a(36803, "list/bg foot");
      c.a(36800).a(13, 13);
      c.a(36801).a(36800, false, true, 6, -39);
      c.a(36802).a(36800, false, false, 9, 25);
      c.a(36803).a(36800, false, true, 0, -9);

      for (int var2 = 0; var2 < 5; var2++) {
         rs.p_n.p_a.C_a.b(36804 + var2, "slayer/image 10", " Select tab");
         a(36809 + var2, "Tab 1", this.a, 0, 16750623, true, true);
         int var3 = 13 + 91 * var2;
         byte var4 = 28;
         c.a(36804 + var2).a(36800, var3, var4);
         c.a(36809 + var2).a(36800, var3 + 41, var4 + 4);
      }

      c.a(63740).a(476, 17);
      c.a(63741).a(476, 17);
      a(36001, "Item List Title", this.a, 2, 16751360, true, true);
      c.a(36001).a(258, 18);
      a(36002, "Description Line 1", this.a, 1, 16751360, false, true);
      a(36003, "Description Line 1 (small)", this.a, 0, 12171349, false, true);
      c.a(36002).a(25, 283);
      c.a(36003).a(25, 299);
      rs.p_n.p_a.C_f.a(36814, "").a().m(16751360);
      rs.p_n.p_a.C_f.a(36815, "").a().m(16751360);
      rs.p_n.p_a.C_f.a(36816, "").a().m(16751360);
      rs.p_n.p_a.C_f.a(36817, "").a().m(16751360);

      for (int var13 = 36814; var13 <= 36817; var13++) {
         c.a(var13).a(36800, false, true, 0, 0);
      }

      a(36004, 5, 36005, 17, "bank/bank", 35, 25, "Deposit all to inventory", 36006, 18, "bank/bank", 36007, "Empty your backpack into\nyour bank", 0, 20);
      c.a(36004).a(415, 284);
      c.a(36005).a(400, 224);
      a(36008, 5, 36009, 31, "bank/bank", 31, 25, "Deposit all to bank", 36010, 31, "bank/bank", 36011, "Empty your backpack into\nyour bank", 0, 20);
      c.a(36008).a(455, 284);
      c.a(36009).a(440, 224);
      rs.p_n.p_a.C_a.b(36012, "wiki/button 1", " Search by item").a(36013, "wiki/button 2");
      a(36015, "<img=39> Search for an item", this.a, 0, 16751360, true, true);
      c.a(36012).a(21, 281);
      c.a(36013).a(21, 281);
      c.a(36015).a(110, 292);
      rs.p_n.p_a.C_a.b(36016, "drops/sprite 3", " Go back").a(36017, "drops/sprite 4");
      c.a(36016).a(19, 17);
      c.a(36017).a(19, 17);
      a(36019, "Search description text", this.a, 0, 16751360, false, true);
      c.a(36019).a(215, 293);
      rs.p_n.C_e var14 = d(30073);
      rs.p_n.C_e var15 = d(30074);
      rs.p_n.p_a.C_c.g(30074, 28).a(4).h(10, 4);
      var14.k(1);
      var14.b(0, 30074, 16, 8);
      rs.p_n.C_e var16 = d(36026);
      var16.al = new int[1];
      var16.am = new int[1];
      var16.bc = new int[1];
      var16.aH = 500;
      var16.P = 455;
      var16.aR = 243;
      var16.bj = 87;
      var16.k(701);
      var16.b(0, 36025, 15, 10);
      c.a(36026).a(36800, false, false, 8, 25);
      rs.p_n.p_a.C_c.g(36025, 700).a(7).h(g, bI);
      char var5 = '費';
      int var6 = 1;
      int var7 = 0;
      byte var8 = 30;
      byte var9 = 44;
      int var10 = var8;
      int var11 = var9 + 1;

      for (int var12 = var5; var12 < var5 + 700; var12++) {
         a(var12, "", this.a, 0, 16750623, true);
         var16.b(var6++, var12, var10, var11);
         var10 += l(36025).ac + 32;
         if (++var7 >= rs.p_n.C_e.l(36025).P) {
            var7 = 0;
            var10 = var8;
            var11 += l(36025).ap + 32;
         }
      }

      j();
      c.a();
   }

   public static void b(String var0) {
      if (f < 5) {
         int var1 = f++;
         if (!m().bf) {
            c(true);
         }

         l(36804 + var1).bf = true;
         l(36809 + var1).at = var0;
      }
   }

   public static void m(int var0) {
      if (var0 + 1 <= f) {
         for (int var1 = 0; var1 < f; var1++) {
            int var2 = 36804 + var1;
            if (var0 == var1) {
               rs.p_n.C_e.H[var2].E = C_aO_mc.d;
               rs.p_n.C_e.H[var2].aG = C_aO_mc.d;
            } else {
               rs.p_n.C_e.H[var2].E = C_aO_mc.e;
               rs.p_n.C_e.H[var2].aG = C_aO_mc.e;
            }
         }
      }
   }

   public static void c(String var0) {
      l(36025).bf = false;
      int var1 = 0;

      for (int var2 = 0; var2 < d; var2++) {
         int var3 = l(36025).az[var2] - 1;
         int var4 = l(36025).ax[var2];
         String var5 = l(36027 + var2).at;
         if (var3 > 0) {
            rs.p_d.C_k var6 = (rs.p_d.C_k)rs.p_d.C_k.c.b(var3);
            if (var6 != null && var6.w != null && var6.w.toLowerCase().contains(var0.toLowerCase())) {
               bO[var1] = var3;
               bP[var1] = var4;
               bQ[var1] = var5;
               var1++;
            }
         }
      }

      j();

      for (int var7 = 0; var7 < var1; var7++) {
         e(bO[var7], bP[var7], bQ[var7]);
      }

      l(36001).at = "<img=39> Search: @yel@\"" + var0 + "\" @gre@(" + var1 + " results)";
      l(36025).bf = true;
   }

   public static void e(int var0, int var1, String var2) {
      if (d < 700) {
         d(d++, var0, var1, var2);
      }
   }

   public static void d(int var0, int var1, int var2, String var3) {
      l(36027 + var0).at = var3;
      l(36025).az[var0] = var1 == 0 ? 0 : var1 + 1;
      l(36025).ax[var0] = var2;
   }

   public static void h() {
      bK = 431;
      bL = 431;
      c(false);
      d(true);
      o().P = 455;
      o().aR = 244;
      n(7);
      rs.p_n.p_a.C_c var0 = (rs.p_n.p_a.C_c)l(36025);
      if (var0.ac != 32 || var0.ap != 20) {
         g(32, 20);
      }

      i();
   }

   public static void i() {
      l(36026).V = 0;
      l(36026).aH = 500;
      f = 0;

      for (int var0 = 0; var0 < 5; var0++) {
         l(36804 + var0).bf = false;
         l(36809 + var0).at = "";
      }

      j();
      l(36002).at = "";
      l(36003).at = "";
      l(36019).at = "";

      for (int var3 : bT) {
         l(var3).bf = false;
      }

      e(false);
   }

   public static void j() {
      d = 0;

      for (int var0 = 0; var0 < 700; var0++) {
         d(var0, 0, 0, "");
      }

      g(g, bI);
   }

   public static void k() {
      int var0 = d / rs.p_n.C_e.l(36025).P;
      int var1 = var0 * (l(36025).ap + 32);
      int var2 = 100;
      if (var1 >= var2) {
         var2 = var1 + (l(36025).ap + 32) * 3;
      }

      l(36026).aH = var2;
   }

   public static void g(int var0, int var1) {
      rs.p_n.p_a.C_c var2 = (rs.p_n.p_a.C_c)rs.p_n.C_e.l(36025);
      var2.h(var0, var1);
      g = var0;
      bI = var1;
      l();
      k();
   }

   public static void n(int var0) {
      rs.p_n.p_a.C_c var1 = (rs.p_n.p_a.C_c)rs.p_n.C_e.l(36025);
      var1.a(var0);
      rs.p_n.p_d.C_a var2 = c.b(o().aw).e();
      if (var0 >= 10) {
         if (var2.b() == 8) {
            o().P = 464;
            var2.a(1);
            c.a();
         }
      } else if (var2.b() != 8) {
         o().P = 455;
         var2.a(8);
         c.a();
      }

      l();
   }

   public static void l() {
      char var0 = '費';
      int var1 = 1;
      int var2 = 0;
      byte var3 = 30;
      byte var4 = 44;
      int var5 = var3;
      int var6 = var4 + 1;

      for (int var7 = var0; var7 < var0 + 700; var7++) {
         o().b(var1++, var7, var5, var6);
         var5 += l(36025).ac + 32;
         if (++var2 >= rs.p_n.C_e.l(36025).P) {
            var2 = 0;
            var5 = var3;
            var6 += l(36025).ap + 32;
         }
      }
   }

   public static void a(boolean var0) {
      if (var0) {
         l(36025).W = bR;
      } else {
         l(36025).W = new String[]{null, null, null, null, null};
      }
   }

   public static void b(boolean var0) {
      if (var0) {
         l(30074).W = bS;
      } else {
         l(30074).W = new String[]{null, null, null, null, null};
      }
   }

   public static void c(boolean var0) {
      byte var1 = 0;
      if (var0) {
         if (!m().bf) {
            var1 = -25;
         }

         m().bf = true;
      } else {
         if (m().bf) {
            var1 = 25;
         }

         m().bf = false;
      }

      if (var1 != 0) {
         rs.p_n.p_d.C_a var2 = c.b(o().aw).e();
         o().aR += var1;
         var2.b(var2.c() - var1);
         c.a();
      }
   }

   public static void d(boolean var0) {
      if (var0) {
         if (!n().bf) {
            o().aR -= 32;
         }

         n().bf = true;
      } else {
         if (n().bf) {
            o().aR += 32;
         }

         n().bf = false;

         for (int var4 : bT) {
            l(var4).bf = false;
         }

         l(36002).at = "";
         l(36003).at = "";
         l(36019).at = "";
         e(false);
      }
   }

   public static void e(boolean var0) {
      l(36012).bf = var0;
      l(36013).bf = var0;
      l(36015).bf = var0;
   }

   public static void f(boolean var0) {
      l(36016).bf = var0;
   }

   public static void o(int var0) {
      if (var0 == 0) {
         for (int var4 : bT) {
            l(var4).bf = false;
         }
      } else {
         for (int var8 : bT) {
            if ((var0 != 1 || var8 > 36007) && (var0 != 3 || var8 < 36008)) {
               l(var8).bf = true;
            }
         }

         if (var0 == 1) {
            c.b(36008).a(455, 284);
            c.b(36009).a(440, 224);
         } else if (var0 == 2) {
            c.b(36008).a(415, 284);
            c.b(36009).a(400, 224);
            c.b(36004).a(455, 284);
            c.b(36005).a(440, 224);
         } else if (var0 == 3) {
            c.b(36004).a(455, 284);
            c.b(36005).a(440, 224);
         }

         c.a();
      }
   }

   public static rs.p_n.C_e m() {
      return l(36802);
   }

   public static rs.p_n.C_e n() {
      return l(36801);
   }

   public static rs.p_n.C_e o() {
      return l(36026);
   }
}
