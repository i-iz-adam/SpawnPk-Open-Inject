package rs.plugins.hpkg;

import com.google.inject.Provides;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import rs.Client;
import rs.ClientThread;
import rs.class_1;
import rs.class_139;
import rs.class_156;
import rs.class_6;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;
import rs.runelite.events.SkillLevelChanged;
import rs.plugins.e;
import rs.ui.apkg.c;
import rs.ui.apkg.f;
import rs.ui.apkg.h;
import rs.ui.apkg.j;

/* JADX INFO: loaded from: client-final.jar:rs/s/h/a.class */
@e(a = "Timers / Info Boxes", b = b.a, i = true, d = {"potions", "boost", "buff", "skill"})
public class a extends rs.plugins.a {
    public static boolean b = true;
    public static final ConcurrentHashMap.KeySetView<String, Boolean> c = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap.KeySetView<String, Boolean> d = ConcurrentHashMap.newKeySet();
    public static int e = 5;

    @Inject
    private b f;

    @Inject
    private f g;

    @Inject
    private class_1 h;

    @Provides
    b a(class_139 class_139Var) {
        return (b) class_139Var.a(b.class);
    }

    @Override // rs.s.a
    public void a() {
        b = true;
        h();
    }

    @Override // rs.s.a
    public void b() {
        b = false;
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        h();
        if (configChanged.getKey().equalsIgnoreCase("infoBoxSize")) {
            this.h.a();
            this.g.c().values().forEach(gVar -> {
                gVar.M().forEach(cVar -> {
                    this.g.d(cVar);
                });
            });
        }
        if (configChanged.getKey().equalsIgnoreCase("counterTimeout")) {
            this.g.c().values().forEach(gVar2 -> {
                gVar2.M().forEach(cVar -> {
                    if (cVar.q() <= 0 || !(cVar instanceof rs.ui.apkg.b)) {
                        return;
                    }
                    cVar.c(this.f.h());
                });
            });
        }
    }

    @Subscribe
    public void onSkillLevelChanged(SkillLevelChanged skillLevelChanged) {
        if ((skillLevelChanged.getSkillId() == 0 || skillLevelChanged.getSkillId() == 2 || skillLevelChanged.getSkillId() == 4 || skillLevelChanged.getSkillId() == 1 || skillLevelChanged.getSkillId() == 6) && this.f.m()) {
            int skillId = skillLevelChanged.getSkillId();
            int currentLevel = skillLevelChanged.getCurrentLevel();
            int maximumLevel = skillLevelChanged.getMaximumLevel();
            String str = class_156.b[skillLevelChanged.getSkillId()];
            String str2 = str.substring(0, 1).toUpperCase() + str.substring(1) + " boost";
            if (skillLevelChanged.getCurrentLevel() == skillLevelChanged.getMaximumLevel()) {
                this.g.b(str2);
                if (this.g.c().get("Combat boosts") != null) {
                    List<c> listM = this.g.c().get("Combat boosts").M();
                    if (listM.size() == 1 && (listM.get(0) instanceof j)) {
                        this.g.b("Next buff change");
                        return;
                    }
                    return;
                }
                return;
            }
            class_6 class_6VarA = this.h.a("skills/" + skillId, -1);
            c cVarA = this.g.a(str2);
            if (cVarA != null) {
                ((rs.ui.apkg.a) cVarA).a(currentLevel - maximumLevel);
            } else {
                rs.ui.a.a aVar = new rs.ui.apkg.a(class_6VarA, "Combat boosts", str2, currentLevel - maximumLevel, skillId);
                aVar.a(rs.ui.apkg.e.b);
                aVar.a("@lre@" + str2);
                this.g.b(aVar);
            }
            g();
        }
    }

    private void g() {
        if (Client.dx > 0) {
            class_6 class_6VarA = this.h.a("skills/1338", -1);
            c cVarA = this.g.a("Next buff change");
            if (cVarA != null) {
                ((j) cVarA).b(Duration.of(Client.dx, ChronoUnit.SECONDS));
                return;
            }
            j jVar = new j(Client.dx, ChronoUnit.SECONDS, class_6VarA, "Combat boosts", "Next buff change");
            jVar.a("@lre@Next buff change");
            jVar.a(h.d);
            this.g.b(jVar);
        }
    }

    private void h() {
        ClientThread.queue(() -> {
            i();
            e = this.f.h();
        });
    }

    private void i() {
        c.clear();
        d.clear();
        j();
        k();
    }

    private void j() {
        if (!this.f.g()) {
            c.add("Blood slayer");
        }
        if (!this.f.d()) {
            c.add("DFS Cooldown");
        }
        if (!this.f.e()) {
            c.add("Freeze timer");
        }
        if (!this.f.a()) {
            c.add("Antifire");
        }
        if (!this.f.b()) {
            c.add("Antipoison");
        }
        if (!this.f.c()) {
            c.add("Antivenom");
        }
        if (!this.f.f()) {
            c.add("Teleport block");
        }
        if (!this.f.n()) {
            c.add("Next buff change");
        }
        if (!this.f.i()) {
            c.add("Slayer task");
            c.add("Blood slayer task");
            c.add("Slayer task (normal)");
        }
        if (!this.f.k()) {
            c.add("Soul hunter task");
        }
        if (!this.f.m()) {
            c.add("Ranged boost");
            c.add("Magic boost");
            c.add("Attack boost");
            c.add("Defence boost");
            c.add("Strength boost");
        }
        if (!this.f.k()) {
            c.add("Soul hunter task");
        }
        if (!this.f.j()) {
            c.add("Task scroll (primary)");
            c.add("Task scroll (secondary)");
            c.add("Task scroll (req. #1)");
            c.add("Task scroll (req. #2)");
        }
        if (this.f.o()) {
            return;
        }
        d.add("raid_affs");
    }

    private void k() {
        if (this.f.l()) {
            return;
        }
        d.add("Wanderer");
    }

    public b f() {
        return this.f;
    }
}
