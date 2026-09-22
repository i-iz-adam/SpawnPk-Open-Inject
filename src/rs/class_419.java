package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.aW;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_419.class */
public class class_419 extends class_360 {
    public static final int c = 47505;
    public static final int d = 47704;
    public static final int e = 47709;
    public static final int f = 47808;
    public static final int g = 7;
    public static ColorUtility bG = null;
    public static ColorUtility bH = null;
    public static Map<String, Integer> bI = new HashMap();
    public static int bJ = 808;
    public static boolean bK = false;
    public static int bL;
    public static int bM;
    public static int bN;
    public static int bO;
    public static int bP;
    public static int bQ;
    public static boolean bR;

    public static void a(boolean z) {
        if (z) {
            for (int i = 47819; i <= 47837; i++) {
                Widget.H[i].bd = true;
            }
        } else {
            for (int i2 = 47819; i2 <= 47837; i2++) {
                Widget.H[i2].bd = false;
            }
        }
        bR = z;
    }

    public static void h() {
        for (int i = 47505; i <= 47704; i++) {
            Widget.a(i, "", class_492.b, 0, 16751360, false, true);
        }
        bL = c;
        bM = 3;
        bN = 3;
    }

    public static void i() {
        if (bO >= 47808) {
            return;
        }
        for (int i = bO; i < 47808; i++) {
            Widget.H[i].as = "";
            if (Widget.H[i].aG == 5) {
                Widget.H[i].E = null;
                Widget.H[i].aE = null;
            }
        }
    }

    public static void j() {
        if (bL >= 47704) {
            return;
        }
        for (int i = bL; i < 47704; i++) {
            Widget.H[i].as = "";
        }
    }

    public static void k() {
        addSprite(47706, "wiki/item 1");
        Widget.H[47708].al[3] = 16;
        Widget.H[47708].al[4] = 16;
        Widget.H[47708].V = 0;
        bO = e;
        bP = 3;
        bQ = aU.ht_;
    }

    public static void l() {
        bI.clear();
        bK = false;
        bG = null;
        bH = null;
        bJ = 808;
        for (int i = 0; i < 15; i++) {
            H[47707].ax[i] = 0;
            H[47707].av[i] = 0;
        }
    }

    public static void m() {
        bG = null;
        bH = null;
        Widget.aM.a();
    }

    public static void a(String str, boolean z, boolean z2) {
        if (bL == 0) {
            h();
        }
        if (bL >= 47704) {
            System.out.println("[ERROR] OVERFLOW CATEGORY");
            return;
        }
        int i = bL - c;
        if (z) {
            bM = z2 ? 15 : 3;
            if (i > 0) {
                bN += 3;
            }
            a(bL, !z2 ? "<u=16776960>" + str + ":" : "<col=C0981F>" + str, class_492.b, 2, 16751360, false, true);
            Widget.H[47504].b(i, bL, bM, bN);
            bN += 19;
            bM = z2 ? 30 : 15;
        } else {
            a(bL, str, str, class_492.b, 0, class_492.e, false, true, 125);
            Widget.H[47504].b(i, bL, bM, bN);
            bN += 15;
        }
        bL++;
    }

