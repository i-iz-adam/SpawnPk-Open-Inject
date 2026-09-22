package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_292.class */
public class class_292 extends class_306 {
    private class_293 e;
    private String f;
    private int g;
    private int h;
    private double i;
    private boolean j;

    public class_292() {
        a(class_268.A);
    }

    @Override // rs.class_306
    public void a() {
        int i = (6 - (Client.ag() ? 5 : 1)) - class_293.r;
        int i2 = (15 - class_293.s) - (18 / 2);
        double d = this.i / 100.0d;
        int i3 = this.j ? 4095 : 13960709;
        int i4 = this.j ? 50431 : 30976;
        int iCeil = (int) Math.ceil(((double) 500) * d);
        class_210.b(18, i2, i, 0, 500 + 4, 125);
        class_210.b(14, i2 + 2, i + 2, i3, 500, 255);
        class_210.b(14, i2 + 2, i + 2, i4, iCeil, 255);
        Client.gl.c(this.f, i + ((500 + 4) / 2), i2 + 14, class_492.c, 0);
    }

    @Override // rs.class_306
    public void c() {
        class_313.d().b(this);
    }

    public void c(int i, int i2) {
        this.g = i;
        this.h = i2;
        this.i = (((double) this.g) / ((double) i2)) * 100.0d;
        this.f = Client.a(this.g) + " / " + Client.a(this.h) + " @yel@(" + ((int) this.i) + "%)";
    }

    public void b(boolean z) {
        this.j = z;
    }
}
