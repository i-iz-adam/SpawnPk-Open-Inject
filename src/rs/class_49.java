package rs;

import java.util.HashMap;

/* JADX INFO: loaded from: client-final.jar:rs/class_49.class */
public class class_49 extends class_47 {
    public HashMap<class_51, Object> f;
    public int g;
    public int h;
    public class_43 i;
    public class_43 j;
    public class_63 k;
    public int[][] l;
    public int[][] m;
    public transient float[] n;
    public boolean o = true;
    public boolean p = false;
    private long q = System.currentTimeMillis();
    private boolean r;

    public static class_49 a(class_30 class_30Var, int i) {
        return class_30Var.a((long) i) == null ? new class_49(true) : (class_49) class_30Var.a(i);
    }

    public class_49(boolean z) {
        if (z) {
            this.f = new HashMap<>();
        }
    }

    public class_63 a(int i) {
        if (!f() || this.k == null || this.k.a() != i) {
            this.k = new class_63(i);
        } else if (this.p) {
            for (int i2 = 0; i2 < i; i2++) {
                this.k.a(i2, 0);
                this.k.b(i2, 0);
                this.k.c(i2, 0);
            }
        }
        return this.k;
    }

    public class_43 b(int i) {
        if (!f() || this.i == null || this.i.a() != i) {
            this.i = new class_43(i);
        } else if (this.p) {
            for (int i2 = 0; i2 < i; i2++) {
                this.i.a(i2, 0);
                this.i.b(i2, 0);
                this.i.c(i2, 0);
                this.i.d(i2, 0);
            }
        }
        return this.i;
    }

    public class_43 c(int i) {
        if (!f() || this.j == null || this.j.a() != i) {
            this.j = new class_43(i);
        } else if (this.p) {
            for (int i2 = 0; i2 < i; i2++) {
                this.j.a(i2, 0);
                this.j.b(i2, 0);
                this.j.c(i2, 0);
                this.j.d(i2, 0);
            }
        }
        return this.j;
    }

    public void c() {
        this.n = new float[this.h * 6];
    }

    public int[] a(class_51 class_51Var) {
        return (this.f != null && this.f.containsKey(class_51Var) && class_51Var.s == class_52.a) ? (int[]) this.f.get(class_51Var) : new int[a(class_51Var.r)];
    }

    public boolean[] b(class_51 class_51Var) {
        return (this.f != null && this.f.containsKey(class_51Var) && class_51Var.s == class_52.b) ? (boolean[]) this.f.get(class_51Var) : new boolean[a(class_51Var.r)];
    }

    public byte[] c(class_51 class_51Var) {
        return (this.f != null && this.f.containsKey(class_51Var) && class_51Var.s == class_52.c) ? (byte[]) this.f.get(class_51Var) : new byte[a(class_51Var.r)];
    }

    public void d() {
        if (this.f == null) {
            return;
        }
        int iA = a(class_50.a);
        int iA2 = a(class_50.b);
        for (int i = 0; i < Math.max(iA, iA2); i++) {
            if (i < iA) {
                d(i);
            }
            if (i < iA2) {
                e(i);
            }
        }
    }

    public void d(int i) {
        if (this.f == null) {
            return;
        }
        a(class_51.j, i);
        a(class_51.d, i);
        a(class_51.e, i);
        a(class_51.f, i);
        a(class_51.a, i);
        a(class_51.b, i);
        a(class_51.c, i);
        a(class_51.i, i);
        a(class_51.h, i);
        a(class_51.g, i);
        a(class_51.k, i);
    }

    public void e(int i) {
        a(class_51.l, i);
        a(class_51.p, i);
        a(class_51.q, i);
        a(class_51.m, i);
        a(class_51.n, i);
        a(class_51.o, i);
    }

    public void e() {
        a(class_50.a, class_51.j);
        a(class_50.a, class_51.d);
        a(class_50.a, class_51.e);
        a(class_50.a, class_51.f);
        a(class_50.a, class_51.a);
        a(class_50.a, class_51.b);
        a(class_50.a, class_51.c);
        a(class_50.a, class_51.i);
        a(class_50.a, class_51.h);
        a(class_50.a, class_51.g);
        a(class_50.a, class_51.k);
        a(class_50.b, class_51.l);
        a(class_50.b, class_51.p);
        a(class_50.b, class_51.q);
        a(class_50.b, class_51.m);
        a(class_50.b, class_51.n);
        a(class_50.b, class_51.o);
    }

    public void a(class_50 class_50Var, class_51 class_51Var) {
        if (this.f == null || !f() || this.f.containsKey(class_51Var)) {
            return;
        }
        this.f.put(class_51Var, new int[a(class_50Var)]);
    }

    public void b(class_50 class_50Var, class_51 class_51Var) {
        if (this.f == null) {
            return;
        }
        if (!this.f.containsKey(class_51Var)) {
            int iA = a(class_50Var);
            switch (class_51Var.s) {
                case a:
                    this.f.put(class_51Var, new int[iA]);
                    break;
                case b:
                    this.f.put(class_51Var, new boolean[iA]);
                    break;
                case c:
                    this.f.put(class_51Var, new byte[iA]);
                    break;
            }
            return;
        }
        for (int i = 0; i < a(class_50Var); i++) {
            switch (class_51Var.s) {
                case a:
                    ((int[]) this.f.get(class_51Var))[i] = 0;
                    break;
                case b:
                    ((boolean[]) this.f.get(class_51Var))[i] = false;
                    break;
                case c:
                    ((byte[]) this.f.get(class_51Var))[i] = 0;
                    break;
            }
        }
    }

    private void a(class_51 class_51Var, int i) {
        if (this.f.containsKey(class_51Var)) {
            switch (class_51Var.s) {
                case a:
                    ((int[]) this.f.get(class_51Var))[i] = 0;
                    break;
                case b:
                    ((boolean[]) this.f.get(class_51Var))[i] = false;
                    break;
                case c:
                    ((byte[]) this.f.get(class_51Var))[i] = 0;
                    break;
            }
        }
    }

    public void a(int i, int i2) {
        if (this.g == i2 && this.h == i) {
            return;
        }
        this.g = i2;
        this.h = i;
        if (f()) {
            h();
        }
    }

    public void b(int i, int i2) {
        this.g = i2;
        this.h = i;
    }

    public boolean f() {
        return this.f != null;
    }

    public boolean g() {
        return System.currentTimeMillis() - this.q <= 1000;
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

    private int a(class_50 class_50Var) {
        switch (class_50Var) {
            case a:
                return this.h;
            case b:
                return this.g;
            default:
                return 0;
        }
    }

    public void a(boolean z) {
        this.r = z;
    }
}
