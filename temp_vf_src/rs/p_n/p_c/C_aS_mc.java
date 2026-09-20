package rs.p_n.p_c;

public class C_aS_mc extends rs.p_n.C_c {
   public static final int c = 18559;

   public C_aS_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(18559);
      c(55732, 0, "tasks/SPRITE");
      a(55733, "@or1@Task Scroll Title", this.a, 2, 16751360, true, true);
      a(55734, "@or1@Task Information", this.a, 2, 16751360, false, true);
      a(55735, "@or1@Potential Rewards", this.a, 2, 16751360, false, true);
      a(55736, "@or1@Completion Progress", this.a, 2, 16751360, false, true);
      rs.p_n.C_e var2 = d(55737);
      var2.aH = 250;
      var2.P = 235;
      var2.aR = 170;
      var2.k(20);
      byte var3 = 20;
      byte var4 = 4;
      byte var5 = 15;

      for (int var6 = 0; var6 < 20; var6++) {
         a(55738 + var6, "Description " + (var6 + 1) + " (" + (55738 + var6) + ")", this.a, 0, 16777215, false, false);
         var2.b(var6, 55738 + var6, var3, var4 + var5 * var6);
      }

      rs.p_n.C_e var10 = d(55758);
      var10.aH = 750;
      var10.P = 178;
      var10.aR = 170;
      var10.k(1);
      a(55759, Boolean.valueOf(false));
      H['\ud9cf'].az = new int[100];
      H['\ud9cf'].ax = new int[100];
      H['\ud9cf'].aR = 25;
      H['\ud9cf'].P = 4;
      H['\ud9cf'].ac = 10;
      H['\ud9cf'].ap = 10;

      for (int var7 = 0; var7 < 10; var7++) {
         H['\ud9cf'].az[var7] = 1337;
         H['\ud9cf'].ax[var7] = var7 + 1;
      }

      var10.b(0, 55759, 18, 6);
      c(55760, 1, "tasks/SPRITE");
      c(55761, 2, "tasks/SPRITE");
      rs.p_n.C_e.H['\ud9d1'].E = new rs.p_l.C_F_uc("tasks/SPRITE 2", 0, 15);
      a(55762, "@yel@This meter indicates your progress for the objective.\\nOnce complete, you'll receive a casket.", this.a, 0, 16751360, true, true);
      a(55763, "0% (0/100)", this.a, 0, 0, true, false);
      a(55764, 4, 0, 55765, 3, "tasks/SPRITE", 70, 13, "Collect reward");
      a(55765, 4, "tasks/SPRITE", 70, 13, 55766);
      a(55767, "@yel@Collect", this.a, 0, 0, true, true);
      a(55768, 4, 0, 55769, 5, "tasks/SPRITE", 70, 13, "Track progress");
      a(55769, 6, "tasks/SPRITE", 70, 13, 55770);
      a(55771, "  @yel@Track<img=39>", this.a, 0, 0, true, true);
      byte var11 = -10;
      byte var8 = -5;
      var1.k(19);
      var1.b(0, 55732, 40, 7);
      var1.b(1, 55733, 290, 18);
      var1.b(2, 64275, 464, 18);
      var1.b(3, 64276, 464, 18);
      var1.b(4, 55734, 85, 55);
      var1.b(5, 55735, 325, 55);
      var1.b(6, 55736, 85, 254);
      var1.b(7, 55737, 40, 74);
      var1.b(8, 55758, 281, 74);
      var1.b(9, 55760, 111, 278);
      var1.b(10, 55761, 111, 278);
      var1.b(11, 55762, 256, 295);
      var1.b(12, 55763, 258, 280);
      var1.b(13, 55764, 402, 255);
      var1.b(14, 55765, 402, 255);
      var1.b(15, 55767, 431, 256);
      var1.b(16, 55768, 327, 255);
      var1.b(17, 55769, 327, 255);
      var1.b(18, 55771, 361, 256);

      for (int var9 = 0; var9 < var1.al.length; var9++) {
         var1.am[var9] = var1.am[var9] + -10;
         var1.bc[var9] = var1.bc[var9] + -5;
      }
   }
}
