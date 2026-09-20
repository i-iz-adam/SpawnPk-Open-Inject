package rs.p_n.p_c;

public class C_aw extends rs.p_n.C_c {
   public static rs.p_n.p_d.C_c c;
   public static final rs.p_q.p_a.p_a.C_a d = new C_ax();
   private static final int e = 60201;
   private static final int f = 60203;
   private static final int g = 60204;
   private static final int bI = 60205;
   private static final int[] bJ = new int[]{60206, 60207, 60208, 60209, 60210, 60211, 60212, 60213};
   private static final int[] bK = new int[]{60214, 60215, 60216, 60217, 60218, 60219, 60220, 60221};
   private static final int[] bL = new int[]{60222, 60223, 60224, 60225, 60226, 60227, 60228, 60229};
   private static final int[] bM = new int[]{60230, 60231, 60232, 60233, 60234, 60235, 60236, 60237};
   private static final String[] bN = new String[]{
      "<img=84>@yel@$5",
      "<img=84>@yel@$10",
      "<img=84>@yel@$20",
      "<img=84>@yel@$30",
      "<img=84>@yel@$45",
      "<img=84>@yel@$75",
      "<img=84>@yel@$100",
      "<img=84>@yel@$500"
   };
   private static final int[] bO = new int[]{16000, 16001, 16002, 16003, 16004, 16005, 16006, 16007};
   private static final int bP = 60238;
   private static final int[] bQ = new int[]{60239, 60240, 60241, 60242, 60243, 60244, 60244, 60245};
   private static final int bR = 60246;
   private static final int bS = 60247;
   private static final int bT = 60248;
   private static final int bU = 60249;
   private static final int bV = 60250;
   private static final int bW = 60251;
   private static final int bX = 60252;
   private static final int bY = 60253;
   private static final int bZ = 60254;
   private static final int ca = 60255;
   private static final int cb = 60256;
   private static final int cc = 60257;
   private static final int cd = 60258;
   private static final int ce = 60259;
   private static final int cf = 60260;
   private static final int cg = 60261;
   private static final int ch = 60262;
   private static final int ci = 60263;
   private static C_ay cj = new C_ay();

   public C_aw(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(60200);
      var1.f();
      c = new rs.p_n.p_d.C_c(var1);
      c.a(rs.p_n.p_a.C_e.a(60201, "misc/cart 0").g(740, 480)).a(13, 13);
      c.a(rs.p_n.p_a.C_f.a(60262, "@or1@Donation Shopping Cart").j().b()).a(388, 21);
      this.k();
      this.j();
      this.i();
      this.h();
      c.a();
   }

