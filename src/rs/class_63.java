package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_63.class */
public class class_63 {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public class_63(int i) {
        this.a = new int[i * 3];
    }

    public int a(int i) {
        return this.a[i * 3];
    }

    public int b(int i) {
        return this.a[(i * 3) + 1];
    }

    public int c(int i) {
        return this.a[(i * 3) + 2];
    }

    public void a(int i, int i2) {
        this.a[i * 3] = i2;
    }

    public void b(int i, int i2) {
        this.a[(i * 3) + 1] = i2;
    }

    public void c(int i, int i2) {
        this.a[(i * 3) + 2] = i2;
    }

    public void d(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i * 3;
        iArr[i3] = iArr[i3] + i2;
    }

    public void e(int i, int i2) {
        int[] iArr = this.a;
        int i3 = (i * 3) + 1;
        iArr[i3] = iArr[i3] + i2;
    }

    public void f(int i, int i2) {
        int[] iArr = this.a;
        int i3 = (i * 3) + 2;
        iArr[i3] = iArr[i3] + i2;
    }

    public int a() {
        return this.a.length / 3;
    }
}
