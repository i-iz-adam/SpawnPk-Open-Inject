package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_i implements ActionListener {
   C_i(C_g var1, C_y var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      rs.p_gui.p_b.C_a var2 = C_g.a(this.b).b(C_g.a(this.b).e(), this.a.c());
      if (var2 != null) {
         var2.a(this.a.b());
         var2.a(this.a.a());
         C_g.a(this.b).a(C_g.a(this.b).e(), C_g.a(this.b).d());
      }
   }
}
