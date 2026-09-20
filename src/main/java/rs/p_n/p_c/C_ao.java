package rs.p_n.p_c;

public class C_ao extends rs.p_n.C_c {
   public C_ao(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(52000);
      a(51999, "<img=291>", this.a, 0, 16750623, true);
      a(52001, "Lottery title", this.a, 2, 16751360, true, true);
      a(52002, "@yel@The winning pot is currently..", this.a, 0, 16750623, false);
      a(52003, "Latest Raffle Winners", this.a, 1, 16750623, true);
      a(52004, "Time until the winner is announced..", this.a, 1, 16750623, true);
      a(52005, "@yel@5 hours 18 mins 48 secs", this.a, 0, 16750623, true);
      a(52006, "@or1@(There are @gre@23@or1@ participants in this lottery)", this.a, 0, 16750623, true);
      a(52007, Boolean.valueOf(false));
      H['쬧'].P = 4;
      H['쬧'].ac = 11;
      a(52008, Boolean.valueOf(false));
      H['쬨'].P = 4;
      H['쬨'].ac = 11;
      rs.p_n.C_e var2 = d(52009);
      var2.aH = 50;
      var2.P = 350;
      var2.aR = 83;
      var2.bj = 87;
      var2.k(6);
      int var3 = 0;

      for (int var4 = 0; var4 < 6; var4++) {
         if (var3 == 2) {
            a(52014 + var4, "", this.a, 0, 16750623, true);
            var3 = 0;
         } else if (var3 == 0) {
            a(52014 + var4, "", this.a, 0, 16750623, true);
            var3++;
         } else {
            a(52014 + var4, "", this.a, 0, 16750623, true);
            var3++;
         }

         var2.b(var4, 52014 + var4, 197, 4 + var4 * 13);
      }

      a(52010, 5, 0, 52011, 1, "fountain/button", 70, 41, "Enter lottery");
      a(52011, 2, "fountain/button", 70, 41, 61198);
      h(52012, "fountain/icon 1");
      a(52013, "Buy-\\nentry", this.a, 0, 16751360, true, true);
      var1.k(17);
      var1.b(0, 61151, 55, 36);
      var1.b(1, 52001, 257, 44);
      var1.b(2, 52002, 125, 84);
      var1.b(3, 52003, 263, 118);
      var1.b(4, 52004, 327, 236);
      var1.b(5, 52005, 326, 256);
      var1.b(6, 52006, 326, 276);
      var1.b(7, 52007, 74, 247);
      var1.b(8, 52008, 362, 77);
      var1.b(9, 52009, 64, 136);
      short var6 = -238;
      byte var5 = 67;
      var1.b(10, 52010, 358 + var6, 174 + var5);
      var1.b(11, 52011, 358 + var6, 174 + var5);
      var1.b(12, 52012, 364 + var6, 184 + var5);
      var1.b(13, 52013, 405 + var6, 189 + var5 - 5);
      var1.b(14, 63740, 433, 44);
      var1.b(15, 63741, 433, 44);
      var1.b(16, 51999, 379, 85);
   }
}
