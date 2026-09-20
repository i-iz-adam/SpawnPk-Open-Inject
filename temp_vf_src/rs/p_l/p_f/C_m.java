package rs.p_l.p_f;

import com.google.a.b.as;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import rs.p_gui.C_w;

public class C_m {
   private static final int b = 4;
   private static final Stroke c = new BasicStroke(2.0F);
   private static final Stroke d = new BasicStroke(1.0F);
   public static final Color a = new Color(0, 0, 0, 50);

   public static void a(Graphics2D var0, Shape var1, Color var2) {
      a(var0, var1, var2, a());
   }

   public static void a(Graphics2D var0, Shape var1, Color var2, Stroke var3) {
      a(var0, var1, var2, a, var3);
   }

   public static void a(Graphics2D var0, Shape var1, Color var2, Color var3, Stroke var4) {
      var0.setColor(var2);
      Stroke var5 = var0.getStroke();
      var0.setStroke(var4);
      var0.draw(var1);
      var0.setColor(var3);
      var0.fill(var1);
      var0.setStroke(var5);
   }

   public static void b(Graphics2D var0, Shape var1, Color var2, Color var3, Stroke var4) {
      var0.setColor(var2);
      Stroke var5 = var0.getStroke();
      var0.setStroke(var4);
      var0.draw(var1);
      var0.setColor(rs.p_A_uc.C_g.a(var3, var3.getAlpha() / 5));
      var0.fill(var1);
      var0.setStroke(var5);
   }

   public static void a(Graphics2D var0, rs.p_runelite.p_a.C_i var1, String var2, Color var3) {
      if (!as.c(var2)) {
         int var4 = var1.a();
         int var5 = var1.b();
         var0.setFont(C_w.b());
         var0.setColor(Color.BLACK);
         var0.drawString(var2, var4 + 1, var5 + 1);
         var0.setColor(rs.p_A_uc.C_g.a(var3, 255));
         var0.drawString(var2, var4, var5);
      }
   }

   public static Stroke a() {
      return rs.p_k.C_e.a() ? d : c;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void a(C_l var0, Rectangle var1, Rectangle var2, int var3) {
      int var4 = var1.x;
      int var5 = var1.y;
      switch (C_n.a[var0.ordinal()]) {
         case 1:
            var4 = Math.max(var4, var2.x + var2.width + var3);
            break;
         case 2:
            var4 = Math.min(var4, var2.x - var3);
            break;
         case 3:
         case 4:
         case 5:
         case 6:
            var5 = Math.max(var5, var2.y + var2.height + var3);
            break;
         case 7:
            var5 = Math.min(var5, var2.y - var3);
            break;
         default:
            throw new IllegalArgumentException();
      }

      var1.x = var4;
      var1.y = var5;
   }

   public static Point a(C_l var0, Dimension var1) {
      Point var2 = new Point();
      switch (var0) {
         case f:
            var2.y = -var1.height;
            break;
         case g:
         case h:
            var2.y = -var1.height;
         case i:
         case e:
            var2.x = -var1.width;
         case c:
            break;
         case d:
            var2.x = -var1.width / 2;
            break;
         default:
            throw new IllegalArgumentException();
      }

      return var2;
   }
}
