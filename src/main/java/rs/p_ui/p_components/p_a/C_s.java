package rs.p_ui.p_components.p_a;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

class C_s extends DocumentFilter {
   C_s(C_q var1) {
      this.a = var1;
   }

   @Override
   public void replace(FilterBypass var1, int var2, int var3, String var4, AttributeSet var5) {
      var4 = var4.replaceAll("#|0x", "");
      String var6 = C_q.a(var1, var2, var3, var4);
      if (!rs.p_A_uc.C_g.b(var6)) {
         Toolkit.getDefaultToolkit().beep();
      } else {
         super.replace(var1, var2, var3, var4, var5);
      }
   }
}
