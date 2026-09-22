package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_43.class */
public final class class_43 {
    public int[] a;

    public class_43(int i) {
        this.a = new int[i * 4];
    }

    public int a() {
        return this.a.length / 4;
    }

    public int a(int i) {
        return this.a[i * 4];
    }

    public int b(int i) {
        return this.a[(i * 4) + 1];
    }

    public int c(int i) {
        return this.a[(i * 4) + 2];
    }

    public int d(int i) {
        return this.a[(i * 4) + 3];
    }

    public void a(int i, int i2) {
        this.a[i * 4] = i2;
    }

    public void b(int i, int i2) {
        this.a[(i * 4) + 1] = i2;
    }

    public void c(int i, int i2) {
        this.a[(i * 4) + 2] = i2;
    }

    public void d(int i, int i2) {
        this.a[(i * 4) + 3] = i2;
    }

    public void e(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i * 4;
        iArr[i3] = iArr[i3] + i2;
    }

    public void f(int i, int i2) {
        int[] iArr = this.a;
        int i3 = (i * 4) + 1;
        iArr[i3] = iArr[i3] + i2;
    }

    public void g(int i, int i2) {
        int[] iArr = this.a;
        int i3 = (i * 4) + 2;
        iArr[i3] = iArr[i3] + i2;
    }

    public void h(int i, int i2) {
        int[] iArr = this.a;
        int i3 = (i * 4) + 3;
        iArr[i3] = iArr[i3] + i2;
    }

    public boolean e(int i) {
        return a(i) == -2147483647;
    }
}
