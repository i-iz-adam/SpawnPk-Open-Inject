/*
 * Decompiled with CFR 0.152.
 */
package rs.n_0.b;

import java.util.ArrayList;
import java.util.List;
import rs.n_0.b.a_0.c;
import rs.n_0.b.a_0.d;
import rs.n_0.b.b;

public abstract class a_0 {
    public static List<b> a = new ArrayList<b>();
    public static b<c> b = rs.n_0.b.a_0.a(new b());
    public static b<rs.n_0.b.a_0.a> c = rs.n_0.b.a_0.a(new b());
    public static b<d> d = rs.n_0.b.a_0.a(new b());
    protected long e;
    protected long f;

    public static <T> b a_0(b b2) {
        a.add(b2);
        return b2;
    }

    public static void a_0() {
        for (b b2 : a) {
            b2.a();
        }
    }

    public void b() {
        long l2 = System.currentTimeMillis() - this.f;
        if (this.e == 0L || l2 >= this.e) {
            this.c();
            this.f = System.currentTimeMillis();
        }
    }

    public abstract void c();
}

