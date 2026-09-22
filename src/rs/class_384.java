package rs;

import com.google.a.l.c;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_384.class */
public class class_384 extends class_360 {
    public static class_333 e;
    public static class_333 f;
    public static class_333 g;
    public static boolean c = false;
    public static long d = 0;
    public static final class_553 bG = new class_385();
    public static final class_253 bH = new class_386();

    public class_384(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        h();
        i();
    }

    public void h() {
        Widget widgetD = d(59835);
        c(59836, 0, "gambling/SPRITE");
        a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        e = new class_333("misc/warn");
        Widget widgetD2 = d(59837);
        m(59838).e();
        widgetD2.k(1);
        widgetD2.b(0, 59838, 5, 5);
        Widget widgetD3 = d(59839);
        m(59840).e().W = new String[5];
        widgetD3.k(1);
        widgetD3.b(0, 59840, 5, 5);
        widgetD2.aF = 450;
        widgetD3.aF = 450;
        widgetD2.P = 140;
        widgetD3.P = 140;
        widgetD2.aP = 121;
        widgetD3.aP = 121;
        widgetD2.bh = 87;
        widgetD3.bh = 87;
        a(59830, "Est. Value: N/A", this.a, 0, class_492.d, false);
        c(59831, "Est. Value: N/A", this.a, 0, class_492.d, true);
        a(59832, "@gra@NOTE: Prices are just estimates!", this.a, 0, class_492.e, true);
        a(59841, c.h, "Accept this offer", this.a, 0, bk.ao, false, false, 50);
        a(59842, "Decline", "Decline this offer", this.a, 0, bk.aS, false, false, 50);
        a(59843, "Waiting for other player..", this.a, 0, class_492.c, true, true);
        a(59844, "Select a game type..", this.a, 1, 16751360, false, true);
        a(59845, "Rules for \"BJ (P1 hosting)\"", this.a, 1, 16751360, false, true);
        a(59846, "Gambling with P1..", this.a, 2, 16751360, false, true);
        f = Widget.j(2, "gambling/SPRITE");
        g = Widget.j(1, "gambling/SPRITE");
        c(59847, 1, "gambling/SPRITE");
        c(59848, 1, "gambling/SPRITE");
        c(59849, 1, "gambling/SPRITE");
        c(59850, 1, "gambling/SPRITE");
        c(59851, 1, "gambling/SPRITE");
        c(59852, 1, "gambling/SPRITE");
        a(59853, "55x2 (P1 host)", "Select", this.a, 0, class_492.d, false, true, 160);
        a(59854, "55x2 (P2 host)", "Select", this.a, 0, class_492.d, false, true, 160);
        a(59855, "BJ (P1 host)", "Select", this.a, 0, class_492.d, false, true, 160);
        a(59856, "BJ (P2 host)", "Select", this.a, 0, class_492.d, false, true, 160);
        a(59857, "Dice duel", "Select", this.a, 0, class_492.d, false, true, 160);
        a(59858, "Flower poker", "Select", this.a, 0, class_492.d, false, true, 160);
        a(59859, "Both players will plant five flowers each. The player with", this.a, 0, class_492.c, false, true);
        a(59860, "the best pairs of colors will win the pot.", this.a, 0, class_492.c, false, true);
        a(59861, "", this.a, 0, class_492.c, false, true);
        a(59862, "If anyone plants a white or black flower (rare chance) a", this.a, 0, class_492.c, false, true);
        a(59863, "\"replant\" will occur and the game will auto-restart.", this.a, 0, class_492.c, false, true);
        a(59864, "", this.a, 0, class_492.c, false, true);
        a(59865, "<col=8B88FF><img=6> Safety:@whi@ If you logout or DC during the game, your", this.a, 0, class_492.c, false, true);
        a(59866, "player will stay logged in until the game is complete.", this.a, 0, class_492.c, false, true);
        a(59867, "The server will continue planting flowers for you.", this.a, 0, class_492.c, false, true);
        widgetD.k(35);
        widgetD.b(0, 59836, 13, 4);
        widgetD.b(1, 59837, 18, 48);
        widgetD.b(2, 59839, 341, 48);
        widgetD.b(3, 65418, 477, 22);
        widgetD.b(4, 65419, 477, 22);
        widgetD.b(5, 59841, User32.VK_OEM_COPY, 67);
        widgetD.b(6, 59842, 241, 119);
        widgetD.b(7, 59843, 259, 153);
        widgetD.b(8, 59844, 22, 180);
        widgetD.b(9, 59845, aU.hm_, 180);
        widgetD.b(10, 59846, 23, 23);
        widgetD.b(11, 59847, 23, 204);
        widgetD.b(12, 59848, 23, 224);
        widgetD.b(13, 59849, 23, User32.VK_OEM_ENLW);
        widgetD.b(14, 59850, 23, 264);
        widgetD.b(15, 59851, 23, 284);
        widgetD.b(16, 59852, 23, CGL.kCGLCPSurfaceBackingSize);
        widgetD.b(17, 59853, 45, 206);
        widgetD.b(18, 59854, 45, 226);
        widgetD.b(19, 59855, 45, 246);
        widgetD.b(20, 59856, 45, aU.hS_);
        widgetD.b(21, 59857, 45, 286);
        widgetD.b(22, 59858, 45, 306);
        widgetD.b(23, 59859, aU.hm_, 206);
        widgetD.b(24, 59860, aU.hm_, 218);
        widgetD.b(25, 59861, aU.hm_, 230);
        widgetD.b(26, 59862, aU.hm_, User32.VK_OEM_COPY);
        widgetD.b(27, 59863, aU.hm_, 254);
        widgetD.b(28, 59864, aU.hm_, aU.hS_);
        widgetD.b(29, 59865, aU.hm_, 278);
        widgetD.b(30, 59866, aU.hm_, User32.WM_MENURBUTTONUP);
        widgetD.b(31, 59867, aU.hm_, aU.ie_);
        widgetD.b(32, 59830, 21, 165);
        widgetD.b(33, 59831, 490, 165);
        widgetD.b(34, 59832, 256, 165);
        for (int i = 1; i < 32; i++) {
            int[] iArr = widgetD.ba;
            int i2 = i;
            iArr[i2] = iArr[i2] - 9;
            if (widgetD.ak[i] <= 60000 && widgetD.ak[i] >= 59844 && widgetD.ak[i] != 59846) {
                int[] iArr2 = widgetD.ba;
                int i3 = i;
                iArr2[i3] = iArr2[i3] + 13;
            }
        }
    }

