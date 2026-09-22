package rs;

import com.google.a.b.L;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.gui.w;
import rs.runelite.events.FocusChanged;
import rs.plugins.h;
import rs.ui.f;

/* JADX INFO: loaded from: client-final.jar:rs/class_317.class */
public class class_317 {
    private static final Logger g;
    private Rectangle h;
    private Rectangle i;
    private boolean k;
    class_311 a;
    class_311 b;
    private boolean m;
    private class_315 p;
    private class_315 q;
    private Rectangle r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    class_315 c;
    class_315 d;
    private final class_313 w;
    private final h x;
    private final class_160 y;
    private final f z;
    private final Client A;
    private final EventBus B;
    private final class_139 C;
    public static final String e = "Configure";
    private static final String D = "_preferredLocation";
    private static final String E = "_preferredPosition";
    private static final String F = "_preferredSize";
    private static final String G;
    private static final int H = 5;
    private static final int I = 20;
    private static final int J = 2;
    private static final int K = 5;
    private static final Dimension L;
    private static final Color M;
    private static final Color N;
    private static final Color O;
    private static final Color P;
    private static final Color Q;
    private static final Color R;
    static final /* synthetic */ boolean f;
    private boolean j = false;
    private int l = -1;
    private final Point n = new Point();
    private final Point o = new Point();

    public class_317(class_313 class_313Var, f fVar, Client client, h hVar, EventBus eventBus, class_160 class_160Var, class_139 class_139Var) {
        this.w = class_313Var;
        this.C = class_139Var;
        this.z = fVar;
        this.A = client;
        this.B = eventBus;
        this.x = hVar;
        this.y = class_160Var;
        Objects.requireNonNull(hVar);
        class_160Var.a(new class_318(this, hVar::x));
        eventBus.register(this);
    }

    public void a(class_268 class_268Var, List<class_315> list) {
        Point pointA;
        Color color;
        if (list.isEmpty()) {
            return;
        }
        Graphics2D graphics2DA = a(class_268Var);
        if (class_268Var == class_268.A && this.u && this.p != null && this.p.I()) {
            class_311 class_311VarA = this.b.a(-L.width, -L.height);
            Color color2 = graphics2DA.getColor();
            for (Rectangle rectangle : class_311VarA.a()) {
                graphics2DA.setColor(rectangle.contains(this.o) ? N : M);
                graphics2DA.fill(rectangle);
            }
            graphics2DA.setColor(color2);
        }
        AffineTransform transform = graphics2DA.getTransform();
        Stroke stroke = graphics2DA.getStroke();
        Composite composite = graphics2DA.getComposite();
        Paint paint = graphics2DA.getPaint();
        RenderingHints renderingHints = graphics2DA.getRenderingHints();
        Color background = graphics2DA.getBackground();
        Rectangle rectangleB = b(class_268Var);
        graphics2DA.setClip(rectangleB);
        for (class_315 class_315Var : list) {
            class_320 class_320VarC = c(class_315Var);
            Rectangle rectangleR = class_315Var.r();
            Dimension size = rectangleR.getSize();
            Point pointU = class_315Var.u();
            Rectangle rectangleA = null;
            if (class_320VarC == class_320.b || class_320VarC == class_320.j || class_320VarC == class_320.a || pointU != null) {
                Point location = pointU != null ? pointU : rectangleR.getLocation();
                pointA = a(location.x, location.y, size.width, size.height, class_315Var);
                a(class_315Var, true);
            } else {
                rectangleA = this.b.a(class_320VarC);
                Point pointA2 = class_321.a(class_320VarC, size);
                pointA = a(rectangleA.x + pointA2.x, rectangleA.y + pointA2.y, size.width, size.height, class_315Var);
                a(class_315Var, false);
            }
            if (class_315Var.w() != null) {
                pointA.translate(class_315Var.w().x, class_315Var.w().y);
            }
            if (class_315Var.v() != null) {
                rectangleR.setSize(class_315Var.v());
            }
            if (class_315Var.f() == null) {
                class_315Var.a(this.A);
            }
            a(class_315Var, graphics2DA, pointA);
            if (rectangleA != null && rectangleR.width + rectangleR.height > 0) {
                class_321.a(class_320VarC, rectangleA, rectangleR, 2);
            }
            graphics2DA.setTransform(transform);
            graphics2DA.setStroke(stroke);
            graphics2DA.setComposite(composite);
            graphics2DA.setPaint(paint);
            graphics2DA.setRenderingHints(renderingHints);
            graphics2DA.setBackground(background);
            if (!graphics2DA.getClip().equals(rectangleB)) {
                graphics2DA.setClip(rectangleB);
            }
            if (!rectangleR.isEmpty()) {
                if (this.s && class_315Var.H()) {
                    if (this.t && this.p == class_315Var) {
                        color = R;
                    } else if (this.u && this.p == class_315Var) {
                        color = P;
                    } else if (this.u && class_315Var.G() && this.p.G() && this.p.r().intersects(rectangleR)) {
                        color = Q;
                        if (!f && this.p == class_315Var) {
                            throw new AssertionError();
                        }
                        this.q = class_315Var;
                    } else {
                        color = O;
                    }
                    graphics2DA.setColor(color);
                    graphics2DA.draw(rectangleR);
                    graphics2DA.setPaint(paint);
                }
                if (!Client.dj && rectangleR.contains(this.o)) {
                    this.c = class_315Var;
                    if (class_315Var.l() && !this.s) {
                        class_315Var.m();
                    }
                }
            }
        }
    }

