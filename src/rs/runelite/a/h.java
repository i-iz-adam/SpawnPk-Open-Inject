package rs.runelite.a;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import rs.Client;
import rs.ColorUtility;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/h.class */
public class h {
    public static final int a = 7;
    public static final int b = 128;
    public static final int c = 104;
    public static final double d = 0.0030679615757712823d;
    public static final int[] e = new int[2048];
    public static final int[] f = new int[2048];

    public static i a(@Nonnull f fVar, int i) {
        return a(fVar, i, 0);
    }

    public static i a(@Nonnull f fVar, int i, int i2) {
        return a(fVar.b(), fVar.c(), d(fVar, i) - i2);
    }

    public static i a(int i, int i2, int i3) {
        if (i < 128 || i2 < 128 || i > 13056 || i2 > 13056) {
            return null;
        }
        Client clientO = Launcher.n().o();
        int i4 = i - Client.cJ;
        int i5 = i2 - Client.cL;
        int i6 = i3 - Client.cK;
        int i7 = clientO.cR;
        int i8 = clientO.cS;
        int i9 = e[i7];
        int i10 = f[i7];
        int i11 = e[i8];
        int i12 = f[i8];
        int i13 = ((i4 * i12) + (i5 * i11)) >> 16;
        int i14 = ((i5 * i12) - (i4 * i11)) >> 16;
        int i15 = ((i6 * i10) - (i14 * i9)) >> 16;
        int i16 = ((i14 * i10) + (i6 * i9)) >> 16;
        if (i16 < 50) {
            return null;
        }
        int iAJ = clientO.aJ();
        return new i((clientO.ar() / 2) + ((i13 * iAJ) / i16) + clientO.ae(), (clientO.aq() / 2) + ((i15 * iAJ) / i16) + clientO.af());
    }

    public static Polygon a(@Nonnull f fVar) {
        return c(fVar, 1);
    }

    public static Polygon b(@Nonnull f fVar, int i) {
        return a(fVar, 1, 1, Client.dw, i);
    }

    public static Polygon c(@Nonnull f fVar, int i) {
        return a(fVar, i, i, Client.dw, 0);
    }

