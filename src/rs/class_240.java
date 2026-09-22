package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_240.class */
public class class_240 extends class_253 {
    private static final String O = "HG";
    private static final String P = "<img=79> @gre@H'ween Hunger Games Lobby <img=79>";
    private static final String Q = "<img=244> @gr1@(There must be 5-15 players for a match to start) <img=244>";
    private static final String R = "<img=233>";
    private static final String S = "<img=121>";
    private static final String T = "@or1@Next event: @whi@<img=230>";
    private static final String U = "@or1@Next power-up: @whi@<img=231>";
    private static final String V = "@gre@Ceasefire time: <img=37>";
    private static final String W = "<img=91> @lre@Players can't fight yet";
    private static final String X = "<img=246> @gre@Players can open chests!";
    private static final String Y = "@cya@Safety Countdown: <img=37>";
    private static final String Z = "<img=91> @lre@Players can't fight yet";
    private static final String aa = "<img=247> @lre@Players can't open chests yet";
    private static final String ab = "@or1@Match Type:";
    public static final String v = "...";
    public static final String w = "...";
    public static final int D = 135;
    public static class_333 N;
    public static String p = "";
    public static String q = "";
    public static String r = "";
    public static String s = "@whi@Wins: 0 | Matches: 0 | Points: 0";
    public static String t = "";
    public static String u = "";
    public static long x = 0;
    public static long y = 0;
    public static long z = 0;
    public static boolean A = false;
    public static boolean B = false;
    public static int C = 0;
    public static boolean E = false;
    public static int F = -1;
    public static long G = 0;
    public static long H = 0;
    public static int I = 0;
    public static String J = "Match Style: @gre@N/A";
    public static String K = "";
    public static String L = "";
    public static String M = "";

