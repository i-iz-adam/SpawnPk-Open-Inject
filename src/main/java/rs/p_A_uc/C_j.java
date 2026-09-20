package rs.p_A_uc;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.GrayFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_j {
   private static final Logger a = LoggerFactory.getLogger(C_j.class);

   @Deprecated
   public static BufferedImage a(Class<?> var0, String var1) {
      return b(var0, var1);
   }

   public static BufferedImage b(Class<?> var0, String var1) {
      try {
         InputStream var2 = var0.getResourceAsStream(var1);

         BufferedImage var4;
         try {
            synchronized (ImageIO.class) {
               var4 = ImageIO.read(var2);
            }
         } catch (Throwable var8) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var6) {
                  var8.addSuppressed(var6);
               }
            }

            throw var8;
         }

         if (var2 != null) {
            var2.close();
         }

         return var4;
      } catch (IllegalArgumentException var9) {
         String var3;
         if (var1.startsWith("/")) {
            var3 = var1;
         } else {
            var3 = var0.getPackage().getName().replace('.', '/') + "/" + var1;
         }

         a.warn("Failed to load image from class: {}, path: {}", var0.getName(), var3);
         throw new IllegalArgumentException(var1, var9);
      } catch (IOException var10) {
         throw new RuntimeException(var1, var10);
      }
   }

   public static BufferedImage a(BufferedImage var0, boolean var1, boolean var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      BufferedImage var7 = new BufferedImage(var5, var6, 2);
      Graphics2D var8 = var7.createGraphics();
      if (var1) {
         var3 = var5;
         var5 *= -1;
      }

      if (var2) {
         var4 = var6;
         var6 *= -1;
      }

      var8.drawImage(var0, var3, var4, var5, var6, null);
      var8.dispose();
      return var7;
   }

   public static BufferedImage a(BufferedImage var0, int var1, int var2) {
      return a(var0, var1, var2, false);
   }

   public static BufferedImage a(BufferedImage var0, int var1, int var2, boolean var3) {
      Image var4;
      if (var3) {
         if (var0.getWidth() > var0.getHeight()) {
            var4 = var0.getScaledInstance(var1, -1, 4);
         } else {
            var4 = var0.getScaledInstance(-1, var2, 4);
         }
      } else {
         var4 = var0.getScaledInstance(var1, var2, 4);
      }

      return a(var4);
   }

   public static BufferedImage a(Image var0) {
      return var0 instanceof BufferedImage ? (BufferedImage)var0 : b(var0);
   }

   public static BufferedImage b(Image var0) {
      if (var0 instanceof BufferedImage && ((BufferedImage)var0).getType() == 2) {
         return (BufferedImage)var0;
      } else {
         BufferedImage var1 = new BufferedImage(var0.getWidth(null), var0.getHeight(null), 2);
         Graphics2D var2 = var1.createGraphics();
         var2.drawImage(var0, 0, 0, null);
         var2.dispose();
         return var1;
      }
   }

   public static BufferedImage a(Image var0, int var1) {
      BufferedImage var2 = b(var0);
      float var3 = (float)var1;
      int var4 = var2.getColorModel().getNumComponents();
      float[] var5 = new float[var4];
      float[] var6 = new float[var4];
      Arrays.fill(var5, 1.0F);
      Arrays.fill(var6, 0.0F);
      var6[var4 - 1] = var3;
      return a(var2, var5, var6);
   }

   public static BufferedImage a(Image var0, float var1) {
      BufferedImage var2 = b(var0);
      int var3 = var2.getColorModel().getNumComponents();
      float[] var4 = new float[var3];
      float[] var5 = new float[var3];
      Arrays.fill(var4, 1.0F);
      Arrays.fill(var5, 0.0F);
      var4[var3 - 1] = var1;
      return a(var2, var4, var5);
   }

   public static BufferedImage a(BufferedImage var0) {
      Image var1 = GrayFilter.createDisabledImage(var0);
      return a(var1);
   }

   public static BufferedImage b(Image var0, int var1) {
      BufferedImage var2 = b(var0);
      float var3 = (float)var1;
      int var4 = var2.getColorModel().getNumComponents();
      float[] var5 = new float[var4];
      float[] var6 = new float[var4];
      Arrays.fill(var5, 1.0F);

      for (int var7 = 0; var7 < var4; var7++) {
         var6[var7] = var3;
      }

      var6[var4 - 1] = 0.0F;
      return a(var2, var5, var6);
   }

   public static BufferedImage b(Image var0, float var1) {
      BufferedImage var2 = b(var0);
      int var3 = var2.getColorModel().getNumComponents();
      float[] var4 = new float[var3];
      float[] var5 = new float[var3];
      Arrays.fill(var5, 0.0F);

      for (int var6 = 0; var6 < var3; var6++) {
         var4[var6] = var1;
      }

      var4[var3 - 1] = 1.0F;
      return a(var2, var4, var5);
   }

   private static BufferedImage a(BufferedImage var0, float[] var1, float[] var2) {
      return new RescaleOp(var1, var2, null).filter(var0, null);
   }

   public static BufferedImage a(BufferedImage var0, double var1) {
      AffineTransform var3 = new AffineTransform();
      var3.rotate(var1, (double)var0.getWidth() / 2.0, (double)var0.getHeight() / 2.0);
      AffineTransformOp var4 = new AffineTransformOp(var3, 2);
      return var4.filter(var0, null);
   }

   static {
      ImageIO.setUseCache(false);
   }
}
