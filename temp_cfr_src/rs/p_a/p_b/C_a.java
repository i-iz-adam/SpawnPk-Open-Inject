/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  p_gnu.p_trove.p_i.p_a.C_i
 */
package rs.p_a.p_b;

import java.util.ArrayList;
import java.util.List;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.p_a.C_h;
import rs.p_a.p_b.C_b;
import rs.p_s.p_c.C_d;

public class C_a
extends C_b {
    private C_i a;
    private C_i b;
    private List<a> c = new ArrayList<a>();

    public C_a(int[][][] nArray) {
        this.a = new C_i();
        if (C_d.b()) {
            this.b = new C_i();
        }
        for (int[][] nArray2 : nArray) {
            a a2 = new a();
            a2.c = new C_i();
            rs.p_a.p_b.C_a$a.a(a2, nArray2[1]);
            for (int n : nArray2[0]) {
                if (C_d.b()) {
                    this.b.b(n);
                }
                this.a.b(n);
                a2.c.b(n);
            }
            this.c.add(a2);
        }
    }

    @Override
    public void a(C_h c_h) {
        for (int i = 0; i < this.c.size(); ++i) {
            this.c.get((int)i).a = 0;
        }
    }

    @Override
    public void a(C_h c_h, int n) {
        if (!this.a.a_(c_h.ar[n])) {
            return;
        }
        for (int i = 0; i < this.c.size(); ++i) {
            if (!this.c.get(i).c.a_(c_h.ar[n])) continue;
            c_h.ar[n] = this.c.get(i).a();
            break;
        }
    }

    public C_i a() {
        return this.a;
    }

    public C_i b() {
        return this.b;
    }

    class a {
        int a;
        private C_i c;
        private int[] d;

        a() {
        }

        public int a() {
            int n = this.d[this.a++];
            if (this.a >= this.d.length) {
                this.a = 0;
            }
            return n;
        }

        static /* synthetic */ int[] a(a a2, int[] nArray) {
            a2.d = nArray;
            return nArray;
        }
    }
}

