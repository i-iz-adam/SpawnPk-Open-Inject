package rs.p_tools;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class C_f extends AbstractAction {
   C_f(C_TextPopupWindow_mc.a var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.a.dispose();
   }
}
