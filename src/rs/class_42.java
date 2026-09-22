package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_42.class */
public class class_42 {
    public static final class_42 a = new class_42(0, 0, 0);
    private int b;
    private int c;
    private int d;

    public class_42(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public class_42 a(class_42 class_42Var) {
        return new class_42(this.b - class_42Var.b, this.c - class_42Var.c, this.d - class_42Var.d);
    }

    public class_42 a(float f) {
        return new class_42((int) (this.b / f), (int) (this.c / f), (int) (this.d / f));
    }

    public class_42 b(class_42 class_42Var) {
        this.b += class_42Var.b;
        this.c += class_42Var.c;
        this.d += class_42Var.d;
        return this;
    }

    public class_42 a(class_42 class_42Var, float f, float f2, float f3) {
        return new class_42(this.b + ((int) (class_42Var.b * f)), this.c + ((int) (class_42Var.c * f2)), this.d + ((int) (class_42Var.d * f3)));
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public class_42 clone() {
        return new class_42(this.b, this.c, this.d);
    }

    public int a(int i, int i2) {
        return ((int) (Math.random() * ((double) ((i2 - i) + 1)))) + i;
    }

    public String toString() {
        return "Vector{x=" + this.b + ", y=" + this.c + ", z=" + this.d + "}";
    }
}
