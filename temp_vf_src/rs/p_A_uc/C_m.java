package rs.p_A_uc;

import java.awt.Component;
import javax.swing.Popup;
import javax.swing.PopupFactory;

public class C_m extends PopupFactory {
   @Override
   protected Popup getPopup(Component var1, Component var2, int var3, int var4, boolean var5) {
      return super.getPopup(var1, var2, var3, var4, true);
   }
}
