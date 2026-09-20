package rs.p_s.p_g;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.p_d.C_k;
import rs.p_gui.C_Launcher_mc;
import rs.p_gui.C_d;
import rs.p_h.C_c;
import rs.p_ui.C_m;

public class C_a extends C_m {
   private AtomicBoolean a = new AtomicBoolean(false);
   private JScrollPane b;
   private final JTextArea c = new JTextArea();
   private final JTextField d = new JTextField();

   public void b() {
      this.getParent().setLayout(new BorderLayout());
      this.getParent().add(this, "Center");
      this.setLayout(new BorderLayout());
      JPanel var1 = new JPanel();
      var1.setLayout(new BorderLayout(5, 5));
      var1.setBorder(new EmptyBorder(5, 5, 5, 5));
      var1.setBackground(C_d.d);
      this.c.setBackground(C_d.a);
      this.c.setEditable(false);
      this.b = new JScrollPane(this.c);
      this.b.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
      this.b.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
      JPanel var2 = new JPanel();
      this.d.setPreferredSize(new Dimension(200, 25));
      this.d.addActionListener(var1x -> this.c());
      JButton var3 = new JButton("Search");
      var3.addActionListener(var1x -> this.c());
      var2.add(this.d);
      var2.add(var3);
      var1.add(var2, "North");
      var1.add(this.b, "Center");
      this.add(var1);
   }

   private void c() {
      if (!this.a.get()) {
         if (C_k.ad == 0) {
            JOptionPane.showMessageDialog(null, "Please wait until the client has loaded the item database!");
         } else if (this.d.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Please have at least 3 letters in your search term!");
         } else if (!C_Launcher_mc.n().o().fc) {
            JOptionPane.showMessageDialog(null, "Please login before searching items!");
         } else {
            this.a.set(true);
            this.e();
            C_c.a(() -> {
               String var1 = this.f();
               SwingUtilities.invokeLater(() -> {
                  this.c.setText(var1);
                  this.a.set(false);
               });
            });
         }
      }
   }

   private void e() {
      this.d.setCaretPosition(0);
      this.b.getVerticalScrollBar().setValue(0);
      this.c.setText("");
   }

   private String f() {
      String var1 = "";

      for (int var2 = 0; var2 < C_k.a; var2++) {
         C_k var3 = (C_k)C_k.c.b(var2);
         if (var3 != null && var3.w != null && var3.i != 11283 && var3.w.toLowerCase().contains(this.d.getText().toLowerCase()) && !var3.w.contains("@red@")) {
            String var4 = var3.w;
            var4 = var4.replace("@gre@", "");
            var4 = var4.replace("@red@", "");
            var4 = var4.replace("@blu@", "");
            var4 = var4.replace("@whi@", "");
            var1 = (var1.equals("") ? "" : var1 + "\n") + var3.i + "\t" + var4 + " " + (var3.b() ? "(noted)" : "");
         }
      }

      if (var1.equals("")) {
         var1 = "No results found for \"" + this.d.getText() + "!\"";
      }

      return var1;
   }
}
