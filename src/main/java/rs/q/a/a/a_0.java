/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Binder
 *  com.google.inject.Injector
 *  com.google.inject.Module
 */
package rs.q_0.a_0.a;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;
import rs.Client;
import rs.x_0.e;

public abstract class a_0
implements Module {
    protected Injector a;
    protected e b;
    protected Client c;

    public abstract void a();

    public void configure(Binder binder) {
    }

    public void a_0(e e2) {
        this.b = e2;
    }

    public void a_0(Client client) {
        this.c = client;
    }

    public int c() {
        return this.b.A();
    }

    public long d() {
        return this.b.E();
    }

    public int e() {
        return this.b.y();
    }

    public int f() {
        return this.a(1);
    }

    public int a_0(int n2) {
        this.b.J();
        int n3 = this.b.k(n2);
        this.b.K();
        return n3;
    }

    public int g() {
        return this.b.D();
    }

    public String h() {
        return this.b.F();
    }

    public final Injector i() {
        return this.a;
    }
}

