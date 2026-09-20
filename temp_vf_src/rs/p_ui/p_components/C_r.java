package rs.p_ui.p_components;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class C_r extends MouseAdapter {
   private final Component a;

   public C_r(Component var1) {
      this.a = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.a(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.a(var1);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.a(var1);
   }

   private void a(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         MouseEvent var2 = SwingUtilities.convertMouseEvent((Component)var1.getSource(), var1, this.a);
         this.a.dispatchEvent(var2);
      }
   }
}
