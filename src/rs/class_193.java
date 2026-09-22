package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_193.class */
public class class_193 {
    private final int a = 1;
    private final int b = 45;
    private class_333 c;
    private class_333 d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long j;

    public class_193(class_333 class_333Var, class_333 class_333Var2, int i) {
        this.c = class_333Var;
        this.d = class_333Var2;
        this.g = i;
    }

    public void a(int i, int i2) {
        this.c.c(i, i2);
        if (!this.e) {
            this.i = 0;
            if (System.currentTimeMillis() - this.j >= 45) {
                if (this.h != 0) {
                    this.h += this.f * (-1);
                    this.j = System.currentTimeMillis();
                } else if (Math.random() * 100.0d <= 2.0d || System.currentTimeMillis() - this.j >= 1000) {
                    this.f = this.f < 0 ? 1 : -1;
                    this.e = true;
                }
            }
        } else if (System.currentTimeMillis() - this.j >= 45) {
            if (this.h != this.g * (this.f / 1)) {
                this.h += this.f;
            } else {
                this.e = false;
            }
            this.j = System.currentTimeMillis();
        }
        this.d.c(i + this.h, i2 + this.i);
    }
}
