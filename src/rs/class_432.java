package rs;

import com.google.inject.internal.asm.$Opcodes;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_432.class */
public class class_432 extends class_360 {
    public class_432(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(52000);
        a(51999, "<img=291>", this.a, 0, class_492.e, true);
        a(52001, "Lottery title", this.a, 2, 16751360, true, true);
        a(52002, "@yel@The winning pot is currently..", this.a, 0, class_492.e, false);
        a(52003, "Latest Raffle Winners", this.a, 1, class_492.e, true);
        a(52004, "Time until the winner is announced..", this.a, 1, class_492.e, true);
        a(52005, "@yel@5 hours 18 mins 48 secs", this.a, 0, class_492.e, true);
        a(52006, "@or1@(There are @gre@23@or1@ participants in this lottery)", this.a, 0, class_492.e, true);
        a(52007, (Boolean) false);
        H[52007].P = 4;
        H[52007].ab = 11;
        a(52008, (Boolean) false);
        H[52008].P = 4;
        H[52008].ab = 11;
        Widget widgetD2 = d(52009);
        widgetD2.aF = 50;
        widgetD2.P = 350;
        widgetD2.aP = 83;
        widgetD2.bh = 87;
        widgetD2.k(6);
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (i == 2) {
                a(52014 + i2, "", this.a, 0, class_492.e, true);
                i = 0;
            } else if (i == 0) {
                a(52014 + i2, "", this.a, 0, class_492.e, true);
                i++;
            } else {
                a(52014 + i2, "", this.a, 0, class_492.e, true);
                i++;
            }
            widgetD2.b(i2, 52014 + i2, 197, 4 + (i2 * 13));
        }
        a(52010, 5, 0, 52011, 1, "fountain/button", 70, 41, "Enter lottery");
        a(52011, 2, "fountain/button", 70, 41, 61198);
        addSprite(52012, "fountain/icon 1");
        a(52013, "Buy-\\nentry", this.a, 0, 16751360, true, true);
        widgetD.k(17);
        widgetD.b(0, 61151, 55, 36);
        widgetD.b(1, 52001, 257, 44);
        widgetD.b(2, 52002, 125, 84);
        widgetD.b(3, 52003, 263, 118);
        widgetD.b(4, 52004, 327, 236);
        widgetD.b(5, 52005, 326, 256);
        widgetD.b(6, 52006, 326, 276);
        widgetD.b(7, 52007, 74, User32.VK_CRSEL);
        widgetD.b(8, 52008, 362, 77);
        widgetD.b(9, 52009, 64, 136);
        widgetD.b(10, 52010, 358 - 238, 174 + 67);
        widgetD.b(11, 52011, 358 - 238, 174 + 67);
        widgetD.b(12, 52012, 364 - 238, $Opcodes.INVOKESTATIC + 67);
        widgetD.b(13, 52013, 405 - 238, (189 + 67) - 5);
        widgetD.b(14, 63740, 433, 44);
        widgetD.b(15, 63741, 433, 44);
        widgetD.b(16, 51999, 379, 85);
    }
}
