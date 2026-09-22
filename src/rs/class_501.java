package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_501.class */
public class class_501 implements class_497 {
    int a;
    int b;
    int c;

    public class_501(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = i;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(16);
        buffer.o(this.c);
        buffer.p(this.a);
        buffer.p(this.b);
    }
}
