package rs.p_ui.p_components.p_a;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.function.Consumer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;

public class C_e extends JPanel {
   private static final int a = 255;
   private final C_h b = new C_h();
   private final JTextField c = new JTextField();
   private Consumer<Integer> d;

   void a(Consumer<Integer> var1) {
      this.d = var1;
      this.b.a(var1);
   }

   C_e(String var1) {
      this.setLayout(new BorderLayout(10, 0));
      this.setBackground(rs.p_gui.C_d.d);
      this.c.setBackground(rs.p_gui.C_d.c);
      this.c.setPreferredSize(new Dimension(35, 30));
      this.c.setBorder(new EmptyBorder(5, 5, 5, 5));
      ((AbstractDocument)this.c.getDocument()).setDocumentFilter(new C_f(this));
      this.c.addFocusListener(new C_g(this));
      this.c.addActionListener(var1x -> this.b());
      JLabel var2 = new JLabel(var1);
      var2.setPreferredSize(new Dimension(45, 0));
      var2.setForeground(Color.WHITE);
      this.b.setBackground(rs.p_gui.C_d.d);
      this.b.setBorder(new EmptyBorder(0, 0, 5, 0));
      this.b.setPreferredSize(new Dimension(259, 30));
      this.a(255);
      this.add(var2, "West");
      this.add(this.b, "Center");
      this.add(this.c, "East");
   }

   private void b() {
      int var1 = Integer.parseInt(this.c.getText());
      this.a(var1);
      if (this.d != null) {
         this.d.accept(this.a());
      }
   }

   public void a(int var1) {
      var1 = rs.p_A_uc.C_g.a(var1);
      this.b.a(var1);
      this.c.setText(var1 + "");
   }

   public int a() {
      return this.b.a();
   }
}
