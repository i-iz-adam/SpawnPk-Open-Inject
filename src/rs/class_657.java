package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_657.class */
public final class class_657 {
    private static final class_657[] b = new class_657[105000];
    public static final int[] a = new int[105000];
    private static byte[] c;
    private static Buffer d;
    private final class_656[] e = new class_656[10];
    private int f;
    private int g;

    private class_657() {
    }

    public static void a(Buffer buffer) {
        c = new byte[441000];
        d = new Buffer(c);
        class_656.a();
        while (true) {
            int iA = buffer.A();
            if (iA == 65535) {
                return;
            }
            b[iA] = new class_657();
            b[iA].b(buffer);
            a[iA] = b[iA].a();
        }
    }

    public static Buffer a(int i, int i2) {
        if (b[i2] != null) {
            return b[i2].a(i);
        }
        return null;
    }

    private void b(Buffer buffer) {
        for (int i = 0; i < 10; i++) {
            if (buffer.y() != 0) {
                buffer.h--;
                this.e[i] = new class_656();
                this.e[i].a(buffer);
            }
        }
        this.f = buffer.A();
        this.g = buffer.A();
    }

    private int a() {
        int i = 9999999;
        for (int i2 = 0; i2 < 10; i2++) {
            if (this.e[i2] != null && this.e[i2].b / 20 < i) {
                i = this.e[i2].b / 20;
            }
        }
        if (this.f < this.g && this.f / 20 < i) {
            i = this.f / 20;
        }
        if (i == 9999999 || i == 0) {
            return 0;
        }
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.e[i3] != null) {
                this.e[i3].b -= i * 20;
            }
        }
        if (this.f < this.g) {
            this.f -= i * 20;
            this.g -= i * 20;
        }
        return i;
    }

    private Buffer a(int i) {
        int iB = b(i);
        d.h = 0;
        d.g(1380533830);
        d.h(36 + iB);
        d.g(1463899717);
        d.g(1718449184);
        d.h(16);
        d.e(1);
        d.e(1);
        d.h(22050);
        d.h(22050);
        d.e(1);
        d.e(8);
        d.g(1684108385);
        d.h(iB);
        d.h += iB;
        return d;
    }

    private int b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.e[i3] != null && this.e[i3].a + this.e[i3].b > i2) {
                i2 = this.e[i3].a + this.e[i3].b;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = (22050 * i2) / 1000;
        int i5 = (22050 * this.f) / 1000;
        int i6 = (22050 * this.g) / 1000;
        if (i5 < 0 || i5 > i4 || i6 < 0 || i6 > i4 || i5 >= i6) {
            i = 0;
        }
        int i7 = i4 + ((i6 - i5) * (i - 1));
        for (int i8 = 44; i8 < i7 + 44; i8++) {
            c[i8] = -128;
        }
        for (int i9 = 0; i9 < 10; i9++) {
            if (this.e[i9] != null) {
                int i10 = (this.e[i9].a * 22050) / 1000;
                int i11 = (this.e[i9].b * 22050) / 1000;
                int[] iArrA = this.e[i9].a(i10, this.e[i9].a);
                for (int i12 = 0; i12 < i10; i12++) {
                    byte[] bArr = c;
                    int i13 = i12 + i11 + 44;
                    bArr[i13] = (byte) (bArr[i13] + ((byte) (iArrA[i12] >> 8)));
                }
            }
        }
        if (i > 1) {
            int i14 = i5 + 44;
            int i15 = i6 + 44;
            int i16 = i4 + 44;
            int i17 = i7 + 44;
            int i18 = i17 - i16;
            for (int i19 = i16 - 1; i19 >= i15; i19--) {
                c[i19 + i18] = c[i19];
            }
            for (int i20 = 1; i20 < i; i20++) {
                System.arraycopy(c, i14, c, i14 + ((i15 - i14) * i20), i15 - i14);
            }
            i7 = i17 - 44;
        }
        return i7;
    }
}
