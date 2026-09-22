package rs.plugins.o;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import javax.inject.Inject;
import rs.Client;
import rs.ColorUtility;
import rs.class_268;
import rs.class_308;
import rs.class_313;
import rs.runelite.a.f;
import rs.runelite.a.h;
import rs.runelite.a.i;
import rs.runelite.a.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/o/c.class */
public class c extends class_308 {
    public static boolean i = true;
    private final d j;
    private final e k;

    @Inject
    public c(d dVar, e eVar) {
        this.j = dVar;
        this.k = eVar;
        a(class_268.f);
    }

    @Override // rs.class_306
    public void a() {
        a aVarA;
        if (this.g == null || this.e == null || this.e.aG == null || this.e.aG.h || (aVarA = this.k.a(this.e)) == null) {
            return;
        }
        try {
            a(aVarA);
        } catch (Exception e) {
        }
    }

    private void a(a aVar) {
        f fVarA;
        f fVarA2;
        Color colorC = aVar.c();
        float fM = aVar.m();
        Color colorD = aVar.d();
        BasicStroke basicStroke = new BasicStroke(fM);
        if (aVar.e()) {
            m mVarL = l();
            if (i && mVarL.contains(Client.hP, Client.hQ)) {
                ColorUtility.by[ColorUtility.bw] = n().au;
                int[] iArr = ColorUtility.bx;
                int i2 = ColorUtility.bw;
                ColorUtility.bw = i2 + 1;
                iArr[i2] = n().at;
                b(mVarL, colorC.brighter(), colorC.brighter(), basicStroke);
            } else {
                b(mVarL, colorC, colorD, basicStroke);
            }
        }
        if (aVar.f()) {
            a((Shape) this.e.a(this.e.aG.r), colorC, colorD, (Stroke) basicStroke);
        }
        if (aVar.g() && (fVarA2 = f.a(this.e.g())) != null) {
            byte b = this.e.aG.r;
            a((Shape) h.c(new f(fVarA2.b() + ((128 * (b - 1)) / 2), fVarA2.c() + ((128 * (b - 1)) / 2)), b), colorC, colorD, (Stroke) basicStroke);
        }
        if (aVar.h()) {
            byte b2 = this.e.aG.r;
            f fVar = new f(this.e.ac, this.e.ad);
            a((Shape) h.a(new f(fVar.b() - (((b2 - 1) * 128) / 2), fVar.c() - (((b2 - 1) * 128) / 2))), colorC, colorD, (Stroke) basicStroke);
        }
        if (aVar.i() && (fVarA = f.a(this.e.g())) != null) {
            a((Shape) h.a(fVarA), colorC, colorD, (Stroke) basicStroke);
        }
        if (aVar.j()) {
            rs.ui.b.b.a().a(this.e, (int) fM, colorC, aVar.n());
        }
        if (aVar.k()) {
            i iVarA = h.a(class_313.d().b(i()), new f(this.e.ac, this.e.ad), this.e.o(), this.e.r);
            if (iVarA != null) {
                Client.gl.c(this.e.o(), iVarA.a(), iVarA.b(), colorC.getRGB(), 0);
            }
        }
    }

    private void a(f fVar, Color color, double d, Color color2) {
        Polygon polygonA;
        if (fVar == null || (polygonA = h.a(fVar)) == null) {
            return;
        }
        a((Shape) polygonA, color, color2, (Stroke) new BasicStroke((float) d));
    }
}
