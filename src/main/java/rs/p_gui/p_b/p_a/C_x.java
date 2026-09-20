package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

class C_x implements ActionListener {
   final C_v b;
   final JFrame a;
   C_x(C_v var1, JFrame var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.setVisible(false);
      this.a.dispose();
   }
}
