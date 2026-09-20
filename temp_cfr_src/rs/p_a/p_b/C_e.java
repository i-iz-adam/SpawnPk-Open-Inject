/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  p_gnu.p_trove.p_f.p_b.C_bU_mc
 *  p_gnu.p_trove.p_i.p_a.C_i
 */
package rs.p_a.p_b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p_gnu.p_trove.p_f.p_b.C_bU_mc;
import p_gnu.p_trove.p_i.p_a.C_i;
import rs.p_a.C_h;
import rs.p_a.p_b.C_b;

public class C_e
extends C_b {
    private final C_i b;
    private final List<C_bU_mc> c;
    private int[] d;
    HashSet<Integer> a = new HashSet();
    private int e;
    private int f;

    public C_e() {
        this.b = new C_i();
        this.c = new ArrayList<C_bU_mc>();
    }

    public void a(int[][][] nArray) {
        for (int[][] nArray2 : nArray) {
            C_bU_mc c_bU_mc = new C_bU_mc();
            int[] nArray3 = nArray2[0];
            int[] nArray4 = nArray2[1];
            for (int i = 0; i < nArray3.length && i < nArray4.length; ++i) {
                this.a.add(nArray4[i]);
                this.b.b(nArray3[i]);
                c_bU_mc.a(nArray3[i], nArray4[i]);
            }
            this.c.add(c_bU_mc);
        }
    }

    public void a(int n, int[] nArray) {
        C_bU_mc c_bU_mc = new C_bU_mc();
        for (int n2 : nArray) {
            this.a.add(n);
            this.b.b(n2);
            c_bU_mc.a(n2, n);
        }
        this.c.add(c_bU_mc);
    }

    public int[] a() {
        if (this.d != null) {
            return this.d;
        }
        this.d = this.a.stream().mapToInt(Number::intValue).toArray();
        return this.d;
    }

    @Override
    public void a(C_h c_h) {
        int n = 0;
        this.e = 0;
        this.f = 0;
        for (int i = 0; i < c_h.ar.length; ++i) {
            if (!this.b.a_(c_h.ar[i])) continue;
            ++n;
        }
        c_h.av = n;
        if (c_h.ao == null) {
            c_h.ao = new int[c_h.ah];
        }
        if (c_h.ar == null) {
            c_h.ar = new int[n];
        }
        c_h.aw = new int[n];
        c_h.ax = new int[n];
        c_h.ay = new int[n];
        c_h.as = new boolean[c_h.ah];
    }

    @Override
    public void a(C_h c_h, int n) {
        if (c_h.as != null && c_h.as[n]) {
            return;
        }
        if (c_h.Z != null) {
            return;
        }
        if (!this.b.a_(c_h.ar[n])) {
            return;
        }
        for (int i = 0; i < this.c.size(); ++i) {
            if (!this.c.get(i).r_(c_h.ar[n])) continue;
            int n2 = this.c.get(i).c(c_h.ar[n]);
            c_h.as[n] = true;
            c_h.ar[n] = n2;
            c_h.ao[n] = 3 + this.f;
            this.f += 4;
            c_h.aw[this.e] = c_h.ai[n];
            c_h.ax[this.e] = c_h.aj[n];
            c_h.ay[this.e] = c_h.ak[n];
            ++this.e;
            break;
        }
    }

    public C_i b() {
        return this.b;
    }

    public List<C_bU_mc> c() {
        return this.c;
    }
}

