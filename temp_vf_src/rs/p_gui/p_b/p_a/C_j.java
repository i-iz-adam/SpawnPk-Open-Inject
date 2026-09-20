package rs.p_gui.p_b.p_a;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

class C_j extends DefaultListCellRenderer {
   private final JComboBox a;

   public C_j(JComboBox var1) {
      this.setOpaque(true);
      this.a = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      JLabel var6 = (JLabel)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      int var7 = var3 > 0 ? var3 : this.a.getSelectedIndex();
      if (var6.getText().startsWith("None")) {
         return var6;
      } else {
         if (var7 > 0) {
            var6.setIcon(rs.p_gui.p_b.C_e.values()[var7 - 1].a());
         } else {
            var6.setIcon(null);
         }

         return var6;
      }
   }
}
