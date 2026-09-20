package rs.p_n.p_c;

public class C_ad extends rs.p_n.C_c {
   public C_ad(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(45900);
      h(45901, "popups/repair");
      a(45902, "Item repairing coffer", this.a, 2, 16751360, true, true);
      a(45903, "Gold stored: @yel@0 gp", this.a, 1, 16751360, false, true);
      a(45904, "teleport/SPRITE", 10, 100, 32, "Store gold", -1, 45905, 1);
      a(45905, "teleport/SPRITE", 11, 100, 32, 45906);
      a(45907, "Deposit", this.a, 0, 16751360, true, true);
      a(45908, "teleport/SPRITE", 10, 100, 32, "Withdraw gold", -1, 45909, 1);
      a(45909, "teleport/SPRITE", 11, 100, 32, 45910);
      a(45911, "Withdraw", this.a, 0, 16751360, true, true);
      c(45912, 1, "gambling/SPRITE");
      a(45913, "Auto-repair (gold)", "Toggle gold auto repair", this.a, 0, 16750623, false, true, 150);
      a(45914, "Blood shards stored: @yel@0", this.a, 1, 16751360, false, true);
      a(45915, "teleport/SPRITE", 10, 100, 32, "Store shards", -1, 45916, 1);
      a(45916, "teleport/SPRITE", 11, 100, 32, 45917);
      a(45918, "Deposit", this.a, 0, 16751360, true, true);
      a(45919, "teleport/SPRITE", 10, 100, 32, "Withdraw shards", -1, 45920, 1);
      a(45920, "teleport/SPRITE", 11, 100, 32, 45921);
      a(45922, "Withdraw", this.a, 0, 16751360, true, true);
      c(45923, 1, "gambling/SPRITE");
      a(45924, "Auto-repair (shard)", "Toggle shard auto repair", this.a, 0, 16750623, false, true, 150);
      a(45925, "Repair scrolls stored: @yel@0", this.a, 1, 16751360, false, true);
      a(45926, "teleport/SPRITE", 10, 100, 32, "Store shards", -1, 45927, 1);
      a(45927, "teleport/SPRITE", 11, 100, 32, 45928);
      a(45929, "Deposit", this.a, 0, 16751360, true, true);
      a(45930, "teleport/SPRITE", 10, 100, 32, "Withdraw shards", -1, 45931, 1);
      a(45931, "teleport/SPRITE", 11, 100, 32, 45932);
      a(45933, "Withdraw", this.a, 0, 16751360, true, true);
      a(45934, "@yel@Scrolls will auto-repair\\n@yel@over shards and coins!", this.a, 0, 16751360, true, true);
      var1.k(30);
      var1.b(0, 45901, 86, 89);
      var1.b(1, 63740, 412, 99);
      var1.b(2, 63741, 412, 99);
      var1.b(3, 45902, 269, 99);
      var1.b(4, 45903, 97, 129);
      var1.b(5, 45904, 95, 148);
      var1.b(6, 45905, 95, 148);
      var1.b(7, 45907, 143, 158);
      var1.b(8, 45908, 200, 148);
      var1.b(9, 45909, 200, 148);
      var1.b(10, 45911, 248, 158);
      var1.b(11, 45912, 305, 157);
      var1.b(12, 45913, 323, 160);
      byte var2 = 65;
      var1.b(13, 45914, 97, 129 + var2);
      var1.b(14, 45915, 95, 148 + var2);
      var1.b(15, 45916, 95, 148 + var2);
      var1.b(16, 45918, 143, 158 + var2);
      var1.b(17, 45919, 200, 148 + var2);
      var1.b(18, 45920, 200, 148 + var2);
      var1.b(19, 45922, 248, 158 + var2);
      var1.b(20, 45923, 305, 157 + var2);
      var1.b(21, 45924, 323, 160 + var2);
      short var3 = 130;
      var1.b(22, 45925, 97, 129 + var3);
      var1.b(23, 45926, 95, 148 + var3);
      var1.b(24, 45927, 95, 148 + var3);
      var1.b(25, 45929, 143, 158 + var3);
      var1.b(26, 45930, 200, 148 + var3);
      var1.b(27, 45931, 200, 148 + var3);
      var1.b(28, 45933, 248, 158 + var3);
      var1.b(29, 45934, 365, 154 + var3);

      for (int var4 = 0; var4 < 30; var4++) {
         var1.bc[var4] = var1.bc[var4] - 45;
      }
   }
}
