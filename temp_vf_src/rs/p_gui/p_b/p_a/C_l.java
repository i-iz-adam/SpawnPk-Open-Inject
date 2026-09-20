package rs.p_gui.p_b.p_a;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import rs.p_gui.C_Launcher_mc;

class C_l implements PopupMenuListener {
   C_l(C_k var1) {
      this.a = var1;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
      C_Launcher_mc.n().k().repaint();
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      C_Launcher_mc.n().k().a();
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
      C_Launcher_mc.n().k().repaint();
   }
}
