package rs;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_220.class */
public class class_220 implements Runnable {
    private static final String k = "/assets/";
    private static final int l = 25;
    private static final int m = 125;
    public static final int e = 0;
    public static final String f = "@or1@";
    public static final String g = "@yel@";
    private class_221 o;
    private Client p;
    private class_219 q;
    private class_219 r;
    private class_219 s;
    private class_219 t;
    private int u;
    private boolean v;
    private String w;
    private class_333 x;
    private class_333 y;
    private class_333 z;
    private class_333 A;
    private class_333 B;
    private class_333 C;
    private class_193 D;
    private class_323 E;
    private class_323 F;
    private class_323 G;
    private class_323 H;
    private class_323 I;
    private class_323 J;
    private class_323 K;
    private class_323 L;
    private class_323 M;
    private String N;
    private String O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int ag;
    public static boolean a = true;
    public static boolean b = true;
    public static int c = 225;
    public static int d = 75;
    public static final Color h = new Color(34, 255, 0);
    public static final Color[] i = {Color.WHITE, Color.YELLOW};
    private List<class_218> n = new ArrayList();
    public boolean j = false;
    private String X = null;
    private String Y = null;
    private String Z = null;
    private boolean aa = true;
    private long ab = System.currentTimeMillis();
    private int ac = 3;
    private int ad = 410;
    private int ae = 0;
    private boolean af = false;

