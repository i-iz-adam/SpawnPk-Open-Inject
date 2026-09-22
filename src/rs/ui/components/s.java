package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/s.class */
public class s implements q {
    private final Rectangle a = new Rectangle();
    private Point b = new Point();
    private Dimension c = new Dimension(129, 0);
    private Color d = d.c;
    private final List<q> e = new ArrayList();
    private e f = e.b;
    private boolean g = false;
    private Rectangle h = new Rectangle(4, 4, 4, 4);
    private Point i = new Point(0, 0);
    private final Dimension j = new Dimension();

    @Override // rs.ui.components.w
    public Dimension a(Graphics2D graphics2D) {
        if (this.e.isEmpty()) {
            return null;
        }
        Dimension dimension = new Dimension(this.h.x + this.j.width + this.h.width, this.h.y + this.j.height + this.h.height);
        if (this.d != null) {
            a aVar = new a();
            aVar.a(new Rectangle(this.b, dimension));
            aVar.a(this.d);
            aVar.a(graphics2D);
        }
        int i = this.b.x + this.h.x;
        int i2 = this.b.y + this.h.y;
        int iMax = 0;
        int iMax2 = 0;
        int i3 = i;
        int i4 = i2;
        Dimension dimension2 = new Dimension((this.c.width - this.h.x) - this.h.width, (this.c.height - this.h.y) - this.h.height);
        int iMax3 = 0;
        int iMax4 = 0;
        for (q qVar : this.e) {
            if (!this.g) {
                switch (this.f) {
                    case b:
                        qVar.a(new Dimension(dimension2.width, 0));
                        break;
                    case a:
                        qVar.a(new Dimension(0, dimension2.height));
                        break;
                }
            }
            qVar.a(new Point(i3, i4));
            Dimension dimensionA = qVar.a(graphics2D);
            switch (this.f) {
                case b:
                    iMax2 += dimensionA.height + this.i.y;
                    i4 = i2 + iMax2;
                    iMax = Math.max(iMax, dimensionA.width);
                    break;
                case a:
                    iMax += dimensionA.width + this.i.x;
                    i3 = i + iMax;
                    iMax2 = Math.max(iMax2, dimensionA.height);
                    break;
            }
            iMax4 = Math.max(iMax4, iMax);
            iMax3 = Math.max(iMax3, iMax2);
            if (this.g) {
                switch (this.f) {
                    case b:
                        if (dimension2.height > 0 && iMax2 >= dimension2.height) {
                            iMax2 = 0;
                            i4 = i2;
                            int i5 = dimensionA.width + this.i.x;
                            i3 += i5;
                            iMax += i5;
                        }
                        break;
                    case a:
                        if (dimension2.width > 0 && iMax >= dimension2.width) {
                            iMax = 0;
                            i3 = i;
                            int i6 = dimensionA.height + this.i.y;
                            i4 += i6;
                            iMax2 += i6;
                        }
                        break;
                }
            }
        }
        if (this.f == e.a) {
            iMax4 -= this.i.x;
        } else {
            iMax3 -= this.i.y;
        }
        this.j.setSize(iMax4, iMax3);
        this.a.setLocation(this.b);
        this.a.setSize(dimension);
        return dimension;
    }

    @Override // rs.ui.components.q
    public Rectangle a() {
        return this.a;
    }

    @Override // rs.ui.components.q
    public void a(Point point) {
        this.b = point;
    }

    @Override // rs.ui.components.q
    public void a(Dimension dimension) {
        this.c = dimension;
    }

    public Dimension b() {
        return this.c;
    }

    public void a(Color color) {
        this.d = color;
    }

    public Color c() {
        return this.d;
    }

    public List<q> d() {
        return this.e;
    }

    public void a(e eVar) {
        this.f = eVar;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(Rectangle rectangle) {
        this.h = rectangle;
    }

    public void b(Point point) {
        this.i = point;
    }
}
