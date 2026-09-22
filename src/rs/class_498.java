package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_498.class */
public class class_498 implements class_497 {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public class_498(int i, int i2, int i3, int i4, int i5, int i6) {
        this.d = i2;
        this.e = i3;
        this.f = i5;
        this.b = i4;
        this.c = i;
        this.a = i6;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(192);
        buffer.d(this.c);
        buffer.d(this.d);
        buffer.p(this.e);
        buffer.n(this.b);
        buffer.p(this.f);
        buffer.d(this.a);
    }
}
