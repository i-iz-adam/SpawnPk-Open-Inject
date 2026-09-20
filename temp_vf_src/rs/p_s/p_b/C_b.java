package rs.p_s.p_b;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

class C_b extends MouseAdapter {
   C_b(C_a var1, rs.p_e.C_m var2, JButton var3, JPanel var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      C_a.a(this.d, this.a, this.b, this.c);
   }
}
