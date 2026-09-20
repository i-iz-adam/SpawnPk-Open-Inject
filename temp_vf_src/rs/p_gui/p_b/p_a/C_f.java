package rs.p_gui.p_b.p_a;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

class C_f extends DefaultListCellRenderer {
   private final rs.p_gui.p_b.C_d a;
   private final C_k b;

   public C_f(rs.p_gui.p_b.C_d var1, C_k var2) {
      this.setOpaque(true);
      this.b = var2;
      this.a = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      var1.setSelectionBackground(rs.p_gui.C_d.d);
      JLabel var6 = (JLabel)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      rs.p_gui.p_b.C_a var7 = null;
      if (var3 >= 0) {
         if (this.a.d() != null && var3 < this.a.d().size() && this.a.d().get(var3) != null) {
            var7 = this.a.d().get(var3);
         }
      } else if (this.b.getSelectedIndex() >= 0
         && this.a.d() != null
         && this.b.getSelectedIndex() < this.a.d().size()
         && this.a.d().get(this.b.getSelectedIndex()) != null) {
         var7 = this.a.d().get(this.b.getSelectedIndex());
      }

      if (var7 != null) {
         var6.setForeground(var7.j());
         if (var7.k() != null) {
            var6.setIcon(var7.k().a());
         }
      }

      return var6;
   }
}
