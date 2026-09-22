package rs.runelite.a;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/l.class */
public class l<T extends Shape> implements Shape {
    private final List<T> a;

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/l$a.class */
    private static class a implements PathIterator {
        private final Iterator<PathIterator> b;
        private PathIterator c;
        private final int d;
        static final /* synthetic */ boolean a;

        a(Iterator<PathIterator> it) {
            this.c = null;
            this.b = it;
            if (!it.hasNext()) {
                this.d = 0;
                return;
            }
            this.c = it.next();
            this.d = this.c.getWindingRule();
            a();
        }

        public int getWindingRule() {
            return this.d;
        }

        public boolean isDone() {
            return this.c == null;
        }

        public void next() {
            this.c.next();
            a();
        }

        private void a() {
            while (this.c != null && this.c.isDone()) {
                if (this.b.hasNext()) {
                    this.c = this.b.next();
                    if (!a && this.d != this.c.getWindingRule()) {
                        throw new AssertionError();
                    }
                } else {
                    this.c = null;
                }
            }
        }

        public int currentSegment(float[] fArr) {
            return this.c.currentSegment(fArr);
        }

        public int currentSegment(double[] dArr) {
            return this.c.currentSegment(dArr);
        }

        static {
            a = !l.class.desiredAssertionStatus();
        }
    }

    public l(T... tArr) {
        this(Arrays.asList(tArr));
    }

    public Rectangle getBounds() {
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            Rectangle bounds = it.next().getBounds();
            iMin = Math.min(bounds.x, iMin);
            iMin2 = Math.min(bounds.y, iMin2);
            iMax = Math.max(bounds.x + bounds.width, iMax);
            iMax2 = Math.max(bounds.y + bounds.height, iMax2);
        }
        return new Rectangle(iMin, iMin2, iMax - iMin, iMax2 - iMin2);
    }

    public Rectangle2D getBounds2D() {
        double dMin = Double.MAX_VALUE;
        double dMin2 = Double.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMax2 = Double.MIN_VALUE;
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            Rectangle2D bounds2D = it.next().getBounds2D();
            dMin = Math.min(bounds2D.getX(), dMin);
            dMin2 = Math.min(bounds2D.getY(), dMin2);
            dMax = Math.max(bounds2D.getMaxX(), dMax);
            dMax2 = Math.max(bounds2D.getMaxY(), dMax2);
        }
        return new Rectangle2D.Double(dMin, dMin2, dMax - dMin, dMax2 - dMin2);
    }

    public boolean contains(double d, double d2) {
        return this.a.stream().anyMatch(shape -> {
            return shape.contains(d, d2);
        });
    }

    public boolean contains(Point2D point2D) {
        return this.a.stream().anyMatch(shape -> {
            return shape.contains(point2D);
        });
    }

    public boolean intersects(double d, double d2, double d3, double d4) {
        return this.a.stream().anyMatch(shape -> {
            return shape.intersects(d, d2, d3, d4);
        });
    }

    public boolean intersects(Rectangle2D rectangle2D) {
        return this.a.stream().anyMatch(shape -> {
            return shape.intersects(rectangle2D);
        });
    }

    public boolean contains(double d, double d2, double d3, double d4) {
        return this.a.stream().anyMatch(shape -> {
            return shape.contains(d, d2, d3, d4);
        });
    }

    public boolean contains(Rectangle2D rectangle2D) {
        return this.a.stream().anyMatch(shape -> {
            return shape.contains(rectangle2D);
        });
    }

    public PathIterator getPathIterator(AffineTransform affineTransform) {
        return new a(this.a.stream().map(shape -> {
            return shape.getPathIterator(affineTransform);
        }).iterator());
    }

    public PathIterator getPathIterator(AffineTransform affineTransform, double d) {
        return new a(this.a.stream().map(shape -> {
            return shape.getPathIterator(affineTransform, d);
        }).iterator());
    }

    public l(List<T> list) {
        this.a = list;
    }

    public List<T> a() {
        return this.a;
    }
}
