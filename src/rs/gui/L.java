package rs.gui;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class L implements ChangeListener {
   L(J var1) {
      this.a = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      JTabbedPane var2 = (JTabbedPane)var1.getSource();
      int var3 = var2.getSelectedIndex();
      Launcher.n().d();
   }
}
