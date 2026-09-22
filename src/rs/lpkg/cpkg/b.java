package rs.lpkg.cpkg;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/l/c/b.class */
public class b {
    public static final int a = 18;
    public static final int b = 6;
    private static final int[] c = new int[aU.hx_];
    private static final int[] d = new int[72];
    private static int e;

    public static int[] a(int i, int i2, int i3, int i4, int i5) {
        e = 0;
        a(i - i4, i2, i3 + i4, i5);
        a(i + i4, i2, i3 + i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i + i4, i2, i3 + i4, i5);
        a(i - i4, i2, i3 + i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i - i4, i2, i3 - i4, i5);
        a(i + i4, i2, i3 - i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i + i4, i2, i3 - i4, i5);
        a(i - i4, i2, i3 - i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i - i4, i2, i3, i5);
        a(i + i4, i2, i3, i5);
        a(i, i2 - i4, i3, i5);
        a(i + i4, i2, i3, i5);
        a(i - i4, i2, i3, i5);
        a(i, i2 + i4, i3, i5);
        a(i + i4, i2, i3 - i4, i5);
        a(i + i4, i2, i3 + i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i + i4, i2, i3 + i4, i5);
        a(i + i4, i2, i3 - i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i - i4, i2, i3 - i4, i5);
        a(i - i4, i2, i3 + i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i - i4, i2, i3 + i4, i5);
        a(i - i4, i2, i3 - i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i, i2, i3 - i4, i5);
        a(i, i2, i3 + i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i, i2, i3 + i4, i5);
        a(i, i2, i3 - i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i + i4, i2, i3 + i4, i5);
        a(i + i4, i2, i3 - i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i + i4, i2, i3 - i4, i5);
        a(i + i4, i2, i3 + i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i - i4, i2, i3 + i4, i5);
        a(i - i4, i2, i3 - i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i - i4, i2, i3 - i4, i5);
        a(i - i4, i2, i3 + i4, i5);
        a(i, i2 + i4, i3, i5);
        a(i, i2, i3 + i4, i5);
        a(i, i2, i3 - i4, i5);
        a(i, i2 - i4, i3, i5);
        a(i, i2, i3 - i4, i5);
        a(i, i2, i3 + i4, i5);
        a(i, i2 + i4, i3, i5);
        return c;
    }

    public static int[] b(int i, int i2, int i3, int i4, int i5) {
        e = 0;
        b(i + i4, i2, i3 + i4, i5);
        b(i - i4, i2, i3 + i4, i5);
        b(i, i2 - i4, i3, i5);
        b(i - i4, i2, i3 + i4, i5);
        b(i + i4, i2, i3 + i4, i5);
        b(i, i2 + i4, i3, i5);
        b(i + i4, i2, i3 - i4, i5);
        b(i - i4, i2, i3 - i4, i5);
        b(i, i2 - i4, i3, i5);
        b(i - i4, i2, i3 - i4, i5);
        b(i + i4, i2, i3 - i4, i5);
        b(i, i2 + i4, i3, i5);
        b(i + i4, i2, i3, i5);
        b(i - i4, i2, i3, i5);
        b(i, i2 - i4, i3, i5);
        b(i - i4, i2, i3, i5);
        b(i + i4, i2, i3, i5);
        b(i, i2 + i4, i3, i5);
        return d;
    }

    private static final void a(int i, int i2, int i3, int i4) {
        a(c, i, i2, i3, i4);
    }

    private static final void b(int i, int i2, int i3, int i4) {
        a(d, i, i2, i3, i4);
    }

    private static final void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = e;
        e = i5 + 1;
        iArr[i5] = i;
        int i6 = e;
        e = i6 + 1;
        iArr[i6] = i2;
        int i7 = e;
        e = i7 + 1;
        iArr[i7] = i3;
        int i8 = e;
        e = i8 + 1;
        iArr[i8] = i4;
    }
}