    @Override // rs.class_253
    public void b() {
        N = new class_333("popups/cancel");
        a(new int[]{18032, 18033, 18034, 18041, 18042, 18043, 18044}, new class_241(this));
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var != class_254.a) {
            if (client.aJ) {
                b(client);
                return;
            } else {
                if (Client.ed == 197 && Widget.H[199].as.contains(O)) {
                    c(client);
                    return;
                }
                return;
            }
        }
        if (B && !client.aJ) {
            client.gm.c("<img=50> You're in the fog! Go to the <img=73> Safe Zone, south of the map! <img=50>", 256, Client.ak - (Configuration.ai == class_151.b ? 180 : 10), class_492.c, 0);
            class_210.b(Client.ak, 0, 0, 15282688, Client.aj, 60);
        }
        if (Client.ed == 197 && Widget.H[199].as.contains(O)) {
            d(client);
        }
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return client.aJ || (Client.ed == 197 && Widget.H[199].as.contains(O));
    }

    public void b(Client client) {
        int i = 120;
        int i2 = 15;
        if (Configuration.ai == class_151.b) {
            i2 = 5;
            i = (Client.aj / 2) - 150;
        }
        int i3 = class_324.ap;
        class_210.b(60, i2, i, 4884594, 300, 125);
        class_210.b(58, i2 + 1, i + 1, 4863488, aU.ia_, 125);
        client.gm.c(r, i + 150, i2 + 18, class_492.c, 0);
        Client.gl.c(Q, i + 150, i2 + 35, class_492.c, 0);
        Client.gl.c(s, i + 150, i2 + 53, class_492.c, 0);
        class_324.ap = i3;
    }

    public void c(Client client) {
        int i = 397;
        int i2 = 2;
        if (Configuration.ai == class_151.b) {
            i = 200 + (Client.ai - 560);
            i2 = 25;
        }
        class_210.b(41, i2, i, 12884294, 113, 50);
        class_210.b(35, i2 + 3, i + 3, 4863488, 107, 100);
        Client.gl.b(R, i + 9, i2 + 17, class_492.c, 0);
        Client.gl.b(S, i + 8, i2 + 18 + 14 + 1, class_492.c, 0);
        Client.gl.b(t, i + 8 + 17, i2 + 17 + 1, class_492.c, 0);
        Client.gl.b(u, i + 8 + 17, i2 + 18 + 14 + 1, class_492.c, 0);
        if (A) {
            if (C > 1) {
                Client.gl.a(T, (i + 110) - 15, i2 + 54, class_492.c, 0);
                if (x > System.currentTimeMillis()) {
                    Client.gl.b(((x - System.currentTimeMillis()) / 1000), i + 97, i2 + 54, class_492.c, 0);
                } else {
                    Client.gl.b("...", i + 97, i2 + 54, class_492.c, 0);
                }
                Client.gl.a(U, (i + 110) - 15, i2 + 54 + 15, class_492.c, 0);
                if (y > System.currentTimeMillis()) {
                    Client.gl.b(((y - System.currentTimeMillis()) / 1000), i + 97, i2 + 55 + 15, class_492.c, 0);
                    return;
                } else {
                    Client.gl.b("...", i + 97, i2 + 55 + 15, class_492.c, 0);
                    return;
                }
            }
            client.gm.a(C == 0 ? Y : V, (i + 110) - 15, i2 + 55, class_492.c, 0);
            long jCurrentTimeMillis = (z - System.currentTimeMillis()) / 1000;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            if (F == C) {
                f();
                F++;
            }
            client.gm.b(jCurrentTimeMillis, i + 97, i2 + 55, class_492.c, 0);
            Client.gl.a(C == 0 ? aa : X, i + 110, i2 + 55 + 16, class_492.c, 0);
            Client.gl.a(C == 0 ? "<img=91> @lre@Players can't fight yet" : "<img=91> @lre@Players can't fight yet", i + 110, i2 + 55 + 16 + 16, class_492.c, 0);
        }
    }

    public void d(Client client) {
        if (Configuration.ai == class_151.b) {
            int i = 200 + (Client.ai - 560);
        }
        if (I > 0 || E) {
            if (E) {
                I += 2;
                if (I >= 135) {
                    E = false;
                }
            } else {
                if (H == 0) {
                    H = System.currentTimeMillis() + G;
                }
                if (System.currentTimeMillis() > H) {
                    I--;
                }
            }
            if (I <= 0) {
                I = 0;
            }
            if (I > 135) {
                I = 135;
            }
            int i2 = 120;
            int i3 = 250;
            if (Configuration.ai == class_151.b) {
                i3 = 300;
                i2 = (Client.aj / 2) - 150;
            }
            long jCurrentTimeMillis = (z - System.currentTimeMillis()) / 1000;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            if (C == 0) {
                K = "<img=49> @gre@Safety Countdown <img=49>";
                L = "Contestants can not fight or open chests yet!";
                M = "<img=247> @yel@Chests unlock in " + jCurrentTimeMillis + " seconds! <img=247>";
            }
            if (C == 1) {
                K = "<img=73> @gre@Ceasefire Stage <img=73>";
                L = "@yel@Contestants can now safely loot chests!";
                M = "<img=50> @or1@PvP enables in " + jCurrentTimeMillis + " seconds! <img=50>";
            }
            class_210.b(65, i3, i2, 12884294, 300, I);
            class_210.b(59, i3 + 3, i2 + 3, 4863488, User32.WM_MENUCOMMAND, I);
            int i4 = class_324.ap;
            class_324.ap = (int) (((double) I) * 1.5d);
            if (class_324.ap > 255) {
                class_324.ap = 255;
            }
            client.gn.c(K, i2 + 150, i3 + 20, class_492.c, 0);
            client.gm.c(L, i2 + 150, i3 + 3 + 34, class_492.c, 0);
            client.gm.c(M, i2 + 150, i3 + 3 + 51, class_492.c, 0);
            class_324.ap = i4;
        }
    }

    @Override // rs.class_253
    public void c() {
    }

    private void f() {
        E = true;
        G = 3500L;
        H = 0L;
    }
}
