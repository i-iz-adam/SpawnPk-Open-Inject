package rs.p_n.p_c;

public class C_a extends rs.p_n.C_c {
   public C_a(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(64272);
      c(64273, 0, "achievements/SPRITE");
      a(64271, "@or1@Completed (0/100)", this.a, 2, 16751360, true, true);
      a(64274, "@or1@SpawnPK Achievement Diary", this.a, 2, 16751360, true, true);
      a(64275, 3, 0, 64276, 1, "achievements/SPRITE", 17, 17, "Close Window");
      a(64276, 2, "achievements/SPRITE", 17, 17, 64277);
      a(43509, "achievements/SPRITE", 7, 17, 17, "Collect all rewards", -1, 43510, 1);
      a(43510, "achievements/SPRITE", 8, 17, 17, 43511);
      a(64278, "@or2@Title of the achievement", this.a, 2, 16751360, false, true);
      a(64279, "@whi@Progress: @gre@0% (0/1)", this.a, 2, 16751360, false, true);
      byte var2 = 4;

      for (int var3 = 0; var3 < var2; var3++) {
         a(64280 + var3, "Description " + (var3 + 1), this.a, 0, 16777215, false, false);
      }

      int var13 = '\ufb18' + var2;
      a(var13, "@or2@Bonuses you'll receive..", this.a, 0, 16751360, false, true);
      a(var13 + 1, "@or2@Items you'll receive..", this.a, 0, 16751360, false, true);
      rs.p_n.C_e var4 = d(var13 + 2);
      a(var13 + 3, "None!", this.a, 0, 16777215, false, false);
      a(var13 + 4, "", this.a, 0, 16777215, false, false);
      a(var13 + 5, "", this.a, 0, 16777215, false, false);
      a(var13 + 6, "", this.a, 0, 16777215, false, false);
      byte var5 = 5;
      byte var6 = 5;
      byte var7 = 15;
      var4.al = new int[4];
      var4.am = new int[4];
      var4.bc = new int[4];

      for (int var8 = 0; var8 < 4; var8++) {
         var4.b(var8, var13 + 3 + var8, var5, var6 + var7 * var8);
      }

      var4 = d(var13 + 7);
      var4.al = new int[1];
      var4.am = new int[1];
      var4.bc = new int[1];
      a(var13 + 8, Boolean.valueOf(false));
      H[var13 + 8].P = 2;
      H[var13 + 8].ac = 15;
      H[var13 + 8].ap = 10;
      H[var13 + 8].az[0] = 996;
      H[var13 + 8].ax[0] = 1337;
      H[var13 + 8].az[1] = 538;
      H[var13 + 8].ax[1] = 69;
      H[var13 + 8].az[2] = 538;
      H[var13 + 8].ax[2] = 69;
      H[var13 + 8].az[3] = 538;
      H[var13 + 8].ax[3] = 69;
      var4.b(0, var13 + 8, 11, 5);
      var4.aH = 200;
      var4.P = 109;
      var4.aR = 78;
      var4.bj = 87;
      rs.p_n.C_e var15 = d(var13 + 9);
      byte var9 = 100;
      var15.aH = 1505;
      var15.P = 134;
      var15.aR = 248;
      var15.bj = 87;
      var15.al = new int[var9];
      var15.am = new int[var9];
      var15.bc = new int[var9];

      for (int var10 = 0; var10 < var9; var10++) {
         a(var13 + 10 + var10, "", "Select achievement", this.a, 0, 16723715, false, false, 125);
         var15.b(var10, var13 + 10 + var10, 5, 5 + var10 * 15);
      }

      char var16 = 'ﯴ';
      a(var16 + 1, 4, 0, var16 + 2, 3, "achievements/SPRITE", 35, 25, "Collect reward");
      a(var16 + 2, 4, "achievements/SPRITE", 35, 25, var16 + 3);
      int var11 = 16 + var2;
      var1.al = new int[var11];
      var1.am = new int[var11];
      var1.bc = new int[var11];
      var1.b(0, 64273, 5, 20);
      var1.b(1, 64274, 333, 31);
      var1.b(2, 64275, 475, 31);
      var1.b(3, 64276, 475, 31);
      var1.b(4, 64278, 224, 77);
      var1.b(5, 64279, 186, 104);

      for (int var12 = 0; var12 < var2; var12++) {
         var1.b(6 + var12, 64280 + var12, 186, 124 + var12 * 15);
      }

      int var17 = 6 + var2;
      var1.b(var17++, var13, 182, 204);
      var1.b(var17++, var13 + 1, 354, 204);
      var1.b(var17++, var13 + 2, 178, 218);
      var1.b(var17++, var13 + 7, 354, 218);
      var1.b(var17++, var13 + 9, 11, 57);
      var1.b(var17++, var16 + 1, 183, 71);
      var1.b(var17++, var16 + 2, 183, 71);
      var1.b(var17++, 64271, 84, 31);
      var1.b(var17++, 43509, 455, 31);
      var1.b(var17++, 43510, 455, 31);
   }
}
