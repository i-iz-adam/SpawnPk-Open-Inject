package rs.plugins.o;

import com.google.a.b.L;
import com.google.inject.Provides;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.ClientThread;
import rs.Npc;
import rs.class_102;
import rs.class_139;
import rs.class_184;
import rs.class_188;
import rs.class_23;
import rs.class_24;
import rs.class_313;
import rs.eventbus.Subscribe;
import rs.runelite.a.g;
import rs.runelite.events.ConfigChanged;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;
import rs.runelite.events.NpcSpawned;

/* JADX INFO: loaded from: client-final.jar:rs/s/o/e.class */
@rs.plugins.e(a = "NPC Indicators", c = "Highlight NPCs on-screen", d = {"highlight", "minimap", rs.plugins.l.b.c, "overlay", "respawn", "tags"})
public class e extends rs.plugins.a {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) e.class);
    private static final int c = 15;
    private static final String d = "Tag";
    private static final String e = "Un-tag";
    private static final String f = "Tag-All";
    private static final String g = "Un-tag-All";
    private static final String h = "hull";
    private static final String i = "tile";
    private static final String j = "truetile";
    private static final String k = "swtile";
    private static final String l = "swtruetile";
    private static final String m = "outline";

    @Inject
    private Client n;

    @Inject
    private d o;

    @Inject
    private c p;

    @Inject
    private class_139 q;

    @Inject
    private rs.ui.components.apkg.d r;

    @Inject
    private class_188 s;
    private final Map<Npc, a> t = new HashMap();
    private List<String> u = new ArrayList();

    @Provides
    d a(class_139 class_139Var) {
        return (d) class_139Var.a(d.class);
    }

    @Override // rs.s.a
    protected void a() {
        ClientThread.queue(() -> {
            class_313.d().a(this.p);
            g();
        });
    }

    @Override // rs.s.a
    protected void b() {
        ClientThread.queue(() -> {
            class_313.d().b(this.p);
            this.t.clear();
        });
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getGroup().equals(d.a)) {
            boolean zN = this.o.n();
            ClientThread.queue(() -> {
                c.i = zN;
            });
            ClientThread.queue(this::g);
        }
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.f || gameStateChanged.getGameState() == rs.runelite.a.c.c) {
            g();
        }
    }

    @Subscribe
    private void onNpcSpawned(NpcSpawned npcSpawned) {
        Npc npc = npcSpawned.getNpc();
        if (npc.o() != null && a(npc.o())) {
            this.t.put(npc, c(npc));
        }
    }

    @Subscribe
    private void onMenuHover(MenuHover menuHover) {
        int i2;
        Npc npc;
        if (!Client.dj && g.a(menuHover.getMenuId()) && Client.ag && (i2 = this.n.eJ[menuHover.getRow()]) >= 0 && i2 < this.n.cA.length && (npc = this.n.cA[i2]) != null) {
            boolean z = a(npc) != null;
            this.s.c(z ? "<img=360> <img=25> Untag-All @yel@" + npc.o() : "<img=360> Tag-All @yel@" + npc.o(), () -> {
                b(npc);
            });
            if (z) {
                this.s.b(this.s.c("<img=360> <img=326> Tag color", () -> {
                    System.out.println("Change color");
                })).a("<img=78> Reset", () -> {
                    a(npc.n());
                }).a("@mag@Magenta", () -> {
                    a(npc.n(), Color.MAGENTA);
                }).a("@yel@Yellow", () -> {
                    a(npc.n(), Color.YELLOW);
                }).a("@gre@Green", () -> {
                    a(npc.n(), Color.GREEN);
                }).a("@red@Red", () -> {
                    a(npc.n(), Color.RED);
                });
                String[] strArr = {"Hull", "Tile", "True tile", "South-west tile", "South-west true tile", "Outline"};
                String[] strArr2 = {h, i, j, k, l, m};
                class_184 class_184VarB = this.s.b(this.s.c("<img=360> <img=327> Tag style", () -> {
                    System.out.println("Change style");
                }));
                class_184VarB.a("<img=138> Reset", () -> {
                    c(npc.n());
                });
                for (int length = strArr.length - 1; length >= 0; length--) {
                    String str = strArr2[length];
                    class_184VarB.a(strArr[length], () -> {
                        a(npc.n(), str);
                    });
                }
            }
        }
    }

    public a a(Npc npc) {
        if (npc.o() == null || this.t.get(npc) == null) {
            return null;
        }
        return this.t.get(npc);
    }

    private void b(Npc npc) {
        String strO = npc.o();
        ArrayList arrayList = new ArrayList(this.u);
        Objects.requireNonNull(strO);
        if (!arrayList.removeIf(strO::equalsIgnoreCase)) {
            arrayList.add(strO);
        }
        SwingUtilities.invokeLater(() -> {
            this.o.a(class_23.a(arrayList));
            ClientThread.queue(this::g);
        });
    }

    @com.google.a.a.d
    List<String> f() {
        String strL = this.o.l();
        return strL.isEmpty() ? Collections.emptyList() : class_23.a(strL);
    }

    void g() {
        String strO;
        this.u = f();
        this.t.clear();
        if (this.n.fc && this.n.cc && Client.ee == 2) {
            for (Npc npc : this.n.aI()) {
                if (npc != null && (strO = npc.o()) != null && a(strO)) {
                    this.t.put(npc, c(npc));
                }
            }
        }
    }

    private boolean a(String str) {
        Iterator<String> it = this.u.iterator();
        while (it.hasNext()) {
            if (class_24.a(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    private a c(Npc npc) {
        boolean zA;
        boolean zB;
        boolean zC;
        boolean zD;
        boolean zE;
        boolean zF;
        int iN = npc.n();
        String strD = d(iN);
        if (strD != null) {
            zA = h.equals(strD);
            zB = i.equals(strD);
            zC = j.equals(strD);
            zD = k.equals(strD);
            zE = l.equals(strD);
            zF = m.equals(strD);
        } else {
            zA = this.o.a();
            zB = this.o.b();
            zC = this.o.c();
            zD = this.o.d();
            zE = this.o.e();
            zF = this.o.f();
        }
        return a.a().a(npc).a((Color) L.a(b(iN), this.o.h())).b(this.o.i()).a(zA).b(zB).c(zC).d(zD).e(zE).f(zF).g(this.o.g()).a((float) this.o.j()).a(this.o.k()).a(this::d).a();
    }

    private boolean d(Npc npc) {
        class_102 class_102Var = npc.aG;
        return (class_102Var != null && class_102Var.h && this.o.m()) ? false : true;
    }

    private void a(int i2, Color color) {
        SwingUtilities.invokeLater(() -> {
            this.q.a(d.a, "highlightcolor_" + i2, color);
            ClientThread.queue(this::g);
        });
    }

    private void a(int i2) {
        SwingUtilities.invokeLater(() -> {
            this.q.b(d.a, "highlightcolor_" + i2);
            ClientThread.queue(this::g);
        });
    }

    private Color b(int i2) {
        return (Color) this.q.a(d.a, "highlightcolor_" + i2, (Type) Color.class);
    }

    private void a(int i2, String str) {
        SwingUtilities.invokeLater(() -> {
            this.q.b(d.a, "tagstyle_" + i2, str);
            ClientThread.queue(this::g);
        });
    }

    private void c(int i2) {
        SwingUtilities.invokeLater(() -> {
            this.q.b(d.a, "tagstyle_" + i2);
            ClientThread.queue(this::g);
        });
    }

    private String d(int i2) {
        return this.q.a(d.a, "tagstyle_" + i2);
    }

    private List<Color> i() {
        ArrayList arrayList = new ArrayList();
        for (Npc npc : this.n.aI()) {
            Color colorB = b(npc.n());
            if (colorB != null && !arrayList.contains(colorB)) {
                arrayList.add(colorB);
                if (arrayList.size() >= 5) {
                    break;
                }
            }
        }
        return arrayList;
    }

    Map<Npc, a> h() {
        return this.t;
    }
}
