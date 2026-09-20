package rs.p_gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_K_uc extends MouseAdapter {
   boolean a;

   C_J_uc b;

   C_K_uc(C_J_uc var1) {
      this.b = var1;
      this.a = true;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.a) {
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
