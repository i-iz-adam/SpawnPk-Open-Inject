package rs.p_s.p_b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import rs.p_gui.C_M_uc;

public class C_o extends JPanel implements C_v {
   private static final ImageIcon a;
   private static final ImageIcon b;
   private static final ImageIcon c;
   private static final ImageIcon d;
   private final C_q e;
   private final C_n f;
   private final List<String> g = new ArrayList<>();
   private final JToggleButton h;
   private final C_u i;

   C_o(C_q var1, C_n var2) {
      this.e = var1;
      this.f = var2;
      Collections.addAll(this.g, var2.d().toLowerCase().split(" "));
      Collections.addAll(this.g, var2.e().toLowerCase().split(" "));
      Collections.addAll(this.g, var2.f());
      String var3 = var2.c();
      if (var3 != null) {
         this.g.add("pluginhub");
         this.g.add(var3);
      } else {
         this.g.add("plugin");
      }

      this.setLayout(new BorderLayout(3, 0));
      this.setPreferredSize(new Dimension(350, 20));
      JLabel var4 = new JLabel(var2.d());
      var4.setForeground(Color.WHITE);
      if (!var2.e().isEmpty()) {
         var4.setToolTipText("<html>" + var2.d() + ":<br>" + var2.e() + "</html>");
      }

      this.h = new JToggleButton(d);
      this.h.setSelectedIcon(c);
      C_M_uc.a(this.h);
      C_M_uc.a(this.h, "Unpin plugin", "Pin plugin");
      this.h.setPreferredSize(new Dimension(21, 0));
      this.add(this.h, "Before");
      this.h.addActionListener(var1x -> {
         var1.c();
         var1.b();
      });
      JPanel var5 = new JPanel();
      var5.setLayout(new GridLayout(1, 2));
      this.add(var5, "After");
      JMenuItem var6 = null;
      if (var2.a()) {
         JButton var7 = new JButton(a);
         var7.setRolloverIcon(b);
         C_M_uc.a(var7);
         var7.setPreferredSize(new Dimension(25, 0));
         var7.setVisible(false);
         var5.add(var7);
         var7.addActionListener(var2x -> {
            var7.setIcon(a);
            this.e();
         });
         var7.setVisible(true);
         var7.setToolTipText("Edit plugin configuration");
         var6 = new JMenuItem("Configure");
         var6.addActionListener(var1x -> this.e());
      }

      Object var9 = null;
      this.add(var4, "Center");
      this.i = new C_u();
      this.i.a(var2.i());
      var5.add(this.i);
      if (var2.j() != null) {
         this.i.addActionListener(var3x -> {
            if (this.i.isSelected()) {
               var1.c(var2.j());
            } else if (!var2.j().getClass().getAnnotation(rs.p_s.C_e.class).l()) {
               var1.d(var2.j());
            }
         });
      } else {
         this.i.setVisible(false);
      }

      if (var2.j().getClass().getAnnotation(rs.p_s.C_e.class).l()) {
         this.i.setVisible(false);
      }
   }

   @Override
   public String a() {
      return this.f.d();
   }

   @Override
   public boolean b() {
      return this.h.isSelected();
   }

   void a(boolean var1) {
      this.h.setSelected(var1);
   }

   void b(boolean var1) {
      this.i.setSelected(var1);
   }

   private void e() {
      this.e.a(this.f);
   }

   static void a(JLabel var0, JMenuItem... var1) {
      JPopupMenu var2 = new JPopupMenu();
      Color var3 = var0.getForeground();
      var2.setBorder(new EmptyBorder(5, 5, 5, 5));

      for (JMenuItem var7 : var1) {
         if (var7 != null) {
            var7.addActionListener(var2x -> var0.setForeground(var3));
            var2.add(var7);
         }
      }

      var0.addMouseListener(new C_p(var2, var0));
   }

   public C_n c() {
      return this.f;
   }

   @Override
   public List<String> d() {
      return this.g;
   }

   static {
      BufferedImage var0 = rs.p_A_uc.C_j.b(C_a.class, "config_edit_icon.png");
      BufferedImage var1 = rs.p_A_uc.C_j.b(C_a.class, "star_on.png");
      a = new ImageIcon(var0);
      c = new ImageIcon(var1);
      b = new ImageIcon(rs.p_A_uc.C_j.b(var0, -100));
      BufferedImage var2 = rs.p_A_uc.C_j.b(rs.p_A_uc.C_j.a(var1), 0.77F);
      d = new ImageIcon(var2);
   }
}
