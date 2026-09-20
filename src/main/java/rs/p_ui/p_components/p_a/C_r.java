package rs.p_ui.p_components.p_a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_r extends MouseAdapter {
   C_r(C_q var1, boolean var2, C_n var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (!this.a) {
         C_q.a(this.c).a(this.b.a().getAlpha());
      }

      C_q.a(this.c, this.b.a());
      C_q.b(this.c);
   }
}
