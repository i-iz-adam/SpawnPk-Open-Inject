package rs.p_n.p_c;

public class C_p extends rs.p_n.C_c {
   public C_p(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   private void m(int var1) {
      a(var1++, 3, "clan/sprite", "Only me", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "General+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Captain+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Lieutenant+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Sergeant+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Corporal+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Recruit+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Any friends", 17256, 1, 150, 30);
   }

   private void n(int var1) {
      a(var1++, 3, "clan/sprite", "General+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Captain+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Lieutenant+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Sergeant+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Corporal+", 17256, 1, 150, 30);
      a(var1++, 3, "clan/sprite", "Recruit+", 17256, 1, 150, 30);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = j(25744);
      c(17251, 1, "clan/sprite");
      a(17252, "clan/sprite", 2, 150, 30, "Set name", -1, 17253, 1);
      a(17253, "clan/sprite", 3, 150, 30, 17254);
      a(17255, "clan/sprite", 2, 150, 30, "Anyone", -1, 17256, 1);
      a(17256, "clan/sprite", 3, 150, 30, 65359);
      this.m(65359);
      a(17258, "clan/sprite", 2, 150, 30, "Anyone", -1, 17259, 1);
      a(17259, "clan/sprite", 3, 150, 30, 17260);
      this.m(65367);
      a(17261, "clan/sprite", 2, 150, 30, "Only me", -1, 17262, 1);
      a(17262, "clan/sprite", 3, 150, 30, 17263);
      this.n(65375);
      a(17264, "clan/sprite", 2, 150, 30, "Only me", -1, 17265, 1);
      a(17265, "clan/sprite", 3, 150, 30, 17266);
      this.n(65380);
      a(17267, "clan/close", 0, 50, 50, "Close", -1, 17268, 1);
      a(17268, "clan/close", 1, 40, 50, 17269);
      a(17800, "Clan name:", this.a, 0, 16750623, false, true);
      a(17802, "Enter Name", this.a, 2, 16777215, true, true);
      a(17801, "Who can enter chat?", this.a, 0, 16750623, false, true);
      a(17803, "Any friends", this.a, 2, 16777215, true, true);
      a(17812, "Who can talk on chat?", this.a, 0, 16750623, false, true);
      a(17804, "Anyone", this.a, 2, 16777215, true, true);
      a(17813, "Who can kick/mute?", this.a, 0, 16750623, false, true);
      a(17805, "Only me", this.a, 2, 16777215, true, true);
      a(17814, "Who can ban on chat?", this.a, 0, 16750623, false, true);
      a(17806, "Only me", this.a, 2, 16777215, true, true);
      a(17807, "Right click on\\nwhite text to\\nchange options.", this.a, 2, 12171349, true, true);
      c(54000, 1, "gambling/SPRITE");
      a(54001, "Add co-owner privileges\\nto the General rank", "Select", this.a, 0, 12171349, true, true, 160);
      var1.k(52);
      int var2 = 0;

      for (int var3 = 65359; var3 < 65367; var3++) {
         var1.b(var2++, var3, 25, 87);
      }

      for (int var38 = 65367; var38 < 65375; var38++) {
         var1.b(var2++, var38, 25, 128);
      }

      for (int var39 = 65375; var39 < 65380; var39++) {
         var1.b(var2++, var39, 25, 168);
      }

      for (int var40 = 65380; var40 < 65385; var40++) {
         var1.b(var2++, var40, 25, 209);
      }

      var1.b(var2++, 17251, 15, 15);
      var1.b(var2++, 17252, 25, 47);
      var1.b(var2++, 17253, 25, 47);
      var1.b(var2++, 17255, 25, 87);
      var1.b(var2++, 17256, 25, 87);
      var1.b(var2++, 17258, 25, 128);
      var1.b(var2++, 17259, 25, 128);
      var1.b(var2++, 17261, 25, 168);
      var1.b(var2++, 17262, 25, 168);
      var1.b(var2++, 17264, 25, 209);
      var1.b(var2++, 17265, 25, 209);
      var1.b(var2++, 17800, 76, 51);
      var1.b(var2++, 17801, 52, 91);
      var1.b(var2++, 14000, 0, 94);
      var1.b(var2++, 17812, 48, 133);
      var1.b(var2++, 17813, 52, 172);
      var1.b(var2++, 17814, 48, 213);
      var1.b(var2++, 17267, 476, 23);
      var1.b(var2++, 17268, 476, 23);
      var1.b(var2++, 17802, 102, 63);
      var1.b(var2++, 17803, 102, 103);
      var1.b(var2++, 17804, 100, 144);
      var1.b(var2++, 17805, 101, 184);
      var1.b(var2++, 17806, 101, 225);
      var1.b(var2++, 54000, 28, 255);
      var1.b(var2++, 54001, 28, 252);
      var1 = j(14000);
      var1.P = 474;
      var1.aR = 210;
      var1.aH = 3050;
      short var41 = 402;

      for (int var4 = 26024; var4 < 26024 + var41 / 2; var4++) {
         a(var4, "", this.a, 2, 16777215, false, true);
      }

      for (int var42 = 26024 + var41 / 2; var42 < 26024 + var41; var42++) {
         a(var42, "", this.a, 2, 16777215, false, true);
      }

      int var43 = 20201;
      byte var5 = 14;
      boolean var6 = false;

      for (int var7 = 0; var7 < 201; var7++) {
         a(var43++, 3, "test/clan/sprite", "General" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Captain" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Lieutenant" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Sergeant" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Corporal" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Recruit" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Banned" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
         a(var43++, 3, "test/clan/sprite", "Not ranked" + (var6 ? " " + (var43 - 1) : ""), -1, 1, 150, var5 - 3);
      }

      var1.k(var41 + 1608);
      int var52 = 0;
      int var8 = 0;

      for (int var9 = 26024; var9 < 26024 + var41 / 2; var9++) {
         var1.b(var52, var9, 200, var8);
         var52++;
         var8 += 15;
      }

      var8 = (byte)0;

      for (int var55 = 26024 + var41 / 2; var55 < 26024 + var41; var55++) {
         var1.b(var52, var55, 337, var8);
         var52++;
         var8 += 15;
      }

      var8 = 0;
      var43 = 20201;

      for (int var56 = 0; var56 < 201; var56++) {
         for (int var10 = 0; var10 < 8; var10++) {
            var1.b(var52, var43++, 337, var8);
            var52++;
         }

         var8 += var5 + 1;
      }
   }
}
