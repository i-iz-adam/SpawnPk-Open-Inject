package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_521.class */
public class class_521 implements class_497 {
    int a;
    int b;
    int c;
    int d;

    public class_521(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(214);
        buffer.p(this.a);
        buffer.l(this.b);
        buffer.p(this.c);
        buffer.n(this.d);
    }
}
