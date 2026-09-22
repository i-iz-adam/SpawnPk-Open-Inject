package rs.runelite.a;

import rs.Client;
import rs.Npc;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/g.class */
public class g {
    public static final int a = 516;
    public static final int b = 20;
    public static final int c = 412;
    public static final int d = 225;
    public static final int e = 965;
    public static final int f = 478;
    public static final int g = 1025;
    public static final int h = 582;
    public static final int i = 413;
    public static final int j = 561;
    public static final int k = 779;
    public static final int l = 27;
    public static final int m = 577;
    public static final int n = 729;
    public static final int o = 491;
    public static final int p = 365;
    public static final int q = 502;
    public static final int r = 900;
    public static final int s = 113;
    public static final int t = 872;
    public static final int u = 1062;
    public static final int v = 1226;
    public static final int w = 454;
    public static final int x = 74;
    public static final int y = 454;
    public static final int z = 539;
    public static final int A = 493;
    public static final int B = 847;
    public static final int C = 1125;
    public static final int D = 1504;

    public static boolean a(int i2) {
        return i2 == 20 || i2 == 412 || i2 == 225 || i2 == 965 || i2 == 478 || i2 == 1025 || i2 == 582 || i2 == 413;
    }

    public static boolean b(int i2) {
        return i2 == 561 || i2 == 779 || i2 == 27 || i2 == 577 || i2 == 729 || i2 == 491 || i2 == 365;
    }

    public static boolean c(int i2) {
        return i2 == 502 || i2 == 900 || i2 == 113 || i2 == 872 || i2 == 1062;
    }

    public static boolean d(int i2) {
        return i2 == 454 || i2 == 74 || i2 == 454 || i2 == 539 || i2 == 493 || i2 == 847 || i2 == 447;
    }

    public static int e(int i2) {
        Npc npcF = f(i2);
        if (npcF == null) {
            return -1;
        }
        return npcF.n();
    }

    public static Npc f(int i2) {
        Client clientO = Launcher.n().o();
        int i3 = clientO.eJ[i2];
        if (i3 < 0 || i3 >= clientO.cA.length) {
            return null;
        }
        return clientO.cA[i3];
    }
}
