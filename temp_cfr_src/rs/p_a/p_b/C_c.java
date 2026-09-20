/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a.p_b;

import rs.p_a.C_h;
import rs.p_a.p_b.C_a;
import rs.p_a.p_b.C_d;
import rs.p_a.p_b.C_e;

public class C_c {
    private C_d a;
    private C_e b;
    private C_a c;
    private int d = Integer.MAX_VALUE;

    public C_c(C_c c_c) {
        this.a(c_c.f());
        this.a(c_c.g());
        this.a(c_c.h());
        this.a(c_c.i());
    }

    public C_c() {
    }

    public void a(C_h c_h) {
        int n;
        if (this.b()) {
            this.c.a(c_h);
        }
        if (this.d()) {
            this.a.a(c_h);
        }
        if (this.e() && c_h.aq == null) {
            c_h.aq = new int[c_h.ah];
        }
        for (n = 0; n < c_h.ah; ++n) {
            if (this.b()) {
                this.c.a(c_h, n);
            }
            if (this.d()) {
                this.a.a(c_h, n);
            }
            if (!this.e()) continue;
            c_h.aq[n] = 100 - this.d;
        }
        if (this.c()) {
            this.b.a(c_h);
            for (n = 0; n < c_h.ah; ++n) {
                this.b.a(c_h, n);
            }
        }
    }

    public C_e a() {
        if (this.b == null) {
            this.b = new C_e();
        }
        return this.b;
    }

    public boolean b() {
        return this.c != null;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.a != null;
    }

    public boolean e() {
        return this.d != Integer.MAX_VALUE;
    }

    public C_d f() {
        return this.a;
    }

    public void a(C_d c_d) {
        this.a = c_d;
    }

    public C_e g() {
        return this.b;
    }

    public void a(C_e c_e) {
        this.b = c_e;
    }

    public C_a h() {
        return this.c;
    }

    public void a(C_a c_a) {
        this.c = c_a;
    }

    public int i() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }
}

