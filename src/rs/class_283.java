package rs;

import gnu.trove.i.a.i;
import java.util.HashSet;

/* JADX INFO: loaded from: client-final.jar:rs/class_283.class */
public class class_283 extends class_282 {
    private Npc n;
    private int o;
    private class_102 p;

    public class_283() {
        a(class_268.c);
        this.h = new HashSet<>();
        this.e = new HashSet<>();
        this.i = new i();
    }

    @Override // rs.class_282
    public int[] k() {
        return this.p.v;
    }

    @Override // rs.class_282
    public class_59 l() {
        return this.p.i;
    }

    @Override // rs.class_282, rs.class_306
    public void a() {
        if (this.m instanceof Npc) {
            Npc npc = (Npc) this.m;
            if (npc.aG.x != this.o) {
                return;
            }
            this.p = class_102.c(this.o);
            npc.i = true;
            super.a();
        }
    }

    @Override // rs.class_282
    public void a(Object obj, boolean z) {
        Npc npc = (Npc) obj;
        if (npc == this.n) {
            if (!z) {
                npc.av = true;
                m();
                return;
            }
            p();
        }
        if (this.n != null && this.n != npc && !z) {
            m();
        }
        this.n = npc;
        if (this.n == null || this.n.aG == null) {
            this.o = -1;
        } else {
            this.n.i = true;
            this.o = (int) npc.aG.x;
        }
    }

    public void m() {
        o();
        r().c();
        this.n = null;
        this.o = -1;
    }

    public Npc u() {
        return this.n;
    }
}
