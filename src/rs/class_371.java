package rs;

import com.sun.jna.platform.win32.aU;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_371.class */
public class class_371 extends class_360 {
    private static final int d = 30333;
    private static final int e = 6;
    private static int f;
    private static List<class_372> g = new ArrayList();
    public static class_553 c = new class_373();

    public class_371(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(30072);
        class_355.c.a(30072, new class_374(this, 500L));
        addSprite(30330, "popups/activities 1");
        addSprite(30331, "popups/activities 2");
        Widget widgetD2 = d(30332);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = aU.ie;
        widgetD2.P = 449;
        widgetD2.aP = 235;
        widgetD2.bh = 87;
        for (int i = d; i <= 30369; i += 6) {
            a(i, "", this.a, 2, class_492.e, false, true);
            a(i + 1, 440, 14, 1, 1, 7960953, 16760832, 16721949);
            a(i + 2, "", this.a, 0, 1, true, false);
            a(i + 3, "", this.a, 0, class_492.d, false, true);
            a(i + 4, "", this.a, 0, class_492.d, false, true);
            a(i + 5, "", this.a, 0, class_492.d, false, true);
        }
        a(30375, "Event Activity Viewer", this.a, 2, class_492.e, true, true);
        a(30376, "<img=50> To prevent excessive farming, activities have timed limits on token earnings", this.a, 1, class_492.e, false, true);
        a(30377, "<img=78> @cya@The limit on an activity resets once its timer reaches <img=37> @whi@0:00", this.a, 1, class_492.e, false, true);
        widgetD.k(7);
        widgetD.b(0, 30330, 10, 11);
        widgetD.b(1, 30332, 25, 47);
        widgetD.b(2, 30375, 260, 27);
        widgetD.b(3, 30376, 23, User32.WM_MENUSELECT);
        widgetD.b(4, 30377, 110, CGL.kCGLCPSurfaceBackingSize);
        widgetD.b(5, 63740, 474, 25);
        widgetD.b(6, 63741, 474, 25);
        for (int i2 = 0; i2 < widgetD.ak.length; i2++) {
            int[] iArr = widgetD.ba;
            int i3 = i2;
            iArr[i3] = iArr[i3] - 10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        Widget widget = Widget.H[30332];
        widget.k(f * 7);
        int i = 10;
        int i2 = 0;
        for (int i3 = 0; i3 < f * 7; i3 += 7) {
            int i4 = i2;
            i2++;
            int i5 = d + (i4 * 6);
            widget.b(i3, i5, 0 + 1, i);
            int i6 = 0;
            for (int i7 = 0; i7 < 3; i7++) {
                widget.b(i3 + 3 + i7, i5 + 3 + i7, 0 + 1, (((i + 40) + 1) + i6) - 22);
                if (!Widget.H[i5 + 3 + i7].as.equalsIgnoreCase("")) {
                    i6 += 15;
                }
            }
            widget.b(i3 + 1, i5 + 1, 0 + 1, i + 20 + i6 + 3);
            widget.b(i3 + 2, i5 + 2, 0 + 229, i + 22 + i6 + 3);
            widget.b(i3 + 6, 30331, 0 + 20, i + 40 + i6 + 10);
            i = i + 40 + 15 + 15 + i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String[] strArr, int i, int i2, long j) {
        class_372 class_372Var = new class_372(str, j);
        Widget.H[d + (f * 6)].as = class_372Var.a();
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 >= strArr.length) {
                Widget.H[d + (f * 6) + 3 + i3].as = "";
            } else {
                Widget.H[d + (f * 6) + 3 + i3].as = strArr[i3];
            }
        }
        if (i2 == -1) {
            Widget.H[d + (f * 6) + 1].z = 16746752;
            Widget.H[d + (f * 6) + 1].w = 100;
            Widget.H[d + (f * 6) + 2].as = "<img=81> Activity locked! <img=81>";
            class_372Var.b = "<img=81>";
        } else if (i2 == 0) {
            Widget.H[d + (f * 6) + 1].z = 7788154;
            Widget.H[d + (f * 6) + 1].w = 100;
            Widget.H[d + (f * 6) + 2].as = "No token limit!";
        } else {
            if (i >= i2) {
                Widget.H[d + (f * 6) + 2].as = "@whi@<shad=1>Limit reached! Token earnings are locked until the limit timer ends..";
            } else {
                Widget.H[d + (f * 6) + 2].as = i + " / " + i2 + " token limit";
            }
            Widget.H[d + (f * 6) + 2].z = 16721949;
            Widget.H[d + (f * 6) + 1].w = (int) ((i / i2) * 100.0f);
        }
        g.add(class_372Var);
        f++;
    }

    private static void k() {
        f = 0;
    }
}
