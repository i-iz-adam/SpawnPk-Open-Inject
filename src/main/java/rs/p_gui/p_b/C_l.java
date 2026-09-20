package rs.p_gui.p_b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.p_gui.p_b.p_a.C_y;

class C_l implements ActionListener {
   final C_h a;
   C_l(C_h var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_a var2 = C_h.b(this.a).c();
      String var3 = C_h.b(this.a).e();
      if (var2 != null) {
         C_y var4 = new C_y(C_h.b(this.a), "Re-name \"" + var2.f() + "\" to..", "Rename");
         var4.a(new C_m(this, var4, var2, var3));
         var4.setName(var2.f());
         var4.a(var2.j());
         var4.a(var2.k());
      }
   }
}