    public static void a(String str, boolean z) {
        int i;
        if (bO == 0) {
            k();
        }
        if (bO >= 47808) {
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
        if (Widget.H[bO] != null && Widget.H[bO].aG == 5) {
            Widget.H[bO].E = null;
            Widget.H[bO].aE = null;
        }
        if (z) {
            a(bO, str, "Select option", class_492.b, 0, class_492.e, z2, true, 500);
        } else if (z3) {
            a(bO, str, class_492.b, 2, 16751360, z2, true);
        } else {
            a(bO, str, class_492.b, 1, 16751360, z2, true);
        }
        int i2 = (bO - e) + 7;
        Widget widget = Widget.H[47708];
        int i3 = bO;
        int i4 = bP;
        if (z2) {
            i = (z ? -116 : 134) + 150;
        } else {
            i = 0;
        }
        widget.b(i2, i3, i4 + i, bQ + 30);
        bQ += 15 + (z3 ? 5 : 0);
        bO++;
    }

    public static void b(String str) {
        if (bO == 0) {
            k();
        }
        if (bO >= 47808) {
            System.out.println("[ERROR] OVERFLOW DESCRIPTION");
            return;
        }
        String[] strArrSplit = str.split(",");
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        int i4 = Integer.parseInt(strArrSplit[3]);
        if (i == -1) {
            bQ += i4;
            return;
        }
        int i5 = (bO - e) + 7;
        addSprite(bO, "wiki/guide " + i);
        Widget.H[bO].l = true;
        Widget.H[47708].b(i5, bO, bP + i2, bQ + i3);
        bQ += i4;
        bO++;
    }

    public static void c(String str) {
        int i = Integer.parseInt(str.replace("ITEM_GUIDE_SELECTED_", ""));
        for (int i2 = 47505; i2 < 47704; i2++) {
            if (Widget.H[i2] != null && Widget.H[i2].as != null) {
                if (Widget.H[i2].as.contains("<img=24>")) {
                    Widget.H[i2].as = Widget.H[i2].as.replaceAll("<img=24> ", "");
                }
                if (i2 == i) {
                    Widget.H[i2].as = "<img=24> " + Widget.H[i2].as;
                }
            }
        }
    }

    public class_419(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(47500);
        widgetD.f();
        a(47501, "Official SpawnPK Item Library", this.a, 2, 16751360, true, true);
        a(47502, "", this.a, 2, 16751360, false, true);
        a(47503, "Selected Item Guide Title Text", this.a, 2, 16751360, false, true);
        Widget widgetD2 = d(47504);
        widgetD2.aF = 2350;
        widgetD2.P = 168;
        widgetD2.aP = 436;
        widgetD2.k(200);
        for (int i = 0; i < 200; i++) {
            int i2 = c + i;
            a(i2, "", this.a, 0, 16751360, false, true);
            widgetD2.b(i, i2, 3, 3 + (i * 15));
        }
        a(47705, 110, User32.VK_PLAY);
        Widget.H[47705].ae = 4907;
        Widget.H[47705].aR = aU.ie;
        Widget.H[47705].aT = aU.qB;
        Widget.H[47705].aq = 0;
        Widget.H[47705].cache = 0;
        Widget.H[47705].aB = class_102.c(4907).w;
        Widget.H[47705].aC = class_102.c(4907).w;
        a(47813, 110, User32.VK_PLAY);
        Widget.H[47813].ae = 4908;
        Widget.H[47813].aR = aU.ie;
        Widget.H[47813].aT = aU.qB;
        Widget.H[47813].aq = 0;
        Widget.H[47813].cache = 0;
        Widget.H[47813].aB = class_102.c(4908).w;
        Widget.H[47813].aC = class_102.c(4908).w;
        addSprite(47706, "wiki/item 1");
        addSprite(47839, "wiki/item 8");
        a(47707, (Boolean) false);
        H[47707].P = 3;
        H[47707].ab = 9;
        H[47707].ao = 8;
        Widget widgetD3 = d(47708);
        a(47816, "wiki/item", 3, 37, 35, "View equipment bonuses", -1, 47817, 1);
        a(47817, "wiki/item", 4, 37, 35, 47818);
        widgetD3.aF = 1000;
        widgetD3.P = 536;
        widgetD3.aP = 436;
        widgetD3.k(107);
        widgetD3.b(0, 47706, 10, (5 + 20) - 10);
        widgetD3.b(1, 47707, 27, (6 + 20) - 10);
        widgetD3.b(2, 47705, 215, (0 + 20) - 5);
        widgetD3.b(3, 47816, 26, (7 + 20) - 10);
        widgetD3.b(4, 47817, 26, (7 + 20) - 10);
        widgetD3.b(5, 47813, 375, (0 + 20) - 5);
        widgetD3.b(6, 47839, 0, 230);
        for (int i3 = 0; i3 < 100; i3++) {
            int i4 = e + i3;
            a(i4, "", this.a, 0, 16751360, false, true);
            widgetD3.b(7 + i3, i4, 253, aU.ht_ + (i3 * 15) + 25);
        }
        a(47809, "wiki/button", 1, 185, 32, "Search by item", -1, 47810, 1);
        a(47810, "wiki/button", 2, 185, 25, 47811);
        a(47812, "<img=39> Search for an item", this.a, 0, 16751360, true, true);
        c(47814, 1, "wiki/sprite");
        c(47815, 2, "wiki/sprite");
        c(47819, 5, "wiki/item");
        a(47820, "Attack bonus", this.a, 2, 14983494, false, true);
        a(47821, "Stab: +0", this.a, 1, 14983494, false, true);
        a(47822, "Slash: +0", this.a, 1, 14983494, false, true);
        a(47823, "Crush: +0", this.a, 1, 14983494, false, true);
        a(47824, "Magic: +0", this.a, 1, 14983494, false, true);
        a(47825, "Range: +0", this.a, 1, 14983494, false, true);
        a(47826, "Defence bonus", this.a, 2, 14983494, false, true);
        a(47827, "Stab: +0", this.a, 1, 14983494, false, true);
        a(47828, "Slash: +0", this.a, 1, 14983494, false, true);
        a(47829, "Crush: +0", this.a, 1, 14983494, false, true);
        a(47830, "Magic: +0", this.a, 1, 14983494, false, true);
        a(47831, "Range: +0", this.a, 1, 14983494, false, true);
        a(47832, "Other bonuses", this.a, 2, 14983494, false, true);
        a(47833, "Strength: +0", this.a, 1, 14983494, false, true);
        a(47834, "Range strength: +0", this.a, 1, 14983494, false, true);
        a(47835, "Prayer: +0", this.a, 1, 14983494, false, true);
        a(47836, "wiki/item", 6, 24, 23, "Close preview", -1, 47837, 1);
        a(47837, "wiki/item", 7, 24, 23, 47838);
        a(false);
        h();
        j();
        widgetD.k(32);
        widgetD.b(0, 47814, 2, 2);
        widgetD.b(1, 65418, aU.ia, 9);
        widgetD.b(2, 65419, aU.ia, 9);
        widgetD.b(3, 47501, 395, 10);
        widgetD.b(4, 47502, 16, 40);
        widgetD.b(5, 47504, 13, 61);
        widgetD.b(6, 47708, 208, 61);
        widgetD.b(7, 47809, 11, 31);
        widgetD.b(8, 47810, 11, 31);
        widgetD.b(9, 47812, 100, 42);
        widgetD.b(10, 47815, 442, 26);
        widgetD.b(11, 47815, User32.VK_OEM_COPY, 26);
        widgetD.b(12, 47503, 208, 40);
        widgetD.b(13, 47819, 11, 61);
        widgetD.b(14, 47820, 17, 64);
        widgetD.b(15, 47821, 22, 80);
        widgetD.b(16, 47822, 22, 95);
        widgetD.b(17, 47823, 22, 110);
        widgetD.b(18, 47824, 22, 125);
        widgetD.b(19, 47825, 22, 140);
        widgetD.b(20, 47826, 17, 162);
        widgetD.b(21, 47827, 22, 178);
        widgetD.b(22, 47828, 22, 193);
        widgetD.b(23, 47829, 22, 208);
        widgetD.b(24, 47830, 22, 223);
        widgetD.b(25, 47831, 22, User32.VK_OEM_WSCTRL);
        widgetD.b(26, 47832, 17, 260);
        widgetD.b(27, 47833, 22, 275);
        widgetD.b(28, 47834, 22, User32.WM_ENTERIDLE);
        widgetD.b(29, 47835, 22, CGL.kCGLCPSurfaceBackingSize);
        widgetD.b(30, 47836, 169, 64);
        widgetD.b(31, 47837, 169, 64);
    }

    public static ColorUtility b(boolean z) {
        int iIntValue = 0;
        if (bI.get("WEAPON") != null) {
            iIntValue = bI.get("WEAPON").intValue() + 512;
        }
        int iIntValue2 = z ? CGL.kCGLCEMPEngine : 274;
        if (bI.get("CHEST") != null) {
            iIntValue2 = bI.get("CHEST").intValue() + 512;
        }
        int iIntValue3 = 0;
        if (bI.get("ARM") != null) {
            iIntValue3 = bI.get("ARM").intValue() + 512;
        }
        int iIntValue4 = z ? aW.aKu : 282;
        if (bI.get("WRIST") != null) {
            iIntValue4 = bI.get("WRIST").intValue();
        }
        int iIntValue5 = 0;
        if (bI.get("HEAD") != null) {
            iIntValue5 = bI.get("HEAD").intValue() + 512;
        }
        int iIntValue6 = z ? 306 : 256;
        if (bI.get("HAIR") != null) {
            iIntValue6 = bI.get("HAIR").intValue();
        }
        int iIntValue7 = z ? 0 : aU.hS_;
        if (bI.get("BEARD") != null) {
            iIntValue7 = bI.get("BEARD").intValue();
        }
        int iIntValue8 = 298;
        if (bI.get("FEET") != null) {
            iIntValue8 = bI.get("FEET").intValue() + 512;
        }
        int iIntValue9 = z ? 330 : User32.WM_MENUGETOBJECT;
        if (bI.get("LEGS") != null) {
            iIntValue9 = bI.get("LEGS").intValue() + 512;
        }
        int iIntValue10 = z ? 323 : User32.WM_ENTERIDLE;
        if (bI.get("HANDS") != null) {
            iIntValue10 = bI.get("HANDS").intValue() + 512;
        }
        int iIntValue11 = 0;
        if (bI.get("AMULET") != null) {
            iIntValue11 = bI.get("AMULET").intValue() + 512;
        }
        int iIntValue12 = 0;
        if (bI.get("CAPE") != null) {
            iIntValue12 = bI.get("CAPE").intValue() + 512;
        }
        Widget.H[47705].aB = bJ;
        Widget.H[47705].aC = bJ;
        Widget.H[47813].aB = bJ;
        Widget.H[47813].aC = bJ;
        return z ? Player.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, 1) : Player.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, 0);
    }

    public static void a(String str, int i) {
        ItemComposition itemCompositionLookupItem;
        if (str.startsWith("SLOT_")) {
            int i2 = Integer.parseInt(str.replace("SLOT_", "")) - 1;
            H[47707].ax[i2] = i + 1;
            H[47707].av[i2] = 1;
            return;
        }
        if (str.equals("ANIMATION")) {
            bJ = i;
            return;
        }
        byte b = -1;
        switch (str) {
            case "HEAD":
                b = 1;
                break;
            case "WEAPON":
                b = 6;
                break;
            case "CHEST":
                b = 7;
                break;
            case "FEET":
                b = 13;
                break;
            case "LEGS":
                b = 10;
                break;
            case "HANDS":
                b = 12;
                break;
            case "AMULET":
                b = 4;
                break;
            case "CAPE":
                b = 3;
                break;
            case "RING":
                b = 14;
                break;
            case "ARROWS":
                b = 5;
                break;
            case "ARM":
                b = 8;
                break;
        }
        if (b != -1 && Widget.H[47708].al[3] != -5000) {
            H[47707].ax[b] = i + 1;
            H[47707].av[b] = 1;
            if (b == 5 && (itemCompositionLookupItem = ItemComposition.lookupItem(i)) != null && itemCompositionLookupItem.itemName != null && !itemCompositionLookupItem.itemName.toLowerCase().contains("blessing")) {
                H[47707].av[b] = 1000;
            }
        }
        bI.put(str, Integer.valueOf(i));
    }
}
