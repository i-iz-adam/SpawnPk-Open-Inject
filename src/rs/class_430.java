package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_430.class */
public class class_430 extends class_360 {
    public class_430(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        Widget widgetD = d(50600);
        int i = class_102.c(4965).w;
        addSprite(50601, "misc/login 5");
        a(50602, "Welcome back, Username!", this.a, 2, class_492.g, true);
        a(50603, "<u=16750623>" + "Solar Event: Summer 2026" + "</u> <img=82>", this.a, 1, class_492.g, false);
        a(50604, "Check out this year's latest holiday event!", "Select", this.a, 0, class_492.c, false, true, User32.VK_PLAY);
        a(50605, "And, for a limited time only, you'll receive", "Select", this.a, 0, class_492.c, false, true, User32.VK_PLAY);
        a(50606, "one of the rewards below for logging in daily!", "Select", this.a, 0, class_492.c, false, true, User32.VK_PLAY);
        a(50607, "", "Select", this.a, 0, class_492.c, false, false, User32.VK_PLAY);
        a(50608, "", "Select", this.a, 0, class_492.c, false, false, User32.VK_PLAY);
        a(50609, "", "Select", this.a, 0, class_492.c, false, false, User32.VK_PLAY);
        a(50610, "", "Select", this.a, 0, class_492.c, false, false, User32.VK_PLAY);
        a(50611, "", "Select", this.a, 0, class_492.c, false, false, User32.VK_PLAY);
        a(50612, "", "Select", this.a, 0, class_492.c, false, false, User32.VK_PLAY);
        b(50613, 100, 100);
        Widget.H[50613].ae = 4965;
        Widget.H[50613].aR = 450;
        Widget.H[50613].aS = 150;
        Widget.H[50613].aT = 150;
        Widget.H[50613].aq = 0;
        Widget.H[50613].cache = 0;
        Widget.H[50613].aB = i;
        a(50614, "<img=209> Welcome back to SpawnPK! Limited Time Event <img=209>", this.a, 2, class_492.g, true);
        a(50615, (Boolean) true);
        H[50615].K = new int[20];
        H[50615].av = new int[20];
        H[50615].ax = new int[20];
        H[50615].ar = new int[20];
        H[50615].P = 4;
        H[50615].aP = 5;
        H[50615].ab = 30;
        H[50615].ao = 7;
        Widget widgetD2 = d(50616);
        widgetD2.ak = new int[1];
        widgetD2.al = new int[1];
        widgetD2.ba = new int[1];
        widgetD2.aF = 300;
        widgetD2.P = User32.VK_OEM_COPY;
        widgetD2.aP = 89;
        widgetD2.bh = 87;
        widgetD2.k(1);
        widgetD2.b(0, 50615, 12, 10);
        a(50617, "Event expires on: @yel@" + "May 15th, 2026", this.a, 1, class_492.e, true);
        a(50618, "misc/login", 2, 130, 32, "Play now", -1, 50619, 1);
        a(50619, "misc/login", 3, 130, 32, 50620);
        a(50621, "Play now", this.a, 0, class_492.e, true);
        a(50622, "Your next daily reward: @yel@24h 0m 0s", this.a, 1, class_492.e, true);
        widgetD.k(19);
        widgetD.b(0, 50601, 12, 16);
        widgetD.b(1, 63740, 476, 19);
        widgetD.b(2, 63741, 476, 19);
        widgetD.b(3, 50613, 74, 195 + 0);
        widgetD.b(4, 50602, 360, 60);
        widgetD.b(5, 50603, 230, 80);
        widgetD.b(6, 50604, 230, 96);
        widgetD.b(7, 50605, 230, 109);
        widgetD.b(8, 50606, 230, 122);
        widgetD.b(9, 50607, -230, 135);
        widgetD.b(10, 50608, -230, 157);
        widgetD.b(11, 50609, -230, 170);
        widgetD.b(12, 50610, -230, 183);
        widgetD.b(13, 50611, -230, 196);
        widgetD.b(14, 50612, -230, aU.hs_);
        widgetD.b(15, 50614, User32.WM_SYSCHAR, 21);
        widgetD.b(16, 50616, 225, 147);
        widgetD.b(17, 50617, aU.ik_, 248);
        widgetD.b(18, 50622, aU.ij_, User32.WM_UNICHAR);
    }
}
