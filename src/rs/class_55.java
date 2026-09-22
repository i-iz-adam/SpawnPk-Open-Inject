package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_55.class */
public final class class_55 extends class_48 {
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public boolean m;
    private final class_127 n;
    private int o;
    private int p;

    public class_55(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.m = false;
        this.n = class_127.c[i4];
        this.h = i;
        this.i = i7;
        this.j = i6;
        this.k = i5;
        this.l = i2 + i3;
        this.m = false;
    }

    @Override // rs.class_48
    public ColorUtility c() {
        ColorUtility colorUtility;
        ColorUtility colorUtilityA = this.n.a();
        if (colorUtilityA == null) {
            return null;
        }
        class_99 class_99Var = this.n.g;
        class_49 class_49Var = ColorUtility.h;
        if (class_99Var.b()) {
            colorUtility = class_99Var.a(colorUtilityA, this.o);
        } else {
            int i = this.n.g.e[this.o];
            colorUtility = new ColorUtility(true, class_176.g(i), false, colorUtilityA);
            colorUtility.i = class_49Var;
            if (!this.m) {
                colorUtility.n();
                colorUtility.f(i, this.n.g.r);
                colorUtility.aM = null;
                colorUtility.aL = null;
            }
        }
        if (this.n.j != 128 || this.n.k != 128) {
            colorUtility.b(this.n.j, this.n.j, this.n.k);
        }
        if (this.n.l != 0) {
            if (this.n.l == 90) {
                colorUtility.o();
            }
            if (this.n.l == 180) {
                colorUtility.o();
                colorUtility.o();
            }
            if (this.n.l == 270) {
                colorUtility.o();
                colorUtility.o();
                colorUtility.o();
            }
        }
        colorUtility.b(64 + this.n.m, 850 + this.n.n, -30, -50, -30, true);
        if (0 != 0) {
            class_127.q.a(class_49Var, this.n.d);
        }
        return colorUtility;
    }

    public void a(int i) {
        if (this.n.g.b()) {
            this.p += i;
            this.o += i;
            if (this.o >= this.n.g.c()) {
                this.m = true;
                return;
            }
            return;
        }
        this.p += i;
        while (this.p > this.n.g.a(this.o)) {
            this.p -= this.n.g.a(this.o) + 1;
            this.o++;
            if (this.o >= this.n.g.d && (this.o < 0 || this.o >= this.n.g.d)) {
                this.o = 0;
                this.m = true;
            }
        }
    }
}
