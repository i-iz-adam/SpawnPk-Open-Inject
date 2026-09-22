package rs;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: client-final.jar:rs/class_174.class */
public enum class_174 {
    a(true, 0, 10, 9),
    b(1, 6, 6),
    c(2, 7, 7),
    d(3, 4, 4),
    e(4, 4, 2),
    f(5, 5, 2),
    g(true, 6, 6, 6),
    h(true, 7, 8, 4),
    i(8, 4, 6),
    j(9, 5, 7),
    k(10, 6, 3),
    l(11, 4, 6),
    m(12, 7, 4),
    n(true, 13, 6, 5);

    private final boolean o;
    private final int p;
    private final int q;
    private final int r;

    class_174(int i2, int i3, int i4) {
        this.o = false;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    class_174(boolean z, int i2, int i3, int i4) {
        this.o = z;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    public static class_174 a(int i2) {
        for (class_174 class_174Var : values()) {
            if (class_174Var.p == i2) {
                return class_174Var;
            }
        }
        return null;
    }
}
