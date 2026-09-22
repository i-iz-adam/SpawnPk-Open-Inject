package rs.plugins.i;

import java.awt.Color;
import javax.inject.Inject;
import rs.Client;
import rs.Npc;
import rs.class_268;
import rs.class_306;
import rs.class_32;
import rs.class_41;
import rs.class_9;
import rs.runelite.a.g;
import rs.runelite.events.EntityInteraction;
import rs.runelite.events.ObjectInteraction;

/* JADX INFO: loaded from: client-final.jar:rs/s/i/b.class */
public class b extends class_306 {
    private static final Color e = new Color(-1862270977);
    private final a f;
    private Object g = null;
    private int h = -1;
    private boolean i = false;
    private int j = -1;
    private int k = -1;

    @Inject
    public b(a aVar) {
        this.f = aVar;
        a(class_268.n);
    }

    @Override // rs.class_306
    public void a() {
        k();
        m();
        n();
    }

    public void k() {
    }

    public void a(EntityInteraction entityInteraction) {
        if (!(entityInteraction.getEntity() instanceof Npc) || this.f.b()) {
            this.g = entityInteraction.getEntity();
            this.i = entityInteraction.isCombat();
            this.h = Client.ff;
            this.j = this.a.gd;
            this.k = this.a.ge;
        }
    }

    public void a(ObjectInteraction objectInteraction) {
        if (this.f.h()) {
            this.g = b(objectInteraction.getX(), objectInteraction.getY(), objectInteraction.getZ(), objectInteraction.getHash());
            if (this.g == null) {
                l();
                return;
            }
            this.i = false;
            this.h = Client.ff;
            this.j = this.a.gd;
            this.k = this.a.ge;
        }
    }

    private void m() {
        int i = this.a.eV - 1;
        if (i < 0) {
            return;
        }
        int i2 = this.a.localPlayer[i];
        if (g.a(i2) && this.f.a()) {
            int i3 = this.a.eJ[i];
            if (i3 < 0 || i3 >= this.a.cA.length) {
                return;
            }
            Npc npc = this.a.cA[i3];
            if (npc != null && npc != this.g) {
                rs.ui.b.b.a().a(npc, this.f.k(), this.f.c(), this.f.l());
            }
        }
        if (g.c(i2) && this.f.g()) {
            int i4 = this.a.eJ[i];
            class_41 class_41VarB = b(this.a.eF[i], this.a.eG[i], Client.dw, i4);
            if (class_41VarB == null || class_41VarB == this.g) {
                return;
            }
            rs.ui.b.b.a().a(class_41VarB, this.f.k(), this.f.i(), this.f.l());
        }
    }

    private void n() {
        if (this.g == null) {
            return;
        }
        if (Client.ff - this.h >= 30 && (this.a.gd != this.j || this.a.ge != this.k)) {
            l();
            return;
        }
        if (Client.ff - this.h >= 30 * (this.i ? 4 : 10)) {
            l();
            return;
        }
        if (this.g instanceof Npc) {
            rs.ui.b.b.a().a((Npc) this.g, this.f.k(), a(this.i ? this.f.d() : this.f.c(), this.i ? this.f.f() : this.f.e()), this.f.l());
        } else if (this.g instanceof class_41) {
            rs.ui.b.b.a().a((class_41) this.g, this.f.k(), a(this.f.i(), this.f.j()), this.f.l());
        }
    }

    private Color a(Color color, Color color2) {
        int i = Client.ff - this.h;
        if (i < 5) {
            return class_9.a(color, e, i / 5.0f);
        }
        return i < 10 ? class_9.a(e, color2, (i - 5) / 5.0f) : color2;
    }

    public void l() {
        this.i = false;
        this.g = null;
        this.h = Client.ff;
        this.j = -1;
        this.k = -1;
    }

    private class_41 b(int i, int i2, int i3, int i4) {
        class_32 class_32Var = this.a.dF.i[i3][i][i2];
        if (class_32Var == null) {
            return null;
        }
        if (class_32Var.j != null && class_32Var.j.m == i4) {
            return class_32Var.j;
        }
        if (class_32Var.k != null && class_32Var.k.m == i4) {
            return class_32Var.k;
        }
        if (class_32Var.l != null && class_32Var.l.m == i4) {
            return class_32Var.l;
        }
        for (int i5 = 0; i5 < class_32Var.n; i5++) {
            if (class_32Var.o[i5].m == i4) {
                return class_32Var.o[i5];
            }
        }
        return null;
    }
}
