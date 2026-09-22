package rs;

import com.a.b.a.b;
import com.sun.jna.platform.win32.aU;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;
import rs.lpkg.cpkg.c;
import rs.lpkg.cpkg.d;
import rs.lpkg.e;
import rs.runelite.a.a;
import rs.runelite.a.h;
import rs.runelite.a.i;
import rs.runelite.a.m;
import rs.runelite.a.o;

/* JADX INFO: loaded from: client-final.jar:rs/ColorUtility.class */
public class ColorUtility extends class_48 {
    public class_49 i;
    public int k;
    public boolean l;
    public transient float[] m;
    private int bJ;
    public int n;
    public static class_649[] o;
    public static boolean[] p;
    public int q;
    public int r;
    public boolean z;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int I;
    public int J;
    public short K;
    public int[] L;
    public byte[] M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public byte S;
    public byte T;
    public byte U;
    public byte V;
    public int[][] W;
    public int[][] X;
    public short[] Y;
    public short[] Z;
    public byte[] aa;
    private int bK;
    private boolean bL;
    private int bM;
    private int bN;
    private boolean bO;
    public static int ab;
    public int ad;
    public int[] ae;
    public int[] af;
    public int[] ag;
    public int ah;
    public int[] ai;
    public int[] aj;
    public int[] ak;
    public int[] al;
    public int[] am;
    public int[] an;
    public int[] ao;
    public int[] ap;
    public int[] aq;
    public int[] ar;
    public boolean[] as;
    public boolean[] at;
    public int au;
    public int av;
    public int[] aw;
    public int[] ax;
    public int[] ay;
    public int az;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public int[] aJ;
    public int[] aK;
    public int[][] aL;
    public int[][] aM;
    public boolean aN;
    public class_43 aO;
    public class_43 aP;
    public class_63 aQ;
    static class_96 aU;
    static final int aW = 8192;
    static int bq;
    static int br;
    static int bs;
    public static boolean bt;
    public static int bu;
    public static int bv;
    public static int bw;
    public static boolean bE;
    public static boolean bF;
    public static int bG;
    HashMap<Integer, a> bH;
    public int bI;
    public static class_49 h = new class_49(false);
    public static int j = 30000;
    public static int[] s = new int[256];
    public static int[] t = new int[256];
    public static int[] u = new int[256];
    public static String v = "Cla";
    public static String w = "at Cl";
    public static String x = "nt";
    public static String y = v + "n Ch" + w + "ie" + x + " ";
    public static int H = -1;
    private static int bP = -192;
    public static ColorUtility ac = new ColorUtility(true);
    private static int[] bQ = new int[aU.uS];
    private static byte[] bR = new byte[aU.uS];
    private static int[] bS = new int[aU.uS];
    private static int[] bT = new int[aU.uS];
    private static int[] bU = new int[aU.uS];
    private static int[] bV = new int[aU.uS];
    static b aR = new b();
    static b aS = new b();
    static b aT = new b();
    static int aV = 3;
    static boolean[] aX = new boolean[8192];
    static boolean[] aY = new boolean[8192];
    static int[] aZ = new int[8192];
    static int[] ba = new int[8192];
    static int[] bb = new int[8192];
    static int[] bc = new int[8192];
    static int[] bd = new int[8192];
    static int[] be = new int[8192];
    static int[] bf = new int[8192];
    static int[] bg = new int[8192];
    static int[][] bh = new int[8192][512];
    static int[] bi = new int[12];
    static int[][] bj = new int[12][aU.uS];
    static int[] bk = new int[aU.uS];
    static int[] bl = new int[aU.uS];
    static int[] bm = new int[12];
    static int[] bn = new int[10];
    static int[] bo = new int[10];
    static int[] bp = new int[10];
    public static int[] bx = new int[1000];
    public static int[] by = new int[1000];
    public static int[] bz = new int[1000];
    public static int[] bA = class_332.v;
    public static int[] bB = class_332.w;
    static int[] bC = class_332.B;
    static int[] bD = class_332.u;

    public boolean d() {
        return this.av > 0;
    }

    public boolean a(int i) {
        if (!d() || this.ao == null || i >= this.ao.length || this.ao[i] <= 0) {
            return false;
        }
        return ((this.ao[i] & 1) != 1 || this.ao[i] >= 3) && this.ao[i] > 0;
    }

    public float a(int i, int i2) {
        return this.m[c(i, i2)];
    }

    public float b(int i, int i2) {
        return this.m[d(i, i2)];
    }

    public int c(int i, int i2) {
        return (i * 6) + i2;
    }

    public int d(int i, int i2) {
        return (i * 6) + i2 + 3;
    }

    public float[] e() {
        return this.m;
    }

    public void f() {
        int i;
        int i2;
        int i3;
        if (e.a() && this.m == null) {
            if (this.Z != null || d()) {
                if (this.i.f()) {
                    this.i.c();
                    this.m = this.i.n;
                } else {
                    this.m = new float[this.ah * 6];
                }
                for (int i4 = 0; i4 < this.ah; i4++) {
                    int i5 = this.Y == null ? -1 : this.Y[i4] & 65535;
                    boolean z = this.ao != null && (i5 == -1 || (this.Y != null && this.Y[i4] <= 0)) && a(i4);
                    if (z) {
                        i5 = this.ar[i4];
                    }
                    this.m[c(i4, 0)] = 1.0f;
                    this.m[d(i4, 0)] = 1.0f;
                    this.m[c(i4, 1)] = 1.0f;
                    this.m[d(i4, 1)] = 1.0f;
                    this.m[c(i4, 2)] = 0.0f;
                    this.m[d(i4, 2)] = 0.0f;
                    if (this.aq != null && this.aq[i4] == 255) {
                        i5 = -1;
                    }
                    if (i5 != -1) {
                        int i6 = z ? this.ao[i4] >> 2 : (this.Z == null || this.Z[i4] == -1) ? this.ai[i4] : this.Z[i4];
                        if (z && this.aw[this.ao[i4] >> 2] > this.ae.length) {
                            i6 = this.ai[i4];
                            z = false;
                        }
                        if (i6 != -1) {
                            int i7 = this.ai[i4];
                            int i8 = this.aj[i4];
                            int i9 = this.ak[i4];
                            if (z) {
                                i = this.aw[this.ao[i4] >> 2];
                                i2 = this.ax[this.ao[i4] >> 2];
                                i3 = this.ay[this.ao[i4] >> 2];
                            } else if (this.Z == null || this.Z[i4] < 0) {
                                i = this.ai[i4];
                                i2 = this.aj[i4];
                                i3 = this.ak[i4];
                            } else {
                                if (this.aw.length <= 0) {
                                    return;
                                }
                                i = this.aw[this.Z[i4]];
                                i2 = this.ax[this.Z[i4]];
                                i3 = this.ay[this.Z[i4]];
                            }
                            float f = this.ae[i];
                            float f2 = this.af[i];
                            float f3 = this.ag[i];
                            float f4 = this.ae[i2] - f;
                            float f5 = this.af[i2] - f2;
                            float f6 = this.ag[i2] - f3;
                            float f7 = this.ae[i3] - f;
                            float f8 = this.af[i3] - f2;
                            float f9 = this.ag[i3] - f3;
                            float f10 = this.ae[i7] - f;
                            float f11 = this.af[i7] - f2;
                            float f12 = this.ag[i7] - f3;
                            float f13 = this.ae[i8] - f;
                            float f14 = this.af[i8] - f2;
                            float f15 = this.ag[i8] - f3;
                            float f16 = this.ae[i9] - f;
                            float f17 = this.af[i9] - f2;
                            float f18 = this.ag[i9] - f3;
                            float f19 = (f5 * f9) - (f6 * f8);
                            float f20 = (f6 * f7) - (f4 * f9);
                            float f21 = (f4 * f8) - (f5 * f7);
                            float f22 = (f8 * f21) - (f9 * f20);
                            float f23 = (f9 * f19) - (f7 * f21);
                            float f24 = (f7 * f20) - (f8 * f19);
                            float f25 = 1.0f / (((f22 * f4) + (f23 * f5)) + (f24 * f6));
                            this.m[c(i4, 0)] = ((f22 * f10) + (f23 * f11) + (f24 * f12)) * f25;
                            this.m[c(i4, 1)] = ((f22 * f13) + (f23 * f14) + (f24 * f15)) * f25;
                            this.m[c(i4, 2)] = ((f22 * f16) + (f23 * f17) + (f24 * f18)) * f25;
                            float f26 = (f5 * f21) - (f6 * f20);
                            float f27 = (f6 * f19) - (f4 * f21);
                            float f28 = (f4 * f20) - (f5 * f19);
                            float f29 = 1.0f / (((f26 * f7) + (f27 * f8)) + (f28 * f9));
                            this.m[d(i4, 0)] = ((f26 * f10) + (f27 * f11) + (f28 * f12)) * f29;
                            this.m[d(i4, 1)] = ((f26 * f13) + (f27 * f14) + (f28 * f15)) * f29;
                            this.m[d(i4, 2)] = ((f26 * f16) + (f27 * f17) + (f28 * f18)) * f29;
                        } else {
                            continue;
                        }
                    }
                }
                this.l = true;
            }
        }
    }

    public static void g() {
        o = null;
        aX = null;
        aY = null;
        ba = null;
        bb = null;
        bd = null;
        be = null;
        bf = null;
        bg = null;
        bh = null;
        bi = null;
        bj = null;
        bk = null;
        bl = null;
        bm = null;
        bA = null;
        bB = null;
        bC = null;
        bD = null;
    }

    public m a(int i, int i2, int i3, int i4) {
        int[] iArr = new int[z()];
        int[] iArr2 = new int[z()];
        h.a(z(), i, i2, i4, i3, A(), C(), B(), iArr, iArr2);
        return rs.runelite.a.e.a(iArr, iArr2);
    }

    public Polygon b(int i, int i2, int i3, int i4) {
        ArrayList<o> arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.ad; i5++) {
            arrayList.add(new o(this.ae[i5], this.af[i5], this.ag[i5]).a(i4));
        }
        ArrayList arrayList2 = new ArrayList();
        for (o oVar : arrayList) {
            i iVarA = class_27.a(Launcher.n().o(), i - oVar.a(), i2 - oVar.c(), i3 + oVar.b());
            if (iVarA != null) {
                arrayList2.add(iVarA);
            }
        }
        List<i> listA = class_27.a(arrayList2);
        if (listA == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        for (i iVar : listA) {
            polygon.addPoint(iVar.a(), iVar.b());
        }
        return polygon;
    }

    public void a(int i, int i2, byte b) {
        this.L[i] = i2;
        this.M[i] = b;
    }

