package rs.p_ui.p_components.p_a;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class C_n extends JPanel {
   private static final int a = 10;
   private Color b;

   void a(Color var1) {
      this.b = var1;
      this.paintImmediately(0, 0, this.getWidth(), this.getHeight());
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      if (this.b.getAlpha() != 255) {
         for (byte var2 = 0; var2 < this.getWidth(); var2 += 10) {
            for (byte var3 = 0; var3 < this.getHeight(); var3 += 10) {
               int var4 = (var2 / 10 + var3 / 10) % 2;
               var1.setColor(var4 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
               var1.fillRect(var2, var3, 10, 10);
            }
         }
      }

      var1.setColor(this.b);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight());
   }

   public Color a() {
      return this.b;
   }
}
