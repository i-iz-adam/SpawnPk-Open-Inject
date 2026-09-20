package rs.p_s.p_t;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class C_e extends MouseAdapter {
   C_e(C_d var1) {
      this.a = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         C_d.a(this.a);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      C_d.b(this.a).setBackground(rs.p_gui.C_d.g);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      C_d.b(this.a).setBackground(rs.p_gui.C_d.c);
   }
}
