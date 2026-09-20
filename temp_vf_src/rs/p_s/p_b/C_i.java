package rs.p_s.p_b;

import javax.swing.JButton;

public class C_i extends JButton {
   private C_l a;

   public C_i(C_l var1, boolean var2) {
      this.setFont(rs.p_gui.C_w.d().deriveFont(12.0F));
      this.a(var1);
      this.addMouseListener(new C_j(this));
      this.addKeyListener(new C_k(this, var2));
   }

   public void a(C_l var1) {
      if (var1 == null) {
         var1 = C_l.a;
      }

      this.a = var1;
      this.setText(var1.toString());
   }

   public C_l a() {
      return this.a;
   }
}
