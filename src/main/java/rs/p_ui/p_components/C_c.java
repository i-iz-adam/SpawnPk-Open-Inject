package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

public final class C_c<T> extends JLabel implements ListCellRenderer<T> {
   @Override
   public Component getListCellRendererComponent(JList<? extends T> var1, T var2, int var3, boolean var4, boolean var5) {
      if (var4) {
         this.setBackground(rs.p_gui.C_d.d);
         this.setForeground(Color.WHITE);
      } else {
         this.setBackground(var1.getBackground());
         this.setForeground(rs.p_gui.C_d.f);
      }

      this.setBorder(new EmptyBorder(5, 5, 5, 0));
      String var6;
      if (var2 instanceof Enum) {
         var6 = rs.p_A_uc.C_s.a((Enum)var2);
      } else {
         var6 = var2.toString();
      }

      this.setText(var6);
      return this;
   }
}
