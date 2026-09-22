package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_410.class */
public class class_410 extends class_360 {
    public static final int c = 18559;

    public class_410(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(c);
        c(55732, 0, "tasks/SPRITE");
        a(55733, "@or1@Task Scroll Title", this.a, 2, 16751360, true, true);
        a(55734, "@or1@Task Information", this.a, 2, 16751360, false, true);
        a(55735, "@or1@Potential Rewards", this.a, 2, 16751360, false, true);
        a(55736, "@or1@Completion Progress", this.a, 2, 16751360, false, true);
        Widget widgetD2 = d(55737);
        widgetD2.aF = User32.VK_PLAY;
        widgetD2.P = 235;
        widgetD2.aP = 170;
        widgetD2.k(20);
        for (int i = 0; i < 20; i++) {
            a(55738 + i, "Description " + (i + 1) + " (" + (55738 + i) + ")", this.a, 0, class_492.c, false, false);
            widgetD2.b(i, 55738 + i, 20, 4 + (15 * i));
        }
        Widget widgetD3 = d(55758);
        widgetD3.aF = aU.ie;
        widgetD3.P = 178;
        widgetD3.aP = 170;
        widgetD3.k(1);
        a(55759, (Boolean) false);
        H[55759].ax = new int[100];
        H[55759].av = new int[100];
        H[55759].aP = 25;
        H[55759].P = 4;
        H[55759].ab = 10;
        H[55759].ao = 10;
        for (int i2 = 0; i2 < 10; i2++) {
            H[55759].ax[i2] = 1337;
            H[55759].av[i2] = i2 + 1;
        }
        widgetD3.b(0, 55759, 18, 6);
        c(55760, 1, "tasks/SPRITE");
        c(55761, 2, "tasks/SPRITE");
        Widget.H[55761].E = new class_333("tasks/SPRITE 2", 0, 15);
        a(55762, "@yel@This meter indicates your progress for the objective.\\nOnce complete, you'll receive a casket.", this.a, 0, 16751360, true, true);
        a(55763, "0% (0/100)", this.a, 0, 0, true, false);
        a(55764, 4, 0, 55765, 3, "tasks/SPRITE", 70, 13, "Collect reward");
        a(55765, 4, "tasks/SPRITE", 70, 13, 55766);
        a(55767, "@yel@Collect", this.a, 0, 0, true, true);
        a(55768, 4, 0, 55769, 5, "tasks/SPRITE", 70, 13, "Track progress");
        a(55769, 6, "tasks/SPRITE", 70, 13, 55770);
        a(55771, "  @yel@Track<img=39>", this.a, 0, 0, true, true);
        widgetD.k(19);
        widgetD.b(0, 55732, 40, 7);
        widgetD.b(1, 55733, User32.WM_MENURBUTTONUP, 18);
        widgetD.b(2, 64275, 464, 18);
        widgetD.b(3, 64276, 464, 18);
        widgetD.b(4, 55734, 85, 55);
        widgetD.b(5, 55735, 325, 55);
        widgetD.b(6, 55736, 85, 254);
        widgetD.b(7, 55737, 40, 74);
        widgetD.b(8, 55758, User32.WM_GESTURE, 74);
        widgetD.b(9, 55760, 111, 278);
        widgetD.b(10, 55761, 111, 278);
        widgetD.b(11, 55762, 256, User32.WM_CHANGEUISTATE);
        widgetD.b(12, 55763, 258, 280);
        widgetD.b(13, 55764, aU.io_, 255);
        widgetD.b(14, 55765, aU.io_, 255);
        widgetD.b(15, 55767, 431, 256);
        widgetD.b(16, 55768, 327, 255);
        widgetD.b(17, 55769, 327, 255);
        widgetD.b(18, 55771, 361, 256);
        for (int i3 = 0; i3 < widgetD.ak.length; i3++) {
            int[] iArr = widgetD.al;
            int i4 = i3;
            iArr[i4] = iArr[i4] - 10;
            int[] iArr2 = widgetD.ba;
            int i5 = i3;
            iArr2[i5] = iArr2[i5] - 5;
        }
    }
}
