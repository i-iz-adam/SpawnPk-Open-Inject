package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

class C_q implements ActionListener {
   final C_p c;
   final JTextField a;
   final JFrame b;
   C_q(C_p var1, JTextField var2, JFrame var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.c.a.f().a(this.a.getText());
      this.b.setVisible(false);
      this.b.dispose();
   }
}
