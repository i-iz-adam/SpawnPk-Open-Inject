package rs.p_ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

class C_g extends WindowAdapter {
   C_g(C_f var1) {
      this.a = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      int var2 = 0;
      if (C_f.a(this.a)) {
         try {
            var2 = JOptionPane.showConfirmDialog(C_f.b(this.a), "Are you sure you want to exit?", "Exit", 2, 3);
         } catch (Exception var4) {
            C_f.q().warn("Unexpected exception occurred while check for confirm required", var4);
         }
      }

      if (var2 == 0) {
         C_f.c(this.a);
      }
   }
}
