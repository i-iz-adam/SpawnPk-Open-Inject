package rs;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

/* JADX INFO: loaded from: client-final.jar:rs/class_224.class */
public final class class_224 {
    public final int[] a;
    public final int b;
    public final int c;
    final BufferedImage d;

    public class_224(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = new BufferedImage(i, i2, 1);
        this.a = this.d.getRaster().getDataBuffer().getData();
        a();
    }

    public class_224(int i, int i2, Component component) {
        this(i, i2);
    }

    public void a(int i, Graphics graphics, int i2) {
        graphics.drawImage(this.d, i2, i, (ImageObserver) null);
    }

    public void a() {
        class_210.a(this.b, this.c, this.a);
    }
}
