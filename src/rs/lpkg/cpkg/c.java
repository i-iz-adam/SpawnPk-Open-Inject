package rs.lpkg.cpkg;

import gnu.trove.f.b.cI;
import gnu.trove.f.b.cc;
import gnu.trove.i.a.m;
import java.util.ArrayList;
import java.util.List;
import rs.class_194;
import rs.class_593;

/* JADX INFO: loaded from: client-final.jar:rs/l/c/c.class */
public class c {
    private static final int a = 50;
    private static final int b = 50000;
    private static final long c = 60000;
    private static final cc<d> d = new cc<>(100);
    private static final List<d> e = new ArrayList(100);
    private static final cI<a> f = new cI<>(100000);
    private static final m g = new m(100000);
    private static final List<a> h = new ArrayList(100000);
    private static long i;
    private static boolean j;

    public static a a(class_593 class_593Var, int i2, int i3, int i4, int i5) {
        if (f.size() >= b) {
            c();
            System.out.println("[GPU] Reached max capacity of particle pool!");
            return null;
        }
        if (h.size() == 0) {
            a aVar = new a(class_593Var, i2, i3, i4, i5);
            aVar.b();
            aVar.a();
            c(aVar);
            return aVar;
        }
        a aVar2 = h.get(0);
        aVar2.b();
        aVar2.a(class_593Var);
        aVar2.b(i2);
        aVar2.c(i3);
        aVar2.d(i4);
        aVar2.f(i5);
        aVar2.a();
        c(aVar2);
        h.remove(0);
        return aVar2;
    }

    public static d a(int i2, boolean z) {
        if (d.w_(i2)) {
            return d.b(i2);
        }
        if (!z) {
            return null;
        }
        if (d.size() >= 50) {
            c();
            return null;
        }
        if (e.size() == 0) {
            d dVarA = d.a();
            dVarA.b(i2);
            d.a(i2, dVarA);
            return dVarA;
        }
        d dVar = e.get(0);
        dVar.b(i2);
        d.a(i2, dVar);
        e.remove(0);
        return dVar;
    }

    public static boolean a() {
        return class_194.a();
    }

    public static void b() {
        if (a()) {
            return;
        }
        int[] iArrB = d.b();
        for (int i2 = 0; i2 < iArrB.length; i2++) {
            if (System.currentTimeMillis() - d.b(iArrB[i2]).f() >= 60000) {
                a(iArrB[i2]);
            }
        }
        for (long j2 : g.c()) {
            a aVarA = a(j2);
            if (aVarA != null) {
                aVarA.c();
                if (aVarA.i()) {
                    a(aVarA);
                }
            }
        }
    }

    public static a a(long j2) {
        return f.b(j2);
    }

    public static void a(a aVar) {
        aVar.a(true);
        d(aVar);
        if (h.size() < b) {
            h.add(aVar);
        }
    }

    public static void a(int i2) {
        d dVarB = d.b(i2);
        if (dVarB == null) {
            return;
        }
        dVarB.d();
        e.add(dVarB);
        d.c(i2);
    }

    public static void c() {
        g.clear();
        f.clear();
        h.clear();
    }

    public static boolean b(a aVar) {
        return g.y_(aVar.d());
    }

    private static void c(a aVar) {
        f.a(aVar.d(), aVar);
        g.b(aVar.d());
    }

    private static void d(a aVar) {
        f.c(aVar.d());
        g.c(aVar.d());
    }
}
