package rs.p_ui.p_components.p_b;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_b extends MouseAdapter {
   C_b(C_a var1, C_e var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.a.b(this.b);
   }
}
