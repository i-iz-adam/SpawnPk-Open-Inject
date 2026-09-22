package rs.plugins.fpkg;

import com.google.a.b.as;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import rs.Client;
import rs.class_268;
import rs.class_306;
import rs.runelite.a.h;
import rs.runelite.a.p;

/* JADX INFO: loaded from: client-final.jar:rs/s/f/c.class */
public class c extends class_306 {
    private static final int e = 32;
    private final b f;
    private final d g;

    @Inject
    public c(b bVar, d dVar) {
        this.f = bVar;
        this.g = dVar;
        a(class_268.o);
    }

    @Override // rs.class_306
    public void a() {
        CopyOnWriteArrayList<a> copyOnWriteArrayListG = this.g.g();
        if (copyOnWriteArrayListG.isEmpty()) {
            return;
        }
        BasicStroke basicStroke = new BasicStroke((float) this.f.d());
        for (a aVar : copyOnWriteArrayListG) {
            p pVarA = aVar.a();
            if (pVarA.g() == Client.dw) {
                Color colorB = aVar.b();
                if (colorB == null) {
                    colorB = this.f.a();
                }
                a(pVarA, colorB, aVar.c(), (Stroke) basicStroke);
            }
        }
    }

    private void a(p pVar, Color color, @Nullable String str, Stroke stroke) {
        rs.runelite.a.f fVarA;
        if (pVar.a(Client.eR.g()) < 32 && (fVarA = rs.runelite.a.f.a(pVar)) != null) {
            Polygon polygonA = h.a(fVarA);
            if (polygonA != null) {
                a((Shape) polygonA, color, new Color(0, 0, 0, this.f.e()), stroke);
            }
            if (as.c(str)) {
                return;
            }
            a(fVarA, str, color, 0);
        }
    }
}
