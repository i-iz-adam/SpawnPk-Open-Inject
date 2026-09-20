package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.C_Client_mc;

class C_p implements ActionListener {
   C_p(C_e var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (C_Launcher_mc.n().o() != null && C_Launcher_mc.n().o().fc) {
         C_Launcher_mc.n().o();
         C_Client_mc.ap = "::switch";
      }
   }
}
