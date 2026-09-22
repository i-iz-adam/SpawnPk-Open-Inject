package rs.plugins.fpkg;

import com.google.a.b.as;
import com.google.c.l;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.class_139;
import rs.class_179;
import rs.class_184;
import rs.class_188;
import rs.class_313;
import rs.class_9;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.a.p;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;
import rs.ui.components.apkg.q;

/* JADX INFO: loaded from: client-final.jar:rs/s/f/d.class */
@rs.plugins.e(a = "Ground Markers", b = "groundmarkers", c = "Enable marking of tiles using the Shift key", d = {"overlay", "tiles"}, f = false)
public class d extends rs.plugins.a {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) d.class);
    private static final String c = "groundMarker";
    private static final String d = "region_";
    private final CopyOnWriteArrayList<a> e = new CopyOnWriteArrayList<>();

    @Inject
    private b f;

    @Inject
    private class_179 g;

    @Inject
    private class_188 h;

    @Inject
    private class_139 i;

    @Inject
    private c j;

    @Inject
    private Client k;

    @Inject
    private l l;

    @Inject
    private rs.ui.components.apkg.d m;

    @Override // rs.s.a
    public void a() {
        class_313.d().a(this.j);
        f();
    }

    @Override // rs.s.a
    public void b() {
        class_313.d().b(this.j);
        this.e.clear();
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.g || gameStateChanged.getGameState() == rs.runelite.a.c.f) {
            f();
        }
    }

    @Subscribe
    private void onMenuHover(MenuHover menuHover) {
        if (Client.dj) {
            return;
        }
        Client client = this.k;
        if (Client.ag && menuHover.getMenuId() == 516 && this.k.aE() != null) {
            p pVarA = p.a(this.k.aE());
            rs.runelite.a.f fVarAE = this.k.aE();
            Optional<f> optionalFindFirst = a(pVarA.b()).stream().filter(fVar -> {
                return fVar.b() == pVarA.c() && fVar.c() == pVarA.d() && fVar.d() == pVarA.g();
            }).findFirst();
            if (fVarAE == null) {
                return;
            }
            if (!optionalFindFirst.isPresent()) {
                this.h.b("Mark", () -> {
                    SwingUtilities.invokeLater(() -> {
                        a(fVarAE);
                    });
                });
                return;
            }
            int[] iArr = this.k.fR;
            f fVar2 = optionalFindFirst.get();
            this.h.b("<img=288> <img=138> Reset all", () -> {
                a(iArr);
            });
            this.h.b("<img=283> Label", () -> {
                a(fVar2);
            });
            class_184 class_184VarB = this.h.b(this.h.b("<img=326> Color", () -> {
            }));
            class_184VarB.a("Reset color", () -> {
                a(fVar2, this.f.a());
            });
            class_184VarB.a("Pick color", () -> {
                Color colorE = fVar2.e();
                SwingUtilities.invokeLater(() -> {
                    q qVarA = this.m.a(SwingUtilities.windowForComponent(this.k), colorE, "Tile marker color", false);
                    qVarA.b(color -> {
                        a(fVar2, color);
                    });
                    qVarA.setLocationRelativeTo(this.k);
                    qVarA.setVisible(true);
                });
            });
            for (Color color : (List) this.e.stream().map((v0) -> {
                return v0.b();
            }).distinct().collect(Collectors.toList())) {
                if (!color.equals(fVar2.e())) {
                    class_184VarB.a(class_9.a("Color", color), () -> {
                        a(fVar2, color);
                    });
                }
            }
            this.h.b("<img=25> Unmark", () -> {
                SwingUtilities.invokeLater(() -> {
                    a(fVarAE);
                });
            });
        }
    }

    void a(int i, Collection<f> collection) {
        if (collection == null || collection.isEmpty()) {
            this.i.b("groundMarker", "region_" + i);
        } else {
            this.i.b("groundMarker", "region_" + i, this.l.b(collection));
        }
    }

    Collection<f> a(int i) {
        String strA = this.i.a("groundMarker", "region_" + i);
        return as.c(strA) ? Collections.emptyList() : (Collection) this.l.a(strA, new e(this).b());
    }

    @Provides
    b a(class_139 class_139Var) {
        return (b) class_139Var.a(b.class);
    }

    void f() {
        this.e.clear();
        int[] iArr = this.k.fR;
        if (iArr == null) {
            return;
        }
        for (int i : iArr) {
            b.debug("Loading points for region {}", Integer.valueOf(i));
            this.e.addAll(a(a(i)));
        }
    }

    private Collection<a> a(Collection<f> collection) {
        return collection.isEmpty() ? Collections.emptyList() : (Collection) collection.stream().map(fVar -> {
            return new a(p.a(fVar.a(), fVar.b(), fVar.c(), fVar.d()), fVar.e(), fVar.f());
        }).flatMap(aVar -> {
            return p.c(aVar.a()).stream().map(pVar -> {
                return new a(pVar, aVar.b(), aVar.c());
            });
        }).collect(Collectors.toList());
    }

    private void a(rs.runelite.a.f fVar) {
        if (fVar == null) {
            return;
        }
        p pVarA = p.a(fVar);
        int iB = pVarA.b();
        f fVar2 = new f(iB, pVarA.c(), pVarA.d(), pVarA.g(), this.f.a(), null);
        b.debug("Updating point: {} - {}", fVar2, pVarA);
        ArrayList arrayList = new ArrayList(a(iB));
        if (arrayList.contains(fVar2)) {
            arrayList.remove(fVar2);
        } else {
            arrayList.add(fVar2);
        }
        a(iB, arrayList);
        f();
    }

    private void a(f fVar, Color color) {
        f fVar2 = new f(fVar.a(), fVar.b(), fVar.c(), fVar.d(), color, fVar.f());
        ArrayList arrayList = new ArrayList(a(fVar.a()));
        arrayList.remove(fVar2);
        arrayList.add(fVar2);
        a(fVar.a(), arrayList);
        f();
    }

    private void a(f fVar) {
        this.g.a("Tile label").b((String) Optional.ofNullable(fVar.f()).orElse("")).a(str -> {
            f fVar2 = new f(fVar.a(), fVar.b(), fVar.c(), fVar.d(), fVar.e(), as.b(str));
            ArrayList arrayList = new ArrayList(a(fVar.a()));
            arrayList.remove(fVar);
            arrayList.add(fVar2);
            a(fVar.a(), arrayList);
            f();
        }).a();
    }

    private void a(int[] iArr) {
        if (iArr == null || Arrays.stream(iArr).mapToLong(i -> {
            return a(i).size();
        }).sum() == 0) {
            return;
        }
        SwingUtilities.invokeLater(() -> {
            if (JOptionPane.showConfirmDialog(Launcher.n().i(), "Are you sure you want to reset all markers in this area?", com.google.a.l.c.g, 0) == 0) {
                for (int i2 : iArr) {
                    a(i2, (Collection<f>) null);
                }
                f();
            }
        });
    }

    CopyOnWriteArrayList<a> g() {
        return this.e;
    }
}
