package rs;

import com.google.a.l.c;
import com.jacob.com.Dispatch;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_484.class */
public class class_484 extends class_360 {
    public static class_333 c;
    public static class_333 d;

    public class_484(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        c = new class_333("clan/sprite 12");
        d = new class_333("clan/sprite 13");
        Widget widgetD = d(24000);
        addSprite(24001, "clan/sprite 9");
        a(24002, "Clan Wars Setup: Challenging xxxx", this.a, 2, class_492.e, true);
        c(24003, 2, "gambling/SPRITE");
        c(24004, 1, "gambling/SPRITE");
        a(24005, "Allowed", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24006, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24007, 2, "gambling/SPRITE");
        c(24008, 1, "gambling/SPRITE");
        a(24009, "Allowed", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24010, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24011, 2, "gambling/SPRITE");
        c(24012, 1, "gambling/SPRITE");
        a(24013, "Allowed", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24014, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24015, 2, "gambling/SPRITE");
        c(24016, 1, "gambling/SPRITE");
        a(24017, "Allowed", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24018, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24019, 2, "gambling/SPRITE");
        c(24020, 1, "gambling/SPRITE");
        c(24021, 1, "gambling/SPRITE");
        c(24022, 1, "gambling/SPRITE");
        a(24023, "All spellbooks", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24024, "Standard spells", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24025, "Binding only", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24026, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24027, 2, "gambling/SPRITE");
        c(24028, 1, "gambling/SPRITE");
        c(24029, 1, "gambling/SPRITE");
        a(24030, "All allowed", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24031, "Standard prayers", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24032, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24033, 2, "gambling/SPRITE");
        c(24034, 1, "gambling/SPRITE");
        c(24035, 1, "gambling/SPRITE");
        a(24036, "Allowed", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24037, "No Staff of the Dead", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24038, "Disabled", "Select", this.a, 1, class_492.e, false, true, 80);
        c(24039, 2, "gambling/SPRITE");
        c(24040, 1, "gambling/SPRITE");
        a(24041, "Kill 'em all", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24042, "Ignore 5", "Select", this.a, 1, class_492.e, false, true, 80);
        Widget widgetD2 = d(24043);
        widgetD2.k(12);
        widgetD2.P = 141;
        widgetD2.aP = 56;
        widgetD2.aF = 150;
        c(24044, 2, "gambling/SPRITE");
        c(24045, 1, "gambling/SPRITE");
        c(24046, 1, "gambling/SPRITE");
        c(24047, 1, "gambling/SPRITE");
        c(24048, 1, "gambling/SPRITE");
        c(24049, 1, "gambling/SPRITE");
        a(24050, "Last team standing", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24051, "25 kills", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24052, "50 kills", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24053, "100 kills", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24054, "200 kills", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24055, "500 kills", "Select", this.a, 1, class_492.e, false, true, 150);
        int i = 3;
        int i2 = 24044;
        while (i2 <= 24055) {
            if (i2 == 24050) {
                i = 3;
            }
            widgetD2.b(i2 - 24044, i2, i2 >= 24050 ? 20 : 3, i);
            i += 18;
            i2++;
        }
        Widget widgetD3 = d(24056);
        widgetD3.k(21);
        widgetD3.P = 141;
        widgetD3.aP = 60;
        widgetD3.aF = 183;
        c(24057, 2, "gambling/SPRITE");
        c(24058, 1, "gambling/SPRITE");
        c(24059, 1, "gambling/SPRITE");
        c(24060, 1, "gambling/SPRITE");
        c(24061, 1, "gambling/SPRITE");
        c(24062, 1, "gambling/SPRITE");
        c(24063, 1, "gambling/SPRITE");
        c(24064, 1, "gambling/SPRITE");
        c(24065, 1, "gambling/SPRITE");
        c(24066, 1, "gambling/SPRITE");
        c(24067, 1, "gambling/SPRITE");
        a(24068, "Wasteland", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24069, "Plateau", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24070, "Sylvan Glade", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24071, "Forsaken Quarry", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24072, "Turrets", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24073, "Clan Cup Arena", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24074, "Ghastly Swamp", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24075, "Northleach Quell", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24076, "Gridlock", "Select", this.a, 1, class_492.e, false, true, 150);
        a(24077, "Ethereal", "Select", this.a, 1, class_492.e, false, true, 150);
        int i3 = 3;
        int i4 = 24057;
        while (i4 <= 24077) {
            if (i4 == 24068) {
                i3 = 3;
            }
            int i5 = i4 >= 24068 ? 20 : 3;
            if (i4 == 24065 || i4 == 24076 || i4 == 24077 || i4 == 24066 || i4 == 24067) {
                i5 = -500;
            }
            widgetD3.b(i4 - 24057, i4, i5, i3);
            i3 += 18;
            i4++;
        }
        c(24078, 2, "gambling/SPRITE");
        c(24079, 1, "gambling/SPRITE");
        c(24080, 1, "gambling/SPRITE");
        c(24081, 1, "gambling/SPRITE");
        a(24082, "Ignore freezing", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24083, "PJ timer", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24084, "Single spells", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24085, "EdgePvP mode", "Select", this.a, 1, class_492.e, false, true, 80);
        a(24086, "clan/SPRITE", 10, 94, 40, c.h, -1, 24087, 1);
        a(24087, "clan/SPRITE", 10, 94, 40, 24088);
        a(24089, c.h, this.a, 1, class_492.e, true);
        a(24090, "", this.a, 0, class_492.c, true);
        widgetD.k(58);
        widgetD.b(0, 24001, 5, 6);
        widgetD.b(1, 24002, 260, 14);
        widgetD.b(2, 24003, 187, 75);
        widgetD.b(3, 24004, 187, 92);
        widgetD.b(4, 24005, aU.ho_, 75);
        widgetD.b(5, 24006, aU.ho_, 92);
        widgetD.b(6, 24007, 187 + 90, 75);
        widgetD.b(7, 24008, 187 + 90, 92);
        widgetD.b(8, 24009, aU.ho_ + 90, 75);
        widgetD.b(9, 24010, aU.ho_ + 90, 92);
        widgetD.b(10, 24011, 187 + 0, 75 + 61);
        widgetD.b(11, 24012, 187 + 0, 92 + 61);
        widgetD.b(12, 24013, aU.ho_ + 0, 75 + 61);
        widgetD.b(13, 24014, aU.ho_ + 0, 92 + 61);
        widgetD.b(14, 24015, 187 + 90, 75 + 61);
        widgetD.b(15, 24016, 187 + 90, 92 + 61);
        widgetD.b(16, 24017, aU.ho_ + 90, 75 + 61);
        widgetD.b(17, 24018, aU.ho_ + 90, 92 + 61);
        widgetD.b(18, 24019, 187 + 180, 75 + 0);
        widgetD.b(19, 24020, 187 + 180, 92 + 0);
        widgetD.b(20, 24021, 187 + 180, 109 + 0);
        widgetD.b(21, 24022, 187 + 180, 126 + 0);
        widgetD.b(22, 24023, aU.ho_ + 180, 75 + 0);
        widgetD.b(23, 24024, aU.ho_ + 180, 92 + 0);
        widgetD.b(24, 24025, aU.ho_ + 180, 109 + 0);
        widgetD.b(25, 24026, aU.ho_ + 180, 126 + 0);
        widgetD.b(26, 24027, 187 + 180, 75 + 112);
        widgetD.b(27, 24028, 187 + 180, 92 + 112);
        widgetD.b(28, 24029, 187 + 180, 109 + 112);
        widgetD.b(29, 24030, aU.ho_ + 180, 75 + 112);
        widgetD.b(30, 24031, aU.ho_ + 180, 92 + 112);
        widgetD.b(31, 24032, aU.ho_ + 180, 109 + 112);
        widgetD.b(32, 24033, 187 + 0, 75 + 123);
        widgetD.b(33, 24034, Dispatch.p, 92 + 123);
        widgetD.b(34, 24035, 187 + 0, 92 + 123);
        widgetD.b(35, 24036, aU.ho_ + 0, 75 + 123);
        widgetD.b(36, 24037, Dispatch.p, 92 + 123);
        widgetD.b(37, 24038, aU.ho_ + 0, 92 + 123);
        widgetD.b(38, 24039, 187 + 0, 75 + 208);
        widgetD.b(39, 24040, Dispatch.p + 0, (92 + 208) - 1);
        widgetD.b(40, 24041, aU.ho_ + 0, 75 + 208);
        widgetD.b(41, 24042, Dispatch.p + 0, (92 + 208) - 1);
        widgetD.b(42, 24043, 17, 71);
        widgetD.b(43, 24056, 17, 157);
        widgetD.b(44, 24078, 187 - 168, 75 + 173);
        widgetD.b(45, 24079, 187 - 168, 92 + 173);
        widgetD.b(46, 24080, 187 - 168, 109 + 173);
        widgetD.b(47, 24081, 187 - 168, 126 + 173);
        widgetD.b(48, 24082, aU.ho_ - 168, 75 + 173);
        widgetD.b(49, 24083, aU.ho_ - 168, 92 + 173);
        widgetD.b(50, 24084, aU.ho_ - 168, 109 + 173);
        widgetD.b(51, 24085, aU.ho_ - 168, 126 + 173);
        widgetD.b(52, 24086, 354, 261);
        widgetD.b(53, 24087, 354, 261);
        widgetD.b(54, 24089, aU.in_, User32.WM_INITDIALOG);
        widgetD.b(55, 24090, 400, aU.if_);
        widgetD.b(56, 63740, User32.MN_GETHMENU, 14);
        widgetD.b(57, 63741, User32.MN_GETHMENU, 14);
    }
}
