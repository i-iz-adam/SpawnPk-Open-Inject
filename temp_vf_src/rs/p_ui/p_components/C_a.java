package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class C_a implements C_w {
   private static final int a = 2;
   private static final float b = 0.2F;
   private static final float c = 0.8F;
   private static final float d = 1.2F;
   private static final float e = 1.4F;
   private Color f = C_d.c;
   private Rectangle g = new Rectangle();
   private boolean h = true;

   @Override
   public Dimension a(Graphics2D var1) {
      Color var2 = new Color(
         (int)((float)this.f.getRed() * 0.8F),
         (int)((float)this.f.getGreen() * 0.8F),
         (int)((float)this.f.getBlue() * 0.8F),
         Math.min(255, (int)((float)this.f.getAlpha() * 1.4F))
      );
      Color var3 = new Color(
         Math.min(255, (int)((float)this.f.getRed() * 1.2F)),
         Math.min(255, (int)((float)this.f.getGreen() * 1.2F)),
         Math.min(255, (int)((float)this.f.getBlue() * 1.2F)),
         Math.min(255, (int)((float)this.f.getAlpha() * 1.4F))
      );
      if (this.h) {
         var1.setColor(this.f);
         var1.fill(this.g);
      }

      Rectangle var4 = new Rectangle();
      var4.setLocation(this.g.x, this.g.y);
      var4.setSize(this.g.width - 1, this.g.height - 1);
      var1.setColor(var2);
      var1.draw(var4);
      Rectangle var5 = new Rectangle();
      var5.setLocation(this.g.x + 1, this.g.y + 1);
      var5.setSize(this.g.width - 2 - 1, this.g.height - 2 - 1);
      var1.setColor(var3);
      var1.draw(var5);
      return new Dimension(this.g.getSize());
   }

   public C_a() {
   }

   public C_a(Color var1, Rectangle var2, boolean var3) {
      this.f = var1;
      this.g = var2;
      this.h = var3;
   }

   public void a(Color var1) {
      this.f = var1;
   }

   public void a(Rectangle var1) {
      this.g = var1;
   }

   public void a(boolean var1) {
      this.h = var1;
   }
}
