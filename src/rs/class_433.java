package rs;

import com.google.inject.internal.asm.$Opcodes;
import com.sun.jna.platform.win32.aQ;
import com.sun.jna.platform.win32.aU;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.WGLEXTColorspace;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_433.class */
public class class_433 extends class_360 {
    private static int[] g;
    private static int[] bG;
    private static class_333 bH;
    private static class_333 bI;
    private static class_333 bJ;
    private static class_333 bK;
    private static class_333 bL;
    private static class_333 bM;
    private static class_333 bN;
    public static int c = 0;
    public static boolean d = true;
    public static boolean e = true;
    public static final List<a> f = new ArrayList();
    private static int bO = -1;

    /* JADX INFO: loaded from: client-final.jar:rs/class_433$a.class */
    public enum a {
        a,
        b,
        c
    }

    /* JADX INFO: loaded from: client-final.jar:rs/class_433$b.class */
    public enum b {
        a(aU.kQ, 1, a.a),
        b(aU.kR, 3, a.a),
        c(aU.kS, 5, a.a),
        d(aU.kU, 9, a.a),
        e(aU.kV, 11, a.a),
        f(aU.kW, 13, a.a),
        g(aU.kY, 17, a.a),
        h(aU.kZ, 19, a.a),
        i(aU.lb, 23, a.a),
        j(aU.le, 29, a.a),
        k(aU.lh, 35, a.a),
        l(aU.lj, 39, a.a),
        m(aU.lk, 41, a.a),
        n(aU.lm, 47, a.a),
        o(aU.lo, 53, a.a),
        p(aU.ls, 59, a.a),
        q(1183, 62, a.a),
        r(1185, 65, a.a),
        s(1188, 70, a.a),
        t(1189, 75, a.a),
        u(aU.lt, 60, a.a),
        v(aU.lu, 60, a.a),
        w(1192, 60, a.a),
        x(1193, 80, a.a),
        y(1562, 80, a.a),
        z(1572, 20, a.a),
        A(1582, 50, a.a),
        B(1592, 79, a.a),
        C(WGLEXTColorspace.WGL_COLORSPACE_EXT, 85, a.a),
        D(19100, 82, a.a),
        E(19110, 86, a.a),
        F(19150, 91, a.a),
        G(19130, 96, a.a),
        H(1195, 100, a.b),
        I(aU.lc, 100, a.b),
        J(aU.lf, 100, a.b),
        K(aU.li, 100, a.b),
        L(1174, 100, a.b),
        M(GL11.GL_4D_COLOR_TEXTURE, 100, a.b),
        N(1541, 100, a.b),
        O(7455, 100, a.b);

        public int P;
        public int Q;
        public a R;

        b(int i2, int i3, a aVar) {
            this.P = i2;
            this.Q = i3;
            this.R = aVar;
        }

