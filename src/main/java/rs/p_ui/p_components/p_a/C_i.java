package rs.p_ui.p_components.p_a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class C_i extends MouseMotionAdapter {
   C_i(C_h var1) {
      this.a = var1;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      C_h.a(this.a, var1.getX(), true);
   }
}
