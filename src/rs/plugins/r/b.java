package rs.plugins.r;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import javax.inject.Inject;
import rs.Client;
import rs.class_268;
import rs.class_306;
import rs.class_46;
import rs.runelite.a.f;
import rs.runelite.a.h;

/* JADX INFO: loaded from: client-final.jar:rs/s/r/b.class */
public class b extends class_306 {
    private final a e;

    @Inject
    public b(a aVar) {
        this.e = aVar;
        a(class_268.p);
    }

    @Override // rs.class_306
    public void a() {
        f fVarA;
        if (this.e.e() && class_46.t != -1 && class_46.u != -1) {
            a(f.a(class_46.t, class_46.u), this.e.f(), this.e.d(), this.e.g());
        }
        if (this.e.a() && this.a.gd > 0 && this.a.ge > 0) {
            a(f.a(this.a.gd, this.a.ge), this.e.b(), this.e.d(), this.e.c());
        }
        if (!this.e.i() || (fVarA = f.a(Client.eR.g())) == null) {
            return;
        }
        a(fVarA, this.e.j(), this.e.l(), this.e.k());
    }

    private void a(f fVar, Color color, double d, Color color2) {
        Polygon polygonA;
        if (fVar == null || (polygonA = h.a(fVar)) == null) {
            return;
        }
        a((Shape) polygonA, color, color2, (Stroke) new BasicStroke((float) d));
    }
}
