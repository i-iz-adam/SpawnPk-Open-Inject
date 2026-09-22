package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_496.class */
public final class class_496 {
    public final int a = 1024;
    public final class_617[] b = new class_617[1024];

    public class_496() {
        for (int i = 0; i < 1024; i++) {
            class_617 class_617Var = new class_617();
            this.b[i] = class_617Var;
            class_617Var.d = class_617Var;
            class_617Var.e = class_617Var;
        }
    }

    public class_617 a(long j) {
        class_617 class_617Var = this.b[(int) (j & ((long) (this.a - 1)))];
        class_617 class_617Var2 = class_617Var.d;
        while (true) {
            class_617 class_617Var3 = class_617Var2;
            if (class_617Var3 == class_617Var) {
                return null;
            }
            if (class_617Var3.c == j) {
                return class_617Var3;
            }
            class_617Var2 = class_617Var3.d;
        }
    }

    public void a(class_617 class_617Var, long j) {
        try {
            if (class_617Var.e != null) {
                class_617Var.b();
            }
            class_617 class_617Var2 = this.b[(int) (j & ((long) (this.a - 1)))];
            class_617Var.e = class_617Var2.e;
            class_617Var.d = class_617Var2;
            class_617Var.e.d = class_617Var;
            class_617Var.d.e = class_617Var;
            class_617Var.c = j;
        } catch (RuntimeException e) {
            String strValueOf = String.valueOf(class_617Var);
            e.toString();
            class_650.e("91499, " + strValueOf + ", " + j + ", 7, " + strValueOf);
            throw new RuntimeException();
        }
    }
}
