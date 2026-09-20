package rs.p_gui.p_b.p_a;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import rs.p_gui.C_Launcher_mc;

public class C_A_uc extends JFrame {
   private final rs.p_gui.p_b.C_d a;
   private final int b;
   private JButton c;
   private JTextField d;

   public C_A_uc(rs.p_gui.p_b.C_d var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a() {
      this.setTitle("Set " + this.c() + " level");
      this.setSize(250, 70);
      this.setResizable(false);
      Dimension var1 = Toolkit.getDefaultToolkit().getScreenSize();
      this.c = new JButton("Apply");
      this.d = new JTextField(2);
      JPanel var2 = new JPanel();
      var2.add(this.d);
      var2.add(this.c);
      this.add(var2);
      this.d.addActionListener(var1x -> this.b());
      this.c.addActionListener(var1x -> this.b());
      this.setVisible(true);
   }

   private void b() {
      int var1 = 99;

      try {
         var1 = Integer.parseInt(this.d.getText());
      } catch (Exception var3) {
         var3.printStackTrace();
         return;
      }

      if (var1 < 1) {
         var1 = 1;
      }

      if (var1 > 99) {
         var1 = 99;
      }

      this.a.c().c()[this.b] = var1;
      this.a.a();
      C_Launcher_mc.n().d();
      this.dispose();
   }

   private String c() {
      switch (this.b) {
         case 0:
            return "Attack";
         case 1:
            return "Range";
         case 2:
            return "Strength";
         case 3:
            return "Prayer";
         case 4:
            return "Defence";
         case 5:
            return "Magic";
         case 6:
            return "Hitpoints";
         default:
            return "Null";
      }
   }
}
