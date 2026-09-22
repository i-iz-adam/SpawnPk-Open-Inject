package rs;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.a.F;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_205.class */
public class class_205 {
    public static class_205 b;
    public Client f;
    public Graphics2D l;
    private boolean v;
    public static int a = 10275839;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = true;
    public static int m = 81;
    private static final int[] w = {163, 206, 221, 63, 56, 71};
    public int g = 0;
    public int h = 0;
    public int i = 0;
    private int n = 0;
    private int o = 0;
    private int p = 6208;
    private int q = 6208;
    private int r = 0;
    private boolean s = false;
    public boolean j = true;
    public int k = 0;
    private List<class_196> t = new ArrayList();
    private List<class_201> u = new ArrayList();
    private int x = 0;
    private long y = 0;
    private boolean z = false;

    public class_205(Client client) {
        this.f = client;
    }

    public void a() {
        Client client = this.f;
        Client.al = 600;
        this.f.gq = 0;
        this.f.eU = 0;
        this.f.ft = 0;
        this.f.dp = 0;
        this.p = 6208;
        this.q = 6208;
        this.r = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        a("bg gray");
    }

    public void b() {
        if (this.z && System.currentTimeMillis() - this.y >= 2500) {
            if (this.x >= w.length) {
                this.z = false;
                return;
            }
            m = w[this.x];
            f();
            c("@whi@Sample texture ID: @gre@" + m);
            this.x++;
            this.y = System.currentTimeMillis();
        }
    }

    public void c() {
        this.z = true;
        this.x = 0;
    }

