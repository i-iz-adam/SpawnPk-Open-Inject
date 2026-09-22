package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_656.class */
final class class_656 {
    private class_653 c;
    private class_653 d;
    private class_653 e;
    private class_653 f;
    private class_653 g;
    private class_653 h;
    private class_653 i;
    private class_653 j;
    private int n;
    private class_654 p;
    private class_653 q;
    int b;
    private static int[] r;
    private static int[] s;
    private static int[] t;
    private static final int[] u = new int[5];
    private static final int[] v = new int[5];
    private static final int[] w = new int[5];
    private static final int[] x = new int[5];
    private static final int[] y = new int[5];
    private final int[] k = new int[5];
    private final int[] l = new int[5];
    private final int[] m = new int[5];
    private int o = 100;
    int a = 500;

    public static void a() {
        s = new int[32768];
        for (int i = 0; i < 32768; i++) {
            if (Math.random() > 0.5d) {
                s[i] = 1;
            } else {
                s[i] = -1;
            }
        }
        t = new int[32768];
        for (int i2 = 0; i2 < 32768; i2++) {
            t[i2] = (int) (Math.sin(((double) i2) / 5215.1903d) * 16384.0d);
        }
        r = new int[220500];
    }

    public int[] a(int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < i; i4++) {
            r[i4] = 0;
        }
        if (i2 < 10) {
            return r;
        }
        double d = ((double) i) / ((double) i2);
        this.c.a();
        this.d.a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        if (this.e != null) {
            this.e.a();
            this.f.a();
            i5 = (int) ((((double) (this.e.b - this.e.a)) * 32.768d) / d);
            i6 = (int) ((((double) this.e.a) * 32.768d) / d);
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        if (this.g != null) {
            this.g.a();
            this.h.a();
            i8 = (int) ((((double) (this.g.b - this.g.a)) * 32.768d) / d);
            i9 = (int) ((((double) this.g.a) * 32.768d) / d);
        }
        for (int i11 = 0; i11 < 5; i11++) {
            if (this.k[i11] != 0) {
                u[i11] = 0;
                v[i11] = (int) (((double) this.m[i11]) * d);
                w[i11] = (this.k[i11] << 14) / 100;
                x[i11] = (int) (((((double) (this.c.b - this.c.a)) * 32.768d) * Math.pow(1.0057929410678534d, this.l[i11])) / d);
                y[i11] = (int) ((((double) this.c.a) * 32.768d) / d);
            }
        }
        for (int i12 = 0; i12 < i; i12++) {
            int iA = this.c.a(i);
            int iA2 = this.d.a(i);
            if (this.e != null) {
                int iA3 = this.e.a(i);
                iA += a(this.f.a(i), i7, this.e.c) >> 1;
                i7 += ((iA3 * i5) >> 16) + i6;
            }
            if (this.g != null) {
                int iA4 = this.g.a(i);
                iA2 = (iA2 * ((a(this.h.a(i), i10, this.g.c) >> 1) + 32768)) >> 15;
                i10 += ((iA4 * i8) >> 16) + i9;
            }
            for (int i13 = 0; i13 < 5; i13++) {
                if (this.k[i13] != 0 && (i3 = i12 + v[i13]) < i) {
                    int[] iArr = r;
                    iArr[i3] = iArr[i3] + a((iA2 * w[i13]) >> 15, u[i13], this.c.c);
                    int[] iArr2 = u;
                    int i14 = i13;
                    iArr2[i14] = iArr2[i14] + ((iA * x[i13]) >> 16) + y[i13];
                }
            }
        }
        if (this.i != null) {
            this.i.a();
            this.j.a();
            int i15 = 0;
            boolean z = true;
            for (int i16 = 0; i16 < i; i16++) {
                i15 += 256;
                if (i15 >= (z ? this.i.a + (((this.i.b - this.i.a) * this.i.a(i)) >> 8) : this.i.a + (((this.i.b - this.i.a) * this.j.a(i)) >> 8))) {
                    i15 = 0;
                    z = !z;
                }
                if (z) {
                    r[i16] = 0;
                }
            }
        }
        if (this.n > 0 && this.o > 0) {
            int i17 = (int) (((double) this.n) * d);
            for (int i18 = i17; i18 < i; i18++) {
                int[] iArr3 = r;
                int i19 = i18;
                iArr3[i19] = iArr3[i19] + ((r[i18 - i17] * this.o) / 100);
            }
        }
        if (this.p.a[0] > 0 || this.p.a[1] > 0) {
            this.q.a();
            int iA5 = this.q.a(i + 1);
            int iA6 = this.p.a(0, iA5 / 65536.0f);
            int iA7 = this.p.a(1, iA5 / 65536.0f);
            if (i >= iA6 + iA7) {
                int i20 = 0;
                int i21 = iA7;
                if (i21 > i - iA6) {
                    i21 = i - iA6;
                }
                while (i20 < i21) {
                    int i22 = (int) ((((long) r[i20 + iA6]) * ((long) class_654.c)) >> 16);
                    for (int i23 = 0; i23 < iA6; i23++) {
                        i22 += (int) ((((long) r[((i20 + iA6) - 1) - i23]) * ((long) class_654.b[0][i23])) >> 16);
                    }
                    for (int i24 = 0; i24 < i20; i24++) {
                        i22 -= (int) ((((long) r[(i20 - 1) - i24]) * ((long) class_654.b[1][i24])) >> 16);
                    }
                    r[i20] = i22;
                    iA5 = this.q.a(i + 1);
                    i20++;
                }
                int i25 = 128;
                while (true) {
                    int i26 = i25;
                    if (i26 > i - iA6) {
                        i26 = i - iA6;
                    }
                    while (i20 < i26) {
                        int i27 = (int) ((((long) r[i20 + iA6]) * ((long) class_654.c)) >> 16);
                        for (int i28 = 0; i28 < iA6; i28++) {
                            i27 += (int) ((((long) r[((i20 + iA6) - 1) - i28]) * ((long) class_654.b[0][i28])) >> 16);
                        }
                        for (int i29 = 0; i29 < iA7; i29++) {
                            i27 -= (int) ((((long) r[(i20 - 1) - i29]) * ((long) class_654.b[1][i29])) >> 16);
                        }
                        r[i20] = i27;
                        iA5 = this.q.a(i + 1);
                        i20++;
                    }
                    if (i20 >= i - iA6) {
                        break;
                    }
                    iA6 = this.p.a(0, iA5 / 65536.0f);
                    iA7 = this.p.a(1, iA5 / 65536.0f);
                    i25 = i26 + 128;
                }
                while (i20 < i) {
                    int i30 = 0;
                    for (int i31 = (i20 + iA6) - i; i31 < iA6; i31++) {
                        i30 += (int) ((((long) r[((i20 + iA6) - 1) - i31]) * ((long) class_654.b[0][i31])) >> 16);
                    }
                    for (int i32 = 0; i32 < iA7; i32++) {
                        i30 -= (int) ((((long) r[(i20 - 1) - i32]) * ((long) class_654.b[1][i32])) >> 16);
                    }
                    r[i20] = i30;
                    this.q.a(i + 1);
                    i20++;
                }
            }
        }
        for (int i33 = 0; i33 < i; i33++) {
            if (r[i33] < -32768) {
                r[i33] = -32768;
            }
            if (r[i33] > 32767) {
                r[i33] = 32767;
            }
        }
        return r;
    }

