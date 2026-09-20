package rs.p_l.p_f.p_a.p_i;

import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;

public enum C_e {
   a,
   b,
   c,
   d;

   public C_F_uc a() {
      switch (this) {
         case a:
            return C_Launcher_mc.n().o().cW;
         case b:
            return C_Launcher_mc.n().o().cX;
         case c:
            return C_Launcher_mc.n().o().cV;
         case d:
            return C_Launcher_mc.n().o().cU;
         default:
            return C_Launcher_mc.n().o().cU;
      }
   }
}
