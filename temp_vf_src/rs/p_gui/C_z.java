package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.C_Client_mc;

class C_z implements ActionListener {
   C_z(C_Launcher_mc var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_Client_mc.i = true;
   }
}
