package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_535.class */
public class class_535 implements class_497 {
    int a;
    int b;
    int c;

    public class_535(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(87);
        buffer.o(this.a);
        buffer.d(this.b);
        buffer.o(this.c);
    }
}
