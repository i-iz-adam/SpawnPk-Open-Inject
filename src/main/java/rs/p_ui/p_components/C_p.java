package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

class C_p extends MouseAdapter {
   C_p(C_k var1, JButton var2, Color var3, Color var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.a.setForeground(this.b);
      C_k.a(this.d).dispatchEvent(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.a.setForeground(this.c);
      C_k.a(this.d).dispatchEvent(var1);
   }
}
