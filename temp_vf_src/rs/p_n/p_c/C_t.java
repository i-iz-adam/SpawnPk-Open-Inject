package rs.p_n.p_c;

public class C_t extends rs.p_n.C_c {
   public C_t(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      byte var1 = 60;
      byte var2 = 25;
      rs.p_n.C_e var3 = d(51318);
      var3.k(3);
      rs.p_n.C_e var4 = d(51319);
      var4.P = 345;
      var4.aR = 230;
      var4.aH = 10000;
      var4.k(600);

      for (int var5 = 51320; var5 < 51920; var5++) {
         int var6 = var5 - 51320;
         a(var5, "", "Select", this.a, 1, 0, true, false, 200);
         rs.p_n.C_e.H[var5].bo = true;
         var4.b(var6, var5, var1 + 20, var2 - 25 + var6 * 17);
      }

      a(51920, "", this.a, 2, 0, true, false);
      var3.b(0, 8135, var1, var2);
      var3.b(1, 51319, var1 + 5, var2 + 40);
      var3.b(2, 51920, var1 + 185, var2 + 20);
   }
}
