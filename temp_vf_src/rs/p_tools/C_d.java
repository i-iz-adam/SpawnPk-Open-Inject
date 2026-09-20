package rs.p_tools;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class C_d extends AbstractAction {
   C_d(C_TextPopupWindow_mc var1, C_TextPopupWindow_mc var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (C_TextPopupWindow_mc.a(this.b) != null && C_TextPopupWindow_mc.a(this.b).isVisible()) {
         C_TextPopupWindow_mc.a(this.b).a();
      } else {
         C_TextPopupWindow_mc.a(this.b, this.b.new a(this.a));
         C_TextPopupWindow_mc.a(this.b).b();
      }
   }
}
