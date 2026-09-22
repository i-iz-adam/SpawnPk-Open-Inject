package rs;

import com.sun.jna.platform.win32.bk;
import com.sun.jna.platform.win32.m;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.util.Hashtable;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_210.class */
public class class_210 extends class_329 {
    private static final ColorModel q = new DirectColorModel(32, bk.aS, bk.ao, 255);
    public static float[] f;
    public static int[] g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;

    public static void a(int i2, int i3, int[] iArr, float[] fArr) {
        g = iArr;
        h = i2;
        i = i3;
        c(i3, 0, i2, 0);
        if (!Configuration.av || fArr == null) {
            return;
        }
        class_332.k = fArr;
        f = fArr;
    }

    public static void a(int i2, int i3, int[] iArr) {
        g = iArr;
        h = i2;
        i = i3;
        c(i3, 0, i2, 0);
        if (Configuration.av) {
            class_332.k = f;
        }
    }

    public static void a(int[] iArr, int i2, int i3, int i4, int i5) {
        if (!e.a()) {
            iArr[i2] = i3;
            return;
        }
        if (i5 <= 0 || i2 >= iArr.length || i2 < 0) {
            return;
        }
        int i6 = iArr[i2];
        if ((i6 & m.bG) == 0 || i5 == 255) {
            iArr[i2] = (i4 & class_492.c) | (i5 << 24);
            return;
        }
        if ((i6 & m.bG) == -16777216) {
            iArr[i2] = i3 | m.bG;
            return;
        }
        int i7 = ((i6 >>> 24) * (255 - i5)) >>> 8;
        int i8 = i5 + i7;
        int i9 = (i5 << 8) / i8;
        int i10 = (i7 << 8) / i8;
        iArr[i2] = ((((((i4 & 16711935) * i9) + ((i6 & 16711935) * i10)) & (-16711936)) | ((((i4 & bk.ao) * i9) + ((i6 & bk.ao) * i10)) & bk.aS)) >>> 8) | (i8 << 24);
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        b(i5, i3, i2, i6, i4, i7);
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 256 - i8;
        if (i4 < l) {
            i6 -= l - i4;
            i4 = l;
        }
        if (i3 < j) {
            i2 -= j - i3;
            i3 = j;
        }
        if (i4 + i6 > m) {
            i6 = m - i4;
        }
        if (i3 + i2 > k) {
            i2 = k - i3;
        }
        int i10 = h - i6;
        int i11 = i4 + (i3 * h);
        if (i7 != 0) {
            p = -374;
        }
        for (int i12 = -i2; i12 < 0; i12++) {
            for (int i13 = -i6; i13 < 0; i13++) {
                int i14 = g[i11];
                int i15 = i11;
                i11++;
                a(g, i15, (((((i5 & 16711935) * i8) + ((i14 & 16711935) * i9)) & (-16711936)) + ((((i5 & bk.ao) * i8) + ((i14 & bk.ao) * i9)) & bk.aS)) >> 8, (((((i5 & 16711935) * i8) + ((i14 & 16711935) * i9)) & (-16711936)) + ((((i5 & bk.ao) * i8) + ((i14 & bk.ao) * i9)) & bk.aS)) >> 8, i8);
            }
            i11 += i10;
        }
    }

    public static void b(int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 256 - i7;
        if (i4 < l) {
            i6 -= l - i4;
            i4 = l;
        }
        if (i3 < j) {
            i2 -= j - i3;
            i3 = j;
        }
        if (i4 + i6 > m) {
            i6 = m - i4;
        }
        if (i3 + i2 > k) {
            i2 = k - i3;
        }
        int i9 = h - i6;
        int i10 = i4 + (i3 * h);
        for (int i11 = -i2; i11 < 0; i11++) {
            for (int i12 = -i6; i12 < 0; i12++) {
                int i13 = g[i10];
                int i14 = i10;
                i10++;
                a(g, i14, (((((i5 & 16711935) * i7) + ((i13 & 16711935) * i8)) & (-16711936)) + ((((i5 & bk.ao) * i7) + ((i13 & bk.ao) * i8)) & bk.aS)) >> 8, (((((i5 & 16711935) * i7) + ((i13 & 16711935) * i8)) & (-16711936)) + ((((i5 & bk.ao) * i7) + ((i13 & bk.ao) * i8)) & bk.aS)) >> 8, i7);
            }
            i10 += i9;
        }
    }

    public static void a(int i2, int i3, int i4, int i5) {
        if (i3 < j || i3 >= k) {
            return;
        }
        if (i2 < l) {
            i4 -= l - i2;
            i2 = l;
        }
        if (i2 + i4 > m) {
            i4 = m - i2;
        }
        int i6 = i2 + (i3 * h);
        for (int i7 = 0; i7 < i4; i7++) {
            a(g, i6 + i7, i5, i5, 255);
        }
    }

