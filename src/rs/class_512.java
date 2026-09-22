package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_512.class */
public class class_512 implements class_497 {
    int a;
    int b;
    int c;

    public class_512(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(User32.VK_NONAME);
        buffer.p(this.a);
        buffer.n(this.b);
        buffer.o(this.c);
    }
}
