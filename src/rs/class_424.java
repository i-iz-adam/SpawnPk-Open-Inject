package rs;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_424.class */
public class class_424 extends class_360 {
    public static class_333 c;
    public static final Set<Integer> d = ConcurrentHashMap.newKeySet();
    public static class_553 e = new class_425();

    public class_424(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        b(this.a);
        c(this.a);
    }

    public static void b(class_338[] class_338VarArr) {
        c = new class_333("icons/death");
        Widget widgetD = d(17115);
        a(17109, "", class_338VarArr, 0, class_492.e);
        a(17110, "At the moment nearly all", class_338VarArr, 0, class_492.e);
        a(17111, "items are tradeable", class_338VarArr, 0, class_492.e);
        a(17112, "and can be lost on death.", class_338VarArr, 0, class_492.e);
        a(17113, "", class_338VarArr, 0, class_492.e);
        a(17114, "If you are red-skulled,", class_338VarArr, 0, class_492.e);
        a(17117, "you will lose all your", class_338VarArr, 0, class_492.e);
        a(17118, "items regardless of", class_338VarArr, 0, class_492.e);
        a(17119, "what you are praying.", class_338VarArr, 0, class_492.e);
        a(17120, "", class_338VarArr, 0, class_492.e);
        a(17121, "", class_338VarArr, 0, class_492.e);
        a(17122, "", class_338VarArr, 0, class_492.e);
        a(17123, "", class_338VarArr, 0, class_492.e);
        a(17124, "", class_338VarArr, 0, class_492.e);
        a(17125, "", class_338VarArr, 0, class_492.e);
        a(17126, "", class_338VarArr, 0, class_492.e);
        a(17127, "", class_338VarArr, 0, class_492.e);
        a(17128, "", class_338VarArr, 0, class_492.e);
        a(17129, "", class_338VarArr, 0, class_492.e);
        widgetD.ag = 17115;
        widgetD.au = 17115;
        widgetD.aG = 0;
        widgetD.M = 0;
        widgetD.J = 0;
        widgetD.P = 130;
        widgetD.aP = 197;
        widgetD.aA = (byte) 0;
        widgetD.aa = -1;
        widgetD.aF = 280;
        widgetD.ak = new int[19];
        widgetD.al = new int[19];
        widgetD.ba = new int[19];
        widgetD.ak[0] = 17109;
        widgetD.al[0] = 0;
        widgetD.ba[0] = 0;
        widgetD.ak[1] = 17110;
        widgetD.al[1] = 0;
        widgetD.ba[1] = 12;
        widgetD.ak[2] = 17111;
        widgetD.al[2] = 0;
        widgetD.ba[2] = 24;
        widgetD.ak[3] = 17112;
        widgetD.al[3] = 0;
        widgetD.ba[3] = 36;
        widgetD.ak[4] = 17113;
        widgetD.al[4] = 0;
        widgetD.ba[4] = 48;
        widgetD.ak[5] = 17114;
        widgetD.al[5] = 0;
        widgetD.ba[5] = 60;
        widgetD.ak[6] = 17117;
        widgetD.al[6] = 0;
        widgetD.ba[6] = 72;
        widgetD.ak[7] = 17118;
        widgetD.al[7] = 0;
        widgetD.ba[7] = 84;
        widgetD.ak[8] = 17119;
        widgetD.al[8] = 0;
        widgetD.ba[8] = 96;
        widgetD.ak[9] = 17120;
        widgetD.al[9] = 0;
        widgetD.ba[9] = 108;
        widgetD.ak[10] = 17121;
        widgetD.al[10] = 0;
        widgetD.ba[10] = 120;
        widgetD.ak[11] = 17122;
        widgetD.al[11] = 0;
        widgetD.ba[11] = 132;
        widgetD.ak[12] = 17123;
        widgetD.al[12] = 0;
        widgetD.ba[12] = 144;
        widgetD.ak[13] = 17124;
        widgetD.al[13] = 0;
        widgetD.ba[13] = 156;
        widgetD.ak[14] = 17125;
        widgetD.al[14] = 0;
        widgetD.ba[14] = 168;
        widgetD.ak[15] = 17126;
        widgetD.al[15] = 0;
        widgetD.ba[15] = 180;
        widgetD.ak[16] = 17127;
        widgetD.al[16] = 0;
        widgetD.ba[16] = 192;
        widgetD.ak[17] = 17128;
        widgetD.al[17] = 0;
        widgetD.ba[17] = 204;
        widgetD.ak[18] = 17129;
        widgetD.al[18] = 0;
        widgetD.ba[18] = 216;
    }

