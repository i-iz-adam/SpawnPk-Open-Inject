package rs.p_n.p_c;

public class C_N_uc extends rs.p_n.C_c {
   public static rs.p_l.C_F_uc c = null;
   public static rs.p_l.C_F_uc d = null;

   public C_N_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(60600);
      c = new rs.p_l.C_F_uc("fountain/glow");
      d = new rs.p_l.C_F_uc("fountain/glow2");
      h(60601, "fountain/event 1");
      a(60602, Boolean.valueOf(true));
      H['\uecba'].K = new int[175];
      H['\uecba'].ax = new int[175];
      H['\uecba'].az = new int[175];
      H['\uecba'].as = new int[175];
      H['\uecba'].P = 7;
      H['\uecba'].aR = 25;
      H['\uecba'].ac = 32;
      H['\uecba'].ap = 16;
      rs.p_n.C_e var2 = d(60603);
      var2.al = new int[1];
      var2.am = new int[1];
      var2.bc = new int[1];
      var2.aH = 1000;
      var2.P = 449;
      var2.aR = 185;
      var2.bj = 87;
      var2.k(1);
      var2.b(0, 60602, 12, 10);
      a(60611, Boolean.valueOf(true));
      H['\uecc3'].K = new int[4];
      H['\uecc3'].ax = new int[4];
      H['\uecc3'].az = new int[4];
      H['\uecc3'].as = new int[4];
      H['\uecc3'].P = 2;
      H['\uecc3'].aR = 2;
      H['\uecc3'].ac = 32;
      H['\uecc3'].ap = 16;
      a(60612, Boolean.valueOf(true));
      H['\uecc4'].K = new int[4];
      H['\uecc4'].ax = new int[4];
      H['\uecc4'].az = new int[4];
      H['\uecc4'].as = new int[4];
      H['\uecc4'].P = 2;
      H['\uecc4'].aR = 2;
      H['\uecc4'].ac = 17;
      H['\uecc4'].ap = 16;
      a(60613, Boolean.valueOf(true));
      H['\uecc5'].K = new int[4];
      H['\uecc5'].ax = new int[4];
      H['\uecc5'].az = new int[4];
      H['\uecc5'].as = new int[4];
      H['\uecc5'].P = 2;
      H['\uecc5'].aR = 2;
      H['\uecc5'].ac = 32;
      H['\uecc5'].ap = 16;
      a(60604, "fountain/button", 1, 70, 41, "Exchange", -1, 60605, 1);
      a(60605, "fountain/button", 2, 70, 41, 60606);
      h(60607, "fountain/icon 3");
      a(60608, "Roll", this.a, 1, 16750623);
      a(60609, "Tier I Prize", this.a, 2, 16750623, false, true);
      a(60610, "Roll all of the items in\\nthe tier for a prize!", this.a, 0, 16750623, false, true);
      a(60617, 5, 0, 60618, 4, "fountain/event", 100, 21, "Event Chest Tier I");
      a(60618, 3, "fountain/event", 100, 21, 60619);
      a(60620, "@or1@Tier I", this.a, 0, 16751360, false, true);
      a(60621, 5, 0, 60622, 4, "fountain/event", 100, 21, "Event Chest Tier II");
      a(60622, 3, "fountain/event", 100, 21, 60623);
      a(60624, "@or1@Tier II", this.a, 0, 16751360, false, true);
      a(60616, "Tier I - @yel@Halloween Event 2020", this.a, 2, 16750623, true);
      a(60625, "@yel@0 / 25 rolls @or1@(0 / 50,000 tokens)", this.a, 0, 16750623, true, true);
      a(60626, "fountain/sprite", 16, 120, 35, "Enter next tier", -1, 60628, 1);
      a(60628, "fountain/sprite", 15, 120, 35, 60629);
      a(60630, "@yel@Event Guide", this.a, 1, 16750623, true);
      a(60631, "fountain/sprite", 16, 120, 35, "Reset event items", -1, 60632, 1);
      a(60632, "fountain/sprite", 15, 120, 35, 60633);
      a(60634, "Reset exchange", this.a, 1, 16750623, true);
      var1.k(24);
      var1.b(0, 60601, 12, 11);
      var1.b(1, 60603, 27, 47);
      var1.b(2, 60604, 191, 240);
      var1.b(3, 60605, 191, 240);
      var1.b(4, 60608, 204, 252);
      var1.b(5, 60607, 231, 251);
      var1.b(6, 60611, 272, 246);
      var1.b(7, 60612, 394, 246);
      var1.b(8, 63740, 476, 14);
      var1.b(9, 63741, 476, 14);
      var1.b(10, 60616, 344, 23);
      var1.b(11, 60625, 331, 306);
      var1.b(12, 60626, 24, 282);
      var1.b(13, 60628, 24, 282);
      var1.b(14, 60630, 85, 291);
      var1.b(15, 60609, 67, 239);
      var1.b(16, 60610, 67, 256);
      var1.b(17, 60613, 27, 242);
      var1.b(18, 60621, 118, 27);
      var1.b(19, 60622, 118, 27);
      var1.b(20, 60624, 127, 33);
      var1.b(21, 60617, 18, 27);
      var1.b(22, 60618, 18, 27);
      var1.b(23, 60620, 27, 33);
   }
}
