package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aW;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_439.class */
public class class_439 extends class_360 {
    public static int c = 55021;
    public static int d = 55018;
    public static int e = 55015;
    public static int[] f = {c, d, e};
    public static Map<Integer, List<String>> g = new HashMap();
    public static int bG = 1;

    public class_439(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void m(int i) {
        int i2 = -1;
        bG = i;
        if (i == 1) {
            i2 = c;
        } else if (i == 2) {
            i2 = d;
        } else if (i == 3) {
            i2 = e;
        }
        for (int i3 : f) {
            if (i3 != i2) {
                Widget.H[i3].E = new class_333("achievements/sprite 6");
                Widget.H[i3 + 1].E = new class_333("achievements/sprite 6");
            } else {
                Widget.H[i3].E = new class_333("achievements/sprite 5");
                Widget.H[i3 + 1].E = new class_333("achievements/sprite 5");
            }
        }
        for (int i4 = 60412; i4 <= 60424; i4++) {
            if (Widget.H[i4] != null && Widget.H[i4].as != null) {
                Widget.H[i4].as = "";
            }
        }
        int i5 = 60412;
        List<String> list = g.get(Integer.valueOf(i));
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Widget.H[i5].as = it.next();
            i5++;
        }
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetJ = j(18551);
        c(55000, 16, "teleport/SPRITE");
        Widget widgetD = d(55001);
        widgetD.aF = User32.VK_PLAY;
        widgetD.P = 165;
        widgetD.aP = 78;
        widgetD.bh = 87;
        widgetD.k(17);
        for (int i = 0; i < 17; i++) {
            widgetD.b(i, 60427 + i, 0, 3 + (i * 13));
        }
        a(55002, "teleport/button", 1, 91, 41, "Track this activity", -1, 55003, 1);
        a(55003, "teleport/button", 2, 91, 41, 55036);
        a(55004, "Track", this.a, 1, 16751360, false, true);
        a(55005, "Fill up the bar for rewards!", this.a, 1, 16751360, false, true);
        a(55789, "@or1@Daily reward bonus", this.a, 1, 16751360, false, true);
        a(55788, "@or1@Daily Money Making Activities", this.a, 2, 16751360, true, true);
        Widget widgetD2 = d(55006);
        widgetD2.aF = 350;
        widgetD2.P = 325;
        widgetD2.aP = 42;
        widgetD2.bh = 87;
        widgetD2.k(1);
        a(55007, (Boolean) false);
        H[55007].P = 6;
        H[55007].ab = 18;
        H[55007].ao = 10;
        for (int i2 = 0; i2 < 12; i2++) {
            H[55007].ax[i2] = 995;
            H[55007].av[i2] = i2 + 1;
        }
        widgetD2.b(0, 55007, 33, 5);
        c(55790, 12, "teleport/sprite");
        c(55791, 13, "teleport/sprite");
        Widget.H[55791].E = new class_333("teleport/sprite 13", 0, 15);
        a(55792, "0% (0/100)", this.a, 0, 0, true, false);
        a(55793, "Kill 100 green dragons", this.a, 1, 16751360, true, true);
        a(55794, "@or1@Activities", this.a, 1, 16751360, true, true);
        c(55009, 12, "teleport/sprite");
        c(55010, 13, "teleport/sprite");
        Widget.H[55010].E = new class_333("teleport/sprite 13", 0, 15);
        a(55011, "0% (0/100)", this.a, 0, 0, true, false);
        a(55012, "teleport/button", 1, 91, 41, "Teleport to this activity", -1, 55013, 1);
        a(55013, "teleport/button", 2, 91, 41, 55035);
        a(55014, "Teleport", this.a, 1, 16751360, true, true);
        a(55015, 5, 0, 55016, 6, "achievements/SPRITE", 54, 21, "Hard money making tasks");
        a(55016, 5, "achievements/SPRITE", 54, 21, 55017);
        a(55018, 5, 0, 55019, 6, "achievements/SPRITE", 54, 21, "Medium money making tasks");
        a(55019, 5, "achievements/SPRITE", 54, 21, 55020);
        a(55021, 5, 0, 55022, 6, "achievements/SPRITE", 54, 21, "Easy money making tasks");
        a(55022, 5, "achievements/SPRITE", 54, 21, 55023);
        a(55024, "@or1@Easy", this.a, 0, 16751360, false, true);
        a(55025, "@or1@Med.", this.a, 0, 16751360, false, true);
        a(55026, "@or1@Hard", this.a, 0, 16751360, false, true);
        a(55030, "<u=16776960>Location</u>", this.a, 2, 16751360, true, true);
        a(55032, "<img=8> @or2@Lvl. 46 wild <img=8>", this.a, 1, 16751360, true, true);
        a(55031, "<img=53> @or2@Singles <img=53>", this.a, 1, 16751360, true, true);
        addSprite(55027, "teleport/icon 1");
        addSprite(55028, "teleport/icon 2");
        a(55029, "@or1@Activity name", this.a, 0, 16751360, true, true);
        widgetJ.k(50);
        widgetJ.b(0, 55000, 7, 16);
        widgetJ.b(1, 60405, -10321, 54 + 10);
        widgetJ.b(2, 55794, 73, 51 + 10);
        widgetJ.b(3, 60407, aW.aKu, -1000);
        widgetJ.b(4, 60408, User32.WM_GESTURE, 183 + 10);
        widgetJ.b(5, 55789, 190, 165 + 10);
        widgetJ.b(6, 55788, 310, 18 + 10);
        widgetJ.b(7, 60411, 180, 112 + 10 + 7);
        widgetJ.b(8, 60412, -3, 75 + 10);
        widgetJ.b(9, 60413, -3, 75 + (18 * 1) + 10);
        widgetJ.b(10, 60414, -3, 75 + (18 * 2) + 10);
        widgetJ.b(11, 60415, -3, 75 + (18 * 3) + 10);
        widgetJ.b(12, 60416, -3, 75 + (18 * 4) + 10);
        widgetJ.b(13, 60417, -3, 75 + (18 * 5) + 10);
        widgetJ.b(14, 60418, -3, 75 + (18 * 6) + 10);
        widgetJ.b(15, 60419, -3, 75 + (18 * 7) + 10);
        widgetJ.b(16, 60420, -3, 75 + (18 * 8) + 10);
        widgetJ.b(17, 60421, -3, 75 + (18 * 9) + 10);
        widgetJ.b(18, 60422, -3, 75 + (18 * 10) + 10);
        widgetJ.b(19, 60423, -3, 75 + (18 * 11) + 10);
        widgetJ.b(20, 60424, -3, 75 + (18 * 12) + 10);
        widgetJ.b(21, 55012, User32.WM_MENUGETOBJECT, 68);
        widgetJ.b(22, 55013, User32.WM_MENUGETOBJECT, 68);
        widgetJ.b(23, 55014, 348, 81);
        widgetJ.b(24, 63740, 479, (22 + 10) - 5);
        widgetJ.b(25, 63741, 479, (22 + 10) - 5);
        widgetJ.b(26, 55790, 176, (258 - 70) + 10 + 2);
        widgetJ.b(27, 55791, 176, (258 - 70) + 10 + 2);
        widgetJ.b(28, 55792, 325, (260 - 70) + 10 + 2);
        widgetJ.b(29, 55793, 324, 219);
        widgetJ.b(30, 55002, User32.WM_MENUGETOBJECT, 120);
        widgetJ.b(31, 55003, User32.WM_MENUGETOBJECT, 120);
        widgetJ.b(32, 55004, 330, 132);
        widgetJ.b(33, 55005, 189, 249);
        widgetJ.b(34, 55006, 136, aU.hT_);
        widgetJ.b(35, 55015, 107 + 3, 30 - 4);
        widgetJ.b(36, 55016, 107 + 3, 30 - 4);
        widgetJ.b(37, 55018, 59 + 3, 30 - 4);
        widgetJ.b(38, 55019, 59 + 3, 30 - 4);
        widgetJ.b(39, 55021, 11 + 3, 30 - 4);
        widgetJ.b(40, 55022, 11 + 3, 30 - 4);
        widgetJ.b(41, 55024, 21 + 3, 36 - 4);
        widgetJ.b(42, 55025, 69 + 3, 36 - 4);
        widgetJ.b(43, 55026, 114 + 3, 36 - 4);
        widgetJ.b(44, 55030, 446, 79);
        widgetJ.b(45, 55032, 447, 99);
        widgetJ.b(46, 55031, 446, 116);
        widgetJ.b(47, 55027, 301, 78);
        widgetJ.b(48, 55028, 309, 130);
        widgetJ.b(49, 55029, 222, 64);
        Widget widgetD3 = d(55008);
        widgetD3.k(3);
        widgetD3.b(0, 55009, 176 - 80, 6);
        widgetD3.b(1, 55010, 176 - 80, 6);
        widgetD3.b(2, 55011, 325 - 80, 8);
    }
}
