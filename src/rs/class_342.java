package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_342.class */
public class class_342 extends Widget {
    private boolean a;

    public static class_342 b(int i, String str, String str2) {
        class_342 class_342Var = new class_342();
        H[i] = class_342Var;
        class_342Var.au = i;
        class_342Var.ag = i;
        class_342Var.aG = 5;
        class_342Var.M = 1;
        class_342Var.J = 0;
        class_342Var.aA = (byte) 0;
        class_342Var.aa = 52;
        class_342Var.E = new class_333(false, str);
        class_342Var.aE = new class_333(false, str);
        class_342Var.P = class_342Var.E.n;
        class_342Var.aP = class_342Var.aE.o;
        class_342Var.Q = str2;
        return class_342Var;
    }

    public static class_342 a(int i, class_333 class_333Var, String str) {
        class_342 class_342Var = new class_342();
        H[i] = class_342Var;
        class_342Var.au = i;
        class_342Var.ag = i;
        class_342Var.aG = 5;
        class_342Var.M = 1;
        class_342Var.J = 0;
        class_342Var.aA = (byte) 0;
        class_342Var.aa = 52;
        class_342Var.E = class_333Var;
        class_342Var.aE = class_333Var;
        class_342Var.P = class_342Var.E.n;
        class_342Var.aP = class_342Var.aE.o;
        class_342Var.Q = str;
        return class_342Var;
    }

    public class_342 g(int i, int i2) {
        this.P = i;
        this.aP = i2;
        return this;
    }

    public class_342 a(class_333 class_333Var) {
        this.aE = class_333Var;
        this.bx = true;
        return this;
    }

    public class_342 b(String str) {
        this.aE = new class_333(false, str);
        this.bx = true;
        return this;
    }

    public class_342 c(String str) {
        a(this.au + 1, str);
        return this;
    }

    public class_342 b(class_333 class_333Var) {
        b(this.au + 1, class_333Var);
        return this;
    }

    public class_348 a(int i, String str) {
        this.a = true;
        this.J = -1;
        this.aa = i;
        int i2 = i + 1;
        Widget widgetK = class_348.k(i2, str);
        class_348 class_348Var = new class_348();
        H[i] = class_348Var;
        class_348Var.ag = i;
        class_348Var.au = i;
        class_348Var.aG = 0;
        class_348Var.M = 0;
        class_348Var.P = widgetK.E.n;
        class_348Var.aP = widgetK.aE.o;
        class_348Var.aO = true;
        class_348Var.aA = (byte) 0;
        class_348Var.aa = -1;
        class_348Var.aF = 0;
        class_348Var.k(1);
        class_348Var.b(0, i2, 0, 0);
        return class_348Var;
    }

    public class_348 b(int i, class_333 class_333Var) {
        this.a = true;
        this.J = -1;
        this.aa = i;
        int i2 = i + 1;
        Widget widgetC = class_348.c(i2, class_333Var);
        class_348 class_348Var = new class_348();
        H[i] = class_348Var;
        class_348Var.ag = i;
        class_348Var.au = i;
        class_348Var.aG = 0;
        class_348Var.M = 0;
        class_348Var.P = widgetC.E.n;
        class_348Var.aP = widgetC.aE.o;
        class_348Var.aO = true;
        class_348Var.aA = (byte) 0;
        class_348Var.aa = -1;
        class_348Var.aF = 0;
        class_348Var.k(1);
        class_348Var.b(0, i2, 0, 0);
        return class_348Var;
    }

    public class_342 a() {
        this.bv = true;
        return this;
    }

    public class_342 d(String str) {
        this.bw = str;
        this.bv = true;
        return this;
    }

    public boolean b() {
        return this.a;
    }
}
