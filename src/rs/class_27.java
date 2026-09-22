package rs;

import com.jacob.com.Dispatch;
import com.sun.jna.platform.win32.aU;
import java.applet.Applet;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import org.lwjgl.opengl.CGL;
import rs.gui.Launcher;
import rs.lpkg.b;
import rs.lpkg.e;
import rs.runelite.a.g;
import rs.runelite.a.i;
import rs.runelite.events.FocusChanged;

/* JADX INFO: loaded from: client-final.jar:rs/class_27.class */
public class class_27 extends Applet implements ComponentListener, FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener, Runnable {
    public class_70 gI;
    static class_27 gJ;
    static long gK;
    static boolean gL;
    static int gM;
    static int gN;
    volatile boolean gO;
    boolean gP;
    volatile boolean gQ;
    public static int gR;
    static long[] gS;
    static long[] gT;
    static int gU;
    static int gV;
    static volatile boolean gW;
    static long gX;
    static long gY;
    public class_330 gZ;
    public class_330 ha;
    public static int he;
    public static int hf;
    static int hg;
    public static int hi;
    public static int hj;
    protected int hk;
    protected int hl;
    int hm;
    int hn;
    int ho;
    int hp;
    static class_161 hq;
    static long hr;
    static long hs;
    public boolean ht;
    public int hu;
    public int hv;
    public int hw;
    public int hx;
    public static boolean hy;
    public static boolean hz;
    private static final Stroke d;
    private static final Stroke e;
    private static final double f = 0.0030679615757712823d;
    public static final int[] hA;
    public static final int[] hB;
    public int hE;
    public int hF;
    public Graphics hG;
    public class_29 hH;
    public int hK;
    public long hL;
    int hM;
    public static int hN;
    public static int hO;
    public static int hP;
    public static int hQ;
    private int i;
    private int j;
    private int k;
    private long l;
    public int hR;
    int hS;
    int hT;
    long hU;
    private int n;
    private int o;
    public static int hW;
    static final /* synthetic */ boolean hX;
    int hc = 0;
    int hd = 0;
    long hh = System.currentTimeMillis();
    private boolean a = false;
    private int b = 0;
    private int c = 0;
    volatile long hb = 0;
    private int g = 20;
    int hC = 1;
    private final long[] h = new long[10];
    boolean hD = false;
    public boolean hI = true;
    public boolean hJ = true;
    public final int[] hV = new int[128];
    private final int[] m = new int[128];

    void aR() {
        gT[gU] = bd();
        gU = (gU + 1) & 31;
        this.hR = this.i;
        this.hS = this.j;
        this.hT = this.k;
        this.hU = this.l;
        this.i = 0;
        q();
        this.n = this.o;
    }

    final synchronized void aS() {
        if (gL) {
            return;
        }
        gL = true;
    }

    public final void l(int i, int i2) {
        gJ = this;
        this.hE = i2;
        this.hF = i;
        this.hH = new class_29(this, this.hE, this.hF);
        this.hG = z().getGraphics();
        this.ha = new class_330(this.hE, this.hF, z());
        this.gZ = new class_330(this.hE, this.hF, z());
        a(this, 1);
    }

    public final void m(int i, int i2) {
        gJ = this;
        this.hE = i;
        this.hF = i2;
        ba();
        this.hG = getGraphics();
    }

