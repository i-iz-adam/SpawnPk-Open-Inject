package rs;

import com.google.inject.internal.asm.$Opcodes;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aW;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/Player.class */
public final class Player extends Entity {
    public int ay;
    public long az;
    public int aA;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public boolean aR;
    public int[] aS;
    public class_102 aT;
    public int aX;
    public int aY;
    public String aZ;
    public String ba;
    public int bb;
    public int bc;
    public int headIconId;
    public int be;
    public int bf;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public int bn;
    public int bo;
    public int bp;
    public ColorUtility bq;
    public int bs;
    private long bC;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public long bz;
    public static Player av = new class_199().n();
    public static int aw = 0;
    public static int ax = 0;
    public static ColorUtility aB = null;
    public static boolean aJ = false;
    public static boolean aK = false;
    public static class_30 aL = new class_30(260);
    public static class_30 aM = new class_30(260);
    public static class_30 aN = new class_30(260);
    public static class_30 aO = new class_30(260);
    public static class_30 aP = new class_30(25);
    public static class_30 aQ = new class_30(25);
    private boolean bA = false;
    public final int[] aW = new int[28];
    private long bB = -1;
    public boolean aU = false;
    public final int[] aV = new int[5];
    public boolean bm = false;
    public final int[] equipment = new int[12];

    public ColorUtility b(boolean z) {
        ColorUtility colorUtility;
        if (!this.bm) {
            return null;
        }
        if (q() && !Configuration.N) {
            return null;
        }
        if (this.aC == 25 && !Configuration.bo && this.m == -1) {
            return null;
        }
        ColorUtility colorUtilityC = c(z);
        if (colorUtilityC == null) {
            return null;
        }
        ColorUtility colorUtilityA = null;
        if (this.z != -1 && this.A != -1 && z) {
            class_127 class_127Var = class_127.c[this.z];
            colorUtilityA = (class_127Var.g == null || !class_127Var.g.b()) ? class_127Var.a() : class_127Var.c(this.A);
            boolean z2 = this.z >= 1181 && this.z <= 1183;
            if (this.z == 769 && this.A <= 12) {
                z2 = true;
            }
            if (colorUtilityA != null && z2) {
                ColorUtility colorUtility2 = null;
                if (!class_127Var.g.b()) {
                    colorUtility2 = new ColorUtility(true, class_176.g(this.A), false, colorUtilityA);
                    colorUtility2.a(0, -this.D, 0);
                    colorUtility2.n();
                    colorUtility2.f(class_127Var.g.e[this.A], class_127Var.g.r);
                }
                colorUtility2.aM = null;
                colorUtility2.aL = null;
                if (class_127Var.j != 128 || class_127Var.k != 128) {
                    colorUtility2.b(class_127Var.j, class_127Var.j, class_127Var.k);
                }
                colorUtility2.b(64 + class_127Var.m, 850 + class_127Var.n, -30, -50, -30, true);
                return colorUtility2;
            }
        }
        this.r = colorUtilityC.g;
        colorUtilityC.aN = true;
        if (this.aU) {
            return colorUtilityC;
        }
        if (colorUtilityA != null) {
            class_127 class_127Var2 = class_127.c[this.z];
            boolean z3 = false;
            class_49 class_49Var = ColorUtility.h;
            if (class_127Var2.g.b()) {
                colorUtility = colorUtilityA;
                colorUtility.a(0, -this.D, 0);
            } else {
                if (u()) {
                    class_49Var = (class_49) class_127.q.a(this.z);
                    if (class_49Var == null) {
                        class_49Var = new class_49(true);
                        class_49Var.e();
                        z3 = true;
                    }
                }
                colorUtility = new ColorUtility(true, class_176.g(this.A), false, colorUtilityA, class_49Var);
                colorUtility.i = class_49Var;
                colorUtility.a(0, -this.D, 0);
                colorUtility.n();
                colorUtility.f(class_127Var2.g.e[this.A], class_127Var2.g.r);
            }
            colorUtility.aM = null;
            colorUtility.aL = null;
            if (class_127Var2.j != 128 || class_127Var2.k != 128) {
                colorUtility.b(class_127Var2.j, class_127Var2.j, class_127Var2.k);
            }
            colorUtility.b(64 + class_127Var2.m, 850 + class_127Var2.n, -30, -50, -30, true);
            if (z3) {
                class_127.q.a(class_49Var, this.z);
            }
            long j = this.bC + ((long) (1000000 + this.z));
            class_49 class_49Var2 = ColorUtility.h;
            colorUtilityC = new ColorUtility(new ColorUtility[]{colorUtilityC, colorUtility}, class_49Var2);
            colorUtilityC.i = class_49Var2;
            colorUtilityC.f();
        }
        if (this.bq != null) {
            if (Client.ff >= this.bk) {
                this.bq = null;
            }
            if (Client.ff >= this.bj && Client.ff < this.bk) {
                ColorUtility colorUtility3 = this.bq;
                colorUtility3.a(this.bn - this.ac, this.bo - this.bl, this.bp - this.ad);
                if (z) {
                    if (this.s == 512) {
                        colorUtility3.o();
                        colorUtility3.o();
                        colorUtility3.o();
                    } else if (this.s == 1024) {
                        colorUtility3.o();
                        colorUtility3.o();
                    } else if (this.s == 1536) {
                        colorUtility3.o();
                    }
                }
                colorUtilityC = new ColorUtility(new ColorUtility[]{colorUtilityC, colorUtility3});
                if (z) {
                    if (this.s == 512) {
                        colorUtility3.o();
                    } else if (this.s == 1024) {
                        colorUtility3.o();
                        colorUtility3.o();
                    } else if (this.s == 1536) {
                        colorUtility3.o();
                        colorUtility3.o();
                        colorUtility3.o();
                    }
                }
                colorUtility3.a(this.ac - this.bn, this.bl - this.bo, this.ad - this.bp);
            }
        }
        if (this.ar > 0) {
            colorUtilityC.S = this.ar;
            colorUtilityC.T = this.ap;
            colorUtilityC.U = this.aq;
            colorUtilityC.V = this.ar;
        } else {
            colorUtilityC.V = (byte) 0;
        }
        colorUtilityC.aN = true;
        return colorUtilityC;
    }

