package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_451.class */
public class class_451 extends class_360 {
    public static int c = 46500;
    public static final int d = 46506;
    public static final int e = 46606;
    public static final int f = 46608;
    public static final int g = 46758;
    public static int bG;
    public static int bH;
    public static int bI;
    public static int bJ;
    public static int bK;
    public static int bL;

    public static void h() {
        bG = d;
        bH = 3;
        bI = 3;
    }

    public static void i() {
        Widget.H[46607].V = 0;
        bJ = f;
        bK = 3;
        bL = 3;
    }

    public static void a(String str, boolean z) {
        if (bG == 0) {
            h();
        }
        if (bG >= 46606) {
            System.out.println("[ERROR] OVERFLOW CATEGORY");
            return;
        }
        int i = bG - d;
        if (z) {
            bH = 3;
            if (i > 0) {
                bI += 3;
            }
            a(bG, str, class_492.b, 2, 16751360, false, true);
            Widget.H[46505].b(i, bG, bH, bI);
            bI += 19;
            bH = 10;
        } else {
            a(bG, str, str, class_492.b, 0, class_492.e, false, true, 125);
            Widget.H[46505].b(i, bG, bH, bI);
            bI += 15;
        }
        bG++;
    }

    public static void b(String str) {
        if (bJ == 0) {
            i();
        }
        if (bJ >= 46758) {
            System.out.println("[ERROR] OVERFLOW DESCRIPTION");
            return;
        }
        String[] strArrSplit = str.split(",");
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        int i4 = Integer.parseInt(strArrSplit[3]);
        if (i == -1) {
            bL += i4;
            return;
        }
        int i5 = bJ - f;
        addSprite(bJ, "wiki/guide " + i);
        Widget.H[bJ].l = true;
        Widget.H[46607].b(i5, bJ, bK + i2, bL + i3);
        bL += i4;
        bJ++;
    }

    public static void b(String str, boolean z) {
        int i;
        if (bJ == 0) {
            i();
        }
        if (bJ >= 46758) {
            System.out.println("[ERROR] OVERFLOW DESCRIPTION");
            return;
        }
        boolean z2 = false;
        boolean z3 = false;
        if (str.startsWith("{C}")) {
            str = str.replace("{C}", "");
            z2 = true;
        }
        if (str.contains("{B}")) {
            str = str.replace("{B}", "");
            z3 = true;
        }
        if (Widget.H[bJ] != null && Widget.H[bJ].aG == 5) {
            Widget.H[bJ].E = null;
            Widget.H[bJ].aE = null;
        }
        if (z) {
            if (str.startsWith("{")) {
                a(bJ, str.split("}")[1], "Select option", class_492.b, 0, Integer.parseInt(str.split("}")[0].replace("{", "")), z2, true, 500);
            } else {
                a(bJ, str, "Select option", class_492.b, 0, class_492.e, z2, true, 500);
            }
        } else if (z3) {
            a(bJ, str, class_492.b, 1, 16751360, z2, true);
        } else {
            a(bJ, str, class_492.b, 0, 16751360, z2, true);
        }
        int i2 = bJ - f;
        Widget widget = Widget.H[46607];
        int i3 = bJ;
        int i4 = bK;
        if (z2) {
            i = z ? -116 : 134;
        } else {
            i = 0;
        }
        widget.b(i2, i3, i4 + i, bL);
        bL += 15 + (z3 ? 4 : 0);
        bJ++;
    }

    public static void j() {
        if (bG >= 46606) {
            return;
        }
        for (int i = bG; i < 46606; i++) {
            Widget.H[i].as = "";
        }
    }

    public static void k() {
        if (bJ >= 46758) {
            return;
        }
        for (int i = bJ; i < 46758; i++) {
            Widget.H[i].as = "";
            if (Widget.H[i].aG == 5) {
                Widget.H[i].E = null;
                Widget.H[i].aE = null;
            }
        }
    }

    public static void c(String str) {
        int i = Integer.parseInt(str.replace("WIKI_SELECTED_", ""));
        for (int i2 = 46506; i2 < 46606; i2++) {
            if (Widget.H[i2] != null && Widget.H[i2].as != null) {
                if (Widget.H[i2].as.contains("<img=39> ")) {
                    Widget.H[i2].as = Widget.H[i2].as.replaceAll("<img=39> ", "");
                }
                if (i2 == i) {
                    Widget.H[i2].as = "<img=39> " + Widget.H[i2].as;
                }
            }
        }
    }

    public class_451(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(c);
        addSprite(46501, "wiki/sprite 0");
        a(46502, "Official SpawnPK Knowledgebase", this.a, 2, 16751360, true, true);
        a(46503, "Category List", this.a, 2, 16751360, false, true);
        a(46504, "Selected Article Title Text", this.a, 2, 16751360, false, true);
        Widget widgetD2 = d(46505);
        widgetD2.aF = 1000;
        widgetD2.P = 168;
        widgetD2.aP = 261;
        widgetD2.k(100);
        for (int i = 0; i < 100; i++) {
            int i2 = d + i;
            a(i2, "", this.a, 0, 16751360, false, true);
            widgetD2.b(i, i2, 3, 3 + (i * 15));
        }
        Widget widgetD3 = d(46607);
        widgetD3.aF = aU.uS;
        widgetD3.P = 277;
        widgetD3.aP = 261;
        widgetD3.k(150);
        for (int i3 = 0; i3 < 150; i3++) {
            int i4 = f + i3;
            a(i4, "", this.a, 0, 16751360, false, true);
            widgetD3.b(i3, i4, 3, 3 + (i3 * 15));
        }
        h();
        j();
        a(46759, "drops/sprite", 3, 17, 17, "Go back", -1, 46760, 1);
        a(46760, "drops/sprite", 4, 17, 17, 46761);
        widgetD.k(10);
        widgetD.b(0, 46501, 2, 2);
        widgetD.b(1, 65418, aU.iq_, 9);
        widgetD.b(2, 65419, aU.iq_, 9);
        widgetD.b(3, 46502, User32.WM_IME_ENDCOMPOSITION, 10);
        widgetD.b(4, 46503, 16, 40);
        widgetD.b(5, 46504, 208, 40);
        widgetD.b(6, 46505, 13, 61);
        widgetD.b(7, 46607, 208, 61);
        widgetD.b(8, 46759, 9, 9);
        widgetD.b(9, 46760, 9, 9);
    }
}
