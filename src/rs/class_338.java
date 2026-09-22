package rs;

import com.sun.jna.platform.win32.bk;
import java.util.Random;

/* JADX INFO: loaded from: client-final.jar:rs/class_338.class */
public class class_338 extends class_210 {
    public String q;
    private final char[] s = new char[100];
    private final byte[][] t;
    private final int[] u;
    private final int[] v;
    private final int[] w;
    private final int[] x;
    private final int[] y;
    public int r;
    private final Random z;
    private boolean A;

    public class_338(boolean z, String str, class_663 class_663Var) {
        int i = (str.equals("hit_full") || str.equals("critical_full")) ? 58 : 256;
        this.q = str;
        this.t = new byte[i][];
        this.u = new int[i];
        this.v = new int[i];
        this.w = new int[i];
        this.x = new int[i];
        this.y = new int[i];
        this.z = new Random();
        this.A = false;
        Buffer buffer = new Buffer(class_663Var.a(str + ".dat"));
        Buffer buffer2 = new Buffer(class_663Var.a("index.dat"));
        buffer2.h = buffer.A() + 4;
        int iY = buffer2.y();
        if (iY > 0) {
            buffer2.h += 3 * (iY - 1);
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.w[i2] = buffer2.y();
            this.x[i2] = buffer2.y();
            int iA = buffer2.A();
            this.u[i2] = iA;
            int iA2 = buffer2.A();
            this.v[i2] = iA2;
            int iY2 = buffer2.y();
            int i3 = iA * iA2;
            this.t[i2] = new byte[i3];
            if (iY2 == 0) {
                for (int i4 = 0; i4 < i3; i4++) {
                    this.t[i2][i4] = buffer.z();
                }
            } else if (iY2 == 1) {
                for (int i5 = 0; i5 < iA; i5++) {
                    for (int i6 = 0; i6 < iA2; i6++) {
                        this.t[i2][i5 + (i6 * iA)] = buffer.z();
                    }
                }
            }
            if (iA2 > this.r && i2 < 128) {
                this.r = iA2;
            }
            this.w[i2] = 1;
            this.y[i2] = iA + 2;
            int i7 = 0;
            for (int i8 = iA2 / 7; i8 < iA2; i8++) {
                i7 += this.t[i2][i8 * iA];
            }
            if (i7 <= iA2 / 7) {
                int[] iArr = this.y;
                int i9 = i2;
                iArr[i9] = iArr[i9] - 1;
                this.w[i2] = 0;
            }
            int i10 = 0;
            for (int i11 = iA2 / 7; i11 < iA2; i11++) {
                i10 += this.t[i2][(iA - 1) + (i11 * iA)];
            }
            if (i10 <= iA2 / 7) {
                int[] iArr2 = this.y;
                int i12 = i2;
                iArr2[i12] = iArr2[i12] - 1;
            }
        }
        if (z) {
            this.y[32] = this.y[73];
        } else {
            this.y[32] = this.y[105];
        }
    }

    public void a(String str, int i, int i2, int i3) {
        b(i2, str, i3, i - b(str));
    }

    public void a(int i, String str, int i2, int i3) {
        b(i, str, i2, i3 - (b(str) / 2));
    }

    public void a(int i, int i2, String str, int i3, boolean z) {
        a(z, i2 - (a(str) / 2), i, str, i3);
    }

