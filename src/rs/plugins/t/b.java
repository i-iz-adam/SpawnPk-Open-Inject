package rs.plugins.t;

import java.awt.image.BufferedImage;
import rs.class_12;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/b.class */
public enum b {
    a("Gold", 1, class_12.b((Class<?>) b.class, "gold.png")),
    b("Bags", 100000000, class_12.b((Class<?>) b.class, "bags.png"));

    private final String c;
    private final int d;
    private final BufferedImage e;

    @Override // java.lang.Enum
    public String toString() {
        return this.c;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public BufferedImage c() {
        return this.e;
    }

    b(String str, int i, BufferedImage bufferedImage) {
        this.c = str;
        this.d = i;
        this.e = bufferedImage;
    }
}
