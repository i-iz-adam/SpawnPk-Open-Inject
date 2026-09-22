package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_201.class */
public class class_201 {
    private static final long a = 5000;
    private String b;
    private long c = System.currentTimeMillis();

    public class_201(String str) {
        this.b = str;
    }

    public void a(int i, int i2) {
        int i3 = class_324.ap;
        class_324.ap = (int) (256.0d - ((256.0d * ((double) (b() / 5000.0f))) * 1.5d));
        if (class_324.ap < 0) {
            class_324.ap = 0;
        }
        class_205.b.f.gn.a("@yel@[!] @whi@" + this.b, i, i2, class_492.e, 0, false);
        class_324.ap = i3;
    }

    public boolean a() {
        return b() < a;
    }

    private long b() {
        return System.currentTimeMillis() - this.c;
    }
}
