package rs.p_ui.p_components.p_a;

import com.google.a.m.l;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class C_a extends JPanel {
   private static final int a = 7;
   private final int b;
   private final BufferedImage c;
   private Point d;
   private int e;
   private boolean f;
   private Consumer<Color> g;

   C_a(int var1) {
      this.b = var1;
      this.c = new BufferedImage(var1, var1, 1);
      this.d = new Point(var1, 0);
      this.setPreferredSize(new Dimension(var1, var1));
      this.addMouseMotionListener(new C_b(this));
      this.addMouseListener(new C_c(this));
   }

   void a(int var1) {
      if (this.e != var1) {
         this.e = var1;
         this.a();
         if (this.g != null) {
            this.g.accept(this.a(this.d.x, this.d.y));
         }

         this.paintImmediately(0, 0, this.b, this.b);
      }
   }

   void a(int var1, Color var2) {
      Point var3 = this.a(var2);
      if (this.e != var1 || var3.x != this.d.x || var3.y != this.d.y) {
         this.e = var1;
         this.a();
         this.a(var3.x, var3.y, false);
      }
   }

   private Point a(Color var1) {
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      int var3 = this.b - 1;
      return new Point((int)(var2[1] * (float)var3), var3 - (int)(var2[2] * (float)var3));
   }

   private void a(int var1, int var2, boolean var3) {
      if (this.d.x != var1 || this.d.y != var2 || this.f) {
         var1 = l.a(var1, 0, this.b - 1);
         var2 = l.a(var2, 0, this.b - 1);
         this.d = new Point(var1, var2);
         this.paintImmediately(0, 0, this.b, this.b);
         if (this.g != null && var3) {
            this.g.accept(this.a(var1, var2));
         }

         this.f = false;
      }
   }

   @Override
   public void paint(Graphics var1) {
      var1.drawImage(this.c, 0, 0, null);
      int var2 = this.d.x - 3;
      int var3 = this.d.y - 3;
      var1.setColor(Color.WHITE);
      var1.fillOval(var2, var3, 7, 7);
      var1.setColor(Color.BLACK);
      var1.drawOval(var2, var3, 7, 7);
   }

   private void a() {
      Color var1 = Color.getHSBColor(1.0F - (float)this.e / (float)(this.b - 1), 1.0F, 1.0F);
      Graphics2D var2 = this.c.createGraphics();
      GradientPaint var3 = new GradientPaint(0.0F, 0.0F, Color.WHITE, (float)(this.b - 1), 0.0F, var1);
      GradientPaint var4 = new GradientPaint(0.0F, 0.0F, new Color(0, 0, 0, 0), 0.0F, (float)(this.b - 1), Color.BLACK);
      var2.setPaint(var3);
      var2.fillRect(0, 0, this.b, this.b);
      var2.setPaint(var4);
      var2.fillRect(0, 0, this.b, this.b);
      var2.dispose();
      this.f = true;
   }

   private Color a(int var1, int var2) {
      var1 = l.a(var1, 0, this.b - 1);
      var2 = l.a(var2, 0, this.b - 1);
      return new Color(this.c.getRGB(var1, var2));
   }

   public void a(Consumer<Color> var1) {
      this.g = var1;
   }
}