    public final void n(int i, int i2) {
        gJ = this;
        this.hE = i2;
        this.hF = i;
        this.hG = Launcher.n().j().getGraphics();
        setBackground(new Color(10, 10, 10));
        this.hc = 5;
        this.ha = new class_330(this.hE, this.hF, z());
        this.gZ = new class_330(this.hE, this.hF, z());
        setFocusTraversalKeysEnabled(false);
        a(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00c3, please report this as an issue */
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int wheelRotation = mouseWheelEvent.getWheelRotation();
        a(mouseWheelEvent);
        boolean z = Client.ag() ? Client.ai - hP <= 155 && hQ <= 162 : hP > 526 && hQ < 150;
        if (Launcher.n() != null && Launcher.n().o() != null && wheelRotation != 0) {
            if (z) {
                Client clientO = Launcher.n().o();
                clientO.fh += wheelRotation * 35;
                if (clientO.fh > 210) {
                    clientO.fh = aU.ht_;
                }
                if (clientO.fh < 0) {
                    clientO.fh = 0;
                }
            } else if (Launcher.n().o().fc && Launcher.n().o().E()) {
                Launcher.n().o();
                if (Client.cH == -1) {
                    i = Client.ch ? 200 : 100;
                    if (class_205.g()) {
                        i = 50;
                    }
                    if (wheelRotation < 0) {
                        i2 = (-1) * i;
                    } else {
                        i2 = i;
                    }
                    Client.al += i2;
                    if (Configuration.ai == class_151.a) {
                        i3 = he;
                    } else {
                        i3 = hf;
                    }
                    i4 = i3;
                    if (class_205.g()) {
                        i5 = Dispatch.p;
                    } else {
                        i5 = 0;
                    }
                    i6 = i5;
                    if (Client.al > i4) {
                        Client.al = i4;
                    }
                    if (Client.al < i6) {
                        Client.al = i6;
                    }
                } else if (class_205.d) {
                    if (Client.ch) {
                    }
                    if (class_205.g()) {
                        i = 50;
                    }
                    if (wheelRotation < 0) {
                        i2 = (-1) * i;
                    } else {
                        i2 = i;
                    }
                    Client.al += i2;
                    if (Configuration.ai == class_151.a) {
                        i3 = he;
                    } else {
                        i3 = hf;
                    }
                    i4 = i3;
                    if (class_205.g()) {
                        i5 = Dispatch.p;
                    } else {
                        i5 = 0;
                    }
                    i6 = i5;
                    if (Client.al > i4) {
                        Client.al = i4;
                    }
                    if (Client.al < i6) {
                        Client.al = i6;
                    }
                }
            } else if (class_205.d) {
                if (Client.ch) {
                }
                if (class_205.g() && Client.al < 0) {
                    i = 50;
                }
                if (wheelRotation < 0) {
                    i2 = (-1) * i;
                } else {
                    i2 = i;
                }
                Client.al += i2;
                if (Configuration.ai == class_151.a) {
                    i3 = he;
                } else {
                    i3 = hf;
                }
                i4 = i3;
                if (class_205.g()) {
                    i5 = Dispatch.p;
                } else {
                    i5 = 0;
                }
                i6 = i5;
                if (Client.al > i4) {
                    Client.al = i4;
                }
                if (Client.al < i6) {
                    Client.al = i6;
                }
            }
        }
        if (Launcher.n().o().d(hP, hQ)) {
            int i7 = Client.eD - (wheelRotation * 30);
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > Client.fA - 110) {
                i7 = Client.fA - 110;
            }
            if (Client.eD != i7) {
                Client.eD = i7;
                Client.fM = true;
            }
            if (Launcher.n() == null || Launcher.n().o() == null || Launcher.n().o().gp != 67027) {
                return;
            }
            Widget widget = Widget.H[67027];
            for (int i8 = 0; i8 < widget.ak.length; i8++) {
                if (Widget.H[widget.ak[i8]].aF > 0) {
                    Widget.H[widget.ak[i8]].V += wheelRotation * 30;
                }
            }
        }
    }

    public void a(MouseWheelEvent mouseWheelEvent) {
        int i;
        int wheelRotation = mouseWheelEvent.getWheelRotation();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = Client.eT[Client.fL];
        if (i7 != -1) {
            Widget widget = Widget.H[i7];
            int i8 = Configuration.ai == class_151.a ? Client.ai - 218 : Configuration.ai == class_151.a ? 28 : Client.ai - 197;
            if (Configuration.ai == class_151.a) {
                i = Client.ah - aU.ia_;
            } else if (Configuration.ai == class_151.a) {
                i = 37;
            } else {
                i = (Client.ah - (Client.ai >= 1000 ? 37 : 74)) - aU.hT_;
            }
            int i9 = i;
            for (int i10 = 0; i10 < widget.ak.length; i10++) {
                if (Widget.H[widget.ak[i10]].aF > 0) {
                    i6 = i10;
                    i2 = widget.al[i10];
                    i3 = widget.ba[i10];
                    i4 = Widget.H[widget.ak[i10]].P;
                    i5 = Widget.H[widget.ak[i10]].aP;
                    break;
                }
            }
            if (hP > i8 + i2 && hQ > i9 + i3 && hP < i8 + i2 + i4 && hQ < i9 + i3 + i5) {
                Widget.H[widget.ak[i6]].V += wheelRotation * 30;
                Client.menuIndex = true;
                Client.fb = true;
            }
        }
        if (Client.cH != -1) {
            Client clientO = Launcher.n().o();
            Widget widget2 = Widget.H[Client.cH == 23000 ? 5292 : Client.cH];
            int i11 = Configuration.ai == class_151.a ? 4 : (Client.ai / 2) - 360;
            int i12 = Configuration.ai == class_151.a ? 4 : (Client.ah / 2) - 240;
            if (widget2.C != Integer.MAX_VALUE) {
                i11 = widget2.C;
            }
            if (widget2.D != Integer.MAX_VALUE) {
                i12 = widget2.D;
            }
            if (Client.ah() && clientO.v.h() && !clientO.f()) {
                i12 += 37;
            }
            for (int i13 = 0; i13 < widget2.ak.length; i13++) {
                if (Widget.H[widget2.ak[i13]].aF > 0 && (Client.cI == -1 || Widget.H[widget2.ak[i13]].by == Client.cI)) {
                    int i14 = i13;
                    int i15 = widget2.al[i13];
                    int i16 = widget2.ba[i13];
                    int i17 = Widget.H[widget2.ak[i13]].P;
                    int i18 = Widget.H[widget2.ak[i13]].aP;
                    if (hP > i11 + i15 && hQ > i12 + i16 && hP < i11 + i15 + i17 && hQ < i12 + i16 + i18) {
                        Widget.H[widget2.ak[i14]].V += wheelRotation * 30;
                    }
                }
            }
        }
    }

