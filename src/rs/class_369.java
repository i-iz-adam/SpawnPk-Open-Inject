package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_369.class */
public class class_369 extends class_360 {
    public class_369(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetJ = j(aU.UY);
        c(aU.UZ, 7, "equipment/CUSTOM");
        a(15210, "equipment/CUSTOM", 8, 21, 21, "Close", User32.VK_PLAY, 15211, 3);
        a(15211, "equipment/CUSTOM", 9, 21, 21, 15212);
        a(48087, "equipment/CUSTOM", 10, 21, 21, "View bonuses / unlocks", -1, 48088, 1);
        a(48088, "equipment/CUSTOM", 11, 21, 21, 48089);
        a(15111, "Equip Your Character...", this.a, 2, 14983494, false, true);
        a(15112, "Attack bonus", this.a, 2, 14983494, false, true);
        a(15113, "Defence bonus", this.a, 2, 14983494, false, true);
        a(15114, "Other bonuses", this.a, 2, 14983494, false, true);
        a(15115, "Drop rate bonus:", this.a, 1, 14983494, false, true);
        a(15116, "Blood money bonus:", this.a, 1, 14983494, false, true);
        a(15117, "Range strength:", this.a, 1, 14983494, false, true);
        a(15118, "Magic damage:", this.a, 1, 14983494, false, true);
        a(15119, "Risk value: ", this.a, 1, 14983494, false, true);
        for (int i = 1675; i <= 1684; i++) {
            a(i, this.a, 1);
        }
        a(1686, this.a, 1);
        a(1687, this.a, 1);
        h(15125);
        widgetJ.k(51);
        widgetJ.b(0, aU.UZ, 4, 20);
        widgetJ.b(1, 15210, 476, 29);
        widgetJ.b(2, 15211, 476, 29);
        widgetJ.c(3, 15111, -100, -100);
        int i2 = 4;
        int i3 = 69;
        for (int i4 = 1675; i4 <= 1679; i4++) {
            widgetJ.c(i2, i4, 20, i3);
            i2++;
            i3 += 14;
        }
        widgetJ.c(9, 1680, 20, 161);
        widgetJ.c(10, 1681, 20, 177);
        widgetJ.c(11, 1682, 20, 192);
        widgetJ.c(12, 1683, 20, aU.hq_);
        widgetJ.c(13, 1684, 20, 221);
        widgetJ.c(14, 1686, 20, User32.WM_SYSCHAR);
        widgetJ.b(15, 15125, 170, 200);
        widgetJ.c(16, 15112, 16, 55);
        widgetJ.c(17, 1687, 20, 306);
        widgetJ.c(18, 15113, 16, 147);
        widgetJ.c(19, 15114, 16, 248);
        widgetJ.b(20, aU.rw, 399, 97);
        widgetJ.b(21, aU.rx, 399, 163);
        widgetJ.b(22, aU.ry, 399, 163);
        widgetJ.b(23, aU.rz, 399, 204);
        widgetJ.b(24, aU.rA, 343, 176);
        widgetJ.b(25, aU.rB, 343, aU.hu_);
        widgetJ.b(26, aU.rC, 455, 176);
        widgetJ.b(27, aU.rD, 455, aU.hu_);
        widgetJ.b(28, 1653, 369, 139);
        widgetJ.b(29, 1654, 428, 139);
        widgetJ.b(30, 1655, 379, 100);
        widgetJ.b(31, 1656, 433, 99);
        widgetJ.b(32, 1657, 399, 62);
        widgetJ.b(33, 1658, 358, 101);
        widgetJ.b(34, 1659, 399, 101);
        widgetJ.b(35, 1660, 440, 101);
        widgetJ.b(36, 1661, 343, 140);
        widgetJ.b(37, 1662, 399, 140);
        widgetJ.b(38, 1663, 455, 140);
        widgetJ.b(39, 1664, 399, 180);
        widgetJ.b(40, 1665, 399, 220);
        widgetJ.b(41, 1666, 343, 220);
        widgetJ.b(42, 1667, 455, 220);
        widgetJ.b(43, 1688, 345, 102);
        widgetJ.b(44, 15115, 343, User32.WM_SYSCHAR);
        widgetJ.b(45, 15116, 343, 277);
        widgetJ.c(46, 15117, 20, 276);
        widgetJ.c(47, 15118, 20, User32.WM_MENUDRAG);
        widgetJ.b(48, 15119, 343, User32.WM_MENUGETOBJECT);
        widgetJ.b(49, 48087, 450, 29);
        widgetJ.b(50, 48088, 450, 29);
        for (int i5 = 1675; i5 <= 1684; i5++) {
            Widget widget = H[i5];
            widget.ac = 14983494;
            widget.S = false;
        }
        for (int i6 = 1686; i6 <= 1687; i6++) {
            Widget widget2 = H[i6];
            widget2.ac = 14983494;
            widget2.S = false;
        }
    }
}
