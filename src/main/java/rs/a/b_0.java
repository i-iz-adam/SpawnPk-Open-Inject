/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import rs.a_0.a;
import rs.a_0.h;
import rs.d.x;
import rs.k_0;

public final class b_0
extends a {
    public final int h;
    public final int i;
    public final int j;
    public final int k_0;
    public final int l;
    public boolean m = false;
    private final x n;
    private int o;
    private int p;

    public b_0(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.n = x.c[n5];
        this.h = n2;
        this.i = n8;
        this.j = n7;
        this.k_0 = n6;
        this.l = n3 + n4;
        this.m = false;
    }

    @Override
    public h c() {
        h h2 = this.n.a();
        if (h2 == null) {
            return null;
        }
        h h3 = null;
        rs.d.a a2 = this.n.g;
        boolean bl = false;
        rs.a_0.a.a a3 = rs.a_0.h.h;
        if (a2.b()) {
            h3 = a2.a(h2, this.o);
        } else {
            int n2 = this.n.g.e[this.o];
            h3 = new h(true, rs.k_0.g(n2), false, h2);
            h3.i = a3;
            if (!this.m) {
                h3.n();
                h3.f(n2, this.n.g.r);
                h3.aM = null;
                h3.aL = null;
            }
        }
        if (this.n.j != 128 || this.n.k_0 != 128) {
            h3.b(this.n.j, this.n.j, this.n.k_0);
        }
        if (this.n.l != 0) {
            if (this.n.l == 90) {
                h3.o();
            }
            if (this.n.l == 180) {
                h3.o();
                h3.o();
            }
            if (this.n.l == 270) {
                h3.o();
                h3.o();
                h3.o();
            }
        }
        h3.b(64 + this.n.m, 850 + this.n.n, -30, -50, -30, true);
        if (bl) {
            x.q.a(a3, this.n.d);
        }
        return h3;
    }

    public void a(int n2) {
        if (this.n.g.b()) {
            this.p += n2;
            this.o += n2;
            if (this.o >= this.n.g.c()) {
                this.m = true;
            }
        } else {
            this.p += n2;
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

