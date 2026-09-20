/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import java.awt.Polygon;
import rs.C_Client_mc;
import rs.p_a.C_a;
import rs.p_a.C_e;
import rs.p_a.C_j;
import rs.p_gui.C_Launcher_mc;
import rs.p_runelite.p_a.C_f;
import rs.p_runelite.p_a.C_p;

public class C_c
extends C_a {
    public C_e h;
    public boolean i;
    public final int j = -1;
    public final int[] k = new int[10];
    public final int[] l = new int[10];
    public int m = -1;
    public int n;
    public int o = 32;
    public int p = -1;
    public String q;
    public int r = 200;
    public int s;
    public int t = -1;
    public int u = -1;
    public int v;
    public int w = -1;
    public int x;
    public int y;
    public int z = -1;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F = -1;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L = -1000;
    public int M;
    public int N;
    public int O = 100;
    public int P;
    public int Q;
    public int R;
    public int S = 1;
    public boolean T = false;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public final boolean[] af;
    public int ag = -1;
    public int ah = -1;
    public int ai = -1;
    public int aj = -1;
    public int ak;
    public int al;
    public int am;
    public int an;
    public byte ao;
    public byte ap;
    public byte aq;
    public byte ar;
    public int as;
    public int at;
    public int au;

    public final rs.p_d.C_a[] d() {
        if (this instanceof C_j) {
            int n;
            if (!(rs.p_f.C_a.aj || (n = (int)((C_j)this).aG.x) != 212 && n != 1596 && n != 6370 && n != 599 && n != 373 && n != 949 && n != 1917 && n != 6570 && n != 6750 && n != 554 && n != 1699 && n != 7482 && n != 315 && n != 401 && n != 2575)) {
                return rs.p_d.C_a.a;
            }
            return rs.p_d.C_a.c;
        }
        return rs.p_d.C_a.a;
    }

    public final void a(int n, int n2, boolean bl) {
        if (this.F != -1 && this.d()[this.F].p == 1) {
            this.F = -1;
        }
        if (!bl) {
            int n3 = n - this.k[0];
            int n4 = n2 - this.l[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -8 && n4 <= 8) {
                if (this.E < 9) {
                    ++this.E;
                }
                for (int i = this.E; i > 0; --i) {
                    this.k[i] = this.k[i - 1];
                    this.l[i] = this.l[i - 1];
                    this.af[i] = this.af[i - 1];
                }
                this.k[0] = n;
                this.l[0] = n2;
                this.af[0] = false;
                return;
            }
        }
        this.E = 0;
        this.U = 0;
        this.n = 0;
        this.k[0] = n;
        this.l[0] = n2;
        this.ac = this.k[0] * 128 + this.S * 64;
        this.ad = this.l[0] * 128 + this.S * 64;
    }

    public final void e() {
        this.E = 0;
        this.U = 0;
    }

    public final void f() {
        this.h.a();
    }

    public final boolean a(int n, int n2, int n3, int n4) {
        return this.h.a(n, n2, n3, n4, true);
    }

    public final void a(boolean bl, int n) {
        int n2 = this.k[0];
        int n3 = this.l[0];
        if (n == 0) {
            --n2;
            ++n3;
        }
        if (n == 1) {
            ++n3;
        }
        if (n == 2) {
            ++n2;
            ++n3;
        }
        if (n == 3) {
            --n2;
        }
        if (n == 4) {
            ++n2;
        }
        if (n == 5) {
            --n2;
            --n3;
        }
        if (n == 6) {
            --n3;
        }
        if (n == 7) {
            ++n2;
            --n3;
        }
        if (this.F != -1 && this.d()[this.F].p == 1) {
            this.F = -1;
        }
        if (this.E < 9) {
            ++this.E;
        }
        for (int i = this.E; i > 0; --i) {
            this.k[i] = this.k[i - 1];
            this.l[i] = this.l[i - 1];
            this.af[i] = this.af[i - 1];
        }
        this.k[0] = n2;
        this.l[0] = n3;
        this.af[0] = bl;
    }

    public Polygon a(int n) {
        return C_Launcher_mc.n().o().a(new C_f(this.ac, this.ad), n);
    }

    public C_p g() {
        int n = (this.k[0] << 7) + 64;
        int n2 = (this.l[0] << 7) + 64;
        return C_p.a(n, n2, C_Client_mc.dw);
    }

    public boolean h() {
        if (!(this instanceof C_j)) {
            return false;
        }
        C_j c_j = (C_j)this;
        return c_j.aG != null && c_j.aG.h;
    }

    public boolean i() {
        if (!this.h()) {
            return false;
        }
        if (this.m != -1 && this.m < 32768) {
            C_j c_j = C_Launcher_mc.n().o().cA[this.m];
            return c_j != null && c_j.aG != null && c_j.aG.h;
        }
        return false;
    }

    public boolean j() {
        return this.h() && this.m - 32768 == C_Client_mc.di;
    }

    public boolean k() {
        if (!this.i()) {
            return false;
        }
        if (this.m != -1 && this.m < 32768) {
            C_j c_j = C_Launcher_mc.n().o().cA[this.m];
            return c_j.j();
        }
        return false;
    }

    public boolean l() {
        return false;
    }

    C_c() {
        this.h = new C_e();
        this.af = new boolean[10];
    }

    static class a {
        public int a;
        public int b;
        public int c;
        public int d;

        public a(int n, int n2, int n3) {
            this.a = n;
            this.b = n2;
            this.c = n3;
        }
    }
}

