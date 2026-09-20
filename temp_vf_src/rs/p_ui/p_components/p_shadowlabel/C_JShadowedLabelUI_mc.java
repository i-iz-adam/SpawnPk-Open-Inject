package rs.p_ui.p_components.p_shadowlabel;

import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicLabelUI;

class C_JShadowedLabelUI_mc extends BasicLabelUI {
   @Override
   protected void paintEnabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      if (var1 instanceof C_a) {
         C_a var6 = (C_a)var1;
         var2.setColor(var6.a());
         var2.drawString(var3, var4 + var6.b().x, var5 + var6.b().y);
      }

      var2.setColor(var1.getForeground());
      var2.drawString(var3, var4, var5);
   }
}
