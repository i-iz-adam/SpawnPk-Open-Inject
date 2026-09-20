package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class C_H_uc implements ActionListener {
   final C_G_uc a;

   C_H_uc(C_G_uc var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_G_uc.a(this.a);
   }
}
