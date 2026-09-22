package rs;

import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_412.class */
public class class_412 extends class_360 {
    private static final int c = 18516;
    private static final int d = 18517;
    private static final int e = 18518;

    public class_412(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(c);
        c(63739, 0, "teleport/SPRITE");
        a(63740, 1, 0, 63741, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(63741, 2, "teleport/SPRITE", 46, 20, 63742);
        b(18705, 75, 50);
        a(63745, "teleport/SPRITE", 3, 100, 32, "Teleport", -1, 63746, 1);
        a(63746, "teleport/SPRITE", 4, 100, 32, 63747);
        a(18519, "Teleport <img=149>", this.a, 0, 16751360, true, true);
        a(18520, "Title of Location", this.a, 0, 16751360, true, true);
        widgetD.ak = new int[10];
        widgetD.al = new int[10];
        widgetD.ba = new int[10];
        widgetD.b(0, 63739, 5, 20);
        widgetD.b(1, 63740, 473 + 5, 8 + 20);
        widgetD.b(2, 63741, 473 + 5, 8 + 20);
        widgetD.b(3, 18705, 5 + 140, 20 + 80);
        widgetD.b(4, 63745, g.p + 5, 253 + 20);
        widgetD.b(5, 63746, g.p + 5, 253 + 20);
        widgetD.b(6, 18519, 415 + 5, 263 + 20);
        widgetD.b(7, 18520, 175 + 5, 134 + 20);
        widgetD.b(8, d, 341 + 5, 30 + 20);
        widgetD.b(9, e, 45 + 5, 157 + 20);
        h();
    }

    private void h() {
        Widget widgetD = d(d);
        widgetD.aF = User32.VK_PLAY;
        widgetD.P = 125;
        widgetD.aP = 215;
        widgetD.bh = 87;
        for (int i = 0; i < 10; i++) {
            a(18521 + i, "Teleport @yel@#" + i, "Select this teleport", this.a, 0, class_492.e, false, false, 125);
        }
        widgetD.ak = new int[10];
        widgetD.al = new int[10];
        widgetD.ba = new int[10];
        for (int i2 = 0; i2 < 10; i2++) {
            widgetD.b(i2, 18521 + i2, 10, 5 + (15 * i2));
        }
        Widget widgetD2 = d(e);
        widgetD2.aF = User32.VK_PLAY;
        widgetD2.P = 260;
        widgetD2.aP = 120;
        widgetD2.bh = 87;
        int i3 = 18521 + 10;
        for (int i4 = 0; i4 < 15; i4++) {
            a(i3 + i4, "Line " + i4 + " blahblahblahblahblahblahblah" + " blahblahblahblahblahblahblah".length(), "Select this teleport", this.a, 0, class_492.c, false, false, 125);
        }
        widgetD2.ak = new int[15];
        widgetD2.al = new int[15];
        widgetD2.ba = new int[15];
        for (int i5 = 0; i5 < 15; i5++) {
            widgetD2.b(i5, i3 + i5, 10, 5 + (15 * i5));
        }
    }
}
