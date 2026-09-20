/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import rs.C_k;
import rs.p_a.C_a;
import rs.p_a.C_h;
import rs.p_d.C_x;

public final class C_b
extends C_a {
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public boolean m = false;
    private final C_x n;
    private int o;
    private int p;

    public C_b(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.n = C_x.c[n4];
        this.h = n;
        this.i = n7;
        this.j = n6;
        this.k = n5;
        this.l = n2 + n3;
        this.m = false;
    }

    @Override
    public C_h c() {
        C_h c_h = this.n.a();
        if (c_h == null) {
            return null;
        }
        C_h c_h2 = null;
        rs.p_d.C_a c_a = this.n.g;
        boolean bl = false;
        rs.p_a.p_a.C_a c_a2 = C_h.h;
        if (c_a.b()) {
            c_h2 = c_a.a(c_h, this.o);
        } else {
            int n = this.n.g.e[this.o];
            c_h2 = new C_h(true, C_k.g(n), false, c_h);
            c_h2.i = c_a2;
            if (!this.m) {
                c_h2.n();
                c_h2.f(n, this.n.g.r);
                c_h2.aM = null;
                c_h2.aL = null;
            }
        }
        if (this.n.j != 128 || this.n.k != 128) {
            c_h2.b(this.n.j, this.n.j, this.n.k);
        }
        if (this.n.l != 0) {
            if (this.n.l == 90) {
                c_h2.o();
            }
            if (this.n.l == 180) {
                c_h2.o();
                c_h2.o();
            }
            if (this.n.l == 270) {
                c_h2.o();
                c_h2.o();
                c_h2.o();
            }
        }
        c_h2.b(64 + this.n.m, 850 + this.n.n, -30, -50, -30, true);
        if (bl) {
            C_x.q.a(c_a2, this.n.d);
        }
        return c_h2;
    }

    public void a(int n) {
        if (this.n.g.b()) {
            this.p += n;
            this.o += n;
            if (this.o >= this.n.g.c()) {
                this.m = true;
            }
        } else {
            this.p += n;
            while (this.p > this.n.g.a(this.o)) {
                this.p -= this.n.g.a(this.o) + 1;
                ++this.o;
                if (this.o < this.n.g.d || this.o >= 0 && this.o < this.n.g.d) continue;
                this.o = 0;
                this.m = true;
            }
        }
    }
}

