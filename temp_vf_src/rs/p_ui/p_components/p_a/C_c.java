package rs.p_ui.p_components.p_a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_c extends MouseAdapter {
   C_c(C_a var1) {
      this.a = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      C_a.a(this.a, var1.getX(), var1.getY(), true);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      C_a.a(this.a, var1.getX(), var1.getY(), true);
   }
}