    public void d() {
        d = true;
        int width = this.f.z().getWidth();
        int height = this.f.z().getHeight();
        if (this.n != width || this.o != height || this.f.gZ == null) {
            if (!this.s) {
                a();
                this.f.G();
                this.f.d();
                this.f.a(Configuration.ai);
                class_387.m(32001);
                class_433.j();
                class_433.i();
                this.f.fc = false;
                this.s = true;
            }
            a(width, height);
        }
        this.f.gZ.a();
        if (this.f.ck != 0) {
            this.f.ha = null;
            this.f.ck = 0;
        }
        if (this.f.fX == 3) {
            Client client = this.f;
            Client.fM = true;
        }
        if (this.f.eA == 3) {
            Client client2 = this.f;
            Client.fM = true;
        }
        if (this.f.cD != null) {
            Client client3 = this.f;
            Client.fM = true;
        }
        Client client4 = this.f;
        if (Client.fM) {
            Client client5 = this.f;
            Client.fM = false;
        }
        Client client6 = this.f;
        Client.gf++;
        this.f.dE++;
        this.f.g(this.p, this.q);
        Client client7 = this.f;
        Client.dZ = 0;
        if (!this.f.fe) {
            int i = this.f.fs;
            if (this.f.dQ / 256 > i) {
                i = this.f.dQ / 256;
            }
            if (this.f.dh[4] && this.f.fy[4] + 128 > i) {
                i = this.f.fy[4] + 128;
            }
            int i2 = (this.f.ft + this.f.dp) & Client.dn;
            Client client8 = this.f;
            Client client9 = this.f;
            int i3 = this.f.eb + this.g;
            Client client10 = this.f;
            Client client11 = this.f;
            client8.b(Client.al + (i * 3), i, i3, (client10.c(Client.dw, this.q, this.p) - 50) + this.i, i2, this.f.ec + this.h);
        }
        Client client12 = this.f;
        int i4 = Client.cJ;
        Client client13 = this.f;
        int i5 = Client.cK;
        Client client14 = this.f;
        int i6 = Client.cL;
        int i7 = this.f.cR;
        int i8 = this.f.cS;
        for (int i9 = 0; i9 < 5; i9++) {
            if (this.f.dh[i9]) {
                int iRandom = (int) (((Math.random() * ((double) ((this.f.dg[i9] * 2) + 1))) - ((double) this.f.dg[i9])) + (Math.sin(((double) this.f.eg[i9]) * (((double) this.f.dy[i9]) / 100.0d)) * ((double) this.f.fy[i9])));
                if (i9 == 0) {
                    Client client15 = this.f;
                    Client.cJ += iRandom;
                }
                if (i9 == 1) {
                    Client client16 = this.f;
                    Client.cK += iRandom;
                }
                if (i9 == 2) {
                    Client client17 = this.f;
                    Client.cL += iRandom;
                }
                if (i9 == 3) {
                    this.f.cS = (this.f.cS + iRandom) & Client.dn;
                }
                if (i9 == 4) {
                    this.f.cR += iRandom;
                    if (this.f.cR < 128) {
                        this.f.cR = 128;
                    }
                    if (this.f.cR > 383) {
                        this.f.cR = Client.gF;
                    }
                }
            }
        }
        int i10 = class_332.A;
        ColorUtility.bt = true;
        ColorUtility.bw = 0;
        Client client18 = this.f;
        ColorUtility.bu = Client.hP - (Configuration.ai == class_151.a ? 4 : 0);
        Client client19 = this.f;
        ColorUtility.bv = Client.hQ - (Configuration.ai == class_151.a ? 4 : 0);
        class_210.d();
        class_210.a(0, 0, width, height, a, 255);
        class_46 class_46Var = this.f.dF;
        Client client20 = this.f;
        int i11 = Client.cJ;
        Client client21 = this.f;
        int i12 = Client.cL;
        int i13 = this.f.cS;
        Client client22 = this.f;
        class_46Var.a(i11, i12, i13, Client.cK, 0, this.f.cR);
        this.l = class_210.a(class_210.g, class_210.h, class_210.i);
        int i14 = 0;
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < this.t.size(); i15++) {
            this.t.get(i15).e(i15);
            if (this.t.get(i15).h()) {
                i14++;
            }
        }
        ArrayList<class_196> arrayList2 = new ArrayList(this.t);
        arrayList2.sort(new class_206(this));
        for (class_196 class_196Var : arrayList2) {
            class_196Var.a();
            if (!class_196Var.l()) {
                arrayList.add(class_196Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.t.remove((class_196) it.next());
        }
        this.f.dF.d();
        Iterator<class_201> it2 = this.u.iterator();
        int i16 = height - 7;
        while (it2.hasNext()) {
            class_201 next = it2.next();
            if (next.a()) {
                next.a(5, i16);
                i16 -= 17;
            } else {
                it2.remove();
            }
        }
        if (Configuration.az && !Configuration.ah) {
            int i17 = 0;
            while (true) {
                int i18 = i17;
                Client client23 = this.f;
                if (i18 >= Client.by.length) {
                    break;
                }
                Client client24 = this.f;
                if (Client.by[i17].b().size() > 0) {
                    Client client25 = this.f;
                    Client.by[i17].a();
                }
                i17++;
            }
        }
        if (e) {
            Client client26 = this.f;
            class_324 class_324Var = Client.gl;
            Client client27 = this.f;
            int i19 = Client.cJ;
            Client client28 = this.f;
            class_324Var.a("@whi@Camera pos: @yel@" + i19 + ", " + Client.cL, width - 5, 20, 0, 0);
            Client client29 = this.f;
            int i20 = 20 + 15;
            Client.gl.a("@whi@Camera curve: @yel@" + this.f.cS + ", " + this.f.cR, width - 5, i20, 0, 0);
            Client client30 = this.f;
            class_324 class_324Var2 = Client.gl;
            Client client31 = this.f;
            int i21 = i20 + 15;
            class_324Var2.a("@whi@Camera zoom: @yel@" + Client.al, width - 5, i21, 0, 0);
            Client client32 = this.f;
            int i22 = i21 + 15;
            Client.gl.a("@whi@Total entities: @yel@" + this.t.size(), width - 5, i22, 0, 0);
            Client client33 = this.f;
            Client.gl.a("@whi@Selected entities: @yel@" + i14, width - 5, i22 + 15, 0, 0);
        }
        this.f.f(i10);
        b();
        Iterator<class_253> it3 = class_253.k.iterator();
        while (it3.hasNext()) {
            it3.next().a(this.f, class_254.b);
        }
        Iterator<class_253> it4 = class_253.l.iterator();
        while (it4.hasNext()) {
            it4.next().a(this.f, class_254.b);
        }
        Client client34 = this.f;
        if (Client.w.b) {
            Client client35 = this.f;
            Client.w.b();
        }
        if (class_253.j.a(this.f)) {
            class_253.j.a(this.f, class_254.b);
        }
        this.f.gZ.a(0, this.f.hG, 0);
        Client client36 = this.f;
        Client.cJ = i4;
        Client client37 = this.f;
        Client.cK = i5;
        Client client38 = this.f;
        Client.cL = i6;
        this.f.cR = i7;
        this.f.cS = i8;
        this.f.dE = 0;
        this.j = false;
        Client.ab.c.clear();
        if (this.v) {
            this.f.a(1, "Loading - please wait.", (String) null);
            this.f.gZ.a();
            this.f.gZ.a(0, this.f.hG, 0);
            class_102.M.a();
            class_102.N.a();
            Client.K();
            ItemComposition.b = new class_622();
            ItemComposition.b.d();
            ItemComposition.k.a();
            ItemComposition.l.a();
            this.f.b();
            this.v = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0340 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0198  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0209  */
    /* JADX WARN: Code duplicated, block: B:69:0x0210  */
    /* JADX WARN: Code duplicated, block: B:71:0x021b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:74:0x022d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234  */
    /* JADX WARN: Code duplicated, block: B:77:0x023f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0246  */
    /* JADX WARN: Code duplicated, block: B:80:0x0251  */
    /* JADX WARN: Code duplicated, block: B:81:0x0258  */
    /* JADX WARN: Code duplicated, block: B:83:0x0263  */
    /* JADX WARN: Code duplicated, block: B:84:0x026a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0275  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0304  */
    /* JADX WARN: Code duplicated, block: B:94:0x0314  */
    /* JADX WARN: Code duplicated, block: B:95:0x0324  */
    public void a(String str, String[] strArr) {
        String strSubstring;
        if (str.equalsIgnoreCase("script")) {
            c();
        }
        for (int i = 0; i < this.t.size(); i++) {
            if (str.startsWith("e" + (i + 1) + ".") || str.startsWith("player.") || str.startsWith("p.") || str.startsWith("npc.")) {
                class_196 class_196Var = this.t.get(i);
                String strSubstring2 = str.replace("e" + (i + 1), "").substring(1);
                if (str.startsWith("player.") || str.startsWith("p.")) {
                    if (class_196Var instanceof class_199) {
                        strSubstring2 = str.startsWith("player.") ? str.replace("player", "").substring(1) : str.substring(2);
                        if (str.startsWith("npc.") && !str.startsWith("n.")) {
                            if (class_196Var instanceof class_199) {
                                class_204.a(strSubstring2, strArr, (class_199) class_196Var);
                            }
                            if (class_196Var instanceof class_198) {
                                class_200.a(strSubstring2, strArr, (class_198) class_196Var);
                            }
                            switch (strSubstring2.toLowerCase()) {
                                case "x":
                                    class_196Var.a(class_196Var.d() + Integer.parseInt(strArr[0]));
                                    break;
                                case "y":
                                    class_196Var.b(class_196Var.e() + Integer.parseInt(strArr[0]));
                                    break;
                                case "left":
                                case "l":
                                    class_196Var.a(class_196Var.d() - 100);
                                    break;
                                case "right":
                                case "r":
                                    class_196Var.a(class_196Var.d() + 100);
                                    break;
                                case "up":
                                case "u":
                                    class_196Var.b(class_196Var.e() - 100);
                                    break;
                                case "down":
                                case "d":
                                    class_196Var.b(class_196Var.e() + 100);
                                    break;
                                case "set_anim":
                                case "anim":
                                case "setanim":
                                    int i2 = Integer.parseInt(strArr[0]);
                                    class_196Var.d(i2);
                                    b("@whi@<img=24> @gre@Entity #" + (i + 1) + "@whi@ animation set to @gre@" + i2 + "!");
                                    break;
                            }
                        } else if (class_196Var instanceof class_198) {
                            if (str.startsWith("npc.")) {
                                strSubstring = str.replace("npc", "").substring(1);
                            } else {
                                strSubstring = str.substring(2);
                            }
                            strSubstring2 = strSubstring;
                            if (class_196Var instanceof class_199) {
                                class_204.a(strSubstring2, strArr, (class_199) class_196Var);
                            }
                            if (class_196Var instanceof class_198) {
                                class_200.a(strSubstring2, strArr, (class_198) class_196Var);
                            }
                            switch (strSubstring2.toLowerCase()) {
                                case 100:
                                    if (r0.equals("d")) {
                                    }
                                    break;
                                case 108:
                                    if (r0.equals("l")) {
                                    }
                                    break;
                                case 114:
                                    if (r0.equals("r")) {
                                    }
                                    break;
                                case 117:
                                    if (r0.equals("u")) {
                                    }
                                    break;
                                case 120:
                                    if (r0.equals("x")) {
                                    }
                                    break;
                                case 121:
                                    if (r0.equals("y")) {
                                    }
                                    break;
                                case 3739:
                                    if (r0.equals("up")) {
                                    }
                                    break;
                                case 2998801:
                                    if (r0.equals("anim")) {
                                    }
                                    break;
                                case 3089570:
                                    if (r0.equals("down")) {
                                    }
                                    break;
                                case 3317767:
                                    if (r0.equals("left")) {
                                    }
                                    break;
                                case 108511772:
                                    if (r0.equals("right")) {
                                    }
                                    break;
                                case 1414998990:
                                    if (r0.equals("set_anim")) {
                                    }
                                    break;
                                case 1985379699:
                                    if (r0.equals("setanim")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                */
                            /*
                                Method dump skipped, instruction units count: 1902
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: rs.class_205.a(java.lang.String, java.lang.String[]):void");
                        }
                    }
                }
            }
        }
    }

    public void e() {
                            while (true) {
                                int iW = this.f.w(-796);
                                if (iW == -1) {
                                    return;
                                }
                                if (this.f.aa() && iW == 96) {
                                    Client client = this.f;
                                    Client.w.a();
                                    return;
                                }
                                Client client2 = this.f;
                                if (Client.w.b) {
                                    Client client3 = this.f;
                                    Client.w.a(iW);
                                    Client client4 = this.f;
                                    Client.fM = true;
                                    return;
                                }
                                if (iW == 32 || iW == 1002 || iW == 1003) {
                                    class_196 class_196Var = null;
                                    for (class_196 class_196Var2 : this.t) {
                                        if (class_196Var2.h() || (class_196Var2 instanceof class_197)) {
                                            class_196Var = class_196Var2;
                                        }
                                    }
                                    if (class_196Var == null) {
                                        return;
                                    }
                                    if (iW == 32) {
                                        int[] array = class_196Var.j().keySet().stream().mapToInt(num -> {
                                            return num.intValue();
                                        }).toArray();
                                        if (class_196Var.m() >= array.length) {
                                            class_196Var.f(array.length - 1);
                                        }
                                        Integer numValueOf = Integer.valueOf(array[class_196Var.m()]);
                                        if (class_196Var.k().contains(numValueOf)) {
                                            class_196Var.k().remove(numValueOf);
                                        } else {
                                            class_196Var.k().add(numValueOf);
                                        }
                                        class_196Var.f();
                                    }
                                    if (iW == 1002) {
                                        class_196Var.f(class_196Var.m() + 1);
                                    }
                                    if (iW == 1003) {
                                        class_196Var.f(class_196Var.m() - 1);
                                    }
                                    if (class_196Var.m() > class_196Var.j().keySet().size()) {
                                        class_196Var.f(class_196Var.j().keySet().size() - 1);
                                    }
                                    if (class_196Var.m() < 0) {
                                        class_196Var.f(0);
                                    }
                                }
                            }
                        }

                        public void a(int i) {
                            Client client = this.f;
                            if (Client.w.b) {
                                return;
                            }
                            if (i == 23) {
                                this.i -= 25;
                            }
                            if (i == 19) {
                                this.i += 25;
                            }
                            if (i == 97) {
                                this.p -= 35 * ((this.f.cS < 500 || this.f.cS > 1500) ? 1 : -1);
                            }
                            if (i == 100) {
                                this.p += 35 * ((this.f.cS < 500 || this.f.cS > 1500) ? 1 : -1);
                            }
                            if (i == 119) {
                                this.q += 50 * ((this.f.cS < 500 || this.f.cS > 1500) ? 1 : -1);
                            }
                            if (i == 115) {
                                this.q -= 50 * ((this.f.cS < 500 || this.f.cS > 1500) ? 1 : -1);
                            }
                        }

                        public void b(int i) {
                            Client client = this.f;
                            if (Client.w.b) {
                                return;
                            }
                            if (i == 99) {
                                a();
                                c("Camera position reset");
                            }
                            if (i == 116) {
                                if (class_253.j.r) {
                                    class_253.j.r = false;
                                } else {
                                    class_253.j.r = true;
                                    class_253.j.s = 0;
                                }
                            }
                            if (i == 49) {
                                Configuration.a(!Configuration.ah);
                                c("Lite mode toggled: " + (Configuration.ah ? "@gre@ON" : "@red@OFF"));
                            }
                            if (i == 50) {
                                Configuration.aj = !Configuration.aj;
                                c("Oldschool graphics toggled: " + (Configuration.aj ? "@gre@ON" : "@red@OFF"));
                            }
                            if (i == 9 || i == 49 || i == 50) {
                                f();
                                if (i == 9) {
                                    c("Graphics and definitions have been reset!");
                                }
                            }
                        }

                        public void c(int i) {
                            if (i == 1) {
                                Iterator<class_196> it = this.t.iterator();
                                while (it.hasNext()) {
                                    it.next().a(false);
                                }
                            }
                            this.j = true;
                            this.k = i;
                        }

                        public void a(String str) {
                            if (str == null || str.isEmpty()) {
                                return;
                            }
                            String strReplace = str.replace("::", "");
                            if (!strReplace.contains(F.a)) {
                                class_195.a(strReplace, strReplace, new String[0]);
                                a(strReplace, new String[0]);
                                return;
                            }
                            String[] strArrSplit = strReplace.split(F.a);
                            String[] strArr = new String[0];
                            if (strArrSplit.length > 1) {
                                strArr = new String[strArrSplit.length - 1];
                                for (int i = 1; i < strArrSplit.length; i++) {
                                    strArr[i - 1] = strArrSplit[i];
                                }
                            }
                            a(strArrSplit[0], strArr);
                            class_195.a(strReplace, strArrSplit[0], strArr);
                        }

                        public void a(int i, int i2) {
                            this.f.hG = null;
                            this.n = i;
                            this.o = i2;
                            Client client = this.f;
                            Client client2 = this.f;
                            Client.ai = i;
                            client.hE = i;
                            Client client3 = this.f;
                            Client client4 = this.f;
                            Client.ah = i2;
                            client3.hF = i2;
                            class_332.a(i, i2);
                            this.f.bx = class_332.x;
                            class_332.a(i, i2);
                            this.f.menuOption = class_332.x;
                            class_332.a(i, i2);
                            this.f.fp = class_332.x;
                            class_332.a(i, i2);
                            this.f.fq = class_332.x;
                            class_46.d(500, User32.WM_DWMCOLORIZATIONCOLORCHANGED, i, i2);
                            this.f.gZ = new class_330(i, i2, this.f.z());
                            this.f.repaint();
                            if (Launcher.e()) {
                                Launcher.n().a(100);
                            }
                        }

                        public void f() {
                            this.v = true;
                        }

                        public static void b(String str) {
                            Client.w.b("@yel@-> " + str);
                        }

                        public void c(String str) {
                            this.u.add(0, new class_201(str));
                        }

                        public static boolean g() {
                            return d;
                        }

                        public List<class_196> h() {
                            return this.t;
                        }
                    }
