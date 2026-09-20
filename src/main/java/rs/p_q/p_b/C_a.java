package rs.p_q.p_b;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import rs.p_gui.C_Launcher_mc;
import rs.p_k.C_j;

public class C_a extends JFrame {
   private JTextArea a;
   private JLabel b;
   private JTextField c;
   private JDialog d;

   public C_a() {
      this.b();
   }

   private void b() {
      this.setDefaultCloseOperation(2);
      this.setTitle("Report Request Results");
      this.setSize(800, 600);
      this.setLocationRelativeTo(C_Launcher_mc.n().i());
      if (C_j.a() == C_j.a) {
         this.setUndecorated(true);
         this.getRootPane().setWindowDecorationStyle(1);
      }

      this.a = new JTextArea();
      this.a.setText("Waiting for results..\n");
      this.a.addKeyListener(new C_b(this));
      JScrollPane var1 = new JScrollPane(this.a);
      var1.setBackground(rs.p_gui.C_d.c);
      this.getContentPane().add(var1, "Center");
      this.d = this.c();
      this.setVisible(true);
   }

   private JDialog c() {
      JDialog var1 = new JDialog(this, "Find Text", false);
      var1.setSize(300, 100);
      var1.setResizable(false);
      var1.setLocationRelativeTo(this);
      ActionListener var2 = var1x -> var1.setVisible(false);
      var1.getRootPane().registerKeyboardAction(var2, KeyStroke.getKeyStroke(27, 0), 2);
      Container var3 = var1.getContentPane();
      var3.setLayout(new FlowLayout());
      var3.add(new JLabel("Find:"));
      this.b = new JLabel("Match results: N/A");
      this.c = new JTextField(20);
      this.c.addKeyListener(new C_c(this));
      var3.add(this.c);
      var3.add(this.b);
      return var1;
   }

   private void a(boolean var1) {
      String var2 = this.c.getText();
      String var3 = this.a.getText();
      if (!var2.isEmpty() && !var3.isEmpty()) {
         int var4 = var1 ? this.a.getCaretPosition() - var2.length() : this.a.getCaretPosition();
         if (var4 < 0) {
            var4 = 0;
         }

         int var5 = var1 ? var3.lastIndexOf(var2, var4) : var3.indexOf(var2, var4);
         if (var5 == -1) {
            var5 = var1 ? var3.lastIndexOf(var2) : var3.indexOf(var2);
         }

         this.a(var5, var1 ? var5 + 1 : var5 + var2.length());
      }
   }

   private void a(int var1, int var2) {
      Highlighter var3 = this.a.getHighlighter();
      var3.removeAllHighlights();
      String var4 = this.c.getText();
      String var5 = this.a.getText();
      if (var1 != -1) {
         this.a(var4, var1);

         try {
            var3.addHighlight(var1, var1 + var4.length(), DefaultHighlighter.DefaultPainter);
            this.a.setCaretPosition(var2);
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      } else {
         this.b.setText("Match results: N/A");
      }
   }

   private void a(String var1, int var2) {
      String var3 = this.a.getText();
      if (!var1.isEmpty() && !var3.isEmpty()) {
         int var4 = 0;
         int var5 = 0;
         int var6 = -1;

         while ((var4 = var3.indexOf(var1, var4)) != -1) {
            var5++;
            if (var4 == var2) {
               var6 = var5;
            }

            var4 += var1.length();
         }

         this.b.setText("Match results: " + var6 + "/" + var5);
      }
   }

   public JTextArea a() {
      return this.a;
   }
}
