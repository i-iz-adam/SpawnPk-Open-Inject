package rs;

import com.sun.jna.platform.win32.bk;
import com.sun.jna.platform.win32.m;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
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
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_330.class */
public final class class_330 {
    public static boolean a;
    public static Client b;
    public int[] c;
    private final int g;
    public final float[] d;
    private final int h;
    public final BufferedImage e;
    public final Component f;
    private final Rectangle i = new Rectangle();
    private static final ColorModel j = new DirectColorModel(32, bk.aS, bk.ao, 255);
    private static final ColorModel k = new DirectColorModel(ColorSpace.getInstance(1000), 32, bk.aS, bk.ao, 255, m.bG, true, 3);

    public class_330(int i, int i2, Component component) {
        int i3 = i * i2;
        this.g = i;
        this.h = i2;
        this.f = component;
        this.c = new int[i3];
        this.d = new float[i * i2];
        if (e.a()) {
            this.e = new BufferedImage(k, Raster.createWritableRaster(k.createCompatibleSampleModel(i, i2), new DataBufferInt(this.c, i3), (Point) null), true, new Hashtable());
        } else {
            this.e = new BufferedImage(j, Raster.createWritableRaster(j.createCompatibleSampleModel(i, i2), new DataBufferInt(this.c, i3), (Point) null), false, new Hashtable());
        }
        a();
    }

    public void a() {
        class_210.a(this.g, this.h, this.c, this.d);
    }

    public void a(int i, Graphics graphics, int i2) {
        if (graphics == null || e.a()) {
            return;
        }
        graphics.drawImage(this.e, i2, i, this.f);
        if (a) {
            return;
        }
        if (!class_650.d() || class_205.c) {
            SwingUtilities.invokeLater(new class_331(this));
        }
        a = true;
    }

    public void a(ImageConsumer imageConsumer) {
    }

    public boolean a(Image image, int i, int i2, int i3, int i4, int i5) {
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
