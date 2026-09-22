package rs;

import org.lwjgl.system.windows.User32;
import rs.plugins.s.b;

/* JADX INFO: loaded from: client-final.jar:rs/class_304.class */
public class class_304 extends class_306 {
    private class_303 f;
    private String[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private long m;
    public class_333[] e = null;
    private int[] l = null;
    private int n = 1;
    private String o = "";
    private final long p = 200;

    public class_304() {
        a(class_268.A);
    }

    @Override // rs.class_306
    public void a() {
        if (this.f == null) {
            b.f();
        }
        if (this.f != null) {
            b(this.f);
        }
        n();
    }

    public void a(class_303 class_303Var) {
        this.f = class_303Var;
    }

    public void a(String str, boolean z) {
        this.f = new class_303(str, z);
    }

    private void b(class_303 class_303Var) {
        if (class_303Var.a() == null) {
            return;
        }
        this.h = Client.hP;
        this.i = Client.hQ + 20;
        String strA = class_303Var.a();
        if (!strA.endsWith("\n")) {
            strA = strA + "\n";
        }
        this.g = strA.split("\n");
        k();
        Client client = this.a;
        int i = Client.ag() ? Client.aj - User32.VK_PLAY : Client.aj;
        Client client2 = this.a;
        int i2 = Client.ag() ? Client.ak - 176 : 363;
        if (this.h >= i) {
            this.h = Client.ai - this.j;
            this.h -= (this.h + this.j) - Client.hP;
        }
        if (this.i >= i2) {
            this.i = Client.ah - this.k;
            this.i -= ((this.i + this.k) - Client.hQ) + 20;
        }
        a(this.h, this.i, this.j, this.k);
        if (class_303Var.e()) {
            this.a.aU.c((this.h + this.j) - 14, this.i + 3);
        }
        this.i += 14;
        for (int i3 = 0; i3 < this.g.length; i3++) {
            if (i3 == 0 && this.g[i3].startsWith(" 1 ")) {
                this.g[i3] = this.g[i3].substring(2);
            }
            if (i3 == 0 && class_303Var.b()) {
                Client.gl.b(this.g[i3], this.h, this.i, 16760156, 0);
            } else {
                Client.gl.b(" " + this.g[i3], this.h, this.i, class_492.c, 0);
            }
            this.i += 16;
        }
        if (class_303Var.d() != null) {
            l();
        }
        if (class_303Var.c() != null) {
            m();
        }
    }

    private void k() {
        this.k = (this.g.length * 16) + 3;
        this.j = 0;
        for (int i = 0; i < this.g.length; i++) {
            this.j = Math.max(this.j, ((int) Math.floor(Client.gl.a(this.g[i], true))) + 10);
        }
        if (this.f.c() != null && this.j < 150) {
            this.j = 150;
        }
        if (this.f.d() != null) {
            if (this.j < 141) {
                this.j = 141;
            }
            if (this.k < 179) {
                this.k = 179;
            }
        }
    }

    private void l() {
        this.i -= this.k - 3;
        Client.gl.c(this.f.d()[1].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + 15, this.i + 32, class_492.c, 0);
        Client.gl.c(this.f.d()[6].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + 15, this.i + 32, class_492.c, 0);
        Client.gl.c(this.f.d()[2].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + 15, this.i + 48, class_492.c, 0);
        Client.gl.c(this.f.d()[7].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + 15, this.i + 48, class_492.c, 0);
        Client.gl.c(this.f.d()[3].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + 15, this.i + 65, class_492.c, 0);
        Client.gl.c(this.f.d()[8].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + 15, this.i + 65, class_492.c, 0);
        Client.gl.c(this.f.d()[4].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + 15, this.i + 81, class_492.c, 0);
        Client.gl.c(this.f.d()[9].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + 15, this.i + 81, class_492.c, 0);
        Client.gl.c(this.f.d()[5].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + 15, this.i + 97, class_492.c, 0);
        Client.gl.c(this.f.d()[10].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + 15, this.i + 97, class_492.c, 0);
    }

    private void m() {
        int[] iArrC = this.f.c();
        int i = this.j / 40;
        if (i < 3) {
            i = 3;
        }
        if (this.e == null || !this.o.equals(this.f.a()) || System.currentTimeMillis() - this.m >= 200) {
            this.e = new class_333[i];
            this.l = new int[i];
            if (this.n >= iArrC.length) {
                this.n = 1;
            }
            int i2 = this.n;
            for (int i3 = 0; i3 < i; i3++) {
                if (i2 >= iArrC.length) {
                    i2 = 0;
                }
                this.e[i3] = ItemComposition.a(iArrC[i2], 0, 0, 32);
                this.l[i3] = iArrC[i2];
                i2++;
            }
            this.o = this.f.a();
            this.n++;
            this.m = System.currentTimeMillis();
        }
        this.i -= 10;
        a(this.h, this.i - 1, this.j, 32, b.p, b.r, b.q);
        if (this.e != null) {
            for (int i4 = 0; i4 < this.e.length; i4++) {
                if (this.e[i4] == null) {
                    this.e[i4] = ItemComposition.a(this.l[i4], 0, 0, 32);
                }
                if (this.e[i4] != null) {
                    this.e[i4].f(20 + this.h + (i4 * 35), this.i);
                }
            }
        }
    }

    private void n() {
        this.f = null;
    }
}
