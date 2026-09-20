/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.a.b.a.b
 */
package rs.p_a;

import com.a.b.a.b;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.C_C_uc;
import rs.C_Client_mc;
import rs.C_K_uc;
import rs.C_S_uc;
import rs.C_k;
import rs.C_v;
import rs.p_a.C_a;
import rs.p_a.C_d;
import rs.p_a.C_i;
import rs.p_a.p_a.C_a;
import rs.p_a.p_a.C_c;
import rs.p_cache.C_e;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_E_uc;
import rs.p_l.p_e.C_j;
import rs.p_r.C_J_uc;
import rs.p_runelite.p_a.C_m;
import rs.p_runelite.p_a.C_o;
import rs.p_u.C_b;
import rs.p_u.C_g;

public class C_h
extends C_a {
    public static rs.p_a.p_a.C_a h = new rs.p_a.p_a.C_a(false);
    public rs.p_a.p_a.C_a i = C_h.h;
    public static int j = 30000;
    public int k;
    public boolean l = false;
    public transient float[] m;
    private int bJ;
    public int n;
    public static C_v[] o;
    public static boolean[] p;
    public int q = 0;
    public int r = 0;
    public static int[] s;
    public static int[] t;
    public static int[] u;
    public static String v;
    public static String w;
    public static String x;
    public static String y;
    public boolean z = false;
    public boolean A = false;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public boolean G;
    public static int H;
    public int I = -1;
    public int J = 0;
    public short K = (short)256;
    public int[] L;
    public byte[] M;
    public boolean N = false;
    public int O = 20;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
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
    private static int bP;
    public static int ab;
    public static C_h ac;
    private static int[] bQ;
    private static byte[] bR;
    private static int[] bS;
    private static int[] bT;
    private static int[] bU;
    private static int[] bV;
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
    public C_S_uc aO;
    public C_S_uc aP;
    public C_d aQ;
    static b aR;
    static b aS;
    static b aT;
    static C_e aU;
    static int aV;
    static final int aW = 8192;
    static boolean[] aX;
    static boolean[] aY;
    static int[] aZ;
    static int[] ba;
    static int[] bb;
    static int[] bc;
    static int[] bd;
    static int[] be;
    static int[] bf;
    static int[] bg;
    static int[][] bh;
    static int[] bi;
    static int[][] bj;
    static int[] bk;
    static int[] bl;
    static int[] bm;
    static int[] bn;
    static int[] bo;
    static int[] bp;
    static int bq;
    static int br;
    static int bs;
    public static boolean bt;
    public static int bu;
    public static int bv;
    public static int bw;
    public static int[] bx;
    public static int[] by;
    public static int[] bz;
    public static int[] bA;
    public static int[] bB;
    static int[] bC;
    static int[] bD;
    public static boolean bE;
    public static boolean bF;
    public static int bG;
    HashMap<Integer, rs.p_runelite.p_a.C_a> bH;
    public int bI;

    public boolean d() {
        return this.av > 0;
    }

    public boolean a(int n) {
        if (!this.d() || this.ao == null || n >= this.ao.length) {
            return false;
        }
        if (this.ao[n] <= 0) {
            return false;
        }
        if ((this.ao[n] & 1) == 1 && this.ao[n] < 3) {
            return false;
        }
        return this.ao[n] > 0;
    }

    public float a(int n, int n2) {
        return this.m[this.c(n, n2)];
    }

    public float b(int n, int n2) {
        return this.m[this.d(n, n2)];
    }

    public int c(int n, int n2) {
        return n * 6 + n2;
    }

    public int d(int n, int n2) {
        return n * 6 + n2 + 3;
    }

    public float[] e() {
        return this.m;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void f() {
        if (!rs.p_k.C_e.a()) {
            return;
        }
        if (this.m != null) {
            return;
        }
        if (this.Z == null && !this.d()) {
            return;
        }
        if (this.i.f()) {
            this.i.c();
            this.m = this.i.n;
        } else {
            this.m = new float[this.ah * 6];
        }
        for (int i = 0; i < this.ah; ++i) {
            int n;
            int n2;
            int n3;
            boolean bl;
            int n4 = this.Y == null ? -1 : this.Y[i] & 0xFFFF;
            boolean bl2 = bl = this.ao != null && (n4 == -1 || this.Y != null && this.Y[i] <= 0) && this.a(i);
            if (bl) {
                n4 = this.ar[i];
            }
            this.m[this.c((int)i, (int)0)] = 1.0f;
            this.m[this.d((int)i, (int)0)] = 1.0f;
            this.m[this.c((int)i, (int)1)] = 1.0f;
            this.m[this.d((int)i, (int)1)] = 1.0f;
            this.m[this.c((int)i, (int)2)] = 0.0f;
            this.m[this.d((int)i, (int)2)] = 0.0f;
            if (this.aq != null && this.aq[i] == 255) {
                n4 = -1;
            }
            if (n4 == -1) continue;
            int n5 = -1;
            n5 = bl ? this.ao[i] >> 2 : (this.Z != null && this.Z[i] != -1 ? this.Z[i] : this.ai[i]);
            if (bl && this.aw[this.ao[i] >> 2] > this.ae.length) {
                n5 = this.ai[i];
                bl = false;
            }
            if (n5 == -1) continue;
            int n6 = this.ai[i];
            int n7 = this.aj[i];
            int n8 = this.ak[i];
            if (bl) {
                n3 = this.aw[this.ao[i] >> 2];
                n2 = this.ax[this.ao[i] >> 2];
                n = this.ay[this.ao[i] >> 2];
            } else if (this.Z != null && this.Z[i] >= 0) {
                if (this.aw.length <= 0) return;
                n3 = this.aw[this.Z[i]];
                n2 = this.ax[this.Z[i]];
                n = this.ay[this.Z[i]];
            } else {
                n3 = this.ai[i];
                n2 = this.aj[i];
                n = this.ak[i];
            }
            float f = this.ae[n3];
            float f2 = this.af[n3];
            float f3 = this.ag[n3];
            float f4 = (float)this.ae[n2] - f;
            float f5 = (float)this.af[n2] - f2;
            float f6 = (float)this.ag[n2] - f3;
            float f7 = (float)this.ae[n] - f;
            float f8 = (float)this.af[n] - f2;
            float f9 = (float)this.ag[n] - f3;
            float f10 = (float)this.ae[n6] - f;
            float f11 = (float)this.af[n6] - f2;
            float f12 = (float)this.ag[n6] - f3;
            float f13 = (float)this.ae[n7] - f;
            float f14 = (float)this.af[n7] - f2;
            float f15 = (float)this.ag[n7] - f3;
            float f16 = (float)this.ae[n8] - f;
            float f17 = (float)this.af[n8] - f2;
            float f18 = (float)this.ag[n8] - f3;
            float f19 = f5 * f9 - f6 * f8;
            float f20 = f6 * f7 - f4 * f9;
            float f21 = f4 * f8 - f5 * f7;
            float f22 = f8 * f21 - f9 * f20;
            float f23 = f9 * f19 - f7 * f21;
            float f24 = f7 * f20 - f8 * f19;
            float f25 = 1.0f / (f22 * f4 + f23 * f5 + f24 * f6);
            this.m[this.c((int)i, (int)0)] = (f22 * f10 + f23 * f11 + f24 * f12) * f25;
            this.m[this.c((int)i, (int)1)] = (f22 * f13 + f23 * f14 + f24 * f15) * f25;
            this.m[this.c((int)i, (int)2)] = (f22 * f16 + f23 * f17 + f24 * f18) * f25;
            f22 = f5 * f21 - f6 * f20;
            f23 = f6 * f19 - f4 * f21;
            f24 = f4 * f20 - f5 * f19;
            f25 = 1.0f / (f22 * f7 + f23 * f8 + f24 * f9);
            this.m[this.d((int)i, (int)0)] = (f22 * f10 + f23 * f11 + f24 * f12) * f25;
            this.m[this.d((int)i, (int)1)] = (f22 * f13 + f23 * f14 + f24 * f15) * f25;
            this.m[this.d((int)i, (int)2)] = (f22 * f16 + f23 * f17 + f24 * f18) * f25;
        }
        this.l = true;
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

    public C_m a(int n, int n2, int n3, int n4) {
        int[] nArray = new int[this.z()];
        int[] nArray2 = new int[this.z()];
        rs.p_runelite.p_a.C_h.a(this.z(), n, n2, n4, n3, this.A(), this.C(), this.B(), nArray, nArray2);
        return rs.p_runelite.p_a.C_e.a(nArray, nArray2);
    }

    public Polygon b(int n, int n2, int n3, int n4) {
        ArrayList<C_o> arrayList = new ArrayList<C_o>();
        for (int i = 0; i < this.ad; ++i) {
            int n5 = this.ae[i];
            int n6 = this.af[i];
            int n7 = this.ag[i];
            C_o c_o = new C_o(n5, n6, n7);
            c_o = c_o.a(n4);
            arrayList.add(c_o);
        }
        List<rs.p_runelite.p_a.C_i> list = new ArrayList<rs.p_runelite.p_a.C_i>();
        for (C_o c_o : arrayList) {
            rs.p_runelite.p_a.C_i c_i = C_C_uc.a(C_Launcher_mc.n().o(), n - c_o.a(), n2 - c_o.c(), n3 + c_o.b());
            if (c_i == null) continue;
            list.add(c_i);
        }
        if ((list = C_C_uc.a(list)) == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        for (rs.p_runelite.p_a.C_i c_i : list) {
            polygon.addPoint(c_i.a(), c_i.b());
        }
        return polygon;
    }

    public void a(int n, int n2, byte by) {
        this.L[n] = n2;
        this.M[n] = by;
    }

    public void e(int n, int n2) {
        int n3;
        int n4 = 0;
        int n5 = 0;
        if (this.ar == null) {
            return;
        }
        for (n3 = 0; n3 < this.ar.length; ++n3) {
            if (n != this.ar[n3]) continue;
            ++n4;
        }
        this.av = n4;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[n4];
        }
        this.aw = new int[n4];
        this.ax = new int[n4];
        this.ay = new int[n4];
        this.as = new boolean[this.ah];
        n3 = 0;
        for (int i = 0; i < this.ah; ++i) {
            if (n != this.ar[i]) continue;
            this.ar[i] = n2;
            this.ao[i] = 3 + n5;
            this.as[i] = true;
            n5 += 4;
            this.aw[n3] = this.ai[i];
            this.ax[n3] = this.aj[i];
            this.ay[n3] = this.ak[i];
            ++n3;
        }
    }

    public void a(int[] nArray, int n) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        for (n2 = 0; n2 < this.ar.length; ++n2) {
            for (int n5 : nArray) {
                if (n5 != this.ar[n2]) continue;
                ++n3;
            }
        }
        this.av = n3;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[n3];
        }
        this.aw = new int[n3];
        this.ax = new int[n3];
        this.ay = new int[n3];
        n2 = 0;
        for (int i = 0; i < this.ah; ++i) {
            for (int n6 : nArray) {
                if (n6 != this.ar[i]) continue;
                this.ar[i] = n;
                this.ao[i] = 3 + n4;
                n4 += 4;
                this.aw[n2] = this.ai[i];
                this.ax[n2] = this.aj[i];
                this.ay[n2] = this.ak[i];
                ++n2;
            }
        }
    }

    public void h() {
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        int n = 0;
        Object object = "";
        for (int i = 0; i < this.ah; ++i) {
            if (hashMap.get(this.ar[i]) != null) continue;
            object = (String)object + this.ar[i] + ",";
            hashMap.put(this.ar[i], true);
            ++n;
        }
        System.out.println();
        System.out.println((String)object);
        System.out.println("Total colors: " + (n + 1));
        System.out.println();
    }

    public void a(Map<Integer, Boolean> map) {
        try {
            int n = 0;
            Object object = "";
            for (int i = 0; i < this.ah; ++i) {
                if (map.get(this.ar[i]) != null) continue;
                object = (String)object + this.ar[i] + ",";
                map.put(this.ar[i], true);
                ++n;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void a(int[] nArray) {
        int n = 0;
        for (int i = 0; i < this.ah; ++i) {
            this.ar[i] = nArray[n++];
            if (n < nArray.length) continue;
            n = 0;
        }
    }

    public void a(int n, int[] nArray) {
        int n2 = 0;
        for (int i = 0; i < this.ah; ++i) {
            if (n != this.ar[i]) continue;
            this.ar[i] = nArray[n2++];
            if (n2 < nArray.length) continue;
            n2 = 0;
        }
    }

    public void a(int[] nArray, int[] nArray2) {
        int n = 0;
        for (int i = 0; i < this.ah; ++i) {
            for (int n2 : nArray) {
                if (n2 != this.ar[i]) continue;
                this.ar[i] = nArray2[n++];
                if (n < nArray2.length) continue;
                n = 0;
            }
        }
    }

    public void b(int[] nArray, int[] nArray2) {
        int n;
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        for (n3 = 0; n3 < this.ar.length; ++n3) {
            int[] nArray3 = nArray;
            n2 = nArray3.length;
            for (n = 0; n < n2; ++n) {
                int n6 = nArray3[n];
                if (n6 != this.ar[n3]) continue;
                ++n4;
            }
        }
        this.av = n4;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[n4];
        }
        this.aw = new int[n4];
        this.ax = new int[n4];
        this.ay = new int[n4];
        n3 = 0;
        for (int i = 0; i < this.ah; ++i) {
            for (n2 = 0; n2 < nArray.length; ++n2) {
                n = nArray[n2];
                if (n != this.ar[i]) continue;
                this.ar[i] = nArray2[n2];
                this.ao[i] = 3 + n5;
                n5 += 4;
                this.aw[n3] = this.ai[i];
                this.ax[n3] = this.aj[i];
                this.ay[n3] = this.ak[i];
                ++n3;
            }
        }
    }

    public void b(int n) {
        this.av = this.ah;
        int n2 = 0;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[this.ah];
        }
        this.aw = new int[this.ah];
        this.ax = new int[this.ah];
        this.ay = new int[this.ah];
        for (int i = 0; i < this.ah; ++i) {
            this.ar[i] = n;
            this.ao[i] = 3 + n2;
            n2 += 4;
            this.aw[i] = this.ai[i];
            this.ax[i] = this.aj[i];
            this.ay[i] = this.ak[i];
        }
    }

    public void b(int[] nArray) {
        this.av = this.ah;
        int n = 0;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[this.ah];
        }
        this.aw = new int[this.ah];
        this.ax = new int[this.ah];
        this.ay = new int[this.ah];
        int n2 = 0;
        for (int i = 0; i < this.ah; ++i) {
            n2 = n2 >= nArray.length - 1 ? 0 : ++n2;
            this.ar[i] = nArray[n2];
            this.ao[i] = 3 + n;
            n += 4;
            this.aw[i] = this.ai[i];
            this.ax[i] = this.aj[i];
            this.ay[i] = this.ak[i];
        }
    }

    public void a(byte[] byArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e2 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e3 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e4 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e5 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e6 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e7 = new rs.p_x.C_e(byArray);
        c_e.h = byArray.length - 26;
        int n10 = c_e.o();
        int n11 = c_e.o();
        int n12 = c_e.y();
        int n13 = c_e.y();
        int n14 = c_e.y();
        int n15 = c_e.y();
        int n16 = c_e.y();
        int n17 = c_e.y();
        int n18 = c_e.y();
        int n19 = c_e.y();
        int n20 = c_e.o();
        int n21 = c_e.o();
        int n22 = c_e.o();
        int n23 = c_e.o();
        int n24 = c_e.o();
        int n25 = c_e.o();
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        byte[] byArray2 = new byte[]{};
        if (n12 > 0) {
            byArray2 = new byte[n12];
            c_e.h = 0;
            for (n9 = 0; n9 < n12; ++n9) {
                byArray2[n9] = c_e.z();
                n8 = byArray2[n9];
                if (n8 == 0) {
                    ++n26;
                }
                if (n8 >= 1 && n8 <= 3) {
                    ++n27;
                }
                if (n8 != 2) continue;
                ++n28;
            }
        }
        n8 = n9 = n12 + n10;
        if (n13 == 1) {
            n9 += n11;
        }
        int n29 = n9;
        int n30 = n9 += n11;
        if (n14 == 255) {
            n9 += n11;
        }
        int n31 = n9;
        if (n16 == 1) {
            n9 += n11;
        }
        int n32 = n9;
        int n33 = n9 += n25;
        if (n15 == 1) {
            n9 += n11;
        }
        int n34 = n9;
        int n35 = n9 += n23;
        if (n17 == 1) {
            n9 += n11 * 2;
        }
        int n36 = n9;
        int n37 = n9 += n24;
        int n38 = n9 += n11 * 2;
        int n39 = n9 += n20;
        int n40 = n9 += n21;
        int n41 = n9 += n22;
        int n42 = n9 += n26 * 6;
        int n43 = n9 += n27 * 6;
        int n44 = n9 += n27 * 6;
        int n45 = n9 += n27 * 2;
        int n46 = n9 += n27;
        n9 = n9 + n27 * 2 + n28 * 2;
        this.L = new int[n10];
        this.M = new byte[n10];
        this.ad = n10;
        this.ah = n11;
        this.av = n12;
        this.ae = new int[n10];
        this.af = new int[n10];
        this.ag = new int[n10];
        this.ai = new int[n11];
        this.aj = new int[n11];
        this.ak = new int[n11];
        if (n18 == 1) {
            this.aJ = new int[n10];
        }
        if (n13 == 1) {
            this.ao = new int[n11];
        }
        if (n14 == 255) {
            this.ap = new int[n11];
        } else {
            this.au = (byte)n14;
        }
        if (n15 == 1) {
            this.aq = new int[n11];
        }
        if (n16 == 1) {
            this.aK = new int[n11];
        }
        if (n17 == 1) {
            this.Y = new short[n11];
        }
        if (n17 == 1 && n12 > 0) {
            this.Z = new short[n11];
        }
        if (n19 == 1) {
            this.W = new int[n10][];
            this.X = new int[n10][];
        }
        this.ar = new int[n11];
        if (n12 > 0) {
            this.aw = new int[n12];
            this.ax = new int[n12];
            this.ay = new int[n12];
        }
        c_e.h = n12;
        c_e2.h = n38;
        c_e3.h = n39;
        c_e4.h = n40;
        c_e5.h = n32;
        int n47 = 0;
        int n48 = 0;
        int n49 = 0;
        for (n7 = 0; n7 < n10; ++n7) {
            n6 = c_e.y();
            n5 = 0;
            if ((n6 & 1) != 0) {
                n5 = c_e2.n();
            }
            n4 = 0;
            if ((n6 & 2) != 0) {
                n4 = c_e3.n();
            }
            n3 = 0;
            if ((n6 & 4) != 0) {
                n3 = c_e4.n();
            }
            this.ae[n7] = n47 + n5;
            this.af[n7] = n48 + n4;
            this.ag[n7] = n49 + n3;
            n47 = this.ae[n7];
            n48 = this.af[n7];
            n49 = this.ag[n7];
            if (n18 != 1) continue;
            this.aJ[n7] = c_e5.y();
        }
        if (n19 == 1) {
            for (n7 = 0; n7 < n10; ++n7) {
                n6 = c_e5.y();
                this.W[n7] = new int[n6];
                this.X[n7] = new int[n6];
                for (n5 = 0; n5 < n6; ++n5) {
                    this.W[n7][n5] = c_e5.y();
                    this.X[n7][n5] = c_e5.y();
                }
            }
        }
        c_e.h = n37;
        c_e2.h = n8;
        c_e3.h = n30;
        c_e4.h = n33;
        c_e5.h = n31;
        c_e6.h = n35;
        c_e7.h = n36;
        for (n7 = 0; n7 < n11; ++n7) {
            this.ar[n7] = (short)c_e.o();
            if (n13 == 1) {
                this.ao[n7] = c_e2.z();
            }
            if (n14 == 255) {
                this.ap[n7] = c_e3.z();
            }
            if (n15 == 1) {
                this.aq[n7] = c_e4.z();
                if (this.aq[n7] < 0) {
                    this.aq[n7] = 256 + this.aq[n7];
                }
            }
            if (n16 == 1) {
                this.aK[n7] = c_e5.y();
            }
            if (n17 == 1) {
                this.Y[n7] = (byte)(c_e6.o() - 1);
                if (this.Y[n7] != -1) {
                    if (this.Y[n7] == 90 || this.Y[n7] == 96 || this.Y[n7] == 97) {
                        this.Y[n7] = -1;
                    } else if (this.Y[n7] == 116) {
                        this.Y[n7] = -1;
                    } else if (this.Y[n7] == 60) {
                        this.Y[n7] = 8;
                    }
                }
            }
            if (this.Z == null || this.Y[n7] == -1) continue;
            this.Z[n7] = (byte)(c_e7.y() - 1);
        }
        c_e.h = n34;
        c_e2.h = n29;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        for (n3 = 0; n3 < n11; ++n3) {
            n2 = c_e2.y();
            if (n2 == 1) {
                n7 = c_e.n() + n4;
                n6 = c_e.n() + n7;
                n4 = n5 = c_e.n() + n6;
                this.ai[n3] = n7;
                this.aj[n3] = n6;
                this.ak[n3] = n5;
            }
            if (n2 == 2) {
                n6 = n5;
                n4 = n5 = c_e.n() + n4;
                this.ai[n3] = n7;
                this.aj[n3] = n6;
                this.ak[n3] = n5;
            }
            if (n2 == 3) {
                n7 = n5;
                n4 = n5 = c_e.n() + n4;
                this.ai[n3] = n7;
                this.aj[n3] = n6;
                this.ak[n3] = n5;
            }
            if (n2 != 4) continue;
            int n50 = n7;
            n7 = n6;
            n6 = n50;
            n4 = n5 = c_e.n() + n4;
            this.ai[n3] = n7;
            this.aj[n3] = n50;
            this.ak[n3] = n5;
        }
        c_e.h = n41;
        c_e2.h = n42;
        c_e3.h = n43;
        c_e4.h = n44;
        c_e5.h = n45;
        c_e6.h = n46;
        for (n3 = 0; n3 < n12; ++n3) {
            n2 = byArray2[n3] & 0xFF;
            if (n2 != 0) continue;
            this.aw[n3] = (short)c_e.o();
            this.ax[n3] = (short)c_e.o();
            this.ay[n3] = (short)c_e.o();
        }
        c_e.h = n9;
        n3 = c_e.y();
        if (n3 != 0) {
            c_e.o();
            c_e.o();
            c_e.o();
            c_e.p();
        }
    }

    public void b(byte[] byArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        boolean bl = false;
        boolean bl2 = false;
        rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e2 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e3 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e4 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e5 = new rs.p_x.C_e(byArray);
        c_e.h = byArray.length - 23;
        int n10 = c_e.A();
        int n11 = c_e.A();
        int n12 = c_e.y();
        int n13 = c_e.y();
        int n14 = c_e.y();
        int n15 = c_e.y();
        int n16 = c_e.y();
        int n17 = c_e.y();
        int n18 = c_e.y();
        int n19 = c_e.A();
        int n20 = c_e.A();
        int n21 = c_e.A();
        int n22 = c_e.A();
        int n23 = c_e.A();
        C_v c_v = new C_v();
        C_h.j()[n] = c_v;
        C_v c_v2 = c_v;
        c_v2.a = byArray;
        c_v2.b = n10;
        c_v2.c = n11;
        c_v2.d = n12;
        int n24 = 0;
        int n25 = n9 = n24 + n10;
        int n26 = n9 += n11;
        if (n14 == 255) {
            n9 += n11;
        }
        int n27 = n9;
        if (n16 == 1) {
            n9 += n11;
        }
        int n28 = n9;
        if (n13 == 1) {
            n9 += n11;
        }
        int n29 = n9;
        int n30 = n9 += n23;
        if (n15 == 1) {
            n9 += n11;
        }
        int n31 = n9;
        int n32 = n9 += n22;
        int n33 = n9 += n11 * 2;
        int n34 = n9 += n12 * 6;
        int n35 = n9 += n19;
        int n36 = (n9 += n20) + n21;
        this.ad = n10;
        this.ah = n11;
        this.av = n12;
        this.L = new int[n10];
        this.M = new byte[n10];
        this.ae = new int[n10];
        this.af = new int[n10];
        this.ag = new int[n10];
        this.ai = new int[n11];
        this.aj = new int[n11];
        this.ak = new int[n11];
        if (this.av > 0) {
            this.aw = new int[n12];
            this.ax = new int[n12];
            this.ay = new int[n12];
        }
        if (n17 == 1) {
            this.aJ = new int[n10];
        }
        if (n13 == 1) {
            this.ao = new int[n11];
            this.Z = new short[n11];
            this.Y = new short[n11];
        }
        if (n14 == 255) {
            this.ap = new int[n11];
        } else {
            this.au = (byte)n14;
        }
        if (n15 == 1) {
            this.aq = new int[n11];
        }
        if (n16 == 1) {
            this.aK = new int[n11];
        }
        if (n18 == 1) {
            this.W = new int[n10][];
            this.X = new int[n10][];
        }
        this.ar = new int[n11];
        c_e.h = n24;
        c_e2.h = n34;
        c_e3.h = n35;
        c_e4.h = n9;
        c_e5.h = n29;
        int n37 = 0;
        int n38 = 0;
        int n39 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            n7 = c_e.y();
            n6 = 0;
            if ((n7 & 1) != 0) {
                n6 = c_e2.n();
            }
            n5 = 0;
            if ((n7 & 2) != 0) {
                n5 = c_e3.n();
            }
            n4 = 0;
            if ((n7 & 4) != 0) {
                n4 = c_e4.n();
            }
            this.ae[n8] = n37 + n6;
            this.af[n8] = n38 + n5;
            this.ag[n8] = n39 + n4;
            n37 = this.ae[n8];
            n38 = this.af[n8];
            n39 = this.ag[n8];
            if (n17 != 1) continue;
            this.aJ[n8] = c_e5.y();
        }
        if (n18 == 1) {
            for (n8 = 0; n8 < n10; ++n8) {
                n7 = c_e5.y();
                this.W[n8] = new int[n7];
                this.X[n8] = new int[n7];
                for (n6 = 0; n6 < n7; ++n6) {
                    this.W[n8][n6] = c_e5.y();
                    this.X[n8][n6] = c_e5.y();
                }
            }
        }
        c_e.h = n32;
        c_e2.h = n28;
        c_e3.h = n26;
        c_e4.h = n30;
        c_e5.h = n27;
        for (n8 = 0; n8 < n11; ++n8) {
            this.ar[n8] = (short)c_e.o();
            if (n13 == 1) {
                n7 = c_e2.y();
                if ((n7 & 1) == 1) {
                    this.ao[n8] = 1;
                    bl = true;
                } else {
                    this.ao[n8] = 0;
                }
                if ((n7 & 2) == 2) {
                    this.Z[n8] = (byte)(n7 >> 2);
                    this.Y[n8] = (short)this.ar[n8];
                    this.ar[n8] = 127;
                    if (this.Y[n8] != -1) {
                        bl2 = true;
                    }
                } else {
                    this.Z[n8] = -1;
                    this.Y[n8] = -1;
                }
            }
            if (n14 == 255) {
                this.ap[n8] = c_e3.z();
            }
            if (n15 == 1) {
                this.aq[n8] = c_e4.z();
                if (this.aq[n8] < 0) {
                    this.aq[n8] = 256 + this.aq[n8];
                }
            }
            if (n16 != 1) continue;
            this.aK[n8] = c_e5.y();
        }
        c_e.h = n31;
        c_e2.h = n25;
        n8 = 0;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        for (n4 = 0; n4 < n11; ++n4) {
            n3 = c_e2.y();
            if (n3 == 1) {
                n8 = c_e.n() + n5;
                n7 = c_e.n() + n8;
                n5 = n6 = c_e.n() + n7;
                this.ai[n4] = n8;
                this.aj[n4] = n7;
                this.ak[n4] = n6;
            }
            if (n3 == 2) {
                n7 = n6;
                n5 = n6 = c_e.n() + n5;
                this.ai[n4] = n8;
                this.aj[n4] = n7;
                this.ak[n4] = n6;
            }
            if (n3 == 3) {
                n8 = n6;
                n5 = n6 = c_e.n() + n5;
                this.ai[n4] = n8;
                this.aj[n4] = n7;
                this.ak[n4] = n6;
            }
            if (n3 != 4) continue;
            n2 = n8;
            n8 = n7;
            n7 = n2;
            n5 = n6 = c_e.n() + n5;
            this.ai[n4] = n8;
            this.aj[n4] = n2;
            this.ak[n4] = n6;
        }
        c_e.h = n33;
        for (n4 = 0; n4 < n12; ++n4) {
            this.aw[n4] = (short)c_e.o();
            this.ax[n4] = (short)c_e.o();
            this.ay[n4] = (short)c_e.o();
        }
        if (this.Z != null) {
            boolean bl3 = false;
            for (n3 = 0; n3 < n11; ++n3) {
                n2 = this.Z[n3] & 0xFF;
                if (n2 == 255) continue;
                if (this.ai[n3] == (this.aw[n2] & 0xFFFF) && this.aj[n3] == (this.ax[n2] & 0xFFFF) && this.ak[n3] == (this.ay[n2] & 0xFFFF)) {
                    this.Z[n3] = -1;
                    continue;
                }
                bl3 = true;
            }
            if (!bl3) {
                this.Z = null;
            }
        }
        if (!bl2) {
            this.Y = null;
        }
        if (!bl) {
            this.ao = null;
        }
    }

    public void c(byte[] byArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e2 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e3 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e4 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e5 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e6 = new rs.p_x.C_e(byArray);
        rs.p_x.C_e c_e7 = new rs.p_x.C_e(byArray);
        c_e.h = byArray.length - 23;
        int n10 = c_e.A();
        int n11 = c_e.A();
        int n12 = c_e.y();
        C_v c_v = new C_v();
        C_h.j()[n] = c_v;
        C_v c_v2 = c_v;
        c_v2.a = byArray;
        c_v2.b = n10;
        c_v2.c = n11;
        c_v2.d = n12;
        int n13 = c_e.y();
        boolean bl = ~(1 & n13) == -2;
        boolean bl2 = ~(n13 & 2) == -3;
        int n14 = c_e.y();
        int n15 = c_e.y();
        int n16 = c_e.y();
        int n17 = c_e.y();
        int n18 = c_e.y();
        int n19 = c_e.A();
        int n20 = c_e.A();
        int n21 = c_e.A();
        int n22 = c_e.A();
        int n23 = c_e.A();
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        boolean bl3 = false;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        short[] sArray = null;
        if (n12 > 0) {
            byArray3 = new byte[n12];
            c_e.h = 0;
            for (n9 = 0; n9 < n12; ++n9) {
                byArray3[n9] = c_e.z();
                n8 = byArray3[n9];
                if (n8 == 0) {
                    ++n24;
                }
                if (n8 >= 1 && n8 <= 3) {
                    ++n25;
                }
                if (n8 != 2) continue;
                ++n26;
            }
        }
        n8 = n9 = n12;
        int n30 = n9 += n10;
        if (n13 == 1) {
            n9 += n11;
        }
        int n31 = n9;
        int n32 = n9 += n11;
        if (n14 == 255) {
            n9 += n11;
        }
        int n33 = n9;
        if (n16 == 1) {
            n9 += n11;
        }
        int n34 = n9;
        if (n18 == 1) {
            n9 += n10;
        }
        int n35 = n9;
        if (n15 == 1) {
            n9 += n11;
        }
        int n36 = n9;
        int n37 = n9 += n22;
        if (n17 == 1) {
            n9 += n11 * 2;
        }
        int n38 = n9;
        int n39 = n9 += n23;
        int n40 = n9 += n11 * 2;
        int n41 = n9 += n19;
        int n42 = n9 += n20;
        int n43 = n9 += n21;
        int n44 = n9 += n24 * 6;
        int n45 = n9 += n25 * 6;
        int n46 = n9 += n25 * 6;
        int n47 = n9 += n25;
        int n48 = n9 += n25;
        n9 += n25 + n26 * 2;
        n27 = n10;
        n28 = n11;
        n29 = n12;
        this.L = rs.p_f.C_a.ah ? new int[]{} : new int[n10];
        this.M = new byte[n10];
        int[] nArray = new int[n10];
        int[] nArray2 = new int[n10];
        int[] nArray3 = new int[n10];
        int[] nArray4 = new int[n11];
        int[] nArray5 = new int[n11];
        int[] nArray6 = new int[n11];
        this.aJ = new int[n10];
        this.ao = new int[n11];
        this.ap = new int[n11];
        this.aq = new int[n11];
        this.aK = new int[n11];
        if (n18 == 1) {
            this.aJ = new int[n10];
        }
        if (bl) {
            this.ao = new int[n11];
        }
        if (n14 == 255) {
            this.ap = new int[n11];
        } else {
            this.au = (byte)n14;
        }
        if (n15 == 1) {
            this.aq = new int[n11];
        }
        if (n16 == 1) {
            this.aK = new int[n11];
        }
        if (n17 == 1) {
            sArray = new short[n11];
        }
        if (n17 == 1 && n12 > 0) {
            byArray2 = new byte[n11];
        }
        int[] nArray7 = new int[n11];
        int n49 = n9;
        c_e.h = n8;
        c_e2.h = n40;
        c_e3.h = n41;
        c_e4.h = n42;
        c_e5.h = n34;
        int n50 = 0;
        int n51 = 0;
        int n52 = 0;
        for (n7 = 0; n7 < n10; ++n7) {
            n6 = c_e.y();
            n5 = 0;
            if ((n6 & 1) != 0) {
                n5 = c_e2.L();
            }
            n4 = 0;
            if ((n6 & 2) != 0) {
                n4 = c_e3.L();
            }
            n3 = 0;
            if ((n6 & 4) != 0) {
                n3 = c_e4.L();
            }
            nArray[n7] = n50 + n5;
            nArray2[n7] = n51 + n4;
            nArray3[n7] = n52 + n3;
            n50 = nArray[n7];
            n51 = nArray2[n7];
            n52 = nArray3[n7];
            if (this.aJ == null) continue;
            this.aJ[n7] = c_e5.y();
        }
        c_e.h = n39;
        c_e2.h = n30;
        c_e3.h = n32;
        c_e4.h = n35;
        c_e5.h = n33;
        c_e6.h = n37;
        c_e7.h = n38;
        for (n7 = 0; n7 < n11; ++n7) {
            nArray7[n7] = c_e.A();
            if (n13 == 1) {
                this.ao[n7] = c_e2.z();
                if (this.ao[n7] == 2) {
                    nArray7[n7] = 65535;
                }
                this.ao[n7] = 0;
            }
            if (n14 == 255) {
                this.ap[n7] = c_e3.z();
            }
            if (n15 == 1) {
                this.aq[n7] = c_e4.z();
                if (this.aq[n7] < 0) {
                    this.aq[n7] = 256 + this.aq[n7];
                }
            }
            if (n16 == 1) {
                this.aK[n7] = c_e5.y();
            }
            if (n17 == 1) {
                sArray[n7] = (short)(c_e6.A() - 1);
            }
            if (byArray2 == null) continue;
            byArray2[n7] = sArray[n7] != -1 ? (int)(c_e7.y() - 1) : -1;
        }
        c_e.h = n36;
        c_e2.h = n31;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        for (n3 = 0; n3 < n11; ++n3) {
            n2 = c_e2.y();
            if (n2 == 1) {
                n4 = n7 = c_e.L() + n4;
                n4 = n6 = c_e.L() + n4;
                n4 = n5 = c_e.L() + n4;
                nArray4[n3] = n7;
                nArray5[n3] = n6;
                nArray6[n3] = n5;
            }
            if (n2 == 2) {
                n6 = n5;
                n4 = n5 = c_e.L() + n4;
                nArray4[n3] = n7;
                nArray5[n3] = n6;
                nArray6[n3] = n5;
            }
            if (n2 == 3) {
                n7 = n5;
                n4 = n5 = c_e.L() + n4;
                nArray4[n3] = n7;
                nArray5[n3] = n6;
                nArray6[n3] = n5;
            }
            if (n2 != 4) continue;
            int n53 = n7;
            n7 = n6;
            n6 = n53;
            n4 = n5 = c_e.L() + n4;
            nArray4[n3] = n7;
            nArray5[n3] = n6;
            nArray6[n3] = n5;
        }
        c_e.h = n43;
        c_e2.h = n44;
        c_e3.h = n45;
        c_e4.h = n46;
        c_e5.h = n47;
        c_e6.h = n48;
        for (n3 = 0; n3 < n12; ++n3) {
            n2 = byArray3[n3] & 0xFF;
            if (n2 == 0) {
                c_e.A();
                c_e.A();
                c_e.A();
            }
            if (n2 == 1) {
                c_e2.A();
                c_e2.A();
                c_e2.A();
                c_e3.A();
                c_e3.A();
                c_e3.A();
                c_e4.z();
                c_e5.z();
                c_e6.z();
            }
            if (n2 == 2) {
                c_e2.A();
                c_e2.A();
                c_e2.A();
                c_e3.A();
                c_e3.A();
                c_e3.A();
                c_e4.z();
                c_e5.z();
                c_e6.z();
                c_e6.z();
                c_e6.z();
            }
            if (n2 != 3) continue;
            c_e2.A();
            c_e2.A();
            c_e2.A();
            c_e3.A();
            c_e3.A();
            c_e3.A();
            c_e4.z();
            c_e5.z();
            c_e6.z();
        }
        if (n14 != 255) {
            for (n3 = 0; n3 < n11; ++n3) {
                this.ap[n3] = n14;
            }
        }
        this.ar = nArray7;
        this.ad = n10;
        this.ah = n11;
        this.ae = nArray;
        this.af = nArray2;
        this.ag = nArray3;
        this.ai = nArray4;
        this.aj = nArray5;
        this.ak = nArray6;
    }

    public boolean i() {
        return this.k == 1 || this.bJ == 2467 || this.bJ == 42467;
    }

    public C_h(int n) {
        this(n, h);
    }

    /*
     * Opcode count of 18710 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     * Unable to fully structure code
     */
    public C_h(int var1_1, rs.p_a.p_a.C_a var2_2) {
        super();
        this.bH = new HashMap<K, V>();
        this.bI = -1;
        this.bJ = var1_1;
        var3_3 = C_h.j()[var1_1].a;
        if (var3_3.length > 0) {
            if (var3_3[var3_3.length - 1] == -3 && var3_3[var3_3.length - 2] == -1) {
                this.a(var3_3, var1_1);
                this.k = 3;
            } else if (var3_3[var3_3.length - 1] == -2 && var3_3[var3_3.length - 2] == -1) {
                this.b(var3_3, var1_1);
                this.k = 2;
            } else if (var3_3[var3_3.length - 1] == -1 && var3_3[var3_3.length - 2] == -1) {
                C_c.a();
                this.a(var3_3, var1_1, var2_2);
                this.k = 1;
            } else {
                this.k = 0;
                C_c.a();
                this.b(var1_1, var2_2);
            }
        }
        if (C_h.p[var1_1]) {
            this.b(32, 32, 32);
            this.a(0, 6, 0);
        }
        if (var1_1 == 2361) {
            this.ap = new int[this.ah];
            for (var4_4 = 0; var4_4 < this.ah; ++var4_4) {
                this.ap[var4_4] = 10;
            }
        }
        if ((C_h.p[var1_1] || var1_1 == 2467 || var1_1 == 42467) && C_h.bG >= 0 && this.ap != null) {
            block7: for (var4_4 = 0; var4_4 < this.ap.length; ++var4_4) {
                switch (C_h.bG) {
                    case 0: {
                        if (var1_1 != 62739 && var1_1 != 62756 || this.ap[var4_4] != 0) continue block7;
                        this.ap[var4_4] = 7;
                        continue block7;
                    }
                    case 1: {
                        this.ap[var4_4] = 10;
                        continue block7;
                    }
                    case 4: {
                        if (this.ap[var4_4] == 5) {
                            this.ap[var4_4] = 3;
                        }
                        if (this.ap[var4_4] != 0) continue block7;
                        this.ap[var4_4] = 4;
                        continue block7;
                    }
                    case 7: {
                        if (this.ap[var4_4] == 4) {
                            this.ap[var4_4] = 2;
                        }
                        if (this.ap[var4_4] != 0) continue block7;
                        this.ap[var4_4] = 10;
                    }
                }
            }
        }
        if (!rs.p_f.C_a.ah) {
            if (var1_1 == 41893 || var1_1 == 41895 || var1_1 == 49546 || var1_1 == 41886 || var1_1 == 49560 || var1_1 == 41890 || var1_1 == 49554) {
                var4_4 = 25;
                var5_8 = 15;
                if (var1_1 == 41895 || var1_1 == 49546) {
                    var4_4 = 19;
                }
                if (var1_1 == 41886 || var1_1 == 49560) {
                    var4_4 = 30;
                    var5_8 = 14;
                }
                if (var1_1 == 41890 || var1_1 == 49554) {
                    var4_4 = 17;
                    var5_8 = 10;
                }
                var6_9 = 0;
                for (var7_11 = 0; var7_11 < this.L.length; ++var7_11) {
                    if (var6_9 < var5_8) {
                        ++var6_9;
                        continue;
                    }
                    var6_9 = 0;
                    this.a(var7_11, var4_4 + 1, (byte)2);
                }
            }
            if (var1_1 == 42671) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var4_4 < 2) {
                        ++var4_4;
                        continue;
                    }
                    var4_4 = 0;
                    this.a(var5_8, 2, (byte)1);
                }
            }
            if (var1_1 == 56202 || var1_1 == 56208) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var4_4 < 4) {
                        ++var4_4;
                        continue;
                    }
                    var4_4 = 0;
                    this.a(var5_8, (var1_1 == 56202 ? 26 : 29) + 1, (byte)0);
                }
            }
            if (var1_1 == 42001 || var1_1 == 42002) {
                for (var4_4 = 10; var4_4 < 60; ++var4_4) {
                    if (var4_4 >= 20 && var4_4 <= 40 || var4_4 >= 10 && var4_4 <= 15 || var4_4 == 19) continue;
                    this.a(var4_4, (var1_1 == 42001 ? 26 : 29) + 1, (byte)0);
                }
            }
            if (var1_1 >= 56203 && var1_1 <= 56207) {
                var4_4 = 27;
                var5_8 = 0;
                for (var6_9 = 0; var6_9 < this.L.length; ++var6_9) {
                    if (var5_8 < 6) {
                        ++var5_8;
                        continue;
                    }
                    var5_8 = 0;
                    this.a(var6_9, var4_4 + 1, (byte)0);
                }
            }
            if (var1_1 == 22012) {
                var4_4 = 17;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    this.a(var5_8, var4_4 + 1, (byte)0);
                }
            }
            if (var1_1 == 42669) {
                var4_4 = 21;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var5_8 % 2 == 0) continue;
                    this.a(var5_8, var4_4 + 1, (byte)0);
                }
            }
            if (var1_1 == 41037 || var1_1 == 41038) {
                for (var4_4 = 0; var4_4 < this.L.length; ++var4_4) {
                    if (var4_4 % 4 == 0) continue;
                    this.L[var4_4] = 23;
                }
            }
            if (var1_1 == 48626) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var5_8 % 4 == 0) continue;
                    this.L[var5_8] = 24;
                }
            }
            if (var1_1 == 40024) {
                var4_4 = 3;
                for (var5_8 = 60; var5_8 < 65; ++var5_8) {
                    this.L[var5_8] = var4_4 + 1;
                }
                var5_8 = 0;
                for (var6_9 = 0; var6_9 < 40; ++var6_9) {
                    if (var6_9 > 50 || var6_9 % 2 == 0) continue;
                    v0 = var7_11 = var1_1 == 40319 || var1_1 == 40318 ? 3 : 1;
                    if (var5_8 < var7_11) {
                        ++var5_8;
                        continue;
                    }
                    var5_8 = 0;
                    this.L[var6_9] = var4_4 + 1;
                }
            }
            if (var1_1 == 40948 || var1_1 == 40947 || var1_1 == 40946) {
                var4_4 = 0;
                var5_8 = 26;
                if (var1_1 == 40947) {
                    var5_8 = 2;
                }
                if (var1_1 == 40946) {
                    var5_8 = 13;
                }
                for (var6_9 = 0; var6_9 < 168; ++var6_9) {
                    if (var4_4 == 3) {
                        this.L[var6_9] = var5_8 + 1;
                        var4_4 = 0;
                        continue;
                    }
                    ++var4_4;
                }
            }
            if (var1_1 >= 40949 && var1_1 <= 40954) {
                var4_4 = 0;
                var5_8 = 26;
                if (var1_1 == 40953 || var1_1 == 40954) {
                    var5_8 = 19;
                }
                if (var1_1 == 40949 || var1_1 == 40950) {
                    var5_8 = 13;
                }
                for (var6_9 = 0; var6_9 < this.L.length; ++var6_9) {
                    if (var4_4 == 20) {
                        this.L[var6_9] = var5_8 + 1;
                        var4_4 = 0;
                        continue;
                    }
                    ++var4_4;
                }
            }
            if (var1_1 == 209 || var1_1 == 386) {
                var4_4 = 0;
                var5_8 = 13;
                for (var6_9 = 0; var6_9 < this.L.length; ++var6_9) {
                    if (var4_4 == 2) {
                        this.L[var6_9] = var5_8 + 1;
                        if (C_Client_mc.d(3) == 1) {
                            this.L[var6_9] = 18;
                        }
                        var4_4 = 0;
                        continue;
                    }
                    ++var4_4;
                }
            }
            if (var1_1 == 40319 || var1_1 == 40318) {
                var4_4 = var1_1 == 40019 || var1_1 == 40018 ? 2 : 11;
                for (var5_8 = 60; var5_8 < 65; ++var5_8) {
                    this.L[var5_8] = var4_4 + 1;
                }
                var5_8 = 0;
                for (var6_9 = 0; var6_9 < 40; ++var6_9) {
                    if (var6_9 > 50) continue;
                    v1 = var7_11 = var1_1 == 40319 || var1_1 == 40318 ? 3 : 1;
                    if (var5_8 < var7_11) {
                        ++var5_8;
                        continue;
                    }
                    var5_8 = 0;
                    this.L[var6_9] = var4_4 + 1;
                }
            }
            if (var1_1 == 41052) {
                for (var4_4 = 0; var4_4 < this.L.length; ++var4_4) {
                    if (var4_4 % 4 == 0) continue;
                    this.L[var4_4] = 2;
                }
            }
            if (var1_1 == 44403) {
                for (var4_4 = 0; var4_4 < this.L.length; ++var4_4) {
                    if (var4_4 % 4 == 0 || var4_4 % 2 == 0) continue;
                    this.L[var4_4] = 23;
                }
            }
            if (var1_1 == 50939) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < 130; ++var5_8) {
                    if (var4_4 != 2) {
                        ++var4_4;
                        continue;
                    }
                    var4_4 = 0;
                    this.L[var5_8] = 21;
                }
            }
            if (var1_1 == 47780) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < 30; ++var5_8) {
                    if (var4_4 != 10) {
                        ++var4_4;
                        continue;
                    }
                    this.L[var5_8] = 19;
                }
            }
            ** if ((var4_5 = rs.p_r.C_b.a((int)var1_1)) == null) goto lbl275
            for (var5_8 = 0; var5_8 < var4_5.length; ++var5_8) {
                var6_10 = var4_5[var5_8];
                if (var6_10[0] == -1) {
                    for (var7_11 = 0; var7_11 < this.ai.length; ++var7_11) {
                        this.L[this.ai[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                if (var6_10[0] == -2) {
                    for (var7_11 = 0; var7_11 < this.aj.length; ++var7_11) {
                        this.L[this.aj[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                if (var6_10[0] == -3) {
                    for (var7_11 = 0; var7_11 < this.ak.length; ++var7_11) {
                        this.L[this.ak[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                if (var6_10[0] == -4) {
                    for (var7_11 = 0; var7_11 < this.ai.length; ++var7_11) {
                        this.L[this.ai[var7_11]] = var6_10[1] + 1;
                    }
                    for (var7_11 = 0; var7_11 < this.aj.length; ++var7_11) {
                        this.L[this.aj[var7_11]] = var6_10[1] + 1;
                    }
                    for (var7_11 = 0; var7_11 < this.ak.length; ++var7_11) {
                        this.L[this.ak[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                this.L[var6_10[0]] = var6_10[1] + 1;
lbl-1000:
                // 2 sources

                {
                    continue;
                }
            }
        }
lbl275:
        // 4 sources

        if (var1_1 == 40017) {
            this.e(127, rs.p_f.C_a.aQ != false ? 57 : 117);
        }
        if (var1_1 == 40019 || var1_1 == 40018 || var1_1 == 40319 || var1_1 == 40318 || var1_1 == 40024) {
            this.av = 3;
            this.ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
            this.ar = new int[]{5056, 5066, 8, 8, 8, 12, 924, 924, 924, 924, 924, 924, 924, 924, 5056, 5056, 924, 924, 8, 8, 12, 12, 924, 924, 924, 12, 127, 127, 127, 12, 924, 924, 924, 924, 924, 924, 12, 8, 924, 924, 924, 8, 8, 8, 924, 924, 924, 8, 8, 8, 924, 924, 8, 8, 924, 924, 8, 8, 8, 924, 924, 924, 924, 8, 8, 8, 924, 924, 8, 8, 924, 924, 8, 8, 8, 924, 924, 924, 8, 8, 12, 12, 8, 924, 924, 924, 924, 924, 8, 8, 5066, 5056, 924, 924, 924, 924, 8, 5056, 924, 924, 5056, 12, 12, 924, 924, 924, 12, 12, 8, 8, 8, 924, 924, 924, 924, 924, 924, 12, 12, 8, 924, 924, 8, 12, 127, 127, 127, 127, 924, 924, 924, 924, 924, 8, 8, 12, 12, 924, 924, 924, 924, 12, 12, 12, 8, 924, 924, 924, 924, 127, 127, 12, 12, 924, 924, 924, 127, 12, 12, 12, 924, 924, 924, 924, 12, 12, 924, 924, 12, 12, 12, 12, 12, 924, 924, 924, 924, 12, 12, 12, 924, 924, 12, 5056, 5056, 8, 8, 5056, 5056, 924, 924, 924, 924, 924, 924, 924, 3005, 3005, 924, 8, 12, 12, 12, 8, 924, 924, 924, 924, 8, 8, 924, 924, 8, 8, 3005, 3005, 924, 924, 924, 127, 127, 127, 127, 127, 127, 127, 924, 924, 924, 924, 924, 924, 924, 924, 8, 12, 12, 924, 924, 924, 20, 12, 24, 24, 24, 924, 924, 924, 924, 924, 12, 24, 924, 924, 24, 28, 28, 28, 28, 924, 924, 924, 924, 924, 28, 28, 924, 924, 28, 20, 924, 924, 20, 16, 924, 924, 16, 8, 924, 924, 8, 8, 924, 924, 924, 8, 8, 12, 20, 924, 924, 924, 16, 16, 20, 20, 924, 924, 924, 127, 8, 8, 8, 924, 924, 924, 924, 924, 127, 8, 8, 20, 20, 924, 924, 924, 20, 20, 924, 924, 20, 12, 924, 924, 12, 12, 24, 24, 924, 924, 924, 924, 12, 24, 924, 924, 24, 28, 924, 924, 28, 20, 924, 127, 924, 924, 127, 127, 924, 924, 127, 127, 924, 924, 127, 127, 127, 924, 924, 924, 127, 127, 127, 924, 924, 24, 924, 924, 28, 28, 924, 20, 20, 924, 924, 12, 924, 924, 24, 924, 924, 12, 16, 924, 12, 20, 20, 20, 16, 16, 924, 924, 924, 924, 924, 924, 924, 924, 8, 8, 8, 8, 924, 924, 924, 16, 24, 28, 28, 924, 924, 924, 20, 28, 924, 924, 924, 20, 16, 16, 924, 924, 20, 924, 8, 924, 924, 924, 924, 924, 924, 924, 0};
            this.aw = new int[]{133, 130, 132};
            this.ax = new int[]{134, 131, 136};
            this.ay = new int[]{135, 132, 133};
            this.Y = new short[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, 59, 59, -1, -1, 59, 59, -1, -1, 59, 59, 59, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            this.Z = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.aa = new byte[]{0, 0, 0};
            for (var4_6 = 0; var4_6 < this.Y.length; ++var4_6) {
                if (this.Y[var4_6] == -1) continue;
                this.Y[var4_6] = var1_1 == 40319 || var1_1 == 40318 ? 64 : (var1_1 == 40024 ? 66 : (short)(rs.p_f.C_a.aQ != false ? 57 : 117));
                this.ar[var4_6] = this.Y[var4_6];
            }
            for (var4_6 = 0; var4_6 < this.ar.length; ++var4_6) {
                if (this.ar[var4_6] != 0) continue;
                this.ar[var4_6] = 65535;
            }
        }
        if (var1_1 == 32815) {
            this.e(127, 57);
        }
        if (var1_1 == 32809) {
            this.av = 3;
            this.ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
            this.ar = new int[]{24, 24, 0, 0, 0, 24, 24, 24, 12, 24, 24, 12, 24, 24, 24, 24, 24, 24, 0, 0, 24, 24, 24, 24, 0, 0, 24, 24, 24, 24, 24, 24, 12, 24, 41, 12, 12, 12, 12, 12, 12, 41, 41, 24, 12, 24, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 0, 24, 24, 12, 24, 0, 0, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 24, 24, 0, 24, 24, 12, 12, 12, 24, 24, 24, 24, 24, 24, 24, 24, 0, 24, 24, 24, 12, 41, 41, 33, 33, 33, 41, 41, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 41, 41, 41, 41, 20, 20, 902, 902, 902, 902, 902, 902, 0, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0, 902, 902, 902, 902, 902, 20, 20, 33, 33, 945, 945, 945, 945, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 20, 20, 20, 20, 12, 12, 12, 12, 12, 0, 0, 0, 0, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0, 0, 33, -22479, 41, 12, 12, 12, 902, 12, 20, 20, 20, 20, 33, 33, 33, 41, 41, 0, 33, 33, 33, 41, 12, 12, 12, 24, 24, 8, 8, 33, 33, 960, 960, 960, 33, 33, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 41, 41, 41, 33, 33, 960, 968, 978, 978, 968, 33, -22479, 41, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 0, 0, 24, 24, 24, 24, 0, 0, 12, 12, 12, 0, 24, 24, 24, 24, 24, 522, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 24, 0, 41, 24, 12, 12, 12, 12, 12, 0, 127, 12, 12, 0, 12, 8, 8, 127, 12, 960, 960, 968, 978, 960, 960, 33, 33, 33, 33, 33, 33, -22479, -22479, -22479, 20, 20, 20, 12, 12, 20, 20, 12, 12, 12, 12, 12, 12, 12, 12, 20, 20, 12, 12, 12, 12, 24, 41, -22479, -22479, 33, 960, 960, 33, 41, 41, 24, 24, 24, 24, 33, 33, 12, 12, 12, 12, 12, 12, 0, 0, 12, 12, 12, 12, 24, 0, 24, 24, 0, 24, 0, 12, 33, 24, 41, 41, 24, 12, 24, 24, 24, 0, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 12, 12, 12, 0, 24, 24, 12, 12, 12, 12, 0, 24, 24, 0, 0, 0, 12, 12, 12, 24, 24, 24, 12, 0, 522, 24, 24, 24, 24, 24, 12, 12, 0, 24, 0, 8, 127, 127, 12, 12, 8, 12, 960, 33, 33, 0, 0, 968, -22479, -22479, 33, 960, 978, 20, 20, 20, 41, -22479, 33, 33, 33, 945, 945, 945, 945, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 12, 12, 12, 0};
            this.aw = new int[]{343, 340, 342};
            this.ax = new int[]{344, 341, 346};
            this.ay = new int[]{345, 342, 343};
            this.Y = new short[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1};
            this.Z = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.aa = new byte[]{0, 0, 0};
            for (var4_7 = 0; var4_7 < this.Y.length; ++var4_7) {
                if (this.Y[var4_7] != 59) continue;
                this.Y[var4_7] = (short)(rs.p_f.C_a.aQ != false ? 57 : 117);
                this.ar[var4_7] = this.Y[var4_7];
            }
            for (var4_7 = 0; var4_7 < this.ar.length; ++var4_7) {
                if (this.ar[var4_7] != 0) continue;
                this.ar[var4_7] = 65535;
            }
        }
    }

    public void c(int n) {
        for (int i = 0; i < this.ad; ++i) {
            this.ae[i] = this.ae[i] / n;
            this.af[i] = this.af[i] / n;
            this.ag[i] = this.ag[i] / n;
        }
    }

    public void a(byte[] byArray, int n, rs.p_a.p_a.C_a c_a) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        boolean bl;
        rs.p_x.C_e c_e = C_c.a(byArray);
        rs.p_x.C_e c_e2 = C_c.a(byArray);
        rs.p_x.C_e c_e3 = C_c.a(byArray);
        rs.p_x.C_e c_e4 = C_c.a(byArray);
        rs.p_x.C_e c_e5 = C_c.a(byArray);
        rs.p_x.C_e c_e6 = C_c.a(byArray);
        rs.p_x.C_e c_e7 = C_c.a(byArray);
        c_e.h = byArray.length - 23;
        int n10 = c_e.A();
        int n11 = c_e.A();
        int n12 = c_e.y();
        C_v c_v = new C_v();
        C_h.j()[n] = c_v;
        C_v c_v2 = c_v;
        c_v2.a = byArray;
        c_v2.b = n10;
        c_v2.c = n11;
        c_v2.d = n12;
        int n13 = c_e.y();
        boolean bl2 = ~(1 & n13) == -2;
        boolean bl3 = ~(n13 & 2) == -3;
        boolean bl4 = (4 & n13) == 4;
        boolean bl5 = bl = (8 & n13) == 8;
        if (!bl) {
            this.c(byArray, n);
            return;
        }
        int n14 = 0;
        if (bl) {
            c_e.h -= 7;
            n14 = c_e.y();
            c_e.h += 6;
        }
        if (n14 == 15) {
            C_h.p[n] = true;
        }
        this.n = n14;
        int n15 = c_e.y();
        int n16 = c_e.y();
        int n17 = c_e.y();
        int n18 = c_e.y();
        int n19 = c_e.y();
        int n20 = c_e.A();
        int n21 = c_e.A();
        int n22 = c_e.A();
        int n23 = c_e.A();
        int n24 = c_e.A();
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        boolean bl6 = false;
        byte[] byArray2 = null;
        if (n12 > 0) {
            byArray2 = new byte[n12];
            c_e.h = 0;
            for (n9 = 0; n9 < n12; ++n9) {
                byArray2[n9] = c_e.z();
                n8 = byArray2[n9];
                if (n8 == 0) {
                    ++n25;
                }
                if (n8 >= 1 && n8 <= 3) {
                    ++n26;
                }
                if (n8 != 2) continue;
                ++n27;
            }
        }
        n8 = n9 = n12;
        int n31 = n9 += n10;
        if (bl2) {
            n9 += n11;
        }
        if (n13 == 1) {
            n9 += n11;
        }
        int n32 = n9;
        int n33 = n9 += n11;
        if (n15 == 255) {
            n9 += n11;
        }
        int n34 = n9;
        if (n17 == 1) {
            n9 += n11;
        }
        int n35 = n9;
        if (n19 == 1) {
            n9 += n10;
        }
        int n36 = n9;
        if (n16 == 1) {
            n9 += n11;
        }
        int n37 = n9;
        int n38 = n9 += n23;
        if (n18 == 1) {
            n9 += n11 * 2;
        }
        int n39 = n9;
        int n40 = n9 += n24;
        int n41 = n9 += n11 * 2;
        int n42 = n9 += n20;
        int n43 = n9 += n21;
        int n44 = n9 += n22;
        int n45 = n9 += n25 * 6;
        n9 += n26 * 6;
        int n46 = 6;
        if (n14 != 14) {
            if (n14 >= 15) {
                n46 = 9;
            }
        } else {
            n46 = 7;
        }
        int n47 = n9;
        int n48 = n9 += n46 * n26;
        int n49 = n9 += n26;
        int n50 = n9 += n26;
        n9 += n26 + n27 * 2;
        n28 = n10;
        n29 = n11;
        n30 = n12;
        c_a.b(n11, n10);
        c_a.e();
        this.L = c_a.a(C_a.b.p);
        this.M = c_a.c(C_a.b.q);
        int[] nArray = c_a.a(C_a.b.m);
        int[] nArray2 = c_a.a(C_a.b.n);
        int[] nArray3 = c_a.a(C_a.b.o);
        int[] nArray4 = c_a.a(C_a.b.a);
        int[] nArray5 = c_a.a(C_a.b.b);
        int[] nArray6 = c_a.a(C_a.b.c);
        this.aJ = c_a.a(C_a.b.l);
        this.ao = c_a.a(C_a.b.g);
        this.ap = c_a.a(C_a.b.h);
        this.aq = c_a.a(C_a.b.i);
        this.aK = c_a.a(C_a.b.k);
        if (n19 == 1) {
            this.aJ = c_a.a(C_a.b.l);
        }
        if (bl2) {
            this.ao = c_a.a(C_a.b.g);
        }
        if (n15 == 255) {
            this.ap = c_a.a(C_a.b.h);
        } else {
            this.au = n15;
        }
        if (n16 == 1) {
            this.aq = c_a.a(C_a.b.i);
        }
        if (n17 == 1) {
            this.aK = c_a.a(C_a.b.k);
        }
        int[] nArray7 = c_a.a(C_a.b.j);
        boolean bl7 = false;
        if (n18 == 1 && n12 > 0) {
            bl7 = true;
        }
        int n51 = n9;
        if (n12 > 0) {
            if (n26 > 0) {
                // empty if block
            }
            if (n27 > 0) {
                // empty if block
            }
        }
        c_e.h = n8;
        c_e2.h = n41;
        c_e3.h = n42;
        c_e4.h = n43;
        c_e5.h = n35;
        int n52 = 0;
        int n53 = 0;
        int n54 = 0;
        for (n7 = 0; n7 < n10; ++n7) {
            n6 = c_e.y();
            n5 = 0;
            if ((n6 & 1) != 0) {
                n5 = c_e2.L();
            }
            n4 = 0;
            if ((n6 & 2) != 0) {
                n4 = c_e3.L();
            }
            n3 = 0;
            if ((n6 & 4) != 0) {
                n3 = c_e4.L();
            }
            nArray[n7] = n52 + n5;
            nArray2[n7] = n53 + n4;
            nArray3[n7] = n54 + n3;
            n52 = nArray[n7];
            n53 = nArray2[n7];
            n54 = nArray3[n7];
            if (this.aJ == null) continue;
            this.aJ[n7] = c_e5.y();
        }
        c_e.h = n40;
        c_e2.h = n31;
        c_e3.h = n33;
        c_e4.h = n36;
        c_e5.h = n34;
        c_e6.h = n38;
        c_e7.h = n39;
        for (n7 = 0; n7 < n11; ++n7) {
            nArray7[n7] = c_e.A();
            if (nArray7[n7] == 0) {
                nArray7[n7] = 65535;
            }
            if (n13 == 1) {
                this.ao[n7] = c_e2.z();
                if (this.ao[n7] == 2) {
                    nArray7[n7] = 65535;
                }
                this.ao[n7] = 0;
            }
            if (n15 == 255) {
                this.ap[n7] = c_e3.z();
            }
            if (n16 == 1) {
                this.aq[n7] = c_e4.z();
                if (this.aq[n7] < 0) {
                    this.aq[n7] = 256 + this.aq[n7];
                }
            }
            if (n17 == 1) {
                this.aK[n7] = c_e5.y();
            }
            n6 = 0;
            if (n18 == 1) {
                n6 = (short)(c_e6.A() - 1);
            }
            if (!bl7 || n6 == -1) continue;
            c_e7.y();
        }
        c_e.h = n37;
        c_e2.h = n32;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        for (n3 = 0; n3 < n11; ++n3) {
            n2 = c_e2.y();
            if (n2 == 1) {
                n4 = n7 = c_e.L() + n4;
                n4 = n6 = c_e.L() + n4;
                n4 = n5 = c_e.L() + n4;
                nArray4[n3] = n7;
                nArray5[n3] = n6;
                nArray6[n3] = n5;
            }
            if (n2 == 2) {
                n6 = n5;
                n4 = n5 = c_e.L() + n4;
                nArray4[n3] = n7;
                nArray5[n3] = n6;
                nArray6[n3] = n5;
            }
            if (n2 == 3) {
                n7 = n5;
                n4 = n5 = c_e.L() + n4;
                nArray4[n3] = n7;
                nArray5[n3] = n6;
                nArray6[n3] = n5;
            }
            if (n2 != 4) continue;
            int n55 = n7;
            n7 = n6;
            n6 = n55;
            n4 = n5 = c_e.L() + n4;
            nArray4[n3] = n7;
            nArray5[n3] = n6;
            nArray6[n3] = n5;
        }
        c_e.h = n44;
        c_e2.h = n45;
        c_e3.h = n47;
        c_e4.h = n48;
        c_e5.h = n49;
        c_e6.h = n50;
        for (n3 = 0; n3 < n12; ++n3) {
            n2 = byArray2[n3] & 0xFF;
            if (n2 == 0) {
                c_e.A();
                c_e.A();
                c_e.A();
            }
            if (n2 == 1) {
                c_e2.A();
                c_e2.A();
                c_e2.A();
                if (n14 < 15) {
                    c_e3.A();
                    if (n14 >= 14) {
                        c_e3.c(-1);
                    } else {
                        c_e3.A();
                    }
                    c_e3.A();
                } else {
                    c_e3.c(-1);
                    c_e3.c(-1);
                    c_e3.c(-1);
                }
                c_e4.z();
                c_e4.z();
                c_e4.z();
            }
            if (n2 == 2) {
                c_e2.A();
                c_e2.A();
                c_e2.A();
                if (n14 >= 15) {
                    c_e3.c(-1);
                    c_e3.c(-1);
                    c_e3.c(-1);
                } else {
                    c_e3.A();
                    if (n14 < 14) {
                        c_e3.A();
                    } else {
                        c_e3.c(-1);
                    }
                    c_e3.A();
                }
                c_e4.z();
                c_e4.z();
                c_e4.z();
                c_e4.z();
                c_e4.z();
            }
            if (n2 != 3) continue;
            c_e2.A();
            c_e2.A();
            c_e2.A();
            if (n14 < 15) {
                c_e3.A();
                if (n14 < 14) {
                    c_e3.A();
                } else {
                    c_e3.c(-1);
                }
                c_e3.A();
            } else {
                c_e3.c(-1);
                c_e3.c(-1);
                c_e3.c(-1);
            }
            c_e4.z();
            c_e4.z();
            c_e4.z();
        }
        if (n15 != 255) {
            for (n3 = 0; n3 < n11; ++n3) {
                this.ap[n3] = n15;
            }
        }
        this.ar = nArray7;
        this.ad = n10;
        this.ah = n11;
        this.ae = nArray;
        this.af = nArray2;
        this.ag = nArray3;
        this.ai = nArray4;
        this.aj = nArray5;
        this.ak = nArray6;
    }

    private void b(int n, rs.p_a.p_a.C_a c_a) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = -870;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        C_v c_v = C_h.j()[n];
        this.ad = c_v.b;
        this.ah = c_v.c;
        this.av = c_v.d;
        c_a.b(this.ah, this.ad);
        c_a.e();
        this.L = c_a.a(C_a.b.p);
        this.M = c_a.c(C_a.b.q);
        this.ae = c_a.a(C_a.b.m);
        this.af = c_a.a(C_a.b.n);
        this.ag = c_a.a(C_a.b.o);
        this.ai = c_a.a(C_a.b.a);
        this.aj = c_a.a(C_a.b.b);
        while (n7 >= 0) {
            this.bO = !this.bO;
        }
        this.ak = c_a.a(C_a.b.c);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (c_v.i >= 0) {
            this.aJ = c_a.a(C_a.b.l);
        }
        if (c_v.m >= 0) {
            this.ao = c_a.a(C_a.b.g);
        }
        if (c_v.n >= 0) {
            this.ap = c_a.a(C_a.b.h);
        } else {
            this.au = -c_v.n - 1;
        }
        if (c_v.o >= 0) {
            this.aq = c_a.a(C_a.b.i);
        }
        if (c_v.p >= 0) {
            this.aK = c_a.a(C_a.b.k);
        }
        this.ar = c_a.a(C_a.b.j);
        rs.p_x.C_e c_e = C_c.a(c_v.a);
        c_e.h = c_v.e;
        rs.p_x.C_e c_e2 = C_c.a(c_v.a);
        c_e2.h = c_v.f;
        rs.p_x.C_e c_e3 = C_c.a(c_v.a);
        c_e3.h = c_v.g;
        rs.p_x.C_e c_e4 = C_c.a(c_v.a);
        c_e4.h = c_v.h;
        rs.p_x.C_e c_e5 = C_c.a(c_v.a);
        c_e5.h = c_v.i;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        for (n6 = 0; n6 < this.ad; ++n6) {
            n5 = c_e.y();
            n4 = 0;
            if ((n5 & 1) != 0) {
                n4 = c_e2.L();
            }
            n3 = 0;
            if ((n5 & 2) != 0) {
                n3 = c_e3.L();
            }
            n2 = 0;
            if ((n5 & 4) != 0) {
                n2 = c_e4.L();
            }
            this.ae[n6] = n8 + n4;
            this.af[n6] = n9 + n3;
            this.ag[n6] = n10 + n2;
            n8 = this.ae[n6];
            n9 = this.af[n6];
            n10 = this.ag[n6];
            if (this.aJ == null) continue;
            this.aJ[n6] = c_e5.y();
        }
        c_e.h = c_v.l;
        c_e2.h = c_v.m;
        c_e3.h = c_v.n;
        c_e4.h = c_v.o;
        c_e5.h = c_v.p;
        for (n6 = 0; n6 < this.ah; ++n6) {
            this.ar[n6] = c_e.A();
            if (this.ao != null) {
                this.ao[n6] = c_e2.y();
            }
            if (this.ap != null) {
                this.ap[n6] = c_e3.y();
            }
            if (this.aq != null) {
                this.aq[n6] = c_e4.y();
            }
            if (this.aK == null) continue;
            this.aK[n6] = c_e5.y();
        }
        c_e.h = c_v.j;
        c_e2.h = c_v.k;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        n3 = 0;
        for (n2 = 0; n2 < this.ah; ++n2) {
            int n11 = c_e2.y();
            if (n11 == 1) {
                n3 = n6 = c_e.L() + n3;
                n3 = n5 = c_e.L() + n3;
                n3 = n4 = c_e.L() + n3;
                this.ai[n2] = n6;
                this.aj[n2] = n5;
                this.ak[n2] = n4;
            }
            if (n11 == 2) {
                n5 = n4;
                n3 = n4 = c_e.L() + n3;
                this.ai[n2] = n6;
                this.aj[n2] = n5;
                this.ak[n2] = n4;
            }
            if (n11 == 3) {
                n6 = n4;
                n3 = n4 = c_e.L() + n3;
                this.ai[n2] = n6;
                this.aj[n2] = n5;
                this.ak[n2] = n4;
            }
            if (n11 != 4) continue;
            int n12 = n6;
            n6 = n5;
            n5 = n12;
            n3 = n4 = c_e.L() + n3;
            this.ai[n2] = n6;
            this.aj[n2] = n5;
            this.ak[n2] = n4;
        }
        c_e.h = c_v.q;
        for (n2 = 0; n2 < this.av; ++n2) {
            this.aw[n2] = c_e.A();
            this.ax[n2] = c_e.A();
            this.ay[n2] = c_e.A();
        }
    }

    public static C_v[] j() {
        return C_h.b(rs.p_cache.p_osrs.C_c.a());
    }

    public static C_v[] b(boolean bl) {
        return bl ? rs.p_cache.p_osrs.C_c.b() : o;
    }

    public static void a(byte[] byArray, int n, boolean bl) {
        int n2;
        if (byArray == null) {
            C_v c_v = new C_v();
            C_h.b((boolean)bl)[n] = c_v;
            C_v c_v2 = c_v;
            c_v2.b = 0;
            c_v2.c = 0;
            c_v2.d = 0;
            return;
        }
        rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
        c_e.h = byArray.length - 18;
        C_v c_v = new C_v();
        C_h.b((boolean)bl)[n] = c_v;
        C_v c_v3 = c_v;
        c_v3.a = byArray;
        c_v3.b = c_e.A();
        c_v3.c = c_e.A();
        if (c_e.h < 0) {
            c_e.h = 0;
            return;
        }
        c_v3.d = c_e.y();
        int n3 = c_e.y();
        int n4 = c_e.y();
        int n5 = c_e.y();
        int n6 = c_e.y();
        int n7 = c_e.y();
        int n8 = c_e.A();
        int n9 = c_e.A();
        int n10 = c_e.A();
        int n11 = c_e.A();
        c_v3.e = n2 = 0;
        c_v3.k = n2 += c_v3.b;
        c_v3.n = n2 += c_v3.c;
        if (n4 == 255) {
            n2 += c_v3.c;
        } else {
            c_v3.n = -n4 - 1;
        }
        c_v3.p = n2;
        if (n6 == 1) {
            n2 += c_v3.c;
        } else {
            c_v3.p = -1;
        }
        c_v3.m = n2;
        if (n3 == 1) {
            n2 += c_v3.c;
        } else {
            c_v3.m = -1;
        }
        c_v3.i = n2;
        if (n7 == 1) {
            n2 += c_v3.b;
        } else {
            c_v3.i = -1;
        }
        c_v3.o = n2;
        if (n5 == 1) {
            n2 += c_v3.c;
        } else {
            c_v3.o = -1;
        }
        c_v3.j = n2;
        c_v3.l = n2 += n11;
        c_v3.q = n2 += c_v3.c * 2;
        c_v3.f = n2 += c_v3.d * 6;
        c_v3.g = n2 += n8;
        c_v3.h = n2 += n9;
        n2 += n10;
    }

    public static void a(int n, C_e c_e) {
        rs.p_cache.p_osrs.C_c.a(new C_v[70000]);
        o = new C_v[80000];
        p = new boolean[100000];
        aU = c_e;
    }

    public static void d(int n) {
        rs.p_cache.p_osrs.C_c.a(null);
        C_h.o[n] = null;
    }

    public static C_h e(int n) {
        return C_h.a(n, h);
    }

    public static C_h a(int n, boolean bl) {
        rs.p_cache.p_osrs.C_c.a(bl);
        try {
            C_h c_h = C_h.a(n, h);
            return c_h;
        }
        finally {
            rs.p_cache.p_osrs.C_c.a(false);
        }
    }

    public static C_h a(int n, rs.p_a.p_a.C_a c_a) {
        if (C_h.j() == null) {
            return null;
        }
        C_v c_v = C_h.j()[n];
        if (c_v == null) {
            aU.a(n);
            return null;
        }
        return new C_h(n, c_a);
    }

    public static boolean b(int n, boolean bl) {
        rs.p_cache.p_osrs.C_c.a(bl);
        try {
            boolean bl2 = C_h.f(n);
            return bl2;
        }
        finally {
            rs.p_cache.p_osrs.C_c.a(false);
        }
    }

    public static boolean f(int n) {
        if (C_h.j() == null) {
            return false;
        }
        C_v c_v = C_h.j()[n];
        if (c_v == null) {
            aU.a(n);
            return false;
        }
        return true;
    }

    private C_h(boolean bl) {
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        if (!bl) {
            this.bO = !this.bO;
        }
    }

    public C_h(int n, C_h[] c_hArray, boolean bl) {
        C_h c_h;
        int n2;
        this.bH = new HashMap();
        this.bI = -1;
        this.bO = true;
        this.aN = false;
        ++ab;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (n2 = 0; n2 < n; ++n2) {
            c_h = c_hArray[n2];
            if (c_h == null) continue;
            this.ad += c_h.ad;
            this.ah += c_h.ah;
            this.av += c_h.av;
            bl2 |= c_h.ao != null;
            if (c_h.ap != null) {
                bl3 = true;
            } else {
                if (this.au == -1) {
                    this.au = c_h.au;
                }
                if (this.au != c_h.au) {
                    bl3 = true;
                }
            }
            bl4 |= c_h.aq != null;
            bl5 |= c_h.aK != null;
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
        if (bl2) {
            this.ao = new int[this.ah];
        }
        if (bl3) {
            this.ap = new int[this.ah];
        }
        if (bl4) {
            this.aq = new int[this.ah];
        }
        if (bl5) {
            this.aK = new int[this.ah];
        }
        this.ar = new int[this.ah];
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3;
            c_h = c_hArray[i];
            if (c_h == null) continue;
            for (n3 = 0; n3 < c_h.ah; ++n3) {
                if (bl2) {
                    if (c_h.ao == null) {
                        this.ao[this.ah] = 0;
                    } else {
                        int n4 = c_h.ao[n3];
                        if ((n4 & 2) == 2) {
                            n4 += n2 << 2;
                        }
                        this.ao[this.ah] = n4;
                    }
                }
                if (bl3) {
                    this.ap[this.ah] = c_h.ap == null ? c_h.au : c_h.ap[n3];
                }
                if (bl4) {
                    this.aq[this.ah] = c_h.aq == null ? 0 : c_h.aq[n3];
                }
                if (bl5 && c_h.aK != null) {
                    this.aK[this.ah] = c_h.aK[n3];
                }
                this.ar[this.ah] = c_h.ar[n3];
                this.ai[this.ah] = this.a(c_h, c_h.ai[n3]);
                this.aj[this.ah] = this.a(c_h, c_h.aj[n3]);
                this.ak[this.ah] = this.a(c_h, c_h.ak[n3]);
                ++this.ah;
            }
            for (n3 = 0; n3 < c_h.av; ++n3) {
                this.aw[this.av] = this.a(c_h, c_h.aw[n3]);
                this.ax[this.av] = this.a(c_h, c_h.ax[n3]);
                this.ay[this.av] = this.a(c_h, c_h.ay[n3]);
                ++this.av;
            }
            n2 += c_h.av;
        }
    }

    public C_h(int n, C_h[] c_hArray) {
        this(n, c_hArray, h);
    }

    public C_h(int n, C_h[] c_hArray, rs.p_a.p_a.C_a c_a) {
        C_h c_h;
        int n2;
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (n2 = 0; n2 < n; ++n2) {
            c_h = c_hArray[n2];
            if (c_h == null) continue;
            this.ad += c_h.ad;
            this.ah += c_h.ah;
            this.av += c_h.av;
            bl |= c_h.ao != null;
            if (c_h.ap != null) {
                bl2 = true;
            } else {
                if (this.au == -1) {
                    this.au = c_h.au;
                }
                if (this.au != c_h.au) {
                    bl2 = true;
                }
            }
            bl3 |= c_h.aq != null;
            bl4 |= c_h.aK != null;
            bl5 |= c_h.Y != null;
            bl6 |= c_h.Z != null;
            bl7 |= c_h.W != null;
            if (c_h.I == -1) continue;
            this.I = c_h.I;
        }
        c_a.a(this.ah, this.ad);
        this.L = c_a.a(C_a.b.p);
        this.M = c_a.c(C_a.b.q);
        this.ae = c_a.a(C_a.b.m);
        this.af = c_a.a(C_a.b.n);
        this.ag = c_a.a(C_a.b.o);
        this.aJ = c_a.a(C_a.b.l);
        this.ai = c_a.a(C_a.b.a);
        this.aj = c_a.a(C_a.b.b);
        this.ak = c_a.a(C_a.b.c);
        this.ar = c_a.a(C_a.b.j);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (bl) {
            this.ao = c_a.a(C_a.b.g);
        }
        if (bl2) {
            this.ap = c_a.a(C_a.b.h);
        }
        if (bl3) {
            this.aq = c_a.a(C_a.b.i);
        }
        if (bl4) {
            this.aK = c_a.a(C_a.b.k);
        }
        if (bl5) {
            this.Y = new short[this.ah];
        }
        if (bl6) {
            this.Z = new short[this.ah];
        }
        if (bl7) {
            this.W = new int[this.ad][];
            this.X = new int[this.ad][];
        }
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        if (this.av > 0) {
            this.aa = new byte[this.av];
        }
        n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3;
            c_h = c_hArray[i];
            if (c_h == null) continue;
            for (n3 = 0; n3 < c_h.ah; ++n3) {
                int n4;
                if (bl) {
                    if (c_h.ao == null) {
                        this.ao[this.ah] = 0;
                    } else {
                        n4 = c_h.ao[n3];
                        if ((n4 & 2) == 2) {
                            n4 += n2 << 2;
                        }
                        this.ao[this.ah] = n4;
                    }
                }
                if (bl2) {
                    this.ap[this.ah] = c_h.ap == null ? c_h.au : c_h.ap[n3];
                }
                if (bl3) {
                    this.aq[this.ah] = c_h.aq == null ? 0 : c_h.aq[n3];
                }
                if (bl5) {
                    this.Y[this.ah] = c_h.Y != null ? c_h.Y[n3] : -1;
                }
                if (bl6) {
                    if (c_h.Z != null && c_h.Z[n3] != -1) {
                        n4 = c_h.Z[n3] + n2;
                        this.Z[this.ah] = (short)(c_h.Z[n3] + n2);
                        if (n4 != this.Z[this.ah]) {
                            System.out.println(n4 + " -> " + this.Z[this.ah]);
                        }
                    } else {
                        this.Z[this.ah] = -1;
                    }
                }
                if (bl4 && c_h.aK != null && n3 < c_h.aK.length) {
                    this.aK[this.ah] = c_h.aK[n3];
                }
                this.ar[this.ah] = c_h.ar[n3];
                this.ai[this.ah] = this.a(c_h, c_h.ai[n3]);
                this.aj[this.ah] = this.a(c_h, c_h.aj[n3]);
                this.ak[this.ah] = this.a(c_h, c_h.ak[n3]);
                ++this.ah;
            }
            for (n3 = 0; n3 < c_h.av; ++n3) {
                this.aw[this.av] = this.a(c_h, c_h.aw[n3]);
                this.ax[this.av] = this.a(c_h, c_h.ax[n3]);
                this.ay[this.av] = this.a(c_h, c_h.ay[n3]);
                ++this.av;
            }
            n2 += c_h.av;
        }
    }

    public C_h(C_h[] c_hArray) {
        this(c_hArray, h);
    }

    public C_h(C_h[] c_hArray, rs.p_a.p_a.C_a c_a) {
        int n;
        this.bH = new HashMap();
        this.bI = -1;
        int n2 = 2;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (n = 0; n < n2; ++n) {
            if (c_hArray[n] == null) continue;
            this.ad += c_hArray[n].ad;
            this.ah += c_hArray[n].ah;
            this.av += c_hArray[n].av;
            bl |= c_hArray[n].ao != null;
            if (c_hArray[n].ap != null) {
                bl2 = true;
            } else {
                if (this.au == -1) {
                    this.au = c_hArray[n].au;
                }
                if (this.au != c_hArray[n].au) {
                    bl2 = true;
                }
            }
            bl3 |= c_hArray[n].aq != null;
            bl4 |= c_hArray[n].ar != null;
            bl5 |= c_hArray[n].Y != null;
            bl6 |= c_hArray[n].Z != null;
            bl7 |= c_hArray[n].W != null;
            if (c_hArray[n].I == -1) continue;
            this.I = c_hArray[n].I;
        }
        c_a.a(this.ah, this.ad);
        this.L = c_a.a(C_a.b.p);
        this.M = c_a.c(C_a.b.q);
        this.ae = c_a.a(C_a.b.m);
        this.af = c_a.a(C_a.b.n);
        this.ag = c_a.a(C_a.b.o);
        this.aJ = c_a.a(C_a.b.l);
        this.ai = c_a.a(C_a.b.a);
        this.aj = c_a.a(C_a.b.b);
        this.ak = c_a.a(C_a.b.c);
        this.al = c_a.a(C_a.b.d);
        this.am = c_a.a(C_a.b.e);
        this.an = c_a.a(C_a.b.f);
        this.ar = c_a.a(C_a.b.j);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (bl) {
            this.ao = c_a.a(C_a.b.g);
        }
        if (bl2) {
            this.ap = c_a.a(C_a.b.h);
        }
        if (bl3) {
            this.aq = c_a.a(C_a.b.i);
        }
        if (bl4) {
            this.aK = c_a.a(C_a.b.k);
        }
        if (bl5) {
            this.Y = new short[this.ah];
        }
        if (bl6) {
            this.Z = new short[this.ah];
        }
        if (bl7) {
            this.W = new int[this.ad][];
            this.X = new int[this.ad][];
        }
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        n = 0;
        for (int i = 0; i < n2; ++i) {
            int n3;
            if (c_hArray[i] == null) continue;
            int n4 = this.ad;
            for (n3 = 0; n3 < c_hArray[i].ad; ++n3) {
                if (c_a.f()) {
                    c_a.e(this.ad);
                }
                if (!rs.p_f.C_a.ah) {
                    this.L[this.ad] = c_hArray[i].L[n3];
                    this.M[this.ad] = c_hArray[i].M[n3];
                }
                this.ae[this.ad] = c_hArray[i].ae[n3];
                this.af[this.ad] = c_hArray[i].af[n3];
                this.ag[this.ad] = c_hArray[i].ag[n3];
                ++this.ad;
            }
            for (n3 = 0; n3 < c_hArray[i].ah; ++n3) {
                if (c_a.f()) {
                    c_a.d(this.ah);
                }
                this.ai[this.ah] = c_hArray[i].ai[n3] + n4;
                this.aj[this.ah] = c_hArray[i].aj[n3] + n4;
                this.ak[this.ah] = c_hArray[i].ak[n3] + n4;
                this.al[this.ah] = c_hArray[i].al[n3];
                this.am[this.ah] = c_hArray[i].am[n3];
                this.an[this.ah] = c_hArray[i].an[n3];
                if (bl) {
                    if (c_hArray[i].ao == null) {
                        this.ao[this.ah] = 0;
                    } else {
                        int n5 = c_hArray[i].ao[n3];
                        if ((n5 & 2) == 2) {
                            n5 += n << 2;
                        }
                        this.ao[this.ah] = n5;
                    }
                }
                if (bl2) {
                    this.ap[this.ah] = c_hArray[i].ap == null ? c_hArray[i].au : c_hArray[i].ap[n3];
                }
                if (bl3) {
                    this.aq[this.ah] = c_hArray[i].aq == null ? 0 : c_hArray[i].aq[n3];
                }
                if (bl4 && c_hArray[i].ar != null) {
                    this.ar[this.ah] = c_hArray[i].ar[n3];
                }
                if (bl5) {
                    this.Y[this.ah] = c_hArray[i].Y != null ? c_hArray[i].Y[this.ah] : -1;
                }
                if (bl6) {
                    this.Z[this.ah] = c_hArray[i].Z != null && c_hArray[i].Z[this.ah] != -1 ? (int)(c_hArray[i].Z[this.ah] + this.av) : -1;
                }
                ++this.ah;
            }
            for (n3 = 0; n3 < c_hArray[i].av; ++n3) {
                this.aw[this.av] = c_hArray[i].aw[n3] + n4;
                this.ax[this.av] = c_hArray[i].ax[n3] + n4;
                this.ay[this.av] = c_hArray[i].ay[n3] + n4;
                ++this.av;
            }
            n += c_hArray[i].av;
        }
        this.k();
    }

    public C_h(boolean bl, boolean bl2, boolean bl3, C_h c_h) {
        this(bl, bl2, bl3, c_h, h);
    }

    public C_h(boolean bl, boolean bl2, boolean bl3, C_h c_h, rs.p_a.p_a.C_a c_a) {
        int n;
        boolean bl4;
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        this.ad = c_h.ad;
        this.ah = c_h.ah;
        this.av = c_h.av;
        c_a.a(this.ah, this.ad);
        boolean bl5 = bl4 = !c_a.f();
        if (!bl3 && c_h.Y != null) {
            this.Y = new short[this.ah];
            for (n = 0; n < this.ah; ++n) {
                if (!bl4) {
                    c_a.d(n);
                    bl4 = true;
                }
                this.Y[n] = c_h.Y[n];
            }
        } else {
            this.Y = c_h.Y;
        }
        if (bl3) {
            this.L = c_h.L;
            this.M = c_h.M;
            this.ae = c_h.ae;
            this.af = c_h.af;
            this.ag = c_h.ag;
        } else {
            if (c_h.L != null) {
                this.L = c_a.a(C_a.b.p);
                this.M = c_a.c(C_a.b.q);
            }
            this.ae = c_a.a(C_a.b.m);
            this.af = c_a.a(C_a.b.n);
            this.ag = c_a.a(C_a.b.o);
            for (n = 0; n < this.ad; ++n) {
                if (c_a.f()) {
                    c_a.e(n);
                }
                if (!rs.p_f.C_a.ah && c_h.L != null) {
                    this.L[n] = c_h.L[n];
                    this.M[n] = c_h.M[n];
                }
                this.ae[n] = c_h.ae[n];
                this.af[n] = c_h.af[n];
                this.ag[n] = c_h.ag[n];
            }
        }
        if (bl) {
            this.ar = c_h.ar;
        } else {
            this.ar = c_a.a(C_a.b.j);
            for (n = 0; n < this.ah; ++n) {
                if (!bl4) {
                    c_a.d(n);
                    bl4 = true;
                }
                this.ar[n] = c_h.ar[n];
            }
        }
        if (bl2) {
            this.aq = c_h.aq;
        } else {
            this.aq = c_a.a(C_a.b.i);
            if (c_h.aq == null) {
                for (n = 0; n < this.ah; ++n) {
                    if (!bl4) {
                        c_a.d(n);
                        bl4 = true;
                    }
                    this.aq[n] = 0;
                }
            } else {
                for (n = 0; n < this.ah; ++n) {
                    if (!bl4) {
                        c_a.d(n);
                        bl4 = true;
                    }
                    this.aq[n] = c_h.aq[n];
                }
            }
        }
        this.I = c_h.I;
        this.L = c_h.L;
        this.M = c_h.M;
        this.aJ = c_h.aJ;
        this.aK = c_h.aK;
        this.ao = c_h.ao;
        this.ai = c_h.ai;
        this.aj = c_h.aj;
        this.ak = c_h.ak;
        this.ap = c_h.ap;
        this.Z = c_h.Z;
        this.aa = c_h.aa;
        this.au = c_h.au;
        this.aw = c_h.aw;
        this.ax = c_h.ax;
        this.ay = c_h.ay;
        this.X = c_h.X;
        this.W = c_h.W;
    }

    public C_h(boolean bl, boolean bl2, C_h c_h) {
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        this.ad = c_h.ad;
        this.ah = c_h.ah;
        this.av = c_h.av;
        if (bl) {
            this.af = new int[this.ad];
            if (c_h.ae != null) {
                System.arraycopy(c_h.af, 0, this.af, 0, this.ad);
            } else {
                this.af = null;
            }
        } else {
            this.af = c_h.af;
        }
        if (bl2) {
            int n;
            this.al = new int[this.ah];
            this.am = new int[this.ah];
            this.an = new int[this.ah];
            for (n = 0; n < this.ah; ++n) {
                this.al[n] = c_h.al[n];
                this.am[n] = c_h.am[n];
                this.an[n] = c_h.an[n];
            }
            this.ao = new int[this.ah];
            if (c_h.ao == null) {
                for (n = 0; n < this.ah; ++n) {
                    this.ao[n] = 0;
                }
            } else {
                for (n = 0; n < this.ah; ++n) {
                    this.ao[n] = c_h.ao[n];
                }
            }
            this.f = new C_S_uc(this.ad);
            for (n = 0; n < this.ad; ++n) {
                this.f.a(n, c_h.f.a(n));
                this.f.b(n, c_h.f.b(n));
                this.f.c(n, c_h.f.c(n));
                this.f.d(n, c_h.f.d(n));
            }
            this.aO = c_h.aO;
        } else {
            this.al = c_h.al;
            this.am = c_h.am;
            this.an = c_h.an;
            this.ao = c_h.ao;
        }
        this.ae = c_h.ae;
        this.ag = c_h.ag;
        this.ar = c_h.ar;
        this.aq = c_h.aq;
        this.Y = c_h.Y;
        this.Z = c_h.Z;
        this.aa = c_h.aa;
        this.ap = c_h.ap;
        this.au = c_h.au;
        this.ai = c_h.ai;
        this.aj = c_h.aj;
        this.ak = c_h.ak;
        this.aw = c_h.aw;
        this.ax = c_h.ax;
        this.ay = c_h.ay;
        this.g = c_h.g;
        this.aD = c_h.aD;
        this.aG = c_h.aG;
        this.aF = c_h.aF;
        this.W = c_h.W;
        this.X = c_h.X;
        this.az = c_h.az;
        this.aB = c_h.aB;
        this.aC = c_h.aC;
        this.aA = c_h.aA;
    }

    public void a(C_h c_h, boolean bl) {
        int n;
        this.m = c_h.m;
        this.ad = c_h.ad;
        this.ah = c_h.ah;
        this.av = c_h.av;
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
        for (n = 0; n < this.ad; ++n) {
            if (!rs.p_f.C_a.ah && this.L != null) {
                this.L[n] = c_h.L[n];
                if (this.M != null) {
                    this.M[n] = c_h.M[n];
                }
            }
            this.ae[n] = c_h.ae[n];
            this.af[n] = c_h.af[n];
            this.ag[n] = c_h.ag[n];
        }
        if (bl) {
            this.aq = c_h.aq;
        } else {
            if (bV.length < this.ah) {
                bV = new int[this.ah + 100];
            }
            this.aq = bV;
            if (c_h.aq == null) {
                for (n = 0; n < this.ah; ++n) {
                    this.aq[n] = 0;
                }
            } else {
                for (n = 0; n < this.ah; ++n) {
                    this.aq[n] = c_h.aq[n];
                }
            }
        }
        this.ao = c_h.ao;
        this.ar = c_h.ar;
        this.ap = c_h.ap;
        this.au = c_h.au;
        this.aM = c_h.aM;
        this.aL = c_h.aL;
        this.ai = c_h.ai;
        this.aj = c_h.aj;
        this.ak = c_h.ak;
        this.al = c_h.al;
        this.am = c_h.am;
        this.an = c_h.an;
        this.aw = c_h.aw;
        this.ax = c_h.ax;
        this.ay = c_h.ay;
        this.Z = c_h.Z;
        this.aa = c_h.aa;
        this.Y = c_h.Y;
        this.I = c_h.I;
        this.W = c_h.W;
        this.X = c_h.X;
    }

    private final int a(C_h c_h, int n) {
        int n2 = -1;
        int n3 = rs.p_f.C_a.ah || c_h.L == null ? 0 : c_h.L[n];
        byte by = rs.p_f.C_a.ah || c_h.M == null ? (byte)0 : c_h.M[n];
        int n4 = c_h.ae[n];
        int n5 = c_h.af[n];
        int n6 = c_h.ag[n];
        for (int i = 0; i < this.ad; ++i) {
            if (n4 != this.ae[i] || n5 != this.af[i] || n6 != this.ag[i]) continue;
            n2 = i;
            break;
        }
        if (n2 == -1) {
            if (!rs.p_f.C_a.ah && c_h.L != null) {
                this.L[this.ad] = n3;
            }
            if (!rs.p_f.C_a.ah && c_h.M != null) {
                this.M[this.ad] = by;
            }
            this.ae[this.ad] = n4;
            this.af[this.ad] = n5;
            this.ag[this.ad] = n6;
            if (c_h.aJ != null) {
                this.aJ[this.ad] = c_h.aJ[n];
            }
            if (c_h.W != null) {
                this.W[this.ad] = c_h.W[n];
                this.X[this.ad] = c_h.X[n];
            }
            n2 = this.ad++;
        }
        return n2;
    }

    public void k() {
        this.g = 0;
        this.aD = 0;
        this.aE = 0;
        for (int i = 0; i < this.ad; ++i) {
            int n;
            int n2 = this.ae[i];
            int n3 = this.af[i];
            int n4 = this.ag[i];
            if (-n3 > this.g) {
                this.g = -n3;
            }
            if (n3 > this.aE) {
                this.aE = n3;
            }
            if ((n = n2 * n2 + n4 * n4) <= this.aD) continue;
            this.aD = n;
        }
        this.aD = (int)(Math.sqrt(this.aD) + 0.99);
        this.aG = (int)(Math.sqrt(this.aD * this.aD + this.g * this.g) + 0.99);
        this.aF = this.aG + (int)(Math.sqrt(this.aD * this.aD + this.aE * this.aE) + 0.99);
    }

    public void a(int[][] nArray, int n, int n2, int n3, boolean bl, int n4) {
        this.l();
        int n5 = n - this.aD;
        int n6 = n + this.aD;
        int n7 = n3 - this.aD;
        int n8 = n3 + this.aD;
        if (n5 >= 0 && n6 + 128 >> 7 < nArray.length && n7 >= 0 && n8 + 128 >> 7 < nArray[0].length) {
            n6 = n6 + 127 >> 7;
            n8 = n8 + 127 >> 7;
            if (n2 == nArray[n5 >>= 7][n7 >>= 7] && n2 == nArray[n6][n7] && n2 == nArray[n5][n8] && n2 == nArray[n6][n8]) {
                return;
            }
            if (n4 == 0) {
                for (int i = 0; i < this.ad; ++i) {
                    int n9 = n + this.ae[i];
                    int n10 = n3 + this.ag[i];
                    int n11 = n9 & 0x7F;
                    int n12 = n10 & 0x7F;
                    int n13 = n9 >> 7;
                    int n14 = n10 >> 7;
                    int n15 = nArray[n13][n14] * (128 - n11) + nArray[n13 + 1][n14] * n11 >> 7;
                    int n16 = nArray[n13][n14 + 1] * (128 - n11) + n11 * nArray[n13 + 1][n14 + 1] >> 7;
                    int n17 = n15 * (128 - n12) + n16 * n12 >> 7;
                    this.af[i] = n17 + this.af[i] - n2;
                }
            }
            this.l();
        }
    }

    public void l() {
        this.g = 0;
        this.aE = 0;
        for (int i = 0; i < this.ad; ++i) {
            int n = this.af[i];
            if (-n > this.g) {
                this.g = -n;
            }
            if (n <= this.aE) continue;
            this.aE = n;
        }
        this.aG = (int)(Math.sqrt(this.aD * this.aD + this.g * this.g) + 0.99);
        this.aF = this.aG + (int)(Math.sqrt(this.aD * this.aD + this.aE * this.aE) + 0.99);
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = 0;
        int n10 = this.aA - this.az;
        int n11 = this.aE - this.g;
        int n12 = this.aB - this.aC;
        double d2 = (double)n7 / (double)n10;
        double d3 = -((double)n8 / (double)n11);
        double d4 = Math.min(d2, d3);
        n5 = Math.abs(n11 / 2);
        int n13 = (int)((double)n12 / d4);
        int n14 = (n13 -= n11) < n6 / 2 ? n6 / 2 : n6;
        n13 = (int)Math.ceil((double)n13 / (double)n14) * n14;
        n13 = Math.max(n13, n6 / 2);
        n13 = (int)((double)n13 - (double)n3 / d4 * 4.0);
        n6 = C_E_uc.w[n9] * Math.max(n6 / 2, n13) >> 16;
        this.a(n, n2, 0, n4, n5, n6);
        this.r = n7 * n8;
    }

    public void m() {
        this.g = 0;
        this.aD = 0;
        this.aE = 0;
        this.az = 999999;
        this.aA = -999999;
        this.aB = -99999;
        this.aC = 99999;
        for (int i = 0; i < this.ad; ++i) {
            int n;
            int n2 = this.ae[i];
            int n3 = this.af[i];
            int n4 = this.ag[i];
            if (n2 < this.az) {
                this.az = n2;
            }
            if (n2 > this.aA) {
                this.aA = n2;
            }
            if (n4 < this.aC) {
                this.aC = n4;
            }
            if (n4 > this.aB) {
                this.aB = n4;
            }
            if (-n3 > this.g) {
                this.g = -n3;
            }
            if (n3 > this.aE) {
                this.aE = n3;
            }
            if ((n = n2 * n2 + n4 * n4) <= this.aD) continue;
            this.aD = n;
        }
        this.aD = (int)Math.sqrt(this.aD);
        this.aG = (int)Math.sqrt(this.aD * this.aD + this.g * this.g);
        this.aF = this.aG + (int)Math.sqrt(this.aD * this.aD + this.aE * this.aE);
    }

    public void n() {
        int n;
        int n2;
        int n3;
        if (this.i.l != null) {
            this.aL = this.i.l;
            this.aJ = null;
        }
        if (this.i.m != null) {
            this.aM = this.i.m;
            this.aK = null;
        }
        if (this.aJ != null) {
            n3 = 0;
            System.arraycopy(s, 0, t, 0, 256);
            for (n2 = 0; n2 < this.ad; ++n2) {
                int n4 = n = this.aJ[n2];
                t[n4] = t[n4] + 1;
                if (n <= n3) continue;
                n3 = n;
            }
            this.aL = new int[n3 + 1][];
            for (n2 = 0; n2 <= n3; ++n2) {
                this.aL[n2] = new int[t[n2]];
                C_h.t[n2] = 0;
            }
            n2 = 0;
            while (n2 < this.ad) {
                int n5 = n = this.aJ[n2];
                int n6 = t[n5];
                t[n5] = n6 + 1;
                this.aL[n][n6] = n2++;
            }
            if (this.i.f()) {
                this.i.l = (int[][])Arrays.copyOf(this.aL, this.aL.length);
            }
            this.aJ = null;
        }
        if (this.aK != null) {
            System.arraycopy(s, 0, u, 0, 256);
            n3 = 0;
            for (n2 = 0; n2 < this.ah; ++n2) {
                int n7 = n = this.aK[n2];
                u[n7] = u[n7] + 1;
                if (n <= n3) continue;
                n3 = n;
            }
            this.aM = new int[n3 + 1][];
            for (n2 = 0; n2 <= n3; ++n2) {
                this.aM[n2] = new int[u[n2]];
                C_h.u[n2] = 0;
            }
            n2 = 0;
            while (n2 < this.ah) {
                int n8 = n = this.aK[n2];
                int n9 = u[n8];
                u[n8] = n9 + 1;
                this.aM[n][n9] = n2++;
            }
            if (this.i.f()) {
                this.i.m = (int[][])Arrays.copyOf(this.aM, this.aM.length);
            }
            this.aK = null;
        }
    }

    public C_h c(boolean bl) {
        C_h c_h = new C_h(true, bl, false, this);
        c_h.n();
        return c_h;
    }

    public C_h d(boolean bl) {
        C_h c_h = ac;
        c_h.a(this, bl);
        c_h.k();
        c_h.n();
        return c_h;
    }

    public void a(C_b c_b, int n) {
        if (n == -1) {
            return;
        }
        if (c_b == null) {
            return;
        }
        C_K_uc c_K_uc = c_b.base;
        rs.p_u.C_j c_j = c_K_uc.b();
        if (c_j != null) {
            c_j.a(c_b, n);
            this.a(c_j, c_b.c());
        }
        if (c_b.d()) {
            this.b(c_b, n);
        }
        this.k();
        this.aM = null;
        this.aL = null;
    }

    void a(rs.p_u.C_j c_j, int n) {
        if (this.W != null) {
            for (int i = 0; i < this.ad; ++i) {
                int[] nArray = this.W[i];
                if (nArray == null || nArray.length == 0) continue;
                int[] nArray2 = this.X[i];
                aR.f();
                for (int j = 0; j < nArray.length; ++j) {
                    int n2 = nArray[j];
                    rs.p_u.C_d c_d = c_j.a(n2);
                    if (c_d == null) continue;
                    aS.a((float)nArray2[j] / 255.0f);
                    aT.a(c_d.d(n));
                    aT.c(aS);
                    aR.b(aT);
                }
                this.a(i, aR);
            }
        }
    }

    void a(int n, b b2) {
        float f = this.ae[n];
        float f2 = -this.af[n];
        float f3 = -this.ag[n];
        float f4 = 1.0f;
        this.ae[n] = (int)(b2.e[0] * f + b2.e[4] * f2 + b2.e[8] * f3 + b2.e[12] * f4);
        this.af[n] = -((int)(b2.e[1] * f + b2.e[5] * f2 + b2.e[9] * f3 + b2.e[13] * f4));
        this.ag[n] = -((int)(b2.e[2] * f + b2.e[6] * f2 + b2.e[10] * f3 + b2.e[14] * f4));
    }

    void b(C_b c_b, int n) {
        C_K_uc c_K_uc = c_b.base;
        for (int i = 0; i < c_K_uc.b; ++i) {
            int n2 = c_K_uc.d[i];
            if (n2 != 5 || c_b.e == null || c_b.e[i] == null || c_b.e[i][0] == null || this.aM == null || this.aq == null) continue;
            C_g c_g = c_b.e[i][0];
            for (int n3 : c_K_uc.e[i]) {
                if (n3 >= this.aM.length) continue;
                int[] nArray = this.aM[n3];
                for (int j = 0; j < nArray.length; ++j) {
                    int n4 = nArray[j];
                    int n5 = (int)((float)(this.aq[n4] & 0xFF) + c_g.a(n) * 255.0f);
                    if (n5 < 0) {
                        n5 = 0;
                    } else if (n5 > 255) {
                        n5 = 255;
                    }
                    this.aq[n4] = n5;
                }
            }
        }
    }

    public void a(C_K_uc c_K_uc, C_b c_b, int n, boolean[] blArray, boolean bl, boolean bl2) {
        rs.p_u.C_j c_j = c_K_uc.b();
        if (c_j != null) {
            c_j.a(c_b, n, blArray, bl);
            if (bl2) {
                this.a(c_j, c_b.c());
            }
        }
        if (!bl && c_b.d()) {
            this.b(c_b, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f(int n, int n2) {
        C_k c_k;
        if (this.aL == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        try {
            rs.p_cache.p_osrs.C_c.a(rs.p_d.C_a.a[n2].w);
            c_k = C_k.c(n, n2);
        }
        finally {
            rs.p_cache.p_osrs.C_c.a(false);
        }
        if (c_k == null) {
            return;
        }
        C_K_uc c_K_uc = c_k.g;
        bq = 0;
        br = 0;
        bs = 0;
        for (int i = 0; i < c_k.h; ++i) {
            int n3 = c_k.k[i];
            this.a(c_K_uc.d[n3], c_K_uc.e[n3], c_k.l[i], c_k.m[i], c_k.n[i]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int[] nArray, int n, int n2, int n3) {
        int n4;
        int n5;
        if (n2 == -1) {
            return;
        }
        if (nArray == null || n == -1) {
            this.f(n2, n3);
            return;
        }
        C_k c_k = null;
        try {
            rs.p_cache.p_osrs.C_c.a(rs.p_d.C_a.a[n3].w);
            c_k = C_k.c(n2, n3);
        }
        finally {
            rs.p_cache.p_osrs.C_c.a(false);
        }
        if (c_k == null) {
            return;
        }
        C_k c_k2 = null;
        try {
            rs.p_cache.p_osrs.C_c.a(rs.p_d.C_a.a[n3].w);
            c_k2 = C_k.c(n, n3);
        }
        finally {
            rs.p_cache.p_osrs.C_c.a(false);
        }
        if (c_k2 == null) {
            this.f(n2, n3);
            return;
        }
        C_K_uc c_K_uc = c_k.g;
        bq = 0;
        br = 0;
        bs = 0;
        int n6 = 0;
        if (n6 > nArray.length - 1) {
            this.f(n2, n3);
            return;
        }
        int n7 = nArray[n6++];
        for (n5 = 0; n5 < c_k.h; ++n5) {
            n4 = c_k.k[n5];
            while (n4 > n7) {
                n7 = nArray[n6++];
            }
            if (n4 == n7 && c_K_uc.d[n4] != 0) continue;
            this.a(c_K_uc.d[n4], c_K_uc.e[n4], c_k.l[n5], c_k.m[n5], c_k.n[n5]);
        }
        bq = 0;
        br = 0;
        bs = 0;
        n6 = 0;
        if (n6 > nArray.length - 1) {
            this.f(n2, n3);
            return;
        }
        n7 = nArray[n6++];
        for (n5 = 0; n5 < c_k2.h; ++n5) {
            n4 = c_k2.k[n5];
            while (n4 > n7) {
                n7 = nArray[n6++];
            }
            if (n4 != n7 && c_K_uc.d[n4] != 0) continue;
            this.a(c_K_uc.d[n4], c_K_uc.e[n4], c_k2.l[n5], c_k2.m[n5], c_k2.n[n5]);
        }
    }

    private void a(int n, int[] nArray, int n2, int n3, int n4) {
        int n5 = nArray.length;
        if (n == 0) {
            int n6 = 0;
            bq = 0;
            br = 0;
            bs = 0;
            for (int i = 0; i < n5; ++i) {
                int n7 = nArray[i];
                if (n7 >= this.aL.length) continue;
                int[] nArray2 = this.aL[n7];
                for (int j = 0; j < nArray2.length; ++j) {
                    int n8 = nArray2[j];
                    bq += this.ae[n8];
                    br += this.af[n8];
                    bs += this.ag[n8];
                    ++n6;
                }
            }
            if (n6 > 0) {
                bq = bq / n6 + n2;
                br = br / n6 + n3;
                bs = bs / n6 + n4;
                return;
            }
            bq = n2;
            br = n3;
            bs = n4;
            return;
        }
        if (n == 1) {
            for (int i = 0; i < n5; ++i) {
                int n9 = nArray[i];
                if (n9 >= this.aL.length) continue;
                int[] nArray3 = this.aL[n9];
                for (int j = 0; j < nArray3.length; ++j) {
                    int n10;
                    int n11 = n10 = nArray3[j];
                    this.ae[n11] = this.ae[n11] + n2;
                    int n12 = n10;
                    this.af[n12] = this.af[n12] + n3;
                    int n13 = n10;
                    this.ag[n13] = this.ag[n13] + n4;
                }
            }
            return;
        }
        if (n == 2) {
            for (int i = 0; i < n5; ++i) {
                int n14 = nArray[i];
                if (n14 >= this.aL.length) continue;
                int[] nArray4 = this.aL[n14];
                for (int j = 0; j < nArray4.length; ++j) {
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19 = n18 = nArray4[j];
                    this.ae[n19] = this.ae[n19] - bq;
                    int n20 = n18;
                    this.af[n20] = this.af[n20] - br;
                    int n21 = n18;
                    this.ag[n21] = this.ag[n21] - bs;
                    int n22 = (n2 & 0xFF) * 8;
                    int n23 = (n3 & 0xFF) * 8;
                    int n24 = (n4 & 0xFF) * 8;
                    if (n24 != 0) {
                        n17 = bA[n24];
                        n16 = bB[n24];
                        n15 = this.af[n18] * n17 + this.ae[n18] * n16 >> 16;
                        this.af[n18] = this.af[n18] * n16 - this.ae[n18] * n17 >> 16;
                        this.ae[n18] = n15;
                    }
                    if (n22 != 0) {
                        n17 = bA[n22];
                        n16 = bB[n22];
                        n15 = this.af[n18] * n16 - this.ag[n18] * n17 >> 16;
                        this.ag[n18] = this.af[n18] * n17 + this.ag[n18] * n16 >> 16;
                        this.af[n18] = n15;
                    }
                    if (n23 != 0) {
                        n17 = bA[n23];
                        n16 = bB[n23];
                        n15 = this.ag[n18] * n17 + this.ae[n18] * n16 >> 16;
                        this.ag[n18] = this.ag[n18] * n16 - this.ae[n18] * n17 >> 16;
                        this.ae[n18] = n15;
                    }
                    int n25 = n18;
                    this.ae[n25] = this.ae[n25] + bq;
                    int n26 = n18;
                    this.af[n26] = this.af[n26] + br;
                    int n27 = n18;
                    this.ag[n27] = this.ag[n27] + bs;
                }
            }
            return;
        }
        if (n == 3) {
            for (int i = 0; i < n5; ++i) {
                int n28 = nArray[i];
                if (n28 >= this.aL.length) continue;
                int[] nArray5 = this.aL[n28];
                for (int j = 0; j < nArray5.length; ++j) {
                    int n29;
                    int n30 = n29 = nArray5[j];
                    this.ae[n30] = this.ae[n30] - bq;
                    int n31 = n29;
                    this.af[n31] = this.af[n31] - br;
                    int n32 = n29;
                    this.ag[n32] = this.ag[n32] - bs;
                    this.ae[n29] = this.ae[n29] * n2 / 128;
                    this.af[n29] = this.af[n29] * n3 / 128;
                    this.ag[n29] = this.ag[n29] * n4 / 128;
                    int n33 = n29;
                    this.ae[n33] = this.ae[n33] + bq;
                    int n34 = n29;
                    this.af[n34] = this.af[n34] + br;
                    int n35 = n29;
                    this.ag[n35] = this.ag[n35] + bs;
                }
            }
            return;
        }
        if (n == 5 && this.aM != null && this.aq != null) {
            for (int i = 0; i < n5; ++i) {
                int n36 = nArray[i];
                if (n36 >= this.aM.length) continue;
                int[] nArray6 = this.aM[n36];
                for (int j = 0; j < nArray6.length; ++j) {
                    int n37;
                    int n38 = n37 = nArray6[j];
                    this.aq[n38] = this.aq[n38] + n2 * 8;
                    if (this.aq[n37] < 0) {
                        this.aq[n37] = 0;
                    }
                    if (this.aq[n37] <= 255) continue;
                    this.aq[n37] = 255;
                }
            }
        }
    }

    public void b(int[] nArray, int n) {
        if (this.aq == null) {
            this.aq = new int[this.ah];
        }
        for (int i = 0; i < this.ah; ++i) {
            for (int n2 : nArray) {
                if (n2 != this.ar[i]) continue;
                this.aq[i] = 100 - n;
            }
        }
    }

    public void g(int n, int n2) {
        if (this.aq == null) {
            this.aq = new int[this.ah];
        }
        if (n2 != -1) {
            this.aq[n2] = n;
        } else {
            for (int i = 0; i < this.ah; ++i) {
                this.aq[i] = 100 - n;
            }
        }
    }

    public void g(int n) {
        for (int i = 0; i < this.ah; ++i) {
            if (this.ar[i] >= 40 && this.ar[i] <= 100) continue;
            this.ar[i] = n;
        }
    }

    public void h(int n) {
        for (int i = 0; i < this.ah; ++i) {
            if (this.ar[i] >= 15 && this.ar[i] <= 255) continue;
            this.ar[i] = n;
        }
    }

    public void h(int n, int n2) {
        for (int i = 0; i < this.ah; ++i) {
            if (this.ar[i] <= n2) continue;
            this.ar[i] = n;
        }
    }

    public void i(int n) {
        for (int i = 0; i < this.ah; ++i) {
            if (this.ar[i] <= 1) continue;
            this.ar[i] = n;
        }
    }

    public void o() {
        for (int i = 0; i < this.ad; ++i) {
            int n = this.ae[i];
            this.ae[i] = this.ag[i];
            this.ag[i] = -n;
        }
    }

    public void j(int n) {
        int n2 = bA[n];
        int n3 = bB[n];
        for (int i = 0; i < this.ad; ++i) {
            int n4 = this.af[i] * n3 - this.ag[i] * n2 >> 16;
            this.ag[i] = this.af[i] * n2 + this.ag[i] * n3 >> 16;
            this.af[i] = n4;
        }
    }

    public void a(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.ad) {
            int n5 = n4;
            this.ae[n5] = this.ae[n5] + n;
            int n6 = n4;
            this.af[n6] = this.af[n6] + n2;
            int n7 = n4++;
            this.ag[n7] = this.ag[n7] + n3;
        }
    }

    public void i(int n, int n2) {
        for (int i = 0; i < this.ah; ++i) {
            if (this.ar[i] != n) continue;
            this.ar[i] = n2;
        }
    }

    public void p() {
        int n;
        for (n = 0; n < this.ad; ++n) {
            this.ag[n] = -this.ag[n];
        }
        for (n = 0; n < this.ah; ++n) {
            int n2 = this.ai[n];
            this.ai[n] = this.ak[n];
            this.ak[n] = n2;
        }
    }

    public void b(int n, int n2, int n3) {
        for (int i = 0; i < this.ad; ++i) {
            this.ae[i] = this.ae[i] * n / 128;
            this.af[i] = this.af[i] * n3 / 128;
            this.ag[i] = this.ag[i] * n2 / 128;
        }
    }

    public void q() {
        if (this.f == null) {
            this.f = this.i.b(this.ad);
            for (int i = 0; i < this.ah; ++i) {
                boolean bl;
                int n;
                int n2 = this.ai[i];
                int n3 = this.aj[i];
                int n4 = this.ak[i];
                int n5 = this.ae[n3] - this.ae[n2];
                int n6 = this.af[n3] - this.af[n2];
                int n7 = this.ag[n3] - this.ag[n2];
                int n8 = this.ae[n4] - this.ae[n2];
                int n9 = this.af[n4] - this.af[n2];
                int n10 = this.ag[n4] - this.ag[n2];
                int n11 = n6 * n10 - n9 * n7;
                int n12 = n7 * n8 - n10 * n5;
                for (n = n5 * n9 - n8 * n6; n11 > 8192 || n12 > 8192 || n > 8192 || n11 < -8192 || n12 < -8192 || n < -8192; n11 >>= 1, n12 >>= 1, n >>= 1) {
                }
                int n13 = (int)Math.sqrt(n11 * n11 + n12 * n12 + n * n);
                if (n13 <= 0) {
                    n13 = 1;
                }
                n11 = n11 * 256 / n13;
                n12 = n12 * 256 / n13;
                n = n * 256 / n13;
                if (this.ao == null) {
                    bl = false;
                } else {
                    boolean bl2 = bl = (this.ao[i] & 1) == 1;
                }
                if (!bl) {
                    this.f.e(n2, n11);
                    this.f.f(n2, n12);
                    this.f.g(n2, n);
                    this.f.h(n2, 1);
                    this.f.e(n3, n11);
                    this.f.f(n3, n12);
                    this.f.g(n3, n);
                    this.f.h(n3, 1);
                    this.f.e(n4, n11);
                    this.f.f(n4, n12);
                    this.f.g(n4, n);
                    this.f.h(n4, 1);
                    continue;
                }
                if (!bl) continue;
                if (this.aQ == null) {
                    this.aQ = this.i.a(this.ah);
                }
                this.aQ.a(i, n11);
                this.aQ.b(i, n12);
                this.aQ.c(i, n);
            }
        }
    }

    public final void a(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        int n7 = (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5);
        int n8 = n2 * n7 >> 8;
        if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(C_a.b.d);
            this.am = this.i.a(C_a.b.e);
            this.an = this.i.a(C_a.b.f);
        }
        if (this.f == null) {
            this.f = this.i.b(this.ad);
        }
        for (n6 = 0; n6 < this.ah; ++n6) {
            int n9;
            if (this.ar != null && this.aq != null && (this.ar[n6] == 65535 || this.ar[n6] == 0 && this.k == 1 || this.ar[n6] == 16705)) {
                this.aq[n6] = 255;
            }
            int n10 = this.ai[n6];
            int n11 = this.aj[n6];
            int n12 = this.ak[n6];
            int n13 = this.ae[n11] - this.ae[n10];
            int n14 = this.af[n11] - this.af[n10];
            int n15 = this.ag[n11] - this.ag[n10];
            int n16 = this.ae[n12] - this.ae[n10];
            int n17 = this.af[n12] - this.af[n10];
            int n18 = this.ag[n12] - this.ag[n10];
            int n19 = n14 * n18 - n17 * n15;
            int n20 = n15 * n16 - n18 * n13;
            for (n9 = n13 * n17 - n16 * n14; n19 > 8192 || n20 > 8192 || n9 > 8192 || n19 < -8192 || n20 < -8192 || n9 < -8192; n19 >>= 1, n20 >>= 1, n9 >>= 1) {
            }
            int n21 = (int)Math.sqrt(n19 * n19 + n20 * n20 + n9 * n9);
            if (n21 <= 0) {
                n21 = 1;
            }
            n19 = n19 * 256 / n21;
            n20 = n20 * 256 / n21;
            n9 = n9 * 256 / n21;
            if (this.ao == null || (this.ao[n6] & 1) == 0) {
                this.f.e(n10, n19);
                this.f.f(n10, n20);
                this.f.g(n10, n9);
                this.f.h(n10, 1);
                this.f.e(n11, n19);
                this.f.f(n11, n20);
                this.f.g(n11, n9);
                this.f.h(n11, 1);
                this.f.e(n12, n19);
                this.f.f(n12, n20);
                this.f.g(n12, n9);
                this.f.h(n12, 1);
                continue;
            }
            int n22 = n;
            int n23 = n3;
            int n24 = n4;
            int n25 = n5;
            if (this.Y != null && n6 < this.Y.length && n6 > 0 && this.Y[n6] != -1) {
                n22 = 64;
                n23 = -30;
                n24 = -50;
                n25 = -30;
            }
            int n26 = n22 + (n23 * n19 + n24 * n20 + n25 * n9) / (n8 + n8 / 2);
            this.al[n6] = C_h.c(this.ar[n6], n26, this.ao[n6]);
        }
        if (bl) {
            this.a(n, n8, n3, n4, n5);
        } else {
            this.aO = this.i.c(this.ad);
            for (n6 = 0; n6 < this.ad; ++n6) {
                this.aO.a(n6, this.f.a(n6));
                this.aO.b(n6, this.f.b(n6));
                this.aO.c(n6, this.f.c(n6));
                this.aO.d(n6, this.f.d(n6));
            }
        }
        if (bl) {
            this.k();
        } else {
            this.m();
        }
    }

    public final void b(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        if (!rs.p_k.C_e.a() || C_E_uc.h) {
            this.a(n, n2, n3, n4, n5, bl);
            return;
        }
        int n7 = (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5);
        int n8 = n2 * n7 >> 8;
        if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(C_a.b.d);
            this.am = this.i.a(C_a.b.e);
            this.an = this.i.a(C_a.b.f);
        }
        this.q();
        for (n6 = 0; n6 < this.ah; ++n6) {
            int n9;
            C_S_uc c_S_uc;
            int n10;
            if (this.ar != null && this.aq != null && (this.ar[n6] == 65535 || this.ar[n6] == 0 && this.k == 1 || this.ar[n6] == 16705)) {
                this.aq[n6] = 255;
            }
            int n11 = this.ao == null ? 0 : ((this.ao[n6] & 1) == 1 ? 1 : 0);
            int n12 = this.aq == null ? 0 : this.aq[n6];
            int n13 = this.Y == null ? (this.a(n6) ? (int)((short)this.ar[n6]) : -1) : (this.Y[n6] <= 0 && this.a(n6) ? (int)((short)this.ar[n6]) : this.Y[n6]);
            if (n12 == -2) {
                n11 = 3;
            }
            if (n12 == -1) {
                n11 = 2;
            }
            if (n13 == -1) {
                if (n11 == 0) {
                    n10 = this.ar[n6] & 0xFFFF;
                    int n14 = this.ai[n6];
                    c_S_uc = this.aP != null && !this.aP.e(this.ai[n6]) ? this.aP : this.f;
                    n9 = (n4 * c_S_uc.b(n14) + n5 * c_S_uc.c(n14) + n3 * c_S_uc.a(n14)) / (n8 * c_S_uc.d(n14)) + n;
                    n14 = this.aj[n6];
                    this.al[n6] = C_h.j(n10, n9);
                    c_S_uc = this.aP != null && !this.aP.e(this.aj[n6]) ? this.aP : this.f;
                    n9 = (n4 * c_S_uc.b(n14) + n5 * c_S_uc.c(n14) + n3 * c_S_uc.a(n14)) / (n8 * c_S_uc.d(n14)) + n;
                    n14 = this.ak[n6];
                    this.am[n6] = C_h.j(n10, n9);
                    c_S_uc = this.aP != null && !this.aP.e(this.ak[n6]) ? this.aP : this.f;
                    n9 = (n4 * c_S_uc.b(n14) + n5 * c_S_uc.c(n14) + n3 * c_S_uc.a(n14)) / (n8 * c_S_uc.d(n14)) + n;
                    this.an[n6] = C_h.j(n10, n9);
                    continue;
                }
                if (n11 == 1) {
                    n9 = (n4 * this.aQ.b(n6) + n5 * this.aQ.c(n6) + n3 * this.aQ.a(n6)) / (n8 / 2 + n8) + n;
                    this.al[n6] = C_h.j(this.ar[n6] & 0xFFFF, n9);
                    this.an[n6] = -1;
                    continue;
                }
                if (n11 == 3) {
                    this.al[n6] = 128;
                    this.an[n6] = -1;
                    continue;
                }
                this.an[n6] = -2;
                continue;
            }
            if (n11 == 0) {
                n10 = this.ai[n6];
                c_S_uc = this.aP != null && !this.aP.e(this.ai[n6]) ? this.aP : this.f;
                n9 = (n4 * c_S_uc.b(n10) + n5 * c_S_uc.c(n10) + n3 * c_S_uc.a(n10)) / (n8 * c_S_uc.d(n10)) + n;
                n10 = this.aj[n6];
                this.al[n6] = C_h.k(n9);
                c_S_uc = this.aP != null && !this.aP.e(this.aj[n6]) ? this.aP : this.f;
                n9 = (n4 * c_S_uc.b(n10) + n5 * c_S_uc.c(n10) + n3 * c_S_uc.a(n10)) / (n8 * c_S_uc.d(n10)) + n;
                n10 = this.ak[n6];
                this.am[n6] = C_h.k(n9);
                c_S_uc = this.aP != null && !this.aP.e(this.ak[n6]) ? this.aP : this.f;
                n9 = (n4 * c_S_uc.b(n10) + n5 * c_S_uc.c(n10) + n3 * c_S_uc.a(n10)) / (n8 * c_S_uc.d(n10)) + n;
                this.an[n6] = C_h.k(n9);
                continue;
            }
            if (n11 == 1) {
                n9 = (n4 * this.aQ.b(n6) + n5 * this.aQ.c(n6) + n3 * this.aQ.a(n6)) / (n8 / 2 + n8) + n;
                this.al[n6] = C_h.k(n9);
                this.an[n6] = -1;
                continue;
            }
            this.an[n6] = -2;
        }
        if (bl) {
            this.a(n, n8, n3, n4, n5);
        } else {
            this.aO = this.i.c(this.ad);
            for (n6 = 0; n6 < this.ad; ++n6) {
                this.aO.a(n6, this.f.a(n6));
                this.aO.b(n6, this.f.b(n6));
                this.aO.c(n6, this.f.c(n6));
                this.aO.d(n6, this.f.d(n6));
            }
        }
        if (bl) {
            this.k();
        } else {
            this.m();
        }
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        int n6;
        C_S_uc c_S_uc = null;
        for (n6 = 0; n6 < this.ah; ++n6) {
            int n7;
            int n8;
            int n9 = this.ai[n6];
            int n10 = this.aj[n6];
            int n11 = this.ak[n6];
            int n12 = n;
            int n13 = n2;
            int n14 = n3;
            int n15 = n4;
            int n16 = n5;
            if (rs.p_k.C_e.a() && n6 >= 0 && this.a(n6) && (this.z || this.A)) {
                n14 *= -1;
                n16 *= -1;
                n12 = 50;
            }
            c_S_uc = this.f;
            if (this.ao == null) {
                n8 = this.ar[n6];
                n7 = n12 + (n14 * c_S_uc.a(n9) + n15 * c_S_uc.b(n9) + n16 * c_S_uc.c(n9)) / (n13 * c_S_uc.d(n9));
                this.al[n6] = C_h.c(n8, n7, 0);
                n7 = n12 + (n14 * c_S_uc.a(n10) + n15 * c_S_uc.b(n10) + n16 * c_S_uc.c(n10)) / (n13 * c_S_uc.d(n10));
                this.am[n6] = C_h.c(n8, n7, 0);
                n7 = n12 + (n14 * c_S_uc.a(n11) + n15 * c_S_uc.b(n11) + n16 * c_S_uc.c(n11)) / (n13 * c_S_uc.d(n11));
                this.an[n6] = C_h.c(n8, n7, 0);
                continue;
            }
            if ((this.ao[n6] & 1) != 0) continue;
            n8 = this.ar[n6];
            n7 = this.ao[n6];
            int n17 = n12 + (n14 * c_S_uc.a(n9) + n15 * c_S_uc.b(n9) + n16 * c_S_uc.c(n9)) / (n13 * c_S_uc.d(n9));
            this.al[n6] = C_h.c(n8, n17, n7);
            n17 = n12 + (n14 * c_S_uc.a(n10) + n15 * c_S_uc.b(n10) + n16 * c_S_uc.c(n10)) / (n13 * c_S_uc.d(n10));
            this.am[n6] = C_h.c(n8, n17, n7);
            n17 = n12 + (n14 * c_S_uc.a(n11) + n15 * c_S_uc.b(n11) + n16 * c_S_uc.c(n11)) / (n13 * c_S_uc.d(n11));
            this.an[n6] = C_h.c(n8, n17, n7);
        }
        if (rs.p_k.C_e.a()) {
            this.f();
        }
        this.f = null;
        this.aO = null;
        this.aJ = null;
        this.aK = null;
        if (this.ao != null) {
            for (n6 = 0; n6 < this.ah; ++n6) {
                if ((this.ao[n6] & 2) != 2) continue;
                return;
            }
        }
        this.ar = null;
    }

    static final int k(int n) {
        if (n < 2) {
            n = 2;
        } else if (n > 126) {
            n = 126;
        }
        return n;
    }

    static final int j(int n, int n2) {
        if ((n2 = (n & 0x7F) * n2 >> 7) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    public static final int c(int n, int n2, int n3) {
        if (n == 65535) {
            return 0;
        }
        if ((n3 & 2) == 2) {
            if (n2 < 0) {
                n2 = 0;
            } else if (n2 > 127) {
                n2 = 127;
            }
            n2 = 127 - n2;
            return n2;
        }
        if ((n2 = n2 * (n & 0x7F) >> 7) < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }

    public final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = 0;
        int n8 = C_E_uc.s;
        int n9 = C_E_uc.t;
        int n10 = bA[n7];
        int n11 = bB[n7];
        int n12 = bA[n];
        int n13 = bB[n];
        int n14 = bA[n2];
        int n15 = bB[n2];
        int n16 = bA[n3];
        int n17 = bB[n3];
        int n18 = n5 * n16 + n6 * n17 >> 16;
        for (int i = 0; i < this.ad; ++i) {
            int n19;
            int n20 = this.ae[i];
            int n21 = this.af[i];
            int n22 = this.ag[i];
            if (n2 != 0) {
                n19 = n21 * n14 + n20 * n15 >> 16;
                n21 = n21 * n15 - n20 * n14 >> 16;
                n20 = n19;
            }
            if (n7 != 0) {
                n19 = n21 * n11 - n22 * n10 >> 16;
                n22 = n21 * n10 + n22 * n11 >> 16;
                n21 = n19;
            }
            if (n != 0) {
                n19 = n22 * n12 + n20 * n13 >> 16;
                n22 = n22 * n13 - n20 * n12 >> 16;
                n20 = n19;
            }
            n20 += n4;
            n19 = (n21 += n5) * n17 - (n22 += n6) * n16 >> 16;
            n22 = n21 * n16 + n22 * n17 >> 16;
            n21 = n19;
            C_h.bb[i] = n22 - n18;
            if (rs.p_f.C_a.av) {
                C_h.bc[i] = 0;
            }
            C_h.aZ[i] = n8 + (n20 << 9) / n22;
            C_h.ba[i] = n9 + (n21 << 9) / n22;
            if (this.av <= 0) continue;
            C_h.bd[i] = n20;
            C_h.be[i] = n21;
            C_h.bf[i] = n22;
        }
        try {
            this.a(false, false, 0, 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    void a(rs.p_k.p_c.C_d c_d, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (c_d == null) {
            return;
        }
        for (int i = 0; i < c_d.e(); ++i) {
            rs.p_k.p_c.C_a c_a = c_d.a(i);
            if (c_a == null) continue;
            if (c_a.h() == 1 || this.N) {
                if (!bl) continue;
                C_Launcher_mc.n().o().a.a(c_a, n, n2, n3, n4, true);
                C_Launcher_mc.n().o().a.a(c_a, n, n2, n3, n4, false);
                continue;
            }
            if (c_a.h() == 2) {
                if (bl) continue;
                C_Launcher_mc.n().o().a.a(c_a, n, n2, n3, n4, true);
                C_Launcher_mc.n().o().a.a(c_a, n, n2, n3, n4, false);
                continue;
            }
            C_Launcher_mc.n().o().a.a(c_a, n, n2, n3, n4, bl);
        }
    }

    void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        try {
            if (this.L != null && this.M != null && rs.p_f.C_a.az && !rs.p_f.C_a.ah && !rs.p_l.p_b.C_a.b() && !rs.p_k.p_c.C_c.a()) {
                int n10 = -1;
                int n11 = -1;
                int n12 = 0;
                int n13 = 100;
                for (int i = 0; i < this.ad && i < this.L.length; ++i) {
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20 = this.L[i] - 1;
                    if (n20 < 0) continue;
                    rs.p_k.p_c.C_d c_d = rs.p_k.p_c.C_c.a(n9, true);
                    if (c_d == null || !c_d.b()) break;
                    if (n10 == -1) {
                        int n21 = C_Client_mc.eR.ac;
                        n19 = C_Client_mc.eR.ad;
                        n18 = n6 + C_Client_mc.cJ;
                        n17 = this.aD;
                        n16 = n8 + C_Client_mc.cL;
                        int n22 = C_Client_mc.cJ;
                        n15 = -C_Client_mc.cK;
                        n14 = C_Client_mc.cL;
                        n11 = (int)Math.sqrt((n18 - n21) * (n18 - n21) + (n16 - n19) * (n16 - n19));
                        n10 = (int)Math.sqrt((n18 - n22) * (n18 - n22) + (n16 - n14) * (n16 - n14));
                    }
                    rs.p_r.C_c c_c = rs.p_r.C_c.c[n20];
                    n19 = this.ae[i];
                    n18 = this.af[i] * -1;
                    n17 = this.ag[i];
                    if (n20 == 2 || n20 == 3) {
                        n18 -= 11;
                    }
                    n16 = c_c.h();
                    float f = 0.0f;
                    n15 = 750;
                    if (n11 == 0) {
                        n15 *= 2;
                    }
                    if ((n14 = n10 / n15) > 0) {
                        n16 = c_c.a(0, n14 * 4) <= Math.max(1, n14 / 2) ? 1 : 0;
                        f = n14 * 4 - 1;
                    }
                    if (n16 < 0 || n14 > 10) {
                        n16 = 0;
                    }
                    for (int j = 0; j < n16 && n12++ < n13; ++j) {
                        boolean bl;
                        ++this.J;
                        rs.p_k.p_c.C_a c_a = rs.p_k.p_c.C_c.a(c_c, n19, n18, n17, i);
                        if (c_a == null) continue;
                        c_a.e(n9);
                        if (c_c.p() && this.I != -1) {
                            c_a.a(this.I);
                        }
                        c_a.a(this.M[i]);
                        c_a.a(Math.min(12.0f, c_a.f() + f));
                        boolean bl2 = bl = this.J % 2 != 0;
                        if (!bl) continue;
                        c_d.a(c_a);
                    }
                }
            }
            rs.p_k.p_c.C_d c_d = null;
            if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && (c_d = rs.p_k.p_c.C_c.a(n9, false)) != null) {
                c_d.c();
            }
            if (c_d != null) {
                this.a(c_d, n, n6, n7, n8, n9, false);
            }
            C_Launcher_mc.n().o().a.a(this, n, n2, n3, n4, n5, n6, n7, n8, n9);
            if (c_d != null) {
                this.a(c_d, n, n6, n7, n8, n9, true);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final void a(boolean bl, boolean bl2, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        boolean bl3 = rs.p_k.C_e.a() && C_E_uc.p && !C_E_uc.h;
        for (n12 = 0; n12 < this.aF; ++n12) {
            C_h.bg[n12] = 0;
        }
        for (n12 = 0; n12 < this.ah; ++n12) {
            if (this.ao != null && this.ao[n12] == -1 || this.aq != null && this.aq[n12] >= 255) continue;
            n11 = this.ai[n12];
            n10 = this.aj[n12];
            int n13 = this.ak[n12];
            n9 = aZ[n11];
            n8 = aZ[n10];
            n7 = aZ[n13];
            if (bl3) {
                if (n9 == -5000 || n8 == -5000 || n7 == -5000 || !bl2 || !this.b(bu, bv, ba[n11], ba[n10], ba[n13], n9, n8, n7)) continue;
                C_h.bz[C_h.bw] = n2;
                C_h.by[C_h.bw] = n2;
                C_h.bx[C_h.bw++] = n;
                bl2 = false;
                continue;
            }
            if (bl && (n9 == -5000 || n8 == -5000 || n7 == -5000)) {
                C_h.aY[n12] = true;
                int n14 = n6 = (bb[n11] + bb[n10] + bb[n13]) / 3 + this.aG;
                int n15 = bg[n14];
                bg[n14] = n15 + 1;
                C_h.bh[n6][n15] = n12;
                continue;
            }
            if (bl2 && this.b(bu, bv, ba[n11], ba[n10], ba[n13], n9, n8, n7)) {
                C_h.bz[C_h.bw] = n2;
                C_h.by[C_h.bw] = n2;
                C_h.bx[C_h.bw++] = n;
                bl2 = false;
            }
            if ((n9 - n8) * (ba[n13] - ba[n10]) - (ba[n11] - ba[n10]) * (n7 - n8) <= 0) continue;
            C_h.aY[n12] = false;
            C_h.aX[n12] = n9 < 0 || n8 < 0 || n7 < 0 || n9 > rs.p_l.C_c.n || n8 > rs.p_l.C_c.n || n7 > rs.p_l.C_c.n;
            int n16 = n6 = (bb[n11] + bb[n10] + bb[n13]) / 3 + this.aG;
            int n17 = bg[n16];
            bg[n16] = n17 + 1;
            C_h.bh[n6][n17] = n12;
        }
        if (bl3) {
            return;
        }
        if (this.L != null && this.L.length > 0) {
            block2: for (n12 = 0; n12 < this.ad; ++n12) {
                n11 = n12;
                n10 = this.L[n11] - 1;
                if (n10 < 0) continue;
                rs.p_r.C_c c_c = rs.p_r.C_c.c[n10];
                n9 = this.ae[n11];
                n8 = this.af[n11];
                n7 = this.ag[n11];
                n6 = bc[n11];
                if (this.E != 0) {
                    n5 = bA[this.E];
                    n4 = bB[this.E];
                    n3 = n7 * n5 + n9 * n4 >> 16;
                    n7 = n7 * n4 - n9 * n5 >> 16;
                    n9 = n3;
                }
                n9 += this.B;
                n7 += this.D;
                if (n10 == 2 || n10 == 3) {
                    n8 -= 11;
                }
                for (n5 = 0; n5 < c_c.h(); ++n5) {
                    ++this.J;
                    if (!rs.p_f.C_a.az || rs.p_f.C_a.ah || this.J % 2 == 0) continue;
                    rs.p_r.C_a c_a = C_J_uc.a(c_c, n6, n9, -n8, n7);
                    if (c_a == null) continue block2;
                    if (c_c.p() && this.I != -1) {
                        c_a.c(this.I);
                    }
                    C_Client_mc.a(c_a);
                }
            }
        }
        if (this.ap == null) {
            for (n12 = this.aF - 1; n12 >= 0; --n12) {
                n11 = bg[n12];
                if (n11 <= 0) continue;
                for (n10 = 0; n10 < n11; ++n10) {
                    this.q(bh[n12][n10]);
                }
            }
            return;
        }
        for (n12 = 0; n12 < 12; ++n12) {
            C_h.bi[n12] = 0;
            C_h.bm[n12] = 0;
        }
        for (n12 = this.aF - 1; n12 >= 0; --n12) {
            n11 = bg[n12];
            if (n11 <= 0) continue;
            for (n10 = 0; n10 < n11; ++n10) {
                int n18 = bh[n12][n10];
                int n19 = n9 = this.ap[n18];
                bi[n19] = bi[n19] + 1;
                C_h.bj[n9][n8] = n18;
                if (n9 < 10) {
                    int n20 = n9;
                    bm[n20] = bm[n20] + n12;
                    continue;
                }
                if (n9 == 10) {
                    C_h.bk[n8] = n12;
                    continue;
                }
                C_h.bl[n8] = n12;
            }
        }
        n12 = 0;
        if (bi[1] > 0 || bi[2] > 0) {
            n12 = (bm[1] + bm[2]) / (bi[1] + bi[2]);
        }
        n11 = 0;
        if (bi[3] > 0 || bi[4] > 0) {
            n11 = (bm[3] + bm[4]) / (bi[3] + bi[4]);
        }
        n10 = 0;
        if (bi[6] > 0 || bi[8] > 0) {
            n10 = (bm[6] + bm[8]) / (bi[6] + bi[8]);
        }
        int n21 = 0;
        n9 = bi[10];
        n8 = 10;
        n7 = 0;
        if (n21 == n9) {
            n21 = 0;
            n9 = bi[11];
            n8 = 11;
            n7 = 1;
        }
        n6 = n21 < n9 ? (n7 != 0 ? C_h.bl[n21] : bk[n21]) : -1000;
        for (n5 = 0; n5 < 10; ++n5) {
            while (n5 == 0 && n6 > n12) {
                this.q(bj[n8][n21++]);
                if (n21 == n9 && n8 != 11) {
                    n21 = 0;
                    n9 = bi[11];
                    n8 = 11;
                    n7 = 1;
                }
                if (n21 < n9) {
                    n6 = n7 != 0 ? C_h.bl[n21] : bk[n21];
                    continue;
                }
                n6 = -1000;
            }
            while (n5 == 3 && n6 > n11) {
                this.q(bj[n8][n21++]);
                if (n21 == n9 && n8 != 11) {
                    n21 = 0;
                    n9 = bi[11];
                    n8 = 11;
                    n7 = 1;
                }
                if (n21 < n9) {
                    n6 = n7 != 0 ? C_h.bl[n21] : bk[n21];
                    continue;
                }
                n6 = -1000;
            }
            while (n5 == 5 && n6 > n10) {
                this.q(bj[n8][n21++]);
                if (n21 == n9 && n8 != 11) {
                    n21 = 0;
                    n9 = bi[11];
                    n8 = 11;
                    n7 = 1;
                }
                if (n21 < n9) {
                    n6 = n7 != 0 ? C_h.bl[n21] : bk[n21];
                    continue;
                }
                n6 = -1000;
            }
            n4 = bi[n5];
            for (n3 = 0; n3 < n4; ++n3) {
                this.q(bj[n5][n3]);
            }
        }
        n5 = 0;
        while (n6 != -1000) {
            ++n5;
            this.q(bj[n8][n21++]);
            if (n21 == n9 && n8 != 11) {
                n21 = 0;
                n8 = 11;
                n9 = bi[11];
                n7 = 1;
            }
            if (n21 < n9) {
                n6 = n7 != 0 ? C_h.bl[n21] : bk[n21];
                continue;
            }
            n6 = -1000;
        }
    }

    public void b(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.B = n6 + C_Client_mc.cJ;
        this.C = n7 + C_Client_mc.cK;
        this.D = n8 + C_Client_mc.cL;
        this.E = n;
        int n11 = n8 * n5 - n6 * n4 >> 16;
        int n12 = n7 * n2 + n11 * n3 >> 16;
        int n13 = this.aD * n3 >> 16;
        int n14 = n12 + n13;
        if (n14 <= 50 || n12 >= j) {
            return;
        }
        int n15 = n8 * n4 + n6 * n5 >> 16;
        int n16 = n15 - this.aD << 9;
        if (n16 / n14 >= rs.p_l.C_c.o) {
            return;
        }
        int n17 = n15 + this.aD << 9;
        if (n17 / n14 <= -rs.p_l.C_c.o) {
            return;
        }
        int n18 = n7 * n3 - n11 * n2 >> 16;
        int n19 = this.aD * n2 >> 16;
        int n20 = n18 + n19 << 9;
        if (n20 / n14 <= -rs.p_l.C_c.p) {
            return;
        }
        int n21 = n19 + (this.g * n3 >> 16);
        int n22 = n18 - n21 << 9;
        if (n22 / n14 >= rs.p_l.C_c.p) {
            return;
        }
        int n23 = n13 + (this.g * n2 >> 16);
        boolean bl = false;
        if (n12 - n23 <= 50) {
            bl = true;
        }
        boolean bl2 = false;
        if (n9 > 0 && bt) {
            int n24 = n12 - n13;
            if (n24 <= 50) {
                n24 = 50;
            }
            if (n15 > 0) {
                n16 /= n14;
                n17 /= n24;
            } else {
                n17 /= n14;
                n16 /= n24;
            }
            if (n18 > 0) {
                n22 /= n14;
                n20 /= n24;
            } else {
                n20 /= n14;
                n22 /= n24;
            }
            int n25 = bu - C_E_uc.s;
            int n26 = bv - C_E_uc.t;
            Object var29_29 = null;
            boolean bl3 = false;
            boolean bl4 = false;
            int n27 = 0;
            boolean bl5 = false;
            if (bl5 || n25 > n16 && n25 < n17 && n26 > n22 && n26 < n20) {
                if (bl5 || this.aN) {
                    C_h.by[C_h.bw] = n10;
                    int n28 = C_h.bx[C_h.bw++] = bl4 && n27 != 0 ? n27 : n9;
                    if (bl3) {
                        var29_29.g = true;
                    }
                } else {
                    bl2 = true;
                }
            }
            bl4 = false;
        }
    }

    public void l(int n) {
        if (!this.bH.containsKey(n)) {
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = bB[n];
            int n9 = bA[n];
            for (int i = 0; i < this.ad; ++i) {
                int n10 = C_E_uc.e(this.ae[i], this.ag[i], n8, n9);
                int n11 = this.af[i];
                int n12 = C_E_uc.e(this.ae[i], this.ag[i], n8, n9);
                if (n10 < n2) {
                    n2 = n10;
                }
                if (n10 > n5) {
                    n5 = n10;
                }
                if (n11 < n3) {
                    n3 = n11;
                }
                if (n11 > n6) {
                    n6 = n11;
                }
                if (n12 < n4) {
                    n4 = n12;
                }
                if (n12 <= n7) continue;
                n7 = n12;
            }
            C_i c_i = new C_i((n5 + n2) / 2, (n6 + n3) / 2, (n7 + n4) / 2, (n5 - n2 + 1) / 2, (n6 - n3 + 1) / 2, (n7 - n4 + 1) / 2);
            if (c_i.d < 32) {
                c_i.d = 32;
            }
            if (c_i.f < 32) {
                c_i.f = 32;
            }
            if (this.aN) {
                c_i.d += 8;
                c_i.f += 8;
            }
            this.bH.put(n, c_i);
        }
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        boolean bl;
        this.B = n6 + C_Client_mc.cJ;
        this.C = n7 + C_Client_mc.cK;
        this.D = n8 + C_Client_mc.cL;
        this.E = n;
        if (!rs.p_f.C_a.I && n10 != 0) {
            return;
        }
        int n18 = n8 * n5 - n6 * n4 >> 16;
        int n19 = n7 * n2 + n18 * n3 >> 16;
        int n20 = this.aD * n3 >> 16;
        int n21 = n19 + n20;
        boolean bl2 = bl = rs.p_k.C_e.a() && C_E_uc.p;
        if (n21 <= 50 || n19 >= j) {
            return;
        }
        int n22 = n8 * n4 + n6 * n5 >> 16;
        int n23 = n22 - this.aD << 9;
        if (n23 / n21 >= rs.p_l.C_c.o) {
            return;
        }
        int n24 = n22 + this.aD << 9;
        if (n24 / n21 <= -rs.p_l.C_c.o) {
            return;
        }
        int n25 = n7 * n3 - n18 * n2 >> 16;
        int n26 = this.aD * n2 >> 16;
        int n27 = n25 + n26 << 9;
        if (n27 / n21 <= -rs.p_l.C_c.p) {
            return;
        }
        int n28 = n26 + (this.g * n3 >> 16);
        int n29 = n25 - n28 << 9;
        if (n29 / n21 >= rs.p_l.C_c.p) {
            return;
        }
        int n30 = n20 + (this.g * n2 >> 16);
        boolean bl3 = false;
        if (n19 - n30 <= 50) {
            bl3 = true;
        }
        boolean bl4 = false;
        if (n9 > 0 && bt) {
            n17 = n19 - n20;
            if (n17 <= 50) {
                n17 = 50;
            }
            if (n22 > 0) {
                n23 /= n21;
                n24 /= n17;
            } else {
                n24 /= n21;
                n23 /= n17;
            }
            if (n25 > 0) {
                n29 /= n21;
                n27 /= n17;
            } else {
                n27 /= n21;
                n29 /= n17;
            }
            n16 = bu - C_E_uc.s;
            n15 = bv - C_E_uc.t;
            C_j c_j = null;
            n14 = 0;
            n13 = 0;
            n12 = 0;
            if ((n9 >> 29 & 3) == 1 || rs.p_l.p_b.p_a.C_d.d) {
                c_j = (C_j)C_Client_mc.ab.c.b(n9);
                int n31 = n14 = c_j != null && c_j.b != null && c_j.a != null ? 1 : 0;
                if (n14 != 0) {
                    c_j.g = false;
                    if (c_j.a.contains(bu, bv)) {
                        n13 = 1;
                        n12 = c_j.h;
                        c_j.g = true;
                    }
                }
            }
            if ((n9 >> 29 & 3) == 2 && C_Client_mc.ab.e.size() > 0) {
                c_j = (C_j)C_Client_mc.ab.e.b(n9);
                int n32 = n14 = c_j != null && c_j.b != null && c_j.a != null ? 1 : 0;
                if (n14 != 0) {
                    c_j.g = false;
                    if (c_j.a.contains(bu, bv)) {
                        n13 = 1;
                        n12 = c_j.h;
                        c_j.g = true;
                    }
                }
            }
            int n33 = n11 = n13 != 0 && n12 != 0 ? 1 : 0;
            if (n11 != 0 || n16 > n23 && n16 < n24 && n15 > n29 && n15 < n27) {
                if (n11 != 0 || this.aN) {
                    C_h.by[C_h.bw] = n10;
                    int n34 = C_h.bx[C_h.bw++] = n13 != 0 && n12 != 0 ? n12 : n9;
                    if (n14 != 0) {
                        c_j.g = true;
                    }
                    if (bl) {
                        this.a(n, n2, n3, n4, n5, n6, n7, n8, n9);
                        return;
                    }
                } else {
                    bl4 = true;
                }
            }
            n13 = 0;
        }
        n17 = C_E_uc.s;
        n16 = C_E_uc.t;
        n15 = 0;
        int n35 = 0;
        if (n != 0) {
            n15 = bA[n];
            n35 = bB[n];
        }
        for (n14 = 0; n14 < this.ad; ++n14) {
            int n36;
            n13 = this.ae[n14];
            n12 = this.af[n14];
            n11 = this.ag[n14];
            if (n != 0) {
                n36 = n11 * n15 + n13 * n35 >> 16;
                n11 = n11 * n35 - n13 * n15 >> 16;
                n13 = n36;
            }
            n36 = (n11 += n8) * n4 + (n13 += n6) * n5 >> 16;
            n11 = n11 * n5 - n13 * n4 >> 16;
            n13 = n36;
            n36 = (n12 += n7) * n3 - n11 * n2 >> 16;
            n11 = n12 * n2 + n11 * n3 >> 16;
            n12 = n36;
            C_h.bb[n14] = n11 - n19;
            if (rs.p_f.C_a.av) {
                C_h.bc[n14] = n11;
            }
            if (n11 >= 50) {
                C_h.aZ[n14] = n17 + (n13 << 9) / n11;
                C_h.ba[n14] = n16 + (n12 << 9) / n11;
            } else {
                C_h.aZ[n14] = -5000;
                bl3 = true;
            }
            if (!bl3 && this.av <= 0 || bl) continue;
            C_h.bd[n14] = n13;
            C_h.be[n14] = n12;
            C_h.bf[n14] = n11;
        }
        try {
            if (!bl || bl4 && !(Math.sqrt(n6 * n6 + n8 * n8) > 4480.0)) {
                this.a(bl3, bl4, n9, n10);
            }
            if (bl) {
                this.a(n, n2, n3, n4, n5, n6, n7, n8, n9);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private final void q(int n) {
        int n2;
        if (aY[n]) {
            this.r(n);
            return;
        }
        int n3 = this.ai[n];
        int n4 = this.aj[n];
        int n5 = this.ak[n];
        C_E_uc.o = aX[n];
        C_E_uc.r = this.aq == null ? 0 : this.aq[n];
        if (this.K <= 255) {
            C_E_uc.r = this.K;
        }
        if (this.ao == null) {
            n2 = 0;
        } else {
            int n6 = n2 = H != -1 ? H : this.ao[n] & 3;
            if (H != -1) {
                n2 = 1;
            }
        }
        if (this.F && (ba[this.ai[n]] < rs.p_l.C_c.j - 20 || ba[this.aj[n]] < rs.p_l.C_c.j - 20 || ba[this.ak[n]] < rs.p_l.C_c.j - 20)) {
            return;
        }
        if (!C_E_uc.q) {
            if (ba[this.ai[n]] < rs.p_l.C_c.j - this.O) {
                C_h.ba[this.ai[n]] = rs.p_l.C_c.j - this.O;
            }
            if (ba[this.aj[n]] < rs.p_l.C_c.j - this.O) {
                C_h.ba[this.aj[n]] = rs.p_l.C_c.j - this.O;
            }
            if (ba[this.ak[n]] < rs.p_l.C_c.j - this.O) {
                C_h.ba[this.ak[n]] = rs.p_l.C_c.j - this.O;
            }
            if (aZ[this.ai[n]] < rs.p_l.C_c.l) {
                C_h.aZ[this.ai[n]] = rs.p_l.C_c.l;
            }
            if (aZ[this.aj[n]] < rs.p_l.C_c.l) {
                C_h.aZ[this.aj[n]] = rs.p_l.C_c.l;
            }
            if (aZ[this.ak[n]] < rs.p_l.C_c.l) {
                C_h.aZ[this.ak[n]] = rs.p_l.C_c.l;
            }
        }
        if (this.Y != null && this.Y[n] != -1 && H == -1) {
            int n7;
            int n8 = n3;
            int n9 = n4;
            int n10 = n5;
            if (this.Z != null && this.Z[n] != -1) {
                n7 = this.Z[n];
                n8 = this.aw[n7];
                n9 = this.ax[n7];
                n10 = this.ay[n7];
            }
            int n11 = n7 = H != -1 ? H : this.an[n];
            if (n7 == -1 || n2 == 3) {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.al[n], H != -1 ? H : this.al[n], bd[n8], bd[n9], bd[n10], be[n8], be[n9], be[n10], bf[n8], bf[n9], bf[n10], this.Y[n], bc[n3], bc[n4], bc[n5]);
                return;
            }
            if (rs.p_f.C_a.ah) {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.am[n], H != -1 ? H : this.an[n], bd[n8], bd[n9], bd[n10], be[n8], be[n9], be[n10], bf[n8], bf[n9], bf[n10], this.Y[n]);
            } else {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.am[n], H != -1 ? H : this.an[n], bd[n8], bd[n9], bd[n10], be[n8], be[n9], be[n10], bf[n8], bf[n9], bf[n10], this.Y[n], bc[n3], bc[n4], bc[n5]);
            }
            return;
        }
        if (n2 == 0) {
            if (rs.p_f.C_a.av && !rs.p_k.C_e.a()) {
                if (this.V > 0) {
                    int n12 = C_E_uc.a(this.al[n], this.S, this.T, this.U, this.V);
                    int n13 = C_E_uc.a(this.am[n], this.S, this.T, this.U, this.V);
                    int n14 = C_E_uc.a(this.an[n], this.S, this.T, this.U, this.V);
                    C_E_uc.a(ba[this.ai[n]], ba[this.aj[n]], ba[this.ak[n]], aZ[this.ai[n]], aZ[this.aj[n]], aZ[this.ak[n]], H != -1 ? H : n12, H != -1 ? H : n13, H != -1 ? H : n14, (float)bc[this.ai[n]], (float)bc[this.aj[n]], (float)bc[this.ak[n]]);
                } else {
                    C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.am[n], H != -1 ? H : this.an[n], (float)bc[n3], (float)bc[n4], (float)bc[n5]);
                }
            } else if (this.V > 0) {
                int n15 = C_E_uc.a(this.al[n], this.S, this.T, this.U, this.V);
                int n16 = C_E_uc.a(this.am[n], this.S, this.T, this.U, this.V);
                int n17 = C_E_uc.a(this.an[n], this.S, this.T, this.U, this.V);
                C_E_uc.a(ba[this.ai[n]], ba[this.aj[n]], ba[this.ak[n]], aZ[this.ai[n]], aZ[this.aj[n]], aZ[this.ak[n]], n15, n16, n17);
            } else {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.am[n], H != -1 ? H : this.an[n]);
            }
            return;
        }
        if (n2 == 1) {
            int n18 = bC[H != -1 ? H : this.al[n]];
            if (this.aI > 0) {
                n18 = this.aI;
            }
            if (rs.p_f.C_a.av) {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], n18, (float)bc[n3], (float)bc[n4], (float)bc[n5]);
            } else {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], n18);
            }
            return;
        }
        if (n2 == 2) {
            int n19 = (H != -1 ? H : this.ao[n]) >> 2;
            int n20 = this.aw[n19];
            int n21 = this.ax[n19];
            int n22 = this.ay[n19];
            if (rs.p_f.C_a.av && (!rs.p_k.C_e.a() || rs.p_k.C_e.a() && C_E_uc.p)) {
                C_E_uc.a(this.bJ, ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.am[n], H != -1 ? H : this.an[n], bd[n20], bd[n21], bd[n22], be[n20], be[n21], be[n22], bf[n20], bf[n21], bf[n22], this.ar[n], bc[n3], bc[n4], bc[n5]);
            } else {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.am[n], H != -1 ? H : this.an[n], bd[n20], bd[n21], bd[n22], be[n20], be[n21], be[n22], bf[n20], bf[n21], bf[n22], this.ar[n]);
            }
            return;
        }
        if (n2 == 3) {
            int n23;
            int n24 = this.ao[n] >> 2;
            int n25 = 0;
            int n26 = 0;
            int n27 = 0;
            if (n24 >= this.aw.length) {
                n23 = 0;
            } else {
                n25 = this.aw[n24];
                n26 = this.ax[n24];
                n27 = this.ay[n24];
            }
            if (rs.p_f.C_a.av || rs.p_k.C_e.a()) {
                if (this.V > 0) {
                    n23 = C_E_uc.a(this.al[n], this.S, this.T, this.U, this.V);
                    int n28 = C_E_uc.a(this.am[n], this.S, this.T, this.U, this.V);
                    int n29 = C_E_uc.a(this.an[n], this.S, this.T, this.U, this.V);
                    C_E_uc.a(ba[this.ai[n]], ba[this.aj[n]], ba[this.ak[n]], aZ[this.ai[n]], aZ[this.aj[n]], aZ[this.ak[n]], n23, n28, n29, (float)bc[this.ai[n]], (float)bc[this.aj[n]], (float)bc[this.ak[n]]);
                } else {
                    C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.al[n], H != -1 ? H : this.al[n], bd[n25], bd[n26], bd[n27], be[n25], be[n26], be[n27], bf[n25], bf[n26], bf[n27], this.ar[n], bc[n3], bc[n4], bc[n5]);
                }
            } else if (this.V > 0) {
                n23 = C_E_uc.a(this.al[n], this.S, this.T, this.U, this.V);
                int n30 = C_E_uc.a(this.am[n], this.S, this.T, this.U, this.V);
                int n31 = C_E_uc.a(this.an[n], this.S, this.T, this.U, this.V);
                C_E_uc.a(ba[this.ai[n]], ba[this.aj[n]], ba[this.ak[n]], aZ[this.ai[n]], aZ[this.aj[n]], aZ[this.ak[n]], n23, n30, n31);
            } else {
                C_E_uc.a(ba[n3], ba[n4], ba[n5], aZ[n3], aZ[n4], aZ[n5], H != -1 ? H : this.al[n], H != -1 ? H : this.al[n], H != -1 ? H : this.al[n], bd[n25], bd[n26], bd[n27], be[n25], be[n26], be[n27], bf[n25], bf[n26], bf[n27], this.ar[n]);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void r(int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        if (this.ar != null && this.ar[n] == 65535) {
            return;
        }
        int n11 = C_E_uc.s;
        int n12 = C_E_uc.t;
        int n13 = 0;
        int n14 = this.ai[n];
        int n15 = this.aj[n];
        int n16 = this.ak[n];
        int n17 = bf[n14];
        int n18 = bf[n15];
        int n19 = bf[n16];
        if (n17 >= 50) {
            C_h.bn[n13] = aZ[n14];
            C_h.bo[n13] = ba[n14];
            C_h.bp[n13++] = this.al[n];
        } else {
            n10 = bd[n14];
            n9 = be[n14];
            n8 = this.al[n];
            if (n19 >= 50) {
                n7 = (50 - n17) * bD[n19 - n17];
                C_h.bn[n13] = n11 + (n10 + ((bd[n16] - n10) * n7 >> 16) << 9) / 50;
                C_h.bo[n13] = n12 + (n9 + ((be[n16] - n9) * n7 >> 16) << 9) / 50;
                C_h.bp[n13++] = n8 + ((this.an[n] - n8) * n7 >> 16);
            }
            if (n18 >= 50) {
                n7 = (50 - n17) * bD[n18 - n17];
                C_h.bn[n13] = n11 + (n10 + ((bd[n15] - n10) * n7 >> 16) << 9) / 50;
                C_h.bo[n13] = n12 + (n9 + ((be[n15] - n9) * n7 >> 16) << 9) / 50;
                C_h.bp[n13++] = n8 + ((this.am[n] - n8) * n7 >> 16);
            }
        }
        if (n18 >= 50) {
            C_h.bn[n13] = aZ[n15];
            C_h.bo[n13] = ba[n15];
            C_h.bp[n13++] = this.am[n];
        } else {
            n10 = bd[n15];
            n9 = be[n15];
            n8 = this.am[n];
            if (n17 >= 50) {
                n7 = (50 - n18) * bD[n17 - n18];
                C_h.bn[n13] = n11 + (n10 + ((bd[n14] - n10) * n7 >> 16) << 9) / 50;
                C_h.bo[n13] = n12 + (n9 + ((be[n14] - n9) * n7 >> 16) << 9) / 50;
                C_h.bp[n13++] = n8 + ((this.al[n] - n8) * n7 >> 16);
            }
            if (n19 >= 50) {
                n7 = (50 - n18) * bD[n19 - n18];
                C_h.bn[n13] = n11 + (n10 + ((bd[n16] - n10) * n7 >> 16) << 9) / 50;
                C_h.bo[n13] = n12 + (n9 + ((be[n16] - n9) * n7 >> 16) << 9) / 50;
                C_h.bp[n13++] = n8 + ((this.an[n] - n8) * n7 >> 16);
            }
        }
        if (n19 >= 50) {
            C_h.bn[n13] = aZ[n16];
            C_h.bo[n13] = ba[n16];
            C_h.bp[n13++] = this.an[n];
        } else {
            n10 = bd[n16];
            n9 = be[n16];
            n8 = this.an[n];
            if (n18 >= 50) {
                n7 = (50 - n19) * bD[n18 - n19];
                C_h.bn[n13] = n11 + (n10 + ((bd[n15] - n10) * n7 >> 16) << 9) / 50;
                C_h.bo[n13] = n12 + (n9 + ((be[n15] - n9) * n7 >> 16) << 9) / 50;
                C_h.bp[n13++] = n8 + ((this.am[n] - n8) * n7 >> 16);
            }
            if (n17 >= 50) {
                n7 = (50 - n19) * bD[n17 - n19];
                C_h.bn[n13] = n11 + (n10 + ((bd[n14] - n10) * n7 >> 16) << 9) / 50;
                C_h.bo[n13] = n12 + (n9 + ((be[n14] - n9) * n7 >> 16) << 9) / 50;
                C_h.bp[n13++] = n8 + ((this.al[n] - n8) * n7 >> 16);
            }
        }
        n10 = bn[0];
        n9 = bn[1];
        n8 = bn[2];
        n7 = bo[0];
        int n20 = bo[1];
        int n21 = bo[2];
        if ((n10 - n9) * (n21 - n20) - (n7 - n20) * (n8 - n9) <= 0) return;
        C_E_uc.o = false;
        int n22 = n14;
        int n23 = n15;
        int n24 = n16;
        if (n13 == 3) {
            if (n10 < 0 || n9 < 0 || n8 < 0 || n10 > rs.p_l.C_c.n || n9 > rs.p_l.C_c.n || n8 > rs.p_l.C_c.n) {
                C_E_uc.o = true;
            }
            n6 = this.ao == null ? 0 : this.ao[n] & 3;
            if (this.Y != null && this.Y[n] != -1) {
                if (this.Z != null && this.Z[n] != -1) {
                    n5 = this.Z[n];
                    n22 = this.aw[n5];
                    n23 = this.ax[n5];
                    n24 = this.ay[n5];
                }
                if (this.an[n] == -1) {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, this.al[n], this.al[n], this.al[n], bd[n22], bd[n23], bd[n24], be[n22], be[n23], be[n24], bf[n22], bf[n23], bf[n24], this.Y[n], bc[n14], bc[n15], bc[n16]);
                } else {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], bd[n22], bd[n23], bd[n24], be[n22], be[n23], be[n24], bf[n22], bf[n23], bf[n24], this.Y[n], bc[n14], bc[n15], bc[n16]);
                }
            } else if (n6 == 0) {
                if (rs.p_f.C_a.av) {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], -1.0f, -1.0f, -1.0f);
                } else {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2]);
                }
            } else if (n6 == 1) {
                if (rs.p_f.C_a.av) {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bC[this.al[n]], -1.0f, -1.0f, -1.0f);
                } else {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bC[this.al[n]]);
                }
            } else if (n6 == 2) {
                n5 = this.ao[n] >> 2;
                n4 = this.aw[n5];
                n3 = this.ax[n5];
                n2 = this.ay[n5];
                if (rs.p_f.C_a.av) {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n], bc[n14], bc[n15], bc[n16]);
                } else {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n]);
                }
            } else if (n6 == 3) {
                n5 = this.ao[n] >> 2;
                n4 = this.aw[n5];
                n3 = this.ax[n5];
                n2 = this.ay[n5];
                if (rs.p_f.C_a.av) {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, this.al[n], this.al[n], this.al[n], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n], bc[n14], bc[n15], bc[n16]);
                } else {
                    C_E_uc.a(n7, n20, n21, n10, n9, n8, this.al[n], this.al[n], this.al[n], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n]);
                }
            }
        }
        if (n13 != 4) return;
        if (n10 < 0 || n9 < 0 || n8 < 0 || n10 > rs.p_l.C_c.n || n9 > rs.p_l.C_c.n || n8 > rs.p_l.C_c.n || bn[3] < 0 || bn[3] > rs.p_l.C_c.n) {
            C_E_uc.o = true;
        }
        n6 = this.ao == null ? 0 : this.ao[n] & 3;
        if (this.Y != null && this.Y[n] != -1) {
            if (this.Z != null && this.Z[n] != -1) {
                n5 = this.Z[n];
                n22 = this.aw[n5];
                n23 = this.ax[n5];
                n24 = this.ay[n5];
            }
            if (this.an[n] == -1) {
                C_E_uc.a(n7, n20, n21, n10, n9, n8, this.al[n], this.al[n], this.al[n], bd[n22], bd[n23], bd[n24], be[n22], be[n23], be[n24], bf[n22], bf[n23], bf[n24], this.Y[n], bc[n14], bc[n15], bc[n16]);
                C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], this.al[n], this.al[n], this.al[n], bd[n22], bd[n23], bd[n24], be[n22], be[n23], be[n24], bf[n22], bf[n23], bf[n24], this.Y[n], bc[n14], bc[n15], bc[n16]);
                return;
            }
            C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], bd[n22], bd[n23], bd[n24], be[n22], be[n23], be[n24], bf[n22], bf[n23], bf[n24], this.Y[n], bc[n14], bc[n15], bc[n16]);
            C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], bp[0], bp[2], bp[3], bd[n22], bd[n23], bd[n24], be[n22], be[n23], be[n24], bf[n22], bf[n23], bf[n24], this.Y[n], bc[n14], bc[n15], bc[n16]);
            return;
        }
        if (n6 == 0) {
            if (rs.p_f.C_a.av) {
                C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], -1.0f, -1.0f, -1.0f);
                C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], bp[0], bp[2], bp[3], (float)bc[n14], (float)bc[n15], (float)bc[n16]);
                return;
            }
            C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2]);
            C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], bp[0], bp[2], bp[3]);
            return;
        }
        if (n6 == 1) {
            n5 = bC[this.al[n]];
            if (rs.p_f.C_a.av) {
                C_E_uc.a(n7, n20, n21, n10, n9, n8, n5, -1.0f, -1.0f, -1.0f);
                C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], n5, (float)bc[n14], (float)bc[n15], (float)bc[n16]);
                return;
            }
            C_E_uc.a(n7, n20, n21, n10, n9, n8, n5);
            C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], n5);
            return;
        }
        if (n6 == 2) {
            n5 = this.ao[n] >> 2;
            n4 = this.aw[n5];
            n3 = this.ax[n5];
            n2 = this.ay[n5];
            if (rs.p_f.C_a.av) {
                C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n], bc[n14], bc[n15], bc[n16]);
                C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], bp[0], bp[2], bp[3], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n], bc[n14], bc[n15], bc[n16]);
                return;
            }
            C_E_uc.a(n7, n20, n21, n10, n9, n8, bp[0], bp[1], bp[2], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n]);
            C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], bp[0], bp[2], bp[3], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n]);
            return;
        }
        if (n6 != 3) return;
        n5 = this.ao[n] >> 2;
        n4 = this.aw[n5];
        n3 = this.ax[n5];
        n2 = this.ay[n5];
        if (rs.p_f.C_a.av) {
            C_E_uc.a(n7, n20, n21, n10, n9, n8, this.al[n], this.al[n], this.al[n], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n], bc[n14], bc[n15], bc[n16]);
            C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], this.al[n], this.al[n], this.al[n], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n], bc[n14], bc[n15], bc[n16]);
            return;
        }
        C_E_uc.a(n7, n20, n21, n10, n9, n8, this.al[n], this.al[n], this.al[n], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n]);
        C_E_uc.a(n7, n21, bo[3], n10, n8, bn[3], this.al[n], this.al[n], this.al[n], bd[n4], bd[n3], bd[n2], be[n4], be[n3], be[n2], bf[n4], bf[n3], bf[n2], this.ar[n]);
    }

    private final boolean b(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n2 < n3 && n2 < n4 && n2 < n5) {
            return false;
        }
        if (n2 > n3 && n2 > n4 && n2 > n5) {
            return false;
        }
        if (n < n6 && n < n7 && n < n8) {
            return false;
        }
        return n <= n6 || n <= n7 || n <= n8;
    }

    public void m(int n) {
        this.P = n;
    }

    public int r() {
        return this.P;
    }

    public void n(int n) {
        this.Q = n;
    }

    public void o(int n) {
        this.R = n;
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

    public static void e(boolean bl) {
        bE = bl;
    }

    public int x() {
        return this.bI;
    }

    public HashMap<Integer, rs.p_runelite.p_a.C_a> y() {
        return this.bH;
    }

    public rs.p_runelite.p_a.C_a p(int n) {
        this.l(n);
        this.bI = n;
        return this.y().get(this.bI);
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

    static {
        s = new int[256];
        t = new int[256];
        u = new int[256];
        v = "Cla";
        w = "at Cl";
        x = "nt";
        y = v + "n Ch" + w + "ie" + x + " ";
        H = -1;
        bP = -192;
        ac = new C_h(true);
        bQ = new int[2000];
        bR = new byte[2000];
        bS = new int[2000];
        bT = new int[2000];
        bU = new int[2000];
        bV = new int[2000];
        aR = new b();
        aS = new b();
        aT = new b();
        aV = 3;
        aX = new boolean[8192];
        aY = new boolean[8192];
        aZ = new int[8192];
        ba = new int[8192];
        bb = new int[8192];
        bc = new int[8192];
        bd = new int[8192];
        be = new int[8192];
        bf = new int[8192];
        bg = new int[8192];
        bh = new int[8192][512];
        bi = new int[12];
        bj = new int[12][2000];
        bk = new int[2000];
        bl = new int[2000];
        bm = new int[12];
        bn = new int[10];
        bo = new int[10];
        bp = new int[10];
        bx = new int[1000];
        by = new int[1000];
        bz = new int[1000];
        bA = C_E_uc.v;
        bB = C_E_uc.w;
        bC = C_E_uc.B;
        bD = C_E_uc.u;
    }
}

