package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_487.class */
public class class_487 extends class_360 {
    public static class_333 c;
    public static class_333 d;
    public static class_333[] e = new class_333[2];
    public static class_333 f;

    public class_487(class_338[] class_338VarArr) {
        super(class_338VarArr);
        this.b = true;
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(54300);
        addSprite(54301, "drops/collection 3");
        c = new class_333("drops/collection 1");
        d = new class_333("drops/collection 2");
        e[0] = new class_333("drops/collection 4");
        e[1] = new class_333("drops/collection 5");
        f = new class_333("drops/collection 6");
        b(54302, 1, "drops/collection", "Bosses");
        b(54303, 2, "drops/collection", "Boxes");
        b(54304, 2, "drops/collection", "Minigames");
        b(54305, 2, "drops/collection", "Other");
        b(54306, 2, "drops/collection", "N/A");
        a(54307, "Bosses", this.a, 1, class_492.e);
        a(54308, "Boxes", this.a, 1, class_492.e);
        a(54309, "Minigames", this.a, 1, class_492.e);
        a(54310, "Other", this.a, 1, class_492.e);
        a(54311, "N/A", this.a, 1, class_492.e);
        a(54312, "Collection Log <img=321>", this.a, 2, class_492.e);
        Widget widgetD2 = d(54313);
        widgetD2.aF = aU.ie;
        widgetD2.P = 190;
        widgetD2.aP = User32.WM_SYSCHAR;
        widgetD2.k(100);
        int i = 54314;
        int i2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            int i4 = i;
            int i5 = i + 1;
            addSprite(i4, "");
            Widget widget = Widget.H[i5 - 1];
            widget.E = i3 == 0 ? f : e[i3 % 2 == 0 ? (char) 0 : (char) 1];
            Widget widget2 = Widget.H[i5 - 1];
            widget2.aE = i3 == 0 ? f : e[i3 % 2 == 0 ? (char) 0 : (char) 1];
            i = i5 + 1;
            a(i5, "", "Select collection log", this.a, 1, class_492.e, false, true, User32.VK_PLAY);
            int i6 = i2;
            int i7 = i2 + 1;
            widgetD2.b(i6, i - 2, 3, 1 + (i3 * 16));
            i2 = i7 + 1;
            widgetD2.b(i7, i - 1, 5, 1 + (i3 * 16));
        }
        a(54414, "Collection name", this.a, 2, class_492.e);
        a(54415, "Obtained: @red@0/0", this.a, 0, class_492.e);
        c(54416, "Kill count: @whi@0", this.a, 0, class_492.e, true);
        Widget widgetD3 = d(54417);
        widgetD3.aF = 950;
        widgetD3.P = 258;
        widgetD3.aP = 185;
        widgetD3.k(1);
        a(54418, (Boolean) false);
        H[54418].K = new int[120];
        H[54418].av = new int[120];
        H[54418].ax = new int[120];
        H[54418].ar = new int[120];
        H[54418].P = 6;
        H[54418].aP = 20;
        H[54418].ab = 11;
        H[54418].ao = 16;
        widgetD3.b(0, 54418, 3, 3);
        a(54419, "Complete this collection and receive..", this.a, 0, class_492.e);
        a(54420, "@yel@15M coins + 25,000 RX points + 150 boss points", this.a, 0, class_492.e);
        a(54421, "SCRIPT_HOLDER", this.a, 0, class_492.e);
        a(54422, "SCRIPT_HOLDER", this.a, 0, class_492.e);
        widgetD.k(21);
        widgetD.b(0, 54301, 3, 3);
        widgetD.b(1, 54302, 12, 39);
        widgetD.b(2, 54303, 108, 39);
        widgetD.b(3, 54304, 204, 39);
        widgetD.b(4, 54305, 300, 39);
        widgetD.b(5, 54306, -5000, 39);
        widgetD.b(6, 54307, 17, 41);
        widgetD.b(7, 54308, 113, 41);
        widgetD.b(8, 54309, aU.hs_, 41);
        widgetD.b(9, 54310, CGL.kCGLCESurfaceBackingSize, 41);
        widgetD.b(10, 54311, -5000, 41);
        widgetD.b(11, 54312, 214, 12);
        widgetD.b(12, 63740, 482, 13);
        widgetD.b(13, 63741, 482, 13);
        widgetD.b(14, 54313, 10, 60);
        widgetD.b(15, 54414, 223, 62);
        widgetD.b(16, 54415, 223, 84);
        widgetD.b(17, 54416, 494, 84);
        widgetD.b(18, 54417, 222, 101);
        widgetD.b(19, 54419, 220, User32.WM_MENUGETOBJECT);
        widgetD.b(20, 54420, 220, 308);
    }

    @Override // rs.class_360
    public void a(int i) {
    }

    @Override // rs.class_360
    public void a(int i, String str) {
        if (i == 54315) {
            for (int i2 = 54315; i2 <= 54413; i2++) {
                if (i2 % 2 != 0) {
                    Widget.H[i2].as = "";
                }
            }
        }
        if (i == 54421) {
            boolean z = false;
            int i3 = Integer.parseInt(str);
            int i4 = 54314;
            while (i4 <= 54412) {
                if (i4 % 2 == 0) {
                    Widget.H[i4].E = i4 == i3 ? f : e[z ? 1 : 0];
                    Widget.H[i4].aE = i4 == i3 ? f : e[z ? 1 : 0];
                    z = !z;
                }
                i4++;
            }
            H[54417].V = 0;
        }
        if (i == 54422) {
            int i5 = Integer.parseInt(str);
            if (i5 >= 54302 && i5 <= 54306) {
                int i6 = 54302;
                while (i6 <= 54306) {
                    Widget.H[i6].E = i5 == i6 ? c : d;
                    Widget.H[i6].aE = i5 == i6 ? c : d;
                    i6++;
                }
                H[54313].V = 0;
            }
            boolean z2 = false;
            for (int i7 = 54314; i7 <= 54412; i7++) {
                if (i7 % 2 == 0) {
                    Widget.H[i7].E = e[z2 ? 1 : 0];
                    Widget.H[i7].aE = e[z2 ? 1 : 0];
                    z2 = !z2;
                }
            }
        }
    }

    @Override // rs.class_360
    public void b() {
        boolean z = false;
        int i = 54314;
        while (i <= 54412) {
            if (i % 2 == 0) {
                Widget.H[i].E = i == 54314 ? f : e[z ? 1 : 0];
                Widget.H[i].aE = i == 54314 ? f : e[z ? 1 : 0];
                z = !z;
            }
            i++;
        }
        int i2 = 54302;
        while (i2 <= 54306) {
            Widget.H[i2].E = 54302 == i2 ? c : d;
            Widget.H[i2].aE = 54302 == i2 ? c : d;
            i2++;
        }
        H[54313].V = 0;
        H[54417].V = 0;
    }
}
