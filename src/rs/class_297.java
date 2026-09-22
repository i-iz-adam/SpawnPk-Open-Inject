package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_297.class */
public class class_297 extends class_310 {
    private static class_297 h = null;
    private static class_302 i = null;
    private final class_300 j;
    private final int k;
    private final int l;
    private boolean m = false;

    public class_297(class_300 class_300Var, int i2, int i3) {
        this.j = class_300Var;
        this.k = i2;
        this.l = i3;
    }

    @Override // rs.class_306
    public void a() {
        Client client = this.a;
        if (Client.ff % 20 < 10) {
            this.j.a().f(this.e + this.k, this.f + this.l);
        }
    }

    public static class_297 k() {
        return h;
    }

    public static boolean l() {
        return h != null;
    }

    public static void m() {
        class_302 class_302Var;
        i = null;
        if (h == null) {
            return;
        }
        try {
            class_313.d().a((class_310) h);
            class_302Var = null;
        } catch (Exception e) {
            e.printStackTrace();
            class_302Var = null;
        } finally {
            i = null;
            h = null;
        }
    }

    public static void a(int i2, class_300 class_300Var, int i3, int i4) {
        m();
        h = new class_297(class_300Var, i3, i4);
        class_313.d().a(h, i2);
    }

    public static void a(int i2) {
        int i3 = 0;
        int i4 = 0;
        class_300 class_300Var = class_300.b;
        if (Widget.H[i2].E != null) {
            int i5 = Widget.H[i2].E.n;
            int i6 = Widget.H[i2].E.o;
            switch (class_300Var) {
                case b:
                    i3 = -30;
                    i4 = (i6 / 2) - 15;
                    break;
            }
        } else {
            i4 = -10;
        }
        a(i2, class_300Var, i3, i4);
        k().b(false);
    }

    public static void a(class_302 class_302Var) {
        i = class_302Var;
    }

    public static class_302 n() {
        return i;
    }

    public class_300 o() {
        return this.j;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.l;
    }

    public boolean r() {
        return this.m;
    }

    public void b(boolean z) {
        this.m = z;
    }
}
