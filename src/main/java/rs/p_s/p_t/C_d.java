package rs.p_s.p_t;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.annotation.Nullable;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import rs.p_A_uc.C_p;
import rs.p_gui.C_w;
import rs.p_ui.p_components.C_y;

public class C_d extends JPanel {
   private static final int a = 45;
   private static final String b = "FACE_CARD";
   private static final String c = "DETAILS_CARD";
   private static final ImageIcon d;
   private static final ImageIcon e;
   private final C_i f;
   private final JPanel g = new JPanel();
   private final CardLayout h = new CardLayout();
   private final JLabel i = new JLabel();
   private final JLabel j = new JLabel();
   private final JLabel k = new JLabel();
   private final JLabel l = new JLabel();
   private final JLabel m = new JLabel();
   private final C_y n = new C_y();
   private boolean o = true;
   private int p;

   C_d(C_i var1) {
      this.f = var1;
      this.setLayout(new BorderLayout());
      this.setBackground(rs.p_gui.C_d.d);
      this.setBorder(new EmptyBorder(7, 0, 0, 0));
      C_e var2 = new C_e(this);
      this.g.setLayout(this.h);
      this.g.setBackground(rs.p_gui.C_d.c);
      JPanel var3 = new JPanel();
      var3.setBackground(rs.p_gui.C_d.c);
      var3.setLayout(new BorderLayout());
      var3.addMouseListener(var2);
      this.i.setVerticalAlignment(0);
      this.i.setHorizontalAlignment(0);
      this.i.setPreferredSize(new Dimension(45, 45));
      this.j.setForeground(Color.WHITE);
      this.j.setVerticalAlignment(3);
      this.j.setFont(C_w.b());
      this.k.setForeground(rs.p_gui.C_d.f);
      this.k.setVerticalAlignment(1);
      this.k.setFont(C_w.b());
      JLabel var4 = new JLabel();
      var4.setIcon(d);
      var4.setVerticalAlignment(0);
      var4.setHorizontalAlignment(0);
      var4.setPreferredSize(new Dimension(30, 45));
      JPanel var5 = new JPanel();
      var5.setBackground(rs.p_gui.C_d.c);
      var5.setLayout(new GridLayout(2, 1, 0, 2));
      var5.add(this.j);
      var5.add(this.k);
      var3.add(var5, "Center");
      var3.add(this.i, "West");
      var3.add(var4, "East");
      JPanel var6 = new JPanel();
      var6.setBackground(rs.p_gui.C_d.c);
      var6.setLayout(new BorderLayout());
      var6.setBorder(new EmptyBorder(0, 15, 0, 0));
      var6.addMouseListener(var2);
      this.l.setForeground(Color.WHITE);
      this.l.setVerticalAlignment(3);
      this.l.setFont(C_w.b());
      this.m.setForeground(Color.WHITE);
      this.m.setVerticalAlignment(1);
      this.m.setFont(C_w.b());
      JLabel var7 = new JLabel();
      var7.setIcon(e);
      var7.setVerticalAlignment(0);
      var7.setHorizontalAlignment(0);
      var7.setPreferredSize(new Dimension(30, 45));
      JPanel var8 = new JPanel();
      var8.setBackground(rs.p_gui.C_d.c);
      var8.setLayout(new BoxLayout(var8, 3));
      var8.setPreferredSize(new Dimension(0, 45));
      JPanel var9 = new JPanel();
      var9.setBackground(rs.p_gui.C_d.c);
      var9.setLayout(new BoxLayout(var9, 3));
      var9.add(this.l);
      var9.add(this.m);
      var8.add(Box.createVerticalGlue());
      var8.add(var9);
      var8.add(Box.createVerticalGlue());
      var6.add(var8, "Center");
      var6.add(var7, "East");
      this.g.add(var3, "FACE_CARD");
      this.g.add(var6, "DETAILS_CARD");
      this.h.show(this.g, "FACE_CARD");
      this.add(this.g, "Center");
      this.add(this.n, "South");
   }

   void a(@Nullable C_c var1) {
      if (var1 != null) {
         this.h.show(this.g, "FACE_CARD");
         this.j.setText(var1.a());
         Image var2 = this.f.a(var1.f());
         if (var2 == null) {
            rs.p_h.C_c.a("TPOS" + System.nanoTime(), new C_f(this, var1));
         } else {
            this.i.setIcon(new ImageIcon(var2));
         }

         String var3 = "Sold: " + C_p.a(var1.g()) + " / " + C_p.a(var1.h());
         this.k.setText(var3);
         this.l.setIcon(new ImageIcon(var1.j().c()));
         this.l.setText(this.a("Price each: ", C_p.b((long)var1.i())));
         String var4 = "Received: ";
         String var5 = C_p.b((long)var1.b()) + " / " + C_p.b((long)var1.i() * (long)var1.h());
         if (var1.j().b() > 1) {
            var5 = var5
               + " <font color='"
               + rs.p_A_uc.C_g.b(rs.p_gui.C_d.i)
               + "''>("
               + C_p.a((long)var1.g() * (long)var1.i() * (long)var1.j().b())
               + ")</font>";
         }

         this.m.setIcon(C_m.a);
         this.m.setText(this.a(var4, var5));
         this.n.setForeground(this.b(var1));
         this.n.a(var1.h());
         this.n.b(var1.g());
         JPopupMenu var6 = new JPopupMenu();
         var6.setBorder(new EmptyBorder(5, 5, 5, 5));

         for (Component var10 : this.g.getComponents()) {
            if (var10 instanceof JPanel) {
               JPanel var11 = (JPanel)var10;
               var11.setToolTipText(this.a((int)this.n.a() + "%"));
               var11.setComponentPopupMenu(var6);
            }
         }

         this.p = var1.f();
         this.revalidate();
      }
   }

   private String a(String var1) {
      return "<html><body style = 'color:" + rs.p_A_uc.C_g.b(rs.p_gui.C_d.f) + "'>Progress: <span style = 'color:white'>" + var1 + "</span></body></html>";
   }

   private String a(String var1, String var2) {
      return "<html><body style = 'color:white'>" + var1 + "<span style = 'color:" + rs.p_A_uc.C_g.b(rs.p_gui.C_d.f) + "'>" + var2 + "</span></body></html>";
   }

   private void b() {
      this.o = !this.o;
      this.h.show(this.g, this.o ? "FACE_CARD" : "DETAILS_CARD");
   }

   private Color b(C_c var1) {
      return var1.g() >= var1.h() ? rs.p_gui.C_d.i : rs.p_gui.C_d.k;
   }

   public int a() {
      return this.p;
   }

   static {
      BufferedImage var0 = rs.p_A_uc.C_j.a(rs.p_A_uc.C_j.b(C_d.class, "/util/arrow_right.png"), 0.25F);
      d = new ImageIcon(var0);
      e = new ImageIcon(rs.p_A_uc.C_j.a(var0, true, false));
   }
}
