package rs;

import com.sun.jna.platform.win32.aU;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.a.F;
import org.lwjgl.opencl.CL10;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_452.class */
public class class_452 extends class_360 {
    public static final int c = 30378;
    public static class_495 d;
    public static class_495 e;
    private static final int bK = 30394;
    private static final int bL = 30379;
    private static final int bM = 25;
    private static final int bN = 11;
    private static final String bO = "<str=3145472>                                                    ";
    public static List<class_454> f = new ArrayList();
    public static List<class_454> g = new ArrayList();
    public static int bG = 0;
    public static int bH = 0;
    public static int bI = 0;
    private static class_305 bP = new class_305();
    public static class_553 bJ = new class_462();

    public class_452(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    private static void a(class_454 class_454Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = (i * 70) + 5;
        int i7 = bG == 0 ? 30395 : bG;
        if (class_454Var.h) {
            i2 = i7 + 1;
            class_351.a(i2, "teleport/sprite 31");
        } else if (class_454Var.f >= class_454Var.g) {
            i2 = i7 + 1;
            class_351.a(i2, "teleport/sprite 32");
        } else {
            i2 = i7 + 1;
            class_351.a(i2, "teleport/sprite 20");
        }
        e.a(i2).a(25, i6);
        switch (class_470.a[class_454Var.a.ordinal()]) {
            case 1:
                i2++;
                a(i2, class_454Var.b, 10000, 32);
                break;
            case 2:
                i2++;
                d(i2, 32);
                Widget.H[i2].ae = class_454Var.b;
                break;
            case 3:
                i2++;
                d(i2, 32);
                Widget.H[i2].ae = class_454Var.b;
                Widget.H[i2].aG = 22;
                break;
        }
        e.a(i2).a(25 + 5, i6 + 3);
        if (class_454Var.d == null) {
            int i8 = i2 + 1;
            e.a(class_352.a(i8, class_454Var.a(1)).m(class_492.c).i()).a(25 + 43, i6 + 12);
            i3 = i8 + 1;
            e.a(class_352.a(i3, F.a).m(class_492.c).a()).a(25 + 43, i6 + 6 + 15);
        } else {
            int i9 = i2 + 1;
            e.a(class_352.a(i9, class_454Var.a(1)).m(class_492.c).a()).a(25 + 43, i6 + 6);
            i3 = i9 + 1;
            e.a(class_352.a(i3, class_454Var.a(2)).m(class_492.c).a()).a(25 + 43, i6 + 6 + 15);
        }
        int i10 = i3 + 1;
        class_342 class_342VarB = class_342.b(i10, "teleport/sprite 23", "Tips & Information");
        int i11 = i10 + 1;
        class_342VarB.a(i11, "teleport/sprite 24");
        int i12 = i11 - 1;
        e.a(i11 - 1).a(25 + aU.ih_, i6 + 3);
        e.a(i11).a(25 + aU.ih_, i6 + 3);
        int i13 = i11 + 1 + 1;
        class_342 class_342VarB2 = class_342.b(i13, "teleport/sprite 25", "Teleport to Task");
        int i14 = i13 + 1;
        class_342VarB2.a(i14, "teleport/sprite 26");
        int i15 = i14 - 1;
        e.a(i14 - 1).a(25 + aU.ih_, i6 + 21);
        e.a(i14).a(25 + aU.ih_, i6 + 21);
        int i16 = i14 + 1 + 1;
        class_349.g(i16, 4).a(4).h(0, 0);
        Widget.H[i16].bB = 20;
        if (class_454Var.e.length > 0) {
            for (int i17 = 0; i17 < Math.min(3, class_454Var.e.length); i17++) {
                Widget.H[i16].ax[i17] = class_454Var.e[i17][0] + 1;
                Widget.H[i16].av[i17] = class_454Var.e[i17][1];
            }
        }
        e.a(i16).a(25 + 80, i6 + 35);
        if (class_454Var.h) {
            int i18 = i16 + 1;
            e.a(class_352.a(i18, "<img=24> @gre@CLAIMED").j().b()).a(25 + 285, i6 + 45);
            i5 = i18 + 3;
            Widget.H[i15].bd = false;
            Widget.H[i15 + 1].bd = false;
            Widget.H[i12].bd = false;
            Widget.H[i12 + 1].bd = false;
        } else {
            Widget.H[i15].bd = true;
            Widget.H[i15 + 1].bd = true;
            Widget.H[i12].bd = true;
            Widget.H[i12 + 1].bd = true;
            if (class_454Var.f >= class_454Var.g) {
                int i19 = i16 + 1;
                class_342 class_342VarB3 = class_342.b(i19, "teleport/sprite 21", "Claim reward");
                int i20 = i19 + 1;
                class_342VarB3.a(i20, "teleport/sprite 22");
                e.a(i20 - 1).a(25 + 236, i6 + 38);
                e.a(i20).a(25 + 236, i6 + 38);
                i5 = i20 + 1 + 1;
                e.a(class_352.a(i5, "@yel@CLAIM!").j().b()).a(25 + 285, i6 + 44);
            } else {
                if (class_454Var.g == 1) {
                    i4 = i16 + 1;
                    e.a(class_352.a(i4, "(In-progress)").a().b().m(class_492.d)).a(25 + 285, i6 + 45);
                } else {
                    i4 = i16 + 1;
                    e.a(class_352.a(i4, "(" + (class_454Var.g > 999 ? "Prog" : "Progress") + ": " + class_454Var.a("{prog}") + ")").a().b().m(class_492.d)).a(25 + 285, i6 + 45);
                }
                i5 = i4 + 3;
            }
        }
        bG = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(class_453 class_453Var, int i, String str, String str2, int[][] iArr, int i2, int i3, boolean z) {
        if (g.size() + f.size() >= 25) {
            return;
        }
        class_454 class_454Var = new class_454();
        class_454Var.a = class_453Var;
        class_454Var.b = i;
        class_454Var.c = str;
        class_454Var.d = str2;
        class_454Var.e = iArr;
        class_454Var.f = i2;
        class_454Var.g = i3;
        class_454Var.h = z;
        if (z) {
            g.add(class_454Var);
        } else {
            f.add(class_454Var);
        }
    }

    @Override // rs.class_360
    public void a() {
        d = new class_495(d(c));
        d.a(class_351.a(bL, "teleport/sprite 19")).a(7, 14);
        class_342.b(30380, "teleport/sprite 30", "Next chapter").a(30381, "teleport/sprite 27");
        d.a(30380).a(405, 25);
        d.a(30381).a(405, 25);
        class_342.b(30383, "teleport/sprite 28", "Previous chapter").a(30384, "teleport/sprite 29");
        d.a(30383).a(bL, 125, 11);
        d.a(30384).a(bL, 125, 11);
        d.a(class_352.a(30386, "No mail message selected!").i().m(class_492.d).b()).a(bL, 275, 13);
        d.a(class_352.a(38387, "Chapter Progress").i().m(class_492.d).b()).a(bL, 67, 45);
        d.a(class_352.a(38388, "0 / 5").j().m(class_492.d).b()).a(bL, 67, 99);
        if (bP.s() > 0) {
            try {
                class_313.d().a((class_310) bP);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        class_313.d().a(bP, 38388);
        d.a(class_349.g(30389, 4).a(2).h(10, 5)).a(bL, 30, 170);
        for (int i = 0; i < 4; i++) {
            Widget.H[30389].ax[i] = 996;
            Widget.H[30389].av[i] = 10000;
        }
        class_342.b(30390, "teleport/sprite 21", "Claim rewards").a(30391, "teleport/sprite 22");
        d.a(30390).a(bL, 17, 255);
        d.a(30391).a(bL, 17, 255);
        d.a(class_352.a(30393, "<img=9> Claim all").a().b().m(class_492.d)).a(bL, 64, User32.WM_SYSCHAR);
        e = new class_495(class_350.f(bK, 366, User32.VK_PLAY));
        e.a();
        h();
        b(class_453.a, aU.qr, "Vote for SPK @or1@(::vote)@whi@ then @or1@(::redeem)@whi@ your vote points!", "Then, swap the vote points for @or1@vote tickets@whi@ (via shop)", new int[][]{new int[]{aU.qr, 1}}, 0, 1, false);
        b(class_453.c, 12110, "List vote ticket(s) for sale via @or1@Trading Post", null, new int[][]{new int[]{20808, 1}}, 0, 1, false);
        b(class_453.b, 2831, "Complete the @or1@Undead PKer@whi@ daily activity", null, new int[][]{new int[]{CL10.CL_BGRA, 25}, new int[]{10834, 10}}, 0, 1, false);
        b(class_453.a, 12926, "Purchase a @or1@Toxic Blowpipe@whi@ from the Trading Post.", "This is a great starter item for PvM!", new int[][]{new int[]{CL10.CL_BGRA, 25}, new int[]{10834, 10}}, 0, 1, false);
        b(class_453.a, 24263, "Earn 50 @or1@Vintage tickets@whi@ at the @or1@Vintage cave", null, new int[][]{new int[]{CL10.CL_BGRA, 50}, new int[]{24260, 3}}, 0, 50, false);
        b(class_453.c, 2654, "Unlock the @or1@Blood Vengeance I@whi@ perk", null, new int[][]{new int[]{10877, 1}}, 0, 1, false);
        b(class_453.a, 23912, "Kill {prog} blood-revenants", null, new int[][]{new int[]{CL10.CL_BGRA, 50}}, 0, 10, false);
        b(class_453.c, 2654, "Unlock the @or1@Blood Whip@whi@ perk", null, new int[][]{new int[]{10834, 25}}, 0, 1, false);
        b(class_453.c, 2654, "Dip an abyssal whip in the blood fountain", "to create a Blood whip (perk required)", new int[][]{new int[]{20808, 1}}, 0, 1, false);
        i();
        d.a(bK).a(bL, 110, 42);
        d.a(63740).a(bL, 475, 13);
        d.a(63741).a(bL, 475, 13);
        d.a();
    }

    public static void h() {
        e.b();
        f.clear();
        g.clear();
        bG = 0;
    }

    public static void i() {
        int i = 0;
        Iterator<class_454> it = f.iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            a(it.next(), i2);
        }
        Iterator<class_454> it2 = g.iterator();
        while (it2.hasNext()) {
            int i3 = i;
            i++;
            a(it2.next(), i3);
        }
        j().aF = (f.size() + g.size()) * 74;
        e.a();
    }

    public static Widget j() {
        return Widget.H[bK];
    }
}
