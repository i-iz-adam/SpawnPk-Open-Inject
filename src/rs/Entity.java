package rs;

import java.awt.Polygon;
import rs.gui.Launcher;
import rs.runelite.a.f;

/* JADX INFO: loaded from: client-final.jar:rs/Entity.class */
public class Entity extends class_48 {
    public boolean i;
    public int n;
    public String q;
    public int s;
    public int v;
    public int x;
    public int y;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int G;
    public int H;
    public int primarySeqDelay;
    public int J;
    public int K;
    public int M;
    public int N;
    public int P;
    public int Q;
    public int R;
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
    public final int j = -1;
    public final int[] k = new int[10];
    public final int[] l = new int[10];
    public int m = -1;
    public int o = 32;
    public int p = -1;
    public int r = 200;
    public int t = -1;
    public int u = -1;
    public class_64 h = new class_64();
    public int w = -1;
    public int z = -1;
    public int primarySeqID = -1;
    public int L = -1000;
    public int O = 100;
    public int S = 1;
    public boolean T = false;
    public final boolean[] af = new boolean[10];
    public int ag = -1;
    public int ah = -1;
    public int ai = -1;
    public int aj = -1;

    public final class_99[] d() {
        int i;
        if (this instanceof Npc) {
            return (Configuration.aj || !((i = (int) ((Npc) this).aG.x) == 212 || i == 1596 || i == 6370 || i == 599 || i == 373 || i == 949 || i == 1917 || i == 6570 || i == 6750 || i == 554 || i == 1699 || i == 7482 || i == 315 || i == 401 || i == 2575)) ? class_99.c : class_99.a;
        }
        return class_99.a;
    }

    public final void a(int i, int i2, boolean z) {
        if (this.primarySeqID != -1 && d()[this.primarySeqID].p == 1) {
            this.primarySeqID = -1;
        }
        if (!z) {
            int i3 = i - this.k[0];
            int i4 = i2 - this.l[0];
            if (i3 >= -8 && i3 <= 8 && i4 >= -8 && i4 <= 8) {
                if (this.E < 9) {
                    this.E++;
                }
                for (int i5 = this.E; i5 > 0; i5--) {
                    this.k[i5] = this.k[i5 - 1];
                    this.l[i5] = this.l[i5 - 1];
                    this.af[i5] = this.af[i5 - 1];
                }
                this.k[0] = i;
                this.l[0] = i2;
                this.af[0] = false;
                return;
            }
        }
        this.E = 0;
        this.U = 0;
        this.n = 0;
        this.k[0] = i;
        this.l[0] = i2;
        this.ac = (this.k[0] * 128) + (this.S * 64);
        this.ad = (this.l[0] * 128) + (this.S * 64);
    }

    public final void e() {
        this.E = 0;
        this.U = 0;
    }

    public final void f() {
        this.h.a();
    }

    public final boolean a(int i, int i2, int i3, int i4) {
        return this.h.a(i, i2, i3, i4, true);
    }

    public final void a(boolean z, int i) {
        int i2 = this.k[0];
        int i3 = this.l[0];
        if (i == 0) {
            i2--;
            i3++;
        }
        if (i == 1) {
            i3++;
        }
        if (i == 2) {
            i2++;
            i3++;
        }
        if (i == 3) {
            i2--;
        }
        if (i == 4) {
            i2++;
        }
        if (i == 5) {
            i2--;
            i3--;
        }
        if (i == 6) {
            i3--;
        }
        if (i == 7) {
            i2++;
            i3--;
        }
        if (this.primarySeqID != -1 && d()[this.primarySeqID].p == 1) {
            this.primarySeqID = -1;
        }
        if (this.E < 9) {
            this.E++;
        }
        for (int i4 = this.E; i4 > 0; i4--) {
            this.k[i4] = this.k[i4 - 1];
            this.l[i4] = this.l[i4 - 1];
            this.af[i4] = this.af[i4 - 1];
        }
        this.k[0] = i2;
        this.l[0] = i3;
        this.af[0] = z;
    }

    public Polygon a(int i) {
        return Launcher.n().o().a(new f(this.ac, this.ad), i);
    }

    public rs.runelite.a.p g() {
        return rs.runelite.a.p.a((this.k[0] << 7) + 64, (this.l[0] << 7) + 64, Client.dw);
    }

    public boolean h() {
        if (!(this instanceof Npc)) {
            return false;
        }
        Npc npc = (Npc) this;
        return npc.aG != null && npc.aG.h;
    }

    public boolean i() {
        Npc npc;
        return h() && this.m != -1 && this.m < 32768 && (npc = Launcher.n().o().cA[this.m]) != null && npc.aG != null && npc.aG.h;
    }

    public boolean j() {
        return h() && this.m - 32768 == Client.di;
    }

    public boolean k() {
        if (i() && this.m != -1 && this.m < 32768) {
            return Launcher.n().o().cA[this.m].j();
        }
        return false;
    }

    public boolean l() {
        return false;
    }

    Entity() {
    }
}
