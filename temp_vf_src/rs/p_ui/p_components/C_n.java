package rs.p_ui.p_components;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import org.pushingpixels.substance.internal.ui.SubstanceListUI;

class C_n extends FocusAdapter {
   C_n(C_k var1, JPopupMenu var2, JList var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.a.setVisible(false);
      this.b.clearSelection();
      SubstanceListUI var2 = (SubstanceListUI)this.b.getUI();
      var2.resetRolloverIndex();
   }
}
