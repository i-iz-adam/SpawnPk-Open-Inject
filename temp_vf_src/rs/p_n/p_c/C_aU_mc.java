package rs.p_n.p_c;

public class C_aU_mc extends rs.p_n.C_c {
   private static final int c = 18516;
   private static final int d = 18517;
   private static final int e = 18518;

   public C_aU_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(18516);
      c(63739, 0, "teleport/SPRITE");
      a(63740, 1, 0, 63741, 1, "teleport/SPRITE", 46, 20, "Close Window");
      a(63741, 2, "teleport/SPRITE", 46, 20, 63742);
      b(18705, 75, 50);
      a(63745, "teleport/SPRITE", 3, 100, 32, "Teleport", -1, 63746, 1);
      a(63746, "teleport/SPRITE", 4, 100, 32, 63747);
      a(18519, "Teleport <img=149>", this.a, 0, 16751360, true, true);
      a(18520, "Title of Location", this.a, 0, 16751360, true, true);
      byte var2 = 10;
      var1.al = new int[var2];
      var1.am = new int[var2];
      var1.bc = new int[var2];
      byte var3 = 5;
      byte var4 = 20;
      var1.b(0, 63739, var3, var4);
      var1.b(1, 63740, 473 + var3, 8 + var4);
      var1.b(2, 63741, 473 + var3, 8 + var4);
      var1.b(3, 18705, var3 + 140, var4 + 80);
      var1.b(4, 63745, 365 + var3, 253 + var4);
      var1.b(5, 63746, 365 + var3, 253 + var4);
      var1.b(6, 18519, 415 + var3, 263 + var4);
      var1.b(7, 18520, 175 + var3, 134 + var4);
      var1.b(8, 18517, 341 + var3, 30 + var4);
      var1.b(9, 18518, 45 + var3, 157 + var4);
      this.h();
   }

   private void h() {
      rs.p_n.C_e var1 = d(18517);
      var1.aH = 250;
      var1.P = 125;
      var1.aR = 215;
      var1.bj = 87;
      byte var2 = 10;
      int var3 = 18521;

      for (int var4 = 0; var4 < var2; var4++) {
         a(var3 + var4, "Teleport @yel@#" + var4, "Select this teleport", this.a, 0, 16750623, false, false, 125);
      }

      byte var12 = 10;
      byte var5 = 5;
      byte var6 = 15;
      var1.al = new int[var2];
      var1.am = new int[var2];
      var1.bc = new int[var2];

      for (int var7 = 0; var7 < var2; var7++) {
         var1.b(var7, var3 + var7, var12, var5 + var6 * var7);
      }

      rs.p_n.C_e var16 = d(18518);
      var16.aH = 250;
      var16.P = 260;
      var16.aR = 120;
      var16.bj = 87;
      var3 = 18521 + var2;
      var2 = 15;

      for (int var8 = 0; var8 < var2; var8++) {
         String var9 = " blahblahblahblahblahblahblah";
         a(var3 + var8, "Line " + var8 + var9 + var9.length(), "Select this teleport", this.a, 0, 16777215, false, false, 125);
      }

      var12 = 10;
      var5 = 5;
      var6 = 15;
      var16.al = new int[var2];
      var16.am = new int[var2];
      var16.bc = new int[var2];

      for (int var17 = 0; var17 < var2; var17++) {
         var16.b(var17, var3 + var17, var12, var5 + var6 * var17);
      }
   }
}
