package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_184.class */
public class class_184 {
    private String a;
    private int b;
    private int c;
    private int e;
    private int f;
    private int g;
    private int h;
    private class_185[] d = new class_185[10];
    private int i = -1;

    public class_184(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public class_184 a(String str, class_167 class_167Var) {
        if (this.c == this.d.length) {
            return this;
        }
        class_185 class_185Var = new class_185();
        class_185Var.a(str);
        class_185Var.a(class_167Var);
        class_185[] class_185VarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        class_185VarArr[i] = class_185Var;
        a(str);
        return this;
    }

    public void a(String str) {
        int iA = Client.gj.a(this.a);
        int iA2 = Client.gj.a(str);
        if (this.e < iA) {
            this.e = iA + 10;
        }
        if (this.e < iA2) {
            this.e = iA2 + 10;
        }
        this.f = (15 * this.c) + 22;
    }

    public boolean a() {
        int i = this.g;
        int i2 = this.h;
        int i3 = class_27.hP;
        int i4 = class_27.hQ;
        return i3 >= i - 25 && i3 <= (i + this.e) + 25 && i4 >= i2 - 25 && i4 <= (i2 + this.f) + 25;
    }

    public class_185 b() {
        if (this.i >= 0) {
            return this.d[this.i];
        }
        return null;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void a(int i) {
        this.b = i;
    }

    public int e() {
        return this.c;
    }

    public class_185[] f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public void b(int i) {
        this.g = i;
    }

    public int j() {
        return this.h;
    }

    public void c(int i) {
        this.h = i;
    }

    public int k() {
        return this.i;
    }

    public void d(int i) {
        this.i = i;
    }
}
