package rs.p_gui.p_b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_o implements ActionListener {
   C_o(C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_a var2 = C_h.b(this.a).c();
      if (var2 != null) {
         int var3 = this.a.d.getSelectedIndex();
         C_h.b(this.a).a(C_h.b(this.a).e(), var3, var3 + 1);
      }
   }
}