    public MouseEvent a(MouseEvent mouseEvent) {
        Point pointA = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(pointA);
        this.p = this.d;
        if (this.p == null) {
            return mouseEvent;
        }
        if (!this.s) {
            if ((this.p.l() || this.p.J()) && this.p.n()) {
                mouseEvent.consume();
            }
            return mouseEvent;
        }
        if (!this.p.H()) {
            return mouseEvent;
        }
        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
            if (this.p.y()) {
                this.p.b();
            }
        } else {
            if (!SwingUtilities.isLeftMouseButton(mouseEvent)) {
                return mouseEvent;
            }
            Point point = new Point(pointA.x, pointA.y);
            point.translate(-this.p.r().x, -this.p.r().y);
            this.n.setLocation(point);
            this.t = (this.p == null || !this.p.z() || this.z.i() == this.z.j()) ? false : true;
            this.u = !this.t;
            this.v = true;
            this.r = new Rectangle(this.p.r());
        }
        mouseEvent.consume();
        return mouseEvent;
    }

    public void b(MouseEvent mouseEvent) {
        Point pointA = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(pointA);
        if (this.s) {
            if (!this.t && !this.u) {
                this.p = this.d;
            }
            if (this.p == null || !this.p.z()) {
                this.z.a(this.z.j());
                return;
            }
            Rectangle rectangle = new Rectangle(this.p.r());
            rectangle.grow(-5, -5);
            switch (rectangle.outcode(pointA)) {
                case 1:
                    this.z.a(Cursor.getPredefinedCursor(10));
                    break;
                case 2:
                    this.z.a(Cursor.getPredefinedCursor(8));
                    break;
                case 3:
                    this.z.a(Cursor.getPredefinedCursor(6));
                    break;
                case 4:
                    this.z.a(Cursor.getPredefinedCursor(11));
                    break;
                case 5:
                case 7:
                case 10:
                case 11:
                default:
                    this.z.a(this.z.j());
                    break;
                case 6:
                    this.z.a(Cursor.getPredefinedCursor(7));
                    break;
                case 8:
                    this.z.a(Cursor.getPredefinedCursor(9));
                    break;
                case 9:
                    this.z.a(Cursor.getPredefinedCursor(4));
                    break;
                case 12:
                    this.z.a(Cursor.getPredefinedCursor(5));
                    break;
            }
        }
    }

    public void c(MouseEvent mouseEvent) {
        Point pointA = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(pointA);
        if (this.s && this.p != null) {
            if (this.q != null && !this.p.r().intersects(this.q.r())) {
                this.q = null;
            }
            if (new Rectangle(this.A.aC()).contains(pointA)) {
                if (this.t) {
                    int i = pointA.x - this.r.x;
                    int i2 = pointA.y - this.r.y;
                    int i3 = this.r.x;
                    int i4 = this.r.y;
                    int i5 = i3;
                    int i6 = i4;
                    int i7 = this.r.width;
                    int i8 = this.r.height;
                    switch (this.z.i().getType()) {
                        case 4:
                            i5 += i;
                            i7 -= i;
                            i8 = i2;
                            break;
                        case 5:
                            i7 = i;
                            i8 = i2;
                            break;
                        case 6:
                            i5 += i;
                            i6 += i2;
                            i7 -= i;
                            i8 -= i2;
                            break;
                        case 7:
                            i6 += i2;
                            i7 = i;
                            i8 -= i2;
                            break;
                        case 8:
                            i6 += i2;
                            i8 -= i2;
                            break;
                        case 9:
                            i8 = i2;
                            break;
                        case 10:
                            i5 += i;
                            i7 -= i;
                            break;
                        case 11:
                            i7 = i;
                            break;
                    }
                    int iX = this.p.x();
                    int iMax = Math.max(0, iX - i7);
                    int iMax2 = Math.max(0, iX - i8);
                    int i9 = i5 - i3;
                    int i10 = i6 - i4;
                    if (iMax > 0) {
                        i7 = iX;
                        if (i9 > 0) {
                            i5 -= iMax;
                        }
                    }
                    if (iMax2 > 0) {
                        i8 = iX;
                        if (i10 > 0) {
                            i6 -= iMax2;
                        }
                    }
                    this.r.setRect(i5, i6, i7, i8);
                    this.p.a(new Dimension(this.r.width, this.r.height));
                    if (this.p.u() != null) {
                        this.p.a(this.r.getLocation());
                    }
                } else {
                    if (!this.u) {
                        return;
                    }
                    Point point = new Point(pointA);
                    point.translate(-this.n.x, -this.n.y);
                    Rectangle rectangleR = this.p.r();
                    Point pointA2 = a(point.x, point.y, rectangleR.width, rectangleR.height, this.p);
                    this.p.b((class_320) null);
                    this.p.a(pointA2);
                }
                if (this.v) {
                    this.v = false;
                }
            }
        }
    }

    public void d(MouseEvent mouseEvent) {
        Point pointA = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(pointA);
        if (!this.s || this.p == null) {
            return;
        }
        if (this.u || this.t) {
            if (this.q != null && this.q.a(this.p)) {
                mouseEvent.consume();
                c();
                return;
            }
            if (this.p.I() && this.u) {
                class_311 class_311VarA = this.b.a(-L.width, -L.height);
                for (Rectangle rectangle : class_311VarA.a()) {
                    if (rectangle.contains(pointA)) {
                        class_320 class_320VarA = class_311VarA.a(rectangle);
                        if (class_320VarA == c(this.p)) {
                            class_320VarA = null;
                        }
                        this.p.b(class_320VarA);
                        this.p.a((Point) null);
                        this.p.o();
                        if (this.p.B() == null || this.p.i() != this.p.B()) {
                            break;
                            break;
                        }
                        this.p.b(this.p.j());
                        this.w.a.get(this.p.B()).remove(this.p);
                        this.w.a.get(this.p.j()).add(this.p);
                        break;
                    }
                }
            }
            a(this.p);
            c();
            mouseEvent.consume();
        }
    }

    @Subscribe
    public void onFocusChanged(FocusChanged focusChanged) {
        if (focusChanged.isFocused()) {
            return;
        }
        if (this.s) {
            this.s = false;
            c();
        }
        this.c = null;
    }

    private void a(class_315 class_315Var, Graphics2D graphics2D, Point point) {
        class_320 class_320VarS = class_315Var.s();
        if (class_320VarS == class_320.b || class_320VarS == class_320.a || class_320VarS == class_320.j) {
            graphics2D.setFont(w.b());
        } else {
            graphics2D.setFont(w.b());
        }
        if (point.x > Client.ai - class_315Var.r().getSize().width || point.y > Client.ah - class_315Var.r().getSize().height || point.x < 0 || point.y < 0) {
            point = new Point(Math.max(0, Math.min(Client.ai - class_315Var.r().getSize().width, point.x)), Math.max(0, Math.min(Client.ah - class_315Var.r().getSize().height, point.y)));
        }
        if (Configuration.ai == class_151.a && !class_315Var.i().B && !class_315Var.C() && class_315Var.B() == null) {
            int i = point.x;
            int i2 = point.y;
            if (point.x + class_315Var.r().width >= Client.aj) {
                i = Client.aj - class_315Var.r().getSize().width;
            }
            if (point.y + class_315Var.r().getSize().height >= Client.ak) {
                i2 = Client.ak - class_315Var.r().getSize().height;
            }
            if (i != point.x || i2 != point.y) {
                point = new Point(i, i2);
            }
        }
        graphics2D.translate(point.x, point.y);
        class_315Var.r().setLocation(point);
        try {
            class_315Var.r().setSize((Dimension) L.a(class_315Var.a(graphics2D), new Dimension()));
        } catch (Exception e2) {
        }
    }

    private Rectangle b(class_268 class_268Var) {
        return (this.k || class_268Var.B) ? new Rectangle(0, 0, this.A.at(), this.A.au()) : new Rectangle(this.A.ae(), this.A.af(), this.A.ar(), this.A.aq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.t = false;
        this.u = false;
        this.p = null;
        this.q = null;
        this.r = null;
        Launcher.n().p().a(Launcher.n().p().j());
    }

    private class_320 c(class_315 class_315Var) {
        class_320 class_320VarS = class_315Var.s();
        if (class_315Var.t() != null) {
            class_320VarS = class_315Var.t();
        }
        if (!this.k) {
            switch (class_319.a[class_320VarS.ordinal()]) {
                case 1:
                    class_320VarS = class_320.e;
                    break;
                case 2:
                    class_320VarS = class_320.g;
                    break;
            }
        }
        return class_320VarS;
    }

    boolean a() {
        boolean z = this.k != Client.ag();
        boolean z2 = false;
        if (this.l != -1) {
            this.l = -1;
            z2 = true;
        }
        if (z) {
            this.k = Client.ag();
            z2 = true;
        }
        if (this.i == null || z2) {
            this.i = new Rectangle(0, !Client.ag() ? 338 : Client.ah - 165, 519, 165);
            z2 = true;
        }
        Rectangle rectangle = new Rectangle(this.A.ar(), this.A.aq());
        if (!rectangle.equals(this.h)) {
            this.h = rectangle;
            z2 = true;
        }
        return z2;
    }

    class_311 b() {
        Point point = new Point(this.h.x + 5, this.h.y + 20);
        Point point2 = new Point(this.h.x + (this.h.width / 2), this.h.y + 5);
        Point point3 = new Point((this.h.x + this.h.width) - 5, point2.y);
        Point point4 = new Point(point.x, (this.h.y + this.h.height) - 5);
        Point point5 = new Point(point3.x, point4.y);
        if (this.k) {
            if (!this.j) {
                point4.y -= this.i.height;
            }
            point3.x -= 241;
            point5.x -= 241;
            point5.y -= 100;
        }
        if (!this.k) {
        }
        Point point6 = this.k ? new Point((this.h.x + this.i.width) - 5, point4.y) : point5;
        Point point7 = this.k ? new Point((int) this.A.aC().getWidth(), 0) : point3;
        if (!this.k) {
            point.x += 4;
            point.y += 4;
            point2.x += 4;
            point2.y += 4;
            point3.x += 4;
            point4.x += 0;
            point4.y += 8;
            point5.x += 4;
            point5.y += 4;
            point6.x += 4;
            point6.y += 4;
            point7.x += 4;
            point7.y += 4;
        }
        return new class_311(new Rectangle(point, L), new Rectangle(point2, L), new Rectangle(point3, L), new Rectangle(point4, L), new Rectangle(point5, L), new Rectangle(point6, L), new Rectangle(point7, L));
    }

    private Point a(int i, int i2, int i3, int i4, class_315 class_315Var) {
        Rectangle rectangleP = class_315Var.p();
        if (rectangleP == null || rectangleP.isEmpty()) {
            Dimension dimensionAC = Launcher.n().o().aC();
            rectangleP = new Rectangle(0, 0, dimensionAC.width, dimensionAC.height);
        }
        return new Point(com.google.a.m.l.a(i, rectangleP.x, Math.max(rectangleP.x, (rectangleP.x + rectangleP.width) - i3)), com.google.a.m.l.a(i2, rectangleP.y, Math.max(rectangleP.y, (rectangleP.y + rectangleP.height) - i4)));
    }

    public synchronized void a(class_315 class_315Var) {
        f(class_315Var);
        e(class_315Var);
        d(class_315Var);
    }

    void b(class_315 class_315Var) {
        Point pointG = g(class_315Var);
        Dimension dimensionH = h(class_315Var);
        class_320 class_320VarI = i(class_315Var);
        if (class_315Var.H()) {
            class_315Var.a(pointG);
        } else if (pointG != null) {
            class_315Var.a((Point) null);
            d(class_315Var);
        }
        class_315Var.a(dimensionH);
        if (class_315Var.I()) {
            class_315Var.b(class_320VarI);
        } else if (class_320VarI != null) {
            class_315Var.b((class_320) null);
            f(class_315Var);
        }
    }

    private void a(class_306 class_306Var) {
        if (class_306Var instanceof class_315) {
            ((class_315) class_306Var).a(this.x.s());
        }
    }

    private void d(class_315 class_315Var) {
        String str = class_315Var.K() + "_preferredLocation";
        if (class_315Var.u() != null) {
            this.C.a(G, str, class_315Var.u());
        } else {
            this.C.b(G, str);
        }
    }

    private void e(class_315 class_315Var) {
        String str = class_315Var.K() + "_preferredSize";
        if (class_315Var.v() != null) {
            this.C.a(G, str, class_315Var.v());
        } else {
            this.C.b(G, str);
        }
    }

    private void f(class_315 class_315Var) {
        String str = class_315Var.K() + "_preferredPosition";
        if (class_315Var.t() != null) {
            this.C.a(G, str, class_315Var.t());
        } else {
            this.C.b(G, str);
        }
    }

    private Point g(class_315 class_315Var) {
        return (Point) this.C.a(G, class_315Var.K() + "_preferredLocation", (Type) Point.class);
    }

    private Dimension h(class_315 class_315Var) {
        return (Dimension) this.C.a(G, class_315Var.K() + "_preferredSize", (Type) Dimension.class);
    }

    private class_320 i(class_315 class_315Var) {
        return (class_320) this.C.a(G, class_315Var.K() + "_preferredPosition", (Type) class_320.class);
    }

    private void a(class_315 class_315Var, boolean z) {
        if (class_315Var.B() == null) {
            return;
        }
        ClientThread.queue(() -> {
            if (this.w.a.get(class_315Var.i()).contains(class_315Var)) {
                if (!z && class_315Var.i() == class_315Var.B()) {
                    this.w.b(class_315Var);
                    class_315Var.b(class_315Var.j());
                    this.w.a(class_315Var);
                }
                if (z && class_315Var.i() == class_315Var.j()) {
                    this.w.b(class_315Var);
                    class_315Var.b(class_315Var.B());
                    this.w.a(class_315Var);
                }
            }
        });
    }

    public Graphics2D a(class_268 class_268Var) {
        return this.w.b(class_268Var);
    }

    static {
        f = !class_317.class.desiredAssertionStatus();
        g = LoggerFactory.getLogger((Class<?>) class_317.class);
        G = ((class_135) h.class.getAnnotation(class_135.class)).a();
        L = new Dimension(80, 80);
        M = new Color(0, 255, 255, 50);
        N = new Color(0, 255, 0, 100);
        O = new Color(255, 255, 0, 100);
        P = new Color(255, 255, 0, 200);
        Q = Color.RED;
        R = new Color(255, 0, 255, 200);
    }
}
