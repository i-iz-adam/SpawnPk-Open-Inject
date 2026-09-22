package rs;

import com.sun.jna.platform.win32.aU;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_444.class */
public class class_444 extends class_360 {
    public static class_333 c;
    public static final List<class_445> d = new ArrayList();
    public static class_338[] e;

    public class_444(class_338[] class_338VarArr) {
        super(class_338VarArr);
        e = class_338VarArr;
    }

    public static void m(int i) {
        if (i < 44105 || i > 44220) {
            return;
        }
        for (int i2 = 0; i2 < d.size(); i2++) {
            class_445 class_445Var = d.get(i2);
            if (class_445Var != null && i == 44105 + (i2 * 12)) {
                Client.ap = "::claimchallenge " + class_445Var.a;
                return;
            } else {
                if (class_445Var != null && i == 44112 + (i2 * 12)) {
                    Client.ap = "::infochallenge " + class_445Var.a;
                    return;
                }
            }
        }
    }

    public static void a(String str, String str2, int i, int i2, int i3, int i4) {
        class_445 class_445Var = new class_445();
        class_445Var.a = str;
        class_445Var.b = str2;
        class_445Var.c = i;
        class_445Var.d = i2;
        class_445Var.e = i3;
        class_445Var.f = i4;
        d.add(class_445Var);
    }

