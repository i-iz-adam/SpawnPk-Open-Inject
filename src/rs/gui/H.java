package rs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H implements ActionListener {
   H(G var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      G.a(this.a);
   }
}
