package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_504.class */
public class class_504 implements class_497 {
    int a;
    int b;

    public class_504(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(131);
        buffer.p(this.a);
        buffer.o(this.b);
    }
}