        public static b a(int i2) {
            for (b bVar : values()) {
                if (bVar.P == i2) {
                    return bVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/class_433$c.class */
    public enum c {
        a,
        b,
        c
    }

    public static void h() {
        d = !d;
        j();
        i();
        Configuration.d();
    }

    public static void i() {
        if (d) {
            Widget.H[1151].ba[0] = 5;
            Widget.H[1151].al[1] = 75;
            Widget.H[1151].al[2] = 82;
            return;
        }
        Widget.H[1151].ba[0] = 15;
        Widget.H[1151].al[1] = -5000;
        Widget.H[1151].al[2] = -5000;
        Widget.H[12424].al = Arrays.copyOf(g, g.length);
        Widget.H[12424].ba = Arrays.copyOf(bG, bG.length);
    }

    public static void j() {
        for (c cVar : c.values()) {
            a(cVar);
        }
    }

    public static void a(c cVar) {
        if (d && cVar == c.a) {
            Widget widget = H[12424];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < widget.ak.length; i++) {
                int i2 = 0;
                a aVar = a.c;
                b bVarA = b.a(widget.ak[i]);
                if (bVarA != null) {
                    aVar = bVarA.R;
                    i2 = bVarA.Q;
                }
                boolean z = true;
                if (e || i2 >= Launcher.n().o().eo[6] / 2) {
                    Iterator<a> it = f.iterator();
                    while (it.hasNext()) {
                        if (aVar == it.next()) {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    if (widget.ak[i] == 7455) {
                        arrayList2.add(Integer.valueOf(widget.ak[i]));
                    } else {
                        arrayList.add(Integer.valueOf(widget.ak[i]));
                    }
                }
            }
            int i3 = 3;
            int i4 = 0;
            int i5 = 5;
            int i6 = 35;
            int i7 = 35;
            if (arrayList.size() <= 32) {
                i3 = 5;
                i5 = 4;
                i6 = 45;
                i7 = arrayList.size() <= 24 ? 38 : 29;
            }
            if (arrayList.size() > 35) {
                i3 = 0;
                i5 = 7;
                i6 = 25;
                i7 = 25;
            }
            int i8 = i3;
            int i9 = 5;
            for (int i10 = 0; i10 < widget.ak.length; i10++) {
                if (arrayList.contains(Integer.valueOf(widget.ak[i10]))) {
                    widget.al[i10] = i8;
                    widget.ba[i10] = i9;
                    i8 += i6;
                    i4++;
                    if (i4 >= i5) {
                        i4 = 0;
                        i8 = i3;
                        i9 += i7;
                    }
                } else {
                    widget.al[i10] = -5000;
                }
            }
            for (int i11 = 0; i11 < widget.ak.length; i11++) {
                if (arrayList2.contains(Integer.valueOf(widget.ak[i11]))) {
                    widget.al[i11] = i8 - 1;
                    widget.ba[i11] = i9 - 1;
                    i8 += i6;
                    i4++;
                    if (i4 >= i5) {
                        i4 = 0;
                        i8 = i3;
                        i9 += i7;
                    }
                }
            }
        }
    }

    public class_433(class_338[] class_338VarArr) {
        super(class_338VarArr);
    }

    @Override // rs.class_360
    public void a() {
        f.add(a.a);
        f.add(a.b);
        l();
        m();
        n();
        o();
        j();
        bH = new class_333("icons/pktele");
        bI = new class_333("icons/skilltele");
        bJ = new class_333("icons/moneytele");
        bM = new class_333("magic/home 2");
        bN = new class_333("magic/bounty");
        bK = new class_333("icons/bosstele");
        bL = new class_333("icons/storetele");
        Widget widget = Widget.H[30064];
        Widget widget2 = Widget.H[30064];
        class_333 class_333Var = bJ;
        widget2.aE = class_333Var;
        widget.E = class_333Var;
        Widget widget3 = Widget.H[13035];
        Widget widget4 = Widget.H[13035];
        class_333 class_333Var2 = bJ;
        widget4.aE = class_333Var2;
        widget3.E = class_333Var2;
        Widget widget5 = Widget.H[1164];
        Widget widget6 = Widget.H[1164];
        class_333 class_333Var3 = bJ;
        widget6.aE = class_333Var3;
        widget5.E = class_333Var3;
        Widget widget7 = Widget.H[1300];
        Widget.H[13037].as = "@gre@Money Making Teleports";
        widget7.as = "@gre@Money Making Teleports";
        Widget widget8 = Widget.H[1301];
        Widget widget9 = Widget.H[13038];
        Widget.H[30065].as = "Opens a selection of teleports";
        widget9.as = "Opens a selection of teleports";
        widget8.as = "Opens a selection of teleports";
        Widget widget10 = Widget.H[30075];
        Widget widget11 = Widget.H[30075];
        class_333 class_333Var4 = bI;
        widget11.aE = class_333Var4;
        widget10.E = class_333Var4;
        Widget widget12 = Widget.H[13045];
        Widget widget13 = Widget.H[13045];
        class_333 class_333Var5 = bI;
        widget13.aE = class_333Var5;
        widget12.E = class_333Var5;
        Widget widget14 = Widget.H[1167];
        Widget widget15 = Widget.H[1167];
        class_333 class_333Var6 = bI;
        widget15.aE = class_333Var6;
        widget14.E = class_333Var6;
        Widget widget16 = Widget.H[1325];
        Widget.H[13047].as = "@gre@Training Teleports";
        widget16.as = "@gre@Training Teleports";
        Widget widget17 = Widget.H[1326];
        Widget widget18 = Widget.H[13048];
        Widget.H[30076].as = "Opens a selection of teleports";
        widget18.as = "Opens a selection of teleports";
        widget17.as = "Opens a selection of teleports";
        Widget widget19 = Widget.H[30083];
        Widget widget20 = Widget.H[30083];
        class_333 class_333Var7 = bK;
        widget20.aE = class_333Var7;
        widget19.E = class_333Var7;
        Widget widget21 = Widget.H[13053];
        Widget widget22 = Widget.H[13053];
        class_333 class_333Var8 = bK;
        widget22.aE = class_333Var8;
        widget21.E = class_333Var8;
        Widget widget23 = Widget.H[1170];
        Widget widget24 = Widget.H[1170];
        class_333 class_333Var9 = bK;
        widget24.aE = class_333Var9;
        widget23.E = class_333Var9;
        Widget widget25 = Widget.H[1350];
        Widget.H[13055].as = "@gre@Boss Teleports";
        widget25.as = "@gre@Boss Teleports";
        Widget widget26 = Widget.H[1351];
        Widget widget27 = Widget.H[13056];
        Widget.H[30084].as = "Opens a selection of teleports";
        widget27.as = "Opens a selection of teleports";
        widget26.as = "Opens a selection of teleports";
        Widget widget28 = Widget.H[13061];
        Widget widget29 = Widget.H[13061];
        class_333 class_333Var10 = bH;
        widget29.aE = class_333Var10;
        widget28.E = class_333Var10;
        Widget widget30 = Widget.H[30106];
        Widget widget31 = Widget.H[30106];
        class_333 class_333Var11 = bH;
        widget31.aE = class_333Var11;
        widget30.E = class_333Var11;
        Widget widget32 = Widget.H[1174];
        Widget widget33 = Widget.H[1174];
        class_333 class_333Var12 = bH;
        widget33.aE = class_333Var12;
        widget32.E = class_333Var12;
        Widget widget34 = Widget.H[1382];
        Widget.H[13063].as = "@gre@PK Teleports";
        widget34.as = "@gre@PK Teleports";
        Widget widget35 = Widget.H[1383];
        Widget widget36 = Widget.H[13064];
        Widget.H[30107].as = "Opens a selection of teleports";
        widget36.as = "Opens a selection of teleports";
        widget35.as = "Opens a selection of teleports";
        Widget widget37 = Widget.H[30114];
        Widget widget38 = Widget.H[30114];
        class_333 class_333Var13 = bL;
        widget38.aE = class_333Var13;
        widget37.E = class_333Var13;
        Widget widget39 = Widget.H[13069];
        Widget widget40 = Widget.H[13069];
        class_333 class_333Var14 = bL;
        widget40.aE = class_333Var14;
        widget39.E = class_333Var14;
        Widget widget41 = Widget.H[1540];
        Widget widget42 = Widget.H[1540];
        class_333 class_333Var15 = bL;
        widget42.aE = class_333Var15;
        widget41.E = class_333Var15;
        Widget widget43 = Widget.H[1415];
        Widget.H[13071].as = "@gre@Minigame Teleports";
        widget43.as = "@gre@Minigame Teleports";
        Widget widget44 = Widget.H[1416];
        Widget widget45 = Widget.H[13072];
        Widget.H[30115].as = "Opens a selection of teleports";
        widget45.as = "Opens a selection of teleports";
        widget44.as = "Opens a selection of teleports";
        Widget widget46 = Widget.H[13079];
        Widget widget47 = Widget.H[13079];
        class_333 class_333Var16 = bM;
        widget47.aE = class_333Var16;
        widget46.E = class_333Var16;
        Widget widget48 = Widget.H[30138];
        Widget widget49 = Widget.H[30138];
        class_333 class_333Var17 = bM;
        widget49.aE = class_333Var17;
        widget48.E = class_333Var17;
        Widget widget50 = Widget.H[1541];
        Widget widget51 = Widget.H[1541];
        class_333 class_333Var18 = bM;
        widget51.aE = class_333Var18;
        widget50.E = class_333Var18;
        Widget widget52 = Widget.H[1454];
        Widget.H[13081].as = "@gre@Teleport to House";
        widget52.as = "@gre@Teleport to House";
        Widget widget53 = Widget.H[1455];
        Widget widget54 = Widget.H[13082];
        Widget.H[30139].as = "Teleport to your PoH";
        widget54.as = "Teleport to your PoH";
        widget53.as = "Teleport to your PoH";
        Widget widget55 = Widget.H[13095];
        Widget widget56 = Widget.H[13095];
        class_333 class_333Var19 = bN;
        widget56.aE = class_333Var19;
        widget55.E = class_333Var19;
        Widget widget57 = Widget.H[30162];
        Widget widget58 = Widget.H[30162];
        class_333 class_333Var20 = bN;
        widget58.aE = class_333Var20;
        widget57.E = class_333Var20;
        Widget widget59 = Widget.H[7455];
        Widget widget60 = Widget.H[7455];
        class_333 class_333Var21 = bN;
        widget60.aE = class_333Var21;
        widget59.E = class_333Var21;
        Widget widget61 = Widget.H[7457];
        Widget.H[13097].as = "@gre@Teleport to Bounty Target";
        widget61.as = "@gre@Teleport to Bounty Target";
        Widget widget62 = Widget.H[7458];
        Widget widget63 = Widget.H[13098];
        Widget.H[30163].as = "Surprise your opponent!";
        widget63.as = "Surprise your opponent!";
        widget62.as = "Surprise your opponent!";
    }

    public static void m(int i) {
        if (i == 41900) {
            if (Client.eT[6] != 41902) {
                bO = Client.eT[6];
            }
            k();
            Client.eT[6] = 41902;
        }
        if (i == 41903 && bO != -1) {
            j();
            Client.eT[6] = bO;
        }
        if (i == 41910 || i == 41911 || i == 41912) {
            a aVar = a.a;
            if (i == 41911) {
                aVar = a.b;
            }
            if (i == 41912) {
                aVar = a.c;
            }
            if (f.contains(aVar)) {
                f.remove(aVar);
            } else {
                f.add(aVar);
            }
            k();
            Configuration.d();
        }
        if (i == 41913) {
            e = !e;
            k();
            Configuration.d();
        }
    }

    public static void k() {
        Widget.H[41906].E = f.contains(a.a) ? class_384.f : class_384.g;
        Widget.H[41907].E = f.contains(a.b) ? class_384.f : class_384.g;
        Widget.H[41908].E = f.contains(a.c) ? class_384.f : class_384.g;
        Widget.H[41909].E = e ? class_384.f : class_384.g;
    }

    public void l() {
        Widget widgetD = d(41902);
        widgetD.k(12);
        a(41903, "magic/filter 2", "Magic spellbook filter");
        a(41904, "Filters", this.a, 0, class_492.e);
        addSprite(41905, "magic/filter 3");
        c(41906, 1, "gambling/SPRITE");
        c(41907, 1, "gambling/SPRITE");
        c(41908, 1, "gambling/SPRITE");
        c(41909, 1, "gambling/SPRITE");
        a(41910, "<tab=20><col=0xFF981F>Show @whi@Combat</col><col=0xFF981F> spells", "Select filter", this.a, 0, class_492.e, false, true, 150);
        a(41911, "<tab=20><col=0xFF981F>Show @whi@Teleport</col><col=0xFF981F> spells", "Select filter", this.a, 0, class_492.e, false, true, 150);
        a(41912, "<tab=20><col=0xFF981F>Show @whi@Utility</col><col=0xFF981F> spells", "Select filter", this.a, 0, class_492.e, false, true, 150);
        a(41913, "<tab=20><col=0xFF981F>Show spells that require less\\n<tab=20><col=0xFF981F>than half your magic level", "Select filter", this.a, 0, class_492.e, false, true, 150);
        a(41914, "Spell Filters", this.a, 2, class_492.e);
        widgetD.b(0, 41903, 75, 240);
        widgetD.b(1, 41904, 82, User32.VK_OEM_AUTO);
        widgetD.b(2, 41905, 7, 25);
        widgetD.b(3, 41914, 56, 30);
        widgetD.b(4, 41906, 15, 57);
        widgetD.b(5, 41907, 15, 82);
        widgetD.b(6, 41908, 15, 107);
        widgetD.b(7, 41909, 15, 132);
        widgetD.b(8, 41910, 15, 59);
        widgetD.b(9, 41911, 15, 84);
        widgetD.b(10, 41912, 15, 109);
        widgetD.b(11, 41913, 15, 131);
    }

    public void m() {
        Widget widgetJ = j(aU.kP);
        Widget widgetJ2 = j(1196);
        Widget widget = H[12424];
        widget.aF = 0;
        widget.aP = 260;
        widget.P = 190;
        int[] iArr = {1196, 1199, aU.lB, aU.lK, aU.lT, aU.ma, aU.mj, aU.ms, aU.mB, 1267, aU.mL, 1283, 1573, aU.nb, aU.nj, aU.ns, aU.nz, aU.nI, aU.nR, aU.nX, aU.og, aU.op, aU.oy, aU.oF, aU.oM, aU.oT, aU.pc, aU.pj, 1583, 12038, aU.pt, aU.pA, aU.pJ, aU.pQ, aU.pZ, aU.qg, aU.qn, aU.qw, 15878, aU.qF, aU.qQ, aU.rb, 7456, 1478, 1485, 1494, aU.qA, 1512, 1521, 1530, 1544, 1553, 1563, 1593, aU.rm, WGLEXTColorspace.WGL_COLORSPACE_LINEAR_EXT, 12436, 12446, 12456, aU.zR, 18471, 19101, 19111, 19151, 19131};
        int length = widget.ak.length;
        int[] iArrCopyOf = Arrays.copyOf(widget.ak, length);
        int[] iArrCopyOf2 = Arrays.copyOf(widget.al, length);
        int[] iArrCopyOf3 = Arrays.copyOf(widget.ba, length);
        widget.k(iArr.length);
        int i = 0 + 1;
        widget.b(0, 1195, 0, 0);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i;
            i++;
            widget.b(i3, iArrCopyOf[i2], iArrCopyOf2[i2], iArrCopyOf3[i2]);
        }
        int i4 = i;
        int i5 = i + 1;
        widget.b(i4, 19100, 122, 196);
        int i6 = i5 + 1;
        widget.b(i5, 19110, 145, 196);
        int i7 = i6 + 1;
        widget.b(i6, 19150, 1, 220);
        int i8 = i7 + 1;
        widget.b(i7, 19130, 26, 220);
        widgetJ.k(68);
        widgetJ.b(0, 12424, 13, (24 - 5) - 14);
        b(1195, 1, "magic/home", "Cast @gre@Home Teleport");
        a(19100, 20987, aU.iO_, 0, 6, 30005, 81, "Air surge", "A single attack surge spell", this.a, 9, 10, 2);
        Widget.H[19100].X[1] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        Widget.H[19106].X[0] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        a(19110, 20987, aU.iN_, aU.iO_, 0, 9, 6, 30004, 30005, 85, "Water surge", "A single attack surge spell", this.a, 10, 10, 2);
        Widget.H[19110].X[1] = new int[]{4, 3214, aU.iN_, 4, 3214, 4694, 4, 3214, 4695, 4, 3214, 4698, 10, 1688, aU.oO, 10, 1688, aU.pa, 10, 1688, 1403, 10, 1688, 6562, 10, 1688, 6563, 0};
        Widget.H[19116].X[0] = new int[]{4, 3214, aU.iN_, 4, 3214, 4694, 4, 3214, 4695, 4, 3214, 4698, 10, 1688, aU.oO, 10, 1688, aU.pa, 10, 1688, 1403, 10, 1688, 6562, 10, 1688, 6563, 0};
        Widget.H[19110].X[2] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        Widget.H[19117].X[0] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        a(19150, 20987, aU.iP_, aU.iO_, 0, 9, 6, 30006, 30005, 90, "Earth surge", "A single attack surge spell", this.a, 11, 10, 2);
        Widget.H[19150].X[1] = new int[]{4, 3214, aU.iP_, 4, 3214, 4696, 4, 3214, 4699, 4, 3214, 4698, 10, 1688, aU.oQ, 10, 1688, aU.pe, 10, 1688, aU.pm, 10, 1688, 3053, 10, 1688, 3054, 10, 1688, 6562, 10, 1688, 6563, 0};
        Widget.H[19156].X[0] = new int[]{4, 3214, aU.iP_, 4, 3214, 4696, 4, 3214, 4699, 4, 3214, 4698, 10, 1688, aU.oQ, 10, 1688, aU.pe, 10, 1688, aU.pm, 10, 1688, 3053, 10, 1688, 3054, 10, 1688, 6562, 10, 1688, 6563, 0};
        Widget.H[19150].X[2] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        Widget.H[19157].X[0] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        a(19130, 20987, aU.iM_, aU.iO_, 0, 9, 6, 30003, 30005, 95, "Fire surge", "A single attack surge spell", this.a, 12, 10, 2);
        Widget.H[19130].X[1] = new int[]{4, 3214, aU.iM_, 10, 1688, aU.oS, 0};
        Widget.H[19136].X[0] = new int[]{4, 3214, aU.iM_, 10, 1688, aU.oS, 0};
        Widget.H[19130].X[2] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        Widget.H[19137].X[0] = new int[]{4, 3214, aU.iO_, 10, 1688, aU.oM, 0};
        int i9 = 0;
        while (i9 < iArr.length) {
            widgetJ.b(i9 + 1 + 2, iArr[i9], 5, i9 > 35 ? 8 : 183);
            H[1195].aa = 1196;
            i9++;
        }
        a(41900, "magic/filter 1", "Magic spellbook filter");
        a(41901, "Filters", this.a, 0, class_492.e);
        widgetJ.b(1, 41900, 75, 240);
        widgetJ.b(2, 41901, 82, User32.VK_OEM_AUTO);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 < 61 && i10 != 0) {
                widget.al[i10] = widget.al[i10] + 24;
            }
            if (i10 == 7 || i10 == 13 || i10 == 20 || i10 == 36 || i10 == 42 || i10 == 45 || i10 == 50 || i10 == 52) {
                widget.al[i10] = 0;
            }
        }
        widget.ba[7] = 24;
        widget.ba[13] = 48;
        widget.ba[20] = 72;
        widget.ba[50] = 96;
        widget.ba[45] = 120;
        widget.ba[52] = 144;
        widget.ba[36] = 170;
        widget.ba[42] = 192;
        widgetJ2.aO = true;
        a(1197, "Level 0: Home Teleport", this.a, 1, 16685087, true, true);
        Widget widget2 = H[1197];
        widget2.P = 174;
        widget2.aP = 68;
        a(1198, "A teleport which requires no", this.a, 0, 11495962, true, true);
        a(18998, "runes and no required level that", this.a, 0, 11495962, true, true);
        a(18999, "teleports you to the main land.", this.a, 0, 11495962, true, true);
        widgetJ2.k(4);
        widgetJ2.b(0, 1197, 3, 4);
        widgetJ2.b(1, 1198, 91, 23);
        widgetJ2.b(2, 18998, 91, 34);
        widgetJ2.b(3, 18999, 91, 45);
        g = Arrays.copyOf(widget.al, widget.al.length);
        bG = Arrays.copyOf(widget.ba, widget.ba.length);
    }

    public void n() {
        Widget widgetD = d(12855);
        b(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
        H[12856].aa = 1196;
        c(45149, 9075, User32.WM_EXITSIZEMOVE, aU.iP_, 0, 1, 0, 30011, 30006, 60, "Miasmic rush", "A single attack miasmic spell", this.a, 8, 10, 2);
        c(45751, 9075, User32.WM_EXITSIZEMOVE, aU.iP_, 1, 3, 1, 30011, 30006, 72, "Miasmic burst", "A multi-target miasmic spell", this.a, 7, 10, 2);
        c(45743, 9075, aU.iW_, aU.iP_, 2, 1, 2, 30014, 30006, 84, "Miasmic blitz", "A single target miasmic spell", this.a, 6, 10, 2);
        c(45694, 9075, aU.iW_, aU.iP_, 3, 3, 3, 30014, 30006, 96, "Miasmic barrage", "A multi-target miasmic spell", this.a, 5, 10, 2);
        int[] iArr = {12856, 12939, 12987, 13035, 12901, 12861, 13045, 12963, aU.PG, 13053, 12919, 12881, 13061, 12951, 12999, 13069, 12911, 12871, 13079, 13095, 12975, aU.PS, 13087, 12929, 12891, 45149, 45751, 45743, 45694, 1196, 12940, 12988, 13036, 12902, 12862, 13046, 12964, aU.PH, 13054, 12920, 12882, 13062, 12952, aU.Pv, 13070, 12912, 12872, 13080, 12976, aU.PT, 13088, 12930, 12892, 13096, 45150, 45752, 45744, 45695};
        widgetD.k(iArr.length);
        int i = 0;
        int i2 = 18;
        int i3 = 8;
        while (i < iArr.length) {
            if (i2 > 175) {
                i2 = 18;
                i3 += 28;
            }
            int i4 = i2;
            int i5 = i3;
            if (i <= 28) {
                i4 += 4;
                i5 += 2;
            }
            if (i < 30) {
                if (iArr[i] == 45149) {
                    i4 -= 3;
                    i5 += 3;
                }
                if (iArr[i] == 45751) {
                    i5--;
                    i4--;
                }
                if (iArr[i] == 45743) {
                    i4 -= 2;
                }
                if (iArr[i] == 45694) {
                    i4--;
                    i5++;
                }
            }
            if (i < 30) {
                widgetD.b(i, iArr[i], i4, i5);
            }
            if (i > 30 - 1) {
                i3 = i < 41 ? 181 : 1;
                widgetD.b(i, iArr[i], 4, i3);
            }
            i++;
            i2 += 45;
        }
    }

    public void o() {
        p();
        d();
        b(30003, 1, "Fire");
        b(30004, 2, "Water");
        b(30005, 3, "Air");
        b(30006, 4, "Earth");
        b(30007, 5, "Mind");
        b(30008, 6, "Body");
        b(30009, 7, "Death");
        b(30010, 8, "Nature");
        b(30011, 9, "Chaos");
        b(30012, 10, "Law");
        b(30013, 11, "Cosmic");
        b(30014, 12, "Blood");
        b(30015, 13, "Soul");
        b(30016, 14, "Astral");
        b(aQ.cJ_, 15, "Wrath");
        b(30017, 9075, aU.iM_, aU.iN_, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", this.a, 0, 16, 2);
        b(30025, 9075, aU.iP_, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", this.a, 1, 4, 2);
        d(30032, 9075, 564, aU.iQ_, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", this.a, 2, 2, 2);
        b(30040, 9075, 564, aU.iO_, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", this.a, 3, 0, 2);
        b(30048, 9075, 563, aU.iP_, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", this.a, 4, 8, 2);
        b(30056, 9075, aU.iN_, aU.iM_, 0, 2, 0, 30004, 30003, 67, "Humidify", "fills certain vessels with water", this.a, 5, 0, 5);
        b(30064, 9075, 563, aU.iP_, 1, 0, 1, 30012, 30006, 68, "@gre@Money Making", "Teleport to money areas", this.a, 6, 0, 5);
        d(30075, 9075, 563, aU.iP_, 1, 0, 3, 30012, 30006, 69, "@gre@Training & Slayer", "Teleport to various monsters", this.a, 7, 0, 5);
        b(30083, 9075, 563, aU.iP_, 1, 0, 5, 30012, 30006, 70, "@gre@Boss Teleports", "Teleport to powerful foes", this.a, 8, 0, 5);
        b(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", this.a, 9, 0, 5);
        b(30099, 9075, aU.iP_, 1, 1, 30006, 70, "Skilling Kit", "Get skilling tools!", this.a, 10, 0, 5);
        b(30106, 9075, 563, aU.iN_, 1, 0, 0, 30012, 30004, 71, "@gre@PK Teleports", "Teleport Pking spots", this.a, 11, 0, 5);
        d(30114, 9075, 563, aU.iN_, 1, 0, 4, 30012, 30004, 72, "@gre@Minigame Teleport", "Teleport to shop areas", this.a, 12, 0, 5);
        b(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", this.a, 13, 0, 5);
        d(30130, 9075, 564, aU.iR_, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", this.a, 14, 8, 2);
        d(30138, 9075, 563, aU.iM_, 1, 1, 2, 30012, 30003, 74, "@gre@Teleport to House", "Teleports you to your PoH", this.a, 15, 0, 5);
        d(30146, 9075, 563, aU.iM_, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", this.a, 16, 0, 5);
        b(30154, 9075, aU.iM_, aU.iO_, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", this.a, 17, 16, 2);
        b(30162, 9075, 563, aU.iN_, 1, 1, 3, 30012, 30004, 77, "@gre@Teleport to Target", "Teleports you to Bounty Target", this.a, 18, 0, 5);
        b(30170, 9075, 563, aU.iN_, 1, 1, 7, 30012, 30004, 78, "Tele Group Khazard", "Teleports players to Port khazard", this.a, 19, 0, 5);
        d(30178, 9075, 564, aU.iR_, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints 3\\n times faster", this.a, 20, 0, 5);
        b(30186, 9075, aU.iP_, aU.iN_, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", this.a, 21, 0, 5);
        e(30194, 9075, aU.iP_, aU.iN_, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", this.a, 22, 0, 5);
        b(30202, 9075, aU.iM_, aU.iN_, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", this.a, 23, 0, 5);
        d(30210, 9075, 561, aU.iP_, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", this.a, 24, 4, 2);
        d(30218, 9075, aU.iP_, aU.iN_, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", this.a, 25, 0, 5);
        b(30226, 9075, 563, aU.iN_, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport", "Teleports you to the fishing guild", this.a, 26, 0, 5);
        e(30234, 9075, 563, aU.iN_, 1, 2, 13, 30012, 30004, 85, "Tele Group Fishing\\nGuild", "Teleports players to the Fishing\\nGuild", this.a, 27, 0, 5);
        b(30242, 9075, aU.iP_, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", this.a, 28, 16, 5);
        b(30250, 9075, 563, aU.iN_, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", this.a, 29, 0, 5);
        b(30258, 9075, 563, aU.iN_, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", this.a, 30, 0, 5);
        b(30266, 9075, 563, aU.iN_, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", this.a, 31, 0, 5);
        d(30274, 9075, 563, aU.iN_, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau", "Teleports players to Ice Plateau", this.a, 32, 0, 5);
        d(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer", "Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy", this.a, 33, 8, 2);
        d(30290, 9075, 563, aU.iW_, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", this.a, 34, 8, 2);
        d(30298, 9075, 560, aU.iP_, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", this.a, 35, 8, 2);
        b(30306, 9075, 560, aU.iP_, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", this.a, 36, 0, 5);
        d(30314, 9075, aU.iW_, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints to a group", this.a, 37, 0, 5);
        d(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", this.a, 38, 0, 5);
    }

    public void p() {
        Widget widgetD = d(29999);
        widgetD.k(80);
        b(30000, 11, 10, 0, widgetD);
        b(30017, 40, 9, 1, widgetD);
        b(30025, 71, 12, 2, widgetD);
        b(30032, 103, 10, 3, widgetD);
        b(30040, 135, 12, 4, widgetD);
        b(30048, 165, 10, 5, widgetD);
        b(30056, 8, 38, 6, widgetD);
        b(30064, 39, 39, 7, widgetD);
        b(30075, 71, 39, 8, widgetD);
        b(30083, 103, 39, 9, widgetD);
        b(30091, 135, 39, 10, widgetD);
        b(30099, 165, 37, 11, widgetD);
        b(30106, 12, 68, 12, widgetD);
        b(30114, 42, 68, 13, widgetD);
        b(30122, 71, 68, 14, widgetD);
        b(30130, 103, 68, 15, widgetD);
        b(30138, 135, 68, 16, widgetD);
        b(30146, 165, 68, 17, widgetD);
        b(30154, 14, 97, 18, widgetD);
        b(30162, 42, 97, 19, widgetD);
        b(30170, 71, 97, 20, widgetD);
        b(30178, 101, 97, 21, widgetD);
        b(30186, 135, 98, 22, widgetD);
        b(30194, 168, 98, 23, widgetD);
        b(30202, 11, 125, 24, widgetD);
        b(30210, 42, 124, 25, widgetD);
        b(30218, 74, 125, 26, widgetD);
        b(30226, 103, 125, 27, widgetD);
        b(30234, 135, 125, 28, widgetD);
        b(30242, 164, 126, 29, widgetD);
        b(30250, 10, 155, 30, widgetD);
        b(30258, 42, 155, 31, widgetD);
        b(30266, 71, 155, 32, widgetD);
        b(30274, 103, 155, 33, widgetD);
        b(30282, 136, 155, 34, widgetD);
        b(30290, 165, 155, 35, widgetD);
        b(30298, 13, 185, 36, widgetD);
        b(30306, 42, 185, 37, widgetD);
        b(30314, 71, $Opcodes.INVOKESTATIC, 38, widgetD);
        b(30322, 104, $Opcodes.INVOKESTATIC, 39, widgetD);
        b(30001, 6, $Opcodes.INVOKESTATIC, 40, widgetD);
        b(30018, 5, 176, 41, widgetD);
        b(30026, 5, 176, 42, widgetD);
        b(30033, 5, 163, 43, widgetD);
        b(30041, 5, 176, 44, widgetD);
        b(30049, 5, 176, 45, widgetD);
        b(30057, 5, 176, 46, widgetD);
        b(30065, 5, 176, 47, widgetD);
        b(30076, 5, 163, 48, widgetD);
        b(30084, 5, 176, 49, widgetD);
        b(30092, 5, 176, 50, widgetD);
        b(30100, 5, 176, 51, widgetD);
        b(30107, 5, 176, 52, widgetD);
        b(30115, 5, 163, 53, widgetD);
        b(30123, 5, 176, 54, widgetD);
        b(30131, 5, 163, 55, widgetD);
        b(30139, 5, 163, 56, widgetD);
        b(30147, 5, 163, 57, widgetD);
        b(30155, 5, 176, 58, widgetD);
        b(30163, 5, 176, 59, widgetD);
        b(30171, 5, 176, 60, widgetD);
        b(30179, 5, 163, 61, widgetD);
        b(30187, 5, 176, 62, widgetD);
        b(30195, 5, 149, 63, widgetD);
        b(30203, 5, 176, 64, widgetD);
        b(30211, 5, 163, 65, widgetD);
        b(30219, 5, 163, 66, widgetD);
        b(30227, 5, 176, 67, widgetD);
        b(30235, 5, 149, 68, widgetD);
        b(30243, 5, 176, 69, widgetD);
        b(30251, 5, 5, 70, widgetD);
        b(30259, 5, 5, 71, widgetD);
        b(30267, 5, 5, 72, widgetD);
        b(30275, 5, 5, 73, widgetD);
        b(30283, 5, 5, 74, widgetD);
        b(30291, 5, 5, 75, widgetD);
        b(30299, 5, 5, 76, widgetD);
        b(30307, 5, 5, 77, widgetD);
        b(30323, 5, 5, 78, widgetD);
        b(30315, 5, 5, 79, widgetD);
    }
}
