package rs;

import com.google.a.l.c;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aX;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_437.class */
public class class_437 extends class_360 {
    public static final int c = 25;

    public class_437(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void h() {
        int i = 25127;
        for (int i2 = 0; i2 < 25; i2++) {
            int i3 = i + 1 + 1 + 1 + 1;
            int i4 = i3 + 1;
            c(i3, 0, 32);
            int i5 = i4 + 1;
            Widget.H[i4].as = "";
            int i6 = i5 + 1;
            Widget.H[i5].as = "";
            i = i6 + 1;
            Widget.H[i6].as = "";
        }
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(24535);
        c(65786, 2, "pos/SPRITE");
        c(65804, 5, "pos/SPRITE");
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        a(25341, "@or1@SpawnPK Marketplace Search Results <img=39>", this.a, 2, 16751360, true, true);
        a(24561, "Icon", this.a, 0, 16751360, true, true);
        a(24562, "Name/Quantity", this.a, 0, 16751360, true, true);
        a(24563, "Price (each) <img=23>", "Toggle ascending/descending", this.a, 0, 16751360, true, true, 50);
        a(24564, "Seller", this.a, 0, 16751360, true, true);
        a(aX.R, "pos/button", 1, 100, 32, "Go back", -1, 65793, 1);
        a(65793, "pos/button", 2, 100, 32, 65794);
        a(65795, "Go back", this.a, 0, 16751360, true, true);
        a(65796, "pos/button", 1, 100, 32, "Select option", -1, 65797, 1);
        a(65797, "pos/button", 2, 100, 32, 65798);
        a(24565, "Modify", this.a, 0, 16751360, true, true);
        a(44000, "Total offers: 0", this.a, 0, 16751360, true, true);
        a(65800, "pos/button", 1, 100, 32, "Select option", -1, 65801, 1);
        a(65801, "pos/button", 2, 100, 32, 65802);
        a(24566, c.am, this.a, 0, 16751360, true, true);
        a(48991, "pos/button", 5, 16, 16, "Previous page", -1, 48990, 1);
        a(48990, "pos/button", 6, 16, 16, 48989);
        a(48988, "Last page", "Previous page", this.a, 0, 16751360, false, true, 50);
        a(48987, "pos/button", 7, 16, 16, "Next page", -1, 48986, 1);
        a(48986, "pos/button", 8, 16, 16, 48985);
        a(48984, "Next page", "Next page", this.a, 0, 16751360, false, true, 50);
        Widget widgetD2 = d(65803);
        widgetD2.P = 461;
        widgetD2.aP = aU.ht_;
        widgetD2.aF = aU.ke;
        int i = 25127;
        int i2 = 0;
        widgetD2.k(181);
        for (int i3 = 0; i3 < 25; i3++) {
            int i4 = 42 * i3;
            c(i, 3, "pos/SPRITE");
            int i5 = i2;
            int i6 = i2 + 1;
            int i7 = i;
            int i8 = i + 1;
            widgetD2.b(i5, i7, 1, 37 + i4);
            a(i8, "pos/button", 0, 476, 37, "Select this market listing", -1, i8 + 1, 1);
            int i9 = i6 + 1;
            int i10 = i8 + 1;
            widgetD2.b(i6, i8, 0, 1 + i4);
            a(i10, "pos/sprite", 4, 476, 37, i10 + 1);
            int i11 = i9 + 1;
            widgetD2.b(i9, i10, 0, 1 + i4);
            int i12 = i10 + 1 + 1;
            c(i12, 0, 32);
            int i13 = i11 + 1;
            int i14 = i12 + 1;
            widgetD2.b(i11, i12, 5, 3 + i4);
            a(i14, "", this.a, 0, 16751360, true, true);
            int i15 = i13 + 1;
            int i16 = i14 + 1;
            widgetD2.b(i13, i14, 113, 14 + i4);
            a(i16, "", this.a, 0, 1048575, true, true);
            int i17 = i15 + 1;
            int i18 = i16 + 1;
            widgetD2.b(i15, i16, User32.WM_IME_ENDCOMPOSITION, 14 + i4);
            a(i18, "", this.a, 0, class_492.c, true, true);
            i2 = i17 + 1;
            i = i18 + 1;
            widgetD2.b(i17, i18, 415, 14 + i4);
        }
        int i19 = i2;
        int i20 = i2 + 1;
        widgetD2.b(i19, 48991, 10, aU.jG);
        int i21 = i20 + 1;
        widgetD2.b(i20, 48990, 10, aU.jG);
        int i22 = i21 + 1;
        widgetD2.b(i21, 48988, 31, aU.jJ);
        int i23 = i22 + 1;
        widgetD2.b(i22, 48987, 435, aU.jG);
        int i24 = i23 + 1;
        widgetD2.b(i23, 48986, 435, aU.jG);
        int i25 = i24 + 1;
        widgetD2.b(i24, 48984, 378, aU.jI);
        widgetD.k(20);
        widgetD.b(0, 65786, 12, 7);
        widgetD.b(1, 65803, 17, 67);
        widgetD.b(2, 65804, 12, 7);
        widgetD.b(3, 65418, 475, 15);
        widgetD.b(4, 65419, 475, 15);
        widgetD.b(5, 25341, 256, 15);
        widgetD.b(6, 24561, 37, 46);
        widgetD.b(7, 24562, 132, 46);
        widgetD.b(8, 24563, aU.hT_, 46);
        widgetD.b(9, 24564, 433, 46);
        widgetD.b(10, aX.R, 24, 282);
        widgetD.b(11, 65793, 24, 282);
        widgetD.b(12, 65795, 73, User32.WM_MENUGETOBJECT);
        widgetD.b(13, 65796, 387, 282);
        widgetD.b(14, 65797, 387, 282);
        widgetD.b(15, 24565, 438, User32.WM_MENUGETOBJECT);
        widgetD.b(16, 65800, 277, 282);
        widgetD.b(17, 65801, 277, 282);
        widgetD.b(18, 24566, 328, User32.WM_MENUGETOBJECT);
        widgetD.b(19, 44000, 200, User32.WM_UNINITMENUPOPUP);
    }
}
