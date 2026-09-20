package rs.p_l.p_e.p_a;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

class C_j implements rs.p_l.p_e.C_i {
   C_j(C_h var1) {
      this.a = var1;
   }

   @Override
   public void a(rs.p_n.C_e var1, int var2, int var3) {
      if (C_h.q && var1.az[1] > 0) {
         short var4 = 160;
         int var5 = var1.az[1] > 0 ? 50 : 0;
         C_Launcher_mc.n().o();
         if (!C_Client_mc.ai()) {
            var5 += 4;
            var3 += 4;
         }

         rs.p_l.p_a.C_b.a.a(var2 - 7 + var5, var3, var4);
         rs.p_l.p_a.C_b.a.a(var2 - 7 + var5, var3 + 2 + 15, var4);
         rs.p_l.p_a.C_b.a.a(var2 + 23 + var5, var3, var4);
         rs.p_l.p_a.C_b.a.a(var2 + 23 + var5, var3 + 2 + 15, var4);
      }
   }
}
