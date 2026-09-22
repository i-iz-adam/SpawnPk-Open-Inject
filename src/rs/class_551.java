package rs;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_551.class */
public final class class_551 {
    private int a;
    private int d;
    private int e;
    private int f;
    private final int[] c = new int[256];
    private final int[] b = new int[256];

    public class_551(int[] iArr) {
        System.arraycopy(iArr, 0, this.b, 0, iArr.length);
        c();
    }

    public int a() {
        int i = this.a;
        this.a = i - 1;
        if (i == 0) {
            b();
            this.a = 255;
        }
        return this.b[this.a];
    }

    private void b() {
        int i = this.e;
        int i2 = this.f + 1;
        this.f = i2;
        this.e = i + i2;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = this.c[i3];
            if ((i3 & 3) == 0) {
                this.d ^= this.d << 13;
            } else if ((i3 & 3) == 1) {
                this.d ^= this.d >>> 6;
            } else if ((i3 & 3) == 2) {
                this.d ^= this.d << 2;
            } else if ((i3 & 3) == 3) {
                this.d ^= this.d >>> 16;
            }
            this.d += this.c[(i3 + 128) & 255];
            int i5 = this.c[(i4 & aU.jt) >> 2] + this.d + this.e;
            this.c[i3] = i5;
            int i6 = this.c[((i5 >> 8) & aU.jt) >> 2] + i4;
            this.e = i6;
            this.b[i3] = i6;
        }
    }

    private void c() {
        int i = -1640531527;
        int i2 = -1640531527;
        int i3 = -1640531527;
        int i4 = -1640531527;
        int i5 = -1640531527;
        int i6 = -1640531527;
        int i7 = -1640531527;
        int i8 = -1640531527;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i8 ^ (i7 << 11);
            int i11 = i5 + i10;
            int i12 = (i7 + i6) ^ (i6 >>> 2);
            int i13 = i4 + i12;
            int i14 = (i6 + i11) ^ (i11 << 8);
            int i15 = i3 + i14;
            i5 = (i11 + i13) ^ (i13 >>> 16);
            int i16 = i2 + i5;
            i4 = (i13 + i15) ^ (i15 << 10);
            int i17 = i + i4;
            i3 = (i15 + i16) ^ (i16 >>> 4);
            int i18 = i10 + i3;
            i2 = (i16 + i17) ^ (i17 << 8);
            i7 = i12 + i2;
            i = (i17 + i18) ^ (i18 >>> 9);
            i6 = i14 + i;
            i8 = i18 + i7;
        }
        for (int i19 = 0; i19 < 256; i19 += 8) {
            int i20 = i8 + this.b[i19];
            int i21 = i7 + this.b[i19 + 1];
            int i22 = i6 + this.b[i19 + 2];
            int i23 = i5 + this.b[i19 + 3];
            int i24 = i4 + this.b[i19 + 4];
            int i25 = i3 + this.b[i19 + 5];
            int i26 = i20 ^ (i21 << 11);
            int i27 = i23 + i26;
            int i28 = (i21 + i22) ^ (i22 >>> 2);
            int i29 = i24 + i28;
            int i30 = (i22 + i27) ^ (i27 << 8);
            int i31 = i25 + i30;
            i5 = (i27 + i29) ^ (i29 >>> 16);
            int i32 = i2 + this.b[i19 + 6] + i5;
            i4 = (i29 + i31) ^ (i31 << 10);
            int i33 = i + this.b[i19 + 7] + i4;
            i3 = (i31 + i32) ^ (i32 >>> 4);
            int i34 = i26 + i3;
            i2 = (i32 + i33) ^ (i33 << 8);
            i7 = i28 + i2;
            i = (i33 + i34) ^ (i34 >>> 9);
            i6 = i30 + i;
            i8 = i34 + i7;
            this.c[i19] = i8;
            this.c[i19 + 1] = i7;
            this.c[i19 + 2] = i6;
            this.c[i19 + 3] = i5;
            this.c[i19 + 4] = i4;
            this.c[i19 + 5] = i3;
            this.c[i19 + 6] = i2;
            this.c[i19 + 7] = i;
        }
        for (int i35 = 0; i35 < 256; i35 += 8) {
            int i36 = i8 + this.c[i35];
            int i37 = i7 + this.c[i35 + 1];
            int i38 = i6 + this.c[i35 + 2];
            int i39 = i5 + this.c[i35 + 3];
            int i40 = i4 + this.c[i35 + 4];
            int i41 = i3 + this.c[i35 + 5];
            int i42 = i36 ^ (i37 << 11);
            int i43 = i39 + i42;
            int i44 = (i37 + i38) ^ (i38 >>> 2);
            int i45 = i40 + i44;
            int i46 = (i38 + i43) ^ (i43 << 8);
            int i47 = i41 + i46;
            i5 = (i43 + i45) ^ (i45 >>> 16);
            int i48 = i2 + this.c[i35 + 6] + i5;
            i4 = (i45 + i47) ^ (i47 << 10);
            int i49 = i + this.c[i35 + 7] + i4;
            i3 = (i47 + i48) ^ (i48 >>> 4);
            int i50 = i42 + i3;
            i2 = (i48 + i49) ^ (i49 << 8);
            i7 = i44 + i2;
            i = (i49 + i50) ^ (i50 >>> 9);
            i6 = i46 + i;
            i8 = i50 + i7;
            this.c[i35] = i8;
            this.c[i35 + 1] = i7;
            this.c[i35 + 2] = i6;
            this.c[i35 + 3] = i5;
            this.c[i35 + 4] = i4;
            this.c[i35 + 5] = i3;
            this.c[i35 + 6] = i2;
            this.c[i35 + 7] = i;
        }
        b();
        this.a = 256;
    }
}
