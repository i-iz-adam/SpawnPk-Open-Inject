package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_503.class */
public class class_503 implements class_497 {
    int a;
    int b;
    int c;
    int d;

    public class_503(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // rs.class_497
    public void a(Buffer buffer) {
        buffer.a(User32.VK_OEM_PA3);
        buffer.d(this.a);
        buffer.o(this.b);
        buffer.d(this.c);
        buffer.o(this.d);
    }
}
