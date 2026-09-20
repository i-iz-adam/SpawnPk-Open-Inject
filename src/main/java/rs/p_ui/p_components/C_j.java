package rs.p_ui.p_components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_j extends MouseAdapter {
   C_j(C_i var1) {
      this.a = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (!C_i.a(this.a)) {
         if (C_i.b(this.a) != null) {
            this.a.a(C_i.b(this.a), false);
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.a.setBackground(C_i.c(this.a));
   }
}
