package rs.p_gui.p_b;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_i extends MouseAdapter {
   private final C_h a;
   C_i(C_h var1) {
      this.a = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         C_h.a(this.a).show(var1.getComponent(), 1, 1);
      }
   }
}
