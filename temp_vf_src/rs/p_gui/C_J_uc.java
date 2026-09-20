package rs.p_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class C_J_uc extends JPanel {
   private static final long b = 5486814990120132059L;
   public static boolean a = true;
   private JTabbedPane c;
   private rs.p_gui.p_c.C_a d;
   private rs.p_gui.p_a.C_a e;
   private C_G_uc f;
   private rs.p_gui.p_b.C_h g;
   private C_e h;
   private rs.p_s.p_c.C_d i;

   public C_J_uc() {
      this.addMouseListener(new C_K_uc(this));
      this.g = new rs.p_gui.p_b.C_h();
      this.f = new C_G_uc();
      this.c = new JTabbedPane();
      this.h = new C_e();
      this.d = new rs.p_gui.p_c.C_a();
      this.e = new rs.p_gui.p_a.C_a();
      if (rs.p_s.p_c.C_d.b()) {
         this.i = new rs.p_s.p_c.C_d();
      }

      this.setBackground(C_d.a);
      this.g.setBackground(C_d.c);
      this.f.setBackground(C_d.c);
      this.h.setBackground(C_d.c);
      this.c.setBackground(new Color(10, 10, 10));
      this.c.setForeground(C_d.f);
      C_L_uc var1 = new C_L_uc(this);
      this.c.addChangeListener(var1);
      this.c.setTabLayoutPolicy(1);
      this.c.setBorder(BorderFactory.createLineBorder(C_d.d));
      this.g.setPreferredSize(new Dimension(344, 480));
      this.c.addTab("Loadouts", null, this.g);
      this.d.setPreferredSize(new Dimension(344, 480));
      this.c.addTab("PvP Tracker", null, this.d);
      this.e.setPreferredSize(new Dimension(344, 480));
      this.c.addTab("GPU (Beta)", null, this.e);
      this.c.setBackgroundAt(this.c.getTabCount() - 1, Color.GREEN.darker());
      this.c.setForegroundAt(this.c.getTabCount() - 1, Color.GREEN);
      if (rs.p_s.p_c.C_d.b()) {
         this.i.setPreferredSize(new Dimension(344, 480));
         this.c.addTab("Development", this.i);
      } else {
         this.f.setPreferredSize(new Dimension(344, 480));
         this.c.addTab("Item Search", null, this.f);
      }

      this.c.setPreferredSize(new Dimension(354, 490));
      this.add(this.c, "Center");
   }

   public void a(int var1) {
      JPanel var2 = new JPanel();
      var2.setLayout(new BoxLayout(var2, 1));
      JLabel var3 = new JLabel("This is the panel for tab #" + var1);
      JLabel var4 = new JLabel("This was added as a placeholder.");
      JLabel var5 = new JLabel("By the way, I'm going to theme this whole side panel.");
      JLabel var6 = new JLabel("It'll look nice as fuck, nigga.");
      var2.add(var3);
      var2.add(var4);
      var2.add(var5);
      var2.add(var6);
      this.c.addTab("Tab #" + var1, var2);
   }

   public void a(Graphics var1) {
      this.g.a(var1);
   }

   public rs.p_gui.p_b.C_h a() {
      return this.g;
   }

   public rs.p_gui.p_c.C_a b() {
      return this.d;
   }

   public JTabbedPane c() {
      return this.c;
   }

   public rs.p_gui.p_a.C_a d() {
      return this.e;
   }

   public rs.p_s.p_c.C_d e() {
      return this.i;
   }
}
