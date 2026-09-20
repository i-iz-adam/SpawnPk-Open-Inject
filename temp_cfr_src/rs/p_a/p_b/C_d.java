/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a.p_b;

import rs.p_a.C_h;
import rs.p_a.p_b.C_b;

public class C_d
extends C_b {
    private final int a;

    public C_d(int n) {
        this.a = n;
    }

    @Override
    public void a(C_h c_h) {
    }

    @Override
    public void a(C_h c_h, int n) {
        if (c_h.as != null && c_h.as[n]) {
            return;
        }
        c_h.ar[n] = this.a;
    }

    public int a() {
        return this.a;
    }
}