    @Override // rs.class_48
    public ColorUtility c() {
        return b(true);
    }

    public static ColorUtility a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        return a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, 0);
    }

    public static ColorUtility a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = {i5, i12, i11, i, i14, i2, i3, i4, i9, i6, i10, i8, i7};
        boolean z = false;
        for (int i15 = 0; i15 < 13; i15++) {
            int i16 = iArr[i15];
            if (i16 >= 256 && i16 < 512 && !class_110.b[i16 - 256].c()) {
                z = true;
            }
            if (i16 >= 512 && !ItemComposition.lookupItem(i16 - 512).a(i13)) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        ColorUtility[] colorUtilityArr = new ColorUtility[12];
        int i17 = 0;
        for (int i18 = 0; i18 < 13; i18++) {
            int i19 = iArr[i18];
            if (-1 >= 0 && i18 == 3) {
                i19 = -1;
            }
            if (-1 >= 0 && i18 == 5) {
                i19 = -1;
            }
            if (i19 >= 256 && i19 < 512) {
                ColorUtility colorUtilityB = class_110.b[i19 - 256].b();
                if (colorUtilityB != null) {
                    int i20 = i17;
                    i17++;
                    colorUtilityArr[i20] = colorUtilityB;
                } else {
                    z = true;
                }
            }
            if (i19 >= 512) {
                ColorUtility colorUtilityD = ItemComposition.lookupItem(i19 - 512).d(i13);
                if (colorUtilityD != null) {
                    if (b(i19 - 512)) {
                        int[] iArr2 = class_488.bH;
                        colorUtilityD.ar = b(iArr2[4], iArr2[0], iArr2[2], iArr2[1], iArr2[3], iArr2[5]);
                    }
                    int i21 = i17;
                    i17++;
                    colorUtilityArr[i21] = colorUtilityD;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            return null;
        }
        return new ColorUtility(i17, colorUtilityArr);
    }

    public static boolean b(int i) {
        return i == 23063 || i == 21963 || i == 21964;
    }

    public void a(Buffer buffer) {
        int i;
        buffer.h = 0;
        this.aY = buffer.y();
        this.headIconId = buffer.y();
        this.bf = buffer.y();
        this.bg = buffer.y();
        this.bh = buffer.y();
        this.aC = buffer.B();
        if (Configuration.d.booleanValue()) {
            Client.cx.add("\t\t---> gender=" + this.aY + ",headIcon=" + this.headIconId + ",skullIcon=" + this.bf + ",orbIcon=" + this.bg + ",miscIcon=" + this.bh + ",privilege=" + this.aC);
        }
        this.aT = null;
        this.aX = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            int iY = buffer.y();
            if (iY != 0) {
                this.equipment[i2] = (iY << 8) + buffer.y();
                if (i2 == 0 && this.equipment[0] == 65535) {
                    this.ay = buffer.A();
                    this.aT = class_102.c(this.ay);
                    break;
                } else if (this.equipment[i2] >= 512 && this.equipment[i2] - 512 < ItemComposition.ad && (i = ItemComposition.lookupItem(this.equipment[i2] - 512).ac) != 0) {
                    this.aX = i;
                }
            } else {
                this.equipment[i2] = 0;
            }
        }
        int iY2 = buffer.y();
        if (iY2 == 1) {
            this.bs = buffer.A();
        } else {
            this.bs = -1;
        }
        if (Configuration.d.booleanValue()) {
            Client.cx.add("\t\t---> cosmetic=" + iY2);
        }
        for (int i3 = 0; i3 < 5; i3++) {
            int iY3 = buffer.y();
            if (iY3 < 0 || iY3 >= Client.dU[i3].length) {
                iY3 = 0;
            }
            this.aV[i3] = iY3;
        }
        int i4 = -1;
        if (this.equipment != null && this.equipment.length > 3) {
            i4 = this.equipment[3] - 512;
        }
        this.t = buffer.A();
        if (this.t == 65535) {
            this.t = -1;
        }
        if (Configuration.aj && this.t == 7047) {
            this.t = aU.Dq;
        }
        if (!Configuration.aj && this.t == 7518) {
            this.t = 1662;
        }
        if (!Configuration.aj && this.t == 808 && (i4 == 4151 || i4 == 25000 || i4 == 20523 || i4 == 20689)) {
            this.t = 11973;
        }
        this.u = buffer.A();
        if (this.u == 65535) {
            this.u = -1;
        }
        if (Configuration.aj && this.u == 7044) {
            this.u = aU.Dk;
        }
        this.ag = buffer.A();
        if (this.ag == 65535) {
            this.ag = -1;
        }
        if (Configuration.aj && this.ag == 7046) {
            this.ag = aU.Dp;
        }
        if (!Configuration.aj && this.ag == 7520) {
            this.ag = 1663;
        }
        if (!Configuration.aj && this.ag == 1422) {
            this.ag = 819;
        }
        this.ah = buffer.A();
        if (this.ah == 65535) {
            this.ah = -1;
        }
        this.ai = buffer.A();
        if (this.ai == 65535) {
            this.ai = -1;
        }
        this.aj = buffer.A();
        if (this.aj == 65535) {
            this.aj = -1;
        }
        this.p = buffer.A();
        if (this.p == 65535) {
            this.p = -1;
        }
        if (Configuration.aj && this.p == 7039) {
            this.p = 7043;
        }
        if (!Configuration.aj && this.p == 7519) {
            this.p = 1664;
        }
        if (!Configuration.aj && this.p == 15523) {
            this.p = aU.lF;
        }
        if (this.aT != null && this.ay > 0) {
            this.t = this.aT.w;
            this.u = this.aT.w;
            this.ag = this.aT.q;
            this.p = this.aT.q;
            this.ah = this.aT.l;
            this.ai = this.aT.j;
            this.aj = this.aT.B;
        }
        this.bb = buffer.y();
        if (this.bb != 0) {
            this.ba = buffer.F();
        }
        this.aZ = buffer.F();
        if (Configuration.d.booleanValue()) {
            Client.cx.add("\t\t---> name=" + this.aZ);
        }
        this.bc = buffer.y();
        this.by = buffer.A();
        if (this.by > 0) {
            this.bz = System.currentTimeMillis();
        }
        this.ar = (byte) buffer.y();
        if (this.ar > 0) {
            this.ao = (byte) buffer.y();
            this.ap = (byte) buffer.y();
            this.aq = (byte) buffer.y();
        }
        boolean z = buffer.y() == 1;
        if (Configuration.d.booleanValue()) {
            Client.cx.add("\t\t---> hasCompColors=" + z);
        }
        if (z) {
            int iA = class_488.a(buffer.y(), true);
            int iA2 = class_488.a(buffer.y(), true);
            int iA3 = class_488.a(buffer.y(), true);
            int iA4 = class_488.a(buffer.y(), true);
            int iA5 = class_488.a(buffer.y(), true);
            int iA6 = class_488.a(buffer.y(), false);
            if (Configuration.d.booleanValue()) {
                Client.cx.add("\t\t---> compColors=" + iA + "," + iA2 + "," + iA3 + "," + iA4 + "," + iA5 + "," + iA6);
            }
            a(iA, iA2, iA3, iA4, iA5, iA6);
        }
        this.bm = true;
        this.bC = 0L;
        for (int i5 = 0; i5 < 12; i5++) {
            this.bC <<= 4;
            if (this.equipment[i5] >= 256) {
                if (i5 == 1 && b(this.equipment[i5] - 512)) {
                    this.bC += (long) (50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI);
                } else {
                    this.bC += (long) (this.equipment[i5] - 256);
                }
            }
        }
        if (this.bs > 0) {
            this.bC += (long) (this.bs - 256);
        }
        if (this.equipment[0] >= 256) {
            this.bC += (long) ((this.equipment[0] - 256) >> 4);
        }
        if (this.equipment[1] >= 256) {
            if (b(this.equipment[1] - 512)) {
                this.bC += (long) ((((((((50000 + this.aH) + this.aF) + this.aG) + this.aE) + this.aD) + this.aI) - 256) >> 8);
            } else {
                this.bC += (long) ((this.equipment[1] - 256) >> 8);
            }
        }
        this.aR = false;
        if (this.equipment[1] - 512 == 19000 || this.equipment[1] - 512 == 3789 || this.equipment[1] - 512 == 23490 || this.equipment[1] - 512 == 23465 || this.equipment[1] - 512 == 22123 || this.equipment[1] - 512 == 22122 || this.equipment[1] - 512 == 21634 || this.equipment[1] - 512 == 21633 || (this.equipment[1] - 512 >= 24151 && this.equipment[1] - 512 <= 24146)) {
            this.aR = true;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            this.bC <<= 3;
            this.bC += (long) this.aV[i6];
        }
        this.bC <<= 1;
        this.bC += (long) this.aY;
    }

    public class_99 c(int i) {
        if (i < 0) {
            return null;
        }
        class_99 class_99Var = class_99.a[i];
        if (this.primarySeqID > 0 && class_99Var != null) {
            class_99 class_99Var2 = class_99.a[this.primarySeqID];
            if ((!Configuration.aj) && class_99Var2 != null && class_99Var2.w && !class_99Var.w && class_99.c[i] != null) {
                return class_99.c[i];
            }
        }
        return class_99Var;
    }

    public ColorUtility m() {
        return c(true);
    }

    public ColorUtility c(boolean z) {
        int i;
        ColorUtility colorUtilityD;
        int iP = p();
        if (!z) {
            iP = 808;
        }
        if (this.primarySeqID == 7533 && !Configuration.aj) {
            iP = 808;
        }
        if (this.primarySeqID == 451) {
            if (Configuration.aj) {
                this.primarySeqID = 390;
            } else {
                this.primarySeqID = 13039;
            }
        }
        if (this.primarySeqID == 426 && Configuration.aj) {
            this.primarySeqID = 15409;
        }
        if (this.primarySeqID == 10961 && Configuration.aj) {
            this.primarySeqID = 7514;
        }
        if (this.primarySeqID == 7516 && !Configuration.aj) {
            this.primarySeqID = 13055;
        }
        if (this.primarySeqID == 7517 && !Configuration.aj) {
            this.primarySeqID = 13054;
        }
        if (this.primarySeqID == 2067 && !Configuration.aj) {
            this.primarySeqID = 2066;
        }
        if ((this.primarySeqID == 6381 || this.primarySeqID == 7074) && Configuration.aj) {
            this.primarySeqID = aU.Dy;
        }
        if (this.primarySeqID == 7042 && Configuration.aj) {
            this.primarySeqID = aU.Ds;
        }
        if (this.primarySeqID == 7049 && Configuration.aj) {
            this.primarySeqID = aU.Dl;
        }
        if (this.primarySeqID == 7041 && Configuration.aj) {
            this.primarySeqID = aU.Dr;
        }
        if (this.primarySeqID == 7048 && Configuration.aj) {
            this.primarySeqID = aU.Dl;
        }
        if (this.primarySeqID == 13051 && Configuration.aj) {
            this.primarySeqID = aU.Dt;
        }
        if (this.primarySeqID == 8145 && !Configuration.aj) {
            this.primarySeqID = 13049;
        }
        class_99 class_99VarC = c(iP);
        if (z) {
            if (this.x < 0) {
                this.x = 0;
            }
            if (class_99VarC != null && !class_99VarC.b() && this.x >= class_99VarC.e.length) {
                this.x = class_99VarC.e.length - 1;
            }
        }
        int length = this.x;
        if (length < 0) {
            length = 0;
        }
        if (class_99VarC != null && length >= class_99VarC.e.length) {
            length = class_99VarC.e.length - 1;
        }
        if (this.aT != null) {
            int i2 = -1;
            if (this.primarySeqID >= 0 && this.primarySeqDelay == 0) {
                i2 = class_99.a[this.primarySeqID].b() ? this.G : class_99.a[this.primarySeqID].e[this.G];
            } else if (iP >= 0) {
                i2 = class_99.a[iP].b() ? length : class_99.a[iP].e[length];
            }
            return this.aT.a(-1, i2, null, (this.primarySeqID < 0 || this.primarySeqDelay != 0) ? iP : this.primarySeqID);
        }
        long j = this.bC;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = Configuration.bb ? this.bs : 0;
        if (this.primarySeqID >= 0 && this.primarySeqDelay == 0 && z) {
            class_99 class_99Var = class_99.a[this.primarySeqID];
            i = class_99Var.e[this.G];
            if (class_99VarC != null && iP != this.t) {
                i3 = class_99VarC.e[length];
            }
            if (class_99Var.l >= 0) {
                i4 = class_99Var.l;
                j += (long) ((i4 - this.equipment[5]) << 40);
            }
            if (class_99Var.m >= 0) {
                i5 = class_99Var.m;
                j += (long) ((i5 - this.equipment[3]) << 48);
            } else if (this.equipment[3] == 28560) {
                i5 = 28561;
                j += (long) ((28561 - this.equipment[3]) << 48);
            }
        } else {
            i = class_99VarC != null ? class_99VarC.e[length] : -1;
            if (iP != this.t && this.equipment[3] == 28560) {
                i5 = 28561;
                j += (long) ((28561 - this.equipment[3]) << 48);
            }
        }
        ColorUtility colorUtility = (ColorUtility) r().a(j);
        if (colorUtility == null || this.i) {
            boolean z2 = false;
            for (int i7 = 0; i7 < 12; i7++) {
                int i8 = this.equipment[i7];
                if (i5 >= 0 && i7 == 3) {
                    i8 = i5;
                }
                if (i4 >= 0 && i7 == 5) {
                    i8 = i4;
                }
                if (i8 >= 256 && i8 < 512 && !class_110.b[i8 - 256].a()) {
                    z2 = true;
                }
                if (i8 >= 512 && !ItemComposition.lookupItem(i8 - 512).c(this.aY)) {
                    z2 = true;
                }
            }
            if (i6 > 0 && !ItemComposition.lookupItem(i6).c(this.aY)) {
                z2 = true;
            }
            if (i6 == 28760 && !ItemComposition.lookupItem(28758).c(this.aY)) {
                z2 = true;
            }
            if (z2) {
                if (this.bB != -1) {
                    colorUtility = (ColorUtility) r().a(this.bB);
                }
                if (colorUtility == null) {
                    return null;
                }
            }
        }
        if (colorUtility == null || this.i) {
            if (!Configuration.J) {
                return null;
            }
            boolean z3 = this.i;
            ColorUtility[] colorUtilityArr = new ColorUtility[i6 > 0 ? 14 : 12];
            int i9 = 0;
            ColorUtility.bF = false;
            ColorUtility.e(true);
            for (int i10 = 0; i10 < 12; i10++) {
                int i11 = this.equipment[i10];
                if (i5 >= 0 && i10 == 3) {
                    i11 = i5;
                }
                if (i4 >= 0 && i10 == 5) {
                    i11 = i4;
                }
                if (i11 >= 256 && i11 < 512) {
                    ColorUtility.bG = i10;
                    ColorUtility colorUtilityB = class_110.b[i11 - 256].b();
                    if (colorUtilityB != null) {
                        if (Client.dU[4][this.aV[4]] == 10 || Client.dU[4][this.aV[4]] == 491769) {
                            colorUtilityB.b(new int[]{4550}, -50);
                        } else {
                            for (int[] iArr : Client.dV) {
                                if (Client.dU[4][this.aV[4]] == iArr[0]) {
                                    colorUtilityB.e(4550, iArr[1]);
                                }
                            }
                        }
                        int i12 = i9;
                        i9++;
                        colorUtilityArr[i12] = colorUtilityB;
                    }
                }
                if (i11 >= 512) {
                    ColorUtility.bG = i10;
                    ColorUtility colorUtilityD2 = ItemComposition.lookupItem(i11 - 512).d(this.aY);
                    if (colorUtilityD2 != null) {
                        if ((i10 == 0 || i10 == 4 || i10 == 7 || i10 == 9 || i10 == 10) && !ItemComposition.a((ColorUtility) null, i11 - 512)) {
                            if (Client.dU[4][this.aV[4]] == 10 || Client.dU[4][this.aV[4]] == 491769) {
                                colorUtilityD2.b(new int[]{4550}, -50);
                            } else {
                                for (int[] iArr2 : Client.dV) {
                                    if (Client.dU[4][this.aV[4]] == iArr2[0]) {
                                        colorUtilityD2.e(4550, iArr2[1]);
                                    }
                                }
                            }
                        }
                        if (b(i11 - 512)) {
                            colorUtilityD2.ar = this.aS;
                            colorUtilityD2.I = this.aI;
                        }
                        int i13 = i9;
                        i9++;
                        colorUtilityArr[i13] = colorUtilityD2;
                    }
                }
                if (i10 == 1 && i6 > 0) {
                    ColorUtility.bG = i10;
                    ColorUtility colorUtilityD3 = ItemComposition.lookupItem(i6).d(this.aY);
                    if (colorUtilityD3 != null) {
                        int i14 = i9;
                        i9++;
                        colorUtilityArr[i14] = colorUtilityD3;
                    }
                    if (i6 == 28760 && (colorUtilityD = ItemComposition.lookupItem(28758).d(this.aY)) != null) {
                        int i15 = i9;
                        i9++;
                        colorUtilityArr[i15] = colorUtilityD;
                    }
                }
            }
            class_49 class_49Var = ColorUtility.h;
            ColorUtility.bG = -1;
            ColorUtility.e(false);
            colorUtility = new ColorUtility(i9, colorUtilityArr, class_49Var);
            for (int i16 = 0; i16 < 5; i16++) {
                if (this.aV[i16] != 0) {
                    colorUtility.i(Client.dU[i16][0], Client.dU[i16][this.aV[i16]]);
                    if (i16 == 4) {
                        colorUtility.i(Client.aZ[0], Client.dU[i16][this.aV[i16]]);
                    }
                    if (i16 == 1) {
                        colorUtility.i(Client.fz[0], Client.fz[this.aV[i16]]);
                    }
                }
            }
            colorUtility.n();
            if (Configuration.aQ) {
                colorUtility.b(84, 1000, -90, -580, -90, true);
            } else {
                colorUtility.b(64, 850, -30, -50, -30, true);
            }
            if (!class_205.c) {
                r().a(colorUtility, j);
            }
            this.bB = j;
        }
        if (this.aU || aK) {
            return colorUtility;
        }
        ColorUtility colorUtility2 = ColorUtility.ac;
        colorUtility2.a(colorUtility, class_176.g(i) & class_176.g(i3));
        if (i != -1 && i3 != -1 && z) {
            colorUtility2.a(class_99.a[this.primarySeqID].i, i3, i, this.primarySeqID);
        } else if (i != -1) {
            colorUtility2.f(i, (this.primarySeqID >= 0 && this.primarySeqDelay == 0 && z) ? this.primarySeqID : iP);
        }
        colorUtility2.k();
        colorUtility2.aM = null;
        colorUtility2.aL = null;
        return colorUtility2;
    }

    @Override // rs.Entity
    public boolean l() {
        return this.bm;
    }

    public ColorUtility n() {
        ColorUtility colorUtilityB;
        ColorUtility colorUtilityB2;
        ColorUtility colorUtilityD;
        if (!this.bm) {
            return null;
        }
        if (q() && !Configuration.N) {
            return null;
        }
        if (this.aT != null) {
            return this.aT.b();
        }
        boolean z = false;
        for (int i = 0; i < 12; i++) {
            int i2 = this.equipment[i];
            if (i2 >= 256 && i2 < 512 && !class_110.b[i2 - 256].c()) {
                z = true;
            }
            if (i2 >= 512 && !ItemComposition.lookupItem(i2 - 512).a(this.aY)) {
                z = true;
            }
        }
        if (this.bs > 0 && !ItemComposition.lookupItem(this.bs).a(this.aY)) {
            z = true;
        }
        if (z) {
            return null;
        }
        ColorUtility[] colorUtilityArr = new ColorUtility[this.bs > 0 ? 13 : 12];
        int i3 = 0;
        for (int i4 = 0; i4 < 12; i4++) {
            int i5 = this.equipment[i4];
            if (i5 >= 256 && i5 < 512 && (colorUtilityD = class_110.b[i5 - 256].d()) != null) {
                for (int[] iArr : Client.dV) {
                    if (Client.dU[4][this.aV[4]] == 10 || Client.dU[4][this.aV[4]] == 491769) {
                        colorUtilityD.b(new int[]{4550}, -50);
                    } else if (Client.dU[4][this.aV[4]] == iArr[0]) {
                        colorUtilityD.e(4550, iArr[1]);
                    }
                }
                int i6 = i3;
                i3++;
                colorUtilityArr[i6] = colorUtilityD;
            }
            if (i5 >= 512 && (colorUtilityB2 = ItemComposition.lookupItem(i5 - 512).b(this.aY)) != null) {
                int i7 = i3;
                i3++;
                colorUtilityArr[i7] = colorUtilityB2;
            }
            if (i4 == 1 && this.bs > 0 && (colorUtilityB = ItemComposition.lookupItem(this.bs).b(this.aY)) != null) {
                int i8 = i3;
                i3++;
                colorUtilityArr[i8] = colorUtilityB;
            }
        }
        ColorUtility colorUtility = new ColorUtility(i3, colorUtilityArr);
        for (int i9 = 0; i9 < 5; i9++) {
            if (this.aV[i9] != 0) {
                colorUtility.i(Client.dU[i9][0], Client.dU[i9][this.aV[i9]]);
                if (i9 == 1) {
                    colorUtility.i(Client.fz[0], Client.fz[this.aV[i9]]);
                }
            }
        }
        return colorUtility;
    }

    public String o() {
        return d(false);
    }

    public String d(boolean z) {
        return a(z, (String) null);
    }

    public String a(boolean z, String str) {
        String str2 = this.aZ;
        String str3 = z ? "@bla@" : "@whi@";
        if (this.bb <= 0) {
            return str != null ? str + this.aZ : this.aZ;
        }
        if (this.bb == 1) {
            return "@red@" + this.ba + (str == null ? str3 : str) + " " + str2;
        }
        return str != null ? str + str2 + " @red@" + this.ba + str3 : str2 + " @red@" + this.ba + str3;
    }

    public String a(boolean z, String str, String str2) {
        String str3 = this.aZ;
        String str4 = z ? "@bla@" : "@whi@";
        if (this.bb <= 0) {
            return str2 != null ? str2 + this.aZ : this.aZ;
        }
        if (str2 != null) {
            str4 = str4 + str2;
        }
        return this.bb == 1 ? "@red@" + this.ba + str4 + " " + str3 : str3 + " @red@" + this.ba + str4;
    }

    public int p() {
        int i = this.w;
        int i2 = -1;
        if (this.equipment != null && this.equipment.length > 3) {
            i2 = this.equipment[3] - 512;
        }
        if (i == 244 && ((i2 == 21584 || i2 == 21585 || i2 == 21602 || i2 == 23908 || i2 == 24250 || i2 == 25555 || i2 == 25556 || i2 == 28187) && !Configuration.aj)) {
            i = 808;
        }
        if (i == 247 && ((i2 == 21584 || i2 == 21585 || i2 == 21602 || i2 == 23908 || i2 == 24250 || i2 == 25555 || i2 == 25556 || i2 == 28187) && !Configuration.aj)) {
            i = 819;
        }
        if (i == 7220 && !Configuration.aj) {
            i = 2074;
        }
        if (i == 7221 && !Configuration.aj) {
            i = 2077;
        }
        if (i == 7223 && !Configuration.aj) {
            i = 2076;
        }
        if ((i == 7518 || i == 15512) && !Configuration.aj) {
            i = 1662;
        }
        if ((i == 7520 || i == 15513) && !Configuration.aj) {
            i = 1663;
        }
        if ((i == 7519 || i == 15514) && !Configuration.aj) {
            i = 1664;
        }
        if (i == 808 && ((i2 == 4151 || i2 == 25000 || i2 == 20523 || i2 == 20689) && !Configuration.aj)) {
            i = 11973;
        }
        if (i == 2561 && !Configuration.aj) {
            i = 7047;
        }
        if (i == 824 && i2 == 4718 && !Configuration.aj) {
            i = 1664;
        }
        if (i == 809 && !Configuration.aj) {
            i = 813;
        }
        if (i == 1659 && !Configuration.aj) {
            i = 11974;
        }
        return i;
    }

    public boolean q() {
        return Client.eR != null && this == Client.eR;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.aD = i;
        this.aE = i2;
        this.aF = i3;
        this.aG = i4;
        this.aH = i5;
        this.aI = i6;
        this.aS = new int[aU.lB];
        for (int i7 = 0; i7 < this.aS.length; i7++) {
            this.aS[i7] = i;
        }
        int[] iArr = {71, 73, 74, 75, 76, 77, 78, 84, 336, class_332.l, 341, 364, 369, 370, 374, 375, 495, 496, 497, 498, 499, 500, User32.WM_EXITMENULOOP, User32.WM_NEXTMENU, User32.WM_SIZING, User32.WM_CAPTURECHANGED, 534, 548, 549, aU.jB_, User32.WM_DWMWINDOWMAXIMIZEDCHANGE, 802, User32.WM_DWMSENDICONICTHUMBNAIL, User32.WM_GETTITLEBARINFOEX, 832, 833, 839, 840, 852, 853, 854, 855, User32.WM_HANDHELDFIRST, 857, 858, 862, User32.WM_HANDHELDLAST, 865, g.t, 873, 874, 875, 876, 877, 878, 879, 880, 912, 913, 914, 915, 916, 917, 918, 919, 950, 951, 952, 953, 954, 955, 956, 968, 969, 970, 971, 972, 973, 983, 986, 987, 988};
        int[] iArr2 = {46, 47, 48, 49, 50, 67, 68, 69, 70, 72, 79, 80, 81, 82, 83, User32.WM_IME_STARTCOMPOSITION, User32.WM_IME_ENDCOMPOSITION, User32.WM_COMMAND, 274, 275, 276, 277, 278, User32.WM_INITMENUPOPUP, 280, User32.WM_MENUCOMMAND, User32.WM_CHANGEUISTATE, User32.WM_UPDATEUISTATE, User32.WM_QUERYUISTATE, aU.ia_, aU.ib_, 300, 301, aU.ie_, aU.if_, CGL.kCGLCPSurfaceBackingSize, 307, 308, 339, 342, 357, 358, 359, g.p, 366, 376, 377, 378, 379, Client.gF, 409, 410, 423, 424, 434, 435, 436, 449, 450, 451, 454, 455, 462, 463, 464, 465, 473, 476, 477, g.f, 482, 483, 484, 485, 486, aU.iq_, 488, 492, 493, 494, CGL.kCGLGOFormatCacheSize, 502, 508, 509, 510, 511, User32.WM_MOUSEHWHEEL, 527, User32.WM_PARENTNOTIFY, User32.WM_ENTERMENULOOP, 544, 545, 546, 547, 550, 551, 561, User32.WM_EXITSIZEMOVE, 563, aU.iY_, aU.iZ_, aU.ja_, aU.jb_, aU.jc_, aU.jd_, aU.je_, aU.jf_, aU.jg_, aU.jC_, 781, User32.WM_DWMNCRENDERINGCHANGED, 841, 842, 843, 844, 845, 846, g.B, 848, 849, 882, 883, 884, 885, User32.WM_PENWINFIRST, 897, 904, 905, 908, 909, 923, 924, 925, 926, 927, 936, 940, 941, 942, 943, 957, 958, 959, 977, 982};
        int[] iArr3 = {111, 112, 166, 167, 183, $Opcodes.INVOKESTATIC, aU.hy_, 218, 228, 240, 241, User32.VK_OEM_COPY, User32.VK_OEM_AUTO, User32.VK_OEM_ENLW, 253, 254, User32.WM_SYSCHAR, 263, User32.WM_MENUSELECT, 430, 470, 471, aU.ju_, aU.jv_, 815, 816, 817, 818, 819, 820, 859, 860, 861, User32.WM_AFXFIRST, 886, 887, 888, 889, 890, 891, 892, 893, 894, User32.WM_AFXLAST, 906, 907, 928, 929, 930, 931, 932, 933, 934, 935, 944, 945, 946, 947, 948, 949, 960, 961, 978, 989, aU.ih_, aW.aKu, 386, g.i, aU.jY_, aU.jZ_};
        int[] iArr4 = {113, 128, 129, 144, 145, 163, 164, 165, 168, 169, 170, 171, 176, 179, 180, 181, 182, 190, 191, 195, 196, 199, 200, 201, aU.hm_, aU.ho_, 206, aU.ht_, 211, 219, 220, 221, 224, 225, 229, 230, User32.VK_OEM_WSCTRL, User32.VK_OEM_CUSEL, 249, User32.VK_PLAY, User32.VK_ZOOM, User32.VK_NONAME, 255, 256, 257, 260, 264, User32.WM_UNICHAR, 284, 285, 286, 288, User32.WM_MENUDRAG, User32.WM_MENUGETOBJECT, User32.WM_UNINITMENUPOPUP, 311, 396, 428, 429, 468, 469, aU.jw_, aU.kh_, aU.ki_, aU.kj_, aU.kk_, aU.kl_, aU.km_, aU.kn_, aU.ko_, aU.kt_, 641, 642, 643, 644, User32.WM_IME_SELECT, 646, aU.kz_, 648, aU.kB_, aU.gs, aU.gt, aU.gu, aU.gv, aU.gw, aU.gx, 656, 661, 662, 666, 667, aU.gA, aU.gB, aU.gC, aU.gD, 672, 673, aU.gK, aU.gY, aU.gZ, aU.hi, aU.hj, aU.hB, aU.hC, aU.hD, aU.hE, aU.hF, aU.hG, aU.hH, aU.hI, 729, aU.hK, 735, aU.hQ, aU.hR, aU.hS, aU.hT, aU.hU, aU.hV, aU.hX, aU.hY, aU.hZ, aU.ia, aU.id, aU.ii, aU.ij, aU.im, aU.in, aU.io, aU.ip, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 1011, 1036, aU.jG};
        for (int i8 : iArr) {
            this.aS[i8] = i2;
        }
        for (int i9 : iArr2) {
            this.aS[i9] = i3;
        }
        for (int i10 : iArr3) {
            this.aS[i10] = i4;
        }
        for (int i11 : iArr4) {
            this.aS[i11] = i5;
        }
    }

    public static int[] b(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = new int[aU.lB];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = i;
        }
        int[] iArr2 = {71, 73, 74, 75, 76, 77, 78, 84, 336, class_332.l, 341, 364, 369, 370, 374, 375, 495, 496, 497, 498, 499, 500, User32.WM_EXITMENULOOP, User32.WM_NEXTMENU, User32.WM_SIZING, User32.WM_CAPTURECHANGED, 534, 548, 549, aU.jB_, User32.WM_DWMWINDOWMAXIMIZEDCHANGE, 802, User32.WM_DWMSENDICONICTHUMBNAIL, User32.WM_GETTITLEBARINFOEX, 832, 833, 839, 840, 852, 853, 854, 855, User32.WM_HANDHELDFIRST, 857, 858, 862, User32.WM_HANDHELDLAST, 865, g.t, 873, 874, 875, 876, 877, 878, 879, 880, 912, 913, 914, 915, 916, 917, 918, 919, 950, 951, 952, 953, 954, 955, 956, 968, 969, 970, 971, 972, 973, 983, 986, 987, 988};
        int[] iArr3 = {46, 47, 48, 49, 50, 67, 68, 69, 70, 72, 79, 80, 81, 82, 83, User32.WM_IME_STARTCOMPOSITION, User32.WM_IME_ENDCOMPOSITION, User32.WM_COMMAND, 274, 275, 276, 277, 278, User32.WM_INITMENUPOPUP, 280, User32.WM_MENUCOMMAND, User32.WM_CHANGEUISTATE, User32.WM_UPDATEUISTATE, User32.WM_QUERYUISTATE, aU.ia_, aU.ib_, 300, 301, aU.ie_, aU.if_, CGL.kCGLCPSurfaceBackingSize, 307, 308, 339, 342, 357, 358, 359, g.p, 366, 376, 377, 378, 379, Client.gF, 409, 410, 423, 424, 434, 435, 436, 449, 450, 451, 454, 455, 462, 463, 464, 465, 473, 476, 477, g.f, 482, 483, 484, 485, 486, aU.iq_, 488, 492, 493, 494, CGL.kCGLGOFormatCacheSize, 502, 508, 509, 510, 511, User32.WM_MOUSEHWHEEL, 527, User32.WM_PARENTNOTIFY, User32.WM_ENTERMENULOOP, 544, 545, 546, 547, 550, 551, 561, User32.WM_EXITSIZEMOVE, 563, aU.iY_, aU.iZ_, aU.ja_, aU.jb_, aU.jc_, aU.jd_, aU.je_, aU.jf_, aU.jg_, aU.jC_, 781, User32.WM_DWMNCRENDERINGCHANGED, 841, 842, 843, 844, 845, 846, g.B, 848, 849, 882, 883, 884, 885, User32.WM_PENWINFIRST, 897, 904, 905, 908, 909, 923, 924, 925, 926, 927, 936, 940, 941, 942, 943, 957, 958, 959, 977, 982};
        int[] iArr4 = {111, 112, 166, 167, 183, $Opcodes.INVOKESTATIC, aU.hy_, 218, 228, 240, 241, User32.VK_OEM_COPY, User32.VK_OEM_AUTO, User32.VK_OEM_ENLW, 253, 254, User32.WM_SYSCHAR, 263, User32.WM_MENUSELECT, 430, 470, 471, aU.ju_, aU.jv_, 815, 816, 817, 818, 819, 820, 859, 860, 861, User32.WM_AFXFIRST, 886, 887, 888, 889, 890, 891, 892, 893, 894, User32.WM_AFXLAST, 906, 907, 928, 929, 930, 931, 932, 933, 934, 935, 944, 945, 946, 947, 948, 949, 960, 961, 978, 989, aU.ih_, aW.aKu, 386, g.i, aU.jY_, aU.jZ_};
        int[] iArr5 = {113, 128, 129, 144, 145, 163, 164, 165, 168, 169, 170, 171, 176, 179, 180, 181, 182, 190, 191, 195, 196, 199, 200, 201, aU.hm_, aU.ho_, 206, aU.ht_, 211, 219, 220, 221, 224, 225, 229, 230, User32.VK_OEM_WSCTRL, User32.VK_OEM_CUSEL, 249, User32.VK_PLAY, User32.VK_ZOOM, User32.VK_NONAME, 255, 256, 257, 260, 264, User32.WM_UNICHAR, 284, 285, 286, 288, User32.WM_MENUDRAG, User32.WM_MENUGETOBJECT, User32.WM_UNINITMENUPOPUP, 311, 396, 428, 429, 468, 469, aU.jw_, aU.kh_, aU.ki_, aU.kj_, aU.kk_, aU.kl_, aU.km_, aU.kn_, aU.ko_, aU.kt_, 641, 642, 643, 644, User32.WM_IME_SELECT, 646, aU.kz_, 648, aU.kB_, aU.gs, aU.gt, aU.gu, aU.gv, aU.gw, aU.gx, 656, 661, 662, 666, 667, aU.gA, aU.gB, aU.gC, aU.gD, 672, 673, aU.gK, aU.gY, aU.gZ, aU.hi, aU.hj, aU.hB, aU.hC, aU.hD, aU.hE, aU.hF, aU.hG, aU.hH, aU.hI, 729, aU.hK, 735, aU.hQ, aU.hR, aU.hS, aU.hT, aU.hU, aU.hV, aU.hX, aU.hY, aU.hZ, aU.ia, aU.id, aU.ii, aU.ij, aU.im, aU.in, aU.io, aU.ip, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 1011, 1036, aU.jG};
        for (int i8 : iArr2) {
            iArr[i8] = i2;
        }
        for (int i9 : iArr3) {
            iArr[i9] = i3;
        }
        for (int i10 : iArr4) {
            iArr[i10] = i4;
        }
        for (int i11 : iArr5) {
            iArr[i11] = i5;
        }
        return iArr;
    }

    public static class_30 r() {
        return !aJ ? aL : aO;
    }

    public static class_30 s() {
        return !aJ ? aM : aP;
    }

    public static class_30 t() {
        return !aJ ? aN : aQ;
    }

    public static boolean u() {
        return true;
    }

    public static void v() {
        aL.a();
        aM.a();
        aN.a();
        aO.a();
        aP.a();
        aQ.a();
    }
}
