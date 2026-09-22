package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_659.class */
final class class_659 {
    private static final class_660 a = new class_660();

    class_659() {
    }

    public static int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        synchronized (a) {
            a.a = bArr2;
            a.b = i3;
            a.f = bArr;
            a.g = 0;
            a.c = i2;
            a.h = i;
            a.o = 0;
            a.n = 0;
            a.d = 0;
            a.e = 0;
            a.i = 0;
            a.j = 0;
            a.q = 0;
            b(a);
            i4 = i - a.h;
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x007d A[SYNTHETIC] */
    private static void a(class_660 class_660Var) {
        boolean z;
        byte b;
        byte b2;
        byte b3;
        byte b4 = class_660Var.k;
        int i = class_660Var.l;
        int i2 = class_660Var.v;
        int i3 = class_660Var.t;
        int[] iArr = class_660.x;
        int i4 = class_660Var.s;
        byte[] bArr = class_660Var.f;
        int i5 = class_660Var.g;
        int i6 = class_660Var.h;
        int i7 = class_660Var.L + 1;
        loop0: while (true) {
            if (i > 0) {
                while (true) {
                    if (i6 == 0) {
                        break loop0;
                    }
                    if (i == 1) {
                        if (i6 != 0) {
                            bArr[i5] = b4;
                            i5++;
                            i6--;
                            break;
                        }
                        i = 1;
                        break;
                    }
                    bArr[i5] = b4;
                    i--;
                    i5++;
                    i6--;
                }
                z = true;
                while (z) {
                    z = false;
                    if (i2 == i7) {
                        i = 0;
                        break loop0;
                    }
                    b4 = (byte) i3;
                    int i8 = iArr[i4];
                    b3 = (byte) (i8 & 255);
                    i4 = i8 >> 8;
                    i2++;
                    if (b3 != i3) {
                        i3 = b3;
                        if (i6 == 0) {
                            i = 1;
                            break loop0;
                        }
                        bArr[i5] = b4;
                        i5++;
                        i6--;
                        z = true;
                    } else if (i2 == i7) {
                        continue;
                    } else {
                        if (i6 == 0) {
                            i = 1;
                            break loop0;
                        }
                        bArr[i5] = b4;
                        i5++;
                        i6--;
                        z = true;
                    }
                }
                i = 2;
                int i9 = iArr[i4];
                b = (byte) (i9 & 255);
                i4 = i9 >> 8;
                i2++;
                if (i2 == i7) {
                    if (b != i3) {
                        i3 = b;
                    } else {
                        i = 3;
                        int i10 = iArr[i4];
                        b2 = (byte) (i10 & 255);
                        i4 = i10 >> 8;
                        i2++;
                        if (i2 == i7) {
                            if (b2 != i3) {
                                i3 = b2;
                            } else {
                                int i11 = iArr[i4];
                                i = (((byte) (i11 & 255)) & 255) + 4;
                                int i12 = iArr[i11 >> 8];
                                i3 = (byte) (i12 & 255);
                                i4 = i12 >> 8;
                                i2 = i2 + 1 + 1;
                            }
                        }
                    }
                }
            } else {
                z = true;
                while (z) {
                    z = false;
                    if (i2 == i7) {
                        i = 0;
                        break loop0;
                    }
                    b4 = (byte) i3;
                    int i13 = iArr[i4];
                    b3 = (byte) (i13 & 255);
                    i4 = i13 >> 8;
                    i2++;
                    if (b3 != i3) {
                        i3 = b3;
                        if (i6 == 0) {
                            i = 1;
                            break loop0;
                        }
                        bArr[i5] = b4;
                        i5++;
                        i6--;
                        z = true;
                    } else if (i2 == i7) {
                        continue;
                    } else {
                        if (i6 == 0) {
                            i = 1;
                            break loop0;
                        }
                        bArr[i5] = b4;
                        i5++;
                        i6--;
                        z = true;
                    }
                }
                i = 2;
                int i14 = iArr[i4];
                b = (byte) (i14 & 255);
                i4 = i14 >> 8;
                i2++;
                if (i2 == i7) {
                    if (b != i3) {
                        i3 = b;
                    } else {
                        i = 3;
                        int i15 = iArr[i4];
                        b2 = (byte) (i15 & 255);
                        i4 = i15 >> 8;
                        i2++;
                        if (i2 == i7) {
                            if (b2 != i3) {
                                i3 = b2;
                            } else {
                                int i16 = iArr[i4];
                                i = (((byte) (i16 & 255)) & 255) + 4;
                                int i17 = iArr[i16 >> 8];
                                i3 = (byte) (i17 & 255);
                                i4 = i17 >> 8;
                                i2 = i2 + 1 + 1;
                            }
                        }
                    }
                }
            }
        }
        int i18 = class_660Var.i;
        class_660Var.i += i6 - i6;
        if (class_660Var.i < i18) {
            class_660Var.j++;
        }
        class_660Var.k = b4;
        class_660Var.l = i;
        class_660Var.v = i2;
        class_660Var.t = i3;
        class_660.x = iArr;
        class_660Var.s = i4;
        class_660Var.f = bArr;
        class_660Var.g = i5;
        class_660Var.h = i6;
    }

    private static void b(class_660 class_660Var) {
        int i;
        int i2;
        byte b;
        int i3;
        int i4 = 0;
        int[] iArr = null;
        int[] iArr2 = null;
        int[] iArr3 = null;
        class_660Var.p = 1;
        if (class_660.x == null) {
            class_660.x = new int[class_660Var.p * 100000];
        }
        boolean z = true;
        while (z && c(class_660Var) != 23) {
            c(class_660Var);
            c(class_660Var);
            c(class_660Var);
            c(class_660Var);
            c(class_660Var);
            class_660Var.q++;
            c(class_660Var);
            c(class_660Var);
            c(class_660Var);
            c(class_660Var);
            class_660Var.m = d(class_660Var) != 0;
            if (class_660Var.m) {
                System.out.println("PANIC! RANDOMISED BLOCK!");
            }
            class_660Var.r = 0;
            class_660Var.r = (class_660Var.r << 8) | (c(class_660Var) & 255);
            class_660Var.r = (class_660Var.r << 8) | (c(class_660Var) & 255);
            class_660Var.r = (class_660Var.r << 8) | (c(class_660Var) & 255);
            for (int i5 = 0; i5 < 16; i5++) {
                class_660Var.A[i5] = d(class_660Var) == 1;
            }
            for (int i6 = 0; i6 < 256; i6++) {
                class_660Var.z[i6] = false;
            }
            for (int i7 = 0; i7 < 16; i7++) {
                if (class_660Var.A[i7]) {
                    for (int i8 = 0; i8 < 16; i8++) {
                        if (d(class_660Var) == 1) {
                            class_660Var.z[(i7 * 16) + i8] = true;
                        }
                    }
                }
            }
            e(class_660Var);
            int i9 = class_660Var.y + 2;
            int iA = a(3, class_660Var);
            int iA2 = a(15, class_660Var);
            for (int i10 = 0; i10 < iA2; i10++) {
                int i11 = 0;
                while (d(class_660Var) != 0) {
                    i11++;
                }
                class_660Var.F[i10] = (byte) i11;
            }
            byte[] bArr = new byte[6];
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= iA) {
                    break;
                }
                bArr[b3] = b3;
                b2 = (byte) (b3 + 1);
            }
            for (int i12 = 0; i12 < iA2; i12++) {
                byte b4 = class_660Var.F[i12];
                byte b5 = bArr[b4];
                while (b4 > 0) {
                    bArr[b4] = bArr[b4 - 1];
                    b4 = (byte) (b4 - 1);
                }
                bArr[0] = b5;
                class_660Var.E[i12] = b5;
            }
            for (int i13 = 0; i13 < iA; i13++) {
                int iA3 = a(5, class_660Var);
                for (int i14 = 0; i14 < i9; i14++) {
                    while (d(class_660Var) != 0) {
                        iA3 = d(class_660Var) == 0 ? iA3 + 1 : iA3 - 1;
                    }
                    class_660Var.G[i13][i14] = (byte) iA3;
                }
            }
            for (int i15 = 0; i15 < iA; i15++) {
                byte b6 = 32;
                byte b7 = 0;
                for (int i16 = 0; i16 < i9; i16++) {
                    if (class_660Var.G[i15][i16] > b7) {
                        b7 = class_660Var.G[i15][i16];
                    }
                    if (class_660Var.G[i15][i16] < b6) {
                        b6 = class_660Var.G[i15][i16];
                    }
                }
                a(class_660Var.H[i15], class_660Var.I[i15], class_660Var.J[i15], class_660Var.G[i15], b6, b7, i9);
                class_660Var.K[i15] = b6;
            }
            int i17 = class_660Var.y + 1;
            int i18 = -1;
            int i19 = 0;
            for (int i20 = 0; i20 <= 255; i20++) {
                class_660Var.u[i20] = 0;
            }
            int i21 = 4095;
            for (int i22 = 15; i22 >= 0; i22--) {
                for (int i23 = 15; i23 >= 0; i23--) {
                    class_660Var.C[i21] = (byte) ((i22 * 16) + i23);
                    i21--;
                }
                class_660Var.D[i22] = i21 + 1;
            }
            int i24 = 0;
            if (0 == 0) {
                i18 = (-1) + 1;
                i19 = 50;
                byte b8 = class_660Var.E[i18];
                i4 = class_660Var.K[b8];
                iArr = class_660Var.H[b8];
                iArr3 = class_660Var.J[b8];
                iArr2 = class_660Var.I[b8];
            }
            int i25 = i19 - 1;
            int i26 = i4;
            int iA4 = a(i26, class_660Var);
            while (true) {
                i = iA4;
                if (i <= iArr[i26]) {
                    break;
                }
                i26++;
                iA4 = (i << 1) | d(class_660Var);
            }
            int i27 = iArr3[i - iArr2[i26]];
            while (i27 != i17) {
                if (i27 == 0 || i27 == 1) {
                    int i28 = -1;
                    int i29 = 1;
                    while (true) {
                        if (i27 == 0) {
                            i28 += i29;
                        } else if (i27 == 1) {
                            i28 += 2 * i29;
                        }
                        i29 *= 2;
                        if (i25 == 0) {
                            i18++;
                            i25 = 50;
                            byte b9 = class_660Var.E[i18];
                            i4 = class_660Var.K[b9];
                            iArr = class_660Var.H[b9];
                            iArr3 = class_660Var.J[b9];
                            iArr2 = class_660Var.I[b9];
                        }
                        i25--;
                        int i30 = i4;
                        int iA5 = a(i30, class_660Var);
                        while (true) {
                            i2 = iA5;
                            if (i2 <= iArr[i30]) {
                                break;
                            }
                            i30++;
                            iA5 = (i2 << 1) | d(class_660Var);
                        }
                        i27 = iArr3[i2 - iArr2[i30]];
                        if (i27 != 0 && i27 != 1) {
                            break;
                        }
                    }
                    int i31 = i28 + 1;
                    byte b10 = class_660Var.B[class_660Var.C[class_660Var.D[0]] & 255];
                    int[] iArr4 = class_660Var.u;
                    int i32 = b10 & 255;
                    iArr4[i32] = iArr4[i32] + i31;
                    while (i31 > 0) {
                        class_660.x[i24] = b10 & 255;
                        i24++;
                        i31--;
                    }
                } else {
                    int i33 = i27 - 1;
                    if (i33 < 16) {
                        int i34 = class_660Var.D[0];
                        b = class_660Var.C[i34 + i33];
                        while (i33 > 3) {
                            int i35 = i34 + i33;
                            class_660Var.C[i35] = class_660Var.C[i35 - 1];
                            class_660Var.C[i35 - 1] = class_660Var.C[i35 - 2];
                            class_660Var.C[i35 - 2] = class_660Var.C[i35 - 3];
                            class_660Var.C[i35 - 3] = class_660Var.C[i35 - 4];
                            i33 -= 4;
                        }
                        while (i33 > 0) {
                            class_660Var.C[i34 + i33] = class_660Var.C[(i34 + i33) - 1];
                            i33--;
                        }
                        class_660Var.C[i34] = b;
                    } else {
                        int i36 = i33 / 16;
                        int i37 = class_660Var.D[i36] + (i33 % 16);
                        b = class_660Var.C[i37];
                        while (i37 > class_660Var.D[i36]) {
                            class_660Var.C[i37] = class_660Var.C[i37 - 1];
                            i37--;
                        }
                        int[] iArr5 = class_660Var.D;
                        iArr5[i36] = iArr5[i36] + 1;
                        while (i36 > 0) {
                            int[] iArr6 = class_660Var.D;
                            int i38 = i36;
                            iArr6[i38] = iArr6[i38] - 1;
                            class_660Var.C[class_660Var.D[i36]] = class_660Var.C[(class_660Var.D[i36 - 1] + 16) - 1];
                            i36--;
                        }
                        int[] iArr7 = class_660Var.D;
                        iArr7[0] = iArr7[0] - 1;
                        class_660Var.C[class_660Var.D[0]] = b;
                        if (class_660Var.D[0] == 0) {
                            int i39 = 4095;
                            for (int i40 = 15; i40 >= 0; i40--) {
                                for (int i41 = 15; i41 >= 0; i41--) {
                                    class_660Var.C[i39] = class_660Var.C[class_660Var.D[i40] + i41];
                                    i39--;
                                }
                                class_660Var.D[i40] = i39 + 1;
                            }
                        }
                    }
                    int[] iArr8 = class_660Var.u;
                    int i42 = class_660Var.B[b & 255] & 255;
                    iArr8[i42] = iArr8[i42] + 1;
                    class_660.x[i24] = class_660Var.B[b & 255] & 255;
                    i24++;
                    if (i25 == 0) {
                        i18++;
                        i25 = 50;
                        byte b11 = class_660Var.E[i18];
                        i4 = class_660Var.K[b11];
                        iArr = class_660Var.H[b11];
                        iArr3 = class_660Var.J[b11];
                        iArr2 = class_660Var.I[b11];
                    }
                    i25--;
                    int i43 = i4;
                    int iA6 = a(i43, class_660Var);
                    while (true) {
                        i3 = iA6;
                        if (i3 <= iArr[i43]) {
                            break;
                        }
                        i43++;
                        iA6 = (i3 << 1) | d(class_660Var);
                    }
                    i27 = iArr3[i3 - iArr2[i43]];
                }
            }
            class_660Var.l = 0;
            class_660Var.k = (byte) 0;
            class_660Var.w[0] = 0;
            for (int i44 = 1; i44 <= 256; i44++) {
                class_660Var.w[i44] = class_660Var.u[i44 - 1];
            }
            for (int i45 = 1; i45 <= 256; i45++) {
                int[] iArr9 = class_660Var.w;
                int i46 = i45;
                iArr9[i46] = iArr9[i46] + class_660Var.w[i45 - 1];
            }
            for (int i47 = 0; i47 < i24; i47++) {
                byte b12 = (byte) (class_660.x[i47] & 255);
                int[] iArr10 = class_660.x;
                int i48 = class_660Var.w[b12 & 255];
                iArr10[i48] = iArr10[i48] | (i47 << 8);
                int[] iArr11 = class_660Var.w;
                int i49 = b12 & 255;
                iArr11[i49] = iArr11[i49] + 1;
            }
            class_660Var.s = class_660.x[class_660Var.r] >> 8;
            class_660Var.v = 0;
            class_660Var.s = class_660.x[class_660Var.s];
            class_660Var.t = (byte) (class_660Var.s & 255);
            class_660Var.s >>= 8;
            class_660Var.v++;
            class_660Var.L = i24;
            a(class_660Var);
            z = class_660Var.v == class_660Var.L + 1 && class_660Var.l == 0;
        }
    }

    private static byte c(class_660 class_660Var) {
        return (byte) a(8, class_660Var);
    }

    private static byte d(class_660 class_660Var) {
        return (byte) a(1, class_660Var);
    }

    private static int a(int i, class_660 class_660Var) {
        while (class_660Var.o < i) {
            class_660Var.n = (class_660Var.n << 8) | (class_660Var.a[class_660Var.b] & 255);
            class_660Var.o += 8;
            class_660Var.b++;
            class_660Var.c--;
            class_660Var.d++;
            if (class_660Var.d == 0) {
                class_660Var.e++;
            }
        }
        int i2 = (class_660Var.n >> (class_660Var.o - i)) & ((1 << i) - 1);
        class_660Var.o -= i;
        return i2;
    }

    private static void e(class_660 class_660Var) {
        class_660Var.y = 0;
        for (int i = 0; i < 256; i++) {
            if (class_660Var.z[i]) {
                class_660Var.B[class_660Var.y] = (byte) i;
                class_660Var.y++;
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = i; i5 <= i2; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (bArr[i6] == i5) {
                    iArr3[i4] = i6;
                    i4++;
                }
            }
        }
        for (int i7 = 0; i7 < 23; i7++) {
            iArr2[i7] = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = bArr[i8] + 1;
            iArr2[i9] = iArr2[i9] + 1;
        }
        for (int i10 = 1; i10 < 23; i10++) {
            int i11 = i10;
            iArr2[i11] = iArr2[i11] + iArr2[i10 - 1];
        }
        for (int i12 = 0; i12 < 23; i12++) {
            iArr[i12] = 0;
        }
        int i13 = 0;
        for (int i14 = i; i14 <= i2; i14++) {
            int i15 = i13 + (iArr2[i14 + 1] - iArr2[i14]);
            iArr[i14] = i15 - 1;
            i13 = i15 << 1;
        }
        for (int i16 = i + 1; i16 <= i2; i16++) {
            iArr2[i16] = ((iArr[i16 - 1] + 1) << 1) - iArr2[i16];
        }
    }
}
