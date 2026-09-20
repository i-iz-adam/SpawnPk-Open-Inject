package rs.p_l;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.Raster;
import java.util.Hashtable;
import javax.swing.SwingUtilities;
import rs.C_Client_mc;

public final class C_C_uc {
   public static boolean a;
   public static C_Client_mc b;
   public int[] c;
   private final int g;
   public final float[] d;
   private final int h;
   public final BufferedImage e;
   public final Component f;
   private final Rectangle i = new Rectangle();
   private static final ColorModel j = new DirectColorModel(32, 16711680, 65280, 255);
   private static final ColorModel k = new DirectColorModel(ColorSpace.getInstance(1000), 32, 16711680, 65280, 255, -16777216, true, 3);

   public C_C_uc(int var1, int var2, Component var3) {
      int var4 = var1 * var2;
      this.g = var1;
      this.h = var2;
      this.f = var3;
      this.c = new int[var4];
      this.d = new float[var1 * var2];
      boolean var5 = rs.p_k.C_e.a();
      if (var5) {
         this.e = new BufferedImage(
            k, Raster.createWritableRaster(k.createCompatibleSampleModel(var1, var2), new DataBufferInt(this.c, var4), null), true, new Hashtable()
         );
      } else {
         this.e = new BufferedImage(
            j, Raster.createWritableRaster(j.createCompatibleSampleModel(var1, var2), new DataBufferInt(this.c, var4), null), false, new Hashtable()
         );
      }

      this.a();
   }

   public void a() {
      C_c.a(this.g, this.h, this.c, this.d);
   }

   public void a(int var1, Graphics var2, int var3) {
      if (var2 != null) {
         if (!rs.p_k.C_e.a()) {
            var2.drawImage(this.e, var3, var1, this.f);
            if (!a) {
               if (!rs.p_v.C_a.d() || rs.p_l.p_b.p_a.C_d.c) {
                  SwingUtilities.invokeLater(new C_D_uc(this));
               }

               a = true;
            }
         }
      }
   }

   public void a(ImageConsumer var1) {
   }

   public boolean a(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   public int[] b() {
      return this.c;
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }
}
