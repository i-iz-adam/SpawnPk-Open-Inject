package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.C_Client_mc;

class C_o implements ActionListener {
   C_o(C_e var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_Client_mc.f("https://spawnpk.net/forums/index.php?/topic/5710-the-official-spawnpk-price-guide-for-2017/");
   }
}
