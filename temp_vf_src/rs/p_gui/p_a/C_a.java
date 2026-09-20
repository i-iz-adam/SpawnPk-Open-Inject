package rs.p_gui.p_a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_k.C_b;
import rs.p_k.C_e;
import rs.p_k.p_a.C_c;

public class C_a extends JPanel {
   private JCheckBox a;
   private JCheckBox b;
   private JCheckBox c;
   private JComboBox d;
   private JComboBox e;
   private JComboBox f;
   private JCheckBox g;
   private JCheckBox h;
   private JComboBox i;

   public C_a() {
      this.a();
   }

   public void a() {
      if (!C_b.g()) {
         C_b.e();
      }

      this.setLayout(new BoxLayout(this, 1));
      this.add(Box.createRigidArea(new Dimension(0, 10)));
      if (rs.p_v.C_a.i()) {
         JPanel var1 = new JPanel();
         var1.setAlignmentX(0.0F);
         var1.setBackground(new Color(15, 15, 15));
         var1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
         var1.add(
            new JLabel(
               "<html><center><p style='font-size: 12px'><font style='bold' color='rgb(255,100,100)'><u>Error Warning, PLEASE READ!</p></u><p style='font-size: 9px'><font color='rgb(255,150,150)'>You are running 32-bit Java on a 64-bit machine!<br>This can cause performance issues, and even crashes.<br>Please <u>uninstall Java</u>, and then <u>install the 64-bit version</u></font></p></center></html>"
            )
         );
         this.add(var1);
         this.add(Box.createRigidArea(new Dimension(0, 5)));
      }

      this.d();
      this.e();
      this.f();
      this.b();
      this.add(Box.createVerticalGlue());
   }

   private void d() {
      JPanel var1 = new JPanel();
      var1.setAlignmentX(0.0F);
      var1.setBackground(new Color(15, 15, 15));
      var1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
      var1.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>GPU Settings</font></p></html>"));
      this.add(var1);
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      this.a = new JCheckBox("GPU Mode");
      this.add(this.a);
      JPanel var2 = new JPanel(new FlowLayout(0));
      var2.setAlignmentX(0.0F);
      var2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
      var2.add(new JLabel("Anti Aliasing:"));
      this.d = new JComboBox<>(rs.p_k.p_a.C_a.values());
      var2.add(this.d);
      this.add(var2);
      JPanel var3 = new JPanel(new FlowLayout(0));
      var3.setAlignmentX(0.0F);
      var3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
      var3.add(new JLabel("VSync Mode:"));
      this.e = new JComboBox<>(C_c.values());
      var3.add(this.e);
      this.add(var3);
      JPanel var4 = new JPanel(new FlowLayout(0));
      var4.setAlignmentX(0.0F);
      var4.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
      var4.add(new JLabel("Colorblind Mode:"));
      this.f = new JComboBox<>(rs.p_k.p_a.C_b.values());
      var4.add(this.f);
      this.add(var4);
      this.b = new JCheckBox("Anisotropic filtering");
      this.add(this.b);
      this.c = new JCheckBox("Smooth banding");
      this.add(this.c);
      this.add(Box.createRigidArea(new Dimension(0, 10)));
   }

   private void e() {
      JPanel var1 = new JPanel();
      var1.setAlignmentX(0.0F);
      var1.setBackground(new Color(15, 15, 15));
      var1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
      var1.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>Stretched Mode Settings</font></p></html>"));
      this.add(var1);
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      this.g = new JCheckBox("Stretched Mode");
      this.add(this.g);
      this.h = new JCheckBox("Maintain aspect ratio");
      this.add(this.h);
      JPanel var2 = new JPanel(new FlowLayout(0));
      var2.setAlignmentX(0.0F);
      var2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
      this.i = new JComboBox<>(new String[]{"Bilinear", "Bicubic (Mitchell)", "Bicubic (Catmull-Rom)", "xBR"});
      var2.add(new JLabel("UI Scaling:"));
      var2.add(this.i);
      this.add(var2);
      this.add(Box.createRigidArea(new Dimension(0, 10)));
   }

   private void f() {
      this.d.setSelectedItem(C_b.b);
      this.e.setSelectedItem(C_b.d);
      this.f.setSelectedItem(C_b.e);
      this.b.setSelected(C_b.c > 0);
      this.g.setSelected(C_b.i);
      this.h.setSelected(C_b.j);
      this.i.setSelectedIndex(C_b.k);
      this.c.setSelected(C_b.f);
      this.a.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.a();
            rs.p_f.C_a.Q = C_e.a();
            if (C_e.a() && C_b.i) {
               C_b.f();
            }

            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.d.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.b = (rs.p_k.p_a.C_a)this.d.getSelectedItem();
            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.e.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.d = (C_c)this.e.getSelectedItem();
            C_b.d();
            C_Launcher_mc.n().o().a.e();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.f.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.e = (rs.p_k.p_a.C_b)this.f.getSelectedItem();
            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.b.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.c = this.b.isSelected() ? 2 : 0;
            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.c.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.f = this.c.isSelected();
            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.g.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_Client_mc var1x = C_Launcher_mc.n().o();
            C_b.i = this.g.isSelected();
            if (!C_b.i) {
               C_Launcher_mc.n().o().at = "::stretchflagoff";
               var1x.a(rs.p_f.C_a.ai);
               var1x.gZ.a();
               rs.p_l.C_c.d();
            } else if (!C_Client_mc.ai()) {
               C_b.f();
               C_Launcher_mc.n().o().at = "::stretchflagon";
            }

            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.i.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.k = this.i.getSelectedIndex();
            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
      this.h.addActionListener(var1 -> rs.p_h.C_c.a(() -> {
            C_b.j = this.h.isSelected();
            C_Launcher_mc.n().o().a(rs.p_f.C_a.ai);
            C_b.d();
            SwingUtilities.invokeLater(() -> this.b());
         }));
   }

   public void b() {
      if (C_Launcher_mc.n().o() != null && C_Launcher_mc.n().o().cd && C_Launcher_mc.n().o().fc) {
         this.g();
         if (this.a.isSelected() != C_e.a()) {
            this.a.setSelected(C_e.a());
         }

         if (this.g.isSelected() != C_b.i) {
            this.g.setSelected(C_b.i);
         }

         if (this.a.isSelected()) {
            this.a(false, true);
         } else {
            this.a(false, false);
         }
      } else {
         this.c();
      }
   }

   public void c() {
      this.a(true, false);
   }

   private void g() {
      this.a(true, true);
   }

   private void a(boolean var1, boolean var2) {
      if (var1) {
         this.a.setEnabled(var2);
      }

      this.d.setEnabled(var2);
      this.e.setEnabled(var2);
      this.f.setEnabled(var2);
      this.b.setEnabled(var2);
      this.g.setEnabled(var2);
      this.h.setEnabled(var2);
      this.i.setEnabled(var2);
      this.c.setEnabled(var2);
   }
}
