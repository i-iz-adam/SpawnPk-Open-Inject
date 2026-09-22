package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_440.class */
public class class_440 extends class_360 {
    public static class_495 c;
    private static final int e = 60201;
    private static final int f = 60203;
    private static final int g = 60204;
    private static final int bG = 60205;
    private static final int bN = 60238;
    private static final int bP = 60246;
    private static final int bQ = 60247;
    private static final int bR = 60248;
    private static final int bS = 60249;
    private static final int bT = 60250;
    private static final int bU = 60251;
    private static final int bV = 60252;
    private static final int bW = 60253;
    private static final int bX = 60254;
    private static final int bY = 60255;
    private static final int bZ = 60256;
    private static final int ca = 60257;
    private static final int cb = 60258;
    private static final int cc = 60259;
    private static final int cd = 60260;
    private static final int ce = 60261;
    private static final int cf = 60262;
    private static final int cg = 60263;
    public static final class_553 d = new class_441();
    private static final int[] bH = {60206, 60207, 60208, 60209, 60210, 60211, 60212, 60213};
    private static final int[] bI = {60214, 60215, 60216, 60217, 60218, 60219, 60220, 60221};
    private static final int[] bJ = {60222, 60223, 60224, 60225, 60226, 60227, 60228, 60229};
    private static final int[] bK = {60230, 60231, 60232, 60233, 60234, 60235, 60236, 60237};
    private static final String[] bL = {"<img=84>@yel@$5", "<img=84>@yel@$10", "<img=84>@yel@$20", "<img=84>@yel@$30", "<img=84>@yel@$45", "<img=84>@yel@$75", "<img=84>@yel@$100", "<img=84>@yel@$500"};
    private static final int[] bM = {16000, 16001, 16002, 16003, 16004, 16005, 16006, 16007};
    private static final int[] bO = {60239, 60240, 60241, 60242, 60243, 60244, 60244, 60245};
    private static class_442 ch = new class_442();

    public class_440(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(60200);
        widgetD.f();
        c = new class_495(widgetD);
        c.a(class_351.a(e, "misc/cart 0").g(aU.hU, 480)).a(13, 13);
        c.a(class_352.a(cf, "@or1@Donation Shopping Cart").j().b()).a(388, 21);
        k();
        j();
        i();
        h();
        c.a();
    }

