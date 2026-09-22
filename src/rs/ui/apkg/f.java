package rs.ui.apkg;

import com.google.a.b.V;
import com.google.a.b.as;
import com.google.a.d.ag;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.commons.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.class_139;
import rs.class_188;
import rs.class_313;
import rs.class_314;
import rs.class_6;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/f.class */
@Singleton
public class f {
    public static final String a = "Default Group";
    public static final String b = "InfoBoxOverlay";
    private static final String d = "infoboxgroup";
    private static final String e = "infoboxoverlay";
    private static final String f = "orient_";
    private final Map<String, g> m = new ConcurrentHashMap();
    private final Client n;
    private final EventBus o;
    private final class_139 p;
    private final class_313 q;
    private final rs.plugins.h r;
    private final class_188 s;
    private final rs.plugins.h.b t;
    private c u;
    private static final Logger c = LoggerFactory.getLogger((Class<?>) f.class);
    private static final String g = "Detach InfoBox";
    private static final class_314 j = new class_314(rs.runelite.a.g.D, g, "InfoBox");
    private static final String h = "Flip";
    private static final class_314 k = new class_314(rs.runelite.a.g.D, h, "InfoBox Group");
    private static final String i = "Delete";
    private static final class_314 l = new class_314(rs.runelite.a.g.D, i, "InfoBox Group");

    @Inject
    private f(Client client, EventBus eventBus, class_139 class_139Var, class_313 class_313Var, rs.plugins.h hVar, class_188 class_188Var) {
        this.n = client;
        this.o = eventBus;
        this.p = class_139Var;
        this.q = class_313Var;
        this.r = hVar;
        this.t = (rs.plugins.h.b) class_139Var.a(rs.plugins.h.b.class);
        this.s = class_188Var;
        eventBus.register(this);
    }

    public c a(String str) {
        return (c) this.m.values().stream().flatMap(gVar -> {
            return gVar.M().stream();
        }).filter(cVar -> {
            return cVar.h().equals(str);
        }).findFirst().orElse(null);
    }

