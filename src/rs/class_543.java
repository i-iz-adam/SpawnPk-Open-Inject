package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_543.class */
public class class_543 implements class_497 {
    int a;
    int b;
    int c;

    public class_543(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(117);
        buffer.p(this.b);
        buffer.p(this.c);
        buffer.n(this.a);
    }
}
