package rs.p_ui.p_components.p_a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class C_l extends MouseMotionAdapter {
   C_l(C_k var1) {
      this.a = var1;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      C_k.a(this.a, var1.getY());
   }
}
