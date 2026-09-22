package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_469.class */
public class class_469 extends class_310 {
    private final int h;
    private final int i;

    @Override // rs.class_306
    public void a() {
        boolean z = false;
        Widget widgetL = Widget.l(this.h);
        int i = (widgetL.bA - widgetL.V) + 1;
        int i2 = widgetL.P + (widgetL.P / 3);
        for (int i3 = 0; i3 < this.i; i3++) {
            class_210.c(z ? 4274480 : 3814187, i, i2, 128, 255, this.e);
            z = !z;
            i += 18;
        }
    }

    public class_469(int i, int i2) {
        this.h = i;
        this.i = i2;
    }
}
