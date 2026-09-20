package rs.p_gui;

import com.google.a.a.d;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_u extends JFrame {
   private static final Logger b = LoggerFactory.getLogger(C_u.class);
   private static final int c = 40;
   private static boolean d;
   private static boolean e;
   private C_v f = C_v.b;
   private C_u.a g;
   private boolean h;

   @d
   static boolean a(String var0) {
      if (a(var0, 15, -1, -1)) {
         return true;
      } else if (a(var0, 14, -1, -1)) {
         return false;
      } else if (a(var0, 13, 0, 4)) {
         return true;
      } else {
         return a(var0, 12, -1, -1) ? false : a(var0, 11, 0, 8);
      }
   }

   @d
   static boolean b(String var0) {
      if (a(var0, 15, -1, -1)) {
         return true;
      } else if (a(var0, 14, -1, -1)) {
         return false;
      } else if (a(var0, 13, 0, 7)) {
         return true;
      } else {
         return a(var0, 12, -1, -1) ? false : a(var0, 11, 0, 9);
      }
   }

   private static boolean a(String var0, int var1, int var2, int var3) {
      int var4 = var0.indexOf(95);
      if (var4 != -1) {
         var0 = var0.substring(0, var4);
      }

      String[] var5 = var0.split("\\.");
      int var6;
      int var7;
      int var8;
      if (var5.length >= 3) {
         var6 = Integer.parseInt(var5[0]);
         var7 = Integer.parseInt(var5[1]);
         var8 = Integer.parseInt(var5[2]);
      } else {
         var6 = Integer.parseInt(var5[0]);
         var7 = -1;
         var8 = -1;
      }

      int var9 = Integer.compare(var6, var1);
      if (var9 != 0) {
         return var9 > 0;
      } else {
         var9 = Integer.compare(var7, var2);
         if (var9 != 0) {
            return var9 > 0;
         } else {
            var9 = Integer.compare(var8, var3);
            return var9 != 0 ? var9 > 0 : true;
         }
      }
   }

   public void a(C_u.a var1) {
      this.g = var1;
      if (this.g == C_u.a.a) {
         this.setLocation(this.getX(), this.getY());
         this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
      }
   }

   @Override
   public void setLocation(int var1, int var2) {
      if (this.g == C_u.a.a) {
         Rectangle var3 = this.getGraphicsConfiguration().getBounds();
         var1 = Math.max(var1, (int)var3.getX());
         var1 = Math.min(var1, (int)(var3.getX() + var3.getWidth() - (double)this.getWidth()));
         var2 = Math.max(var2, (int)var3.getY());
         var2 = Math.min(var2, (int)(var3.getY() + var3.getHeight() - (double)this.getHeight()));
      }

      super.setLocation(var1, var2);
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      if (this.g == C_u.a.a) {
         Rectangle var5 = this.getGraphicsConfiguration().getBounds();
         var3 = Math.min(var3, var3 - (int)var5.getX() + var1);
         var1 = Math.max(var1, (int)var5.getX());
         var4 = Math.min(var4, var4 - (int)var5.getY() + var2);
         var2 = Math.max(var2, (int)var5.getY());
         var3 = Math.min(var3, (int)(var5.getX() + var5.getWidth()) - var1);
         var4 = Math.min(var4, (int)(var5.getY() + var5.getHeight()) - var2);
      }

      super.setBounds(var1, var2, var3, var4);
   }

   public void a(int var1) {
      if (!this.d()) {
         int var2 = var1;
         boolean var3 = false;
         if (this.f == C_v.a) {
            int var4 = this.getLayout().minimumLayoutSize(this).width;
            int var5 = this.getWidth();
            if (var4 > var5) {
               var3 = true;
               var2 = var4 - var5;
            }
         }

         if (var3 || this.f == C_v.b) {
            int var8 = this.getWidth() + var2;
            int var9 = this.getX();
            if (this.g != C_u.a.c) {
               Rectangle var6 = this.getGraphicsConfiguration().getBounds();
               boolean var7 = (double)(this.getX() + var8) > var6.getX() + var6.getWidth();
               if (var7) {
                  if (!this.f() || this.e()) {
                     var9 = (int)(var6.getX() + var6.getWidth()) - this.getWidth();
                  }

                  var9 -= var2;
                  this.h = true;
               }
            }

            this.setBounds(var9, this.getY(), var8, this.getHeight());
         }

         this.a();
      }
   }

   public void b(int var1) {
      if (!this.d()) {
         this.a();
         Rectangle var2 = this.getGraphicsConfiguration().getBounds();
         boolean var3 = Math.abs((double)this.getX() - var2.getX()) <= 40.0;
         int var4 = this.getX();
         int var5 = this.getWidth() - var1;
         if (this.f() && (this.h || !var3)) {
            var4 += var1;
         }

         if (this.f == C_v.a && var5 > this.getMinimumSize().width) {
            var5 = this.getWidth();
            var4 = this.getX();
         }

         this.setBounds(var4, this.getY(), var5, this.getHeight());
         this.h = false;
      }
   }

   @Override
   public void setMaximizedBounds(Rectangle var1) {
      if (rs.p_k.C_j.a() == rs.p_k.C_j.b) {
         super.setMaximizedBounds(var1);
      } else {
         super.setMaximizedBounds(this.c());
      }
   }

   private GraphicsConfiguration b() {
      return Arrays.stream(GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices())
         .map(GraphicsDevice::getDefaultConfiguration)
         .max(Comparator.comparingInt(var1 -> {
            Rectangle var2 = var1.getBounds().intersection(this.getBounds());
            return var2.width * var2.height;
         }))
         .orElseGet(this::getGraphicsConfiguration);
   }

   private Rectangle c() {
      Toolkit var1 = Toolkit.getDefaultToolkit();
      b.trace("Current bounds: {}", this.getBounds());

      for (GraphicsDevice var5 : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
         GraphicsConfiguration var6 = var5.getDefaultConfiguration();
         b.trace("Device: {} bounds {} insets {}", new Object[]{var5, var6.getBounds(), var1.getScreenInsets(var6)});
      }

      GraphicsConfiguration var9 = this.b();
      Rectangle var10 = var9.getBounds();
      b.trace("Chosen device: {} bounds {}", var9, var10);
      if (!d) {
         var10 = var9.getDefaultTransform().createTransformedShape(var10).getBounds();
         b.trace("Transformed bounds {}", var10);
      }

      Insets var11 = var1.getScreenInsets(var9);
      if (!d) {
         var10.x = var10.y = 0;

         assert !e : "scaled insets without scaled bounds";
      } else if (!e) {
         double var12 = var9.getDefaultTransform().getScaleX();
         double var7 = var9.getDefaultTransform().getScaleY();
         var11.top = (int)((double)var11.top / var7);
         var11.bottom = (int)((double)var11.bottom / var7);
         var11.left = (int)((double)var11.left / var12);
         var11.right = (int)((double)var11.right / var12);
      }

      var10.x = var10.x + var11.left;
      var10.y = var10.y + var11.top;
      var10.height = var10.height - (var11.bottom + var11.top);
      var10.width = var10.width - (var11.right + var11.left);
      b.trace("Final bounds: {}", var10);
      return var10;
   }

   public void a() {
      this.setMinimumSize(this.getLayout().minimumLayoutSize(this));
   }

   private boolean d() {
      return (this.getExtendedState() & 6) == 6;
   }

   private boolean e() {
      Rectangle var1 = this.getGraphicsConfiguration().getBounds();
      return Math.abs((double)this.getX() - var1.getX()) <= 40.0;
   }

   private boolean f() {
      Rectangle var1 = this.getGraphicsConfiguration().getBounds();
      return Math.abs((double)(this.getX() + this.getWidth()) - (var1.getX() + var1.getWidth())) <= 40.0;
   }

   static {
      try {
         String var0 = System.getProperty("java.version");
         d = a(var0);
         e = b(var0);
      } catch (Exception var1) {
         b.error("error checking java version", var1);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }
}
