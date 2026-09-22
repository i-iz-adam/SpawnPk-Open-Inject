package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import java.util.HashMap;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_434.class */
public class class_434 extends class_360 {
    private static HashMap<Integer, Integer> g = new HashMap<>();
    private static final int[] bG = {55303, 55304, 55305, 55306, 55307, 55308, 55309, 55310, 55311, 55312};
    private static final int[] bH = {55290, 55291, 55292, 55293, 55333};
    private static final int[][] bI = {new int[]{55313, 55321}, new int[]{55315, 55323}, new int[]{55317, 55325}, new int[]{55319, 55327}, new int[]{55329}};
    public static long[] c = new long[5];
    public static class_333 d = null;
    public static class_333 e = null;
    public static class_553 f = new class_435();

    public class_434(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static boolean a(String str, int i) {
        class_333 class_333Var;
        if (str.startsWith("npc_")) {
            int i2 = Integer.parseInt(str.substring(4));
            class_333Var = class_103.a(class_104.a, i2, 64);
            if (class_333Var == null) {
                long j = c[i];
                String str2 = "load_npc_head_" + i2;
                if (!ClientThread.a(str2)) {
                    ClientThread.a(str2, () -> {
                        return System.currentTimeMillis() - j < 10000 && c[i] == j && !a(str, i);
                    });
                }
            }
        } else {
            class_333Var = new class_333(str);
            if (class_333Var.n < 32 && class_333Var.o < 32) {
                class_333Var.b(class_333Var.n * 2, class_333Var.o * 2);
            }
        }
        if (class_333Var == null) {
            a(Client.fE[291], i);
            return false;
        }
        a(class_333Var, i);
        return true;
    }

    public static void a(class_333 class_333Var, int i) {
        int i2 = 55314;
        if (i == 1) {
            i2 = 55316;
        }
        if (i == 2) {
            i2 = 55318;
        }
        if (i == 3) {
            i2 = 55320;
        }
        a(i2, class_333Var);
        Widget.H[i2].bl = false;
        Widget.H[i2].aH = (64 - class_333Var.n) / 2;
        Widget.H[i2].aN = (64 - class_333Var.o) / 2;
        int i3 = 55322;
        if (i == 1) {
            i3 = 55324;
        }
        if (i == 2) {
            i3 = 55326;
        }
        if (i == 3) {
            i3 = 55328;
        }
        if (i == 4) {
            i3 = 55330;
        }
        a(i3, class_333Var);
        Widget.H[i3].bl = false;
        Widget.H[i3].aH = (55 - class_333Var.n) / 2;
        Widget.H[i3].aN = (55 - class_333Var.o) / 2;
    }

    @Override // rs.class_360
    public void a() {
        e = new class_333("options/make/sprite 3");
        d = new class_333("options/make/sprite 4");
        a(55301, "How many would you like to make?", this.a, 2, 4206624, true, false);
        a(55302, "Choose a quantity, then click an image to begin.", this.a, 0, 6312008, true, false);
        b(55303, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        a(55304, e.d, this.a, 0, 4206624, true, false);
        b(55305, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        a(55306, e.k, this.a, 0, 4206624, true, false);
        b(55307, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        a(55308, "10", this.a, 0, 4206624, true, false);
        b(55309, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        a(55310, "X", this.a, 0, 4206624, true, false);
        b(55311, 4, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        a(55312, "@whi@All", this.a, 0, 4206624, true, false);
        b(55313, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        c(55314, 379, 64);
        Widget.H[55314].bo = 100;
        b(55315, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        c(55316, 379, 64);
        Widget.H[55316].bo = 100;
        b(55317, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        c(55318, 379, 64);
        Widget.H[55318].bo = 100;
        b(55319, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        c(55320, 379, 64);
        Widget.H[55320].bo = 100;
        b(55321, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        c(55322, 379, 55);
        Widget.H[55322].bo = 100;
        b(55323, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        c(55324, 379, 55);
        Widget.H[55324].bo = 100;
        b(55325, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        c(55326, 379, 55);
        Widget.H[55326].bo = 100;
        b(55327, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        c(55328, 379, 55);
        Widget.H[55328].bo = 100;
        b(55329, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        c(55330, 379, 55);
        Widget.H[55330].bo = 100;
        for (int i = 0; i < bI.length; i++) {
            for (int i2 : bI[i]) {
                Widget.H[i2].bE = (i3, i4) -> {
                    if (Widget.H[i2].bv) {
                        if (i2 >= 55321) {
                            int i3b = 45 - 3;
                        }
                        Client.gl.c(Widget.H[i2].Q, (i3 + (Widget.H[i2].E.n / 2)) - 1, i4 - 5, 0, -1);
                    }
                };
                String str = (i + 1) + ".";
                Widget.H[i2].bF = (i5, i6) -> {
                    if (Widget.H[i2].bv) {
                        Launcher.n().o().gm.b(str, i5 + 6, i6 + 17, class_492.c, 0);
                    }
                };
            }
        }
        Widget widgetD = d(55290);
        widgetD.k(14);
        int iA = a(widgetD);
        int i7 = iA + 1;
        widgetD.b(iA, 55313, 195, 36);
        int i8 = i7 + 1;
        widgetD.b(i7, 55314, aU.hu_, 41);
        Widget widgetD2 = d(55291);
        widgetD2.k(16);
        int iA2 = a(widgetD2);
        int i9 = iA2 + 1;
        widgetD2.b(iA2, 55313, 135, 36);
        int i10 = i9 + 1;
        widgetD2.b(i9, 55314, 152, 41);
        int i11 = i10 + 1;
        widgetD2.b(i10, 55315, 255, 36);
        int i12 = i11 + 1;
        widgetD2.b(i11, 55316, User32.WM_INITDIALOG, 41);
        Widget widgetD3 = d(55292);
        widgetD3.k(18);
        int iA3 = a(widgetD3);
        int i13 = iA3 + 1;
        widgetD3.b(iA3, 55313, 85, 36);
        int i14 = i13 + 1;
        widgetD3.b(i13, 55314, 102, 41);
        int i15 = i14 + 1;
        widgetD3.b(i14, 55315, 195, 36);
        int i16 = i15 + 1;
        widgetD3.b(i15, 55316, aU.hu_, 41);
        int i17 = i16 + 1;
        widgetD3.b(i16, 55317, CGL.kCGLCESurfaceBackingSize, 36);
        int i18 = i17 + 1;
        widgetD3.b(i17, 55318, 322, 41);
        Widget widgetD4 = d(55293);
        widgetD4.k(20);
        int iA4 = a(widgetD4);
        int i19 = iA4 + 1;
        widgetD4.b(iA4, 55313, 15, 36);
        int i20 = i19 + 1;
        widgetD4.b(i19, 55314, 32, 41);
        int i21 = i20 + 1;
        widgetD4.b(i20, 55315, 135, 36);
        int i22 = i21 + 1;
        widgetD4.b(i21, 55316, 152, 41);
        int i23 = i22 + 1;
        widgetD4.b(i22, 55317, 255, 36);
        int i24 = i23 + 1;
        widgetD4.b(i23, 55318, User32.WM_INITDIALOG, 41);
        int i25 = i24 + 1;
        widgetD4.b(i24, 55319, 375, 36);
        int i26 = i25 + 1;
        widgetD4.b(i25, 55320, User32.WS_EX_PALETTEWINDOW, 41);
        Widget widgetD5 = d(55333);
        widgetD5.k(22);
        int iA5 = a(widgetD5);
        int i27 = (-2) - 5;
        int i28 = iA5 + 1;
        widgetD5.b(iA5, 55321, 5 - 5, 36);
        int i29 = i28 + 1;
        widgetD5.b(i28, 55322, 22 + i27, 41 + 0);
        int i30 = i29 + 1;
        widgetD5.b(i29, 55323, 103 - 5, 36);
        int i31 = i30 + 1;
        widgetD5.b(i30, 55324, 120 + i27, 41 + 0);
        int i32 = i31 + 1;
        widgetD5.b(i31, 55325, 201 - 5, 36);
        int i33 = i32 + 1;
        widgetD5.b(i32, 55326, 218 + i27, 41 + 0);
        int i34 = i33 + 1;
        widgetD5.b(i33, 55327, aU.ib_ - 5, 36);
        int i35 = i34 + 1;
        widgetD5.b(i34, 55328, 316 + i27, 41 + 0);
        int i36 = i35 + 1;
        widgetD5.b(i35, 55329, 397 - 5, 36);
        int i37 = i36 + 1;
        widgetD5.b(i36, 55330, 414 + i27, 41 + 0);
    }

    public int a(Widget widget) {
        int i = 0 + 1;
        widget.b(0, 55301, 150, 0);
        int i2 = i + 1;
        widget.b(i, 55302, 150, 17);
        int i3 = i2 + 1;
        widget.b(i2, 55303, 285, 0);
        int i4 = i3 + 1;
        widget.b(i3, 55304, aU.ie_, 9);
        int i5 = i4 + 1;
        widget.b(i4, 55305, 325, 0);
        int i6 = i5 + 1;
        widget.b(i5, 55306, 342, 9);
        int i7 = i6 + 1;
        widget.b(i6, 55307, g.p, 0);
        int i8 = i7 + 1;
        widget.b(i7, 55308, 382, 9);
        int i9 = i8 + 1;
        widget.b(i8, 55309, 405, 0);
        int i10 = i9 + 1;
        widget.b(i9, 55310, 422, 9);
        int i11 = i10 + 1;
        widget.b(i10, 55311, 445, 0);
        int i12 = i11 + 1;
        widget.b(i11, 55312, 462, 9);
        return i12;
    }
}
