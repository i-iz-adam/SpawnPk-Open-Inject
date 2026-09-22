package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_376.class */
public class class_376 extends class_360 {
    public static class_333 c = null;
    public static class_333 d = null;

    public class_376(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(60600);
        c = new class_333("fountain/glow");
        d = new class_333("fountain/glow2");
        addSprite(60601, "fountain/event 1");
        a(60602, (Boolean) true);
        H[60602].K = new int[175];
        H[60602].av = new int[175];
        H[60602].ax = new int[175];
        H[60602].ar = new int[175];
        H[60602].P = 7;
        H[60602].aP = 25;
        H[60602].ab = 32;
        H[60602].ao = 16;
        Widget widgetD2 = d(60603);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = 1000;
        widgetD2.P = 449;
        widgetD2.aP = 185;
        widgetD2.bh = 87;
        widgetD2.k(1);
        widgetD2.b(0, 60602, 12, 10);
        a(60611, (Boolean) true);
        H[60611].K = new int[4];
        H[60611].av = new int[4];
        H[60611].ax = new int[4];
        H[60611].ar = new int[4];
        H[60611].P = 2;
        H[60611].aP = 2;
        H[60611].ab = 32;
        H[60611].ao = 16;
        a(60612, (Boolean) true);
        H[60612].K = new int[4];
        H[60612].av = new int[4];
        H[60612].ax = new int[4];
        H[60612].ar = new int[4];
        H[60612].P = 2;
        H[60612].aP = 2;
        H[60612].ab = 17;
        H[60612].ao = 16;
        a(60613, (Boolean) true);
        H[60613].K = new int[4];
        H[60613].av = new int[4];
        H[60613].ax = new int[4];
        H[60613].ar = new int[4];
        H[60613].P = 2;
        H[60613].aP = 2;
        H[60613].ab = 32;
        H[60613].ao = 16;
        a(60604, "fountain/button", 1, 70, 41, "Exchange", -1, 60605, 1);
        a(60605, "fountain/button", 2, 70, 41, 60606);
        addSprite(60607, "fountain/icon 3");
        a(60608, "Roll", this.a, 1, class_492.e);
        a(60609, "Tier I Prize", this.a, 2, class_492.e, false, true);
        a(60610, "Roll all of the items in\\nthe tier for a prize!", this.a, 0, class_492.e, false, true);
        a(60617, 5, 0, 60618, 4, "fountain/event", 100, 21, "Event Chest Tier I");
        a(60618, 3, "fountain/event", 100, 21, 60619);
        a(60620, "@or1@Tier I", this.a, 0, 16751360, false, true);
        a(60621, 5, 0, 60622, 4, "fountain/event", 100, 21, "Event Chest Tier II");
        a(60622, 3, "fountain/event", 100, 21, 60623);
        a(60624, "@or1@Tier II", this.a, 0, 16751360, false, true);
        a(60616, "Tier I - @yel@Halloween Event 2020", this.a, 2, class_492.e, true);
        a(60625, "@yel@0 / 25 rolls @or1@(0 / 50,000 tokens)", this.a, 0, class_492.e, true, true);
        a(60626, "fountain/sprite", 16, 120, 35, "Enter next tier", -1, 60628, 1);
        a(60628, "fountain/sprite", 15, 120, 35, 60629);
        a(60630, "@yel@Event Guide", this.a, 1, class_492.e, true);
        a(60631, "fountain/sprite", 16, 120, 35, "Reset event items", -1, 60632, 1);
        a(60632, "fountain/sprite", 15, 120, 35, 60633);
        a(60634, "Reset exchange", this.a, 1, class_492.e, true);
        widgetD.k(24);
        widgetD.b(0, 60601, 12, 11);
        widgetD.b(1, 60603, 27, 47);
        widgetD.b(2, 60604, 191, 240);
        widgetD.b(3, 60605, 191, 240);
        widgetD.b(4, 60608, 204, User32.VK_NONAME);
        widgetD.b(5, 60607, 231, User32.VK_ZOOM);
        widgetD.b(6, 60611, User32.WM_INITDIALOG, 246);
        widgetD.b(7, 60612, 394, 246);
        widgetD.b(8, 63740, 476, 14);
        widgetD.b(9, 63741, 476, 14);
        widgetD.b(10, 60616, 344, 23);
        widgetD.b(11, 60625, 331, 306);
        widgetD.b(12, 60626, 24, 282);
        widgetD.b(13, 60628, 24, 282);
        widgetD.b(14, 60630, 85, User32.WM_MENUDRAG);
        widgetD.b(15, 60609, 67, User32.VK_OEM_CUSEL);
        widgetD.b(16, 60610, 67, 256);
        widgetD.b(17, 60613, 27, User32.VK_OEM_COPY);
        widgetD.b(18, 60621, 118, 27);
        widgetD.b(19, 60622, 118, 27);
        widgetD.b(20, 60624, 127, 33);
        widgetD.b(21, 60617, 18, 27);
        widgetD.b(22, 60618, 18, 27);
        widgetD.b(23, 60620, 27, 33);
    }
}
