package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_26.class */
public final class class_26 {
    private final class_47 a = new class_47();
    private class_47 b;

    public class_26() {
        this.a.a = this.a;
        this.a.b = this.a;
    }

    public void a(class_47 class_47Var) {
        if (class_47Var.b != null) {
            class_47Var.a();
        }
        class_47Var.b = this.a.b;
        class_47Var.a = this.a;
        class_47Var.b.a = class_47Var;
        class_47Var.a.b = class_47Var;
    }

    public class_47 a() {
        class_47 class_47Var = this.a.a;
        if (class_47Var == this.a) {
            return null;
        }
        class_47Var.a();
        return class_47Var;
    }

    public class_47 b() {
        class_47 class_47Var = this.a.a;
        if (class_47Var == this.a) {
            this.b = null;
            return null;
        }
        this.b = class_47Var.a;
        return class_47Var;
    }

    public class_47 c() {
        class_47 class_47Var = this.b;
        if (class_47Var == this.a) {
            this.b = null;
            return null;
        }
        this.b = class_47Var.a;
        return class_47Var;
    }

    public int d() {
        int i = 0;
        class_47 class_47Var = this.a.a;
        while (true) {
            class_47 class_47Var2 = class_47Var;
            if (class_47Var2 == this.a) {
                return i;
            }
            i++;
            class_47Var = class_47Var2.a;
        }
    }
}
