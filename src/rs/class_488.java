package rs;

import com.fasterxml.jackson.core.b.a;
import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_488.class */
public class class_488 extends class_360 {
    public static boolean c = false;
    public static String d = "setyellcolors";
    public static String e = "FE0002";
    public static String f = e.e;
    public static Map<Integer, String> g = new HashMap();
    public static Map<Integer, Integer> bG = new HashMap();
    public static int[] bH = {924, 924, 62575, 62575, aU.Ac, 0};
    public static int bI = 0;

    public class_488(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void h() {
        if (f == null) {
            Widget.H[63026].as = "<col=" + e + ">Sample on chat background";
        } else {
            Widget.H[63026].as = "<shad=" + f + "><col=" + e + ">Sample on chat background";
        }
    }

    public static void i() {
        class_419.l();
        class_419.m();
        class_419.bK = true;
        class_419.a("CAPE", 23063);
        o(b(bH[bI], bI != 5));
    }

    public static void m(int i) {
        if (Client.cH == 63000) {
            if (i == 63027) {
                String str = "::" + d + " " + e;
                if (f != null) {
                    str = str + " " + f;
                }
                Client.ap = str;
            }
            if (c && i == 63024) {
                Widget.H[63022].E = new class_333("gambling/sprite 2");
                Widget.H[63023].E = new class_333("gambling/sprite 1");
                c = false;
                h();
            }
            if (!c && i == 63025) {
                Widget.H[63022].E = new class_333("gambling/sprite 1");
                Widget.H[63023].E = new class_333("gambling/sprite 2");
                c = true;
                h();
            }
            if (i < 63002 || i > 63021) {
                return;
            }
            if (c) {
                f = g.get(Integer.valueOf(i));
            } else {
                e = g.get(Integer.valueOf(i));
            }
            h();
            return;
        }
        if (Client.cH == 63036) {
            if (i == 63027) {
                int[] iArr = new int[bH.length];
                int i2 = 0;
                while (i2 < bH.length) {
                    iArr[i2] = b(bH[i2], i2 != 5) - 63002;
                    i2++;
                }
                Client.ap = (((((("::compcolors " + iArr[4] + " ") + iArr[0] + " ") + iArr[2] + " ") + iArr[1] + " ") + iArr[3] + " ") + iArr[5]);
            }
            if (i >= 63002 && i <= 63021) {
                int iB = b("#" + g.get(Integer.valueOf(i)));
                int i3 = bH[bI];
                if (bI == 5) {
                    iB = Integer.parseInt(g.get(Integer.valueOf(i)), 16);
                }
                bG.put(Integer.valueOf(a.SURR2_LAST), 57443);
                bH[bI] = iB;
                if (i3 != iB) {
                    class_419.m();
                    class_419.bK = true;
                }
                o(i);
            }
            if (i < 63046 || i > 63051) {
                return;
            }
            bI = i - 63046;
            o(b(bH[bI], bI != 5));
            int i4 = 63040;
            while (i4 <= 63045) {
                Widget.H[i4].E = new class_333(i4 != 63040 + bI ? "gambling/sprite 1" : "gambling/sprite 2");
                i4++;
            }
        }
    }

    public static int a(int i, boolean z) {
        return !z ? Integer.parseInt(g.get(Integer.valueOf(63002 + i)), 16) : b("#" + g.get(Integer.valueOf(63002 + i)));
    }

    public static int b(String str) {
        Color colorDecode = Color.decode(str);
        return f(colorDecode.getRed(), colorDecode.getGreen(), colorDecode.getBlue());
    }

    public static int f(int i, int i2, int i3) {
        float[] fArrRGBtoHSB = Color.RGBtoHSB(i, i2, i3, (float[]) null);
        float f2 = fArrRGBtoHSB[0];
        float f3 = fArrRGBtoHSB[1];
        float f4 = fArrRGBtoHSB[2];
        int i4 = (int) (f2 * 63.0f);
        int i5 = (int) (f3 * 7.0f);
        int iIntValue = (i4 << 10) + (i5 << 7) + ((int) (f4 * 127.0f));
        if (bG.get(Integer.valueOf(iIntValue)) != null) {
            iIntValue = bG.get(Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    public static int n(int i) {
        return Color.HSBtoRGB(((i >> 10) & 63) / 63.0f, ((i >> 7) & 7) / 7.0f, (i & 127) / 127.0f);
    }

    public static int b(int i, boolean z) {
        for (Integer num : g.keySet()) {
            if ((z ? b("#" + g.get(num)) : Integer.parseInt(g.get(num), 16)) == i) {
                return num.intValue();
            }
        }
        return 63002;
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(63000);
        addSprite(63001, "options/colors/0");
        for (int i = 1; i <= 20; i++) {
            a(63001 + i, "options/colors/" + i, "Select color");
        }
        c(63022, 2, "gambling/sprite");
        c(63023, 1, "gambling/sprite");
        a(63024, "<tab=20>Font color", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63025, "<tab=20>Shadow color", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63026, "<shad=", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63026, "<shad=" + f + "><col=" + e + ">Sample on chat background", this.a, 1, class_492.e, true, false);
        a(63027, "teleport/SPRITE", 10, 100, 32, "Confirm colors", -1, 63028, 1);
        a(63028, "teleport/SPRITE", 11, 100, 32, 63029);
        a(63030, "<img=24> Confirm", this.a, 0, 16751360, true, true);
        a(63031, "teleport/SPRITE", 10, 100, 32, "Cancel colors", -1, 63032, 1);
        a(63032, "teleport/SPRITE", 11, 100, 32, 63033);
        a(63034, "<img=25> Cancel", this.a, 0, 16751360, true, true);
        a(63035, "Text Color Selection Menu", this.a, 2, 16751360, true, true);
        widgetD.k(33);
        widgetD.b(0, 63001, 108, 17);
        int i2 = 162;
        int i3 = 50;
        int i4 = 0;
        for (int i5 = 1; i5 <= 20; i5++) {
            widgetD.b(i5, 63001 + i5, i2, i3);
            i2 += 40;
            i4++;
            if (i4 == 5) {
                i3 += 50;
                i2 = 162;
                i4 = 0;
            }
        }
        g.put(63002, "FE0002");
        g.put(63003, "FEFF01");
        g.put(63004, "FF1BFF");
        g.put(63005, "FF4DFF");
        g.put(63006, "B07EFF");
        g.put(63007, e.e);
        g.put(63008, "363435");
        g.put(63009, "DFD6D7");
        g.put(63010, "7DFFFF");
        g.put(63011, "940000");
        g.put(63012, "9FFF9F");
        g.put(63013, "008200");
        g.put(63014, "FF8F8D");
        g.put(63015, "FF9620");
        g.put(63016, "FF6F00");
        g.put(63017, "FF5153");
        g.put(63018, "01FFFF");
        g.put(63019, "00AFFF");
        g.put(63020, "0000FE");
        g.put(63021, "01FF02");
        widgetD.b(21, 63022, 125, User32.VK_OEM_BACKTAB);
        widgetD.b(22, 63024, 125, User32.VK_CRSEL);
        widgetD.b(23, 63023, 125, 263);
        widgetD.b(24, 63025, 125, User32.WM_UNICHAR);
        widgetD.b(25, 63026, 310, 253);
        widgetD.b(26, 63027, 152, 284);
        widgetD.b(27, 63028, 152, 284);
        widgetD.b(28, 63030, 199, User32.WM_MENUCOMMAND);
        widgetD.b(29, 63031, User32.WM_SYSCHAR, 284);
        widgetD.b(30, 63032, User32.WM_SYSCHAR, 284);
        widgetD.b(31, 63034, 309, User32.WM_MENUCOMMAND);
        widgetD.b(32, 63035, 256, 22);
        Widget widgetD2 = d(63036);
        a(63037, "Cape Color Selection Menu", this.a, 2, 16751360, true, true);
        a(63038, 110, User32.VK_PLAY);
        Widget.H[63038].ae = 4907;
        Widget.H[63038].aR = aU.ie;
        Widget.H[63038].aT = aU.qB;
        Widget.H[63038].aq = 0;
        Widget.H[63038].cache = 0;
        Widget.H[63038].aB = class_102.c(4907).w;
        Widget.H[63038].aC = class_102.c(4907).w;
        addSprite(63039, "options/colors/cape");
        c(63040, 2, "gambling/sprite");
        c(63041, 1, "gambling/sprite");
        c(63042, 1, "gambling/sprite");
        c(63043, 1, "gambling/sprite");
        c(63044, 1, "gambling/sprite");
        c(63045, 1, "gambling/sprite");
        a(63046, "<tab=20>Detail color 1", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63047, "<tab=20>Detail color 2", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63048, "<tab=20>Background color 1", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63049, "<tab=20>Background color 2", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63050, "<tab=20>Trim color", "Select color type", this.a, 0, class_492.e, false, true, 150);
        a(63051, "<tab=20>Particle color", "Select color type", this.a, 0, class_492.e, false, true, 150);
        addSprite(63052, "options/colors/highlight");
        widgetD2.k(42);
        widgetD2.b(0, 63039, 70, 17);
        int i6 = 162;
        int i7 = 50;
        int i8 = 0;
        for (int i9 = 1; i9 <= 20; i9++) {
            widgetD2.b(i9, 63001 + i9, i6 - 38, i7);
            i6 += 40;
            i8++;
            if (i8 == 5) {
                i7 += 50;
                i6 = 162;
                i8 = 0;
            }
        }
        widgetD2.b(21, 63027, 152, 284);
        widgetD2.b(22, 63028, 152, 284);
        widgetD2.b(23, 63030, 199, User32.WM_MENUCOMMAND);
        widgetD2.b(24, 63031, User32.WM_SYSCHAR, 284);
        widgetD2.b(25, 63032, User32.WM_SYSCHAR, 284);
        widgetD2.b(26, 63034, 309, User32.WM_MENUCOMMAND);
        widgetD2.b(27, 63037, 256, 22);
        widgetD2.b(28, 63038, 321, 35);
        widgetD2.b(29, 63040, 93, User32.VK_OEM_COPY);
        widgetD2.b(30, 63046, 93, User32.VK_OEM_ENLW);
        widgetD2.b(31, 63041, 93, User32.WM_SYSCHAR);
        widgetD2.b(32, 63047, 93, 264);
        widgetD2.b(33, 63042, 193, User32.VK_OEM_COPY);
        widgetD2.b(34, 63048, 193, User32.VK_OEM_ENLW);
        widgetD2.b(35, 63043, 193, User32.WM_SYSCHAR);
        widgetD2.b(36, 63049, 193, 264);
        widgetD2.b(37, 63044, 323, User32.VK_OEM_COPY);
        widgetD2.b(38, 63050, 323, User32.VK_OEM_ENLW);
        widgetD2.b(39, 63045, 323, User32.WM_SYSCHAR);
        widgetD2.b(40, 63051, 323, 264);
        widgetD2.b(41, 63052, widgetD2.al[5] - 2, widgetD2.ba[5] - 2);
    }

    public static void o(int i) {
        int i2 = -1;
        Widget widget = Widget.H[63036];
        for (int i3 = 1; i3 <= 20; i3++) {
            if (widget.ak[i3] == i) {
                i2 = i3;
                break;
            }
        }
        if (i2 == -1) {
            return;
        }
        widget.al[41] = widget.al[i2] - 2;
        widget.ba[41] = widget.ba[i2] - 2;
    }

    static {
        bG.put(969, 924);
        bG.put(64510, 970);
        bG.put(0, 1);
        bG.put(5119, 332770);
        bG.put(32639, 35838);
        bG.put(35839, 44031);
        bG.put(44030, 305970);
    }
}
