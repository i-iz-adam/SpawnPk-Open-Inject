package rs.p_s.p_t;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JPanel;

class C_n extends MouseAdapter {
   C_n(C_m var1, List var2, Color var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      for (JPanel var3 : this.a) {
         C_m.a(this.c, var3, rs.p_gui.C_d.h);
      }

      this.c.setCursor(new Cursor(12));
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      for (JPanel var3 : this.a) {
         C_m.a(this.c, var3, this.b);
      }

      this.c.setCursor(new Cursor(0));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