    public void e(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        if (this.ar == null) {
            return;
        }
        for (int i5 = 0; i5 < this.ar.length; i5++) {
            if (i == this.ar[i5]) {
                i3++;
            }
        }
        this.av = i3;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[i3];
        }
        this.aw = new int[i3];
        this.ax = new int[i3];
        this.ay = new int[i3];
        this.as = new boolean[this.ah];
        int i6 = 0;
        for (int i7 = 0; i7 < this.ah; i7++) {
            if (i == this.ar[i7]) {
                this.ar[i7] = i2;
                this.ao[i7] = 3 + i4;
                this.as[i7] = true;
                i4 += 4;
                this.aw[i6] = this.ai[i7];
                this.ax[i6] = this.aj[i7];
                this.ay[i6] = this.ak[i7];
                i6++;
            }
        }
    }

    public void a(int[] iArr, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.ar.length; i4++) {
            for (int i5 : iArr) {
                if (i5 == this.ar[i4]) {
                    i2++;
                }
            }
        }
        this.av = i2;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[i2];
        }
        this.aw = new int[i2];
        this.ax = new int[i2];
        this.ay = new int[i2];
        int i6 = 0;
        for (int i7 = 0; i7 < this.ah; i7++) {
            for (int i8 : iArr) {
                if (i8 == this.ar[i7]) {
                    this.ar[i7] = i;
                    this.ao[i7] = 3 + i3;
                    i3 += 4;
                    this.aw[i6] = this.ai[i7];
                    this.ax[i6] = this.aj[i7];
                    this.ay[i6] = this.ak[i7];
                    i6++;
                }
            }
        }
    }

    public void h() {
        HashMap map = new HashMap();
        int i = 0;
        String str = "";
        for (int i2 = 0; i2 < this.ah; i2++) {
            if (map.get(Integer.valueOf(this.ar[i2])) == null) {
                str = str + this.ar[i2] + ",";
                map.put(Integer.valueOf(this.ar[i2]), true);
                i++;
            }
        }
        System.out.println();
        System.out.println(str);
        System.out.println("Total colors: " + (i + 1));
        System.out.println();
    }

    public void a(Map<Integer, Boolean> map) {
        int i = 0;
        String str = "";
        for (int i2 = 0; i2 < this.ah; i2++) {
            try {
                if (map.get(Integer.valueOf(this.ar[i2])) == null) {
                    str = str + this.ar[i2] + ",";
                    map.put(Integer.valueOf(this.ar[i2]), true);
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public void a(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < this.ah; i2++) {
            int i3 = i;
            i++;
            this.ar[i2] = iArr[i3];
            if (i >= iArr.length) {
                i = 0;
            }
        }
    }

    public void a(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.ah; i3++) {
            if (i == this.ar[i3]) {
                int i4 = i2;
                i2++;
                this.ar[i3] = iArr[i4];
                if (i2 >= iArr.length) {
                    i2 = 0;
                }
            }
        }
    }

    public void a(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < this.ah; i2++) {
            for (int i3 : iArr) {
                if (i3 == this.ar[i2]) {
                    int i4 = i;
                    i++;
                    this.ar[i2] = iArr2[i4];
                    if (i >= iArr2.length) {
                        i = 0;
                    }
                }
            }
        }
    }

    public void b(int[] iArr, int[] iArr2) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.ar.length; i3++) {
            for (int i4 : iArr) {
                if (i4 == this.ar[i3]) {
                    i++;
                }
            }
        }
        this.av = i;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[i];
        }
        this.aw = new int[i];
        this.ax = new int[i];
        this.ay = new int[i];
        int i5 = 0;
        for (int i6 = 0; i6 < this.ah; i6++) {
            for (int i7 = 0; i7 < iArr.length; i7++) {
                if (iArr[i7] == this.ar[i6]) {
                    this.ar[i6] = iArr2[i7];
                    this.ao[i6] = 3 + i2;
                    i2 += 4;
                    this.aw[i5] = this.ai[i6];
                    this.ax[i5] = this.aj[i6];
                    this.ay[i5] = this.ak[i6];
                    i5++;
                }
            }
        }
    }

    public void b(int i) {
        this.av = this.ah;
        int i2 = 0;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[this.ah];
        }
        this.aw = new int[this.ah];
        this.ax = new int[this.ah];
        this.ay = new int[this.ah];
        for (int i3 = 0; i3 < this.ah; i3++) {
            this.ar[i3] = i;
            this.ao[i3] = 3 + i2;
            i2 += 4;
            this.aw[i3] = this.ai[i3];
            this.ax[i3] = this.aj[i3];
            this.ay[i3] = this.ak[i3];
        }
    }

    public void b(int[] iArr) {
        this.av = this.ah;
        int i = 0;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[this.ah];
        }
        this.aw = new int[this.ah];
        this.ax = new int[this.ah];
        this.ay = new int[this.ah];
        int i2 = 0;
        for (int i3 = 0; i3 < this.ah; i3++) {
            i2 = i2 >= iArr.length - 1 ? 0 : i2 + 1;
            this.ar[i3] = iArr[i2];
            this.ao[i3] = 3 + i;
            i += 4;
            this.aw[i3] = this.ai[i3];
            this.ax[i3] = this.aj[i3];
            this.ay[i3] = this.ak[i3];
        }
    }

    public void a(byte[] bArr, int i) {
        Buffer buffer = new Buffer(bArr);
        Buffer buffer2 = new Buffer(bArr);
        Buffer buffer3 = new Buffer(bArr);
        Buffer buffer4 = new Buffer(bArr);
        Buffer buffer5 = new Buffer(bArr);
        Buffer buffer6 = new Buffer(bArr);
        Buffer buffer7 = new Buffer(bArr);
        buffer.h = bArr.length - 26;
        int iO = buffer.o();
        int iO2 = buffer.o();
        int iY = buffer.y();
        int iY2 = buffer.y();
        int iY3 = buffer.y();
        int iY4 = buffer.y();
        int iY5 = buffer.y();
        int iY6 = buffer.y();
        int iY7 = buffer.y();
        int iY8 = buffer.y();
        int iO3 = buffer.o();
        int iO4 = buffer.o();
        int iO5 = buffer.o();
        int iO6 = buffer.o();
        int iO7 = buffer.o();
        int iO8 = buffer.o();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr2 = new byte[0];
        if (iY > 0) {
            bArr2 = new byte[iY];
            buffer.h = 0;
            for (int i5 = 0; i5 < iY; i5++) {
                byte bZ = buffer.z();
                bArr2[i5] = bZ;
                if (bZ == 0) {
                    i2++;
                }
                if (bZ >= 1 && bZ <= 3) {
                    i3++;
                }
                if (bZ == 2) {
                    i4++;
                }
            }
        }
        int i6 = iY + iO;
        if (iY2 == 1) {
            i6 += iO2;
        }
        int i7 = i6;
        int i8 = i6 + iO2;
        if (iY3 == 255) {
            i8 += iO2;
        }
        int i9 = i8;
        if (iY5 == 1) {
            i8 += iO2;
        }
        int i10 = i8;
        int i11 = i8 + iO8;
        if (iY4 == 1) {
            i11 += iO2;
        }
        int i12 = i11;
        int i13 = i11 + iO6;
        if (iY6 == 1) {
            i13 += iO2 * 2;
        }
        int i14 = i13;
        int i15 = i13 + iO7;
        int i16 = i15 + (iO2 * 2);
        int i17 = i16 + iO3;
        int i18 = i17 + iO4;
        int i19 = i18 + iO5;
        int i20 = i19 + (i2 * 6);
        int i21 = i20 + (i3 * 6);
        int i22 = i21 + (i3 * 6);
        int i23 = i22 + (i3 * 2);
        int i24 = i23 + i3;
        int i25 = i24 + (i3 * 2) + (i4 * 2);
        this.L = new int[iO];
        this.M = new byte[iO];
        this.ad = iO;
        this.ah = iO2;
        this.av = iY;
        this.ae = new int[iO];
        this.af = new int[iO];
        this.ag = new int[iO];
        this.ai = new int[iO2];
        this.aj = new int[iO2];
        this.ak = new int[iO2];
        if (iY7 == 1) {
            this.aJ = new int[iO];
        }
        if (iY2 == 1) {
            this.ao = new int[iO2];
        }
        if (iY3 == 255) {
            this.ap = new int[iO2];
        } else {
            this.au = (byte) iY3;
        }
        if (iY4 == 1) {
            this.aq = new int[iO2];
        }
        if (iY5 == 1) {
            this.aK = new int[iO2];
        }
        if (iY6 == 1) {
            this.Y = new short[iO2];
        }
        if (iY6 == 1 && iY > 0) {
            this.Z = new short[iO2];
        }
        if (iY8 == 1) {
            this.W = new int[iO][];
            this.X = new int[iO][];
        }
        this.ar = new int[iO2];
        if (iY > 0) {
            this.aw = new int[iY];
            this.ax = new int[iY];
            this.ay = new int[iY];
        }
        buffer.h = iY;
        buffer2.h = i16;
        buffer3.h = i17;
        buffer4.h = i18;
        buffer5.h = i10;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < iO; i29++) {
            int iY9 = buffer.y();
            int iN = (iY9 & 1) != 0 ? buffer2.n() : 0;
            int iN2 = (iY9 & 2) != 0 ? buffer3.n() : 0;
            int iN3 = (iY9 & 4) != 0 ? buffer4.n() : 0;
            this.ae[i29] = i26 + iN;
            this.af[i29] = i27 + iN2;
            this.ag[i29] = i28 + iN3;
            i26 = this.ae[i29];
            i27 = this.af[i29];
            i28 = this.ag[i29];
            if (iY7 == 1) {
                this.aJ[i29] = buffer5.y();
            }
        }
        if (iY8 == 1) {
            for (int i30 = 0; i30 < iO; i30++) {
                int iY10 = buffer5.y();
                this.W[i30] = new int[iY10];
                this.X[i30] = new int[iY10];
                for (int i31 = 0; i31 < iY10; i31++) {
                    this.W[i30][i31] = buffer5.y();
                    this.X[i30][i31] = buffer5.y();
                }
            }
        }
        buffer.h = i15;
        buffer2.h = i6;
        buffer3.h = i8;
        buffer4.h = i11;
        buffer5.h = i9;
        buffer6.h = i13;
        buffer7.h = i14;
        int i32 = 0;
        while (i32 < iO2) {
            this.ar[i32] = (short) buffer.o();
            if (iY2 == 1) {
                this.ao[i32] = buffer2.z();
            }
            if (iY3 == 255) {
                this.ap[i32] = buffer3.z();
            }
            if (iY4 == 1) {
                this.aq[i32] = buffer4.z();
                if (this.aq[i32] < 0) {
                    this.aq[i32] = 256 + this.aq[i32];
                }
            }
            if (iY5 == 1) {
                this.aK[i32] = buffer5.y();
            }
            if (iY6 == 1) {
                this.Y[i32] = (byte) (buffer6.o() - 1);
                if (this.Y[i32] != -1) {
                    if (this.Y[i32] == 90 || this.Y[i32] == 96 || this.Y[i32] == 97 || this.Y[i32] == 116) {
                        this.Y[i32] = -1;
                    } else if (this.Y[i32] == 60) {
                        this.Y[i32] = 8;
                    }
                }
            }
            if (this.Z != null && this.Y[i32] != -1) {
                this.Z[i32] = (byte) (buffer7.y() - 1);
            }
            i32++;
        }
        buffer.h = i12;
        buffer2.h = i7;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        int i33 = 0;
        for (int i34 = 0; i34 < iO2; i34++) {
            int iY11 = buffer2.y();
            if (iY11 == 1) {
                iN4 = buffer.n() + i33;
                iN5 = buffer.n() + iN4;
                iN6 = buffer.n() + iN5;
                i33 = iN6;
                this.ai[i34] = iN4;
                this.aj[i34] = iN5;
                this.ak[i34] = iN6;
            }
            if (iY11 == 2) {
                iN5 = iN6;
                iN6 = buffer.n() + i33;
                i33 = iN6;
                this.ai[i34] = iN4;
                this.aj[i34] = iN5;
                this.ak[i34] = iN6;
            }
            if (iY11 == 3) {
                iN4 = iN6;
                iN6 = buffer.n() + i33;
                i33 = iN6;
                this.ai[i34] = iN4;
                this.aj[i34] = iN5;
                this.ak[i34] = iN6;
            }
            if (iY11 == 4) {
                int i35 = iN4;
                iN4 = iN5;
                iN5 = i35;
                iN6 = buffer.n() + i33;
                i33 = iN6;
                this.ai[i34] = iN4;
                this.aj[i34] = i35;
                this.ak[i34] = iN6;
            }
        }
        buffer.h = i19;
        buffer2.h = i20;
        buffer3.h = i21;
        buffer4.h = i22;
        buffer5.h = i23;
        buffer6.h = i24;
        for (int i36 = 0; i36 < iY; i36++) {
            if ((bArr2[i36] & 255) == 0) {
                this.aw[i36] = (short) buffer.o();
                this.ax[i36] = (short) buffer.o();
                this.ay[i36] = (short) buffer.o();
            }
        }
        buffer.h = i25;
        if (buffer.y() != 0) {
            buffer.o();
            buffer.o();
            buffer.o();
            buffer.p();
        }
    }

    public void b(byte[] bArr, int i) {
        boolean z = false;
        boolean z2 = false;
        Buffer buffer = new Buffer(bArr);
        Buffer buffer2 = new Buffer(bArr);
        Buffer buffer3 = new Buffer(bArr);
        Buffer buffer4 = new Buffer(bArr);
        Buffer buffer5 = new Buffer(bArr);
        buffer.h = bArr.length - 23;
        int iA = buffer.A();
        int iA2 = buffer.A();
        int iY = buffer.y();
        int iY2 = buffer.y();
        int iY3 = buffer.y();
        int iY4 = buffer.y();
        int iY5 = buffer.y();
        int iY6 = buffer.y();
        int iY7 = buffer.y();
        int iA3 = buffer.A();
        int iA4 = buffer.A();
        int iA5 = buffer.A();
        int iA6 = buffer.A();
        int iA7 = buffer.A();
        class_649[] class_649VarArrJ = j();
        class_649 class_649Var = new class_649();
        class_649VarArrJ[i] = class_649Var;
        class_649Var.a = bArr;
        class_649Var.b = iA;
        class_649Var.c = iA2;
        class_649Var.d = iY;
        int i2 = 0 + iA;
        int i3 = i2 + iA2;
        if (iY3 == 255) {
            i3 += iA2;
        }
        int i4 = i3;
        if (iY5 == 1) {
            i3 += iA2;
        }
        int i5 = i3;
        if (iY2 == 1) {
            i3 += iA2;
        }
        int i6 = i3;
        int i7 = i3 + iA7;
        if (iY4 == 1) {
            i7 += iA2;
        }
        int i8 = i7;
        int i9 = i7 + iA6;
        int i10 = i9 + (iA2 * 2);
        int i11 = i10 + (iY * 6);
        int i12 = i11 + iA3;
        int i13 = i12 + iA4;
        int i14 = i13 + iA5;
        this.ad = iA;
        this.ah = iA2;
        this.av = iY;
        this.L = new int[iA];
        this.M = new byte[iA];
        this.ae = new int[iA];
        this.af = new int[iA];
        this.ag = new int[iA];
        this.ai = new int[iA2];
        this.aj = new int[iA2];
        this.ak = new int[iA2];
        if (this.av > 0) {
            this.aw = new int[iY];
            this.ax = new int[iY];
            this.ay = new int[iY];
        }
        if (iY6 == 1) {
            this.aJ = new int[iA];
        }
        if (iY2 == 1) {
            this.ao = new int[iA2];
            this.Z = new short[iA2];
            this.Y = new short[iA2];
        }
        if (iY3 == 255) {
            this.ap = new int[iA2];
        } else {
            this.au = (byte) iY3;
        }
        if (iY4 == 1) {
            this.aq = new int[iA2];
        }
        if (iY5 == 1) {
            this.aK = new int[iA2];
        }
        if (iY7 == 1) {
            this.W = new int[iA][];
            this.X = new int[iA][];
        }
        this.ar = new int[iA2];
        buffer.h = 0;
        buffer2.h = i11;
        buffer3.h = i12;
        buffer4.h = i13;
        buffer5.h = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < iA; i18++) {
            int iY8 = buffer.y();
            int iN = (iY8 & 1) != 0 ? buffer2.n() : 0;
            int iN2 = (iY8 & 2) != 0 ? buffer3.n() : 0;
            int iN3 = (iY8 & 4) != 0 ? buffer4.n() : 0;
            this.ae[i18] = i15 + iN;
            this.af[i18] = i16 + iN2;
            this.ag[i18] = i17 + iN3;
            i15 = this.ae[i18];
            i16 = this.af[i18];
            i17 = this.ag[i18];
            if (iY6 == 1) {
                this.aJ[i18] = buffer5.y();
            }
        }
        if (iY7 == 1) {
            for (int i19 = 0; i19 < iA; i19++) {
                int iY9 = buffer5.y();
                this.W[i19] = new int[iY9];
                this.X[i19] = new int[iY9];
                for (int i20 = 0; i20 < iY9; i20++) {
                    this.W[i19][i20] = buffer5.y();
                    this.X[i19][i20] = buffer5.y();
                }
            }
        }
        buffer.h = i9;
        buffer2.h = i5;
        buffer3.h = i3;
        buffer4.h = i7;
        buffer5.h = i4;
        for (int i21 = 0; i21 < iA2; i21++) {
            this.ar[i21] = (short) buffer.o();
            if (iY2 == 1) {
                int iY10 = buffer2.y();
                if ((iY10 & 1) == 1) {
                    this.ao[i21] = 1;
                    z = true;
                } else {
                    this.ao[i21] = 0;
                }
                if ((iY10 & 2) == 2) {
                    this.Z[i21] = (byte) (iY10 >> 2);
                    this.Y[i21] = (short) this.ar[i21];
                    this.ar[i21] = 127;
                    if (this.Y[i21] != -1) {
                        z2 = true;
                    }
                } else {
                    this.Z[i21] = -1;
                    this.Y[i21] = -1;
                }
            }
            if (iY3 == 255) {
                this.ap[i21] = buffer3.z();
            }
            if (iY4 == 1) {
                this.aq[i21] = buffer4.z();
                if (this.aq[i21] < 0) {
                    this.aq[i21] = 256 + this.aq[i21];
                }
            }
            if (iY5 == 1) {
                this.aK[i21] = buffer5.y();
            }
        }
        buffer.h = i8;
        buffer2.h = i2;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < iA2; i23++) {
            int iY11 = buffer2.y();
            if (iY11 == 1) {
                iN4 = buffer.n() + i22;
                iN5 = buffer.n() + iN4;
                iN6 = buffer.n() + iN5;
                i22 = iN6;
                this.ai[i23] = iN4;
                this.aj[i23] = iN5;
                this.ak[i23] = iN6;
            }
            if (iY11 == 2) {
                iN5 = iN6;
                iN6 = buffer.n() + i22;
                i22 = iN6;
                this.ai[i23] = iN4;
                this.aj[i23] = iN5;
                this.ak[i23] = iN6;
            }
            if (iY11 == 3) {
                iN4 = iN6;
                iN6 = buffer.n() + i22;
                i22 = iN6;
                this.ai[i23] = iN4;
                this.aj[i23] = iN5;
                this.ak[i23] = iN6;
            }
            if (iY11 == 4) {
                int i24 = iN4;
                iN4 = iN5;
                iN5 = i24;
                iN6 = buffer.n() + i22;
                i22 = iN6;
                this.ai[i23] = iN4;
                this.aj[i23] = i24;
                this.ak[i23] = iN6;
            }
        }
        buffer.h = i10;
        for (int i25 = 0; i25 < iY; i25++) {
            this.aw[i25] = (short) buffer.o();
            this.ax[i25] = (short) buffer.o();
            this.ay[i25] = (short) buffer.o();
        }
        if (this.Z != null) {
            boolean z3 = false;
            for (int i26 = 0; i26 < iA2; i26++) {
                int i27 = this.Z[i26] & 255;
                if (i27 != 255) {
                    if (this.ai[i26] == (this.aw[i27] & 65535) && this.aj[i26] == (this.ax[i27] & 65535) && this.ak[i26] == (this.ay[i27] & 65535)) {
                        this.Z[i26] = -1;
                    } else {
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                this.Z = null;
            }
        }
        if (!z2) {
            this.Y = null;
        }
        if (z) {
            return;
        }
        this.ao = null;
    }

    public void c(byte[] bArr, int i) {
        Buffer buffer = new Buffer(bArr);
        Buffer buffer2 = new Buffer(bArr);
        Buffer buffer3 = new Buffer(bArr);
        Buffer buffer4 = new Buffer(bArr);
        Buffer buffer5 = new Buffer(bArr);
        Buffer buffer6 = new Buffer(bArr);
        Buffer buffer7 = new Buffer(bArr);
        buffer.h = bArr.length - 23;
        int iA = buffer.A();
        int iA2 = buffer.A();
        int iY = buffer.y();
        class_649[] class_649VarArrJ = j();
        class_649 class_649Var = new class_649();
        class_649VarArrJ[i] = class_649Var;
        class_649Var.a = bArr;
        class_649Var.b = iA;
        class_649Var.c = iA2;
        class_649Var.d = iY;
        int iY2 = buffer.y();
        boolean z = ((1 & iY2) ^ (-1)) == -2;
        boolean z2 = ((iY2 & 2) ^ (-1)) == -3;
        int iY3 = buffer.y();
        int iY4 = buffer.y();
        int iY5 = buffer.y();
        int iY6 = buffer.y();
        int iY7 = buffer.y();
        int iA3 = buffer.A();
        int iA4 = buffer.A();
        int iA5 = buffer.A();
        int iA6 = buffer.A();
        int iA7 = buffer.A();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        if (iY > 0) {
            bArr3 = new byte[iY];
            buffer.h = 0;
            for (int i5 = 0; i5 < iY; i5++) {
                byte bZ = buffer.z();
                bArr3[i5] = bZ;
                if (bZ == 0) {
                    i2++;
                }
                if (bZ >= 1 && bZ <= 3) {
                    i3++;
                }
                if (bZ == 2) {
                    i4++;
                }
            }
        }
        int i6 = iY + iA;
        if (iY2 == 1) {
            i6 += iA2;
        }
        int i7 = i6;
        int i8 = i6 + iA2;
        if (iY3 == 255) {
            i8 += iA2;
        }
        int i9 = i8;
        if (iY5 == 1) {
            i8 += iA2;
        }
        int i10 = i8;
        if (iY7 == 1) {
            i8 += iA;
        }
        int i11 = i8;
        if (iY4 == 1) {
            i8 += iA2;
        }
        int i12 = i8;
        int i13 = i8 + iA6;
        if (iY6 == 1) {
            i13 += iA2 * 2;
        }
        int i14 = i13;
        int i15 = i13 + iA7;
        int i16 = i15 + (iA2 * 2);
        int i17 = i16 + iA3;
        int i18 = i17 + iA4;
        int i19 = i18 + iA5;
        int i20 = i19 + (i2 * 6);
        int i21 = i20 + (i3 * 6);
        int i22 = i21 + (i3 * 6);
        int i23 = i22 + i3;
        int i24 = i23 + i3;
        int i25 = i24 + i3 + (i4 * 2);
        this.L = Configuration.ah ? new int[0] : new int[iA];
        this.M = new byte[iA];
        int[] iArr = new int[iA];
        int[] iArr2 = new int[iA];
        int[] iArr3 = new int[iA];
        int[] iArr4 = new int[iA2];
        int[] iArr5 = new int[iA2];
        int[] iArr6 = new int[iA2];
        this.aJ = new int[iA];
        this.ao = new int[iA2];
        this.ap = new int[iA2];
        this.aq = new int[iA2];
        this.aK = new int[iA2];
        if (iY7 == 1) {
            this.aJ = new int[iA];
        }
        if (z) {
            this.ao = new int[iA2];
        }
        if (iY3 == 255) {
            this.ap = new int[iA2];
        } else {
            this.au = (byte) iY3;
        }
        if (iY4 == 1) {
            this.aq = new int[iA2];
        }
        if (iY5 == 1) {
            this.aK = new int[iA2];
        }
        short[] sArr = iY6 == 1 ? new short[iA2] : null;
        if (iY6 == 1 && iY > 0) {
            bArr2 = new byte[iA2];
        }
        int[] iArr7 = new int[iA2];
        buffer.h = iY;
        buffer2.h = i16;
        buffer3.h = i17;
        buffer4.h = i18;
        buffer5.h = i10;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < iA; i29++) {
            int iY8 = buffer.y();
            int iL = (iY8 & 1) != 0 ? buffer2.L() : 0;
            int iL2 = (iY8 & 2) != 0 ? buffer3.L() : 0;
            int iL3 = (iY8 & 4) != 0 ? buffer4.L() : 0;
            iArr[i29] = i26 + iL;
            iArr2[i29] = i27 + iL2;
            iArr3[i29] = i28 + iL3;
            i26 = iArr[i29];
            i27 = iArr2[i29];
            i28 = iArr3[i29];
            if (this.aJ != null) {
                this.aJ[i29] = buffer5.y();
            }
        }
        buffer.h = i15;
        buffer2.h = i6;
        buffer3.h = i8;
        buffer4.h = i11;
        buffer5.h = i9;
        buffer6.h = i13;
        buffer7.h = i14;
        for (int i30 = 0; i30 < iA2; i30++) {
            iArr7[i30] = buffer.A();
            if (iY2 == 1) {
                this.ao[i30] = buffer2.z();
                if (this.ao[i30] == 2) {
                    iArr7[i30] = 65535;
                }
                this.ao[i30] = 0;
            }
            if (iY3 == 255) {
                this.ap[i30] = buffer3.z();
            }
            if (iY4 == 1) {
                this.aq[i30] = buffer4.z();
                if (this.aq[i30] < 0) {
                    this.aq[i30] = 256 + this.aq[i30];
                }
            }
            if (iY5 == 1) {
                this.aK[i30] = buffer5.y();
            }
            if (iY6 == 1) {
                sArr[i30] = (short) (buffer6.A() - 1);
            }
            if (bArr2 != null) {
                if (sArr[i30] != -1) {
                    bArr2[i30] = (byte) (buffer7.y() - 1);
                } else {
                    bArr2[i30] = -1;
                }
            }
        }
        buffer.h = i12;
        buffer2.h = i7;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        int i31 = 0;
        for (int i32 = 0; i32 < iA2; i32++) {
            int iY9 = buffer2.y();
            if (iY9 == 1) {
                iL4 = buffer.L() + i31;
                iL5 = buffer.L() + iL4;
                iL6 = buffer.L() + iL5;
                i31 = iL6;
                iArr4[i32] = iL4;
                iArr5[i32] = iL5;
                iArr6[i32] = iL6;
            }
            if (iY9 == 2) {
                iL5 = iL6;
                iL6 = buffer.L() + i31;
                i31 = iL6;
                iArr4[i32] = iL4;
                iArr5[i32] = iL5;
                iArr6[i32] = iL6;
            }
            if (iY9 == 3) {
                iL4 = iL6;
                iL6 = buffer.L() + i31;
                i31 = iL6;
                iArr4[i32] = iL4;
                iArr5[i32] = iL5;
                iArr6[i32] = iL6;
            }
            if (iY9 == 4) {
                int i33 = iL4;
                iL4 = iL5;
                iL5 = i33;
                iL6 = buffer.L() + i31;
                i31 = iL6;
                iArr4[i32] = iL4;
                iArr5[i32] = iL5;
                iArr6[i32] = iL6;
            }
        }
        buffer.h = i19;
        buffer2.h = i20;
        buffer3.h = i21;
        buffer4.h = i22;
        buffer5.h = i23;
        buffer6.h = i24;
        for (int i34 = 0; i34 < iY; i34++) {
            int i35 = bArr3[i34] & 255;
            if (i35 == 0) {
                buffer.A();
                buffer.A();
                buffer.A();
            }
            if (i35 == 1) {
                buffer2.A();
                buffer2.A();
                buffer2.A();
                buffer3.A();
                buffer3.A();
                buffer3.A();
                buffer4.z();
                buffer5.z();
                buffer6.z();
            }
            if (i35 == 2) {
                buffer2.A();
                buffer2.A();
                buffer2.A();
                buffer3.A();
                buffer3.A();
                buffer3.A();
                buffer4.z();
                buffer5.z();
                buffer6.z();
                buffer6.z();
                buffer6.z();
            }
            if (i35 == 3) {
                buffer2.A();
                buffer2.A();
                buffer2.A();
                buffer3.A();
                buffer3.A();
                buffer3.A();
                buffer4.z();
                buffer5.z();
                buffer6.z();
            }
        }
        if (iY3 != 255) {
            for (int i36 = 0; i36 < iA2; i36++) {
                this.ap[i36] = iY3;
            }
        }
        this.ar = iArr7;
        this.ad = iA;
        this.ah = iA2;
        this.ae = iArr;
        this.af = iArr2;
        this.ag = iArr3;
        this.ai = iArr4;
        this.aj = iArr5;
        this.ak = iArr6;
    }

    public boolean i() {
        return this.k == 1 || this.bJ == 2467 || this.bJ == 42467;
    }

    public ColorUtility(int i) {
        this(i, h);
    }

    public ColorUtility(int i, class_49 class_49Var) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bJ = i;
        byte[] bArr = j()[i].a;
        if (bArr.length > 0) {
            if (bArr[bArr.length - 1] == -3 && bArr[bArr.length - 2] == -1) {
                a(bArr, i);
                this.k = 3;
            } else if (bArr[bArr.length - 1] == -2 && bArr[bArr.length - 2] == -1) {
                b(bArr, i);
                this.k = 2;
            } else if (bArr[bArr.length - 1] == -1 && bArr[bArr.length - 2] == -1) {
                class_54.a();
                a(bArr, i, class_49Var);
                this.k = 1;
            } else {
                this.k = 0;
                class_54.a();
                b(i, class_49Var);
            }
        }
        if (p[i]) {
            b(32, 32, 32);
            a(0, 6, 0);
        }
        if (i == 2361) {
            this.ap = new int[this.ah];
            for (int i2 = 0; i2 < this.ah; i2++) {
                this.ap[i2] = 10;
            }
        }
        if ((p[i] || i == 2467 || i == 42467) && bG >= 0 && this.ap != null) {
            for (int i3 = 0; i3 < this.ap.length; i3++) {
                switch (bG) {
                    case 0:
                        if ((i == 62739 || i == 62756) && this.ap[i3] == 0) {
                            this.ap[i3] = 7;
                        }
                        break;
                    case 1:
                        this.ap[i3] = 10;
                        break;
                    case 4:
                        if (this.ap[i3] == 5) {
                            this.ap[i3] = 3;
                        }
                        if (this.ap[i3] == 0) {
                            this.ap[i3] = 4;
                        }
                        break;
                    case 7:
                        if (this.ap[i3] == 4) {
                            this.ap[i3] = 2;
                        }
                        if (this.ap[i3] == 0) {
                            this.ap[i3] = 10;
                        }
                        break;
                }
            }
        }
        if (!Configuration.ah) {
            if (i == 41893 || i == 41895 || i == 49546 || i == 41886 || i == 49560 || i == 41890 || i == 49554) {
                int i4 = 15;
                int i5 = (i == 41895 || i == 49546) ? 19 : 25;
                if (i == 41886 || i == 49560) {
                    i5 = 30;
                    i4 = 14;
                }
                if (i == 41890 || i == 49554) {
                    i5 = 17;
                    i4 = 10;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < this.L.length; i7++) {
                    if (i6 < i4) {
                        i6++;
                    } else {
                        i6 = 0;
                        a(i7, i5 + 1, (byte) 2);
                    }
                }
            }
            if (i == 42671) {
                int i8 = 0;
                for (int i9 = 0; i9 < this.L.length; i9++) {
                    if (i8 < 2) {
                        i8++;
                    } else {
                        i8 = 0;
                        a(i9, 2, (byte) 1);
                    }
                }
            }
            if (i == 56202 || i == 56208) {
                int i10 = 0;
                for (int i11 = 0; i11 < this.L.length; i11++) {
                    if (i10 < 4) {
                        i10++;
                    } else {
                        i10 = 0;
                        a(i11, (i == 56202 ? 26 : 29) + 1, (byte) 0);
                    }
                }
            }
            if (i == 42001 || i == 42002) {
                for (int i12 = 10; i12 < 60; i12++) {
                    if ((i12 < 20 || i12 > 40) && ((i12 < 10 || i12 > 15) && i12 != 19)) {
                        a(i12, (i == 42001 ? 26 : 29) + 1, (byte) 0);
                    }
                }
            }
            if (i >= 56203 && i <= 56207) {
                int i13 = 0;
                for (int i14 = 0; i14 < this.L.length; i14++) {
                    if (i13 < 6) {
                        i13++;
                    } else {
                        i13 = 0;
                        a(i14, 27 + 1, (byte) 0);
                    }
                }
            }
            if (i == 22012) {
                for (int i15 = 0; i15 < this.L.length; i15++) {
                    a(i15, 17 + 1, (byte) 0);
                }
            }
            if (i == 42669) {
                for (int i16 = 0; i16 < this.L.length; i16++) {
                    if (i16 % 2 != 0) {
                        a(i16, 21 + 1, (byte) 0);
                    }
                }
            }
            if (i == 41037 || i == 41038) {
                for (int i17 = 0; i17 < this.L.length; i17++) {
                    if (i17 % 4 != 0) {
                        this.L[i17] = 23;
                    }
                }
            }
            if (i == 48626) {
                for (int i18 = 0; i18 < this.L.length; i18++) {
                    if (i18 % 4 != 0) {
                        this.L[i18] = 24;
                    }
                }
            }
            if (i == 40024) {
                for (int i19 = 60; i19 < 65; i19++) {
                    this.L[i19] = 3 + 1;
                }
                int i20 = 0;
                for (int i21 = 0; i21 < 40; i21++) {
                    if (i21 <= 50 && i21 % 2 != 0) {
                        if (i20 < ((i == 40319 || i == 40318) ? 3 : 1)) {
                            i20++;
                        } else {
                            i20 = 0;
                            this.L[i21] = 3 + 1;
                        }
                    }
                }
            }
            if (i == 40948 || i == 40947 || i == 40946) {
                int i22 = 0;
                int i23 = i == 40946 ? 13 : i == 40947 ? 2 : 26;
                for (int i24 = 0; i24 < 168; i24++) {
                    if (i22 == 3) {
                        this.L[i24] = i23 + 1;
                        i22 = 0;
                    } else {
                        i22++;
                    }
                }
            }
            if (i >= 40949 && i <= 40954) {
                int i25 = 0;
                int i26 = (i == 40949 || i == 40950) ? 13 : (i == 40953 || i == 40954) ? 19 : 26;
                for (int i27 = 0; i27 < this.L.length; i27++) {
                    if (i25 == 20) {
                        this.L[i27] = i26 + 1;
                        i25 = 0;
                    } else {
                        i25++;
                    }
                }
            }
            if (i == 209 || i == 386) {
                int i28 = 0;
                for (int i29 = 0; i29 < this.L.length; i29++) {
                    if (i28 == 2) {
                        this.L[i29] = 13 + 1;
                        if (Client.d(3) == 1) {
                            this.L[i29] = 18;
                        }
                        i28 = 0;
                    } else {
                        i28++;
                    }
                }
            }
            if (i == 40319 || i == 40318) {
                int i30 = (i == 40019 || i == 40018) ? 2 : 11;
                for (int i31 = 60; i31 < 65; i31++) {
                    this.L[i31] = i30 + 1;
                }
                int i32 = 0;
                for (int i33 = 0; i33 < 40; i33++) {
                    if (i33 <= 50) {
                        if (i32 < ((i == 40319 || i == 40318) ? 3 : 1)) {
                            i32++;
                        } else {
                            i32 = 0;
                            this.L[i33] = i30 + 1;
                        }
                    }
                }
            }
            if (i == 41052) {
                for (int i34 = 0; i34 < this.L.length; i34++) {
                    if (i34 % 4 != 0) {
                        this.L[i34] = 2;
                    }
                }
            }
            if (i == 44403) {
                for (int i35 = 0; i35 < this.L.length; i35++) {
                    if (i35 % 4 != 0 && i35 % 2 != 0) {
                        this.L[i35] = 23;
                    }
                }
            }
            if (i == 50939) {
                int i36 = 0;
                for (int i37 = 0; i37 < 130; i37++) {
                    if (i36 != 2) {
                        i36++;
                    } else {
                        i36 = 0;
                        this.L[i37] = 21;
                    }
                }
            }
            if (i == 47780) {
                int i38 = 0;
                for (int i39 = 0; i39 < 30; i39++) {
                    if (i38 != 10) {
                        i38++;
                    } else {
                        this.L[i39] = 19;
                    }
                }
            }
            int[][] iArrA = class_592.a(i);
            if (iArrA != null) {
                for (int[] iArr : iArrA) {
                    if (iArr[0] == -1) {
                        for (int i40 = 0; i40 < this.ai.length; i40++) {
                            this.L[this.ai[i40]] = iArr[1] + 1;
                        }
                    } else if (iArr[0] == -2) {
                        for (int i41 = 0; i41 < this.aj.length; i41++) {
                            this.L[this.aj[i41]] = iArr[1] + 1;
                        }
                    } else if (iArr[0] == -3) {
                        for (int i42 = 0; i42 < this.ak.length; i42++) {
                            this.L[this.ak[i42]] = iArr[1] + 1;
                        }
                    } else if (iArr[0] == -4) {
                        for (int i43 = 0; i43 < this.ai.length; i43++) {
                            this.L[this.ai[i43]] = iArr[1] + 1;
                        }
                        for (int i44 = 0; i44 < this.aj.length; i44++) {
                            this.L[this.aj[i44]] = iArr[1] + 1;
                        }
                        for (int i45 = 0; i45 < this.ak.length; i45++) {
                            this.L[this.ak[i45]] = iArr[1] + 1;
                        }
                    } else {
                        this.L[iArr[0]] = iArr[1] + 1;
                    }
                }
            }
        }
        if (i == 40017) {
            e(127, Configuration.aQ ? 57 : 117);
        }
        if (i == 40019 || i == 40018 || i == 40319 || i == 40318 || i == 40024) {
            this.av = 3;
            this.ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
            this.ar = new int[]{aU.yn, aU.yx, 8, 8, 8, 12, 924, 924, 924, 924, 924, 924, 924, 924, aU.yn, aU.yn, 924, 924, 8, 8, 12, 12, 924, 924, 924, 12, 127, 127, 127, 12, 924, 924, 924, 924, 924, 924, 12, 8, 924, 924, 924, 8, 8, 8, 924, 924, 924, 8, 8, 8, 924, 924, 8, 8, 924, 924, 8, 8, 8, 924, 924, 924, 924, 8, 8, 8, 924, 924, 8, 8, 924, 924, 8, 8, 8, 924, 924, 924, 8, 8, 12, 12, 8, 924, 924, 924, 924, 924, 8, 8, aU.yx, aU.yn, 924, 924, 924, 924, 8, aU.yn, 924, 924, aU.yn, 12, 12, 924, 924, 924, 12, 12, 8, 8, 8, 924, 924, 924, 924, 924, 924, 12, 12, 8, 924, 924, 8, 12, 127, 127, 127, 127, 924, 924, 924, 924, 924, 8, 8, 12, 12, 924, 924, 924, 924, 12, 12, 12, 8, 924, 924, 924, 924, 127, 127, 12, 12, 924, 924, 924, 127, 12, 12, 12, 924, 924, 924, 924, 12, 12, 924, 924, 12, 12, 12, 12, 12, 924, 924, 924, 924, 12, 12, 12, 924, 924, 12, aU.yn, aU.yn, 8, 8, aU.yn, aU.yn, 924, 924, 924, 924, 924, 924, 924, aU.vy, aU.vy, 924, 8, 12, 12, 12, 8, 924, 924, 924, 924, 8, 8, 924, 924, 8, 8, aU.vy, aU.vy, 924, 924, 924, 127, 127, 127, 127, 127, 127, 127, 924, 924, 924, 924, 924, 924, 924, 924, 8, 12, 12, 924, 924, 924, 20, 12, 24, 24, 24, 924, 924, 924, 924, 924, 12, 24, 924, 924, 24, 28, 28, 28, 28, 924, 924, 924, 924, 924, 28, 28, 924, 924, 28, 20, 924, 924, 20, 16, 924, 924, 16, 8, 924, 924, 8, 8, 924, 924, 924, 8, 8, 12, 20, 924, 924, 924, 16, 16, 20, 20, 924, 924, 924, 127, 8, 8, 8, 924, 924, 924, 924, 924, 127, 8, 8, 20, 20, 924, 924, 924, 20, 20, 924, 924, 20, 12, 924, 924, 12, 12, 24, 24, 924, 924, 924, 924, 12, 24, 924, 924, 24, 28, 924, 924, 28, 20, 924, 127, 924, 924, 127, 127, 924, 924, 127, 127, 924, 924, 127, 127, 127, 924, 924, 924, 127, 127, 127, 924, 924, 24, 924, 924, 28, 28, 924, 20, 20, 924, 924, 12, 924, 924, 24, 924, 924, 12, 16, 924, 12, 20, 20, 20, 16, 16, 924, 924, 924, 924, 924, 924, 924, 924, 8, 8, 8, 8, 924, 924, 924, 16, 24, 28, 28, 924, 924, 924, 20, 28, 924, 924, 924, 20, 16, 16, 924, 924, 20, 924, 8, 924, 924, 924, 924, 924, 924, 924, 0};
            this.aw = new int[]{133, 130, 132};
            this.ax = new int[]{134, 131, 136};
            this.ay = new int[]{135, 132, 133};
            this.Y = new short[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, 59, 59, -1, -1, 59, 59, -1, -1, 59, 59, 59, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            this.Z = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.aa = new byte[]{0, 0, 0};
            for (int i46 = 0; i46 < this.Y.length; i46++) {
                if (this.Y[i46] != -1) {
                    if (i == 40319 || i == 40318) {
                        this.Y[i46] = 64;
                    } else if (i == 40024) {
                        this.Y[i46] = 66;
                    } else {
                        this.Y[i46] = (short) (Configuration.aQ ? 57 : 117);
                    }
                    this.ar[i46] = this.Y[i46];
                }
            }
            for (int i47 = 0; i47 < this.ar.length; i47++) {
                if (this.ar[i47] == 0) {
                    this.ar[i47] = 65535;
                }
            }
        }
        if (i == 32815) {
            e(127, 57);
        }
        if (i == 32809) {
            this.av = 3;
            this.ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
            this.ar = new int[]{24, 24, 0, 0, 0, 24, 24, 24, 12, 24, 24, 12, 24, 24, 24, 24, 24, 24, 0, 0, 24, 24, 24, 24, 0, 0, 24, 24, 24, 24, 24, 24, 12, 24, 41, 12, 12, 12, 12, 12, 12, 41, 41, 24, 12, 24, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 0, 24, 24, 12, 24, 0, 0, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 24, 24, 0, 24, 24, 12, 12, 12, 24, 24, 24, 24, 24, 24, 24, 24, 0, 24, 24, 24, 12, 41, 41, 33, 33, 33, 41, 41, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 41, 41, 41, 41, 20, 20, 902, 902, 902, 902, 902, 902, 0, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0, 902, 902, 902, 902, 902, 20, 20, 33, 33, 945, 945, 945, 945, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 20, 20, 20, 20, 12, 12, 12, 12, 12, 0, 0, 0, 0, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0, 0, 33, -22479, 41, 12, 12, 12, 902, 12, 20, 20, 20, 20, 33, 33, 33, 41, 41, 0, 33, 33, 33, 41, 12, 12, 12, 24, 24, 8, 8, 33, 33, 960, 960, 960, 33, 33, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 41, 41, 41, 33, 33, 960, 968, 978, 978, 968, 33, -22479, 41, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 0, 0, 24, 24, 24, 24, 0, 0, 12, 12, 12, 0, 24, 24, 24, 24, 24, User32.WM_MOUSEWHEEL, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 24, 0, 41, 24, 12, 12, 12, 12, 12, 0, 127, 12, 12, 0, 12, 8, 8, 127, 12, 960, 960, 968, 978, 960, 960, 33, 33, 33, 33, 33, 33, -22479, -22479, -22479, 20, 20, 20, 12, 12, 20, 20, 12, 12, 12, 12, 12, 12, 12, 12, 20, 20, 12, 12, 12, 12, 24, 41, -22479, -22479, 33, 960, 960, 33, 41, 41, 24, 24, 24, 24, 33, 33, 12, 12, 12, 12, 12, 12, 0, 0, 12, 12, 12, 12, 24, 0, 24, 24, 0, 24, 0, 12, 33, 24, 41, 41, 24, 12, 24, 24, 24, 0, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 12, 12, 12, 0, 24, 24, 12, 12, 12, 12, 0, 24, 24, 0, 0, 0, 12, 12, 12, 24, 24, 24, 12, 0, User32.WM_MOUSEWHEEL, 24, 24, 24, 24, 24, 12, 12, 0, 24, 0, 8, 127, 127, 12, 12, 8, 12, 960, 33, 33, 0, 0, 968, -22479, -22479, 33, 960, 978, 20, 20, 20, 41, -22479, 33, 33, 33, 945, 945, 945, 945, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 12, 12, 12, 0};
            this.aw = new int[]{343, class_332.l, 342};
            this.ax = new int[]{344, 341, 346};
            this.ay = new int[]{345, 342, 343};
            this.Y = new short[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1};
            this.Z = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.aa = new byte[]{0, 0, 0};
            for (int i48 = 0; i48 < this.Y.length; i48++) {
                if (this.Y[i48] == 59) {
                    this.Y[i48] = (short) (Configuration.aQ ? 57 : 117);
                    this.ar[i48] = this.Y[i48];
                }
            }
            for (int i49 = 0; i49 < this.ar.length; i49++) {
                if (this.ar[i49] == 0) {
                    this.ar[i49] = 65535;
                }
            }
        }
    }

    public void c(int i) {
        for (int i2 = 0; i2 < this.ad; i2++) {
            this.ae[i2] = this.ae[i2] / i;
            this.af[i2] = this.af[i2] / i;
            this.ag[i2] = this.ag[i2] / i;
        }
    }

    public void a(byte[] bArr, int i, class_49 class_49Var) {
        Buffer bufferA = class_54.a(bArr);
        Buffer bufferA2 = class_54.a(bArr);
        Buffer bufferA3 = class_54.a(bArr);
        Buffer bufferA4 = class_54.a(bArr);
        Buffer bufferA5 = class_54.a(bArr);
        Buffer bufferA6 = class_54.a(bArr);
        Buffer bufferA7 = class_54.a(bArr);
        bufferA.h = bArr.length - 23;
        int iA = bufferA.A();
        int iA2 = bufferA.A();
        int iY = bufferA.y();
        class_649[] class_649VarArrJ = j();
        class_649 class_649Var = new class_649();
        class_649VarArrJ[i] = class_649Var;
        class_649Var.a = bArr;
        class_649Var.b = iA;
        class_649Var.c = iA2;
        class_649Var.d = iY;
        int iY2 = bufferA.y();
        boolean z = ((1 & iY2) ^ (-1)) == -2;
        boolean z2 = ((iY2 & 2) ^ (-1)) == -3;
        boolean z3 = (4 & iY2) == 4;
        boolean z4 = (8 & iY2) == 8;
        if (!z4) {
            c(bArr, i);
            return;
        }
        int iY3 = 0;
        if (z4) {
            bufferA.h -= 7;
            iY3 = bufferA.y();
            bufferA.h += 6;
        }
        if (iY3 == 15) {
            p[i] = true;
        }
        this.n = iY3;
        int iY4 = bufferA.y();
        int iY5 = bufferA.y();
        int iY6 = bufferA.y();
        int iY7 = bufferA.y();
        int iY8 = bufferA.y();
        int iA3 = bufferA.A();
        int iA4 = bufferA.A();
        int iA5 = bufferA.A();
        int iA6 = bufferA.A();
        int iA7 = bufferA.A();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr2 = null;
        if (iY > 0) {
            bArr2 = new byte[iY];
            bufferA.h = 0;
            for (int i5 = 0; i5 < iY; i5++) {
                byte bZ = bufferA.z();
                bArr2[i5] = bZ;
                if (bZ == 0) {
                    i2++;
                }
                if (bZ >= 1 && bZ <= 3) {
                    i3++;
                }
                if (bZ == 2) {
                    i4++;
                }
            }
        }
        int i6 = iY + iA;
        if (z) {
            i6 += iA2;
        }
        if (iY2 == 1) {
            i6 += iA2;
        }
        int i7 = i6;
        int i8 = i6 + iA2;
        if (iY4 == 255) {
            i8 += iA2;
        }
        int i9 = i8;
        if (iY6 == 1) {
            i8 += iA2;
        }
        int i10 = i8;
        if (iY8 == 1) {
            i8 += iA;
        }
        int i11 = i8;
        if (iY5 == 1) {
            i8 += iA2;
        }
        int i12 = i8;
        int i13 = i8 + iA6;
        if (iY7 == 1) {
            i13 += iA2 * 2;
        }
        int i14 = i13;
        int i15 = i13 + iA7;
        int i16 = i15 + (iA2 * 2);
        int i17 = i16 + iA3;
        int i18 = i17 + iA4;
        int i19 = i18 + iA5;
        int i20 = i19 + (i2 * 6);
        int i21 = i20 + (i3 * 6);
        int i22 = 6;
        if (iY3 == 14) {
            i22 = 7;
        } else if (iY3 >= 15) {
            i22 = 9;
        }
        int i23 = i21 + (i22 * i3);
        int i24 = i23 + i3;
        int i25 = i24 + i3;
        int i26 = i25 + i3 + (i4 * 2);
        class_49Var.b(iA2, iA);
        class_49Var.e();
        this.L = class_49Var.a(class_51.p);
        this.M = class_49Var.c(class_51.q);
        int[] iArrA = class_49Var.a(class_51.m);
        int[] iArrA2 = class_49Var.a(class_51.n);
        int[] iArrA3 = class_49Var.a(class_51.o);
        int[] iArrA4 = class_49Var.a(class_51.a);
        int[] iArrA5 = class_49Var.a(class_51.b);
        int[] iArrA6 = class_49Var.a(class_51.c);
        this.aJ = class_49Var.a(class_51.l);
        this.ao = class_49Var.a(class_51.g);
        this.ap = class_49Var.a(class_51.h);
        this.aq = class_49Var.a(class_51.i);
        this.aK = class_49Var.a(class_51.k);
        if (iY8 == 1) {
            this.aJ = class_49Var.a(class_51.l);
        }
        if (z) {
            this.ao = class_49Var.a(class_51.g);
        }
        if (iY4 == 255) {
            this.ap = class_49Var.a(class_51.h);
        } else {
            this.au = iY4;
        }
        if (iY5 == 1) {
            this.aq = class_49Var.a(class_51.i);
        }
        if (iY6 == 1) {
            this.aK = class_49Var.a(class_51.k);
        }
        int[] iArrA7 = class_49Var.a(class_51.j);
        boolean z5 = false;
        if (iY7 == 1 && iY > 0) {
            z5 = true;
        }
        if (iY > 0) {
            if (i3 > 0) {
            }
            if (i4 > 0) {
            }
        }
        bufferA.h = iY;
        bufferA2.h = i16;
        bufferA3.h = i17;
        bufferA4.h = i18;
        bufferA5.h = i10;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        for (int i30 = 0; i30 < iA; i30++) {
            int iY9 = bufferA.y();
            int iL = (iY9 & 1) != 0 ? bufferA2.L() : 0;
            int iL2 = (iY9 & 2) != 0 ? bufferA3.L() : 0;
            int iL3 = (iY9 & 4) != 0 ? bufferA4.L() : 0;
            iArrA[i30] = i27 + iL;
            iArrA2[i30] = i28 + iL2;
            iArrA3[i30] = i29 + iL3;
            i27 = iArrA[i30];
            i28 = iArrA2[i30];
            i29 = iArrA3[i30];
            if (this.aJ != null) {
                this.aJ[i30] = bufferA5.y();
            }
        }
        bufferA.h = i15;
        bufferA2.h = i6;
        bufferA3.h = i8;
        bufferA4.h = i11;
        bufferA5.h = i9;
        bufferA6.h = i13;
        bufferA7.h = i14;
        for (int i31 = 0; i31 < iA2; i31++) {
            iArrA7[i31] = bufferA.A();
            if (iArrA7[i31] == 0) {
                iArrA7[i31] = 65535;
            }
            if (iY2 == 1) {
                this.ao[i31] = bufferA2.z();
                if (this.ao[i31] == 2) {
                    iArrA7[i31] = 65535;
                }
                this.ao[i31] = 0;
            }
            if (iY4 == 255) {
                this.ap[i31] = bufferA3.z();
            }
            if (iY5 == 1) {
                this.aq[i31] = bufferA4.z();
                if (this.aq[i31] < 0) {
                    this.aq[i31] = 256 + this.aq[i31];
                }
            }
            if (iY6 == 1) {
                this.aK[i31] = bufferA5.y();
            }
            short sA = iY7 == 1 ? (short) (bufferA6.A() - 1) : (short) 0;
            if (z5 && sA != -1) {
                bufferA7.y();
            }
        }
        bufferA.h = i12;
        bufferA2.h = i7;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        int i32 = 0;
        for (int i33 = 0; i33 < iA2; i33++) {
            int iY10 = bufferA2.y();
            if (iY10 == 1) {
                iL4 = bufferA.L() + i32;
                iL5 = bufferA.L() + iL4;
                iL6 = bufferA.L() + iL5;
                i32 = iL6;
                iArrA4[i33] = iL4;
                iArrA5[i33] = iL5;
                iArrA6[i33] = iL6;
            }
            if (iY10 == 2) {
                iL5 = iL6;
                iL6 = bufferA.L() + i32;
                i32 = iL6;
                iArrA4[i33] = iL4;
                iArrA5[i33] = iL5;
                iArrA6[i33] = iL6;
            }
            if (iY10 == 3) {
                iL4 = iL6;
                iL6 = bufferA.L() + i32;
                i32 = iL6;
                iArrA4[i33] = iL4;
                iArrA5[i33] = iL5;
                iArrA6[i33] = iL6;
            }
            if (iY10 == 4) {
                int i34 = iL4;
                iL4 = iL5;
                iL5 = i34;
                iL6 = bufferA.L() + i32;
                i32 = iL6;
                iArrA4[i33] = iL4;
                iArrA5[i33] = iL5;
                iArrA6[i33] = iL6;
            }
        }
        bufferA.h = i19;
        bufferA2.h = i20;
        bufferA3.h = i21;
        bufferA4.h = i23;
        bufferA5.h = i24;
        bufferA6.h = i25;
        for (int i35 = 0; i35 < iY; i35++) {
            int i36 = bArr2[i35] & 255;
            if (i36 == 0) {
                bufferA.A();
                bufferA.A();
                bufferA.A();
            }
            if (i36 == 1) {
                bufferA2.A();
                bufferA2.A();
                bufferA2.A();
                if (iY3 < 15) {
                    bufferA3.A();
                    if (iY3 >= 14) {
                        bufferA3.c(-1);
                    } else {
                        bufferA3.A();
                    }
                    bufferA3.A();
                } else {
                    bufferA3.c(-1);
                    bufferA3.c(-1);
                    bufferA3.c(-1);
                }
                bufferA4.z();
                bufferA4.z();
                bufferA4.z();
            }
            if (i36 == 2) {
                bufferA2.A();
                bufferA2.A();
                bufferA2.A();
                if (iY3 >= 15) {
                    bufferA3.c(-1);
                    bufferA3.c(-1);
                    bufferA3.c(-1);
                } else {
                    bufferA3.A();
                    if (iY3 < 14) {
                        bufferA3.A();
                    } else {
                        bufferA3.c(-1);
                    }
                    bufferA3.A();
                }
                bufferA4.z();
                bufferA4.z();
                bufferA4.z();
                bufferA4.z();
                bufferA4.z();
            }
            if (i36 == 3) {
                bufferA2.A();
                bufferA2.A();
                bufferA2.A();
                if (iY3 < 15) {
                    bufferA3.A();
                    if (iY3 < 14) {
                        bufferA3.A();
                    } else {
                        bufferA3.c(-1);
                    }
                    bufferA3.A();
                } else {
                    bufferA3.c(-1);
                    bufferA3.c(-1);
                    bufferA3.c(-1);
                }
                bufferA4.z();
                bufferA4.z();
                bufferA4.z();
            }
        }
        if (iY4 != 255) {
            for (int i37 = 0; i37 < iA2; i37++) {
                this.ap[i37] = iY4;
            }
        }
        this.ar = iArrA7;
        this.ad = iA;
        this.ah = iA2;
        this.ae = iArrA;
        this.af = iArrA2;
        this.ag = iArrA3;
        this.ai = iArrA4;
        this.aj = iArrA5;
        this.ak = iArrA6;
    }

    private void b(int i, class_49 class_49Var) {
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ab++;
        class_649 class_649Var = j()[i];
        this.ad = class_649Var.b;
        this.ah = class_649Var.c;
        this.av = class_649Var.d;
        class_49Var.b(this.ah, this.ad);
        class_49Var.e();
        this.L = class_49Var.a(class_51.p);
        this.M = class_49Var.c(class_51.q);
        this.ae = class_49Var.a(class_51.m);
        this.af = class_49Var.a(class_51.n);
        this.ag = class_49Var.a(class_51.o);
        this.ai = class_49Var.a(class_51.a);
        this.aj = class_49Var.a(class_51.b);
        while (-870 >= 0) {
            this.bO = !this.bO;
        }
        this.ak = class_49Var.a(class_51.c);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (class_649Var.i >= 0) {
            this.aJ = class_49Var.a(class_51.l);
        }
        if (class_649Var.m >= 0) {
            this.ao = class_49Var.a(class_51.g);
        }
        if (class_649Var.n >= 0) {
            this.ap = class_49Var.a(class_51.h);
        } else {
            this.au = (-class_649Var.n) - 1;
        }
        if (class_649Var.o >= 0) {
            this.aq = class_49Var.a(class_51.i);
        }
        if (class_649Var.p >= 0) {
            this.aK = class_49Var.a(class_51.k);
        }
        this.ar = class_49Var.a(class_51.j);
        Buffer bufferA = class_54.a(class_649Var.a);
        bufferA.h = class_649Var.e;
        Buffer bufferA2 = class_54.a(class_649Var.a);
        bufferA2.h = class_649Var.f;
        Buffer bufferA3 = class_54.a(class_649Var.a);
        bufferA3.h = class_649Var.g;
        Buffer bufferA4 = class_54.a(class_649Var.a);
        bufferA4.h = class_649Var.h;
        Buffer bufferA5 = class_54.a(class_649Var.a);
        bufferA5.h = class_649Var.i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.ad; i5++) {
            int iY = bufferA.y();
            int iL = (iY & 1) != 0 ? bufferA2.L() : 0;
            int iL2 = (iY & 2) != 0 ? bufferA3.L() : 0;
            int iL3 = (iY & 4) != 0 ? bufferA4.L() : 0;
            this.ae[i5] = i2 + iL;
            this.af[i5] = i3 + iL2;
            this.ag[i5] = i4 + iL3;
            i2 = this.ae[i5];
            i3 = this.af[i5];
            i4 = this.ag[i5];
            if (this.aJ != null) {
                this.aJ[i5] = bufferA5.y();
            }
        }
        bufferA.h = class_649Var.l;
        bufferA2.h = class_649Var.m;
        bufferA3.h = class_649Var.n;
        bufferA4.h = class_649Var.o;
        bufferA5.h = class_649Var.p;
        for (int i6 = 0; i6 < this.ah; i6++) {
            this.ar[i6] = bufferA.A();
            if (this.ao != null) {
                this.ao[i6] = bufferA2.y();
            }
            if (this.ap != null) {
                this.ap[i6] = bufferA3.y();
            }
            if (this.aq != null) {
                this.aq[i6] = bufferA4.y();
            }
            if (this.aK != null) {
                this.aK[i6] = bufferA5.y();
            }
        }
        bufferA.h = class_649Var.j;
        bufferA2.h = class_649Var.k;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < this.ah; i8++) {
            int iY2 = bufferA2.y();
            if (iY2 == 1) {
                iL4 = bufferA.L() + i7;
                iL5 = bufferA.L() + iL4;
                iL6 = bufferA.L() + iL5;
                i7 = iL6;
                this.ai[i8] = iL4;
                this.aj[i8] = iL5;
                this.ak[i8] = iL6;
            }
            if (iY2 == 2) {
                iL4 = iL4;
                iL5 = iL6;
                iL6 = bufferA.L() + i7;
                i7 = iL6;
                this.ai[i8] = iL4;
                this.aj[i8] = iL5;
                this.ak[i8] = iL6;
            }
            if (iY2 == 3) {
                iL4 = iL6;
                iL5 = iL5;
                iL6 = bufferA.L() + i7;
                i7 = iL6;
                this.ai[i8] = iL4;
                this.aj[i8] = iL5;
                this.ak[i8] = iL6;
            }
            if (iY2 == 4) {
                int i9 = iL4;
                iL4 = iL5;
                iL5 = i9;
                iL6 = bufferA.L() + i7;
                i7 = iL6;
                this.ai[i8] = iL4;
                this.aj[i8] = iL5;
                this.ak[i8] = iL6;
            }
        }
        bufferA.h = class_649Var.q;
        for (int i10 = 0; i10 < this.av; i10++) {
            this.aw[i10] = bufferA.A();
            this.ax[i10] = bufferA.A();
            this.ay[i10] = bufferA.A();
        }
    }

    public static class_649[] j() {
        return b(class_83.a());
    }

    public static class_649[] b(boolean z) {
        return z ? class_83.b() : o;
    }

    public static void a(byte[] bArr, int i, boolean z) {
        if (bArr == null) {
            class_649[] class_649VarArrB = b(z);
            class_649 class_649Var = new class_649();
            class_649VarArrB[i] = class_649Var;
            class_649Var.b = 0;
            class_649Var.c = 0;
            class_649Var.d = 0;
            return;
        }
        Buffer buffer = new Buffer(bArr);
        buffer.h = bArr.length - 18;
        class_649[] class_649VarArrB2 = b(z);
        class_649 class_649Var2 = new class_649();
        class_649VarArrB2[i] = class_649Var2;
        class_649Var2.a = bArr;
        class_649Var2.b = buffer.A();
        class_649Var2.c = buffer.A();
        if (buffer.h < 0) {
            buffer.h = 0;
            return;
        }
        class_649Var2.d = buffer.y();
        int iY = buffer.y();
        int iY2 = buffer.y();
        int iY3 = buffer.y();
        int iY4 = buffer.y();
        int iY5 = buffer.y();
        int iA = buffer.A();
        int iA2 = buffer.A();
        int iA3 = buffer.A();
        int iA4 = buffer.A();
        class_649Var2.e = 0;
        int i2 = 0 + class_649Var2.b;
        class_649Var2.k = i2;
        int i3 = i2 + class_649Var2.c;
        class_649Var2.n = i3;
        if (iY2 == 255) {
            i3 += class_649Var2.c;
        } else {
            class_649Var2.n = (-iY2) - 1;
        }
        class_649Var2.p = i3;
        if (iY4 == 1) {
            i3 += class_649Var2.c;
        } else {
            class_649Var2.p = -1;
        }
        class_649Var2.m = i3;
        if (iY == 1) {
            i3 += class_649Var2.c;
        } else {
            class_649Var2.m = -1;
        }
        class_649Var2.i = i3;
        if (iY5 == 1) {
            i3 += class_649Var2.b;
        } else {
            class_649Var2.i = -1;
        }
        class_649Var2.o = i3;
        if (iY3 == 1) {
            i3 += class_649Var2.c;
        } else {
            class_649Var2.o = -1;
        }
        class_649Var2.j = i3;
        int i4 = i3 + iA4;
        class_649Var2.l = i4;
        int i5 = i4 + (class_649Var2.c * 2);
        class_649Var2.q = i5;
        int i6 = i5 + (class_649Var2.d * 6);
        class_649Var2.f = i6;
        int i7 = i6 + iA;
        class_649Var2.g = i7;
        int i8 = i7 + iA2;
        class_649Var2.h = i8;
        int i9 = i8 + iA3;
    }

    public static void a(int i, class_96 class_96Var) {
        class_83.a(new class_649[70000]);
        o = new class_649[80000];
        p = new boolean[100000];
        aU = class_96Var;
    }

    public static void d(int i) {
        class_83.a((class_649[]) null);
        o[i] = null;
    }

    public static ColorUtility e(int i) {
        return a(i, h);
    }

    public static ColorUtility a(int i, boolean z) {
        class_83.a(z);
        try {
            boolean z2 = false;
            return a(i, h);
        } finally {
            class_83.a(false);
        }
    }

    public static ColorUtility a(int i, class_49 class_49Var) {
        if (j() == null) {
            return null;
        }
        if (j()[i] != null) {
            return new ColorUtility(i, class_49Var);
        }
        aU.a(i);
        return null;
    }

    public static boolean b(int i, boolean z) {
        class_83.a(z);
        try {
            boolean z2 = false;
            return f(i);
        } finally {
            class_83.a(false);
        }
    }

    public static boolean f(int i) {
        if (j() == null) {
            return false;
        }
        if (j()[i] != null) {
            return true;
        }
        aU.a(i);
        return false;
    }

    private ColorUtility(boolean z) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        if (z) {
            return;
        }
        this.bO = !this.bO;
    }

    public ColorUtility(int i, ColorUtility[] colorUtilityArr, boolean z) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bO = true;
        this.aN = false;
        ab++;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (int i2 = 0; i2 < i; i2++) {
            ColorUtility colorUtility = colorUtilityArr[i2];
            if (colorUtility != null) {
                this.ad += colorUtility.ad;
                this.ah += colorUtility.ah;
                this.av += colorUtility.av;
                z2 |= colorUtility.ao != null;
                if (colorUtility.ap != null) {
                    z3 = true;
                } else {
                    if (this.au == -1) {
                        this.au = colorUtility.au;
                    }
                    if (this.au != colorUtility.au) {
                        z3 = true;
                    }
                }
                z4 |= colorUtility.aq != null;
                z5 |= colorUtility.aK != null;
            }
        }
        this.ae = new int[this.ad];
        this.af = new int[this.ad];
        this.ag = new int[this.ad];
        this.aJ = new int[this.ad];
        this.ai = new int[this.ah];
        this.aj = new int[this.ah];
        this.ak = new int[this.ah];
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (z2) {
            this.ao = new int[this.ah];
        }
        if (z3) {
            this.ap = new int[this.ah];
        }
        if (z4) {
            this.aq = new int[this.ah];
        }
        if (z5) {
            this.aK = new int[this.ah];
        }
        this.ar = new int[this.ah];
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            ColorUtility colorUtility2 = colorUtilityArr[i4];
            if (colorUtility2 != null) {
                for (int i5 = 0; i5 < colorUtility2.ah; i5++) {
                    if (z2) {
                        if (colorUtility2.ao == null) {
                            this.ao[this.ah] = 0;
                        } else {
                            int i6 = colorUtility2.ao[i5];
                            this.ao[this.ah] = (i6 & 2) == 2 ? i6 + (i3 << 2) : i6;
                        }
                    }
                    if (z3) {
                        if (colorUtility2.ap == null) {
                            this.ap[this.ah] = colorUtility2.au;
                        } else {
                            this.ap[this.ah] = colorUtility2.ap[i5];
                        }
                    }
                    if (z4) {
                        if (colorUtility2.aq == null) {
                            this.aq[this.ah] = 0;
                        } else {
                            this.aq[this.ah] = colorUtility2.aq[i5];
                        }
                    }
                    if (z5 && colorUtility2.aK != null) {
                        this.aK[this.ah] = colorUtility2.aK[i5];
                    }
                    this.ar[this.ah] = colorUtility2.ar[i5];
                    this.ai[this.ah] = a(colorUtility2, colorUtility2.ai[i5]);
                    this.aj[this.ah] = a(colorUtility2, colorUtility2.aj[i5]);
                    this.ak[this.ah] = a(colorUtility2, colorUtility2.ak[i5]);
                    this.ah++;
                }
                for (int i7 = 0; i7 < colorUtility2.av; i7++) {
                    this.aw[this.av] = a(colorUtility2, colorUtility2.aw[i7]);
                    this.ax[this.av] = a(colorUtility2, colorUtility2.ax[i7]);
                    this.ay[this.av] = a(colorUtility2, colorUtility2.ay[i7]);
                    this.av++;
                }
                i3 += colorUtility2.av;
            }
        }
    }

    public ColorUtility(int i, ColorUtility[] colorUtilityArr) {
        this(i, colorUtilityArr, h);
    }

    public ColorUtility(int i, ColorUtility[] colorUtilityArr, class_49 class_49Var) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ab++;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (int i2 = 0; i2 < i; i2++) {
            ColorUtility colorUtility = colorUtilityArr[i2];
            if (colorUtility != null) {
                this.ad += colorUtility.ad;
                this.ah += colorUtility.ah;
                this.av += colorUtility.av;
                z |= colorUtility.ao != null;
                if (colorUtility.ap != null) {
                    z2 = true;
                } else {
                    if (this.au == -1) {
                        this.au = colorUtility.au;
                    }
                    if (this.au != colorUtility.au) {
                        z2 = true;
                    }
                }
                z3 |= colorUtility.aq != null;
                z4 |= colorUtility.aK != null;
                z5 |= colorUtility.Y != null;
                z6 |= colorUtility.Z != null;
                z7 |= colorUtility.W != null;
                if (colorUtility.I != -1) {
                    this.I = colorUtility.I;
                }
            }
        }
        class_49Var.a(this.ah, this.ad);
        this.L = class_49Var.a(class_51.p);
        this.M = class_49Var.c(class_51.q);
        this.ae = class_49Var.a(class_51.m);
        this.af = class_49Var.a(class_51.n);
        this.ag = class_49Var.a(class_51.o);
        this.aJ = class_49Var.a(class_51.l);
        this.ai = class_49Var.a(class_51.a);
        this.aj = class_49Var.a(class_51.b);
        this.ak = class_49Var.a(class_51.c);
        this.ar = class_49Var.a(class_51.j);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (z) {
            this.ao = class_49Var.a(class_51.g);
        }
        if (z2) {
            this.ap = class_49Var.a(class_51.h);
        }
        if (z3) {
            this.aq = class_49Var.a(class_51.i);
        }
        if (z4) {
            this.aK = class_49Var.a(class_51.k);
        }
        if (z5) {
            this.Y = new short[this.ah];
        }
        if (z6) {
            this.Z = new short[this.ah];
        }
        if (z7) {
            this.W = new int[this.ad][];
            this.X = new int[this.ad][];
        }
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        if (this.av > 0) {
            this.aa = new byte[this.av];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            ColorUtility colorUtility2 = colorUtilityArr[i4];
            if (colorUtility2 != null) {
                for (int i5 = 0; i5 < colorUtility2.ah; i5++) {
                    if (z) {
                        if (colorUtility2.ao == null) {
                            this.ao[this.ah] = 0;
                        } else {
                            int i6 = colorUtility2.ao[i5];
                            this.ao[this.ah] = (i6 & 2) == 2 ? i6 + (i3 << 2) : i6;
                        }
                    }
                    if (z2) {
                        if (colorUtility2.ap == null) {
                            this.ap[this.ah] = colorUtility2.au;
                        } else {
                            this.ap[this.ah] = colorUtility2.ap[i5];
                        }
                    }
                    if (z3) {
                        if (colorUtility2.aq == null) {
                            this.aq[this.ah] = 0;
                        } else {
                            this.aq[this.ah] = colorUtility2.aq[i5];
                        }
                    }
                    if (z5) {
                        if (colorUtility2.Y != null) {
                            this.Y[this.ah] = colorUtility2.Y[i5];
                        } else {
                            this.Y[this.ah] = -1;
                        }
                    }
                    if (z6) {
                        if (colorUtility2.Z == null || colorUtility2.Z[i5] == -1) {
                            this.Z[this.ah] = -1;
                        } else {
                            int i7 = colorUtility2.Z[i5] + i3;
                            this.Z[this.ah] = (short) (colorUtility2.Z[i5] + i3);
                            if (i7 != this.Z[this.ah]) {
                                System.out.println(i7 + " -> " + this.Z[this.ah]);
                            }
                        }
                    }
                    if (z4 && colorUtility2.aK != null && i5 < colorUtility2.aK.length) {
                        this.aK[this.ah] = colorUtility2.aK[i5];
                    }
                    this.ar[this.ah] = colorUtility2.ar[i5];
                    this.ai[this.ah] = a(colorUtility2, colorUtility2.ai[i5]);
                    this.aj[this.ah] = a(colorUtility2, colorUtility2.aj[i5]);
                    this.ak[this.ah] = a(colorUtility2, colorUtility2.ak[i5]);
                    this.ah++;
                }
                for (int i8 = 0; i8 < colorUtility2.av; i8++) {
                    this.aw[this.av] = a(colorUtility2, colorUtility2.aw[i8]);
                    this.ax[this.av] = a(colorUtility2, colorUtility2.ax[i8]);
                    this.ay[this.av] = a(colorUtility2, colorUtility2.ay[i8]);
                    this.av++;
                }
                i3 += colorUtility2.av;
            }
        }
    }

    public ColorUtility(ColorUtility[] colorUtilityArr) {
        this(colorUtilityArr, h);
    }

    public ColorUtility(ColorUtility[] colorUtilityArr, class_49 class_49Var) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ab++;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (int i = 0; i < 2; i++) {
            if (colorUtilityArr[i] != null) {
                this.ad += colorUtilityArr[i].ad;
                this.ah += colorUtilityArr[i].ah;
                this.av += colorUtilityArr[i].av;
                z |= colorUtilityArr[i].ao != null;
                if (colorUtilityArr[i].ap != null) {
                    z2 = true;
                } else {
                    if (this.au == -1) {
                        this.au = colorUtilityArr[i].au;
                    }
                    if (this.au != colorUtilityArr[i].au) {
                        z2 = true;
                    }
                }
                z3 |= colorUtilityArr[i].aq != null;
                z4 |= colorUtilityArr[i].ar != null;
                z5 |= colorUtilityArr[i].Y != null;
                z6 |= colorUtilityArr[i].Z != null;
                z7 |= colorUtilityArr[i].W != null;
                if (colorUtilityArr[i].I != -1) {
                    this.I = colorUtilityArr[i].I;
                }
            }
        }
        class_49Var.a(this.ah, this.ad);
        this.L = class_49Var.a(class_51.p);
        this.M = class_49Var.c(class_51.q);
        this.ae = class_49Var.a(class_51.m);
        this.af = class_49Var.a(class_51.n);
        this.ag = class_49Var.a(class_51.o);
        this.aJ = class_49Var.a(class_51.l);
        this.ai = class_49Var.a(class_51.a);
        this.aj = class_49Var.a(class_51.b);
        this.ak = class_49Var.a(class_51.c);
        this.al = class_49Var.a(class_51.d);
        this.am = class_49Var.a(class_51.e);
        this.an = class_49Var.a(class_51.f);
        this.ar = class_49Var.a(class_51.j);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (z) {
            this.ao = class_49Var.a(class_51.g);
        }
        if (z2) {
            this.ap = class_49Var.a(class_51.h);
        }
        if (z3) {
            this.aq = class_49Var.a(class_51.i);
        }
        if (z4) {
            this.aK = class_49Var.a(class_51.k);
        }
        if (z5) {
            this.Y = new short[this.ah];
        }
        if (z6) {
            this.Z = new short[this.ah];
        }
        if (z7) {
            this.W = new int[this.ad][];
            this.X = new int[this.ad][];
        }
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            if (colorUtilityArr[i3] != null) {
                int i4 = this.ad;
                for (int i5 = 0; i5 < colorUtilityArr[i3].ad; i5++) {
                    if (class_49Var.f()) {
                        class_49Var.e(this.ad);
                    }
                    if (!Configuration.ah) {
                        this.L[this.ad] = colorUtilityArr[i3].L[i5];
                        this.M[this.ad] = colorUtilityArr[i3].M[i5];
                    }
                    this.ae[this.ad] = colorUtilityArr[i3].ae[i5];
                    this.af[this.ad] = colorUtilityArr[i3].af[i5];
                    this.ag[this.ad] = colorUtilityArr[i3].ag[i5];
                    this.ad++;
                }
                for (int i6 = 0; i6 < colorUtilityArr[i3].ah; i6++) {
                    if (class_49Var.f()) {
                        class_49Var.d(this.ah);
                    }
                    this.ai[this.ah] = colorUtilityArr[i3].ai[i6] + i4;
                    this.aj[this.ah] = colorUtilityArr[i3].aj[i6] + i4;
                    this.ak[this.ah] = colorUtilityArr[i3].ak[i6] + i4;
                    this.al[this.ah] = colorUtilityArr[i3].al[i6];
                    this.am[this.ah] = colorUtilityArr[i3].am[i6];
                    this.an[this.ah] = colorUtilityArr[i3].an[i6];
                    if (z) {
                        if (colorUtilityArr[i3].ao == null) {
                            this.ao[this.ah] = 0;
                        } else {
                            int i7 = colorUtilityArr[i3].ao[i6];
                            this.ao[this.ah] = (i7 & 2) == 2 ? i7 + (i2 << 2) : i7;
                        }
                    }
                    if (z2) {
                        if (colorUtilityArr[i3].ap == null) {
                            this.ap[this.ah] = colorUtilityArr[i3].au;
                        } else {
                            this.ap[this.ah] = colorUtilityArr[i3].ap[i6];
                        }
                    }
                    if (z3) {
                        if (colorUtilityArr[i3].aq == null) {
                            this.aq[this.ah] = 0;
                        } else {
                            this.aq[this.ah] = colorUtilityArr[i3].aq[i6];
                        }
                    }
                    if (z4 && colorUtilityArr[i3].ar != null) {
                        this.ar[this.ah] = colorUtilityArr[i3].ar[i6];
                    }
                    if (z5) {
                        if (colorUtilityArr[i3].Y != null) {
                            this.Y[this.ah] = colorUtilityArr[i3].Y[this.ah];
                        } else {
                            this.Y[this.ah] = -1;
                        }
                    }
                    if (z6) {
                        if (colorUtilityArr[i3].Z == null || colorUtilityArr[i3].Z[this.ah] == -1) {
                            this.Z[this.ah] = -1;
                        } else {
                            this.Z[this.ah] = (short) (colorUtilityArr[i3].Z[this.ah] + this.av);
                        }
                    }
                    this.ah++;
                }
                for (int i8 = 0; i8 < colorUtilityArr[i3].av; i8++) {
                    this.aw[this.av] = colorUtilityArr[i3].aw[i8] + i4;
                    this.ax[this.av] = colorUtilityArr[i3].ax[i8] + i4;
                    this.ay[this.av] = colorUtilityArr[i3].ay[i8] + i4;
                    this.av++;
                }
                i2 += colorUtilityArr[i3].av;
            }
        }
        k();
    }

    public ColorUtility(boolean z, boolean z2, boolean z3, ColorUtility colorUtility) {
        this(z, z2, z3, colorUtility, h);
    }

    public ColorUtility(boolean z, boolean z2, boolean z3, ColorUtility colorUtility, class_49 class_49Var) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ab++;
        this.ad = colorUtility.ad;
        this.ah = colorUtility.ah;
        this.av = colorUtility.av;
        class_49Var.a(this.ah, this.ad);
        boolean z4 = !class_49Var.f();
        if (z3 || colorUtility.Y == null) {
            this.Y = colorUtility.Y;
        } else {
            this.Y = new short[this.ah];
            for (int i = 0; i < this.ah; i++) {
                if (!z4) {
                    class_49Var.d(i);
                    z4 = true;
                }
                this.Y[i] = colorUtility.Y[i];
            }
        }
        if (z3) {
            this.L = colorUtility.L;
            this.M = colorUtility.M;
            this.ae = colorUtility.ae;
            this.af = colorUtility.af;
            this.ag = colorUtility.ag;
        } else {
            if (colorUtility.L != null) {
                this.L = class_49Var.a(class_51.p);
                this.M = class_49Var.c(class_51.q);
            }
            this.ae = class_49Var.a(class_51.m);
            this.af = class_49Var.a(class_51.n);
            this.ag = class_49Var.a(class_51.o);
            for (int i2 = 0; i2 < this.ad; i2++) {
                if (class_49Var.f()) {
                    class_49Var.e(i2);
                }
                if (!Configuration.ah && colorUtility.L != null) {
                    this.L[i2] = colorUtility.L[i2];
                    this.M[i2] = colorUtility.M[i2];
                }
                this.ae[i2] = colorUtility.ae[i2];
                this.af[i2] = colorUtility.af[i2];
                this.ag[i2] = colorUtility.ag[i2];
            }
        }
        if (z) {
            this.ar = colorUtility.ar;
        } else {
            this.ar = class_49Var.a(class_51.j);
            for (int i3 = 0; i3 < this.ah; i3++) {
                if (!z4) {
                    class_49Var.d(i3);
                    z4 = true;
                }
                this.ar[i3] = colorUtility.ar[i3];
            }
        }
        if (z2) {
            this.aq = colorUtility.aq;
        } else {
            this.aq = class_49Var.a(class_51.i);
            if (colorUtility.aq == null) {
                for (int i4 = 0; i4 < this.ah; i4++) {
                    if (!z4) {
                        class_49Var.d(i4);
                        z4 = true;
                    }
                    this.aq[i4] = 0;
                }
            } else {
                for (int i5 = 0; i5 < this.ah; i5++) {
                    if (!z4) {
                        class_49Var.d(i5);
                        z4 = true;
                    }
                    this.aq[i5] = colorUtility.aq[i5];
                }
            }
        }
        this.I = colorUtility.I;
        this.L = colorUtility.L;
        this.M = colorUtility.M;
        this.aJ = colorUtility.aJ;
        this.aK = colorUtility.aK;
        this.ao = colorUtility.ao;
        this.ai = colorUtility.ai;
        this.aj = colorUtility.aj;
        this.ak = colorUtility.ak;
        this.ap = colorUtility.ap;
        this.Z = colorUtility.Z;
        this.aa = colorUtility.aa;
        this.au = colorUtility.au;
        this.aw = colorUtility.aw;
        this.ax = colorUtility.ax;
        this.ay = colorUtility.ay;
        this.X = colorUtility.X;
        this.W = colorUtility.W;
    }

    public ColorUtility(boolean z, boolean z2, ColorUtility colorUtility) {
        this.i = h;
        this.l = false;
        this.q = 0;
        this.r = 0;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.I = -1;
        this.J = 0;
        this.K = (short) 256;
        this.N = false;
        this.O = 20;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.bH = new HashMap<>();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ab++;
        this.ad = colorUtility.ad;
        this.ah = colorUtility.ah;
        this.av = colorUtility.av;
        if (z) {
            this.af = new int[this.ad];
            if (colorUtility.ae != null) {
                System.arraycopy(colorUtility.af, 0, this.af, 0, this.ad);
            } else {
                this.af = null;
            }
        } else {
            this.af = colorUtility.af;
        }
        if (z2) {
            this.al = new int[this.ah];
            this.am = new int[this.ah];
            this.an = new int[this.ah];
            for (int i = 0; i < this.ah; i++) {
                this.al[i] = colorUtility.al[i];
                this.am[i] = colorUtility.am[i];
                this.an[i] = colorUtility.an[i];
            }
            this.ao = new int[this.ah];
            if (colorUtility.ao == null) {
                for (int i2 = 0; i2 < this.ah; i2++) {
                    this.ao[i2] = 0;
                }
            } else {
                for (int i3 = 0; i3 < this.ah; i3++) {
                    this.ao[i3] = colorUtility.ao[i3];
                }
            }
            this.f = new class_43(this.ad);
            for (int i4 = 0; i4 < this.ad; i4++) {
                this.f.a(i4, colorUtility.f.a(i4));
                this.f.b(i4, colorUtility.f.b(i4));
                this.f.c(i4, colorUtility.f.c(i4));
                this.f.d(i4, colorUtility.f.d(i4));
            }
            this.aO = colorUtility.aO;
        } else {
            this.al = colorUtility.al;
            this.am = colorUtility.am;
            this.an = colorUtility.an;
            this.ao = colorUtility.ao;
        }
        this.ae = colorUtility.ae;
        this.ag = colorUtility.ag;
        this.ar = colorUtility.ar;
        this.aq = colorUtility.aq;
        this.Y = colorUtility.Y;
        this.Z = colorUtility.Z;
        this.aa = colorUtility.aa;
        this.ap = colorUtility.ap;
        this.au = colorUtility.au;
        this.ai = colorUtility.ai;
        this.aj = colorUtility.aj;
        this.ak = colorUtility.ak;
        this.aw = colorUtility.aw;
        this.ax = colorUtility.ax;
        this.ay = colorUtility.ay;
        this.g = colorUtility.g;
        this.aD = colorUtility.aD;
        this.aG = colorUtility.aG;
        this.aF = colorUtility.aF;
        this.W = colorUtility.W;
        this.X = colorUtility.X;
        this.az = colorUtility.az;
        this.aB = colorUtility.aB;
        this.aC = colorUtility.aC;
        this.aA = colorUtility.aA;
    }

    public void a(ColorUtility colorUtility, boolean z) {
        this.m = colorUtility.m;
        this.ad = colorUtility.ad;
        this.ah = colorUtility.ah;
        this.av = colorUtility.av;
        if (bS.length < this.ad) {
            bS = new int[this.ad + 10000];
            bT = new int[this.ad + 10000];
            bU = new int[this.ad + 10000];
            bQ = new int[this.ad + 10000];
            bR = new byte[this.ad + 10000];
        }
        this.L = bQ;
        this.M = bR;
        this.ae = bS;
        this.af = bT;
        this.ag = bU;
        for (int i = 0; i < this.ad; i++) {
            if (!Configuration.ah && this.L != null) {
                this.L[i] = colorUtility.L[i];
                if (this.M != null) {
                    this.M[i] = colorUtility.M[i];
                }
            }
            this.ae[i] = colorUtility.ae[i];
            this.af[i] = colorUtility.af[i];
            this.ag[i] = colorUtility.ag[i];
        }
        if (z) {
            this.aq = colorUtility.aq;
        } else {
            if (bV.length < this.ah) {
                bV = new int[this.ah + 100];
            }
            this.aq = bV;
            if (colorUtility.aq == null) {
                for (int i2 = 0; i2 < this.ah; i2++) {
                    this.aq[i2] = 0;
                }
            } else {
                for (int i3 = 0; i3 < this.ah; i3++) {
                    this.aq[i3] = colorUtility.aq[i3];
                }
            }
        }
        this.ao = colorUtility.ao;
        this.ar = colorUtility.ar;
        this.ap = colorUtility.ap;
        this.au = colorUtility.au;
        this.aM = colorUtility.aM;
        this.aL = colorUtility.aL;
        this.ai = colorUtility.ai;
        this.aj = colorUtility.aj;
        this.ak = colorUtility.ak;
        this.al = colorUtility.al;
        this.am = colorUtility.am;
        this.an = colorUtility.an;
        this.aw = colorUtility.aw;
        this.ax = colorUtility.ax;
        this.ay = colorUtility.ay;
        this.Z = colorUtility.Z;
        this.aa = colorUtility.aa;
        this.Y = colorUtility.Y;
        this.I = colorUtility.I;
        this.W = colorUtility.W;
        this.X = colorUtility.X;
    }

    private final int a(ColorUtility colorUtility, int i) {
        int i2 = -1;
        int i3 = (Configuration.ah || colorUtility.L == null) ? 0 : colorUtility.L[i];
        byte b = (Configuration.ah || colorUtility.M == null) ? (byte) 0 : colorUtility.M[i];
        int i4 = colorUtility.ae[i];
        int i5 = colorUtility.af[i];
        int i6 = colorUtility.ag[i];
        for (int i7 = 0; i7 < this.ad; i7++) {
            if (i4 == this.ae[i7] && i5 == this.af[i7] && i6 == this.ag[i7]) {
                i2 = i7;
                break;
            }
        }
        if (i2 == -1) {
            if (!Configuration.ah && colorUtility.L != null) {
                this.L[this.ad] = i3;
            }
            if (!Configuration.ah && colorUtility.M != null) {
                this.M[this.ad] = b;
            }
            this.ae[this.ad] = i4;
            this.af[this.ad] = i5;
            this.ag[this.ad] = i6;
            if (colorUtility.aJ != null) {
                this.aJ[this.ad] = colorUtility.aJ[i];
            }
            if (colorUtility.W != null) {
                this.W[this.ad] = colorUtility.W[i];
                this.X[this.ad] = colorUtility.X[i];
            }
            int i8 = this.ad;
            this.ad = i8 + 1;
            i2 = i8;
        }
        return i2;
    }

    public void k() {
        this.g = 0;
        this.aD = 0;
        this.aE = 0;
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.ae[i];
            int i3 = this.af[i];
            int i4 = this.ag[i];
            if ((-i3) > this.g) {
                this.g = -i3;
            }
            if (i3 > this.aE) {
                this.aE = i3;
            }
            int i5 = (i2 * i2) + (i4 * i4);
            if (i5 > this.aD) {
                this.aD = i5;
            }
        }
        this.aD = (int) (Math.sqrt(this.aD) + 0.99d);
        this.aG = (int) (Math.sqrt((this.aD * this.aD) + (this.g * this.g)) + 0.99d);
        this.aF = this.aG + ((int) (Math.sqrt((this.aD * this.aD) + (this.aE * this.aE)) + 0.99d));
    }

    public void a(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        l();
        int i5 = i - this.aD;
        int i6 = i + this.aD;
        int i7 = i3 - this.aD;
        int i8 = i3 + this.aD;
        if (i5 < 0 || ((i6 + 128) >> 7) >= iArr.length || i7 < 0 || ((i8 + 128) >> 7) >= iArr[0].length) {
            return;
        }
        int i9 = i5 >> 7;
        int i10 = (i6 + 127) >> 7;
        int i11 = i7 >> 7;
        int i12 = (i8 + 127) >> 7;
        if (i2 == iArr[i9][i11] && i2 == iArr[i10][i11] && i2 == iArr[i9][i12] && i2 == iArr[i10][i12]) {
            return;
        }
        if (i4 == 0) {
            for (int i13 = 0; i13 < this.ad; i13++) {
                int i14 = i + this.ae[i13];
                int i15 = i3 + this.ag[i13];
                int i16 = i14 & 127;
                int i17 = i15 & 127;
                int i18 = i14 >> 7;
                int i19 = i15 >> 7;
                this.af[i13] = (((((((iArr[i18][i19] * (128 - i16)) + (iArr[i18 + 1][i19] * i16)) >> 7) * (128 - i17)) + ((((iArr[i18][i19 + 1] * (128 - i16)) + (i16 * iArr[i18 + 1][i19 + 1])) >> 7) * i17)) >> 7) + this.af[i13]) - i2;
            }
        }
        l();
    }

    public void l() {
        this.g = 0;
        this.aE = 0;
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.af[i];
            if ((-i2) > this.g) {
                this.g = -i2;
            }
            if (i2 > this.aE) {
                this.aE = i2;
            }
        }
        this.aG = (int) (Math.sqrt((this.aD * this.aD) + (this.g * this.g)) + 0.99d);
        this.aF = this.aG + ((int) (Math.sqrt((this.aD * this.aD) + (this.aE * this.aE)) + 0.99d));
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.aA - this.az;
        int i10 = this.aE - this.g;
        int i11 = this.aB - this.aC;
        double dMin = Math.min(((double) i7) / ((double) i9), -(((double) i8) / ((double) i10)));
        int iAbs = Math.abs(i10 / 2);
        int i12 = ((int) (((double) i11) / dMin)) - i10;
        int i13 = i12 < i6 / 2 ? i6 / 2 : i6;
        a(i, i2, 0, i4, iAbs, (class_332.w[0] * Math.max(i6 / 2, (int) (((double) Math.max(((int) Math.ceil(((double) i12) / ((double) i13))) * i13, i6 / 2)) - ((((double) i3) / dMin) * 4.0d)))) >> 16);
        this.r = i7 * i8;
    }

    public void m() {
        this.g = 0;
        this.aD = 0;
        this.aE = 0;
        this.az = 999999;
        this.aA = -999999;
        this.aB = -99999;
        this.aC = 99999;
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.ae[i];
            int i3 = this.af[i];
            int i4 = this.ag[i];
            if (i2 < this.az) {
                this.az = i2;
            }
            if (i2 > this.aA) {
                this.aA = i2;
            }
            if (i4 < this.aC) {
                this.aC = i4;
            }
            if (i4 > this.aB) {
                this.aB = i4;
            }
            if ((-i3) > this.g) {
                this.g = -i3;
            }
            if (i3 > this.aE) {
                this.aE = i3;
            }
            int i5 = (i2 * i2) + (i4 * i4);
            if (i5 > this.aD) {
                this.aD = i5;
            }
        }
        this.aD = (int) Math.sqrt(this.aD);
        this.aG = (int) Math.sqrt((this.aD * this.aD) + (this.g * this.g));
        this.aF = this.aG + ((int) Math.sqrt((this.aD * this.aD) + (this.aE * this.aE)));
    }

    public void n() {
        if (this.i.l != null) {
            this.aL = this.i.l;
            this.aJ = null;
        }
        if (this.i.m != null) {
            this.aM = this.i.m;
            this.aK = null;
        }
        if (this.aJ != null) {
            int i = 0;
            System.arraycopy(s, 0, t, 0, 256);
            for (int i2 = 0; i2 < this.ad; i2++) {
                int i3 = this.aJ[i2];
                int[] iArr = t;
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.aL = new int[i + 1][];
            for (int i4 = 0; i4 <= i; i4++) {
                this.aL[i4] = new int[t[i4]];
                t[i4] = 0;
            }
            for (int i5 = 0; i5 < this.ad; i5++) {
                int i6 = this.aJ[i5];
                int[] iArr2 = this.aL[i6];
                int[] iArr3 = t;
                int i7 = iArr3[i6];
                iArr3[i6] = i7 + 1;
                iArr2[i7] = i5;
            }
            if (this.i.f()) {
                this.i.l = (int[][]) Arrays.copyOf(this.aL, this.aL.length);
            }
            this.aJ = null;
        }
        if (this.aK != null) {
            System.arraycopy(s, 0, u, 0, 256);
            int i8 = 0;
            for (int i9 = 0; i9 < this.ah; i9++) {
                int i10 = this.aK[i9];
                int[] iArr4 = u;
                iArr4[i10] = iArr4[i10] + 1;
                if (i10 > i8) {
                    i8 = i10;
                }
            }
            this.aM = new int[i8 + 1][];
            for (int i11 = 0; i11 <= i8; i11++) {
                this.aM[i11] = new int[u[i11]];
                u[i11] = 0;
            }
            for (int i12 = 0; i12 < this.ah; i12++) {
                int i13 = this.aK[i12];
                int[] iArr5 = this.aM[i13];
                int[] iArr6 = u;
                int i14 = iArr6[i13];
                iArr6[i13] = i14 + 1;
                iArr5[i14] = i12;
            }
            if (this.i.f()) {
                this.i.m = (int[][]) Arrays.copyOf(this.aM, this.aM.length);
            }
            this.aK = null;
        }
    }

    public ColorUtility c(boolean z) {
        ColorUtility colorUtility = new ColorUtility(true, z, false, this);
        colorUtility.n();
        return colorUtility;
    }

    public ColorUtility d(boolean z) {
        ColorUtility colorUtility = ac;
        colorUtility.a(this, z);
        colorUtility.k();
        colorUtility.n();
        return colorUtility;
    }

    public void a(class_640 class_640Var, int i) {
        if (i == -1 || class_640Var == null) {
            return;
        }
        class_648 class_648VarB = class_640Var.base.b();
        if (class_648VarB != null) {
            class_648VarB.a(class_640Var, i);
            a(class_648VarB, class_640Var.c());
        }
        if (class_640Var.d()) {
            b(class_640Var, i);
        }
        k();
        this.aM = null;
        this.aL = null;
    }

    void a(class_648 class_648Var, int i) {
        if (this.W != null) {
            for (int i2 = 0; i2 < this.ad; i2++) {
                int[] iArr = this.W[i2];
                if (iArr != null && iArr.length != 0) {
                    int[] iArr2 = this.X[i2];
                    aR.f();
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        class_642 class_642VarA = class_648Var.a(iArr[i3]);
                        if (class_642VarA != null) {
                            aS.a(iArr2[i3] / 255.0f);
                            aT.a(class_642VarA.d(i));
                            aT.c(aS);
                            aR.b(aT);
                        }
                    }
                    a(i2, aR);
                }
            }
        }
    }

    void a(int i, b bVar) {
        float f = this.ae[i];
        float f2 = -this.af[i];
        float f3 = -this.ag[i];
        this.ae[i] = (int) ((bVar.e[0] * f) + (bVar.e[4] * f2) + (bVar.e[8] * f3) + (bVar.e[12] * 1.0f));
        this.af[i] = -((int) ((bVar.e[1] * f) + (bVar.e[5] * f2) + (bVar.e[9] * f3) + (bVar.e[13] * 1.0f)));
        this.ag[i] = -((int) ((bVar.e[2] * f) + (bVar.e[6] * f2) + (bVar.e[10] * f3) + (bVar.e[14] * 1.0f)));
    }

    void b(class_640 class_640Var, int i) {
        class_35 class_35Var = class_640Var.base;
        for (int i2 = 0; i2 < class_35Var.b; i2++) {
            if (class_35Var.d[i2] == 5 && class_640Var.e != null && class_640Var.e[i2] != null && class_640Var.e[i2][0] != null && this.aM != null && this.aq != null) {
                class_645 class_645Var = class_640Var.e[i2][0];
                for (int i3 : class_35Var.e[i2]) {
                    if (i3 < this.aM.length) {
                        for (int i4 : this.aM[i3]) {
                            int iA = (int) ((this.aq[i4] & 255) + (class_645Var.a(i) * 255.0f));
                            if (iA < 0) {
                                iA = 0;
                            } else if (iA > 255) {
                                iA = 255;
                            }
                            this.aq[i4] = iA;
                        }
                    }
                }
            }
        }
    }

    public void a(class_35 class_35Var, class_640 class_640Var, int i, boolean[] zArr, boolean z, boolean z2) {
        class_648 class_648VarB = class_35Var.b();
        if (class_648VarB != null) {
            class_648VarB.a(class_640Var, i, zArr, z);
            if (z2) {
                a(class_648VarB, class_640Var.c());
            }
        }
        if (z || !class_640Var.d()) {
            return;
        }
        b(class_640Var, i);
    }

    public void f(int i, int i2) {
        if (this.aL == null || i == -1) {
            return;
        }
        try {
            class_83.a(class_99.a[i2].w);
            class_176 class_176VarC = class_176.c(i, i2);
            class_83.a(false);
            if (class_176VarC == null) {
                return;
            }
            class_35 class_35Var = class_176VarC.g;
            bq = 0;
            br = 0;
            bs = 0;
            for (int i3 = 0; i3 < class_176VarC.h; i3++) {
                int i4 = class_176VarC.k[i3];
                a(class_35Var.d[i4], class_35Var.e[i4], class_176VarC.l[i3], class_176VarC.m[i3], class_176VarC.n[i3]);
            }
        } catch (Throwable th) {
            class_83.a(false);
            throw th;
        }
    }

    public void a(int[] iArr, int i, int i2, int i3) {
        if (i2 == -1) {
            return;
        }
        if (iArr == null || i == -1) {
            f(i2, i3);
            return;
        }
        try {
            class_83.a(class_99.a[i3].w);
            class_176 class_176VarC = class_176.c(i2, i3);
            class_83.a(false);
            if (class_176VarC == null) {
                return;
            }
            try {
                class_83.a(class_99.a[i3].w);
                class_176 class_176VarC2 = class_176.c(i, i3);
                class_83.a(false);
                if (class_176VarC2 == null) {
                    f(i2, i3);
                    return;
                }
                class_35 class_35Var = class_176VarC.g;
                bq = 0;
                br = 0;
                bs = 0;
                if (0 > iArr.length - 1) {
                    f(i2, i3);
                    return;
                }
                int i4 = 0 + 1;
                int i5 = iArr[0];
                for (int i6 = 0; i6 < class_176VarC.h; i6++) {
                    int i7 = class_176VarC.k[i6];
                    while (i7 > i5) {
                        int i8 = i4;
                        i4++;
                        i5 = iArr[i8];
                    }
                    if (i7 != i5 || class_35Var.d[i7] == 0) {
                        a(class_35Var.d[i7], class_35Var.e[i7], class_176VarC.l[i6], class_176VarC.m[i6], class_176VarC.n[i6]);
                    }
                }
                bq = 0;
                br = 0;
                bs = 0;
                if (0 > iArr.length - 1) {
                    f(i2, i3);
                    return;
                }
                int i9 = 0 + 1;
                int i10 = iArr[0];
                for (int i11 = 0; i11 < class_176VarC2.h; i11++) {
                    int i12 = class_176VarC2.k[i11];
                    while (i12 > i10) {
                        int i13 = i9;
                        i9++;
                        i10 = iArr[i13];
                    }
                    if (i12 == i10 || class_35Var.d[i12] == 0) {
                        a(class_35Var.d[i12], class_35Var.e[i12], class_176VarC2.l[i11], class_176VarC2.m[i11], class_176VarC2.n[i11]);
                    }
                }
            } catch (Throwable th) {
                class_83.a(false);
                throw th;
            }
        } catch (Throwable th2) {
            class_83.a(false);
            throw th2;
        }
    }

    private void a(int i, int[] iArr, int i2, int i3, int i4) {
        if (i == 0) {
            int i5 = 0;
            bq = 0;
            br = 0;
            bs = 0;
            for (int i6 : iArr) {
                if (i6 < this.aL.length) {
                    for (int i7 : this.aL[i6]) {
                        bq += this.ae[i7];
                        br += this.af[i7];
                        bs += this.ag[i7];
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bq = (bq / i5) + i2;
                br = (br / i5) + i3;
                bs = (bs / i5) + i4;
                return;
            } else {
                bq = i2;
                br = i3;
                bs = i4;
                return;
            }
        }
        if (i == 1) {
            for (int i8 : iArr) {
                if (i8 < this.aL.length) {
                    for (int i9 : this.aL[i8]) {
                        int[] iArr2 = this.ae;
                        iArr2[i9] = iArr2[i9] + i2;
                        int[] iArr3 = this.af;
                        iArr3[i9] = iArr3[i9] + i3;
                        int[] iArr4 = this.ag;
                        iArr4[i9] = iArr4[i9] + i4;
                    }
                }
            }
            return;
        }
        if (i == 2) {
            for (int i10 : iArr) {
                if (i10 < this.aL.length) {
                    for (int i11 : this.aL[i10]) {
                        int[] iArr5 = this.ae;
                        iArr5[i11] = iArr5[i11] - bq;
                        int[] iArr6 = this.af;
                        iArr6[i11] = iArr6[i11] - br;
                        int[] iArr7 = this.ag;
                        iArr7[i11] = iArr7[i11] - bs;
                        int i12 = (i2 & 255) * 8;
                        int i13 = (i3 & 255) * 8;
                        int i14 = (i4 & 255) * 8;
                        if (i14 != 0) {
                            int i15 = bA[i14];
                            int i16 = bB[i14];
                            int i17 = ((this.af[i11] * i15) + (this.ae[i11] * i16)) >> 16;
                            this.af[i11] = ((this.af[i11] * i16) - (this.ae[i11] * i15)) >> 16;
                            this.ae[i11] = i17;
                        }
                        if (i12 != 0) {
                            int i18 = bA[i12];
                            int i19 = bB[i12];
                            int i20 = ((this.af[i11] * i19) - (this.ag[i11] * i18)) >> 16;
                            this.ag[i11] = ((this.af[i11] * i18) + (this.ag[i11] * i19)) >> 16;
                            this.af[i11] = i20;
                        }
                        if (i13 != 0) {
                            int i21 = bA[i13];
                            int i22 = bB[i13];
                            int i23 = ((this.ag[i11] * i21) + (this.ae[i11] * i22)) >> 16;
                            this.ag[i11] = ((this.ag[i11] * i22) - (this.ae[i11] * i21)) >> 16;
                            this.ae[i11] = i23;
                        }
                        int[] iArr8 = this.ae;
                        iArr8[i11] = iArr8[i11] + bq;
                        int[] iArr9 = this.af;
                        iArr9[i11] = iArr9[i11] + br;
                        int[] iArr10 = this.ag;
                        iArr10[i11] = iArr10[i11] + bs;
                    }
                }
            }
            return;
        }
        if (i != 3) {
            if (i != 5 || this.aM == null || this.aq == null) {
                return;
            }
            for (int i24 : iArr) {
                if (i24 < this.aM.length) {
                    for (int i25 : this.aM[i24]) {
                        int[] iArr11 = this.aq;
                        iArr11[i25] = iArr11[i25] + (i2 * 8);
                        if (this.aq[i25] < 0) {
                            this.aq[i25] = 0;
                        }
                        if (this.aq[i25] > 255) {
                            this.aq[i25] = 255;
                        }
                    }
                }
            }
            return;
        }
        for (int i26 : iArr) {
            if (i26 < this.aL.length) {
                for (int i27 : this.aL[i26]) {
                    int[] iArr12 = this.ae;
                    iArr12[i27] = iArr12[i27] - bq;
                    int[] iArr13 = this.af;
                    iArr13[i27] = iArr13[i27] - br;
                    int[] iArr14 = this.ag;
                    iArr14[i27] = iArr14[i27] - bs;
                    this.ae[i27] = (this.ae[i27] * i2) / 128;
                    this.af[i27] = (this.af[i27] * i3) / 128;
                    this.ag[i27] = (this.ag[i27] * i4) / 128;
                    int[] iArr15 = this.ae;
                    iArr15[i27] = iArr15[i27] + bq;
                    int[] iArr16 = this.af;
                    iArr16[i27] = iArr16[i27] + br;
                    int[] iArr17 = this.ag;
                    iArr17[i27] = iArr17[i27] + bs;
                }
            }
        }
    }

    public void b(int[] iArr, int i) {
        if (this.aq == null) {
            this.aq = new int[this.ah];
        }
        for (int i2 = 0; i2 < this.ah; i2++) {
            for (int i3 : iArr) {
                if (i3 == this.ar[i2]) {
                    this.aq[i2] = 100 - i;
                }
            }
        }
    }

    public void g(int i, int i2) {
        if (this.aq == null) {
            this.aq = new int[this.ah];
        }
        if (i2 != -1) {
            this.aq[i2] = i;
            return;
        }
        for (int i3 = 0; i3 < this.ah; i3++) {
            this.aq[i3] = 100 - i;
        }
    }

    public void g(int i) {
        for (int i2 = 0; i2 < this.ah; i2++) {
            if (this.ar[i2] < 40 || this.ar[i2] > 100) {
                this.ar[i2] = i;
            }
        }
    }

    public void h(int i) {
        for (int i2 = 0; i2 < this.ah; i2++) {
            if (this.ar[i2] < 15 || this.ar[i2] > 255) {
                this.ar[i2] = i;
            }
        }
    }

    public void h(int i, int i2) {
        for (int i3 = 0; i3 < this.ah; i3++) {
            if (this.ar[i3] > i2) {
                this.ar[i3] = i;
            }
        }
    }

    public void i(int i) {
        for (int i2 = 0; i2 < this.ah; i2++) {
            if (this.ar[i2] > 1) {
                this.ar[i2] = i;
            }
        }
    }

    public void o() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.ae[i];
            this.ae[i] = this.ag[i];
            this.ag[i] = -i2;
        }
    }

    public void j(int i) {
        int i2 = bA[i];
        int i3 = bB[i];
        for (int i4 = 0; i4 < this.ad; i4++) {
            int i5 = ((this.af[i4] * i3) - (this.ag[i4] * i2)) >> 16;
            this.ag[i4] = ((this.af[i4] * i2) + (this.ag[i4] * i3)) >> 16;
            this.af[i4] = i5;
        }
    }

    public void a(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            int[] iArr = this.ae;
            int i5 = i4;
            iArr[i5] = iArr[i5] + i;
            int[] iArr2 = this.af;
            int i6 = i4;
            iArr2[i6] = iArr2[i6] + i2;
            int[] iArr3 = this.ag;
            int i7 = i4;
            iArr3[i7] = iArr3[i7] + i3;
        }
    }

    public void i(int i, int i2) {
        for (int i3 = 0; i3 < this.ah; i3++) {
            if (this.ar[i3] == i) {
                this.ar[i3] = i2;
            }
        }
    }

    public void p() {
        for (int i = 0; i < this.ad; i++) {
            this.ag[i] = -this.ag[i];
        }
        for (int i2 = 0; i2 < this.ah; i2++) {
            int i3 = this.ai[i2];
            this.ai[i2] = this.ak[i2];
            this.ak[i2] = i3;
        }
    }

    public void b(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            this.ae[i4] = (this.ae[i4] * i) / 128;
            this.af[i4] = (this.af[i4] * i3) / 128;
            this.ag[i4] = (this.ag[i4] * i2) / 128;
        }
    }

    public void q() {
        int i;
        if (this.f == null) {
            this.f = this.i.b(this.ad);
            for (int i2 = 0; i2 < this.ah; i2++) {
                int i3 = this.ai[i2];
                int i4 = this.aj[i2];
                int i5 = this.ak[i2];
                int i6 = this.ae[i4] - this.ae[i3];
                int i7 = this.af[i4] - this.af[i3];
                int i8 = this.ag[i4] - this.ag[i3];
                int i9 = this.ae[i5] - this.ae[i3];
                int i10 = this.af[i5] - this.af[i3];
                int i11 = this.ag[i5] - this.ag[i3];
                int i12 = (i7 * i11) - (i10 * i8);
                int i13 = (i8 * i9) - (i11 * i6);
                int i14 = (i6 * i10) - (i9 * i7);
                while (true) {
                    i = i14;
                    if (i12 <= 8192 && i13 <= 8192 && i <= 8192 && i12 >= -8192 && i13 >= -8192 && i >= -8192) {
                        break;
                    }
                    i12 >>= 1;
                    i13 >>= 1;
                    i14 = i >> 1;
                }
                int iSqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13) + (i * i));
                if (iSqrt <= 0) {
                    iSqrt = 1;
                }
                int i15 = (i12 * 256) / iSqrt;
                int i16 = (i13 * 256) / iSqrt;
                int i17 = (i * 256) / iSqrt;
                boolean z = this.ao == null ? false : (this.ao[i2] & 1) == 1;
                if (!z) {
                    this.f.e(i3, i15);
                    this.f.f(i3, i16);
                    this.f.g(i3, i17);
                    this.f.h(i3, 1);
                    this.f.e(i4, i15);
                    this.f.f(i4, i16);
                    this.f.g(i4, i17);
                    this.f.h(i4, 1);
                    this.f.e(i5, i15);
                    this.f.f(i5, i16);
                    this.f.g(i5, i17);
                    this.f.h(i5, 1);
                } else if (z) {
                    if (this.aQ == null) {
                        this.aQ = this.i.a(this.ah);
                    }
                    this.aQ.a(i2, i15);
                    this.aQ.b(i2, i16);
                    this.aQ.c(i2, i17);
                }
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int iSqrt = (i2 * ((int) Math.sqrt(((i3 * i3) + (i4 * i4)) + (i5 * i5)))) >> 8;
        if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(class_51.d);
            this.am = this.i.a(class_51.e);
            this.an = this.i.a(class_51.f);
        }
        if (this.f == null) {
            this.f = this.i.b(this.ad);
        }
        for (int i7 = 0; i7 < this.ah; i7++) {
            if (this.ar != null && this.aq != null && (this.ar[i7] == 65535 || ((this.ar[i7] == 0 && this.k == 1) || this.ar[i7] == 16705))) {
                this.aq[i7] = 255;
            }
            int i8 = this.ai[i7];
            int i9 = this.aj[i7];
            int i10 = this.ak[i7];
            int i11 = this.ae[i9] - this.ae[i8];
            int i12 = this.af[i9] - this.af[i8];
            int i13 = this.ag[i9] - this.ag[i8];
            int i14 = this.ae[i10] - this.ae[i8];
            int i15 = this.af[i10] - this.af[i8];
            int i16 = this.ag[i10] - this.ag[i8];
            int i17 = (i12 * i16) - (i15 * i13);
            int i18 = (i13 * i14) - (i16 * i11);
            int i19 = (i11 * i15) - (i14 * i12);
            while (true) {
                i6 = i19;
                if (i17 <= 8192 && i18 <= 8192 && i6 <= 8192 && i17 >= -8192 && i18 >= -8192 && i6 >= -8192) {
                    break;
                }
                i17 >>= 1;
                i18 >>= 1;
                i19 = i6 >> 1;
            }
            int iSqrt2 = (int) Math.sqrt((i17 * i17) + (i18 * i18) + (i6 * i6));
            if (iSqrt2 <= 0) {
                iSqrt2 = 1;
            }
            int i20 = (i17 * 256) / iSqrt2;
            int i21 = (i18 * 256) / iSqrt2;
            int i22 = (i6 * 256) / iSqrt2;
            if (this.ao == null || (this.ao[i7] & 1) == 0) {
                this.f.e(i8, i20);
                this.f.f(i8, i21);
                this.f.g(i8, i22);
                this.f.h(i8, 1);
                this.f.e(i9, i20);
                this.f.f(i9, i21);
                this.f.g(i9, i22);
                this.f.h(i9, 1);
                this.f.e(i10, i20);
                this.f.f(i10, i21);
                this.f.g(i10, i22);
                this.f.h(i10, 1);
            } else {
                int i23 = i;
                int i24 = i3;
                int i25 = i4;
                int i26 = i5;
                if (this.Y != null && i7 < this.Y.length && i7 > 0 && this.Y[i7] != -1) {
                    i23 = 64;
                    i24 = -30;
                    i25 = -50;
                    i26 = -30;
                }
                this.al[i7] = c(this.ar[i7], i23 + ((((i24 * i20) + (i25 * i21)) + (i26 * i22)) / (iSqrt + (iSqrt / 2))), this.ao[i7]);
            }
        }
        if (z) {
            a(i, iSqrt, i3, i4, i5);
        } else {
            this.aO = this.i.c(this.ad);
            for (int i27 = 0; i27 < this.ad; i27++) {
                this.aO.a(i27, this.f.a(i27));
                this.aO.b(i27, this.f.b(i27));
                this.aO.c(i27, this.f.c(i27));
                this.aO.d(i27, this.f.d(i27));
            }
        }
        if (z) {
            k();
        } else {
            m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    public final void b(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (!e.a() || class_332.h) {
            a(i, i2, i3, i4, i5, z);
            return;
        }
        int iSqrt = (i2 * ((int) Math.sqrt(((i3 * i3) + (i4 * i4)) + (i5 * i5)))) >> 8;
        if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(class_51.d);
            this.am = this.i.a(class_51.e);
            this.an = this.i.a(class_51.f);
        }
        q();
        for (int i6 = 0; i6 < this.ah; i6++) {
            if (this.ar != null && this.aq != null && (this.ar[i6] == 65535 || ((this.ar[i6] == 0 && this.k == 1) || this.ar[i6] == 16705))) {
                this.aq[i6] = 255;
            }
            boolean z2 = this.ao == null ? false : (this.ao[i6] & 1) == 1;
            int i7 = this.aq == null ? 0 : this.aq[i6];
            short s2 = this.Y == null ? a(i6) ? (short) this.ar[i6] : (short) -1 : (this.Y[i6] > 0 || !a(i6)) ? this.Y[i6] : (short) this.ar[i6];
            int r18 = z2 ? 1 : 0;
            if (i7 == -2) {
                r18 = 3;
            }
            int r19 = r18;
            if (i7 == -1) {
                r19 = 2;
            }
            if (s2 == -1) {
                if (r19 == 0) {
                    int i8 = this.ar[i6] & 65535;
                    int i9 = this.ai[i6];
                    class_43 class_43Var = (this.aP == null || this.aP.e(this.ai[i6])) ? this.f : this.aP;
                    int iB = ((((i4 * class_43Var.b(i9)) + (i5 * class_43Var.c(i9))) + (i3 * class_43Var.a(i9))) / (iSqrt * class_43Var.d(i9))) + i;
                    int i10 = this.aj[i6];
                    this.al[i6] = j(i8, iB);
                    class_43 class_43Var2 = (this.aP == null || this.aP.e(this.aj[i6])) ? this.f : this.aP;
                    int iB2 = ((((i4 * class_43Var2.b(i10)) + (i5 * class_43Var2.c(i10))) + (i3 * class_43Var2.a(i10))) / (iSqrt * class_43Var2.d(i10))) + i;
                    int i11 = this.ak[i6];
                    this.am[i6] = j(i8, iB2);
                    class_43 class_43Var3 = (this.aP == null || this.aP.e(this.ak[i6])) ? this.f : this.aP;
                    this.an[i6] = j(i8, ((((i4 * class_43Var3.b(i11)) + (i5 * class_43Var3.c(i11))) + (i3 * class_43Var3.a(i11))) / (iSqrt * class_43Var3.d(i11))) + i);
                } else if (r19 == 1) {
                    this.al[i6] = j(this.ar[i6] & 65535, ((((i4 * this.aQ.b(i6)) + (i5 * this.aQ.c(i6))) + (i3 * this.aQ.a(i6))) / ((iSqrt / 2) + iSqrt)) + i);
                    this.an[i6] = -1;
                } else if (r19 == 3) {
                    this.al[i6] = 128;
                    this.an[i6] = -1;
                } else {
                    this.an[i6] = -2;
                }
            } else if (r19 == 0) {
                int i12 = this.ai[i6];
                class_43 class_43Var4 = (this.aP == null || this.aP.e(this.ai[i6])) ? this.f : this.aP;
                int iB3 = ((((i4 * class_43Var4.b(i12)) + (i5 * class_43Var4.c(i12))) + (i3 * class_43Var4.a(i12))) / (iSqrt * class_43Var4.d(i12))) + i;
                int i13 = this.aj[i6];
                this.al[i6] = k(iB3);
                class_43 class_43Var5 = (this.aP == null || this.aP.e(this.aj[i6])) ? this.f : this.aP;
                int iB4 = ((((i4 * class_43Var5.b(i13)) + (i5 * class_43Var5.c(i13))) + (i3 * class_43Var5.a(i13))) / (iSqrt * class_43Var5.d(i13))) + i;
                int i14 = this.ak[i6];
                this.am[i6] = k(iB4);
                class_43 class_43Var6 = (this.aP == null || this.aP.e(this.ak[i6])) ? this.f : this.aP;
                this.an[i6] = k(((((i4 * class_43Var6.b(i14)) + (i5 * class_43Var6.c(i14))) + (i3 * class_43Var6.a(i14))) / (iSqrt * class_43Var6.d(i14))) + i);
            } else if (r19 == 1) {
                this.al[i6] = k(((((i4 * this.aQ.b(i6)) + (i5 * this.aQ.c(i6))) + (i3 * this.aQ.a(i6))) / ((iSqrt / 2) + iSqrt)) + i);
                this.an[i6] = -1;
            } else {
                this.an[i6] = -2;
            }
        }
        if (z) {
            a(i, iSqrt, i3, i4, i5);
        } else {
            this.aO = this.i.c(this.ad);
            for (int i15 = 0; i15 < this.ad; i15++) {
                this.aO.a(i15, this.f.a(i15));
                this.aO.b(i15, this.f.b(i15));
                this.aO.c(i15, this.f.c(i15));
                this.aO.d(i15, this.f.d(i15));
            }
        }
        if (z) {
            k();
        } else {
            m();
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < this.ah; i6++) {
            int i7 = this.ai[i6];
            int i8 = this.aj[i6];
            int i9 = this.ak[i6];
            int i10 = i;
            int i11 = i3;
            int i12 = i5;
            if (e.a() && i6 >= 0 && a(i6) && (this.z || this.A)) {
                i11 *= -1;
                i12 *= -1;
                i10 = 50;
            }
            class_43 class_43Var = this.f;
            if (this.ao == null) {
                int i13 = this.ar[i6];
                this.al[i6] = c(i13, i10 + ((((i11 * class_43Var.a(i7)) + (i4 * class_43Var.b(i7))) + (i12 * class_43Var.c(i7))) / (i2 * class_43Var.d(i7))), 0);
                this.am[i6] = c(i13, i10 + ((((i11 * class_43Var.a(i8)) + (i4 * class_43Var.b(i8))) + (i12 * class_43Var.c(i8))) / (i2 * class_43Var.d(i8))), 0);
                this.an[i6] = c(i13, i10 + ((((i11 * class_43Var.a(i9)) + (i4 * class_43Var.b(i9))) + (i12 * class_43Var.c(i9))) / (i2 * class_43Var.d(i9))), 0);
            } else if ((this.ao[i6] & 1) == 0) {
                int i14 = this.ar[i6];
                int i15 = this.ao[i6];
                this.al[i6] = c(i14, i10 + ((((i11 * class_43Var.a(i7)) + (i4 * class_43Var.b(i7))) + (i12 * class_43Var.c(i7))) / (i2 * class_43Var.d(i7))), i15);
                this.am[i6] = c(i14, i10 + ((((i11 * class_43Var.a(i8)) + (i4 * class_43Var.b(i8))) + (i12 * class_43Var.c(i8))) / (i2 * class_43Var.d(i8))), i15);
                this.an[i6] = c(i14, i10 + ((((i11 * class_43Var.a(i9)) + (i4 * class_43Var.b(i9))) + (i12 * class_43Var.c(i9))) / (i2 * class_43Var.d(i9))), i15);
            }
        }
        if (e.a()) {
            f();
        }
        this.f = null;
        this.aO = null;
        this.aJ = null;
        this.aK = null;
        if (this.ao != null) {
            for (int i16 = 0; i16 < this.ah; i16++) {
                if ((this.ao[i16] & 2) == 2) {
                    return;
                }
            }
        }
        this.ar = null;
    }

    static final int k(int i) {
        if (i < 2) {
            i = 2;
        } else if (i > 126) {
            i = 126;
        }
        return i;
    }

    static final int j(int i, int i2) {
        int i3 = ((i & 127) * i2) >> 7;
        if (i3 < 2) {
            i3 = 2;
        } else if (i3 > 126) {
            i3 = 126;
        }
        return (i & 65408) + i3;
    }

    public static final int c(int i, int i2, int i3) {
        if (i == 65535) {
            return 0;
        }
        if ((i3 & 2) == 2) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 127) {
                i2 = 127;
            }
            return 127 - i2;
        }
        int i4 = (i2 * (i & 127)) >> 7;
        if (i4 < 2) {
            i4 = 2;
        } else if (i4 > 126) {
            i4 = 126;
        }
        return (i & 65408) + i4;
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = class_332.s;
        int i8 = class_332.t;
        int i9 = bA[0];
        int i10 = bB[0];
        int i11 = bA[i];
        int i12 = bB[i];
        int i13 = bA[i2];
        int i14 = bB[i2];
        int i15 = bA[i3];
        int i16 = bB[i3];
        int i17 = ((i5 * i15) + (i6 * i16)) >> 16;
        for (int i18 = 0; i18 < this.ad; i18++) {
            int i19 = this.ae[i18];
            int i20 = this.af[i18];
            int i21 = this.ag[i18];
            if (i2 != 0) {
                int i22 = ((i20 * i13) + (i19 * i14)) >> 16;
                i20 = ((i20 * i14) - (i19 * i13)) >> 16;
                i19 = i22;
            }
            if (0 != 0) {
                int i23 = ((i20 * i10) - (i21 * i9)) >> 16;
                i21 = ((i20 * i9) + (i21 * i10)) >> 16;
                i20 = i23;
            }
            if (i != 0) {
                int i24 = ((i21 * i11) + (i19 * i12)) >> 16;
                i21 = ((i21 * i12) - (i19 * i11)) >> 16;
                i19 = i24;
            }
            int i25 = i19 + i4;
            int i26 = i20 + i5;
            int i27 = i21 + i6;
            int i28 = ((i26 * i16) - (i27 * i15)) >> 16;
            int i29 = ((i26 * i15) + (i27 * i16)) >> 16;
            bb[i18] = i29 - i17;
            if (Configuration.av) {
                bc[i18] = 0;
            }
            aZ[i18] = i7 + ((i25 << 9) / i29);
            ba[i18] = i8 + ((i28 << 9) / i29);
            if (this.av > 0) {
                bd[i18] = i25;
                be[i18] = i28;
                bf[i18] = i29;
            }
        }
        try {
            a(false, false, 0, 0);
        } catch (Exception e) {
        }
    }

    void a(d dVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (dVar == null) {
            return;
        }
        for (int i6 = 0; i6 < dVar.e(); i6++) {
            rs.lpkg.c.a aVarA = dVar.a(i6);
            if (aVarA != null) {
                if (aVarA.h() == 1 || this.N) {
                    if (z) {
                        Launcher.n().o().a.a(aVarA, i, i2, i3, i4, true);
                        Launcher.n().o().a.a(aVarA, i, i2, i3, i4, false);
                    }
                } else if (aVarA.h() != 2) {
                    Launcher.n().o().a.a(aVarA, i, i2, i3, i4, z);
                } else if (!z) {
                    Launcher.n().o().a.a(aVarA, i, i2, i3, i4, true);
                    Launcher.n().o().a.a(aVarA, i, i2, i3, i4, false);
                }
            }
        }
    }

    void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            if (this.L != null && this.M != null && Configuration.az && !Configuration.ah && !class_194.b() && !c.a()) {
                int iSqrt = -1;
                int iSqrt2 = -1;
                int i10 = 0;
                for (int i11 = 0; i11 < this.ad && i11 < this.L.length; i11++) {
                    int i12 = this.L[i11] - 1;
                    if (i12 >= 0) {
                        d dVarA = c.a(i9, true);
                        if (dVarA == null || !dVarA.b()) {
                            break;
                            break;
                        }
                        if (iSqrt == -1) {
                            int i13 = Client.eR.ac;
                            int i14 = Client.eR.ad;
                            int i15 = i6 + Client.cJ;
                            int i16 = this.aD;
                            int i17 = i8 + Client.cL;
                            int i18 = Client.cJ;
                            int i19 = -Client.cK;
                            int i20 = Client.cL;
                            iSqrt2 = (int) Math.sqrt(((i15 - i13) * (i15 - i13)) + ((i17 - i14) * (i17 - i14)));
                            iSqrt = (int) Math.sqrt(((i15 - i18) * (i15 - i18)) + ((i17 - i20) * (i17 - i20)));
                        }
                        class_593 class_593Var = class_593.c[i12];
                        int i21 = this.ae[i11];
                        int i22 = this.af[i11] * (-1);
                        int i23 = this.ag[i11];
                        if (i12 == 2 || i12 == 3) {
                            i22 -= 11;
                        }
                        int iH = class_593Var.h();
                        float f = 0.0f;
                        int i24 = iSqrt / (iSqrt2 == 0 ? aU.ie * 2 : 750);
                        if (i24 > 0) {
                            iH = class_593Var.a(0, i24 * 4) <= Math.max(1, i24 / 2) ? 1 : 0;
                            f = (i24 * 4) - 1;
                        }
                        if (iH < 0 || i24 > 10) {
                            iH = 0;
                        }
                        for (int i25 = 0; i25 < iH; i25++) {
                            int i26 = i10;
                            i10++;
                            if (i26 >= 100) {
                                break;
                            }
                            this.J++;
                            rs.lpkg.c.a aVarA = c.a(class_593Var, i21, i22, i23, i11);
                            if (aVarA != null) {
                                aVarA.e(i9);
                                if (class_593Var.p() && this.I != -1) {
                                    aVarA.a(this.I);
                                }
                                aVarA.a(this.M[i11]);
                                aVarA.a(Math.min(12.0f, aVarA.f() + f));
                                if (this.J % 2 != 0) {
                                    dVarA.a(aVarA);
                                }
                            }
                        }
                    }
                }
            }
            d dVar = null;
            if (Configuration.az && !Configuration.ah) {
                d dVarA2 = c.a(i9, false);
                dVar = dVarA2;
                if (dVarA2 != null) {
                    dVar.c();
                }
            }
            if (dVar != null) {
                a(dVar, i, i6, i7, i8, i9, false);
            }
            Launcher.n().o().a.a(this, i, i2, i3, i4, i5, i6, i7, i8, i9);
            if (dVar != null) {
                a(dVar, i, i6, i7, i8, i9, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void a(boolean z, boolean z2, int i, int i2) {
        boolean z3 = e.a() && class_332.p && !class_332.h;
        for (int i3 = 0; i3 < this.aF; i3++) {
            bg[i3] = 0;
        }
        for (int i4 = 0; i4 < this.ah; i4++) {
            if ((this.ao == null || this.ao[i4] != -1) && (this.aq == null || this.aq[i4] < 255)) {
                int i5 = this.ai[i4];
                int i6 = this.aj[i4];
                int i7 = this.ak[i4];
                int i8 = aZ[i5];
                int i9 = aZ[i6];
                int i10 = aZ[i7];
                if (z3) {
                    if (i8 != -5000 && i9 != -5000 && i10 != -5000 && z2 && b(bu, bv, ba[i5], ba[i6], ba[i7], i8, i9, i10)) {
                        bz[bw] = i2;
                        by[bw] = i2;
                        int[] iArr = bx;
                        int i11 = bw;
                        bw = i11 + 1;
                        iArr[i11] = i;
                        z2 = false;
                    }
                } else if (z && (i8 == -5000 || i9 == -5000 || i10 == -5000)) {
                    aY[i4] = true;
                    int i12 = (((bb[i5] + bb[i6]) + bb[i7]) / 3) + this.aG;
                    int[] iArr2 = bh[i12];
                    int[] iArr3 = bg;
                    int i13 = iArr3[i12];
                    iArr3[i12] = i13 + 1;
                    iArr2[i13] = i4;
                } else {
                    if (z2 && b(bu, bv, ba[i5], ba[i6], ba[i7], i8, i9, i10)) {
                        bz[bw] = i2;
                        by[bw] = i2;
                        int[] iArr4 = bx;
                        int i14 = bw;
                        bw = i14 + 1;
                        iArr4[i14] = i;
                        z2 = false;
                    }
                    if (((i8 - i9) * (ba[i7] - ba[i6])) - ((ba[i5] - ba[i6]) * (i10 - i9)) > 0) {
                        aY[i4] = false;
                        aX[i4] = i8 < 0 || i9 < 0 || i10 < 0 || i8 > class_210.n || i9 > class_210.n || i10 > class_210.n;
                        int i15 = (((bb[i5] + bb[i6]) + bb[i7]) / 3) + this.aG;
                        int[] iArr5 = bh[i15];
                        int[] iArr6 = bg;
                        int i16 = iArr6[i15];
                        iArr6[i15] = i16 + 1;
                        iArr5[i16] = i4;
                    }
                }
            }
        }
        if (z3) {
            return;
        }
        if (this.L != null && this.L.length > 0) {
            for (int i17 = 0; i17 < this.ad; i17++) {
                int i18 = i17;
                int i19 = this.L[i18] - 1;
                if (i19 >= 0) {
                    class_593 class_593Var = class_593.c[i19];
                    int i20 = this.ae[i18];
                    int i21 = this.af[i18];
                    int i22 = this.ag[i18];
                    int i23 = bc[i18];
                    if (this.E != 0) {
                        int i24 = bA[this.E];
                        int i25 = bB[this.E];
                        int i26 = ((i22 * i24) + (i20 * i25)) >> 16;
                        i22 = ((i22 * i25) - (i20 * i24)) >> 16;
                        i20 = i26;
                    }
                    int i27 = i20 + this.B;
                    int i28 = i22 + this.D;
                    if (i19 == 2 || i19 == 3) {
                        i21 -= 11;
                    }
                    for (int i29 = 0; i29 < class_593Var.h(); i29++) {
                        this.J++;
                        if (Configuration.az && !Configuration.ah && this.J % 2 != 0) {
                            class_591 class_591VarA = class_589.a(class_593Var, i23, i27, -i21, i28);
                            if (class_591VarA == null) {
                                break;
                            }
                            if (class_593Var.p() && this.I != -1) {
                                class_591VarA.c(this.I);
                            }
                            Client.a(class_591VarA);
                        }
                    }
                }
            }
        }
        if (this.ap == null) {
            for (int i30 = this.aF - 1; i30 >= 0; i30--) {
                int i31 = bg[i30];
                if (i31 > 0) {
                    for (int i32 = 0; i32 < i31; i32++) {
                        q(bh[i30][i32]);
                    }
                }
            }
            return;
        }
        for (int i33 = 0; i33 < 12; i33++) {
            bi[i33] = 0;
            bm[i33] = 0;
        }
        for (int i34 = this.aF - 1; i34 >= 0; i34--) {
            int i35 = bg[i34];
            if (i35 > 0) {
                for (int i36 = 0; i36 < i35; i36++) {
                    int i37 = bh[i34][i36];
                    int i38 = this.ap[i37];
                    int[] iArr7 = bi;
                    int i39 = iArr7[i38];
                    iArr7[i38] = i39 + 1;
                    bj[i38][i39] = i37;
                    if (i38 < 10) {
                        int[] iArr8 = bm;
                        iArr8[i38] = iArr8[i38] + i34;
                    } else if (i38 == 10) {
                        bk[i39] = i34;
                    } else {
                        bl[i39] = i34;
                    }
                }
            }
        }
        int i40 = (bi[1] > 0 || bi[2] > 0) ? (bm[1] + bm[2]) / (bi[1] + bi[2]) : 0;
        int i41 = (bi[3] > 0 || bi[4] > 0) ? (bm[3] + bm[4]) / (bi[3] + bi[4]) : 0;
        int i42 = (bi[6] > 0 || bi[8] > 0) ? (bm[6] + bm[8]) / (bi[6] + bi[8]) : 0;
        int i43 = 0;
        int i44 = bi[10];
        char c = '\n';
        boolean z4 = false;
        if (0 == i44) {
            i43 = 0;
            i44 = bi[11];
            c = 11;
            z4 = true;
        }
        int i45 = i43 < i44 ? z4 ? bl[i43] : bk[i43] : -1000;
        for (int i46 = 0; i46 < 10; i46++) {
            while (i46 == 0 && i45 > i40) {
                int i47 = i43;
                i43++;
                q(bj[c][i47]);
                if (i43 == i44 && c != 11) {
                    i43 = 0;
                    i44 = bi[11];
                    c = 11;
                    z4 = true;
                }
                i45 = i43 < i44 ? z4 ? bl[i43] : bk[i43] : -1000;
            }
            while (i46 == 3 && i45 > i41) {
                int i48 = i43;
                i43++;
                q(bj[c][i48]);
                if (i43 == i44 && c != 11) {
                    i43 = 0;
                    i44 = bi[11];
                    c = 11;
                    z4 = true;
                }
                i45 = i43 < i44 ? z4 ? bl[i43] : bk[i43] : -1000;
            }
            while (i46 == 5 && i45 > i42) {
                int i49 = i43;
                i43++;
                q(bj[c][i49]);
                if (i43 == i44 && c != 11) {
                    i43 = 0;
                    i44 = bi[11];
                    c = 11;
                    z4 = true;
                }
                i45 = i43 < i44 ? z4 ? bl[i43] : bk[i43] : -1000;
            }
            int i50 = bi[i46];
            for (int i51 = 0; i51 < i50; i51++) {
                q(bj[i46][i51]);
            }
        }
        int i52 = 0;
        while (i45 != -1000) {
            i52++;
            int i53 = i43;
            i43++;
            q(bj[c][i53]);
            if (i43 == i44 && c != 11) {
                i43 = 0;
                c = 11;
                i44 = bi[11];
                z4 = true;
            }
            i45 = i43 < i44 ? z4 ? bl[i43] : bk[i43] : -1000;
        }
    }

    public void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.B = i6 + Client.cJ;
        this.C = i7 + Client.cK;
        this.D = i8 + Client.cL;
        this.E = i;
        int i15 = ((i8 * i5) - (i6 * i4)) >> 16;
        int i16 = ((i7 * i2) + (i15 * i3)) >> 16;
        int i17 = (this.aD * i3) >> 16;
        int i18 = i16 + i17;
        if (i18 <= 50 || i16 >= j) {
            return;
        }
        int i19 = ((i8 * i4) + (i6 * i5)) >> 16;
        int i20 = (i19 - this.aD) << 9;
        if (i20 / i18 >= class_210.o) {
            return;
        }
        int i21 = (i19 + this.aD) << 9;
        if (i21 / i18 <= (-class_210.o)) {
            return;
        }
        int i22 = ((i7 * i3) - (i15 * i2)) >> 16;
        int i23 = (this.aD * i2) >> 16;
        int i24 = (i22 + i23) << 9;
        if (i24 / i18 <= (-class_210.p)) {
            return;
        }
        int i25 = (i22 - (i23 + ((this.g * i3) >> 16))) << 9;
        if (i25 / i18 >= class_210.p) {
            return;
        }
        if (i16 - (i17 + ((this.g * i2) >> 16)) <= 50) {
        }
        if (i9 <= 0 || !bt) {
            return;
        }
        int i26 = i16 - i17;
        if (i26 <= 50) {
            i26 = 50;
        }
        if (i19 > 0) {
            i12 = i20 / i18;
            i11 = i21 / i26;
        } else {
            i11 = i21 / i18;
            i12 = i20 / i26;
        }
        if (i22 > 0) {
            i14 = i25 / i18;
            i13 = i24 / i26;
        } else {
            i13 = i24 / i18;
            i14 = i25 / i26;
        }
        int i27 = bu - class_332.s;
        int i28 = bv - class_332.t;
        class_258 class_258Var = null;
        if ((0 != 0 || (i27 > i12 && i27 < i11 && i28 > i14 && i28 < i13)) && (0 != 0 || this.aN)) {
            by[bw] = i10;
            int[] iArr = bx;
            int i29 = bw;
            bw = i29 + 1;
            iArr[i29] = (0 == 0 || 0 == 0) ? i9 : 0;
            if (0 != 0) {
                class_258Var.g = true;
            }
        }
    }

    public void l(int i) {
        if (this.bH.containsKey(Integer.valueOf(i))) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = bB[i];
        int i9 = bA[i];
        for (int i10 = 0; i10 < this.ad; i10++) {
            int iE = class_332.e(this.ae[i10], this.ag[i10], i8, i9);
            int i11 = this.af[i10];
            int iE2 = class_332.e(this.ae[i10], this.ag[i10], i8, i9);
            if (iE < i2) {
                i2 = iE;
            }
            if (iE > i5) {
                i5 = iE;
            }
            if (i11 < i3) {
                i3 = i11;
            }
            if (i11 > i6) {
                i6 = i11;
            }
            if (iE2 < i4) {
                i4 = iE2;
            }
            if (iE2 > i7) {
                i7 = iE2;
            }
        }
        class_67 class_67Var = new class_67((i5 + i2) / 2, (i6 + i3) / 2, (i7 + i4) / 2, ((i5 - i2) + 1) / 2, ((i6 - i3) + 1) / 2, ((i7 - i4) + 1) / 2);
        if (class_67Var.d < 32) {
            class_67Var.d = 32;
        }
        if (class_67Var.f < 32) {
            class_67Var.f = 32;
        }
        if (this.aN) {
            class_67Var.d += 8;
            class_67Var.f += 8;
        }
        this.bH.put(Integer.valueOf(i), class_67Var);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x048c A[Catch: Exception -> 0x04b1, TryCatch #0 {Exception -> 0x04b1, blocks: (B:145:0x0476, B:150:0x049d, B:147:0x048c), top: B:154:0x0476 }] */
    @Override // rs.class_48
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.B = i6 + Client.cJ;
        this.C = i7 + Client.cK;
        this.D = i8 + Client.cL;
        this.E = i;
        if (Configuration.I || i10 == 0) {
            int i15 = ((i8 * i5) - (i6 * i4)) >> 16;
            int i16 = ((i7 * i2) + (i15 * i3)) >> 16;
            int i17 = (this.aD * i3) >> 16;
            int i18 = i16 + i17;
            boolean z = e.a() && class_332.p;
            if (i18 <= 50 || i16 >= j) {
                return;
            }
            int i19 = ((i8 * i4) + (i6 * i5)) >> 16;
            int i20 = (i19 - this.aD) << 9;
            if (i20 / i18 >= class_210.o) {
                return;
            }
            int i21 = (i19 + this.aD) << 9;
            if (i21 / i18 <= (-class_210.o)) {
                return;
            }
            int i22 = ((i7 * i3) - (i15 * i2)) >> 16;
            int i23 = (this.aD * i2) >> 16;
            int i24 = (i22 + i23) << 9;
            if (i24 / i18 <= (-class_210.p)) {
                return;
            }
            int i25 = (i22 - (i23 + ((this.g * i3) >> 16))) << 9;
            if (i25 / i18 >= class_210.p) {
                return;
            }
            boolean z2 = i16 - (i17 + ((this.g * i2) >> 16)) <= 50;
            boolean z3 = false;
            if (i9 > 0 && bt) {
                int i26 = i16 - i17;
                if (i26 <= 50) {
                    i26 = 50;
                }
                if (i19 > 0) {
                    i12 = i20 / i18;
                    i11 = i21 / i26;
                } else {
                    i11 = i21 / i18;
                    i12 = i20 / i26;
                }
                if (i22 > 0) {
                    i14 = i25 / i18;
                    i13 = i24 / i26;
                } else {
                    i13 = i24 / i18;
                    i14 = i25 / i26;
                }
                int i27 = bu - class_332.s;
                int i28 = bv - class_332.t;
                class_258 class_258VarB = null;
                boolean z4 = false;
                boolean z5 = false;
                int i29 = 0;
                if (((i9 >> 29) & 3) == 1 || class_205.d) {
                    class_258VarB = Client.ab.c.b(i9);
                    z4 = (class_258VarB == null || class_258VarB.b == null || class_258VarB.a == null) ? false : true;
                    if (z4) {
                        class_258VarB.g = false;
                        if (class_258VarB.a.contains(bu, bv)) {
                            z5 = true;
                            i29 = class_258VarB.h;
                            class_258VarB.g = true;
                        }
                    }
                }
                if (((i9 >> 29) & 3) == 2 && Client.ab.e.size() > 0) {
                    class_258VarB = Client.ab.e.b(i9);
                    z4 = (class_258VarB == null || class_258VarB.b == null || class_258VarB.a == null) ? false : true;
                    if (z4) {
                        class_258VarB.g = false;
                        if (class_258VarB.a.contains(bu, bv)) {
                            z5 = true;
                            i29 = class_258VarB.h;
                            class_258VarB.g = true;
                        }
                    }
                }
                boolean z6 = z5 && i29 != 0;
                if (z6 || (i27 > i12 && i27 < i11 && i28 > i14 && i28 < i13)) {
                    if (z6 || this.aN) {
                        by[bw] = i10;
                        int[] iArr = bx;
                        int i30 = bw;
                        bw = i30 + 1;
                        iArr[i30] = (!z5 || i29 == 0) ? i9 : i29;
                        if (z4) {
                            class_258VarB.g = true;
                        }
                        if (z) {
                            a(i, i2, i3, i4, i5, i6, i7, i8, i9);
                            return;
                        }
                    } else {
                        z3 = true;
                    }
                }
            }
            int i31 = class_332.s;
            int i32 = class_332.t;
            int i33 = 0;
            int i34 = 0;
            if (i != 0) {
                i33 = bA[i];
                i34 = bB[i];
            }
            for (int i35 = 0; i35 < this.ad; i35++) {
                int i36 = this.ae[i35];
                int i37 = this.af[i35];
                int i38 = this.ag[i35];
                if (i != 0) {
                    int i39 = ((i38 * i33) + (i36 * i34)) >> 16;
                    i38 = ((i38 * i34) - (i36 * i33)) >> 16;
                    i36 = i39;
                }
                int i40 = i36 + i6;
                int i41 = i37 + i7;
                int i42 = i38 + i8;
                int i43 = ((i42 * i4) + (i40 * i5)) >> 16;
                int i44 = ((i42 * i5) - (i40 * i4)) >> 16;
                int i45 = ((i41 * i3) - (i44 * i2)) >> 16;
                int i46 = ((i41 * i2) + (i44 * i3)) >> 16;
                bb[i35] = i46 - i16;
                if (Configuration.av) {
                    bc[i35] = i46;
                }
                if (i46 >= 50) {
                    aZ[i35] = i31 + ((i43 << 9) / i46);
                    ba[i35] = i32 + ((i45 << 9) / i46);
                } else {
                    aZ[i35] = -5000;
                    z2 = true;
                }
                if ((z2 || this.av > 0) && !z) {
                    bd[i35] = i43;
                    be[i35] = i45;
                    bf[i35] = i46;
                }
            }
            if (!z) {
                a(z2, z3, i9, i10);
            } else if (z3) {
                try {
                    if (Math.sqrt((i6 * i6) + (i8 * i8)) <= 4480.0d) {
                        a(z2, z3, i9, i10);
                    }
                } catch (Exception e) {
                    return;
                }
            }
            if (z) {
                a(i, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        }
    }

    private final void q(int i) {
        int i2;
        if (aY[i]) {
            r(i);
            return;
        }
        int i3 = this.ai[i];
        int i4 = this.aj[i];
        int i5 = this.ak[i];
        class_332.o = aX[i];
        if (this.aq == null) {
            class_332.r = 0;
        } else {
            class_332.r = this.aq[i];
        }
        if (this.K <= 255) {
            class_332.r = this.K;
        }
        if (this.ao == null) {
            i2 = 0;
        } else {
            i2 = H != -1 ? H : this.ao[i] & 3;
            if (H != -1) {
                i2 = 1;
            }
        }
        if (!this.F || (ba[this.ai[i]] >= class_210.j - 20 && ba[this.aj[i]] >= class_210.j - 20 && ba[this.ak[i]] >= class_210.j - 20)) {
            if (!class_332.q) {
                if (ba[this.ai[i]] < class_210.j - this.O) {
                    ba[this.ai[i]] = class_210.j - this.O;
                }
                if (ba[this.aj[i]] < class_210.j - this.O) {
                    ba[this.aj[i]] = class_210.j - this.O;
                }
                if (ba[this.ak[i]] < class_210.j - this.O) {
                    ba[this.ak[i]] = class_210.j - this.O;
                }
                if (aZ[this.ai[i]] < class_210.l) {
                    aZ[this.ai[i]] = class_210.l;
                }
                if (aZ[this.aj[i]] < class_210.l) {
                    aZ[this.aj[i]] = class_210.l;
                }
                if (aZ[this.ak[i]] < class_210.l) {
                    aZ[this.ak[i]] = class_210.l;
                }
            }
            if (this.Y != null && this.Y[i] != -1 && H == -1) {
                int i6 = i3;
                int i7 = i4;
                int i8 = i5;
                if (this.Z != null && this.Z[i] != -1) {
                    short s2 = this.Z[i];
                    i6 = this.aw[s2];
                    i7 = this.ax[s2];
                    i8 = this.ay[s2];
                }
                if ((H != -1 ? H : this.an[i]) == -1 || i2 == 3) {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.al[i], H != -1 ? H : this.al[i], bd[i6], bd[i7], bd[i8], be[i6], be[i7], be[i8], bf[i6], bf[i7], bf[i8], this.Y[i], bc[i3], bc[i4], bc[i5]);
                    return;
                } else if (Configuration.ah) {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.am[i], H != -1 ? H : this.an[i], bd[i6], bd[i7], bd[i8], be[i6], be[i7], be[i8], bf[i6], bf[i7], bf[i8], this.Y[i]);
                    return;
                } else {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.am[i], H != -1 ? H : this.an[i], bd[i6], bd[i7], bd[i8], be[i6], be[i7], be[i8], bf[i6], bf[i7], bf[i8], this.Y[i], bc[i3], bc[i4], bc[i5]);
                    return;
                }
            }
            if (i2 == 0) {
                if (!Configuration.av || e.a()) {
                    if (this.V > 0) {
                        class_332.a(ba[this.ai[i]], ba[this.aj[i]], ba[this.ak[i]], aZ[this.ai[i]], aZ[this.aj[i]], aZ[this.ak[i]], class_332.a(this.al[i], this.S, this.T, this.U, this.V), class_332.a(this.am[i], this.S, this.T, this.U, this.V), class_332.a(this.an[i], this.S, this.T, this.U, this.V));
                        return;
                    } else {
                        class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.am[i], H != -1 ? H : this.an[i]);
                        return;
                    }
                }
                if (this.V <= 0) {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.am[i], H != -1 ? H : this.an[i], bc[i3], bc[i4], bc[i5]);
                    return;
                }
                class_332.a(ba[this.ai[i]], ba[this.aj[i]], ba[this.ak[i]], aZ[this.ai[i]], aZ[this.aj[i]], aZ[this.ak[i]], H != -1 ? H : class_332.a(this.al[i], this.S, this.T, this.U, this.V), H != -1 ? H : class_332.a(this.am[i], this.S, this.T, this.U, this.V), H != -1 ? H : class_332.a(this.an[i], this.S, this.T, this.U, this.V), bc[this.ai[i]], bc[this.aj[i]], bc[this.ak[i]]);
                return;
            }
            if (i2 == 1) {
                int i9 = bC[H != -1 ? H : this.al[i]];
                if (this.aI > 0) {
                    i9 = this.aI;
                }
                if (Configuration.av) {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], i9, bc[i3], bc[i4], bc[i5]);
                    return;
                } else {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], i9);
                    return;
                }
            }
            if (i2 == 2) {
                int i10 = (H != -1 ? H : this.ao[i]) >> 2;
                int i11 = this.aw[i10];
                int i12 = this.ax[i10];
                int i13 = this.ay[i10];
                if (!Configuration.av || (e.a() && !(e.a() && class_332.p))) {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.am[i], H != -1 ? H : this.an[i], bd[i11], bd[i12], bd[i13], be[i11], be[i12], be[i13], bf[i11], bf[i12], bf[i13], this.ar[i]);
                    return;
                } else {
                    class_332.a(this.bJ, ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.am[i], H != -1 ? H : this.an[i], bd[i11], bd[i12], bd[i13], be[i11], be[i12], be[i13], bf[i11], bf[i12], bf[i13], this.ar[i], bc[i3], bc[i4], bc[i5]);
                    return;
                }
            }
            if (i2 == 3) {
                int i14 = this.ao[i] >> 2;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                if (i14 < this.aw.length) {
                    i15 = this.aw[i14];
                    i16 = this.ax[i14];
                    i17 = this.ay[i14];
                }
                if (Configuration.av || e.a()) {
                    if (this.V > 0) {
                        class_332.a(ba[this.ai[i]], ba[this.aj[i]], ba[this.ak[i]], aZ[this.ai[i]], aZ[this.aj[i]], aZ[this.ak[i]], class_332.a(this.al[i], this.S, this.T, this.U, this.V), class_332.a(this.am[i], this.S, this.T, this.U, this.V), class_332.a(this.an[i], this.S, this.T, this.U, this.V), bc[this.ai[i]], bc[this.aj[i]], bc[this.ak[i]]);
                        return;
                    } else {
                        class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.al[i], H != -1 ? H : this.al[i], bd[i15], bd[i16], bd[i17], be[i15], be[i16], be[i17], bf[i15], bf[i16], bf[i17], this.ar[i], bc[i3], bc[i4], bc[i5]);
                        return;
                    }
                }
                if (this.V > 0) {
                    class_332.a(ba[this.ai[i]], ba[this.aj[i]], ba[this.ak[i]], aZ[this.ai[i]], aZ[this.aj[i]], aZ[this.ak[i]], class_332.a(this.al[i], this.S, this.T, this.U, this.V), class_332.a(this.am[i], this.S, this.T, this.U, this.V), class_332.a(this.an[i], this.S, this.T, this.U, this.V));
                } else {
                    class_332.a(ba[i3], ba[i4], ba[i5], aZ[i3], aZ[i4], aZ[i5], H != -1 ? H : this.al[i], H != -1 ? H : this.al[i], H != -1 ? H : this.al[i], bd[i15], bd[i16], bd[i17], be[i15], be[i16], be[i17], bf[i15], bf[i16], bf[i17], this.ar[i]);
                }
            }
        }
    }

    private final void r(int i) {
        if (this.ar == null || this.ar[i] != 65535) {
            int i2 = class_332.s;
            int i3 = class_332.t;
            int i4 = 0;
            int i5 = this.ai[i];
            int i6 = this.aj[i];
            int i7 = this.ak[i];
            int i8 = bf[i5];
            int i9 = bf[i6];
            int i10 = bf[i7];
            if (i8 >= 50) {
                bn[0] = aZ[i5];
                bo[0] = ba[i5];
                i4 = 0 + 1;
                bp[0] = this.al[i];
            } else {
                int i11 = bd[i5];
                int i12 = be[i5];
                int i13 = this.al[i];
                if (i10 >= 50) {
                    int i14 = (50 - i8) * bD[i10 - i8];
                    bn[0] = i2 + (((i11 + (((bd[i7] - i11) * i14) >> 16)) << 9) / 50);
                    bo[0] = i3 + (((i12 + (((be[i7] - i12) * i14) >> 16)) << 9) / 50);
                    i4 = 0 + 1;
                    bp[0] = i13 + (((this.an[i] - i13) * i14) >> 16);
                }
                if (i9 >= 50) {
                    int i15 = (50 - i8) * bD[i9 - i8];
                    bn[i4] = i2 + (((i11 + (((bd[i6] - i11) * i15) >> 16)) << 9) / 50);
                    bo[i4] = i3 + (((i12 + (((be[i6] - i12) * i15) >> 16)) << 9) / 50);
                    int i16 = i4;
                    i4++;
                    bp[i16] = i13 + (((this.am[i] - i13) * i15) >> 16);
                }
            }
            if (i9 >= 50) {
                bn[i4] = aZ[i6];
                bo[i4] = ba[i6];
                int i17 = i4;
                i4++;
                bp[i17] = this.am[i];
            } else {
                int i18 = bd[i6];
                int i19 = be[i6];
                int i20 = this.am[i];
                if (i8 >= 50) {
                    int i21 = (50 - i9) * bD[i8 - i9];
                    bn[i4] = i2 + (((i18 + (((bd[i5] - i18) * i21) >> 16)) << 9) / 50);
                    bo[i4] = i3 + (((i19 + (((be[i5] - i19) * i21) >> 16)) << 9) / 50);
                    int i22 = i4;
                    i4++;
                    bp[i22] = i20 + (((this.al[i] - i20) * i21) >> 16);
                }
                if (i10 >= 50) {
                    int i23 = (50 - i9) * bD[i10 - i9];
                    bn[i4] = i2 + (((i18 + (((bd[i7] - i18) * i23) >> 16)) << 9) / 50);
                    bo[i4] = i3 + (((i19 + (((be[i7] - i19) * i23) >> 16)) << 9) / 50);
                    int i24 = i4;
                    i4++;
                    bp[i24] = i20 + (((this.an[i] - i20) * i23) >> 16);
                }
            }
            if (i10 >= 50) {
                bn[i4] = aZ[i7];
                bo[i4] = ba[i7];
                int i25 = i4;
                i4++;
                bp[i25] = this.an[i];
            } else {
                int i26 = bd[i7];
                int i27 = be[i7];
                int i28 = this.an[i];
                if (i9 >= 50) {
                    int i29 = (50 - i10) * bD[i9 - i10];
                    bn[i4] = i2 + (((i26 + (((bd[i6] - i26) * i29) >> 16)) << 9) / 50);
                    bo[i4] = i3 + (((i27 + (((be[i6] - i27) * i29) >> 16)) << 9) / 50);
                    int i30 = i4;
                    i4++;
                    bp[i30] = i28 + (((this.am[i] - i28) * i29) >> 16);
                }
                if (i8 >= 50) {
                    int i31 = (50 - i10) * bD[i8 - i10];
                    bn[i4] = i2 + (((i26 + (((bd[i5] - i26) * i31) >> 16)) << 9) / 50);
                    bo[i4] = i3 + (((i27 + (((be[i5] - i27) * i31) >> 16)) << 9) / 50);
                    int i32 = i4;
                    i4++;
                    bp[i32] = i28 + (((this.al[i] - i28) * i31) >> 16);
                }
            }
            int i33 = bn[0];
            int i34 = bn[1];
            int i35 = bn[2];
            int i36 = bo[0];
            int i37 = bo[1];
            int i38 = bo[2];
            if (((i33 - i34) * (i38 - i37)) - ((i36 - i37) * (i35 - i34)) > 0) {
                class_332.o = false;
                int i39 = i5;
                int i40 = i6;
                int i41 = i7;
                if (i4 == 3) {
                    if (i33 < 0 || i34 < 0 || i35 < 0 || i33 > class_210.n || i34 > class_210.n || i35 > class_210.n) {
                        class_332.o = true;
                    }
                    int i42 = this.ao == null ? 0 : this.ao[i] & 3;
                    if (this.Y != null && this.Y[i] != -1) {
                        if (this.Z != null && this.Z[i] != -1) {
                            short s2 = this.Z[i];
                            i39 = this.aw[s2];
                            i40 = this.ax[s2];
                            i41 = this.ay[s2];
                        }
                        if (this.an[i] == -1) {
                            class_332.a(i36, i37, i38, i33, i34, i35, this.al[i], this.al[i], this.al[i], bd[i39], bd[i40], bd[i41], be[i39], be[i40], be[i41], bf[i39], bf[i40], bf[i41], this.Y[i], bc[i5], bc[i6], bc[i7]);
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], bd[i39], bd[i40], bd[i41], be[i39], be[i40], be[i41], bf[i39], bf[i40], bf[i41], this.Y[i], bc[i5], bc[i6], bc[i7]);
                        }
                    } else if (i42 == 0) {
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], -1.0f, -1.0f, -1.0f);
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2]);
                        }
                    } else if (i42 == 1) {
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, bC[this.al[i]], -1.0f, -1.0f, -1.0f);
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bC[this.al[i]]);
                        }
                    } else if (i42 == 2) {
                        int i43 = this.ao[i] >> 2;
                        int i44 = this.aw[i43];
                        int i45 = this.ax[i43];
                        int i46 = this.ay[i43];
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], bd[i44], bd[i45], bd[i46], be[i44], be[i45], be[i46], bf[i44], bf[i45], bf[i46], this.ar[i], bc[i5], bc[i6], bc[i7]);
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], bd[i44], bd[i45], bd[i46], be[i44], be[i45], be[i46], bf[i44], bf[i45], bf[i46], this.ar[i]);
                        }
                    } else if (i42 == 3) {
                        int i47 = this.ao[i] >> 2;
                        int i48 = this.aw[i47];
                        int i49 = this.ax[i47];
                        int i50 = this.ay[i47];
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, this.al[i], this.al[i], this.al[i], bd[i48], bd[i49], bd[i50], be[i48], be[i49], be[i50], bf[i48], bf[i49], bf[i50], this.ar[i], bc[i5], bc[i6], bc[i7]);
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, this.al[i], this.al[i], this.al[i], bd[i48], bd[i49], bd[i50], be[i48], be[i49], be[i50], bf[i48], bf[i49], bf[i50], this.ar[i]);
                        }
                    }
                }
                if (i4 == 4) {
                    if (i33 < 0 || i34 < 0 || i35 < 0 || i33 > class_210.n || i34 > class_210.n || i35 > class_210.n || bn[3] < 0 || bn[3] > class_210.n) {
                        class_332.o = true;
                    }
                    int i51 = this.ao == null ? 0 : this.ao[i] & 3;
                    if (this.Y != null && this.Y[i] != -1) {
                        if (this.Z != null && this.Z[i] != -1) {
                            short s3 = this.Z[i];
                            i39 = this.aw[s3];
                            i40 = this.ax[s3];
                            i41 = this.ay[s3];
                        }
                        if (this.an[i] == -1) {
                            class_332.a(i36, i37, i38, i33, i34, i35, this.al[i], this.al[i], this.al[i], bd[i39], bd[i40], bd[i41], be[i39], be[i40], be[i41], bf[i39], bf[i40], bf[i41], this.Y[i], bc[i5], bc[i6], bc[i7]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], this.al[i], this.al[i], this.al[i], bd[i39], bd[i40], bd[i41], be[i39], be[i40], be[i41], bf[i39], bf[i40], bf[i41], this.Y[i], bc[i5], bc[i6], bc[i7]);
                            return;
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], bd[i39], bd[i40], bd[i41], be[i39], be[i40], be[i41], bf[i39], bf[i40], bf[i41], this.Y[i], bc[i5], bc[i6], bc[i7]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], bp[0], bp[2], bp[3], bd[i39], bd[i40], bd[i41], be[i39], be[i40], be[i41], bf[i39], bf[i40], bf[i41], this.Y[i], bc[i5], bc[i6], bc[i7]);
                            return;
                        }
                    }
                    if (i51 == 0) {
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], -1.0f, -1.0f, -1.0f);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], bp[0], bp[2], bp[3], bc[i5], bc[i6], bc[i7]);
                            return;
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], bp[0], bp[2], bp[3]);
                            return;
                        }
                    }
                    if (i51 == 1) {
                        int i52 = bC[this.al[i]];
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, i52, -1.0f, -1.0f, -1.0f);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], i52, bc[i5], bc[i6], bc[i7]);
                            return;
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, i52);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], i52);
                            return;
                        }
                    }
                    if (i51 == 2) {
                        int i53 = this.ao[i] >> 2;
                        int i54 = this.aw[i53];
                        int i55 = this.ax[i53];
                        int i56 = this.ay[i53];
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], bd[i54], bd[i55], bd[i56], be[i54], be[i55], be[i56], bf[i54], bf[i55], bf[i56], this.ar[i], bc[i5], bc[i6], bc[i7]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], bp[0], bp[2], bp[3], bd[i54], bd[i55], bd[i56], be[i54], be[i55], be[i56], bf[i54], bf[i55], bf[i56], this.ar[i], bc[i5], bc[i6], bc[i7]);
                            return;
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, bp[0], bp[1], bp[2], bd[i54], bd[i55], bd[i56], be[i54], be[i55], be[i56], bf[i54], bf[i55], bf[i56], this.ar[i]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], bp[0], bp[2], bp[3], bd[i54], bd[i55], bd[i56], be[i54], be[i55], be[i56], bf[i54], bf[i55], bf[i56], this.ar[i]);
                            return;
                        }
                    }
                    if (i51 == 3) {
                        int i57 = this.ao[i] >> 2;
                        int i58 = this.aw[i57];
                        int i59 = this.ax[i57];
                        int i60 = this.ay[i57];
                        if (Configuration.av) {
                            class_332.a(i36, i37, i38, i33, i34, i35, this.al[i], this.al[i], this.al[i], bd[i58], bd[i59], bd[i60], be[i58], be[i59], be[i60], bf[i58], bf[i59], bf[i60], this.ar[i], bc[i5], bc[i6], bc[i7]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], this.al[i], this.al[i], this.al[i], bd[i58], bd[i59], bd[i60], be[i58], be[i59], be[i60], bf[i58], bf[i59], bf[i60], this.ar[i], bc[i5], bc[i6], bc[i7]);
                        } else {
                            class_332.a(i36, i37, i38, i33, i34, i35, this.al[i], this.al[i], this.al[i], bd[i58], bd[i59], bd[i60], be[i58], be[i59], be[i60], bf[i58], bf[i59], bf[i60], this.ar[i]);
                            class_332.a(i36, i38, bo[3], i33, i35, bn[3], this.al[i], this.al[i], this.al[i], bd[i58], bd[i59], bd[i60], be[i58], be[i59], be[i60], bf[i58], bf[i59], bf[i60], this.ar[i]);
                        }
                    }
                }
            }
        }
    }

    private final boolean b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i >= i6 || i >= i7 || i >= i8) {
            return i <= i6 || i <= i7 || i <= i8;
        }
        return false;
    }

    public void m(int i) {
        this.P = i;
    }

    public int r() {
        return this.P;
    }

    public void n(int i) {
        this.Q = i;
    }

    public void o(int i) {
        this.R = i;
    }

    public int s() {
        return this.R;
    }

    public int t() {
        return this.Q;
    }

    public int u() {
        return this.aD;
    }

    public int v() {
        return this.aG;
    }

    public int w() {
        return this.aF;
    }

    public static void e(boolean z) {
        bE = z;
    }

    public int x() {
        return this.bI;
    }

    public HashMap<Integer, a> y() {
        return this.bH;
    }

    public a p(int i) {
        l(i);
        this.bI = i;
        return y().get(Integer.valueOf(this.bI));
    }

    public int z() {
        return this.ad;
    }

    public int[] A() {
        return this.ae;
    }

    public int[] B() {
        return this.af;
    }

    public int[] C() {
        return this.ag;
    }

    public int[] D() {
        return this.ai;
    }

    public int[] E() {
        return this.aj;
    }

    public int[] F() {
        return this.ak;
    }

    public int G() {
        return this.ah;
    }

    public int[] H() {
        return this.aq;
    }
}
