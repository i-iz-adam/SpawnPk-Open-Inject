package rs.p_ui.p_components.p_a;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class C_t extends FocusAdapter {
   C_t(C_q var1) {
      this.a = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      C_q.c(this.a);
   }
}
