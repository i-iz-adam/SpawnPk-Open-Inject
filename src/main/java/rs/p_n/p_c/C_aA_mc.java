package rs.p_n.p_c;

public class C_aA_mc extends rs.p_n.C_c {
   public C_aA_mc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(53500);
      byte var2 = 18;
      short var3 = -5;
      byte var4 = 3;
      short var5 = 160;
      byte var6 = 6;
      var1.k(var2);

      for (int var7 = 0; var7 < var2; var7++) {
         int var8 = 53501 + var7;
         a(var8, "Selecting this option Toggle " + (var7 + 1), "Select option", this.a, 0, 0, true, false, var5);
         rs.p_n.C_e.H[var8].bo = true;
         var1.b(var7, var8, var3, var4);
         var4 += 17;
         if (var4 > 17 * var6) {
            var4 = 3;
            var3 += var5;
         }
      }

      rs.p_n.C_e var12 = d(53519);
      var12.k(var2);
      var3 = -5;
      var4 = 3;

      for (int var13 = 0; var13 < var2; var13++) {
         int var9 = 53501 + var13;
         a(var9, "Selecting this option Toggle " + (var13 + 1), "Select option", this.a, 0, 0, true, false, var5);
         rs.p_n.C_e.H[var9].bo = true;
         var12.b(var13, var9, var3, var4);
         var3 += var5;
         if (var3 >= var5 * 2) {
            var4 += 17;
            var3 = -5;
         }
      }
   }
}
