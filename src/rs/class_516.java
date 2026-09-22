package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_516.class */
public class class_516 implements class_497 {
    int a;
    int b;
    int c;

    public class_516(int i, int i2, int i3) {
        this.b = i;
        this.a = i2;
        this.c = i3;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(236);
        buffer.n(this.b);
        buffer.d(this.a);
        buffer.n(this.c);
    }
}
