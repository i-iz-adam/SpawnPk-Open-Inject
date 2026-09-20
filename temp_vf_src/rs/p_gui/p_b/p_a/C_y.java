package rs.p_gui.p_b.p_a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import rs.p_gui.C_Launcher_mc;

public class C_y extends JFrame {
   static Color[] a = new Color[]{Color.WHITE, new Color(255, 50, 50), new Color(255, 150, 50), Color.CYAN, Color.GREEN, Color.YELLOW, Color.MAGENTA};
   static String[] b = new String[]{"Default", "Red", "Orange", "Blue", "Green", "Yellow", "Magenta"};
   private String c;
   private rs.p_gui.p_b.C_d d;
   private final JTextField e = new JTextField(14);
   private JButton f;
   private JComboBox<String> g;
   private JComboBox<String> h;

   public C_y(rs.p_gui.p_b.C_d var1, String var2, String var3) {
      super(var2);
      this.d = var1;
      this.c = var3;
   }

   public void a(ActionListener var1) {
      this.setSize(400, 100);
      this.setResizable(false);
      Dimension var2 = Toolkit.getDefaultToolkit().getScreenSize();
      this.setLocationRelativeTo(C_Launcher_mc.n().i().getContentPane());
      this.f = new JButton(this.c);
      this.g = new JComboBox<>(b);
      C_e var3 = new C_e(this.g);
      var3.a(a);
      var3.a(b);
      this.g.setRenderer(var3);
      String[] var4 = new String[rs.p_gui.p_b.C_e.values().length + 1];
      var4[0] = "None (Default)";

      for (int var5 = 0; var5 < rs.p_gui.p_b.C_e.values().length; var5++) {
         var4[var5 + 1] = rs.p_gui.p_b.C_e.values()[var5].D;
      }

      this.h = new JComboBox<>(var4);
      C_j var8 = new C_j(this.h);
      this.h.setRenderer(var8);
      JPanel var6 = new JPanel();
      var6.add(this.e);
      var6.add(this.f);
      JPanel var7 = new JPanel();
      var7.add(new JLabel("Color: "));
      var7.add(this.g);
      var7.add(new JSeparator(1));
      var7.add(new JLabel("Icon: "));
      var7.add(this.h);
      this.getContentPane().add(var6, "Center");
      var6.getRootPane().setDefaultButton(this.f);
      this.getContentPane().add(var7, "South");
      this.f.addActionListener(var1);
      this.f.addActionListener(new C_z(this));
      this.setVisible(true);
   }

   public void a(Color var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < a.length; var2++) {
            if (a[var2].getRGB() == var1.getRGB()) {
               this.g.setSelectedIndex(var2);
            }
         }
      }
   }

   public void a(rs.p_gui.p_b.C_e var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < rs.p_gui.p_b.C_e.values().length; var2++) {
            if (rs.p_gui.p_b.C_e.values()[var2].D.equalsIgnoreCase(var1.D)) {
               this.h.setSelectedIndex(var2 + 1);
            }
         }
      }
   }

   @Override
   public void setName(String var1) {
      if (var1 != null) {
         this.e.setText(var1);
      }
   }

   public Color a() {
      return a[this.g.getSelectedIndex()];
   }

   public rs.p_gui.p_b.C_e b() {
      for (rs.p_gui.p_b.C_e var4 : rs.p_gui.p_b.C_e.values()) {
         if (var4.D.equals(this.h.getSelectedItem())) {
            return var4;
         }
      }

      return null;
   }

   public String c() {
      return this.e.getText();
   }
}
