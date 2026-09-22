package rs;

import com.sun.jna.platform.win32.m;
import java.awt.Color;
import java.awt.image.RGBImageFilter;

/* JADX INFO: loaded from: client-final.jar:rs/class_334.class */
class class_334 extends RGBImageFilter {
    public int a;
    final /* synthetic */ Color b;

    class_334(Color color) {
        this.b = color;
        this.a = this.b.getRGB() | m.bG;
    }

    public final int filterRGB(int i, int i2, int i3) {
        return (i3 | m.bG) == this.a ? 16777215 & i3 : i3;
    }
}
