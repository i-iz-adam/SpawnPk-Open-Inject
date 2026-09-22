package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_141.class */
public class class_141 {
    private final long a;
    private String b;
    private boolean c;
    private boolean d;
    private long e;

    public boolean a() {
        return this.b.startsWith("$");
    }

    class_141(long j) {
        this.a = j;
    }

    public String toString() {
        long jB = b();
        String strC = c();
        boolean zD = d();
        boolean zE = e();
        f();
        return "ConfigProfile(id=" + jB + ", name=" + jB + ", sync=" + strC + ", active=" + zD + ", rev=" + zE + ")";
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    void a(String str) {
        this.b = str;
    }

    public boolean d() {
        return this.c;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean e() {
        return this.d;
    }

    public void b(boolean z) {
        this.d = z;
    }

    long f() {
        return this.e;
    }

    void a(long j) {
        this.e = j;
    }
}
