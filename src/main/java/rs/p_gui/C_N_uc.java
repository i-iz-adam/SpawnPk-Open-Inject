package rs.p_gui;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_N_uc extends MouseAdapter {
   final Frame a;

   C_N_uc(Frame var1) {
      this.a = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (rs.p_k.C_j.a() == rs.p_k.C_j.b && !this.a.isFocused()) {
         this.a.setVisible(false);
         rs.p_A_uc.C_o.b();
      }

      this.a.setVisible(true);
      this.a.setState(0);
   }
}
