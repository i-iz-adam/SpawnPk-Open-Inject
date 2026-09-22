package rs;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_463.class */
public class class_463 extends class_360 {
    public static final int c = 20;
    public static final int d = 32300;
    public static final int e = 32299;
    public static final int f = 32298;
    public static final int g = 32297;
    public static final int bG = 32600;
    public static final int bH = 32301;
    public static final int bI = 32302;
    public static final int bJ = 32303;
    public static final int bK = 32304;
    public static final int bL = 32305;
    public static final int bM = 32306;
    public static final int bN = 32307;
    public static final int bO = 32595;
    public static final int bP = 32308;
    public static final int bQ = 32309;
    public static final int bR = 32310;
    public static final int bS = 32311;
    public static final int bT = 32312;
    public static final int bU = 32313;
    public static final int bV = 32314;
    public static final int bW = 32315;
    public static final int bY = 32317;
    public static final int bZ = 32417;
    public static final int ca = 32418;
    public static final int cb = 32419;
    public static final int cc = 32422;
    public static final int cd = 32425;
    public static final int ce = 32426;
    public static final int cf = 32427;
    public static final int cg = 32429;
    public static final int ch = 32430;
    public static final int ci = 32458;
    public static final int cj = 32459;
    public static final int ck = 32462;
    public static final int cl = 32465;
    public static final int cm = 32585;
    public static final int cn = 32586;
    public static final int co = 32596;
    public static final int cp = 32480;
    public static final int cr = 32482;
    public static final int cs = 32483;
    public static final int ct = 32484;
    public static final int cu = 32485;
    public static final int cv = 32486;
    public static final int cw = 32517;
    public static final int cx = 32597;
    public static final int cy = 32525;
    public static final int cz = 32526;
    public static final int cA = 32527;
    public static final int cB = 32528;
    public static final int cC = 32529;
    public static final int cD = 32530;
    public static final int cE = 32531;
    public static final int cF = 32534;
    public static final int cG = 32537;
    public static final int cH = 32540;
    public static final int cI = 32543;
    public static final int cJ = 32546;
    public static final int cK = 32549;
    public static final int cL = 32552;
    public static final int cM = 32555;
    public static final int cN = 32556;
    public static final int cO = 32557;
    public static final int cP = 32558;
    public static final int cQ = 32559;
    public static final int cR = 32560;
    public static final int cS = 32561;
    public static final int cT = 32562;
    public static final int cU = 32563;
    public static final int cV = 32564;
    public static final int cW = 32565;
    public static final int cX = 32588;
    public static final int cY = 32591;
    public static final int cZ = 32570;
    public static final int da = 32571;
    public static final int db = 32572;
    public static final int dc = 32573;
    public static final int dd = 32574;
    public static final int de = 32577;
    public static final int df = 32580;
    public static final int dg = 32583;
    public static final int dh = 32587;
    public static final int di = 19611;
    public static final int dj = 19614;
    public static final int dk = 32598;
    public static final int dl = 32599;
    public static class_495 dm;
    public static class_495 dn;
    public static class_495 doField;
    public static class_495 dp;
    public static class_495 dq;
    static class_333 dr;
    static class_333 ds;
    static class_333 dt;
    static class_333 du;
    static class_333 dv;
    static class_333 dw;
    static class_333 dx;
    static class_333 dy;
    public static boolean dz = false;
    public static int dA = 0;
    public static final class_468 dB = new class_468();
    public static final int bX = 32316;
    public static final class_310 dC = new class_469(bX, 20);
    public static final int cq = 32481;
    public static final class_310 dD = new class_469(cq, 30);

    public class_463(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    public static class_495 a(Widget widget) {
        class_495 class_495Var = new class_495(widget);
        class_495Var.a(class_351.a(bH, "raids/bg")).a(0, 2);
        class_495Var.a(class_342.a(bI, dr, "Select tab")).a(bH, 17, 23);
        class_495Var.a(class_352.a(bJ, "Party").o().l()).a(bH, 63, 25);
        class_495Var.a(class_342.a(bK, ds, "Select tab")).a(bH, aU.hs_, 23);
        class_495Var.a(class_352.a(bL, "Public / Join").o().l()).a(bH, 255, 25);
        class_495Var.a(class_342.a(dk, dt, "Select tab")).a(bH, 113, 23);
        class_495Var.a(class_352.a(dl, "Invocations").o().l()).a(bH, 159, 25);
        return class_495Var;
    }

    @Override // rs.class_360
    public void a() {
        h();
        dm = a(d(d));
        dn = a(d(g));
        class_465.a(dm);
        class_465.b(dn);
        dm.a();
        dn.a();
        doField = a(d(e));
        class_464.a(doField);
        doField.a();
        dp = a(d(f));
        class_467.a(dp);
        dp.a();
        dq = a(d(bG));
        dq.a(class_446.bI).a(bH, 10, 41);
        dq.a();
        m(2);
        class_313.d().a(dC, bY);
        class_313.d().a(dB, cl);
        class_313.d().a(dD, cv);
    }

    public static void m(int i) {
        int i2;
        class_333 class_333Var;
        dA = i;
        l(bJ).ac = i == 1 ? class_492.c : class_492.d;
        l(bL).ac = i == 2 ? class_492.c : class_492.d;
        Widget widgetL = l(dl);
        if (i == 4) {
            i2 = class_492.c;
        } else {
            i2 = dz ? class_492.d : class_492.f;
        }
        widgetL.ac = i2;
        Widget widgetL2 = l(bI);
        Widget widgetL3 = l(bI);
        class_333 class_333Var2 = i == 1 ? dr : ds;
        widgetL3.aE = class_333Var2;
        widgetL2.E = class_333Var2;
        Widget widgetL4 = l(bK);
        Widget widgetL5 = l(bK);
        class_333 class_333Var3 = i == 2 ? dr : ds;
        widgetL5.aE = class_333Var3;
        widgetL4.E = class_333Var3;
        Widget widgetL6 = l(dk);
        Widget widgetL7 = l(dk);
        if (i == 4) {
            class_333Var = dr;
        } else {
            class_333Var = dz ? ds : dt;
        }
        class_333 class_333Var4 = class_333Var;
        widgetL7.aE = class_333Var4;
        widgetL6.E = class_333Var4;
    }

    private void h() {
        dr = new class_333(false, "raids/tabactive");
        ds = new class_333(false, "raids/tabinactive");
        dt = new class_333(false, "raids/tabdisabled");
        du = new class_333(false, "raids/sprite 3");
        dv = new class_333(false, "raids/sprite 4");
        dw = new class_333(false, "raids/sprite 1");
        dx = new class_333(false, "raids/sprite 2");
        dy = new class_333(false, "raids/owner");
    }
}
