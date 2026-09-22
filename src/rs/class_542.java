package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_542.class */
public class class_542 implements class_497 {
    int a;
    int b;
    int c;

    public class_542(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(145);
        buffer.o(this.a);
        buffer.o(this.b);
        buffer.o(this.c);
    }
}