    public void i() {
        Widget widgetD = d(59868);
        c(59869, 3, "gambling/SPRITE");
        Widget widgetD2 = d(59870);
        widgetD2.k(1);
        a(59871, "Your offer", this.a, 0, class_492.c, true, true);
        widgetD2.b(0, 59871, 70, 5);
        Widget widgetD3 = d(59872);
        widgetD3.k(1);
        a(59873, "Their offer", this.a, 0, class_492.c, true, true);
        widgetD3.b(0, 59873, 70, 5);
        widgetD2.aF = 450;
        widgetD3.aF = 450;
        widgetD2.P = 140;
        widgetD3.P = 140;
        widgetD2.aP = 200;
        widgetD3.aP = 200;
        widgetD2.bh = 87;
        widgetD3.bh = 87;
        a(59874, c.h, "Accept this offer", this.a, 0, bk.ao, false, false, 50);
        a(59875, "Decline", "Decline this offer", this.a, 0, bk.aS, false, false, 50);
        a(59876, "Are you sure you want to play this? Read carefully!", this.a, 2, class_492.c, false, true);
        a(59877, "You'll be playing..", this.a, 2, 16751360, false, true);
        a(59878, "55x2 (P1 host)", this.a, 1, 16751360, true, false);
        a(59879, "Waiting for other player..", this.a, 0, class_492.c, true, true);
        widgetD.k(11);
        widgetD.b(0, 59869, 13, 13 + 40);
        widgetD.b(1, 59870, 16, 48 + 40);
        widgetD.b(2, 59872, 339, 48 + 40);
        widgetD.b(3, 65418, 477, 22 + 40);
        widgetD.b(4, 65419, 477, 22 + 40);
        widgetD.b(5, 59874, User32.VK_OEM_COPY, 67 + 40);
        widgetD.b(6, 59875, 241, 119 + 40);
        widgetD.b(7, 59876, 23, 23 + 40);
        widgetD.b(8, 59877, 198, 180 + 40);
        widgetD.b(9, 59878, 256, aU.hx_ + 40);
        widgetD.b(10, 59879, 258, 192);
    }

    private Widget m(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
        widget.K = new int[20];
        widget.av = new int[30];
        widget.ax = new int[30];
        widget.ar = new int[20];
        widget.ak = new int[0];
        widget.al = new int[0];
        widget.ba = new int[0];
        for (int i2 = 0; i2 < 28; i2++) {
            widget.ax[i2] = 995;
            widget.av[i2] = i2 + 1;
        }
        widget.t = true;
        widget.ab = 12;
        widget.ao = 12;
        widget.aP = 10;
        widget.P = 3;
        widget.au = i;
        widget.aG = 2;
        return widget;
    }
}
