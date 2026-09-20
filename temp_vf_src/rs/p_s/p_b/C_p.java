package rs.p_s.p_b;

import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

class C_p extends MouseAdapter {
   private Color c;

   C_p(JPopupMenu var1, JLabel var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Component var2 = (Component)var1.getSource();
      Point var3 = MouseInfo.getPointerInfo().getLocation();
      SwingUtilities.convertPointFromScreen(var3, var2);
      this.a.show(var2, var3.x, var3.y);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.c = this.b.getForeground();
      this.b.setForeground(rs.p_gui.C_d.a);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.b.setForeground(this.c);
   }
}