    private int a(int i, int i2, int i3) {
        if (i3 == 1) {
            return (i2 & 32767) < 16384 ? i : -i;
        }
        if (i3 == 2) {
            return (t[i2 & 32767] * i) >> 14;
        }
        if (i3 == 3) {
            return (((i2 & 32767) * i) >> 14) - i;
        }
        if (i3 == 4) {
            return s[(i2 / 2607) & 32767] * i;
        }
        return 0;
    }

    public void a(Buffer buffer) {
        int iF;
        this.c = new class_653();
        this.c.a(buffer);
        this.d = new class_653();
        this.d.a(buffer);
        if (buffer.y() != 0) {
            buffer.h--;
            this.e = new class_653();
            this.e.a(buffer);
            this.f = new class_653();
            this.f.a(buffer);
        }
        if (buffer.y() != 0) {
            buffer.h--;
            this.g = new class_653();
            this.g.a(buffer);
            this.h = new class_653();
            this.h.a(buffer);
        }
        if (buffer.y() != 0) {
            buffer.h--;
            this.i = new class_653();
            this.i.a(buffer);
            this.j = new class_653();
            this.j.a(buffer);
        }
        for (int i = 0; i < 10 && (iF = buffer.f()) != 0; i++) {
            this.k[i] = iF;
            this.l[i] = buffer.n();
            this.m[i] = buffer.f();
        }
        this.n = buffer.f();
        this.o = buffer.f();
        this.a = buffer.A();
        this.b = buffer.A();
        this.p = new class_654();
        this.q = new class_653();
        this.p.a(buffer, this.q);
    }
}