    void aT() {
        long jBd = bd();
        long j = gS[hg];
        gS[hg] = jBd;
        hg = (hg + 1) & 31;
        if (j != 0 && jBd > j) {
            int i = (int) (jBd - j);
            gR = ((i >> 1) + 32000) / i;
        }
        int i2 = gV + 1;
        gV = i2;
        if (i2 - 1 > 50) {
            gV -= 50;
        }
        aU();
        R();
        this.hh = System.currentTimeMillis();
    }

    final void aU() {
        class_158 class_158VarAX = aX();
        if (this.hk == class_158VarAX.c && class_158VarAX.d == this.hl && !this.gP) {
            return;
        }
        aY();
        this.gP = false;
    }

    final void aV() {
        this.gP = true;
    }

    Container aW() {
        return this.hH != null ? this.hH : this;
    }

    public class_158 aX() {
        Container containerAW = aW();
        int iMax = Math.max(containerAW.getWidth(), 0);
        int iMax2 = Math.max(containerAW.getHeight(), 0);
        if (this.hH != null) {
            Insets insets = this.hH.getInsets();
            iMax -= insets.left + insets.right;
            iMax2 -= insets.top + insets.bottom;
        }
        return new class_158(iMax, iMax2);
    }

    public void i() {
    }

    public void j() {
    }

    public final void aY() {
        if (Launcher.n().o().aw()) {
            Launcher.n().o().g(false);
            Dimension dimensionAC = Launcher.n().o().aC();
            this.ho = dimensionAC.width;
            this.hp = dimensionAC.height;
            if (aW() != null) {
                class_158 class_158VarAX = aX();
                this.hk = Math.max(class_158VarAX.c, 0);
                this.hl = Math.max(class_158VarAX.d, 0);
                if (this.hk <= 0) {
                    this.hk = 1;
                }
                if (this.hl <= 0) {
                    this.hl = 1;
                }
                this.ho = this.hk;
                this.hp = this.hl;
                hi = Math.min(this.hk, this.ho);
                hj = Math.min(this.hl, this.hp);
                Client clientO = Launcher.n().o();
                this.hm = ((int) (((double) clientO.z().getWidth()) - Launcher.n().o().aD().getWidth())) / 2;
                this.hn = 0;
                this.gI.setSize(hi, hj);
                this.gI.setLocation(this.hm, this.hn);
                i();
                j();
                class_210.d();
                if (clientO.fc && clientO.cd && e.a()) {
                    b.g = Launcher.n().p().n().getWidth();
                    b.h = Launcher.n().p().n().getHeight();
                }
            }
        }
    }

    public boolean aZ() {
        return this.a;
    }

    final synchronized void ba() {
        this.gI = new class_70(this);
        this.gQ = false;
    }

