package rs;

import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_294.class */
public class class_294 extends class_306 {
    private String e = null;
    private String f = null;
    private String g = null;
    private String h = null;
    private String i = null;
    private String j = null;
    private String k = null;
    private String l = null;
    private String m = null;
    private String n = null;
    private String o = null;
    private String p = null;

    public class_294() {
        a(class_268.p);
    }

    @Override // rs.class_306
    public void a() {
        Client client = this.a;
        int i = Client.ag() ? Client.aj - 780 : 0;
        Client client2 = this.a;
        int i2 = Client.ag() ? Client.ak - 503 : 0;
        boolean z = System.currentTimeMillis() - this.a.z.w < 20000;
        int i3 = 13;
        if (Client.cH == -1) {
            if (z) {
                Client client3 = this.a;
                i3 = 50 + (Client.ag() ? 0 : 4);
            } else if (this.a.eV >= 2 || this.a.gr > 0 || this.a.eW > 0) {
                i3 = 13;
            }
        }
        if (Client.ah() && this.a.v.h() && !this.a.f()) {
            i2 += 135;
        }
        if (this.e != null) {
            this.a.gm.a(this.e, 512 + i, 0 != 0 ? 75 : 20, class_492.g, 0);
        }
        if (this.f != null) {
            this.a.gm.a(this.f, 512 + i, (0 != 0 ? 75 : 20) + 17, class_492.g, 0);
        }
        if (this.g != null) {
            this.a.gm.a(this.g, 512 + i, (0 != 0 ? 75 : 20) + 17 + 17, class_492.g, 0);
        }
        if (this.n != null) {
            this.a.gm.a(this.n, 512, 330 + i2, class_492.g, 0);
        }
        if (this.o != null) {
            this.a.gm.a(this.o, 512, CGL.kCGLCEMPEngine + i2, class_492.g, 0);
        }
        if (this.p != null) {
            this.a.gm.a(this.p, 512, User32.WM_UPDATEUISTATE + i2, class_492.g, 0);
        }
        if (this.k != null) {
            this.a.gm.b(this.k, 10, 330 + i2, class_492.g, 0);
        }
        if (this.l != null) {
            this.a.gm.b(this.l, 10, CGL.kCGLCEMPEngine + i2, class_492.g, 0);
        }
        if (this.m != null) {
            this.a.gm.b(this.m, 10, User32.WM_UPDATEUISTATE + i2, class_492.g, 0);
        }
        if (this.h != null) {
            this.a.gm.b(this.h, 10, 20 + i3, class_492.g, 0);
        }
        if (this.i != null) {
            this.a.gm.b(this.i, 10, 37 + i3, class_492.g, 0);
        }
        if (this.j != null) {
            this.a.gm.b(this.j, 10, 54 + i3, class_492.g, 0);
        }
    }

    public void k() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // rs.class_306
    public void c() {
        super.c();
        k();
    }

    public String l() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public String m() {
        return this.f;
    }

    public void b(String str) {
        this.f = str;
    }

    public String n() {
        return this.g;
    }

    public void c(String str) {
        this.g = str;
    }

    public String o() {
        return this.h;
    }

    public void d(String str) {
        this.h = str;
    }

    public String p() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public String q() {
        return this.j;
    }

    public void f(String str) {
        this.j = str;
    }

    public String r() {
        return this.k;
    }

    public void g(String str) {
        this.k = str;
    }

    public String s() {
        return this.l;
    }

    public void h(String str) {
        this.l = str;
    }

    public String t() {
        return this.m;
    }

    public void i(String str) {
        this.m = str;
    }

    public String u() {
        return this.n;
    }

    public void j(String str) {
        this.n = str;
    }

    public String v() {
        return this.o;
    }

    public void k(String str) {
        this.o = str;
    }

    public String w() {
        return this.p;
    }

    public void l(String str) {
        this.p = str;
    }
}
