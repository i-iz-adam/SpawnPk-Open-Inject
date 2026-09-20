/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import rs.C_Client_mc;
import rs.C_F_uc;
import rs.C_a;
import rs.p_a.C_c;
import rs.p_a.C_h;
import rs.p_d.C_j;
import rs.p_d.C_x;
import rs.p_l.p_b.p_a.C_d;
import rs.p_n.p_c.C_w;
import rs.p_x.C_e;

public final class C_k
extends C_c {
    public static C_k av = new rs.p_l.p_b.p_a.p_a.C_d().n();
    public static int aw = 0;
    public static int ax = 0;
    public int ay;
    public long az;
    public int aA;
    public static C_h aB = null;
    private boolean bA = false;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public static boolean aJ = false;
    public static boolean aK = false;
    public static C_F_uc aL = new C_F_uc(260);
    public static C_F_uc aM = new C_F_uc(260);
    public static C_F_uc aN = new C_F_uc(260);
    public static C_F_uc aO = new C_F_uc(260);
    public static C_F_uc aP = new C_F_uc(25);
    public static C_F_uc aQ = new C_F_uc(25);
    public boolean aR;
    public int[] aS;
    private long bB = -1L;
    public rs.p_d.C_d aT;
    public boolean aU = false;
    public final int[] aV;
    public final int[] aW = new int[28];
    public int aX;
    public int aY;
    public String aZ;
    public String ba;
    public int bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public boolean bm = false;
    public int bn;
    public int bo;
    public int bp;
    public C_h bq;
    public final int[] br;
    public int bs;
    private long bC;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public long bz;

    public C_h b(boolean bl) {
        boolean bl2;
        Object object;
        if (!this.bm) {
            return null;
        }
        if (this.q() && !rs.p_f.C_a.N) {
            return null;
        }
        if (this.aC == 25 && !rs.p_f.C_a.bp && this.m == -1) {
            return null;
        }
        C_h c_h = null;
        c_h = this.c(bl);
        if (c_h == null) {
            return null;
        }
        C_h c_h2 = null;
        if (this.z != -1 && this.A != -1 && bl) {
            object = C_x.c[this.z];
            c_h2 = ((C_x)object).g != null && ((C_x)object).g.b() ? ((C_x)object).c(this.A) : ((C_x)object).a();
            boolean bl3 = bl2 = this.z >= 1181 && this.z <= 1183;
            if (this.z == 769 && this.A <= 12) {
                bl2 = true;
            }
            if (c_h2 != null && bl2) {
                C_h c_h3 = null;
                if (!((C_x)object).g.b()) {
                    c_h3 = new C_h(true, rs.C_k.g(this.A), false, c_h2);
                    c_h3.a(0, -this.D, 0);
                    c_h3.n();
                    c_h3.f(((C_x)object).g.e[this.A], ((C_x)object).g.r);
                }
                c_h3.aM = null;
                c_h3.aL = null;
                if (((C_x)object).j != 128 || ((C_x)object).k != 128) {
                    c_h3.b(((C_x)object).j, ((C_x)object).j, ((C_x)object).k);
                }
                c_h3.b(64 + ((C_x)object).m, 850 + ((C_x)object).n, -30, -50, -30, true);
                return c_h3;
            }
        }
        this.r = c_h.g;
        c_h.aN = true;
        if (this.aU) {
            return c_h;
        }
        if (c_h2 != null) {
            object = C_x.c[this.z];
            bl2 = false;
            rs.p_a.p_a.C_a c_a = C_h.h;
            C_h c_h4 = null;
            if (!((C_x)object).g.b()) {
                if (C_k.u() && (c_a = (rs.p_a.p_a.C_a)C_x.q.a(this.z)) == null) {
                    c_a = new rs.p_a.p_a.C_a(true);
                    c_a.e();
                    bl2 = true;
                }
                c_h4 = new C_h(true, rs.C_k.g(this.A), false, c_h2, c_a);
                c_h4.i = c_a;
                c_h4.a(0, -this.D, 0);
                c_h4.n();
                c_h4.f(((C_x)object).g.e[this.A], ((C_x)object).g.r);
            } else {
                c_h4 = c_h2;
                c_h4.a(0, -this.D, 0);
            }
            c_h4.aM = null;
            c_h4.aL = null;
            if (((C_x)object).j != 128 || ((C_x)object).k != 128) {
                c_h4.b(((C_x)object).j, ((C_x)object).j, ((C_x)object).k);
            }
            c_h4.b(64 + ((C_x)object).m, 850 + ((C_x)object).n, -30, -50, -30, true);
            if (bl2) {
                C_x.q.a(c_a, this.z);
            }
            C_h[] c_hArray = new C_h[]{c_h, c_h4};
            long l = this.bC + (long)(1000000 + this.z);
            c_a = C_h.h;
            bl2 = false;
            c_h = new C_h(c_hArray, c_a);
            c_h.i = c_a;
            c_h.f();
        }
        if (this.bq != null) {
            if (C_Client_mc.ff >= this.bk) {
                this.bq = null;
            }
            if (C_Client_mc.ff >= this.bj && C_Client_mc.ff < this.bk) {
                object = this.bq;
                ((C_h)object).a(this.bn - this.ac, this.bo - this.bl, this.bp - this.ad);
                if (bl) {
                    if (this.s == 512) {
                        ((C_h)object).o();
                        ((C_h)object).o();
                        ((C_h)object).o();
                    } else if (this.s == 1024) {
                        ((C_h)object).o();
                        ((C_h)object).o();
                    } else if (this.s == 1536) {
                        ((C_h)object).o();
                    }
                }
                C_h[] c_hArray = new C_h[]{c_h, object};
                c_h = new C_h(c_hArray);
                if (bl) {
                    if (this.s == 512) {
                        ((C_h)object).o();
                    } else if (this.s == 1024) {
                        ((C_h)object).o();
                        ((C_h)object).o();
                    } else if (this.s == 1536) {
                        ((C_h)object).o();
                        ((C_h)object).o();
                        ((C_h)object).o();
                    }
                }
                ((C_h)object).a(this.ac - this.bn, this.bl - this.bo, this.ad - this.bp);
            }
        }
        if (this.ar > 0) {
            c_h.S = this.ar;
            c_h.T = this.ap;
            c_h.U = this.aq;
            c_h.V = this.ar;
        } else {
            c_h.V = 0;
        }
        c_h.aN = true;
        return c_h;
    }

    @Override
    public C_h c() {
        return this.b(true);
    }

    public static C_h a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        return C_k.a(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, 0);
    }

    public static C_h a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        int n15;
        int[] nArray = new int[]{n5, n12, n11, n, n14, n2, n3, n4, n9, n6, n10, n8, n7};
        int n16 = -1;
        int n17 = -1;
        C_h c_h = null;
        boolean bl = false;
        for (int i = 0; i < 13; ++i) {
            n15 = nArray[i];
            if (n15 >= 256 && n15 < 512 && !C_j.b[n15 - 256].c()) {
                bl = true;
            }
            if (n15 < 512 || rs.p_d.C_k.f(n15 - 512).a(n13)) continue;
            bl = true;
        }
        if (bl) {
            return null;
        }
        C_h[] c_hArray = new C_h[12];
        n15 = 0;
        for (int i = 0; i < 13; ++i) {
            Object object;
            int n18 = nArray[i];
            if (n17 >= 0 && i == 3) {
                n18 = n17;
            }
            if (n16 >= 0 && i == 5) {
                n18 = n16;
            }
            if (n18 >= 256 && n18 < 512) {
                object = C_j.b[n18 - 256].b();
                if (object != null) {
                    c_hArray[n15++] = object;
                } else {
                    bl = true;
                }
            }
            if (n18 < 512) continue;
            object = rs.p_d.C_k.f(n18 - 512);
            C_h c_h2 = ((rs.p_d.C_k)object).d(n13);
            if (c_h2 != null) {
                if (C_k.b(n18 - 512)) {
                    int[] nArray2 = C_w.bJ;
                    c_h2.ar = C_k.b(nArray2[4], nArray2[0], nArray2[2], nArray2[1], nArray2[3], nArray2[5]);
                }
                c_hArray[n15++] = c_h2;
                continue;
            }
            bl = true;
        }
        if (bl) {
            c_hArray = null;
            return null;
        }
        c_h = new C_h(n15, c_hArray);
        return c_h;
    }

    public static boolean b(int n) {
        return n == 23063 || n == 21963 || n == 21964;
    }

    public void a(C_e c_e) {
        int n;
        int n2;
        int n3;
        int n4;
        c_e.h = 0;
        this.aY = c_e.y();
        this.bd = c_e.y();
        this.bf = c_e.y();
        this.bg = c_e.y();
        this.bh = c_e.y();
        this.aC = c_e.B();
        if (rs.p_f.C_a.d.booleanValue()) {
            C_Client_mc.cx.add("\t\t---> gender=" + this.aY + ",headIcon=" + this.bd + ",skullIcon=" + this.bf + ",orbIcon=" + this.bg + ",miscIcon=" + this.bh + ",privilege=" + this.aC);
        }
        this.aT = null;
        this.aX = 0;
        for (n4 = 0; n4 < 12; ++n4) {
            n3 = c_e.y();
            if (n3 == 0) {
                this.br[n4] = 0;
                continue;
            }
            n2 = c_e.y();
            this.br[n4] = (n3 << 8) + n2;
            if (n4 == 0 && this.br[0] == 65535) {
                this.ay = c_e.A();
                this.aT = rs.p_d.C_d.c(this.ay);
                break;
            }
            if (this.br[n4] < 512 || this.br[n4] - 512 >= rs.p_d.C_k.ad || (n = rs.p_d.C_k.f((int)(this.br[n4] - 512)).ac) == 0) continue;
            this.aX = n;
        }
        this.bs = (n4 = c_e.y()) == 1 ? c_e.A() : -1;
        if (rs.p_f.C_a.d.booleanValue()) {
            C_Client_mc.cx.add("\t\t---> cosmetic=" + n4);
        }
        for (n3 = 0; n3 < 5; ++n3) {
            n2 = c_e.y();
            if (n2 < 0 || n2 >= C_Client_mc.dU[n3].length) {
                n2 = 0;
            }
            this.aV[n3] = n2;
        }
        n3 = -1;
        if (this.br != null && this.br.length > 3) {
            n3 = this.br[3] - 512;
        }
        this.t = c_e.A();
        if (this.t == 65535) {
            this.t = -1;
        }
        if (rs.p_f.C_a.aj && this.t == 7047) {
            this.t = 7053;
        }
        if (!rs.p_f.C_a.aj && this.t == 7518) {
            this.t = 1662;
        }
        if (!(rs.p_f.C_a.aj || this.t != 808 || n3 != 4151 && n3 != 25000 && n3 != 20523 && n3 != 20689)) {
            this.t = 11973;
        }
        this.u = c_e.A();
        if (this.u == 65535) {
            this.u = -1;
        }
        if (rs.p_f.C_a.aj && this.u == 7044) {
            this.u = 7044;
        }
        this.ag = c_e.A();
        if (this.ag == 65535) {
            this.ag = -1;
        }
        if (rs.p_f.C_a.aj && this.ag == 7046) {
            this.ag = 7052;
        }
        if (!rs.p_f.C_a.aj && this.ag == 7520) {
            this.ag = 1663;
        }
        if (!rs.p_f.C_a.aj && this.ag == 1422) {
            this.ag = 819;
        }
        this.ah = c_e.A();
        if (this.ah == 65535) {
            this.ah = -1;
        }
        this.ai = c_e.A();
        if (this.ai == 65535) {
            this.ai = -1;
        }
        this.aj = c_e.A();
        if (this.aj == 65535) {
            this.aj = -1;
        }
        this.p = c_e.A();
        if (this.p == 65535) {
            this.p = -1;
        }
        if (rs.p_f.C_a.aj && this.p == 7039) {
            this.p = 7043;
        }
        if (!rs.p_f.C_a.aj && this.p == 7519) {
            this.p = 1664;
        }
        if (!rs.p_f.C_a.aj && this.p == 15523) {
            this.p = 1210;
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
        this.bb = c_e.y();
        if (this.bb != 0) {
            this.ba = c_e.F();
        }
        this.aZ = c_e.F();
        if (rs.p_f.C_a.d.booleanValue()) {
            C_Client_mc.cx.add("\t\t---> name=" + this.aZ);
        }
        this.bc = c_e.y();
        this.by = c_e.A();
        if (this.by > 0) {
            this.bz = System.currentTimeMillis();
        }
        this.ar = (byte)c_e.y();
        if (this.ar > 0) {
            this.ao = (byte)c_e.y();
            this.ap = (byte)c_e.y();
            this.aq = (byte)c_e.y();
        }
        int n5 = n2 = c_e.y() == 1 ? 1 : 0;
        if (rs.p_f.C_a.d.booleanValue()) {
            C_Client_mc.cx.add("\t\t---> hasCompColors=" + (n2 != 0));
        }
        if (n2 != 0) {
            n = C_w.a(c_e.y(), true);
            int n6 = C_w.a(c_e.y(), true);
            int n7 = C_w.a(c_e.y(), true);
            int n8 = C_w.a(c_e.y(), true);
            int n9 = C_w.a(c_e.y(), true);
            int n10 = C_w.a(c_e.y(), false);
            if (rs.p_f.C_a.d.booleanValue()) {
                C_Client_mc.cx.add("\t\t---> compColors=" + n + "," + n6 + "," + n7 + "," + n8 + "," + n9 + "," + n10);
            }
            this.a(n, n6, n7, n8, n9, n10);
        }
        this.bm = true;
        this.bC = 0L;
        for (n = 0; n < 12; ++n) {
            this.bC <<= 4;
            if (this.br[n] < 256) continue;
            if (n == 1 && C_k.b(this.br[n] - 512)) {
                this.bC += (long)(50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI);
                continue;
            }
            this.bC += (long)(this.br[n] - 256);
        }
        if (this.bs > 0) {
            this.bC += (long)(this.bs - 256);
        }
        if (this.br[0] >= 256) {
            this.bC += (long)(this.br[0] - 256 >> 4);
        }
        if (this.br[1] >= 256) {
            if (C_k.b(this.br[1] - 512)) {
                n = 50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI;
                this.bC += (long)(n - 256 >> 8);
            } else {
                this.bC += (long)(this.br[1] - 256 >> 8);
            }
        }
        this.aR = false;
        if (this.br[1] - 512 == 19000 || this.br[1] - 512 == 3789 || this.br[1] - 512 == 23490 || this.br[1] - 512 == 23465 || this.br[1] - 512 == 22123 || this.br[1] - 512 == 22122 || this.br[1] - 512 == 21634 || this.br[1] - 512 == 21633 || this.br[1] - 512 >= 24151 && this.br[1] - 512 <= 24146) {
            this.aR = true;
        }
        for (n = 0; n < 5; ++n) {
            this.bC <<= 3;
            this.bC += (long)this.aV[n];
        }
        this.bC <<= 1;
        this.bC += (long)this.aY;
    }

    public rs.p_d.C_a c(int n) {
        if (n < 0) {
            return null;
        }
        rs.p_d.C_a c_a = rs.p_d.C_a.a[n];
        if (this.F > 0 && c_a != null) {
            boolean bl;
            rs.p_d.C_a c_a2 = rs.p_d.C_a.a[this.F];
            boolean bl2 = bl = !rs.p_f.C_a.aj;
            if (bl && c_a2 != null && c_a2.w && !c_a.w && rs.p_d.C_a.c[n] != null) {
                return rs.p_d.C_a.c[n];
            }
        }
        return c_a;
    }

    public C_h m() {
        return this.c(true);
    }

    public C_h c(boolean bl) {
        int n;
        boolean bl2;
        Object object;
        int n2;
        int n3;
        int n4 = this.p();
        if (!bl) {
            n4 = 808;
        }
        if (this.F == 7533 && !rs.p_f.C_a.aj) {
            n4 = 808;
        }
        if (this.F == 451) {
            this.F = !rs.p_f.C_a.aj ? 13039 : 390;
        }
        if (this.F == 426 && rs.p_f.C_a.aj) {
            this.F = 15409;
        }
        if (this.F == 10961 && rs.p_f.C_a.aj) {
            this.F = 7514;
        }
        if (this.F == 7516 && !rs.p_f.C_a.aj) {
            this.F = 13055;
        }
        if (this.F == 7517 && !rs.p_f.C_a.aj) {
            this.F = 13054;
        }
        if (this.F == 2067 && !rs.p_f.C_a.aj) {
            this.F = 2066;
        }
        if ((this.F == 6381 || this.F == 7074) && rs.p_f.C_a.aj) {
            this.F = 7061;
        }
        if (this.F == 7042 && rs.p_f.C_a.aj) {
            this.F = 7055;
        }
        if (this.F == 7049 && rs.p_f.C_a.aj) {
            this.F = 7045;
        }
        if (this.F == 7041 && rs.p_f.C_a.aj) {
            this.F = 7054;
        }
        if (this.F == 7048 && rs.p_f.C_a.aj) {
            this.F = 7045;
        }
        if (this.F == 13051 && rs.p_f.C_a.aj) {
            this.F = 7056;
        }
        if (this.F == 8145 && !rs.p_f.C_a.aj) {
            this.F = 13049;
        }
        rs.p_d.C_a c_a = this.c(n4);
        if (bl) {
            if (this.x < 0) {
                this.x = 0;
            }
            if (c_a != null && !c_a.b() && this.x >= c_a.e.length) {
                this.x = c_a.e.length - 1;
            }
        }
        if ((n3 = this.x) < 0) {
            n3 = 0;
        }
        if (c_a != null && n3 >= c_a.e.length) {
            n3 = c_a.e.length - 1;
        }
        if (this.aT != null) {
            int n5 = -1;
            if (this.F >= 0 && this.I == 0) {
                n5 = rs.p_d.C_a.a[this.F].b() ? this.G : rs.p_d.C_a.a[this.F].e[this.G];
            } else if (n4 >= 0) {
                n5 = rs.p_d.C_a.a[n4].b() ? n3 : rs.p_d.C_a.a[n4].e[n3];
            }
            return this.aT.a(-1, n5, null, this.F >= 0 && this.I == 0 ? this.F : n4);
        }
        long l = this.bC;
        int n6 = -1;
        int n7 = -1;
        int n8 = -1;
        int n9 = -1;
        int n10 = n2 = rs.p_f.C_a.bb ? this.bs : 0;
        if (this.F >= 0 && this.I == 0 && bl) {
            object = rs.p_d.C_a.a[this.F];
            n6 = ((rs.p_d.C_a)object).e[this.G];
            if (c_a != null && n4 != this.t) {
                n7 = c_a.e[n3];
            }
            if (((rs.p_d.C_a)object).l >= 0) {
                n8 = ((rs.p_d.C_a)object).l;
                l += (long)(n8 - this.br[5] << 40);
            }
            if (((rs.p_d.C_a)object).m >= 0) {
                n9 = ((rs.p_d.C_a)object).m;
                l += (long)(n9 - this.br[3] << 48);
            } else if (this.br[3] == 28560) {
                n9 = 28561;
                l += (long)(n9 - this.br[3] << 48);
            }
        } else {
            if (c_a != null) {
                n6 = c_a.e[n3];
            }
            if (n4 != this.t && this.br[3] == 28560) {
                n9 = 28561;
                l += (long)(n9 - this.br[3] << 48);
            }
        }
        object = null;
        object = (C_h)C_k.r().a(l);
        int n11 = 512;
        if (object == null || this.i) {
            bl2 = false;
            for (n = 0; n < 12; ++n) {
                int n12 = this.br[n];
                if (n9 >= 0 && n == 3) {
                    n12 = n9;
                }
                if (n8 >= 0 && n == 5) {
                    n12 = n8;
                }
                if (n12 >= 256 && n12 < 512 && !C_j.b[n12 - 256].a()) {
                    bl2 = true;
                }
                if (n12 < 512 || rs.p_d.C_k.f(n12 - 512).c(this.aY)) continue;
                bl2 = true;
            }
            if (n2 > 0 && !rs.p_d.C_k.f(n2).c(this.aY)) {
                bl2 = true;
            }
            if (n2 == 28760 && !rs.p_d.C_k.f(28758).c(this.aY)) {
                bl2 = true;
            }
            if (bl2) {
                if (this.bB != -1L) {
                    object = (C_h)C_k.r().a(this.bB);
                }
                if (object == null) {
                    return null;
                }
            }
        }
        if (object == null || this.i) {
            int n13;
            if (!rs.p_f.C_a.J) {
                return null;
            }
            bl2 = this.i;
            n = 0;
            C_h[] c_hArray = new C_h[n2 > 0 ? 14 : 12];
            int n14 = 0;
            C_h.bF = false;
            C_h.e(true);
            for (int i = 0; i < 12; ++i) {
                Object object2;
                int n15;
                int n16;
                Object object3;
                C_h c_h;
                n13 = this.br[i];
                if (n9 >= 0 && i == 3) {
                    n13 = n9;
                }
                if (n8 >= 0 && i == 5) {
                    n13 = n8;
                }
                if (n13 >= 256 && n13 < 512) {
                    C_h.bG = i;
                    c_h = C_j.b[n13 - 256].b();
                    if (c_h != null) {
                        if (C_Client_mc.dU[4][this.aV[4]] == 10 || C_Client_mc.dU[4][this.aV[4]] == 491769) {
                            c_h.b(new int[]{4550}, -50);
                        } else {
                            object3 = C_Client_mc.dV;
                            n16 = ((Object)object3).length;
                            for (n15 = 0; n15 < n16; ++n15) {
                                object2 = object3[n15];
                                if (C_Client_mc.dU[4][this.aV[4]] != object2[0]) continue;
                                c_h.e(4550, (int)object2[1]);
                            }
                        }
                        c_hArray[n14++] = c_h;
                    }
                }
                if (n13 >= 512) {
                    C_h.bG = i;
                    c_h = rs.p_d.C_k.f(n13 - 512).d(this.aY);
                    if (c_h != null) {
                        if (!(i != 0 && i != 4 && i != 7 && i != 9 && i != 10 || rs.p_d.C_k.a(null, n13 - 512))) {
                            if (C_Client_mc.dU[4][this.aV[4]] == 10 || C_Client_mc.dU[4][this.aV[4]] == 491769) {
                                c_h.b(new int[]{4550}, -50);
                            } else {
                                object3 = C_Client_mc.dV;
                                n16 = ((Object)object3).length;
                                for (n15 = 0; n15 < n16; ++n15) {
                                    object2 = object3[n15];
                                    if (C_Client_mc.dU[4][this.aV[4]] != object2[0]) continue;
                                    c_h.e(4550, (int)object2[1]);
                                }
                            }
                        }
                        if (C_k.b(n13 - 512)) {
                            bl2 = true;
                            c_h.ar = this.aS;
                            c_h.I = this.aI;
                        }
                        c_hArray[n14++] = c_h;
                    }
                }
                if (i != 1 || n2 <= 0) continue;
                C_h.bG = i;
                c_h = rs.p_d.C_k.f(n2).d(this.aY);
                if (c_h != null) {
                    c_hArray[n14++] = c_h;
                }
                if (n2 != 28760 || (object3 = rs.p_d.C_k.f(28758).d(this.aY)) == null) continue;
                c_hArray[n14++] = object3;
            }
            rs.p_a.p_a.C_a c_a2 = C_h.h;
            n13 = 0;
            C_h.bG = -1;
            C_h.e(false);
            object = new C_h(n14, c_hArray, c_a2);
            for (int i = 0; i < 5; ++i) {
                if (this.aV[i] == 0) continue;
                ((C_h)object).i(C_Client_mc.dU[i][0], C_Client_mc.dU[i][this.aV[i]]);
                if (i == 4) {
                    ((C_h)object).i(C_Client_mc.aZ[0], C_Client_mc.dU[i][this.aV[i]]);
                }
                if (i != 1) continue;
                ((C_h)object).i(C_Client_mc.fz[0], C_Client_mc.fz[this.aV[i]]);
            }
            ((C_h)object).n();
            if (rs.p_f.C_a.aQ) {
                ((C_h)object).b(84, 1000, -90, -580, -90, true);
            } else {
                ((C_h)object).b(64, 850, -30, -50, -30, true);
            }
            if (!C_d.c) {
                C_k.r().a((C_a)object, l);
            }
            this.bB = l;
        }
        if (this.aU || aK) {
            return object;
        }
        C_h c_h = C_h.ac;
        c_h.a((C_h)object, rs.C_k.g(n6) & rs.C_k.g(n7));
        if (n6 != -1 && n7 != -1 && bl) {
            c_h.a(rs.p_d.C_a.a[this.F].i, n7, n6, this.F);
        } else if (n6 != -1) {
            c_h.f(n6, this.F >= 0 && this.I == 0 && bl ? this.F : n4);
        }
        c_h.k();
        c_h.aM = null;
        c_h.aL = null;
        return c_h;
    }

    @Override
    public boolean l() {
        return this.bm;
    }

    public C_h n() {
        int n;
        int n2;
        if (!this.bm) {
            return null;
        }
        if (this.q() && !rs.p_f.C_a.N) {
            return null;
        }
        if (this.aT != null) {
            return this.aT.b();
        }
        boolean bl = false;
        for (int i = 0; i < 12; ++i) {
            n2 = this.br[i];
            if (n2 >= 256 && n2 < 512 && !C_j.b[n2 - 256].c()) {
                bl = true;
            }
            if (n2 < 512 || rs.p_d.C_k.f(n2 - 512).a(this.aY)) continue;
            bl = true;
        }
        if (this.bs > 0 && !rs.p_d.C_k.f(this.bs).a(this.aY)) {
            bl = true;
        }
        if (bl) {
            return null;
        }
        C_h[] c_hArray = new C_h[this.bs > 0 ? 13 : 12];
        n2 = 0;
        for (int i = 0; i < 12; ++i) {
            C_h c_h;
            n = this.br[i];
            if (n >= 256 && n < 512 && (c_h = C_j.b[n - 256].d()) != null) {
                for (int[] nArray : C_Client_mc.dV) {
                    if (C_Client_mc.dU[4][this.aV[4]] == 10 || C_Client_mc.dU[4][this.aV[4]] == 491769) {
                        c_h.b(new int[]{4550}, -50);
                        continue;
                    }
                    if (C_Client_mc.dU[4][this.aV[4]] != nArray[0]) continue;
                    c_h.e(4550, nArray[1]);
                }
                c_hArray[n2++] = c_h;
            }
            if (n >= 512 && (c_h = rs.p_d.C_k.f(n - 512).b(this.aY)) != null) {
                c_hArray[n2++] = c_h;
            }
            if (i != 1 || this.bs <= 0 || (c_h = rs.p_d.C_k.f(this.bs).b(this.aY)) == null) continue;
            c_hArray[n2++] = c_h;
        }
        C_h c_h = new C_h(n2, c_hArray);
        for (n = 0; n < 5; ++n) {
            if (this.aV[n] == 0) continue;
            c_h.i(C_Client_mc.dU[n][0], C_Client_mc.dU[n][this.aV[n]]);
            if (n != 1) continue;
            c_h.i(C_Client_mc.fz[0], C_Client_mc.fz[this.aV[n]]);
        }
        return c_h;
    }

    public C_k() {
        this.aV = new int[5];
        this.br = new int[12];
    }

    public String o() {
        return this.d(false);
    }

    public String d(boolean bl) {
        return this.a(bl, null);
    }

    public String a(boolean bl, String string) {
        String string2;
        String string3 = this.aZ;
        String string4 = string2 = bl ? "@bla@" : "@whi@";
        if (this.bb > 0) {
            if (this.bb == 1) {
                return "@red@" + this.ba + (string == null ? string2 : string) + " " + string3;
            }
            if (string != null) {
                return string + string3 + " @red@" + this.ba + string2;
            }
            return string3 + " @red@" + this.ba + string2;
        }
        return string != null ? string + this.aZ : this.aZ;
    }

    public String a(boolean bl, String string, String string2) {
        Object object;
        String string3 = this.aZ;
        Object object2 = object = bl ? "@bla@" : "@whi@";
        if (this.bb > 0) {
            if (string2 != null) {
                object = (String)object + string2;
            }
            if (this.bb == 1) {
                return "@red@" + this.ba + (String)object + " " + string3;
            }
            return string3 + " @red@" + this.ba + (String)object;
        }
        return string2 != null ? string2 + this.aZ : this.aZ;
    }

    public int p() {
        int n = this.w;
        int n2 = -1;
        if (this.br != null && this.br.length > 3) {
            n2 = this.br[3] - 512;
        }
        if (!(n != 244 || n2 != 21584 && n2 != 21585 && n2 != 21602 && n2 != 23908 && n2 != 24250 && n2 != 25555 && n2 != 25556 && n2 != 28187 || rs.p_f.C_a.aj)) {
            n = 808;
        }
        if (!(n != 247 || n2 != 21584 && n2 != 21585 && n2 != 21602 && n2 != 23908 && n2 != 24250 && n2 != 25555 && n2 != 25556 && n2 != 28187 || rs.p_f.C_a.aj)) {
            n = 819;
        }
        if (n == 7220 && !rs.p_f.C_a.aj) {
            n = 2074;
        }
        if (n == 7221 && !rs.p_f.C_a.aj) {
            n = 2077;
        }
        if (n == 7223 && !rs.p_f.C_a.aj) {
            n = 2076;
        }
        if (!(n != 7518 && n != 15512 || rs.p_f.C_a.aj)) {
            n = 1662;
        }
        if (!(n != 7520 && n != 15513 || rs.p_f.C_a.aj)) {
            n = 1663;
        }
        if (!(n != 7519 && n != 15514 || rs.p_f.C_a.aj)) {
            n = 1664;
        }
        if (!(n != 808 || n2 != 4151 && n2 != 25000 && n2 != 20523 && n2 != 20689 || rs.p_f.C_a.aj)) {
            n = 11973;
        }
        if (n == 2561 && !rs.p_f.C_a.aj) {
            n = 7047;
        }
        if (n == 824 && n2 == 4718 && !rs.p_f.C_a.aj) {
            n = 1664;
        }
        if (n == 809 && !rs.p_f.C_a.aj) {
            n = 813;
        }
        if (n == 1659 && !rs.p_f.C_a.aj) {
            n = 11974;
        }
        return n;
    }

    public boolean q() {
        if (C_Client_mc.eR != null) {
            return this == C_Client_mc.eR;
        }
        return false;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.aD = n;
        this.aE = n2;
        this.aF = n3;
        this.aG = n4;
        this.aH = n5;
        this.aI = n6;
        this.aS = new int[1206];
        for (int i = 0; i < this.aS.length; ++i) {
            this.aS[i] = n;
        }
        int[] nArray = new int[]{71, 73, 74, 75, 76, 77, 78, 84, 336, 340, 341, 364, 369, 370, 374, 375, 495, 496, 497, 498, 499, 500, 530, 531, 532, 533, 534, 548, 549, 596, 801, 802, 803, 831, 832, 833, 839, 840, 852, 853, 854, 855, 856, 857, 858, 862, 863, 865, 872, 873, 874, 875, 876, 877, 878, 879, 880, 912, 913, 914, 915, 916, 917, 918, 919, 950, 951, 952, 953, 954, 955, 956, 968, 969, 970, 971, 972, 973, 983, 986, 987, 988};
        int[] nArray2 = new int[]{46, 47, 48, 49, 50, 67, 68, 69, 70, 72, 79, 80, 81, 82, 83, 269, 270, 273, 274, 275, 276, 277, 278, 279, 280, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 307, 308, 339, 342, 357, 358, 359, 365, 366, 376, 377, 378, 379, 383, 409, 410, 423, 424, 434, 435, 436, 449, 450, 451, 454, 455, 462, 463, 464, 465, 473, 476, 477, 478, 482, 483, 484, 485, 486, 487, 488, 492, 493, 494, 501, 502, 508, 509, 510, 511, 526, 527, 528, 529, 544, 545, 546, 547, 550, 551, 561, 562, 563, 567, 568, 569, 570, 571, 572, 573, 574, 575, 597, 781, 799, 841, 842, 843, 844, 845, 846, 847, 848, 849, 882, 883, 884, 885, 896, 897, 904, 905, 908, 909, 923, 924, 925, 926, 927, 936, 940, 941, 942, 943, 957, 958, 959, 977, 982};
        int[] nArray3 = new int[]{111, 112, 166, 167, 183, 184, 217, 218, 228, 240, 241, 242, 243, 244, 253, 254, 262, 263, 287, 430, 470, 471, 589, 590, 815, 816, 817, 818, 819, 820, 859, 860, 861, 864, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 906, 907, 928, 929, 930, 931, 932, 933, 934, 935, 944, 945, 946, 947, 948, 949, 960, 961, 978, 989, 318, 319, 386, 413, 619, 620};
        int[] nArray4 = new int[]{113, 128, 129, 144, 145, 163, 164, 165, 168, 169, 170, 171, 176, 179, 180, 181, 182, 190, 191, 195, 196, 199, 200, 201, 202, 205, 206, 210, 211, 219, 220, 221, 224, 225, 229, 230, 238, 239, 249, 250, 251, 252, 255, 256, 257, 260, 264, 265, 284, 285, 286, 288, 291, 292, 293, 311, 396, 428, 429, 468, 469, 591, 628, 629, 630, 631, 632, 633, 634, 635, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 661, 662, 666, 667, 668, 669, 670, 671, 672, 673, 678, 692, 693, 702, 703, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 735, 736, 737, 738, 739, 740, 741, 743, 744, 745, 746, 749, 754, 755, 758, 759, 760, 761, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 1011, 1036, 1061};
        for (int n7 : nArray) {
            this.aS[n7] = n2;
        }
        for (int n7 : nArray2) {
            this.aS[n7] = n3;
        }
        for (int n7 : nArray3) {
            this.aS[n7] = n4;
        }
        for (int n7 : nArray4) {
            this.aS[n7] = n5;
        }
    }

    public static int[] b(int n, int n2, int n3, int n4, int n5, int n6) {
        int[] nArray = new int[1206];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = n;
        }
        int[] nArray2 = new int[]{71, 73, 74, 75, 76, 77, 78, 84, 336, 340, 341, 364, 369, 370, 374, 375, 495, 496, 497, 498, 499, 500, 530, 531, 532, 533, 534, 548, 549, 596, 801, 802, 803, 831, 832, 833, 839, 840, 852, 853, 854, 855, 856, 857, 858, 862, 863, 865, 872, 873, 874, 875, 876, 877, 878, 879, 880, 912, 913, 914, 915, 916, 917, 918, 919, 950, 951, 952, 953, 954, 955, 956, 968, 969, 970, 971, 972, 973, 983, 986, 987, 988};
        int[] nArray3 = new int[]{46, 47, 48, 49, 50, 67, 68, 69, 70, 72, 79, 80, 81, 82, 83, 269, 270, 273, 274, 275, 276, 277, 278, 279, 280, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 307, 308, 339, 342, 357, 358, 359, 365, 366, 376, 377, 378, 379, 383, 409, 410, 423, 424, 434, 435, 436, 449, 450, 451, 454, 455, 462, 463, 464, 465, 473, 476, 477, 478, 482, 483, 484, 485, 486, 487, 488, 492, 493, 494, 501, 502, 508, 509, 510, 511, 526, 527, 528, 529, 544, 545, 546, 547, 550, 551, 561, 562, 563, 567, 568, 569, 570, 571, 572, 573, 574, 575, 597, 781, 799, 841, 842, 843, 844, 845, 846, 847, 848, 849, 882, 883, 884, 885, 896, 897, 904, 905, 908, 909, 923, 924, 925, 926, 927, 936, 940, 941, 942, 943, 957, 958, 959, 977, 982};
        int[] nArray4 = new int[]{111, 112, 166, 167, 183, 184, 217, 218, 228, 240, 241, 242, 243, 244, 253, 254, 262, 263, 287, 430, 470, 471, 589, 590, 815, 816, 817, 818, 819, 820, 859, 860, 861, 864, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 906, 907, 928, 929, 930, 931, 932, 933, 934, 935, 944, 945, 946, 947, 948, 949, 960, 961, 978, 989, 318, 319, 386, 413, 619, 620};
        int[] nArray5 = new int[]{113, 128, 129, 144, 145, 163, 164, 165, 168, 169, 170, 171, 176, 179, 180, 181, 182, 190, 191, 195, 196, 199, 200, 201, 202, 205, 206, 210, 211, 219, 220, 221, 224, 225, 229, 230, 238, 239, 249, 250, 251, 252, 255, 256, 257, 260, 264, 265, 284, 285, 286, 288, 291, 292, 293, 311, 396, 428, 429, 468, 469, 591, 628, 629, 630, 631, 632, 633, 634, 635, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 661, 662, 666, 667, 668, 669, 670, 671, 672, 673, 678, 692, 693, 702, 703, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 735, 736, 737, 738, 739, 740, 741, 743, 744, 745, 746, 749, 754, 755, 758, 759, 760, 761, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 1011, 1036, 1061};
        for (int n7 : nArray2) {
            nArray[n7] = n2;
        }
        for (int n7 : nArray3) {
            nArray[n7] = n3;
        }
        for (int n7 : nArray4) {
            nArray[n7] = n4;
        }
        for (int n7 : nArray5) {
            nArray[n7] = n5;
        }
        return nArray;
    }

    public static C_F_uc r() {
        return !aJ ? aL : aO;
    }

    public static C_F_uc s() {
        return !aJ ? aM : aP;
    }

    public static C_F_uc t() {
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

