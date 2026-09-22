package rs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.annotation.Nullable;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.Options;
import rs.gui.w;
import rs.ui.components.d;

/* JADX INFO: loaded from: client-final.jar:rs/class_315.class */
public class class_315 extends class_306 {
    protected class_320 h;
    protected Point i;
    protected Dimension j;
    protected Point k;
    protected Color q;
    private boolean w;
    protected final rs.ui.components.s e = new rs.ui.components.s();
    protected Rectangle f = new Rectangle();
    protected class_320 g = class_320.c;
    private int r = 32;
    private boolean s = true;
    private boolean t = true;
    protected boolean l = false;
    protected String m = Options.TREE_LINE_STYLE_NONE_VALUE;
    protected float n = 0.0f;
    protected class_268 o = null;
    protected boolean p = false;
    private boolean u = true;
    private boolean v = false;
    private boolean x = true;
    private boolean y = true;

    @Override // rs.class_306
    public void a() {
    }

    public Dimension a(Graphics2D graphics2D) {
        Dimension dimensionB = this.e.b();
        if (v() != null) {
            this.e.a(v());
            if (this.v) {
                if (v().width >= 167.70000000000002d) {
                    graphics2D.setFont(w.c());
                } else if (v().width <= 103.2d) {
                    graphics2D.setFont(w.b());
                }
            }
        }
        Color colorC = this.e.c();
        if (D() != null && d.c.equals(colorC)) {
            this.e.a(D());
        }
        try {
            Dimension dimensionA = this.e.a(graphics2D);
            if (this.u) {
                this.e.d().clear();
            }
            this.e.a(dimensionB);
            this.e.a(colorC);
            return dimensionA;
        } catch (Throwable th) {
            if (this.u) {
                this.e.d().clear();
            }
            throw th;
        }
    }

    public boolean k() {
        return !i().B && i().ordinal() <= class_268.q.ordinal() && Client.cH > 0;
    }

    public boolean l() {
        return !k();
    }

    public void m() {
    }

    public boolean n() {
        return false;
    }

    public boolean a(class_306 class_306Var) {
        return false;
    }

    public void a(class_320 class_320Var) {
        this.g = class_320Var;
        switch (class_320Var) {
            case j:
            case b:
                this.x = false;
                this.y = false;
                break;
            case a:
                this.x = true;
                this.y = false;
                break;
            default:
                this.x = true;
                this.y = true;
                break;
        }
    }

    @Override // rs.class_306
    public synchronized void b() {
        b((class_320) null);
        a((Dimension) null);
        a((Point) null);
        class_313.d().m().a(this);
        o();
    }

    public void o() {
    }

    @Nullable
    public Rectangle p() {
        return null;
    }

    public rs.ui.components.s q() {
        return this.e;
    }

    public Rectangle r() {
        return this.f;
    }

    public class_320 s() {
        return this.g;
    }

    public class_320 t() {
        return this.h;
    }

    public Point u() {
        return this.i;
    }

    public Dimension v() {
        return this.j;
    }

    public Point w() {
        return this.k;
    }

    public int x() {
        return this.r;
    }

    public boolean y() {
        return this.s;
    }

    public boolean z() {
        return this.t;
    }

    public float A() {
        return this.n;
    }

    public class_268 B() {
        return this.o;
    }

    public boolean C() {
        return this.p;
    }

    public Color D() {
        return this.q;
    }

    public boolean E() {
        return this.u;
    }

    public boolean F() {
        return this.v;
    }

    public boolean G() {
        return this.w;
    }

    public boolean H() {
        return this.x;
    }

    public boolean I() {
        return this.y;
    }

    public void a(Rectangle rectangle) {
        this.f = rectangle;
    }

    public void b(class_320 class_320Var) {
        this.h = class_320Var;
    }

    public void a(Point point) {
        this.i = point;
    }

    public void a(Dimension dimension) {
        this.j = dimension;
    }

    public void b(Point point) {
        this.k = point;
    }

    public void a(int i) {
        this.r = i;
    }

    public void b(boolean z) {
        this.s = z;
    }

    public void c(boolean z) {
        this.t = z;
    }

    public void a(float f) {
        this.n = f;
    }

    public void c(class_268 class_268Var) {
        this.o = class_268Var;
    }

    public void d(boolean z) {
        this.p = z;
    }

    public void a(Color color) {
        this.q = color;
    }

    public void e(boolean z) {
        this.u = z;
    }

    public void f(boolean z) {
        this.v = z;
    }

    public void g(boolean z) {
        this.w = z;
    }

    public void h(boolean z) {
        this.x = z;
    }

    public void i(boolean z) {
        this.y = z;
    }

    public boolean J() {
        return this.l;
    }

    protected void j(boolean z) {
        this.l = z;
    }

    public String K() {
        return this.m;
    }

    protected void a(String str) {
        this.m = str;
    }
}
