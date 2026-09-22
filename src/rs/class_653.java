package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_653.class */
public final class class_653 {
    private int d;
    private int[] e;
    private int[] f;
    public int a;
    public int b;
    public int c;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public void a(Buffer buffer) {
        this.c = buffer.y();
        this.a = buffer.D();
        this.b = buffer.D();
        b(buffer);
    }

    public void b(Buffer buffer) {
        this.d = buffer.y();
        this.e = new int[this.d];
        this.f = new int[this.d];
        for (int i = 0; i < this.d; i++) {
            this.e[i] = buffer.A();
            this.f[i] = buffer.A();
        }
    }

    public void a() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public int a(int i) {
        if (this.k >= this.g) {
            int[] iArr = this.f;
            int i2 = this.h;
            this.h = i2 + 1;
            this.j = iArr[i2] << 15;
            if (this.h >= this.d) {
                this.h = this.d - 1;
            }
            this.g = (int) ((((double) this.e[this.h]) / 65536.0d) * ((double) i));
            if (this.g > this.k) {
                this.i = ((this.f[this.h] << 15) - this.j) / (this.g - this.k);
            }
        }
        this.j += this.i;
        this.k++;
        return (this.j - this.i) >> 15;
    }
}
