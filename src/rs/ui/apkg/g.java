package rs.ui.apkg;

import com.google.a.b.as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.NonNull;
import rs.Client;
import rs.class_268;
import rs.class_306;
import rs.class_313;
import rs.class_315;
import rs.class_320;
import rs.eventbus.EventBus;
import rs.gui.w;
import rs.ui.components.q;

/* JADX INFO: loaded from: client-final.jar:rs/ui/a/g.class */
public class g extends class_315 {
    private static final int r = 1;
    private static final int s = 6;
    private final f t;
    private final EventBus u;
    private final rs.plugins.hpkg.b v;
    private rs.ui.components.e w;
    private final List<c> x = new CopyOnWriteArrayList();

    g(f fVar, Client client, EventBus eventBus, String str, rs.plugins.hpkg.b bVar, @NonNull rs.ui.components.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("orientation is marked non-null but is null");
        }
        this.t = fVar;
        this.a = client;
        this.u = eventBus;
        this.m = str;
        this.w = eVar;
        this.v = bVar;
        if (str.equalsIgnoreCase("Boosts")) {
            a(class_320.g);
        } else {
            a(class_320.c);
        }
        e(false);
        g(true);
        this.e.a(true);
        this.e.a((Color) null);
        this.e.a(new Rectangle());
        this.e.b(new Point(1, 1));
        a(class_268.q);
        c(class_268.A);
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        boolean z = Client.dj;
        if (!rs.plugins.h.a.b || this.x.isEmpty()) {
            return null;
        }
        int iQ = this.v.q();
        this.e.a(new Dimension(6 * (iQ + 1), 6 * (iQ + 1)));
        this.e.a(this.w);
        Font fontB = w.b();
        boolean zR = this.v.r();
        Color color = rs.ui.components.d.c;
        Dimension dimension = new Dimension(iQ, iQ);
        for (c cVar : this.x) {
            if (cVar.e() && !rs.plugins.h.a.d.contains(cVar.j()) && !rs.plugins.h.a.c.contains(cVar.h())) {
                if (cVar.g()) {
                    this.x.remove(cVar);
                } else {
                    String strA = cVar.a();
                    Color colorB = cVar.b();
                    d dVar = new d();
                    if (this.v.q() <= 25) {
                        cVar.a(true);
                    } else {
                        cVar.a(false);
                    }
                    dVar.b(strA);
                    dVar.a(fontB);
                    if (colorB != null) {
                        dVar.a(colorB);
                    }
                    dVar.a(zR);
                    dVar.a(cVar.l());
                    dVar.a(cVar.n());
                    dVar.a(dimension);
                    dVar.b(color);
                    dVar.a(cVar);
                    this.e.d().add(dVar);
                }
            }
        }
        Dimension dimensionA = super.a(graphics2D);
        Point point = new Point(Client.hP, Client.hQ);
        Iterator<q> it = this.e.d().iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (!k()) {
                Rectangle rectangle = new Rectangle(dVar2.a());
                rectangle.translate(r().x, r().y);
                if (rectangle.contains(point)) {
                    if (this.v.s()) {
                        String strB = dVar2.b();
                        if (!as.c(strB) && !z) {
                            class_313.d().f().a(strB, false);
                        }
                    }
                    if (!z) {
                        this.t.e(dVar2.c());
                        break;
                    }
                    break;
                }
            }
        }
        this.e.d().clear();
        return dimensionA;
    }

    @Override // rs.class_315
    public boolean a(class_306 class_306Var) {
        if (!(class_306Var instanceof g)) {
            return false;
        }
        this.t.a((g) class_306Var, this);
        return true;
    }

    rs.ui.components.e L() {
        rs.ui.components.e eVar = this.w == rs.ui.components.e.a ? rs.ui.components.e.b : rs.ui.components.e.a;
        this.w = eVar;
        return eVar;
    }

    public List<c> M() {
        return this.x;
    }
}