    public static Polygon a(@Nonnull f fVar, int i, int i2, int i3, int i4) {
        if (!fVar.a()) {
            return null;
        }
        byte[][][] bArr = Launcher.n().o().gc;
        int iD = fVar.d();
        int iE = fVar.e();
        int i5 = i3;
        if (i3 < 3 && (bArr[1][iD][iE] & 2) == 2) {
            i5 = i3 + 1;
        }
        int iB = fVar.b() - ((i * 128) / 2);
        int iC = fVar.c() - ((i2 * 128) / 2);
        int iB2 = fVar.b() + ((i * 128) / 2);
        int iC2 = fVar.c() + ((i2 * 128) / 2);
        int iB3 = b(iB, iC, i5) - i4;
        int iB4 = b(iB2, iC, i5) - i4;
        int iB5 = b(iB2, iC2, i5) - i4;
        int iB6 = b(iB, iC2, i5) - i4;
        i iVarA = a(iB, iC, iB3);
        i iVarA2 = a(iB2, iC, iB4);
        i iVarA3 = a(iB2, iC2, iB5);
        i iVarA4 = a(iB, iC2, iB6);
        if (iVarA == null || iVarA2 == null || iVarA3 == null || iVarA4 == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        polygon.addPoint(iVarA.a(), iVarA.b());
        polygon.addPoint(iVarA2.a(), iVarA2.b());
        polygon.addPoint(iVarA3.a(), iVarA3.b());
        polygon.addPoint(iVarA4.a(), iVarA4.b());
        return polygon;
    }

    public static int d(@Nonnull f fVar, int i) {
        int iD = fVar.d();
        int iE = fVar.e();
        if (iD < 0 || iE < 0 || iD >= 104 || iE >= 104) {
            return 0;
        }
        byte[][][] bArr = Launcher.n().o().gc;
        int[][][] iArr = Launcher.n().o().fC;
        int i2 = i;
        if (i < 3 && (bArr[1][iD][iE] & 2) == 2) {
            i2 = i + 1;
        }
        int iB = fVar.b() & 127;
        int iC = fVar.c() & 127;
        return (((128 - iC) * (((iB * iArr[i2][iD + 1][iE]) + ((128 - iB) * iArr[i2][iD][iE])) >> 7)) + (iC * (((iArr[i2][iD][iE + 1] * (128 - iB)) + (iB * iArr[i2][iD + 1][iE + 1])) >> 7))) >> 7;
    }

    private static int b(int i, int i2, int i3) {
        int i4 = i >> 7;
        int i5 = i2 >> 7;
        if (i4 < 0 || i5 < 0 || i4 >= 104 || i5 >= 104) {
            return 0;
        }
        int[][][] iArr = Launcher.n().o().fC;
        int i6 = i & 127;
        int i7 = i2 & 127;
        return (((128 - i7) * (((i6 * iArr[i3][i4 + 1][i5]) + ((128 - i6) * iArr[i3][i4][i5])) >> 7)) + (i7 * (((iArr[i3][i4][i5 + 1] * (128 - i6)) + (i6 * iArr[i3][i4 + 1][i5 + 1])) >> 7))) >> 7;
    }

    public static void a(int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        if (rs.lpkg.e.a()) {
            b(i, i2, i3, i4, i5, iArr, iArr2, iArr3, iArr4, iArr5);
        } else {
            c(i, i2, i3, i4, i5, iArr, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void b(int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        int iRound;
        int iRound2;
        Client clientO = Launcher.n().o();
        int i6 = clientO.cR;
        int i7 = clientO.cS;
        float f2 = e[i6] / 65536.0f;
        float f3 = f[i6] / 65536.0f;
        float f4 = e[i7] / 65536.0f;
        float f5 = f[i7] / 65536.0f;
        float f6 = e[i5] / 65536.0f;
        float f7 = f[i5] / 65536.0f;
        float f8 = i2 - Client.cJ;
        float f9 = i3 - Client.cL;
        float f10 = i4 - Client.cK;
        float fAr = clientO.ar() / 2.0f;
        float fAq = clientO.aq() / 2.0f;
        float fAJ = clientO.aJ();
        for (int i8 = 0; i8 < i; i8++) {
            float f11 = iArr[i8];
            float f12 = iArr2[i8];
            float f13 = iArr3[i8];
            if (i5 != 0) {
                f11 = (f11 * f7) + (f12 * f6);
                f12 = (f12 * f7) - (f11 * f6);
            }
            float f14 = f11 + f8;
            float f15 = f12 + f9;
            float f16 = f13 + f10;
            float f17 = (f14 * f5) + (f15 * f4);
            float f18 = (f15 * f5) - (f14 * f4);
            float f19 = (f16 * f3) - (f18 * f2);
            float f20 = (f18 * f3) + (f16 * f2);
            if (f20 < 50.0f) {
                iRound = Integer.MIN_VALUE;
                iRound2 = Integer.MIN_VALUE;
            } else {
                iRound = Math.round(fAr + ((f17 * fAJ) / f20) + 4.0f);
                iRound2 = Math.round(fAq + ((f19 * fAJ) / f20) + 4.0f);
            }
            iArr4[i8] = iRound;
            iArr5[i8] = iRound2;
        }
    }

    private static void c(int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        int i6;
        int i7;
        Client clientO = Launcher.n().o();
        int i8 = clientO.cR;
        int i9 = clientO.cS;
        int i10 = e[i8];
        int i11 = f[i8];
        int i12 = e[i9];
        int i13 = f[i9];
        int i14 = e[i5];
        int i15 = f[i5];
        int i16 = i2 - Client.cJ;
        int i17 = i3 - Client.cL;
        int i18 = i4 - Client.cK;
        int iAr = clientO.ar() / 2;
        int iAq = clientO.aq() / 2;
        int iAe = clientO.ae();
        int iAf = clientO.af();
        int iAJ = clientO.aJ();
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = iArr[i19];
            int i21 = iArr2[i19];
            int i22 = iArr3[i19];
            if (i5 != 0) {
                i20 = ((i20 * i15) + (i21 * i14)) >> 16;
                i21 = ((i21 * i15) - (i20 * i14)) >> 16;
            }
            int i23 = i20 + i16;
            int i24 = i21 + i17;
            int i25 = i22 + i18;
            int i26 = ((i23 * i13) + (i24 * i12)) >> 16;
            int i27 = ((i24 * i13) - (i23 * i12)) >> 16;
            int i28 = ((i25 * i11) - (i27 * i10)) >> 16;
            int i29 = ((i27 * i11) + (i25 * i10)) >> 16;
            if (i29 < 50) {
                i6 = Integer.MIN_VALUE;
                i7 = Integer.MIN_VALUE;
            } else {
                i6 = iAr + ((i26 * iAJ) / i29) + iAe;
                i7 = iAq + ((i28 * iAJ) / i29) + iAf;
            }
            iArr4[i19] = i6;
            iArr5[i19] = i7;
        }
    }

    public static i a(@Nonnull Graphics2D graphics2D, @Nonnull f fVar, @Nullable String str, int i) {
        i iVarA;
        if (str == null || (iVarA = a(fVar, Client.dw, i)) == null) {
            return null;
        }
        return new i(iVarA.a(), iVarA.b());
    }

    @Nullable
    public static Shape a(ColorUtility colorUtility, int i, int i2, int i3, int i4) {
        m mVarB;
        Launcher.n().o();
        if (colorUtility == null || (mVarB = b(colorUtility, i, i2, i3, i4)) == null) {
            return null;
        }
        if (colorUtility.aN) {
            return mVarB;
        }
        l<m> lVarC = c(colorUtility, i, i2, i3, i4);
        if (lVarC == null) {
            return null;
        }
        Iterator it = lVarC.a().iterator();
        while (it.hasNext()) {
            ((m) it.next()).b(mVarB);
        }
        return lVarC;
    }

    private static m b(ColorUtility colorUtility, int i, int i2, int i3, int i4) {
        Launcher.n().o();
        a aVarP = colorUtility.p(i);
        int iA = aVarP.a();
        int iC = aVarP.c();
        int iB = aVarP.b();
        int iD = aVarP.d();
        int iF = aVarP.f();
        int iE = aVarP.e();
        int i5 = iA + iD;
        int i6 = iC + iF;
        int i7 = iB + iE;
        int i8 = iA - iD;
        int i9 = iC - iF;
        int i10 = iB - iE;
        int[] iArr = {i8, i5, i8, i5, i8, i5, i8, i5};
        int[] iArr2 = {i9, i9, i6, i6, i9, i9, i6, i6};
        int[] iArr3 = {i10, i10, i10, i10, i7, i7, i7, i7};
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        c(8, i2, i3, i4, 0, iArr, iArr2, iArr3, iArr4, iArr5);
        return e.a(iArr4, iArr5);
    }

    private static l<m> c(ColorUtility colorUtility, int i, int i2, int i3, int i4) {
        Client clientO = Launcher.n().o();
        int[] iArr = new int[colorUtility.z()];
        int[] iArr2 = new int[colorUtility.z()];
        int[] iArr3 = colorUtility.an;
        c(colorUtility.z(), i2, i3, i4, i, colorUtility.A(), colorUtility.C(), colorUtility.B(), iArr, iArr2);
        int[][] iArr4 = {colorUtility.D(), colorUtility.E(), colorUtility.F()};
        int iAe = clientO.ae();
        int iAe2 = clientO.ae();
        int iAr = iAe + clientO.ar();
        int iAq = iAe2 + clientO.aq();
        ArrayList arrayList = new ArrayList(colorUtility.G());
        for (int i5 = 0; i5 < colorUtility.G(); i5++) {
            if (iArr3[i5] != -2) {
                int i6 = Integer.MAX_VALUE;
                int i7 = Integer.MAX_VALUE;
                int i8 = Integer.MIN_VALUE;
                int i9 = Integer.MIN_VALUE;
                int length = iArr4.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        int i11 = i6 - 5;
                        int i12 = i7 - 5;
                        int i13 = i8 + 5;
                        int i14 = i9 + 5;
                        if (iAe <= i13 && iAr >= i11 && iAe2 <= i14 && iAq >= i12) {
                            arrayList.add(new j.c(i11, i12, i13, i14));
                            break;
                        }
                        break;
                    }
                    int i15 = iArr4[i10][i5];
                    int i16 = iArr[i15];
                    int i17 = iArr2[i15];
                    if (i16 == Integer.MIN_VALUE || i17 == Integer.MIN_VALUE) {
                        break;
                    }
                    if (i16 < i6) {
                        i6 = i16;
                    }
                    if (i16 > i8) {
                        i8 = i16;
                    }
                    if (i17 < i7) {
                        i7 = i17;
                    }
                    if (i17 > i9) {
                        i9 = i17;
                    }
                    i10++;
                }
            }
        }
        return j.a(arrayList);
    }

    static {
        for (int i = 0; i < 2048; i++) {
            e[i] = (int) (65536.0d * Math.sin(((double) i) * 0.0030679615757712823d));
            f[i] = (int) (65536.0d * Math.cos(((double) i) * 0.0030679615757712823d));
        }
    }
}
