package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_499.class */
public class class_499 implements class_497 {
    int a;
    int b;
    int c;
    int d;

    public class_499(int i, int i2, int i3, int i4) {
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.d = i;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(14);
        buffer.o(this.d);
        buffer.d(this.b);
        buffer.d(this.a);
        buffer.n(this.c);
    }
}
