package rs;

import com.sun.jna.platform.win32.aQ;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_415.class */
public class class_415 extends class_360 {
    public class_415(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(27400);
        addSprite(aQ.cL_, "tournament/sprite 0");
        a(56001, "<img=128> SpawnPK World Tournaments <img=128>", this.a, 2, class_492.e, true);
        a(56002, "Next world tournament: @yel@Dharok PK Tournament", this.a, 2, class_492.e, true);
        a(56003, "", this.a, 0, class_492.e, true);
        a(56004, "This tournament's prize will be..", this.a, 0, class_492.e, false);
        a(56005, "@yel@Previous Tournament Winners", this.a, 1, class_492.e, true);
        a(56006, "@yel@Tournament point shop", this.a, 1, class_492.e, true);
        a(56007, (Boolean) false);
        H[56007].P = 4;
        H[56007].ab = 11;
        H[56007].ao = 10;
        H[56007].ax[0] = 16002;
        H[56007].av[0] = 1;
        Widget widgetD2 = d(56008);
        widgetD2.aF = 475;
        widgetD2.P = 255;
        widgetD2.aP = 112;
        widgetD2.bh = 87;
        widgetD2.k(35);
        int i = 0;
        for (int i2 = 0; i2 < 35; i2++) {
            if (i == 2) {
                a(56009 + i2, "", this.a, 0, class_492.e, true);
                i = 0;
            } else if (i == 0) {
                a(56009 + i2, "Random player won @yel@x1 $10.00 bond", this.a, 0, class_492.e, true);
                i++;
            } else {
                a(56009 + i2, "from @or2@Dharok PK Tournament @yel@" + ((i2 + 1) * 6) + " hours ago", this.a, 0, class_492.e, true);
                i++;
            }
            widgetD2.b(i2, 56009 + i2, 131, 6 + (i2 * 13));
        }
        a(56044, "tournament/sprite", 2, 130, 32, "Enter tournament", -1, 56045, 1);
        a(56045, "tournament/sprite", 1, 130, 32, 56046);
        a(56047, "Enter Tournament <img=51>", this.a, 0, class_492.e, true);
        a(56048, "Receive points for placing\\ntop 5 in a tournament", this.a, 0, class_492.e, true);
        a(56049, "tournament/sprite", 2, 130, 32, "Spectate tournament", -1, 56050, 1);
        a(56050, "tournament/sprite", 1, 130, 32, 56051);
        a(56052, "Spectate Tournament", this.a, 0, class_492.e, true);
        a(56053, "fountain/button", 1, 70, 41, "View tournament shop", -1, 56054, 1);
        a(56054, "fountain/button", 2, 70, 41, 56055);
        a(56056, "Shop", this.a, 0, class_492.e, true);
        addSprite(56057, "fountain/coins");
        widgetD.k(22);
        widgetD.b(0, aQ.cL_, 7 + 0, 15 + 0);
        widgetD.b(1, 56001, User32.WM_IME_ENDCOMPOSITION + 0, 19 + 0);
        widgetD.b(2, 56002, 259 + 0, 54 + 0);
        widgetD.b(3, 56003, 258 + 0, 88 + 0);
        widgetD.b(4, 56004, 29 + 0, 135 + 0);
        widgetD.b(5, 56005, 161 + 0, 170 + 0);
        widgetD.b(6, 56006, 411 + 0, 169 + 0 + 42);
        widgetD.b(7, 56007, aU.hT_ + 0, 126 + 0);
        widgetD.b(8, 56008, 30 + 0, 187 + 0);
        widgetD.b(9, 63740, 483, 19);
        widgetD.b(10, 63741, 483, 19);
        widgetD.b(11, 56044, 350, 126);
        widgetD.b(12, 56045, 350, 126);
        widgetD.b(13, 56047, g.c, 137);
        widgetD.b(14, 56048, 409, 276);
        widgetD.b(15, 56049, 350, 168);
        widgetD.b(16, 56050, 350, 168);
        widgetD.b(17, 56052, g.c, 179);
        widgetD.b(18, 56053, 375, 233);
        widgetD.b(19, 56054, 375, 233);
        widgetD.b(20, 56056, 394, 248);
        widgetD.b(21, 56057, 411, User32.VK_OEM_CUSEL);
    }
}
