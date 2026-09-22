package rs;

import com.sun.jna.platform.win32.bk;
import gnu.trove.i.a.i;
import rs.gui.Launcher;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_332.class */
public final class class_332 extends class_329 {
    public static int f = 512;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i;
    public static double j;
    private static final i C;
    public static float[] k;
    public static final int l = 340;
    public static final int m = -477;
    public static boolean n;
    public static boolean o;
    private static boolean D;
    public static boolean p;
    public static boolean q;
    public static int r;
    public static int s;
    public static int t;
    private static int[] E;
    public static final int[] u;
    public static int[] v;
    public static int[] w;
    public static int[] x;
    private static int F;
    public static class_190[] y;
    private static boolean[] G;
    private static int[] H;
    private static int I;
    private static int[][] J;
    private static int[][] K;
    public static int[] z;
    public static int A;
    public static int[] B;
    private static int[][] L;

    public static double c() {
        return j;
    }

    public static void a(double d) {
        j = d;
    }

    public static int d() {
        return Client.aj + 4 + ((Client.ak + 4) * 765);
    }

    public static boolean a(int i2) {
        return false;
    }

    public static void e() {
        E = null;
        E = null;
        v = null;
        w = null;
        x = null;
        y = null;
        G = null;
        H = null;
        J = null;
        K = null;
        z = null;
        B = null;
        L = null;
    }

    public static int a(int i2, int i3, int i4, int i5) {
        return (i2 * i3) + (i4 * i4);
    }

