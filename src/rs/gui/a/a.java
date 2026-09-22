package rs.gui.a;

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
import rs.Client;
import rs.ClientThread;
import rs.Configuration;
import rs.class_210;
import rs.class_650;
import rs.gui.Launcher;
import rs.lpkg.b;
import rs.lpkg.e;
import rs.lpkg.apkg.c;

public class a extends JPanel {
   private JCheckBox a;
   private JCheckBox b;
   private JCheckBox c;
   private JComboBox d;
   private JComboBox e;
   private JComboBox f;
   private JCheckBox g;
   private JCheckBox h;
   private JComboBox i;

   public a() {
      this.a();
   }

   public void a() {
      if (!rs.l.b.g()) {
         rs.l.b.e();
      }

      this.setLayout(new BoxLayout(this, 1));
      this.add(Box.createRigidArea(new Dimension(0, 10)));
      if (class_650.i()) {
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
      this.d = new JComboBox<>(rs.l.a.a.values());
      var2.add(this.d);
      this.add(var2);
      JPanel var3 = new JPanel(new FlowLayout(0));
      var3.setAlignmentX(0.0F);
      var3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
      var3.add(new JLabel("VSync Mode:"));
      this.e = new JComboBox<>(rs.l.a.c.values());
      var3.add(this.e);
      this.add(var3);
      JPanel var4 = new JPanel(new FlowLayout(0));
      var4.setAlignmentX(0.0F);
      var4.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
      var4.add(new JLabel("Colorblind Mode:"));
      this.f = new JComboBox<>(rs.l.a.b.values());
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
      this.d.setSelectedItem(rs.l.b.b);
      this.e.setSelectedItem(rs.l.b.d);
      this.f.setSelectedItem(rs.l.b.e);
      this.b.setSelected(rs.l.b.c > 0);
      this.g.setSelected(rs.l.b.i);
      this.h.setSelected(rs.l.b.j);
      this.i.setSelectedIndex(rs.l.b.k);
      this.c.setSelected(rs.l.b.f);
      this.a.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.a();
         Configuration.Q = rs.l.e.a();
         if (rs.l.e.a() && rs.l.b.i) {
            rs.l.b.f();
         }

         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.d.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.b = (rs.l.a.a)this.d.getSelectedItem();
         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.e.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.d = (c)this.e.getSelectedItem();
         rs.l.b.d();
         Launcher.n().o().a.e();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.f.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.e = (rs.l.a.b)this.f.getSelectedItem();
         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.b.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.c = this.b.isSelected() ? 2 : 0;
         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.c.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.f = this.c.isSelected();
         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.g.addActionListener(var1 -> ClientThread.queue(() -> {
         Client var1x = Launcher.n().o();
         rs.l.b.i = this.g.isSelected();
         if (!rs.l.b.i) {
            Launcher.n().o().at = "::stretchflagoff";
            var1x.a(Configuration.ai);
            var1x.gZ.a();
            class_210.d();
         } else if (!Client.ag()) {
            rs.l.b.f();
            Launcher.n().o().at = "::stretchflagon";
         }

         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.i.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.k = this.i.getSelectedIndex();
         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
      this.h.addActionListener(var1 -> ClientThread.queue(() -> {
         rs.l.b.j = this.h.isSelected();
         Launcher.n().o().a(Configuration.ai);
         rs.l.b.d();
         SwingUtilities.invokeLater(() -> this.b());
      }));
   }

   public void b() {
      if (Launcher.n().o() != null && Launcher.n().o().cd && Launcher.n().o().fc) {
         this.g();
         if (this.a.isSelected() != rs.l.e.a()) {
            this.a.setSelected(rs.l.e.a());
         }

         if (this.g.isSelected() != rs.l.b.i) {
            this.g.setSelected(rs.l.b.i);
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
