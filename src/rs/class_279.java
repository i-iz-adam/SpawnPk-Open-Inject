package rs;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

/* JADX INFO: loaded from: client-final.jar:rs/class_279.class */
public class class_279 extends class_315 {
    private static final int T = 1;
    private static final Dimension U = new Dimension();
    private static final Dimension V = new Dimension(142, 14);
    private static final Dimension W = new Dimension(190, 46);
    private static final Dimension X = new Dimension(190, 84);
    private static final Dimension Y = new Dimension(190, 31);
    private static final Dimension Z = new Dimension(190, 65);
    private static final String aa = "None";
    private static final String ab = "Searching";
    private static final String ac = "Searching.";
    private static final String ad = "Searching..";
    private static final String ae = "Searching...";
    public class_333 r;
    public class_333 s;
    public class_333 t;
    public class_333 u;
    public class_333 v;
    public class_333 w;
    public class_333 x;
    public class_333 y;
    public class_333[] z;
    public class_333[] A;
    private boolean af = true;
    public boolean B = false;
    public boolean C = false;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    private int ag;
    private int ah;
    public long R;
    public long S;

    public class_279() {
        a("BountyOverlay");
        a(class_268.q);
        j(true);
        c(class_268.A);
        a(class_320.e);
        a(10.0f);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
        U();
        c(false);
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        if (!this.af) {
            return U;
        }
        if (Configuration.bn) {
            Client client = this.a;
            if (Client.ed == 197) {
                this.ag = this.f.x;
                this.ah = this.f.y;
                if (this.C) {
                    this.w.c((this.ag + V.width) - 13, this.ah);
                    a(V);
                    return this.j;
                }
                boolean zO = O();
                if (this.E) {
                    (zO ? this.u : this.v).c(this.ag, this.ah);
                } else {
                    (zO ? this.t : this.s).c(this.ag, this.ah);
                }
                String str = ab;
                if (Client.ff % 200 < 50) {
                    str = ac;
                } else if (Client.ff % 200 >= 50 && Client.ff % 200 < 100) {
                    str = ad;
                } else if (Client.ff % 200 >= 100 && Client.ff % 200 < 150) {
                    str = ae;
                }
                boolean z = this.I != null;
                String str2 = this.G == null ? "None" : this.G;
                String str3 = this.H == null ? "None" : this.H;
                String str4 = this.I == null ? str : this.I;
                if (zO) {
                    if (z) {
                        this.a.gm.b(str2, this.ag + 17, this.ah + 15, class_492.d, 0);
                        Client client2 = this.a;
                        Client.gl.a("<img=303> <yoff=1>" + str3, this.ag + 187, this.ah + 14 + 13, class_492.e, 0);
                        Client.gl.b(str4, this.ag + 20, this.ah + 14 + 16, 2096965, 0);
                        if (this.y != null) {
                            this.y.c(this.ag + 150, this.ah + 5);
                        }
                    } else {
                        this.a.gm.b(str, this.ag + 66, this.ah + 20, class_492.d, 0);
                    }
                    if (L()) {
                        this.r.c(this.ag + 20, (this.ah + 50) - 15);
                        Client.gl.b("<u=16777215>@whi@" + this.J, this.ag + 25, (this.ah + 63) - 15, 16776991, 0);
                        Client.gl.b("Kills: @whi@" + this.K, this.ag + 25, (((this.ah + 63) + 12) + 3) - 15, 16776991, 0);
                        Client.gl.b("Time Left: @whi@" + Client.d(this.R - System.currentTimeMillis()), this.ag + 25 + 60, (((this.ah + 63) + 12) + 3) - 15, 16776991, 0);
                        a(Z);
                    } else {
                        a(Y);
                    }
                    return this.j;
                }
                Client.gl.c("Risk: " + str3, this.ag + 45, this.ah + 42, 16776991, 0);
                Client.gl.c("Target:", this.ag + 140, this.ah + 13, 16776991, 0);
                this.a.gm.c(str2, this.ag + 139, this.ah + 26, class_492.c, 0);
                Client.gl.c(str4, this.ag + 138, this.ah + 41, 2096965, 0);
                int i = this.G == null ? 0 : this.L;
                int i2 = 32;
                if (i > 0) {
                    int i3 = 0;
                    if (i == 9) {
                        i3 = 0 + 2;
                    }
                    if (i == 8) {
                        i3++;
                    }
                    if (i == 3) {
                        i3 += 3;
                    }
                    if (i == 2) {
                        i3 += 2;
                    }
                    this.A[i - 1].c(this.ag + 14, this.ah + i3);
                    i2 = 32 + 14;
                    Client.gl.c(i, this.ag + 30, this.ah + 30, 16776991, 0);
                }
                this.z[this.M].c(this.ag + i2, this.ah + 10);
                if (this.y != null) {
                    this.y.c(this.ag + i2 + 32, this.ah + 10);
                }
                if (L()) {
                    a(X);
                    this.r.c(this.ag + 20, this.ah + 50);
                    Client.gl.b("<u=16777215>@whi@" + this.J, this.ag + 25, this.ah + 63, 16776991, 0);
                    Client.gl.b("Kills: @whi@" + this.K, this.ag + 25, this.ah + 63 + 12 + 3, 16776991, 0);
                    Client.gl.b("Time Left: @whi@" + Client.d(this.R - System.currentTimeMillis()), this.ag + 25 + 60, this.ah + 63 + 12 + 3, 16776991, 0);
                } else {
                    a(W);
                }
                return this.j;
            }
        }
        return U;
    }