    public void b(String str) {
        this.m.values().forEach(gVar -> {
            gVar.M().removeIf(cVar -> {
                return cVar.h().equals(str);
            });
        });
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.c) {
            this.m.clear();
        }
    }

    @Subscribe
    private void onMenuHover(MenuHover menuHover) {
        if (this.u != null) {
            a(this.u);
        }
        this.u = null;
    }

    public boolean a(c cVar) {
        if (!Client.ag || Client.dj) {
            return false;
        }
        String strE = e(cVar.j());
        g gVar = this.m.get(cVar.j());
        boolean zEquals = cVar.j().equals(cVar.i());
        if (gVar.M().size() > 1) {
            this.s.b(g, () -> {
                if (cVar.j().equalsIgnoreCase(cVar.i())) {
                    a(cVar.h() + "_cust_" + System.currentTimeMillis(), cVar);
                    return;
                }
                String strJ = cVar.j();
                a(cVar, cVar.i());
                cVar.a = cVar.i();
                this.m.get(strJ).M().remove(cVar);
                this.m.computeIfAbsent(cVar.i(), this::f).M().add(cVar);
            });
        }
        this.s.a("Flip InfoBox Group \"" + strE + "\"", () -> {
            a(gVar.K(), gVar.L());
        });
        HashSet<String> hashSet = new HashSet();
        for (c cVar2 : gVar.M()) {
            if (!cVar2.i().equals(cVar.j())) {
                hashSet.add(cVar2.i());
            }
        }
        if (hashSet.size() > 0) {
            for (String str : hashSet) {
                this.s.c("Unmerge InfoBox Group \"" + e(str) + "\"", () -> {
                    ArrayList<c> arrayList = new ArrayList();
                    g gVarComputeIfAbsent = this.m.computeIfAbsent(str, this::f);
                    for (c cVar3 : this.m.get(cVar.j()).M()) {
                        if (cVar3.i().equals(str)) {
                            arrayList.add(cVar3);
                        }
                    }
                    for (c cVar4 : arrayList) {
                        gVar.M().remove(cVar4);
                        cVar4.a = str;
                        a(cVar4, str);
                        gVarComputeIfAbsent.M().add(cVar4);
                    }
                });
            }
        }
        if (!f(cVar) || zEquals) {
            return true;
        }
        this.s.b("Delete InfoBox Group \"" + strE + "\"", () -> {
            g gVarComputeIfAbsent;
            if (zEquals || gVar == (gVarComputeIfAbsent = this.m.computeIfAbsent(cVar.i(), this::f))) {
                return;
            }
            a(gVar, gVarComputeIfAbsent);
        });
        return true;
    }

    public void b(c cVar) {
        V.a(cVar);
        c.debug("Adding InfoBox {}", cVar);
        d(cVar);
        String strG = g(cVar);
        g gVarComputeIfAbsent = this.m.computeIfAbsent(strG, this::f);
        List<class_314> listO = cVar.o();
        cVar.a = strG;
        if (cVar instanceof b) {
            cVar.a(Instant.now());
            cVar.c(this.t.h());
        }
        listO.add(j);
        listO.add(k);
        if (f(cVar)) {
            listO.add(l);
        }
        synchronized (this) {
            gVarComputeIfAbsent.M().add(a(gVarComputeIfAbsent.M(), cVar, (Comparator<? super c>) (cVar2, cVar3) -> {
                return ag.a().a(cVar2.m(), cVar3.m()).a(cVar2.j(), cVar3.j()).b();
            }), cVar);
        }
        BufferedImage bufferedImageK = cVar.k();
        d(cVar);
        if (bufferedImageK instanceof class_6) {
            ((class_6) bufferedImageK).a(() -> {
                d(cVar);
            });
        }
    }

    private String e(String str) {
        if (str.equals(b)) {
            return a;
        }
        return str.contains("_cust_") ? "(Custom)" : WordUtils.capitalize(str);
    }

    private boolean f(c cVar) {
        return (cVar.j().equals(cVar.i()) || cVar.j().equals(b) || !cVar.j().contains("_cust_")) ? false : true;
    }

    public synchronized void c(c cVar) {
        if (cVar == null || cVar.j() == null) {
            return;
        }
        if (this.m.get(cVar.j()).M().remove(cVar)) {
            c.debug("Removed InfoBox {}", cVar);
        }
        cVar.o().remove(j);
        cVar.o().remove(k);
        cVar.o().remove(l);
    }

    public synchronized void a(Predicate<c> predicate) {
        for (g gVar : this.m.values()) {
            if (gVar.M().removeIf(predicate)) {
                c.debug("Removed InfoBoxes for filter {} from {}", predicate, gVar);
            }
        }
    }

    public List<c> a() {
        return (List) this.m.values().stream().map((v0) -> {
            return v0.M();
        }).flatMap((v0) -> {
            return v0.stream();
        }).collect(Collectors.toList());
    }

    public synchronized void b() {
        this.m.values().forEach(gVar -> {
            gVar.M().removeIf((v0) -> {
                return v0.f();
            });
        });
    }

    public void d(c cVar) {
        if (cVar.k() == null) {
            return;
        }
        BufferedImage bufferedImageK = cVar.k();
        BufferedImage bufferedImage = bufferedImageK;
        double width = bufferedImageK.getWidth((ImageObserver) null);
        double height = bufferedImageK.getHeight((ImageObserver) null);
        double dA = a(cVar.p() == e.b);
        if (dA < width || dA < height) {
            double d2 = dA / width;
            double d3 = dA / height;
            if (d2 == 1.0d && d3 == 1.0d) {
                return;
            }
            double dMin = Math.min(d2, d3);
            int i2 = (int) (width * dMin);
            int i3 = (int) (height * dMin);
            BufferedImage bufferedImage2 = new BufferedImage(i2, i3, 2);
            Graphics2D graphics2DCreateGraphics = bufferedImage2.createGraphics();
            graphics2DCreateGraphics.drawImage(bufferedImageK, 0, 0, i2, i3, (ImageObserver) null);
            graphics2DCreateGraphics.dispose();
            bufferedImage = bufferedImage2;
        }
        cVar.b(bufferedImage);
    }

    public double a(boolean z) {
        return !z ? Math.max(2, Math.max(this.t.q() - 2, 16)) : Math.max(2, this.t.q());
    }

    private g f(String str) {
        rs.ui.components.e eVarC = c(str);
        if (eVarC == null) {
            if (str.equals(b)) {
                eVarC = this.t.p() ? rs.ui.components.e.b : rs.ui.components.e.a;
                a(str, eVarC);
            } else {
                eVarC = rs.ui.components.e.a;
            }
        }
        g gVar = new g(this, this.n, this.o, str, this.t, eVarC);
        this.q.a(gVar);
        this.o.register(gVar);
        return gVar;
    }

    private void a(g gVar) {
        this.o.unregister(gVar);
        this.q.b(gVar);
        this.m.remove(gVar.K());
    }

    private synchronized void a(String str, c cVar) {
        String strJ = cVar.j();
        g gVar = this.m.get(cVar.j());
        Collection<? extends c> collection = (Collection) gVar.M().stream().filter(cVar2 -> {
            return cVar2.h().equals(cVar.h());
        }).collect(Collectors.toList());
        gVar.M().removeAll(collection);
        if (gVar.M().isEmpty()) {
            c.debug("Deleted layer: {}", gVar.K());
            d(gVar.K());
            a(gVar);
        }
        this.m.computeIfAbsent(str, this::f).M().addAll(collection);
        for (c cVar3 : collection) {
            a(cVar3, str);
            cVar3.a = str;
            if (!cVar3.o().contains(l)) {
                cVar3.o().add(l);
            }
        }
        c.debug("Moving infobox named {} (layer {}) to layer {}: {} boxes", cVar.h(), strJ, str, Integer.valueOf(collection.size()));
    }

    public synchronized void a(g gVar, g gVar2) {
        List<c> listM = gVar.M();
        boolean zEquals = gVar2.K().equals(b);
        c.debug("Merging InfoBoxes from {} into {} ({} boxes)", gVar.K(), gVar2.K(), Integer.valueOf(listM.size()));
        for (c cVar : listM) {
            a(cVar, gVar2.K());
            cVar.a = gVar2.K();
            if (zEquals) {
                cVar.o().remove(l);
            }
        }
        gVar2.M().addAll(listM);
        gVar.M().clear();
        d(gVar.K());
        a(gVar);
        c.debug("Deleted layer: {}", gVar.K());
    }

    private String g(c cVar) {
        String strA = this.p.a(d, cVar.h());
        return as.c(strA) ? cVar.j() : strA;
    }

    private void a(c cVar, String str) {
        if (str.equals(b) || str.equals(cVar.i())) {
            this.p.b(d, cVar.h());
        } else {
            this.p.b(d, cVar.h(), str);
        }
    }

    rs.ui.components.e c(String str) {
        return (rs.ui.components.e) this.p.a(e, "orient_" + str, (Type) rs.ui.components.e.class);
    }

    void a(String str, rs.ui.components.e eVar) {
        this.p.a(e, "orient_" + str, eVar);
    }

    void d(String str) {
        this.p.b(e, "orient_" + str);
    }

    private static <T> int a(List<? extends T> list, T t, Comparator<? super T> comparator) {
        int iBinarySearch = Collections.binarySearch(list, t, comparator);
        if (iBinarySearch < 0) {
            return (-iBinarySearch) - 1;
        }
        for (int i2 = iBinarySearch + 1; i2 < list.size(); i2++) {
            if (comparator.compare(list.get(i2), t) > 0) {
                return i2;
            }
        }
        return list.size();
    }

    public Map<String, g> c() {
        return this.m;
    }

    public void e(c cVar) {
        this.u = cVar;
    }
}
