package rs.plugins.q.apkg;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/a/b.class */
public class b {
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g = false;

    public b(String str) {
        this.a = str;
    }

    public void a(int i) {
        this.d += i;
    }

    public void a(boolean z) {
        this.c++;
        if (z) {
            this.b++;
        }
    }

    public void b(boolean z) {
        this.e++;
        if (z) {
            this.f++;
        }
    }

    public void a(int i, int i2) {
        this.e = i2;
        this.f = i;
    }

    public void b(int i, int i2) {
        this.c = i2;
        this.b = i;
    }

    public float a() {
        return Math.min(1.0f, (this.f == 0 && this.e == 0) ? 0.0f : this.f / this.e);
    }

    public float b() {
        return Math.min(1.0f, (this.b == 0 && this.c == 0) ? 0.0f : this.b / this.c);
    }

    public String b(int i) {
        return this.d < i ? this.d + " (" + (this.d - i) + ")" : this.d + " (+" + (this.d - i) + ")";
    }

    public String c() {
        return this.f + "/" + this.e + " (" + ((int) Math.ceil(a() * 100.0f)) + "%)";
    }

    public String d() {
        return this.b + "/" + this.c + " (" + ((int) Math.ceil(b() * 100.0f)) + "%)";
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.f;
    }

    public boolean j() {
        return this.g;
    }

    public String k() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public void c(int i) {
        this.b = i;
    }

    public void d(int i) {
        this.c = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void f(int i) {
        this.e = i;
    }

    public void g(int i) {
        this.f = i;
    }

    public void c(boolean z) {
        this.g = z;
    }
}