    @Override // rs.class_315
    public void m() {
        if (P()) {
            class_313.d().f().a(this.C ? "Maximize" : "Minimize", false);
            return;
        }
        if (Q()) {
            class_313.d().f().a(this.J != null ? "Hide/show task" : "Receive task", false);
            return;
        }
        if (T()) {
            class_313.d().f().a("Task info", false);
        } else if (R()) {
            class_313.d().f().a("Skip target", false);
        } else if (S()) {
            class_313.d().f().a("Skip bounty hunter task", false);
        }
    }

    @Override // rs.class_315
    public boolean n() {
        this.ag = this.f.x;
        this.ah = this.f.y;
        if (P()) {
            ClientThread.queue(() -> {
                this.C = !this.C;
            });
            return true;
        }
        if (Q()) {
            ClientThread.queue(() -> {
                if (this.J != null) {
                    this.D = !this.D;
                } else {
                    class_341.a("::bhtask");
                }
            });
            return true;
        }
        if (R()) {
            ClientThread.queue(() -> {
                class_341.a("::skipbh");
            });
            return true;
        }
        if (S()) {
            ClientThread.queue(() -> {
                class_341.a("::bhtaskskip");
            });
            return true;
        }
        if (!T()) {
            return false;
        }
        ClientThread.queue(() -> {
            class_341.a("::bhtaskinfo");
        });
        return true;
    }

    private boolean O() {
        return Configuration.as;
    }

    private boolean P() {
        if (this.C) {
            return Client.hP >= (this.ag + V.width) - 14 && Client.hP <= this.ag + V.width && Client.hQ >= this.ah && Client.hQ <= this.ah + 13;
        }
        return Client.hP >= this.ag && Client.hP <= this.ag + 14 && Client.hQ >= this.ah && Client.hQ <= this.ah + 13;
    }

    private boolean Q() {
        if (O()) {
            this.ah += 5;
        }
        return this.af && !this.C && Client.hP >= this.ag && Client.hP <= this.ag + 14 && Client.hQ >= (this.ah + 12) + 0 && Client.hQ <= (this.ah + 26) + 0;
    }

    private boolean R() {
        int i = this.ag + 166;
        int i2 = this.ah;
        return this.af && !this.C && Client.hP >= i && Client.hP <= i + 21 && Client.hQ >= i2 && Client.hQ <= i2 + 16;
    }

    private boolean S() {
        int i = this.ag + 166;
        int i2 = this.ah + 52;
        if (O()) {
            i2 -= 17;
        }
        return this.af && !this.C && L() && Client.hP >= i && Client.hP <= i + 21 && Client.hQ >= i2 && Client.hQ <= i2 + 16;
    }

    private boolean T() {
        int i = this.ag + 166;
        int i2 = this.ah + 52 + 17;
        if (O()) {
            i2 -= 15;
        }
        return this.af && !this.C && L() && Client.hP >= i && Client.hP <= i + 21 && Client.hQ >= i2 && Client.hQ <= i2 + 16;
    }

    public boolean L() {
        return this.D && this.J != null;
    }

    public boolean M() {
        return Widget.H[199].as.equals("@or1@3-126") || Widget.H[199].as.contains("Tourney") || Widget.H[199].as.contains("@or1@PvP") || Widget.H[199].as.contains("LMS") || Widget.H[199].as.contains("War") || Widget.H[199].as.contains("HG");
    }

    private void U() {
        this.r = new class_333("popups/bh record bg");
        this.s = new class_333("popups/bh target bg");
        this.t = new class_333("popups/bhcompact1");
        this.u = new class_333("popups/bhcompact2");
        this.v = new class_333("popups/bh target bg cursed");
        this.w = new class_333("popups/bh maximimize");
        this.x = new class_333("popups/bh combat");
        this.z = new class_333[8];
        this.A = new class_333[10];
        this.y = null;
        this.R = 0L;
        this.E = false;
        for (int i = 0; i < this.z.length; i++) {
            this.z[i] = new class_333("popups/bh skull" + i);
        }
        for (int i2 = 0; i2 < 10; i2++) {
            this.A[i2] = new class_333("popups/t" + (i2 + 1));
        }
    }

    public void k(boolean z) {
        this.af = z;
    }

    public boolean N() {
        return this.af;
    }
}
