package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

class C_s implements ActionListener {
   C_s(C_r var1, JTextField var2, JFrame var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = this.a.getText();
      this.c.a.f().a(this.c.a.f().e(), var2);
      this.b.setVisible(false);
      this.b.dispose();
   }
}
