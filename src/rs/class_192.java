package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_192.class */
public class class_192 {
    public static class_192 a;
    protected final long b;
    protected final class_333[] c;
    protected int d;
    protected long e;

    public static void a() {
        a = new class_192("glitter", 4, 100L);
    }

    public class_192(class_333[] class_333VarArr, long j) {
        this.c = class_333VarArr;
        this.b = j;
    }

    public class_192(String str, int i, long j) {
        this.c = new class_333[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new class_333("anim/" + str + " " + i2);
        }
        this.b = j;
    }

    public void b() {
        if (this.c != null && System.currentTimeMillis() > this.e) {
            this.d++;
            if (this.d >= this.c.length) {
                this.d = 0;
            }
            this.e = System.currentTimeMillis() + this.b;
        }
    }

    public class_333 c() {
        if (this.c == null) {
            return null;
        }
        b();
        return this.c[this.d];
    }

    public void a(int i, int i2) {
        if (c() == null) {
            return;
        }
        c().f(i, i2);
    }

    public void a(int i, int i2, int i3) {
        if (c() == null) {
            return;
        }
        c().g(i, i2, i3);
    }

    public void b(int i, int i2) {
        if (c() == null) {
            return;
        }
        c().c(i, i2);
    }
}
