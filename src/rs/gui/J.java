package rs.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import rs.gui.b.h;
import rs.gui.c.a;

public class J extends JPanel {
   private static final long b = 5486814990120132059L;
   public static boolean a = true;
   private JTabbedPane c;
   private a d;
   private rs.gui.a.a e;
   private G f;
   private h g;
   private e h;
    private rs.plugins.cpkg.d i;

   public J() {
      this.addMouseListener(new K(this));
      this.g = new h();
      this.f = new G();
      this.c = new JTabbedPane();
      this.h = new e();
      this.d = new a();
      this.e = new rs.gui.a.a();
      if (rs.s.c.d.b()) {
         this.i = new rs.s.c.d();
      }

      this.setBackground(rs.gui.d.a);
      this.g.setBackground(rs.gui.d.c);
      this.f.setBackground(rs.gui.d.c);
      this.h.setBackground(rs.gui.d.c);
      this.c.setBackground(new Color(10, 10, 10));
      this.c.setForeground(rs.gui.d.f);
      L var1 = new L(this);
      this.c.addChangeListener(var1);
      this.c.setTabLayoutPolicy(1);
      this.c.setBorder(BorderFactory.createLineBorder(rs.gui.d.d));
      this.g.setPreferredSize(new Dimension(344, 480));
      this.c.addTab("Loadouts", null, this.g);
      this.d.setPreferredSize(new Dimension(344, 480));
      this.c.addTab("PvP Tracker", null, this.d);
      this.e.setPreferredSize(new Dimension(344, 480));
      this.c.addTab("GPU (Beta)", null, this.e);
      this.c.setBackgroundAt(this.c.getTabCount() - 1, Color.GREEN.darker());
      this.c.setForegroundAt(this.c.getTabCount() - 1, Color.GREEN);
      if (rs.s.c.d.b()) {
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

   public h a() {
      return this.g;
   }

   public a b() {
      return this.d;
   }

   public JTabbedPane c() {
      return this.c;
   }

   public rs.gui.a.a d() {
      return this.e;
   }

    public rs.plugins.cpkg.d e() {
      return this.i;
   }
}
