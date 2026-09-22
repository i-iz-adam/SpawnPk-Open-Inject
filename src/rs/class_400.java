package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_400.class */
public class class_400 extends class_360 {
    public static int c = class_442.h;

    public static void d(int i, int i2, int i3, int i4) {
    }

    public class_400(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(60062);
        c(60063, 1, "misc/donor");
        c(60064, 2, "misc/donor");
        c(60065, 3, "misc/donor");
        Widget.H[60065].E = new class_333("misc/donor 3", 0, 15);
        a(60066, "@or2@NOTE: @yel@This is only counted from payments, not opening bonds!", this.a, 0, class_492.e, false, true);
        a(60067, "<img=83> @yel@Reach the total amount in bond purchase, before the promotion expires!", this.a, 0, 16751360, false, true);
        c(60068, 4, "misc/donor");
        a(60069, "@or1@Promotional rewards", this.a, 2, 16751360, false, true);
        a(60070, "@or1@Donor options and features", this.a, 2, 16751360, false, true);
        a(60072, "@or1@Main Donor Panel", this.a, 2, 16751360, true, true);
        a(60071, (Boolean) false);
        a(60073, "<img=9> Donate for rewards", "Select this option", this.a, 0, 16751360, false, true, 500);
        a(60074, "<img=6> View donator perks & benefits", "Select this option", this.a, 0, 16751360, false, true, 500);
        a(60075, "<img=24> Open donator shop", "Select this option", this.a, 0, 16751360, false, true, 500);
        a(60076, "<img=3>  Teleport to donator zone", "Select this option", this.a, 0, 16751360, false, true, 500);
        a(60077, "<img=5>  Teleport to elite donator zone", "Select this option", this.a, 0, 16751360, false, true, 500);
        a(60078, "<img=7> Teleport to vip donator zone", "Select this option", this.a, 0, 16751360, false, true, 500);
        a(60079, "<img=37>  Teleport to sponsor donator zone", "Select this option", this.a, 0, 16751360, false, true, 500);
        c(60080, 4, "misc/donor");
        a(60081, "@or2@$150", this.a, 0, 16751360, true, true);
        a(60082, (Boolean) false);
        Widget.H[60082].ax[0] = 23172;
        Widget.H[60082].av[0] = 2;
        c(60083, 4, "misc/donor");
        a(60084, "@or2@$300", this.a, 0, 16751360, true, true);
        a(60085, (Boolean) false);
        Widget.H[60085].ax[0] = 11695;
        Widget.H[60085].av[0] = 1;
        c(60086, 4, "misc/donor");
        a(60087, "@or2@$500", this.a, 0, 16751360, true, true);
        a(60088, (Boolean) false);
        Widget.H[60088].ax[0] = 13741;
        Widget.H[60088].av[0] = 1;
        b(60089, 100, 100);
        Widget.H[60089].ae = aU.nT;
        Widget.H[60089].aR = aU.mt;
        Widget.H[60089].aq = 0;
        Widget.H[60089].cache = 0;
        Widget.H[60089].aB = class_102.c(808).w;
        c(60090, 5, "misc/donor");
        a(60091, "@yel@$0", this.a, 0, 16751360, true, true);
        a(60092, "<img=25>", this.a, 0, 16751360, true, true);
        a(60093, "<img=25>", this.a, 0, 16751360, true, true);
        a(60094, "<img=25>", this.a, 0, 16751360, true, true);
        c(60095, 6, "misc/donor");
        Widget.H[60095].E = new class_333("misc/donor 6", 0, 15);
        c(60096, 4, "misc/donor");
        c(60097, 13, "misc/donor");
        a(60098, (Boolean) false);
        Widget.H[60098].ax[0] = 22466;
        Widget.H[60098].av[0] = 2;
        a(60099, "@yel@Next promo", this.a, 0, 16751360, true, true);
        a(60100, "@yel@will be @gre@10% OFF", this.a, 0, 16751360, true, true);
        widgetD.k(34);
        widgetD.b(0, 60063, 9, 5);
        widgetD.b(1, 60064, 54, User32.WM_IME_ENDCOMPOSITION + 3);
        widgetD.b(2, 60065, 54, User32.WM_IME_ENDCOMPOSITION + 3);
        widgetD.b(3, 60095, 54, User32.WM_IME_ENDCOMPOSITION + 3);
        widgetD.b(4, 60068, -4893, 249);
        widgetD.b(5, 60066, aU.hS_, User32.VK_OEM_BACKTAB);
        widgetD.b(6, 60067, 257, aU.hK_);
        widgetD.b(7, 60069, 67, aU.ht_);
        widgetD.b(8, 60070, 69, 49);
        widgetD.b(9, 60071, -4886, 253);
        widgetD.b(10, 63740, 482, 11);
        widgetD.b(11, 63741, 482, 11);
        widgetD.b(12, 60072, aU.hS_, 12);
        widgetD.b(13, 60073, 43, 75);
        widgetD.b(14, 60074, 44, 93);
        widgetD.b(15, 60075, 43, 111);
        widgetD.b(16, 60076, 46, 129);
        widgetD.b(17, 60077, 46, 147);
        widgetD.b(18, 60078, 45, 165);
        widgetD.b(19, 60079, 45, 183);
        widgetD.b(20, 60080, 174, 257 + 3);
        widgetD.b(21, 60081, 195, 300 + 3);
        widgetD.b(22, 60082, 179, User32.WM_SYSCHAR + 3);
        widgetD.b(23, 60083, User32.WM_UPDATEUISTATE, 257 + 3);
        widgetD.b(24, 60084, 317, 300 + 3);
        widgetD.b(25, 60085, 301, User32.WM_SYSCHAR + 3);
        widgetD.b(26, 60086, 418, 257 + 3);
        widgetD.b(27, 60087, 439, 300 + 3);
        widgetD.b(28, 60088, 423, User32.WM_SYSCHAR + 3);
        widgetD.b(29, 60090, 41, 264);
        widgetD.b(30, 60091, 57, aU.ie_);
        widgetD.b(31, 60092, 206, 286);
        widgetD.b(32, 60093, 328, 286);
        widgetD.b(33, 60094, 450, 286);
    }
}
