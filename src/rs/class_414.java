package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_414.class */
public class class_414 extends class_360 {
    public class_414(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(61011);
        addSprite(61012, "misc/hs 5");
        a(61013, "World Tournament Leaderboards", this.a, 2, class_492.e, true);
        a(61014, "<img=14> Top Players", this.a, 2, class_492.e, false);
        a(61015, "<img=16> Top Clans", this.a, 2, class_492.e, false);
        a(61016, "This week", "View weekly leaderboard", this.a, 0, class_492.d, false, true, 45);
        a(61017, "All time", "View all time leaderboard", this.a, 0, class_492.d, false, true, 45);
        c(61018, 2, "gambling/SPRITE");
        c(61019, 1, "gambling/SPRITE");
        a(61020, "This week", "View weekly leaderboard", this.a, 0, class_492.d, false, true, 45);
        a(61021, "All time", "View all time leaderboard", this.a, 0, class_492.d, false, true, 45);
        c(61022, 2, "gambling/SPRITE");
        c(61023, 1, "gambling/SPRITE");
        Widget widgetD2 = d(61024);
        widgetD2.aF = 600;
        widgetD2.P = 220;
        widgetD2.aP = 261;
        widgetD2.bh = 87;
        widgetD2.k(26);
        int i = 5;
        for (int i2 = 0; i2 < 26; i2++) {
            int i3 = 61025 + i2;
            if (i2 % 2 == 0) {
                a(i3, "", this.a, 0, class_492.e, true);
                widgetD2.b(i2, i3, 100, i);
                i += 15;
            } else {
                a(i3, "", this.a, 1, class_492.e, true);
                widgetD2.b(i2, i3, 100, i);
                i += 30;
            }
        }
        Widget widgetD3 = d(61051);
        widgetD3.aF = 600;
        widgetD3.P = 220;
        widgetD3.aP = 261;
        widgetD3.bh = 87;
        widgetD3.k(26);
        int i4 = 5;
        for (int i5 = 0; i5 < 26; i5++) {
            int i6 = 61052 + i5;
            if (i5 % 2 == 0) {
                a(i6, "", this.a, 0, class_492.e, true);
                widgetD3.b(i5, i6, 100, i4);
                i4 += 15;
            } else {
                a(i6, "", this.a, 1, class_492.e, true);
                widgetD3.b(i5, i6, 100, i4);
                i4 += 30;
            }
        }
        widgetD.k(16);
        widgetD.b(0, 61012, 2, 2);
        widgetD.b(1, 61013, User32.VK_ZOOM, 9);
        widgetD.b(2, 61014, 16, 39);
        widgetD.b(3, 61015, aU.hS_, 39);
        widgetD.b(4, 61016, 138, 42);
        widgetD.b(5, 61017, 211, 42);
        widgetD.b(6, 61018, 120, 40);
        widgetD.b(7, 61019, 193, 40);
        widgetD.b(8, 61020, 388, 42);
        widgetD.b(9, 61021, 461, 42);
        widgetD.b(10, 61022, 370, 40);
        widgetD.b(11, 61023, 443, 40);
        widgetD.b(12, 61024, 18, 61);
        widgetD.b(13, 61051, 268, 61);
        widgetD.b(14, 63740, aU.iq_, 10);
        widgetD.b(15, 63741, aU.iq_, 10);
    }
}
