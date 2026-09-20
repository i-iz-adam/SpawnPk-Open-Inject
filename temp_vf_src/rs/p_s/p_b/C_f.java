package rs.p_s.p_b;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;

class C_f extends FocusAdapter {
   C_f(C_a var1, JList var2, rs.p_e.C_d var3, rs.p_e.C_h var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      C_a.a(this.d, this.a, this.b, this.c);
   }
}
