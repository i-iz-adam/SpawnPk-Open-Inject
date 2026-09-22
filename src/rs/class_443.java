package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_443.class */
public class class_443 extends class_360 {
    public class_443(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(38975);
        c(47000, 0, "drops/sprite");
        a(47001, "@or1@Monster item drop search", this.a, 2, 16751360, true, true);
        a(47002, "drops/button", 1, 100, 32, "Search by item", -1, 47003, 1);
        a(47003, "drops/button", 2, 100, 25, 25350);
        a(47004, "Search item", this.a, 0, 16751360, false, true);
        c(47005, 0, "drops/icon");
        a(47006, "drops/button", 1, 100, 32, "Search by monster", -1, 47007, 1);
        a(47007, "drops/button", 2, 100, 25, 25350);
        a(47008, "Search npc", this.a, 0, 16751360, false, true);
        c(47009, 0, "drops/icon");
        Widget widgetD2 = d(47010);
        widgetD2.P = 93;
        widgetD2.aP = 191;
        widgetD2.aF = aU.qx;
        widgetD2.k(100);
        for (int i = 0; i < 100; i++) {
            a(47011 + i, "", "Select this monster", this.a, 0, class_492.e, false, true, 115);
            widgetD2.b(i, 47011 + i, 1, 3 + (i * 15));
        }
        a(47111, "@or1@Item", this.a, 2, 16751360, true, true);
        a(47112, "@or1@Quantity", this.a, 2, 16751360, true, true);
        a(47113, "@or1@Rarity", this.a, 2, 16751360, true, true);
        Widget widgetD3 = d(47114);
        widgetD3.P = 342;
        widgetD3.aP = 233;
        widgetD3.aF = aU.qx;
        widgetD3.k(215);
        int i2 = 0;
        int i3 = 47115;
        int i4 = 1;
        for (int i5 = 0; i5 < 43; i5++) {
            int i6 = (i5 * 35) - 5;
            int i7 = i3;
            int i8 = i3 + 1;
            c(i7, i4, "drops/sprite");
            int i9 = i2;
            int i10 = i2 + 1;
            widgetD3.b(i9, i8 - 1, 0, i6);
            int i11 = i8 + 1;
            c(i8, 0, 27);
            int i12 = i10 + 1;
            widgetD3.b(i10, i11 - 1, 3, i6 + 3);
            int i13 = i11 + 1;
            a(i11, "", this.a, 0, class_492.c, true);
            int i14 = i12 + 1;
            widgetD3.b(i12, i13 - 1, 92, i6 + 13);
            int i15 = i13 + 1;
            a(i13, "", this.a, 0, class_492.c, true);
            int i16 = i14 + 1;
            widgetD3.b(i14, i15 - 1, 190, i6 + 13);
            i3 = i15 + 1;
            a(i15, "", this.a, 0, class_492.c, true);
            i2 = i16 + 1;
            widgetD3.b(i16, i3 - 1, User32.WM_MENURBUTTONUP, i6 + 13);
            i4 = i4 == 1 ? 2 : 1;
        }
        a(47330, "drops/sprite", 3, 17, 17, "Go back", -1, 47331, 1);
        a(47331, "drops/sprite", 4, 17, 17, 47332);
        a(47333, "@yel@Note:@whi@ Boosted rate display does NOT include dynamic boosts (monster specific boosts, etc.)", this.a, 0, 16751360, true, true);
        widgetD.k(20);
        widgetD.b(0, 47000, 6, 17 - 10);
        widgetD.b(1, 47001, User32.WM_IME_ENDCOMPOSITION, 24 - 10);
        widgetD.b(2, 64275, 482, 24 - 10);
        widgetD.b(3, 64276, 482, 24 - 10);
        widgetD.b(4, 47002, 23, 50 - 10);
        widgetD.b(5, 47003, 23, 50 - 10);
        widgetD.b(6, 47004, 51, 61 - 10);
        widgetD.b(7, 47005, 29, 57 - 10);
        widgetD.b(8, 47006, 23, (50 + 27) - 10);
        widgetD.b(9, 47007, 23, (50 + 27) - 10);
        widgetD.b(10, 47008, 51, (61 + 27) - 10);
        widgetD.b(11, 47009, 29, (57 + 27) - 10);
        widgetD.b(12, 47010, 19, 114 - 10);
        widgetD.b(13, 47111, aU.hx_, 53 - 10);
        widgetD.b(14, 47112, 331, 53 - 10);
        widgetD.b(15, 47113, 433, 53 - 10);
        widgetD.b(16, 47114, 140, 76 - 10);
        widgetD.b(17, 47330, 13, 24 - 10);
        widgetD.b(18, 47331, 13, 24 - 10);
        widgetD.b(19, 47333, 254, 316 - 10);
    }
}
