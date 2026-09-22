package rs;

import com.sun.jna.platform.win32.aU;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_395.class */
public class class_395 extends class_360 {
    public static class_333 c = null;
    public static class_333 d = null;
    public static class_333 e = null;
    public static class_333 f = null;
    public static class_333 g = null;
    public static int bG = 317;
    public static int bH = 45602;
    public static int bI = 45602;

    public class_395(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static void a(int i, boolean z) {
        if (i < bH || i > bI) {
            return;
        }
        Widget.H[i].E = z ? e : c;
        Widget.H[i].aE = z ? e : c;
    }

    public static void b(int i, boolean z) {
        if (i < bH || i > bI) {
            return;
        }
        for (int i2 = bH; i2 <= bI; i2++) {
            Widget.H[i2].m = false;
        }
        Widget.H[i].m = true;
        if (z) {
            Client.ap = "::selectperk " + (i - bH);
        }
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(bG);
        c(65303, 0, "fountain/sprite");
        a(65304, "<img=186> Blood Fountain Perk Tree <img=186>", this.a, 2, 16751360, true, true);
        a(65313, "fountain/sprite", 4, 100, 32, "Purchase", -1, 65306, 1);
        a(65306, "fountain/sprite", 5, 100, 32, 65307);
        a(65308, "Purchase", this.a, 0, 16751360, true, true);
        a(65309, "fountain/sprite", 4, 100, 32, "Close", -1, 65310, 1);
        a(65310, "fountain/sprite", 5, 100, 32, 65311);
        a(65312, "Close", this.a, 0, 16751360, true, true);
        c(65314, 6, "fountain/sprite");
        a(65315, "@whi@Selected perk: @gre@Blood vengeance", this.a, 0, 16751360, true, true);
        c(65601, 18, "fountain/sprite");
        Widget.H[65601].l = true;
        c = new class_333("fountain/sprite 1");
        e = new class_333("fountain/sprite 2");
        d = new class_333("fountain/sprite 3");
        f = new class_333("fountain/sprite 19");
        g = new class_333("fountain/sprite 20");
        Widget widgetD2 = d(65600);
        widgetD2.aF = 600;
        widgetD2.P = 475;
        widgetD2.aP = 268;
        widgetD2.k(45);
        widgetD2.b(0, 65601, 3, 5);
        a(45602, 1, "fountain/sprite", "Blood vengeance I");
        widgetD2.b(1, 45602, User32.VK_OEM_AUTO + 0, 546 + 0);
        a(45603, 1, "fountain/sprite", "Blood vengeance II");
        widgetD2.b(2, 45603, User32.VK_OEM_AUTO + 0, 485 + 0);
        a(45604, 1, "fountain/sprite", "Treasure hunter I");
        widgetD2.b(3, 45604, 361 + 0, CGL.kCGLGOUseBuildCache + 0);
        a(45605, 1, "fountain/sprite", "Treasure hunter II");
        widgetD2.b(4, 45605, 427 + 0, CGL.kCGLGOUseBuildCache + 0);
        a(45606, 1, "fountain/sprite", "Blood whip");
        widgetD2.b(5, 45606, 362 + 0, 433 + 0);
        a(45607, 1, "fountain/sprite", "Blood rune c'bow");
        widgetD2.b(6, 45607, UnixStat.DEFAULT_FILE_PERM + 0, 398 + 0);
        a(45608, 1, "fountain/sprite", "Blood dark bow");
        widgetD2.b(7, 45608, aU.if_ + 0, 398 + 0);
        a(45609, 1, "fountain/sprite", "Diamonds are forever");
        widgetD2.b(8, 45609, 362 + 0, 369 + 0);
        a(45610, 1, "fountain/sprite", "Bloodthirsty I");
        widgetD2.b(9, 45610, 119 + 0, CGL.kCGLGOUseErrorHandler + 0);
        a(45611, 1, "fountain/sprite", "Bloodthirsty II");
        widgetD2.b(10, 45611, 54 + 0, 469 + 0);
        a(45612, 1, "fountain/sprite", "Killjoy I");
        widgetD2.b(11, 45612, 119 + 0, 428 + 0);
        a(45613, 1, "fountain/sprite", "Killjoy II");
        widgetD2.b(12, 45613, 54 + 0, 397 + 0);
        a(45614, 1, "fountain/sprite", "Blood pool");
        widgetD2.b(13, 45614, 119 + 0, 359 + 0);
        a(45615, 1, "fountain/sprite", "Blood staff");
        widgetD2.b(14, 45615, aU.if_ + 0, 467 + 0);
        a(45616, 1, "fountain/sprite", "Blood ring");
        widgetD2.b(15, 45616, UnixStat.DEFAULT_FILE_PERM + 0, 467 + 0);
        a(45617, 1, "fountain/sprite", "Treasure buddy");
        widgetD2.b(16, 45617, 427 + 0, 552 + 0);
        a(45618, 1, "fountain/sprite", "Emblem snatcher");
        widgetD2.b(17, 45618, 177 + 0, 397 + 0);
        a(45619, 1, "fountain/sprite", "Augury");
        widgetD2.b(18, 45619, aU.hx_ + 0, 434 + 0);
        a(45620, 1, "fountain/sprite", "Rigour");
        widgetD2.b(19, 45620, User32.WM_IME_ENDCOMPOSITION + 0, 434 + 0);
        a(45621, 1, "fountain/sprite", "Bloodlust");
        widgetD2.b(20, 45621, 13 + 0, 519 + 0);
        a(45622, 1, "fountain/sprite", "Excavator");
        widgetD2.b(21, 45622, 176 + 0, 475 + 0);
        a(45623, 1, "fountain/sprite", "War diamonds");
        widgetD2.b(22, 45623, 10 + 0, 430 + 0);
        a(45624, 1, "fountain/sprite", "Unholy smite");
        widgetD2.b(23, 45624, User32.VK_OEM_COPY + 0, 396 + 0);
        a(45625, 1, "fountain/sprite", "Eternal recoil");
        widgetD2.b(24, 45625, 198 + 0, 354 + 0);
        a(45626, 1, "fountain/sprite", "Eternal blood cape");
        widgetD2.b(25, 45626, 285 + 0, 354 + 0);
        a(45627, 1, "fountain/sprite", "Vampiric damage");
        widgetD2.b(26, 45627, 59 + 0, 330 + 0);
        a(45628, 1, "fountain/sprite", "Vampiric defence");
        widgetD2.b(27, 45628, 421 + 0, 331 + 0);
        a(45629, 1, "fountain/sprite", "Vampiric accuracy");
        widgetD2.b(28, 45629, 59 + 0, 277 + 0);
        a(45630, 1, "fountain/sprite", "Archaeologist I");
        widgetD2.b(29, 45630, 321 + 0, 330 + 0);
        a(45631, 1, "fountain/sprite", "Archaeologist II");
        widgetD2.b(30, 45631, 321 + 0, 277 + 0);
        a(45632, 1, "fountain/sprite", "Archaeologist III");
        widgetD2.b(31, 45632, 362 + 0, 307 + 0);
        a(45633, 1, "fountain/sprite", "Blood archer ring");
        widgetD2.b(32, 45633, 156 + 0, 324 + 0);
        a(45634, 1, "fountain/sprite", "Blood seers ring");
        widgetD2.b(33, 45634, User32.VK_OEM_WSCTRL + 0, 324 + 0);
        a(45635, 1, "fountain/sprite", "Blood berserker ring");
        widgetD2.b(34, 45635, 198 + 0, CGL.kCGLCPSurfaceBackingSize + 0);
        a(45636, 1, "fountain/sprite", "Death's accomplice");
        widgetD2.b(35, 45636, 96 + 0, User32.VK_OEM_COPY + 0);
        a(45637, 1, "fountain/sprite", "Death's door");
        widgetD2.b(36, 45637, 421 + 0, User32.WM_GESTURE + 0);
        a(45638, 1, "fountain/sprite", "Blood alchemy");
        widgetD2.b(37, 45638, 119 + 0, CGL.kCGLCESurfaceBackingSize + 0);
        a(45639, 1, "fountain/sprite", "Blood alchemy II");
        widgetD2.b(38, 45639, 150 + 0, 275 + 0);
        a(45640, 1, "fountain/sprite", "Grand treasure");
        widgetD2.b(39, 45640, 361 + 0, CGL.kCGLGOUseBuildCache + 0 + 46);
        a(45641, 1, "fountain/sprite", "Blood alchemy III");
        widgetD2.b(40, 45641, 150 + 0 + 32, (275 + 0) - 33);
        a(45642, 1, "fountain/sprite", "Bounty teleport");
        widgetD2.b(41, 45642, 18 + 0, g.p + 0);
        a(45643, 1, "fountain/sprite", "Mercenary I");
        widgetD2.b(42, 45643, 20 + 0, User32.VK_OEM_COPY + 0);
        a(45644, 1, "fountain/sprite", "Mercenary II");
        widgetD2.b(43, 45644, 20 + 0, 192 + 0);
        a(45645, 1, "fountain/sprite", "Escape Artist");
        widgetD2.b(44, 45645, 96 + 0, 192 + 0);
        bI = widgetD2.ak[widgetD2.ak.length - 1];
        widgetD.ak = new int[11];
        widgetD.al = new int[11];
        widgetD.ba = new int[11];
        widgetD.b(0, 65303, 5, 20);
        widgetD.b(1, 65304, User32.WM_UNICHAR, 25);
        widgetD.b(2, 63740, 479, 24);
        widgetD.b(3, 63741, 479, 24);
        widgetD.b(4, 65308, -72000, User32.WM_MENUSELECT);
        widgetD.b(5, 65309, -138000, 277);
        widgetD.b(6, 65310, -138000, 277);
        widgetD.b(7, 65312, -188000, User32.WM_MENUSELECT);
        widgetD.b(8, 65314, -276000, 285);
        widgetD.b(9, 65315, -371000, User32.WM_ENTERIDLE);
        widgetD.b(10, 65600, 4, 44);
    }
}