    public static void b(String str) {
        ArrayList arrayList = new ArrayList();
        for (class_445 class_445Var : d) {
            if (class_445Var.a.equalsIgnoreCase(str)) {
                arrayList.add(class_445Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d.remove((class_445) it.next());
        }
    }

    public static void a(String str, int i, int i2) {
        int i3 = 44103;
        for (class_445 class_445Var : d) {
            if (class_445Var.a.equalsIgnoreCase(str)) {
                class_445Var.e = i;
                class_445Var.f = i2;
                double d2 = (((double) class_445Var.e) / ((double) class_445Var.f)) * 100.0d;
                if (d2 >= 100.0d) {
                    d2 = 100.0d;
                }
                DecimalFormat decimalFormat = new DecimalFormat("###.#");
                Widget.H[i3 + 6].E = new class_333("gameframe/tab/bar1", (int) (((double) c.n) * (d2 / 100.0d)), c.o);
                Widget.H[i3 + 7].as = "@gre@" + class_445Var.e + "/" + class_445Var.f + " (" + decimalFormat.format(d2) + "%)";
                break;
            }
            i3 += 12;
        }
        Client.fb = true;
    }

    public static void h() {
        Widget widget = Widget.H[44101];
        int i = 44103;
        int i2 = 1;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = 23 + (i3 * 80);
            if (i3 >= d.size() || d.get(i3) == null) {
                if (i3 == 0) {
                    int i5 = i;
                    int i6 = i + 1;
                    a(i5, "<col=FF9B00>You don't have any challenges!", e, 0, class_492.e, false, true);
                    int i7 = i6 + 1;
                    a(i6, "", e, 0, class_492.e, false, true);
                    int i8 = i7 + 1;
                    a(i7, "", e, 0, class_492.e, false, true);
                    int i9 = i8 + 1;
                    a(i8, "", e, 0, class_492.e, false, true);
                    int i10 = i2;
                    int i11 = i2 + 1;
                    widget.b(i10, i9 - 4, 2, 1 + i4);
                    int i12 = i11 + 1;
                    widget.b(i11, i9 - 3, 2, 25 + i4);
                    int i13 = i12 + 1;
                    widget.b(i12, i9 - 2, 2, 40 + i4);
                    i2 = i13 + 1;
                    widget.b(i13, i9 - 1, 2, 55 + i4);
                    int i14 = i9 + 1;
                    Widget.H[i9].bd = false;
                    int i15 = i14 + 1;
                    Widget.H[i14].bd = false;
                    int i16 = i15 + 1;
                    Widget.H[i15].bd = false;
                    int i17 = i16 + 1;
                    Widget.H[i16].bd = false;
                    int i18 = i17 + 1;
                    Widget.H[i17].bd = false;
                    int i19 = i18 + 1;
                    Widget.H[i18].bd = false;
                    int i20 = i19 + 1;
                    Widget.H[i19].bd = false;
                    i = i20 + 1;
                    Widget.H[i20].bd = false;
                } else {
                    int i21 = i;
                    int i22 = i + 1;
                    Widget.H[i21].bd = false;
                    int i23 = i22 + 1;
                    Widget.H[i22].bd = false;
                    int i24 = i23 + 1;
                    Widget.H[i23].bd = false;
                    int i25 = i24 + 1;
                    Widget.H[i24].bd = false;
                    int i26 = i25 + 1;
                    Widget.H[i25].bd = false;
                    int i27 = i26 + 1;
                    Widget.H[i26].bd = false;
                    int i28 = i27 + 1;
                    Widget.H[i27].bd = false;
                    int i29 = i28 + 1;
                    Widget.H[i28].bd = false;
                    int i30 = i29 + 1;
                    Widget.H[i29].bd = false;
                    int i31 = i30 + 1;
                    Widget.H[i30].bd = false;
                    int i32 = i31 + 1;
                    Widget.H[i31].bd = false;
                    i = i32 + 1;
                    Widget.H[i32].bd = false;
                }
            } else {
                class_445 class_445Var = d.get(i3);
                int i33 = i;
                int i34 = i + 1;
                a(i33, class_445Var.a, e, 1, class_492.e, false, true);
                int i35 = i34 + 1;
                a(i34, class_445Var.b, e, 0, class_492.c, false, true);
                int i36 = i35 + 1;
                a(i35, "gameframe/tab/button", 1, 35, 19, "Collect reward", -1, i36, 1);
                int i37 = i36 + 1;
                a(i36, "gameframe/tab/button", 2, 35, 19, i37);
                int i38 = i37 + 1;
                double d2 = (((double) class_445Var.e) / ((double) class_445Var.f)) * 100.0d;
                if (d2 >= 100.0d) {
                    d2 = 100.0d;
                }
                DecimalFormat decimalFormat = new DecimalFormat("###.#");
                int i39 = i38 + 1;
                addSprite(i38, "gameframe/tab/bar2");
                Widget.H[i39 - 1].bl = false;
                int i40 = i39 + 1;
                addSprite(i39, "null");
                Widget.H[i40 - 1].bl = false;
                Widget.H[i40 - 1].E = new class_333("gameframe/tab/bar1", (int) (((double) c.n) * (d2 / 100.0d)), c.o);
                int i41 = i40 + 1;
                a(i40, "@gre@" + class_445Var.e + "/" + class_445Var.f + " (" + decimalFormat.format(d2) + "%)", e, 0, class_492.c, false, true);
                Widget.H[i41 - 1].bl = false;
                int i42 = i41 + 1;
                addSprite(i41, "gameframe/tab/divider");
                Widget.H[i42 - 1].bl = false;
                int i43 = i42 + 1;
                a(i42, "gameframe/tab/button", 3, 35, 12, "View information", -1, i43, 1);
                int i44 = i43 + 1;
                a(i43, "gameframe/tab/button", 4, 35, 12, i44);
                i = i44 + 1;
            }
            int i45 = i2;
            int i46 = i2 + 1;
            widget.b(i45, i - 12, 39, 1 + i4);
            int i47 = i46 + 1;
            widget.b(i46, i - 11, 39, 16 + i4);
            int i48 = i47 + 1;
            widget.b(i47, i - 10, 0, (6 + i4) - 5);
            int i49 = i48 + 1;
            widget.b(i48, i - 9, 0, (6 + i4) - 5);
            int i50 = i49 + 1;
            widget.b(i49, i - 7, 0, 6 + i4 + 35 + 4);
            int i51 = i50 + 1;
            widget.b(i50, i - 6, 0, 6 + i4 + 35 + 4);
            int i52 = i51 + 1;
            widget.b(i51, i - 5, 0, 6 + i4 + 46 + 4);
            int i53 = i52 + 1;
            widget.b(i52, i - 4, 0, 6 + i4 + 63);
            int i54 = i53 + 1;
            widget.b(i53, i - 3, 0, 6 + i4 + 23);
            i2 = i54 + 1;
            widget.b(i54, i - 2, 0, 6 + i4 + 23);
        }
    }

    @Override // rs.class_360
    public void a() {
        d.clear();
        Widget widgetD = d(44100);
        Widget widgetJ = j(44101);
        addSprite(44099, "gameframe/tab/background");
        widgetJ.P = 168;
        widgetJ.aP = 225 - 50;
        widgetJ.aF = 850;
        widgetJ.k(101);
        c = new class_333("gameframe/tab/bar2");
        int i = 44102 + 1;
        a(44102, "<img=217> <u=16754944>Daily Challenges", e, 2, class_492.e, false, true);
        int i2 = 0 + 1;
        widgetJ.b(0, i - 1, 0, 4);
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = i;
            int i5 = i + 1;
            a(i4, "Deep wild pking", e, 1, class_492.e, false, true);
            int i6 = i5 + 1;
            a(i5, "Kill 50 players in\\nlevel 30+ wild", e, 0, class_492.c, false, true);
            int i7 = i6 + 1;
            a(i6, "gameframe/tab/button", 1, 35, 19, "Collect reward", -1, i7, 1);
            int i8 = i7 + 1;
            a(i7, "gameframe/tab/button", 2, 35, 19, i8);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            addSprite(i9, "gameframe/tab/bar2");
            int i11 = i10 + 1;
            addSprite(i10, "gameframe/tab/bar1");
            int i12 = i11 + 1;
            a(i11, "@gre@0/" + i3 + " (0.0%)", e, 0, class_492.c, false, true);
            int i13 = i12 + 1;
            addSprite(i12, "gameframe/tab/divider");
            int i14 = i13 + 1;
            a(i13, "gameframe/tab/button", 3, 35, 12, "View information", -1, i14, 1);
            int i15 = i14 + 1;
            a(i14, "gameframe/tab/button", 4, 35, 12, i15);
            i = i15 + 1;
            int i16 = 23 + (i3 * 80);
            int i17 = i2;
            int i18 = i2 + 1;
            widgetJ.b(i17, i - 12, 39, 1 + i16);
            int i19 = i18 + 1;
            widgetJ.b(i18, i - 11, 39, 16 + i16);
            int i20 = i19 + 1;
            widgetJ.b(i19, i - 10, 0, (6 + i16) - 5);
            int i21 = i20 + 1;
            widgetJ.b(i20, i - 9, 0, (6 + i16) - 5);
            int i22 = i21 + 1;
            widgetJ.b(i21, i - 7, 0, 6 + i16 + 35 + 4);
            int i23 = i22 + 1;
            widgetJ.b(i22, i - 6, 0, 6 + i16 + 35 + 4);
            int i24 = i23 + 1;
            widgetJ.b(i23, i - 5, 0, 6 + i16 + 46 + 4);
            int i25 = i24 + 1;
            widgetJ.b(i24, i - 4, 0, 6 + i16 + 63);
            int i26 = i25 + 1;
            widgetJ.b(i25, i - 3, 0, 6 + i16 + 23);
            i2 = i26 + 1;
            widgetJ.b(i26, i - 2, 0, 6 + i16 + 23);
        }
        widgetD.k(9);
        widgetD.b(0, 32000, 0, 0);
        widgetD.b(1, 44099, 0, 31 + 50);
        widgetD.b(2, 16022, 0, 28 + 50);
        widgetD.b(3, 44101, 6, 30 + 50);
        widgetD.b(4, 16022, -1, aU.ho_ + 50);
        widgetD.b(5, 16018, 11, 54);
        widgetD.b(6, 16019, 37, 55);
        widgetD.b(7, 16020, 37, 55);
        widgetD.b(8, aU.kt_, 106, 59);
    }
}
