package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_l extends MouseAdapter {
   C_l(C_k var1) {
      this.a = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (!C_k.a(this.a).f()) {
         Color var2 = C_k.a(this.a).e();
         if (var2 != null) {
            C_k.a(this.a, var2);
            C_k.a(this.a).a(var2, false);
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.a.setBackground(C_k.a(this.a).d());
   }
}
