package rs;

import java.awt.Color;

/* JADX INFO: loaded from: client-final.jar:rs/class_199.class */
public class class_199 extends class_196 {
    private int t;
    private int[] u = {0, 10, 18, 26, 33, 36, 42};
    private int[] v = {0, 0, 0, 0, 0};
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;

    @Override // rs.class_196
    protected void b() {
        q();
        d(808);
    }

    @Override // rs.class_196
    protected void c() {
        int i = class_99.a[this.h].e[this.i];
        ColorUtility colorUtilityO = o();
        if (colorUtilityO != null) {
            ColorUtility colorUtility = ColorUtility.ac;
            colorUtility.a(colorUtilityO, class_176.g(i) & class_176.g(-1));
            colorUtility.f(i, this.h);
            colorUtility.k();
            colorUtility.aM = null;
            colorUtility.aL = null;
            colorUtility.aN = true;
            class_258 class_258Var = new class_258(this, colorUtility.b(this.b, this.c, (this.d - class_46.k) + Client.cK, 0), Color.GREEN, Color.BLACK, this.f);
            class_258Var.f = Color.BLACK;
            Client.ab.c.a(this.f, class_258Var);
            colorUtility.a(this.e, class_46.m, class_46.n, class_46.o, class_46.p, this.b - class_46.j, this.d - class_46.k, this.c - class_46.l, this.f, 0);
            colorUtility.K = (short) 256;
            if (class_258Var.g && class_205.b.j) {
                if (class_205.b.k == 1) {
                    class_205.b.c("Selected @gre@Player entity #" + (this.m + 1));
                    this.n = true;
                    class_205.b.f();
                } else {
                    this.o = false;
                    class_205.b.c("Deleted @red@Player entity #" + (this.m + 1));
                }
                class_205.b.j = false;
            }
            c(colorUtility.g + 10);
            if (class_205.e) {
                Client.gl.a((this.n ? "@gre@" : "") + (this.m + 1), this.k, this.l, class_492.c, 0, false);
            }
        }
    }

    public Player n() {
        Player player = new Player();
        player.aY = this.t;
        System.arraycopy(this.v, 0, player.aV, 0, player.aV.length);
        player.equipment[0] = a(this.z, 512);
        player.equipment[1] = a(this.B, 512);
        player.equipment[2] = a(this.C, 512);
        player.equipment[3] = a(this.w, 512);
        player.equipment[4] = this.x == 0 ? a(this.u[2], 256) : a(this.x, 512);
        player.equipment[5] = a(this.E, 512);
        player.equipment[6] = (this.x == 0 || !s()) ? a(this.u[3], 256) : 0;
        player.equipment[7] = this.y == 0 ? a(this.u[5], 256) : a(this.y, 512);
        player.equipment[8] = (this.z == 0 || !(t() || u())) ? a(this.u[0], 256) : 0;
        player.equipment[9] = this.D == 0 ? a(this.u[4], 256) : a(this.D, 512);
        player.equipment[10] = this.A == 0 ? a(this.u[6], 256) : a(this.A, 512);
        player.equipment[11] = ((this.z == 0 || !t()) && this.t != 1) ? a(this.u[1], 256) : 0;
        player.t = this.h;
        player.bm = true;
        player.aU = true;
        return player;
    }

    private int a(int i, int i2) {
        if (i != 0 || i2 == 256) {
            return i2 + i;
        }
        return 0;
    }

    public ColorUtility o() {
        ColorUtility colorUtilityM = n().m();
        if (colorUtilityM == null) {
            return null;
        }
        colorUtilityM.aN = true;
        return colorUtilityM;
    }

    public void p() {
        d(808);
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = false;
    }

    public void q() {
        this.t = 0;
    }

    public void r() {
        this.t = 1;
    }

    public void g(int i) {
        this.w = i;
    }

    public void h(int i) {
        this.x = i;
    }

    public void i(int i) {
        this.y = i;
    }

    public void j(int i) {
        this.z = i;
    }

    public void k(int i) {
        this.A = i;
    }

    public void l(int i) {
        this.B = i;
    }

    public void m(int i) {
        this.C = i;
    }

    public void n(int i) {
        this.D = i;
    }

    public void o(int i) {
        this.E = i;
    }

    public boolean s() {
        return this.F;
    }

    public void b(boolean z) {
        this.F = z;
    }

    public boolean t() {
        return this.G;
    }

    public void c(boolean z) {
        this.G = z;
    }

    public boolean u() {
        return this.H;
    }

    public void d(boolean z) {
        this.H = z;
    }
}
