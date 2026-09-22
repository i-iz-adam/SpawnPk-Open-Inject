package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_269.class */
public class class_269 {
    private static final int a = 200;
    private String b;
    private String c;
    private String d;
    private int g = 175;
    private int h = 0;
    private int i = 5;
    private int j = 200;
    private int k = 256;
    private long e = System.currentTimeMillis();
    private class_273 f = class_273.a;

    public class_269(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        g();
    }

    public void a() {
        switch (this.f) {
            case a:
                h();
                break;
            case b:
                i();
                break;
        }
        if (Configuration.bk) {
            j();
        }
    }

    private void g() {
        int iC = Launcher.n().o().gn.c(this.b) + 12;
        Launcher.n().o();
        int iC2 = Client.gl.c(this.c) + 6;
        Launcher.n().o();
        int iMax = Math.max(iC, Math.max(iC2, Client.gl.c(this.d) + 6));
        if (iMax > this.g) {
            this.g = Math.min(iMax, 200);
        }
    }

    private void h() {
        int iK = k() - this.g;
        if (!class_194.a()) {
            this.h += 4;
        }
        int iK2 = (k() - (this.g / 2)) - (this.h / 2);
        if (this.h >= this.g) {
            this.h = this.g;
            this.f = class_273.b;
        }
    }

    private void i() {
        int iK = k() - 60;
        if (!class_194.a()) {
            this.i += 3;
        }
        if (this.i >= 60) {
            this.i = 60;
            this.f = class_273.c;
        }
    }

    private void j() {
        int iK = k() - (this.h / 2);
        int iL = l() - (this.i / 2);
        a(iK, iL, this.h, this.i);
        if (this.i >= 20) {
            Launcher.n().o().gn.d(this.b, iK + (this.h / 2), iL + 15, class_492.e, 0, this.k);
            class_210.d(iK, iL + 20, this.h, 2, class_228.u, this.j);
        }
        if (this.i >= 30) {
            Launcher.n().o();
            Client.gl.d(this.c, iK + (this.h / 2), iL + 37, class_492.e, 0, this.k);
        }
        if (this.i >= 60) {
            Launcher.n().o();
            Client.gl.d(this.d, iK + (this.h / 2), iL + 54, class_492.c, 0, this.k);
        }
        if (m() < 3 || class_194.a()) {
            return;
        }
        this.j -= 3;
        this.k -= 3;
        if (this.j <= 1) {
            this.j = 1;
        }
        if (this.k <= 1) {
            this.k = 1;
        }
    }

    private int k() {
        return Client.aj / 2;
    }

    private int l() {
        return 40;
    }

    private void a(int i, int i2, int i3, int i4) {
        class_210.b(i4, i2, i, 3681824, i3, this.j);
        class_210.e(i, i3, i4, class_228.u, i2, this.j);
        class_210.e(i - 1, i3 + (1 * 2), i4 + (1 * 2), class_228.t, i2 - 1, this.j);
    }

    private int m() {
        return (int) ((System.currentTimeMillis() - this.e) / 1000);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public long e() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public class_273 f() {
        return this.f;
    }
}
