package rs.p_gui.p_b.p_a;

import javax.swing.Icon;
import javax.swing.JButton;

public class C_g extends JButton {
   final rs.p_gui.p_b.C_d a;

   public C_g(Icon var1, rs.p_gui.p_b.C_d var2) {
      super("", var1);
      this.a = var2;
      this.addActionListener(new C_h(this));
   }

   public void a() {
      C_y var1 = new C_y(this.a, "Name Your Loadout", "Create");
      var1.a(new C_i(this, var1));
      var1.setVisible(true);
   }
}
