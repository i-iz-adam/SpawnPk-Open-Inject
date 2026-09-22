package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_591.class */
public class class_591 {
    private static long a = 0;
    private class_593 b;
    private int d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private long o;
    private int c = 0;
    private boolean n = false;

    public class_591(class_593 class_593Var, int i, int i2, int i3, int i4) {
        this.b = null;
        long j = a;
        a = j + 1;
        this.o = j;
        this.b = class_593Var;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        a();
    }

    public void a() {
        this.d = this.b.l();
        this.e = this.b.j();
        this.f = this.b.c();
        this.k = this.b.n().a() + this.b.a(-1, 1);
        this.l = this.b.n().b() + this.b.a(0, 1);
        this.m = this.b.n().c() + this.b.a(-1, 1);
    }

    public void b() {
        this.c = 0;
        this.n = false;
    }

    public void c() {
        if (this.b == null) {
            this.n = true;
            return;
        }
        this.c++;
        if (this.c >= this.b.q()) {
            this.n = true;
            return;
        }
        this.d += this.b.t();
        this.e += this.b.r();
        this.f += this.b.e();
        this.h += this.k;
        this.i += this.l;
        this.j += this.m;
        this.k += this.b.s().a();
        this.l += this.b.s().b();
        this.m += this.b.s().c();
        if (this.b.a() != null) {
            this.h += this.b.a().a();
            this.i += this.b.a().b();
            this.j += this.b.a().c();
        }
    }

    public class_593 d() {
        return this.b;
    }

    public void a(class_593 class_593Var) {
        this.b = class_593Var;
    }

    public float e() {
        return this.f;
    }

    public void a(float f) {
        this.f = f;
    }

    public boolean f() {
        return this.n;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.c = i;
    }

    public int i() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public float j() {
        return this.e;
    }

    public void b(float f) {
        this.e = f;
    }

    public int k() {
        return this.h;
    }

    public int l() {
        return this.i;
    }

    public int m() {
        return this.j;
    }

    public void d(int i) {
        this.h = i;
    }

    public void e(int i) {
        this.i = i;
    }

    public void f(int i) {
        this.j = i;
    }

    public long n() {
        return this.o;
    }

    public void a(boolean z) {
        this.n = z;
    }
}
