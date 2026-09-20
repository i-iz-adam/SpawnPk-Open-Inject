package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.C_Client_mc;

class C_m implements ActionListener {
   C_m(C_e var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_Client_mc.f("http://spawnpk.net/forums/");
   }
}
