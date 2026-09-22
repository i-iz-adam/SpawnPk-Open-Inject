package rs.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class K extends MouseAdapter {
   boolean a;

   K(J var1) {
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
