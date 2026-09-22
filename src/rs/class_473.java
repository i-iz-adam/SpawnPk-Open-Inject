package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import org.lwjgl.opengl.CGL;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_473.class */
public class class_473 extends class_360 {
    private static final int bK = 4000;
    public static class_333 c;
    public static class_333 d;
    public static class_333 e;
    public static class_333 f;
    public static class_333 g;
    public static final int[][] bG = {new int[]{10325, 10335}, new int[]{10326, 10336}, new int[]{10327, 10337}, new int[]{10328, 10338}, new int[]{10329, 10339}, new int[]{10330, 10340}, new int[]{10331, 10341}, new int[]{10332, 10342}};
    public static String[] bH = {"Release"};
    public static String[] bI = {"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw 14", "Withdraw All But One"};
    public static String[] bJ = {"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw 14", "Bag-exchange"};

    public static void m(int i) {
        bI[5] = "Withdraw " + i;
        bJ[5] = "Withdraw " + i;
    }

    public static void a(Client client) {
        client.ev = 0;
        Client.fM = true;
        client.fN = 25;
        client.gb = true;
        client.fB = "";
        client.eQ = "Enter name of item to search";
    }

    public class_473(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        c = new class_333("bank/TAB 0");
        d = new class_333("bank/TAB 1");
        e = new class_333("bank/TAB 2");
        f = new class_333("bank/TAB 3");
        g = new class_333("bank/TAB 4");
        int iCeil = (int) Math.ceil(400.0d);
        int i = 10 * iCeil;
        H[5385].aF = iCeil * 38;
        Widget widget = H[5382];
        widget.ax = new int[i];
        widget.av = new int[i];
        widget.aP = iCeil;
        widget.e();
        widget.P = 10;
        Widget widget2 = H[5292];
        a(5384, "", this.a, 0, 16756736, false);
        for (int i2 = 92; i2 < widget2.al.length; i2++) {
            int i3 = 40;
            if ((i2 >= 92 && i2 <= 95) || i2 == 97) {
                i3 = 90;
            }
            int[] iArr = widget2.al;
            int i4 = i2;
            iArr[i4] = iArr[i4] - i3;
        }
        widget2.al[90] = 410;
        widget2.ba[90] = 288;
        Widget widgetJ = j(23000);
        widgetJ.ax = new int[i];
        widgetJ.av = new int[i];
        widgetJ.ak = new int[1];
        widgetJ.al = new int[1];
        widgetJ.ba = new int[1];
        widgetJ.ak[0] = 5292;
        widgetJ.al[0] = 0;
        widgetJ.ba[0] = 0;
        c(this.a);
        b(this.a);
    }

    public static void b(int i, Boolean bool) {
        Widget widget = H[i];
        widget.W = new String[5];
        widget.K = new int[20];
        widget.av = new int[30];
        widget.ax = new int[30];
        widget.ar = new int[20];
        widget.ak = new int[0];
        widget.al = new int[0];
        widget.ba = new int[0];
        widget.t = false;
        widget.ab = 24;
        widget.ao = 24;
        widget.aP = 5;
        widget.P = 6;
        widget.ag = 5292;
        widget.au = i;
        widget.aG = 2;
    }

    public static void b(class_338[] class_338VarArr) {
        Widget widget = H[5385];
        a(19, widget);
        c(43604, 1, "bank/SEP");
        a(43605, "Tab 1", class_338VarArr, 0, class_492.e, true, false);
        c(43606, 1, "bank/SEP");
        a(43607, "Tab 2", class_338VarArr, 0, class_492.e, true, false);
        c(43608, 1, "bank/SEP");
        a(43609, "Tab 3", class_338VarArr, 0, class_492.e, true, false);
        c(43610, 1, "bank/SEP");
        a(43611, "Tab 4", class_338VarArr, 0, class_492.e, true, false);
        c(43612, 1, "bank/SEP");
        a(43613, "Tab 5", class_338VarArr, 0, class_492.e, true, false);
        c(43614, 1, "bank/SEP");
        a(43615, "Tab 6", class_338VarArr, 0, class_492.e, true, false);
        c(43616, 1, "bank/SEP");
        a(43617, "Tab 7", class_338VarArr, 0, class_492.e, true, false);
        c(43618, 1, "bank/SEP");
        a(43619, "Tab 8", class_338VarArr, 0, class_492.e, true, false);
        c(43620, 1, "bank/SEP");
        a(43621, "Tab 9", class_338VarArr, 0, class_492.e, true, false);
        b(43604, 30, -10, 1, widget);
        b(43605, 40, -19, 2, widget);
        b(43606, 30, -10, 3, widget);
        b(43607, 40, -19, 4, widget);
        b(43608, 30, -10, 5, widget);
        b(43609, 40, -19, 6, widget);
        b(43610, 30, -10, 7, widget);
        b(43611, 40, -19, 8, widget);
        b(43612, 30, -10, 9, widget);
        b(43613, 40, -19, 10, widget);
        b(43614, 30, -10, 11, widget);
        b(43615, 40, -19, 12, widget);
        b(43616, 30, -10, 13, widget);
        b(43617, 40, -19, 14, widget);
        b(43618, 30, -10, 15, widget);
        b(43619, 40, -19, 16, widget);
        b(43620, 30, -10, 17, widget);
        b(43621, 40, -19, 0, widget);
        b(5382, 38, 3, 18, widget);
    }

