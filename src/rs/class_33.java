package rs;

import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_33.class */
public final class class_33 {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public final int[] d;
    public final int[] e;
    public final int[] f;
    public final int[] g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public final int[] l;
    int[] m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public static final int[] s = new int[6];
    public static final int[] t = new int[6];
    public static final int[] u = new int[6];
    public static final int[] v = new int[6];
    public static final int[] w = new int[6];
    public static final int[] x = new int[6];
    public static final int[] y = {1, 0};
    public static final int[] z = {2, 1};
    public static final int[] A = {3, 3};
    private static final int[][] B = {new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 2, 6}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 13, 14}};
    private static final int[][] C = {new int[]{0, 1, 2, 3, 0, 0, 1, 3}, new int[]{1, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, new int[]{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, new int[]{0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, new int[]{0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, new int[]{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, new int[]{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, new int[]{1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, new int[]{1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};

    public void a(int i) {
        this.a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(int i) {
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int[] d() {
        return this.d;
    }

    public int[] e() {
        return this.e;
    }

    public int[] f() {
        return this.f;
    }

    public int[] g() {
        if (e.a) {
            return this.m;
        }
        return null;
    }

    public int[] h() {
        return this.j;
    }

    public int[] i() {
        return this.k;
    }

    public int[] j() {
        return this.l;
    }

    public int[] k() {
        return this.g;
    }

    public int[] l() {
        return this.h;
    }

    public int[] m() {
        return this.i;
    }

    public class_33(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        this.n = i13 == i12 && i13 == i4 && i13 == i11;
        this.o = i14;
        this.p = i7;
        this.q = i9;
        this.r = i19;
        int i25 = 128 / 2;
        int i26 = 128 / 4;
        int i27 = (128 * 3) / 4;
        int[] iArr = B[i14];
        int length = iArr.length;
        this.d = new int[length];
        this.e = new int[length];
        this.f = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i28 = i18 * 128;
        int i29 = i * 128;
        for (int i30 = 0; i30 < length; i30++) {
            int i31 = iArr[i30];
            if ((i31 & 1) == 0 && i31 <= 8) {
                i31 = ((((i31 - i7) - i7) - 1) & 7) + 1;
            }
            if (i31 > 8 && i31 <= 12) {
                i31 = (((i31 - 9) - i7) & 3) + 9;
            }
            if (i31 > 12 && i31 <= 16) {
                i31 = (((i31 - 13) - i7) & 3) + 13;
            }
            if (i31 == 1) {
                i20 = i28;
                i21 = i29;
                i22 = i13;
                i23 = i8;
                i24 = i2;
            } else if (i31 == 2) {
                i20 = i28 + i25;
                i21 = i29;
                i22 = (i13 + i12) >> 1;
                i23 = (i8 + i17) >> 1;
                i24 = (i2 + i16) >> 1;
            } else if (i31 == 3) {
                i20 = i28 + 128;
                i21 = i29;
                i22 = i12;
                i23 = i17;
                i24 = i16;
            } else if (i31 == 4) {
                i20 = i28 + 128;
                i21 = i29 + i25;
                i22 = (i12 + i4) >> 1;
                i23 = (i17 + i10) >> 1;
                i24 = (i16 + i6) >> 1;
            } else if (i31 == 5) {
                i20 = i28 + 128;
                i21 = i29 + 128;
                i22 = i4;
                i23 = i10;
                i24 = i6;
            } else if (i31 == 6) {
                i20 = i28 + i25;
                i21 = i29 + 128;
                i22 = (i4 + i11) >> 1;
                i23 = (i10 + i3) >> 1;
                i24 = (i6 + i15) >> 1;
            } else if (i31 == 7) {
                i20 = i28;
                i21 = i29 + 128;
                i22 = i11;
                i23 = i3;
                i24 = i15;
            } else if (i31 == 8) {
                i20 = i28;
                i21 = i29 + i25;
                i22 = (i11 + i13) >> 1;
                i23 = (i3 + i8) >> 1;
                i24 = (i15 + i2) >> 1;
            } else if (i31 == 9) {
                i20 = i28 + i25;
                i21 = i29 + i26;
                i22 = (i13 + i12) >> 1;
                i23 = (i8 + i17) >> 1;
                i24 = (i2 + i16) >> 1;
            } else if (i31 == 10) {
                i20 = i28 + i27;
                i21 = i29 + i25;
                i22 = (i12 + i4) >> 1;
                i23 = (i17 + i10) >> 1;
                i24 = (i16 + i6) >> 1;
            } else if (i31 == 11) {
                i20 = i28 + i25;
                i21 = i29 + i27;
                i22 = (i4 + i11) >> 1;
                i23 = (i10 + i3) >> 1;
                i24 = (i6 + i15) >> 1;
            } else if (i31 == 12) {
                i20 = i28 + i26;
                i21 = i29 + i25;
                i22 = (i11 + i13) >> 1;
                i23 = (i3 + i8) >> 1;
                i24 = (i15 + i2) >> 1;
            } else if (i31 == 13) {
                i20 = i28 + i26;
                i21 = i29 + i26;
                i22 = i13;
                i23 = i8;
                i24 = i2;
            } else if (i31 == 14) {
                i20 = i28 + i27;
                i21 = i29 + i26;
                i22 = i12;
                i23 = i17;
                i24 = i16;
            } else if (i31 == 15) {
                i20 = i28 + i27;
                i21 = i29 + i27;
                i22 = i4;
                i23 = i10;
                i24 = i6;
            } else {
                i20 = i28 + i26;
                i21 = i29 + i27;
                i22 = i11;
                i23 = i3;
                i24 = i15;
            }
            this.d[i30] = i20;
            this.e[i30] = i22;
            this.f[i30] = i21;
            iArr2[i30] = i23;
            iArr3[i30] = i24;
        }
        int[] iArr4 = C[i14];
        int length2 = iArr4.length / 4;
        this.j = new int[length2];
        this.k = new int[length2];
        this.l = new int[length2];
        this.g = new int[length2];
        this.h = new int[length2];
        this.i = new int[length2];
        if (i5 != -1) {
            this.m = new int[length2];
        }
        int i32 = 0;
        for (int i33 = 0; i33 < length2; i33++) {
            int i34 = iArr4[i32];
            int i35 = iArr4[i32 + 1];
            int i36 = iArr4[i32 + 2];
            int i37 = iArr4[i32 + 3];
            i32 += 4;
            i35 = i35 < 4 ? (i35 - i7) & 3 : i35;
            i36 = i36 < 4 ? (i36 - i7) & 3 : i36;
            i37 = i37 < 4 ? (i37 - i7) & 3 : i37;
            this.j[i33] = i35;
            this.k[i33] = i36;
            this.l[i33] = i37;
            if (i34 == 0) {
                this.g[i33] = iArr2[i35];
                this.h[i33] = iArr2[i36];
                this.i[i33] = iArr2[i37];
                if (this.m != null) {
                    this.m[i33] = -1;
                }
            } else {
                this.g[i33] = iArr3[i35];
                this.h[i33] = iArr3[i36];
                this.i[i33] = iArr3[i37];
                if (this.m != null) {
                    this.m[i33] = i5;
                }
            }
        }
        int i38 = i13;
        int i39 = i12;
        i38 = i12 < i38 ? i12 : i38;
        i39 = i12 > i39 ? i12 : i39;
        i38 = i4 < i38 ? i4 : i38;
        i39 = i4 > i39 ? i4 : i39;
        int i40 = (i11 < i38 ? i11 : i38) / 14;
        int i41 = (i11 > i39 ? i11 : i39) / 14;
    }
}
