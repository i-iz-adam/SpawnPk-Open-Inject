package rs.lpkg;

import rs.ColorUtility;
import rs.Configuration;
import rs.class_267;

/* JADX INFO: loaded from: client-final.jar:rs/l/i.class */
public class i {
    private static final int[] c = new int[12];
    private static final float[] d = new float[12];
    private static final int[] e = new int[12];
    private static final float[] f = new float[12];
    public static final int a = 12;
    public static final int b = 4;

    public void a() {
    }

    public int a(ColorUtility colorUtility, d dVar, c cVar, long j) {
        float f2;
        rs.lpkg.cpkg.d dVarA;
        a();
        if (Configuration.az && !Configuration.ah && (dVarA = rs.lpkg.cpkg.c.a((int) j, false)) != null) {
            dVarA.c();
        }
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
        byte b2 = colorUtility.V;
        byte b3 = colorUtility.S;
        byte b4 = colorUtility.T;
        byte b5 = colorUtility.U;
        colorUtility.d();
        boolean z = e.a && (sArr != null || colorUtility.d());
        int iMin = Math.min(6144, colorUtility.ah);
        int i = 0;
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = iArr4[i2];
            int i4 = iArr5[i2];
            int i5 = iArr6[i2];
            int iA = iArr7[i2];
            int iA2 = iArr8[i2];
            int iA3 = iArr9[i2];
            if (ColorUtility.H != -1) {
                int i6 = ColorUtility.H;
                iA3 = i6;
                iA2 = i6;
                iA = i6;
            }
            int i7 = 0;
            if (iArr10 != null && (sArr == null || sArr[i2] == -1)) {
                int i8 = iArr10[i2];
                if (colorUtility.K != 256) {
                    i8 = colorUtility.K;
                }
                i7 = (i8 & 255) << 24;
                if (i8 == 255) {
                    iA3 = -2;
                }
            }
            int i9 = iArr11 != null ? (iArr11[i2] & 255) << 16 : 0;
            if (iA3 == -1) {
                int i10 = iA;
                iA3 = i10;
                iA2 = i10;
            } else {
                if (iA3 == -2) {
                }
            }
            if ((sArr == null || sArr[i2] == -1) && b2 > 0) {
                iA = a(iA, b3, b4, b5, b2);
                iA2 = a(iA2, b3, b4, b5, b2);
                iA3 = a(iA3, b3, b4, b5, b2);
            }
            c[0] = iArr[i3];
            c[1] = iArr2[i3];
            c[2] = iArr3[i3];
            c[3] = i7 | i9 | iA;
            c[4] = iArr[i4];
            c[5] = iArr2[i4];
            c[6] = iArr3[i4];
            c[7] = i7 | i9 | iA2;
            c[8] = iArr[i5];
            c[9] = iArr2[i5];
            c[10] = iArr3[i5];
            c[11] = i7 | i9 | iA3;
            dVar.a(c);
            if (z) {
                if (colorUtility.e() == null || ColorUtility.H > 1) {
                    cVar.a(f);
                } else {
                    if (colorUtility.ao == null || !colorUtility.d() || (sArr != null && sArr[i2] > 0)) {
                        f2 = sArr[i2] + 1.0f;
                    } else if ((colorUtility.ao[i2] & 1) != 1) {
                        f2 = colorUtility.ao[i2] > 0 ? colorUtility.ar[i2] + 1.0f : 0.0f;
                    } else if (colorUtility.ao[i2] >= 3) {
                        f2 = colorUtility.ao[i2] > 0 ? colorUtility.ar[i2] + 1.0f : 0.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    d[0] = f2;
                    d[1] = colorUtility.a(i2, 0);
                    d[2] = colorUtility.b(i2, 0);
                    d[3] = 0.0f;
                    d[4] = f2;
                    d[5] = colorUtility.a(i2, 1);
                    d[6] = colorUtility.b(i2, 1);
                    d[7] = 0.0f;
                    d[8] = f2;
                    d[9] = colorUtility.a(i2, 2);
                    d[10] = colorUtility.b(i2, 2);
                    d[11] = 0.0f;
                    cVar.a(d);
                }
            }
            i += 3;
        }
        return i;
    }

    public int a(ColorUtility colorUtility, d dVar, rs.lpkg.cpkg.a aVar, boolean z) {
        int i = (colorUtility.ap[aVar.n()] & 255) << 16;
        int iG = ((255 - ((int) (255.0f * aVar.g()))) & 255) << 24;
        int iA = class_267.a(aVar.e());
        int i2 = 3 * (!z ? 18 : 6);
        int iF = (int) (3.5f + aVar.f());
        int iJ = aVar.j();
        int iK = aVar.k() * (-1);
        int iL = aVar.l();
        if (z) {
            dVar.a(rs.lpkg.c.b.b(iJ, iK, iL, iF, iG | i | iA));
        } else {
            dVar.a(rs.lpkg.c.b.a(iJ, iK, iL, iF, iG | i | iA));
        }
        return i2;
    }

    public static int a(int i, byte b2, byte b3, byte b4, byte b5) {
        int i2 = (i >> 10) & 63;
        int i3 = (i >> 7) & 7;
        int i4 = i & 127;
        int i5 = b5 & 255;
        if (b2 != -1) {
            i2 += (i5 * (b2 - i2)) >> 7;
        }
        if (b3 != -1) {
            i3 += (i5 * (b3 - i3)) >> 7;
        }
        if (b4 != -1) {
            i4 += (i5 * (b4 - i4)) >> 7;
        }
        return ((i2 << 10) | (i3 << 7) | i4) & 65535;
    }
}