    public void run() {
        ba();
        z().addMouseListener(this);
        z().addMouseMotionListener(this);
        z().addKeyListener(this);
        z().addFocusListener(this);
        z().addMouseWheelListener(this);
        z().addComponentListener(this);
        z().addComponentListener(new class_28(this));
        if (this.hH != null) {
            this.hH.addWindowListener(this);
        }
        a(0, "Loading...");
        J();
        int i = 0;
        int i2 = 256;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 10; i6++) {
            this.h[i6] = System.currentTimeMillis();
        }
        hq = bc();
        while (gK == 0) {
            if (e.a()) {
                int iA = hq.a(this.g, 1);
                this.a = iA > 0;
                for (int i7 = 0; i7 < iA; i7++) {
                    aR();
                }
                aT();
            } else {
                int i8 = i2;
                int i9 = i3;
                i2 = 300;
                i3 = 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.h[i] == 0) {
                    i2 = i8;
                    i3 = i9;
                } else if (jCurrentTimeMillis > this.h[i]) {
                    i2 = (int) (((long) (2560 * this.g)) / (jCurrentTimeMillis - this.h[i]));
                }
                if (i2 < 25) {
                    i2 = 25;
                }
                if (i2 > 256) {
                    i2 = 256;
                    i3 = (int) (((long) this.g) - ((jCurrentTimeMillis - this.h[i]) / 10));
                }
                if (i3 > this.g) {
                    i3 = this.g;
                }
                this.h[i] = jCurrentTimeMillis;
                i = (i + 1) % 10;
                if (i3 > 1) {
                    for (int i10 = 0; i10 < 10; i10++) {
                        if (this.h[i10] != 0) {
                            long[] jArr = this.h;
                            int i11 = i10;
                            jArr[i11] = jArr[i11] + ((long) i3);
                        }
                    }
                }
                if (i3 < this.hC) {
                    i3 = this.hC;
                }
                try {
                    Thread.sleep(i3);
                } catch (InterruptedException e2) {
                    i5++;
                }
                while (i4 < 256) {
                    this.hR = this.i;
                    this.hS = this.j;
                    this.hT = this.k;
                    this.hU = this.l;
                    this.i = 0;
                    q();
                    this.n = this.o;
                    i4 += i2;
                }
                i4 &= 255;
                if (this.g > 0) {
                    gR = (1000 * i2) / (this.g * 256);
                }
                R();
                if (this.hD) {
                    System.out.println("ntime:" + jCurrentTimeMillis);
                    for (int i12 = 0; i12 < 10; i12++) {
                        int i13 = (((i - i12) - 1) + 20) % 10;
                        System.out.println("otim" + i13 + ":" + this.h[i13]);
                    }
                    System.out.println("fps:" + gR + " ratio:" + i2 + " count:" + i4);
                    System.out.println("del:" + i3 + " deltime:" + this.g + " mindel:" + this.hC);
                    System.out.println("intex:" + i5 + " opos:" + i);
                    this.hD = false;
                    i5 = 0;
                }
            }
        }
        if (gK == -1) {
            bb();
        }
    }

    public void bb() {
        gK = -2L;
        try {
            y();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.hH != null) {
            try {
                Thread.sleep(1000L);
            } catch (Exception e3) {
            }
            try {
                System.exit(0);
            } catch (Throwable th) {
            }
        }
    }

    public final void v(int i) {
        this.g = 1000 / i;
    }

    public static class_161 bc() {
        try {
            return new class_163();
        } catch (Throwable th) {
            th.printStackTrace();
            return new class_162();
        }
    }

    public final void start() {
        if (this != gJ || gL) {
            return;
        }
        gK = 0L;
    }

    public final void stop() {
        if (this != gJ || gL) {
            return;
        }
        gK = bd() + 4000;
    }

    public static synchronized long bd() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < hr) {
            hs += hr - jCurrentTimeMillis;
        }
        hr = jCurrentTimeMillis;
        return hs + jCurrentTimeMillis;
    }

    public final void destroy() {
        gK = -1L;
        try {
            Thread.sleep(5000L);
        } catch (Exception e2) {
        }
        if (gK == -1) {
            bb();
        }
    }

    public final void update(Graphics graphics) {
        if (this.hG == null) {
            this.hG = graphics.create();
        }
        this.hI = true;
        X();
    }

    public final void paint(Graphics graphics) {
        if (this.hG == null) {
            this.hG = graphics.create();
        } else if (Launcher.n().h()) {
            int width = getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
            int width2 = getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
            if (width != this.b || width2 != this.c) {
                this.hG = graphics.create();
            }
            this.b = getGraphicsConfiguration().getDevice().getDisplayMode().getWidth();
            this.c = getGraphicsConfiguration().getDevice().getDisplayMode().getHeight();
        }
        this.hI = true;
        X();
    }

    public final void mousePressed(MouseEvent mouseEvent) {
        this.hL = 0L;
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        class_313.d().m().a(mouseEvent);
        if (mouseEvent.isConsumed()) {
            return;
        }
        if (this.hH != null) {
            x -= 4;
            y -= 22 + this.hc;
        }
        if (Launcher.n().o().av()) {
            x = b(x, false);
            y = c(y, false);
        }
        this.hK = 0;
        this.j = x;
        this.k = y;
        this.l = System.currentTimeMillis();
        if (class_205.d && SwingUtilities.isLeftMouseButton(mouseEvent)) {
            class_205.b.c(1);
        }
        if (class_205.d && SwingUtilities.isRightMouseButton(mouseEvent)) {
            class_205.b.c(2);
        }
        if (SwingUtilities.isMiddleMouseButton(mouseEvent) && Client.ee == 2) {
            this.ht = true;
            this.hw = mouseEvent.getX();
            this.hx = mouseEvent.getY();
            this.hu = x;
            this.hv = y;
            return;
        }
        if (SwingUtilities.isRightMouseButton(mouseEvent) || !(!System.getProperty("os.name").contains("Mac OS X") || (mouseEvent.getModifiers() & 16) == 0 || (mouseEvent.getModifiers() & 4) == 0)) {
            this.i = 2;
            this.hM = 2;
        } else if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            this.i = 1;
            this.hM = 1;
        }
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        class_313.d().m().d(mouseEvent);
        if (mouseEvent.isConsumed()) {
            return;
        }
        this.hL = 0L;
        this.hK = 0;
        this.hM = 0;
        this.ht = false;
        if (this.hH != null) {
            this.hH.requestFocus();
        }
    }

    public final void mouseClicked(MouseEvent mouseEvent) {
        if (Launcher.n() == null || mouseEvent.getX() > 765 || mouseEvent.getY() > 537 || this.hH == null) {
            return;
        }
        this.hH.requestFocus();
    }

    public final void mouseEntered(MouseEvent mouseEvent) {
        if (this.hH != null) {
            this.hH.requestFocus();
        }
    }

    public final void mouseExited(MouseEvent mouseEvent) {
        this.hK = 0;
        hN = -1;
        hP = -1;
        hO = -1;
        hQ = -1;
    }

    public int b(int i, boolean z) {
        float fAc = Launcher.n().o().ac();
        float width = z().getWidth() - (fAc * 2.0f);
        double d2 = width / 765.0f;
        double d3 = 765.0f / width;
        return ((int) (((double) i) * d3)) + ((int) (((double) 0) - (((double) fAc) * d3)));
    }

    public int c(int i, boolean z) {
        float height = z().getHeight() - (0.0f * 2.0f);
        double d2 = height / 503.0f;
        double d3 = 503.0f / height;
        return ((int) (((double) i) * d3)) + ((int) (((double) 0) - (((double) 0.0f) * d3)));
    }

    public final void mouseDragged(MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        class_313.d().m().c(mouseEvent);
        if (mouseEvent.isConsumed()) {
            return;
        }
        if (this.hH != null) {
            Insets insets = this.hH.getInsets();
            x -= insets.left + 4;
            y -= (insets.top + 22) + this.hc;
        }
        hN = x;
        hO = y;
        if (Launcher.n().o().av()) {
            x = b(x, false);
            y = c(y, false);
        }
        if (this.ht) {
            e(this.hw - mouseEvent.getX(), -(this.hx - mouseEvent.getY()));
            this.hw = mouseEvent.getX();
            this.hx = mouseEvent.getY();
        } else {
            this.hK = 0;
            hP = x;
            hQ = y;
        }
    }

    void e(int i, int i2) {
    }

    public final void mouseMoved(MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        class_313.d().m().b(mouseEvent);
        if (this.hH != null) {
            x -= 4;
            y -= 22 + this.hc;
            this.hH.requestFocus();
        }
        this.hK = 0;
        int i = x;
        hN = i;
        hP = i;
        int i2 = y;
        hO = i2;
        hQ = i2;
        if (Launcher.n().o().av()) {
            hP = b(hP, false);
            hQ = c(hQ, false);
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (this.hH != null) {
            this.hH.requestFocus();
        } else {
            requestFocus();
        }
        this.hL = 0L;
        this.hK = 0;
        Launcher.n().p().p().a(keyEvent);
        if (keyEvent.isConsumed()) {
            return;
        }
        int keyCode = keyEvent.getKeyCode();
        int keyChar = keyEvent.getKeyChar();
        if (keyEvent.isControlDown()) {
            Client.ci = System.currentTimeMillis();
            Client.ch = true;
        }
        if (keyEvent.isShiftDown()) {
            Client.ag = true;
        }
        if (class_205.d) {
            class_205.b.a(keyChar);
        }
        if (keyCode == 37 && Client.w.b) {
            Client.w.f--;
            if (Client.w.f < 0) {
                Client.w.f = 0;
            }
        }
        if (keyCode == 39 && Client.w.b) {
            Client.w.f++;
            if (Client.w.f > Client.w.g.length()) {
                Client.w.f = Client.w.g.length();
            }
        }
        if (keyCode == 38 && Client.w.b) {
            Client.w.b(Client.w.e - 1);
        }
        if (keyCode == 40 && Client.w.b) {
            Client.w.b(Client.w.e + 1);
        }
        if (Client.ch && keyCode == 38 && class_326.b(Client.cT) && Client.dm != null) {
            Client.dk = Client.dm;
        }
        if (class_246.j.r) {
            if (keyCode == 37 || keyCode == 39) {
                int i = class_246.j.s + (keyCode == 37 ? (-1) * class_246.p * class_246.q : class_246.p * class_246.q);
                if (i < 0) {
                    i = 0;
                }
                if (i >= class_332.y.length) {
                    return;
                }
                class_246.j.s = i;
                return;
            }
            if (keyCode == 27) {
                class_246.j.r = false;
                return;
            }
        }
        if (class_242.i.f() && !Client.w.b) {
            if (keyCode == 87 || keyCode == 65 || keyCode == 68 || keyCode == 83 || (keyCode >= 37 && keyCode <= 40)) {
                switch (keyCode) {
                    case 37:
                    case 65:
                        class_242.i.c(keyCode == 65 ? -10 : -1);
                        break;
                    case 38:
                    case 87:
                        class_242.i.d(keyCode == 87 ? -10 : -1);
                        break;
                    case 39:
                    case 68:
                        class_242.i.c(keyCode == 68 ? 10 : 1);
                        break;
                    case 40:
                    case 83:
                        class_242.i.d(keyCode == 83 ? 10 : 1);
                        break;
                }
                Widget.H[class_242.i.g()].al[class_242.i.h()] = class_242.i.i();
                Widget.H[class_242.i.g()].ba[class_242.i.h()] = class_242.i.j();
                Client.fb = true;
                Client.menuIndex = true;
                return;
            }
            if (keyCode == 9) {
                class_242.i.a(false);
                return;
            }
        }
        if (keyCode >= 37 && keyCode <= 40 && (Client.ba || Client.aW != -1)) {
            if (!Client.ba) {
                if (Client.aW != -1) {
                    switch (keyCode) {
                        case 37:
                            Client.aX--;
                            break;
                        case 38:
                            Client.aY++;
                        case 39:
                            Client.aX++;
                            break;
                        case 40:
                            Client.aY--;
                            break;
                    }
                }
            } else {
                switch (keyCode) {
                    case 37:
                        if (hy) {
                            Client.bf--;
                        } else {
                            Client.bc -= Client.bc - 10 > 0 ? 10 : 0;
                        }
                        break;
                    case 38:
                        if (hz) {
                            Client.be += Client.be + 100 < 50000 ? 100 : 0;
                        } else if (hy) {
                            Client.bg++;
                        } else {
                            Client.bd += Client.bd + 10 < 2050 ? 10 : 0;
                        }
                        break;
                    case 39:
                        if (hy) {
                            Client.bf++;
                        } else {
                            Client.bc += Client.bc + 10 < 2050 ? 10 : 0;
                        }
                        break;
                    case 40:
                        if (hz) {
                            Client.be -= Client.be - 100 > 0 ? 100 : 0;
                        } else if (hy) {
                            Client.bg--;
                        } else {
                            Client.bd -= Client.bd - 10 > 0 ? 10 : 0;
                        }
                        break;
                }
            }
            if (Client.aW > 0) {
                Widget.H[Client.aW].al[Client.aV] = Client.aX;
                Widget.H[Client.aW].ba[Client.aV] = Client.aY;
            }
            Client.fb = true;
            Client.menuIndex = true;
            return;
        }
        if (class_246.j.r) {
            if (keyCode == 37 || keyCode == 39) {
                int i2 = class_246.j.s + (keyCode == 37 ? -43 : 43);
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= class_332.y.length) {
                    return;
                }
                class_246.j.s = i2;
                return;
            }
            if (keyCode == 27) {
                class_246.j.r = false;
                return;
            }
        }
        if (keyCode == 16 && Client.ba) {
            hy = !hy;
        }
        if (keyCode == 20 && Client.ba) {
            hz = !hz;
        }
        if (keyChar < 30) {
            keyChar = 0;
        }
        if (keyCode == 37) {
            keyChar = 1;
        }
        if (keyCode == 39) {
            keyChar = 2;
        }
        if (keyCode == 38) {
            keyChar = 3;
        }
        if (keyCode == 40) {
            keyChar = 4;
        }
        if (keyCode == 17) {
            keyChar = 5;
        }
        if (keyCode == 8) {
            keyChar = 8;
        }
        if (keyCode == 127) {
            keyChar = 8;
        }
        if (keyCode == 9) {
            keyChar = 9;
        }
        if (keyCode == 10) {
            keyChar = 10;
        }
        if (keyCode >= 112 && keyCode <= 123) {
            keyChar = (1008 + keyCode) - 112;
        }
        if (keyCode == 36) {
            keyChar = 1000;
        }
        if (keyCode == 35) {
            keyChar = 1001;
        }
        if (keyCode == 33) {
            keyChar = 1002;
        }
        if (keyCode == 34) {
            keyChar = 1003;
        }
        if (keyChar > 0 && keyChar < 128) {
            this.hV[keyChar] = 1;
        }
        for (int i3 = 0; i3 < Configuration.G.length; i3++) {
            if (Configuration.G[i3] != -1 && Configuration.G[i3] == keyCode) {
                Client.n(i3);
            }
        }
        if (keyCode == 27) {
            Client.n(3);
        }
        Launcher.n().o().cv.b(keyEvent);
        if (Launcher.n().o().cv.b()) {
            Launcher.n().o().cv.a(false);
            return;
        }
        if (keyChar > 4) {
            this.m[this.o] = keyChar;
            this.o = (this.o + 1) & 127;
        }
        if (class_205.d && Client.ch && keyCode == 86) {
            try {
                for (char c : ((String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor)).toCharArray()) {
                    Client.w.a(c);
                }
            } catch (UnsupportedFlavorException | IOException e2) {
            }
        }
        if (keyCode == 18) {
            keyEvent.consume();
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
        this.hL = 0L;
        this.hK = 0;
        Launcher.n().p().p().b(keyEvent);
        if (keyEvent.isConsumed()) {
        }
        int keyCode = keyEvent.getKeyCode();
        char keyChar = keyEvent.getKeyChar();
        if (class_205.d) {
            class_205.b.b(keyChar);
        }
        if (keyChar < 30) {
            keyChar = 0;
        }
        if (keyCode == 37) {
            keyChar = 1;
        }
        if (keyCode == 39) {
            keyChar = 2;
        }
        if (keyCode == 38) {
            keyChar = 3;
        }
        if (keyCode == 40) {
            keyChar = 4;
        }
        if (keyCode == 17) {
            keyChar = 5;
        }
        if (keyCode == 8) {
            keyChar = '\b';
        }
        if (keyCode == 127) {
            keyChar = '\b';
        }
        if (keyCode == 9) {
            keyChar = '\t';
        }
        if (keyCode == 10) {
            keyChar = '\n';
        }
        if (keyChar > 0 && keyChar < 128) {
            this.hV[keyChar] = 0;
        }
        if (keyCode == 17) {
            Client.ci = System.currentTimeMillis();
            Client.ch = false;
        }
        if (keyCode == 16) {
            Client.ag = false;
        }
    }

    public final void keyTyped(KeyEvent keyEvent) {
        Launcher.n().p().p().c(keyEvent);
        if (keyEvent.isConsumed()) {
        }
    }

    public final int w(int i) {
        while (i >= 0) {
            for (int i2 = 1; i2 > 0; i2++) {
            }
        }
        int i3 = -1;
        if (this.o != this.n) {
            i3 = this.m[this.n];
            this.n = (this.n + 1) & 127;
        }
        return i3;
    }

    public final void focusGained(FocusEvent focusEvent) {
        this.hJ = true;
        this.hI = true;
        FocusChanged focusChanged = new FocusChanged();
        focusChanged.setFocused(true);
        Launcher.n().o().eventBus.post(focusChanged);
        X();
    }

    public void focusLost(FocusEvent focusEvent) {
        Client.ch = false;
        Client.ag = false;
        FocusChanged focusChanged = new FocusChanged();
        focusChanged.setFocused(false);
        Launcher.n().o().eventBus.post(focusChanged);
        this.hJ = false;
        for (int i = 0; i < 128; i++) {
            this.hV[i] = 0;
        }
    }

    public final void windowActivated(WindowEvent windowEvent) {
    }

    public final void windowClosed(WindowEvent windowEvent) {
    }

    public final void windowClosing(WindowEvent windowEvent) {
        try {
            destroy();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        System.exit(0);
    }

    public final void windowDeactivated(WindowEvent windowEvent) {
    }

    public final void windowDeiconified(WindowEvent windowEvent) {
    }

    public final void windowIconified(WindowEvent windowEvent) {
    }

    public final void windowOpened(WindowEvent windowEvent) {
    }

    void J() {
    }

    void q() {
    }

    void y() {
    }

    void R() {
    }

    void X() {
    }

    Component z() {
        return this.hH != null ? this.hH : this.gI;
    }

    public void a(Runnable runnable, int i) {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z, int i, int i2, boolean z2, boolean z3) {
        this.hE = i;
        this.hF = i2;
        if (Launcher.n() != null) {
            return;
        }
        if (this.hH != null) {
            this.hH.dispose();
        }
        if (0 == 0) {
            this.hH = new class_29(this, i, i2);
            this.hH.addWindowListener(this);
        }
        this.hG = (0 != 0 ? this : this.hH).getGraphics();
        if (0 == 0) {
            z().addMouseWheelListener(this);
            z().addMouseListener(this);
            z().addMouseMotionListener(this);
            z().addKeyListener(this);
            z().addFocusListener(this);
        }
    }

    void a(int i, String str) {
        while (this.hG == null) {
            this.hG = z().getGraphics();
            try {
                z().repaint();
            } catch (Exception e2) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception e3) {
            }
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontMetrics = z().getFontMetrics(font);
        z().getFontMetrics(new Font("Helvetica", 0, 13));
        if (this.hI) {
            this.hG.setColor(Color.black);
            this.hG.fillRect(0, 0, this.hE, this.hF);
            this.hI = false;
        }
        Color color = new Color(140, 17, 17);
        int i2 = (this.hF / 2) - 18;
        this.hG.setColor(color);
        this.hG.drawRect((this.hE / 2) - 152, i2, CGL.kCGLCPSurfaceBackingSize, 34);
        this.hG.fillRect((this.hE / 2) - 150, i2 + 2, i * 3, 30);
        this.hG.setColor(Color.black);
        this.hG.fillRect(((this.hE / 2) - 150) + (i * 3), i2 + 2, 300 - (i * 3), 30);
        this.hG.setFont(font);
        this.hG.setColor(Color.white);
        this.hG.drawString(str, (this.hE - fontMetrics.stringWidth(str)) / 2, i2 + 22 + this.hc);
    }

    public void componentShown(ComponentEvent componentEvent) {
    }

    public void componentHidden(ComponentEvent componentEvent) {
    }

    public void componentMoved(ComponentEvent componentEvent) {
    }

    public void componentResized(ComponentEvent componentEvent) {
        setCursor(Cursor.getDefaultCursor());
        if (Launcher.n() != null) {
            Launcher.n().i().setCursor(Cursor.getDefaultCursor());
        }
    }

    public static void a(Graphics2D graphics2D, Polygon polygon, Color color) {
        graphics2D.setColor(color);
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(2.0f));
        graphics2D.drawPolygon(polygon);
        graphics2D.setColor(new Color(0, 0, 0, 50));
        graphics2D.fillPolygon(polygon);
        graphics2D.setStroke(stroke);
    }

    public static void a(Graphics2D graphics2D, Polygon polygon, Color color, Color color2) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(d);
        if (e.a()) {
            graphics2D.setComposite(AlphaComposite.getInstance(5, 1.0f));
            graphics2D.setStroke(e);
        }
        graphics2D.setColor(color);
        graphics2D.drawPolygon(polygon);
        graphics2D.setColor(color2);
        graphics2D.fillPolygon(polygon);
        graphics2D.setStroke(stroke);
    }

    public static void b(Graphics2D graphics2D, Polygon polygon, Color color, Color color2) {
        Stroke stroke = graphics2D.getStroke();
        graphics2D.setStroke(d);
        if (e.a()) {
            graphics2D.setComposite(AlphaComposite.getInstance(3, 1.0f));
            graphics2D.setStroke(d);
        }
        graphics2D.setColor(color);
        graphics2D.drawPolygon(polygon);
        graphics2D.setColor(color2);
        graphics2D.fillPolygon(polygon);
        graphics2D.setStroke(stroke);
    }

    public static List<i> a(List<i> list) {
        if (list.size() < 3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        i iVarB = b(list);
        i iVar = iVarB;
        do {
            if (iVar.a() != 0 || iVar.b() != 0) {
                arrayList.add(iVar);
            }
            if (!hX && arrayList.size() > list.size()) {
                throw new AssertionError("hull has more points than graph");
            }
            if (arrayList.size() > list.size()) {
                return null;
            }
            i iVar2 = null;
            for (i iVar3 : list) {
                if (iVar2 == null) {
                    iVar2 = iVar3;
                } else {
                    long jA = a(iVar, iVar3, iVar2);
                    if (jA > 0 || (jA == 0 && iVar.a(iVar3) > iVar.a(iVar2))) {
                        iVar2 = iVar3;
                    }
                }
            }
            if (iVar2 == null) {
                return null;
            }
            iVar = iVar2;
        } while (iVar != iVarB);
        return arrayList;
    }

    private static i b(List<i> list) {
        i iVar = null;
        for (i iVar2 : list) {
            if (iVar == null || iVar2.a() < iVar.a()) {
                iVar = iVar2;
            } else if (iVar2.a() == iVar.a() && iVar2.b() < iVar.b()) {
                iVar = iVar2;
            }
        }
        return iVar;
    }

    private static long a(i iVar, i iVar2, i iVar3) {
        return (((long) (iVar2.b() - iVar.b())) * ((long) (iVar3.a() - iVar2.a()))) - (((long) (iVar2.a() - iVar.a())) * ((long) (iVar3.b() - iVar2.b())));
    }

    public static i a(Client client, int i, int i2, int i3) {
        if (i < 128 || i2 < 128 || i > 13056 || i2 > 13056) {
            return null;
        }
        int i4 = i - Client.cJ;
        int i5 = i2 - Client.cL;
        int i6 = i3 - Client.cK;
        int i7 = client.cR;
        int i8 = client.cS;
        int i9 = hA[i7];
        int i10 = hB[i7];
        int i11 = hA[i8];
        int i12 = hB[i8];
        int i13 = ((i12 * i4) + (i5 * i11)) >> 16;
        int i14 = ((i12 * i5) - (i11 * i4)) >> 16;
        int i15 = ((i10 * i6) - (i14 * i9)) >> 16;
        int i16 = ((i6 * i9) + (i14 * i10)) >> 16;
        if (i16 < 50) {
            return null;
        }
        int width = Client.aj;
        int height = Client.ak;
        if (class_205.c) {
            width = client.z().getWidth();
            height = client.z().getHeight();
        }
        return new i((width / 2) + ((i13 * 500) / i16) + 0, (height / 2) + ((i15 * 500) / i16) + 0);
    }

    public int be() {
        return this.hS;
    }

    public int bf() {
        return this.hT;
    }

    static {
        hX = !class_27.class.desiredAssertionStatus();
        gJ = null;
        gK = 0L;
        gL = false;
        gM = 20;
        gN = 1;
        gR = 0;
        gS = new long[32];
        gT = new long[32];
        gV = 500;
        gW = true;
        gX = -1L;
        gY = -1L;
        he = aU.qx;
        hf = g.r;
        hy = false;
        hz = false;
        d = new BasicStroke(2.0f);
        e = new BasicStroke(3.0f);
        hA = new int[2048];
        hB = new int[2048];
        for (int i = 0; i < 2048; i++) {
            hA[i] = (int) (65536.0d * Math.sin(((double) i) * 0.0030679615757712823d));
            hB[i] = (int) (65536.0d * Math.cos(((double) i) * 0.0030679615757712823d));
        }
    }
}
