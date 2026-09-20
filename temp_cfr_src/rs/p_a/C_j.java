/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import rs.C_Client_mc;
import rs.p_a.C_c;
import rs.p_a.C_h;
import rs.p_a.C_k;
import rs.p_d.C_d;
import rs.p_d.C_x;
import rs.p_l.C_F_uc;
import rs.p_l.p_b.C_a;

public final class C_j
extends C_c {
    public boolean av;
    public int aw;
    public int ax;
    public int ay;
    public short az;
    public int aA = 0;
    public int aB = -1;
    public int aC = 0;
    public int aD = 7;
    public int aE = 7;
    public int aF = -1;
    public C_d aG;
    public boolean aH;

    public C_h m() {
        if (this.F >= 0 && this.I == 0) {
            if (this.d()[this.F].b()) {
                int n = this.G;
                int n2 = -1;
                if (this.w >= 0 && this.w != this.t) {
                    n2 = this.d()[this.w].b() ? this.x : this.d()[this.w].e[this.x];
                    return this.aG.a(n2, n, this.d()[this.F].i, this.F, this.w);
                }
                return this.aG.a(-1, n, this.d()[this.F].i, this.F, this.w);
            }
            int n = this.d()[this.F].e[this.G];
            int n3 = -1;
            if (this.w >= 0 && this.w != this.t) {
                n3 = this.d()[this.w].e[this.x];
            }
            return this.aG.a(n3, n, this.d()[this.F].i, this.F, this.w);
        }
        int n = -1;
        if (this.w >= 0) {
            n = this.d()[this.w].b() ? this.x : this.d()[this.w].e[this.x];
        }
        return this.aG.a(-1, n, null, this.w);
    }

    public int n() {
        return this.aG == null ? -1 : (int)this.aG.x;
    }

    public String o() {
        return this.aG == null ? "null" : this.aG.o;
    }

    public int p() {
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public C_h c() {
        C_h c_h;
        if (this.aG == null) {
            return null;
        }
        if (this.aG.x == 1337L) {
            if (this.m < 0) {
                return null;
            }
            if (this.m >= 32768) {
                int n = this.m - 32768;
                C_k c_k = C_Client_mc.kw_do[n];
                if (n == C_Client_mc.di) {
                    C_h c_h2;
                    C_k.aJ = true;
                    try {
                        c_h2 = C_Client_mc.eR.c();
                        c_h2.b(90, 90, 90);
                    }
                    finally {
                        C_k.aJ = false;
                    }
                    return c_h2;
                }
                if (c_k != null) {
                    C_h c_h3;
                    boolean bl = false;
                    if (c_k.aU) {
                        bl = true;
                        c_k.aU = false;
                    }
                    C_k.aJ = true;
                    try {
                        c_h3 = c_k.c();
                        c_h3.b(90, 90, 90);
                    }
                    finally {
                        C_k.aJ = false;
                    }
                    if (bl) {
                        c_k.aU = true;
                    }
                    return c_h3;
                }
                return null;
            }
        }
        if (this.aG.x == 1336L || this.aG.x == 1335L || this.aG.x == 1334L || this.aG.x == 8210L) {
            if (this.m < 0) {
                return null;
            }
            if (this.m >= 32768) {
                int n = this.m - 32768;
                C_k c_k = C_Client_mc.kw_do[n];
                if (n == C_Client_mc.di) {
                    C_h c_h4;
                    boolean bl = rs.p_f.C_a.N;
                    if (!rs.p_f.C_a.N) {
                        rs.p_f.C_a.N = true;
                    }
                    C_k.aJ = true;
                    try {
                        c_h4 = C_Client_mc.eR.c();
                    }
                    finally {
                        C_k.aJ = false;
                    }
                    rs.p_f.C_a.N = bl;
                    return c_h4;
                }
                if (c_k != null) {
                    C_h c_h5;
                    boolean bl = false;
                    if (c_k.aU) {
                        bl = true;
                        c_k.aU = false;
                    }
                    C_k.aJ = true;
                    try {
                        c_h5 = c_k.c();
                    }
                    finally {
                        C_k.aJ = false;
                    }
                    if (bl) {
                        c_k.aU = true;
                    }
                    return c_h5;
                }
                return null;
            }
        }
        if ((c_h = this.m()) == null) {
            return null;
        }
        this.r = c_h.g;
        if (this.z != -1 && this.A != -1) {
            C_x c_x = C_x.c[this.z];
            C_h c_h6 = null;
            c_h6 = c_x.g != null && c_x.g.b() ? c_x.c(this.A) : c_x.a();
            if (c_h6 != null) {
                C_h c_h7 = null;
                if (!c_x.g.b()) {
                    int n = c_x.g.e[this.A];
                    c_h7 = new C_h(true, rs.C_k.g(n), false, c_h6);
                    c_h7.a(0, -this.D, 0);
                    c_h7.n();
                    c_h7.f(n, c_x.g.r);
                } else {
                    c_h7 = c_h6;
                    c_h7.a(0, -this.D, 0);
                }
                c_h7.aM = null;
                c_h7.aL = null;
                if (c_x.j != 128 || c_x.k != 128) {
                    c_h7.b(c_x.j, c_x.j, c_x.k);
                }
                c_h7.b(64 + c_x.m, 850 + c_x.n, -30, -50, -30, true);
                C_h[] c_hArray = new C_h[]{c_h, c_h7};
                c_h = new C_h(c_hArray);
                c_h.f();
            }
        }
        c_h.aN = this.aG.r == 1;
        if (this.aG.aa > -1) {
            this.ar = (byte)this.aG.aa;
            this.ap = (byte)this.aG.ac;
            this.aq = (byte)this.aG.ad;
            this.ao = (byte)this.aG.ab;
        }
        if (this.ar > 0) {
            c_h.S = this.ar;
            c_h.T = this.ap;
            c_h.U = this.aq;
            c_h.V = this.ar;
        } else {
            c_h.V = 0;
        }
        return c_h;
    }

    public boolean q() {
        return this.aH && this.m - 32768 != C_Client_mc.di;
    }

    @Override
    public boolean l() {
        return this.aG != null;
    }

    public void a(C_F_uc c_F_uc, int n, int n2) {
        if (!C_a.a()) {
            if (this.aB == 0) {
                this.aA += this.aD;
                if (this.aA >= 225) {
                    this.aB = 1;
                }
            } else if (this.aB == 1) {
                this.aA -= this.aE;
                if (this.aA <= 0) {
                    this.aA = 0;
                    --this.aC;
                    if (this.aC <= 0) {
                        this.aB = -1;
                        this.aC = 0;
                    } else {
                        this.aB = 0;
                    }
                }
            }
        }
        c_F_uc.g(n, n2, this.aA);
    }
}

