package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_513.class */
public class class_513 implements class_497 {
    int a;
    int b;
    int c;

    public class_513(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(70);
        buffer.n(this.b);
        buffer.d(this.c);
        buffer.p(this.a);
    }
}
