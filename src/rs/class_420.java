package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_420.class */
public class class_420 extends class_360 {
    public static class_495 c;
    public static final int e = 5;
    private static final int bS = 32;
    private static final int bT = 20;
    public static final String bK = "";
    public static final int bL = 700;
    public static int d = 0;
    public static int f = 0;
    public static int g = 32;
    public static int bG = 20;
    public static boolean bH = true;
    public static int bI = 431;
    public static int bJ = 431;
    public static final int[] bM = new int[700];
    public static final int[] bN = new int[700];
    public static final String[] bO = new String[700];
    public static final String[] bP = {"Remove 1", "Remove 5", "Remove 10", "Remove All", null};
    public static final String[] bQ = {"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All", null};
    public static final int[] bR = {36004, 36005, 36006, 36008, 36009, 36010};

    public class_420(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        c = new class_495(d(36000));
        class_351.a(36800, "list/bg");
        class_351.a(36801, "list/bg bottom");
        class_351.a(36802, "list/bg top").bd = false;
        class_351.a(36803, "list/bg foot");
        c.a(36800).a(13, 13);
        c.a(36801).a(36800, false, true, 6, -39);
        c.a(36802).a(36800, false, false, 9, 25);
        c.a(36803).a(36800, false, true, 0, -9);
        for (int i = 0; i < 5; i++) {
            class_342.b(36804 + i, "slayer/image 10", " Select tab");
            a(36809 + i, "Tab 1", this.a, 0, class_492.e, true, true);
            int i2 = 13 + (91 * i);
            c.a(36804 + i).a(36800, i2, 28);
            c.a(36809 + i).a(36800, i2 + 41, 28 + 4);
        }
        c.a(63740).a(476, 17);
        c.a(63741).a(476, 17);
        a(36001, "Item List Title", this.a, 2, 16751360, true, true);
        c.a(36001).a(258, 18);
        a(36002, "Description Line 1", this.a, 1, 16751360, false, true);
        a(36003, "Description Line 1 (small)", this.a, 0, class_492.d, false, true);
        c.a(36002).a(25, 283);
        c.a(36003).a(25, aU.ib_);
        class_352.a(36814, "").a().m(16751360);
        class_352.a(36815, "").a().m(16751360);
        class_352.a(36816, "").a().m(16751360);
        class_352.a(36817, "").a().m(16751360);
        for (int i3 = 36814; i3 <= 36817; i3++) {
            c.a(i3).a(36800, false, true, 0, 0);
        }
        a(36004, 5, 36005, 17, "bank/bank", 35, 25, "Deposit all to inventory", 36006, 18, "bank/bank", 36007, "Empty your backpack into\nyour bank", 0, 20);
        c.a(36004).a(415, 284);
        c.a(36005).a(400, 224);
        a(36008, 5, 36009, 31, "bank/bank", 31, 25, "Deposit all to bank", 36010, 31, "bank/bank", 36011, "Empty your backpack into\nyour bank", 0, 20);
        c.a(36008).a(455, 284);
        c.a(36009).a(440, 224);
        class_342.b(36012, "wiki/button 1", " Search by item").a(36013, "wiki/button 2");
        a(36015, "<img=39> Search for an item", this.a, 0, 16751360, true, true);
        c.a(36012).a(21, User32.WM_GESTURE);
        c.a(36013).a(21, User32.WM_GESTURE);
        c.a(36015).a(110, User32.WM_MENUGETOBJECT);
        class_342.b(36016, "drops/sprite 3", " Go back").a(36017, "drops/sprite 4");
        c.a(36016).a(19, 17);
        c.a(36017).a(19, 17);
        a(36019, "Search description text", this.a, 0, 16751360, false, true);
        c.a(36019).a(215, User32.WM_UNINITMENUPOPUP);
        Widget widgetD = d(30073);
        d(30074);
        class_349.g(30074, 28).a(4).h(10, 4);
        widgetD.k(1);
        widgetD.b(0, 30074, 16, 8);
        Widget widgetD2 = d(36026);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = 500;
        widgetD2.P = 455;
        widgetD2.aP = User32.VK_OEM_AUTO;
        widgetD2.bh = 87;
        widgetD2.k(aU.hh);
        widgetD2.b(0, 36025, 15, 10);
        c.a(36026).a(36800, false, false, 8, 25);
        class_349.g(36025, 700).a(7).h(g, bG);
        int i4 = 1;
        int i5 = 0;
        int i6 = 30;
        int i7 = 44 + 1;
        for (int i8 = 36027; i8 < 36027 + 700; i8++) {
            a(i8, "", this.a, 0, class_492.e, true);
            int i9 = i4;
            i4++;
            widgetD2.b(i9, i8, i6, i7);
            i6 += l(36025).ab + 32;
            i5++;
            if (i5 >= Widget.l(36025).P) {
                i5 = 0;
                i6 = 30;
                i7 += l(36025).ao + 32;
            }
        }
        j();
        c.a();
    }

    public static void b(String str) {
        if (f >= 5) {
            return;
        }
        int i = f;
        f = i + 1;
        if (!m().bd) {
            c(true);
        }
        l(36804 + i).bd = true;
        l(36809 + i).as = str;
    }

    public static void m(int i) {
        if (i + 1 > f) {
            return;
        }
        for (int i2 = 0; i2 < f; i2++) {
            int i3 = 36804 + i2;
            if (i == i2) {
                Widget.H[i3].E = class_406.d;
                Widget.H[i3].aE = class_406.d;
            } else {
                Widget.H[i3].E = class_406.e;
                Widget.H[i3].aE = class_406.e;
            }
        }
    }