    public static void b(int i2, int i3, int i4, int i5) {
        if (i3 <= j || i3 >= k) {
            return;
        }
        if (i2 < l) {
            i4 -= l - i2;
            i2 = l;
        }
        if (i2 + i4 > m) {
            i4 = m - i2;
        }
        int i6 = i2 + (i3 * h);
        for (int i7 = 0; i7 < i4; i7++) {
            a(g, i6 + i7, i5, i5, 255);
        }
    }

    public static void c() {
        l = 0;
        j = 0;
        m = h;
        k = i;
        n = m - 1;
        o = m / 2;
    }

    public static void c(int i2, int i3, int i4, int i5) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i4 > h) {
            i4 = h;
        }
        if (i2 > i) {
            i2 = i;
        }
        l = i3;
        j = i5;
        m = i4;
        k = i2;
        n = m - 1;
        o = m / 2;
        p = k / 2;
    }

    public static void d() {
        int i2 = h * i;
        for (int i3 = 0; i3 < i2 && i3 < g.length; i3++) {
            g[i3] = 0;
            if (Configuration.av && i3 < f.length) {
                f[i3] = Float.MAX_VALUE;
            }
        }
    }

    public static void c(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i7 < l) {
            i4 -= l - i7;
            i7 = l;
        }
        if (i3 < j) {
            i5 -= j - i3;
            i3 = j;
        }
        if (i7 + i4 > m) {
            i4 = m - i7;
        }
        if (i3 + i5 > k) {
            i5 = k - i3;
        }
        int i8 = 256 - i6;
        int i9 = ((i2 >> 16) & 255) * i6;
        int i10 = ((i2 >> 8) & 255) * i6;
        int i11 = (i2 & 255) * i6;
        int i12 = h - i4;
        int i13 = i7 + (i3 * h);
        for (int i14 = 0; i14 < i5; i14++) {
            for (int i15 = -i4; i15 < 0; i15++) {
                int i16 = (((i9 + (((g[i13] >> 16) & 255) * i8)) >> 8) << 16) + (((i10 + (((g[i13] >> 8) & 255) * i8)) >> 8) << 8) + ((i11 + ((g[i13] & 255) * i8)) >> 8);
                int i17 = i13;
                i13++;
                a(g, i17, i16, i16, 255);
            }
            i13 += i12;
        }
    }

    public static Graphics2D a(int[] iArr, int i2, int i3) {
        return new BufferedImage(q, Raster.createWritableRaster(q.createCompatibleSampleModel(i2, i3), new DataBufferInt(iArr, i2 * i3), (Point) null), false, new Hashtable()).createGraphics();
    }

    public static void d(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < l) {
            i4 -= l - i2;
            i2 = l;
        }
        if (i3 < j) {
            i5 -= j - i3;
            i3 = j;
        }
        if (i2 + i4 > m) {
            i4 = m - i2;
        }
        if (i3 + i5 > k) {
            i5 = k - i3;
        }
        int i8 = 256 - i7;
        int i9 = ((i6 >> 16) & 255) * i7;
        int i10 = ((i6 >> 8) & 255) * i7;
        int i11 = (i6 & 255) * i7;
        int i12 = h - i4;
        int i13 = i2 + (i3 * h);
        for (int i14 = 0; i14 < i5; i14++) {
            for (int i15 = -i4; i15 < 0; i15++) {
                int i16 = (((i9 + (((g[i13] >> 16) & 255) * i8)) >> 8) << 16) + (((i10 + (((g[i13] >> 8) & 255) * i8)) >> 8) << 8) + ((i11 + ((g[i13] & 255) * i8)) >> 8);
                int i17 = i13;
                i13++;
                a(g, i17, i16, i16, i7);
            }
            i13 += i12;
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6) {
        if (i4 < l) {
            i6 -= l - i4;
            i4 = l;
        }
        if (i3 < j) {
            i2 -= j - i3;
            i3 = j;
        }
        if (i4 + i6 > m) {
            i6 = m - i4;
        }
        if (i3 + i2 > k) {
            i2 = k - i3;
        }
        int i7 = h - i6;
        int i8 = i4 + (i3 * h);
        for (int i9 = -i2; i9 < 0; i9++) {
            for (int i10 = -i6; i10 < 0; i10++) {
                int i11 = i8;
                i8++;
                a(g, i11, i5, i5, 255);
            }
            i8 += i7;
        }
    }

    public static int a(int i2, int i3, int i4) {
        int i5 = 256 - i4;
        int i6 = g[i3];
        return (((((i2 & 16711935) * i4) + ((i6 & 16711935) * i5)) & (-16711936)) + ((((i2 & bk.ao) * i4) + ((i6 & bk.ao) * i5)) & bk.aS)) >> 8;
    }

    public static void e(int i2, int i3, int i4, int i5, int i6, int i7) {
        b(i6, i5, i3, i2, i7);
        b((i6 + i4) - 1, i5, i3, i2, i7);
        c(i6, i5, i4, i2, i7);
        c(i6, i5, i4, (i2 + i3) - 1, i7);
    }

    public static void b(int i2, int i3, int i4, int i5, int i6) {
        if (i2 < j || i2 >= k) {
            return;
        }
        if (i5 < l) {
            i4 -= l - i5;
            i5 = l;
        }
        if (i5 + i4 > m) {
            i4 = m - i5;
        }
        int i7 = i5 + (i2 * h);
        for (int i8 = 0; i8 < i4; i8++) {
            a(g, i7 + i8, a(i3, i7 + i8, i6), a(i3, i7 + i8, i6), i6);
        }
    }

    public static void c(int i2, int i3, int i4, int i5, int i6) {
        if (i5 < l || i5 >= m) {
            return;
        }
        if (i2 < j) {
            i4 -= j - i2;
            i2 = j;
        }
        if (i2 + i4 > k) {
            i4 = k - i2;
        }
        int i7 = i5 + (i2 * h);
        for (int i8 = 0; i8 < i4; i8++) {
            a(g, i7 + (i8 * h), a(i3, i7 + (i8 * h), i6), a(i3, i7 + (i8 * h), i6), i6);
        }
    }

    public static void d(int i2, int i3, int i4, int i5, int i6) {
        b(i2, i6, i3, i5);
        b(i2, (i6 + i4) - 1, i3, i5);
        d(i6, i5, i4, i2);
        d(i6, i5, i4, (i2 + i3) - 1);
    }

    public static void f(int i2, int i3, int i4, int i5, int i6, int i7) {
        f(i5, i6, i2, i4, i7);
        f(i5, i6, (i2 + i3) - 1, i4, i7);
        if (i3 >= 3) {
            g(i5, i7, i4, i2 + 1, i3 - 2);
            g(i5, (i7 + i6) - 1, i4, i2 + 1, i3 - 2);
        }
    }

    private static void f(int i2, int i3, int i4, int i5, int i6) {
        if (i4 < j || i4 >= k) {
            return;
        }
        if (i6 < l) {
            i3 -= l - i6;
            i6 = l;
        }
        if (i6 + i3 > m) {
            i3 = m - i6;
        }
        int i7 = 256 - i5;
        int i8 = ((i2 >> 16) & 255) * i5;
        int i9 = ((i2 >> 8) & 255) * i5;
        int i10 = (i2 & 255) * i5;
        int i11 = i6 + (i4 * h);
        for (int i12 = 0; i12 < i3; i12++) {
            int i13 = (((i8 + (((g[i11] >> 16) & 255) * i7)) >> 8) << 16) + (((i9 + (((g[i11] >> 8) & 255) * i7)) >> 8) << 8) + ((i10 + ((g[i11] & 255) * i7)) >> 8);
            int i14 = i11;
            i11++;
            a(g, i14, i13, i13, i5);
        }
    }

    public static void d(int i2, int i3, int i4, int i5) {
        if (i5 < l || i5 >= m) {
            return;
        }
        if (i2 < j) {
            i4 -= j - i2;
            i2 = j;
        }
        if (i2 + i4 > k) {
            i4 = k - i2;
        }
        int i6 = i5 + (i2 * h);
        for (int i7 = 0; i7 < i4; i7++) {
            a(g, i6 + (i7 * h), i3, i3, 255);
        }
    }

    private static void g(int i2, int i3, int i4, int i5, int i6) {
        if (i3 < l || i3 >= m) {
            return;
        }
        if (i5 < j) {
            i6 -= j - i5;
            i5 = j;
        }
        if (i5 + i6 > k) {
            i6 = k - i5;
        }
        int i7 = 256 - i4;
        int i8 = ((i2 >> 16) & 255) * i4;
        int i9 = ((i2 >> 8) & 255) * i4;
        int i10 = (i2 & 255) * i4;
        int i11 = i3 + (i5 * h);
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = (((i8 + (((g[i11] >> 16) & 255) * i7)) >> 8) << 16) + (((i9 + (((g[i11] >> 8) & 255) * i7)) >> 8) << 8) + ((i10 + ((g[i11] & 255) * i7)) >> 8);
            int[] iArr = g;
            int i14 = i11 + h;
            a(iArr, i14, i13, i13, i4);
            i11 = i14 + h;
        }
    }

    public static void e(int i2, int i3, int i4, int i5, int i6) {
        a(i2, i3, i4, i5, i6, false);
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (i2 < l) {
            i4 -= l - i2;
            i2 = l;
        }
        if (i3 < j) {
            i5 -= j - i3;
            i3 = j;
        }
        if (i2 + i4 > m) {
            i4 = m - i2;
        }
        if (i3 + i5 > k) {
            i5 = k - i3;
        }
        int i7 = h - i4;
        int i8 = i2 + (i3 * h);
        for (int i9 = -i5; i9 < 0; i9++) {
            for (int i10 = -i4; i10 < 0; i10++) {
                int i11 = i8;
                i8++;
                a(g, i11, i6, i6, z ? 0 : 255);
            }
            i8 += i7;
        }
    }

    class_210() {
    }
}
