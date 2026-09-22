package rs.plugins.dpkg;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.Client;
import rs.Configuration;
import rs.Npc;
import rs.Player;
import rs.class_139;
import rs.class_68;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/d/b.class */
@e(a = "Entity Hider", c = "Hide players, NPCs, and/or projectiles", d = {rs.plugins.l.b.c, "players", "projectiles", "pet"}, f = false)
public class b extends rs.plugins.a {

    @Inject
    private a b;

    @Inject
    private Client c;
    private rs.runelite.b.a.DrawCallback d;
    private rs.runelite.b.a.DrawCallback e;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        a(true);
    }

    @Override // rs.s.a
    protected void b() {
        a(false);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getGroup().equals(a.a)) {
            a(true);
        }
    }

    private rs.runelite.b.a.DrawCallback f() {
        boolean zA = this.b.a();
        boolean zD = this.b.d();
        boolean zC = this.b.c();
        boolean zF = this.b.f();
        boolean zG = this.b.g();
        boolean zI = this.b.i();
        boolean zJ = this.b.j();
        boolean zK = this.b.k();
        this.b.h();
        return (class_48Var, z) -> {
            boolean z = Client.ed == 197;
            if (class_48Var instanceof Player) {
                if (((Player) class_48Var).q()) {
                    return !zA;
                }
                if (!z && zD) {
                    return false;
                }
            }
            if (class_48Var instanceof Npc) {
                Npc npc = (Npc) class_48Var;
                if (npc.aG == null) {
                    return false;
                }
                if (npc.j() || npc.k()) {
                    return !zC;
                }
                if (npc.aG.x == 2012) {
                    return !zJ;
                }
                if (npc.aG.x == 4437) {
                    return !zK;
                }
                if (npc.i()) {
                    return !zG;
                }
                if (!z && npc.h()) {
                    return !zF;
                }
            }
            return ((class_48Var instanceof class_68) && zI) ? false : true;
        };
    }

    private rs.runelite.b.a.DrawCallback g() {
        boolean zE = this.b.e();
        return (class_48Var, z) -> {
            return !(class_48Var instanceof Player) || (Client.ed == 197) || ((Player) class_48Var).q() || !zE;
        };
    }

    private void a(boolean z) {
        h();
        if (!z) {
            Configuration.bp = false;
            return;
        }
        Configuration.bp = this.b.a();
        Configuration.bo = !this.b.h();
        rs.runelite.b.a.DrawCallback aVarF = f();
        rs.runelite.b.a.a().add(aVarF);
        this.d = aVarF;
        rs.runelite.b.a.DrawCallback aVarG = g();
        rs.runelite.b.a.b().add(aVarG);
        this.e = aVarG;
    }

    private void h() {
        if (this.d != null) {
            rs.runelite.b.a.a().remove(this.d);
            this.d = null;
        }
        if (this.e != null) {
            rs.runelite.b.a.b().remove(this.e);
            this.e = null;
        }
    }
}
