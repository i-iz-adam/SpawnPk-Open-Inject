package rs;

import com.sun.jna.platform.win32.bk;

/* JADX INFO: loaded from: client-final.jar:rs/class_339.class */
public class class_339 extends class_210 {
    public static int q;
    public static int[] s;
    public static int u;
    public static int[] v;
    public static int[] y;
    public static int x = 0;
    public static int r = 0;
    public static int t = 0;
    public static int w = 0;

    public static void f(int i, int i2, int i3, int i4, int i5) {
        h(i, i2, i3, i5);
        h(i, (i2 + i4) - 1, i3, i5);
        i(i, i2, i4, i5);
        i((i + i3) - 1, i2, i4, i5);
    }

    public static void e() {
        t = 0;
        w = 0;
        r = u;
        x = q;
        h();
    }

    public static void g(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                h(i, i2, i6 + 1, i5);
                return;
            } else {
                h(i + i6, i2, (-i6) + 1, i5);
                return;
            }
        }
        if (i6 == 0) {
            if (i7 >= 0) {
                i(i, i2, i7 + 1, i5);
                return;
            } else {
                i(i, i2 + i7, (-i7) + 1, i5);
                return;
            }
        }
        if (i6 + i7 < 0) {
            i += i6;
            i6 = -i6;
            i2 += i7;
            i7 = -i7;
        }
        if (i6 > i7) {
            int i8 = (i2 << 16) + 32768;
            int iFloor = (int) Math.floor((((double) (i7 << 16)) / ((double) i6)) + 0.5d);
            int i9 = i6 + i;
            if (i < t) {
                i8 += iFloor * (t - i);
                i = t;
            }
            if (i9 >= r) {
                i9 = r - 1;
            }
            while (i <= i9) {
                int i10 = i8 >> 16;
                if (i10 >= w && i10 < x) {
                    v[i + (i10 * i9)] = i5;
                }
                i8 += iFloor;
                i++;
            }
            return;
        }
        int i11 = (i << 16) + 32768;
        int i12 = i6 << 16;
        int iFloor2 = (int) Math.floor((((double) i12) / ((double) i7)) + 0.5d);
        int i13 = i7 + i2;
        if (i2 < w) {
            i11 += iFloor2 * (w - i2);
            i2 = w;
        }
        if (i13 >= x) {
            i13 = x - 1;
        }
        while (i2 <= i13) {
            int i14 = i11 >> 16;
            if (i14 >= t && i14 < r) {
                v[i14 + (i2 * i12)] = i5;
            }
            i11 += iFloor2;
            i2++;
        }
    }

    public static void f() {
        int i = 0;
        int i2 = (u * q) - 7;
        while (i < i2) {
            int i3 = i;
            int i4 = i + 1;
            v[i3] = 0;
            int i5 = i4 + 1;
            v[i4] = 0;
            int i6 = i5 + 1;
            v[i5] = 0;
            int i7 = i6 + 1;
            v[i6] = 0;
            int i8 = i7 + 1;
            v[i7] = 0;
            int i9 = i8 + 1;
            v[i8] = 0;
            int i10 = i9 + 1;
            v[i9] = 0;
            i = i10 + 1;
            v[i10] = 0;
        }
        int i11 = i2 + 7;
        while (i < i11) {
            int i12 = i;
            i++;
            v[i12] = 0;
        }
    }

    public static void a(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = i + (i2 * u);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = i4 + iArr[i5];
            for (int i7 = -iArr2[i5]; i7 < 0; i7++) {
                int i8 = i6;
                i6++;
                v[i8] = i3;
            }
            i4 += u;
        }
    }

    public static void g() {
        v = null;
        s = null;
        y = null;
    }

    public static void h(int i, int i2, int i3, int i4, int i5) {
        if (i < t || i >= r) {
            return;
        }
        if (i2 < w) {
            i3 -= w - i2;
            i2 = w;
        }
        if (i2 + i3 > x) {
            i3 = x - i2;
        }
        int i6 = 256 - i5;
        int i7 = ((i4 >> 16) & 255) * i5;
        int i8 = ((i4 >> 8) & 255) * i5;
        int i9 = (i4 & 255) * i5;
        int i10 = i + (i2 * u);
        for (int i11 = 0; i11 < i3; i11++) {
            v[i10] = (((i7 + (((v[i10] >> 16) & 255) * i6)) >> 8) << 16) + (((i8 + (((v[i10] >> 8) & 255) * i6)) >> 8) << 8) + ((i9 + ((v[i10] & 255) * i6)) >> 8);
            i10 += u;
        }
    }

    public static void a(int[] iArr) {
        t = iArr[0];
        w = iArr[1];
        r = iArr[2];
        x = iArr[3];
        h();
    }

    public static void b(int i, int i2, int i3) {
        if (i < t || i2 < w || i >= r || i2 >= x) {
            return;
        }
        v[i + (i2 * u)] = i3;
    }

    public static void a(int[] iArr, int[] iArr2) {
        if (iArr.length != x - w || iArr2.length != x - w) {
            throw new IllegalArgumentException();
        }
        s = iArr;
        y = iArr2;
    }

    public static void e(int i, int i2, int i3, int i4) {
        if (i3 == 0) {
            b(i, i2, i4);
            return;
        }
        if (i3 < 0) {
            i3 = -i3;
        }
        int i5 = i2 - i3;
        if (i5 < w) {
            i5 = w;
        }
        int i6 = i2 + i3 + 1;
        if (i6 > x) {
            i6 = x;
        }
        int i7 = i5;
        int i8 = i3 * i3;
        int i9 = 0;
        int i10 = i2 - i7;
        int i11 = i10 * i10;
        int i12 = i11 - i10;
        if (i2 > i6) {
            i2 = i6;
        }
        while (i7 < i2) {
            while (true) {
                if (i12 > i8 && i11 > i8) {
                    break;
                }
                i11 += i9 + i9;
                int i13 = i9;
                i9++;
                i12 += i13 + i9;
            }
            int i14 = (i - i9) + 1;
            if (i14 < t) {
                i14 = t;
            }
            int i15 = i + i9;
            if (i15 > r) {
                i15 = r;
            }
            int i16 = i14 + (i7 * u);
            for (int i17 = i14; i17 < i15; i17++) {
                int i18 = i16;
                i16++;
                v[i18] = i4;
            }
            i7++;
            int i19 = i10;
            i10--;
            i11 -= i19 + i10;
            i12 -= i10 + i10;
        }
        int i20 = i3;
        int i21 = i7 - i2;
        int i22 = (i21 * i21) + i8;
        int i23 = i22 - i20;
        int i24 = i22 - i21;
        while (i7 < i6) {
            while (i24 > i8 && i23 > i8) {
                int i25 = i20;
                i20--;
                i24 -= i25 + i20;
                i23 -= i20 + i20;
            }
            int i26 = i - i20;
            if (i26 < t) {
                i26 = t;
            }
            int i27 = i + i20;
            if (i27 > r - 1) {
                i27 = r - 1;
            }
            int i28 = i26 + (i7 * u);
            for (int i29 = i26; i29 <= i27; i29++) {
                int i30 = i28;
                i28++;
                v[i30] = i4;
            }
            i7++;
            i24 += i21 + i21;
            int i31 = i21;
            i21++;
            i23 += i31 + i21;
        }
    }

    public static void f(int i, int i2, int i3, int i4) {
        if (t < i) {
            t = i;
        }
        if (w < i2) {
            w = i2;
        }
        if (r > i3) {
            r = i3;
        }
        if (x > i4) {
            x = i4;
        }
        h();
    }

    public static void g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > u) {
            i3 = u;
        }
        if (i4 > q) {
            i4 = q;
        }
        t = i;
        w = i2;
        r = i3;
        x = i4;
        h();
    }

    public static void h(int i, int i2, int i3, int i4) {
        if (i2 < w || i2 >= x) {
            return;
        }
        if (i < t) {
            i3 -= t - i;
            i = t;
        }
        if (i + i3 > r) {
            i3 = r - i;
        }
        int i5 = i + (i2 * u);
        for (int i6 = 0; i6 < i3; i6++) {
            v[i5 + i6] = i4;
        }
    }

    public static void i(int i, int i2, int i3, int i4, int i5) {
        if (i2 < w || i2 >= x) {
            return;
        }
        if (i < t) {
            i3 -= t - i;
            i = t;
        }
        if (i + i3 > r) {
            i3 = r - i;
        }
        int i6 = 256 - i5;
        int i7 = ((i4 >> 16) & 255) * i5;
        int i8 = ((i4 >> 8) & 255) * i5;
        int i9 = (i4 & 255) * i5;
        int i10 = i + (i2 * u);
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = (((i7 + (((v[i10] >> 16) & 255) * i6)) >> 8) << 16) + (((i8 + (((v[i10] >> 8) & 255) * i6)) >> 8) << 8) + ((i9 + ((v[i10] & 255) * i6)) >> 8);
            int i13 = i10;
            i10++;
            v[i13] = i12;
        }
    }

    public static void i(int i, int i2, int i3, int i4) {
        if (i < t || i >= r) {
            return;
        }
        if (i2 < w) {
            i3 -= w - i2;
            i2 = w;
        }
        if (i2 + i3 > x) {
            i3 = x - i2;
        }
        int i5 = i + (i2 * u);
        for (int i6 = 0; i6 < i3; i6++) {
            v[i5 + (i6 * u)] = i4;
        }
    }

    public static void b(int[] iArr, int i, int i2) {
        v = iArr;
        u = i;
        q = i2;
        g(0, 0, i, i2);
    }

    public static void g(int i, int i2, int i3, int i4, int i5, int i6) {
        i(i, i2, i3, i5, i6);
        i(i, (i2 + i4) - 1, i3, i5, i6);
        if (i4 >= 3) {
            h(i, i2 + 1, i4 - 2, i5, i6);
            h((i + i3) - 1, i2 + 1, i4 - 2, i5, i6);
        }
    }

    public static void j(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 == 256) {
                e(i, i2, i3, i4);
                return;
            }
            if (i3 < 0) {
                i3 = -i3;
            }
            int i6 = 256 - i5;
            int i7 = ((i4 >> 16) & 255) * i5;
            int i8 = ((i4 >> 8) & 255) * i5;
            int i9 = (i4 & 255) * i5;
            int i10 = i2 - i3;
            if (i10 < w) {
                i10 = w;
            }
            int i11 = i2 + i3 + 1;
            if (i11 > x) {
                i11 = x;
            }
            int i12 = i10;
            int i13 = i3 * i3;
            int i14 = 0;
            int i15 = i2 - i12;
            int i16 = i15 * i15;
            int i17 = i16 - i15;
            if (i2 > i11) {
                i2 = i11;
            }
            while (i12 < i2) {
                while (true) {
                    if (i17 > i13 && i16 > i13) {
                        break;
                    }
                    i16 += i14 + i14;
                    int i18 = i14;
                    i14++;
                    i17 += i18 + i14;
                }
                int i19 = (i - i14) + 1;
                if (i19 < t) {
                    i19 = t;
                }
                int i20 = i + i14;
                if (i20 > r) {
                    i20 = r;
                }
                int i21 = i19 + (i12 * u);
                for (int i22 = i19; i22 < i20; i22++) {
                    int i23 = (((i7 + (((v[i21] >> 16) & 255) * i6)) >> 8) << 16) + (((i8 + (((v[i21] >> 8) & 255) * i6)) >> 8) << 8) + ((i9 + ((v[i21] & 255) * i6)) >> 8);
                    int i24 = i21;
                    i21++;
                    v[i24] = i23;
                }
                i12++;
                int i25 = i15;
                i15--;
                i16 -= i25 + i15;
                i17 -= i15 + i15;
            }
            int i26 = i3;
            int i27 = -i15;
            int i28 = (i27 * i27) + i13;
            int i29 = i28 - i26;
            int i30 = i28 - i27;
            while (i12 < i11) {
                while (i30 > i13 && i29 > i13) {
                    int i31 = i26;
                    i26--;
                    i30 -= i31 + i26;
                    i29 -= i26 + i26;
                }
                int i32 = i - i26;
                if (i32 < t) {
                    i32 = t;
                }
                int i33 = i + i26;
                if (i33 > r - 1) {
                    i33 = r - 1;
                }
                int i34 = i32 + (i12 * u);
                for (int i35 = i32; i35 <= i33; i35++) {
                    int i36 = (((i7 + (((v[i34] >> 16) & 255) * i6)) >> 8) << 16) + (((i8 + (((v[i34] >> 8) & 255) * i6)) >> 8) << 8) + ((i9 + ((v[i34] & 255) * i6)) >> 8);
                    int i37 = i34;
                    i34++;
                    v[i37] = i36;
                }
                i12++;
                i30 += i27 + i27;
                int i38 = i27;
                i27++;
                i29 += i38 + i27;
            }
        }
    }

    public static void h(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < t) {
            i3 -= t - i;
            i = t;
        }
        if (i2 < w) {
            i4 -= w - i2;
            i2 = w;
        }
        if (i + i3 > r) {
            i3 = r - i;
        }
        if (i2 + i4 > x) {
            i4 = x - i2;
        }
        int i7 = ((((i5 & 16711935) * i6) >> 8) & 16711935) + ((((i5 & bk.ao) * i6) >> 8) & bk.ao);
        int i8 = 256 - i6;
        int i9 = u - i3;
        int i10 = i + (i2 * u);
        for (int i11 = 0; i11 < i4; i11++) {
            for (int i12 = -i3; i12 < 0; i12++) {
                int i13 = v[i10];
                int i14 = i10;
                i10++;
                v[i14] = i7 + ((((i13 & 16711935) * i8) >> 8) & 16711935) + ((((i13 & bk.ao) * i8) >> 8) & bk.ao);
            }
            i10 += i9;
        }
    }

    public static void b(int[] iArr) {
        iArr[0] = t;
        iArr[1] = w;
        iArr[2] = r;
        iArr[3] = x;
    }

    public static void i(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 65536 / i4;
        if (i < t) {
            i3 -= t - i;
            i = t;
        }
        if (i2 < w) {
            i7 = 0 + ((w - i2) * i8);
            i4 -= w - i2;
            i2 = w;
        }
        if (i + i3 > r) {
            i3 = r - i;
        }
        if (i2 + i4 > x) {
            i4 = x - i2;
        }
        int i9 = u - i3;
        int i10 = i + (i2 * u);
        for (int i11 = -i4; i11 < 0; i11++) {
            int i12 = (65536 - i7) >> 8;
            int i13 = i7 >> 8;
            int i14 = (((((i5 & 16711935) * i12) + ((i6 & 16711935) * i13)) & (-16711936)) + ((((i5 & bk.ao) * i12) + ((i6 & bk.ao) * i13)) & bk.aS)) >>> 8;
            for (int i15 = -i3; i15 < 0; i15++) {
                int i16 = i10;
                i10++;
                v[i16] = i14;
            }
            i10 += i9;
            i7 += i8;
        }
    }

    public static void h() {
        s = null;
        y = null;
    }

    public static void k(int i, int i2, int i3, int i4, int i5) {
        if (i < t) {
            i3 -= t - i;
            i = t;
        }
        if (i2 < w) {
            i4 -= w - i2;
            i2 = w;
        }
        if (i + i3 > r) {
            i3 = r - i;
        }
        if (i2 + i4 > x) {
            i4 = x - i2;
        }
        int i6 = u - i3;
        int i7 = i + (i2 * u);
        for (int i8 = -i4; i8 < 0; i8++) {
            for (int i9 = -i3; i9 < 0; i9++) {
                int i10 = i7;
                i7++;
                v[i10] = i5;
            }
            i7 += i6;
        }
    }
}
