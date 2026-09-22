package rs;

import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_388.class */
public class class_388 extends class_360 {
    public class_388(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(61000);
        addSprite(61001, "misc/hs 3");
        a(61002, "misc/hs", 2, 167, 215, "Daily PK leaderboards", -1, 61003, 1);
        a(61003, "misc/hs", 4, 167, 215, 61004);
        a(61005, "misc/hs", 1, 167, 215, "Tournament PK leaderboard", -1, 61006, 1);
        a(61006, "misc/hs", 4, 167, 215, 61007);
        a(61008, "Daily PK Leaderboards", this.a, 2, class_492.e, true);
        a(61009, "Tournament Leaderboard", this.a, 2, class_492.e, true);
        a(61010, "Leaderboard Selection Menu", this.a, 2, class_492.e, true);
        widgetD.k(10);
        widgetD.b(0, 61001, 53, 15);
        widgetD.b(1, 61002, 76, 50);
        widgetD.b(2, 61003, 76, 50);
        widgetD.b(3, 61005, User32.WM_IME_ENDCOMPOSITION, 50);
        widgetD.b(4, 61006, User32.WM_IME_ENDCOMPOSITION, 50);
        widgetD.b(5, 61008, 159, 278);
        widgetD.b(6, 61009, 354, 278);
        widgetD.b(7, 61010, 257, 20);
        widgetD.b(8, 63740, 438, 18);
        widgetD.b(9, 63741, 438, 18);
    }
}
