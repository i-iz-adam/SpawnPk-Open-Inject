package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_z implements ActionListener {
   C_z(C_y var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.setVisible(false);
      this.a.dispose();
   }
}
