package rs;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RGBImageFilter;

/* JADX INFO: loaded from: client-final.jar:rs/class_335.class */
class class_335 extends RGBImageFilter {
    final /* synthetic */ BufferedImage a;
    final /* synthetic */ Color b;
    final /* synthetic */ Color c;

    class_335(BufferedImage bufferedImage, Color color, Color color2) {
        this.a = bufferedImage;
        this.b = color;
        this.c = color2;
    }

    public final int filterRGB(int i, int i2, int i3) {
        int rgb = this.a.getRGB(i, i2);
        int i4 = rgb & 255;
        int i5 = (rgb >> 8) & 255;
        int i6 = (rgb >> 16) & 255;
        int i7 = (rgb >> 24) & 255;
        if (class_333.h(i4, this.b.getRed()) && class_333.h(i5, this.b.getGreen()) && class_333.h(i6, this.b.getBlue())) {
            i4 = class_333.i(i4, this.b.getRed(), this.c.getRed());
            i5 = class_333.i(i5, this.b.getGreen(), this.c.getGreen());
            i6 = class_333.i(i6, this.b.getBlue(), this.c.getBlue());
        }
        if (i4 > 255) {
            i4 = 255;
        }
        if (i5 > 255) {
            i5 = 255;
        }
        if (i6 > 255) {
            i6 = 255;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        return new Color(i4, i5, i6, i7).getRGB();
    }
}
