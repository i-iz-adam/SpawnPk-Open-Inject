package rs.p_ui.p_components.p_b;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_c extends MouseAdapter {
   C_c(C_a var1) {
      this.a = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      C_a var2 = (C_a)var1.getSource();
      var2.setForeground(Color.WHITE);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      C_a var2 = (C_a)var1.getSource();
      if (!var2.d()) {
         var2.setForeground(Color.GRAY);
      }
   }
}
