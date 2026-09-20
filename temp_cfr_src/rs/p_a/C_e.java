/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.C_Client_mc;
import rs.p_a.C_f;
import rs.p_f.C_a;

public class C_e {
    CopyOnWriteArrayList<C_f> a = new CopyOnWriteArrayList();
    C_f[] b = new C_f[4];

    public boolean a(int n, int n2, int n3, int n4, boolean bl) {
        if (C_a.ak && (n2 *= C_a.ak && n2 > 0 ? 10 : 1) > 0 && n != 3 && n != 2) {
            n2 += new Random().nextInt(9);
        }
        for (int i = 0; i < 4; ++i) {
            if (this.b[i] != null && this.b[i].g() > n3) continue;
            if (this.b[i] == null) {
                this.b[i] = new C_f(n, n2, n4);
            } else {
                this.b[i].e(n2);
                this.b[i].c(n4);
                this.b[i].d(n);
            }
            this.b[i].a(0);
            this.b[i].b(230);
            this.b[i].g(n3 + 70);
            return true;
        }
        if (bl) {
            this.a.add(new C_f(n, n2, n4));
        }
        return false;
    }

    public final void a() {
        for (int i = 0; i < this.a.size(); ++i) {
            C_f c_f = this.a.get(i);
            if (!this.a(c_f.d(), c_f.e(), C_Client_mc.ff, c_f.c(), false)) continue;
            this.a.remove(c_f);
        }
    }

    public boolean a(int n) {
        if (this.b[n] == null) {
            return false;
        }
        return this.b[n].g() > C_Client_mc.ff;
    }

    public void b() {
        this.b = new C_f[4];
        this.a.clear();
    }

    public CopyOnWriteArrayList<C_f> c() {
        return this.a;
    }

    public C_f[] d() {
        return this.b;
    }
}

