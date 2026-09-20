package rs.p_gui;

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class C_L_uc implements ChangeListener {
   private final C_J_uc a;
   C_L_uc(C_J_uc var1) {
      this.a = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      JTabbedPane var2 = (JTabbedPane)var1.getSource();
      int var3 = var2.getSelectedIndex();
      C_Launcher_mc.n().d();
   }
}
