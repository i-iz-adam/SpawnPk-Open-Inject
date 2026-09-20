package rs.p_n.p_c;

public class C_o extends rs.p_n.C_c {
   public static final int c = 18616;

   public C_o(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = j(18616);
      c(60404, 6, "teleport/SPRITE");
      a(60405, "@or1@Name of Boss", this.a, 0, 16751360, true, true);
      a(60406, "@or1@Bosses", this.a, 1, 16751360, true, true);
      a(60407, "@or1@Description", this.a, 1, 16751360, false, true);
      a(60408, "", this.a, 1, 16751360, true, true);
      a(60409, "@or1@Possible drops and rewards", this.a, 1, 16751360, false, true);
      a(60410, "@or1@Boss Teleportation Network", this.a, 2, 16751360, true, true);
      b(60411, 75, 50);
      a(60412, "Teleport #1", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60413, "Teleport #2", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60414, "Teleport #3", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60415, "Teleport #4", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60416, "Teleport #5", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60417, "Teleport #6", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60418, "Teleport #7", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60419, "Teleport #8", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60420, "Teleport #9", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60421, "Teleport #10", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60422, "Teleport #11", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60423, "Teleport #12", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60424, "Teleport #13", "Select this teleport", this.a, 0, 16750623, true, true, 150);
      a(60448, "teleport/SPRITE", 10, 100, 32, "Teleport to boss", -1, 60449, 1);
      a(60449, "teleport/SPRITE", 11, 100, 32, 60450);
      a(60451, "Teleport <img=149>", this.a, 0, 16751360, true, true);
      rs.p_n.C_e var2 = d(60426);
      var2.aH = 250;
      var2.P = 165;
      var2.aR = 123;
      var2.bj = 87;
      var2.k(17);
      a(60427, "@yel@Information & Stats:", this.a, 0, 16750623, false, true);
      a(60428, "Combat level: @whi@100", this.a, 0, 16750623, false, true);
      a(60429, "Wilderness level: @whi@Safe", this.a, 0, 16750623, false, true);
      a(60430, "Combat zone: @whi@Single", this.a, 0, 16750623, false, true);
      a(60431, "", this.a, 0, 16750623, false, true);
      a(60432, "@yel@Available achievements:", this.a, 0, 16750623, false, true);
      a(60433, "@yel@-@whi@ Placeholder I", this.a, 0, 16750623, false, true);
      a(60434, "@yel@-@whi@ Placeholder II", this.a, 0, 16750623, false, true);
      a(60435, "@yel@-@whi@ Placeholder III", this.a, 0, 16750623, false, true);
      a(60436, "", this.a, 0, 16750623, false, true);
      a(60437, "Line 11", this.a, 0, 16750623, false, true);
      a(60438, "Line 12", this.a, 0, 16750623, false, true);
      a(60439, "Line 13", this.a, 0, 16750623, false, true);
      a(60440, "Line 14", this.a, 0, 16750623, false, true);
      a(60441, "Line 15", this.a, 0, 16750623, false, true);
      a(60442, "Line 16", this.a, 0, 16750623, false, true);
      a(60443, "Line 17", this.a, 0, 16750623, false, true);

      for (int var3 = 0; var3 < 17; var3++) {
         var2.b(var3, 60427 + var3, 0, 3 + var3 * 13);
      }

      a(60444, "Safe", this.a, 0, 16750623, true, true);
      a(60445, "No", this.a, 0, 16750623, true, true);
      rs.p_n.C_e var7 = d(60446);
      var7.aH = 350;
      var7.P = 326;
      var7.aR = 46;
      var7.bj = 87;
      var7.k(1);
      a(60447, Boolean.valueOf(false));
      H['\uec1f'].P = 6;
      H['\uec1f'].ac = 15;
      H['\uec1f'].ap = 10;

      for (int var4 = 0; var4 < 12; var4++) {
         H['\uec1f'].az[var4] = 995;
         H['\uec1f'].ax[var4] = var4 + 1;
      }

      var7.b(0, 60447, 33, 5);
      a(39873, 4, 0, 39874, 14, "teleport/SPRITE", 85, 13, "View full drop table");
      a(39874, 15, "teleport/SPRITE", 85, 13, 39875);
      a(39876, "@yel@View All", this.a, 0, 0, true, true);
      var1.k(31);
      var1.b(0, 60404, 7, 16);
      var1.b(1, 60405, 321, 54);
      var1.b(2, 60406, 73, 51);
      var1.b(3, 60407, 319, 80);
      var1.b(4, 60408, 281, 183);
      var1.b(5, 60409, 190, 234);
      var1.b(6, 60410, 279, 23);
      var1.b(7, 60411, 180, 136);
      byte var8 = 75;
      byte var5 = -3;
      byte var6 = 18;
      var1.b(8, 60412, var5, var8);
      var1.b(9, 60413, var5, var8 + var6 * 1);
      var1.b(10, 60414, var5, var8 + var6 * 2);
      var1.b(11, 60415, var5, var8 + var6 * 3);
      var1.b(12, 60416, var5, var8 + var6 * 4);
      var1.b(13, 60417, var5, var8 + var6 * 5);
      var1.b(14, 60418, var5, var8 + var6 * 6);
      var1.b(15, 60419, var5, var8 + var6 * 7);
      var1.b(16, 60420, var5, var8 + var6 * 8);
      var1.b(17, 60421, var5, var8 + var6 * 9);
      var1.b(18, 60422, var5, var8 + var6 * 10);
      var1.b(19, 60423, var5, var8 + var6 * 11);
      var1.b(20, 60424, var5, var8 + var6 * 12);
      var1.b(21, 60448, 172, 189);
      var1.b(22, 60449, 172, 189);
      var1.b(23, 60451, 222, 199);
      var1.b(24, 60426, 296, 101);
      var1.b(25, 60446, 135, 253);
      var1.b(26, 63740, 483, 22);
      var1.b(27, 63741, 483, 22);
      var1.b(28, 39873, 390, 234);
      var1.b(29, 39874, 390, 234);
      var1.b(30, 39876, 426, 235);
   }
}
