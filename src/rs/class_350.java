package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_350.class */
public class class_350 extends Widget {
    protected class_495 a;

    public static class_350 a(int i) {
        class_350 class_350Var = new class_350();
        H[i] = class_350Var;
        class_350Var.au = i;
        class_350Var.ak = new int[0];
        class_350Var.al = new int[0];
        class_350Var.ba = new int[0];
        class_350Var.aF = 500;
        class_350Var.bh = 87;
        class_350Var.k(0);
        return class_350Var;
    }

    public static class_350 f(int i, int i2, int i3) {
        return a(i).g(i2, i3);
    }

    public class_350 g(int i, int i2) {
        this.P = i;
        this.aP = i2;
        return this;
    }

    public class_350 m(int i) {
        this.aF = i;
        return this;
    }

    public class_494 a(class_494 class_494Var) {
        return n(class_494Var.c());
    }

    public class_494 a(Widget widget) {
        return n(widget.au);
    }

    public class_494 n(int i) {
        if (this.a == null) {
            this.a = new class_495(this);
        }
        return this.a.a(i);
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }
}
