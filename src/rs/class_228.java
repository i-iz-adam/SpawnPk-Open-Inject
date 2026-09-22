package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_228.class */
public class class_228 extends class_253 {
    public static final int q = 140;
    public static final int r = 160;
    public static final int s = 88;
    public static final int t = 5918522;
    public static final int u = 2367511;
    private static final String w = "Correct F3:";
    private static final String x = "Magic:";
    private static final String y = "Damage:";
    private static String z;
    private static String A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static String F;
    private static String G;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    private static String L;
    private static String M;
    private static int N;
    private static int O;
    private static String P;
    private static String Q;
    private static int R;
    private static int S;
    private static int T;
    private static int U;
    private static String V;
    private static String W;
    private static String X;
    private static String Y;
    public static boolean p = false;
    public static class_553 v = new class_229();
    private static boolean Z = true;
    private static boolean aa = true;
    private static boolean ab = true;

    @Override // rs.class_253
    public void b() {
        g();
        p = true;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        int i;
        int i2;
        int i3;
        int i4;
        if (class_254Var == class_254.b) {
            return;
        }
        if (Configuration.ai == class_151.b) {
            i = 10;
            i3 = Client.aj - 400;
            i4 = 5;
            i2 = 5;
        } else {
            i = 1 + 4;
            i2 = 1 + 4;
            i3 = 350 + 4;
            i4 = 1 + 4;
        }
        a(i, i2, z, B, C, F, L, P, V, X);
        a(i3, i4, A, D, E, G, M, Q, W, Y);
    }

    @Override // rs.class_253
    public void c() {
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return f();
    }

    public void a(int i, int i2, String str, int i3, int i4, String str2, String str3, String str4, String str5, String str6) {
        int i5 = 88;
        if (!Z) {
            i5 = 88 - 17;
        }
        if (!aa) {
            i5 -= 17;
        }
        if (!ab) {
            i5 -= 17;
        }
        class_210.b(i5, i2, i, t, 160, 140);
        class_210.b(i5 - 4, i2 + 2, i + 2, u, 156, 140);
        int i6 = i2 + 18;
        int i7 = i + 2 + ((160 - 156) / 2);
        class_210.b(15 + 2, i6 - 1, i7 - 1, 0, (156 - 4) + 2, 90);
        class_210.b(15, i6, i7, 13960709, 156 - 4, 150);
        class_210.b(15, i6, i7, 30976, a(i3, i4, 156), 255);
        Client.fE[80].f(i7, i6 - 17);
        Client.gl.b(str, i7 + 15, i6 - 3, class_492.e, 0);
        Client.gl.c(str2, i7 + (156 / 2), i6 + 12, class_492.c, 0);
        int i8 = i6 + 29;
        if (aa) {
            int i9 = i + 5;
            class_210.b(15, i8 - 12, i + 3, 65401, 154, 62);
            Client.fE[85].f(i9 + 1, i8 - 12);
            Client.gl.b(w, i9 + 19, i8, class_492.c, 0);
            Client.gl.b(str3, (i9 + 83) - 6, i8, 65401, 0);
            i8 += 15 + 2;
        }
        if (ab) {
            int i10 = i + 5;
            class_210.b(15, i8 - 12, i + 3, 47103, 154, 62);
            Client.fE[55].f(i10, i8 - 11);
            Client.gl.b(x, i10 + 19, i8, class_492.c, 0);
            Client.gl.b(str5, (i10 + 83) - 30, i8, 47103, 0);
            Client.gl.a(str6, i10 + 83 + 68, i8, class_492.d, 0);
            i8 += 15 + 2;
        }
        if (Z) {
            int i11 = i + 5;
            class_210.b(15, i8 - 12, i + 3, class_492.e, 154, 62);
            Client.fE[53].f(i11, i8 - 11);
            Client.gl.b(y, i11 + 19, i8, class_492.c, 0);
            Client.gl.b(str4, (i11 + 83) - 20, i8, class_492.e, 0);
        }
    }

    public void a(boolean z2) {
        p = z2;
    }

    public static boolean f() {
        return p && Configuration.bj;
    }

    public static void g() {
        A = "N/A";
        z = "N/A";
        E = 0;
        D = 0;
        C = 0;
        B = 0;
        G = "0 / 0";
        F = "0 / 0";
        J = 0;
        H = 0;
        K = 0;
        I = 0;
        M = "0/0 (0%)";
        L = "0/0 (0%)";
        O = 0;
        N = 0;
        Q = "0 (0)";
        P = "0 (0)";
        T = 0;
        R = 0;
        U = 0;
        S = 0;
        W = "0/0 (0%)";
        V = "0/0 (0%)";
        Y = "[0%]";
        X = "[0%]";
    }

    private int a(int i, int i2, int i3) {
        int i4 = (int) ((i3 - 4) * (i / i2));
        if (i > 0 && i4 <= 0) {
            i4 = 1;
        }
        if (i4 > i3 - 4) {
            i4 = i3 - 4;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return i4;
    }
}
