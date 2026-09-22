package rs;

import java.math.BigInteger;

/* JADX INFO: loaded from: client-final.jar:rs/Buffer.class */
public class Buffer extends class_47 {
    public byte[] g;
    public int h;
    public int i;
    public int j;
    public class_551 l;
    public static int m;
    public static boolean f = false;
    private static final BigInteger o = new BigInteger("123170234790352841533577494407893223569302106554965186549402391077147181466197671542829166332684626271320491745377079903632972493287208295934209630330171676570669957737571832140453287345512507359611793323427155597542898117089254383474063942936848736827745480785742742903200182056548823040146163971138329485819");
    private static final BigInteger p = new BigInteger("65537");
    public static final int[] k = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, Client.dn, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, class_492.c, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    public static final class_157 n = new class_157();

    public static Buffer c() {
        synchronized (n) {
            Buffer buffer = null;
            if (m > 0) {
                m--;
                buffer = (Buffer) n.a();
            }
            if (buffer != null) {
                buffer.h = 0;
                return buffer;
            }
            Buffer buffer2 = new Buffer();
            buffer2.h = 0;
            buffer2.g = new byte[Configuration.bs.intValue()];
            return buffer2;
        }
    }

    public Buffer() {
    }

    public int d() {
        int i = 0;
        int iE = e();
        while (true) {
            int i2 = iE;
            if (i2 != 32767) {
                return i + i2;
            }
            i += 32767;
            iE = e();
        }
    }

    public int e() {
        return (this.g[this.h] & 255) < 128 ? y() : o() - 32768;
    }

    public int f() {
        return (this.g[this.h] & 255) < 128 ? y() : A() - 32768;
    }

