/*
 * Decompiled with CFR 0.152.
 */
package rs.p_d;

import rs.C_F_uc;
import rs.C_a;
import rs.p_a.C_h;
import rs.p_d.C_d;
import rs.p_d.C_r;
import rs.p_l.C_E_uc;
import rs.p_l.C_c;

public class C_e {
    public static C_F_uc a = new C_F_uc(20);
    public static C_F_uc b = new C_F_uc(20);

    public static void a() {
        a.a();
        b.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static rs.p_l.C_F_uc a(a a2, int n, int n2) {
        int n3;
        int n4;
        Object object;
        C_F_uc c_F_uc = null;
        switch (a2) {
            case a: {
                c_F_uc = a;
                break;
            }
            case b: {
                c_F_uc = b;
            }
        }
        rs.p_l.C_F_uc c_F_uc2 = (rs.p_l.C_F_uc)c_F_uc.a(n);
        if (c_F_uc2 != null && c_F_uc2.s != n2 && c_F_uc2.s != -1) {
            c_F_uc2.b();
            c_F_uc2 = null;
        }
        if (c_F_uc2 != null) {
            return c_F_uc2;
        }
        C_h c_h = null;
        int n5 = 2750;
        int n6 = 40;
        int n7 = 1882;
        boolean bl = false;
        boolean bl2 = false;
        int n8 = 0;
        switch (a2) {
            case a: {
                C_d c_d = C_d.c(n);
                if (c_d == null) {
                    return null;
                }
                c_h = c_d.b();
                n8 = 25;
                break;
            }
            case b: {
                C_r.I = true;
                try {
                    object = C_r.c(n);
                    if (object == null) {
                        rs.p_l.C_F_uc c_F_uc3 = null;
                        return c_F_uc3;
                    }
                    c_h = ((C_r)object).a(10, -1, 0, -1);
                    if (c_h == null) {
                        rs.p_l.C_F_uc c_F_uc4 = null;
                        return c_F_uc4;
                    }
                    n8 = c_h.g / 2;
                    break;
                }
                finally {
                    C_r.I = false;
                }
            }
        }
        if (c_h == null) {
            return null;
        }
        int n9 = n2 > 32 ? n2 : 32;
        object = new rs.p_l.C_F_uc(n9, n9);
        int n10 = C_E_uc.s;
        int n11 = C_E_uc.t;
        int[] nArray = C_E_uc.x;
        int[] nArray2 = C_c.g;
        int n12 = C_c.h;
        int n13 = C_c.i;
        int n14 = C_c.l;
        int n15 = C_c.m;
        int n16 = C_c.j;
        int n17 = C_c.k;
        C_E_uc.p = false;
        C_E_uc.q = false;
        C_c.a(n9, n9, ((rs.p_l.C_F_uc)object).m, null);
        C_c.a(0, 0, n9, n9, 0, true);
        C_E_uc.f();
        n5 = (int)Math.floor((float)n5 * (32.0f / (float)n2));
        int n18 = C_E_uc.v[n6] * n5 >> 16;
        int n19 = C_E_uc.w[n6] * n5 >> 16;
        C_E_uc.h = true;
        try {
            if (a2 == rs.p_d.C_e$a.a) {
                c_h.b(64, 768, -50, -10, -50, true);
            }
            c_h.a(n7, 0, n6, 0, n18 + n8, n19 + n8);
        }
        finally {
            C_E_uc.h = false;
        }
        int n20 = n4 = n2 > 32 ? n2 - 1 : 31;
        while (n4 >= 0) {
            int n21 = n3 = n2 > 32 ? n2 - 1 : 31;
            while (n3 >= 0) {
                if (((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] == 0) {
                    if (n4 > 0 && ((rs.p_l.C_F_uc)object).m[n4 - 1 + n3 * (n2 > 32 ? n2 : 32)] > 1) {
                        ((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] = 0;
                    } else if (n3 > 0 && ((rs.p_l.C_F_uc)object).m[n4 + (n3 - 1) * (n2 > 32 ? n2 : 32)] > 1) {
                        ((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] = 0;
                    } else if (n4 < (n2 > 32 ? n2 - 1 : 31) && ((rs.p_l.C_F_uc)object).m[n4 + 1 + n3 * (n2 > 32 ? n2 : 32)] > 1) {
                        ((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] = 0;
                    } else if (n3 < (n2 > 32 ? n2 - 1 : 31) && ((rs.p_l.C_F_uc)object).m[n4 + (n3 + 1) * (n2 > 32 ? n2 : 32)] > 1) {
                        ((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] = 0;
                    }
                }
                --n3;
            }
            --n4;
        }
        if (n2 <= 32) {
            int n22 = n4 = n2 > 32 ? n2 - 1 : 31;
            while (n4 >= 0) {
                int n23 = n3 = n2 > 32 ? n2 - 1 : 31;
                while (n3 >= 0) {
                    if (((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] == 0 && n4 > 0 && n3 > 0 && ((rs.p_l.C_F_uc)object).m[n4 - 1 + (n3 - 1) * 32] > 0) {
                        ((rs.p_l.C_F_uc)object).m[n4 + n3 * (n2 > 32 ? n2 : 32)] = 0x302020;
                    }
                    --n3;
                }
                --n4;
            }
        }
        c_F_uc.a((C_a)object, n);
        C_c.a(n12, n13, nArray2, null);
        C_c.c(n17, n14, n15, n16);
        C_E_uc.s = n10;
        C_E_uc.t = n11;
        C_E_uc.x = nArray;
        C_E_uc.p = true;
        C_E_uc.q = true;
        ((rs.p_l.C_F_uc)object).r = n2;
        ((rs.p_l.C_F_uc)object).s = n2;
        ((rs.p_l.C_F_uc)object).h = n2;
        return object;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = rs.p_d.C_e$a.a();
        }
    }
}

