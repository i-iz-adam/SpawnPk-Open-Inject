package rs.p_ui.p_components.p_a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class C_b extends MouseMotionAdapter {
   C_b(C_a var1) {
      this.a = var1;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      C_a.a(this.a, var1.getX(), var1.getY(), true);
   }
}
