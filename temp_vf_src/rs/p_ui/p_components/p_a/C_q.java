package rs.p_ui.p_components.p_a;

import com.google.a.b.as;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Dialog.ModalityType;
import java.util.function.Consumer;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter.FilterBypass;

public class C_q extends JDialog {
   static final String a = "colorpicker";
   private static final int b = 410;
   private static final int c = 380;
   private static final int d = 160;
   private static final String e = "#000";
   private final C_a f = new C_a(160);
   private final C_k g = new C_k(160);
   private final C_n h = new C_n();
   private final C_e i = new C_e("Red");
   private final C_e j = new C_e("Green");
   private final C_e k = new C_e("Blue");
   private final C_e l = new C_e("Opacity");
   private final JTextField m = new JTextField();
   private final boolean n;
   private Color o;
   private Consumer<Color> p;
   private Consumer<Color> q;

   C_q(Window var1, Color var2, String var3, boolean var4, rs.p_e.C_i var5, C_d var6) {
      super(var1, "Color Picker - " + var3, ModalityType.MODELESS);
      this.o = var2;
      this.n = var4;
      C_o var7 = new C_o(var5);
      this.setDefaultCloseOperation(2);
      this.setResizable(false);
      this.setSize(410, 380);
      this.setBackground(rs.p_gui.C_d.i);
      this.setDefaultCloseOperation(2);
      JPanel var8 = new JPanel(new BorderLayout());
      var8.putClientProperty("substancelaf.internal.colorizationFactor", Double.valueOf(1.0));
      var8.setBorder(new EmptyBorder(15, 15, 15, 15));
      JPanel var9 = new JPanel(new BorderLayout(15, 0));
      JPanel var10 = new JPanel(new BorderLayout(15, 0));
      var10.add(this.g, "West");
      var10.add(this.f, "Center");
      JPanel var11 = new JPanel();
      var11.setLayout(new GridBagLayout());
      GridBagConstraints var12 = new GridBagConstraints();
      var12.insets = new Insets(0, 0, 0, 0);
      JLabel var13 = new JLabel("Previous");
      var13.setHorizontalAlignment(0);
      JLabel var14 = new JLabel(" Current ");
      var14.setHorizontalAlignment(0);
      C_n var15 = new C_n();
      var15.a(var2);
      this.h.a(var2);
      JPanel var16 = new JPanel(new GridBagLayout());
      JLabel var17 = new JLabel("#");
      this.m.setBackground(rs.p_gui.C_d.c);
      JLabel var18 = new JLabel("Hex color");
      var18.setVerticalAlignment(3);
      var12.weightx = 0.0;
      var12.fill = 1;
      var12.insets = new Insets(0, 1, 0, 1);
      var16.add(var17, var12);
      var12.weightx = 1.0;
      var12.fill = 2;
      var12.gridwidth = 0;
      var16.add(this.m, var12);
      var12.fill = 1;
      var12.weightx = 1.0;
      var12.weighty = 1.0;
      var12.gridy = 0;
      var12.gridx = 0;
      JPanel var19 = var7.a(var2x -> {
         if (!var4) {
            this.l.a(var2x.getAlpha());
         }

         this.a(var2x);
         this.b();
      }, var4);
      var11.add(var19, var12);
      var12.gridwidth = -1;
      var12.gridy++;
      var11.add(var13, var12);
      var12.gridx++;
      var11.add(var14, var12);
      var12.gridx = 0;
      var12.gridy++;
      var12.gridwidth = -1;
      var12.fill = 1;
      var11.add(var15, var12);
      var12.gridx++;
      var11.add(this.h, var12);
      var12.gridwidth = 0;
      var12.gridx = 0;
      var12.gridy++;
      var11.add(var18, var12);
      var12.gridy++;
      var12.fill = 2;
      var11.add(var16, var12);
      JPanel var20 = new JPanel(new GridLayout(4, 1, 0, 10));
      var20.setBorder(new EmptyBorder(15, 0, 0, 0));
      var20.add(this.i);
      var20.add(this.j);
      var20.add(this.k);
      var20.add(this.l);
      if (var4) {
         this.l.setVisible(false);
         this.setSize(410, 340);
      }

      var9.add(var10, "West");
      var9.add(var11, "Center");
      var9.add(var20, "South");
      var8.add(var9, "North");
      this.setContentPane(var8);
      var15.addMouseListener(new C_r(this, var4, var15));
      this.g.a(var1x -> {
         this.f.a(var1x);
         this.c();
      });
      this.f.a(this::a);
      ((AbstractDocument)this.m.getDocument()).setDocumentFilter(new C_s(this));
      this.m.addFocusListener(new C_t(this));
      this.m.addActionListener(var1x -> this.d());
      this.i.a(var1x -> {
         this.a(new Color(var1x, this.o.getGreen(), this.o.getBlue()));
         this.b();
      });
      this.j.a(var1x -> {
         this.a(new Color(this.o.getRed(), var1x, this.o.getBlue()));
         this.b();
      });
      this.k.a(var1x -> {
         this.a(new Color(this.o.getRed(), this.o.getGreen(), var1x));
         this.b();
      });
      this.l.a(var1x -> this.a(new Color(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), var1x)));
      this.b();
      this.c();
      this.addWindowListener(new C_u(this, var2, var7, var6));
   }

   private void b() {
      this.g.a(this.o);
      this.f.a(this.g.a(), this.o);
   }

   private void c() {
      String var1 = this.n ? rs.p_A_uc.C_g.c(this.a()) : rs.p_A_uc.C_g.d(this.a());
      this.m.setText(var1.toUpperCase());
      this.h.a(this.o);
      this.i.a(this.o.getRed());
      this.j.a(this.o.getGreen());
      this.k.a(this.o.getBlue());
      if (!this.n) {
         this.l.a(this.o.getAlpha());
      }
   }

   private void a(Color var1) {
      if (var1 != this.o) {
         this.o = var1;
         if (this.o.getAlpha() != this.l.a()) {
            this.o = new Color(this.o.getRed(), this.o.getGreen(), this.o.getBlue(), this.l.a());
         }

         this.c();
         if (this.p != null) {
            this.p.accept(this.o);
         }
      }
   }

   private void d() {
      String var1 = this.m.getText();
      if (as.c(var1)) {
         var1 = "#000";
      }

      Color var2 = rs.p_A_uc.C_g.d(var1);
      if (var2 != null) {
         if (!this.n && rs.p_A_uc.C_g.a(var1)) {
            this.l.a(var2.getAlpha());
         }

         this.a(var2);
         this.b();
      }
   }

   @Override
   public void setLocationRelativeTo(Component var1) {
      if (this.getOwner() == null) {
         super.setLocationRelativeTo(var1);
      } else {
         GraphicsConfiguration var2 = this.getOwner().getGraphicsConfiguration();
         Insets var3 = Toolkit.getDefaultToolkit().getScreenInsets(var2);
         Rectangle var4 = var2.getBounds();
         var4.setRect(
            (double)(var4.x + var3.left),
            (double)(var4.y + var3.top),
            (double)(var4.width - var3.left - var3.right),
            (double)(var4.height - var3.top - var3.bottom)
         );
         Dimension var5 = var1.getSize();
         Point var6 = var1.getLocationOnScreen();
         Dimension var7 = this.getSize();
         int var8 = var6.x + (var5.width - var7.width) / 2;
         int var9 = var6.y + (var5.height - var7.height) / 2;
         if (var9 + var7.height > var4.y + var4.height) {
            var9 = var4.y + var4.height - var7.height;
         }

         if (var9 < var4.y) {
            var9 = var4.y;
         }

         if (var8 + var7.width > var4.x + var4.width) {
            var8 = var4.x + var4.width - var7.width;
         }

         if (var8 < var4.x) {
            var8 = var4.x;
         }

         this.setLocation(var8, var9);
      }
   }

   static String a(FilterBypass var0, int var1, int var2, String var3) {
      Document var4 = var0.getDocument();
      StringBuilder var5 = new StringBuilder(var4.getText(0, var4.getLength()));
      var5.replace(var1, var1 + var2, var3);
      return var5.toString();
   }

   public Color a() {
      return this.o;
   }

   public void a(Consumer<Color> var1) {
      this.p = var1;
   }

   public void b(Consumer<Color> var1) {
      this.q = var1;
   }
}
