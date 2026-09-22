/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rs.gui.x
 */
package rs.gui.b;

import rs.gui.b.g;
import rs.gui.x;

public class f {
    private final int a;
    private final int b;

    public f(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public f(int n) {
        this.a = n;
        this.b = 1;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public x c() {
        g g2 = new g(this.a);
        return g2.b();
    }
}
