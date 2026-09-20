package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_t implements ActionListener {
   final rs.p_gui.p_b.C_h a;
   C_t(rs.p_gui.p_b.C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = null;

      for (String var4 : this.a.f().keySet()) {
         if (var4.equals(this.a.f().e())) {
            break;
         }

         var2 = var4;
      }

      if (var2 != null) {
         this.a.f().c(this.a.f().e(), var2);
      }
   }
}
