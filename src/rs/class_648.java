package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_648.class */
public class class_648 {
    class_642[] a;
    int b;

    public class_648(Buffer buffer, int i) {
        this.a = new class_642[i];
        this.b = buffer.y();
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.a[i2] = new class_642(this.b, buffer, false);
        }
        a();
    }

    void a() {
        for (int i = 0; i < this.a.length; i++) {
            class_642 class_642Var = this.a[i];
            if (class_642Var.n >= 0) {
                class_642Var.m = this.a[class_642Var.n];
            }
        }
    }

    public int b() {
        return this.a.length;
    }

    public class_642 a(int i) {
        if (i >= b()) {
            return null;
        }
        return this.a[i];
    }

    class_642[] c() {
        return this.a;
    }

    public void a(class_640 class_640Var, int i) {
        a(class_640Var, i, (boolean[]) null, false);
    }

    public void a(class_640 class_640Var, int i, boolean[] zArr, boolean z) {
        int iC = class_640Var.c();
        int i2 = 0;
        for (class_642 class_642Var : c()) {
            if (zArr == null || zArr[i2] == z) {
                class_640Var.a(i, class_642Var, i2, iC);
            }
            i2++;
        }
    }
}
