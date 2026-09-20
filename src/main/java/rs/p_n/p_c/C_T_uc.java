package rs.p_n.p_c;

public class C_T_uc extends rs.p_n.C_c {
   public C_T_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      this.i();
      this.h();
   }

   private void h() {
      rs.p_n.C_e var1 = d(41000);
      c(41001, 0, "factory/SPRITE");
      a(41002, 1, 0, 41004, 1, "factory/SPRITE", 46, 20, "Close Window");
      a(41004, 2, "factory/SPRITE", 46, 20, 41005);
      b(41006, 75, 50);
      a(41007, "/fountain/sprite", 16, 120, 34, "Toggle spawner", -1, 41008, 1);
      a(41008, "/fountain/sprite", 15, 120, 34, 41009);
      a(41010, "Monster Spawner", this.a, 2, 16751360, true, true);
      a(41011, "Monster Selections", this.a, 1, 12171349, true, true);
      a(41012, "This spawner will provide you with 5 spawns", this.a, 0, 12171349, true, true);
      a(41013, "before requiring you to re-activate it again.", this.a, 0, 12171349, true, true);
      a(41014, "", this.a, 0, 12171349, true, true);
      a(41016, "<img=57> Activate @gre@(x5)", this.a, 0, 16751360, true, true);
      a(41017, "Spawn distanced", this.a, 0, 16751360, true, true);
      a(41018, "Spawn x3", this.a, 0, 16751360, true, true);
      a(41019, "You have selected: @yel@NPC Name", this.a, 0, 16751360, true, true);
      byte var2 = 14;
      var1.al = new int[var2];
      var1.am = new int[var2];
      var1.bc = new int[var2];
      byte var3 = 7;
      byte var4 = 30;
      var1.b(0, 41001, var3, var4);
      var1.b(1, 41002, 476 + var3, 8 + var4 - 2);
      var1.b(2, 41004, 476 + var3, 8 + var4 - 2);
      var1.b(3, 41006, var3 + 140, var4 + 80 + 23);
      byte var5 = 58;
      var1.b(4, 41007, var3 + var5 + 56, var4 + 169 - 10 + 23);
      var1.b(5, 41008, var3 + var5 + 56, var4 + 169 - 10 + 23);
      var1.b(6, 41016, var3 + var5 + 49 + 66, var4 + 170 + 10 - 10 + 23);
      var1.b(7, 41010, var3 + 255, var4 + 7);
      var1.b(8, 41011, var3 + 414, var4 + 32);
      var1.b(9, 41012, var3 + var5 + 49 + 66, var4 + 168 + 10 - 10 + 53);
      var1.b(10, 41013, var3 + var5 + 49 + 66, var4 + 168 + 10 - 10 + 53 + 13);
      var1.b(11, 41014, var3 + var5 + 49 + 66, var4 + 168 + 10 - 10 + 53 + 13 + 13);
      var1.b(12, 41019, 172 + var3, 136 + var4 + 23);
      var1.b(13, 41020, 343 + var3 - 13, 29 + var4 + 21);
   }

   private void i() {
      rs.p_n.C_e var1 = d(41020);
      var1.aH = 350;
      var1.P = 143;
      var1.aR = 211;
      var1.bj = 87;
      byte var2 = 22;
      char var3 = 'ꀽ';

      for (int var4 = 0; var4 < var2; var4++) {
         a(var3 + var4, "NPC IDX @yel@" + var4 + " (" + (var3 + var4) + ")", "Spawn this NPC", this.a, 0, 16750623, false, false, 125);
      }

      byte var8 = 10;
      byte var5 = 3;
      byte var6 = 15;
      var1.al = new int[var2];
      var1.am = new int[var2];
      var1.bc = new int[var2];

      for (int var7 = 0; var7 < var2; var7++) {
         var1.b(var7, var3 + var7, var8, var5 + var6 * var7);
      }
   }
}
