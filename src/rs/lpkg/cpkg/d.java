package rs.lpkg.cpkg;

import gnu.trove.e.a.k;

/* JADX INFO: loaded from: client-final.jar:rs/l/c/d.class */
public class d {
    private static final int a = 1000;
    private final k b = new k(1000);
    private final k c = new k(1000);
    private long d;
    private int e;

    public static d a() {
        return new d();
    }

    public boolean b() {
        this.d = System.currentTimeMillis();
        return this.b.size() < 1000;
    }

    public boolean a(a aVar) {
        this.d = System.currentTimeMillis();
        this.b.b(aVar.d());
        return true;
    }

    public void c() {
        this.c.clear();
        for (int i = 0; i < this.b.size(); i++) {
            long jA = this.b.a(i);
            a aVarA = c.a(jA);
            if (aVarA == null) {
                this.c.b(jA);
            } else if (aVarA.m() != this.e) {
                this.c.b(jA);
            } else if (aVarA.i() || !c.b(aVarA)) {
                this.c.b(jA);
            }
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.b.c(this.c.a(i2));
        }
    }

    public void d() {
        this.c.clear();
        this.b.clear();
        this.e = -1;
    }

    public a a(int i) {
        return c.a(this.b.a(i));
    }

    public int e() {
        return this.b.size();
    }

    public long f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }
}
