package rs.p_s.p_t;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import rs.p_A_uc.C_p;
import rs.p_gui.C_w;

public class C_m extends JPanel {
   private static final Dimension c = new Dimension(32, 32);
   public static Icon a = new ImageIcon(rs.p_A_uc.C_j.b(C_m.class, "ge_icon.png"));
   public static Icon b = new ImageIcon(rs.p_A_uc.C_j.b(C_m.class, "time.png"));

   C_m(C_i var1, Image var2, String var3, int var4, int var5, int var6, String var7, C_b var8, String var9, String var10) {
      BorderLayout var11 = new BorderLayout();
      var11.setHgap(5);
      this.setLayout(var11);
      this.setToolTipText(var3);
      this.setBackground(rs.p_gui.C_d.c);
      Color var12 = this.getBackground();
      ArrayList var13 = new ArrayList();
      var13.add(this);
      C_n var14 = new C_n(this, var13, var12);
      this.addMouseListener(var14);
      this.setBorder(new EmptyBorder(5, 5, 5, 0));
      JLabel var15 = new JLabel();
      var15.setPreferredSize(c);
      if (var2 != null) {
         var15.setIcon(new ImageIcon(var2));
      }

      this.add(var15, "Before");
      JPanel var16 = new JPanel(new GridLayout(3, 1));
      var13.add(var16);
      var16.setBackground(var12);
      JLabel var17 = new JLabel();
      var17.setForeground(Color.WHITE);
      var17.setMaximumSize(new Dimension(0, 0));
      var17.setPreferredSize(new Dimension(0, 0));
      if (var6 > 1) {
         var17.setText(this.a(var3, " <font color='yellow'>(x" + C_p.b((long)var6) + ")</font>"));
      } else {
         var17.setText(var3);
      }

      var16.add(var17);
      JLabel var18 = new JLabel();
      var18.setIcon(new ImageIcon(var8.c()));
      if (var8.b() > 1) {
         var18.setText(
            this.a("<font color='#6EE16E'>" + C_p.b((long)var5) + "</font>", " <font color='#2FFF9F'>(" + C_p.a((long)var5 * (long)var8.b()) + ")</font>")
         );
      } else {
         var18.setText(C_p.b((long)var5));
      }

      var18.setForeground(rs.p_gui.C_d.l);
      var16.add(var18);
      JPanel var19 = new JPanel(new BorderLayout());
      var13.add(var19);
      var19.setBackground(var12);
      JLabel var20 = new JLabel();
      var20.setText(this.a(var7));
      var20.setFont(C_w.b());
      var20.setForeground(rs.p_gui.C_d.m);
      var19.add(var20, "West");
      JLabel var21 = new JLabel();
      String var22 = var9 + " &#8594; " + var10;
      var21.setIcon(a);
      var21.setFont(C_w.b());
      var21.setText(this.a(var22, ""));
      var21.setForeground(rs.p_gui.C_d.n);
      var21.setBorder(new CompoundBorder(var21.getBorder(), new EmptyBorder(0, 0, 0, 7)));
      var19.add(var21, "East");
      var16.add(var19);
      this.add(var16, "Center");
   }

   private void a(JPanel var1, Color var2) {
      var1.setBackground(var2);

      for (Component var6 : var1.getComponents()) {
         var6.setBackground(var2);
      }
   }

   private String a(String var1) {
      DateTimeFormatter var2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS").withZone(ZoneId.of("UTC"));
      ZonedDateTime var3 = ZonedDateTime.parse(var1, var2);
      ZonedDateTime var4 = ZonedDateTime.now(ZoneId.of("UTC"));
      if (var3.isAfter(var4)) {
         return "Very recent";
      } else {
         Duration var5 = Duration.between(var3, var4);
         long var6 = var5.toDays() / 365L;
         long var8 = var5.toDays() % 365L / 30L;
         long var10 = var5.toDays() % 365L % 30L;
         long var12 = var5.toHours() % 24L;
         long var14 = var5.toMinutes() % 60L;
         long var16 = var5.getSeconds() % 60L;
         if (var6 > 0L) {
            return var6 + " years ago";
         } else if (var8 > 0L) {
            return var8 + " months ago";
         } else if (var10 > 0L) {
            return var10 + " days ago";
         } else if (var12 > 0L) {
            return var12 + " hours ago";
         } else {
            return var14 > 0L ? var14 + " minutes ago" : var16 + " seconds ago";
         }
      }
   }

   private String a(String var1, String var2) {
      return "<html><body style = 'color:white'>" + var1 + "<span style = 'color:" + rs.p_A_uc.C_g.b(rs.p_gui.C_d.f) + "'>" + var2 + "</span></body></html>";
   }
}
