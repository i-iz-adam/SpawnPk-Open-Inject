package rs.p_s.p_b;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_j extends MouseAdapter {
   C_j(C_i var1) {
      this.a = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         this.a.a(C_l.a);
      }
   }
}
