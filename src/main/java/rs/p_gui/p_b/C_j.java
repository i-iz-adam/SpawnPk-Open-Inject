package rs.p_gui.p_b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

class C_j implements ActionListener {
   private final C_h d;
   private final String a;
   private final C_a b;
   private final JFrame c;
   C_j(C_h var1, String var2, C_a var3, JFrame var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      C_h.b(this.d).d(this.a, this.b.f());
      this.c.setVisible(false);
      this.c.dispose();
   }
}
