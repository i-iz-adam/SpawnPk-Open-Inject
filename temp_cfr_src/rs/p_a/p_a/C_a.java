/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a.p_a;

import java.util.HashMap;
import rs.C_F_uc;
import rs.C_S_uc;
import rs.p_a.C_d;

public class C_a
extends rs.C_a {
    public HashMap<b, Object> f;
    public int g;
    public int h;
    public C_S_uc i;
    public C_S_uc j;
    public C_d k;
    public int[][] l;
    public int[][] m;
    public transient float[] n;
    public boolean o = true;
    public boolean p = false;
    private long q = System.currentTimeMillis();
    private boolean r;

    public static C_a a(C_F_uc c_F_uc, int n) {
        if (c_F_uc.a(n) == null) {
            return new C_a(true);
        }
        return (C_a)c_F_uc.a(n);
    }

    public C_a(boolean bl) {
        if (bl) {
            this.f = new HashMap();
        }
    }

    public C_d a(int n) {
        if (!this.f() || this.k == null || this.k.a() != n) {
            this.k = new C_d(n);
        } else if (this.p) {
            for (int i = 0; i < n; ++i) {
                this.k.a(i, 0);
                this.k.b(i, 0);
                this.k.c(i, 0);
            }
        }
        return this.k;
    }

    public C_S_uc b(int n) {
        if (!this.f() || this.i == null || this.i.a() != n) {
            this.i = new C_S_uc(n);
        } else if (this.p) {
            for (int i = 0; i < n; ++i) {
                this.i.a(i, 0);
                this.i.b(i, 0);
                this.i.c(i, 0);
                this.i.d(i, 0);
            }
        }
        return this.i;
    }

    public C_S_uc c(int n) {
        if (!this.f() || this.j == null || this.j.a() != n) {
            this.j = new C_S_uc(n);
        } else if (this.p) {
            for (int i = 0; i < n; ++i) {
                this.j.a(i, 0);
                this.j.b(i, 0);
                this.j.c(i, 0);
                this.j.d(i, 0);
            }
        }
        return this.j;
    }

    public void c() {
        this.n = new float[this.h * 6];
    }

    public int[] a(b b2) {
        if (this.f != null && this.f.containsKey((Object)b2) && b2.s == rs.p_a.p_a.C_a$c.a) {
            return (int[])this.f.get((Object)b2);
        }
        return new int[this.a(b2.r)];
    }

    public boolean[] b(b b2) {
        if (this.f != null && this.f.containsKey((Object)b2) && b2.s == rs.p_a.p_a.C_a$c.b) {
            return (boolean[])this.f.get((Object)b2);
        }
        return new boolean[this.a(b2.r)];
    }

    public byte[] c(b b2) {
        if (this.f != null && this.f.containsKey((Object)b2) && b2.s == rs.p_a.p_a.C_a$c.c) {
            return (byte[])this.f.get((Object)b2);
        }
        return new byte[this.a(b2.r)];
    }

    public void d() {
        if (this.f == null) {
            return;
        }
        int n = this.a(rs.p_a.p_a.C_a$a.a);
        int n2 = this.a(rs.p_a.p_a.C_a$a.b);
        for (int i = 0; i < Math.max(n, n2); ++i) {
            if (i < n) {
                this.d(i);
            }
            if (i >= n2) continue;
            this.e(i);
        }
    }

    public void d(int n) {
        if (this.f == null) {
            return;
        }
        this.a(rs.p_a.p_a.C_a$b.j, n);
        this.a(rs.p_a.p_a.C_a$b.d, n);
        this.a(rs.p_a.p_a.C_a$b.e, n);
        this.a(rs.p_a.p_a.C_a$b.f, n);
        this.a(rs.p_a.p_a.C_a$b.a, n);
        this.a(rs.p_a.p_a.C_a$b.b, n);
        this.a(rs.p_a.p_a.C_a$b.c, n);
        this.a(rs.p_a.p_a.C_a$b.i, n);
        this.a(rs.p_a.p_a.C_a$b.h, n);
        this.a(rs.p_a.p_a.C_a$b.g, n);
        this.a(rs.p_a.p_a.C_a$b.k, n);
    }

    public void e(int n) {
        this.a(rs.p_a.p_a.C_a$b.l, n);
        this.a(rs.p_a.p_a.C_a$b.p, n);
        this.a(rs.p_a.p_a.C_a$b.q, n);
        this.a(rs.p_a.p_a.C_a$b.m, n);
        this.a(rs.p_a.p_a.C_a$b.n, n);
        this.a(rs.p_a.p_a.C_a$b.o, n);
    }

    public void e() {
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.j);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.d);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.e);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.f);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.a);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.b);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.c);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.i);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.h);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.g);
        this.a(rs.p_a.p_a.C_a$a.a, rs.p_a.p_a.C_a$b.k);
        this.a(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$b.l);
        this.a(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$b.p);
        this.a(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$b.q);
        this.a(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$b.m);
        this.a(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$b.n);
        this.a(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$b.o);
    }

    public void a(a a2, b b2) {
        if (this.f == null || !this.f()) {
            return;
        }
        if (!this.f.containsKey((Object)b2)) {
            this.f.put(b2, new int[this.a(a2)]);
        }
    }

    public void b(a a2, b b2) {
        if (this.f == null) {
            return;
        }
        if (!this.f.containsKey((Object)b2)) {
            int n = this.a(a2);
            switch (b2.s) {
                case a: {
                    this.f.put(b2, new int[n]);
                    break;
                }
                case b: {
                    this.f.put(b2, new boolean[n]);
                    break;
                }
                case c: {
                    this.f.put(b2, new byte[n]);
                }
            }
        } else {
            block10: for (int i = 0; i < this.a(a2); ++i) {
                switch (b2.s) {
                    case a: {
                        ((int[])this.f.get((Object)((Object)b2)))[i] = 0;
                        continue block10;
                    }
                    case b: {
                        ((boolean[])this.f.get((Object)((Object)b2)))[i] = false;
                        continue block10;
                    }
                    case c: {
                        ((byte[])this.f.get((Object)((Object)b2)))[i] = 0;
                    }
                }
            }
        }
    }

    private void a(b b2, int n) {
        if (!this.f.containsKey((Object)b2)) {
            return;
        }
        switch (b2.s) {
            case a: {
                ((int[])this.f.get((Object)((Object)b2)))[n] = 0;
                break;
            }
            case b: {
                ((boolean[])this.f.get((Object)((Object)b2)))[n] = false;
                break;
            }
            case c: {
                ((byte[])this.f.get((Object)((Object)b2)))[n] = 0;
            }
        }
    }

    public void a(int n, int n2) {
        if (this.g != n2 || this.h != n) {
            this.g = n2;
            this.h = n;
            if (this.f()) {
                this.h();
            }
        }
    }

    public void b(int n, int n2) {
        this.g = n2;
        this.h = n;
    }

    public boolean f() {
        return this.f != null;
    }

    public boolean g() {
        return System.currentTimeMillis() - this.q <= 1000L;
    }

    private void h() {
        if (this.f == null) {
            return;
        }
        this.f.clear();
        this.n = null;
        this.i = null;
        this.j = null;
    }

    private int a(a a2) {
        switch (a2) {
            case a: {
                return this.h;
            }
            case b: {
                return this.g;
            }
        }
        return 0;
    }

    public void a(boolean bl) {
        this.r = bl;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b b = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b c = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b d = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b e = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b f = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b g = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b h = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b i = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b j = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b k = new b(rs.p_a.p_a.C_a$a.a);
        public static final /* enum */ b l = new b(rs.p_a.p_a.C_a$a.b);
        public static final /* enum */ b m = new b(rs.p_a.p_a.C_a$a.b);
        public static final /* enum */ b n = new b(rs.p_a.p_a.C_a$a.b);
        public static final /* enum */ b o = new b(rs.p_a.p_a.C_a$a.b);
        public static final /* enum */ b p = new b(rs.p_a.p_a.C_a$a.b);
        public static final /* enum */ b q = new b(rs.p_a.p_a.C_a$a.b, rs.p_a.p_a.C_a$c.c);
        a r;
        c s;
        private static final /* synthetic */ b[] t;

        public static b[] values() {
            return (b[])t.clone();
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        private b(a a2) {
            this(a2, rs.p_a.p_a.C_a$c.a);
        }

        private b(a a2, c c2) {
            this.r = a2;
            this.s = c2;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q};
        }

        static {
            t = rs.p_a.p_a.C_a$b.a();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = rs.p_a.p_a.C_a$c.a();
        }
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
            c = rs.p_a.p_a.C_a$a.a();
        }
    }
}

