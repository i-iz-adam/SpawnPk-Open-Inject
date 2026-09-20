package rs.p_n.p_c;

public class C_az extends rs.p_n.C_c {
   public C_az(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(38975);
      c(47000, 0, "drops/sprite");
      a(47001, "@or1@Monster item drop search", this.a, 2, 16751360, true, true);
      a(47002, "drops/button", 1, 100, 32, "Search by item", -1, 47003, 1);
      a(47003, "drops/button", 2, 100, 25, 25350);
      a(47004, "Search item", this.a, 0, 16751360, false, true);
      c(47005, 0, "drops/icon");
      a(47006, "drops/button", 1, 100, 32, "Search by monster", -1, 47007, 1);
      a(47007, "drops/button", 2, 100, 25, 25350);
      a(47008, "Search npc", this.a, 0, 16751360, false, true);
      c(47009, 0, "drops/icon");
      rs.p_n.C_e var2 = d(47010);
      var2.P = 93;
      var2.aR = 191;
      var2.aH = 1500;
      var2.k(100);
      int var3 = 47011;

      for (int var4 = 0; var4 < 100; var4++) {
         a(var3 + var4, "", "Select this monster", this.a, 0, 16750623, false, true, 115);
         var2.b(var4, var3 + var4, 1, 3 + var4 * 15);
      }

      a(47111, "@or1@Item", this.a, 2, 16751360, true, true);
      a(47112, "@or1@Quantity", this.a, 2, 16751360, true, true);
      a(47113, "@or1@Rarity", this.a, 2, 16751360, true, true);
      rs.p_n.C_e var15 = d(47114);
      var15.P = 342;
      var15.aR = 233;
      var15.aH = 1500;
      var15.k(215);
      int var5 = 0;
      var3 = 47115;
      int var6 = 1;

      for (int var7 = 0; var7 < 43; var7++) {
         int var8 = var7 * 35 - 5;
         c(var3++, var6, "drops/sprite");
         var15.b(var5++, var3 - 1, 0, var8);
         c(var3++, 0, 27);
         var15.b(var5++, var3 - 1, 3, var8 + 3);
         a(var3++, "", this.a, 0, 16777215, true);
         var15.b(var5++, var3 - 1, 92, var8 + 13);
         a(var3++, "", this.a, 0, 16777215, true);
         var15.b(var5++, var3 - 1, 190, var8 + 13);
         a(var3++, "", this.a, 0, 16777215, true);
         var15.b(var5++, var3 - 1, 290, var8 + 13);
         var6 = var6 == 1 ? 2 : 1;
      }

      a(47330, "drops/sprite", 3, 17, 17, "Go back", -1, 47331, 1);
      a(47331, "drops/sprite", 4, 17, 17, 47332);
      a(47333, "@yel@Note:@whi@ Boosted rate display does NOT include dynamic boosts (monster specific boosts, etc.)", this.a, 0, 16751360, true, true);
      var1.k(20);
      boolean var20 = false;
      byte var21 = 10;
      var1.b(0, 47000, 6, 17 - var21);
      var1.b(1, 47001, 270, 24 - var21);
      var1.b(2, 64275, 482, 24 - var21);
      var1.b(3, 64276, 482, 24 - var21);
      var1.b(4, 47002, 23, 50 - var21);
      var1.b(5, 47003, 23, 50 - var21);
      var1.b(6, 47004, 51, 61 - var21);
      var1.b(7, 47005, 29, 57 - var21);
      byte var9 = 27;
      var1.b(8, 47006, 23, 50 + var9 - var21);
      var1.b(9, 47007, 23, 50 + var9 - var21);
      var1.b(10, 47008, 51, 61 + var9 - var21);
      var1.b(11, 47009, 29, 57 + var9 - var21);
      var1.b(12, 47010, 19, 114 - var21);
      var1.b(13, 47111, 216, 53 - var21);
      var1.b(14, 47112, 331, 53 - var21);
      var1.b(15, 47113, 433, 53 - var21);
      var1.b(16, 47114, 140, 76 - var21);
      var1.b(17, 47330, 13, 24 - var21);
      var1.b(18, 47331, 13, 24 - var21);
      var1.b(19, 47333, 254, 316 - var21);
   }
}
