package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.C_Client_mc;

class C_n implements ActionListener {
   final C_e a;

   C_n(C_e var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_Client_mc.f("https://spawnpk.net/forums/index.php?/forum/10-updates/");
   }
}
