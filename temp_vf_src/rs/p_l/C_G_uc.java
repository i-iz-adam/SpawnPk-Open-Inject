package rs.p_l;

import java.awt.Color;
import java.awt.image.RGBImageFilter;

class C_G_uc extends RGBImageFilter {
   public int a;

   C_G_uc(Color var1) {
      this.b = var1;
      this.a = this.b.getRGB() | 0xFF000000;
   }

   @Override
   public final int filterRGB(int var1, int var2, int var3) {
      return (var3 | 0xFF000000) == this.a ? 16777215 & var3 : var3;
   }
}