    private void h() {
        int i = 3 + 0;
        class_349.g(60082, 3).h(0, 12).a(3);
        class_349.g(60085, 3).h(0, 12).a(3);
        class_349.g(60088, 3).h(0, 12).a(3);
        for (int i2 : new int[]{60082, 60085, 60088}) {
            if (i2 == 60088) {
                Widget.H[i2].ax = new int[]{-1, 21666, 21666};
                Widget.H[i2].av = new int[]{1, 1, 1};
            } else if (i2 == 60082) {
                Widget.H[i2].ax = new int[]{-1, 21677, -1};
                Widget.H[i2].av = new int[]{1, 3, 1};
            } else {
                Widget.H[i2].ax = new int[]{-1, 21606, -1};
                Widget.H[i2].av = new int[]{1, 1, 1};
            }
        }
        c.a(60069).a(58, 343);
        c.a(60064).a(54, 377);
        c.a(60065).a(54, 377);
        if (ch.s() > 0) {
            try {
                class_313.d().a((class_310) ch);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        class_313.d().a(ch, 60065);
        c.a(60081).a(211, 422 + i);
        c.a(60082).a(196 - 32, 369 + i);
        c.a(60084).a(341, 422 + i);
        c.a(60085).a(326 - 32, 369 + i);
        c.a(60087).a(aU.jb_, 425);
        c.a(60088).a(451 - 32, 369 + i);
        c.a(60090).a(41, 371 + 0);
        c.a(60091).a(57, 409 + 0);
        c.a(60270).a(61, 409 + 0);
        c.a(60092).a(222, 390 + i);
        c.a(60093).a(aU.ik_, 390 + i);
        c.a(60094).a(509, 390 + i);
        c.a(60066).a(37, 461);
        c.a(60067).a(37, 445);
        c.a(60096).a(User32.WM_MOUSEWHEEL, 364 + i);
        c.a(60097).a(aU.iX_, 364 + i);
        c.a(60098).a(527, 369 + i);
        c.a(60099).a(aU.jR_, 369 + i + 2);
        c.a(60100).a(aU.jR_, 369 + i + 15 + 2);
        c.a(60094).a(553, 390 + i);
        c.a(65418).a(aU.hL, 21);
        c.a(65419).a(aU.hL, 21);
    }

    private void i() {
        c.a(class_352.a(bU, "Daily Offer").j().m(class_492.e)).a(g.i, 58);
        c.a(class_352.a(bV, "Exclusive Offers").j().m(class_492.e)).a(g.i, 156);
        c(561, 82, bW, bX, bY);
        c(561, 181, bZ, ca, cb);
        c(561, 261, cc, cd, ce);
    }

    private void c(int i, int i2, int i3, int i4, int i5) {
        String str = "@whi@Earn one grand promo package, and get one FREE!";
        String str2 = "Offer expires in: @cya@<img=37> 24:00:00";
        int i6 = 21665;
        class_349 class_349VarH = class_349.g(i5, 6).h(12, 0);
        class_349VarH.P = 6;
        class_349VarH.aP = 1;
        class_349VarH.ay = true;
        if (i3 == bZ) {
            str = "@whi@Seasonal fuse boxes obtainable from seasonal packs!";
            str2 = "Pulls remaining: <item=24238> @red@0/3 <item=24050>@yel@2/3 <item=25425>@gre@3/3";
            class_349VarH.ax = new int[]{24176, 24239, 24176, 24051, 24176, 25426};
        } else {
            if (i3 == cc) {
                str = "";
                str2 = "No other promotions available at this time";
                i6 = -1;
            }
            for (int i7 = 0; i7 < 6; i7++) {
                class_349VarH.ax[i7] = i6 + 1;
                class_349VarH.av[i7] = 1;
            }
        }
        c.a(class_352.a(i3, str).i().b()).a(i, i2);
        c.a(class_352.a(i4, str2).a().b().m(class_492.d)).a(i, i2 + 18);
        c.a(class_349VarH).a(i - 125, i2 + 34);
    }

    private void j() {
        c.a(class_352.a(bN, "Shopping Cart").j().m(class_492.e)).a(User32.VK_OEM_AUTO, 58);
        class_350 class_350VarF = class_350.f(bP, 150, 177);
        class_350VarF.aF = 150;
        int i = 0;
        while (i < bO.length) {
            class_352.a(bO[i], i == bO.length - 1 ? "@or1@Subtotal: @yel@$0.00" : "Empty").a().m(class_492.d);
            class_350VarF.n(bO[i]).a(5, 5 + (i * 15));
            i++;
        }
        class_350VarF.a();
        c.a(class_350VarF).a(aU.hx_, 82);
        c.a(class_352.a(bQ, "<img=90><tab=20>PayPal (Card / Bank)").a(200).a().m(class_492.e)).a(223, 264);
        c.a(class_352.a(bR, "<img=88><tab=20>OSRS GP").a(200).a().m(class_492.e)).a(223, 283);
        c.a(class_342.b(bS, "misc/login 2", "Checkout").g(130, 32).a("misc/login 3")).a(230, User32.WM_QUERYUISTATE);
        c.a(class_352.a(bT, "Checkout @yel@($0.00)").a().b().m(class_492.e)).a(User32.WM_MENUGETOBJECT, 307);
    }

    private void k() {
        c.a(class_352.a(cg, "Purchase Options").j().m(class_492.e)).a(59, 58);
        class_350 class_350VarF = class_350.f(f, User32.VK_OEM_CUSEL, User32.WM_IME_ENDCOMPOSITION);
        class_350VarF.bh = 87;
        class_350VarF.aF = 260;
        class_351.a(bG, "misc/cart 1");
        class_349 class_349VarG = class_349.g(g, 20);
        class_349VarG.h(47, 28);
        class_349VarG.P = 2;
        int i = -5;
        for (int i2 = 0; i2 < bH.length; i2++) {
            int i3 = i2 % 2 == 0 ? 0 : 79;
            class_350VarF.n(bG).a(i3, 10 + i);
            class_349VarG.ax[i2] = bM[i2] + 1;
            class_349VarG.av[i2] = 1;
            class_352.a(bH[i2], e.e).b().a().m(16751360);
            class_352.a(bK[i2], bL[i2]).a().m(class_492.d).b();
            class_350VarF.n(bH[i2]).a(36 + i3, 49 + i);
            int i4 = bI[i2];
            int i5 = bJ[i2];
            class_342.b(i4, "misc/donor 11", "Reduce quantity").g(16, 16).a("misc/donor 12");
            class_342.b(i5, "misc/donor 9", "Increase quantity").g(16, 16).a("misc/donor 10");
            class_350VarF.n(i4).a(12 + i3, 46 + i);
            class_350VarF.n(i5).a(45 + i3, 46 + i);
            if ((i2 + 1) % 2 == 0) {
                i += 60;
            }
        }
        class_350VarF.n(g).a(21, 13 - 5);
        int i6 = -5;
        for (int i7 = 0; i7 < bH.length; i7++) {
            class_350VarF.n(bK[i7]).a(33 + (i7 % 2 == 0 ? 0 : 79), 12 + i6);
            if ((i7 + 1) % 2 == 0) {
                i6 += 60;
            }
        }
        class_350VarF.a();
        c.a(class_350VarF).a(41, 83);
    }
}
