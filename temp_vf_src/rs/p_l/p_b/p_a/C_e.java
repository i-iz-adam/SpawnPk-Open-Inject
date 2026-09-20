package rs.p_l.p_b.p_a;

import java.util.Comparator;
import rs.C_Client_mc;

class C_e implements Comparator<rs.p_l.p_b.p_a.p_a.C_a> {
   C_e(C_d var1) {
      this.a = var1;
   }

   public int a(rs.p_l.p_b.p_a.p_a.C_a var1, rs.p_l.p_b.p_a.p_a.C_a var2) {
      Integer var3 = var1.d() - C_Client_mc.cJ;
      Integer var4 = var1.e() - C_Client_mc.cL;
      Integer var5 = var2.d() - C_Client_mc.cJ;
      Integer var6 = var2.e() - C_Client_mc.cL;
      Integer var7 = (int)Math.ceil(Math.sqrt((double)(var3 * var3 + var4 * var4)));
      Integer var8 = (int)Math.ceil(Math.sqrt((double)(var5 * var5 + var6 * var6)));
      return var8.compareTo(var7);
   }
}
