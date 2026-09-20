package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

class C_w implements ActionListener {
   C_w(C_v var1, String var2, JFrame var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.c.a.f().b(this.a);
      this.b.setVisible(false);
      this.b.dispose();
   }
}
