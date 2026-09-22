package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_162.class */
public class class_162 extends class_161 {
    int f;
    static long g;
    static long h;
    long[] a = new long[10];
    int b = 256;
    int c = 1;
    int e = 0;
    long d = b();

    public class_162() {
        for (int i = 0; i < 10; i++) {
            this.a[i] = this.d;
        }
    }

    @Override // rs.class_161
    public void a() {
        for (int i = 0; i < 10; i++) {
            this.a[i] = 0;
        }
    }

    public static synchronized long b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < g) {
            h += g - jCurrentTimeMillis;
        }
        g = jCurrentTimeMillis;
        return h + jCurrentTimeMillis;
    }

    @Override // rs.class_161
    public int a(int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        this.b = 300;
        this.c = 1;
        this.d = b();
        if (this.a[this.f] == 0) {
            this.b = i3;
            this.c = i4;
        } else if (this.d > this.a[this.f]) {
            this.b = (int) (((long) (i * 2560)) / (this.d - this.a[this.f]));
        }
        if (this.b < 25) {
            this.b = 25;
        }
        if (this.b > 256) {
            this.b = 256;
            this.c = (int) (((long) i) - ((this.d - this.a[this.f]) / 10));
        }
        if (this.c > i) {
            this.c = i;
        }
        this.a[this.f] = this.d;
        this.f = (this.f + 1) % 10;
        if (this.c > 1) {
            for (int i5 = 0; i5 < 10; i5++) {
                if (this.a[i5] != 0) {
                    long[] jArr = this.a;
                    int i6 = i5;
                    jArr[i6] = jArr[i6] + ((long) this.c);
                }
            }
        }
        if (this.c < i2) {
            this.c = i2;
        }
        class_164.a(this.c);
        int i7 = 0;
        while (this.e < 256) {
            i7++;
            this.e += this.b;
        }
        this.e &= 255;
        return i7;
    }
}
