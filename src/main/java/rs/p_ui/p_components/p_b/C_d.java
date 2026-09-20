package rs.p_ui.p_components.p_b;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_d extends MouseAdapter {
   C_d(C_a var1) {
      this.a = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      C_a var2 = (C_a)var1.getSource();
      var2.setBackground(rs.p_gui.C_d.g);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      C_a var2 = (C_a)var1.getSource();
      var2.setBackground(rs.p_gui.C_d.c);
   }
}
