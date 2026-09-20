package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class C_b extends JButton {
   private static final int a = 120;
   private static final int b = 10;
   private Color c;

   public C_b(String var1, Color var2) {
      super(var1);
      this.setContentAreaFilled(false);
      this.a(var2);
   }

   public void a(Color var1) {
      this.c = var1;
      double var2 = (0.299 * (double)var1.getRed() + 0.587 * (double)var1.getGreen() + 0.114 * (double)var1.getBlue()) / 255.0;
      Color var4;
      if (!(var2 > 0.5) && var1.getAlpha() >= 120) {
         var4 = Color.WHITE;
      } else {
         var4 = Color.BLACK;
      }

      this.setForeground(var4);
   }

   @Override
   public void paint(Graphics var1) {
      if (this.c.getAlpha() != 255) {
         for (byte var2 = 0; var2 < this.getWidth(); var2 += 10) {
            for (byte var3 = 0; var3 < this.getHeight(); var3 += 10) {
               int var4 = (var2 / 10 + var3 / 10) % 2;
               var1.setColor(var4 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
               var1.fillRect(var2, var3, 10, 10);
            }
         }
      }

      var1.setColor(this.c);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      super.paint(var1);
   }

   public Color a() {
      return this.c;
   }
}
