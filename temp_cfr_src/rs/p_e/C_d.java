/*
 * Decompiled with CFR 0.152.
 */
package rs.p_e;

import java.util.Collection;
import rs.p_e.C_e;
import rs.p_e.C_h;
import rs.p_e.C_m;

public class C_d {
    private final C_e a;
    private final Collection<C_m> b;
    private final Collection<C_h> c;

    public C_d(C_e c_e, Collection<C_m> collection, Collection<C_h> collection2) {
        this.a = c_e;
        this.b = collection;
        this.c = collection2;
    }

    public C_e a() {
        return this.a;
    }

    public Collection<C_m> b() {
        return this.b;
    }

    public Collection<C_h> c() {
        return this.c;
    }
}

