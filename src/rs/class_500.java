package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_500.class */
public class class_500 implements class_497 {
    int a;
    int b;
    int c;

    public class_500(int i, int i2, int i3) {
        this.a = i2;
        this.b = i;
        this.c = i3;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(75);
        buffer.p(this.b);
        buffer.n(this.a);
        buffer.o(this.c);
    }
}
