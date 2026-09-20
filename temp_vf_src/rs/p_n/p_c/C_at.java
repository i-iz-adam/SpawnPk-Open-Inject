package rs.p_n.p_c;

public class C_at extends rs.p_n.C_c {
   public static final int c = 25;

   public C_at(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   public static void h() {
      int var0 = 25127;

      for (int var1 = 0; var1 < 25; var1++) {
         var0++;
         var0++;
         var0++;
         int var10000 = ++var0;
         var0++;
         c(var10000, 0, 32);
         rs.p_n.C_e.H[var0++].at = "";
         rs.p_n.C_e.H[var0++].at = "";
         rs.p_n.C_e.H[var0++].at = "";
      }
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(24535);
      c(65786, 2, "pos/SPRITE");
      c(65804, 5, "pos/SPRITE");
      a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
      a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
      a(25341, "@or1@SpawnPK Marketplace Search Results <img=39>", this.a, 2, 16751360, true, true);
      a(24561, "Icon", this.a, 0, 16751360, true, true);
      a(24562, "Name/Quantity", this.a, 0, 16751360, true, true);
      a(24563, "Price (each) <img=23>", "Toggle ascending/descending", this.a, 0, 16751360, true, true, 50);
      a(24564, "Seller", this.a, 0, 16751360, true, true);
      a(65792, "pos/button", 1, 100, 32, "Go back", -1, 65793, 1);
      a(65793, "pos/button", 2, 100, 32, 65794);
      a(65795, "Go back", this.a, 0, 16751360, true, true);
      a(65796, "pos/button", 1, 100, 32, "Select option", -1, 65797, 1);
      a(65797, "pos/button", 2, 100, 32, 65798);
      a(24565, "Modify", this.a, 0, 16751360, true, true);
      a(44000, "Total offers: 0", this.a, 0, 16751360, true, true);
      a(65800, "pos/button", 1, 100, 32, "Select option", -1, 65801, 1);
      a(65801, "pos/button", 2, 100, 32, 65802);
      a(24566, "Refresh", this.a, 0, 16751360, true, true);
      a(48991, "pos/button", 5, 16, 16, "Previous page", -1, 48990, 1);
      a(48990, "pos/button", 6, 16, 16, 48989);
      a(48988, "Last page", "Previous page", this.a, 0, 16751360, false, true, 50);
      a(48987, "pos/button", 7, 16, 16, "Next page", -1, 48986, 1);
      a(48986, "pos/button", 8, 16, 16, 48985);
      a(48984, "Next page", "Next page", this.a, 0, 16751360, false, true, 50);
      rs.p_n.C_e var2 = d(65803);
      var2.P = 461;
      var2.aR = 210;
      var2.aH = 1100;
      int var3 = 25127;
      int var4 = 0;
      var2.k(181);

      for (int var5 = 0; var5 < 25; var5++) {
         int var6 = 42 * var5;
         c(var3, 3, "pos/SPRITE");
         var2.b(var4++, var3++, 1, 37 + var6);
         a(var3, "pos/button", 0, 476, 37, "Select this market listing", -1, var3 + 1, 1);
         var2.b(var4++, var3++, 0, 1 + var6);
         a(var3, "pos/sprite", 4, 476, 37, var3 + 1);
         var2.b(var4++, var3++, 0, 1 + var6);
         c(++var3, 0, 32);
         var2.b(var4++, var3++, 5, 3 + var6);
         a(var3, "", this.a, 0, 16751360, true, true);
         var2.b(var4++, var3++, 113, 14 + var6);
         a(var3, "", this.a, 0, 1048575, true, true);
         var2.b(var4++, var3++, 270, 14 + var6);
         a(var3, "", this.a, 0, 16777215, true, true);
         var2.b(var4++, var3++, 415, 14 + var6);
      }

      var2.b(var4++, 48991, 10, 1061);
      var2.b(var4++, 48990, 10, 1061);
      var2.b(var4++, 48988, 31, 1064);
      var2.b(var4++, 48987, 435, 1061);
      var2.b(var4++, 48986, 435, 1061);
      var2.b(var4++, 48984, 378, 1063);
      var1.k(20);
      var1.b(0, 65786, 12, 7);
      var1.b(1, 65803, 17, 67);
      var1.b(2, 65804, 12, 7);
      var1.b(3, 65418, 475, 15);
      var1.b(4, 65419, 475, 15);
      var1.b(5, 25341, 256, 15);
      var1.b(6, 24561, 37, 46);
      var1.b(7, 24562, 132, 46);
      var1.b(8, 24563, 267, 46);
      var1.b(9, 24564, 433, 46);
      var1.b(10, 65792, 24, 282);
      var1.b(11, 65793, 24, 282);
      var1.b(12, 65795, 73, 292);
      var1.b(13, 65796, 387, 282);
      var1.b(14, 65797, 387, 282);
      var1.b(15, 24565, 438, 292);
      var1.b(16, 65800, 277, 282);
      var1.b(17, 65801, 277, 282);
      var1.b(18, 24566, 328, 292);
      var1.b(19, 44000, 200, 293);
   }
}
