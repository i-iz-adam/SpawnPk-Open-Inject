package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_482.class */
public class class_482 extends class_360 {
    public class_482(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetJ = j(18128);
        a(18129, "/clan/sprite", 6, 72, 32, "Join Chat", -1, 18130, 1);
        a(18130, "/clan/sprite", 7, 72, 32, 18131);
        a(18132, "/clan/sprite", 6, 72, 32, "Clan Setup", -1, 18133, 5);
        a(18133, "/clan/sprite", 7, 72, 32, 18134);
        a(18135, "Join Chat", this.a, 0, 16751360, true, true);
        a(18136, "Clan Setup", this.a, 0, 16751360, true, true);
        c(18137, 37, "/clan/sprite");
        a(18138, "Clan Chat (0/100)", this.a, 2, 16751360, true, true);
        a(18139, "Talking in: @yel@Not in chat", this.a, 0, 16751360, false, true);
        a(18140, "Owner: @whi@None", this.a, 0, 16751360, false, true);
        widgetJ.k(13);
        widgetJ.b(0, 16126, 0, 221);
        widgetJ.b(1, 16126, 0, 59);
        widgetJ.b(2, 18137, 0, 57);
        widgetJ.b(3, 18143, 0, 62);
        widgetJ.b(4, 18129, 15, 226);
        widgetJ.b(5, 18130, 15, 226);
        widgetJ.b(6, 18132, 103, 226);
        widgetJ.b(7, 18133, 103, 226);
        widgetJ.b(8, 18135, 51, User32.VK_OEM_PA3);
        widgetJ.b(9, 18136, 139, User32.VK_OEM_PA3);
        widgetJ.b(10, 18138, 95, 3);
        widgetJ.b(11, 18139, 10, 23);
        widgetJ.b(12, 18140, 25, 38);
        Widget widgetJ2 = j(18143);
        widgetJ2.k(aU.ia_);
        for (int i = 18144; i <= 18244; i++) {
            a(i, "<img=17> Ryan " + i, "Manage clan member", this.a, 0, class_492.e, false, false, 125);
        }
        for (int i2 = 25800; i2 <= 25999; i2++) {
            a(i2, "<img=17> Ryan " + i2, "Manage clan member", this.a, 0, class_492.e, false, false, 125);
        }
        int i3 = 18144;
        for (int i4 = 0; i3 <= 18243 && i4 <= 99; i4++) {
            widgetJ2.ak[i4] = i3;
            widgetJ2.al[i4] = 15;
            int i5 = 18144;
            for (int i6 = 1; i5 <= 18243 && i6 <= 99; i6++) {
                widgetJ2.ba[0] = 2;
                widgetJ2.ba[i6] = widgetJ2.ba[i6 - 1] + 14;
                i5++;
            }
            i3++;
        }
        int i7 = 25800;
        for (int i8 = 100; i7 <= 25999 && i8 <= 297; i8++) {
            widgetJ2.ak[i8] = i7;
            widgetJ2.al[i8] = 15;
            int i9 = 25800;
            for (int i10 = 101; i9 <= 25999 && i10 <= 297; i10++) {
                widgetJ2.ba[100] = 1402;
                widgetJ2.ba[i10] = widgetJ2.ba[i10 - 1] + 14;
                i9++;
            }
            i7++;
        }
        widgetJ2.aP = 153;
        widgetJ2.P = 174;
        widgetJ2.aF = 4200;
    }
}
