package rs.gui.bpkg;

import rs.gui.x;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/f.class */
public class f {
    private final int a;
    private final int b;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public f(int i) {
        this.a = i;
        this.b = 1;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public x c() {
        return new g(this.a).b();
    }
}
