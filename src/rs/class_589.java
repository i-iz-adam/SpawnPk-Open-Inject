package rs;

import gnu.trove.e.a.k;
import gnu.trove.f.b.cI;

/* JADX INFO: loaded from: client-final.jar:rs/class_589.class */
public class class_589 {
    private static final int a = 100000;
    private static final cI<class_591> b = new cI<>(100010, 1.0f);
    private static final k c = new k();
    private static int d = 0;

    public static class_591 a(class_593 class_593Var, int i, int i2, int i3, int i4) {
        if (!class_332.q) {
            return null;
        }
        if (d >= 100000) {
            if (!Configuration.f.booleanValue()) {
                return null;
            }
            System.out.println("[CPU] Reached max capacity of particle pool!");
            return null;
        }
        if (c.size() == 0) {
            class_591 class_591Var = new class_591(class_593Var, i, i2, i3, i4);
            b(class_591Var);
            return class_591Var;
        }
        class_591 class_591VarB = b.b(c.a(0));
        class_591VarB.b();
        class_591VarB.a(class_593Var);
        class_591VarB.a(i);
        class_591VarB.d(i2);
        class_591VarB.e(i3);
        class_591VarB.f(i4);
        class_591VarB.a();
        b(class_591VarB);
        c.b(0);
        return class_591VarB;
    }

    public static void a(class_591 class_591Var) {
        class_591Var.a(true);
        c(class_591Var);
    }

    public static void a() {
    }

    private static void b(class_591 class_591Var) {
        d++;
        b.a(class_591Var.n(), class_591Var);
    }

    private static void c(class_591 class_591Var) {
        d--;
        d(class_591Var);
    }

    private static void d(class_591 class_591Var) {
        if (c.size() < 100000) {
            c.b(class_591Var.n());
        } else {
            b.c(class_591Var.n());
        }
    }
}
