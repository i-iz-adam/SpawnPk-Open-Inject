package rs.ui.bpkg;

import java.util.Arrays;

/* JADX INFO: loaded from: client-final.jar:rs/ui/b/a.class */
class a {
    public static final int a = 10;
    public static final int b = 1024;
    private int[] c = new int[0];
    private int[] d = new int[0];
    private int e;

    a() {
    }

    private void c() {
        int length = this.c.length >> 10;
        int iMax = Math.max(1, length * 2);
        this.c = Arrays.copyOf(this.c, iMax * 1024);
        this.d = Arrays.copyOf(this.d, iMax);
        for (int i = length; i < iMax; i++) {
            int[] iArr = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            iArr[i2] = i;
        }
    }

    public int[] a() {
        return this.c;
    }

    public int b() {
        if (this.e == 0) {
            c();
        }
        int[] iArr = this.d;
        int i = this.e - 1;
        this.e = i;
        return iArr[i];
    }

    public void a(int i) {
        int[] iArr = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr[i2] = i;
    }
}
