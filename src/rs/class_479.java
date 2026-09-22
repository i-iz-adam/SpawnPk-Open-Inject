package rs;

import com.google.inject.internal.asm.$Opcodes;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_479.class */
public class class_479 extends class_360 {
    public class_479(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(61150);
        addSprite(61151, "fountain/sprite 22");
        a(61152, "Bloodcore Token Lottery", this.a, 2, 16751360, true, true);
        a(61153, "The lottery's pot is currently..", this.a, 0, class_492.e, false);
        a(61154, "@yel@Latest Bloodcore Lottery Winners", this.a, 1, class_492.e, true);
        a(61155, "Time until the winner is announced..", this.a, 0, class_492.e, true);
        a(61156, "@yel@5 hours 18 mins 48 secs", this.a, 0, class_492.e, true);
        a(61157, "@or1@(There are @gre@23@or1@ participants in this lottery)", this.a, 0, class_492.e, true);
        a(61158, (Boolean) false);
        H[61158].P = 4;
        H[61158].ab = 11;
        H[61158].ax[0] = 22844;
        H[61158].av[0] = 250;
        a(61159, (Boolean) false);
        H[61159].P = 4;
        H[61159].ab = 11;
        H[61159].ax[0] = 22844;
        H[61159].av[0] = 10000;
        Widget widgetD2 = d(61160);
        widgetD2.aF = 475;
        widgetD2.P = 350;
        widgetD2.aP = 83;
        widgetD2.bh = 87;
        widgetD2.k(35);
        int i = 0;
        for (int i2 = 0; i2 < 35; i2++) {
            if (i == 2) {
                a(61161 + i2, "", this.a, 0, class_492.e, true);
                i = 0;
            } else if (i == 0) {
                a(61161 + i2, "", this.a, 0, class_492.e, true);
                i++;
            } else {
                a(61161 + i2, "", this.a, 0, class_492.e, true);
                i++;
            }
            widgetD2.b(i2, 61161 + i2, 197, 8 + (i2 * 13));
        }
        a(61196, 5, 0, 61197, 1, "fountain/button", 70, 41, "Enter bloodcore lottery");
        a(61197, 2, "fountain/button", 70, 41, 61198);
        addSprite(61199, "fountain/icon 1");
        a(61200, "Enter", this.a, 0, 16751360, true, true);
        widgetD.k(14);
        widgetD.b(0, 61151, 55, 36);
        widgetD.b(1, 61152, 257, 44);
        widgetD.b(2, 61153, 125, 84);
        widgetD.b(3, 61154, 263, 118);
        widgetD.b(4, 61155, 327, 236);
        widgetD.b(5, 61156, 326, 254);
        widgetD.b(6, 61157, 326, 276);
        widgetD.b(7, 61158, 74, User32.VK_CRSEL);
        widgetD.b(8, 61159, 362, 77);
        widgetD.b(9, 61160, 64, 136);
        widgetD.b(10, 61196, 358 - 238, 174 + 67);
        widgetD.b(11, 61197, 358 - 238, 174 + 67);
        widgetD.b(12, 61199, 364 - 238, $Opcodes.INVOKESTATIC + 67);
        widgetD.b(13, 61200, 405 - 238, 189 + 67);
    }
}
