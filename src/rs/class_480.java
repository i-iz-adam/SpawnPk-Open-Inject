package rs;

import com.sun.jna.platform.win32.aW;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_480.class */
public class class_480 extends class_360 {
    public static final int c = 18616;

    public class_480(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetJ = j(c);
        c(60404, 6, "teleport/SPRITE");
        a(60405, "@or1@Name of Boss", this.a, 0, 16751360, true, true);
        a(60406, "@or1@Bosses", this.a, 1, 16751360, true, true);
        a(60407, "@or1@Description", this.a, 1, 16751360, false, true);
        a(60408, "", this.a, 1, 16751360, true, true);
        a(60409, "@or1@Possible drops and rewards", this.a, 1, 16751360, false, true);
        a(60410, "@or1@Boss Teleportation Network", this.a, 2, 16751360, true, true);
        b(60411, 75, 50);
        a(60412, "Teleport #1", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60413, "Teleport #2", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60414, "Teleport #3", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60415, "Teleport #4", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60416, "Teleport #5", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60417, "Teleport #6", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60418, "Teleport #7", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60419, "Teleport #8", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60420, "Teleport #9", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60421, "Teleport #10", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60422, "Teleport #11", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60423, "Teleport #12", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60424, "Teleport #13", "Select this teleport", this.a, 0, class_492.e, true, true, 150);
        a(60448, "teleport/SPRITE", 10, 100, 32, "Teleport to boss", -1, 60449, 1);
        a(60449, "teleport/SPRITE", 11, 100, 32, 60450);
        a(60451, "Teleport <img=149>", this.a, 0, 16751360, true, true);
        Widget widgetD = d(60426);
        widgetD.aF = User32.VK_PLAY;
        widgetD.P = 165;
        widgetD.aP = 123;
        widgetD.bh = 87;
        widgetD.k(17);
        a(60427, "@yel@Information & Stats:", this.a, 0, class_492.e, false, true);
        a(60428, "Combat level: @whi@100", this.a, 0, class_492.e, false, true);
        a(60429, "Wilderness level: @whi@Safe", this.a, 0, class_492.e, false, true);
        a(60430, "Combat zone: @whi@Single", this.a, 0, class_492.e, false, true);
        a(60431, "", this.a, 0, class_492.e, false, true);
        a(60432, "@yel@Available achievements:", this.a, 0, class_492.e, false, true);
        a(60433, "@yel@-@whi@ Placeholder I", this.a, 0, class_492.e, false, true);
        a(60434, "@yel@-@whi@ Placeholder II", this.a, 0, class_492.e, false, true);
        a(60435, "@yel@-@whi@ Placeholder III", this.a, 0, class_492.e, false, true);
        a(60436, "", this.a, 0, class_492.e, false, true);
        a(60437, "Line 11", this.a, 0, class_492.e, false, true);
        a(60438, "Line 12", this.a, 0, class_492.e, false, true);
        a(60439, "Line 13", this.a, 0, class_492.e, false, true);
        a(60440, "Line 14", this.a, 0, class_492.e, false, true);
        a(60441, "Line 15", this.a, 0, class_492.e, false, true);
        a(60442, "Line 16", this.a, 0, class_492.e, false, true);
        a(60443, "Line 17", this.a, 0, class_492.e, false, true);
        for (int i = 0; i < 17; i++) {
            widgetD.b(i, 60427 + i, 0, 3 + (i * 13));
        }
        a(60444, "Safe", this.a, 0, class_492.e, true, true);
        a(60445, "No", this.a, 0, class_492.e, true, true);
        Widget widgetD2 = d(60446);
        widgetD2.aF = 350;
        widgetD2.P = 326;
        widgetD2.aP = 46;
        widgetD2.bh = 87;
        widgetD2.k(1);
        a(60447, (Boolean) false);
        H[60447].P = 6;
        H[60447].ab = 15;
        H[60447].ao = 10;
        for (int i2 = 0; i2 < 12; i2++) {
            H[60447].ax[i2] = 995;
            H[60447].av[i2] = i2 + 1;
        }
        widgetD2.b(0, 60447, 33, 5);
        a(39873, 4, 0, 39874, 14, "teleport/SPRITE", 85, 13, "View full drop table");
        a(39874, 15, "teleport/SPRITE", 85, 13, 39875);
        a(39876, "@yel@View All", this.a, 0, 0, true, true);
        widgetJ.k(31);
        widgetJ.b(0, 60404, 7, 16);
        widgetJ.b(1, 60405, 321, 54);
        widgetJ.b(2, 60406, 73, 51);
        widgetJ.b(3, 60407, aW.aKu, 80);
        widgetJ.b(4, 60408, User32.WM_GESTURE, 183);
        widgetJ.b(5, 60409, 190, 234);
        widgetJ.b(6, 60410, User32.WM_INITMENUPOPUP, 23);
        widgetJ.b(7, 60411, 180, 136);
        widgetJ.b(8, 60412, -3, 75);
        widgetJ.b(9, 60413, -3, 75 + (18 * 1));
        widgetJ.b(10, 60414, -3, 75 + (18 * 2));
        widgetJ.b(11, 60415, -3, 75 + (18 * 3));
        widgetJ.b(12, 60416, -3, 75 + (18 * 4));
        widgetJ.b(13, 60417, -3, 75 + (18 * 5));
        widgetJ.b(14, 60418, -3, 75 + (18 * 6));
        widgetJ.b(15, 60419, -3, 75 + (18 * 7));
        widgetJ.b(16, 60420, -3, 75 + (18 * 8));
        widgetJ.b(17, 60421, -3, 75 + (18 * 9));
        widgetJ.b(18, 60422, -3, 75 + (18 * 10));
        widgetJ.b(19, 60423, -3, 75 + (18 * 11));
        widgetJ.b(20, 60424, -3, 75 + (18 * 12));
        widgetJ.b(21, 60448, 172, 189);
        widgetJ.b(22, 60449, 172, 189);
        widgetJ.b(23, 60451, 222, 199);
        widgetJ.b(24, 60426, User32.WM_UPDATEUISTATE, 101);
        widgetJ.b(25, 60446, 135, 253);
        widgetJ.b(26, 63740, 483, 22);
        widgetJ.b(27, 63741, 483, 22);
        widgetJ.b(28, 39873, 390, 234);
        widgetJ.b(29, 39874, 390, 234);
        widgetJ.b(30, 39876, 426, 235);
    }
}
