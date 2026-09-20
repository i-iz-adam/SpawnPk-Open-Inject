/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import rs.C_k;
import rs.p_a.C_a;
import rs.p_a.C_h;
import rs.p_d.C_x;

public final class C_l
extends C_a {
    public final int h;
    public final int i;
    private double q;
    private double r;
    private double s;
    private double t;
    private double u;
    private boolean v = false;
    private final int w;
    private final int x;
    private final int y;
    public final int j;
    public double k;
    public double l;
    public double m;
    private final int z;
    private final int A;
    public final int n;
    private final C_x B;
    private int C;
    private int D;
    public int o;
    private int E;
    public final int p;

    public void a(int n, int n2, int n3, int n4) {
        double d2;
        if (!this.v) {
            d2 = n4 - this.w;
            double d3 = n2 - this.x;
            double d4 = Math.sqrt(d2 * d2 + d3 * d3);
            this.k = (double)this.w + d2 * (double)this.A / d4;
            this.l = (double)this.x + d3 * (double)this.A / d4;
            this.m = this.y;
        }
        d2 = this.i + 1 - n;
        this.q = ((double)n4 - this.k) / d2;
        this.r = ((double)n2 - this.l) / d2;
        this.s = Math.sqrt(this.q * this.q + this.r * this.r);
        if (!this.v) {
            this.t = -this.s * Math.tan((double)this.z * 0.02454369);
        }
        this.u = 2.0 * ((double)n3 - this.m - this.t * d2) / (d2 * d2);
    }

    @Override
    public C_h c() {
        C_h c_h = this.B.a();
        if (c_h == null) {
            return null;
        }
        int n = -1;
        if (this.B.g != null) {
            n = this.B.g.e != null && this.B.g.e.length > 0 ? this.B.g.e[this.C] : this.D;
        }
        boolean bl = false;
        rs.p_a.p_a.C_a c_a = C_h.h;
        C_h c_h2 = null;
        if (n != -1) {
            if (this.B.g.b()) {
                c_h2 = this.B.g.a(c_h, n);
            } else {
                c_a = (rs.p_a.p_a.C_a)C_x.q.a(this.B.d);
                if (c_a == null) {
                    c_a = new rs.p_a.p_a.C_a(true);
                    bl = true;
                    c_a.e();
                }
                c_h2 = new C_h(true, C_k.g(n), false, c_h);
                c_h2.i = c_a;
                c_h2.n();
                c_h2.f(n, this.B.g.r);
            }
            c_h2.aM = null;
            c_h2.aL = null;
        } else {
            c_h2 = new C_h(true, C_k.g(n), false, c_h, c_a);
            c_h2.i = c_a;
        }
        if (c_h2 != null) {
            if (this.B.j != 128 || this.B.k != 128) {
                c_h2.b(this.B.j, this.B.j, this.B.k);
            }
            c_h2.j(this.E);
            c_h2.b(64 + this.B.m, 850 + this.B.n, -30, -50, -30, true);
            c_h2.i = C_h.h;
            if (bl) {
                C_x.q.a(c_a, this.B.d);
            }
        }
        return c_h2;
    }

    public C_l(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.B = C_x.c[n11];
        this.p = n6;
        this.w = n9;
        this.x = n8;
        this.y = n7;
        this.h = n3;
        this.i = n4;
        this.z = n;
        this.A = n5;
        this.n = n10;
        this.j = n2;
        this.v = false;
    }

    public void a(int n) {
        this.v = true;
        this.k += this.q * (double)n;
        this.l += this.r * (double)n;
        this.m += this.t * (double)n + 0.5 * this.u * (double)n * (double)n;
        this.t += this.u * (double)n;
        this.o = (int)(Math.atan2(this.q, this.r) * 325.949) + 1024 & 0x7FF;
        this.E = (int)(Math.atan2(this.t, this.s) * 325.949) & 0x7FF;
        if (this.B.g != null) {
            if (this.B.g.b()) {
                this.D += n;
                int n2 = this.B.g.c();
                if (this.D >= n2) {
                    this.D = n2 - this.B.g.h;
                }
            } else {
                this.D += n;
                while (this.D > this.B.g.a(this.C)) {
                    this.D -= this.B.g.a(this.C) + 1;
                    ++this.C;
                    if (this.C < this.B.g.d) continue;
                    this.C = 0;
                }
            }
        }
    }
}

