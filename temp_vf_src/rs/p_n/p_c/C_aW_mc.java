package rs.p_n.p_c;

public class C_aW_mc extends rs.p_n.C_c {
   public C_aW_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(61011);
      h(61012, "misc/hs 5");
      a(61013, "World Tournament Leaderboards", this.a, 2, 16750623, true);
      a(61014, "<img=14> Top Players", this.a, 2, 16750623, false);
      a(61015, "<img=16> Top Clans", this.a, 2, 16750623, false);
      a(61016, "This week", "View weekly leaderboard", this.a, 0, 12171349, false, true, 45);
      a(61017, "All time", "View all time leaderboard", this.a, 0, 12171349, false, true, 45);
      c(61018, 2, "gambling/SPRITE");
      c(61019, 1, "gambling/SPRITE");
      a(61020, "This week", "View weekly leaderboard", this.a, 0, 12171349, false, true, 45);
      a(61021, "All time", "View all time leaderboard", this.a, 0, 12171349, false, true, 45);
      c(61022, 2, "gambling/SPRITE");
      c(61023, 1, "gambling/SPRITE");
      rs.p_n.C_e var2 = d(61024);
      var2.aH = 600;
      var2.P = 220;
      var2.aR = 261;
      var2.bj = 87;
      var2.k(26);
      byte var3 = 5;

      for (int var4 = 0; var4 < 26; var4++) {
         int var5 = 61025 + var4;
         if (var4 % 2 == 0) {
            a(var5, "", this.a, 0, 16750623, true);
            var2.b(var4, var5, 100, var3);
            var3 += 15;
         } else {
            a(var5, "", this.a, 1, 16750623, true);
            var2.b(var4, var5, 100, var3);
            var3 += 30;
         }
      }

      rs.p_n.C_e var8 = d(61051);
      var8.aH = 600;
      var8.P = 220;
      var8.aR = 261;
      var8.bj = 87;
      var8.k(26);
      var3 = 5;

      for (int var9 = 0; var9 < 26; var9++) {
         int var6 = 61052 + var9;
         if (var9 % 2 == 0) {
            a(var6, "", this.a, 0, 16750623, true);
            var8.b(var9, var6, 100, var3);
            var3 += 15;
         } else {
            a(var6, "", this.a, 1, 16750623, true);
            var8.b(var9, var6, 100, var3);
            var3 += 30;
         }
      }

      var1.k(16);
      var1.b(0, 61012, 2, 2);
      var1.b(1, 61013, 251, 9);
      var1.b(2, 61014, 16, 39);
      var1.b(3, 61015, 266, 39);
      var1.b(4, 61016, 138, 42);
      var1.b(5, 61017, 211, 42);
      var1.b(6, 61018, 120, 40);
      var1.b(7, 61019, 193, 40);
      var1.b(8, 61020, 388, 42);
      var1.b(9, 61021, 461, 42);
      var1.b(10, 61022, 370, 40);
      var1.b(11, 61023, 443, 40);
      var1.b(12, 61024, 18, 61);
      var1.b(13, 61051, 268, 61);
      var1.b(14, 63740, 487, 10);
      var1.b(15, 63741, 487, 10);
   }
}