    public static void c(class_338[] class_338VarArr) {
        Widget widgetD = d(17100);
        d(17101, 2, 2);
        a(17102, 3, 0, 10601, 1, "equipment/SPRITE", 17, 17, "Close Window");
        a(10601, 3, "equipment/SPRITE", 17, 17, 10602);
        a(17103, "Items kept on death", class_338VarArr, 2, class_492.e);
        a(17104, "Items I will keep...", class_338VarArr, 1, class_492.e);
        a(17105, "Items I will lose...", class_338VarArr, 1, class_492.e);
        a(17106, "Info", class_338VarArr, 1, class_492.e);
        a(17107, "Items I will auto-keep...", class_338VarArr, 1, class_492.e);
        a(17108, (Boolean) true);
        int length = Widget.H[10600].ax.length;
        Widget.H[17108].ax = new int[length];
        Widget.H[17108].av = new int[length];
        Widget.H[17108].K = new int[length];
        Widget.H[17108].ar = new int[length];
        Widget.H[17108].ab = Widget.H[10600].ab + 3;
        Widget.H[17108].ao = Widget.H[10600].ao;
        Widget.H[17108].P = Widget.H[10600].P;
        Widget.H[17108].aP = Widget.H[10600].aP;
        Widget widgetD2 = d(17130);
        widgetD2.aF = 75;
        widgetD2.P = User32.WM_MENURBUTTONUP;
        widgetD2.aP = 50;
        widgetD2.bh = 87;
        widgetD2.k(1);
        widgetD2.b(0, 17108, 0, 9);
        widgetD.aF = 0;
        widgetD.aO = false;
        widgetD.ak = new int[12];
        widgetD.al = new int[12];
        widgetD.ba = new int[12];
        widgetD.ak[0] = 17101;
        widgetD.al[0] = 7;
        widgetD.ba[0] = 8;
        widgetD.ak[1] = 17102;
        widgetD.al[1] = 480;
        widgetD.ba[1] = 17;
        widgetD.ak[2] = 17103;
        widgetD.al[2] = 185;
        widgetD.ba[2] = 18;
        widgetD.ak[3] = 17104;
        widgetD.al[3] = 22;
        widgetD.ba[3] = 50;
        widgetD.ak[4] = 17105;
        widgetD.al[4] = 22;
        widgetD.ba[4] = 170;
        widgetD.ak[5] = 17106;
        widgetD.al[5] = 347;
        widgetD.ba[5] = 47;
        widgetD.ak[6] = 17107;
        widgetD.al[6] = 22;
        widgetD.ba[6] = 110;
        widgetD.ak[7] = 17130;
        widgetD.al[7] = 24;
        widgetD.ba[7] = 124;
        widgetD.ak[8] = 17115;
        widgetD.al[8] = 348;
        widgetD.ba[8] = 64;
        widgetD.ak[9] = 10494;
        widgetD.al[9] = 26;
        widgetD.ba[9] = 74;
        widgetD.ak[10] = 10600;
        widgetD.al[10] = 26;
        widgetD.ba[10] = 193;
        widgetD.ak[11] = 10601;
        widgetD.al[11] = 480;
        widgetD.ba[11] = 17;
    }
}
