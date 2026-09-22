package rs;

import java.awt.Color;

/* JADX INFO: loaded from: client-final.jar:rs/class_218.class */
public class class_218 {
    private final Color b = new Color(178, 120, 208);
    public static final Color[] a = class_220.i;
    private static final class_333[][] c = new class_333[9][a.length];
    private static boolean d = false;
    private Client e;
    private class_333 f;
    private int g;
    private int h;
    private int i;

    public class_218(Client client, int i, int i2) {
        this.e = client;
        this.g = i;
        this.h = i2;
        b();
    }

    public void a() {
        d();
        this.f.c(this.g, this.h);
    }

    public void b() {
        this.i = Client.c(7, 9);
        if (Client.c(0, 20) == 0) {
            this.i = 9;
        }
        if (Client.c(0, 10) == 0) {
            this.i = Client.c(1, 3) == 3 ? 1 : 6;
        }
        if (!d) {
            for (int i = 0; i < c.length; i++) {
                int i2 = 0;
                for (Color color : a) {
                    String str = "orb " + (i + 1);
                    if (i + 1 >= 7) {
                        int i3 = i2;
                        i2++;
                        c[i][i3] = new class_333("/assets/", str);
                    } else {
                        new class_333("/assets/", str, this.b, color);
                        int i4 = i2;
                        i2++;
                        c[i][i4] = new class_333("/assets/", str, this.b, color);
                    }
                }
            }
            d = true;
        }
        this.f = c[this.i - 1][Client.c(0, a.length - 1)];
    }

    public int c() {
        return this.i;
    }

    private void d() {
        if (this.i > 3) {
            this.i = Client.c(1, 3);
        }
        this.g += this.i;
        this.h += this.i;
        if (this.g >= this.e.hE + this.f.n) {
            b();
            this.g = (-1) * this.f.n;
        }
        if (this.h >= this.e.hF + this.f.o) {
            b();
            this.h = (-1) * this.f.o;
        }
    }
}
