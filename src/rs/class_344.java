package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_344.class */
public class class_344 extends class_350 {
    public static final int b = 32431;
    public static final int c = 32432;
    public static final int d = 32457;
    static final int e = 1;
    static final int f = 20;
    private final class_347[] g = new class_347[25];
    private class_343 bG;
    private int bH;

    public class_344() {
        this.au = b;
        this.ak = new int[0];
        this.al = new int[0];
        this.ba = new int[0];
        this.aF = 500;
        this.bh = 87;
        k(0);
        this.bd = false;
        H[32431] = this;
    }

    @Override // rs.Widget
    public void f(int i, int i2) {
        if (this.bG == null) {
            return;
        }
        class_210.a(i - 1, i2, this.bG.P, this.bG.n(), this.bG.h() % 2 != 0 ? 4668980 : 3814187, 255);
        class_210.d(i - 1, this.bG.P + 2, this.aP + 2, 2630172, i2 - 1);
    }

    public boolean b() {
        if (Client.hP >= this.bz) {
            if (Client.hP <= this.bz + this.P + (k() ? 20 : 0) && Client.hQ >= this.bA && Client.hQ <= this.bA + this.aP) {
                return true;
            }
        }
        return false;
    }

    public void a(class_343 class_343Var) {
        for (int i = 0; i < this.g.length; i++) {
            this.g[i] = class_347.k(c + i, "test");
        }
        this.bG = class_343Var;
        this.bH = class_343Var.p();
        int i2 = class_343Var.k() == 1 ? 5 : 0;
        if (class_343Var.o() == 0) {
            class_343Var.n(((20 * class_343Var.h()) - 1) + i2);
        }
        for (int i3 = 0; i3 < class_343Var.h(); i3++) {
            this.g[i3].by = class_343Var.au;
            this.g[i3].as = class_343Var.i().get(i3).a();
            this.g[i3].an = class_352.a[class_343Var.k()];
            this.g[i3].m(class_343Var.l());
            this.g[i3].a(class_343Var.P);
            if (class_343Var.m()) {
                this.g[i3].b();
            } else {
                this.g[i3].h();
            }
            if (class_343Var.i().get(i3).b().equalsIgnoreCase("Select")) {
                this.g[i3].bv = false;
            } else {
                this.g[i3].bw = class_343Var.i().get(i3).b();
                this.g[i3].bv = true;
            }
            this.g[i3].Q = "Select";
        }
        this.aP = class_343Var.n();
        this.aF = Math.max(class_343Var.n(), (20 * class_343Var.h()) + i2);
        this.by = class_343Var.au;
        this.P = class_343Var.P - (k() ? 15 : 0);
        j();
    }

    private void j() {
        if (((class_350) this).a != null) {
            ((class_350) this).a.b();
        }
        int iM = m();
        int iL = l();
        if (k()) {
            iM -= 7;
        }
        for (int i = 0; i < this.bG.h(); i++) {
            n(this.g[i].au).a(iM, iL + (i * 20) + 0);
        }
        super.a();
    }

    private boolean k() {
        return this.bG.n() < this.aF;
    }

    private int l() {
        return 10 - (this.g[0].aP / 2);
    }

    private int m() {
        return this.g[0].S ? 1 : 12;
    }

    public class_347[] c() {
        return this.g;
    }

    public class_343 h() {
        return this.bG;
    }

    public int i() {
        return this.bH;
    }
}
