package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_u implements ActionListener {
   C_u(rs.p_gui.p_b.C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = null;
      boolean var3 = false;

      for (String var5 : this.a.f().keySet()) {
         if (var3) {
            var2 = var5;
            break;
         }

         if (var5.equals(this.a.f().e())) {
            var3 = true;
         }
      }

      if (var2 != null) {
         this.a.f().c(this.a.f().e(), var2);
      }
   }
}