    public static void c(class_338[] class_338VarArr) {
        Widget widgetD = d(5292);
        a(43, widgetD);
        c(5293, 0, "bank/BANK");
        int i = 0 + 1;
        b(5293, 13, 13, 0, widgetD);
        a(5383, "The Bank of SpawnPK", class_338VarArr, 2, class_492.e, true, true);
        int i2 = i + 1;
        b(5383, User32.WM_UNICHAR, 17, i, widgetD);
        a(5384, 3, 0, 5380, 1, "bank/BANK", 17, 17, "Close Window");
        a(5380, 2, "bank/BANK", 17, 17, 5379);
        int i3 = i2 + 1;
        b(5384, 476, 16, i2, widgetD);
        int i4 = i3 + 1;
        b(5380, 476, 16, i3, widgetD);
        class_342.b(5294, "bank/BANK 3", "Repair items\n@gre@[CTRL+R]").a().a("bank/BANK 4");
        int i5 = i4 + 1;
        b(5294, 150, 285, i4, widgetD);
        a(26000, 4, 26001, 5, 8, "bank/BANK", 35, 25, CGL.kCGLCPSurfaceBackingSize, 1, "Swap Withdraw Mode", 26002, 7, 6, "bank/BANK", 26003, "Switch to insert items \nmode", "Switch to swap items \nmode.", 12, 20);
        int i6 = i5 + 1;
        b(26000, 25, 285, i5, widgetD);
        int i7 = i6 + 1;
        b(26001, 10, 225, i6, widgetD);
        class_342.b(26004, "bank/BANK 13", "Search for item\n@gre@[CTRL+S]").a().a("bank/BANK 15");
        int i8 = i7 + 1;
        b(26004, 65, 285, i7, widgetD);
        a(26008, 4, 26009, 9, 11, "bank/BANK", 35, 25, 115, 1, "Toggle note", 26010, 10, 12, "bank/BANK", 26011, "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode", 12, 20);
        int i9 = i8 + 1;
        b(26008, User32.VK_PLAY, 285, i8, widgetD);
        int i10 = i9 + 1;
        b(26009, 235, 225, i9, widgetD);
        a(26012, 5, 26013, 17, "bank/BANK", 35, 25, "Deposit carried tems", 26014, 18, "bank/BANK", 26015, "Empty your backpack into\nyour bank", 0, 20);
        int i11 = i10 + 1;
        b(26012, 375, 285, i10, widgetD);
        int i12 = i11 + 1;
        b(26013, 360, 225, i11, widgetD);
        a(26016, 5, 26017, 19, "bank/BANK", 35, 25, "Deposit worn items", 26018, 20, "bank/BANK", 26019, "Empty the items your are\nwearing into your bank", 0, 20);
        int i13 = i12 + 1;
        b(26016, 415, 285, i12, widgetD);
        int i14 = i13 + 1;
        b(26017, 400, 225, i13, widgetD);
        a(26020, 5, 26021, 21, "bank/BANK", 35, 25, "Decant potions", 26022, 22, "bank/BANK", 26023, "Decant all potions in your bank", 0, 20);
        int i15 = i14 + 1;
        b(26020, 455, 285, i14, widgetD);
        int i16 = i15 + 1;
        b(26021, 440, 225, i15, widgetD);
        b(10325, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i17 = i16 + 1;
        b(10325, 70, 36, i16, widgetD);
        b(10326, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i18 = i17 + 1;
        b(10326, 118, 36, i17, widgetD);
        b(10327, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i19 = i18 + 1;
        b(10327, 166, 36, i18, widgetD);
        b(10328, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i20 = i19 + 1;
        b(10328, 214, 36, i19, widgetD);
        b(10329, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i21 = i20 + 1;
        b(10329, User32.WM_SYSCHAR, 36, i20, widgetD);
        b(10330, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i22 = i21 + 1;
        b(10330, 310, 36, i21, widgetD);
        b(10331, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i23 = i22 + 1;
        b(10331, 358, 36, i22, widgetD);
        b(10332, 4, "bank/TAB", "Drag an item here to create a new tab");
        int i24 = i23 + 1;
        b(10332, 406, 36, i23, widgetD);
        a(19995, e.e, class_338VarArr, 0, 11834970, true, false);
        int i25 = i24 + 1;
        b(19995, 474, 43, i24, widgetD);
        a(19996, "495", class_338VarArr, 0, 11834970, true, false);
        int i26 = i25 + 1;
        b(19996, 474, 56, i25, widgetD);
        a(19997, "Repairs", class_338VarArr, 0, class_492.e, false, true);
        int i27 = i26 + 1;
        b(19997, -1476, 301, i26, widgetD);
        c(10335, (Boolean) true);
        int i28 = i27 + 1;
        b(10335, 77, 39, i27, widgetD);
        c(10336, (Boolean) false);
        int i29 = i28 + 1;
        b(10336, 125, 39, i28, widgetD);
        c(10337, (Boolean) false);
        int i30 = i29 + 1;
        b(10337, 173, 39, i29, widgetD);
        c(10338, (Boolean) false);
        int i31 = i30 + 1;
        b(10338, 221, 39, i30, widgetD);
        c(10339, (Boolean) false);
        int i32 = i31 + 1;
        b(10339, User32.WM_IME_STARTCOMPOSITION, 39, i31, widgetD);
        c(10340, (Boolean) false);
        int i33 = i32 + 1;
        b(10340, 317, 39, i32, widgetD);
        c(10341, (Boolean) false);
        int i34 = i33 + 1;
        b(10341, g.p, 39, i33, widgetD);
        c(10342, (Boolean) false);
        int i35 = i34 + 1;
        b(10342, g.i, 39, i34, widgetD);
        b(10324, 0, "bank/TAB", "Click here to view the full contents of your bank");
        int i36 = i35 + 1;
        b(10324, 22, 36, i35, widgetD);
        a(27000, e.d, class_338VarArr, 0, 16772659);
        a(27001, e.e, class_338VarArr, 0, 16772659);
        a(27002, e.e, class_338VarArr, 0, 16772659);
        int i37 = i36 + 1;
        b(5385, -4, 74, i36, widgetD);
        a(39971, 4, 39970, 24, 26, "bank/BANK", 35, 25, 116, 1, "Toggle placeholders", 39969, 25, 27, "bank/BANK", 39968, "Always set as placeholders", "Do not set as placeholders", 12, 20);
        int i38 = i37 + 1;
        b(39971, User32.WM_MENURBUTTONUP, 285, i37, widgetD);
        int i39 = i38 + 1;
        b(39970, 275, 225, i38, widgetD);
        int i40 = i39 + 1;
        b(19997, 187, User32.WM_MENUGETOBJECT, i39, widgetD);
        a(38976, 5, 38977, 28, "bank/BANK", 35, 25, "Deposit pet", 38978, 29, "bank/BANK", 38979, "Deposit your pet to your bank", 0, 20);
        int i41 = i40 + 1;
        b(38976, 335, 285, i40, widgetD);
        int i42 = i41 + 1;
        b(38977, 320, 225, i41, widgetD);
        class_342.b(38980, "bank/BANK 14", "Filter by currencies\n@gre@[CTRL+C]").a().a("bank/BANK 16");
        int i43 = i42 + 1;
        b(38980, 106, 285, i42, widgetD);
        Widget widget = H[5385];
        widget.aP = 206;
        widget.P = 480;
        H[5382].ab = 12;
    }

    public static void c(int i, Boolean bool) {
        Widget widget = H[i];
        widget.W = new String[]{null, "Select tab", "Collapse tab", null, null};
        widget.K = new int[20];
        widget.av = new int[30];
        widget.ax = new int[30];
        widget.ar = new int[20];
        widget.ak = new int[0];
        widget.al = new int[0];
        widget.ba = new int[0];
        widget.t = false;
        widget.af = true;
        widget.aD = true;
        widget.ab = 24;
        widget.ao = 24;
        widget.aP = 5;
        widget.P = 6;
        widget.ag = 5292;
        widget.au = i;
        widget.aG = 2;
    }
}
