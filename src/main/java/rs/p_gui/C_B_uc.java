package rs.p_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class C_B_uc implements ActionListener {
   final C_Launcher_mc a;

   C_B_uc(C_Launcher_mc var1) {
      this.a = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (C_Launcher_mc.n().m() != null) {
         if (this.a.l.a().d.isPopupVisible()) {
            return;
         }

         C_Launcher_mc.n().m().repaint();
      }

      ((Timer)var1.getSource()).stop();
      this.a.r = false;
   }
}