    public void b(int i, int i2, String str, int i3, boolean z) {
        a(z, i2, i, str, i3);
    }

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '@' && i2 + 4 < str.length() && str.charAt(i2 + 4) == '@') {
                i2 += 4;
            } else if (z) {
                if (str.charAt(i2) == '=' && i2 > 3 && str.charAt(i2 - 3) == 'i' && str.charAt(i2 - 2) == 'm' && str.charAt(i2 - 1) == 'g') {
                    i += 12;
                }
                if (str.charAt(i2) == '>') {
                    z = false;
                }
            } else if (str.charAt(i2) == '<') {
                z = true;
            } else {
                i += this.y[str.charAt(i2)];
            }
            i2++;
        }
        return i;
    }

    public int b(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i += this.y[str.charAt(i2)];
        }
        return i;
    }

    public void b(int i, String str, int i2, int i3) {
        if (str == null) {
            return;
        }
        int i4 = i2 - this.r;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != ' ') {
                a(this.t[cCharAt], i3 + this.w[cCharAt], i4 + this.x[cCharAt], this.u[cCharAt], this.v[cCharAt], i);
            }
            i3 += this.y[cCharAt];
        }
    }

    public void e(int i, int i2, int i3, int i4) {
        int i5 = i3 - this.r;
        int i6 = 0;
        int i7 = 0;
        if (i2 == 0) {
            i7 = 0 + this.y[48];
            i6 = 0 + 1;
            this.s[0] = '0';
        } else {
            while (i2 > 0) {
                char c = (char) ((i2 % 10) + 48);
                i7 += this.y[c];
                int i8 = i6;
                i6++;
                this.s[i8] = c;
                i2 /= 10;
            }
        }
        if (i6 == 0) {
            return;
        }
        int i9 = i4 - (i7 / 2);
        for (int i10 = i6 - 1; i10 >= 0; i10--) {
            char c2 = this.s[i10];
            if (c2 != ' ') {
                a(this.t[c2], i9 + this.w[c2], i5 + this.x[c2], this.u[c2], this.v[c2], i);
            }
            i9 += this.y[c2];
        }
    }

    public void a(int i, String str, int i2, int i3, int i4) {
        if (str == null) {
            return;
        }
        int iB = i2 - (b(str) / 2);
        int i5 = i4 - this.r;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != ' ') {
                a(this.t[cCharAt], iB + this.w[cCharAt], i5 + this.x[cCharAt] + ((int) (Math.sin((((double) i6) / 2.0d) + (((double) i3) / 5.0d)) * 5.0d)), this.u[cCharAt], this.v[cCharAt], i);
            }
            iB += this.y[cCharAt];
        }
    }

    public void b(int i, String str, int i2, int i3, int i4) {
        if (str == null) {
            return;
        }
        int iB = i - (b(str) / 2);
        int i5 = i3 - this.r;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != ' ') {
                a(this.t[cCharAt], iB + this.w[cCharAt] + ((int) (Math.sin((((double) i6) / 5.0d) + (((double) i2) / 5.0d)) * 5.0d)), i5 + this.x[cCharAt] + ((int) (Math.sin((((double) i6) / 3.0d) + (((double) i2) / 5.0d)) * 5.0d)), this.u[cCharAt], this.v[cCharAt], i4);
            }
            iB += this.y[cCharAt];
        }
    }

    public void a(int i, String str, int i2, int i3, int i4, int i5) {
        if (str == null) {
            return;
        }
        double d = 7.0d - (((double) i) / 8.0d);
        if (d < 0.0d) {
            d = 0.0d;
        }
        int iB = i4 - (b(str) / 2);
        int i6 = i3 - this.r;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ') {
                a(this.t[cCharAt], iB + this.w[cCharAt], i6 + this.x[cCharAt] + ((int) (Math.sin(((double) i7) + ((double) i2)) * d)), this.u[cCharAt], this.v[cCharAt], i5);
            }
            iB += this.y[cCharAt];
        }
    }

    public void a(boolean z, int i, int i2, String str, int i3) {
        this.A = false;
        if (str == null) {
            return;
        }
        int i4 = i3 - this.r;
        int i5 = 0;
        while (i5 < str.length()) {
            if (str.charAt(i5) == '@' && i5 + 4 < str.length() && str.charAt(i5 + 4) == '@') {
                int iC = c(str.substring(i5 + 1, i5 + 4));
                if (iC != -1) {
                    i2 = iC;
                }
                i5 += 4;
            } else {
                char cCharAt = str.charAt(i5);
                if (cCharAt != ' ') {
                    if (z) {
                        a(this.t[cCharAt], i + this.w[cCharAt] + 1, i4 + this.x[cCharAt] + 1, this.u[cCharAt], this.v[cCharAt], 0);
                    }
                    a(this.t[cCharAt], i + this.w[cCharAt], i4 + this.x[cCharAt], this.u[cCharAt], this.v[cCharAt], i2);
                }
                i += this.y[cCharAt];
            }
            i5++;
        }
        if (this.A) {
            b(i4 + ((int) (((double) this.r) * 0.7d)), 8388608, i - i, i);
        }
    }

    public void a(int i, int i2, String str, int i3, int i4) {
        if (str == null) {
            return;
        }
        this.z.setSeed(i3);
        int iNextInt = 192 + (this.z.nextInt() & 31);
        int i5 = i4 - this.r;
        int i6 = 0;
        while (i6 < str.length()) {
            if (str.charAt(i6) == '@' && i6 + 4 < str.length() && str.charAt(i6 + 4) == '@') {
                int iC = c(str.substring(i6 + 1, i6 + 4));
                if (iC != -1) {
                    i2 = iC;
                }
                i6 += 4;
            } else {
                char cCharAt = str.charAt(i6);
                if (cCharAt != ' ') {
                    a(192, i + this.w[cCharAt] + 1, this.t[cCharAt], this.u[cCharAt], i5 + this.x[cCharAt] + 1, this.v[cCharAt], 0);
                    a(iNextInt, i + this.w[cCharAt], this.t[cCharAt], this.u[cCharAt], i5 + this.x[cCharAt], this.v[cCharAt], i2);
                }
                i += this.y[cCharAt];
                if ((this.z.nextInt() & 3) == 0) {
                    i++;
                }
            }
            i6++;
        }
    }

    private int c(String str) {
        if (str.equals("red")) {
            return bk.aS;
        }
        if (str.equals("gre")) {
            return bk.ao;
        }
        if (str.equals("blu")) {
            return 255;
        }
        if (str.equals("yel")) {
            return class_492.g;
        }
        if (str.equals("cya")) {
            return 65535;
        }
        if (str.equals("mag")) {
            return 16711935;
        }
        if (str.equals("whi")) {
            return class_492.c;
        }
        if (str.equals("bla")) {
            return 0;
        }
        if (str.equals("lre")) {
            return 16748608;
        }
        if (str.equals("dre")) {
            return 8388608;
        }
        if (str.equals("dbl")) {
            return 128;
        }
        if (str.equals("or1")) {
            return 16756736;
        }
        if (str.equals("or2")) {
            return 16740352;
        }
        if (str.equals("or3")) {
            return 16723968;
        }
        if (str.equals("gr1")) {
            return 12648192;
        }
        if (str.equals("gr2")) {
            return 8453888;
        }
        if (str.equals("gr3")) {
            return 4259584;
        }
        if (str.equals("str")) {
            this.A = true;
        }
        if (!str.equals("end")) {
            return -1;
        }
        this.A = false;
        return -1;
    }

    private void a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i + (i2 * h);
        int i7 = h - i3;
        int i8 = 0;
        int i9 = 0;
        if (i2 < j) {
            int i10 = j - i2;
            i4 -= i10;
            i2 = j;
            i9 = 0 + (i10 * i3);
            i6 += i10 * h;
        }
        if (i2 + i4 >= k) {
            i4 -= ((i2 + i4) - k) + 1;
        }
        if (i < l) {
            int i11 = l - i;
            i3 -= i11;
            i = l;
            i9 += i11;
            i6 += i11;
            i8 = 0 + i11;
            i7 += i11;
        }
        if (i + i3 >= m) {
            int i12 = ((i + i3) - m) + 1;
            i3 -= i12;
            i8 += i12;
            i7 += i12;
        }
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        a(g, bArr, i5, i9, i6, i3, i4, i7, i8);
    }

    private void a(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11 = -(i4 >> 2);
        int i12 = -(i4 & 3);
        for (int i13 = -i5; i13 < 0; i13++) {
            for (int i14 = i11; i14 < 0; i14++) {
                int i15 = i2;
                int i16 = i2 + 1;
                if (bArr[i15] != 0) {
                    int i17 = i3;
                    i8 = i3 + 1;
                    a(iArr, i17, i, i, 255);
                } else {
                    i8 = i3 + 1;
                }
                int i18 = i16 + 1;
                if (bArr[i16] != 0) {
                    int i19 = i8;
                    i9 = i8 + 1;
                    a(iArr, i19, i, i, 255);
                } else {
                    i9 = i8 + 1;
                }
                int i20 = i18 + 1;
                if (bArr[i18] != 0) {
                    int i21 = i9;
                    i10 = i9 + 1;
                    a(iArr, i21, i, i, 255);
                } else {
                    i10 = i9 + 1;
                }
                i2 = i20 + 1;
                if (bArr[i20] != 0) {
                    int i22 = i10;
                    i3 = i10 + 1;
                    a(iArr, i22, i, i, 255);
                } else {
                    i3 = i10 + 1;
                }
            }
            for (int i23 = i12; i23 < 0; i23++) {
                int i24 = i2;
                i2++;
                if (bArr[i24] != 0) {
                    int i25 = i3;
                    i3++;
                    a(iArr, i25, i, i, 255);
                } else {
                    i3++;
                }
            }
            i3 += i6;
            i2 += i7;
        }
    }

    private void a(int i, int i2, byte[] bArr, int i3, int i4, int i5, int i6) {
        int i7 = i2 + (i4 * h);
        int i8 = h - i3;
        int i9 = 0;
        int i10 = 0;
        if (i4 < j) {
            int i11 = j - i4;
            i5 -= i11;
            i4 = j;
            i10 = 0 + (i11 * i3);
            i7 += i11 * h;
        }
        if (i4 + i5 >= k) {
            i5 -= ((i4 + i5) - k) + 1;
        }
        if (i2 < l) {
            int i12 = l - i2;
            i3 -= i12;
            i2 = l;
            i10 += i12;
            i7 += i12;
            i9 = 0 + i12;
            i8 += i12;
        }
        if (i2 + i3 >= m) {
            int i13 = ((i2 + i3) - m) + 1;
            i3 -= i13;
            i9 += i13;
            i8 += i13;
        }
        if (i3 <= 0 || i5 <= 0) {
            return;
        }
        a(bArr, i5, i7, g, i10, i3, i9, i8, i6, i);
    }

    private void a(byte[] bArr, int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = ((((i7 & 16711935) * i8) & (-16711936)) + (((i7 & bk.ao) * i8) & bk.aS)) >> 8;
        int i10 = 256 - i8;
        for (int i11 = -i; i11 < 0; i11++) {
            for (int i12 = -i4; i12 < 0; i12++) {
                int i13 = i3;
                i3++;
                if (bArr[i13] != 0) {
                    int i14 = iArr[i2];
                    int i15 = i2;
                    i2++;
                    iArr[i15] = (((((i14 & 16711935) * i10) & (-16711936)) + (((i14 & bk.ao) * i10) & bk.aS)) >> 8) + i9;
                } else {
                    i2++;
                }
            }
            i2 += i6;
            i3 += i5;
        }
    }
}
