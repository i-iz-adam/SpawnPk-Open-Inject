package rs.p_ui.p_components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;

public class C_i extends JPanel {
   private final JTextField a;
   private Color b;
   private Color c;
   private boolean d;

   public C_i() {
      this.b = rs.p_gui.C_d.c;
      this.setLayout(new BorderLayout());
      this.setBorder(new EmptyBorder(0, 10, 0, 0));
      this.a = new JTextField();
      this.a.setBorder(null);
      this.a.setOpaque(false);
      this.a.setSelectedTextColor(Color.WHITE);
      this.a.setSelectionColor(rs.p_gui.C_d.b);
      this.add(this.a, "Center");
      this.a.addMouseListener(new C_j(this));
   }

   public void a(ActionListener var1) {
      this.a.addActionListener(var1);
   }

   public String a() {
      return this.a.getText();
   }

   public void a(String var1) {
      this.a.setText(var1);
   }

   @Override
   public void addKeyListener(KeyListener var1) {
      this.a.addKeyListener(var1);
   }

   @Override
   public void removeKeyListener(KeyListener var1) {
      this.a.removeKeyListener(var1);
   }

   @Override
   public void setBackground(Color var1) {
      this.a(var1, true);
   }

   @Override
   public boolean requestFocusInWindow() {
      return this.a.requestFocusInWindow();
   }

   public void a(Color var1, boolean var2) {
      if (var1 != null) {
         super.setBackground(var1);
         if (var2) {
            this.b = var1;
         }
      }
   }

   public void a(Color var1) {
      if (var1 != null) {
         this.c = var1;
      }
   }

   public void a(boolean var1) {
      this.d = !var1;
      this.a.setEditable(var1);
      this.a.setFocusable(var1);
      if (!var1) {
         super.setBackground(this.b);
      }
   }

   public Document b() {
      return this.a.getDocument();
   }

   public JTextField c() {
      return this.a;
   }

   public Color d() {
      return this.b;
   }

   public Color e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
