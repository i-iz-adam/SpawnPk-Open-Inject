package rs.lpkg;

import com.sun.jna.platform.win32.aU;
import rs.ColorUtility;
import rs.class_189;
import rs.class_32;
import rs.class_33;
import rs.class_34;
import rs.class_44;
import rs.class_45;
import rs.class_46;
import rs.class_48;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/l/l.class */
class l {
    int a = (int) System.nanoTime();
    private int b;
    private int c;
    private static int[] d;
    private static char[] e;
    private static char[][] f;
    private static float[] g;
    private static float[] h;
    private static int[] i;
    private static int[] j;
    private static int[] k;
    private static int[] l;
    private static int[] m;
    private static int[] n;
    private static int[] o;
    private static int[][] p;

    l() {
    }

    void a(class_46 class_46Var, d dVar, c cVar) {
        this.a++;
        this.b = 0;
        this.c = 0;
        dVar.b();
        cVar.b();
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 104; i3++) {
                for (int i4 = 0; i4 < 104; i4++) {
                    class_32 class_32Var = class_46Var.c()[i2][i3][i4];
                    if (class_32Var != null) {
                        a(class_32Var, dVar, cVar);
                    }
                }
            }
        }
    }

    private void a(class_32 class_32Var, d dVar, c cVar) {
        class_32 class_32VarD = class_32Var.d();
        if (class_32VarD != null) {
            a(class_32VarD, dVar, cVar);
        }
        class_34 class_34VarA = class_32Var.a();
        if (class_34VarA != null) {
            class_34VarA.a(this.b);
            if (class_34VarA.e() != -1) {
                class_34VarA.b(this.c);
            } else {
                class_34VarA.b(-1);
            }
            rs.runelite.a.i iVar = new rs.runelite.a.i(class_32Var.k(), class_32Var.l());
            int iA = a(class_34VarA, class_32Var.j(), iVar.a(), iVar.b(), dVar, cVar, false);
            class_34VarA.c(iA);
            this.b += iA;
            if (class_34VarA.e() != -1) {
                this.c += iA;
            }
        }
        class_33 class_33VarC = class_32Var.c();
        if (class_33VarC != null) {
            class_33VarC.a(this.b);
            if (class_33VarC.g() != null) {
                class_33VarC.b(this.c);
            } else {
                class_33VarC.b(-1);
            }
            int iA2 = a(class_33VarC, class_32Var.k(), class_32Var.l(), dVar, cVar);
            class_33VarC.c(iA2);
            this.b += iA2;
            if (class_33VarC.g() != null) {
                this.c += iA2;
            }
        }
        class_45 class_45VarE = class_32Var.e();
        if (class_45VarE != null) {
            class_48 class_48VarA = class_45VarE.a();
            if (class_48VarA instanceof ColorUtility) {
                a((ColorUtility) class_48VarA, dVar, cVar);
            }
            class_48 class_48VarB = class_45VarE.b();
            if (class_48VarB instanceof ColorUtility) {
                a((ColorUtility) class_48VarB, dVar, cVar);
            }
        }
        class_189 class_189VarG = class_32Var.g();
        if (class_189VarG != null) {
            class_48 class_48VarA2 = class_189VarG.a();
            if (class_48VarA2 instanceof ColorUtility) {
                a((ColorUtility) class_48VarA2, dVar, cVar);
            }
        }
        class_44 class_44VarF = class_32Var.f();
        if (class_44VarF != null) {
            class_48 class_48VarA3 = class_44VarF.a();
            if (class_48VarA3 instanceof ColorUtility) {
                a((ColorUtility) class_48VarA3, dVar, cVar);
            }
        }
        for (rs.l lVar : class_32Var.i()) {
            if (lVar != null && (lVar.a() instanceof ColorUtility)) {
                a((ColorUtility) lVar.a(), dVar, cVar);
            }
        }
    }

    public int a(class_34 class_34Var, int i2, int i3, int i4, d dVar, c cVar, boolean z) {
        int[][][] iArrAO = Launcher.n().o().aO();
        int i5 = z ? 128 * i3 : 0;
        int i6 = z ? 128 * i4 : 0;
        int i7 = iArrAO[i2][i3][i4];
        int i8 = iArrAO[i2][i3 + 1][i4];
        int i9 = iArrAO[i2][i3 + 1][i4 + 1];
        int i10 = iArrAO[i2][i3][i4 + 1];
        int iC = class_34Var.c();
        int iD = class_34Var.d();
        int iB = class_34Var.b();
        int iA = class_34Var.a();
        if (iC == 12345678) {
            return 0;
        }
        dVar.a(24);
        cVar.a(24);
        int i11 = i5 + 128;
        int i12 = i6 + 128;
        dVar.a(i5 + 128, i9, i6 + 128, iC);
        dVar.a(i5, i10, i12, iD);
        dVar.a(i11, i8, i6, iB);
        dVar.a(i5, i7, i6, iA);
        dVar.a(i11, i8, i6, iB);
        dVar.a(i5, i10, i12, iD);
        if (!z && class_34Var.e() == -1) {
            return 6;
        }
        float fE = class_34Var.e() + 1.0f;
        cVar.a(fE, 1.0f, 1.0f, 0.0f);
        cVar.a(fE, 0.0f, 1.0f, 0.0f);
        cVar.a(fE, 1.0f, 0.0f, 0.0f);
        cVar.a(fE, 0.0f, 0.0f, 0.0f);
        cVar.a(fE, 1.0f, 0.0f, 0.0f);
        cVar.a(fE, 0.0f, 1.0f, 0.0f);
        return 6;
    }

    private int a(class_33 class_33Var, int i2, int i3, d dVar, c cVar) {
        int[] iArrH = class_33Var.h();
        int[] iArrI = class_33Var.i();
        int[] iArrJ = class_33Var.j();
        int[] iArrD = class_33Var.d();
        int[] iArrE = class_33Var.e();
        int[] iArrF = class_33Var.f();
        int[] iArrK = class_33Var.k();
        int[] iArrL = class_33Var.l();
        int[] iArrM = class_33Var.m();
        int[] iArrG = class_33Var.g();
        int length = iArrH.length;
        dVar.a(length * 12);
        cVar.a(length * 12);
        int i4 = 128 * i2;
        int i5 = 128 * i3;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArrH[i7];
            int i9 = iArrI[i7];
            int i10 = iArrJ[i7];
            int i11 = iArrK[i7];
            int i12 = iArrL[i7];
            int i13 = iArrM[i7];
            if (i11 != 12345678) {
                i6 += 3;
                int i14 = iArrD[i8] - i4;
                int i15 = iArrF[i8] - i5;
                int i16 = iArrD[i9] - i4;
                int i17 = iArrF[i9] - i5;
                int i18 = iArrD[i10] - i4;
                int i19 = iArrF[i10] - i5;
                dVar.a(i14, iArrE[i8], i15, i11);
                dVar.a(i16, iArrE[i9], i17, i12);
                dVar.a(i18, iArrE[i10], i19, i13);
                if (iArrG != null) {
                    if (iArrG[i7] != -1) {
                        float f2 = iArrG[i7] + 1.0f;
                        cVar.a(f2, i14 / 128.0f, i15 / 128.0f, 0.0f);
                        cVar.a(f2, i16 / 128.0f, i17 / 128.0f, 0.0f);
                        cVar.a(f2, i18 / 128.0f, i19 / 128.0f, 0.0f);
                    } else {
                        cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
                        cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
                        cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
        }
        return i6;
    }

    int a(class_34 class_34Var, int i2, int i3, int i4, d dVar, c cVar, int i5, int i6, boolean z) {
        int[][][] iArrAO = Launcher.n().o().aO();
        int i7 = iArrAO[i2][i3][i4];
        int i8 = iArrAO[i2][i3 + 1][i4];
        int i9 = iArrAO[i2][i3 + 1][i4 + 1];
        int i10 = iArrAO[i2][i3][i4 + 1];
        int iC = class_34Var.c();
        int iD = class_34Var.d();
        int iB = class_34Var.b();
        int iA = class_34Var.a();
        if (iC == 12345678) {
            return 0;
        }
        dVar.a(24);
        cVar.a(24);
        int i11 = i5 + 128;
        int i12 = i6 + 128;
        dVar.a(i5 + 128, i9, i6 + 128, iC);
        dVar.a(i5, i10, i12, iD);
        dVar.a(i11, i8, i6, iB);
        dVar.a(i5, i7, i6, iA);
        dVar.a(i11, i8, i6, iB);
        dVar.a(i5, i10, i12, iD);
        if (!z && class_34Var.e() == -1) {
            return 6;
        }
        float fE = class_34Var.e() + 1.0f;
        cVar.a(fE, 1.0f, 1.0f, 0.0f);
        cVar.a(fE, 0.0f, 1.0f, 0.0f);
        cVar.a(fE, 1.0f, 0.0f, 0.0f);
        cVar.a(fE, 0.0f, 0.0f, 0.0f);
        cVar.a(fE, 1.0f, 0.0f, 0.0f);
        cVar.a(fE, 0.0f, 1.0f, 0.0f);
        return 6;
    }

    private void a(ColorUtility colorUtility, d dVar, c cVar) {
        if (colorUtility.t() > 0) {
            return;
        }
        colorUtility.n(this.b);
        if (!e.a || (colorUtility.Y == null && !colorUtility.d())) {
            colorUtility.o(-1);
        } else {
            colorUtility.o(this.c);
        }
        colorUtility.m(this.a);
        dVar.a(colorUtility.ah * 12);
        cVar.a(colorUtility.ah * 12);
        int i2 = colorUtility.ah;
        int iA = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iA += a(colorUtility, i3, dVar, cVar);
        }
        this.b += iA;
        if (e.a) {
            if (colorUtility.Y != null || colorUtility.d()) {
                this.c += iA;
            }
        }
    }

    int a(ColorUtility colorUtility, int i2, d dVar, c cVar) {
        float f2;
        int[] iArr = colorUtility.ae;
        int[] iArr2 = colorUtility.af;
        int[] iArr3 = colorUtility.ag;
        int[] iArr4 = colorUtility.ai;
        int[] iArr5 = colorUtility.aj;
        int[] iArr6 = colorUtility.ak;
        int[] iArr7 = colorUtility.al;
        int[] iArr8 = colorUtility.am;
        int[] iArr9 = colorUtility.an;
        int[] iArr10 = colorUtility.aq;
        short[] sArr = colorUtility.Y;
        int[] iArr11 = colorUtility.ap;
        byte b = colorUtility.V;
        byte b2 = colorUtility.S;
        byte b3 = colorUtility.T;
        byte b4 = colorUtility.U;
        boolean zD = colorUtility.d();
        int i3 = iArr4[i2];
        int i4 = iArr5[i2];
        int i5 = iArr6[i2];
        int iA = iArr7[i2];
        int iA2 = iArr8[i2];
        int iA3 = iArr9[i2];
        int i6 = 0;
        if (iArr10 != null && (sArr == null || sArr[i2] == -1)) {
            i6 = (iArr10[i2] & 255) << 24;
            if (iArr10[i2] == 255) {
                iA3 = -2;
            }
        }
        int i7 = 0;
        if (iArr11 != null) {
            i7 = (iArr11[i2] & 255) << 16;
        }
        if (iA3 == -1) {
            iA3 = iA;
            iA2 = iA;
        } else if (iA3 == -2) {
            dVar.a(0, 0, 0, 0);
            dVar.a(0, 0, 0, 0);
            dVar.a(0, 0, 0, 0);
            if (!e.a) {
                return 3;
            }
            if (sArr == null && !zD) {
                return 3;
            }
            cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
            cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
            cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
            return 3;
        }
        if ((sArr == null || sArr[i2] == -1) && b > 0) {
            iA = a(iA, b2, b3, b4, b);
            iA2 = a(iA2, b2, b3, b4, b);
            iA3 = a(iA3, b2, b3, b4, b);
        }
        dVar.a(iArr[i3], iArr2[i3], iArr3[i3], i6 | i7 | (0 != 0 ? 65535 : iA));
        dVar.a(iArr[i4], iArr2[i4], iArr3[i4], i6 | i7 | (0 != 0 ? 65535 : iA2));
        dVar.a(iArr[i5], iArr2[i5], iArr3[i5], i6 | i7 | (0 != 0 ? 65535 : iA3));
        if (!e.a) {
            return 3;
        }
        if (sArr == null && !colorUtility.d()) {
            return 3;
        }
        try {
            if (colorUtility.e() != null) {
                if (!colorUtility.d() || (sArr != null && sArr[i2] > 0)) {
                    f2 = sArr[i2] + 1.0f;
                } else if (colorUtility.ao == null) {
                    f2 = 0.0f;
                } else if ((colorUtility.ao[i2] & 1) != 1) {
                    f2 = colorUtility.ao[i2] > 0 ? colorUtility.ar[i2] + 1.0f : 0.0f;
                } else if (colorUtility.ao[i2] >= 3) {
                    f2 = colorUtility.ao[i2] > 0 ? colorUtility.ar[i2] + 1.0f : 0.0f;
                } else {
                    f2 = 0.0f;
                }
                cVar.a(f2, colorUtility.a(i2, 0), colorUtility.b(i2, 0), 0.0f);
                cVar.a(f2, colorUtility.a(i2, 1), colorUtility.b(i2, 1), 0.0f);
                cVar.a(f2, colorUtility.a(i2, 2), colorUtility.b(i2, 2), 0.0f);
            } else {
                cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
                cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
                cVar.a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            return 3;
        } catch (Exception e2) {
            e2.printStackTrace();
            colorUtility.l = false;
            return 3;
        }
    }

    private static int a(int i2, byte b, byte b2, byte b3, byte b4) {
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

    void a() {
        d = new int[6500];
        e = new char[aU.zN];
        f = new char[aU.zN][512];
        g = new float[6500];
        h = new float[6500];
        i = new int[6500];
        j = new int[6500];
        k = new int[6500];
        l = new int[12];
        m = new int[aU.uS];
        n = new int[aU.uS];
        o = new int[12];
        p = new int[12][aU.uS];
    }

    void b() {
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
    }
}
