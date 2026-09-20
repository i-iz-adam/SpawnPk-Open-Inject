package rs.p_gui.p_b.p_a;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

class C_e extends DefaultListCellRenderer {
   private static final long b = -1L;
   private Color[] c;
   private String[] d;
   JComboBox a;

   public C_e(JComboBox var1) {
      this.a = var1;
      this.setOpaque(true);
   }

   public void a(Color[] var1) {
      this.c = var1;
   }

   public void a(String[] var1) {
      this.d = var1;
   }

   public Color[] a() {
      return this.c;
   }

   public String[] b() {
      return this.d;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      if (this.c.length != this.d.length) {
         System.out.println("colors.length does not equal strings.length");
         return this;
      } else if (this.c == null) {
         System.out.println("use setColors first.");
         return this;
      } else if (this.d == null) {
         System.out.println("use setStrings first.");
         return this;
      } else {
         JLabel var6 = (JLabel)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
         if (var3 == -1) {
            var6.setForeground(this.c[this.a.getSelectedIndex()]);
         } else {
            var6.setForeground(this.c[var3]);
         }

         return var6;
      }
   }
}
