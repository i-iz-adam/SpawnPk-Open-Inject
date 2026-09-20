package rs.p_s.p_b;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class C_d extends MouseAdapter {
   C_d(C_a var1, rs.p_ui.p_components.C_b var2, rs.p_e.C_h var3, boolean var4, rs.p_e.C_d var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      rs.p_ui.p_components.p_a.C_q var2 = C_a.a(this.e).a(SwingUtilities.windowForComponent(this.e), this.a.a(), this.b.d().c(), this.c);
      var2.setLocationRelativeTo(this.a);
      var2.a(var2x -> {
         var0.a(var2x);
         var0.setText("#" + (var1x ? rs.p_A_uc.C_g.c(var2x) : rs.p_A_uc.C_g.d(var2x)).toUpperCase());
      });
      var2.b(var4 -> C_a.a(this.e, var2, var2x, var3));
      var2.setVisible(true);
   }
}
