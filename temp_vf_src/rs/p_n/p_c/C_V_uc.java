package rs.p_n.p_c;

public class C_V_uc extends rs.p_n.C_c {
   public static boolean c = false;
   public static long d = 0L;
   public static rs.p_l.C_F_uc e;
   public static rs.p_l.C_F_uc f;
   public static rs.p_l.C_F_uc g;
   public static final rs.p_q.p_a.p_a.C_a bI = new C_W_uc();
   public static final rs.p_l.p_e.C_f bJ = new C_X_uc();

   public C_V_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      this.h();
      this.i();
   }

   public void h() {
      rs.p_n.C_e var1 = d(59835);
      c(59836, 0, "gambling/SPRITE");
      a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
      a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
      e = new rs.p_l.C_F_uc("misc/warn");
      rs.p_n.C_e var2 = d(59837);
      rs.p_n.C_e var3 = this.m(59838).e();
      var2.k(1);
      var2.b(0, 59838, 5, 5);
      rs.p_n.C_e var4 = d(59839);
      rs.p_n.C_e var5 = this.m(59840).e();
      var5.W = new String[5];
      var4.k(1);
      var4.b(0, 59840, 5, 5);
      var4.aH = var2.aH = 450;
      var4.P = var2.P = 140;
      var4.aR = var2.aR = 121;
      var4.bj = var2.bj = 87;
      a(59830, "Est. Value: N/A", this.a, 0, 12171349, false);
      c(59831, "Est. Value: N/A", this.a, 0, 12171349, true);
      a(59832, "@gra@NOTE: Prices are just estimates!", this.a, 0, 16750623, true);
      a(59841, "Accept", "Accept this offer", this.a, 0, 65280, false, false, 50);
      a(59842, "Decline", "Decline this offer", this.a, 0, 16711680, false, false, 50);
      a(59843, "Waiting for other player..", this.a, 0, 16777215, true, true);
      a(59844, "Select a game type..", this.a, 1, 16751360, false, true);
      a(59845, "Rules for \"BJ (P1 hosting)\"", this.a, 1, 16751360, false, true);
      a(59846, "Gambling with P1..", this.a, 2, 16751360, false, true);
      f = rs.p_n.C_e.j(2, "gambling/SPRITE");
      g = rs.p_n.C_e.j(1, "gambling/SPRITE");
      c(59847, 1, "gambling/SPRITE");
      c(59848, 1, "gambling/SPRITE");
      c(59849, 1, "gambling/SPRITE");
      c(59850, 1, "gambling/SPRITE");
      c(59851, 1, "gambling/SPRITE");
      c(59852, 1, "gambling/SPRITE");
      a(59853, "55x2 (P1 host)", "Select", this.a, 0, 12171349, false, true, 160);
      a(59854, "55x2 (P2 host)", "Select", this.a, 0, 12171349, false, true, 160);
      a(59855, "BJ (P1 host)", "Select", this.a, 0, 12171349, false, true, 160);
      a(59856, "BJ (P2 host)", "Select", this.a, 0, 12171349, false, true, 160);
      a(59857, "Dice duel", "Select", this.a, 0, 12171349, false, true, 160);
      a(59858, "Flower poker", "Select", this.a, 0, 12171349, false, true, 160);
      a(59859, "Both players will plant five flowers each. The player with", this.a, 0, 16777215, false, true);
      a(59860, "the best pairs of colors will win the pot.", this.a, 0, 16777215, false, true);
      a(59861, "", this.a, 0, 16777215, false, true);
      a(59862, "If anyone plants a white or black flower (rare chance) a", this.a, 0, 16777215, false, true);
      a(59863, "\"replant\" will occur and the game will auto-restart.", this.a, 0, 16777215, false, true);
      a(59864, "", this.a, 0, 16777215, false, true);
      a(59865, "<col=8B88FF><img=6> Safety:@whi@ If you logout or DC during the game, your", this.a, 0, 16777215, false, true);
      a(59866, "player will stay logged in until the game is complete.", this.a, 0, 16777215, false, true);
      a(59867, "The server will continue planting flowers for you.", this.a, 0, 16777215, false, true);
      var1.k(35);
      var1.b(0, 59836, 13, 4);
      var1.b(1, 59837, 18, 48);
      var1.b(2, 59839, 341, 48);
      var1.b(3, 65418, 477, 22);
      var1.b(4, 65419, 477, 22);
      var1.b(5, 59841, 242, 67);
      var1.b(6, 59842, 241, 119);
      var1.b(7, 59843, 259, 153);
      var1.b(8, 59844, 22, 180);
      var1.b(9, 59845, 202, 180);
      var1.b(10, 59846, 23, 23);
      var1.b(11, 59847, 23, 204);
      var1.b(12, 59848, 23, 224);
      var1.b(13, 59849, 23, 244);
      var1.b(14, 59850, 23, 264);
      var1.b(15, 59851, 23, 284);
      var1.b(16, 59852, 23, 304);
      var1.b(17, 59853, 45, 206);
      var1.b(18, 59854, 45, 226);
      var1.b(19, 59855, 45, 246);
      var1.b(20, 59856, 45, 266);
      var1.b(21, 59857, 45, 286);
      var1.b(22, 59858, 45, 306);
      var1.b(23, 59859, 202, 206);
      var1.b(24, 59860, 202, 218);
      var1.b(25, 59861, 202, 230);
      var1.b(26, 59862, 202, 242);
      var1.b(27, 59863, 202, 254);
      var1.b(28, 59864, 202, 266);
      var1.b(29, 59865, 202, 278);
      var1.b(30, 59866, 202, 290);
      var1.b(31, 59867, 202, 302);
      var1.b(32, 59830, 21, 165);
      var1.b(33, 59831, 490, 165);
      var1.b(34, 59832, 256, 165);

      for (int var6 = 1; var6 < 32; var6++) {
         var1.bc[var6] = var1.bc[var6] - 9;
         if (var1.al[var6] <= 60000 && var1.al[var6] >= 59844 && var1.al[var6] != 59846) {
            var1.bc[var6] = var1.bc[var6] + 13;
         }
      }
   }

   public void i() {
      rs.p_n.C_e var1 = d(59868);
      c(59869, 3, "gambling/SPRITE");
      rs.p_n.C_e var2 = d(59870);
      var2.k(1);
      a(59871, "Your offer", this.a, 0, 16777215, true, true);
      var2.b(0, 59871, 70, 5);
      rs.p_n.C_e var3 = d(59872);
      var3.k(1);
      a(59873, "Their offer", this.a, 0, 16777215, true, true);
      var3.b(0, 59873, 70, 5);
      var3.aH = var2.aH = 450;
      var3.P = var2.P = 140;
      var3.aR = var2.aR = 200;
      var3.bj = var2.bj = 87;
      a(59874, "Accept", "Accept this offer", this.a, 0, 65280, false, false, 50);
      a(59875, "Decline", "Decline this offer", this.a, 0, 16711680, false, false, 50);
      a(59876, "Are you sure you want to play this? Read carefully!", this.a, 2, 16777215, false, true);
      a(59877, "You'll be playing..", this.a, 2, 16751360, false, true);
      a(59878, "55x2 (P1 host)", this.a, 1, 16751360, true, false);
      a(59879, "Waiting for other player..", this.a, 0, 16777215, true, true);
      var1.k(11);
      byte var4 = 40;
      var1.b(0, 59869, 13, 13 + var4);
      var1.b(1, 59870, 16, 48 + var4);
      var1.b(2, 59872, 339, 48 + var4);
      var1.b(3, 65418, 477, 22 + var4);
      var1.b(4, 65419, 477, 22 + var4);
      var1.b(5, 59874, 242, 67 + var4);
      var1.b(6, 59875, 241, 119 + var4);
      var1.b(7, 59876, 23, 23 + var4);
      var1.b(8, 59877, 198, 180 + var4);
      var1.b(9, 59878, 256, 216 + var4);
      var1.b(10, 59879, 258, 192);
   }

   private rs.p_n.C_e m(int var1) {
      rs.p_n.C_e var2 = H[var1] = new rs.p_n.C_e();
      var2.W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
      var2.K = new int[20];
      var2.ax = new int[30];
      var2.az = new int[30];
      var2.as = new int[20];
      var2.al = new int[0];
      var2.am = new int[0];
      var2.bc = new int[0];

      for (int var3 = 0; var3 < 28; var3++) {
         var2.az[var3] = 995;
         var2.ax[var3] = var3 + 1;
      }

      var2.t = true;
      var2.ac = 12;
      var2.ap = 12;
      var2.aR = 10;
      var2.P = 3;
      var2.aw = var1;
      var2.aI = 2;
      return var2;
   }
}
