package rs.p_l;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RGBImageFilter;

class C_H_uc extends RGBImageFilter {
   C_H_uc(BufferedImage var1, Color var2, Color var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @Override
   public final int filterRGB(int var1, int var2, int var3) {
      int var4 = this.a.getRGB(var1, var2);
      int var5 = var4 & 0xFF;
      int var6 = var4 >> 8 & 0xFF;
      int var7 = var4 >> 16 & 0xFF;
      int var8 = var4 >> 24 & 0xFF;
      if (C_F_uc.g(var5, this.b.getRed()) && C_F_uc.g(var6, this.b.getGreen()) && C_F_uc.g(var7, this.b.getBlue())) {
         var5 = C_F_uc.h(var5, this.b.getRed(), this.c.getRed());
         var6 = C_F_uc.h(var6, this.b.getGreen(), this.c.getGreen());
         var7 = C_F_uc.h(var7, this.b.getBlue(), this.c.getBlue());
      }

      if (var5 > 255) {
         var5 = 255;
      }

      if (var6 > 255) {
         var6 = 255;
      }

      if (var7 > 255) {
         var7 = 255;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      if (var7 < 0) {
         var7 = 0;
      }

      Color var9 = new Color(var5, var6, var7, var8);
      return var9.getRGB();
   }
}