    public static void c(String str) {
        ItemComposition itemCompositionB;
        l(36025).bd = false;
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            int i3 = l(36025).ax[i2] - 1;
            int i4 = l(36025).av[i2];
            String str2 = l(36027 + i2).as;
            if (i3 > 0 && (itemCompositionB = ItemComposition.c.b(i3)) != null && itemCompositionB.itemName != null && itemCompositionB.itemName.toLowerCase().contains(str.toLowerCase())) {
                bM[i] = i3;
                bN[i] = i4;
                bO[i] = str2;
                i++;
            }
        }
        j();
        for (int i5 = 0; i5 < i; i5++) {
            e(bM[i5], bN[i5], bO[i5]);
        }
        l(36001).as = "<img=39> Search: @yel@\"" + str + "\" @gre@(" + i + " results)";
        l(36025).bd = true;
    }

    public static void e(int i, int i2, String str) {
        if (d >= 700) {
            return;
        }
        int i3 = d;
        d = i3 + 1;
        d(i3, i, i2, str);
    }

    public static void d(int i, int i2, int i3, String str) {
        l(36027 + i).as = str;
        l(36025).ax[i] = i2 == 0 ? 0 : i2 + 1;
        l(36025).av[i] = i3;
    }

    public static void h() {
        bI = 431;
        bJ = 431;
        c(false);
        d(true);
        o().P = 455;
        o().aP = User32.VK_OEM_ENLW;
        n(7);
        class_349 class_349Var = (class_349) l(36025);
        if (class_349Var.ab != 32 || class_349Var.ao != 20) {
            g(32, 20);
        }
        i();
    }

    public static void i() {
        l(36026).V = 0;
        l(36026).aF = 500;
        f = 0;
        for (int i = 0; i < 5; i++) {
            l(36804 + i).bd = false;
            l(36809 + i).as = "";
        }
        j();
        l(36002).as = "";
        l(36003).as = "";
        l(36019).as = "";
        for (int i2 : bR) {
            l(i2).bd = false;
        }
        e(false);
    }

    public static void j() {
        d = 0;
        for (int i = 0; i < 700; i++) {
            d(i, 0, 0, "");
        }
        g(g, bG);
    }

    public static void k() {
        int i = (d / Widget.l(36025).P) * (l(36025).ao + 32);
        int i2 = 100;
        if (i >= 100) {
            i2 = i + ((l(36025).ao + 32) * 3);
        }
        l(36026).aF = i2;
    }

    public static void g(int i, int i2) {
        ((class_349) Widget.l(36025)).h(i, i2);
        g = i;
        bG = i2;
        l();
        k();
    }

    public static void n(int i) {
        ((class_349) Widget.l(36025)).a(i);
        class_493 class_493VarE = c.b(o().au).e();
        if (i >= 10) {
            if (class_493VarE.b() == 8) {
                o().P = 464;
                class_493VarE.a(1);
                c.a();
            }
        } else if (class_493VarE.b() != 8) {
            o().P = 455;
            class_493VarE.a(8);
            c.a();
        }
        l();
    }

    public static void l() {
        int i = 1;
        int i2 = 0;
        int i3 = 30;
        int i4 = 44 + 1;
        for (int i5 = 36027; i5 < 36027 + 700; i5++) {
            int i6 = i;
            i++;
            o().b(i6, i5, i3, i4);
            i3 += l(36025).ab + 32;
            i2++;
            if (i2 >= Widget.l(36025).P) {
                i2 = 0;
                i3 = 30;
                i4 += l(36025).ao + 32;
            }
        }
    }

    public static void a(boolean z) {
        if (z) {
            l(36025).W = bP;
        } else {
            l(36025).W = new String[]{null, null, null, null, null};
        }
    }

    public static void b(boolean z) {
        if (z) {
            l(30074).W = bQ;
        } else {
            l(30074).W = new String[]{null, null, null, null, null};
        }
    }

    public static void c(boolean z) {
        int i = 0;
        if (z) {
            if (!m().bd) {
                i = -25;
            }
            m().bd = true;
        } else {
            if (m().bd) {
                i = 25;
            }
            m().bd = false;
        }
        if (i != 0) {
            class_493 class_493VarE = c.b(o().au).e();
            o().aP += i;
            class_493VarE.b(class_493VarE.c() - i);
            c.a();
        }
    }

    public static void d(boolean z) {
        if (z) {
            if (!n().bd) {
                o().aP -= 32;
            }
            n().bd = true;
            return;
        }
        if (n().bd) {
            o().aP += 32;
        }
        n().bd = false;
        for (int i : bR) {
            l(i).bd = false;
        }
        l(36002).as = "";
        l(36003).as = "";
        l(36019).as = "";
        e(false);
    }

    public static void e(boolean z) {
        l(36012).bd = z;
        l(36013).bd = z;
        l(36015).bd = z;
    }

    public static void f(boolean z) {
        l(36016).bd = z;
    }

    public static void o(int i) {
        if (i == 0) {
            for (int i2 : bR) {
                l(i2).bd = false;
            }
            return;
        }
        for (int i3 : bR) {
            if ((i != 1 || i3 > 36007) && (i != 3 || i3 < 36008)) {
                l(i3).bd = true;
            }
        }
        if (i == 1) {
            c.b(36008).a(455, 284);
            c.b(36009).a(440, 224);
        } else if (i == 2) {
            c.b(36008).a(415, 284);
            c.b(36009).a(400, 224);
            c.b(36004).a(455, 284);
            c.b(36005).a(440, 224);
        } else if (i == 3) {
            c.b(36004).a(455, 284);
            c.b(36005).a(440, 224);
        }
        c.a();
    }

    public static Widget m() {
        return l(36802);
    }

    public static Widget n() {
        return l(36801);
    }

    public static Widget o() {
        return l(36026);
    }
}
