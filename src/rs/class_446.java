package rs;

import com.sun.jna.platform.win32.aU;
import gnu.trove.f.b.dg;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_446.class */
public class class_446 extends class_360 {
    public static class_495 d;
    public static class_495 e;
    public static final String f = "<str=8683352>                                                                                                                                                    </str>";
    public static final String g = "                                                                                                                                                    </str>";
    public static final int bI = 57016;
    public static final dg<String> c = new dg<>();
    public static String bG = null;
    public static int bH = 0;

    public class_446(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void h() {
        c.clear();
    }

    public static void m(int i) {
        switch (i) {
            case class_455.e /* 32019 */:
                l(bI).P = 325;
                l(bI).aP = class_455.cd;
                l(bI).bd = !class_455.i().f();
                break;
            case class_463.bG /* 32600 */:
                l(bI).P = 480;
                l(bI).aP = 280;
                l(bI).bd = true;
                break;
            case 56998:
                l(bI).P = 454;
                l(bI).aP = 285;
                l(bI).bd = true;
                break;
            case 57000:
                l(bI).P = 454;
                l(bI).aP = 193;
                l(bI).bd = true;
                break;
        }
        if ((i == 56998 || i == 57000) && bG != null) {
            c.a(bG, l(bI).V);
        }
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(57000);
        addSprite(57001, "event/task 1");
        a(57002, "Gladiator's Vindication (World Event)", this.a, 2, class_492.e, true);
        a(57003, "Event duration ends in: @yel@<img=37> 14 days", this.a, 0, class_492.e, true);
        a(57004, 5, 0, 57005, 16, "fountain/sprite", 120, 34, "Select button");
        a(57005, 15, "fountain/sprite", 120, 34, 57006);
        a(57007, 5, 0, 57008, 16, "fountain/sprite", 120, 34, "Select button");
        a(57008, 15, "fountain/sprite", 120, 34, 57009);
        a(57010, 5, 0, 57011, 16, "fountain/sprite", 120, 34, "Select button");
        a(57011, 15, "fountain/sprite", 120, 34, 57012);
        a(57013, "Button 1", this.a, 1, class_492.e, true);
        a(57014, "Button 2", this.a, 1, class_492.e, true);
        a(57015, "Button 3", this.a, 1, class_492.e, true);
        e = new class_495(class_350.a(bI));
        Widget widget = H[57016];
        widget.aF = aU.mt;
        widget.P = 454;
        widget.aP = 193;
        widget.bh = 87;
        int i = 3;
        for (int i2 = 57017; i2 <= 57217; i2 += 2) {
            a(i2, "Test " + i2, "Select this option", this.a, 0, class_492.e, false, true, 300);
            c(i2 + 1, 14484, 32);
            Widget.H[i2 + 1].bd = false;
            e.a(i2).a(35, i + 12);
            e.a(i2 + 1).a(0, i);
            i += 30;
        }
        e.a();
        a(57220, "Progress bar description", this.a, 0, class_492.e, true);
        a(57221, "0% (0/100)", this.a, 0, 0, true, false);
        c(57222, 21, "event/task");
        Widget.H[57222].E = new class_333("event/task 2", 92, 15);
        a(57223, "drops/sprite", 3, 17, 17, "Go back", -1, 57224, 1);
        a(57224, "drops/sprite", 4, 17, 17, 57225);
        Widget.H[57223].bd = false;
        widgetD.k(20);
        int i3 = 0 + 1;
        widgetD.b(0, 57001, 12, 7);
        int i4 = i3 + 1;
        widgetD.b(i3, 57002, User32.WM_SYSCHAR, 11);
        int i5 = i4 + 1;
        widgetD.b(i4, 57003, User32.WM_SYSCHAR, 28);
        int i6 = i5 + 1;
        widgetD.b(i5, 57004, 41, 278);
        int i7 = i6 + 1;
        widgetD.b(i6, 57005, 41, 278);
        int i8 = i7 + 1;
        widgetD.b(i7, 57013, 100, User32.WM_MENUSELECT);
        int i9 = i8 + 1;
        widgetD.b(i8, 57007, 196, 278);
        int i10 = i9 + 1;
        widgetD.b(i9, 57008, 196, 278);
        int i11 = i10 + 1;
        widgetD.b(i10, 57014, 255, User32.WM_MENUSELECT);
        int i12 = i11 + 1;
        widgetD.b(i11, 57010, aU.ij_, 278);
        int i13 = i12 + 1;
        widgetD.b(i12, 57011, aU.ij_, 278);
        int i14 = i13 + 1;
        widgetD.b(i13, 57015, 410, User32.WM_MENUSELECT);
        int i15 = i14 + 1;
        widgetD.b(i14, bI, 22, 43);
        int i16 = i15 + 1;
        widgetD.b(i15, 57220, 256, User32.VK_OEM_COPY);
        int i17 = i16 + 1;
        widgetD.b(i16, 57222, 72, 255);
        int i18 = i17 + 1;
        widgetD.b(i17, 57221, 256, 257);
        int i19 = i18 + 1;
        widgetD.b(i18, 65418, 476, 15);
        int i20 = i19 + 1;
        widgetD.b(i19, 65419, 476, 15);
        int i21 = i20 + 1;
        widgetD.b(i20, 57223, 18, 15);
        int i22 = i21 + 1;
        widgetD.b(i21, 57224, 18, 15);
        i();
    }

    public void i() {
        d = new class_495(d(56998));
        addSprite(56999, "event/task 3");
        d(56997);
        d.a(56999).a(12, 7);
        d.a(57002).a(User32.WM_SYSCHAR, 13);
        d.a(bI).a(22, 32);
        d.a(65418).a(476, 12);
        d.a(65419).a(476, 12);
        d.a(57223).a(18, 12);
        d.a(57224).a(18, 12);
        d.a();
    }
}
