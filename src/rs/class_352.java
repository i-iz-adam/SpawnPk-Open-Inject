package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_352.class */
public class class_352 extends Widget {
    public static class_338[] a = null;

    public static class_352 a(int i, String str) {
        class_352 class_352Var = new class_352();
        H[i] = class_352Var;
        class_352Var.ag = i;
        class_352Var.au = i;
        class_352Var.aG = 4;
        class_352Var.M = 0;
        class_352Var.P = 0;
        class_352Var.aP = 11;
        class_352Var.J = 0;
        class_352Var.aA = (byte) 0;
        class_352Var.aa = -1;
        class_352Var.S = false;
        class_352Var.aQ = true;
        class_352Var.as = str;
        class_352Var.Z = "";
        class_352Var.O = 0;
        class_352Var.L = 0;
        class_352Var.aj = 0;
        class_352Var.a();
        return class_352Var;
    }

    public class_352 a(String str, int i) {
        this.Q = str;
        this.M = 1;
        this.P = i;
        this.aP = 11;
        this.bm = true;
        this.L = class_492.c;
        return this;
    }

    public class_352 a(int i) {
        return a("Select option", i);
    }

    public class_352 a() {
        this.an = a[0];
        return this;
    }

    public class_352 b() {
        this.S = true;
        this.U = false;
        return this;
    }

    public class_352 c() {
        this.U = true;
        this.S = false;
        return this;
    }

    public class_352 h() {
        this.U = false;
        this.S = false;
        return this;
    }

    public class_352 i() {
        this.an = a[1];
        return this;
    }

    public class_352 j() {
        this.an = a[2];
        return this;
    }

    public class_352 m(int i) {
        this.ac = i;
        return this;
    }

    public class_352 k() {
        return m(class_492.c);
    }

    public class_352 l() {
        return m(class_492.d);
    }

    public class_352 m() {
        return m(class_492.e);
    }

    public class_352 n() {
        return b().j();
    }

    public class_352 o() {
        return b().i();
    }
}