    public int g() {
        this.h += 3;
        return ((this.g[this.h - 3] & 255) << 16) + ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public byte[] a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr2 = this.g;
            int i2 = this.h;
            this.h = i2 + 1;
            bArr[i] = bArr2[i2];
        }
        return bArr;
    }

    public Buffer(byte[] bArr) {
        this.g = bArr;
        this.h = 0;
    }

    public void b(byte[] bArr) {
        this.g = bArr;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.l = null;
    }

    public void a(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (i + this.l.a());
    }

    public void b(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public int h() {
        return this.h;
    }

    public void i() {
        this.h = 0;
    }

    public final int c(int i) {
        this.h += 3;
        return (255 & (this.g[this.h - 3] << 16)) + (255 & (this.g[this.h - 2] << 8)) + (255 & this.g[this.h - 1]);
    }

    public int j() {
        return 1795;
    }

    public int k() {
        return -263;
    }

    public int l() {
        this.h += 2;
        return ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public int m() {
        this.h += 4;
        return ((this.g[this.h - 4] & 255) << 24) + ((this.g[this.h - 3] & 255) << 16) + ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public int n() {
        try {
            return (this.g[this.h] & 255) < 128 ? y() - 64 : A() - 49152;
        } catch (Exception e) {
            return -1;
        }
    }

    public int o() {
        this.h += 2;
        return ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public int p() {
        this.h += 4;
        return ((this.g[this.h - 4] & 255) << 24) + ((this.g[this.h - 3] & 255) << 16) + ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public int q() {
        this.h += 2;
        int i = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
        if (i > 60000) {
            i = (-65535) + i;
        }
        return i;
    }

    public int r() {
        this.h += 4;
        return ((this.g[this.h - 4] & 255) << 24) + ((this.g[this.h - 3] & 255) << 16) + ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public float s() {
        return Float.intBitsToFloat(r());
    }

    public int t() {
        return (this.g[this.h] & 255) < 128 ? y() - 64 : o() - 49152;
    }

    public int u() {
        this.h += 2;
        int i = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
        if (i > 32767) {
            i -= 65536;
        }
        return i;
    }

    public int v() {
        int i = 0;
        while (true) {
            int iF = f();
            if (iF != 32767) {
                return i + iF;
            }
            i += 32767;
        }
    }

    public String w() {
        byte[] bArr;
        int i;
        int i2 = this.h;
        do {
            bArr = this.g;
            i = this.h;
            this.h = i + 1;
        } while (bArr[i] != 0);
        return new String(this.g, i2, (this.h - i2) - 1);
    }

    public int x() {
        this.h += 2;
        int i = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
        if (i > 60000) {
            i = (-65535) + i;
        }
        return i;
    }

    public void d(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public void e(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) i;
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
    }

    public void f(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (i >> 16);
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
        byte[] bArr3 = this.g;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = (byte) i;
    }

    public void g(int i) {
        if (i == 42333) {
            i = 95233;
        }
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i >> 16);
        byte[] bArr3 = this.g;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = (byte) (i >> 8);
        byte[] bArr4 = this.g;
        int i5 = this.h;
        this.h = i5 + 1;
        bArr4[i5] = (byte) i;
    }

    public void h(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) i;
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
        byte[] bArr3 = this.g;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = (byte) (i >> 16);
        byte[] bArr4 = this.g;
        int i5 = this.h;
        this.h = i5 + 1;
        bArr4[i5] = (byte) (i >> 24);
    }

    public void a(long j) {
        try {
            byte[] bArr = this.g;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = (byte) (j >> 56);
            byte[] bArr2 = this.g;
            int i2 = this.h;
            this.h = i2 + 1;
            bArr2[i2] = (byte) (j >> 48);
            byte[] bArr3 = this.g;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr3[i3] = (byte) (j >> 40);
            byte[] bArr4 = this.g;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) (j >> 32);
            byte[] bArr5 = this.g;
            int i5 = this.h;
            this.h = i5 + 1;
            bArr5[i5] = (byte) (j >> 24);
            byte[] bArr6 = this.g;
            int i6 = this.h;
            this.h = i6 + 1;
            bArr6[i6] = (byte) (j >> 16);
            byte[] bArr7 = this.g;
            int i7 = this.h;
            this.h = i7 + 1;
            bArr7[i7] = (byte) (j >> 8);
            byte[] bArr8 = this.g;
            int i8 = this.h;
            this.h = i8 + 1;
            bArr8[i8] = (byte) j;
        } catch (RuntimeException e) {
            e.toString();
            class_650.e("14395, 5, " + j + ", " + j);
            throw new RuntimeException();
        }
    }

    public void a(String str) {
        System.arraycopy(str.getBytes(), 0, this.g, this.h, str.length());
        this.h += str.length();
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 10;
    }

    public void a(byte[] bArr, int i, int i2) {
        for (int i3 = i2; i3 < i2 + i; i3++) {
            byte[] bArr2 = this.g;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr2[i4] = bArr[i3];
        }
    }

    public void i(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void j(int i) {
        this.g[(this.h - i) - 1] = (byte) i;
    }

    public int y() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return bArr[i] & 255;
    }

    public byte z() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return bArr[i];
    }

    public int A() {
        try {
            this.h += 2;
            return ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
        } catch (Exception e) {
            return j();
        }
    }

    public int B() {
        this.h += 2;
        int i = ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
        if (i > 32767) {
            i -= 65536;
        }
        return i;
    }

    public int C() {
        this.h += 3;
        return ((this.g[this.h - 3] & 255) << 16) + ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public int D() {
        this.h += 4;
        return ((this.g[this.h - 4] & 255) << 24) + ((this.g[this.h - 3] & 255) << 16) + ((this.g[this.h - 2] & 255) << 8) + (this.g[this.h - 1] & 255);
    }

    public long E() {
        long jD = ((long) D()) & 4294967295L;
        return (jD << 32) + (((long) D()) & 4294967295L);
    }

    public String F() {
        byte[] bArr;
        int i;
        int i2 = this.h;
        do {
            bArr = this.g;
            i = this.h;
            this.h = i + 1;
        } while (bArr[i] != 10);
        return new String(this.g, i2, (this.h - i2) - 1);
    }

    public void G() {
        byte[] bArr;
        int i;
        int i2 = this.h;
        do {
            bArr = this.g;
            i = this.h;
            this.h = i + 1;
        } while (bArr[i] != 10);
    }

    public byte[] H() {
        byte[] bArr;
        int i;
        int i2 = this.h;
        do {
            bArr = this.g;
            i = this.h;
            this.h = i + 1;
        } while (bArr[i] != 10);
        byte[] bArr2 = new byte[(this.h - i2) - 1];
        System.arraycopy(this.g, i2, bArr2, i2 - i2, (this.h - 1) - i2);
        return bArr2;
    }

    public void I() {
        byte[] bArr;
        int i;
        int i2 = this.h;
        do {
            bArr = this.g;
            i = this.h;
            this.h = i + 1;
        } while (bArr[i] != 10);
    }

    public void a(int i, int i2, byte[] bArr) {
        for (int i3 = i2; i3 < i2 + i; i3++) {
            byte[] bArr2 = this.g;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr[i3] = bArr2[i4];
        }
    }

    public void J() {
        this.i = this.h * 8;
    }

    public int k(int i) {
        if (f) {
            System.out.println(this.g.length);
        }
        int i2 = this.i >> 3;
        int i3 = 8 - (this.i & 7);
        int i4 = 0;
        this.i += i;
        while (i > i3) {
            int i5 = i2;
            i2++;
            i4 += (this.g[i5] & k[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
        }
        return i == i3 ? i4 + (this.g[i2] & k[i3]) : i4 + ((this.g[i2] >> (i3 - i)) & k[i]);
    }

    public void K() {
        this.h = (this.i + 7) / 8;
    }

    public int L() {
        try {
            return (this.g[this.h] & 255) < 128 ? y() - 64 : A() - 49152;
        } catch (Exception e) {
            return -1;
        }
    }

    public void M() {
        int i = this.h;
        this.h = 0;
        byte[] bArr = new byte[i];
        a(i, 0, bArr);
        byte[] byteArray = new BigInteger(bArr).toByteArray();
        this.h = 0;
        b(byteArray.length);
        a(byteArray, byteArray.length, 0);
    }

    public void l(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (-i);
    }

    public void m(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (128 - i);
    }

    public int N() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return (bArr[i] - 128) & 255;
    }

    public int O() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return (-bArr[i]) & 255;
    }

    public int P() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return (128 - bArr[i]) & 255;
    }

    public byte Q() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return (byte) (-bArr[i]);
    }

    public byte R() {
        byte[] bArr = this.g;
        int i = this.h;
        this.h = i + 1;
        return (byte) (128 - bArr[i]);
    }

    public void n(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) i;
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
    }

    public void o(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i + 128);
    }

    public void p(int i) {
        byte[] bArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) (i + 128);
        byte[] bArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
    }

    public int S() {
        this.h += 2;
        return ((this.g[this.h - 1] & 255) << 8) + (this.g[this.h - 2] & 255);
    }

    public int T() {
        this.h += 2;
        return ((this.g[this.h - 2] & 255) << 8) + ((this.g[this.h - 1] - 128) & 255);
    }

    public int U() {
        this.h += 2;
        return ((this.g[this.h - 1] & 255) << 8) + ((this.g[this.h - 2] - 128) & 255);
    }

    public int V() {
        this.h += 2;
        int i = ((this.g[this.h - 1] & 255) << 8) + (this.g[this.h - 2] & 255);
        if (i > 32767) {
            i -= 65536;
        }
        return i;
    }

    public int W() {
        this.h += 2;
        int i = ((this.g[this.h - 1] & 255) << 8) + ((this.g[this.h - 2] - 128) & 255);
        if (i > 32767) {
            i -= 65536;
        }
        return i;
    }

    public int X() {
        this.h += 4;
        return ((this.g[this.h - 2] & 255) << 24) + ((this.g[this.h - 1] & 255) << 16) + ((this.g[this.h - 4] & 255) << 8) + (this.g[this.h - 3] & 255);
    }

    public int Y() {
        this.h += 4;
        return ((this.g[this.h - 3] & 255) << 24) + ((this.g[this.h - 4] & 255) << 16) + ((this.g[this.h - 1] & 255) << 8) + (this.g[this.h - 2] & 255);
    }

    public void a(int i, byte[] bArr, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.g;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr2[i4] = (byte) (bArr[i3] + 128);
        }
    }

    public void b(int i, int i2, byte[] bArr) {
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            byte[] bArr2 = this.g;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr[i3] = bArr2[i4];
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i2 + i; i3++) {
            byte[] bArr2 = this.g;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr[i3] = bArr2[i4];
        }
    }

    public int Z() {
        return this.h;
    }

    public int aa() {
        return this.h;
    }

    public int ab() {
        return this.j;
    }

    public byte[] ac() {
        return this.g;
    }
}
