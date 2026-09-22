package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_523.class */
public class class_523 implements class_497 {
    int a;
    int b;
    int c;

    public class_523(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(122);
        buffer.p(this.a);
        buffer.o(this.b);
        buffer.n(this.c);
    }
}
