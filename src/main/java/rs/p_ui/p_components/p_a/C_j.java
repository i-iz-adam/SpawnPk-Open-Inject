package rs.p_ui.p_components.p_a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_j extends MouseAdapter {
   C_j(C_h var1) {
      this.a = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      C_h.a(this.a, var1.getX(), true);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      C_h.a(this.a, var1.getX(), true);
   }
}
