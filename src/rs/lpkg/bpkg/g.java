package rs.lpkg.bpkg;

import gnu.trove.f.b.cc;

/* JADX INFO: loaded from: client-final.jar:rs/l/b/g.class */
public class g {
    private static int a;
    private static final int b = 6048;
    private static final cc<g> c = new cc<>(b);
    private static final g[] d = new g[b];
    private int e;
    private int f;
    private int g;

    public static void a() {
        a = 0;
        c.clear();
    }

    public static g a(int i) {
        return c.b(i);
    }

    public static void a(int i, g gVar) {
        c.a(i, gVar);
    }

    public static g b() {
        g[] gVarArr = d;
        int i = a;
        a = i + 1;
        return gVarArr[i];
    }

    public int c() {
        return this.e;
    }

    public g b(int i) {
        this.e = i;
        return this;
    }

    public int d() {
        return this.f;
    }

    public g c(int i) {
        this.f = i;
        return this;
    }

    public int e() {
        return this.g;
    }

    public g d(int i) {
        this.g = i;
        return this;
    }

    static {
        for (int i = 0; i < b; i++) {
            d[i] = new g();
        }
    }
}
