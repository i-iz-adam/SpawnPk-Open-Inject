package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_255.class */
public class class_255 {
    public static final double a = 1.05d;
    public static final double b = 1.25d;
    private static boolean o;
    private static class_333 p;
    private static class_333 q;
    public static class_333 c;
    public static class_333 d;
    public static class_333 e;
    public class_333 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int l;
    public long m;
    public boolean n = true;
    public int k = 0;

    public class_255(int i, int i2) {
        this.i = i;
        this.j = i2;
        if (!o) {
            p = new class_333("popups/block drop");
            q = new class_333("popups/hit drop");
            c = new class_333("popups/protmelee");
            e = new class_333("popups/protrange");
            d = new class_333("popups/protmagic");
            o = true;
        }
        this.f = i == 0 ? p : q;
    }

    public void a() {
        if (class_194.a()) {
            return;
        }
        if (this.n) {
            this.k = (int) (((double) this.k) + 15.75d);
            if (this.k >= 255) {
                this.k = 255;
                this.n = false;
            }
        } else {
            this.k = (int) (255.0d - (((double) this.h) * 1.05d));
        }
        if (this.k < 0) {
            this.k = 0;
        }
        this.h = (int) (((double) this.h) + 1.25d);
    }
}
