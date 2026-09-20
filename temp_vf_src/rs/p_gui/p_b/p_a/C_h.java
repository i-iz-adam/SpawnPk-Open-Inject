package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_h implements ActionListener {
   C_h(C_g var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.a();
   }
}
