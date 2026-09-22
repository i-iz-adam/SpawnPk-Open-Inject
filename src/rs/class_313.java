package rs;

import gnu.trove.f.b.cc;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.eventbus.EventBus;
import rs.gui.Launcher;
import rs.plugins.h;
import rs.ui.f;

/* JADX INFO: loaded from: client-final.jar:rs/class_313.class */
@Singleton
public class class_313 {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) class_313.class);
    private final class_317 n;
    private final h o;
    private final Client p;
    private static class_313 r;
    private final ConcurrentHashMap<class_268, List<class_306>> c = new ConcurrentHashMap<>();
    final ConcurrentHashMap<class_268, CopyOnWriteArrayList<class_315>> a = new ConcurrentHashMap<>();
    private final cc<List<class_310>> d = new cc<>();
    private final List<class_310> e = new ArrayList();
    private final class_304 f = new class_304();
    private final class_290 g = new class_290();
    private final class_271 h = new class_271();
    private final class_294 i = new class_294();
    private final class_283 j = new class_283();
    private final class_281 k = new class_281();
    private final class_284 l = new class_284();
    private Graphics2D m = null;
    private boolean q = false;

    @Inject
    public class_313(Client client, h hVar, f fVar, EventBus eventBus, class_160 class_160Var, class_139 class_139Var) {
        r = this;
        this.n = new class_317(this, fVar, client, hVar, eventBus, class_160Var, class_139Var);
        this.p = client;
        this.o = hVar;
        for (class_268 class_268Var : class_268.values()) {
            this.c.put(class_268Var, new CopyOnWriteArrayList());
            this.a.put(class_268Var, new CopyOnWriteArrayList<>());
        }
        a(this.f);
        if (Configuration.c.intValue() == 1) {
            a(this.j);
            a(this.k);
            a(this.l);
        }
        a(this.g);
        a(this.h);
        a(this.i);
    }

    public void a(class_306 class_306Var) {
        if (!(class_306Var instanceof class_315)) {
            this.c.get(class_306Var.i()).add(class_306Var);
            return;
        }
        class_315 class_315Var = (class_315) class_306Var;
        this.n.b(class_315Var);
        class_315Var.a(this.o.s());
        CopyOnWriteArrayList<class_315> copyOnWriteArrayList = this.a.get(class_306Var.i());
        if (class_315Var.A() <= 0.0f) {
            copyOnWriteArrayList.add((class_315) class_306Var);
            return;
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            if (copyOnWriteArrayList.get(i).A() < class_315Var.A()) {
                size = i;
                break;
            }
        }
        copyOnWriteArrayList.add(size, class_315Var);
    }

    public void b(class_306 class_306Var) {
        if (class_306Var instanceof class_315) {
            this.a.get(class_306Var.i()).remove(class_306Var);
        } else {
            this.c.get(class_306Var.i()).remove(class_306Var);
        }
    }

    public boolean c(class_306 class_306Var) {
        return class_306Var instanceof class_315 ? this.a.get(class_306Var.i()).contains(class_306Var) : this.c.get(class_306Var.i()).contains(class_306Var);
    }

    public void a(class_310 class_310Var, int i) {
        if (this.d.b(i) == null) {
            this.d.a(i, new ArrayList());
        }
        if (this.d.b(i).contains(class_310Var)) {
            this.d.b(i).remove(class_310Var);
        }
        class_310Var.d(i);
        this.d.b(i).add(class_310Var);
    }

    public void a(class_310 class_310Var) {
        if (this.d.b(class_310Var.s()) == null) {
            return;
        }
        this.d.b(class_310Var.s()).remove(class_310Var);
    }

    public void a(int i, int i2, int i3) {
        if (!this.e.isEmpty()) {
            for (class_310 class_310Var : this.e) {
                class_310Var.a(Launcher.n().o());
                class_310Var.b(i2);
                class_310Var.c(i3);
                class_310Var.d(i);
                class_310Var.a();
            }
        }
        if (this.d.b(i) == null) {
            return;
        }
        for (int i4 = 0; i4 < this.d.b(i).size(); i4++) {
            class_310 class_310Var2 = this.d.b(i).get(i4);
            class_310Var2.a(Launcher.n().o());
            class_310Var2.b(i2);
            class_310Var2.c(i3);
            class_310Var2.a();
        }
    }

    public void a(class_268 class_268Var) {
        if (this.m != null) {
            this.m.dispose();
        }
        this.m = Launcher.n().o().gZ.e.getGraphics();
        this.m.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.n.a(class_268Var, this.a.get(class_268Var));
        if (this.c.get(class_268Var).isEmpty()) {
            return;
        }
        List<class_306> list = this.c.get(class_268Var);
        for (int i = 0; i < list.size(); i++) {
            class_306 class_306Var = list.get(i);
            if (class_306Var.g()) {
                d(class_306Var);
                class_306Var.b();
            }
        }
    }

    public void a(class_268 class_268Var, Object obj, ColorUtility colorUtility) {
        if (this.c.get(class_268Var) == null) {
            return;
        }
        if (class_268Var == class_268.e || colorUtility != null) {
            a(this.c.get(class_268Var), obj, colorUtility);
        }
    }

    public void a(class_268 class_268Var, class_48 class_48Var, ColorUtility colorUtility) {
        if (this.c.get(class_268Var) == null) {
            return;
        }
        a(this.c.get(class_268Var), class_48Var, colorUtility);
    }

    public void a() {
        Iterator<List<class_306>> it = this.c.values().iterator();
        while (it.hasNext()) {
            Iterator<class_306> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
        Iterator<CopyOnWriteArrayList<class_315>> it3 = this.a.values().iterator();
        while (it3.hasNext()) {
            Iterator<class_315> it4 = it3.next().iterator();
            while (it4.hasNext()) {
                it4.next().c();
            }
        }
        for (class_268 class_268Var : class_268.values()) {
            this.a.put(class_268Var, new CopyOnWriteArrayList<>());
        }
    }

    public void b() {
        this.q = false;
        if (this.p.fc) {
            if (this.n.a()) {
                this.n.a = this.n.b();
            }
            this.n.b = new class_311(this.n.a);
        }
    }

    public void c() {
        this.n.d = this.n.c;
        this.n.c = null;
    }

    public Graphics2D b(class_268 class_268Var) {
        return this.m;
    }

    Point a(Point point) {
        return a(point.x, point.y);
    }

    public static Point a(float f, float f2) {
        Client clientO = Launcher.n().o();
        return (Client.ag() || !clientO.av()) ? new Point((int) f, (int) f2) : new Point(clientO.b((int) f, false), clientO.c((int) f2, false));
    }

    private void a(List<class_306> list, Object obj, ColorUtility colorUtility) {
        if (obj == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            class_306 class_306Var = list.get(i);
            if (class_306Var.g()) {
                if ((class_306Var instanceof class_308) && (obj instanceof Npc)) {
                    ((class_308) class_306Var).a((Npc) obj);
                    ((class_308) class_306Var).a(colorUtility);
                    d(class_306Var);
                    class_306Var.b();
                } else if ((class_306Var instanceof class_309) && (obj instanceof Player)) {
                    ((class_309) class_306Var).a((Player) obj);
                    d(class_306Var);
                    class_306Var.b();
                } else if (class_306Var instanceof class_307) {
                    ((class_307) class_306Var).a(obj);
                    ((class_307) class_306Var).a(colorUtility);
                    d(class_306Var);
                    class_306Var.b();
                }
            }
        }
    }

    private void d(class_306 class_306Var) {
        if (class_306Var.f() == null) {
            class_306Var.a(Launcher.n().o());
        }
        class_306Var.a();
    }

    public static class_313 d() {
        return r;
    }

    public List<class_310> e() {
        return this.e;
    }

    public class_304 f() {
        return this.f;
    }

    public class_290 g() {
        return this.g;
    }

    public class_271 h() {
        return this.h;
    }

    public class_294 i() {
        return this.i;
    }

    public class_283 j() {
        return this.j;
    }

    public class_281 k() {
        return this.k;
    }

    public class_284 l() {
        return this.l;
    }

    public class_317 m() {
        return this.n;
    }
}
