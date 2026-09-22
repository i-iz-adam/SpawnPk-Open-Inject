package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_345.class */
public class class_345 {
    public static class_333 a;
    public static class_333 b;
    public static class_344 c;

    public static void a() {
        Client.cI = -1;
        b = new class_333("misc/dd1");
        a = new class_333("misc/dd2");
        c = new class_344();
    }

    public static void a(class_343 class_343Var, int i, int i2, boolean z) {
        if (Client.cH <= 0) {
            return;
        }
        if (Client.cI != class_343Var.au || z) {
        }
        Widget widget = Widget.H[Client.cH];
        Client clientO = Launcher.n().o();
        class_210.a(i, i2, class_343Var.P, class_343Var.aP, 4602929, 255);
        class_210.d(i - 1, class_343Var.P + (1 * 2), class_343Var.aP + (1 * 2), 2630172, i2 - 1);
        class_210.d(i - 1, class_343Var.P + (1 * 2), class_343Var.aP + (1 * 2), 2630172, i2 - 1);
        class_210.d(i, class_343Var.P, class_343Var.aP, 4539457, i2);
        class_333 class_333Var = Client.cI == class_343Var.au ? a : b;
        class_209.a(Launcher.n().o(), widget, class_343Var, (i + 1) - (class_333Var.n / 2), (i2 + (class_343Var.aP / 2)) - (class_343Var.an.r / 2));
        class_333Var.f(((i + class_343Var.P) - class_333Var.n) - 1, (i2 + (class_343Var.aP / 2)) - (class_333Var.o / 2));
        if (clientO.em == class_343Var.au || clientO.em == class_343Var.au || clientO.ef == class_343Var.au) {
            class_210.a(i, i2, class_343Var.P, class_343Var.aP, 1, 75);
        }
    }

    public static void a(int i) {
        if (Widget.H[i] == null || !(Widget.H[i] instanceof class_343)) {
            new IllegalArgumentException("The interface ID " + i + " is not a drop down component").printStackTrace();
            return;
        }
        c.a((class_343) Widget.H[i]);
        c.bd = true;
        Client.cI = i;
    }

    public static void b() {
        Client.cI = -1;
        if (c != null) {
            c.bd = false;
        }
    }

    public static boolean c() {
        if (c == null || c.h() == null || Client.cI <= 0) {
            return false;
        }
        return c.b();
    }
}
