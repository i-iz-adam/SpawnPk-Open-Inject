package rs.runelite.a;

import rs.class_27;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/o.class */
public class o {
    private final int a;
    private final int b;
    private final int c;

    public o(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public o a(int i) {
        int i2 = (i + 1024) % 2048;
        if (i2 == 0) {
            return this;
        }
        int i3 = class_27.hA[i2];
        int i4 = class_27.hB[i2];
        return new o(((this.a * i4) + (this.c * i3)) >> 16, this.b, ((this.c * i4) - (this.a * i3)) >> 16);
    }
}
