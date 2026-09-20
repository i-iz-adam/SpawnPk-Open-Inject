package rs.p_gui.p_b.p_a;

import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.ListCellRenderer;

public class C_k extends JComboBox<String> {
   private final ListCellRenderer<Enum<?>> a = new rs.p_ui.p_components.C_c<>();
   final rs.p_gui.p_b.C_d b;

   public C_k(rs.p_gui.p_b.C_d var1, String[] var2) {
      super(var2);
      this.b = var1;
      this.setRenderer(new C_f(var1, this));
      this.setInheritsPopupMenu(true);
      this.setPreferredSize(new Dimension(150, 25));
      this.a();
   }

   private void a() {
      this.addPopupMenuListener(new C_l(this));
      this.addActionListener(new C_m(this));
   }
}
