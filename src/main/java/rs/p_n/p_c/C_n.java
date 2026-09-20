package rs.p_n.p_c;

public class C_n extends rs.p_n.C_c {
   public C_n(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(61150);
      h(61151, "fountain/sprite 22");
      a(61152, "Bloodcore Token Lottery", this.a, 2, 16751360, true, true);
      a(61153, "The lottery's pot is currently..", this.a, 0, 16750623, false);
      a(61154, "@yel@Latest Bloodcore Lottery Winners", this.a, 1, 16750623, true);
      a(61155, "Time until the winner is announced..", this.a, 0, 16750623, true);
      a(61156, "@yel@5 hours 18 mins 48 secs", this.a, 0, 16750623, true);
      a(61157, "@or1@(There are @gre@23@or1@ participants in this lottery)", this.a, 0, 16750623, true);
      a(61158, Boolean.valueOf(false));
      H['\ueee6'].P = 4;
      H['\ueee6'].ac = 11;
      H['\ueee6'].az[0] = 22844;
      H['\ueee6'].ax[0] = 250;
      a(61159, Boolean.valueOf(false));
      H['\ueee7'].P = 4;
      H['\ueee7'].ac = 11;
      H['\ueee7'].az[0] = 22844;
      H['\ueee7'].ax[0] = 10000;
      rs.p_n.C_e var2 = d(61160);
      var2.aH = 475;
      var2.P = 350;
      var2.aR = 83;
      var2.bj = 87;
      var2.k(35);
      int var3 = 0;

      for (int var4 = 0; var4 < 35; var4++) {
         if (var3 == 2) {
            a(61161 + var4, "", this.a, 0, 16750623, true);
            var3 = 0;
         } else if (var3 == 0) {
            a(61161 + var4, "", this.a, 0, 16750623, true);
            var3++;
         } else {
            a(61161 + var4, "", this.a, 0, 16750623, true);
            var3++;
         }

         var2.b(var4, 61161 + var4, 197, 8 + var4 * 13);
      }

      a(61196, 5, 0, 61197, 1, "fountain/button", 70, 41, "Enter bloodcore lottery");
      a(61197, 2, "fountain/button", 70, 41, 61198);
      h(61199, "fountain/icon 1");
      a(61200, "Enter", this.a, 0, 16751360, true, true);
      var1.k(14);
      var1.b(0, 61151, 55, 36);
      var1.b(1, 61152, 257, 44);
      var1.b(2, 61153, 125, 84);
      var1.b(3, 61154, 263, 118);
      var1.b(4, 61155, 327, 236);
      var1.b(5, 61156, 326, 254);
      var1.b(6, 61157, 326, 276);
      var1.b(7, 61158, 74, 247);
      var1.b(8, 61159, 362, 77);
      var1.b(9, 61160, 64, 136);
      short var6 = -238;
      byte var5 = 67;
      var1.b(10, 61196, 358 + var6, 174 + var5);
      var1.b(11, 61197, 358 + var6, 174 + var5);
      var1.b(12, 61199, 364 + var6, 184 + var5);
      var1.b(13, 61200, 405 + var6, 189 + var5);
   }
}
