/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import rs.C_Client_mc;
import rs.p_a.C_a;
import rs.p_a.C_h;
import rs.p_d.C_r;
import rs.p_d.C_y;

public final class C_m
extends C_a {
    private int j;
    private final int[] k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private rs.p_d.C_a r;
    private int s;
    public static C_Client_mc h;
    public final int i;
    private final int t;
    private final int u;

    @Override
    public C_h c() {
        C_r c_r;
        int n = -1;
        if (this.r != null) {
            int n2 = C_Client_mc.ff - this.s;
            if (n2 > 100 && this.r.h > 0) {
                n2 = 100;
            }
            if (this.r.b()) {
                int n3 = this.r.c();
                this.j += n2;
                n2 = 0;
                if (this.j >= n3) {
                    this.j = n3 - this.r.h;
                    if (this.j < 0 || this.j > n3) {
                        this.r = null;
                    }
                }
                this.s = C_Client_mc.ff - n2;
                n = this.j;
            } else {
                while (n2 > this.r.a(this.j)) {
                    n2 -= this.r.a(this.j);
                    ++this.j;
                    if (this.j < this.r.d) continue;
                    this.j -= this.r.h;
                    if (this.j >= 0 && this.j < this.r.d) continue;
                    this.r = null;
                    break;
                }
                this.s = C_Client_mc.ff - n2;
                if (this.r != null) {
                    n = this.r.e[this.j];
                }
            }
        }
        if ((c_r = this.k != null ? this.d() : C_r.c(this.i)) == null) {
            return null;
        }
        return c_r.a(this.t, this.u, this.n, this.o, this.p, this.q, n, this.r != null ? this.r.r : -1);
    }

    private C_r d() {
        int n = -1;
        if (this.l != -1) {
            try {
                C_y c_y = C_y.a[this.l];
                int n2 = c_y.b;
                int n3 = c_y.c;
                int n4 = c_y.d;
                int n5 = C_Client_mc.fQ[n4 - n3];
                n = C_m.h.dP[n2] >> n3 & n5;
            }
            catch (Exception exception) {}
        } else if (this.m != -1 && this.m < C_m.h.dP.length) {
            n = C_m.h.dP[this.m];
        }
        int n6 = n >= 0 && n < this.k.length ? this.k[n] : this.k[this.k.length - 1];
        if (n == -1) {
            return null;
        }
        return n6 != -1 ? C_r.c(this.k[n]) : null;
    }

    public C_m(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        this(n, n2, n3, n4, n5, n6, n7, n8, bl, null);
    }

    public C_m(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl, C_a c_a) {
        this.i = n;
        this.t = n3;
        this.u = n2;
        this.n = n6;
        this.o = n4;
        this.p = n5;
        this.q = n7;
        C_r c_r = C_r.c(this.i);
        this.l = c_r.ao;
        this.m = c_r.Y;
        this.k = c_r.ad;
        if (n8 != -1) {
            this.r = rs.p_d.C_a.a[n8];
            this.j = 0;
            this.s = C_Client_mc.ff;
            if (this.r.q == 0 && c_a != null && c_a instanceof C_m) {
                C_m c_m = (C_m)c_a;
                if (c_m.r == this.r) {
                    this.j = c_m.j;
                    this.s = c_m.s;
                    return;
                }
            }
            if (bl && this.r.h != -1) {
                if (this.r.b()) {
                    this.j = (int)(Math.random() * (double)this.r.c());
                } else {
                    this.j = (int)(Math.random() * (double)this.r.d);
                    this.s -= (int)(Math.random() * (double)this.r.a(this.j));
                }
            }
        }
    }
}

