package rs.p_l.p_f.p_a.p_k;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D.Double;
import rs.p_l.p_f.p_b.C_d;
import rs.p_n.p_c.C_c;

public class C_a extends C_d {
   private static final double h = 26.0;
   private static final int i = 0;

   @Override
   public void a() {
      if (C_c.bJ > 0) {
         float var1 = (float)C_c.bJ / (float)C_c.bK;
         if (this.a.gZ == null || this.a.gZ.e == null || this.a.gZ.e.getGraphics() == null) {
            return;
         }

         this.a((Graphics2D)this.a.gZ.e.getGraphics(), this.e, this.f, (double)var1, Color.GREEN);
      }
   }

   private void a(Graphics2D var1, int var2, int var3, double var4, Color var6) {
      if (!(var4 < 0.01)) {
         double var7 = 68.0;
         double var9 = 68.0;
         var1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var1.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         Rectangle var11 = new Rectangle((int)((double)var2 - var7 / 2.0), (int)((double)var3 - var9 / 2.0), 45, 45);
         Double var12 = new Double((double)(var11.x + 0), (double)var11.y + ((double)(var11.height / 2) - 13.0) - 1.0, var7, var9, 90.0, -360.0 * var4, 0);
         BasicStroke var13 = new BasicStroke(3.0F, 0, 0);
         var1.setStroke(var13);
         var1.setColor(var6);
         var1.draw(var12);
      }
   }
}
