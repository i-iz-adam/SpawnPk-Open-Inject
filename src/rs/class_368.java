package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_368.class */
public class class_368 extends class_360 {
    public static Map<Integer, List<String>> c = new HashMap();
    public static int d = 50247;
    public static int e = 50244;
    public static int f = 50241;
    public static int[] g = {d, e, f};
    public static class_333 bG = null;
    public static class_333 bH = null;
    public static int bI = 1;
    public static int bJ = User32.WM_MENUSELECT;
    public static int bK = 0;
    public static int bL = -1;

    public class_368(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void m(int i) {
        bK = i;
        if (i < 2) {
            bJ = 0;
        } else {
            bJ = 285;
        }
        if (i == 2) {
            bL = 150;
        }
    }

    public static void h() {
        int i;
        int i2;
        if (Client.cH != 31244 || bK == 0) {
            return;
        }
        if (Configuration.ai == class_151.b) {
            i = 283 + ((Client.ah / 2) - 230);
            i2 = 197 + ((Client.ai / 2) - 356);
        } else {
            i = 283 + 4;
            i2 = 197 + 4;
        }
        int i3 = 16776960;
        if (!class_194.a() && bJ < 285) {
            bJ += 10;
            if (bJ > 285) {
                bJ = 285;
            }
        }
        if (bJ >= 285 && bK >= 2) {
            i3 = bK == 2 ? bk.ao : 16718848;
        }
        class_210.b(13, i, i2, i3, bJ, 255);
        if (bJ < 285 || bK < 2) {
            Client.gl.c("@bla@Preparing enchantment..", i2 + 144, i + 11, class_492.c, -1);
            return;
        }
        if (bK != 2) {
            Client.gl.c(bK == 2 ? "<img=24> @dgr@Success! Congratulations! <img=24>" : "@bla@Enchantment failed!", i2 + 144, i + 11, class_492.c, -1);
            return;
        }
        int i4 = 16775680;
        int i5 = 150 - Client.bN;
        if (i5 < 50) {
            i4 = bk.aS + (5 * i5);
        } else if (i5 < 100) {
            i4 = 16711935 - (327680 * (i5 - 50));
        } else if (i5 < 150) {
            i4 = (255 + (327680 * (i5 - 100))) - (5 * (i5 - 100));
        }
        Client.gh.a(150 - bL, "Congratulations!", Client.gg, i + 11, i2 + 144, i4);
        Client.gh.a(150 - bL, "Congratulations!", Client.gg, i + 11 + 1, i2 + 144 + 1, i4);
        if (bL <= 1 || class_194.a()) {
            return;
        }
        bL--;
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(31244);
        c(49999, 17, "fountain/sprite");
        a(49998, "@or1@Item Enchantment Chest", this.a, 2, 16751360, true, true);
        a(49997, "Enchantments", this.a, 2, 16751360, false, true);
        a(49996, "Item name", this.a, 2, 16751360, false, true);
        a(49995, "Categories", this.a, 2, 16751360, false, true);
        a(49991, "fountain/SPRITE", 27, User32.VK_PLAY, 34, "Enchant", -1, 49990, 1);
        a(49990, "fountain/SPRITE", 28, User32.VK_PLAY, 34, 49989);
        a(49988, "Attempt Enchantment", this.a, 2, 16751360, true, true);
        c(49987, 2, "fountain/icon");
        Widget widgetD2 = d(50241);
        widgetD2.au = 50241;
        widgetD2.W = new String[5];
        widgetD2.K = new int[20];
        widgetD2.av = new int[30];
        widgetD2.ax = new int[30];
        widgetD2.ar = new int[20];
        widgetD2.ak = new int[0];
        widgetD2.al = new int[0];
        widgetD2.ba = new int[0];
        widgetD2.t = false;
        widgetD2.ab = 24;
        widgetD2.ao = 24;
        widgetD2.aP = 1;
        widgetD2.P = 1;
        widgetD2.aG = 2;
        a(50242, 5, "achievements/SPRITE", 54, 21, 50243);
        a(50245, "Category", this.a, 1, 16751360, false, true);
        a(50248, "", this.a, 0, 16751360, true, true);
        a(50249, "Success chance: @gre@N/A", this.a, 1, 16751360, false, true);
        a(50250, "Select a category", this.a, 2, 16751360, false, true);
        a(50251, "", this.a, 1, 16751360, false, true);
        a(50252, "Ingredients @yel@(cost to attempt)", this.a, 1, 16751360, false, true);
        Widget widgetD3 = d(49994);
        widgetD3.aF = UnixStat.DEFAULT_FILE_PERM;
        widgetD3.P = aU.ib_;
        widgetD3.aP = 87;
        a(49993, (Boolean) false);
        H[49993].ab = 15;
        H[49993].ao = 10;
        H[49993].P = 6;
        H[49993].aP = 5;
        int i = H[49993].P * H[49993].aP;
        H[49993].ax = new int[i];
        H[49993].av = new int[i];
        widgetD3.k(1);
        widgetD3.b(0, 49993, 27, 8);
        Widget widgetD4 = d(49992);
        widgetD4.au = 49992;
        widgetD4.W = new String[5];
        widgetD4.K = new int[20];
        widgetD4.av = new int[30];
        widgetD4.ax = new int[30];
        widgetD4.ar = new int[20];
        widgetD4.ak = new int[0];
        widgetD4.al = new int[0];
        widgetD4.ba = new int[0];
        widgetD4.t = false;
        widgetD4.ab = 24;
        widgetD4.ao = 24;
        widgetD4.aP = 5;
        widgetD4.P = 6;
        widgetD4.aG = 2;
        Widget widgetD5 = d(49986);
        widgetD5.aF = UnixStat.DEFAULT_FILE_PERM;
        widgetD5.P = 170;
        widgetD5.aP = aU.hm_;
        widgetD5.k(16);
        for (int i2 = 49970; i2 <= 49985; i2++) {
            int i3 = i2 - 49970;
            a(i2, "Category #" + (i3 + 1), "Select enchantment", this.a, 2, class_492.g, false, false, 100);
            widgetD5.b(i3, i2, 40, 4 + (i3 * 18));
        }
        Widget widgetD6 = d(50244);
        widgetD6.aF = 845;
        widgetD6.P = 170;
        widgetD6.aP = aU.hm_;
        widgetD6.k(1);
        a(50253, (Boolean) false, 60);
        H[50253].ab = 10;
        H[50253].ao = 10;
        H[50253].W = new String[]{"Select item", null, null, null, null};
        H[50253].P = 3;
        H[50253].aP = 20;
        widgetD6.k(61);
        int i4 = 44;
        int i5 = 8;
        bG = new class_333("fountain/sprite 30");
        bH = new class_333("fountain/sprite 29");
        int i6 = 0;
        while (i6 < 60) {
            a(50254 + i6, i6 == 0 ? bG : bH);
            widgetD6.b(i6, 50254 + i6, i4 - 3, i5 - 3);
            i4 += 42;
            if (i4 == 170) {
                i4 = 44;
                i5 += 42;
            }
            i6++;
        }
        widgetD6.b(60, 50253, 44, 8);
        a(50314, "drops/button", 1, 100, 32, "Search by name", -1, 50315, 1);
        a(50315, "drops/button", 2, 100, 32, 50316);
        a(50317, "Search item", this.a, 0, 16751360, false, true);
        c(50318, 0, "drops/icon");
        a(50319, "fountain/sprite", 31, 30, 19, "Back", -1, 50320, 1);
        a(50320, "fountain/sprite", 32, 30, 19, 50321);
        a(50322, "Back @yel@(Categories)", this.a, 1, 16751360, false, true);
        c(50323, 12, "teleport/sprite");
        c(50324, 13, "teleport/sprite");
        c(50325, 17, "teleport/sprite");
        c(50326, 18, "teleport/sprite");
        Widget.H[50324].E = new class_333("teleport/sprite 13", 0, 15);
        Widget.H[50325].E = new class_333("teleport/sprite 17", 0, 15);
        Widget.H[50326].E = new class_333("teleport/sprite 18", 0, 15);
        widgetD.k(27);
        widgetD.b(0, 49999, 10, 19);
        widgetD.b(1, 49998, 268, 26);
        widgetD.b(2, 49997, 27, 83);
        widgetD.b(3, 49996, (User32.WM_GESTURE - 40) - 3, 85 - 30);
        widgetD.b(4, 49995, -2264, 208);
        widgetD.b(5, 49994, 172, 119);
        widgetD.b(6, 49992, 195, 56);
        widgetD.b(7, 49991, 215, User32.VK_OEM_COPY);
        widgetD.b(8, 49990, 215, User32.VK_OEM_COPY);
        widgetD.b(9, 49987, -5000, 0);
        widgetD.b(10, 49988, 342, User32.VK_NONAME);
        widgetD.b(11, 50244, -14, 101);
        widgetD.b(12, 65418, g.f, 25);
        widgetD.b(13, 65419, g.f, 25);
        widgetD.b(14, 50241, -451, 56);
        widgetD.b(15, 50245, User32.VK_OEM_WSCTRL, 73);
        widgetD.b(16, 50248, 264, 223);
        widgetD.b(17, 50249, 220, aU.hx_);
        widgetD.b(18, 50251, 373, 100);
        widgetD.b(19, 50252, 221, 101);
        widgetD.b(20, 50322, 69, 59);
        widgetD.b(21, 50319, 31, 57);
        widgetD.b(22, 50320, 31, 57);
        widgetD.b(23, 50323, 196, 282);
        widgetD.b(24, 50324, 196, 282);
        widgetD.b(25, 50325, 196, 282);
        widgetD.b(26, 50326, 196, 282);
        Widget widgetD7 = d(31243);
        b(50327, 33, "fountain/sprite", "Select category");
        a(50328, "@yel@Armor", this.a, 1, 16751360, true, true);
        b(50329, 33, "fountain/sprite", "Select category");
        a(50330, "@yel@Weapons", this.a, 1, 16751360, true, true);
        b(50331, 33, "fountain/sprite", "Select category");
        a(50332, "@yel@Capes", this.a, 1, 16751360, true, true);
        b(50333, 33, "fountain/sprite", "Select category");
        a(50334, "@yel@Trinkets & Tools", this.a, 1, 16751360, true, true);
        b(50335, 33, "fountain/sprite", "Select category");
        a(50336, "@yel@Pets/Accessories", this.a, 1, 16751360, true, true);
        b(50337, 33, "fountain/sprite", "Select category");
        a(50338, "@yel@Cosmetics", this.a, 1, 16751360, true, true);
        b(50339, 33, "fountain/sprite", "Select category");
        a(50340, "@yel@Miscellaneous", this.a, 1, 16751360, true, true);
        widgetD7.k(39);
        widgetD7.b(0, 49999, 10, 19);
        widgetD7.b(1, 49998, 268, 26);
        widgetD7.b(2, 49995, 27, 83);
        widgetD7.b(3, 49996, (User32.WM_GESTURE - 40) - 3, 85 - 30);
        widgetD7.b(4, 49995, -2264, 208);
        widgetD7.b(5, 49994, 172, 119);
        widgetD7.b(6, 49992, 195, 56);
        widgetD7.b(7, 49991, 215, User32.VK_OEM_COPY);
        widgetD7.b(8, 49990, 215, User32.VK_OEM_COPY);
        widgetD7.b(9, 49988, 342, User32.VK_NONAME);
        widgetD7.b(10, 65418, g.f, 25);
        widgetD7.b(11, 65419, g.f, 25);
        widgetD7.b(12, 50248, 264, 223);
        widgetD7.b(13, 50249, 220, aU.hx_);
        widgetD7.b(14, 50251, 373, 100);
        widgetD7.b(15, 50252, 221, 101);
        widgetD7.b(16, 50314, 22, 48);
        widgetD7.b(17, 50315, 22, 48);
        widgetD7.b(18, 50317, 49, 59);
        widgetD7.b(19, 50318, 28, 55);
        widgetD7.b(20, 50323, 196, 282);
        widgetD7.b(21, 50324, 196, 282);
        widgetD7.b(22, 50325, 196, 282);
        widgetD7.b(23, 50326, 196, 282);
        widgetD7.b(24, 50245, User32.VK_OEM_WSCTRL, 73);
        widgetD7.b(25, 50327, 37, 111);
        widgetD7.b(26, 50328, 98, 114);
        widgetD7.b(27, 50329, 37, 109 + 27);
        widgetD7.b(28, 50330, 98, 112 + 27);
        widgetD7.b(29, 50331, 37, 109 + (27 * 2));
        widgetD7.b(30, 50332, 98, 112 + (27 * 2));
        widgetD7.b(31, 50333, 37, 109 + (27 * 3));
        widgetD7.b(32, 50334, 98, 112 + (27 * 3));
        widgetD7.b(33, 50335, 37, 109 + (27 * 4));
        widgetD7.b(34, 50336, 98, 112 + (27 * 4));
        widgetD7.b(35, 50337, 37, 109 + (27 * 5));
        widgetD7.b(36, 50338, 98, 112 + (27 * 5));
        widgetD7.b(37, 50339, 37, 109 + (27 * 6));
        widgetD7.b(38, 50340, 98, 112 + (27 * 6));
    }
}
