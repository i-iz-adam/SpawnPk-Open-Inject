package rs.p_gui.p_b.p_a;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class C_o implements ActionListener {
   final JPopupMenu a;
   final JMenuItem b;
   final rs.p_gui.p_b.C_h c;
   final String d;
   C_o(JPopupMenu var1, JMenuItem var2, rs.p_gui.p_b.C_h var3, String var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      for (Component var5 : this.a.getComponents()) {
         var5.setBackground(Color.DARK_GRAY);
      }

      this.b.setBackground(Color.ORANGE);
      this.c.f().a(this.d, 0);
      this.c.b();
   }
}
