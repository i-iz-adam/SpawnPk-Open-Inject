/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a.p_a;

import rs.p_x.C_e;

public class C_c {
    private static final int b = 10;
    private static int c;
    public static C_e[] a;

    public static C_e a(byte[] byArray) {
        if (a[c] == null) {
            C_c.a[C_c.c] = new C_e(byArray);
        } else {
            a[c].b(byArray);
        }
        return a[c++];
    }

    public static void a() {
        for (int i = 0; i <= c; ++i) {
            if (a[c] == null) continue;
            a[c].b(null);
        }
        c = 0;
    }

    static {
        a = new C_e[10];
    }
}