    public class_220(Client client) {
        String str = !h.equals(new Color(34, 255, 0)) ? "custom/" : "";
        this.o = class_221.a;
        this.O = "@or1@Login";
        this.N = "@or1@Exit";
        this.p = client;
        this.U = true;
        this.V = true;
        this.D = new class_193(new class_333(k, "bg"), new class_333(k, "bg 2"), 6);
        this.C = new class_333(k, "glow");
        new class_333("/assets/" + str, "textbox 2", new Color(34, 255, 0), h);
        new class_333(k, "textbox");
        this.I = new class_323(client, new class_333(k, "textbox"), new class_333("/assets/" + str, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        this.J = new class_323(client, new class_333(k, "textbox"), new class_333("/assets/" + str, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        this.L = new class_323(client, new class_333(k, "textbox"), new class_333("/assets/" + str, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        this.K = new class_323(client, new class_333(k, "textbox"), new class_333("/assets/" + str, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        new class_333("/assets/" + str, "button", new Color(34, 255, 0), h);
        class_333 class_333Var = new class_333("/assets/" + str, "button", new Color(34, 255, 0), h);
        class_333Var.c(255, 255, 255);
        new class_333("/assets/" + str, "button 2", new Color(34, 255, 0), h);
        this.F = new class_323(client, class_333Var, new class_333("/assets/" + str, "button 2", new Color(34, 255, 0), h), 85, 4);
        this.G = new class_323(client, class_333Var, new class_333("/assets/" + str, "button 2", new Color(34, 255, 0), h), 85, 4);
        this.E = new class_323(client, new class_333(k, "box"), new class_333(k, "box 2"), 85, 4);
        new class_333("/assets/" + str, "box 3", new Color(34, 255, 0), h);
        this.H = new class_323(client, new class_333(k, "box 2"), new class_333("/assets/" + str, "box 3", new Color(34, 255, 0), h), 85, 4);
        this.M = new class_323(client, new class_333(k, "updatebar"), new class_333(k, "updatebar2"), 45, 1);
        Color color = new Color(71, 213, 71);
        Color color2 = new Color(34, 255, 0).equals(h) ? color : h;
        new class_333("/assets/" + str, "loadbar", color, color2);
        this.y = new class_333("/assets/" + str, "loadbar", color, color2);
        this.A = new class_333(k, "newsbar");
        this.B = new class_333(k, "updatebaricon");
        this.x = new class_333(k, "messagebox");
        this.z = new class_333(k, "loadframe");
        this.t = new class_219(client, this.x, "It will be your account's PIN before October 2024", "If you do not remember it, request help on our forums!", false);
    }

    /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
    @Override // java.lang.Runnable
    public void run() {
        if (!class_205.c) {
            Launcher.n().i().addMouseListener(new class_222(this));
        }
        while (true) {
            if (this.p == null || !a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            } else {
                a();
            }
        }
    }

    public void a() {
        try {
            if (a) {
                if (Client.bR || Client.i) {
                }
                if (!this.p.fc && !this.p.bZ) {
                    this.W = true;
                    if (!this.p.bt) {
                        b();
                    }
                } else if (this.W) {
                    this.q = null;
                    this.W = false;
                }
                try {
                    Thread.sleep(25L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            } else {
                b();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private void d() {
        this.D.a(0, 0);
        this.C.g(0, 0, this.ae);
        boolean z = Client.ff % 3 == 0;
        if (this.af) {
            if (z) {
                this.ae -= 2;
            }
            if (this.ae <= 0) {
                this.ae = 0;
                this.af = false;
            }
        } else {
            if (z) {
                this.ae++;
            }
            if (this.ae >= 100) {
                this.af = true;
            }
        }
        if (this.n.size() == 0) {
            int iC = 0;
            int iC2 = 0;
            for (int i2 = 0; i2 < 75; i2++) {
                class_333 class_333Var = new class_333(k, "orb 1");
                iC += 200;
                if (iC >= this.p.hE) {
                    iC2 += Client.c(0, class_333Var.o * 2);
                    iC = Client.c(0, class_333Var.n * 2);
                }
                this.n.add(new class_218(this.p, iC, iC2));
            }
        }
        for (class_218 class_218Var : this.n) {
            if (class_218Var.c() == 1) {
                class_218Var.a();
            }
        }
        e();
        if (this.u == 0 && this.w != null) {
            this.u = (int) (((double) this.w.length()) * 3.75d);
        }
        this.Q = 480;
        if (this.P < (-1) * this.u) {
            this.P = User32.WM_DWMCOLORIZATIONCOLORCHANGED;
        }
        this.P--;
        this.A.c(0, this.Q - 18);
        Client client = this.p;
        if (Client.gl != null) {
            Client client2 = this.p;
            Client.gl.b(this.w, this.P, this.Q, class_492.c, 0);
        }
        for (class_218 class_218Var2 : this.n) {
            if (class_218Var2.c() == 2) {
                class_218Var2.a();
            }
        }
        if (this.p.gn == null || this.p.gm == null) {
            return;
        }
        if (this.X == null) {
            this.M.a(this.ac, this.ad, false);
            this.B.f(this.ac + 2, this.ad + 2);
            this.p.gn.b("@or2@<u=16742912>Latest Update", this.ac + 50, this.ad + 15 + 2, class_492.c, 0);
            this.p.gm.b("<img=291> Loading..", this.ac + 50, this.ad + 34 + 2, class_492.c, 0);
            return;
        }
        if (Configuration.bf.equals(this.Z)) {
            this.aa = false;
        } else {
            if (System.currentTimeMillis() - this.ab >= 5000 || ((this.M.c() == 0 && !this.aa) || (this.M.c() >= this.M.d() - 1 && this.aa))) {
                this.aa = !this.aa;
                this.ab = System.currentTimeMillis();
            }
            if (this.M.b(this.ac, this.ad)) {
                this.ab = System.currentTimeMillis() - 10000;
                this.aa = true;
            }
        }
        this.M.a(this.ac, this.ad, this.aa || this.M.b(this.ac, this.ad));
        this.B.f(this.ac + 2, this.ad + 2);
        this.p.gn.b("@or2@<u=16742912>Latest Update</u> <img=329>", this.ac + 50, this.ad + 15 + 2, class_492.c, 0);
        this.p.gm.b(this.X, this.ac + 50, this.ad + 34 + 2, class_492.c, 0);
    }

    public void b() {
        f();
        if (this.U || this.S == 62 || this.S == 125) {
            if (class_205.c) {
                if (this.o != class_221.a) {
                    if (class_205.b == null) {
                        class_205.b = new class_205(this.p);
                    }
                    class_205.b.d();
                    return;
                }
                this.p.u();
                this.p.gZ.a();
                if (this.r != null) {
                    this.r.a(145 + 80);
                    this.r.b(200 - 65);
                    this.r.b();
                }
                this.z.c(145, 200);
                this.y.a(145, 200, (int) (((double) this.y.n) * (((double) this.R) / 100.0d)), this.y.o);
                this.p.gZ.a(0, this.p.hG, 0);
                this.U = true;
                return;
            }
            this.p.u();
            this.p.gZ.a();
            d();
            if (this.o == class_221.a) {
                if (this.r != null) {
                    this.r.a(145 + 80);
                    this.r.b(200 - 65);
                    this.r.b();
                }
                this.z.c(145, 200);
                this.y.a(145, 200, (int) (((double) this.y.n) * (((double) this.R) / 100.0d)), this.y.o - 5);
            } else {
                String str = this.p.fk;
                String strE = class_39.e(this.p.fl);
                Client client = this.p;
                String str2 = Client.fn;
                String str3 = this.p.buffer;
                if (this.q != null && this.q.c()) {
                    if (b) {
                        this.q.b(d);
                        this.q.a(c);
                    } else {
                        this.q.b(200);
                        this.q.a(225);
                    }
                    this.q.b();
                }
                if (b) {
                    if (this.S <= 62 && this.V) {
                        if (this.p.fD == 0) {
                            str = str + "@yel@|";
                        } else if (this.p.fD == 1) {
                            strE = strE + "@yel@|";
                        } else if (this.p.fD == 2) {
                            str2 = str2 + "<col=@or1@>|";
                        } else if (this.p.fD == 3) {
                            str3 = str3 + "@yel@|";
                        }
                    }
                    int i2 = 130 + 0;
                    int i3 = Configuration.h.booleanValue() ? 70 : 80;
                    if (this.j) {
                        this.K.a(280, i2 + 75, this.p.fD == 3);
                        this.p.gm.b("@or1@<img=144> 5-digit PIN:", 280 + 10, i2 + 16 + 75, class_492.c, 0);
                        this.p.gm.b("@whi@" + str3, 280 + 10, i2 + 44 + 75, class_492.c, 0);
                        this.t.b(135);
                        this.t.b();
                    } else {
                        this.I.a(280, i2, this.p.fD == 0);
                        this.J.a(280, i2 + i3, this.p.fD == 1);
                        if (Configuration.h.booleanValue()) {
                            this.L.a(280, i2 + i3 + i3, this.p.fD == 2);
                        }
                        this.p.gm.b("@or1@<img=179> Username:", 280 + 10, i2 + 16, class_492.c, 0);
                        this.p.gm.b("@whi@" + str, 280 + 10, i2 + 44, class_492.c, 0);
                        this.p.gm.b("@or1@<img=144> Password", 280 + 10, i2 + 16 + i3, class_492.c, 0);
                        this.p.gm.b("@whi@" + strE, 280 + 10, i2 + 44 + i3, class_492.c, 0);
                        if (Configuration.h.booleanValue()) {
                            this.p.gm.b("<col=@or1@>Invitation code:", 280 + 10, i2 + 16 + i3 + i3, 1048320, 0);
                            this.p.gm.b("@whi@" + str2, 280 + 10, i2 + 44 + i3 + i3, 1048320, 0);
                        }
                    }
                    int i4 = 280 + 125;
                    int i5 = i2 + 150;
                    this.F.a(i4, i5 + (Configuration.h.booleanValue() ? 60 : 0));
                    this.p.gm.b("@or1@Log in", i4 + 30, i5 + 30 + (Configuration.h.booleanValue() ? 60 : 0), class_492.c, 0);
                }
            }
            for (class_218 class_218Var : this.n) {
                if (class_218Var.c() >= 3) {
                    class_218Var.a();
                }
            }
            this.p.gZ.a(0, this.p.hG, 0);
            this.U = true;
        }
    }

    public void a(int i2, int i3, int i4, int i5, int i6) {
        this.N = "@or1@Exit";
        if (i4 >= 281 && i4 <= 330 && i3 >= 273 && i3 <= 400) {
            this.N = "@whi@" + "Exit";
        }
        if (i2 == 1) {
            if (i4 >= User32.WM_GESTURE + (Configuration.h.booleanValue() ? 80 : 0) + 0) {
                if (i4 <= 330 + (Configuration.h.booleanValue() ? 80 : 0) + 0 && i3 >= 408 && i3 <= 535) {
                    a(false);
                }
            }
            if (this.X != null && this.Y != null && this.M.b(this.ac, this.ad)) {
                Client.d(this.Y);
                if (this.Z != null) {
                    Configuration.bf = this.Z;
                    Configuration.d();
                }
            }
            if (this.N.startsWith("@whi@")) {
            }
            if (this.j) {
                return;
            }
            if (i5 >= 278 && i5 <= 539 && i6 >= 133 && i6 <= 192) {
                this.p.fD = 0;
            }
            if (i5 >= 278 && i5 <= 539 && i6 >= 210 && i6 <= 266) {
                this.p.fD = 1;
            }
            if (!Configuration.h.booleanValue() || i5 < 278 || i5 > 539 || i6 < 290 || i6 > 346) {
                return;
            }
            this.p.fD = 2;
        }
    }

    public void a(boolean z) {
        if (!this.p.fc && Launcher.n().f().a("LOGIN_COOLDOWN", 500L)) {
            a("<img=291> Attempting to login to game server", "Please wait..", false);
            b();
            this.V = false;
            this.q = null;
            this.p.el = 0;
            this.p.login(this.p.fk, this.p.fl, z);
            this.V = true;
        }
    }

    public void a(int i2) {
        this.t.a("It will be your account's PIN before October 2024", "If you do not remember it, request help on our forums!");
        if (i2 == 0) {
            a("This username registered before SPK's Fresh Start!", "@yel@Please enter your Recovery PIN to verify ownership", false);
            this.t.a(false);
            this.t.a();
        } else if (i2 == 1) {
            a("@yel@Invalid Recovery PIN!", "Please try again..", true);
            this.t.a(true);
            this.t.a();
        } else if (i2 == 2) {
            a("@yel@Invalid Recovery PIN!", "You have exceeded the maximum attempts", true);
            this.t.a(true);
            this.t.a();
            this.t.a("Please try again in a few minutes..", "If you do not remember it, request help on our forums!");
        }
        this.p.fD = 3;
        this.V = true;
        this.j = true;
    }

    public void a(int i2, String str, String str2) {
        this.R = i2;
        this.r = new class_219(this.p, this.x, str, str2, false);
    }

    public void a(String str, String str2) {
        if (str.contains("new players")) {
            str = "<img=286> " + str;
            c = 3;
            d = 354;
        } else {
            d = 75;
            c = 225;
        }
        this.q = new class_219(this.p, this.x, str, str2, true);
    }

    public void a(String str, String str2, boolean z) {
        if (str.contains("new players")) {
            str = "<img=286> " + str;
            c = 0;
            d = 350;
        } else {
            d = 75;
            c = 225;
        }
        this.q = new class_219(this.p, this.x, str, str2, z);
    }

    private void e() {
        if (this.w != null || this.v) {
            return;
        }
        new class_223(this).start();
        this.v = true;
    }

    private void f() {
        if (this.S > 0) {
            this.S--;
        } else {
            this.S = 125;
        }
    }

    public void a(class_221 class_221Var) {
        this.o = class_221Var;
    }

    public boolean c() {
        return this.W;
    }
}