    public static int a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i4 - i2;
        int i14 = i5 - i3;
        int i15 = i6 - i2;
        int i16 = i7 - i3;
        int i17 = i11 - i2;
        int i18 = i12 - i3;
        float fA = a(i13, i13, i14, i14);
        float fA2 = a(i13, i15, i14, i16);
        float fA3 = a(i15, i15, i16, i16);
        float fA4 = a(i17, i13, i18, i14);
        float fA5 = a(i17, i15, i18, i16);
        float f2 = (fA * fA3) - (fA2 * fA2);
        float f3 = ((fA3 * fA4) - (fA2 * fA5)) / f2;
        float f4 = ((fA * fA5) - (fA2 * fA4)) / f2;
        return (int) ((((1.0f - f3) - f4) * i8) + (f3 * i9) + (f4 * i10));
    }

    public static void f() {
        x = new int[class_210.i];
        for (int i2 = 0; i2 < class_210.i; i2++) {
            x[i2] = class_210.h * i2;
        }
        s = class_210.h / 2;
        t = class_210.i / 2;
    }

    public static void a(int i2, int i3) {
        x = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            x[i4] = i2 * i4;
        }
        s = i2 / 2;
        t = i3 / 2;
    }

    public static void g() {
        J = null;
        for (int i2 = 0; i2 < 340; i2++) {
            K[i2] = null;
        }
    }

    public static void h() {
        if (J == null) {
            I = 20;
            if (n) {
                J = new int[I][16384];
            } else {
                J = new int[I][65536];
            }
            for (int i2 = 0; i2 < 340; i2++) {
                K[i2] = null;
            }
        }
    }

    public static void a(class_663 class_663Var) {
        F = 0;
        for (int i2 = 0; i2 < 340; i2++) {
            try {
                y[i2] = new class_190(class_663Var, String.valueOf(i2), 0);
                if (y[i2].n * y[i2].o > 16384) {
                    if (Configuration.f.booleanValue()) {
                        System.out.println("[!!!] Invalid texture size (too big) for ID " + i2 + ": " + y[i2].n + "x" + y[i2].o + " (replacing it to texture ID 0)");
                    }
                    y[i2] = null;
                    y[i2] = y[0];
                }
                if (n && y[i2].n == 128) {
                    y[i2].e();
                } else {
                    y[i2].f();
                }
                F++;
            } catch (Exception e) {
            }
        }
    }

    public static int b(int i2) {
        if (H[i2] != 0) {
            return H[i2];
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int length = L[i2].length;
        for (int i6 = 0; i6 < length; i6++) {
            i3 += (L[i2][i6] >> 16) & 255;
            i4 += (L[i2][i6] >> 8) & 255;
            i5 += L[i2][i6] & 255;
        }
        int iA = a(((i3 / length) << 16) + ((i4 / length) << 8) + (i5 / length), 1.4d);
        if (iA == 0) {
            iA = 1;
        }
        H[i2] = iA;
        return iA;
    }

    public static void c(int i2) {
        if (K[i2] == null) {
            return;
        }
        int[][] iArr = J;
        int i3 = I;
        I = i3 + 1;
        iArr[i3] = K[i2];
        K[i2] = null;
    }

    public static int[] d(int i2) {
        int[] iArr;
        int[] iArr2 = z;
        int i3 = A;
        A = i3 + 1;
        iArr2[i2] = i3;
        if (K[i2] != null) {
            return K[i2];
        }
        if (I <= 0 || J == null) {
            int i4 = 0;
            int i5 = -1;
            for (int i6 = 0; i6 < F; i6++) {
                if (K[i6] != null && (z[i6] < i4 || i5 == -1)) {
                    i4 = z[i6];
                    i5 = i6;
                }
            }
            iArr = K[i5];
            K[i5] = null;
        } else {
            int[][] iArr3 = J;
            int i7 = I - 1;
            I = i7;
            iArr = iArr3[i7];
            J[I] = null;
        }
        K[i2] = iArr;
        class_190 class_190Var = y[i2];
        int[] iArr4 = L[i2];
        if (n) {
            G[i2] = false;
            for (int i8 = 0; i8 < 4096; i8++) {
                int i9 = iArr4[class_190Var.i[i8]] & 16316671;
                iArr[i8] = i9;
                if (i9 == 0) {
                    G[i2] = true;
                }
                iArr[4096 + i8] = (i9 - (i9 >>> 3)) & 16316671;
                iArr[8192 + i8] = (i9 - (i9 >>> 2)) & 16316671;
                iArr[12288 + i8] = ((i9 - (i9 >>> 2)) - (i9 >>> 3)) & 16316671;
            }
        } else {
            if (class_190Var.j == 64) {
                for (int i10 = 0; i10 < 128; i10++) {
                    for (int i11 = 0; i11 < 128; i11++) {
                        iArr[i11 + (i10 << 7)] = iArr4[class_190Var.i[(i11 >> 1) + ((i10 >> 1) << 6)]];
                    }
                }
            } else {
                for (int i12 = 0; i12 < 16384; i12++) {
                    iArr[i12] = iArr4[class_190Var.i[i12]];
                }
            }
            G[i2] = false;
            for (int i13 = 0; i13 < 16384; i13++) {
                int[] iArr5 = iArr;
                int i14 = i13;
                iArr5[i14] = iArr5[i14] & 16316671;
                int i15 = iArr[i13];
                if (i15 == 0) {
                    G[i2] = true;
                }
                iArr[16384 + i13] = (i15 - (i15 >>> 3)) & 16316671;
                iArr[32768 + i13] = (i15 - (i15 >>> 2)) & 16316671;
                iArr[49152 + i13] = ((i15 - (i15 >>> 2)) - (i15 >>> 3)) & 16316671;
            }
        }
        return iArr;
    }

    public static void b(double d) {
        j = d;
        double dRandom = d + ((Math.random() * 0.03d) - 0.015d);
        int i2 = 0;
        for (int i3 = 0; i3 < 512; i3++) {
            double d2 = (((double) (i3 / 8)) / 64.0d) + 0.0078125d;
            double d3 = (((double) (i3 & 7)) / 8.0d) + 0.0625d;
            for (int i4 = 0; i4 < 128; i4++) {
                double d4 = ((double) i4) / 128.0d;
                double d5 = d4;
                double d6 = d4;
                double d7 = d4;
                if (d3 != 0.0d) {
                    double d8 = d4 < 0.5d ? d4 * (1.0d + d3) : (d4 + d3) - (d4 * d3);
                    double d9 = (2.0d * d4) - d8;
                    double d10 = d2 + 0.3333333333333333d;
                    if (d10 > 1.0d) {
                        d10 -= 1.0d;
                    }
                    double d11 = d2 - 0.3333333333333333d;
                    if (d11 < 0.0d) {
                        d11 += 1.0d;
                    }
                    if (6.0d * d10 < 1.0d) {
                        d5 = d9 + ((d8 - d9) * 6.0d * d10);
                    } else if (2.0d * d10 < 1.0d) {
                        d5 = d8;
                    } else {
                        d5 = 3.0d * d10 < 2.0d ? d9 + ((d8 - d9) * (0.6666666666666666d - d10) * 6.0d) : d9;
                    }
                    if (6.0d * d2 < 1.0d) {
                        d6 = d9 + ((d8 - d9) * 6.0d * d2);
                    } else if (2.0d * d2 < 1.0d) {
                        d6 = d8;
                    } else {
                        d6 = 3.0d * d2 < 2.0d ? d9 + ((d8 - d9) * (0.6666666666666666d - d2) * 6.0d) : d9;
                    }
                    if (6.0d * d11 < 1.0d) {
                        d7 = d9 + ((d8 - d9) * 6.0d * d11);
                    } else if (2.0d * d11 < 1.0d) {
                        d7 = d8;
                    } else {
                        d7 = 3.0d * d11 < 2.0d ? d9 + ((d8 - d9) * (0.6666666666666666d - d11) * 6.0d) : d9;
                    }
                }
                int iA = a((((int) (d5 * 256.0d)) << 16) + (((int) (d6 * 256.0d)) << 8) + ((int) (d7 * 256.0d)), dRandom);
                if (iA == 0) {
                    iA = 1;
                }
                int i5 = i2;
                i2++;
                B[i5] = iA;
            }
        }
        for (int i6 = 0; i6 < 340; i6++) {
            if (y[i6] != null) {
                int[] iArr = y[i6].h;
                L[i6] = new int[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    L[i6][i7] = a(iArr[i7], dRandom);
                    if ((L[i6][i7] & 16316671) == 0 && i7 != 0) {
                        L[i6][i7] = 1;
                    }
                }
            }
        }
        for (int i8 = 0; i8 < 340; i8++) {
            c(i8);
        }
    }

    public static int a(int i2, double d) {
        double dPow = Math.pow(((double) (i2 >> 16)) / 256.0d, d);
        double dPow2 = Math.pow(((double) ((i2 >> 8) & 255)) / 256.0d, d);
        double dPow3 = Math.pow(((double) (i2 & 255)) / 256.0d, d);
        int i3 = (int) (dPow * 256.0d);
        int i4 = (int) (dPow2 * 256.0d);
        return (i3 << 16) + (i4 << 8) + ((int) (dPow3 * 256.0d));
    }

    public static int a(int i2, byte b, byte b2, byte b3, byte b4) {
        int i3 = (i2 >> 10) & 63;
        int i4 = (i2 >> 7) & 7;
        int i5 = i2 & 127;
        int i6 = b4 & 255;
        if (b != -1) {
            i3 += (i6 * (b - i3)) >> 7;
        }
        if (b2 != -1) {
            i4 += (i6 * (b2 - i4)) >> 7;
        }
        if (b3 != -1) {
            i5 += (i6 * (b3 - i5)) >> 7;
        }
        return ((i3 << 10) | (i4 << 7) | i5) & 65535;
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((i || e.a()) && p) {
            c(i2, i3, i4, i5, i6, i7, i8, i9, i10);
        } else {
            b(i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }
    }

    public static void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        if (e.a() && !h) {
            return;
        }
        int i23 = 0;
        int i24 = 0;
        if (i3 != i2) {
            i23 = ((i6 - i5) << 16) / (i3 - i2);
            i24 = ((i9 - i8) << 15) / (i3 - i2);
        }
        int i25 = 0;
        int i26 = 0;
        if (i4 != i3) {
            i25 = ((i7 - i6) << 16) / (i4 - i3);
            i26 = ((i10 - i9) << 15) / (i4 - i3);
        }
        int i27 = 0;
        int i28 = 0;
        if (i4 != i2) {
            i27 = ((i5 - i7) << 16) / (i2 - i4);
            i28 = ((i8 - i10) << 15) / (i2 - i4);
        }
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i4 < i2) {
                    int i29 = i6 << 16;
                    int i30 = i29;
                    int i31 = i29;
                    int i32 = i9 << 15;
                    int i33 = i32;
                    int i34 = i32;
                    if (i3 < 0) {
                        i31 -= i23 * i3;
                        i30 -= i25 * i3;
                        i34 -= i24 * i3;
                        i33 -= i26 * i3;
                        i3 = 0;
                    }
                    int i35 = i7 << 16;
                    int i36 = i10 << 15;
                    if (i4 < 0) {
                        i35 -= i27 * i4;
                        i36 -= i28 * i4;
                        i4 = 0;
                    }
                    if ((i3 == i4 || i23 >= i25) && (i3 != i4 || i23 <= i27)) {
                        int i37 = i2 - i4;
                        int i38 = i4 - i3;
                        int i39 = x[i3];
                        while (true) {
                            i17 = i39;
                            i38--;
                            if (i38 < 0) {
                                break;
                            }
                            a(class_210.g, i17, i30 >> 16, i31 >> 16, i33 >> 7, i34 >> 7);
                            i31 += i23;
                            i30 += i25;
                            i34 += i24;
                            i33 += i26;
                            i39 = i17 + class_210.h;
                        }
                        while (true) {
                            i37--;
                            if (i37 < 0) {
                                return;
                            }
                            a(class_210.g, i17, i35 >> 16, i31 >> 16, i36 >> 7, i34 >> 7);
                            i31 += i23;
                            i35 += i27;
                            i34 += i24;
                            i36 += i28;
                            i17 += class_210.h;
                        }
                    } else {
                        int i40 = i2 - i4;
                        int i41 = i4 - i3;
                        int i42 = x[i3];
                        while (true) {
                            i18 = i42;
                            i41--;
                            if (i41 < 0) {
                                break;
                            }
                            a(class_210.g, i18, i31 >> 16, i30 >> 16, i34 >> 7, i33 >> 7);
                            i31 += i23;
                            i30 += i25;
                            i34 += i24;
                            i33 += i26;
                            i42 = i18 + class_210.h;
                        }
                        while (true) {
                            i40--;
                            if (i40 < 0) {
                                return;
                            }
                            a(class_210.g, i18, i31 >> 16, i35 >> 16, i34 >> 7, i36 >> 7);
                            i31 += i23;
                            i35 += i27;
                            i34 += i24;
                            i36 += i28;
                            i18 += class_210.h;
                        }
                    }
                } else {
                    int i43 = i6 << 16;
                    int i44 = i43;
                    int i45 = i43;
                    int i46 = i9 << 15;
                    int i47 = i46;
                    int i48 = i46;
                    if (i3 < 0) {
                        i45 -= i23 * i3;
                        i44 -= i25 * i3;
                        i48 -= i24 * i3;
                        i47 -= i26 * i3;
                        i3 = 0;
                    }
                    int i49 = i5 << 16;
                    int i50 = i8 << 15;
                    if (i2 < 0) {
                        i49 -= i27 * i2;
                        i50 -= i28 * i2;
                        i2 = 0;
                    }
                    if (i23 < i25) {
                        int i51 = i4 - i2;
                        int i52 = i2 - i3;
                        int i53 = x[i3];
                        while (true) {
                            i16 = i53;
                            i52--;
                            if (i52 < 0) {
                                break;
                            }
                            a(class_210.g, i16, i45 >> 16, i44 >> 16, i48 >> 7, i47 >> 7);
                            i45 += i23;
                            i44 += i25;
                            i48 += i24;
                            i47 += i26;
                            i53 = i16 + class_210.h;
                        }
                        while (true) {
                            i51--;
                            if (i51 < 0) {
                                return;
                            }
                            a(class_210.g, i16, i49 >> 16, i44 >> 16, i50 >> 7, i47 >> 7);
                            i49 += i27;
                            i44 += i25;
                            i50 += i28;
                            i47 += i26;
                            i16 += class_210.h;
                        }
                    } else {
                        int i54 = i4 - i2;
                        int i55 = i2 - i3;
                        int i56 = x[i3];
                        while (true) {
                            i15 = i56;
                            i55--;
                            if (i55 < 0) {
                                break;
                            }
                            a(class_210.g, i15, i44 >> 16, i45 >> 16, i47 >> 7, i48 >> 7);
                            i45 += i23;
                            i44 += i25;
                            i48 += i24;
                            i47 += i26;
                            i56 = i15 + class_210.h;
                        }
                        while (true) {
                            i54--;
                            if (i54 < 0) {
                                return;
                            }
                            a(class_210.g, i15, i44 >> 16, i49 >> 16, i47 >> 7, i50 >> 7);
                            i49 += i27;
                            i44 += i25;
                            i50 += i28;
                            i47 += i26;
                            i15 += class_210.h;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i2 < i3) {
                    int i57 = i7 << 16;
                    int i58 = i57;
                    int i59 = i57;
                    int i60 = i10 << 15;
                    int i61 = i60;
                    int i62 = i60;
                    if (i4 < 0) {
                        i59 -= i25 * i4;
                        i58 -= i27 * i4;
                        i62 -= i26 * i4;
                        i61 -= i28 * i4;
                        i4 = 0;
                    }
                    int i63 = i5 << 16;
                    int i64 = i8 << 15;
                    if (i2 < 0) {
                        i63 -= i23 * i2;
                        i64 -= i24 * i2;
                        i2 = 0;
                    }
                    if (i25 < i27) {
                        int i65 = i3 - i2;
                        int i66 = i2 - i4;
                        int i67 = x[i4];
                        while (true) {
                            i14 = i67;
                            i66--;
                            if (i66 < 0) {
                                break;
                            }
                            a(class_210.g, i14, i59 >> 16, i58 >> 16, i62 >> 7, i61 >> 7);
                            i59 += i25;
                            i58 += i27;
                            i62 += i26;
                            i61 += i28;
                            i67 = i14 + class_210.h;
                        }
                        while (true) {
                            i65--;
                            if (i65 < 0) {
                                return;
                            }
                            a(class_210.g, i14, i59 >> 16, i63 >> 16, i62 >> 7, i64 >> 7);
                            i59 += i25;
                            i63 += i23;
                            i62 += i26;
                            i64 += i24;
                            i14 += class_210.h;
                        }
                    } else {
                        int i68 = i3 - i2;
                        int i69 = i2 - i4;
                        int i70 = x[i4];
                        while (true) {
                            i13 = i70;
                            i69--;
                            if (i69 < 0) {
                                break;
                            }
                            a(class_210.g, i13, i58 >> 16, i59 >> 16, i61 >> 7, i62 >> 7);
                            i59 += i25;
                            i58 += i27;
                            i62 += i26;
                            i61 += i28;
                            i70 = i13 + class_210.h;
                        }
                        while (true) {
                            i68--;
                            if (i68 < 0) {
                                return;
                            }
                            a(class_210.g, i13, i63 >> 16, i59 >> 16, i64 >> 7, i62 >> 7);
                            i59 += i25;
                            i63 += i23;
                            i62 += i26;
                            i64 += i24;
                            i13 += class_210.h;
                        }
                    }
                } else {
                    int i71 = i7 << 16;
                    int i72 = i71;
                    int i73 = i71;
                    int i74 = i10 << 15;
                    int i75 = i74;
                    int i76 = i74;
                    if (i4 < 0) {
                        i73 -= i25 * i4;
                        i72 -= i27 * i4;
                        i76 -= i26 * i4;
                        i75 -= i28 * i4;
                        i4 = 0;
                    }
                    int i77 = i6 << 16;
                    int i78 = i9 << 15;
                    if (i3 < 0) {
                        i77 -= i23 * i3;
                        i78 -= i24 * i3;
                        i3 = 0;
                    }
                    if (i25 < i27) {
                        int i79 = i2 - i3;
                        int i80 = i3 - i4;
                        int i81 = x[i4];
                        while (true) {
                            i12 = i81;
                            i80--;
                            if (i80 < 0) {
                                break;
                            }
                            a(class_210.g, i12, i73 >> 16, i72 >> 16, i76 >> 7, i75 >> 7);
                            i73 += i25;
                            i72 += i27;
                            i76 += i26;
                            i75 += i28;
                            i81 = i12 + class_210.h;
                        }
                        while (true) {
                            i79--;
                            if (i79 < 0) {
                                return;
                            }
                            a(class_210.g, i12, i77 >> 16, i72 >> 16, i78 >> 7, i75 >> 7);
                            i77 += i23;
                            i72 += i27;
                            i78 += i24;
                            i75 += i28;
                            i12 += class_210.h;
                        }
                    } else {
                        int i82 = i2 - i3;
                        int i83 = i3 - i4;
                        int i84 = x[i4];
                        while (true) {
                            i11 = i84;
                            i83--;
                            if (i83 < 0) {
                                break;
                            }
                            a(class_210.g, i11, i72 >> 16, i73 >> 16, i75 >> 7, i76 >> 7);
                            i73 += i25;
                            i72 += i27;
                            i76 += i26;
                            i75 += i28;
                            i84 = i11 + class_210.h;
                        }
                        while (true) {
                            i82--;
                            if (i82 < 0) {
                                return;
                            }
                            a(class_210.g, i11, i72 >> 16, i77 >> 16, i75 >> 7, i78 >> 7);
                            i77 += i23;
                            i72 += i27;
                            i78 += i24;
                            i75 += i28;
                            i11 += class_210.h;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i3 < i4) {
                int i85 = i5 << 16;
                int i86 = i85;
                int i87 = i85;
                int i88 = i8 << 15;
                int i89 = i88;
                int i90 = i88;
                if (i2 < 0) {
                    i87 -= i27 * i2;
                    i86 -= i23 * i2;
                    i90 -= i28 * i2;
                    i89 -= i24 * i2;
                    i2 = 0;
                }
                int i91 = i6 << 16;
                int i92 = i9 << 15;
                if (i3 < 0) {
                    i91 -= i25 * i3;
                    i92 -= i26 * i3;
                    i3 = 0;
                }
                if ((i2 == i3 || i27 >= i23) && (i2 != i3 || i27 <= i25)) {
                    int i93 = i4 - i3;
                    int i94 = i3 - i2;
                    int i95 = x[i2];
                    while (true) {
                        i21 = i95;
                        i94--;
                        if (i94 < 0) {
                            break;
                        }
                        a(class_210.g, i21, i86 >> 16, i87 >> 16, i89 >> 7, i90 >> 7);
                        i87 += i27;
                        i86 += i23;
                        i90 += i28;
                        i89 += i24;
                        i95 = i21 + class_210.h;
                    }
                    while (true) {
                        i93--;
                        if (i93 < 0) {
                            return;
                        }
                        a(class_210.g, i21, i91 >> 16, i87 >> 16, i92 >> 7, i90 >> 7);
                        i87 += i27;
                        i91 += i25;
                        i90 += i28;
                        i92 += i26;
                        i21 += class_210.h;
                    }
                } else {
                    int i96 = i4 - i3;
                    int i97 = i3 - i2;
                    int i98 = x[i2];
                    while (true) {
                        i22 = i98;
                        i97--;
                        if (i97 < 0) {
                            break;
                        }
                        a(class_210.g, i22, i87 >> 16, i86 >> 16, i90 >> 7, i89 >> 7);
                        i87 += i27;
                        i86 += i23;
                        i90 += i28;
                        i89 += i24;
                        i98 = i22 + class_210.h;
                    }
                    while (true) {
                        i96--;
                        if (i96 < 0) {
                            return;
                        }
                        a(class_210.g, i22, i87 >> 16, i91 >> 16, i90 >> 7, i92 >> 7);
                        i87 += i27;
                        i91 += i25;
                        i90 += i28;
                        i92 += i26;
                        i22 += class_210.h;
                    }
                }
            } else {
                int i99 = i5 << 16;
                int i100 = i99;
                int i101 = i99;
                int i102 = i8 << 15;
                int i103 = i102;
                int i104 = i102;
                if (i2 < 0) {
                    i101 -= i27 * i2;
                    i100 -= i23 * i2;
                    i104 -= i28 * i2;
                    i103 -= i24 * i2;
                    i2 = 0;
                }
                int i105 = i7 << 16;
                int i106 = i10 << 15;
                if (i4 < 0) {
                    i105 -= i25 * i4;
                    i106 -= i26 * i4;
                    i4 = 0;
                }
                if ((i2 == i4 || i27 >= i23) && (i2 != i4 || i25 <= i23)) {
                    int i107 = i3 - i4;
                    int i108 = i4 - i2;
                    int i109 = x[i2];
                    while (true) {
                        i19 = i109;
                        i108--;
                        if (i108 < 0) {
                            break;
                        }
                        a(class_210.g, i19, i100 >> 16, i101 >> 16, i103 >> 7, i104 >> 7);
                        i101 += i27;
                        i100 += i23;
                        i104 += i28;
                        i103 += i24;
                        i109 = i19 + class_210.h;
                    }
                    while (true) {
                        i107--;
                        if (i107 < 0) {
                            return;
                        }
                        a(class_210.g, i19, i100 >> 16, i105 >> 16, i103 >> 7, i106 >> 7);
                        i105 += i25;
                        i100 += i23;
                        i106 += i26;
                        i103 += i24;
                        i19 += class_210.h;
                    }
                } else {
                    int i110 = i3 - i4;
                    int i111 = i4 - i2;
                    int i112 = x[i2];
                    while (true) {
                        i20 = i112;
                        i111--;
                        if (i111 < 0) {
                            break;
                        }
                        a(class_210.g, i20, i101 >> 16, i100 >> 16, i104 >> 7, i103 >> 7);
                        i101 += i27;
                        i100 += i23;
                        i104 += i28;
                        i103 += i24;
                        i112 = i20 + class_210.h;
                    }
                    while (true) {
                        i110--;
                        if (i110 < 0) {
                            return;
                        }
                        a(class_210.g, i20, i105 >> 16, i100 >> 16, i106 >> 7, i103 >> 7);
                        i105 += i25;
                        i100 += i23;
                        i106 += i26;
                        i103 += i24;
                        i20 += class_210.h;
                    }
                }
            }
        }
    }

    private static void a(int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (!e.a() || h) {
            Launcher.n().o();
            if (!Client.ag() && q && i2 <= d()) {
                i2 += 3064;
            }
            if (!p) {
                if (i3 >= i4) {
                    return;
                }
                int i10 = (i6 - i5) / (i4 - i3);
                if (o) {
                    if (i4 > class_210.n) {
                        i4 = class_210.n;
                    }
                    if (i3 < 0) {
                        i5 -= i3 * i10;
                        i3 = 0;
                    }
                    if (i3 >= i4) {
                        return;
                    }
                }
                int i11 = i2 + i3;
                int i12 = i4 - i3;
                if (r == 0) {
                    do {
                        int i13 = i11;
                        i11++;
                        iArr[i13] = B[i5 >> 8];
                        i5 += i10;
                        i12--;
                    } while (i12 > 0);
                    return;
                }
                int i14 = r;
                int i15 = 256 - r;
                do {
                    int i16 = B[i5 >> 8];
                    i5 += i10;
                    int i17 = i11;
                    i11++;
                    iArr[i17] = ((((i16 & 16711935) * i15) >> 8) & 16711935) + ((((i16 & bk.ao) * i15) >> 8) & bk.ao) + ((((iArr[i11] & 16711935) * i14) >> 8) & 16711935) + ((((iArr[i11] & bk.ao) * i14) >> 8) & bk.ao);
                    i12--;
                } while (i12 > 0);
                return;
            }
            if (o) {
                int i18 = i4 - i3 > 3 ? (i6 - i5) / (i4 - i3) : 0;
                if (i4 > class_210.n) {
                    i4 = class_210.n;
                }
                if (i3 < 0) {
                    i5 -= i3 * i18;
                    i3 = 0;
                }
                if (i3 >= i4) {
                    return;
                }
                i7 = i2 + i3;
                i8 = (i4 - i3) >> 2;
                i9 = i18 << 2;
            } else {
                if (i3 >= i4) {
                    return;
                }
                i7 = i2 + i3;
                i8 = (i4 - i3) >> 2;
                i9 = i8 > 0 ? ((i6 - i5) * E[i8]) >> 15 : 0;
            }
            if (r == 0) {
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    int i19 = B[i5 >> 8];
                    i5 += i9;
                    int i20 = i7;
                    int i21 = i7 + 1;
                    iArr[i20] = i19;
                    int i22 = i21 + 1;
                    iArr[i21] = i19;
                    int i23 = i22 + 1;
                    iArr[i22] = i19;
                    i7 = i23 + 1;
                    iArr[i23] = i19;
                }
                int i24 = (i4 - i3) & 3;
                if (i24 > 0) {
                    int i25 = B[i5 >> 8];
                    do {
                        int i26 = i7;
                        i7++;
                        iArr[i26] = i25;
                        i24--;
                    } while (i24 > 0);
                    return;
                }
                return;
            }
            int i27 = r;
            int i28 = 256 - r;
            while (true) {
                i8--;
                if (i8 < 0) {
                    break;
                }
                int i29 = B[i5 >> 8];
                i5 += i9;
                int i30 = ((((i29 & 16711935) * i28) >> 8) & 16711935) + ((((i29 & bk.ao) * i28) >> 8) & bk.ao);
                int i31 = i7;
                int i32 = i7 + 1;
                iArr[i31] = i30 + ((((iArr[i32] & 16711935) * i27) >> 8) & 16711935) + ((((iArr[i32] & bk.ao) * i27) >> 8) & bk.ao);
                int i33 = i32 + 1;
                iArr[i32] = i30 + ((((iArr[i33] & 16711935) * i27) >> 8) & 16711935) + ((((iArr[i33] & bk.ao) * i27) >> 8) & bk.ao);
                int i34 = i33 + 1;
                iArr[i33] = i30 + ((((iArr[i34] & 16711935) * i27) >> 8) & 16711935) + ((((iArr[i34] & bk.ao) * i27) >> 8) & bk.ao);
                i7 = i34 + 1;
                iArr[i34] = i30 + ((((iArr[i7] & 16711935) * i27) >> 8) & 16711935) + ((((iArr[i7] & bk.ao) * i27) >> 8) & bk.ao);
            }
            int i35 = (i4 - i3) & 3;
            if (i35 > 0) {
                int i36 = B[i5 >> 8];
                int i37 = ((((i36 & 16711935) * i28) >> 8) & 16711935) + ((((i36 & bk.ao) * i28) >> 8) & bk.ao);
                do {
                    int i38 = i7;
                    i7++;
                    iArr[i38] = i37 + ((((iArr[i7] & 16711935) * i27) >> 8) & 16711935) + ((((iArr[i7] & bk.ao) * i27) >> 8) & bk.ao);
                    i35--;
                } while (i35 > 0);
            }
        }
    }

    public static void c(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        if (e.a() && !h) {
            return;
        }
        int i23 = B[i8];
        int i24 = B[i9];
        int i25 = B[i10];
        int i26 = (i23 >> 16) & 255;
        int i27 = (i23 >> 8) & 255;
        int i28 = i23 & 255;
        int i29 = (i24 >> 16) & 255;
        int i30 = (i24 >> 8) & 255;
        int i31 = i24 & 255;
        int i32 = (i25 >> 16) & 255;
        int i33 = (i25 >> 8) & 255;
        int i34 = i25 & 255;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        if (i3 != i2) {
            i35 = ((i6 - i5) << 16) / (i3 - i2);
            i36 = ((i29 - i26) << 16) / (i3 - i2);
            i37 = ((i30 - i27) << 16) / (i3 - i2);
            i38 = ((i31 - i28) << 16) / (i3 - i2);
        }
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        if (i4 != i3) {
            i39 = ((i7 - i6) << 16) / (i4 - i3);
            i40 = ((i32 - i29) << 16) / (i4 - i3);
            i41 = ((i33 - i30) << 16) / (i4 - i3);
            i42 = ((i34 - i31) << 16) / (i4 - i3);
        }
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        if (i4 != i2) {
            i43 = ((i5 - i7) << 16) / (i2 - i4);
            i44 = ((i26 - i32) << 16) / (i2 - i4);
            i45 = ((i27 - i33) << 16) / (i2 - i4);
            i46 = ((i28 - i34) << 16) / (i2 - i4);
        }
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i4 < i2) {
                    int i47 = i6 << 16;
                    int i48 = i47;
                    int i49 = i47;
                    int i50 = i29 << 16;
                    int i51 = i50;
                    int i52 = i50;
                    int i53 = i30 << 16;
                    int i54 = i53;
                    int i55 = i53;
                    int i56 = i31 << 16;
                    int i57 = i56;
                    int i58 = i56;
                    if (i3 < 0) {
                        i49 -= i35 * i3;
                        i48 -= i39 * i3;
                        i52 -= i36 * i3;
                        i55 -= i37 * i3;
                        i58 -= i38 * i3;
                        i51 -= i40 * i3;
                        i54 -= i41 * i3;
                        i57 -= i42 * i3;
                        i3 = 0;
                    }
                    int i59 = i7 << 16;
                    int i60 = i32 << 16;
                    int i61 = i33 << 16;
                    int i62 = i34 << 16;
                    if (i4 < 0) {
                        i59 -= i43 * i4;
                        i60 -= i44 * i4;
                        i61 -= i45 * i4;
                        i62 -= i46 * i4;
                        i4 = 0;
                    }
                    if ((i3 == i4 || i35 >= i39) && (i3 != i4 || i35 <= i43)) {
                        int i63 = i2 - i4;
                        int i64 = i4 - i3;
                        int i65 = x[i3];
                        while (true) {
                            i17 = i65;
                            i64--;
                            if (i64 < 0) {
                                break;
                            }
                            a(class_210.g, i17, i48 >> 16, i49 >> 16, i51, i54, i57, i52, i55, i58);
                            i49 += i35;
                            i48 += i39;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i51 += i40;
                            i54 += i41;
                            i57 += i42;
                            i65 = i17 + class_210.h;
                        }
                        while (true) {
                            i63--;
                            if (i63 < 0) {
                                return;
                            }
                            a(class_210.g, i17, i59 >> 16, i49 >> 16, i60, i61, i62, i52, i55, i58);
                            i49 += i35;
                            i59 += i43;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i60 += i44;
                            i61 += i45;
                            i62 += i46;
                            i17 += class_210.h;
                        }
                    } else {
                        int i66 = i2 - i4;
                        int i67 = i4 - i3;
                        int i68 = x[i3];
                        while (true) {
                            i18 = i68;
                            i67--;
                            if (i67 < 0) {
                                break;
                            }
                            a(class_210.g, i18, i49 >> 16, i48 >> 16, i52, i55, i58, i51, i54, i57);
                            i49 += i35;
                            i48 += i39;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i51 += i40;
                            i54 += i41;
                            i57 += i42;
                            i68 = i18 + class_210.h;
                        }
                        while (true) {
                            i66--;
                            if (i66 < 0) {
                                return;
                            }
                            a(class_210.g, i18, i49 >> 16, i59 >> 16, i52, i55, i58, i60, i61, i62);
                            i49 += i35;
                            i59 += i43;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i60 += i44;
                            i61 += i45;
                            i62 += i46;
                            i18 += class_210.h;
                        }
                    }
                } else {
                    int i69 = i6 << 16;
                    int i70 = i69;
                    int i71 = i69;
                    int i72 = i29 << 16;
                    int i73 = i72;
                    int i74 = i72;
                    int i75 = i30 << 16;
                    int i76 = i75;
                    int i77 = i75;
                    int i78 = i31 << 16;
                    int i79 = i78;
                    int i80 = i78;
                    if (i3 < 0) {
                        i71 -= i35 * i3;
                        i70 -= i39 * i3;
                        i74 -= i36 * i3;
                        i77 -= i37 * i3;
                        i80 -= i38 * i3;
                        i73 -= i40 * i3;
                        i76 -= i41 * i3;
                        i79 -= i42 * i3;
                        i3 = 0;
                    }
                    int i81 = i5 << 16;
                    int i82 = i26 << 16;
                    int i83 = i27 << 16;
                    int i84 = i28 << 16;
                    if (i2 < 0) {
                        i81 -= i43 * i2;
                        i82 -= i44 * i2;
                        i83 -= i45 * i2;
                        i84 -= i46 * i2;
                        i2 = 0;
                    }
                    if (i35 < i39) {
                        int i85 = i4 - i2;
                        int i86 = i2 - i3;
                        int i87 = x[i3];
                        while (true) {
                            i16 = i87;
                            i86--;
                            if (i86 < 0) {
                                break;
                            }
                            a(class_210.g, i16, i71 >> 16, i70 >> 16, i74, i77, i80, i73, i76, i79);
                            i71 += i35;
                            i70 += i39;
                            i74 += i36;
                            i77 += i37;
                            i80 += i38;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            i87 = i16 + class_210.h;
                        }
                        while (true) {
                            i85--;
                            if (i85 < 0) {
                                return;
                            }
                            a(class_210.g, i16, i81 >> 16, i70 >> 16, i82, i83, i84, i73, i76, i79);
                            i81 += i43;
                            i70 += i39;
                            i82 += i44;
                            i83 += i45;
                            i84 += i46;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            i16 += class_210.h;
                        }
                    } else {
                        int i88 = i4 - i2;
                        int i89 = i2 - i3;
                        int i90 = x[i3];
                        while (true) {
                            i15 = i90;
                            i89--;
                            if (i89 < 0) {
                                break;
                            }
                            a(class_210.g, i15, i70 >> 16, i71 >> 16, i73, i76, i79, i74, i77, i80);
                            i71 += i35;
                            i70 += i39;
                            i74 += i36;
                            i77 += i37;
                            i80 += i38;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            i90 = i15 + class_210.h;
                        }
                        while (true) {
                            i88--;
                            if (i88 < 0) {
                                return;
                            }
                            a(class_210.g, i15, i70 >> 16, i81 >> 16, i73, i76, i79, i82, i83, i84);
                            i81 += i43;
                            i70 += i39;
                            i82 += i44;
                            i83 += i45;
                            i84 += i46;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            i15 += class_210.h;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i2 < i3) {
                    int i91 = i7 << 16;
                    int i92 = i91;
                    int i93 = i91;
                    int i94 = i32 << 16;
                    int i95 = i94;
                    int i96 = i94;
                    int i97 = i33 << 16;
                    int i98 = i97;
                    int i99 = i97;
                    int i100 = i34 << 16;
                    int i101 = i100;
                    int i102 = i100;
                    if (i4 < 0) {
                        i93 -= i39 * i4;
                        i92 -= i43 * i4;
                        i96 -= i40 * i4;
                        i99 -= i41 * i4;
                        i102 -= i42 * i4;
                        i95 -= i44 * i4;
                        i98 -= i45 * i4;
                        i101 -= i46 * i4;
                        i4 = 0;
                    }
                    int i103 = i5 << 16;
                    int i104 = i26 << 16;
                    int i105 = i27 << 16;
                    int i106 = i28 << 16;
                    if (i2 < 0) {
                        i103 -= i35 * i2;
                        i104 -= i36 * i2;
                        i105 -= i37 * i2;
                        i106 -= i38 * i2;
                        i2 = 0;
                    }
                    if (i39 < i43) {
                        int i107 = i3 - i2;
                        int i108 = i2 - i4;
                        int i109 = x[i4];
                        while (true) {
                            i14 = i109;
                            i108--;
                            if (i108 < 0) {
                                break;
                            }
                            a(class_210.g, i14, i93 >> 16, i92 >> 16, i96, i99, i102, i95, i98, i101);
                            i93 += i39;
                            i92 += i43;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i95 += i44;
                            i98 += i45;
                            i101 += i46;
                            i109 = i14 + class_210.h;
                        }
                        while (true) {
                            i107--;
                            if (i107 < 0) {
                                return;
                            }
                            a(class_210.g, i14, i93 >> 16, i103 >> 16, i96, i99, i102, i104, i105, i106);
                            i93 += i39;
                            i103 += i35;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i104 += i36;
                            i105 += i37;
                            i106 += i38;
                            i14 += class_210.h;
                        }
                    } else {
                        int i110 = i3 - i2;
                        int i111 = i2 - i4;
                        int i112 = x[i4];
                        while (true) {
                            i13 = i112;
                            i111--;
                            if (i111 < 0) {
                                break;
                            }
                            a(class_210.g, i13, i92 >> 16, i93 >> 16, i95, i98, i101, i96, i99, i102);
                            i93 += i39;
                            i92 += i43;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i95 += i44;
                            i98 += i45;
                            i101 += i46;
                            i112 = i13 + class_210.h;
                        }
                        while (true) {
                            i110--;
                            if (i110 < 0) {
                                return;
                            }
                            a(class_210.g, i13, i103 >> 16, i93 >> 16, i104, i105, i106, i96, i99, i102);
                            i93 += i39;
                            i103 += i35;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i104 += i36;
                            i105 += i37;
                            i106 += i38;
                            i13 += class_210.h;
                        }
                    }
                } else {
                    int i113 = i7 << 16;
                    int i114 = i113;
                    int i115 = i113;
                    int i116 = i32 << 16;
                    int i117 = i116;
                    int i118 = i116;
                    int i119 = i33 << 16;
                    int i120 = i119;
                    int i121 = i119;
                    int i122 = i34 << 16;
                    int i123 = i122;
                    int i124 = i122;
                    if (i4 < 0) {
                        i115 -= i39 * i4;
                        i114 -= i43 * i4;
                        i118 -= i40 * i4;
                        i121 -= i41 * i4;
                        i124 -= i42 * i4;
                        i117 -= i44 * i4;
                        i120 -= i45 * i4;
                        i123 -= i46 * i4;
                        i4 = 0;
                    }
                    int i125 = i6 << 16;
                    int i126 = i29 << 16;
                    int i127 = i30 << 16;
                    int i128 = i31 << 16;
                    if (i3 < 0) {
                        i125 -= i35 * i3;
                        i126 -= i36 * i3;
                        i127 -= i37 * i3;
                        i128 -= i38 * i3;
                        i3 = 0;
                    }
                    if (i39 < i43) {
                        int i129 = i2 - i3;
                        int i130 = i3 - i4;
                        int i131 = x[i4];
                        while (true) {
                            i12 = i131;
                            i130--;
                            if (i130 < 0) {
                                break;
                            }
                            a(class_210.g, i12, i115 >> 16, i114 >> 16, i118, i121, i124, i117, i120, i123);
                            i115 += i39;
                            i114 += i43;
                            i118 += i40;
                            i121 += i41;
                            i124 += i42;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            i131 = i12 + class_210.h;
                        }
                        while (true) {
                            i129--;
                            if (i129 < 0) {
                                return;
                            }
                            a(class_210.g, i12, i125 >> 16, i114 >> 16, i126, i127, i128, i117, i120, i123);
                            i125 += i35;
                            i114 += i43;
                            i126 += i36;
                            i127 += i37;
                            i128 += i38;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            i12 += class_210.h;
                        }
                    } else {
                        int i132 = i2 - i3;
                        int i133 = i3 - i4;
                        int i134 = x[i4];
                        while (true) {
                            i11 = i134;
                            i133--;
                            if (i133 < 0) {
                                break;
                            }
                            a(class_210.g, i11, i114 >> 16, i115 >> 16, i117, i120, i123, i118, i121, i124);
                            i115 += i39;
                            i114 += i43;
                            i118 += i40;
                            i121 += i41;
                            i124 += i42;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            i134 = i11 + class_210.h;
                        }
                        while (true) {
                            i132--;
                            if (i132 < 0) {
                                return;
                            }
                            a(class_210.g, i11, i114 >> 16, i125 >> 16, i117, i120, i123, i126, i127, i128);
                            i125 += i35;
                            i114 += i43;
                            i126 += i36;
                            i127 += i37;
                            i128 += i38;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            i11 += class_210.h;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i3 < i4) {
                int i135 = i5 << 16;
                int i136 = i135;
                int i137 = i135;
                int i138 = i26 << 16;
                int i139 = i138;
                int i140 = i138;
                int i141 = i27 << 16;
                int i142 = i141;
                int i143 = i141;
                int i144 = i28 << 16;
                int i145 = i144;
                int i146 = i144;
                if (i2 < 0) {
                    i137 -= i43 * i2;
                    i136 -= i35 * i2;
                    i140 -= i44 * i2;
                    i143 -= i45 * i2;
                    i146 -= i46 * i2;
                    i139 -= i36 * i2;
                    i142 -= i37 * i2;
                    i145 -= i38 * i2;
                    i2 = 0;
                }
                int i147 = i6 << 16;
                int i148 = i29 << 16;
                int i149 = i30 << 16;
                int i150 = i31 << 16;
                if (i3 < 0) {
                    i147 -= i39 * i3;
                    i148 -= i40 * i3;
                    i149 -= i41 * i3;
                    i150 -= i42 * i3;
                    i3 = 0;
                }
                if ((i2 == i3 || i43 >= i35) && (i2 != i3 || i43 <= i39)) {
                    int i151 = i4 - i3;
                    int i152 = i3 - i2;
                    int i153 = x[i2];
                    while (true) {
                        i21 = i153;
                        i152--;
                        if (i152 < 0) {
                            break;
                        }
                        a(class_210.g, i21, i136 >> 16, i137 >> 16, i139, i142, i145, i140, i143, i146);
                        i137 += i43;
                        i136 += i35;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i139 += i36;
                        i142 += i37;
                        i145 += i38;
                        i153 = i21 + class_210.h;
                    }
                    while (true) {
                        i151--;
                        if (i151 < 0) {
                            return;
                        }
                        a(class_210.g, i21, i147 >> 16, i137 >> 16, i148, i149, i150, i140, i143, i146);
                        i137 += i43;
                        i147 += i39;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i148 += i40;
                        i149 += i41;
                        i150 += i42;
                        i21 += class_210.h;
                    }
                } else {
                    int i154 = i4 - i3;
                    int i155 = i3 - i2;
                    int i156 = x[i2];
                    while (true) {
                        i22 = i156;
                        i155--;
                        if (i155 < 0) {
                            break;
                        }
                        a(class_210.g, i22, i137 >> 16, i136 >> 16, i140, i143, i146, i139, i142, i145);
                        i137 += i43;
                        i136 += i35;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i139 += i36;
                        i142 += i37;
                        i145 += i38;
                        i156 = i22 + class_210.h;
                    }
                    while (true) {
                        i154--;
                        if (i154 < 0) {
                            return;
                        }
                        a(class_210.g, i22, i137 >> 16, i147 >> 16, i140, i143, i146, i148, i149, i150);
                        i137 += i43;
                        i147 += i39;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i148 += i40;
                        i149 += i41;
                        i150 += i42;
                        i22 += class_210.h;
                    }
                }
            } else {
                int i157 = i5 << 16;
                int i158 = i157;
                int i159 = i157;
                int i160 = i26 << 16;
                int i161 = i160;
                int i162 = i160;
                int i163 = i27 << 16;
                int i164 = i163;
                int i165 = i163;
                int i166 = i28 << 16;
                int i167 = i166;
                int i168 = i166;
                if (i2 < 0) {
                    i159 -= i43 * i2;
                    i158 -= i35 * i2;
                    i162 -= i44 * i2;
                    i165 -= i45 * i2;
                    i168 -= i46 * i2;
                    i161 -= i36 * i2;
                    i164 -= i37 * i2;
                    i167 -= i38 * i2;
                    i2 = 0;
                }
                int i169 = i7 << 16;
                int i170 = i32 << 16;
                int i171 = i33 << 16;
                int i172 = i34 << 16;
                if (i4 < 0) {
                    i169 -= i39 * i4;
                    i170 -= i40 * i4;
                    i171 -= i41 * i4;
                    i172 -= i42 * i4;
                    i4 = 0;
                }
                if ((i2 == i4 || i43 >= i35) && (i2 != i4 || i39 <= i35)) {
                    int i173 = i3 - i4;
                    int i174 = i4 - i2;
                    int i175 = x[i2];
                    while (true) {
                        i19 = i175;
                        i174--;
                        if (i174 < 0) {
                            break;
                        }
                        a(class_210.g, i19, i158 >> 16, i159 >> 16, i161, i164, i167, i162, i165, i168);
                        i159 += i43;
                        i158 += i35;
                        i162 += i44;
                        i165 += i45;
                        i168 += i46;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        i175 = i19 + class_210.h;
                    }
                    while (true) {
                        i173--;
                        if (i173 < 0) {
                            return;
                        }
                        a(class_210.g, i19, i158 >> 16, i169 >> 16, i161, i164, i167, i170, i171, i172);
                        i169 += i39;
                        i158 += i35;
                        i170 += i40;
                        i171 += i41;
                        i172 += i42;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        i19 += class_210.h;
                    }
                } else {
                    int i176 = i3 - i4;
                    int i177 = i4 - i2;
                    int i178 = x[i2];
                    while (true) {
                        i20 = i178;
                        i177--;
                        if (i177 < 0) {
                            break;
                        }
                        a(class_210.g, i20, i159 >> 16, i158 >> 16, i162, i165, i168, i161, i164, i167);
                        i159 += i43;
                        i158 += i35;
                        i162 += i44;
                        i165 += i45;
                        i168 += i46;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        i178 = i20 + class_210.h;
                    }
                    while (true) {
                        i176--;
                        if (i176 < 0) {
                            return;
                        }
                        a(class_210.g, i20, i169 >> 16, i158 >> 16, i170, i171, i172, i161, i164, i167);
                        i169 += i39;
                        i158 += i35;
                        i170 += i40;
                        i171 += i41;
                        i172 += i42;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        i20 += class_210.h;
                    }
                }
            }
        }
    }

    public static void a(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (e.a() && !h) {
            return;
        }
        int i11 = i4 - i3;
        if (i11 <= 0) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        int i12 = (i8 - i5) / i11;
        int i13 = (i9 - i6) / i11;
        int i14 = (i10 - i7) / i11;
        if (o) {
            if (i4 > class_210.n) {
                i11 -= i4 - class_210.n;
                i4 = class_210.n;
            }
            if (i3 < 0) {
                i11 = i4;
                i5 -= i3 * i12;
                i6 -= i3 * i13;
                i7 -= i3 * i14;
                i3 = 0;
            }
        }
        if (i3 >= i4) {
            return;
        }
        int i15 = i2 + i3;
        if (r == 0) {
            while (true) {
                i11--;
                if (i11 < 0) {
                    return;
                }
                if (e.a()) {
                    class_210.a(iArr, i15, (i5 & bk.aS) | ((i6 >> 8) & bk.ao) | ((i7 >> 16) & 255), (i5 & bk.aS) | ((i6 >> 8) & bk.ao) | ((i7 >> 16) & 255), 255);
                } else {
                    iArr[i15] = (i5 & bk.aS) | ((i6 >> 8) & bk.ao) | ((i7 >> 16) & 255);
                }
                i5 += i12;
                i6 += i13;
                i7 += i14;
                i15++;
            }
        } else {
            int i16 = r;
            int i17 = 256 - r;
            while (true) {
                i11--;
                if (i11 < 0) {
                    return;
                }
                int i18 = (i5 & bk.aS) | ((i6 >> 8) & bk.ao) | ((i7 >> 16) & 255);
                int i19 = ((((i18 & 16711935) * i17) >> 8) & 16711935) + ((((i18 & bk.ao) * i17) >> 8) & bk.ao);
                int i20 = iArr[i15];
                if (e.a()) {
                    class_210.a(iArr, i15, i19 + ((((i20 & 16711935) * i16) >> 8) & 16711935) + ((((i20 & bk.ao) * i16) >> 8) & bk.ao), i19 + ((((i20 & 16711935) * i16) >> 8) & 16711935) + ((((i20 & bk.ao) * i16) >> 8) & bk.ao), 255);
                } else {
                    iArr[i15] = i19 + ((((i20 & 16711935) * i16) >> 8) & 16711935) + ((((i20 & bk.ao) * i16) >> 8) & bk.ao);
                }
                i5 += i12;
                i6 += i13;
                i7 += i14;
                i15++;
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (e.a() && !h) {
            return;
        }
        int i21 = 0;
        if (i3 != i2) {
            i21 = ((i6 - i5) << 16) / (i3 - i2);
        }
        int i22 = 0;
        if (i4 != i3) {
            i22 = ((i7 - i6) << 16) / (i4 - i3);
        }
        int i23 = 0;
        if (i4 != i2) {
            i23 = ((i5 - i7) << 16) / (i2 - i4);
        }
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i4 < i2) {
                    int i24 = i6 << 16;
                    int i25 = i24;
                    int i26 = i24;
                    if (i3 < 0) {
                        i26 -= i21 * i3;
                        i25 -= i22 * i3;
                        i3 = 0;
                    }
                    int i27 = i7 << 16;
                    if (i4 < 0) {
                        i27 -= i23 * i4;
                        i4 = 0;
                    }
                    if ((i3 == i4 || i21 >= i22) && (i3 != i4 || i21 <= i23)) {
                        int i28 = i2 - i4;
                        int i29 = i4 - i3;
                        int i30 = x[i3];
                        while (true) {
                            i15 = i30;
                            i29--;
                            if (i29 < 0) {
                                break;
                            }
                            a(class_210.g, i15, i8, i25 >> 16, i26 >> 16);
                            i26 += i21;
                            i25 += i22;
                            i30 = i15 + class_210.h;
                        }
                        while (true) {
                            i28--;
                            if (i28 < 0) {
                                return;
                            }
                            a(class_210.g, i15, i8, i27 >> 16, i26 >> 16);
                            i26 += i21;
                            i27 += i23;
                            i15 += class_210.h;
                        }
                    } else {
                        int i31 = i2 - i4;
                        int i32 = i4 - i3;
                        int i33 = x[i3];
                        while (true) {
                            i16 = i33;
                            i32--;
                            if (i32 < 0) {
                                break;
                            }
                            a(class_210.g, i16, i8, i26 >> 16, i25 >> 16);
                            i26 += i21;
                            i25 += i22;
                            i33 = i16 + class_210.h;
                        }
                        while (true) {
                            i31--;
                            if (i31 < 0) {
                                return;
                            }
                            a(class_210.g, i16, i8, i26 >> 16, i27 >> 16);
                            i26 += i21;
                            i27 += i23;
                            i16 += class_210.h;
                        }
                    }
                } else {
                    int i34 = i6 << 16;
                    int i35 = i34;
                    int i36 = i34;
                    if (i3 < 0) {
                        i36 -= i21 * i3;
                        i35 -= i22 * i3;
                        i3 = 0;
                    }
                    int i37 = i5 << 16;
                    if (i2 < 0) {
                        i37 -= i23 * i2;
                        i2 = 0;
                    }
                    if (i21 < i22) {
                        int i38 = i4 - i2;
                        int i39 = i2 - i3;
                        int i40 = x[i3];
                        while (true) {
                            i14 = i40;
                            i39--;
                            if (i39 < 0) {
                                break;
                            }
                            a(class_210.g, i14, i8, i36 >> 16, i35 >> 16);
                            i36 += i21;
                            i35 += i22;
                            i40 = i14 + class_210.h;
                        }
                        while (true) {
                            i38--;
                            if (i38 < 0) {
                                return;
                            }
                            a(class_210.g, i14, i8, i37 >> 16, i35 >> 16);
                            i37 += i23;
                            i35 += i22;
                            i14 += class_210.h;
                        }
                    } else {
                        int i41 = i4 - i2;
                        int i42 = i2 - i3;
                        int i43 = x[i3];
                        while (true) {
                            i13 = i43;
                            i42--;
                            if (i42 < 0) {
                                break;
                            }
                            a(class_210.g, i13, i8, i35 >> 16, i36 >> 16);
                            i36 += i21;
                            i35 += i22;
                            i43 = i13 + class_210.h;
                        }
                        while (true) {
                            i41--;
                            if (i41 < 0) {
                                return;
                            }
                            a(class_210.g, i13, i8, i35 >> 16, i37 >> 16);
                            i37 += i23;
                            i35 += i22;
                            i13 += class_210.h;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i2 < i3) {
                    int i44 = i7 << 16;
                    int i45 = i44;
                    int i46 = i44;
                    if (i4 < 0) {
                        i46 -= i22 * i4;
                        i45 -= i23 * i4;
                        i4 = 0;
                    }
                    int i47 = i5 << 16;
                    if (i2 < 0) {
                        i47 -= i21 * i2;
                        i2 = 0;
                    }
                    if (i22 < i23) {
                        int i48 = i3 - i2;
                        int i49 = i2 - i4;
                        int i50 = x[i4];
                        while (true) {
                            i12 = i50;
                            i49--;
                            if (i49 < 0) {
                                break;
                            }
                            a(class_210.g, i12, i8, i46 >> 16, i45 >> 16);
                            i46 += i22;
                            i45 += i23;
                            i50 = i12 + class_210.h;
                        }
                        while (true) {
                            i48--;
                            if (i48 < 0) {
                                return;
                            }
                            a(class_210.g, i12, i8, i46 >> 16, i47 >> 16);
                            i46 += i22;
                            i47 += i21;
                            i12 += class_210.h;
                        }
                    } else {
                        int i51 = i3 - i2;
                        int i52 = i2 - i4;
                        int i53 = x[i4];
                        while (true) {
                            i11 = i53;
                            i52--;
                            if (i52 < 0) {
                                break;
                            }
                            a(class_210.g, i11, i8, i45 >> 16, i46 >> 16);
                            i46 += i22;
                            i45 += i23;
                            i53 = i11 + class_210.h;
                        }
                        while (true) {
                            i51--;
                            if (i51 < 0) {
                                return;
                            }
                            a(class_210.g, i11, i8, i47 >> 16, i46 >> 16);
                            i46 += i22;
                            i47 += i21;
                            i11 += class_210.h;
                        }
                    }
                } else {
                    int i54 = i7 << 16;
                    int i55 = i54;
                    int i56 = i54;
                    if (i4 < 0) {
                        i56 -= i22 * i4;
                        i55 -= i23 * i4;
                        i4 = 0;
                    }
                    int i57 = i6 << 16;
                    if (i3 < 0) {
                        i57 -= i21 * i3;
                        i3 = 0;
                    }
                    if (i22 < i23) {
                        int i58 = i2 - i3;
                        int i59 = i3 - i4;
                        int i60 = x[i4];
                        while (true) {
                            i10 = i60;
                            i59--;
                            if (i59 < 0) {
                                break;
                            }
                            a(class_210.g, i10, i8, i56 >> 16, i55 >> 16);
                            i56 += i22;
                            i55 += i23;
                            i60 = i10 + class_210.h;
                        }
                        while (true) {
                            i58--;
                            if (i58 < 0) {
                                return;
                            }
                            a(class_210.g, i10, i8, i57 >> 16, i55 >> 16);
                            i57 += i21;
                            i55 += i23;
                            i10 += class_210.h;
                        }
                    } else {
                        int i61 = i2 - i3;
                        int i62 = i3 - i4;
                        int i63 = x[i4];
                        while (true) {
                            i9 = i63;
                            i62--;
                            if (i62 < 0) {
                                break;
                            }
                            a(class_210.g, i9, i8, i55 >> 16, i56 >> 16);
                            i56 += i22;
                            i55 += i23;
                            i63 = i9 + class_210.h;
                        }
                        while (true) {
                            i61--;
                            if (i61 < 0) {
                                return;
                            }
                            a(class_210.g, i9, i8, i55 >> 16, i57 >> 16);
                            i57 += i21;
                            i55 += i23;
                            i9 += class_210.h;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i3 < i4) {
                int i64 = i5 << 16;
                int i65 = i64;
                int i66 = i64;
                if (i2 < 0) {
                    i66 -= i23 * i2;
                    i65 -= i21 * i2;
                    i2 = 0;
                }
                int i67 = i6 << 16;
                if (i3 < 0) {
                    i67 -= i22 * i3;
                    i3 = 0;
                }
                if ((i2 == i3 || i23 >= i21) && (i2 != i3 || i23 <= i22)) {
                    int i68 = i4 - i3;
                    int i69 = i3 - i2;
                    int i70 = x[i2];
                    while (true) {
                        i19 = i70;
                        i69--;
                        if (i69 < 0) {
                            break;
                        }
                        a(class_210.g, i19, i8, i65 >> 16, i66 >> 16);
                        i66 += i23;
                        i65 += i21;
                        i70 = i19 + class_210.h;
                    }
                    while (true) {
                        i68--;
                        if (i68 < 0) {
                            return;
                        }
                        a(class_210.g, i19, i8, i67 >> 16, i66 >> 16);
                        i66 += i23;
                        i67 += i22;
                        i19 += class_210.h;
                    }
                } else {
                    int i71 = i4 - i3;
                    int i72 = i3 - i2;
                    int i73 = x[i2];
                    while (true) {
                        i20 = i73;
                        i72--;
                        if (i72 < 0) {
                            break;
                        }
                        a(class_210.g, i20, i8, i66 >> 16, i65 >> 16);
                        i66 += i23;
                        i65 += i21;
                        i73 = i20 + class_210.h;
                    }
                    while (true) {
                        i71--;
                        if (i71 < 0) {
                            return;
                        }
                        a(class_210.g, i20, i8, i66 >> 16, i67 >> 16);
                        i66 += i23;
                        i67 += i22;
                        i20 += class_210.h;
                    }
                }
            } else {
                int i74 = i5 << 16;
                int i75 = i74;
                int i76 = i74;
                if (i2 < 0) {
                    i76 -= i23 * i2;
                    i75 -= i21 * i2;
                    i2 = 0;
                }
                int i77 = i7 << 16;
                if (i4 < 0) {
                    i77 -= i22 * i4;
                    i4 = 0;
                }
                if ((i2 == i4 || i23 >= i21) && (i2 != i4 || i22 <= i21)) {
                    int i78 = i3 - i4;
                    int i79 = i4 - i2;
                    int i80 = x[i2];
                    while (true) {
                        i17 = i80;
                        i79--;
                        if (i79 < 0) {
                            break;
                        }
                        a(class_210.g, i17, i8, i75 >> 16, i76 >> 16);
                        i76 += i23;
                        i75 += i21;
                        i80 = i17 + class_210.h;
                    }
                    while (true) {
                        i78--;
                        if (i78 < 0) {
                            return;
                        }
                        a(class_210.g, i17, i8, i75 >> 16, i77 >> 16);
                        i77 += i22;
                        i75 += i21;
                        i17 += class_210.h;
                    }
                } else {
                    int i81 = i3 - i4;
                    int i82 = i4 - i2;
                    int i83 = x[i2];
                    while (true) {
                        i18 = i83;
                        i82--;
                        if (i82 < 0) {
                            break;
                        }
                        a(class_210.g, i18, i8, i76 >> 16, i75 >> 16);
                        i76 += i23;
                        i75 += i21;
                        i83 = i18 + class_210.h;
                    }
                    while (true) {
                        i81--;
                        if (i81 < 0) {
                            return;
                        }
                        a(class_210.g, i18, i8, i77 >> 16, i75 >> 16);
                        i77 += i22;
                        i75 += i21;
                        i18 += class_210.h;
                    }
                }
            }
        }
    }

    private static void a(int[] iArr, int i2, int i3, int i4, int i5) {
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        if (o) {
            if (i5 > class_210.n) {
                i5 = class_210.n;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 >= i5) {
            return;
        }
        int i6 = i2 + i4;
        int i7 = (i5 - i4) >> 2;
        if (r == 0) {
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                if (e.a()) {
                    int i8 = i6;
                    int i9 = i6 + 1;
                    class_210.a(iArr, i8, i3, i3, 256 - r);
                    int i10 = i9 + 1;
                    class_210.a(iArr, i9, i3, i3, 256 - r);
                    int i11 = i10 + 1;
                    class_210.a(iArr, i10, i3, i3, 256 - r);
                    i6 = i11 + 1;
                    class_210.a(iArr, i11, i3, i3, 256 - r);
                } else {
                    int i12 = i6;
                    int i13 = i6 + 1;
                    iArr[i12] = i3;
                    int i14 = i13 + 1;
                    iArr[i13] = i3;
                    int i15 = i14 + 1;
                    iArr[i14] = i3;
                    i6 = i15 + 1;
                    iArr[i15] = i3;
                }
            }
            int i16 = (i5 - i4) & 3;
            while (true) {
                i16--;
                if (i16 < 0) {
                    return;
                }
                if (e.a()) {
                    int i17 = i6;
                    i6++;
                    class_210.a(iArr, i17, i3, i3, 256 - r);
                } else {
                    int i18 = i6;
                    i6++;
                    iArr[i18] = i3;
                }
            }
        } else {
            int i19 = r;
            int i20 = 256 - r;
            int i21 = ((((i3 & 16711935) * i20) >> 8) & 16711935) + ((((i3 & bk.ao) * i20) >> 8) & bk.ao);
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                if (e.a()) {
                    int i22 = i21 + ((((iArr[i6 + 1] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i6 + 1] & bk.ao) * i19) >> 8) & bk.ao);
                    int i23 = i6;
                    int i24 = i6 + 1;
                    class_210.a(iArr, i23, i22, i22, i19);
                    int i25 = i21 + ((((iArr[i24 + 1] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i24 + 1] & bk.ao) * i19) >> 8) & bk.ao);
                    int i26 = i24 + 1;
                    class_210.a(iArr, i24, i25, i25, i19);
                    int i27 = i21 + ((((iArr[i26 + 1] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i26 + 1] & bk.ao) * i19) >> 8) & bk.ao);
                    int i28 = i26 + 1;
                    class_210.a(iArr, i26, i27, i27, i19);
                    int i29 = i21 + ((((iArr[i28 + 1] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i28 + 1] & bk.ao) * i19) >> 8) & bk.ao);
                    i6 = i28 + 1;
                    class_210.a(iArr, i28, i29, i29, i19);
                } else {
                    int i30 = i6;
                    int i31 = i6 + 1;
                    iArr[i30] = i21 + ((((iArr[i31] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i31] & bk.ao) * i19) >> 8) & bk.ao);
                    int i32 = i31 + 1;
                    iArr[i31] = i21 + ((((iArr[i32] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i32] & bk.ao) * i19) >> 8) & bk.ao);
                    int i33 = i32 + 1;
                    iArr[i32] = i21 + ((((iArr[i33] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i33] & bk.ao) * i19) >> 8) & bk.ao);
                    i6 = i33 + 1;
                    iArr[i33] = i21 + ((((iArr[i6] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i19) >> 8) & bk.ao);
                }
            }
            int i34 = (i5 - i4) & 3;
            while (true) {
                i34--;
                if (i34 < 0) {
                    return;
                }
                if (e.a()) {
                    int i35 = i6;
                    i6++;
                    class_210.a(iArr, i35, i21 + ((((iArr[i6] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i19) >> 8) & bk.ao), i21 + ((((iArr[i6] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i19) >> 8) & bk.ao), i19);
                } else {
                    int i36 = i6;
                    i6++;
                    iArr[i36] = i21 + ((((iArr[i6] & 16711935) * i19) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i19) >> 8) & bk.ao);
                }
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        if (!e.a() || h) {
            if ((e.a() || i) && p) {
                c(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
            } else {
                b(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
            }
        }
    }

    public static void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        if (e.a() && !h) {
            return;
        }
        int[] iArrD = d(i20);
        D = !G[i20];
        int i21 = i11 - i12;
        int i22 = i14 - i15;
        int i23 = i17 - i18;
        int i24 = i13 - i11;
        int i25 = i16 - i14;
        int i26 = i19 - i17;
        int i27 = ((i24 * i14) - (i25 * i11)) << 14;
        int i28 = ((i25 * i17) - (i26 * i14)) << 8;
        int i29 = ((i26 * i11) - (i24 * i17)) << 5;
        int i30 = ((i21 * i14) - (i22 * i11)) << 14;
        int i31 = ((i22 * i17) - (i23 * i14)) << 8;
        int i32 = ((i23 * i11) - (i21 * i17)) << 5;
        int i33 = ((i22 * i24) - (i21 * i25)) << 14;
        int i34 = ((i23 * i25) - (i22 * i26)) << 8;
        int i35 = ((i21 * i26) - (i23 * i24)) << 5;
        int i36 = 0;
        int i37 = 0;
        if (i3 != i2) {
            i36 = ((i6 - i5) << 16) / (i3 - i2);
            i37 = ((i9 - i8) << 16) / (i3 - i2);
        }
        int i38 = 0;
        int i39 = 0;
        if (i4 != i3) {
            i38 = ((i7 - i6) << 16) / (i4 - i3);
            i39 = ((i10 - i9) << 16) / (i4 - i3);
        }
        int i40 = 0;
        int i41 = 0;
        if (i4 != i2) {
            i40 = ((i5 - i7) << 16) / (i2 - i4);
            i41 = ((i8 - i10) << 16) / (i2 - i4);
        }
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i4 < i2) {
                    int i42 = i6 << 16;
                    int i43 = i42;
                    int i44 = i42;
                    int i45 = i9 << 16;
                    int i46 = i45;
                    int i47 = i45;
                    if (i3 < 0) {
                        i44 -= i36 * i3;
                        i43 -= i38 * i3;
                        i47 -= i37 * i3;
                        i46 -= i39 * i3;
                        i3 = 0;
                    }
                    int i48 = i7 << 16;
                    int i49 = i10 << 16;
                    if (i4 < 0) {
                        i48 -= i40 * i4;
                        i49 -= i41 * i4;
                        i4 = 0;
                    }
                    int i50 = i3 - t;
                    int i51 = i27 + (i29 * i50);
                    int i52 = i30 + (i32 * i50);
                    int i53 = i33 + (i35 * i50);
                    if ((i3 == i4 || i36 >= i38) && (i3 != i4 || i36 <= i40)) {
                        int i54 = i2 - i4;
                        int i55 = i4 - i3;
                        int i56 = x[i3];
                        while (true) {
                            i55--;
                            if (i55 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i56, i43 >> 16, i44 >> 16, i46 >> 8, i47 >> 8, i51, i52, i53, i28, i31, i34);
                            i44 += i36;
                            i43 += i38;
                            i47 += i37;
                            i46 += i39;
                            i56 += class_210.h;
                            i51 += i29;
                            i52 += i32;
                            i53 += i35;
                        }
                        while (true) {
                            i54--;
                            if (i54 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i56, i48 >> 16, i44 >> 16, i49 >> 8, i47 >> 8, i51, i52, i53, i28, i31, i34);
                            i44 += i36;
                            i48 += i40;
                            i47 += i37;
                            i49 += i41;
                            i56 += class_210.h;
                            i51 += i29;
                            i52 += i32;
                            i53 += i35;
                        }
                    } else {
                        int i57 = i2 - i4;
                        int i58 = i4 - i3;
                        int i59 = x[i3];
                        while (true) {
                            i58--;
                            if (i58 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i59, i44 >> 16, i43 >> 16, i47 >> 8, i46 >> 8, i51, i52, i53, i28, i31, i34);
                            i44 += i36;
                            i43 += i38;
                            i47 += i37;
                            i46 += i39;
                            i59 += class_210.h;
                            i51 += i29;
                            i52 += i32;
                            i53 += i35;
                        }
                        while (true) {
                            i57--;
                            if (i57 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i59, i44 >> 16, i48 >> 16, i47 >> 8, i49 >> 8, i51, i52, i53, i28, i31, i34);
                            i44 += i36;
                            i48 += i40;
                            i47 += i37;
                            i49 += i41;
                            i59 += class_210.h;
                            i51 += i29;
                            i52 += i32;
                            i53 += i35;
                        }
                    }
                } else {
                    int i60 = i6 << 16;
                    int i61 = i60;
                    int i62 = i60;
                    int i63 = i9 << 16;
                    int i64 = i63;
                    int i65 = i63;
                    if (i3 < 0) {
                        i62 -= i36 * i3;
                        i61 -= i38 * i3;
                        i65 -= i37 * i3;
                        i64 -= i39 * i3;
                        i3 = 0;
                    }
                    int i66 = i5 << 16;
                    int i67 = i8 << 16;
                    if (i2 < 0) {
                        i66 -= i40 * i2;
                        i67 -= i41 * i2;
                        i2 = 0;
                    }
                    int i68 = i3 - t;
                    int i69 = i27 + (i29 * i68);
                    int i70 = i30 + (i32 * i68);
                    int i71 = i33 + (i35 * i68);
                    if (i36 < i38) {
                        int i72 = i4 - i2;
                        int i73 = i2 - i3;
                        int i74 = x[i3];
                        while (true) {
                            i73--;
                            if (i73 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i74, i62 >> 16, i61 >> 16, i65 >> 8, i64 >> 8, i69, i70, i71, i28, i31, i34);
                            i62 += i36;
                            i61 += i38;
                            i65 += i37;
                            i64 += i39;
                            i74 += class_210.h;
                            i69 += i29;
                            i70 += i32;
                            i71 += i35;
                        }
                        while (true) {
                            i72--;
                            if (i72 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i74, i66 >> 16, i61 >> 16, i67 >> 8, i64 >> 8, i69, i70, i71, i28, i31, i34);
                            i66 += i40;
                            i61 += i38;
                            i67 += i41;
                            i64 += i39;
                            i74 += class_210.h;
                            i69 += i29;
                            i70 += i32;
                            i71 += i35;
                        }
                    } else {
                        int i75 = i4 - i2;
                        int i76 = i2 - i3;
                        int i77 = x[i3];
                        while (true) {
                            i76--;
                            if (i76 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i77, i61 >> 16, i62 >> 16, i64 >> 8, i65 >> 8, i69, i70, i71, i28, i31, i34);
                            i62 += i36;
                            i61 += i38;
                            i65 += i37;
                            i64 += i39;
                            i77 += class_210.h;
                            i69 += i29;
                            i70 += i32;
                            i71 += i35;
                        }
                        while (true) {
                            i75--;
                            if (i75 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i77, i61 >> 16, i66 >> 16, i64 >> 8, i67 >> 8, i69, i70, i71, i28, i31, i34);
                            i66 += i40;
                            i61 += i38;
                            i67 += i41;
                            i64 += i39;
                            i77 += class_210.h;
                            i69 += i29;
                            i70 += i32;
                            i71 += i35;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i2 < i3) {
                    int i78 = i7 << 16;
                    int i79 = i78;
                    int i80 = i78;
                    int i81 = i10 << 16;
                    int i82 = i81;
                    int i83 = i81;
                    if (i4 < 0) {
                        i80 -= i38 * i4;
                        i79 -= i40 * i4;
                        i83 -= i39 * i4;
                        i82 -= i41 * i4;
                        i4 = 0;
                    }
                    int i84 = i5 << 16;
                    int i85 = i8 << 16;
                    if (i2 < 0) {
                        i84 -= i36 * i2;
                        i85 -= i37 * i2;
                        i2 = 0;
                    }
                    int i86 = i4 - t;
                    int i87 = i27 + (i29 * i86);
                    int i88 = i30 + (i32 * i86);
                    int i89 = i33 + (i35 * i86);
                    if (i38 < i40) {
                        int i90 = i3 - i2;
                        int i91 = i2 - i4;
                        int i92 = x[i4];
                        while (true) {
                            i91--;
                            if (i91 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i92, i80 >> 16, i79 >> 16, i83 >> 8, i82 >> 8, i87, i88, i89, i28, i31, i34);
                            i80 += i38;
                            i79 += i40;
                            i83 += i39;
                            i82 += i41;
                            i92 += class_210.h;
                            i87 += i29;
                            i88 += i32;
                            i89 += i35;
                        }
                        while (true) {
                            i90--;
                            if (i90 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i92, i80 >> 16, i84 >> 16, i83 >> 8, i85 >> 8, i87, i88, i89, i28, i31, i34);
                            i80 += i38;
                            i84 += i36;
                            i83 += i39;
                            i85 += i37;
                            i92 += class_210.h;
                            i87 += i29;
                            i88 += i32;
                            i89 += i35;
                        }
                    } else {
                        int i93 = i3 - i2;
                        int i94 = i2 - i4;
                        int i95 = x[i4];
                        while (true) {
                            i94--;
                            if (i94 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i95, i79 >> 16, i80 >> 16, i82 >> 8, i83 >> 8, i87, i88, i89, i28, i31, i34);
                            i80 += i38;
                            i79 += i40;
                            i83 += i39;
                            i82 += i41;
                            i95 += class_210.h;
                            i87 += i29;
                            i88 += i32;
                            i89 += i35;
                        }
                        while (true) {
                            i93--;
                            if (i93 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i95, i84 >> 16, i80 >> 16, i85 >> 8, i83 >> 8, i87, i88, i89, i28, i31, i34);
                            i80 += i38;
                            i84 += i36;
                            i83 += i39;
                            i85 += i37;
                            i95 += class_210.h;
                            i87 += i29;
                            i88 += i32;
                            i89 += i35;
                        }
                    }
                } else {
                    int i96 = i7 << 16;
                    int i97 = i96;
                    int i98 = i96;
                    int i99 = i10 << 16;
                    int i100 = i99;
                    int i101 = i99;
                    if (i4 < 0) {
                        i98 -= i38 * i4;
                        i97 -= i40 * i4;
                        i101 -= i39 * i4;
                        i100 -= i41 * i4;
                        i4 = 0;
                    }
                    int i102 = i6 << 16;
                    int i103 = i9 << 16;
                    if (i3 < 0) {
                        i102 -= i36 * i3;
                        i103 -= i37 * i3;
                        i3 = 0;
                    }
                    int i104 = i4 - t;
                    int i105 = i27 + (i29 * i104);
                    int i106 = i30 + (i32 * i104);
                    int i107 = i33 + (i35 * i104);
                    if (i38 < i40) {
                        int i108 = i2 - i3;
                        int i109 = i3 - i4;
                        int i110 = x[i4];
                        while (true) {
                            i109--;
                            if (i109 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i110, i98 >> 16, i97 >> 16, i101 >> 8, i100 >> 8, i105, i106, i107, i28, i31, i34);
                            i98 += i38;
                            i97 += i40;
                            i101 += i39;
                            i100 += i41;
                            i110 += class_210.h;
                            i105 += i29;
                            i106 += i32;
                            i107 += i35;
                        }
                        while (true) {
                            i108--;
                            if (i108 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i110, i102 >> 16, i97 >> 16, i103 >> 8, i100 >> 8, i105, i106, i107, i28, i31, i34);
                            i102 += i36;
                            i97 += i40;
                            i103 += i37;
                            i100 += i41;
                            i110 += class_210.h;
                            i105 += i29;
                            i106 += i32;
                            i107 += i35;
                        }
                    } else {
                        int i111 = i2 - i3;
                        int i112 = i3 - i4;
                        int i113 = x[i4];
                        while (true) {
                            i112--;
                            if (i112 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i113, i97 >> 16, i98 >> 16, i100 >> 8, i101 >> 8, i105, i106, i107, i28, i31, i34);
                            i98 += i38;
                            i97 += i40;
                            i101 += i39;
                            i100 += i41;
                            i113 += class_210.h;
                            i105 += i29;
                            i106 += i32;
                            i107 += i35;
                        }
                        while (true) {
                            i111--;
                            if (i111 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i113, i97 >> 16, i102 >> 16, i100 >> 8, i103 >> 8, i105, i106, i107, i28, i31, i34);
                            i102 += i36;
                            i97 += i40;
                            i103 += i37;
                            i100 += i41;
                            i113 += class_210.h;
                            i105 += i29;
                            i106 += i32;
                            i107 += i35;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i3 < i4) {
                int i114 = i5 << 16;
                int i115 = i114;
                int i116 = i114;
                int i117 = i8 << 16;
                int i118 = i117;
                int i119 = i117;
                if (i2 < 0) {
                    i116 -= i40 * i2;
                    i115 -= i36 * i2;
                    i119 -= i41 * i2;
                    i118 -= i37 * i2;
                    i2 = 0;
                }
                int i120 = i6 << 16;
                int i121 = i9 << 16;
                if (i3 < 0) {
                    i120 -= i38 * i3;
                    i121 -= i39 * i3;
                    i3 = 0;
                }
                int i122 = i2 - t;
                int i123 = i27 + (i29 * i122);
                int i124 = i30 + (i32 * i122);
                int i125 = i33 + (i35 * i122);
                if ((i2 == i3 || i40 >= i36) && (i2 != i3 || i40 <= i38)) {
                    int i126 = i4 - i3;
                    int i127 = i3 - i2;
                    int i128 = x[i2];
                    while (true) {
                        i127--;
                        if (i127 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i128, i115 >> 16, i116 >> 16, i118 >> 8, i119 >> 8, i123, i124, i125, i28, i31, i34);
                        i116 += i40;
                        i115 += i36;
                        i119 += i41;
                        i118 += i37;
                        i128 += class_210.h;
                        i123 += i29;
                        i124 += i32;
                        i125 += i35;
                    }
                    while (true) {
                        i126--;
                        if (i126 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i128, i120 >> 16, i116 >> 16, i121 >> 8, i119 >> 8, i123, i124, i125, i28, i31, i34);
                        i116 += i40;
                        i120 += i38;
                        i119 += i41;
                        i121 += i39;
                        i128 += class_210.h;
                        i123 += i29;
                        i124 += i32;
                        i125 += i35;
                    }
                } else {
                    int i129 = i4 - i3;
                    int i130 = i3 - i2;
                    int i131 = x[i2];
                    while (true) {
                        i130--;
                        if (i130 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i131, i116 >> 16, i115 >> 16, i119 >> 8, i118 >> 8, i123, i124, i125, i28, i31, i34);
                        i116 += i40;
                        i115 += i36;
                        i119 += i41;
                        i118 += i37;
                        i131 += class_210.h;
                        i123 += i29;
                        i124 += i32;
                        i125 += i35;
                    }
                    while (true) {
                        i129--;
                        if (i129 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i131, i116 >> 16, i120 >> 16, i119 >> 8, i121 >> 8, i123, i124, i125, i28, i31, i34);
                        i116 += i40;
                        i120 += i38;
                        i119 += i41;
                        i121 += i39;
                        i131 += class_210.h;
                        i123 += i29;
                        i124 += i32;
                        i125 += i35;
                    }
                }
            } else {
                int i132 = i5 << 16;
                int i133 = i132;
                int i134 = i132;
                int i135 = i8 << 16;
                int i136 = i135;
                int i137 = i135;
                if (i2 < 0) {
                    i134 -= i40 * i2;
                    i133 -= i36 * i2;
                    i137 -= i41 * i2;
                    i136 -= i37 * i2;
                    i2 = 0;
                }
                int i138 = i7 << 16;
                int i139 = i10 << 16;
                if (i4 < 0) {
                    i138 -= i38 * i4;
                    i139 -= i39 * i4;
                    i4 = 0;
                }
                int i140 = i2 - t;
                int i141 = i27 + (i29 * i140);
                int i142 = i30 + (i32 * i140);
                int i143 = i33 + (i35 * i140);
                if ((i2 == i4 || i40 >= i36) && (i2 != i4 || i38 <= i36)) {
                    int i144 = i3 - i4;
                    int i145 = i4 - i2;
                    int i146 = x[i2];
                    while (true) {
                        i145--;
                        if (i145 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i146, i133 >> 16, i134 >> 16, i136 >> 8, i137 >> 8, i141, i142, i143, i28, i31, i34);
                        i134 += i40;
                        i133 += i36;
                        i137 += i41;
                        i136 += i37;
                        i146 += class_210.h;
                        i141 += i29;
                        i142 += i32;
                        i143 += i35;
                    }
                    while (true) {
                        i144--;
                        if (i144 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i146, i133 >> 16, i138 >> 16, i136 >> 8, i139 >> 8, i141, i142, i143, i28, i31, i34);
                        i138 += i38;
                        i133 += i36;
                        i139 += i39;
                        i136 += i37;
                        i146 += class_210.h;
                        i141 += i29;
                        i142 += i32;
                        i143 += i35;
                    }
                } else {
                    int i147 = i3 - i4;
                    int i148 = i4 - i2;
                    int i149 = x[i2];
                    while (true) {
                        i148--;
                        if (i148 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i149, i134 >> 16, i133 >> 16, i137 >> 8, i136 >> 8, i141, i142, i143, i28, i31, i34);
                        i134 += i40;
                        i133 += i36;
                        i137 += i41;
                        i136 += i37;
                        i149 += class_210.h;
                        i141 += i29;
                        i142 += i32;
                        i143 += i35;
                    }
                    while (true) {
                        i147--;
                        if (i147 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i149, i138 >> 16, i133 >> 16, i139 >> 8, i136 >> 8, i141, i142, i143, i28, i31, i34);
                        i138 += i38;
                        i133 += i36;
                        i139 += i39;
                        i136 += i37;
                        i149 += class_210.h;
                        i141 += i29;
                        i142 += i32;
                        i143 += i35;
                    }
                }
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        int i16 = 0;
        int i17 = 0;
        if (i3 >= i4) {
            return;
        }
        if (o) {
            int i18 = (i6 - i5) / (i4 - i3);
            if (i4 > class_210.n) {
                i4 = class_210.n;
            }
            if (i3 < 0) {
                i5 -= i3 * i18;
                i3 = 0;
            }
            if (i3 >= i4) {
                return;
            }
            i13 = (i4 - i3) >> 3;
            i14 = i18 << 12;
            i15 = i5 << 9;
        } else {
            if (i4 - i3 > 7) {
                i13 = (i4 - i3) >> 3;
                i14 = ((i6 - i5) * E[i13]) >> 6;
            } else {
                i13 = 0;
                i14 = 0;
            }
            i15 = i5 << 9;
        }
        int i19 = i2 + i3;
        if (n) {
            int i20 = 0;
            int i21 = 0;
            int i22 = i3 - s;
            int i23 = i7 + ((i10 >> 3) * i22);
            int i24 = i8 + ((i11 >> 3) * i22);
            int i25 = i9 + ((i12 >> 3) * i22);
            int i26 = i25 >> 12;
            if (i26 != 0) {
                i16 = i23 / i26;
                i17 = i24 / i26;
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 4032) {
                    i16 = 4032;
                }
            }
            int i27 = i23 + i10;
            int i28 = i24 + i11;
            int i29 = i25 + i12;
            int i30 = i29 >> 12;
            if (i30 != 0) {
                i20 = i27 / i30;
                i21 = i28 / i30;
                if (i20 < 7) {
                    i20 = 7;
                } else if (i20 > 4032) {
                    i20 = 4032;
                }
            }
            int i31 = (i20 - i16) >> 3;
            int i32 = (i21 - i17) >> 3;
            int i33 = i16 + ((i15 & 6291456) >> 3);
            int i34 = i15 >> 23;
            if (D) {
                while (true) {
                    int i35 = i13;
                    i13--;
                    if (i35 <= 0) {
                        break;
                    }
                    int i36 = i19;
                    int i37 = i19 + 1;
                    iArr[i36] = iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34;
                    int i38 = i33 + i31;
                    int i39 = i17 + i32;
                    int i40 = i37 + 1;
                    iArr[i37] = iArr2[(i39 & 4032) + (i38 >> 6)] >>> i34;
                    int i41 = i38 + i31;
                    int i42 = i39 + i32;
                    int i43 = i40 + 1;
                    iArr[i40] = iArr2[(i42 & 4032) + (i41 >> 6)] >>> i34;
                    int i44 = i41 + i31;
                    int i45 = i42 + i32;
                    int i46 = i43 + 1;
                    iArr[i43] = iArr2[(i45 & 4032) + (i44 >> 6)] >>> i34;
                    int i47 = i44 + i31;
                    int i48 = i45 + i32;
                    int i49 = i46 + 1;
                    iArr[i46] = iArr2[(i48 & 4032) + (i47 >> 6)] >>> i34;
                    int i50 = i47 + i31;
                    int i51 = i48 + i32;
                    int i52 = i49 + 1;
                    iArr[i49] = iArr2[(i51 & 4032) + (i50 >> 6)] >>> i34;
                    int i53 = i50 + i31;
                    int i54 = i51 + i32;
                    int i55 = i52 + 1;
                    iArr[i52] = iArr2[(i54 & 4032) + (i53 >> 6)] >>> i34;
                    i19 = i55 + 1;
                    iArr[i55] = iArr2[((i54 + i32) & 4032) + ((i53 + i31) >> 6)] >>> i34;
                    int i56 = i20;
                    i17 = i21;
                    i27 += i10;
                    i28 += i11;
                    i29 += i12;
                    int i57 = i29 >> 12;
                    if (i57 != 0) {
                        i20 = i27 / i57;
                        i21 = i28 / i57;
                        if (i20 < 7) {
                            i20 = 7;
                        } else if (i20 > 4032) {
                            i20 = 4032;
                        }
                    }
                    i31 = (i20 - i56) >> 3;
                    i32 = (i21 - i17) >> 3;
                    i15 += i14;
                    i33 = i56 + ((i15 & 6291456) >> 3);
                    i34 = i15 >> 23;
                }
                int i58 = (i4 - i3) & 7;
                while (true) {
                    int i59 = i58;
                    i58--;
                    if (i59 <= 0) {
                        return;
                    }
                    int i60 = i19;
                    i19++;
                    iArr[i60] = iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34;
                    i33 += i31;
                    i17 += i32;
                }
            } else {
                while (true) {
                    int i61 = i13;
                    i13--;
                    if (i61 <= 0) {
                        break;
                    }
                    int i62 = iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34;
                    if (i62 != 0) {
                        iArr[i19] = i62;
                    }
                    int i63 = i19 + 1;
                    int i64 = i33 + i31;
                    int i65 = i17 + i32;
                    int i66 = iArr2[(i65 & 4032) + (i64 >> 6)] >>> i34;
                    if (i66 != 0) {
                        iArr[i63] = i66;
                    }
                    int i67 = i63 + 1;
                    int i68 = i64 + i31;
                    int i69 = i65 + i32;
                    int i70 = iArr2[(i69 & 4032) + (i68 >> 6)] >>> i34;
                    if (i70 != 0) {
                        iArr[i67] = i70;
                    }
                    int i71 = i67 + 1;
                    int i72 = i68 + i31;
                    int i73 = i69 + i32;
                    int i74 = iArr2[(i73 & 4032) + (i72 >> 6)] >>> i34;
                    if (i74 != 0) {
                        iArr[i71] = i74;
                    }
                    int i75 = i71 + 1;
                    int i76 = i72 + i31;
                    int i77 = i73 + i32;
                    int i78 = iArr2[(i77 & 4032) + (i76 >> 6)] >>> i34;
                    if (i78 != 0) {
                        iArr[i75] = i78;
                    }
                    int i79 = i75 + 1;
                    int i80 = i76 + i31;
                    int i81 = i77 + i32;
                    int i82 = iArr2[(i81 & 4032) + (i80 >> 6)] >>> i34;
                    if (i82 != 0) {
                        iArr[i79] = i82;
                    }
                    int i83 = i79 + 1;
                    int i84 = i80 + i31;
                    int i85 = i81 + i32;
                    int i86 = iArr2[(i85 & 4032) + (i84 >> 6)] >>> i34;
                    if (i86 != 0) {
                        iArr[i83] = i86;
                    }
                    int i87 = i83 + 1;
                    int i88 = iArr2[((i85 + i32) & 4032) + ((i84 + i31) >> 6)] >>> i34;
                    if (i88 != 0) {
                        iArr[i87] = i88;
                    }
                    i19 = i87 + 1;
                    int i89 = i20;
                    i17 = i21;
                    i27 += i10;
                    i28 += i11;
                    i29 += i12;
                    int i90 = i29 >> 12;
                    if (i90 != 0) {
                        i20 = i27 / i90;
                        i21 = i28 / i90;
                        if (i20 < 7) {
                            i20 = 7;
                        } else if (i20 > 4032) {
                            i20 = 4032;
                        }
                    }
                    i31 = (i20 - i89) >> 3;
                    i32 = (i21 - i17) >> 3;
                    i15 += i14;
                    i33 = i89 + ((i15 & 6291456) >> 3);
                    i34 = i15 >> 23;
                }
                int i91 = (i4 - i3) & 7;
                while (true) {
                    int i92 = i91;
                    i91--;
                    if (i92 <= 0) {
                        return;
                    }
                    int i93 = iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34;
                    if (i93 != 0) {
                        iArr[i19] = i93;
                    }
                    i19++;
                    i33 += i31;
                    i17 += i32;
                }
            }
        } else {
            int i94 = 0;
            int i95 = 0;
            int i96 = i3 - s;
            int i97 = i7 + ((i10 >> 3) * i96);
            int i98 = i8 + ((i11 >> 3) * i96);
            int i99 = i9 + ((i12 >> 3) * i96);
            int i100 = i99 >> 14;
            if (i100 != 0) {
                i16 = i97 / i100;
                i17 = i98 / i100;
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 16256) {
                    i16 = 16256;
                }
            }
            int i101 = i97 + i10;
            int i102 = i98 + i11;
            int i103 = i99 + i12;
            int i104 = i103 >> 14;
            if (i104 != 0) {
                i94 = i101 / i104;
                i95 = i102 / i104;
                if (i94 < 7) {
                    i94 = 7;
                } else if (i94 > 16256) {
                    i94 = 16256;
                }
            }
            int i105 = (i94 - i16) >> 3;
            int i106 = (i95 - i17) >> 3;
            int i107 = i16 + (i15 & 6291456);
            int i108 = i15 >> 23;
            if (D) {
                while (true) {
                    int i109 = i13;
                    i13--;
                    if (i109 <= 0) {
                        break;
                    }
                    int i110 = i19;
                    int i111 = i19 + 1;
                    iArr[i110] = iArr2[(i17 & 16256) + (i107 >> 7)] >>> i108;
                    int i112 = i107 + i105;
                    int i113 = i17 + i106;
                    int i114 = i111 + 1;
                    iArr[i111] = iArr2[(i113 & 16256) + (i112 >> 7)] >>> i108;
                    int i115 = i112 + i105;
                    int i116 = i113 + i106;
                    int i117 = i114 + 1;
                    iArr[i114] = iArr2[(i116 & 16256) + (i115 >> 7)] >>> i108;
                    int i118 = i115 + i105;
                    int i119 = i116 + i106;
                    int i120 = i117 + 1;
                    iArr[i117] = iArr2[(i119 & 16256) + (i118 >> 7)] >>> i108;
                    int i121 = i118 + i105;
                    int i122 = i119 + i106;
                    int i123 = i120 + 1;
                    iArr[i120] = iArr2[(i122 & 16256) + (i121 >> 7)] >>> i108;
                    int i124 = i121 + i105;
                    int i125 = i122 + i106;
                    int i126 = i123 + 1;
                    iArr[i123] = iArr2[(i125 & 16256) + (i124 >> 7)] >>> i108;
                    int i127 = i124 + i105;
                    int i128 = i125 + i106;
                    int i129 = i126 + 1;
                    iArr[i126] = iArr2[(i128 & 16256) + (i127 >> 7)] >>> i108;
                    i19 = i129 + 1;
                    iArr[i129] = iArr2[((i128 + i106) & 16256) + ((i127 + i105) >> 7)] >>> i108;
                    int i130 = i94;
                    i17 = i95;
                    i101 += i10;
                    i102 += i11;
                    i103 += i12;
                    int i131 = i103 >> 14;
                    if (i131 != 0) {
                        i94 = i101 / i131;
                        i95 = i102 / i131;
                        if (i94 < 7) {
                            i94 = 7;
                        } else if (i94 > 16256) {
                            i94 = 16256;
                        }
                    }
                    i105 = (i94 - i130) >> 3;
                    i106 = (i95 - i17) >> 3;
                    i15 += i14;
                    i107 = i130 + (i15 & 6291456);
                    i108 = i15 >> 23;
                }
                int i132 = (i4 - i3) & 7;
                while (true) {
                    int i133 = i132;
                    i132--;
                    if (i133 <= 0) {
                        return;
                    }
                    int i134 = i19;
                    i19++;
                    iArr[i134] = iArr2[(i17 & 16256) + (i107 >> 7)] >>> i108;
                    i107 += i105;
                    i17 += i106;
                }
            } else {
                while (true) {
                    int i135 = i13;
                    i13--;
                    if (i135 <= 0) {
                        break;
                    }
                    int i136 = iArr2[(i17 & 16256) + (i107 >> 7)] >>> i108;
                    if (i136 != 0) {
                        iArr[i19] = i136;
                    }
                    int i137 = i19 + 1;
                    int i138 = i107 + i105;
                    int i139 = i17 + i106;
                    int i140 = iArr2[(i139 & 16256) + (i138 >> 7)] >>> i108;
                    if (i140 != 0) {
                        iArr[i137] = i140;
                    }
                    int i141 = i137 + 1;
                    int i142 = i138 + i105;
                    int i143 = i139 + i106;
                    int i144 = iArr2[(i143 & 16256) + (i142 >> 7)] >>> i108;
                    if (i144 != 0) {
                        iArr[i141] = i144;
                    }
                    int i145 = i141 + 1;
                    int i146 = i142 + i105;
                    int i147 = i143 + i106;
                    int i148 = iArr2[(i147 & 16256) + (i146 >> 7)] >>> i108;
                    if (i148 != 0) {
                        iArr[i145] = i148;
                    }
                    int i149 = i145 + 1;
                    int i150 = i146 + i105;
                    int i151 = i147 + i106;
                    int i152 = iArr2[(i151 & 16256) + (i150 >> 7)] >>> i108;
                    if (i152 != 0) {
                        iArr[i149] = i152;
                    }
                    int i153 = i149 + 1;
                    int i154 = i150 + i105;
                    int i155 = i151 + i106;
                    int i156 = iArr2[(i155 & 16256) + (i154 >> 7)] >>> i108;
                    if (i156 != 0) {
                        iArr[i153] = i156;
                    }
                    int i157 = i153 + 1;
                    int i158 = i154 + i105;
                    int i159 = i155 + i106;
                    int i160 = iArr2[(i159 & 16256) + (i158 >> 7)] >>> i108;
                    if (i160 != 0) {
                        iArr[i157] = i160;
                    }
                    int i161 = i157 + 1;
                    int i162 = iArr2[((i159 + i106) & 16256) + ((i158 + i105) >> 7)] >>> i108;
                    if (i162 != 0) {
                        iArr[i161] = i162;
                    }
                    i19 = i161 + 1;
                    int i163 = i94;
                    i17 = i95;
                    i101 += i10;
                    i102 += i11;
                    i103 += i12;
                    int i164 = i103 >> 14;
                    if (i164 != 0) {
                        i94 = i101 / i164;
                        i95 = i102 / i164;
                        if (i94 < 7) {
                            i94 = 7;
                        } else if (i94 > 16256) {
                            i94 = 16256;
                        }
                    }
                    i105 = (i94 - i163) >> 3;
                    i106 = (i95 - i17) >> 3;
                    i15 += i14;
                    i107 = i163 + (i15 & 6291456);
                    i108 = i15 >> 23;
                }
                int i165 = (i4 - i3) & 7;
                while (true) {
                    int i166 = i165;
                    i165--;
                    if (i166 <= 0) {
                        return;
                    }
                    int i167 = iArr2[(i17 & 16256) + (i107 >> 7)] >>> i108;
                    if (i167 != 0) {
                        iArr[i19] = i167;
                    }
                    i19++;
                    i107 += i105;
                    i17 += i106;
                }
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f2, float f3, float f4) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        if (e.a() && !h) {
            return;
        }
        if (g) {
            c(i2, i3, i4, i5, i6, i7, i8, i9, i10);
            return;
        }
        if (f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            return;
        }
        int i23 = B[i8];
        int i24 = B[i9];
        int i25 = B[i10];
        int i26 = (i23 >> 16) & 255;
        int i27 = (i23 >> 8) & 255;
        int i28 = i23 & 255;
        int i29 = (i24 >> 16) & 255;
        int i30 = (i24 >> 8) & 255;
        int i31 = i24 & 255;
        int i32 = (i25 >> 16) & 255;
        int i33 = (i25 >> 8) & 255;
        int i34 = i25 & 255;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        if (i3 != i2) {
            i35 = ((i6 - i5) << 16) / (i3 - i2);
            i36 = ((i29 - i26) << 16) / (i3 - i2);
            i37 = ((i30 - i27) << 16) / (i3 - i2);
            i38 = ((i31 - i28) << 16) / (i3 - i2);
        }
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        if (i4 != i3) {
            i39 = ((i7 - i6) << 16) / (i4 - i3);
            i40 = ((i32 - i29) << 16) / (i4 - i3);
            i41 = ((i33 - i30) << 16) / (i4 - i3);
            i42 = ((i34 - i31) << 16) / (i4 - i3);
        }
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        if (i4 != i2) {
            i43 = ((i5 - i7) << 16) / (i2 - i4);
            i44 = ((i26 - i32) << 16) / (i2 - i4);
            i45 = ((i27 - i33) << 16) / (i2 - i4);
            i46 = ((i28 - i34) << 16) / (i2 - i4);
        }
        float f5 = i6 - i5;
        float f6 = i3 - i2;
        float f7 = i7 - i5;
        float f8 = i4 - i2;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = (f5 * f8) - (f7 * f6);
        float f12 = ((f9 * f8) - (f10 * f6)) / f11;
        float f13 = ((f10 * f5) - (f9 * f7)) / f11;
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                float f14 = (f3 - (f12 * i6)) + f12;
                if (i4 < i2) {
                    int i47 = i6 << 16;
                    int i48 = i47;
                    int i49 = i47;
                    int i50 = i29 << 16;
                    int i51 = i50;
                    int i52 = i50;
                    int i53 = i30 << 16;
                    int i54 = i53;
                    int i55 = i53;
                    int i56 = i31 << 16;
                    int i57 = i56;
                    int i58 = i56;
                    if (i3 < 0) {
                        i49 -= i35 * i3;
                        i48 -= i39 * i3;
                        i52 -= i36 * i3;
                        i55 -= i37 * i3;
                        i58 -= i38 * i3;
                        i51 -= i40 * i3;
                        i54 -= i41 * i3;
                        i57 -= i42 * i3;
                        f14 -= f13 * i3;
                        i3 = 0;
                    }
                    int i59 = i7 << 16;
                    int i60 = i32 << 16;
                    int i61 = i33 << 16;
                    int i62 = i34 << 16;
                    if (i4 < 0) {
                        i59 -= i43 * i4;
                        i60 -= i44 * i4;
                        i61 -= i45 * i4;
                        i62 -= i46 * i4;
                        i4 = 0;
                    }
                    if ((i3 == i4 || i35 >= i39) && (i3 != i4 || i35 <= i43)) {
                        int i63 = i2 - i4;
                        int i64 = i4 - i3;
                        int i65 = x[i3];
                        while (true) {
                            i17 = i65;
                            i64--;
                            if (i64 < 0) {
                                break;
                            }
                            a(class_210.g, i17, i48 >> 16, i49 >> 16, i51, i54, i57, i52, i55, i58, f14, f12);
                            i49 += i35;
                            i48 += i39;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i51 += i40;
                            i54 += i41;
                            i57 += i42;
                            f14 += f13;
                            i65 = i17 + class_210.h;
                        }
                        while (true) {
                            i63--;
                            if (i63 < 0) {
                                return;
                            }
                            a(class_210.g, i17, i59 >> 16, i49 >> 16, i60, i61, i62, i52, i55, i58, f14, f12);
                            i49 += i35;
                            i59 += i43;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i60 += i44;
                            i61 += i45;
                            i62 += i46;
                            i17 += class_210.h;
                            f14 += f13;
                        }
                    } else {
                        int i66 = i2 - i4;
                        int i67 = i4 - i3;
                        int i68 = x[i3];
                        while (true) {
                            i18 = i68;
                            i67--;
                            if (i67 < 0) {
                                break;
                            }
                            a(class_210.g, i18, i49 >> 16, i48 >> 16, i52, i55, i58, i51, i54, i57, f14, f12);
                            i49 += i35;
                            i48 += i39;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i51 += i40;
                            i54 += i41;
                            i57 += i42;
                            f14 += f13;
                            i68 = i18 + class_210.h;
                        }
                        while (true) {
                            i66--;
                            if (i66 < 0) {
                                return;
                            }
                            a(class_210.g, i18, i49 >> 16, i59 >> 16, i52, i55, i58, i60, i61, i62, f14, f12);
                            i49 += i35;
                            i59 += i43;
                            i52 += i36;
                            i55 += i37;
                            i58 += i38;
                            i60 += i44;
                            i61 += i45;
                            i62 += i46;
                            i18 += class_210.h;
                            f14 += f13;
                        }
                    }
                } else {
                    int i69 = i6 << 16;
                    int i70 = i69;
                    int i71 = i69;
                    int i72 = i29 << 16;
                    int i73 = i72;
                    int i74 = i72;
                    int i75 = i30 << 16;
                    int i76 = i75;
                    int i77 = i75;
                    int i78 = i31 << 16;
                    int i79 = i78;
                    int i80 = i78;
                    if (i3 < 0) {
                        i71 -= i35 * i3;
                        i70 -= i39 * i3;
                        i74 -= i36 * i3;
                        i77 -= i37 * i3;
                        i80 -= i38 * i3;
                        i73 -= i40 * i3;
                        i76 -= i41 * i3;
                        i79 -= i42 * i3;
                        f14 -= f13 * i3;
                        i3 = 0;
                    }
                    int i81 = i5 << 16;
                    int i82 = i26 << 16;
                    int i83 = i27 << 16;
                    int i84 = i28 << 16;
                    if (i2 < 0) {
                        i81 -= i43 * i2;
                        i82 -= i44 * i2;
                        i83 -= i45 * i2;
                        i84 -= i46 * i2;
                        i2 = 0;
                    }
                    if (i35 < i39) {
                        int i85 = i4 - i2;
                        int i86 = i2 - i3;
                        int i87 = x[i3];
                        while (true) {
                            i16 = i87;
                            i86--;
                            if (i86 < 0) {
                                break;
                            }
                            a(class_210.g, i16, i71 >> 16, i70 >> 16, i74, i77, i80, i73, i76, i79, f14, f12);
                            i71 += i35;
                            i70 += i39;
                            i74 += i36;
                            i77 += i37;
                            i80 += i38;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            f14 += f13;
                            i87 = i16 + class_210.h;
                        }
                        while (true) {
                            i85--;
                            if (i85 < 0) {
                                return;
                            }
                            a(class_210.g, i16, i81 >> 16, i70 >> 16, i82, i83, i84, i73, i76, i79, f14, f12);
                            i81 += i43;
                            i70 += i39;
                            i82 += i44;
                            i83 += i45;
                            i84 += i46;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            i16 += class_210.h;
                            f14 += f13;
                        }
                    } else {
                        int i88 = i4 - i2;
                        int i89 = i2 - i3;
                        int i90 = x[i3];
                        while (true) {
                            i15 = i90;
                            i89--;
                            if (i89 < 0) {
                                break;
                            }
                            a(class_210.g, i15, i70 >> 16, i71 >> 16, i73, i76, i79, i74, i77, i80, f14, f12);
                            i71 += i35;
                            i70 += i39;
                            i74 += i36;
                            i77 += i37;
                            i80 += i38;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            f14 += f13;
                            i90 = i15 + class_210.h;
                        }
                        while (true) {
                            i88--;
                            if (i88 < 0) {
                                return;
                            }
                            a(class_210.g, i15, i70 >> 16, i81 >> 16, i73, i76, i79, i82, i83, i84, f14, f12);
                            i81 += i43;
                            i70 += i39;
                            i82 += i44;
                            i83 += i45;
                            i84 += i46;
                            i73 += i40;
                            i76 += i41;
                            i79 += i42;
                            i15 += class_210.h;
                            f14 += f13;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                float f15 = (f4 - (f12 * i7)) + f12;
                if (i2 < i3) {
                    int i91 = i7 << 16;
                    int i92 = i91;
                    int i93 = i91;
                    int i94 = i32 << 16;
                    int i95 = i94;
                    int i96 = i94;
                    int i97 = i33 << 16;
                    int i98 = i97;
                    int i99 = i97;
                    int i100 = i34 << 16;
                    int i101 = i100;
                    int i102 = i100;
                    if (i4 < 0) {
                        i93 -= i39 * i4;
                        i92 -= i43 * i4;
                        i96 -= i40 * i4;
                        i99 -= i41 * i4;
                        i102 -= i42 * i4;
                        i95 -= i44 * i4;
                        i98 -= i45 * i4;
                        i101 -= i46 * i4;
                        f15 -= f13 * i4;
                        i4 = 0;
                    }
                    int i103 = i5 << 16;
                    int i104 = i26 << 16;
                    int i105 = i27 << 16;
                    int i106 = i28 << 16;
                    if (i2 < 0) {
                        i103 -= i35 * i2;
                        i104 -= i36 * i2;
                        i105 -= i37 * i2;
                        i106 -= i38 * i2;
                        i2 = 0;
                    }
                    if (i39 < i43) {
                        int i107 = i3 - i2;
                        int i108 = i2 - i4;
                        int i109 = x[i4];
                        while (true) {
                            i14 = i109;
                            i108--;
                            if (i108 < 0) {
                                break;
                            }
                            a(class_210.g, i14, i93 >> 16, i92 >> 16, i96, i99, i102, i95, i98, i101, f15, f12);
                            i93 += i39;
                            i92 += i43;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i95 += i44;
                            i98 += i45;
                            i101 += i46;
                            f15 += f13;
                            i109 = i14 + class_210.h;
                        }
                        while (true) {
                            i107--;
                            if (i107 < 0) {
                                return;
                            }
                            a(class_210.g, i14, i93 >> 16, i103 >> 16, i96, i99, i102, i104, i105, i106, f15, f12);
                            i93 += i39;
                            i103 += i35;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i104 += i36;
                            i105 += i37;
                            i106 += i38;
                            i14 += class_210.h;
                            f15 += f13;
                        }
                    } else {
                        int i110 = i3 - i2;
                        int i111 = i2 - i4;
                        int i112 = x[i4];
                        while (true) {
                            i13 = i112;
                            i111--;
                            if (i111 < 0) {
                                break;
                            }
                            a(class_210.g, i13, i92 >> 16, i93 >> 16, i95, i98, i101, i96, i99, i102, f15, f12);
                            i93 += i39;
                            i92 += i43;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i95 += i44;
                            i98 += i45;
                            i101 += i46;
                            f15 += f13;
                            i112 = i13 + class_210.h;
                        }
                        while (true) {
                            i110--;
                            if (i110 < 0) {
                                return;
                            }
                            a(class_210.g, i13, i103 >> 16, i93 >> 16, i104, i105, i106, i96, i99, i102, f15, f12);
                            i93 += i39;
                            i103 += i35;
                            i96 += i40;
                            i99 += i41;
                            i102 += i42;
                            i104 += i36;
                            i105 += i37;
                            i106 += i38;
                            f15 += f13;
                            i13 += class_210.h;
                        }
                    }
                } else {
                    int i113 = i7 << 16;
                    int i114 = i113;
                    int i115 = i113;
                    int i116 = i32 << 16;
                    int i117 = i116;
                    int i118 = i116;
                    int i119 = i33 << 16;
                    int i120 = i119;
                    int i121 = i119;
                    int i122 = i34 << 16;
                    int i123 = i122;
                    int i124 = i122;
                    if (i4 < 0) {
                        i115 -= i39 * i4;
                        i114 -= i43 * i4;
                        i118 -= i40 * i4;
                        i121 -= i41 * i4;
                        i124 -= i42 * i4;
                        i117 -= i44 * i4;
                        i120 -= i45 * i4;
                        i123 -= i46 * i4;
                        f15 -= f13 * i4;
                        i4 = 0;
                    }
                    int i125 = i6 << 16;
                    int i126 = i29 << 16;
                    int i127 = i30 << 16;
                    int i128 = i31 << 16;
                    if (i3 < 0) {
                        i125 -= i35 * i3;
                        i126 -= i36 * i3;
                        i127 -= i37 * i3;
                        i128 -= i38 * i3;
                        i3 = 0;
                    }
                    if (i39 < i43) {
                        int i129 = i2 - i3;
                        int i130 = i3 - i4;
                        int i131 = x[i4];
                        while (true) {
                            i12 = i131;
                            i130--;
                            if (i130 < 0) {
                                break;
                            }
                            a(class_210.g, i12, i115 >> 16, i114 >> 16, i118, i121, i124, i117, i120, i123, f15, f12);
                            i115 += i39;
                            i114 += i43;
                            i118 += i40;
                            i121 += i41;
                            i124 += i42;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            f15 += f13;
                            i131 = i12 + class_210.h;
                        }
                        while (true) {
                            i129--;
                            if (i129 < 0) {
                                return;
                            }
                            a(class_210.g, i12, i125 >> 16, i114 >> 16, i126, i127, i128, i117, i120, i123, f15, f12);
                            i125 += i35;
                            i114 += i43;
                            i126 += i36;
                            i127 += i37;
                            i128 += i38;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            f15 += f13;
                            i12 += class_210.h;
                        }
                    } else {
                        int i132 = i2 - i3;
                        int i133 = i3 - i4;
                        int i134 = x[i4];
                        while (true) {
                            i11 = i134;
                            i133--;
                            if (i133 < 0) {
                                break;
                            }
                            a(class_210.g, i11, i114 >> 16, i115 >> 16, i117, i120, i123, i118, i121, i124, f15, f12);
                            i115 += i39;
                            i114 += i43;
                            i118 += i40;
                            i121 += i41;
                            i124 += i42;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            f15 += f13;
                            i134 = i11 + class_210.h;
                        }
                        while (true) {
                            i132--;
                            if (i132 < 0) {
                                return;
                            }
                            a(class_210.g, i11, i114 >> 16, i125 >> 16, i117, i120, i123, i126, i127, i128, f15, f12);
                            i125 += i35;
                            i114 += i43;
                            i126 += i36;
                            i127 += i37;
                            i128 += i38;
                            i117 += i44;
                            i120 += i45;
                            i123 += i46;
                            i11 += class_210.h;
                            f15 += f13;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            float f16 = (f2 - (f12 * i5)) + f12;
            if (i3 < i4) {
                int i135 = i5 << 16;
                int i136 = i135;
                int i137 = i135;
                int i138 = i26 << 16;
                int i139 = i138;
                int i140 = i138;
                int i141 = i27 << 16;
                int i142 = i141;
                int i143 = i141;
                int i144 = i28 << 16;
                int i145 = i144;
                int i146 = i144;
                if (i2 < 0) {
                    i137 -= i43 * i2;
                    i136 -= i35 * i2;
                    i140 -= i44 * i2;
                    i143 -= i45 * i2;
                    i146 -= i46 * i2;
                    i139 -= i36 * i2;
                    i142 -= i37 * i2;
                    i145 -= i38 * i2;
                    f16 -= f13 * i2;
                    i2 = 0;
                }
                int i147 = i6 << 16;
                int i148 = i29 << 16;
                int i149 = i30 << 16;
                int i150 = i31 << 16;
                if (i3 < 0) {
                    i147 -= i39 * i3;
                    i148 -= i40 * i3;
                    i149 -= i41 * i3;
                    i150 -= i42 * i3;
                    i3 = 0;
                }
                if ((i2 == i3 || i43 >= i35) && (i2 != i3 || i43 <= i39)) {
                    int i151 = i4 - i3;
                    int i152 = i3 - i2;
                    int i153 = x[i2];
                    while (true) {
                        i21 = i153;
                        i152--;
                        if (i152 < 0) {
                            break;
                        }
                        a(class_210.g, i21, i136 >> 16, i137 >> 16, i139, i142, i145, i140, i143, i146, f16, f12);
                        i137 += i43;
                        i136 += i35;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i139 += i36;
                        i142 += i37;
                        i145 += i38;
                        f16 += f13;
                        i153 = i21 + class_210.h;
                    }
                    while (true) {
                        i151--;
                        if (i151 < 0) {
                            return;
                        }
                        a(class_210.g, i21, i147 >> 16, i137 >> 16, i148, i149, i150, i140, i143, i146, f16, f12);
                        i137 += i43;
                        i147 += i39;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i148 += i40;
                        i149 += i41;
                        i150 += i42;
                        i21 += class_210.h;
                        f16 += f13;
                    }
                } else {
                    int i154 = i4 - i3;
                    int i155 = i3 - i2;
                    int i156 = x[i2];
                    while (true) {
                        i22 = i156;
                        i155--;
                        if (i155 < 0) {
                            break;
                        }
                        a(class_210.g, i22, i137 >> 16, i136 >> 16, i140, i143, i146, i139, i142, i145, f16, f12);
                        i137 += i43;
                        i136 += i35;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i139 += i36;
                        i142 += i37;
                        i145 += i38;
                        f16 += f13;
                        i156 = i22 + class_210.h;
                    }
                    while (true) {
                        i154--;
                        if (i154 < 0) {
                            return;
                        }
                        a(class_210.g, i22, i137 >> 16, i147 >> 16, i140, i143, i146, i148, i149, i150, f16, f12);
                        i137 += i43;
                        i147 += i39;
                        i140 += i44;
                        i143 += i45;
                        i146 += i46;
                        i148 += i40;
                        i149 += i41;
                        i150 += i42;
                        i22 += class_210.h;
                        f16 += f13;
                    }
                }
            } else {
                int i157 = i5 << 16;
                int i158 = i157;
                int i159 = i157;
                int i160 = i26 << 16;
                int i161 = i160;
                int i162 = i160;
                int i163 = i27 << 16;
                int i164 = i163;
                int i165 = i163;
                int i166 = i28 << 16;
                int i167 = i166;
                int i168 = i166;
                if (i2 < 0) {
                    i159 -= i43 * i2;
                    i158 -= i35 * i2;
                    i162 -= i44 * i2;
                    i165 -= i45 * i2;
                    i168 -= i46 * i2;
                    i161 -= i36 * i2;
                    i164 -= i37 * i2;
                    i167 -= i38 * i2;
                    f16 -= f13 * i2;
                    i2 = 0;
                }
                int i169 = i7 << 16;
                int i170 = i32 << 16;
                int i171 = i33 << 16;
                int i172 = i34 << 16;
                if (i4 < 0) {
                    i169 -= i39 * i4;
                    i170 -= i40 * i4;
                    i171 -= i41 * i4;
                    i172 -= i42 * i4;
                    i4 = 0;
                }
                if ((i2 == i4 || i43 >= i35) && (i2 != i4 || i39 <= i35)) {
                    int i173 = i3 - i4;
                    int i174 = i4 - i2;
                    int i175 = x[i2];
                    while (true) {
                        i19 = i175;
                        i174--;
                        if (i174 < 0) {
                            break;
                        }
                        a(class_210.g, i19, i158 >> 16, i159 >> 16, i161, i164, i167, i162, i165, i168, f16, f12);
                        i159 += i43;
                        i158 += i35;
                        i162 += i44;
                        i165 += i45;
                        i168 += i46;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        f16 += f13;
                        i175 = i19 + class_210.h;
                    }
                    while (true) {
                        i173--;
                        if (i173 < 0) {
                            return;
                        }
                        a(class_210.g, i19, i158 >> 16, i169 >> 16, i161, i164, i167, i170, i171, i172, f16, f12);
                        i169 += i39;
                        i158 += i35;
                        i170 += i40;
                        i171 += i41;
                        i172 += i42;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        i19 += class_210.h;
                        f16 += f13;
                    }
                } else {
                    int i176 = i3 - i4;
                    int i177 = i4 - i2;
                    int i178 = x[i2];
                    while (true) {
                        i20 = i178;
                        i177--;
                        if (i177 < 0) {
                            break;
                        }
                        a(class_210.g, i20, i159 >> 16, i158 >> 16, i162, i165, i168, i161, i164, i167, f16, f12);
                        i159 += i43;
                        i158 += i35;
                        i162 += i44;
                        i165 += i45;
                        i168 += i46;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        f16 += f13;
                        i178 = i20 + class_210.h;
                    }
                    while (true) {
                        i176--;
                        if (i176 < 0) {
                            return;
                        }
                        a(class_210.g, i20, i169 >> 16, i158 >> 16, i170, i171, i172, i161, i164, i167, f16, f12);
                        i169 += i39;
                        i158 += i35;
                        i170 += i40;
                        i171 += i41;
                        i172 += i42;
                        i161 += i36;
                        i164 += i37;
                        i167 += i38;
                        i20 += class_210.h;
                        f16 += f13;
                    }
                }
            }
        }
    }

    public static void a(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f2, float f3) {
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        int i11 = i4 - i3;
        if (i11 <= 0) {
            return;
        }
        int i12 = (i8 - i5) / i11;
        int i13 = (i9 - i6) / i11;
        int i14 = (i10 - i7) / i11;
        if (o) {
            if (i4 > class_210.n) {
                i11 -= i4 - class_210.n;
                i4 = class_210.n;
            }
            if (i3 < 0) {
                i11 = i4;
                i5 -= i3 * i12;
                i6 -= i3 * i13;
                i7 -= i3 * i14;
                i3 = 0;
            }
        }
        if (i3 >= i4) {
            return;
        }
        int i15 = i2 + i3;
        float f4 = f2 + (f3 * i3);
        if (r == 0) {
            while (true) {
                i11--;
                if (i11 < 0) {
                    return;
                }
                iArr[i15] = (i5 & bk.aS) | ((i6 >> 8) & bk.ao) | ((i7 >> 16) & 255);
                class_210.f[i15] = f4;
                f4 += f3;
                i5 += i12;
                i6 += i13;
                i7 += i14;
                i15++;
            }
        } else {
            int i16 = r;
            int i17 = 256 - r;
            while (true) {
                i11--;
                if (i11 < 0) {
                    return;
                }
                int i18 = (i5 & bk.aS) | ((i6 >> 8) & bk.ao) | ((i7 >> 16) & 255);
                int i19 = ((((i18 & 16711935) * i17) >> 8) & 16711935) + ((((i18 & bk.ao) * i17) >> 8) & bk.ao);
                int i20 = iArr[i15];
                iArr[i15] = i19 + ((((i20 & 16711935) * i16) >> 8) & 16711935) + ((((i20 & bk.ao) * i16) >> 8) & bk.ao);
                class_210.f[i15] = f4;
                f4 += f3;
                i5 += i12;
                i6 += i13;
                i7 += i14;
                i15++;
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2, float f3, float f4) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if ((e.a() && !h) || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            return;
        }
        int i21 = 0;
        if (i3 != i2) {
            i21 = ((i6 - i5) << 16) / (i3 - i2);
        }
        int i22 = 0;
        if (i4 != i3) {
            i22 = ((i7 - i6) << 16) / (i4 - i3);
        }
        int i23 = 0;
        if (i4 != i2) {
            i23 = ((i5 - i7) << 16) / (i2 - i4);
        }
        float f5 = i6 - i5;
        float f6 = i3 - i2;
        float f7 = i7 - i5;
        float f8 = i4 - i2;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = (f5 * f8) - (f7 * f6);
        float f12 = ((f9 * f8) - (f10 * f6)) / f11;
        float f13 = ((f10 * f5) - (f9 * f7)) / f11;
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                float f14 = (f3 - (f12 * i6)) + f12;
                if (i4 < i2) {
                    int i24 = i6 << 16;
                    int i25 = i24;
                    int i26 = i24;
                    if (i3 < 0) {
                        i26 -= i21 * i3;
                        i25 -= i22 * i3;
                        f14 -= f13 * i3;
                        i3 = 0;
                    }
                    int i27 = i7 << 16;
                    if (i4 < 0) {
                        i27 -= i23 * i4;
                        i4 = 0;
                    }
                    if ((i3 == i4 || i21 >= i22) && (i3 != i4 || i21 <= i23)) {
                        int i28 = i2 - i4;
                        int i29 = i4 - i3;
                        int i30 = x[i3];
                        while (true) {
                            i15 = i30;
                            i29--;
                            if (i29 < 0) {
                                break;
                            }
                            a(class_210.g, i15, i8, i25 >> 16, i26 >> 16, f14, f12);
                            f14 += f13;
                            i26 += i21;
                            i25 += i22;
                            i30 = i15 + class_210.h;
                        }
                        while (true) {
                            i28--;
                            if (i28 < 0) {
                                return;
                            }
                            a(class_210.g, i15, i8, i27 >> 16, i26 >> 16, f14, f12);
                            f14 += f13;
                            i26 += i21;
                            i27 += i23;
                            i15 += class_210.h;
                        }
                    } else {
                        int i31 = i2 - i4;
                        int i32 = i4 - i3;
                        int i33 = x[i3];
                        while (true) {
                            i16 = i33;
                            i32--;
                            if (i32 < 0) {
                                break;
                            }
                            a(class_210.g, i16, i8, i26 >> 16, i25 >> 16, f14, f12);
                            f14 += f13;
                            i26 += i21;
                            i25 += i22;
                            i33 = i16 + class_210.h;
                        }
                        while (true) {
                            i31--;
                            if (i31 < 0) {
                                return;
                            }
                            a(class_210.g, i16, i8, i26 >> 16, i27 >> 16, f14, f12);
                            f14 += f13;
                            i26 += i21;
                            i27 += i23;
                            i16 += class_210.h;
                        }
                    }
                } else {
                    int i34 = i6 << 16;
                    int i35 = i34;
                    int i36 = i34;
                    if (i3 < 0) {
                        i36 -= i21 * i3;
                        i35 -= i22 * i3;
                        f14 -= f13 * i3;
                        i3 = 0;
                    }
                    int i37 = i5 << 16;
                    if (i2 < 0) {
                        i37 -= i23 * i2;
                        i2 = 0;
                    }
                    if (i21 < i22) {
                        int i38 = i4 - i2;
                        int i39 = i2 - i3;
                        int i40 = x[i3];
                        while (true) {
                            i14 = i40;
                            i39--;
                            if (i39 < 0) {
                                break;
                            }
                            a(class_210.g, i14, i8, i36 >> 16, i35 >> 16, f14, f12);
                            f14 += f13;
                            i36 += i21;
                            i35 += i22;
                            i40 = i14 + class_210.h;
                        }
                        while (true) {
                            i38--;
                            if (i38 < 0) {
                                return;
                            }
                            a(class_210.g, i14, i8, i37 >> 16, i35 >> 16, f14, f12);
                            f14 += f13;
                            i37 += i23;
                            i35 += i22;
                            i14 += class_210.h;
                        }
                    } else {
                        int i41 = i4 - i2;
                        int i42 = i2 - i3;
                        int i43 = x[i3];
                        while (true) {
                            i13 = i43;
                            i42--;
                            if (i42 < 0) {
                                break;
                            }
                            a(class_210.g, i13, i8, i35 >> 16, i36 >> 16, f14, f12);
                            f14 += f13;
                            i36 += i21;
                            i35 += i22;
                            i43 = i13 + class_210.h;
                        }
                        while (true) {
                            i41--;
                            if (i41 < 0) {
                                return;
                            }
                            a(class_210.g, i13, i8, i35 >> 16, i37 >> 16, f14, f12);
                            f14 += f13;
                            i37 += i23;
                            i35 += i22;
                            i13 += class_210.h;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                float f15 = (f4 - (f12 * i7)) + f12;
                if (i2 < i3) {
                    int i44 = i7 << 16;
                    int i45 = i44;
                    int i46 = i44;
                    if (i4 < 0) {
                        i46 -= i22 * i4;
                        i45 -= i23 * i4;
                        f15 -= f13 * i4;
                        i4 = 0;
                    }
                    int i47 = i5 << 16;
                    if (i2 < 0) {
                        i47 -= i21 * i2;
                        i2 = 0;
                    }
                    if (i22 < i23) {
                        int i48 = i3 - i2;
                        int i49 = i2 - i4;
                        int i50 = x[i4];
                        while (true) {
                            i12 = i50;
                            i49--;
                            if (i49 < 0) {
                                break;
                            }
                            a(class_210.g, i12, i8, i46 >> 16, i45 >> 16, f15, f12);
                            f15 += f13;
                            i46 += i22;
                            i45 += i23;
                            i50 = i12 + class_210.h;
                        }
                        while (true) {
                            i48--;
                            if (i48 < 0) {
                                return;
                            }
                            a(class_210.g, i12, i8, i46 >> 16, i47 >> 16, f15, f12);
                            f15 += f13;
                            i46 += i22;
                            i47 += i21;
                            i12 += class_210.h;
                        }
                    } else {
                        int i51 = i3 - i2;
                        int i52 = i2 - i4;
                        int i53 = x[i4];
                        while (true) {
                            i11 = i53;
                            i52--;
                            if (i52 < 0) {
                                break;
                            }
                            a(class_210.g, i11, i8, i45 >> 16, i46 >> 16, f15, f12);
                            f15 += f13;
                            i46 += i22;
                            i45 += i23;
                            i53 = i11 + class_210.h;
                        }
                        while (true) {
                            i51--;
                            if (i51 < 0) {
                                return;
                            }
                            a(class_210.g, i11, i8, i47 >> 16, i46 >> 16, f15, f12);
                            f15 += f13;
                            i46 += i22;
                            i47 += i21;
                            i11 += class_210.h;
                        }
                    }
                } else {
                    int i54 = i7 << 16;
                    int i55 = i54;
                    int i56 = i54;
                    if (i4 < 0) {
                        i56 -= i22 * i4;
                        i55 -= i23 * i4;
                        f15 -= f13 * i4;
                        i4 = 0;
                    }
                    int i57 = i6 << 16;
                    if (i3 < 0) {
                        i57 -= i21 * i3;
                        i3 = 0;
                    }
                    if (i22 < i23) {
                        int i58 = i2 - i3;
                        int i59 = i3 - i4;
                        int i60 = x[i4];
                        while (true) {
                            i10 = i60;
                            i59--;
                            if (i59 < 0) {
                                break;
                            }
                            a(class_210.g, i10, i8, i56 >> 16, i55 >> 16, f15, f12);
                            f15 += f13;
                            i56 += i22;
                            i55 += i23;
                            i60 = i10 + class_210.h;
                        }
                        while (true) {
                            i58--;
                            if (i58 < 0) {
                                return;
                            }
                            a(class_210.g, i10, i8, i57 >> 16, i55 >> 16, f15, f12);
                            f15 += f13;
                            i57 += i21;
                            i55 += i23;
                            i10 += class_210.h;
                        }
                    } else {
                        int i61 = i2 - i3;
                        int i62 = i3 - i4;
                        int i63 = x[i4];
                        while (true) {
                            i9 = i63;
                            i62--;
                            if (i62 < 0) {
                                break;
                            }
                            a(class_210.g, i9, i8, i55 >> 16, i56 >> 16, f15, f12);
                            f15 += f13;
                            i56 += i22;
                            i55 += i23;
                            i63 = i9 + class_210.h;
                        }
                        while (true) {
                            i61--;
                            if (i61 < 0) {
                                return;
                            }
                            a(class_210.g, i9, i8, i55 >> 16, i57 >> 16, f15, f12);
                            f15 += f13;
                            i57 += i21;
                            i55 += i23;
                            i9 += class_210.h;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            float f16 = (f2 - (f12 * i5)) + f12;
            if (i3 < i4) {
                int i64 = i5 << 16;
                int i65 = i64;
                int i66 = i64;
                if (i2 < 0) {
                    i66 -= i23 * i2;
                    i65 -= i21 * i2;
                    f16 -= f13 * i2;
                    i2 = 0;
                }
                int i67 = i6 << 16;
                if (i3 < 0) {
                    i67 -= i22 * i3;
                    i3 = 0;
                }
                if ((i2 == i3 || i23 >= i21) && (i2 != i3 || i23 <= i22)) {
                    int i68 = i4 - i3;
                    int i69 = i3 - i2;
                    int i70 = x[i2];
                    while (true) {
                        i19 = i70;
                        i69--;
                        if (i69 < 0) {
                            break;
                        }
                        a(class_210.g, i19, i8, i65 >> 16, i66 >> 16, f16, f12);
                        i66 += i23;
                        i65 += i21;
                        f16 += f13;
                        i70 = i19 + class_210.h;
                    }
                    while (true) {
                        i68--;
                        if (i68 < 0) {
                            return;
                        }
                        a(class_210.g, i19, i8, i67 >> 16, i66 >> 16, f16, f12);
                        i66 += i23;
                        i67 += i22;
                        i19 += class_210.h;
                        f16 += f13;
                    }
                } else {
                    int i71 = i4 - i3;
                    int i72 = i3 - i2;
                    int i73 = x[i2];
                    while (true) {
                        i20 = i73;
                        i72--;
                        if (i72 < 0) {
                            break;
                        }
                        a(class_210.g, i20, i8, i66 >> 16, i65 >> 16, f16, f12);
                        i66 += i23;
                        i65 += i21;
                        f16 += f13;
                        i73 = i20 + class_210.h;
                    }
                    while (true) {
                        i71--;
                        if (i71 < 0) {
                            return;
                        }
                        a(class_210.g, i20, i8, i66 >> 16, i67 >> 16, f16, f12);
                        i66 += i23;
                        i67 += i22;
                        i20 += class_210.h;
                        f16 += f13;
                    }
                }
            } else {
                int i74 = i5 << 16;
                int i75 = i74;
                int i76 = i74;
                if (i2 < 0) {
                    i76 -= i23 * i2;
                    i75 -= i21 * i2;
                    f16 -= f13 * i2;
                    i2 = 0;
                }
                int i77 = i7 << 16;
                if (i4 < 0) {
                    i77 -= i22 * i4;
                    i4 = 0;
                }
                if ((i2 == i4 || i23 >= i21) && (i2 != i4 || i22 <= i21)) {
                    int i78 = i3 - i4;
                    int i79 = i4 - i2;
                    int i80 = x[i2];
                    while (true) {
                        i17 = i80;
                        i79--;
                        if (i79 < 0) {
                            break;
                        }
                        a(class_210.g, i17, i8, i75 >> 16, i76 >> 16, f16, f12);
                        f16 += f13;
                        i76 += i23;
                        i75 += i21;
                        i80 = i17 + class_210.h;
                    }
                    while (true) {
                        i78--;
                        if (i78 < 0) {
                            return;
                        }
                        a(class_210.g, i17, i8, i75 >> 16, i77 >> 16, f16, f12);
                        f16 += f13;
                        i77 += i22;
                        i75 += i21;
                        i17 += class_210.h;
                    }
                } else {
                    int i81 = i3 - i4;
                    int i82 = i4 - i2;
                    int i83 = x[i2];
                    while (true) {
                        i18 = i83;
                        i82--;
                        if (i82 < 0) {
                            break;
                        }
                        a(class_210.g, i18, i8, i76 >> 16, i75 >> 16, f16, f12);
                        f16 += f13;
                        i76 += i23;
                        i75 += i21;
                        i83 = i18 + class_210.h;
                    }
                    while (true) {
                        i81--;
                        if (i81 < 0) {
                            return;
                        }
                        a(class_210.g, i18, i8, i77 >> 16, i75 >> 16, f16, f12);
                        f16 += f13;
                        i77 += i22;
                        i75 += i21;
                        i18 += class_210.h;
                    }
                }
            }
        }
    }

    private static void a(int[] iArr, int i2, int i3, int i4, int i5, float f2, float f3) {
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        if (o) {
            if (i5 > class_210.n) {
                i5 = class_210.n;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 >= i5) {
            return;
        }
        int i6 = i2 + i4;
        int i7 = (i5 - i4) >> 2;
        float f4 = f2 + (f3 * i4);
        if (r == 0) {
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    if (e.a()) {
                        class_210.a(iArr, i6, i3, i3, 256 - r);
                    } else {
                        iArr[i6] = i3;
                    }
                    class_210.f[i6] = f4;
                    i6++;
                    f4 += f3;
                }
            }
            int i9 = (i5 - i4) & 3;
            while (true) {
                i9--;
                if (i9 < 0) {
                    return;
                }
                if (e.a()) {
                    class_210.a(iArr, i6, i3, i3, 256 - r);
                } else {
                    iArr[i6] = i3;
                }
                class_210.f[i6] = f4;
                i6++;
                f4 += f3;
            }
        } else {
            int i10 = r;
            int i11 = 256 - r;
            int i12 = ((((i3 & 16711935) * i11) >> 8) & 16711935) + ((((i3 & bk.ao) * i11) >> 8) & bk.ao);
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (e.a()) {
                        class_210.a(iArr, i6, i12 + (iArr[i6] & 16711935) + (iArr[i6] & bk.ao), i12 + (iArr[i6] & 16711935) + (iArr[i6] & bk.ao), i10);
                    } else {
                        iArr[i6] = i12 + ((((iArr[i6] & 16711935) * i10) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i10) >> 8) & bk.ao);
                    }
                    class_210.f[i6] = f4;
                    i6++;
                    f4 += f3;
                }
            }
            int i14 = (i5 - i4) & 3;
            while (true) {
                i14--;
                if (i14 < 0) {
                    return;
                }
                if (e.a()) {
                    class_210.a(iArr, i6, i12 + (iArr[i6] & 16711935) + (iArr[i6] & bk.ao), i12 + (iArr[i6] & 16711935) + (iArr[i6] & bk.ao), i10);
                } else {
                    iArr[i6] = i12 + ((((iArr[i6] & 16711935) * i10) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i10) >> 8) & bk.ao);
                }
                class_210.f[i6] = f4;
                i6++;
                f4 += f3;
            }
        }
    }

    private static void b(int[] iArr, int i2, int i3, int i4, int i5, float f2, float f3) {
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        if (o) {
            if (i5 > class_210.n) {
                i5 = class_210.n;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 >= i5) {
            return;
        }
        int i6 = i2 + i4;
        int i7 = (i5 - i4) >> 2;
        float f4 = f2 + (f3 * i4);
        if (r == 0) {
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    iArr[i6] = i3;
                    class_210.f[i6] = f4;
                    i6++;
                    f4 += f3;
                }
            }
            int i9 = (i5 - i4) & 3;
            while (true) {
                i9--;
                if (i9 < 0) {
                    return;
                }
                iArr[i6] = i3;
                class_210.f[i6] = f4;
                i6++;
                f4 += f3;
            }
        } else {
            int i10 = r;
            int i11 = 256 - r;
            int i12 = ((((i3 & 16711935) * i11) >> 8) & 16711935) + ((((i3 & bk.ao) * i11) >> 8) & bk.ao);
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    iArr[i6] = i12 + ((((iArr[i6] & 16711935) * i10) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i10) >> 8) & bk.ao);
                    class_210.f[i6] = f4;
                    i6++;
                    f4 += f3;
                }
            }
            int i14 = (i5 - i4) & 3;
            while (true) {
                i14--;
                if (i14 < 0) {
                    return;
                }
                iArr[i6] = i12 + ((((iArr[i6] & 16711935) * i10) >> 8) & 16711935) + ((((iArr[i6] & bk.ao) * i10) >> 8) & bk.ao);
                class_210.f[i6] = f4;
                i6++;
                f4 += f3;
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, float f2, float f3, float f4) {
        if (!e.a() || p) {
            a(-1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, f2, f3, f4);
        } else {
            a(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f2, float f3, float f4) {
        if (e.a() && !h) {
            return;
        }
        if (g) {
            c(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
            return;
        }
        if (f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            return;
        }
        int[] iArrD = d(i21);
        D = !G[i21];
        int i22 = i12 - i13;
        int i23 = i15 - i16;
        int i24 = i18 - i19;
        int i25 = i14 - i12;
        int i26 = i17 - i15;
        int i27 = i20 - i18;
        int i28 = ((i25 * i15) - (i26 * i12)) << 14;
        int i29 = ((i26 * i18) - (i27 * i15)) << 8;
        int i30 = ((i27 * i12) - (i25 * i18)) << 5;
        int i31 = ((i22 * i15) - (i23 * i12)) << 14;
        int i32 = ((i23 * i18) - (i24 * i15)) << 8;
        int i33 = ((i24 * i12) - (i22 * i18)) << 5;
        int i34 = ((i23 * i25) - (i22 * i26)) << 14;
        int i35 = ((i24 * i26) - (i23 * i27)) << 8;
        int i36 = ((i22 * i27) - (i24 * i25)) << 5;
        int i37 = 0;
        int i38 = 0;
        if (i4 != i3) {
            i37 = ((i7 - i6) << 16) / (i4 - i3);
            i38 = ((i10 - i9) << 16) / (i4 - i3);
        }
        int i39 = 0;
        int i40 = 0;
        if (i5 != i4) {
            i39 = ((i8 - i7) << 16) / (i5 - i4);
            i40 = ((i11 - i10) << 16) / (i5 - i4);
        }
        int i41 = 0;
        int i42 = 0;
        if (i5 != i3) {
            i41 = ((i6 - i8) << 16) / (i3 - i5);
            i42 = ((i9 - i11) << 16) / (i3 - i5);
        }
        float f5 = i7 - i6;
        float f6 = i4 - i3;
        float f7 = i8 - i6;
        float f8 = i5 - i3;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = (f5 * f8) - (f7 * f6);
        float f12 = ((f9 * f8) - (f10 * f6)) / f11;
        float f13 = ((f10 * f5) - (f9 * f7)) / f11;
        if (i3 > i4 || i3 > i5) {
            if (i4 <= i5) {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i5 > class_210.k) {
                    i5 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                float f14 = (f3 - (f12 * i7)) + f12;
                if (i5 < i3) {
                    int i43 = i7 << 16;
                    int i44 = i43;
                    int i45 = i43;
                    int i46 = i10 << 16;
                    int i47 = i46;
                    int i48 = i46;
                    if (i4 < 0) {
                        i45 -= i37 * i4;
                        i44 -= i39 * i4;
                        f14 -= f13 * i4;
                        i48 -= i38 * i4;
                        i47 -= i40 * i4;
                        i4 = 0;
                    }
                    int i49 = i8 << 16;
                    int i50 = i11 << 16;
                    if (i5 < 0) {
                        i49 -= i41 * i5;
                        i50 -= i42 * i5;
                        i5 = 0;
                    }
                    int i51 = i4 - t;
                    int i52 = i28 + (i30 * i51);
                    int i53 = i31 + (i33 * i51);
                    int i54 = i34 + (i36 * i51);
                    if ((i4 == i5 || i37 >= i39) && (i4 != i5 || i37 <= i41)) {
                        int i55 = i3 - i5;
                        int i56 = i5 - i4;
                        int i57 = x[i4];
                        while (true) {
                            i56--;
                            if (i56 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i57, i44 >> 16, i45 >> 16, i47 >> 8, i48 >> 8, i52, i53, i54, i29, i32, i35, f14, f12);
                            i45 += i37;
                            i44 += i39;
                            i48 += i38;
                            i47 += i40;
                            f14 += f13;
                            i57 += class_210.h;
                            i52 += i30;
                            i53 += i33;
                            i54 += i36;
                        }
                        while (true) {
                            i55--;
                            if (i55 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i57, i49 >> 16, i45 >> 16, i50 >> 8, i48 >> 8, i52, i53, i54, i29, i32, i35, f14, f12);
                            i45 += i37;
                            i49 += i41;
                            i48 += i38;
                            i50 += i42;
                            f14 += f13;
                            i57 += class_210.h;
                            i52 += i30;
                            i53 += i33;
                            i54 += i36;
                        }
                    } else {
                        int i58 = i3 - i5;
                        int i59 = i5 - i4;
                        int i60 = x[i4];
                        while (true) {
                            i59--;
                            if (i59 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i60, i45 >> 16, i44 >> 16, i48 >> 8, i47 >> 8, i52, i53, i54, i29, i32, i35, f14, f12);
                            i45 += i37;
                            i44 += i39;
                            i48 += i38;
                            i47 += i40;
                            f14 += f13;
                            i60 += class_210.h;
                            i52 += i30;
                            i53 += i33;
                            i54 += i36;
                        }
                        while (true) {
                            i58--;
                            if (i58 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i60, i45 >> 16, i49 >> 16, i48 >> 8, i50 >> 8, i52, i53, i54, i29, i32, i35, f14, f12);
                            i45 += i37;
                            i49 += i41;
                            i48 += i38;
                            i50 += i42;
                            f14 += f13;
                            i60 += class_210.h;
                            i52 += i30;
                            i53 += i33;
                            i54 += i36;
                        }
                    }
                } else {
                    int i61 = i7 << 16;
                    int i62 = i61;
                    int i63 = i61;
                    int i64 = i10 << 16;
                    int i65 = i64;
                    int i66 = i64;
                    if (i4 < 0) {
                        i63 -= i37 * i4;
                        i62 -= i39 * i4;
                        f14 -= f13 * i4;
                        i66 -= i38 * i4;
                        i65 -= i40 * i4;
                        i4 = 0;
                    }
                    int i67 = i6 << 16;
                    int i68 = i9 << 16;
                    if (i3 < 0) {
                        i67 -= i41 * i3;
                        i68 -= i42 * i3;
                        i3 = 0;
                    }
                    int i69 = i4 - t;
                    int i70 = i28 + (i30 * i69);
                    int i71 = i31 + (i33 * i69);
                    int i72 = i34 + (i36 * i69);
                    if (i37 < i39) {
                        int i73 = i5 - i3;
                        int i74 = i3 - i4;
                        int i75 = x[i4];
                        while (true) {
                            i74--;
                            if (i74 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i75, i63 >> 16, i62 >> 16, i66 >> 8, i65 >> 8, i70, i71, i72, i29, i32, i35, f14, f12);
                            i63 += i37;
                            i62 += i39;
                            i66 += i38;
                            i65 += i40;
                            f14 += f13;
                            i75 += class_210.h;
                            i70 += i30;
                            i71 += i33;
                            i72 += i36;
                        }
                        while (true) {
                            i73--;
                            if (i73 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i75, i67 >> 16, i62 >> 16, i68 >> 8, i65 >> 8, i70, i71, i72, i29, i32, i35, f14, f12);
                            i67 += i41;
                            i62 += i39;
                            i68 += i42;
                            i65 += i40;
                            f14 += f13;
                            i75 += class_210.h;
                            i70 += i30;
                            i71 += i33;
                            i72 += i36;
                        }
                    } else {
                        int i76 = i5 - i3;
                        int i77 = i3 - i4;
                        int i78 = x[i4];
                        while (true) {
                            i77--;
                            if (i77 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i78, i62 >> 16, i63 >> 16, i65 >> 8, i66 >> 8, i70, i71, i72, i29, i32, i35, f14, f12);
                            i63 += i37;
                            i62 += i39;
                            i66 += i38;
                            i65 += i40;
                            f14 += f13;
                            i78 += class_210.h;
                            i70 += i30;
                            i71 += i33;
                            i72 += i36;
                        }
                        while (true) {
                            i76--;
                            if (i76 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i78, i62 >> 16, i67 >> 16, i65 >> 8, i68 >> 8, i70, i71, i72, i29, i32, i35, f14, f12);
                            i67 += i41;
                            i62 += i39;
                            i68 += i42;
                            i65 += i40;
                            f14 += f13;
                            i78 += class_210.h;
                            i70 += i30;
                            i71 += i33;
                            i72 += i36;
                        }
                    }
                }
            } else {
                if (i5 >= class_210.k) {
                    return;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                float f15 = (f4 - (f12 * i8)) + f12;
                if (i3 < i4) {
                    int i79 = i8 << 16;
                    int i80 = i79;
                    int i81 = i79;
                    int i82 = i11 << 16;
                    int i83 = i82;
                    int i84 = i82;
                    if (i5 < 0) {
                        i81 -= i39 * i5;
                        i80 -= i41 * i5;
                        f15 -= f13 * i5;
                        i84 -= i40 * i5;
                        i83 -= i42 * i5;
                        i5 = 0;
                    }
                    int i85 = i6 << 16;
                    int i86 = i9 << 16;
                    if (i3 < 0) {
                        i85 -= i37 * i3;
                        i86 -= i38 * i3;
                        i3 = 0;
                    }
                    int i87 = i5 - t;
                    int i88 = i28 + (i30 * i87);
                    int i89 = i31 + (i33 * i87);
                    int i90 = i34 + (i36 * i87);
                    if (i39 < i41) {
                        int i91 = i4 - i3;
                        int i92 = i3 - i5;
                        int i93 = x[i5];
                        while (true) {
                            i92--;
                            if (i92 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i93, i81 >> 16, i80 >> 16, i84 >> 8, i83 >> 8, i88, i89, i90, i29, i32, i35, f15, f12);
                            i81 += i39;
                            i80 += i41;
                            i84 += i40;
                            i83 += i42;
                            f15 += f13;
                            i93 += class_210.h;
                            i88 += i30;
                            i89 += i33;
                            i90 += i36;
                        }
                        while (true) {
                            i91--;
                            if (i91 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i93, i81 >> 16, i85 >> 16, i84 >> 8, i86 >> 8, i88, i89, i90, i29, i32, i35, f15, f12);
                            i81 += i39;
                            i85 += i37;
                            i84 += i40;
                            i86 += i38;
                            f15 += f13;
                            i93 += class_210.h;
                            i88 += i30;
                            i89 += i33;
                            i90 += i36;
                        }
                    } else {
                        int i94 = i4 - i3;
                        int i95 = i3 - i5;
                        int i96 = x[i5];
                        while (true) {
                            i95--;
                            if (i95 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i96, i80 >> 16, i81 >> 16, i83 >> 8, i84 >> 8, i88, i89, i90, i29, i32, i35, f15, f12);
                            i81 += i39;
                            i80 += i41;
                            i84 += i40;
                            i83 += i42;
                            f15 += f13;
                            i96 += class_210.h;
                            i88 += i30;
                            i89 += i33;
                            i90 += i36;
                        }
                        while (true) {
                            i94--;
                            if (i94 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i96, i85 >> 16, i81 >> 16, i86 >> 8, i84 >> 8, i88, i89, i90, i29, i32, i35, f15, f12);
                            i81 += i39;
                            i85 += i37;
                            i84 += i40;
                            i86 += i38;
                            f15 += f13;
                            i96 += class_210.h;
                            i88 += i30;
                            i89 += i33;
                            i90 += i36;
                        }
                    }
                } else {
                    int i97 = i8 << 16;
                    int i98 = i97;
                    int i99 = i97;
                    int i100 = i11 << 16;
                    int i101 = i100;
                    int i102 = i100;
                    if (i5 < 0) {
                        i99 -= i39 * i5;
                        i98 -= i41 * i5;
                        f15 -= f13 * i5;
                        i102 -= i40 * i5;
                        i101 -= i42 * i5;
                        i5 = 0;
                    }
                    int i103 = i7 << 16;
                    int i104 = i10 << 16;
                    if (i4 < 0) {
                        i103 -= i37 * i4;
                        i104 -= i38 * i4;
                        i4 = 0;
                    }
                    int i105 = i5 - t;
                    int i106 = i28 + (i30 * i105);
                    int i107 = i31 + (i33 * i105);
                    int i108 = i34 + (i36 * i105);
                    if (i39 < i41) {
                        int i109 = i3 - i4;
                        int i110 = i4 - i5;
                        int i111 = x[i5];
                        while (true) {
                            i110--;
                            if (i110 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i111, i99 >> 16, i98 >> 16, i102 >> 8, i101 >> 8, i106, i107, i108, i29, i32, i35, f15, f12);
                            i99 += i39;
                            i98 += i41;
                            i102 += i40;
                            i101 += i42;
                            f15 += f13;
                            i111 += class_210.h;
                            i106 += i30;
                            i107 += i33;
                            i108 += i36;
                        }
                        while (true) {
                            i109--;
                            if (i109 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i111, i103 >> 16, i98 >> 16, i104 >> 8, i101 >> 8, i106, i107, i108, i29, i32, i35, f15, f12);
                            i103 += i37;
                            i98 += i41;
                            i104 += i38;
                            i101 += i42;
                            f15 += f13;
                            i111 += class_210.h;
                            i106 += i30;
                            i107 += i33;
                            i108 += i36;
                        }
                    } else {
                        int i112 = i3 - i4;
                        int i113 = i4 - i5;
                        int i114 = x[i5];
                        while (true) {
                            i113--;
                            if (i113 < 0) {
                                break;
                            }
                            a(class_210.g, iArrD, i114, i98 >> 16, i99 >> 16, i101 >> 8, i102 >> 8, i106, i107, i108, i29, i32, i35, f15, f12);
                            i99 += i39;
                            i98 += i41;
                            i102 += i40;
                            i101 += i42;
                            f15 += f13;
                            i114 += class_210.h;
                            i106 += i30;
                            i107 += i33;
                            i108 += i36;
                        }
                        while (true) {
                            i112--;
                            if (i112 < 0) {
                                return;
                            }
                            a(class_210.g, iArrD, i114, i98 >> 16, i103 >> 16, i101 >> 8, i104 >> 8, i106, i107, i108, i29, i32, i35, f15, f12);
                            i103 += i37;
                            i98 += i41;
                            i104 += i38;
                            i101 += i42;
                            f15 += f13;
                            i114 += class_210.h;
                            i106 += i30;
                            i107 += i33;
                            i108 += i36;
                        }
                    }
                }
            }
        } else {
            if (i3 >= class_210.k) {
                return;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i5 > class_210.k) {
                i5 = class_210.k;
            }
            float f16 = (f2 - (f12 * i6)) + f12;
            if (i4 < i5) {
                int i115 = i6 << 16;
                int i116 = i115;
                int i117 = i115;
                int i118 = i9 << 16;
                int i119 = i118;
                int i120 = i118;
                if (i3 < 0) {
                    i117 -= i41 * i3;
                    i116 -= i37 * i3;
                    f16 -= f13 * i3;
                    i120 -= i42 * i3;
                    i119 -= i38 * i3;
                    i3 = 0;
                }
                int i121 = i7 << 16;
                int i122 = i10 << 16;
                if (i4 < 0) {
                    i121 -= i39 * i4;
                    i122 -= i40 * i4;
                    i4 = 0;
                }
                int i123 = i3 - t;
                int i124 = i28 + (i30 * i123);
                int i125 = i31 + (i33 * i123);
                int i126 = i34 + (i36 * i123);
                if ((i3 == i4 || i41 >= i37) && (i3 != i4 || i41 <= i39)) {
                    int i127 = i5 - i4;
                    int i128 = i4 - i3;
                    int i129 = x[i3];
                    while (true) {
                        i128--;
                        if (i128 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i129, i116 >> 16, i117 >> 16, i119 >> 8, i120 >> 8, i124, i125, i126, i29, i32, i35, f16, f12);
                        i117 += i41;
                        i116 += i37;
                        f16 += f13;
                        i120 += i42;
                        i119 += i38;
                        i129 += class_210.h;
                        i124 += i30;
                        i125 += i33;
                        i126 += i36;
                    }
                    while (true) {
                        i127--;
                        if (i127 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i129, i121 >> 16, i117 >> 16, i122 >> 8, i120 >> 8, i124, i125, i126, i29, i32, i35, f16, f12);
                        i117 += i41;
                        i121 += i39;
                        f16 += f13;
                        i120 += i42;
                        i122 += i40;
                        i129 += class_210.h;
                        i124 += i30;
                        i125 += i33;
                        i126 += i36;
                    }
                } else {
                    int i130 = i5 - i4;
                    int i131 = i4 - i3;
                    int i132 = x[i3];
                    while (true) {
                        i131--;
                        if (i131 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i132, i117 >> 16, i116 >> 16, i120 >> 8, i119 >> 8, i124, i125, i126, i29, i32, i35, f16, f12);
                        i117 += i41;
                        i116 += i37;
                        f16 += f13;
                        i120 += i42;
                        i119 += i38;
                        i132 += class_210.h;
                        i124 += i30;
                        i125 += i33;
                        i126 += i36;
                    }
                    while (true) {
                        i130--;
                        if (i130 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i132, i117 >> 16, i121 >> 16, i120 >> 8, i122 >> 8, i124, i125, i126, i29, i32, i35, f16, f12);
                        i117 += i41;
                        i121 += i39;
                        f16 += f13;
                        i120 += i42;
                        i122 += i40;
                        i132 += class_210.h;
                        i124 += i30;
                        i125 += i33;
                        i126 += i36;
                    }
                }
            } else {
                int i133 = i6 << 16;
                int i134 = i133;
                int i135 = i133;
                int i136 = i9 << 16;
                int i137 = i136;
                int i138 = i136;
                if (i3 < 0) {
                    i135 -= i41 * i3;
                    i134 -= i37 * i3;
                    f16 -= f13 * i3;
                    i138 -= i42 * i3;
                    i137 -= i38 * i3;
                    i3 = 0;
                }
                int i139 = i8 << 16;
                int i140 = i11 << 16;
                if (i5 < 0) {
                    i139 -= i39 * i5;
                    i140 -= i40 * i5;
                    i5 = 0;
                }
                int i141 = i3 - t;
                int i142 = i28 + (i30 * i141);
                int i143 = i31 + (i33 * i141);
                int i144 = i34 + (i36 * i141);
                if ((i3 == i5 || i41 >= i37) && (i3 != i5 || i39 <= i37)) {
                    int i145 = i4 - i5;
                    int i146 = i5 - i3;
                    int i147 = x[i3];
                    while (true) {
                        i146--;
                        if (i146 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i147, i134 >> 16, i135 >> 16, i137 >> 8, i138 >> 8, i142, i143, i144, i29, i32, i35, f16, f12);
                        i135 += i41;
                        i134 += i37;
                        i138 += i42;
                        i137 += i38;
                        f16 += f13;
                        i147 += class_210.h;
                        i142 += i30;
                        i143 += i33;
                        i144 += i36;
                    }
                    while (true) {
                        i145--;
                        if (i145 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i147, i134 >> 16, i139 >> 16, i137 >> 8, i140 >> 8, i142, i143, i144, i29, i32, i35, f16, f12);
                        i139 += i39;
                        i134 += i37;
                        i140 += i40;
                        i137 += i38;
                        f16 += f13;
                        i147 += class_210.h;
                        i142 += i30;
                        i143 += i33;
                        i144 += i36;
                    }
                } else {
                    int i148 = i4 - i5;
                    int i149 = i5 - i3;
                    int i150 = x[i3];
                    while (true) {
                        i149--;
                        if (i149 < 0) {
                            break;
                        }
                        a(class_210.g, iArrD, i150, i135 >> 16, i134 >> 16, i138 >> 8, i137 >> 8, i142, i143, i144, i29, i32, i35, f16, f12);
                        i135 += i41;
                        i134 += i37;
                        i138 += i42;
                        i137 += i38;
                        f16 += f13;
                        i150 += class_210.h;
                        i142 += i30;
                        i143 += i33;
                        i144 += i36;
                    }
                    while (true) {
                        i148--;
                        if (i148 < 0) {
                            return;
                        }
                        a(class_210.g, iArrD, i150, i139 >> 16, i134 >> 16, i140 >> 8, i137 >> 8, i142, i143, i144, i29, i32, i35, f16, f12);
                        i139 += i39;
                        i134 += i37;
                        i140 += i40;
                        i137 += i38;
                        f16 += f13;
                        i150 += class_210.h;
                        i142 += i30;
                        i143 += i33;
                        i144 += i36;
                    }
                }
            }
        }
    }

    public static void a(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f2, float f3) {
        int i13;
        int i14;
        int i15;
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        int i16 = 0;
        int i17 = 0;
        if (i3 >= i4) {
            return;
        }
        if (o) {
            int i18 = (i6 - i5) / (i4 - i3);
            if (i4 > class_210.n) {
                i4 = class_210.n;
            }
            if (i3 < 0) {
                i5 -= i3 * i18;
                i3 = 0;
            }
            if (i3 >= i4) {
                return;
            }
            i13 = (i4 - i3) >> 3;
            i14 = i18 << 12;
            i15 = i5 << 9;
        } else {
            if (i4 - i3 > 7) {
                i13 = (i4 - i3) >> 3;
                i14 = ((i6 - i5) * E[i13]) >> 6;
            } else {
                i13 = 0;
                i14 = 0;
            }
            i15 = i5 << 9;
        }
        int i19 = i2 + i3;
        float f4 = f2 + (f3 * i3);
        if (n) {
            int i20 = 0;
            int i21 = 0;
            int i22 = i3 - s;
            int i23 = i7 + ((i10 >> 3) * i22);
            int i24 = i8 + ((i11 >> 3) * i22);
            int i25 = i9 + ((i12 >> 3) * i22);
            int i26 = i25 >> 12;
            if (i26 != 0) {
                i16 = i23 / i26;
                i17 = i24 / i26;
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 4032) {
                    i16 = 4032;
                }
            }
            int i27 = i23 + i10;
            int i28 = i24 + i11;
            int i29 = i25 + i12;
            int i30 = i29 >> 12;
            if (i30 != 0) {
                i20 = i27 / i30;
                i21 = i28 / i30;
                if (i20 < 7) {
                    i20 = 7;
                } else if (i20 > 4032) {
                    i20 = 4032;
                }
            }
            int i31 = (i20 - i16) >> 3;
            int i32 = (i21 - i17) >> 3;
            int i33 = i16 + ((i15 & 6291456) >> 3);
            int i34 = i15 >> 23;
            if (D) {
                while (true) {
                    int i35 = i13;
                    i13--;
                    if (i35 <= 0) {
                        break;
                    }
                    for (int i36 = 0; i36 < 8; i36++) {
                        class_210.a(iArr, i19, iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34, iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34, 255);
                        class_210.f[i19] = f4;
                        i19++;
                        f4 += f3;
                        i33 += i31;
                        i17 += i32;
                    }
                    int i37 = i20;
                    i17 = i21;
                    i27 += i10;
                    i28 += i11;
                    i29 += i12;
                    int i38 = i29 >> 12;
                    if (i38 != 0) {
                        i20 = i27 / i38;
                        i21 = i28 / i38;
                        if (i20 < 7) {
                            i20 = 7;
                        } else if (i20 > 4032) {
                            i20 = 4032;
                        }
                    }
                    i31 = (i20 - i37) >> 3;
                    i32 = (i21 - i17) >> 3;
                    i15 += i14;
                    i33 = i37 + ((i15 & 6291456) >> 3);
                    i34 = i15 >> 23;
                }
                int i39 = (i4 - i3) & 7;
                while (true) {
                    int i40 = i39;
                    i39--;
                    if (i40 <= 0) {
                        return;
                    }
                    class_210.a(iArr, i19, iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34, iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34, 255);
                    class_210.f[i19] = f4;
                    i19++;
                    f4 += f3;
                    i33 += i31;
                    i17 += i32;
                }
            } else {
                while (true) {
                    int i41 = i13;
                    i13--;
                    if (i41 <= 0) {
                        break;
                    }
                    for (int i42 = 0; i42 < 8; i42++) {
                        int i43 = iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34;
                        if (i43 != 0) {
                            class_210.a(iArr, i19, i43, i43, 255);
                            class_210.f[i19] = f4;
                        }
                        i19++;
                        f4 += f3;
                        i33 += i31;
                        i17 += i32;
                    }
                    int i44 = i20;
                    i17 = i21;
                    i27 += i10;
                    i28 += i11;
                    i29 += i12;
                    int i45 = i29 >> 12;
                    if (i45 != 0) {
                        i20 = i27 / i45;
                        i21 = i28 / i45;
                        if (i20 < 7) {
                            i20 = 7;
                        } else if (i20 > 4032) {
                            i20 = 4032;
                        }
                    }
                    i31 = (i20 - i44) >> 3;
                    i32 = (i21 - i17) >> 3;
                    i15 += i14;
                    i33 = i44 + ((i15 & 6291456) >> 3);
                    i34 = i15 >> 23;
                }
                int i46 = (i4 - i3) & 7;
                while (true) {
                    int i47 = i46;
                    i46--;
                    if (i47 <= 0) {
                        return;
                    }
                    int i48 = iArr2[(i17 & 4032) + (i33 >> 6)] >>> i34;
                    if (i48 != 0) {
                        class_210.a(iArr, i19, i48, i48, 255);
                        class_210.f[i19] = f4;
                    }
                    i19++;
                    f4 += f3;
                    i33 += i31;
                    i17 += i32;
                }
            }
        } else {
            int i49 = 0;
            int i50 = 0;
            int i51 = i3 - s;
            int i52 = i7 + ((i10 >> 3) * i51);
            int i53 = i8 + ((i11 >> 3) * i51);
            int i54 = i9 + ((i12 >> 3) * i51);
            int i55 = i54 >> 14;
            if (i55 != 0) {
                i16 = i52 / i55;
                i17 = i53 / i55;
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 16256) {
                    i16 = 16256;
                }
            }
            int i56 = i52 + i10;
            int i57 = i53 + i11;
            int i58 = i54 + i12;
            int i59 = i58 >> 14;
            if (i59 != 0) {
                i49 = i56 / i59;
                i50 = i57 / i59;
                if (i49 < 7) {
                    i49 = 7;
                } else if (i49 > 16256) {
                    i49 = 16256;
                }
            }
            int i60 = (i49 - i16) >> 3;
            int i61 = (i50 - i17) >> 3;
            int i62 = i16 + (i15 & 6291456);
            int i63 = i15 >> 23;
            if (D) {
                while (true) {
                    int i64 = i13;
                    i13--;
                    if (i64 <= 0) {
                        break;
                    }
                    for (int i65 = 0; i65 < 8; i65++) {
                        class_210.a(iArr, i19, iArr2[(i17 & 16256) + (i62 >> 7)] >>> i63, iArr2[(i17 & 16256) + (i62 >> 7)] >>> i63, 255);
                        class_210.f[i19] = f4;
                        f4 += f3;
                        i19++;
                        i62 += i60;
                        i17 += i61;
                    }
                    int i66 = i49;
                    i17 = i50;
                    i56 += i10;
                    i57 += i11;
                    i58 += i12;
                    int i67 = i58 >> 14;
                    if (i67 != 0) {
                        i49 = i56 / i67;
                        i50 = i57 / i67;
                        if (i49 < 7) {
                            i49 = 7;
                        } else if (i49 > 16256) {
                            i49 = 16256;
                        }
                    }
                    i60 = (i49 - i66) >> 3;
                    i61 = (i50 - i17) >> 3;
                    i15 += i14;
                    i62 = i66 + (i15 & 6291456);
                    i63 = i15 >> 23;
                }
                int i68 = (i4 - i3) & 7;
                while (true) {
                    int i69 = i68;
                    i68--;
                    if (i69 <= 0) {
                        return;
                    }
                    class_210.a(iArr, i19, iArr2[(i17 & 16256) + (i62 >> 7)] >>> i63, iArr2[(i17 & 16256) + (i62 >> 7)] >>> i63, 255);
                    class_210.f[i19] = f4;
                    i19++;
                    f4 += f3;
                    i62 += i60;
                    i17 += i61;
                }
            } else {
                while (true) {
                    int i70 = i13;
                    i13--;
                    if (i70 <= 0) {
                        break;
                    }
                    for (int i71 = 0; i71 < 8; i71++) {
                        int i72 = iArr2[(i17 & 16256) + (i62 >> 7)] >>> i63;
                        if (i72 != 0) {
                            class_210.a(iArr, i19, i72, i72, 255);
                            class_210.f[i19] = f4;
                        }
                        i19++;
                        f4 += f3;
                        i62 += i60;
                        i17 += i61;
                    }
                    int i73 = i49;
                    i17 = i50;
                    i56 += i10;
                    i57 += i11;
                    i58 += i12;
                    int i74 = i58 >> 14;
                    if (i74 != 0) {
                        i49 = i56 / i74;
                        i50 = i57 / i74;
                        if (i49 < 7) {
                            i49 = 7;
                        } else if (i49 > 16256) {
                            i49 = 16256;
                        }
                    }
                    i60 = (i49 - i73) >> 3;
                    i61 = (i50 - i17) >> 3;
                    i15 += i14;
                    i62 = i73 + (i15 & 6291456);
                    i63 = i15 >> 23;
                }
                int i75 = (i4 - i3) & 7;
                while (true) {
                    int i76 = i75;
                    i75--;
                    if (i76 <= 0) {
                        return;
                    }
                    int i77 = iArr2[(i17 & 16256) + (i62 >> 7)] >>> i63;
                    if (i77 != 0) {
                        class_210.a(iArr, i19, i77, i77, 255);
                        class_210.f[i19] = f4;
                    }
                    f4 += f3;
                    i19++;
                    i62 += i60;
                    i17 += i61;
                }
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (e.a() && !h) {
            return;
        }
        int i20 = 0;
        if (i6 != i5) {
            i20 = ((i3 - i2) << 16) / (i6 - i5);
        }
        int i21 = 0;
        if (i7 != i6) {
            i21 = ((i4 - i3) << 16) / (i7 - i6);
        }
        int i22 = 0;
        if (i7 != i5) {
            i22 = ((i2 - i4) << 16) / (i5 - i7);
        }
        float f5 = i3 - i2;
        float f6 = i6 - i5;
        float f7 = i4 - i2;
        float f8 = i7 - i5;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = (f5 * f8) - (f7 * f6);
        float f12 = ((f9 * f8) - (f10 * f6)) / f11;
        float f13 = ((f10 * f5) - (f9 * f7)) / f11;
        if (i5 > i6 || i5 > i7) {
            if (i6 <= i7) {
                if (i6 >= class_210.k) {
                    return;
                }
                if (i7 > class_210.k) {
                    i7 = class_210.k;
                }
                if (i5 > class_210.k) {
                    i5 = class_210.k;
                }
                float f14 = (f3 - (f12 * i3)) + f12;
                if (i7 < i5) {
                    int i23 = i3 << 16;
                    int i24 = i23;
                    int i25 = i23;
                    if (i6 < 0) {
                        i25 -= i20 * i6;
                        i24 -= i21 * i6;
                        f14 -= f13 * i6;
                        i6 = 0;
                    }
                    int i26 = i4 << 16;
                    if (i7 < 0) {
                        i26 -= i22 * i7;
                        i7 = 0;
                    }
                    if ((i6 == i7 || i20 >= i21) && (i6 != i7 || i20 <= i22)) {
                        int i27 = i5 - i7;
                        int i28 = i7 - i6;
                        int i29 = x[i6];
                        while (true) {
                            i14 = i29;
                            i28--;
                            if (i28 < 0) {
                                break;
                            }
                            a(i14, i24 >> 16, i25 >> 16, f14, f12);
                            i25 += i20;
                            i24 += i21;
                            f14 += f13;
                            i29 = i14 + class_210.h;
                        }
                        while (true) {
                            i27--;
                            if (i27 < 0) {
                                return;
                            }
                            a(i14, i26 >> 16, i25 >> 16, f14, f12);
                            i25 += i20;
                            i26 += i22;
                            f14 += f13;
                            i14 += class_210.h;
                        }
                    } else {
                        int i30 = i5 - i7;
                        int i31 = i7 - i6;
                        int i32 = x[i6];
                        while (true) {
                            i15 = i32;
                            i31--;
                            if (i31 < 0) {
                                break;
                            }
                            a(i15, i25 >> 16, i24 >> 16, f14, f12);
                            i25 += i20;
                            i24 += i21;
                            f14 += f13;
                            i32 = i15 + class_210.h;
                        }
                        while (true) {
                            i30--;
                            if (i30 < 0) {
                                return;
                            }
                            a(i15, i25 >> 16, i26 >> 16, f14, f12);
                            i25 += i20;
                            i26 += i22;
                            f14 += f13;
                            i15 += class_210.h;
                        }
                    }
                } else {
                    int i33 = i3 << 16;
                    int i34 = i33;
                    int i35 = i33;
                    if (i6 < 0) {
                        i35 -= i20 * i6;
                        i34 -= i21 * i6;
                        f14 -= f13 * i6;
                        i6 = 0;
                    }
                    int i36 = i2 << 16;
                    if (i5 < 0) {
                        i36 -= i22 * i5;
                        i5 = 0;
                    }
                    if (i20 < i21) {
                        int i37 = i7 - i5;
                        int i38 = i5 - i6;
                        int i39 = x[i6];
                        while (true) {
                            i13 = i39;
                            i38--;
                            if (i38 < 0) {
                                break;
                            }
                            a(i13, i35 >> 16, i34 >> 16, f14, f12);
                            i35 += i20;
                            i34 += i21;
                            f14 += f13;
                            i39 = i13 + class_210.h;
                        }
                        while (true) {
                            i37--;
                            if (i37 < 0) {
                                return;
                            }
                            a(i13, i36 >> 16, i34 >> 16, f14, f12);
                            i36 += i22;
                            i34 += i21;
                            f14 += f13;
                            i13 += class_210.h;
                        }
                    } else {
                        int i40 = i7 - i5;
                        int i41 = i5 - i6;
                        int i42 = x[i6];
                        while (true) {
                            i12 = i42;
                            i41--;
                            if (i41 < 0) {
                                break;
                            }
                            a(i12, i34 >> 16, i35 >> 16, f14, f12);
                            i35 += i20;
                            i34 += i21;
                            f14 += f13;
                            i42 = i12 + class_210.h;
                        }
                        while (true) {
                            i40--;
                            if (i40 < 0) {
                                return;
                            }
                            a(i12, i34 >> 16, i36 >> 16, f14, f12);
                            i36 += i22;
                            i34 += i21;
                            f14 += f13;
                            i12 += class_210.h;
                        }
                    }
                }
            } else {
                if (i7 >= class_210.k) {
                    return;
                }
                if (i5 > class_210.k) {
                    i5 = class_210.k;
                }
                if (i6 > class_210.k) {
                    i6 = class_210.k;
                }
                float f15 = (f4 - (f12 * i4)) + f12;
                if (i5 < i6) {
                    int i43 = i4 << 16;
                    int i44 = i43;
                    int i45 = i43;
                    if (i7 < 0) {
                        i45 -= i21 * i7;
                        i44 -= i22 * i7;
                        f15 -= f13 * i7;
                        i7 = 0;
                    }
                    int i46 = i2 << 16;
                    if (i5 < 0) {
                        i46 -= i20 * i5;
                        i5 = 0;
                    }
                    if (i21 < i22) {
                        int i47 = i6 - i5;
                        int i48 = i5 - i7;
                        int i49 = x[i7];
                        while (true) {
                            i11 = i49;
                            i48--;
                            if (i48 < 0) {
                                break;
                            }
                            a(i11, i45 >> 16, i44 >> 16, f15, f12);
                            i45 += i21;
                            i44 += i22;
                            f15 += f13;
                            i49 = i11 + class_210.h;
                        }
                        while (true) {
                            i47--;
                            if (i47 < 0) {
                                return;
                            }
                            a(i11, i45 >> 16, i46 >> 16, f15, f12);
                            i45 += i21;
                            i46 += i20;
                            f15 += f13;
                            i11 += class_210.h;
                        }
                    } else {
                        int i50 = i6 - i5;
                        int i51 = i5 - i7;
                        int i52 = x[i7];
                        while (true) {
                            i10 = i52;
                            i51--;
                            if (i51 < 0) {
                                break;
                            }
                            a(i10, i44 >> 16, i45 >> 16, f15, f12);
                            i45 += i21;
                            i44 += i22;
                            f15 += f13;
                            i52 = i10 + class_210.h;
                        }
                        while (true) {
                            i50--;
                            if (i50 < 0) {
                                return;
                            }
                            a(i10, i46 >> 16, i45 >> 16, f15, f12);
                            i45 += i21;
                            i46 += i20;
                            f15 += f13;
                            i10 += class_210.h;
                        }
                    }
                } else {
                    int i53 = i4 << 16;
                    int i54 = i53;
                    int i55 = i53;
                    if (i7 < 0) {
                        i55 -= i21 * i7;
                        i54 -= i22 * i7;
                        f15 -= f13 * i7;
                        i7 = 0;
                    }
                    int i56 = i3 << 16;
                    if (i6 < 0) {
                        i56 -= i20 * i6;
                        i6 = 0;
                    }
                    if (i21 < i22) {
                        int i57 = i5 - i6;
                        int i58 = i6 - i7;
                        int i59 = x[i7];
                        while (true) {
                            i9 = i59;
                            i58--;
                            if (i58 < 0) {
                                break;
                            }
                            a(i9, i55 >> 16, i54 >> 16, f15, f12);
                            i55 += i21;
                            i54 += i22;
                            f15 += f13;
                            i59 = i9 + class_210.h;
                        }
                        while (true) {
                            i57--;
                            if (i57 < 0) {
                                return;
                            }
                            a(i9, i56 >> 16, i54 >> 16, f15, f12);
                            i56 += i20;
                            i54 += i22;
                            f15 += f13;
                            i9 += class_210.h;
                        }
                    } else {
                        int i60 = i5 - i6;
                        int i61 = i6 - i7;
                        int i62 = x[i7];
                        while (true) {
                            i8 = i62;
                            i61--;
                            if (i61 < 0) {
                                break;
                            }
                            a(i8, i54 >> 16, i55 >> 16, f15, f12);
                            i55 += i21;
                            i54 += i22;
                            f15 += f13;
                            i62 = i8 + class_210.h;
                        }
                        while (true) {
                            i60--;
                            if (i60 < 0) {
                                return;
                            }
                            a(i8, i54 >> 16, i56 >> 16, f15, f12);
                            i56 += i20;
                            i54 += i22;
                            f15 += f13;
                            i8 += class_210.h;
                        }
                    }
                }
            }
        } else {
            if (i5 >= class_210.k) {
                return;
            }
            if (i6 > class_210.k) {
                i6 = class_210.k;
            }
            if (i7 > class_210.k) {
                i7 = class_210.k;
            }
            float f16 = (f2 - (f12 * i2)) + f12;
            if (i6 < i7) {
                int i63 = i2 << 16;
                int i64 = i63;
                int i65 = i63;
                if (i5 < 0) {
                    i65 -= i22 * i5;
                    i64 -= i20 * i5;
                    f16 -= f13 * i5;
                    i5 = 0;
                }
                int i66 = i3 << 16;
                if (i6 < 0) {
                    i66 -= i21 * i6;
                    i6 = 0;
                }
                if ((i5 == i6 || i22 >= i20) && (i5 != i6 || i22 <= i21)) {
                    int i67 = i7 - i6;
                    int i68 = i6 - i5;
                    int i69 = x[i5];
                    while (true) {
                        i18 = i69;
                        i68--;
                        if (i68 < 0) {
                            break;
                        }
                        a(i18, i64 >> 16, i65 >> 16, f16, f12);
                        i65 += i22;
                        i64 += i20;
                        f16 += f13;
                        i69 = i18 + class_210.h;
                    }
                    while (true) {
                        i67--;
                        if (i67 < 0) {
                            return;
                        }
                        a(i18, i66 >> 16, i65 >> 16, f16, f12);
                        i65 += i22;
                        i66 += i21;
                        f16 += f13;
                        i18 += class_210.h;
                    }
                } else {
                    int i70 = i7 - i6;
                    int i71 = i6 - i5;
                    int i72 = x[i5];
                    while (true) {
                        i19 = i72;
                        i71--;
                        if (i71 < 0) {
                            break;
                        }
                        a(i19, i65 >> 16, i64 >> 16, f16, f12);
                        i65 += i22;
                        i64 += i20;
                        f16 += f13;
                        i72 = i19 + class_210.h;
                    }
                    while (true) {
                        i70--;
                        if (i70 < 0) {
                            return;
                        }
                        a(i19, i65 >> 16, i66 >> 16, f16, f12);
                        i65 += i22;
                        i66 += i21;
                        f16 += f13;
                        i19 += class_210.h;
                    }
                }
            } else {
                int i73 = i2 << 16;
                int i74 = i73;
                int i75 = i73;
                if (i5 < 0) {
                    i75 -= i22 * i5;
                    i74 -= i20 * i5;
                    f16 -= f13 * i5;
                    i5 = 0;
                }
                int i76 = i4 << 16;
                if (i7 < 0) {
                    i76 -= i21 * i7;
                    i7 = 0;
                }
                if ((i5 == i7 || i22 >= i20) && (i5 != i7 || i21 <= i20)) {
                    int i77 = i6 - i7;
                    int i78 = i7 - i5;
                    int i79 = x[i5];
                    while (true) {
                        i16 = i79;
                        i78--;
                        if (i78 < 0) {
                            break;
                        }
                        a(i16, i74 >> 16, i75 >> 16, f16, f12);
                        i75 += i22;
                        i74 += i20;
                        f16 += f13;
                        i79 = i16 + class_210.h;
                    }
                    while (true) {
                        i77--;
                        if (i77 < 0) {
                            return;
                        }
                        a(i16, i74 >> 16, i76 >> 16, f16, f12);
                        i76 += i21;
                        i74 += i20;
                        f16 += f13;
                        i16 += class_210.h;
                    }
                } else {
                    int i80 = i6 - i7;
                    int i81 = i7 - i5;
                    int i82 = x[i5];
                    while (true) {
                        i17 = i82;
                        i81--;
                        if (i81 < 0) {
                            break;
                        }
                        a(i17, i75 >> 16, i74 >> 16, f16, f12);
                        i75 += i22;
                        i74 += i20;
                        f16 += f13;
                        i82 = i17 + class_210.h;
                    }
                    while (true) {
                        i80--;
                        if (i80 < 0) {
                            return;
                        }
                        a(i17, i76 >> 16, i74 >> 16, f16, f12);
                        i76 += i21;
                        i74 += i20;
                        f16 += f13;
                        i17 += class_210.h;
                    }
                }
            }
        }
    }

    private static void a(int i2, int i3, int i4, float f2, float f3) {
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        int length = class_210.f.length;
        if (o) {
            if (i4 > class_210.h) {
                i4 = class_210.h;
            }
            if (i3 < 0) {
                i3 = 0;
            }
        }
        if (i3 >= i4) {
            return;
        }
        int i5 = i2 + (i3 - 1);
        int i6 = (i4 - i3) >> 2;
        float f4 = f2 + (f3 * i3);
        if (r == 0) {
            while (true) {
                i6--;
                if (i6 < 0) {
                    break;
                }
                int i7 = i5 + 1;
                if (i7 >= 0 && i7 < length) {
                    class_210.f[i7] = f4;
                }
                float f5 = f4 + f3;
                int i8 = i7 + 1;
                if (i8 >= 0 && i8 < length) {
                    class_210.f[i8] = f5;
                }
                float f6 = f5 + f3;
                int i9 = i8 + 1;
                if (i9 >= 0 && i9 < length) {
                    class_210.f[i9] = f6;
                }
                float f7 = f6 + f3;
                i5 = i9 + 1;
                if (i5 >= 0 && i5 < length) {
                    class_210.f[i5] = f7;
                }
                f4 = f7 + f3;
            }
            int i10 = (i4 - i3) & 3;
            while (true) {
                i10--;
                if (i10 < 0) {
                    return;
                }
                i5++;
                if (i5 >= 0 && i5 < length) {
                    class_210.f[i5] = f4;
                }
                f4 += f3;
            }
        } else {
            while (true) {
                i6--;
                if (i6 < 0) {
                    break;
                }
                int i11 = i5 + 1;
                if (i11 >= 0 && i11 < length) {
                    class_210.f[i11] = f4;
                }
                float f8 = f4 + f3;
                int i12 = i11 + 1;
                if (i12 >= 0 && i12 < length) {
                    class_210.f[i12] = f8;
                }
                float f9 = f8 + f3;
                int i13 = i12 + 1;
                if (i13 >= 0 && i13 < length) {
                    class_210.f[i13] = f9;
                }
                float f10 = f9 + f3;
                i5 = i13 + 1;
                if (i5 >= 0 && i5 < length) {
                    class_210.f[i5] = f10;
                }
                f4 = f10 + f3;
            }
            int i14 = (i4 - i3) & 3;
            while (true) {
                i14--;
                if (i14 < 0) {
                    return;
                }
                i5++;
                if (i5 >= 0 && i5 < length) {
                    class_210.f[i5] = f4;
                }
                f4 += f3;
            }
        }
    }

    public static void c(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        if (e.a() && !h) {
            return;
        }
        int i21 = (127 - i8) << 1;
        int i22 = (127 - i9) << 1;
        int i23 = (127 - i10) << 1;
        int[] iArrD = d(i20);
        D = !G[i20];
        int i24 = i11 - i12;
        int i25 = i14 - i15;
        int i26 = i17 - i18;
        int i27 = i13 - i11;
        int i28 = i16 - i14;
        int i29 = i19 - i17;
        int i30 = ((i27 * i14) - (i28 * i11)) << 14;
        int i31 = ((i28 * i17) - (i29 * i14)) << 8;
        int i32 = ((i29 * i11) - (i27 * i17)) << 5;
        int i33 = ((i24 * i14) - (i25 * i11)) << 14;
        int i34 = ((i25 * i17) - (i26 * i14)) << 8;
        int i35 = ((i26 * i11) - (i24 * i17)) << 5;
        int i36 = ((i25 * i27) - (i24 * i28)) << 14;
        int i37 = ((i26 * i28) - (i25 * i29)) << 8;
        int i38 = ((i24 * i29) - (i26 * i27)) << 5;
        int i39 = 0;
        int i40 = 0;
        if (i3 != i2) {
            i39 = ((i6 - i5) << 16) / (i3 - i2);
            i40 = ((i22 - i21) << 16) / (i3 - i2);
        }
        int i41 = 0;
        int i42 = 0;
        if (i4 != i3) {
            i41 = ((i7 - i6) << 16) / (i4 - i3);
            i42 = ((i23 - i22) << 16) / (i4 - i3);
        }
        int i43 = 0;
        int i44 = 0;
        if (i4 != i2) {
            i43 = ((i5 - i7) << 16) / (i2 - i4);
            i44 = ((i21 - i23) << 16) / (i2 - i4);
        }
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i4 < i2) {
                    int i45 = i6 << 16;
                    int i46 = i45;
                    int i47 = i45;
                    int i48 = i22 << 16;
                    int i49 = i48;
                    int i50 = i48;
                    if (i3 < 0) {
                        i47 -= i39 * i3;
                        i46 -= i41 * i3;
                        i50 -= i40 * i3;
                        i49 -= i42 * i3;
                        i3 = 0;
                    }
                    int i51 = i7 << 16;
                    int i52 = i23 << 16;
                    if (i4 < 0) {
                        i51 -= i43 * i4;
                        i52 -= i44 * i4;
                        i4 = 0;
                    }
                    int i53 = i3 - t;
                    int i54 = i30 + (i32 * i53);
                    int i55 = i33 + (i35 * i53);
                    int i56 = i36 + (i38 * i53);
                    if ((i3 == i4 || i39 >= i41) && (i3 != i4 || i39 <= i43)) {
                        int i57 = i2 - i4;
                        int i58 = i4 - i3;
                        int i59 = x[i3];
                        while (true) {
                            i58--;
                            if (i58 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i59, i46 >> 16, i47 >> 16, i49, i50, i54, i55, i56, i31, i34, i37);
                            i47 += i39;
                            i46 += i41;
                            i50 += i40;
                            i49 += i42;
                            i59 += class_210.h;
                            i54 += i32;
                            i55 += i35;
                            i56 += i38;
                        }
                        while (true) {
                            i57--;
                            if (i57 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i59, i51 >> 16, i47 >> 16, i52, i50, i54, i55, i56, i31, i34, i37);
                            i47 += i39;
                            i51 += i43;
                            i50 += i40;
                            i52 += i44;
                            i59 += class_210.h;
                            i54 += i32;
                            i55 += i35;
                            i56 += i38;
                        }
                    } else {
                        int i60 = i2 - i4;
                        int i61 = i4 - i3;
                        int i62 = x[i3];
                        while (true) {
                            i61--;
                            if (i61 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i62, i47 >> 16, i46 >> 16, i50, i49, i54, i55, i56, i31, i34, i37);
                            i47 += i39;
                            i46 += i41;
                            i50 += i40;
                            i49 += i42;
                            i62 += class_210.h;
                            i54 += i32;
                            i55 += i35;
                            i56 += i38;
                        }
                        while (true) {
                            i60--;
                            if (i60 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i62, i47 >> 16, i51 >> 16, i50, i52, i54, i55, i56, i31, i34, i37);
                            i47 += i39;
                            i51 += i43;
                            i50 += i40;
                            i52 += i44;
                            i62 += class_210.h;
                            i54 += i32;
                            i55 += i35;
                            i56 += i38;
                        }
                    }
                } else {
                    int i63 = i6 << 16;
                    int i64 = i63;
                    int i65 = i63;
                    int i66 = i22 << 16;
                    int i67 = i66;
                    int i68 = i66;
                    if (i3 < 0) {
                        i65 -= i39 * i3;
                        i64 -= i41 * i3;
                        i68 -= i40 * i3;
                        i67 -= i42 * i3;
                        i3 = 0;
                    }
                    int i69 = i5 << 16;
                    int i70 = i21 << 16;
                    if (i2 < 0) {
                        i69 -= i43 * i2;
                        i70 -= i44 * i2;
                        i2 = 0;
                    }
                    int i71 = i3 - t;
                    int i72 = i30 + (i32 * i71);
                    int i73 = i33 + (i35 * i71);
                    int i74 = i36 + (i38 * i71);
                    if (i39 < i41) {
                        int i75 = i4 - i2;
                        int i76 = i2 - i3;
                        int i77 = x[i3];
                        while (true) {
                            i76--;
                            if (i76 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i77, i65 >> 16, i64 >> 16, i68, i67, i72, i73, i74, i31, i34, i37);
                            i65 += i39;
                            i64 += i41;
                            i68 += i40;
                            i67 += i42;
                            i77 += class_210.h;
                            i72 += i32;
                            i73 += i35;
                            i74 += i38;
                        }
                        while (true) {
                            i75--;
                            if (i75 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i77, i69 >> 16, i64 >> 16, i70, i67, i72, i73, i74, i31, i34, i37);
                            i69 += i43;
                            i64 += i41;
                            i70 += i44;
                            i67 += i42;
                            i77 += class_210.h;
                            i72 += i32;
                            i73 += i35;
                            i74 += i38;
                        }
                    } else {
                        int i78 = i4 - i2;
                        int i79 = i2 - i3;
                        int i80 = x[i3];
                        while (true) {
                            i79--;
                            if (i79 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i80, i64 >> 16, i65 >> 16, i67, i68, i72, i73, i74, i31, i34, i37);
                            i65 += i39;
                            i64 += i41;
                            i68 += i40;
                            i67 += i42;
                            i80 += class_210.h;
                            i72 += i32;
                            i73 += i35;
                            i74 += i38;
                        }
                        while (true) {
                            i78--;
                            if (i78 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i80, i64 >> 16, i69 >> 16, i67, i70, i72, i73, i74, i31, i34, i37);
                            i69 += i43;
                            i64 += i41;
                            i70 += i44;
                            i67 += i42;
                            i80 += class_210.h;
                            i72 += i32;
                            i73 += i35;
                            i74 += i38;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i2 < i3) {
                    int i81 = i7 << 16;
                    int i82 = i81;
                    int i83 = i81;
                    int i84 = i23 << 16;
                    int i85 = i84;
                    int i86 = i84;
                    if (i4 < 0) {
                        i83 -= i41 * i4;
                        i82 -= i43 * i4;
                        i86 -= i42 * i4;
                        i85 -= i44 * i4;
                        i4 = 0;
                    }
                    int i87 = i5 << 16;
                    int i88 = i21 << 16;
                    if (i2 < 0) {
                        i87 -= i39 * i2;
                        i88 -= i40 * i2;
                        i2 = 0;
                    }
                    int i89 = i4 - t;
                    int i90 = i30 + (i32 * i89);
                    int i91 = i33 + (i35 * i89);
                    int i92 = i36 + (i38 * i89);
                    if (i41 < i43) {
                        int i93 = i3 - i2;
                        int i94 = i2 - i4;
                        int i95 = x[i4];
                        while (true) {
                            i94--;
                            if (i94 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i95, i83 >> 16, i82 >> 16, i86, i85, i90, i91, i92, i31, i34, i37);
                            i83 += i41;
                            i82 += i43;
                            i86 += i42;
                            i85 += i44;
                            i95 += class_210.h;
                            i90 += i32;
                            i91 += i35;
                            i92 += i38;
                        }
                        while (true) {
                            i93--;
                            if (i93 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i95, i83 >> 16, i87 >> 16, i86, i88, i90, i91, i92, i31, i34, i37);
                            i83 += i41;
                            i87 += i39;
                            i86 += i42;
                            i88 += i40;
                            i95 += class_210.h;
                            i90 += i32;
                            i91 += i35;
                            i92 += i38;
                        }
                    } else {
                        int i96 = i3 - i2;
                        int i97 = i2 - i4;
                        int i98 = x[i4];
                        while (true) {
                            i97--;
                            if (i97 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i98, i82 >> 16, i83 >> 16, i85, i86, i90, i91, i92, i31, i34, i37);
                            i83 += i41;
                            i82 += i43;
                            i86 += i42;
                            i85 += i44;
                            i98 += class_210.h;
                            i90 += i32;
                            i91 += i35;
                            i92 += i38;
                        }
                        while (true) {
                            i96--;
                            if (i96 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i98, i87 >> 16, i83 >> 16, i88, i86, i90, i91, i92, i31, i34, i37);
                            i83 += i41;
                            i87 += i39;
                            i86 += i42;
                            i88 += i40;
                            i98 += class_210.h;
                            i90 += i32;
                            i91 += i35;
                            i92 += i38;
                        }
                    }
                } else {
                    int i99 = i7 << 16;
                    int i100 = i99;
                    int i101 = i99;
                    int i102 = i23 << 16;
                    int i103 = i102;
                    int i104 = i102;
                    if (i4 < 0) {
                        i101 -= i41 * i4;
                        i100 -= i43 * i4;
                        i104 -= i42 * i4;
                        i103 -= i44 * i4;
                        i4 = 0;
                    }
                    int i105 = i6 << 16;
                    int i106 = i22 << 16;
                    if (i3 < 0) {
                        i105 -= i39 * i3;
                        i106 -= i40 * i3;
                        i3 = 0;
                    }
                    int i107 = i4 - t;
                    int i108 = i30 + (i32 * i107);
                    int i109 = i33 + (i35 * i107);
                    int i110 = i36 + (i38 * i107);
                    if (i41 < i43) {
                        int i111 = i2 - i3;
                        int i112 = i3 - i4;
                        int i113 = x[i4];
                        while (true) {
                            i112--;
                            if (i112 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i113, i101 >> 16, i100 >> 16, i104, i103, i108, i109, i110, i31, i34, i37);
                            i101 += i41;
                            i100 += i43;
                            i104 += i42;
                            i103 += i44;
                            i113 += class_210.h;
                            i108 += i32;
                            i109 += i35;
                            i110 += i38;
                        }
                        while (true) {
                            i111--;
                            if (i111 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i113, i105 >> 16, i100 >> 16, i106, i103, i108, i109, i110, i31, i34, i37);
                            i105 += i39;
                            i100 += i43;
                            i106 += i40;
                            i103 += i44;
                            i113 += class_210.h;
                            i108 += i32;
                            i109 += i35;
                            i110 += i38;
                        }
                    } else {
                        int i114 = i2 - i3;
                        int i115 = i3 - i4;
                        int i116 = x[i4];
                        while (true) {
                            i115--;
                            if (i115 < 0) {
                                break;
                            }
                            b(class_210.g, iArrD, i116, i100 >> 16, i101 >> 16, i103, i104, i108, i109, i110, i31, i34, i37);
                            i101 += i41;
                            i100 += i43;
                            i104 += i42;
                            i103 += i44;
                            i116 += class_210.h;
                            i108 += i32;
                            i109 += i35;
                            i110 += i38;
                        }
                        while (true) {
                            i114--;
                            if (i114 < 0) {
                                return;
                            }
                            b(class_210.g, iArrD, i116, i100 >> 16, i105 >> 16, i103, i106, i108, i109, i110, i31, i34, i37);
                            i105 += i39;
                            i100 += i43;
                            i106 += i40;
                            i103 += i44;
                            i116 += class_210.h;
                            i108 += i32;
                            i109 += i35;
                            i110 += i38;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i3 < i4) {
                int i117 = i5 << 16;
                int i118 = i117;
                int i119 = i117;
                int i120 = i21 << 16;
                int i121 = i120;
                int i122 = i120;
                if (i2 < 0) {
                    i119 -= i43 * i2;
                    i118 -= i39 * i2;
                    i122 -= i44 * i2;
                    i121 -= i40 * i2;
                    i2 = 0;
                }
                int i123 = i6 << 16;
                int i124 = i22 << 16;
                if (i3 < 0) {
                    i123 -= i41 * i3;
                    i124 -= i42 * i3;
                    i3 = 0;
                }
                int i125 = i2 - t;
                int i126 = i30 + (i32 * i125);
                int i127 = i33 + (i35 * i125);
                int i128 = i36 + (i38 * i125);
                if ((i2 == i3 || i43 >= i39) && (i2 != i3 || i43 <= i41)) {
                    int i129 = i4 - i3;
                    int i130 = i3 - i2;
                    int i131 = x[i2];
                    while (true) {
                        i130--;
                        if (i130 < 0) {
                            break;
                        }
                        b(class_210.g, iArrD, i131, i118 >> 16, i119 >> 16, i121, i122, i126, i127, i128, i31, i34, i37);
                        i119 += i43;
                        i118 += i39;
                        i122 += i44;
                        i121 += i40;
                        i131 += class_210.h;
                        i126 += i32;
                        i127 += i35;
                        i128 += i38;
                    }
                    while (true) {
                        i129--;
                        if (i129 < 0) {
                            return;
                        }
                        b(class_210.g, iArrD, i131, i123 >> 16, i119 >> 16, i124, i122, i126, i127, i128, i31, i34, i37);
                        i119 += i43;
                        i123 += i41;
                        i122 += i44;
                        i124 += i42;
                        i131 += class_210.h;
                        i126 += i32;
                        i127 += i35;
                        i128 += i38;
                    }
                } else {
                    int i132 = i4 - i3;
                    int i133 = i3 - i2;
                    int i134 = x[i2];
                    while (true) {
                        i133--;
                        if (i133 < 0) {
                            break;
                        }
                        b(class_210.g, iArrD, i134, i119 >> 16, i118 >> 16, i122, i121, i126, i127, i128, i31, i34, i37);
                        i119 += i43;
                        i118 += i39;
                        i122 += i44;
                        i121 += i40;
                        i134 += class_210.h;
                        i126 += i32;
                        i127 += i35;
                        i128 += i38;
                    }
                    while (true) {
                        i132--;
                        if (i132 < 0) {
                            return;
                        }
                        b(class_210.g, iArrD, i134, i119 >> 16, i123 >> 16, i122, i124, i126, i127, i128, i31, i34, i37);
                        i119 += i43;
                        i123 += i41;
                        i122 += i44;
                        i124 += i42;
                        i134 += class_210.h;
                        i126 += i32;
                        i127 += i35;
                        i128 += i38;
                    }
                }
            } else {
                int i135 = i5 << 16;
                int i136 = i135;
                int i137 = i135;
                int i138 = i21 << 16;
                int i139 = i138;
                int i140 = i138;
                if (i2 < 0) {
                    i137 -= i43 * i2;
                    i136 -= i39 * i2;
                    i140 -= i44 * i2;
                    i139 -= i40 * i2;
                    i2 = 0;
                }
                int i141 = i7 << 16;
                int i142 = i23 << 16;
                if (i4 < 0) {
                    i141 -= i41 * i4;
                    i142 -= i42 * i4;
                    i4 = 0;
                }
                int i143 = i2 - t;
                int i144 = i30 + (i32 * i143);
                int i145 = i33 + (i35 * i143);
                int i146 = i36 + (i38 * i143);
                if ((i2 == i4 || i43 >= i39) && (i2 != i4 || i41 <= i39)) {
                    int i147 = i3 - i4;
                    int i148 = i4 - i2;
                    int i149 = x[i2];
                    while (true) {
                        i148--;
                        if (i148 < 0) {
                            break;
                        }
                        b(class_210.g, iArrD, i149, i136 >> 16, i137 >> 16, i139, i140, i144, i145, i146, i31, i34, i37);
                        i137 += i43;
                        i136 += i39;
                        i140 += i44;
                        i139 += i40;
                        i149 += class_210.h;
                        i144 += i32;
                        i145 += i35;
                        i146 += i38;
                    }
                    while (true) {
                        i147--;
                        if (i147 < 0) {
                            return;
                        }
                        b(class_210.g, iArrD, i149, i136 >> 16, i141 >> 16, i139, i142, i144, i145, i146, i31, i34, i37);
                        i141 += i41;
                        i136 += i39;
                        i142 += i42;
                        i139 += i40;
                        i149 += class_210.h;
                        i144 += i32;
                        i145 += i35;
                        i146 += i38;
                    }
                } else {
                    int i150 = i3 - i4;
                    int i151 = i4 - i2;
                    int i152 = x[i2];
                    while (true) {
                        i151--;
                        if (i151 < 0) {
                            break;
                        }
                        b(class_210.g, iArrD, i152, i137 >> 16, i136 >> 16, i140, i139, i144, i145, i146, i31, i34, i37);
                        i137 += i43;
                        i136 += i39;
                        i140 += i44;
                        i139 += i40;
                        i152 += class_210.h;
                        i144 += i32;
                        i145 += i35;
                        i146 += i38;
                    }
                    while (true) {
                        i150--;
                        if (i150 < 0) {
                            return;
                        }
                        b(class_210.g, iArrD, i152, i141 >> 16, i136 >> 16, i142, i139, i144, i145, i146, i31, i34, i37);
                        i141 += i41;
                        i136 += i39;
                        i142 += i42;
                        i139 += i40;
                        i152 += class_210.h;
                        i144 += i32;
                        i145 += i35;
                        i146 += i38;
                    }
                }
            }
        }
    }

    private static void b(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ag() && q && i2 <= d()) {
            i2 += 3064;
        }
        int i13 = 0;
        int i14 = 0;
        if (i3 >= i4) {
            return;
        }
        int i15 = (i6 - i5) / (i4 - i3);
        if (o) {
            if (i4 > class_210.n) {
                i4 = class_210.n;
            }
            if (i3 < 0) {
                i5 -= i3 * i15;
                i3 = 0;
            }
        }
        if (i3 >= i4) {
            return;
        }
        int i16 = (i4 - i3) >> 3;
        int i17 = i2 + i3;
        if (n || e.a()) {
            int i18 = 0;
            int i19 = 0;
            int i20 = i3 - s;
            int i21 = i7 + ((i10 >> 3) * i20);
            int i22 = i8 + ((i11 >> 3) * i20);
            int i23 = i9 + ((i12 >> 3) * i20);
            int i24 = i23 >> 12;
            if (i24 != 0) {
                i13 = i21 / i24;
                i14 = i22 / i24;
                if (i13 < 0) {
                    i13 = 0;
                } else if (i13 > 4032) {
                    i13 = 4032;
                }
            }
            int i25 = i21 + i10;
            int i26 = i22 + i11;
            int i27 = i23 + i12;
            int i28 = i27 >> 12;
            if (i28 != 0) {
                i18 = i25 / i28;
                i19 = i26 / i28;
                if (i18 < 7) {
                    i18 = 7;
                } else if (i18 > 4032) {
                    i18 = 4032;
                }
            }
            int i29 = (i18 - i13) >> 3;
            int i30 = (i19 - i14) >> 3;
            if (D) {
                while (true) {
                    int i31 = i16;
                    i16--;
                    if (i31 <= 0) {
                        break;
                    }
                    int i32 = iArr2[(i14 & 4032) + (i13 >> 6)];
                    int i33 = i5 >> 16;
                    int i34 = i17;
                    int i35 = i17 + 1;
                    class_210.a(iArr, i34, ((((i32 & 16711935) * i33) & (-16711936)) + (((i32 & bk.ao) * i33) & bk.aS)) >> 8, ((((i32 & 16711935) * i33) & (-16711936)) + (((i32 & bk.ao) * i33) & bk.aS)) >> 8, 255);
                    int i36 = i13 + i29;
                    int i37 = i14 + i30;
                    int i38 = i5 + i15;
                    int i39 = iArr2[(i37 & 4032) + (i36 >> 6)];
                    int i40 = i38 >> 16;
                    int i41 = i35 + 1;
                    class_210.a(iArr, i35, ((((i39 & 16711935) * i40) & (-16711936)) + (((i39 & bk.ao) * i40) & bk.aS)) >> 8, ((((i39 & 16711935) * i40) & (-16711936)) + (((i39 & bk.ao) * i40) & bk.aS)) >> 8, 255);
                    int i42 = i36 + i29;
                    int i43 = i37 + i30;
                    int i44 = i38 + i15;
                    int i45 = iArr2[(i43 & 4032) + (i42 >> 6)];
                    int i46 = i44 >> 16;
                    int i47 = i41 + 1;
                    class_210.a(iArr, i41, ((((i45 & 16711935) * i46) & (-16711936)) + (((i45 & bk.ao) * i46) & bk.aS)) >> 8, ((((i45 & 16711935) * i46) & (-16711936)) + (((i45 & bk.ao) * i46) & bk.aS)) >> 8, 255);
                    int i48 = i42 + i29;
                    int i49 = i43 + i30;
                    int i50 = i44 + i15;
                    int i51 = iArr2[(i49 & 4032) + (i48 >> 6)];
                    int i52 = i50 >> 16;
                    int i53 = i47 + 1;
                    class_210.a(iArr, i47, ((((i51 & 16711935) * i52) & (-16711936)) + (((i51 & bk.ao) * i52) & bk.aS)) >> 8, ((((i51 & 16711935) * i52) & (-16711936)) + (((i51 & bk.ao) * i52) & bk.aS)) >> 8, 255);
                    int i54 = i48 + i29;
                    int i55 = i49 + i30;
                    int i56 = i50 + i15;
                    int i57 = iArr2[(i55 & 4032) + (i54 >> 6)];
                    int i58 = i56 >> 16;
                    int i59 = i53 + 1;
                    class_210.a(iArr, i53, ((((i57 & 16711935) * i58) & (-16711936)) + (((i57 & bk.ao) * i58) & bk.aS)) >> 8, ((((i57 & 16711935) * i58) & (-16711936)) + (((i57 & bk.ao) * i58) & bk.aS)) >> 8, 255);
                    int i60 = i54 + i29;
                    int i61 = i55 + i30;
                    int i62 = i56 + i15;
                    int i63 = iArr2[(i61 & 4032) + (i60 >> 6)];
                    int i64 = i62 >> 16;
                    int i65 = i59 + 1;
                    class_210.a(iArr, i59, ((((i63 & 16711935) * i64) & (-16711936)) + (((i63 & bk.ao) * i64) & bk.aS)) >> 8, ((((i63 & 16711935) * i64) & (-16711936)) + (((i63 & bk.ao) * i64) & bk.aS)) >> 8, 255);
                    int i66 = i60 + i29;
                    int i67 = i61 + i30;
                    int i68 = i62 + i15;
                    int i69 = iArr2[(i67 & 4032) + (i66 >> 6)];
                    int i70 = i68 >> 16;
                    int i71 = i65 + 1;
                    class_210.a(iArr, i65, ((((i69 & 16711935) * i70) & (-16711936)) + (((i69 & bk.ao) * i70) & bk.aS)) >> 8, ((((i69 & 16711935) * i70) & (-16711936)) + (((i69 & bk.ao) * i70) & bk.aS)) >> 8, 255);
                    int i72 = i66 + i29;
                    int i73 = i67 + i30;
                    int i74 = i68 + i15;
                    int i75 = iArr2[(i73 & 4032) + (i72 >> 6)];
                    int i76 = i74 >> 16;
                    i17 = i71 + 1;
                    class_210.a(iArr, i71, ((((i75 & 16711935) * i76) & (-16711936)) + (((i75 & bk.ao) * i76) & bk.aS)) >> 8, ((((i75 & 16711935) * i76) & (-16711936)) + (((i75 & bk.ao) * i76) & bk.aS)) >> 8, 255);
                    i13 = i72 + i29;
                    i14 = i73 + i30;
                    int i77 = i74 + i15;
                    i25 += i10;
                    i26 += i11;
                    i27 += i12;
                    int i78 = i27 >> 12;
                    if (i78 != 0) {
                        i18 = i25 / i78;
                        i19 = i26 / i78;
                        if (i18 < 7) {
                            i18 = 7;
                        } else if (i18 > 4032) {
                            i18 = 4032;
                        }
                    }
                    i29 = (i18 - i13) >> 3;
                    i30 = (i19 - i14) >> 3;
                    i5 = i77 + i15;
                }
                int i79 = (i4 - i3) & 7;
                while (true) {
                    int i80 = i79;
                    i79--;
                    if (i80 <= 0) {
                        return;
                    }
                    int i81 = iArr2[(i14 & 4032) + (i13 >> 6)];
                    int i82 = i5 >> 16;
                    int i83 = i17;
                    i17++;
                    class_210.a(iArr, i83, ((((i81 & 16711935) * i82) & (-16711936)) + (((i81 & bk.ao) * i82) & bk.aS)) >> 8, ((((i81 & 16711935) * i82) & (-16711936)) + (((i81 & bk.ao) * i82) & bk.aS)) >> 8, 255);
                    i13 += i29;
                    i14 += i30;
                    i5 += i15;
                }
            } else {
                while (true) {
                    int i84 = i16;
                    i16--;
                    if (i84 <= 0) {
                        break;
                    }
                    int i85 = iArr2[(i14 & 4032) + (i13 >> 6)];
                    if (i85 != 0) {
                        int i86 = i5 >> 16;
                        class_210.a(iArr, i17, ((((i85 & 16711935) * i86) & (-16711936)) + (((i85 & bk.ao) * i86) & bk.aS)) >> 8, ((((i85 & 16711935) * i86) & (-16711936)) + (((i85 & bk.ao) * i86) & bk.aS)) >> 8, 255);
                    }
                    int i87 = i17 + 1;
                    int i88 = i13 + i29;
                    int i89 = i14 + i30;
                    int i90 = i5 + i15;
                    int i91 = iArr2[(i89 & 4032) + (i88 >> 6)];
                    if (i91 != 0) {
                        int i92 = i90 >> 16;
                        class_210.a(iArr, i87, ((((i91 & 16711935) * i92) & (-16711936)) + (((i91 & bk.ao) * i92) & bk.aS)) >> 8, ((((i91 & 16711935) * i92) & (-16711936)) + (((i91 & bk.ao) * i92) & bk.aS)) >> 8, 255);
                    }
                    int i93 = i87 + 1;
                    int i94 = i88 + i29;
                    int i95 = i89 + i30;
                    int i96 = i90 + i15;
                    int i97 = iArr2[(i95 & 4032) + (i94 >> 6)];
                    if (i97 != 0) {
                        int i98 = i96 >> 16;
                        class_210.a(iArr, i93, ((((i97 & 16711935) * i98) & (-16711936)) + (((i97 & bk.ao) * i98) & bk.aS)) >> 8, ((((i97 & 16711935) * i98) & (-16711936)) + (((i97 & bk.ao) * i98) & bk.aS)) >> 8, 255);
                    }
                    int i99 = i93 + 1;
                    int i100 = i94 + i29;
                    int i101 = i95 + i30;
                    int i102 = i96 + i15;
                    int i103 = iArr2[(i101 & 4032) + (i100 >> 6)];
                    if (i103 != 0) {
                        int i104 = i102 >> 16;
                        class_210.a(iArr, i99, ((((i103 & 16711935) * i104) & (-16711936)) + (((i103 & bk.ao) * i104) & bk.aS)) >> 8, ((((i103 & 16711935) * i104) & (-16711936)) + (((i103 & bk.ao) * i104) & bk.aS)) >> 8, 255);
                    }
                    int i105 = i99 + 1;
                    int i106 = i100 + i29;
                    int i107 = i101 + i30;
                    int i108 = i102 + i15;
                    int i109 = iArr2[(i107 & 4032) + (i106 >> 6)];
                    if (i109 != 0) {
                        int i110 = i108 >> 16;
                        class_210.a(iArr, i105, ((((i109 & 16711935) * i110) & (-16711936)) + (((i109 & bk.ao) * i110) & bk.aS)) >> 8, ((((i109 & 16711935) * i110) & (-16711936)) + (((i109 & bk.ao) * i110) & bk.aS)) >> 8, 255);
                    }
                    int i111 = i105 + 1;
                    int i112 = i106 + i29;
                    int i113 = i107 + i30;
                    int i114 = i108 + i15;
                    int i115 = iArr2[(i113 & 4032) + (i112 >> 6)];
                    if (i115 != 0) {
                        int i116 = i114 >> 16;
                        class_210.a(iArr, i111, ((((i115 & 16711935) * i116) & (-16711936)) + (((i115 & bk.ao) * i116) & bk.aS)) >> 8, ((((i115 & 16711935) * i116) & (-16711936)) + (((i115 & bk.ao) * i116) & bk.aS)) >> 8, 255);
                    }
                    int i117 = i111 + 1;
                    int i118 = i112 + i29;
                    int i119 = i113 + i30;
                    int i120 = i114 + i15;
                    int i121 = iArr2[(i119 & 4032) + (i118 >> 6)];
                    if (i121 != 0) {
                        int i122 = i120 >> 16;
                        class_210.a(iArr, i117, ((((i121 & 16711935) * i122) & (-16711936)) + (((i121 & bk.ao) * i122) & bk.aS)) >> 8, ((((i121 & 16711935) * i122) & (-16711936)) + (((i121 & bk.ao) * i122) & bk.aS)) >> 8, 255);
                    }
                    int i123 = i117 + 1;
                    int i124 = i118 + i29;
                    int i125 = i119 + i30;
                    int i126 = i120 + i15;
                    int i127 = iArr2[(i125 & 4032) + (i124 >> 6)];
                    if (i127 != 0) {
                        int i128 = i126 >> 16;
                        class_210.a(iArr, i123, ((((i127 & 16711935) * i128) & (-16711936)) + (((i127 & bk.ao) * i128) & bk.aS)) >> 8, ((((i127 & 16711935) * i128) & (-16711936)) + (((i127 & bk.ao) * i128) & bk.aS)) >> 8, 255);
                    }
                    i17 = i123 + 1;
                    i13 = i124 + i29;
                    i14 = i125 + i30;
                    int i129 = i126 + i15;
                    i25 += i10;
                    i26 += i11;
                    i27 += i12;
                    int i130 = i27 >> 12;
                    if (i130 != 0) {
                        i18 = i25 / i130;
                        i19 = i26 / i130;
                        if (i18 < 7) {
                            i18 = 7;
                        } else if (i18 > 4032) {
                            i18 = 4032;
                        }
                    }
                    i29 = (i18 - i13) >> 3;
                    i30 = (i19 - i14) >> 3;
                    i5 = i129 + i15;
                }
                int i131 = (i4 - i3) & 7;
                while (true) {
                    int i132 = i131;
                    i131--;
                    if (i132 <= 0) {
                        return;
                    }
                    int i133 = iArr2[(i14 & 4032) + (i13 >> 6)];
                    if (i133 != 0) {
                        int i134 = i5 >> 16;
                        class_210.a(iArr, i17, ((((i133 & 16711935) * i134) & (-16711936)) + (((i133 & bk.ao) * i134) & bk.aS)) >> 8, ((((i133 & 16711935) * i134) & (-16711936)) + (((i133 & bk.ao) * i134) & bk.aS)) >> 8, 255);
                    }
                    i17++;
                    i13 += i29;
                    i14 += i30;
                    i5 += i15;
                }
            }
        } else {
            int i135 = 0;
            int i136 = 0;
            int i137 = i3 - s;
            int i138 = i7 + ((i10 >> 3) * i137);
            int i139 = i8 + ((i11 >> 3) * i137);
            int i140 = i9 + ((i12 >> 3) * i137);
            int i141 = i140 >> 14;
            if (i141 != 0) {
                i13 = i138 / i141;
                i14 = i139 / i141;
                if (i13 < 0) {
                    i13 = 0;
                } else if (i13 > 16256) {
                    i13 = 16256;
                }
            }
            int i142 = i138 + i10;
            int i143 = i139 + i11;
            int i144 = i140 + i12;
            int i145 = i144 >> 14;
            if (i145 != 0) {
                i135 = i142 / i145;
                i136 = i143 / i145;
                if (i135 < 7) {
                    i135 = 7;
                } else if (i135 > 16256) {
                    i135 = 16256;
                }
            }
            int i146 = (i135 - i13) >> 3;
            int i147 = (i136 - i14) >> 3;
            if (D) {
                while (true) {
                    int i148 = i16;
                    i16--;
                    if (i148 <= 0) {
                        break;
                    }
                    int i149 = iArr2[(i14 & 16256) + (i13 >> 7)];
                    int i150 = i5 >> 16;
                    int i151 = i17;
                    int i152 = i17 + 1;
                    iArr[i151] = ((((i149 & 16711935) * i150) & (-16711936)) + (((i149 & bk.ao) * i150) & bk.aS)) >> 8;
                    int i153 = i13 + i146;
                    int i154 = i14 + i147;
                    int i155 = i5 + i15;
                    int i156 = iArr2[(i154 & 16256) + (i153 >> 7)];
                    int i157 = i155 >> 16;
                    int i158 = i152 + 1;
                    iArr[i152] = ((((i156 & 16711935) * i157) & (-16711936)) + (((i156 & bk.ao) * i157) & bk.aS)) >> 8;
                    int i159 = i153 + i146;
                    int i160 = i154 + i147;
                    int i161 = i155 + i15;
                    int i162 = iArr2[(i160 & 16256) + (i159 >> 7)];
                    int i163 = i161 >> 16;
                    int i164 = i158 + 1;
                    iArr[i158] = ((((i162 & 16711935) * i163) & (-16711936)) + (((i162 & bk.ao) * i163) & bk.aS)) >> 8;
                    int i165 = i159 + i146;
                    int i166 = i160 + i147;
                    int i167 = i161 + i15;
                    int i168 = iArr2[(i166 & 16256) + (i165 >> 7)];
                    int i169 = i167 >> 16;
                    int i170 = i164 + 1;
                    iArr[i164] = ((((i168 & 16711935) * i169) & (-16711936)) + (((i168 & bk.ao) * i169) & bk.aS)) >> 8;
                    int i171 = i165 + i146;
                    int i172 = i166 + i147;
                    int i173 = i167 + i15;
                    int i174 = iArr2[(i172 & 16256) + (i171 >> 7)];
                    int i175 = i173 >> 16;
                    int i176 = i170 + 1;
                    iArr[i170] = ((((i174 & 16711935) * i175) & (-16711936)) + (((i174 & bk.ao) * i175) & bk.aS)) >> 8;
                    int i177 = i171 + i146;
                    int i178 = i172 + i147;
                    int i179 = i173 + i15;
                    int i180 = iArr2[(i178 & 16256) + (i177 >> 7)];
                    int i181 = i179 >> 16;
                    int i182 = i176 + 1;
                    iArr[i176] = ((((i180 & 16711935) * i181) & (-16711936)) + (((i180 & bk.ao) * i181) & bk.aS)) >> 8;
                    int i183 = i177 + i146;
                    int i184 = i178 + i147;
                    int i185 = i179 + i15;
                    int i186 = iArr2[(i184 & 16256) + (i183 >> 7)];
                    int i187 = i185 >> 16;
                    int i188 = i182 + 1;
                    iArr[i182] = ((((i186 & 16711935) * i187) & (-16711936)) + (((i186 & bk.ao) * i187) & bk.aS)) >> 8;
                    int i189 = i183 + i146;
                    int i190 = i184 + i147;
                    int i191 = i185 + i15;
                    int i192 = iArr2[(i190 & 16256) + (i189 >> 7)];
                    int i193 = i191 >> 16;
                    i17 = i188 + 1;
                    iArr[i188] = ((((i192 & 16711935) * i193) & (-16711936)) + (((i192 & bk.ao) * i193) & bk.aS)) >> 8;
                    i13 = i189 + i146;
                    i14 = i190 + i147;
                    int i194 = i191 + i15;
                    i142 += i10;
                    i143 += i11;
                    i144 += i12;
                    int i195 = i144 >> 14;
                    if (i195 != 0) {
                        i135 = i142 / i195;
                        i136 = i143 / i195;
                        if (i135 < 7) {
                            i135 = 7;
                        } else if (i135 > 16256) {
                            i135 = 16256;
                        }
                    }
                    i146 = (i135 - i13) >> 3;
                    i147 = (i136 - i14) >> 3;
                    i5 = i194 + i15;
                }
                int i196 = (i4 - i3) & 7;
                while (true) {
                    int i197 = i196;
                    i196--;
                    if (i197 <= 0) {
                        return;
                    }
                    int i198 = iArr2[(i14 & 16256) + (i13 >> 7)];
                    int i199 = i5 >> 16;
                    int i200 = i17;
                    i17++;
                    iArr[i200] = ((((i198 & 16711935) * i199) & (-16711936)) + (((i198 & bk.ao) * i199) & bk.aS)) >> 8;
                    i13 += i146;
                    i14 += i147;
                    i5 += i15;
                }
            } else {
                while (true) {
                    int i201 = i16;
                    i16--;
                    if (i201 <= 0) {
                        break;
                    }
                    int i202 = iArr2[(i14 & 16256) + (i13 >> 7)];
                    if (i202 != 0) {
                        int i203 = i5 >> 16;
                        iArr[i17] = ((((i202 & 16711935) * i203) & (-16711936)) + (((i202 & bk.ao) * i203) & bk.aS)) >> 8;
                    }
                    int i204 = i17 + 1;
                    int i205 = i13 + i146;
                    int i206 = i14 + i147;
                    int i207 = i5 + i15;
                    int i208 = iArr2[(i206 & 16256) + (i205 >> 7)];
                    if (i208 != 0) {
                        int i209 = i207 >> 16;
                        iArr[i204] = ((((i208 & 16711935) * i209) & (-16711936)) + (((i208 & bk.ao) * i209) & bk.aS)) >> 8;
                    }
                    int i210 = i204 + 1;
                    int i211 = i205 + i146;
                    int i212 = i206 + i147;
                    int i213 = i207 + i15;
                    int i214 = iArr2[(i212 & 16256) + (i211 >> 7)];
                    if (i214 != 0) {
                        int i215 = i213 >> 16;
                        iArr[i210] = ((((i214 & 16711935) * i215) & (-16711936)) + (((i214 & bk.ao) * i215) & bk.aS)) >> 8;
                    }
                    int i216 = i210 + 1;
                    int i217 = i211 + i146;
                    int i218 = i212 + i147;
                    int i219 = i213 + i15;
                    int i220 = iArr2[(i218 & 16256) + (i217 >> 7)];
                    if (i220 != 0) {
                        int i221 = i219 >> 16;
                        iArr[i216] = ((((i220 & 16711935) * i221) & (-16711936)) + (((i220 & bk.ao) * i221) & bk.aS)) >> 8;
                    }
                    int i222 = i216 + 1;
                    int i223 = i217 + i146;
                    int i224 = i218 + i147;
                    int i225 = i219 + i15;
                    int i226 = iArr2[(i224 & 16256) + (i223 >> 7)];
                    if (i226 != 0) {
                        int i227 = i225 >> 16;
                        iArr[i222] = ((((i226 & 16711935) * i227) & (-16711936)) + (((i226 & bk.ao) * i227) & bk.aS)) >> 8;
                    }
                    int i228 = i222 + 1;
                    int i229 = i223 + i146;
                    int i230 = i224 + i147;
                    int i231 = i225 + i15;
                    int i232 = iArr2[(i230 & 16256) + (i229 >> 7)];
                    if (i232 != 0) {
                        int i233 = i231 >> 16;
                        iArr[i228] = ((((i232 & 16711935) * i233) & (-16711936)) + (((i232 & bk.ao) * i233) & bk.aS)) >> 8;
                    }
                    int i234 = i228 + 1;
                    int i235 = i229 + i146;
                    int i236 = i230 + i147;
                    int i237 = i231 + i15;
                    int i238 = iArr2[(i236 & 16256) + (i235 >> 7)];
                    if (i238 != 0) {
                        int i239 = i237 >> 16;
                        iArr[i234] = ((((i238 & 16711935) * i239) & (-16711936)) + (((i238 & bk.ao) * i239) & bk.aS)) >> 8;
                    }
                    int i240 = i234 + 1;
                    int i241 = i235 + i146;
                    int i242 = i236 + i147;
                    int i243 = i237 + i15;
                    int i244 = iArr2[(i242 & 16256) + (i241 >> 7)];
                    if (i244 != 0) {
                        int i245 = i243 >> 16;
                        iArr[i240] = ((((i244 & 16711935) * i245) & (-16711936)) + (((i244 & bk.ao) * i245) & bk.aS)) >> 8;
                    }
                    i17 = i240 + 1;
                    i13 = i241 + i146;
                    i14 = i242 + i147;
                    int i246 = i243 + i15;
                    i142 += i10;
                    i143 += i11;
                    i144 += i12;
                    int i247 = i144 >> 14;
                    if (i247 != 0) {
                        i135 = i142 / i247;
                        i136 = i143 / i247;
                        if (i135 < 7) {
                            i135 = 7;
                        } else if (i135 > 16256) {
                            i135 = 16256;
                        }
                    }
                    i146 = (i135 - i13) >> 3;
                    i147 = (i136 - i14) >> 3;
                    i5 = i246 + i15;
                }
                int i248 = (i4 - i3) & 7;
                while (true) {
                    int i249 = i248;
                    i248--;
                    if (i249 <= 0) {
                        return;
                    }
                    int i250 = iArr2[(i14 & 16256) + (i13 >> 7)];
                    if (i250 != 0) {
                        int i251 = i5 >> 16;
                        iArr[i17] = ((((i250 & 16711935) * i251) & (-16711936)) + (((i250 & bk.ao) * i251) & bk.aS)) >> 8;
                    }
                    i17++;
                    i13 += i146;
                    i14 += i147;
                    i5 += i15;
                }
            }
        }
    }

    public static void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (e.a() && !h) {
            return;
        }
        int i21 = 0;
        if (i3 != i2) {
            i21 = ((i6 - i5) << 16) / (i3 - i2);
        }
        int i22 = 0;
        if (i4 != i3) {
            i22 = ((i7 - i6) << 16) / (i4 - i3);
        }
        int i23 = 0;
        if (i4 != i2) {
            i23 = ((i5 - i7) << 16) / (i2 - i4);
        }
        if (i2 > i3 || i2 > i4) {
            if (i3 <= i4) {
                if (i3 >= class_210.k) {
                    return;
                }
                if (i4 > class_210.k) {
                    i4 = class_210.k;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i4 < i2) {
                    int i24 = i6 << 16;
                    int i25 = i24;
                    int i26 = i24;
                    if (i3 < 0) {
                        i26 -= i21 * i3;
                        i25 -= i22 * i3;
                        i3 = 0;
                    }
                    int i27 = i7 << 16;
                    if (i4 < 0) {
                        i27 -= i23 * i4;
                        i4 = 0;
                    }
                    if ((i3 == i4 || i21 >= i22) && (i3 != i4 || i21 <= i23)) {
                        int i28 = i2 - i4;
                        int i29 = i4 - i3;
                        int i30 = x[i3];
                        while (true) {
                            i15 = i30;
                            i29--;
                            if (i29 < 0) {
                                break;
                            }
                            a(class_210.g, i15, i8, i25 >> 16, i26 >> 16);
                            i26 += i21;
                            i25 += i22;
                            i30 = i15 + class_210.h;
                        }
                        while (true) {
                            i28--;
                            if (i28 < 0) {
                                return;
                            }
                            a(class_210.g, i15, i8, i27 >> 16, i26 >> 16);
                            i26 += i21;
                            i27 += i23;
                            i15 += class_210.h;
                        }
                    } else {
                        int i31 = i2 - i4;
                        int i32 = i4 - i3;
                        int i33 = x[i3];
                        while (true) {
                            i16 = i33;
                            i32--;
                            if (i32 < 0) {
                                break;
                            }
                            a(class_210.g, i16, i8, i26 >> 16, i25 >> 16);
                            i26 += i21;
                            i25 += i22;
                            i33 = i16 + class_210.h;
                        }
                        while (true) {
                            i31--;
                            if (i31 < 0) {
                                return;
                            }
                            a(class_210.g, i16, i8, i26 >> 16, i27 >> 16);
                            i26 += i21;
                            i27 += i23;
                            i16 += class_210.h;
                        }
                    }
                } else {
                    int i34 = i6 << 16;
                    int i35 = i34;
                    int i36 = i34;
                    if (i3 < 0) {
                        i36 -= i21 * i3;
                        i35 -= i22 * i3;
                        i3 = 0;
                    }
                    int i37 = i5 << 16;
                    if (i2 < 0) {
                        i37 -= i23 * i2;
                        i2 = 0;
                    }
                    if (i21 < i22) {
                        int i38 = i4 - i2;
                        int i39 = i2 - i3;
                        int i40 = x[i3];
                        while (true) {
                            i14 = i40;
                            i39--;
                            if (i39 < 0) {
                                break;
                            }
                            a(class_210.g, i14, i8, i36 >> 16, i35 >> 16);
                            i36 += i21;
                            i35 += i22;
                            i40 = i14 + class_210.h;
                        }
                        while (true) {
                            i38--;
                            if (i38 < 0) {
                                return;
                            }
                            a(class_210.g, i14, i8, i37 >> 16, i35 >> 16);
                            i37 += i23;
                            i35 += i22;
                            i14 += class_210.h;
                        }
                    } else {
                        int i41 = i4 - i2;
                        int i42 = i2 - i3;
                        int i43 = x[i3];
                        while (true) {
                            i13 = i43;
                            i42--;
                            if (i42 < 0) {
                                break;
                            }
                            a(class_210.g, i13, i8, i35 >> 16, i36 >> 16);
                            i36 += i21;
                            i35 += i22;
                            i43 = i13 + class_210.h;
                        }
                        while (true) {
                            i41--;
                            if (i41 < 0) {
                                return;
                            }
                            a(class_210.g, i13, i8, i35 >> 16, i37 >> 16);
                            i37 += i23;
                            i35 += i22;
                            i13 += class_210.h;
                        }
                    }
                }
            } else {
                if (i4 >= class_210.k) {
                    return;
                }
                if (i2 > class_210.k) {
                    i2 = class_210.k;
                }
                if (i3 > class_210.k) {
                    i3 = class_210.k;
                }
                if (i2 < i3) {
                    int i44 = i7 << 16;
                    int i45 = i44;
                    int i46 = i44;
                    if (i4 < 0) {
                        i46 -= i22 * i4;
                        i45 -= i23 * i4;
                        i4 = 0;
                    }
                    int i47 = i5 << 16;
                    if (i2 < 0) {
                        i47 -= i21 * i2;
                        i2 = 0;
                    }
                    if (i22 < i23) {
                        int i48 = i3 - i2;
                        int i49 = i2 - i4;
                        int i50 = x[i4];
                        while (true) {
                            i12 = i50;
                            i49--;
                            if (i49 < 0) {
                                break;
                            }
                            a(class_210.g, i12, i8, i46 >> 16, i45 >> 16);
                            i46 += i22;
                            i45 += i23;
                            i50 = i12 + class_210.h;
                        }
                        while (true) {
                            i48--;
                            if (i48 < 0) {
                                return;
                            }
                            a(class_210.g, i12, i8, i46 >> 16, i47 >> 16);
                            i46 += i22;
                            i47 += i21;
                            i12 += class_210.h;
                        }
                    } else {
                        int i51 = i3 - i2;
                        int i52 = i2 - i4;
                        int i53 = x[i4];
                        while (true) {
                            i11 = i53;
                            i52--;
                            if (i52 < 0) {
                                break;
                            }
                            a(class_210.g, i11, i8, i45 >> 16, i46 >> 16);
                            i46 += i22;
                            i45 += i23;
                            i53 = i11 + class_210.h;
                        }
                        while (true) {
                            i51--;
                            if (i51 < 0) {
                                return;
                            }
                            a(class_210.g, i11, i8, i47 >> 16, i46 >> 16);
                            i46 += i22;
                            i47 += i21;
                            i11 += class_210.h;
                        }
                    }
                } else {
                    int i54 = i7 << 16;
                    int i55 = i54;
                    int i56 = i54;
                    if (i4 < 0) {
                        i56 -= i22 * i4;
                        i55 -= i23 * i4;
                        i4 = 0;
                    }
                    int i57 = i6 << 16;
                    if (i3 < 0) {
                        i57 -= i21 * i3;
                        i3 = 0;
                    }
                    if (i22 < i23) {
                        int i58 = i2 - i3;
                        int i59 = i3 - i4;
                        int i60 = x[i4];
                        while (true) {
                            i10 = i60;
                            i59--;
                            if (i59 < 0) {
                                break;
                            }
                            a(class_210.g, i10, i8, i56 >> 16, i55 >> 16);
                            i56 += i22;
                            i55 += i23;
                            i60 = i10 + class_210.h;
                        }
                        while (true) {
                            i58--;
                            if (i58 < 0) {
                                return;
                            }
                            a(class_210.g, i10, i8, i57 >> 16, i55 >> 16);
                            i57 += i21;
                            i55 += i23;
                            i10 += class_210.h;
                        }
                    } else {
                        int i61 = i2 - i3;
                        int i62 = i3 - i4;
                        int i63 = x[i4];
                        while (true) {
                            i9 = i63;
                            i62--;
                            if (i62 < 0) {
                                break;
                            }
                            a(class_210.g, i9, i8, i55 >> 16, i56 >> 16);
                            i56 += i22;
                            i55 += i23;
                            i63 = i9 + class_210.h;
                        }
                        while (true) {
                            i61--;
                            if (i61 < 0) {
                                return;
                            }
                            a(class_210.g, i9, i8, i55 >> 16, i57 >> 16);
                            i57 += i21;
                            i55 += i23;
                            i9 += class_210.h;
                        }
                    }
                }
            }
        } else {
            if (i2 >= class_210.k) {
                return;
            }
            if (i3 > class_210.k) {
                i3 = class_210.k;
            }
            if (i4 > class_210.k) {
                i4 = class_210.k;
            }
            if (i3 < i4) {
                int i64 = i5 << 16;
                int i65 = i64;
                int i66 = i64;
                if (i2 < 0) {
                    i66 -= i23 * i2;
                    i65 -= i21 * i2;
                    i2 = 0;
                }
                int i67 = i6 << 16;
                if (i3 < 0) {
                    i67 -= i22 * i3;
                    i3 = 0;
                }
                if ((i2 == i3 || i23 >= i21) && (i2 != i3 || i23 <= i22)) {
                    int i68 = i4 - i3;
                    int i69 = i3 - i2;
                    int i70 = x[i2];
                    while (true) {
                        i19 = i70;
                        i69--;
                        if (i69 < 0) {
                            break;
                        }
                        a(class_210.g, i19, i8, i65 >> 16, i66 >> 16);
                        i66 += i23;
                        i65 += i21;
                        i70 = i19 + class_210.h;
                    }
                    while (true) {
                        i68--;
                        if (i68 < 0) {
                            return;
                        }
                        a(class_210.g, i19, i8, i67 >> 16, i66 >> 16);
                        i66 += i23;
                        i67 += i22;
                        i19 += class_210.h;
                    }
                } else {
                    int i71 = i4 - i3;
                    int i72 = i3 - i2;
                    int i73 = x[i2];
                    while (true) {
                        i20 = i73;
                        i72--;
                        if (i72 < 0) {
                            break;
                        }
                        a(class_210.g, i20, i8, i66 >> 16, i65 >> 16);
                        i66 += i23;
                        i65 += i21;
                        i73 = i20 + class_210.h;
                    }
                    while (true) {
                        i71--;
                        if (i71 < 0) {
                            return;
                        }
                        a(class_210.g, i20, i8, i66 >> 16, i67 >> 16);
                        i66 += i23;
                        i67 += i22;
                        i20 += class_210.h;
                    }
                }
            } else {
                int i74 = i5 << 16;
                int i75 = i74;
                int i76 = i74;
                if (i2 < 0) {
                    i76 -= i23 * i2;
                    i75 -= i21 * i2;
                    i2 = 0;
                }
                int i77 = i7 << 16;
                if (i4 < 0) {
                    i77 -= i22 * i4;
                    i4 = 0;
                }
                if ((i2 == i4 || i23 >= i21) && (i2 != i4 || i22 <= i21)) {
                    int i78 = i3 - i4;
                    int i79 = i4 - i2;
                    int i80 = x[i2];
                    while (true) {
                        i17 = i80;
                        i79--;
                        if (i79 < 0) {
                            break;
                        }
                        a(class_210.g, i17, i8, i75 >> 16, i76 >> 16);
                        i76 += i23;
                        i75 += i21;
                        i80 = i17 + class_210.h;
                    }
                    while (true) {
                        i78--;
                        if (i78 < 0) {
                            return;
                        }
                        a(class_210.g, i17, i8, i75 >> 16, i77 >> 16);
                        i77 += i22;
                        i75 += i21;
                        i17 += class_210.h;
                    }
                } else {
                    int i81 = i3 - i4;
                    int i82 = i4 - i2;
                    int i83 = x[i2];
                    while (true) {
                        i18 = i83;
                        i82--;
                        if (i82 < 0) {
                            break;
                        }
                        a(class_210.g, i18, i8, i76 >> 16, i75 >> 16);
                        i76 += i23;
                        i75 += i21;
                        i83 = i18 + class_210.h;
                    }
                    while (true) {
                        i81--;
                        if (i81 < 0) {
                            return;
                        }
                        a(class_210.g, i18, i8, i77 >> 16, i75 >> 16);
                        i77 += i22;
                        i75 += i21;
                        i18 += class_210.h;
                    }
                }
            }
        }
    }

    public static final int b(int i2, int i3, int i4, int i5) {
        return ((i2 * i4) - (i5 * i3)) >> 16;
    }

    public static final int c(int i2, int i3, int i4, int i5) {
        return ((i5 * i2) + (i4 * i3)) >> 16;
    }

    public static final int d(int i2, int i3, int i4, int i5) {
        return ((i2 * i4) + (i5 * i3)) >> 16;
    }

    public static final int e(int i2, int i3, int i4, int i5) {
        return ((i4 * i3) - (i5 * i2)) >> 16;
    }

    static {
        i = !Configuration.ah;
        C = new i();
        n = true;
        p = true;
        q = true;
        y = new class_190[l];
        G = new boolean[l];
        H = new int[l];
        K = new int[l][];
        z = new int[l];
        B = new int[65536];
        L = new int[l][];
        E = new int[512];
        u = new int[2048];
        v = new int[2048];
        w = new int[2048];
        for (int i2 = 1; i2 < 512; i2++) {
            E[i2] = 32768 / i2;
        }
        for (int i3 = 1; i3 < 2048; i3++) {
            u[i3] = 65536 / i3;
        }
        for (int i4 = 0; i4 < 2048; i4++) {
            v[i4] = (int) (65536.0d * Math.sin(((double) i4) * 0.0030679615d));
            w[i4] = (int) (65536.0d * Math.cos(((double) i4) * 0.0030679615d));
        }
    }
}
