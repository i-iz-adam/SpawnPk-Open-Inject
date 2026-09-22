package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_546.class */
public class class_546 implements class_497 {
    int a;
    int b;
    int c;

    public class_546(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(135);
        buffer.n(this.b);
        buffer.o(this.a);
        buffer.n(this.c);
    }
}
