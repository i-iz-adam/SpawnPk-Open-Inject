package rs.p_ui.p_components.p_a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_m extends MouseAdapter {
   C_m(C_k var1) {
      this.a = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      C_k.a(this.a, var1.getY());
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      C_k.a(this.a, var1.getY());
   }
}
