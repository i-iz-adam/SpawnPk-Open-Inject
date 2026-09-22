package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_511.class */
public class class_511 implements class_497 {
    int a;
    int b;
    int c;

    public class_511(int i, int i2, int i3) {
        this.a = i2;
        this.b = i;
        this.c = i3;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(132);
        buffer.p(this.b);
        buffer.d(this.a);
        buffer.o(this.c);
    }
}
