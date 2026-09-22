package rs;

import com.google.a.l.c;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_483.class */
public class class_483 extends class_360 {
    public class_483(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(34000);
        addSprite(34001, "clan/sprite 11");
        Widget widgetD2 = d(34002);
        widgetD2.P = 310;
        widgetD2.aP = 200;
        widgetD2.aF = 400;
        widgetD2.k(1);
        a(34003, "", this.a, 1, class_492.e, true);
        widgetD2.b(0, 34003, 160, 2);
        a(34004, "clan/SPRITE", 10, 94, 40, c.h, -1, 34006, 1);
        a(34005, "clan/SPRITE", 10, 94, 40, 34006);
        a(34007, c.h, this.a, 1, class_492.e, true);
        a(34008, "", this.a, 0, class_492.c, true);
        widgetD.k(9);
        widgetD.b(0, 34001, 85, 16);
        widgetD.b(1, 24002, 260, 25);
        widgetD.b(2, 34002, 99, 56);
        widgetD.b(3, 34004, 213, 257);
        widgetD.b(4, 34005, 213, 257);
        widgetD.b(5, 34007, 261, User32.WM_IME_STARTCOMPOSITION);
        widgetD.b(6, 34008, 263, aU.ia_);
        widgetD.b(7, 63740, 410, 24);
        widgetD.b(8, 63741, 410, 24);
    }
}
