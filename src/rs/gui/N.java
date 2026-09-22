package rs.gui;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import rs.class_17;
import rs.l.j;

class N extends MouseAdapter {
   N(Frame var1) {
      this.a = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (j.a() == j.b && !this.a.isFocused()) {
         this.a.setVisible(false);
         class_17.b();
      }

      this.a.setVisible(true);
      this.a.setState(0);
   }
}
