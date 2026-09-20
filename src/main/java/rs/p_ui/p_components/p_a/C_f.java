package rs.p_ui.p_components.p_a;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

class C_f extends DocumentFilter {
   C_f(C_e var1) {
      this.a = var1;
   }

   @Override
   public void replace(FilterBypass var1, int var2, int var3, String var4, AttributeSet var5) {
      try {
         String var6 = C_q.a(var1, var2, var3, var4);
         int var7 = Integer.parseInt(var6);
         if (var7 < 0 || var7 > 255) {
            Toolkit.getDefaultToolkit().beep();
            return;
         }

         super.replace(var1, var2, var3, var4, var5);
      } catch (NumberFormatException var8) {
         Toolkit.getDefaultToolkit().beep();
      }
   }
}
