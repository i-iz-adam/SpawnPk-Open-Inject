package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_157.class */
public final class class_157 {
    private final class_617 a = new class_617();
    private class_617 b;

    public class_157() {
        this.a.d = this.a;
        this.a.e = this.a;
    }

    public void a(class_617 class_617Var) {
        if (class_617Var.e != null) {
            class_617Var.b();
        }
        class_617Var.e = this.a.e;
        class_617Var.d = this.a;
        class_617Var.e.d = class_617Var;
        class_617Var.d.e = class_617Var;
    }

    public void b(class_617 class_617Var) {
        if (class_617Var.e != null) {
            class_617Var.b();
        }
        class_617Var.e = this.a;
        class_617Var.d = this.a.d;
        class_617Var.e.d = class_617Var;
        class_617Var.d.e = class_617Var;
    }

    public class_617 a() {
        class_617 class_617Var = this.a.d;
        if (class_617Var == this.a) {
            return null;
        }
        class_617Var.b();
        return class_617Var;
    }

    public class_617 b() {
        class_617 class_617Var = this.a.d;
        if (class_617Var == this.a) {
            this.b = null;
            return null;
        }
        this.b = class_617Var.d;
        return class_617Var;
    }

    public class_617 c() {
        class_617 class_617Var = this.a.e;
        if (class_617Var == this.a) {
            this.b = null;
            return null;
        }
        this.b = class_617Var.e;
        return class_617Var;
    }

    public class_617 d() {
        class_617 class_617Var = this.b;
        if (class_617Var == this.a) {
            this.b = null;
            return null;
        }
        this.b = class_617Var.d;
        return class_617Var;
    }

    public class_617 e() {
        class_617 class_617Var = this.b;
        if (class_617Var == this.a) {
            this.b = null;
            return null;
        }
        this.b = class_617Var.e;
        return class_617Var;
    }

    public void f() {
        if (this.a.d == this.a) {
            return;
        }
        while (true) {
            class_617 class_617Var = this.a.d;
            if (class_617Var == this.a) {
                return;
            } else {
                class_617Var.b();
            }
        }
    }
}
