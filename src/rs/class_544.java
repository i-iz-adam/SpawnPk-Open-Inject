package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_544.class */
public class class_544 implements class_497 {
    int a;
    int b;
    int c;

    public class_544(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(43);
        buffer.n(this.b);
        buffer.o(this.c);
        buffer.o(this.a);
    }
}
