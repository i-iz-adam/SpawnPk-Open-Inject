package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_545.class */
public class class_545 implements class_497 {
    int a;
    int b;
    int c;

    public class_545(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(129);
        buffer.o(this.a);
        buffer.d(this.b);
        buffer.o(this.c);
    }
}
