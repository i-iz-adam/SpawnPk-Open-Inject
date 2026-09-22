package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aQ;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL11;
import org.lwjgl.system.windows.User32;
import rs.runelite.a.d;

/* JADX INFO: loaded from: client-final.jar:rs/Widget.class */
public class Widget {
    private int a;
    public class_333 i;
    public class_333 j;
    public String k;
    public boolean l;
    public boolean m;
    public static class_663 u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int A;
    public int B;
    public class_333 E;
    public int cache;
    public class_333[] G;
    public static Widget[] H;
    public int[] I;
    public int J;
    public int[] K;
    public int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public String[] W;
    public int[][] X;
    public boolean Y;
    public String Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public boolean af;
    public int ag;
    public int ah;
    private static class_30 b;
    private static class_30 c;
    public int ai;
    public int aj;
    public int[] ak;
    public int[] al;
    public boolean am;
    public class_338 an;
    public int ao;
    public int[] ap;
    public int aq;
    public int[] ar;
    public String as;
    public boolean at;
    public int au;
    public int[] av;
    public String[] aw;
    public int[] ax;
    public byte aA;
    private int d;
    private int e;
    public int aB;
    public int aC;
    public boolean aD;
    public class_333 aE;
    public int aF;
    public int aG;
    public int aH;
    public boolean aI;
    public int aN;
    public boolean aO;
    public int aP;
    public boolean aQ;
    public int aR;
    public int aS;
    public int aT;
    public int aY;
    public int aZ;
    public int[] ba;
    public int bb;
    public boolean bc;
    public boolean bf;
    public byte bg;
    public int bh;
    public int[] bi;
    public int[] bj;
    public boolean bk;
    public int bo;
    public int by;
    public int bz;
    public int bA;
    public boolean bC;
    public static int[] h = {4041, 4077, CL10.CL_DEVICE_IMAGE2D_MAX_WIDTH, 4047, 4083, CL10.CL_DEVICE_MAX_PARAMETER_SIZE, 4053, 4089, CL10.CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE, 4059, 4095, CL10.CL_DEVICE_LOCAL_MEM_SIZE, 4065, 4101, CL10.CL_DEVICE_EXECUTION_CAPABILITIES, 4071, CL10.CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE, CL10.CL_DEVICE_VERSION, CL11.CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT, 12168, 13918};
    public static final class_30 n = new class_30(50);
    public static final class_30 aM = new class_30(30);
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = 0;
    public boolean t = true;
    public int C = Integer.MAX_VALUE;
    public int D = Integer.MAX_VALUE;
    public boolean ay = false;
    public int az = 0;
    public int aJ = 0;
    public int aK = 0;
    public int aL = 0;
    public int aU = 128;
    public int aV = 128;
    public boolean aW = false;
    public boolean aX = false;
    public boolean bd = true;
    public boolean be = true;
    public boolean bl = true;
    public boolean bm = false;
    public boolean bn = false;
    public int bp = 0;
    public short bq = 0;
    public short br = 0;
    public int bs = 0;
    public boolean bt = false;
    public boolean bu = false;
    public boolean bv = false;
    public String bw = null;
    public boolean bx = false;
    public int bB = 32;
    public boolean bD = false;
    public class_356 bE = null;
    public class_356 bF = null;

    public void a(int i, int i2) {
        int i3 = this.ax[i];
        this.ax[i] = this.ax[i2];
        this.ax[i2] = i3;
        int i4 = this.av[i];
        this.av[i] = this.av[i2];
        this.av[i2] = i4;
    }

    public static void a(class_663 class_663Var, class_338[] class_338VarArr, class_663 class_663Var2) {
        b = new class_30(50000);
        c = new class_30(25000);
        Buffer buffer = new Buffer(class_663Var.a("data"));
        int iA = -1;
        H = new Widget[buffer.A() + 70000];
        while (buffer.h < buffer.g.length) {
            int iA2 = buffer.A();
            if (iA2 == 65535) {
                iA = buffer.A();
                iA2 = buffer.A();
            }
            Widget widget = new Widget();
            H[iA2] = widget;
            widget.au = iA2;
            widget.ag = iA;
            widget.aG = buffer.y();
            widget.M = buffer.y();
            widget.J = buffer.A();
            widget.P = buffer.A();
            widget.aP = buffer.A();
            widget.aA = (byte) buffer.y();
            widget.aa = buffer.y();
            if (widget.aa != 0) {
                widget.aa = ((widget.aa - 1) << 8) + buffer.y();
            } else {
                widget.aa = -1;
            }
            int iY = buffer.y();
            if (iY > 0) {
                widget.ap = new int[iY];
                widget.I = new int[iY];
                for (int i = 0; i < iY; i++) {
                    widget.ap[i] = buffer.y();
                    widget.I[i] = buffer.A();
                }
            }
            int iY2 = buffer.y();
            if (iY2 > 0) {
                widget.X = new int[iY2][];
                for (int i2 = 0; i2 < iY2; i2++) {
                    int iA3 = buffer.A();
                    widget.X[i2] = new int[iA3];
                    for (int i3 = 0; i3 < iA3; i3++) {
                        widget.X[i2][i3] = buffer.A();
                    }
                }
            }
            if (widget.aG == 0) {
                widget.v = false;
                widget.aF = buffer.A();
                widget.aO = buffer.y() == 1;
                int iA4 = buffer.A();
                widget.ak = new int[iA4];
                widget.al = new int[iA4];
                widget.ba = new int[iA4];
                for (int i4 = 0; i4 < iA4; i4++) {
                    widget.ak[i4] = buffer.A();
                    widget.al[i4] = buffer.B();
                    widget.ba[i4] = buffer.B();
                }
            }
            if (widget.aG == 1) {
                buffer.A();
                buffer.y();
            }
            if (widget.aG == 2) {
                widget.ax = new int[widget.P * widget.aP];
                widget.av = new int[widget.P * widget.aP];
                widget.aD = buffer.y() == 1;
                widget.at = buffer.y() == 1;
                widget.am = buffer.y() == 1;
                widget.af = buffer.y() == 1;
                widget.ab = buffer.y();
                widget.ao = buffer.y();
                widget.K = new int[20];
                widget.ar = new int[20];
                widget.G = new class_333[20];
                for (int i5 = 0; i5 < 20; i5++) {
                    if (buffer.y() == 1) {
                        widget.K[i5] = buffer.B();
                        widget.ar[i5] = buffer.B();
                        String strF = buffer.F();
                        if (class_663Var2 != null && strF.length() > 0) {
                            int iLastIndexOf = strF.lastIndexOf(",");
                            widget.G[i5] = a(Integer.parseInt(strF.substring(iLastIndexOf + 1)), class_663Var2, strF.substring(0, iLastIndexOf));
                        }
                    }
                }
                widget.W = new String[6];
                for (int i6 = 0; i6 < 5; i6++) {
                    widget.W[i6] = buffer.F();
                    if (widget.W[i6].length() == 0) {
                        widget.W[i6] = null;
                    }
                    if (widget.ag == 3824) {
                        widget.W[4] = "Buy 100";
                        widget.W[5] = "Buy 1000";
                    }
                    if (widget.ag == 1644) {
                        widget.W[2] = "Operate";
                    }
                }
            }
            if (widget.aG == 3) {
                widget.Y = buffer.y() == 1;
            }
            if (widget.aG == 4 || widget.aG == 1) {
                widget.S = buffer.y() == 1;
                int iY3 = buffer.y();
                if (class_338VarArr != null) {
                    widget.an = class_338VarArr[iY3];
                }
                widget.aQ = buffer.y() == 1;
            }
            if (widget.aG == 4) {
                widget.as = buffer.F();
                widget.Z = buffer.F();
            }
            if (widget.aG == 1 || widget.aG == 3 || widget.aG == 4) {
                widget.ac = buffer.D();
            }
            if (widget.aG == 3 || widget.aG == 4) {
                widget.O = buffer.D();
                widget.L = buffer.D();
                widget.aj = buffer.D();
            }
            if (widget.aG == 5) {
                widget.v = false;
                String strF2 = buffer.F();
                if (class_663Var2 != null && strF2.length() > 0) {
                    int iLastIndexOf2 = strF2.lastIndexOf(",");
                    widget.E = a(Integer.parseInt(strF2.substring(iLastIndexOf2 + 1)), class_663Var2, strF2.substring(0, iLastIndexOf2));
                }
                String strF3 = buffer.F();
                if (class_663Var2 != null && strF3.length() > 0) {
                    int iLastIndexOf3 = strF3.lastIndexOf(",");
                    widget.aE = a(Integer.parseInt(strF3.substring(iLastIndexOf3 + 1)), class_663Var2, strF3.substring(0, iLastIndexOf3));
                }
            }
            if (widget.aG == 6) {
                int iY4 = buffer.y();
                if (iY4 != 0) {
                    widget.ad = 1;
                    widget.ae = ((iY4 - 1) << 8) + buffer.y();
                }
                int iY5 = buffer.y();
                if (iY5 != 0) {
                    widget.d = 1;
                    widget.e = ((iY5 - 1) << 8) + buffer.y();
                }
                int iY6 = buffer.y();
                if (iY6 != 0) {
                    widget.aB = ((iY6 - 1) << 8) + buffer.y();
                } else {
                    widget.aB = -1;
                }
                int iY7 = buffer.y();
                if (iY7 != 0) {
                    widget.aC = ((iY7 - 1) << 8) + buffer.y();
                } else {
                    widget.aC = -1;
                }
                widget.aR = buffer.A();
                widget.aS = buffer.A();
                widget.aT = buffer.A();
            }
            if (widget.aG == 7) {
                widget.ax = new int[widget.P * widget.aP];
                widget.av = new int[widget.P * widget.aP];
                widget.S = buffer.y() == 1;
                int iY8 = buffer.y();
                if (class_338VarArr != null) {
                    widget.an = class_338VarArr[iY8];
                }
                widget.aQ = buffer.y() == 1;
                widget.ac = buffer.D();
                widget.ab = buffer.B();
                widget.ao = buffer.B();
                widget.at = buffer.y() == 1;
                widget.W = new String[5];
                for (int i7 = 0; i7 < 5; i7++) {
                    widget.W[i7] = buffer.F();
                    if (widget.W[i7].length() == 0) {
                        widget.W[i7] = null;
                    }
                }
            }
            if (widget.M == 2 || widget.aG == 2) {
                widget.R = buffer.F();
                widget.N = buffer.F();
                widget.ah = buffer.A();
            }
            if (widget.aG == 8) {
                widget.as = buffer.F();
            }
            if (widget.M == 1 || widget.M == 4 || widget.M == 5 || widget.M == 6) {
                widget.Q = buffer.F();
                if (widget.Q.length() == 0) {
                    if (widget.M == 1) {
                        widget.Q = "Ok";
                    }
                    if (widget.M == 4) {
                        widget.Q = "Select";
                    }
                    if (widget.M == 5) {
                        widget.Q = "Select";
                    }
                    if (widget.M == 6) {
                        widget.Q = "Continue";
                    }
                }
            }
            if (widget.as != null) {
                widget.as = widget.as.replace("Runescape", Configuration.A);
                widget.as = widget.as.replace("RuneScape", Configuration.A);
                widget.as = widget.as.replace("runescape", Configuration.A.toLowerCase());
            }
        }
        u = class_663Var;
        class_492.a(class_663Var, class_338VarArr);
        b = null;
        c = null;
        for (int i8 = 15239; i8 <= 15244; i8++) {
            H[i8].an = class_338VarArr[0];
            H[i8].S = true;
        }
        H[15239].as = " @gre@Random player";
        H[15240].as = " Mountain";
        H[15241].as = " Trinity Outpost";
        H[15242].as = " M. Settlement";
        H[15243].as = " Debtor Hideout";
    }

