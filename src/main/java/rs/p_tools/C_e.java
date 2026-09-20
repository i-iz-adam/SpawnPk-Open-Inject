package rs.p_tools;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class C_e extends FocusAdapter {
   C_e(C_TextPopupWindow_mc var1) {
      this.a = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      C_TextPopupWindow_mc.b(this.a).getCaret().setVisible(true);
   }
}
