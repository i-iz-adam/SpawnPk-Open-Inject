package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_537.class */
public class class_537 implements class_497 {
    int a;
    int b;
    int c;

    public class_537(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = i;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(41);
        buffer.d(this.c);
        buffer.o(this.a);
        buffer.o(this.b);
    }
}
