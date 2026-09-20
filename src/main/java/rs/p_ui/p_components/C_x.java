package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class C_x implements C_w {
   private static final Pattern a = Pattern.compile("<col=([0-9a-fA-F]{2,6})>");
   private String b;
   private Point c = new Point();
   private Color d = Color.WHITE;
   private boolean e;
   @Nullable
   private Font f;

   @Override
   public Dimension a(Graphics2D var1) {
      Font var2 = null;
      if (this.f != null) {
         var2 = var1.getFont();
         var1.setFont(this.f);
      }

      FontMetrics var3 = var1.getFontMetrics();
      Matcher var4 = a.matcher(this.b);
      Color var5 = this.d;
      int var6 = 0;
      int var7 = 0;

      while (var4.find()) {
         String var8 = var4.group(1);
         String var9 = this.b.substring(var6, var4.start());
         var6 = var4.end();
         this.a(var1, var5, this.c.x + var7, this.c.y, var9);
         var7 += var3.stringWidth(var9);
         var5 = Color.decode("#" + var8);
      }

      String var11 = this.b.substring(var6);
      this.a(var1, var5, this.c.x + var7, this.c.y, var11);
      var7 += var3.stringWidth(var11);
      int var12 = var3.getHeight();
      if (var2 != null) {
         var1.setFont(var2);
      }

      return new Dimension(var7, var12);
   }

   private void a(Graphics2D var1, Color var2, int var3, int var4, String var5) {
      if (!var5.isEmpty()) {
         var1.setColor(Color.BLACK);
         if (this.e) {
            var1.drawString(var5, var3, var4 + 1);
            var1.drawString(var5, var3, var4 - 1);
            var1.drawString(var5, var3 + 1, var4);
            var1.drawString(var5, var3 - 1, var4);
         } else {
            var1.drawString(var5, var3 + 1, var4 + 1);
         }

         var1.setColor(var2);
         var1.drawString(var5, var3, var4);
      }
   }

   public void a(String var1) {
      this.b = var1;
   }

   public void a(Point var1) {
      this.c = var1;
   }

   public void a(Color var1) {
      this.d = var1;
   }

   public void a(boolean var1) {
      this.e = var1;
   }

   public void a(@Nullable Font var1) {
      this.f = var1;
   }
}
