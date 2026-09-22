package rs;

import com.google.inject.internal.asm.$Opcodes;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_478.class */
public class class_478 extends class_360 {
    public class_478(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(61078);
        addSprite(61079, "fountain/sprite 21");
        a(61080, "<img=180> Bloodcore Token Synthesis <img=180>", this.a, 2, 16751360, true, true);
        a(61081, 5, 0, 61082, 1, "fountain/button", 70, 41, "Synthesize items");
        a(61082, 2, "fountain/button", 70, 41, 61083);
        addSprite(61084, "fountain/icon 1");
        a(61085, "Start", this.a, 0, 16751360, true, true);
        a(61086, 5, 0, 61087, 1, "fountain/button", 70, 41, "Bloodcore token shop");
        a(61087, 2, "fountain/button", 70, 41, 61088);
        addSprite(61089, "fountain/coins");
        a(61090, "Shop", this.a, 0, 16751360, true, true);
        a(61091, 5, 0, 61092, 1, "fountain/button", 70, 41, "Synthesis item guide");
        a(61092, 2, "fountain/button", 70, 41, 61093);
        addSprite(61094, "icons/help");
        a(61095, "Guide", this.a, 0, 16751360, true, true);
        a(61096, "", this.a, 1, 16751360, true, true);
        a(61097, "", this.a, 0, 16751360, true, true);
        Widget widgetD2 = d(61098);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = User32.VK_PLAY;
        widgetD2.P = 248;
        widgetD2.aP = 149;
        widgetD2.bh = 87;
        a(61099, (Boolean) true);
        H[61099].W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
        H[61099].P = 5;
        H[61099].ab = 16;
        H[61099].ao = 10;
        widgetD2.b(0, 61099, 11, 5);
        a(61100, (Boolean) false);
        H[61100].P = 4;
        H[61100].ab = 11;
        a(61101, 5, 0, 61102, 1, "fountain/button", 70, 41, "Bloodcore lottery");
        a(61102, 2, "fountain/button", 70, 41, 61103);
        addSprite(61104, "fountain/dice");
        a(61105, "Lotto", this.a, 0, 16751360, true, true);
        widgetD.k(24);
        widgetD.b(0, 61079, 55, 36);
        widgetD.b(1, 61080, 257, 44);
        widgetD.b(2, 61081, 358, 174);
        widgetD.b(3, 61082, 358, 174);
        widgetD.b(4, 61084, 364, $Opcodes.INVOKESTATIC);
        widgetD.b(5, 61085, 405, 189);
        widgetD.b(6, 61086, 76, 241);
        widgetD.b(7, 61087, 76, 241);
        widgetD.b(8, 61089, 81, 248);
        widgetD.b(9, 61090, 126, 257);
        widgetD.b(10, 61091, 161, 241);
        widgetD.b(11, 61092, 161, 241);
        widgetD.b(12, 61094, 169, User32.VK_NONAME);
        widgetD.b(13, 61095, 208, 257);
        widgetD.b(14, 61096, class_332.l, User32.VK_OEM_COPY);
        widgetD.b(15, 61097, class_332.l, 260);
        widgetD.b(16, 65418, 432, 44);
        widgetD.b(17, 65419, 432, 44);
        widgetD.b(18, 61098, 68, 73);
        widgetD.b(19, 61100, 406, 127);
        widgetD.b(20, 61101, 246, 241);
        widgetD.b(21, 61102, 246, 241);
        widgetD.b(22, 61104, User32.VK_ZOOM, 248);
        widgetD.b(23, 61105, User32.WM_UPDATEUISTATE, 257);
    }
}