    public static void a(int i, String str, class_338[] class_338VarArr, int i2, int i3, boolean z) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        if (z) {
            widget.S = true;
        }
        widget.aQ = true;
        widget.an = class_338VarArr[i2];
        widget.as = str;
        widget.ac = i3;
        widget.au = i;
        widget.aG = 4;
    }

    public static void b(int i, int i2) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.P = 26;
        widget.aP = 34;
        widget.aA = (byte) 0;
        widget.aa = 0;
        widget.E = j(i2, "Interfaces/Skill");
        widget.aE = j(i2, "Interfaces/Skill");
    }

    public static void b(int i, String str) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.aG = 0;
        widgetJ.aO = true;
        widgetJ.aa = -1;
        e(i + 1, str);
        widgetJ.k(1);
        widgetJ.b(0, i + 1, 0, 0);
    }

    public static void d() {
        Widget widgetD = d(30000);
        widgetD.Q = "Cast @gre@Lunar Home Teleport";
        widgetD.au = 30000;
        widgetD.ag = 30000;
        widgetD.aG = 5;
        widgetD.M = 5;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = 30001;
        widgetD.E = j(1, "lunar/SPRITE");
        widgetD.P = 20;
        widgetD.aP = 20;
        Widget widgetD2 = d(30001);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(1, widgetD2);
        a(30002, 0, "SPRITE");
        b(30002, 0, 0, 0, widgetD2);
    }

    public static void a(int i, String str, int i2, int i3) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.aG = 0;
        widgetJ.aO = true;
        widgetJ.aa = -1;
        e(i + 1, str);
        widgetJ.k(1);
        widgetJ.b(0, i + 1, 0, 0);
        widgetJ.aP = i2;
        widgetJ.P = i3;
    }

    public static void a(int i, int i2, int i3, String str, String str2, int i4, int i5, int i6) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.au = i;
        widgetJ.aG = 5;
        widgetJ.M = i5;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i4;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i6;
        widgetJ.X[0][2] = 0;
        widgetJ.E = j(i2, str);
        widgetJ.aE = j(i3, str);
        widgetJ.P = widgetJ.E.n;
        widgetJ.aP = widgetJ.E.o;
        widgetJ.Q = str2;
    }

    public static void a(int i, int i2, int i3, int i4, int i5, String str, int i6, int i7, int i8, int i9, String str2, int i10, int i11, int i12, String str3, int i13, String str4, String str5, int i14, int i15) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = i2;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i3;
        widgetJ.E = j(i4, str);
        widgetJ.aE = j(i5, str);
        widgetJ.P = i6;
        widgetJ.Q = str2;
        widgetJ.aP = i7;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i9;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i8;
        widgetJ.X[0][2] = 0;
        Widget widgetJ2 = j(i3);
        widgetJ2.ag = i3;
        widgetJ2.au = i3;
        widgetJ2.aG = 0;
        widgetJ2.M = 0;
        widgetJ2.P = 550;
        widgetJ2.aP = 334;
        widgetJ2.aO = true;
        widgetJ2.aa = -1;
        a(i10, i11, i12, str3, i9, i8);
        a(i13, i, str4, str5, i9, i8);
        a(2, widgetJ2);
        b(i10, 15, 60, 0, widgetJ2);
        b(i13, i14, i15, 1, widgetJ2);
    }

    public static void a(int i, int i2, String str, String str2, int i3, int i4) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i2;
        widgetJ.an = Client.bk[0];
        widgetJ.aG = 8;
        widgetJ.Z = str;
        widgetJ.as = str2;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i3;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i4;
        widgetJ.X[0][2] = 0;
    }

    public static void a(int i, int i2, int i3, String str, int i4, int i5) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = 0;
        widgetJ.J = 0;
        widgetJ.P = 512;
        widgetJ.aP = 334;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i4;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i5;
        widgetJ.X[0][2] = 0;
        if (str != null) {
            widgetJ.E = j(i2, str);
            widgetJ.aE = j(i3, str);
        } else {
            widgetJ.q = -1;
            widgetJ.o = i2;
            widgetJ.r = 70;
            widgetJ.p = i3;
        }
    }

    public static void b(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.W = new String[5];
        widget.K = new int[20];
        widget.av = new int[30];
        widget.ax = new int[30];
        widget.ar = new int[20];
        widget.ak = new int[0];
        widget.al = new int[0];
        widget.ba = new int[0];
        widget.W[0] = "Take 1";
        widget.W[1] = "Take 5";
        widget.W[2] = "Take 10";
        widget.W[3] = "Take All";
        widget.S = false;
        widget.Y = false;
        widget.af = false;
        widget.am = false;
        widget.at = false;
        widget.aD = true;
        widget.aQ = false;
        widget.bh = -1;
        widget.ab = 24;
        widget.ao = 21;
        widget.aP = 5;
        widget.P = 6;
        widget.ag = 40601;
        widget.au = 40600;
        widget.aG = 2;
    }

    public static void a(class_338[] class_338VarArr) {
        Widget widgetJ = j(2700);
        c(G.eW, 20, "popups/kharazi/SUMMON");
        c(G.eX);
        a(G.eY, "popups/kharazi/SPRITE", 1, 21, 21, "Close", User32.VK_PLAY, G.eZ, 3);
        a(G.eZ, "popups/kharazi/SPRITE", 3, 21, 21, G.fa);
        widgetJ.k(4);
        widgetJ.b(0, G.eW, 90, 14);
        widgetJ.b(1, G.eX, 100, 56);
        widgetJ.b(2, G.eY, 431, 23);
        widgetJ.b(3, G.eZ, 431, 23);
        Widget widgetJ2 = j(40600);
        b(40601);
        a(40602, "Kharazi storage chest", class_338VarArr, 2, class_492.e, true);
        a(40603, "popups/kharazi/extend", 1, 16, 16, "Extend slots", -1, 40604, 1);
        a(40604, "popups/kharazi/extend", 2, 16, 16, 40605);
        widgetJ2.k(7);
        widgetJ2.b(0, G.eW, 90, 14);
        widgetJ2.b(1, 40601, 100, 56);
        widgetJ2.b(2, G.eY, 431, 23);
        widgetJ2.b(3, G.eZ, 431, 23);
        widgetJ2.b(4, 40602, 277, 23);
        widgetJ2.b(5, 40603, 428, 64);
        widgetJ2.b(6, 40604, 428, 64);
    }

    public static void c(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.W = new String[5];
        widget.K = new int[20];
        widget.av = new int[30];
        widget.ax = new int[30];
        widget.ar = new int[20];
        widget.ak = new int[0];
        widget.al = new int[0];
        widget.ba = new int[0];
        widget.W[0] = "Take 1";
        widget.W[1] = "Take 5";
        widget.W[2] = "Take 10";
        widget.W[3] = "Take All";
        widget.S = false;
        widget.Y = false;
        widget.af = false;
        widget.am = false;
        widget.at = false;
        widget.aD = true;
        widget.aQ = false;
        widget.bh = -1;
        widget.ab = 24;
        widget.ao = 24;
        widget.aP = 5;
        widget.P = 6;
        widget.ag = G.eX;
        widget.au = 2700;
        widget.aG = 2;
    }

    public static void a(int i, int i2, int i3, int i4, String str, int i5, int i6, String str2, int i7, int i8, String str3, int i9, String str4, int i10, int i11) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = i2;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i3;
        widgetJ.E = j(i4, str);
        widgetJ.P = i5;
        widgetJ.Q = str2;
        widgetJ.aP = i6;
        Widget widgetJ2 = j(i3);
        widgetJ2.ag = i3;
        widgetJ2.au = i3;
        widgetJ2.aG = 0;
        widgetJ2.M = 0;
        widgetJ2.P = 550;
        widgetJ2.aP = 334;
        widgetJ2.aO = true;
        widgetJ2.aa = -1;
        a(i7, i8, i8, str3, 0, 0);
        a(1, widgetJ2);
        b(i7, 15, 60, 0, widgetJ2);
    }

    public static void b(int i, int i2, int i3, int i4, String str, int i5, int i6, String str2, int i7, int i8, String str3, int i9, String str4, int i10, int i11) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = i2;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i3;
        widgetJ.E = j(i4, str);
        widgetJ.P = i5;
        widgetJ.Q = str2;
        widgetJ.aP = i6;
        Widget widgetJ2 = j(i3);
        widgetJ2.ag = i3;
        widgetJ2.au = i3;
        widgetJ2.aG = 0;
        widgetJ2.M = 0;
        widgetJ2.P = 550;
        widgetJ2.aP = 334;
        widgetJ2.aO = true;
        widgetJ2.aa = -1;
        a(i7, i8, i8, str3, 0, 0);
        a(1, widgetJ2);
        b(i7, 15, 65, 0, widgetJ2);
    }

    public static void a(int i, class_333 class_333Var) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = class_333Var;
        widget.aE = class_333Var;
        widget.P = 512;
        widget.aP = 334;
    }

    public static void a(int i, Boolean bool, int i2) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.W = new String[5];
        widget.K = new int[20];
        widget.av = new int[i2];
        widget.ax = new int[i2];
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

    public static void a(int i, Boolean bool) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
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

    public static void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2, class_338[] class_338VarArr, int i8, int i9, int i10) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i10;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i9;
        widgetD.R = "Cast on";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[3];
        widgetD.I = new int[3];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i4;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i5;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.X = new int[4][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[3];
        widgetD.X[2][0] = 1;
        widgetD.X[2][1] = 6;
        widgetD.X[2][2] = 0;
        widgetD.aE = j(i8, "magic/on");
        widgetD.E = j(i8, "magic/off");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(7, widgetD2);
        a(i + 2, 0, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i7 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 19, 2, widgetD2);
        b(aQ.cJ_, 14, 35, 3, widgetD2);
        b(i6, 74, 35, 4, widgetD2);
        a(i + 5, i4 + 1, i2, class_338VarArr);
        b(i + 5, 26, 66, 5, widgetD2);
        a(i + 6, i5 + 1, i3, class_338VarArr);
        b(i + 6, 87, 66, 6, widgetD2);
    }

    public static void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, String str2, class_338[] class_338VarArr, int i11, int i12, int i13) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i13;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i12;
        widgetD.R = "Cast on";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[4];
        widgetD.I = new int[4];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i5;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i6;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.ap[3] = 3;
        widgetD.I[3] = i10;
        widgetD.X = new int[4][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[4];
        widgetD.X[2][0] = 4;
        widgetD.X[2][1] = 3214;
        widgetD.X[2][2] = i4;
        widgetD.X[2][3] = 0;
        widgetD.X[3] = new int[3];
        widgetD.X[3][0] = 1;
        widgetD.X[3][1] = 6;
        widgetD.X[3][2] = 0;
        widgetD.aE = j(i11, "magic/on");
        widgetD.E = j(i11, "magic/off");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(9, widgetD2);
        a(i + 2, 0, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i10 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 19, 2, widgetD2);
        b(aQ.cJ_, 14, 35, 3, widgetD2);
        b(i8, 74, 35, 4, widgetD2);
        b(i9, 130, 35, 5, widgetD2);
        a(i + 5, i5 + 1, i2, class_338VarArr);
        b(i + 5, 26, 66, 6, widgetD2);
        a(i + 6, i6 + 1, i3, class_338VarArr);
        b(i + 6, 87, 66, 7, widgetD2);
        a(i + 7, i7 + 1, i4, class_338VarArr);
        b(i + 7, 142, 66, 8, widgetD2);
    }

    public static void a(int i, int i2, String str) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 5;
        widgetD.M = 5;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = 52;
        widgetD.E = a(i2, str);
        widgetD.P = 500;
        widgetD.aP = 500;
        widgetD.Q = "";
    }

    public static void b(int i, int i2, String str) {
        Widget widgetD = d(i);
        widgetD.aG = 5;
        widgetD.M = 0;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = 52;
        widgetD.E = a(i2, "RUNE");
        widgetD.P = 500;
        widgetD.aP = 500;
    }

    public static void b(int i, int i2, String str, String str2, int i3, int i4) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = i4;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = i3;
        widget.E = j(i2, str);
        widget.aE = j(i2, str);
        widget.P = widget.E.n;
        widget.aP = widget.aE.o;
        widget.Q = str2;
        widget.bf = true;
    }

    public static void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2, class_338[] class_338VarArr, int i8, int i9, int i10) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i10;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i9;
        widgetD.R = "Cast On";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[3];
        widgetD.I = new int[3];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i4;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i5;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.X = new int[3][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[3];
        widgetD.X[2][0] = 1;
        widgetD.X[2][1] = 6;
        widgetD.X[2][2] = 0;
        widgetD.aE = j(i8, "lunar/LUNARON");
        widgetD.E = j(i8, "lunar/LUNAROFF");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(7, widgetD2);
        a(i + 2, 0, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i7 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 19, 2, widgetD2);
        b(30016, 37, 35, 3, widgetD2);
        b(i6, 112, 35, 4, widgetD2);
        a(i + 5, i4 + 1, i2, class_338VarArr);
        b(i + 5, 50, 66, 5, widgetD2);
        a(i + 6, i5 + 1, i3, class_338VarArr);
        b(i + 6, 123, 66, 6, widgetD2);
    }

    public static void a(int i, int i2, int i3, class_338[] class_338VarArr) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 4;
        widgetD.M = 0;
        widgetD.J = 0;
        widgetD.P = 0;
        widgetD.aP = 14;
        widgetD.aA = (byte) 0;
        widgetD.aa = -1;
        widgetD.ap = new int[1];
        widgetD.I = new int[1];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i2;
        widgetD.X = new int[1][4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i3;
        widgetD.X[0][3] = 0;
        widgetD.S = true;
        widgetD.an = class_338VarArr[0];
        widgetD.aQ = true;
        widgetD.as = "%1/" + i2;
        widgetD.Z = "";
        widgetD.ac = 12582912;
        widgetD.O = 49152;
    }

    public static void a(int i, int i2, int i3) {
        Widget widgetJ = j(i);
        widgetJ.aG = 6;
        widgetJ.ad = 10;
        widgetJ.ae = 941;
        class_102 class_102VarC = class_102.c(widgetJ.ae);
        if (class_102VarC.r == 1) {
            widgetJ.aR = aU.sA;
        } else {
            widgetJ.aR = class_102VarC.r * 500;
        }
        widgetJ.aI = true;
        widgetJ.aB = class_102VarC.w;
        widgetJ.aS = 40;
        widgetJ.aT = aU.ug;
        widgetJ.aP = i3;
        widgetJ.P = i2;
    }

    public static void a(int i, int i2, int i3, int i4, int i5) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i2);
        widget.aS = itemCompositionLookupItem.M;
        widget.aT = itemCompositionLookupItem.Z;
        widget.aG = 6;
        widget.ad = 4;
        widget.ae = i2;
        widget.aR = i5;
        widget.P = i3;
        widget.aP = i4;
    }

    public static void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, String str2, class_338[] class_338VarArr, int i11, int i12, int i13) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i13;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i12;
        widgetD.R = "Cast on";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[4];
        widgetD.I = new int[4];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i5;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i6;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.ap[3] = 3;
        widgetD.I[3] = i10;
        widgetD.X = new int[4][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[4];
        widgetD.X[2][0] = 4;
        widgetD.X[2][1] = 3214;
        widgetD.X[2][2] = i4;
        widgetD.X[2][3] = 0;
        widgetD.X[3] = new int[3];
        widgetD.X[3][0] = 1;
        widgetD.X[3][1] = 6;
        widgetD.X[3][2] = 0;
        widgetD.aE = j(i11, "lunar/LUNARON");
        widgetD.E = j(i11, "lunar/LUNAROFF");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(9, widgetD2);
        a(i + 2, 0, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i10 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 19, 2, widgetD2);
        b(30016, 14, 35, 3, widgetD2);
        b(i8, 74, 35, 4, widgetD2);
        b(i9, 130, 35, 5, widgetD2);
        a(i + 5, i5 + 1, i2, class_338VarArr);
        b(i + 5, 26, 66, 6, widgetD2);
        a(i + 6, i6 + 1, i3, class_338VarArr);
        b(i + 6, 87, 66, 7, widgetD2);
        a(i + 7, i7 + 1, i4, class_338VarArr);
        b(i + 7, 142, 66, 8, widgetD2);
    }

    public static void c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, String str2, class_338[] class_338VarArr, int i11, int i12, int i13) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i13;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i12;
        widgetD.R = "Cast on";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[4];
        widgetD.I = new int[4];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i5;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i6;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.ap[3] = 3;
        widgetD.I[3] = i10;
        widgetD.X = new int[4][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[4];
        widgetD.X[2][0] = 4;
        widgetD.X[2][1] = 3214;
        widgetD.X[2][2] = i4;
        widgetD.X[2][3] = 0;
        widgetD.X[3] = new int[3];
        widgetD.X[3][0] = 1;
        widgetD.X[3][1] = 6;
        widgetD.X[3][2] = 0;
        widgetD.aE = j(i11, "magic/on");
        widgetD.E = j(i11, "magic/off");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(9, widgetD2);
        a(i + 2, 0, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i10 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 19, 2, widgetD2);
        b(30016, 14, 35, 3, widgetD2);
        b(i8, 74, 35, 4, widgetD2);
        b(i9, 130, 35, 5, widgetD2);
        a(i + 5, i5 + 1, i2, class_338VarArr);
        b(i + 5, 26, 66, 6, widgetD2);
        a(i + 6, i6 + 1, i3, class_338VarArr);
        b(i + 6, 87, 66, 7, widgetD2);
        a(i + 7, i7 + 1, i4, class_338VarArr);
        b(i + 7, 142, 66, 8, widgetD2);
    }

    protected static void a(int i, int i2, String str, int i3) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.a = (byte) i3;
        widget.bh = 52;
        widget.E = j(i2, str);
        widget.aE = j(i2, str);
        widget.P = 512;
        widget.aP = 334;
        widget.v = true;
    }

    public static void d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, String str2, class_338[] class_338VarArr, int i11, int i12, int i13) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i13;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i12;
        widgetD.R = "Cast on";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[4];
        widgetD.I = new int[4];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i5;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i6;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.ap[3] = 3;
        widgetD.I[3] = i10;
        widgetD.X = new int[4][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[4];
        widgetD.X[2][0] = 4;
        widgetD.X[2][1] = 3214;
        widgetD.X[2][2] = i4;
        widgetD.X[2][3] = 0;
        widgetD.X[3] = new int[3];
        widgetD.X[3][0] = 1;
        widgetD.X[3][1] = 6;
        widgetD.X[3][2] = 0;
        widgetD.aE = j(i11, "lunar/LUNARON");
        widgetD.E = j(i11, "lunar/LUNAROFF");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(9, widgetD2);
        a(i + 2, 1, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i10 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 21, 2, widgetD2);
        b(30016, 14, 48, 3, widgetD2);
        b(i8, 74, 48, 4, widgetD2);
        b(i9, 130, 48, 5, widgetD2);
        a(i + 5, i5 + 1, i2, class_338VarArr);
        b(i + 5, 26, 79, 6, widgetD2);
        a(i + 6, i6 + 1, i3, class_338VarArr);
        b(i + 6, 87, 79, 7, widgetD2);
        a(i + 7, i7 + 1, i4, class_338VarArr);
        b(i + 7, 142, 79, 8, widgetD2);
    }

    public static void e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, String str2, class_338[] class_338VarArr, int i11, int i12, int i13) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = aU.kP;
        widgetD.aG = 5;
        widgetD.M = i13;
        widgetD.J = 0;
        widgetD.aa = i + 1;
        widgetD.ah = i12;
        widgetD.R = "Cast on";
        widgetD.P = 20;
        widgetD.aP = 20;
        widgetD.Q = "Cast @gre@" + str;
        widgetD.N = str;
        widgetD.ap = new int[4];
        widgetD.I = new int[4];
        widgetD.ap[0] = 3;
        widgetD.I[0] = i5;
        widgetD.ap[1] = 3;
        widgetD.I[1] = i6;
        widgetD.ap[2] = 3;
        widgetD.I[2] = i7;
        widgetD.ap[3] = 3;
        widgetD.I[3] = i10;
        widgetD.X = new int[4][];
        widgetD.X[0] = new int[4];
        widgetD.X[0][0] = 4;
        widgetD.X[0][1] = 3214;
        widgetD.X[0][2] = i2;
        widgetD.X[0][3] = 0;
        widgetD.X[1] = new int[4];
        widgetD.X[1][0] = 4;
        widgetD.X[1][1] = 3214;
        widgetD.X[1][2] = i3;
        widgetD.X[1][3] = 0;
        widgetD.X[2] = new int[4];
        widgetD.X[2][0] = 4;
        widgetD.X[2][1] = 3214;
        widgetD.X[2][2] = i4;
        widgetD.X[2][3] = 0;
        widgetD.X[3] = new int[3];
        widgetD.X[3][0] = 1;
        widgetD.X[3][1] = 6;
        widgetD.X[3][2] = 0;
        widgetD.aE = j(i11, "lunar/LUNARON");
        widgetD.E = j(i11, "lunar/LUNAROFF");
        Widget widgetD2 = d(i + 1);
        widgetD2.aO = true;
        widgetD2.aa = -1;
        a(9, widgetD2);
        a(i + 2, 2, "BOX");
        b(i + 2, 0, 0, 0, widgetD2);
        a(i + 3, "Level " + (i10 + 1) + ": " + str, class_492.e, true, true, 52, class_338VarArr, 1);
        b(i + 3, 90, 4, 1, widgetD2);
        a(i + 4, str2, 11495962, true, true, 52, class_338VarArr, 0);
        b(i + 4, 90, 34, 2, widgetD2);
        b(30016, 14, 61, 3, widgetD2);
        b(i8, 74, 61, 4, widgetD2);
        b(i9, 130, 61, 5, widgetD2);
        a(i + 5, i5 + 1, i2, class_338VarArr);
        b(i + 5, 26, 92, 6, widgetD2);
        a(i + 6, i6 + 1, i3, class_338VarArr);
        b(i + 6, 87, 92, 7, widgetD2);
        a(i + 7, i7 + 1, i4, class_338VarArr);
        b(i + 7, 142, 92, 8, widgetD2);
    }

    private static class_333 a(int i, String str) {
        return j(i, "/Lunar/" + str);
    }

    public static void a(int i, int i2, int i3, int i4, int i5, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.E = d(i2, "");
        if (i3 == i2) {
            widget.aE = d(i2, "a");
        } else {
            widget.aE = d(i3, "");
        }
        widget.Q = str;
        widget.J = 0;
        widget.M = 1;
        widget.P = i4;
        widget.aa = 52;
        widget.ag = i;
        widget.au = i;
        widget.aG = 5;
        widget.aP = i5;
    }

    public static void a(int i, int i2, String str, String str2, int i3, int i4, int i5, int i6) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = i4;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = i3;
        widget.E = j(i2, str);
        widget.aE = j(i2, str);
        widget.P = i5;
        widget.aP = i6;
        widget.Q = str2;
        widget.bf = true;
    }

    public static void a(int i, String str, class_338[] class_338VarArr, int i2, int i3) {
        Widget widgetF = f(i);
        widgetF.au = i;
        widgetF.ag = i;
        widgetF.aG = 4;
        widgetF.M = 0;
        widgetF.P = 174;
        widgetF.aP = 11;
        widgetF.J = 0;
        widgetF.aA = (byte) 0;
        widgetF.aa = -1;
        widgetF.S = false;
        widgetF.aQ = true;
        widgetF.an = class_338VarArr[i2];
        widgetF.as = str;
        widgetF.Z = "";
        widgetF.ac = i3;
        widgetF.O = 0;
        widgetF.L = 0;
        widgetF.aj = 0;
    }

    public static void c(int i, int i2) {
        H[i].E = d(i2, "");
    }

    public static Widget d(int i) {
        H[i] = new Widget();
        H[i].au = i;
        H[i].ag = i;
        H[i].P = 512;
        H[i].aP = 334;
        return H[i];
    }

    public static void b(int i, int i2, int i3) {
        Widget widgetJ = j(i);
        widgetJ.aG = 6;
        widgetJ.ad = 10;
        widgetJ.ae = 941;
        class_102 class_102VarC = class_102.c(widgetJ.ae);
        if (class_102VarC.r == 1) {
            widgetJ.aR = aU.sA;
        } else {
            widgetJ.aR = class_102VarC.r * 500;
        }
        widgetJ.aB = class_102VarC.w;
        widgetJ.aS = 40;
        widgetJ.aT = aU.ug;
        widgetJ.aP = i3;
        widgetJ.P = i2;
    }

    public static void d(int i, int i2) {
        Widget widgetJ = j(i);
        widgetJ.aG = 21;
        widgetJ.ae = 941;
        widgetJ.aP = i2;
        widgetJ.P = i2;
    }

    public static void a(int i, int i2, int i3, int i4, Widget widget) {
        widget.ak[i] = i2;
        widget.al[i] = i3;
        widget.ba[i] = i4;
    }

    public static void a(int i, int i2, int i3, boolean z, int i4, int i5, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.bb = i3;
        widget.bc = z;
        widget.au = i;
        widget.ag = i;
        widget.aG = 3;
        widget.M = 5;
        widget.J = 0;
        widget.bg = (byte) i2;
        widget.P = i4;
        widget.aP = i5;
        widget.Q = "Build " + str;
    }

    public static void e(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.W = new String[5];
        widget.W = new String[]{"Build", null, null, null, null};
        widget.K = new int[20];
        widget.av = new int[30];
        widget.ax = new int[30];
        widget.ar = new int[20];
        widget.ak = new int[0];
        widget.al = new int[0];
        widget.ba = new int[0];
        widget.bc = false;
        widget.am = false;
        widget.at = false;
        widget.ab = 164;
        widget.ao = 37;
        widget.aG = 2;
        widget.ag = 39982;
        widget.au = 39980;
        widget.P = 2;
        widget.aP = 4;
    }

    public static void b(int i, int i2, int i3, int i4, int i5) {
        Widget widgetD = d(i);
        widgetD.P = i2;
        widgetD.aP = i3;
        widgetD.ax = new int[i2 * i3];
        widgetD.av = new int[i2 * i3];
        widgetD.am = false;
        widgetD.at = false;
        widgetD.ab = i4;
        widgetD.ao = i5;
        widgetD.K = new int[20];
        widgetD.ar = new int[20];
        widgetD.G = new class_333[20];
        widgetD.aG = 2;
    }

    public static void c(int i, int i2, int i3) {
        a(i, i2, 0, i3);
    }

    public static void a(int i, int i2, int i3, int i4) {
        Widget widgetJ = j(i);
        if (i2 == 0) {
            return;
        }
        widgetJ.aG = 20;
        widgetJ.ae = i2;
        widgetJ.aP = i4;
        widgetJ.P = i4;
        widgetJ.bo = i3;
    }

    public static void a(int i, String str, String str2, class_338[] class_338VarArr, int i2, int i3, boolean z, boolean z2, int i4) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 4;
        widgetD.M = 1;
        widgetD.P = i4;
        widgetD.aP = 11;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = -1;
        widgetD.S = z;
        widgetD.aQ = z2;
        widgetD.an = class_338VarArr[i2];
        widgetD.as = str;
        widgetD.Z = "";
        widgetD.ac = i3;
        widgetD.O = 0;
        widgetD.L = class_492.c;
        widgetD.aj = 0;
        widgetD.Q = str2;
    }

    public static void b(int i, String str, String str2, class_338[] class_338VarArr, int i2, int i3, boolean z, boolean z2, int i4) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 4;
        widgetD.M = 1;
        widgetD.P = i4;
        widgetD.aP = 11;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = -1;
        widgetD.S = z;
        widgetD.aQ = z2;
        widgetD.an = class_338VarArr[i2];
        widgetD.as = str;
        widgetD.Z = "";
        widgetD.ac = i3;
        widgetD.O = 0;
        widgetD.L = class_492.c;
        widgetD.aj = 0;
        widgetD.Q = str2;
        widgetD.bm = true;
    }

    public static Widget f(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 0;
        widget.M = 0;
        widget.J = 0;
        widget.P = 512;
        widget.aP = 334;
        widget.aA = (byte) 0;
        widget.aa = 0;
        return widget;
    }

    public static void a(int i, String str, int i2, int i3, int i4, int i5, int i6, String str2) {
        Widget widgetD = d(i);
        widgetD.E = j(i2, str);
        widgetD.aE = j(i3, str);
        widgetD.I = new int[1];
        widgetD.I[0] = 1;
        widgetD.ap = new int[1];
        widgetD.ap[0] = 1;
        widgetD.X = new int[1][3];
        widgetD.X[0][0] = 5;
        widgetD.X[0][1] = i4;
        widgetD.X[0][2] = 0;
        widgetD.M = 4;
        widgetD.P = i5;
        widgetD.aa = -1;
        widgetD.ag = i;
        widgetD.au = i;
        widgetD.aG = 5;
        widgetD.aP = i6;
        widgetD.Q = str2;
    }

    public static void a(int i, int i2, int i3, int i4, String str, int i5, int i6, String str2, int i7, int i8, int i9) {
        Widget widgetJ = j(i);
        widgetJ.ag = i2;
        widgetJ.au = i;
        widgetJ.aG = 5;
        widgetJ.M = i8;
        widgetJ.J = 0;
        widgetJ.P = i5;
        widgetJ.aP = i6;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i7;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i9;
        widgetJ.X[0][2] = 0;
        widgetJ.E = j(i3, str);
        widgetJ.aE = j(i4, str);
        widgetJ.Q = str2;
    }

    public static void e(int i, int i2) {
        class_210.a(71, i2 - 1, i - 2, 7496785, 1);
        class_210.a(69, i2, i + 174, 7496785, 1);
        class_210.a(1, i2 - 2, i - 2, 7496785, 178);
        class_210.a(1, i2 + 68, i, 7496785, 174);
        class_210.a(71, i2 - 1, i - 1, 3025699, 1);
        class_210.a(71, i2 - 1, i + 175, 3025699, 1);
        class_210.a(1, i2 - 1, i, 3025699, 175);
        class_210.a(1, i2 + 69, i, 3025699, 175);
        class_210.d(i, i2, 174, 68, 0, 220);
    }

    public static void a(int i, int i2, int i3, int i4, int i5, String str, int i6) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = 22500;
        widgetJ.aG = 5;
        widgetJ.M = 4;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i6;
        widgetJ.E = j(0, "prayer/curses/GLOW");
        widgetJ.aE = j(1, "prayer/curses/GLOW");
        widgetJ.P = 34;
        widgetJ.aP = 34;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i2;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i3;
        widgetJ.X[0][2] = 0;
        widgetJ.Q = "Activate@or1@ " + str;
        Widget widgetJ2 = j(i + 1);
        widgetJ2.au = i + 1;
        widgetJ2.ag = 22500;
        widgetJ2.aG = 5;
        widgetJ2.M = 0;
        widgetJ2.J = 0;
        widgetJ2.aA = (byte) 0;
        widgetJ2.E = j(i5, "prayer/curses/PRAYON");
        widgetJ2.aE = j(i5, "prayer/curses/PRAYOFF");
        widgetJ2.P = 34;
        widgetJ2.aP = 34;
        widgetJ2.ap = new int[1];
        widgetJ2.I = new int[1];
        widgetJ2.ap[0] = 2;
        widgetJ2.I[0] = i4 + 1;
        widgetJ2.X = new int[1][3];
        widgetJ2.X[0][0] = 2;
        widgetJ2.X[0][1] = 5;
        widgetJ2.X[0][2] = 0;
    }

    public static void b(int i, int i2, int i3, int i4, int i5, String str) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = 5608;
        widgetJ.aG = 5;
        widgetJ.M = 4;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.E = a(0, "PRAYERGLOW", true);
        widgetJ.aE = a(1, "PRAYERGLOW", true);
        widgetJ.P = 34;
        widgetJ.aP = 34;
        widgetJ.ap = new int[1];
        widgetJ.I = new int[1];
        widgetJ.ap[0] = 1;
        widgetJ.I[0] = i2;
        widgetJ.X = new int[1][3];
        widgetJ.X[0][0] = 5;
        widgetJ.X[0][1] = i3;
        widgetJ.X[0][2] = 0;
        widgetJ.Q = "Activate@or2@ " + str;
        Widget widgetJ2 = j(i + 1);
        widgetJ2.au = i + 1;
        widgetJ2.ag = 5608;
        widgetJ2.aG = 5;
        widgetJ2.M = 0;
        widgetJ2.J = 0;
        widgetJ2.aA = (byte) 0;
        widgetJ2.aa = -1;
        widgetJ2.E = j(i5, "Prayer/PRAYON");
        widgetJ2.aE = j(i5, "Prayer/PRAYOFF");
        widgetJ2.P = 34;
        widgetJ2.aP = 34;
        widgetJ2.ap = new int[1];
        widgetJ2.I = new int[1];
        widgetJ2.ap[0] = 2;
        widgetJ2.I[0] = i4 + 1;
        widgetJ2.X = new int[1][3];
        widgetJ2.X[0][0] = 2;
        widgetJ2.X[0][1] = 5;
        widgetJ2.X[0][2] = 0;
    }

    public static void c(int i, int i2, int i3, int i4, int i5, String str) {
        Widget widgetD = d(i);
        widgetD.E = d(i2, "");
        widgetD.aE = d(i2, "a");
        widgetD.I = new int[1];
        widgetD.I[0] = 1;
        widgetD.ap = new int[1];
        widgetD.ap[0] = 1;
        widgetD.X = new int[1][3];
        widgetD.X[0][0] = 5;
        widgetD.X[0][1] = i3;
        widgetD.X[0][2] = 0;
        widgetD.M = 4;
        widgetD.P = i4;
        widgetD.aa = -1;
        widgetD.ag = i;
        widgetD.au = i;
        widgetD.aG = 5;
        widgetD.aP = i5;
        widgetD.Q = str;
    }

    public static void g(int i) {
        H[i] = new Widget();
    }

    public static void b(int i, int i2, int i3, int i4, Widget widget) {
        widget.ak[i4] = i;
        widget.al[i4] = i2;
        widget.ba[i4] = i3;
    }

    public static void a(int i, class_338[] class_338VarArr, int i2) {
        H[i].an = class_338VarArr[i2];
    }

    protected static void c(int i, String str) {
        H[i].Q = "Activate@or2@ " + str;
    }

    public static void a(int i, int i2, int i3, String str) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = 5608;
        widgetJ.aG = 5;
        widgetJ.M = 0;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i2;
        widgetJ.aE = j(0, "tabs/prayer/hover/PRAYERH");
        widgetJ.E = j(0, "tabs/prayer/hover/PRAYERH");
        widgetJ.P = 34;
        widgetJ.aP = 34;
        Widget widgetJ2 = j(i2);
        widgetJ2.au = i2;
        widgetJ2.ag = 5608;
        widgetJ2.aG = 0;
        widgetJ2.M = 0;
        widgetJ2.J = 0;
        widgetJ2.aA = (byte) 0;
        widgetJ2.aa = -1;
        widgetJ2.P = 512;
        widgetJ2.aP = 334;
        widgetJ2.aO = true;
        a(i2 + 1, 0, false, 0, str);
        a(1, widgetJ2);
        b(i2 + 1, 0, 0, 0, widgetJ2);
    }

    public static void h(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 6;
        widget.M = 0;
        widget.J = 328;
        widget.P = 136;
        widget.aP = 168;
        widget.aA = (byte) 0;
        widget.aa = 0;
        widget.aR = 560;
        widget.aS = 150;
        widget.aT = 0;
        widget.aB = -1;
        widget.aC = -1;
    }

    public static void b(int i, int i2, int i3, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.E = a(i2, u, str);
        widget.aE = a(i3, u, str);
        widget.ag = i;
        widget.au = i;
        widget.aG = 5;
    }

    public void a(int i, class_338[] class_338VarArr) {
        a(i - 12, 7587, -1, 150, 26, "Use @gre@Special Attack");
        for (int i2 = i - 11; i2 < i; i2++) {
            g(i2);
        }
        Widget widget = H[i - 12];
        widget.P = 150;
        widget.aP = 26;
        widget.aa = 40005;
        Widget widget2 = H[i];
        widget2.P = 150;
        widget2.aP = 26;
        widget2.b(0, i - 12, 0, 0);
        widget2.b(12, i + 1, 3, 7);
        widget2.b(23, i + 12, 16, 8);
        for (int i3 = 13; i3 < 23; i3++) {
            int[] iArr = widget2.ba;
            int i4 = i3;
            iArr[i4] = iArr[i4] - 1;
        }
        Widget widget3 = H[i + 1];
        widget3.aG = 5;
        widget3.E = d(7600, "");
        for (int i5 = i + 2; i5 < i + 12; i5++) {
            H[i5].aG = 5;
        }
        c(i + 2, 7601);
        c(i + 3, 7602);
        c(i + 4, 7603);
        c(i + 5, 7604);
        c(i + 6, 7605);
        c(i + 7, 7606);
        c(i + 8, 7607);
        c(i + 9, 7608);
        c(i + 10, 7609);
        c(i + 11, 7610);
        Widget widgetD = d(40005);
        widgetD.aO = true;
        widgetD.aG = 0;
        widgetD.M = 0;
        widgetD.aa = -1;
        widgetD.ag = 40005;
        widgetD.au = 40005;
        a(40006, 0, false, 0, "Select to perform a special\nattack.");
        a(1, widgetD);
        b(40006, 0, 0, 0, widgetD);
    }

    public static void a(int i, int i2, String str, class_338[] class_338VarArr) {
        H[i].aa = i2;
        Widget widgetD = d(i2);
        widgetD.aO = true;
        widgetD.aG = 0;
        widgetD.M = 0;
        widgetD.aa = -1;
        widgetD.ag = i2;
        widgetD.au = i2;
        a(i2 + 1, 0, false, 0, str);
        a(1, widgetD);
        b(i2 + 1, 0, 0, 0, widgetD);
    }

    public static void b(int i, String str, class_338[] class_338VarArr, int i2, int i3, boolean z) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        if (z) {
            widget.S = true;
        }
        widget.aQ = true;
        widget.an = class_338VarArr[i2];
        widget.as = str;
        widget.ac = i3;
        widget.au = i;
        widget.aG = 4;
    }

    public static void a(int i, int i2, int i3, int i4, int i5, String str, int i6, int i7, int i8, String str2, class_338[] class_338VarArr) {
        Widget widgetD = d(i);
        widgetD.E = d(i2, "");
        widgetD.aE = d(i2, "a");
        widgetD.ap = new int[1];
        widgetD.ap[0] = 1;
        widgetD.I = new int[1];
        widgetD.I[0] = 1;
        widgetD.X = new int[1][3];
        widgetD.X[0][0] = 5;
        widgetD.X[0][1] = i3;
        widgetD.X[0][2] = 0;
        widgetD.M = 4;
        widgetD.P = i4;
        widgetD.aa = i6;
        widgetD.ag = i;
        widgetD.au = i;
        widgetD.aG = 5;
        widgetD.aP = i5;
        widgetD.Q = str;
        Widget widgetD2 = d(i6);
        widgetD2.aO = true;
        widgetD2.aG = 0;
        widgetD2.M = 0;
        widgetD2.aa = -1;
        widgetD2.ag = i6;
        widgetD2.au = i6;
    }

    public static void a(int i, int i2, boolean z, int i3, String str) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 9;
        widgetD.aA = (byte) i2;
        widgetD.Y = z;
        widgetD.aa = -1;
        widgetD.M = 0;
        widgetD.J = 0;
        widgetD.ac = i3;
        widgetD.as = str;
    }

    public static void a(int i, Widget widget) {
        widget.ak = new int[i];
        widget.al = new int[i];
        widget.ba = new int[i];
    }

    protected static class_333 d(int i, String str) {
        long jB = (class_39.b(str) << 8) + ((long) i);
        class_333 class_333Var = (class_333) b.a(jB);
        if (class_333Var != null) {
            return class_333Var;
        }
        try {
            class_333 class_333Var2 = new class_333("/Attack/" + i + str);
            b.a(class_333Var2, jB);
            return class_333Var2;
        } catch (Exception e) {
            return null;
        }
    }

    public static void e(int i, String str) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 9;
        widgetD.as = str;
    }

    public static void f(int i, String str) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.aG = 0;
        widgetD.aO = true;
        widgetD.aa = -1;
        e(i + 1, str);
        widgetD.k(1);
        widgetD.b(0, i + 1, 0, 0);
    }

    public static void c(int i, String str, class_338[] class_338VarArr, int i2, int i3, boolean z) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.au = i;
        widgetJ.aG = 4;
        widgetJ.M = 0;
        widgetJ.P = 0;
        widgetJ.aP = 11;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.U = true;
        widgetJ.aQ = z;
        widgetJ.an = class_338VarArr[i2];
        widgetJ.as = str;
        widgetJ.Z = "";
        widgetJ.ac = i3;
        widgetJ.O = 0;
        widgetJ.L = 0;
        widgetJ.aj = 0;
    }

    public static void a(int i, String str, int i2, boolean z, boolean z2, int i3, class_338[] class_338VarArr, int i4) {
        Widget widgetD = d(i);
        widgetD.ag = i;
        widgetD.au = i;
        widgetD.aG = 4;
        widgetD.M = 0;
        widgetD.P = 0;
        widgetD.aP = 0;
        widgetD.J = 0;
        widgetD.aA = (byte) 0;
        widgetD.aa = i3;
        widgetD.S = z;
        widgetD.aQ = z2;
        widgetD.an = class_338VarArr[i4];
        widgetD.as = str;
        widgetD.Z = "";
        widgetD.ac = i2;
    }

    public static void d(int i, int i2, int i3) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 1;
        widget.J = 0;
        widget.P = 20;
        widget.aP = 20;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = j(i2, "Equipment/SPRITE");
        widget.aE = j(i3, "Equipment/SPRITE");
    }

    public static void a(int i, int i2, int i3, int i4, int i5, String str, int i6, int i7, String str2) {
        Widget widgetD = d(i);
        widgetD.au = i;
        widgetD.ag = i;
        widgetD.aG = 5;
        widgetD.M = i2;
        widgetD.J = i3;
        widgetD.aa = i4;
        widgetD.E = j(i5, str);
        widgetD.aE = j(i5, str);
        widgetD.P = i6;
        widgetD.aP = i7;
        widgetD.Q = str2;
    }

    public static void a(int i, int i2, String str, int i3, int i4, int i5) {
        Widget widgetD = d(i);
        widgetD.ag = i;
        widgetD.au = i;
        widgetD.aG = 0;
        widgetD.M = 0;
        widgetD.P = i3;
        widgetD.aP = i4;
        widgetD.aO = true;
        widgetD.aa = -1;
        c(i5, i2, str);
        a(1, widgetD);
        b(i5, 0, 0, 0, widgetD);
    }

    public static void a(int i, String str, class_338[] class_338VarArr, int i2, int i3, boolean z, boolean z2) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.au = i;
        widgetJ.aG = 4;
        widgetJ.M = 0;
        widgetJ.P = 0;
        widgetJ.aP = 11;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.S = z;
        widgetJ.aQ = z2;
        widgetJ.an = class_338VarArr[i2];
        widgetJ.as = str;
        widgetJ.Z = "";
        widgetJ.ac = i3;
        widgetJ.O = 0;
        widgetJ.L = 0;
        widgetJ.aj = 0;
    }

    public Widget e() {
        this.aw = new String[this.ax.length];
        return this;
    }

    public static void a(int i, String str, class_338[] class_338VarArr, class_338 class_338Var, int i2, boolean z, boolean z2) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.au = i;
        widgetJ.aG = 4;
        widgetJ.M = 0;
        widgetJ.P = 0;
        widgetJ.aP = 11;
        widgetJ.J = 0;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.S = z;
        widgetJ.aQ = z2;
        widgetJ.an = class_338Var;
        widgetJ.as = str;
        widgetJ.Z = "";
        widgetJ.ac = i2;
        widgetJ.O = 0;
        widgetJ.L = 0;
        widgetJ.aj = 0;
    }

    public static void g(int i, String str) {
        Widget widget = H[i];
        widget.au = i;
        widget.ag = i;
        widget.aO = true;
        widget.aG = 8;
        widget.k = str;
    }

    public static void a(int i, int i2, String str, String str2) {
        String lowerCase = str.toLowerCase();
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.l = true;
        widget.M = 1;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        if (lowerCase.equalsIgnoreCase("fountain/sprite") && i2 == 1) {
            widget.E = class_395.c;
            widget.aE = class_395.c;
        } else {
            widget.E = j(i2, lowerCase);
            widget.aE = j(i2, lowerCase);
        }
        widget.P = widget.E.n;
        widget.aP = widget.aE.o;
        widget.Q = str2;
    }

    public static Widget b(int i, int i2, String str, String str2) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 1;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = j(i2, str);
        widget.aE = j(i2, str);
        widget.P = widget.E.n;
        widget.aP = widget.aE.o;
        widget.Q = str2;
        return widget;
    }

    public static void a(int i, String str, String str2) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 1;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = new class_333(false, str);
        widget.aE = new class_333(false, str);
        widget.P = widget.E.n;
        widget.aP = widget.aE.o;
        widget.Q = str2;
    }

    public Widget a(String str) {
        this.aE = new class_333(false, str);
        this.bx = true;
        return this;
    }

    public static void c(int i, int i2, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = j(i2, str);
        widget.aE = j(i2, str);
        widget.P = 512;
        widget.aP = 334;
    }

    public void f() {
        this.bn = true;
        this.P = 765;
        this.aP = 503;
    }

    public static void addSprite(int i, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = new class_333(false, str);
        widget.aE = new class_333(false, str);
        widget.P = 512;
        widget.aP = 334;
    }

    public static void i(int i, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = new class_333(false, str);
        widget.aE = new class_333(false, str);
        widget.E.j = true;
        widget.aE.j = true;
        widget.P = 512;
        widget.aP = 334;
    }

    public static void a(int i, String str, int i2, int i3, int i4, String str2, int i5, int i6, int i7) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = i7;
        widgetJ.J = i5;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = i6;
        widgetJ.E = j(i2, str);
        widgetJ.aE = j(i2, str);
        widgetJ.P = i3;
        widgetJ.aP = i4;
        widgetJ.Q = str2;
    }

    public static void a(int i, String str, int i2, int i3, int i4, int i5) {
        Widget widgetJ = j(i);
        widgetJ.ag = i;
        widgetJ.au = i;
        widgetJ.aG = 0;
        widgetJ.M = 0;
        widgetJ.P = i3;
        widgetJ.aP = i4;
        widgetJ.aO = true;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = -1;
        widgetJ.aF = 0;
        c(i5, i2, i2, str);
        widgetJ.k(1);
        widgetJ.b(0, i5, 0, 0);
    }

    public static void c(int i, int i2, int i3, String str) {
        Widget widgetJ = j(i);
        widgetJ.au = i;
        widgetJ.ag = i;
        widgetJ.aG = 5;
        widgetJ.M = 0;
        widgetJ.J = 0;
        widgetJ.P = 512;
        widgetJ.aP = 334;
        widgetJ.aA = (byte) 0;
        widgetJ.aa = 52;
        widgetJ.E = j(i2, str);
        widgetJ.aE = j(i3, str);
    }

    public static void d(int i, int i2, String str) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 5;
        widget.M = 0;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = 52;
        widget.E = j(i2, str);
        widget.aE = j(i2, str);
        widget.P = 512;
        widget.aP = 334;
        widget.v = true;
    }

    public static Widget i(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 0;
        widget.M = 0;
        widget.J = 0;
        widget.P = 512;
        widget.aP = 334;
        widget.aA = (byte) 0;
        widget.aa = 0;
        return widget;
    }

    public static Widget j(int i) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 0;
        widget.M = 0;
        widget.J = 0;
        widget.P = 512;
        widget.aP = 700;
        widget.aA = (byte) 0;
        widget.aa = -1;
        return widget;
    }

    public static Widget a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Widget[] widgetArr = H;
        Widget widget = new Widget();
        widgetArr[i] = widget;
        widget.au = i;
        widget.ag = i;
        widget.aG = 15;
        widget.M = 0;
        widget.J = 0;
        widget.aA = (byte) 0;
        widget.aa = -1;
        widget.P = i2;
        widget.aP = i3;
        widget.B = i4;
        widget.A = i5;
        widget.x = i6;
        widget.y = i7;
        widget.z = i8;
        return widget;
    }

    public static Widget e(int i, int i2, int i3) {
        return a(i, i2, i3, 1, 1, 7960953, 16760832, bk.ao);
    }

    public static class_333 j(int i, String str) {
        return a(i, str, false);
    }

    public static class_333 a(int i, String str, boolean z) {
        class_333 class_333Var;
        if (str == null) {
            return null;
        }
        long jB = (class_39.b(str) << 8) + ((long) i);
        class_333 class_333Var2 = null;
        class_30 class_30Var = z ? b : c;
        if (c != null && 0 == 0) {
            class_333Var2 = (class_333) class_30Var.a(jB);
        }
        if (b != null && class_333Var2 == null) {
            class_333Var2 = (class_333) class_30Var.a(jB);
        }
        if (class_333Var2 != null) {
            return class_333Var2;
        }
        try {
            if (z) {
                class_333Var = str.endsWith("/") ? new class_333(str + i) : new class_333(str + " " + i);
            } else {
                class_333Var = str.endsWith("/") ? new class_333(false, str + i) : new class_333(false, str + " " + i);
            }
            if (class_30Var != null) {
                class_30Var.a(class_333Var, jB);
            }
            return class_333Var;
        } catch (Exception e) {
            return null;
        }
    }

    public void g() {
        if (this.E != null && !this.E.i) {
            this.E.c();
        }
        if (this.aE == null || this.aE.i) {
            return;
        }
        this.aE.c();
    }

    public void b(int i, int i2, int i3, int i4) {
        this.ak[i] = i2;
        this.al[i] = i3;
        this.ba[i] = i4;
    }

    public void c(int i, int i2, int i3, int i4) {
        this.ak[i] = i2;
        this.al[i] = i3;
        this.ba[i] = i4 - 19;
    }

    public void k(int i) {
        this.ak = new int[i];
        this.al = new int[i];
        this.ba = new int[i];
    }

    private ColorUtility g(int i, int i2) {
        ColorUtility colorUtilityA = (ColorUtility) aM.a((((long) i) << 16) + ((long) i2));
        if (colorUtilityA != null) {
            return colorUtilityA;
        }
        if (i == 1) {
            colorUtilityA = ColorUtility.e(i2);
        }
        if (i == 2) {
            colorUtilityA = class_102.c(i2).b();
        }
        if (i == 3) {
            colorUtilityA = Client.eR.n();
        }
        if (i == 4) {
            colorUtilityA = ItemComposition.lookupItem(i2).i(50);
        }
        if (i == 5) {
            colorUtilityA = null;
        }
        if (i == 10) {
            colorUtilityA = class_102.c(i2).a();
        }
        if (colorUtilityA != null) {
            aM.a(colorUtilityA, (i << 16) + i2);
        }
        return colorUtilityA;
    }

    private static class_333 a(int i, class_663 class_663Var, String str) {
        long jB = (class_39.b(str) << 8) + ((long) i);
        class_333 class_333Var = (class_333) b.a(jB);
        if (class_333Var != null) {
            return class_333Var;
        }
        try {
            class_333 class_333Var2 = new class_333(class_663Var, str, i);
            b.a(class_333Var2, jB);
            return class_333Var2;
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(boolean z, ColorUtility colorUtility) {
        if (z) {
            return;
        }
        aM.a();
        if (colorUtility == null || 5 == 4) {
            return;
        }
        aM.a(colorUtility, (5 << 16) + 0);
    }

    public static void a(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
        try {
            Widget widgetJ = j(i);
            widgetJ.ag = i;
            widgetJ.au = i;
            widgetJ.aG = 4;
            widgetJ.M = 0;
            widgetJ.P = 0;
            widgetJ.aP = 0;
            widgetJ.J = 0;
            widgetJ.aA = (byte) 0;
            widgetJ.bh = i4;
            widgetJ.S = z;
            widgetJ.bk = z2;
            widgetJ.an = Client.bk[i5];
            widgetJ.as = str;
            widgetJ.Z = str2;
            widgetJ.bb = i2;
            widgetJ.ac = i3;
            widgetJ.O = i3;
        } catch (Exception e) {
        }
    }

    public ColorUtility a(int i, int i2, boolean z, int i3, int i4) {
        ColorUtility colorUtility;
        ItemComposition itemCompositionLookupItem;
        ColorUtility colorUtilityG = z ? g(this.d, this.e) : g(this.ad, this.ae);
        if (colorUtilityG == null) {
            return null;
        }
        if (i2 == -1 && i == -1 && colorUtilityG.ar == null) {
            return colorUtilityG;
        }
        if (i3 <= 0 || !class_99.a[i3].b()) {
            colorUtility = new ColorUtility(true, class_176.g(i2) & class_176.g(i), false, colorUtilityG);
            if (i2 != -1 || i != -1) {
                colorUtility.n();
            }
            if (i2 != -1) {
                colorUtility.f(i2, i3);
            }
            if (i != -1) {
                colorUtility.f(i, i4);
            }
        } else {
            colorUtility = (i4 <= 0 || i4 == i3) ? class_99.a[i3].a(colorUtilityG, i2) : class_99.a[i3].a(colorUtilityG, i2, class_99.a[i4], i);
        }
        if (this.ae == 4907) {
            if (colorUtility != null && colorUtility.ar != null) {
                try {
                    colorUtility.b(84, 1000, -90, -580, -90, true);
                } catch (Exception e) {
                }
            }
        } else {
            if (this.aL > 0 && (itemCompositionLookupItem = ItemComposition.lookupItem(this.aL)) != null) {
                boolean z2 = itemCompositionLookupItem.U;
                itemCompositionLookupItem.U = true;
                try {
                    ItemComposition.a(itemCompositionLookupItem, this.aL);
                    return itemCompositionLookupItem.h(this.bo);
                } finally {
                    itemCompositionLookupItem.U = z2;
                }
            }
            class_332.h = true;
            colorUtility.b(64, 768, -50, -10, -50, true);
            class_332.h = false;
        }
        if (this.aU != 128 || this.aV != 128) {
            colorUtility.b(this.aU, this.aU, this.aU);
        }
        if (this.aW && colorUtility != null) {
            d dVar = (d) n.a(this.ae);
            if (dVar == null) {
                colorUtility.m();
                dVar = new d();
                dVar.f = colorUtility.az;
                dVar.i = colorUtility.aA;
                dVar.g = colorUtility.g;
                dVar.j = colorUtility.aE;
                dVar.h = colorUtility.aC;
                dVar.k = colorUtility.aB;
                dVar.l = colorUtility.aG;
                dVar.m = colorUtility.aF;
            }
            colorUtility.g = dVar.g;
            colorUtility.aE = dVar.j;
            colorUtility.aA = dVar.i;
            colorUtility.az = dVar.f;
            colorUtility.aB = dVar.k;
            colorUtility.aC = dVar.h;
            colorUtility.aF = dVar.m;
            colorUtility.aG = dVar.l;
            n.a(dVar, this.ae);
        }
        return colorUtility;
    }

    public void f(int i, int i2) {
    }

    public static Widget l(int i) {
        return H[i];
    }
}
