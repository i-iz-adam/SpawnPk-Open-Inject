package rs.lpkg.cpkg;

import rs.class_593;

/* JADX INFO: loaded from: client-final.jar:rs/l/c/a.class */
public class a {
    private static long d = 0;
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private final long e;
    private class_593 f;
    private int g;
    private float h;
    private float i;
    private byte j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q = 0;
    private int r;
    private int s;
    private int t;

    public a(class_593 class_593Var, int i, int i2, int i3, int i4) {
        this.f = null;
        long j = d;
        d = j + 1;
        this.e = j;
        this.f = class_593Var;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.p = i4;
    }

    public void a() {
        this.g = this.f.l();
        this.h = this.f.j();
        this.i = this.f.c();
        this.r = this.f.n().a() + this.f.a(-1, 1);
        this.s = this.f.n().b() + this.f.a(0, 1);
        this.t = this.f.n().c() + this.f.a(-1, 1);
    }

    public void b() {
        this.q = 0;
        this.k = false;
        this.o = -1;
        this.p = -1;
    }

    public void c() {
        if (this.f == null) {
            this.k = true;
            return;
        }
        this.q++;
        if (this.q >= this.f.q()) {
            this.k = true;
            return;
        }
        this.g += this.f.t();
        this.h += this.f.r();
        this.i += this.f.e();
        this.l += this.r;
        this.m += this.s;
        this.n += this.t;
        this.r += this.f.s().a();
        this.s += this.f.s().b();
        this.t += this.f.s().c();
        if (this.f.a() != null) {
            this.l += this.f.a().a();
            this.m += this.f.a().b();
            this.n += this.f.a().c();
        }
    }

    public long d() {
        return this.e;
    }

    public void a(class_593 class_593Var) {
        this.f = class_593Var;
    }

    public int e() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public float f() {
        return this.h;
    }

    public void a(float f) {
        this.h = f;
    }

    public float g() {
        return this.i;
    }

    public void b(float f) {
        this.i = f;
    }

    public byte h() {
        return this.j;
    }

    public void a(byte b2) {
        this.j = b2;
    }

    public boolean i() {
        return this.k;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public int j() {
        return this.l;
    }

    public int k() {
        return this.m;
    }

    public int l() {
        return this.n;
    }

    public void b(int i) {
        this.l = i;
    }

    public void c(int i) {
        this.m = i;
    }

    public void d(int i) {
        this.n = i;
    }

    public int m() {
        return this.o;
    }

    public void e(int i) {
        this.o = i;
    }

    public int n() {
        return this.p;
    }

    public void f(int i) {
        this.p = i;
    }
}
