package rs.p_n.p_c;

public class C_aj extends rs.p_n.C_c {
   public C_aj(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(64600);
      rs.p_n.C_e var2 = j(64601);
      byte var3 = 24;
      byte var4 = 0;

      for (int var5 = 64602; var5 <= 64702; var5++) {
         a(var5, "", "Select", this.a, 0, 16750623, false, true, 125);
      }

      int var8 = 64602;
      rs.p_n.C_e.H[var8++].at = "@yel@<u=16776960>Features / Tools";
      rs.p_n.C_e.H[var8++].at = "<img=321> View collection logs";
      rs.p_n.C_e.H[var8++].at = "<img=321> Collection log milestones";
      rs.p_n.C_e.H[var8++].at = "<img=39> Search drops by monster";
      rs.p_n.C_e.H[var8++].at = "<img=39> Search drops by item";
      rs.p_n.C_e.H[var8++].at = "<img=153> View mail inbox";
      rs.p_n.C_e.H[var8++].at = "";
      rs.p_n.C_e.H[var8++].at = "@yel@<u=16776960>Item Guides";
      rs.p_n.C_e.H[var8++].at = "<img=39> Search item guide";
      rs.p_n.C_e.H[var8++].at = "<img=39> View all item guides";
      rs.p_n.C_e.H[var8++].at = "";
      rs.p_n.C_e.H[var8++].at = "@yel@<u=16776960>Miscellaneous";
      rs.p_n.C_e.H[var8++].at = "<img=16> Donate to us";
      rs.p_n.C_e.H[var8++].at = "<img=14> Vote for us";
      rs.p_n.C_e.H[var8++].at = "<img=40> Forums";
      rs.p_n.C_e.H[var8++].at = "<img=40> Discord";
      h(64703, "gameframe/sprite 6");
      var2.k(101);
      int var6 = 0;

      for (int var7 = 64602; var6 <= 100 && var7 <= 64702; var7++) {
         var2.b(var6, var7, 2, var6 == 0 ? 5 : var2.bc[var6 - 1] + 15);
         var6++;
      }

      var2.P = 168;
      var2.aR = 225 - var3;
      var2.aH = 1320;
      var1.k(6);
      var1.b(0, 64703, 0, 31 + var3 + var4);
      var1.b(1, 32000, 0, 0);
      var1.b(2, 16022, 0, 28 + var3 + var4);
      var1.b(3, 16022, 0, 255 + var4);
      var1.b(4, 16023, 4, 251 + var4);
      var1.b(5, 64601, 6, 30 + var3 + var4);
   }
}
