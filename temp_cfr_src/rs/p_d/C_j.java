/*
 * Decompiled with CFR 0.152.
 */
package rs.p_d;

import rs.p_a.C_h;
import rs.p_x.C_e;
import rs.p_x.C_f;

public final class C_j {
    public static int a;
    public static C_j[] b;
    public int c = -1;
    public int[] d;
    private final int[] f;
    private final int[] g;
    private final int[] h = new int[]{-1, -1, -1, -1, -1};
    public boolean e = false;

    public static void a(C_f c_f) {
        C_e c_e = new C_e(c_f.a("idk.dat"));
        a = c_e.A();
        if (b == null) {
            b = new C_j[a];
        }
        for (int i = 0; i < a; ++i) {
            if (b[i] == null) {
                C_j.b[i] = new C_j();
            }
            b[i].a(c_e);
        }
    }

    private void a(C_e c_e) {
        int n;
        block0: while ((n = c_e.y()) != 0) {
            if (n == 1) {
                this.c = c_e.y();
                continue;
            }
            if (n == 2) {
                int n2 = c_e.y();
                this.d = new int[n2];
                int n3 = 0;
                while (true) {
                    if (n3 >= n2) continue block0;
                    this.d[n3] = c_e.A();
                    ++n3;
                }
            }
            if (n == 3) {
                this.e = true;
                continue;
            }
            if (n >= 40 && n < 50) {
                this.f[n - 40] = c_e.A();
                continue;
            }
            if (n >= 50 && n < 60) {
                this.g[n - 50] = c_e.A();
                continue;
            }
            if (n >= 60 && n < 70) {
                this.h[n - 60] = c_e.A();
                continue;
            }
            System.out.println("[IDK] Error unrecognised config code: " + n);
        }
        return;
    }

    public boolean a() {
        if (this.d == null) {
            return true;
        }
        boolean bl = true;
        for (int i = 0; i < this.d.length; ++i) {
            if (C_h.f(this.d[i])) continue;
            bl = false;
        }
        return bl;
    }

    public C_h b() {
        if (this.d == null) {
            return null;
        }
        C_h[] c_hArray = new C_h[this.d.length];
        for (int i = 0; i < this.d.length; ++i) {
            c_hArray[i] = C_h.e(this.d[i]);
            if (c_hArray[i] == null) {
                return null;
            }
            int[] nArray = new int[]{0};
            int[] nArray2 = new int[]{1};
            for (int j = 0; j < nArray.length; ++j) {
                c_hArray[i].i(nArray[j], nArray2[j]);
            }
        }
        C_h c_h = c_hArray.length == 1 ? c_hArray[0] : new C_h(c_hArray.length, c_hArray);
        for (int i = 0; i < 6 && this.f[i] != 0; ++i) {
            c_h.i(this.f[i], this.g[i]);
        }
        return c_h;
    }

    public boolean c() {
        boolean bl = true;
        for (int i = 0; i < 5; ++i) {
            if (this.h[i] == -1 || C_h.f(this.h[i])) continue;
            bl = false;
        }
        return bl;
    }

    public C_h d() {
        C_h[] c_hArray = new C_h[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            if (this.h[i] == -1) continue;
            c_hArray[n++] = C_h.e(this.h[i]);
        }
        C_h c_h = new C_h(n, c_hArray);
        for (int i = 0; i < 6 && this.f[i] != 0; ++i) {
            c_h.i(this.f[i], this.g[i]);
        }
        return c_h;
    }

    private C_j() {
        this.f = new int[6];
        this.g = new int[6];
    }
}

