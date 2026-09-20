package rs.p_n.p_c;

public class C_D_uc extends rs.p_n.C_c {
   public C_D_uc(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = rs.p_n.C_e.H[6575];
      int[] var2 = var1.al;
      int[] var3 = var1.am;
      int[] var4 = var1.bc;
      byte var5 = 2;
      h(68439, "misc/duel load");
      a(68440, "Load last rules", "Load last duel", this.a, 0, 16750623, false, false, 68439);
      int[] var6 = new int[var2.length + var5];
      int[] var7 = new int[var3.length + var5];
      int[] var8 = new int[var4.length + var5];

      for (int var9 = 0; var9 < var2.length; var9++) {
         var6[var9] = var2[var9];
         var7[var9] = var3[var9];
         var8[var9] = var4[var9];
      }

      var6[var2.length + 0] = 68439;
      var7[var2.length + 0] = 394;
      var8[var2.length + 0] = 304;
      var6[var2.length + 1] = 68440;
      var7[var2.length + 1] = 415;
      var8[var2.length + 1] = 306;
      var1.al = var6;
      var1.am = var7;
      var1.bc = var8;
   }
}
