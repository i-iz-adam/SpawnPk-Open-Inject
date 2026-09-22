package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_404.class */
public class class_404 extends class_360 {
    public static class_553 c = new class_405();
    public static final int d = 50;
    public static class_338[] e;
    public static Widget f;
    public static int g;
    public static int bG;
    public static int bH;

    public class_404(class_338[] class_338VarArr) {
        super(class_338VarArr);
        e = class_338VarArr;
    }

    public static void k(int i, String str) {
        Widget.H[40405 + i].as = str;
    }

    public static void b(int i, String str, boolean z) {
        int i2 = g;
        g = i2 + 1;
        if (z) {
            a(i2, str, "Select", e, i, class_492.d, false, true, 125);
            Widget.H[i2].bp = class_492.c;
        } else {
            a(i2, str, e, i, class_492.e);
        }
        Widget widget = f;
        int i3 = bG;
        bG = i3 + 1;
        widget.b(i3, i2, 6, bH);
        bH += 17;
        if (i == 1) {
            bH += 3;
        }
        if (i == 2) {
            bH += 5;
        }
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(40403);
        c(40402, 8, "gameframe/SPRITE");
        f = j(40404);
        f.k(50);
        bH = 10;
        bG = 0;
        g = 40405;
        int i = 50 - bG;
        for (int i2 = 0; i2 < i; i2++) {
            b(0, "", false);
        }
        f.P = 168;
        f.aP = 225 - 24;
        f.aF = aU.nE;
        widgetD.k(6);
        int i3 = 0 + 1;
        widgetD.b(0, 40402, 0, 31 + 24);
        int i4 = i3 + 1;
        widgetD.b(i3, 16022, 0, 28 + 24);
        int i5 = i4 + 1;
        widgetD.b(i4, 16022, 0, 255);
        int i6 = i5 + 1;
        widgetD.b(i5, 16023, 4, User32.VK_ZOOM);
        int i7 = i6 + 1;
        widgetD.b(i6, 32000, 0, 0);
        int i8 = i7 + 1;
        widgetD.b(i7, 40404, 6, 30 + 24);
    }
}
