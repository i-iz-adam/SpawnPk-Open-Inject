package rs.p_n.p_c;

public class C_aX_mc extends rs.p_n.C_c {
   public C_aX_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(27400);
      byte var2 = 0;
      byte var3 = 0;
      h(56000, "tournament/sprite 0");
      a(56001, "<img=128> SpawnPK World Tournaments <img=128>", this.a, 2, 16750623, true);
      a(56002, "Next world tournament: @yel@Dharok PK Tournament", this.a, 2, 16750623, true);
      a(56003, "", this.a, 0, 16750623, true);
      a(56004, "This tournament's prize will be..", this.a, 0, 16750623, false);
      a(56005, "@yel@Previous Tournament Winners", this.a, 1, 16750623, true);
      a(56006, "@yel@Tournament point shop", this.a, 1, 16750623, true);
      a(56007, Boolean.valueOf(false));
      H['\udac7'].P = 4;
      H['\udac7'].ac = 11;
      H['\udac7'].ap = 10;
      H['\udac7'].az[0] = 16002;
      H['\udac7'].ax[0] = 1;
      rs.p_n.C_e var4 = d(56008);
      var4.aH = 475;
      var4.P = 255;
      var4.aR = 112;
      var4.bj = 87;
      var4.k(35);
      int var5 = 0;

      for (int var6 = 0; var6 < 35; var6++) {
         if (var5 == 2) {
            a(56009 + var6, "", this.a, 0, 16750623, true);
            var5 = 0;
         } else if (var5 == 0) {
            a(56009 + var6, "Random player won @yel@x1 $10.00 bond", this.a, 0, 16750623, true);
            var5++;
         } else {
            a(56009 + var6, "from @or2@Dharok PK Tournament @yel@" + (var6 + 1) * 6 + " hours ago", this.a, 0, 16750623, true);
            var5++;
         }

         var4.b(var6, 56009 + var6, 131, 6 + var6 * 13);
      }

      a(56044, "tournament/sprite", 2, 130, 32, "Enter tournament", -1, 56045, 1);
      a(56045, "tournament/sprite", 1, 130, 32, 56046);
      a(56047, "Enter Tournament <img=51>", this.a, 0, 16750623, true);
      a(56048, "Receive points for placing\\ntop 5 in a tournament", this.a, 0, 16750623, true);
      a(56049, "tournament/sprite", 2, 130, 32, "Spectate tournament", -1, 56050, 1);
      a(56050, "tournament/sprite", 1, 130, 32, 56051);
      a(56052, "Spectate Tournament", this.a, 0, 16750623, true);
      a(56053, "fountain/button", 1, 70, 41, "View tournament shop", -1, 56054, 1);
      a(56054, "fountain/button", 2, 70, 41, 56055);
      a(56056, "Shop", this.a, 0, 16750623, true);
      h(56057, "fountain/coins");
      var1.k(22);
      var1.b(0, 56000, 7 + var2, 15 + var3);
      var1.b(1, 56001, 270 + var2, 19 + var3);
      var1.b(2, 56002, 259 + var2, 54 + var3);
      var1.b(3, 56003, 258 + var2, 88 + var3);
      var1.b(4, 56004, 29 + var2, 135 + var3);
      var1.b(5, 56005, 161 + var2, 170 + var3);
      var1.b(6, 56006, 411 + var2, 169 + var3 + 42);
      var1.b(7, 56007, 267 + var2, 126 + var3);
      var1.b(8, 56008, 30 + var2, 187 + var3);
      var1.b(9, 63740, 483, 19);
      var1.b(10, 63741, 483, 19);
      var1.b(11, 56044, 350, 126);
      var1.b(12, 56045, 350, 126);
      var1.b(13, 56047, 412, 137);
      var1.b(14, 56048, 409, 276);
      var1.b(15, 56049, 350, 168);
      var1.b(16, 56050, 350, 168);
      var1.b(17, 56052, 412, 179);
      var1.b(18, 56053, 375, 233);
      var1.b(19, 56054, 375, 233);
      var1.b(20, 56056, 394, 248);
      var1.b(21, 56057, 411, 239);
   }
}
