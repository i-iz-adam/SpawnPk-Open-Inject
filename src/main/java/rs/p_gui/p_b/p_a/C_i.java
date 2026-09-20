package rs.p_gui.p_b.p_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_i implements ActionListener {
   final C_g b;
   final C_y a;
   C_i(C_g var1, C_y var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      rs.p_gui.p_b.C_a var2 = this.b.a.b(this.b.a.e(), this.a.c());
      if (var2 != null) {
         var2.a(this.a.b());
         var2.a(this.a.a());
         this.b.a.a(this.b.a.e(), this.b.a.d());
      }
   }
}
