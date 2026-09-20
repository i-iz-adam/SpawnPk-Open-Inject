package rs.p_ui.p_components.p_a;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class C_g extends FocusAdapter {
   C_g(C_e var1) {
      this.a = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      C_e.a(this.a);
   }
}
