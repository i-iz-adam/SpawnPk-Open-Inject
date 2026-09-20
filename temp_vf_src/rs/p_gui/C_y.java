package rs.p_gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class C_y extends MouseAdapter {
   C_y(C_Launcher_mc var1) {
      this.a = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.a.i().setState(0);
      this.a.i().setVisible(true);
   }
}
