package rs.p_n.p_c;

public class C_aa extends rs.p_n.C_c {
   public C_aa(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_l.C_K_uc[] var1 = this.a;
      rs.p_n.C_e var2 = j(638);
      rs.p_n.C_e var3 = j(16025);
      a(640, "Achievement Diary", var1, 0, 16777215, true, true);
      a(663, "", var1, 2, 16750848, false, true);
      c(16018, 3, "gameframe/SPRITE");
      a(16019, 1, 0, 16020, 1, "gameframe/SPRITE", 142, 20, "Open achievements");
      a(16020, 2, "gameframe/SPRITE", 142, 20, 16021);
      c(16022, 4, "gameframe/SPRITE");
      a(16023, "", var1, 0, 15439903, false, true);
      c(16024, 6, "gameframe/SPRITE");
      a(39868, "Monster drop tables", var1, 0, 16777215, true, true);
      c(39869, 1337, "gameframe/SPRITE");
      a(39870, 1, 0, 39871, 1, "gameframe/SPRITE", 142, 20, "Open monster drop tables");
      a(39871, 2, "gameframe/SPRITE", 142, 20, 39872);
      a(62150, "Hotspot: @or2@N/A", var1, 0, 16750623, true, true);
      a(62151, "@yel@N/A", var1, 0, 16750623, true, true);
      a(62152, Boolean.valueOf(false));
      H['\uf2c8'].P = 4;
      H['\uf2c8'].ac = 11;
      byte var4 = 24;
      byte var5 = 0;
      var2.k(6);
      var2.b(0, 16024, 0, 31 + var4 + var5);
      var2.b(1, 16025, 6, 30 + var4 + var5);
      var2.b(2, 16022, 0, 28 + var4 + var5);
      var2.b(3, 16022, 0, 255 + var5);
      var2.b(4, 16023, 4, 251 + var5);
      var2.b(5, 32000, 0, 0);
      var5 = 24;

      for (int var6 = 16026; var6 <= 16125; var6++) {
         a(var6, "", "Select", this.a, 0, 16777215, false, false, 125);
      }

      var3.k(101);
      var3.b(0, 663, 4, 6);
      int var9 = 1;

      for (int var7 = 16026; var9 <= 100 && var7 <= 16125; var7++) {
         if (var9 == 1) {
            var3.b(var9, var7, 6, 6);
         } else {
            var3.b(var9, var7, 6, var3.bc[var9 - 1] + 13);
         }

         var9++;
      }

      var3.P = 168;
      var3.aR = 225 - var4;
      var3.aH = 1320;
   }
}