   private void h() {
      byte var1 = 0;
      int var2 = 3 + var1;
      rs.p_n.p_a.C_c.g(60082, 3).h(0, 12).a(3);
      rs.p_n.p_a.C_c.g(60085, 3).h(0, 12).a(3);
      rs.p_n.p_a.C_c.g(60088, 3).h(0, 12).a(3);
      int[] var3 = new int[]{60082, 60085, 60088};

      for (int var7 : var3) {
         if (var7 == 60088) {
            rs.p_n.C_e.H[var7].az = new int[]{-1, 21666, 21666};
            rs.p_n.C_e.H[var7].ax = new int[]{1, 1, 1};
         } else if (var7 == 60082) {
            rs.p_n.C_e.H[var7].az = new int[]{-1, 21677, -1};
            rs.p_n.C_e.H[var7].ax = new int[]{1, 3, 1};
         } else {
            rs.p_n.C_e.H[var7].az = new int[]{-1, 21606, -1};
            rs.p_n.C_e.H[var7].ax = new int[]{1, 1, 1};
         }
      }

      byte var9 = -32;
      c.a(60069).a(58, 343);
      c.a(60064).a(54, 377);
      c.a(60065).a(54, 377);
      if (cj.s() > 0) {
         try {
            rs.p_l.p_f.C_e.d().a((rs.p_l.p_f.p_b.C_d)cj);
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      rs.p_l.p_f.C_e.d().a(cj, 60065);
      c.a(60081).a(211, 422 + var2);
      c.a(60082).a(196 + var9, 369 + var2);
      c.a(60084).a(341, 422 + var2);
      c.a(60085).a(326 + var9, 369 + var2);
      c.a(60087).a(570, 425);
      c.a(60088).a(451 + var9, 369 + var2);
      c.a(60090).a(41, 371 + var1);
      c.a(60091).a(57, 409 + var1);
      c.a(60270).a(61, 409 + var1);
      c.a(60092).a(222, 390 + var2);
      c.a(60093).a(352, 390 + var2);
      c.a(60094).a(509, 390 + var2);
      c.a(60066).a(37, 461);
      c.a(60067).a(37, 445);
      c.a(60096).a(522, 364 + var2);
      c.a(60097).a(566, 364 + var2);
      c.a(60098).a(527, 369 + var2);
      c.a(60099).a(612, 369 + var2 + 2);
      c.a(60100).a(612, 369 + var2 + 15 + 2);
      c.a(60094).a(553, 390 + var2);
      c.a(65418).a(731, 21);
      c.a(65419).a(731, 21);
   }

   private void i() {
      c.a(rs.p_n.p_a.C_f.a(60251, "Daily Offer").j().m(16750623)).a(413, 58);
      c.a(rs.p_n.p_a.C_f.a(60252, "Exclusive Offers").j().m(16750623)).a(413, 156);
      this.c(561, 82, 60253, 60254, 60255);
      this.c(561, 181, 60256, 60257, 60258);
      this.c(561, 261, 60259, 60260, 60261);
   }

   private void c(int var1, int var2, int var3, int var4, int var5) {
      String var6 = "@whi@Earn one grand promo package, and get one FREE!";
      String var7 = "Offer expires in: @cya@<img=37> 24:00:00";
      short var8 = 21665;
      rs.p_n.p_a.C_c var9 = rs.p_n.p_a.C_c.g(var5, 6).h(12, 0);
      var9.P = 6;
      var9.aR = 1;
      var9.aA = true;
      if (var3 == 60256) {
         var6 = "@whi@Seasonal fuse boxes obtainable from seasonal packs!";
         var7 = "Pulls remaining: <item=24238> @red@0/3 <item=24050>@yel@2/3 <item=25425>@gre@3/3";
         var9.az = new int[]{24176, 24239, 24176, 24051, 24176, 25426};
      } else {
         if (var3 == 60259) {
            var6 = "";
            var7 = "No other promotions available at this time";
            var8 = -1;
         }

         for (int var10 = 0; var10 < 6; var10++) {
            var9.az[var10] = var8 + 1;
            var9.ax[var10] = 1;
         }
      }

      c.a(rs.p_n.p_a.C_f.a(var3, var6).i().b()).a(var1, var2);
      c.a(rs.p_n.p_a.C_f.a(var4, var7).a().b().m(12171349)).a(var1, var2 + 18);
      c.a(var9).a(var1 - 125, var2 + 34);
   }

   private void j() {
      c.a(rs.p_n.p_a.C_f.a(60238, "Shopping Cart").j().m(16750623)).a(243, 58);
      rs.p_n.p_a.C_d var1 = rs.p_n.p_a.C_d.f(60246, 150, 177);
      var1.aH = 150;

      for (int var2 = 0; var2 < bQ.length; var2++) {
         String var3 = var2 == bQ.length - 1 ? "@or1@Subtotal: @yel@$0.00" : "Empty";
         rs.p_n.p_a.C_f.a(bQ[var2], var3).a().m(12171349);
         var1.n(bQ[var2]).a(5, 5 + var2 * 15);
      }

      var1.a();
      c.a(var1).a(216, 82);
      c.a(rs.p_n.p_a.C_f.a(60247, "<img=90><tab=20>PayPal (Card / Bank)").a(200).a().m(16750623)).a(223, 264);
      c.a(rs.p_n.p_a.C_f.a(60248, "<img=88><tab=20>OSRS GP").a(200).a().m(16750623)).a(223, 283);
      c.a(rs.p_n.p_a.C_a.b(60249, "misc/login 2", "Checkout").g(130, 32).a("misc/login 3")).a(230, 297);
      c.a(rs.p_n.p_a.C_f.a(60250, "Checkout @yel@($0.00)").a().b().m(16750623)).a(292, 307);
   }

   private void k() {
      c.a(rs.p_n.p_a.C_f.a(60263, "Purchase Options").j().m(16750623)).a(59, 58);
      rs.p_n.p_a.C_d var1 = rs.p_n.p_a.C_d.f(60203, 239, 270);
      var1.bj = 87;
      var1.aH = 260;
      rs.p_n.p_a.C_e var2 = rs.p_n.p_a.C_e.a(60205, "misc/cart 1");
      rs.p_n.p_a.C_c var3 = rs.p_n.p_a.C_c.g(60204, 20);
      var3.h(47, 28);
      var3.P = 2;
      byte var4 = -5;
      byte var5 = var4;

      for (int var6 = 0; var6 < bJ.length; var6++) {
         int var7 = var6 % 2 == 0 ? 0 : 79;
         var1.n(60205).a(var7, 10 + var5);
         var3.az[var6] = bO[var6] + 1;
         var3.ax[var6] = 1;
         rs.p_n.p_a.C_f.a(bJ[var6], "0").b().a().m(16751360);
         rs.p_n.p_a.C_f.a(bM[var6], bN[var6]).a().m(12171349).b();
         var1.n(bJ[var6]).a(36 + var7, 49 + var5);
         int var8 = bK[var6];
         int var9 = bL[var6];
         rs.p_n.p_a.C_a.b(var8, "misc/donor 11", "Reduce quantity").g(16, 16).a("misc/donor 12");
         rs.p_n.p_a.C_a.b(var9, "misc/donor 9", "Increase quantity").g(16, 16).a("misc/donor 10");
         var1.n(var8).a(12 + var7, 46 + var5);
         var1.n(var9).a(45 + var7, 46 + var5);
         if ((var6 + 1) % 2 == 0) {
            var5 += 60;
         }
      }

      var1.n(60204).a(21, 13 + var4);
      var5 = var4;

      for (int var11 = 0; var11 < bJ.length; var11++) {
         int var12 = var11 % 2 == 0 ? 0 : 79;
         var1.n(bM[var11]).a(33 + var12, 12 + var5);
         if ((var11 + 1) % 2 == 0) {
            var5 += 60;
         }
      }

      var1.a();
      c.a(var1).a(41, 83);
   }
}
