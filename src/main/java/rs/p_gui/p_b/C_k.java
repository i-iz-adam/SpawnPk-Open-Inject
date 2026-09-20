package rs.p_gui.p_b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

class C_k implements ActionListener {
   private final JFrame a;
   private final C_h b;
   C_k(C_h var1, JFrame var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.setVisible(false);
      this.a.dispose();
   }
}
