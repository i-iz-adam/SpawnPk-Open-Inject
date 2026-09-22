package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_59.class */
public class class_59 {
    private class_60 a;
    private class_61 b;
    private class_56 c;
    private int d = Integer.MAX_VALUE;

    public class_59(class_59 class_59Var) {
        a(class_59Var.f());
        a(class_59Var.g());
        a(class_59Var.h());
        a(class_59Var.i());
    }

    public class_59() {
    }

    public void a(ColorUtility colorUtility) {
        if (b()) {
            this.c.a(colorUtility);
        }
        if (d()) {
            this.a.a(colorUtility);
        }
        if (e() && colorUtility.aq == null) {
            colorUtility.aq = new int[colorUtility.ah];
        }
        for (int i = 0; i < colorUtility.ah; i++) {
            if (b()) {
                this.c.a(colorUtility, i);
            }
            if (d()) {
                this.a.a(colorUtility, i);
            }
            if (e()) {
                colorUtility.aq[i] = 100 - this.d;
            }
        }
        if (c()) {
            this.b.a(colorUtility);
            for (int i2 = 0; i2 < colorUtility.ah; i2++) {
                this.b.a(colorUtility, i2);
            }
        }
    }

    public class_61 a() {
        if (this.b == null) {
            this.b = new class_61();
        }
        return this.b;
    }

    public boolean b() {
        return this.c != null;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.a != null;
    }

    public boolean e() {
        return this.d != Integer.MAX_VALUE;
    }

    public class_60 f() {
        return this.a;
    }

    public void a(class_60 class_60Var) {
        this.a = class_60Var;
    }

    public class_61 g() {
        return this.b;
    }

    public void a(class_61 class_61Var) {
        this.b = class_61Var;
    }

    public class_56 h() {
        return this.c;
    }

    public void a(class_56 class_56Var) {
        this.c = class_56Var;
    }

    public int i() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }
}
