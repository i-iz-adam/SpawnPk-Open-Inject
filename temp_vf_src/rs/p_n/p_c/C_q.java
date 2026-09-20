package rs.p_n.p_c;

public class C_q extends rs.p_n.C_c {
   public C_q(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = j(18128);
      a(18129, "/clan/sprite", 6, 72, 32, "Join Chat", -1, 18130, 1);
      a(18130, "/clan/sprite", 7, 72, 32, 18131);
      a(18132, "/clan/sprite", 6, 72, 32, "Clan Setup", -1, 18133, 5);
      a(18133, "/clan/sprite", 7, 72, 32, 18134);
      a(18135, "Join Chat", this.a, 0, 16751360, true, true);
      a(18136, "Clan Setup", this.a, 0, 16751360, true, true);
      c(18137, 37, "/clan/sprite");
      a(18138, "Clan Chat (0/100)", this.a, 2, 16751360, true, true);
      a(18139, "Talking in: @yel@Not in chat", this.a, 0, 16751360, false, true);
      a(18140, "Owner: @whi@None", this.a, 0, 16751360, false, true);
      var1.k(13);
      var1.b(0, 16126, 0, 221);
      var1.b(1, 16126, 0, 59);
      var1.b(2, 18137, 0, 57);
      var1.b(3, 18143, 0, 62);
      var1.b(4, 18129, 15, 226);
      var1.b(5, 18130, 15, 226);
      var1.b(6, 18132, 103, 226);
      var1.b(7, 18133, 103, 226);
      var1.b(8, 18135, 51, 237);
      var1.b(9, 18136, 139, 237);
      var1.b(10, 18138, 95, 3);
      var1.b(11, 18139, 10, 23);
      var1.b(12, 18140, 25, 38);
      rs.p_n.C_e var2 = j(18143);
      var2.k(298);

      for (int var3 = 18144; var3 <= 18244; var3++) {
         a(var3, "<img=17> Ryan " + var3, "Manage clan member", this.a, 0, 16750623, false, false, 125);
      }

      for (int var7 = 25800; var7 <= 25999; var7++) {
         a(var7, "<img=17> Ryan " + var7, "Manage clan member", this.a, 0, 16750623, false, false, 125);
      }

      int var8 = 18144;

      for (int var4 = 0; var8 <= 18243 && var4 <= 99; var4++) {
         var2.al[var4] = var8;
         var2.am[var4] = 15;
         int var5 = 18144;

         for (int var6 = 1; var5 <= 18243 && var6 <= 99; var6++) {
            var2.bc[0] = 2;
            var2.bc[var6] = var2.bc[var6 - 1] + 14;
            var5++;
         }

         var8++;
      }

      var8 = 25800;

      for (int var10 = 100; var8 <= 25999 && var10 <= 297; var10++) {
         var2.al[var10] = var8;
         var2.am[var10] = 15;
         int var11 = 25800;

         for (int var12 = 101; var11 <= 25999 && var12 <= 297; var12++) {
            var2.bc[100] = 1402;
            var2.bc[var12] = var2.bc[var12 - 1] + 14;
            var11++;
         }

         var8++;
      }

      var2.aR = 153;
      var2.P = 174;
      var2.aH = 4200;
   }
}
