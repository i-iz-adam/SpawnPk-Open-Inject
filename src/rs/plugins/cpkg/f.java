package rs.plugins.cpkg;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import javax.inject.Inject;
import rs.Client;
import rs.class_268;
import rs.class_306;
import rs.class_313;
import rs.class_46;
import rs.runelite.a.i;
import rs.runelite.a.p;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/f.class */
public class f extends class_306 {
    private static final Color e = Color.GREEN;
    private static final Color f = Color.BLUE;
    private static final Color g = new Color(141, 220, 26);
    private static final Color h = new Color(73, 122, 18);
    private static final Color i = new Color(204, 42, 219);
    private static final Color j = Color.CYAN;
    private static final int k = 128;
    private static final int l = 8;
    private static final int m = 64;
    private static final int n = 16;
    private static final int o = 4;
    private static final int p = 20;
    private static final int q = -16;
    private final a r;
    private rs.runelite.a.f s;
    private rs.runelite.a.f t;

    @Inject
    public f(a aVar) {
        this.r = aVar;
        a(class_268.p);
    }

    @Override // rs.class_306
    public void a() {
        if (this.r.c()) {
            a(class_313.d().b(i()));
            if (class_46.t != -1 && class_46.u != -1) {
                a(rs.runelite.a.h.a(rs.runelite.a.f.a(class_46.t, class_46.u), Client.dw), (class_46.t + Client.eh) + "," + (class_46.u + Client.ei), Color.WHITE);
            }
        }
        if (this.r.k()) {
            if (!Client.ch) {
                if (this.s != null && this.t != null) {
                    p pVarA = p.a(this.s);
                    p pVarA2 = p.a(this.t);
                    int iMin = Math.min(pVarA.e(), pVarA2.e());
                    int iMin2 = Math.min(pVarA.f(), pVarA2.f());
                    System.out.println("Range(" + iMin + ", " + Math.max(pVarA.e(), pVarA2.e()) + ", " + iMin2 + ", " + Math.max(pVarA.f(), pVarA2.f()) + ")");
                }
                k();
                return;
            }
            if (this.s == null) {
                if (class_46.t == -1 || class_46.u == -1) {
                    return;
                } else {
                    this.s = rs.runelite.a.f.a(class_46.t, class_46.u);
                }
            }
            if (class_46.t != -1 && class_46.u != -1) {
                this.t = rs.runelite.a.f.a(class_46.t, class_46.u);
            }
            a(this.s, Color.RED, 1.0d, new Color(255, 0, 0, 50));
            if (this.t == null || this.t.b() == this.s.b() || this.t.c() == this.s.c()) {
                return;
            }
            p pVarA3 = p.a(this.s);
            p pVarA4 = p.a(this.t);
            for (int iMin3 = Math.min(pVarA3.e(), pVarA4.e()); iMin3 <= Math.max(pVarA3.e(), pVarA4.e()); iMin3++) {
                for (int iMin4 = Math.min(pVarA3.f(), pVarA4.f()); iMin4 <= Math.max(pVarA3.f(), pVarA4.f()); iMin4++) {
                    a(rs.runelite.a.f.a(new p(iMin3, iMin4, Client.dw)), Color.ORANGE, 1.0d, new Color(255, 0, 0, 50));
                }
            }
        }
    }

    private void k() {
        this.s = null;
        this.t = null;
    }

    private void a(Graphics2D graphics2D) {
        p pVarG = this.a.aH().g();
        int iE = ((((pVarG.e() - 16) + 64) - 1) / 64) * 64;
        int iF = ((((pVarG.f() - 16) + 64) - 1) / 64) * 64;
        int iE2 = ((pVarG.e() + 16) / 64) * 64;
        int iF2 = ((pVarG.f() + 16) / 64) * 64;
        graphics2D.setStroke(new BasicStroke(4.0f));
        graphics2D.setColor(e);
        GeneralPath generalPath = new GeneralPath();
        for (int i2 = iE; i2 <= iE2; i2 += 64) {
            rs.runelite.a.f fVarB = rs.runelite.a.f.b(i2, pVarG.f() - 16);
            rs.runelite.a.f fVarB2 = rs.runelite.a.f.b(i2, pVarG.f() + 16);
            boolean z = true;
            for (int iC = fVarB.c(); iC <= fVarB2.c(); iC += 128) {
                i iVarA = rs.runelite.a.h.a(new rs.runelite.a.f(fVarB.b() - 64, iC - 64), Client.dw);
                if (iVarA != null) {
                    if (iC % 15 == 0) {
                        p pVarA = p.a(new rs.runelite.a.f(i2, iC));
                        a(rs.runelite.a.h.a(new rs.runelite.a.f((fVarB.b() - 64) + 500, iC - 64), Client.dw), (((i2 >> 6) * 256) + (pVarA.f() >> 6)), e);
                        a(rs.runelite.a.h.a(new rs.runelite.a.f((fVarB.b() - 64) - 500, iC - 64), Client.dw), ((((i2 - 1) >> 6) * 256) + (pVarA.f() >> 6)), e);
                    }
                    if (z) {
                        generalPath.moveTo(iVarA.a(), iVarA.b());
                        z = false;
                    } else {
                        generalPath.lineTo(iVarA.a(), iVarA.b());
                    }
                }
            }
        }
        for (int i3 = iF; i3 <= iF2; i3 += 64) {
            rs.runelite.a.f fVarB3 = rs.runelite.a.f.b(pVarG.e() - 16, i3);
            rs.runelite.a.f fVarB4 = rs.runelite.a.f.b(pVarG.e() + 16, i3);
            boolean z2 = true;
            for (int iB = fVarB3.b(); iB <= fVarB4.b(); iB += 128) {
                i iVarA2 = rs.runelite.a.h.a(new rs.runelite.a.f(iB - 64, fVarB3.c() - 64), Client.dw);
                if (iVarA2 != null) {
                    if (iB % 15 == 0) {
                        p pVarA2 = p.a(new rs.runelite.a.f(iB, i3));
                        a(rs.runelite.a.h.a(new rs.runelite.a.f(iB - 64, (fVarB3.c() - 64) + 500), Client.dw), (((pVarA2.e() >> 6) * 256) + (i3 >> 6)), e);
                        a(rs.runelite.a.h.a(new rs.runelite.a.f(iB - 64, (fVarB3.c() - 64) - 500), Client.dw), (((pVarA2.e() >> 6) * 256) + ((i3 - 1) >> 6)), e);
                    }
                    if (z2) {
                        generalPath.moveTo(iVarA2.a(), iVarA2.b());
                        z2 = false;
                    } else {
                        generalPath.lineTo(iVarA2.a(), iVarA2.b());
                    }
                }
            }
        }
        graphics2D.draw(generalPath);
    }

    private void a(rs.runelite.a.f fVar, Color color, double d, Color color2) {
        Polygon polygonA;
        if (fVar == null || (polygonA = rs.runelite.a.h.a(fVar)) == null) {
            return;
        }
        a((Shape) polygonA, color, color2, (Stroke) new BasicStroke((float) d));
    }
}
