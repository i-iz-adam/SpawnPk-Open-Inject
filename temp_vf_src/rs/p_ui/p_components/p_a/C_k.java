package rs.p_ui.p_components.p_a;

import com.google.a.m.l;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class C_k extends JPanel {
   private static final int a = 15;
   private static final int b = 4;
   private final int c;
   private int d;
   private Consumer<Integer> e;

   C_k(int var1) {
      this.c = var1;
      this.setPreferredSize(new Dimension(15, var1));
      this.addMouseMotionListener(new C_l(this));
      this.addMouseListener(new C_m(this));
   }

   public void a(Color var1) {
      this.d = this.b(var1);
      this.paintImmediately(0, 0, 15, this.c);
   }

   private void a(int var1) {
      var1 = l.a(var1, 0, this.c - 1);
      if (var1 != this.d) {
         this.d = var1;
         this.paintImmediately(0, 0, 15, this.c);
         if (this.e != null) {
            this.e.accept(var1);
         }
      }
   }

   private int b(Color var1) {
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      float var3 = var2[0];
      int var4 = this.c - 1;
      return Math.round((float)var4 - var3 * (float)var4);
   }

   @Override
   public void paint(Graphics var1) {
      for (int var2 = 0; var2 < this.c; var2++) {
         var1.setColor(this.b(var2));
         var1.fillRect(0, var2, 15, 1);
      }

      byte var3 = 2;
      var1.setColor(Color.WHITE);
      var1.fillRect(0, this.d - 1, 15, 4);
      var1.setColor(Color.BLACK);
      var1.drawLine(0, this.d - 2, 15, this.d - 2);
      var1.drawLine(0, this.d + 2, 15, this.d + 2);
   }

   private Color b(int var1) {
      return Color.getHSBColor(1.0F - (float)var1 / (float)(this.c - 1), 1.0F, 1.0F);
   }

   public int a() {
      return this.d;
   }

   public void a(Consumer<Integer> var1) {
      this.e = var1;
   }
}
