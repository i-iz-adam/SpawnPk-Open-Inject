package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_383.class */
public class class_383 extends class_360 {
    public static final int c = 100;

    public class_383(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(51200);
        addSprite(51201, "misc/matcher 1");
        Widget widgetD2 = d(51202);
        widgetD2.aF = aU.sA;
        widgetD2.P = 477;
        widgetD2.aP = 224;
        widgetD2.k(100);
        int i = 51203;
        for (int i2 = 0; i2 < 100; i2++) {
            int iD = 5 + Client.d(100);
            String str = "<col=0xB9B855>Test" + (i2 + 1) + " <tab=360>@lre@(" + Client.d(iD) + "/" + iD + " logins)";
            if (Client.d(10) == 0) {
                str = "@red@[BANNED]</col> " + str;
            } else if (Client.d(10) == 0) {
                str = (Client.d(2) == 0 ? "@gre@[ONLINE]</col> " : "@gre@[ONLINE (Non-match)]</col> ") + str;
            }
            int i3 = i;
            i++;
            b(i3, str, "Action", this.a, 1, class_492.d, false, true, 500);
            widgetD2.b(i2, i - 1, 3, 3 + (i2 * 16));
        }
        int i4 = i;
        int i5 = i + 1;
        a(i4, "Player IP / UID Matcher", this.a, 2, class_492.e, true, true);
        int i6 = i5 + 1;
        a(i5, "@whi@IP Address: @gre@Not banned", this.a, 0, class_492.c, false, true);
        int i7 = i6 + 1;
        a(i6, "@whi@UID: @gre@Not banned", this.a, 0, class_492.c, false, true);
        int i8 = i7 + 1;
        int i9 = i8 + 1;
        a(i7, "misc/login", 2, 130, 27, "Ban all", -1, i8, 1);
        int i10 = i9 - 1;
        int i11 = i9 + 1;
        a(i10, "misc/login", 3, 130, 27, i9);
        int i12 = i11 + 1;
        a(i11, "Ban ALL", this.a, 1, class_492.e, true, true);
        int i13 = i12 + 1;
        b(i12, "<tab=17>@yel@Order by total matches", "Order by total matches", this.a, 0, class_492.e, false, true, 130);
        int i14 = i13 + 1;
        c(i13, 2, "gambling/SPRITE");
        int i15 = i14 + 1;
        b(i14, "<tab=17>@yel@Order by most recent", "Order by recent matches", this.a, 0, class_492.e, false, true, 150);
        int i16 = i15 + 1;
        c(i15, 1, "gambling/SPRITE");
        int i17 = i16 + 1;
        b(i16, "<img=39>@yel@ Search new name", "Search a new name", this.a, 0, class_492.e, false, true, 150);
        int i18 = i17 + 1;
        a(i17, "drops/sprite", 3, 17, 17, "Go back", -1, i18, 1);
        int i19 = i18 + 1;
        int i20 = i19 + 1;
        a(i18, "drops/sprite", 4, 17, 17, i19);
        a(52050, "@whi@Geolocation: @gre@N/A", this.a, 0, class_492.c, false, true);
        a(52051, "misc/login", 2, 130, 27, "Ban this IP/UID", -1, 52052, 1);
        a(52052, "misc/login", 3, 130, 27, 52053);
        a(52054, "Ban *this* IP/UID", this.a, 1, class_492.e, true, true);
        widgetD.k(19);
        widgetD.b(0, 51201, 0, 0);
        widgetD.b(1, 51202, 13, 52);
        widgetD.b(2, i4, 256, 8);
        widgetD.b(3, i5, 14, 285);
        widgetD.b(4, i6, 14, aU.ib_);
        widgetD.b(5, i7, 377, User32.WM_INITMENUPOPUP);
        widgetD.b(6, i7 + 1, 377, User32.WM_INITMENUPOPUP);
        widgetD.b(7, i11, 440, User32.WM_MENUSELECT);
        widgetD.b(8, i12, 224 + 12, 36);
        widgetD.b(9, i12 + 1, (224 + 12) - 2, 34);
        widgetD.b(10, i14, 224 + 12 + 140, 36);
        widgetD.b(11, i14 + 1, ((224 + 12) - 2) + 140, 34);
        widgetD.b(12, i16, 10, 36);
        widgetD.b(13, i17, 7, 7);
        widgetD.b(14, i17 + 1, 7, 7);
        widgetD.b(15, 52050, 14, CGL.kCGLCEMPEngine);
        widgetD.b(16, 52051, 377, aU.if_);
        widgetD.b(17, 52052, 377, aU.if_);
        widgetD.b(18, 52054, 440, 311);
    }
}
