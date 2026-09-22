package rs.runelite.a;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/m.class */
public class m implements Shape {
    private static final int a = 16;
    protected int[] d;
    protected int[] e;
    protected int f;
    protected int g;

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/m$a.class */
    private class a implements PathIterator {
        private int b;

        private a() {
            this.b = -1;
        }

        public int getWindingRule() {
            return 0;
        }

        public boolean isDone() {
            return m.this.d() == 0 || this.b > m.this.g;
        }

        public void next() {
            if (this.b == -1) {
                this.b = m.this.f;
            } else {
                this.b++;
            }
        }

        public int currentSegment(float[] fArr) {
            if (this.b == -1) {
                fArr[0] = m.this.d[m.this.g];
                fArr[1] = m.this.e[m.this.g];
                return 0;
            }
            fArr[0] = m.this.d[this.b];
            fArr[1] = m.this.e[this.b];
            return 1;
        }

        public int currentSegment(double[] dArr) {
            if (this.b == -1) {
                dArr[0] = m.this.d[m.this.g];
                dArr[1] = m.this.e[m.this.g];
                return 0;
            }
            dArr[0] = m.this.d[this.b];
            dArr[1] = m.this.e[this.b];
            return 1;
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/m$b.class */
    private class b extends a {
        private final AffineTransform c;

        b(AffineTransform affineTransform) {
            super();
            this.c = affineTransform;
        }

        @Override // rs.runelite.a.m.a
        public int currentSegment(float[] fArr) {
            int iCurrentSegment = super.currentSegment(fArr);
            this.c.transform(fArr, 0, fArr, 0, 2);
            return iCurrentSegment;
        }

        @Override // rs.runelite.a.m.a
        public int currentSegment(double[] dArr) {
            int iCurrentSegment = super.currentSegment(dArr);
            this.c.transform(dArr, 0, dArr, 0, 2);
            return iCurrentSegment;
        }
    }

    public m() {
        this(new int[32], new int[32], 16, 15);
    }

    public m(int[] iArr, int[] iArr2, int i) {
        this(iArr, iArr2, 0, i - 1);
    }

    public void a(int i, int i2) {
        this.f--;
        if (this.f < 0) {
            a(16);
        }
        this.d[this.f] = i;
        this.e[this.f] = i2;
    }

    public void b() {
        this.f++;
    }

    protected void a(int i) {
        int[] iArr = new int[this.d.length + i];
        System.arraycopy(this.d, 0, iArr, i, this.d.length);
        this.d = iArr;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(this.e, 0, iArr2, i, this.e.length);
        this.e = iArr2;
        this.f += i;
        this.g += i;
    }

    public void b(int i, int i2) {
        this.g++;
        if (this.g >= this.d.length) {
            b(16);
        }
        this.d[this.g] = i;
        this.e[this.g] = i2;
    }

    public void c() {
        this.g--;
    }

    protected void b(int i) {
        int[] iArr = new int[this.d.length + i];
        System.arraycopy(this.d, 0, iArr, 0, this.d.length);
        this.d = iArr;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(this.e, 0, iArr2, 0, this.e.length);
        this.e = iArr2;
    }

    public int c(int i) {
        return this.d[this.f + i];
    }

    public int d(int i) {
        return this.e[this.f + i];
    }

    public int d() {
        return (this.g - this.f) + 1;
    }

    public List<i> e() {
        ArrayList arrayList = new ArrayList(d());
        for (int i = this.f; i <= this.g; i++) {
            arrayList.add(new i(this.d[i], this.e[i]));
        }
        return arrayList;
    }

    public void a(int[] iArr, int[] iArr2, int i) {
        System.arraycopy(this.d, this.f, iArr, i, d());
        System.arraycopy(this.e, this.f, iArr2, i, d());
    }

    public void a(m mVar) {
        int iD = d();
        if (iD <= 0) {
            return;
        }
        mVar.b(iD);
        a(mVar.d, mVar.e, mVar.g + 1);
        mVar.g += iD;
    }

    public void a() {
        int iD = d() / 2;
        for (int i = 0; i < iD; i++) {
            int i2 = this.f + i;
            int i3 = this.g - i;
            int i4 = this.d[i2];
            int i5 = this.e[i2];
            this.d[i2] = this.d[i3];
            this.e[i2] = this.e[i3];
            this.d[i3] = i4;
            this.e[i3] = i5;
        }
    }

    public void b(m mVar) {
        int[] iArr = new int[d()];
        int[] iArr2 = new int[iArr.length];
        int i = mVar.d[mVar.g];
        int i2 = mVar.e[mVar.g];
        for (int i3 = mVar.f; i3 <= mVar.g && d() >= 3; i3++) {
            int i4 = this.g;
            int i5 = this.f;
            int[] iArr3 = this.d;
            int[] iArr4 = this.e;
            this.d = iArr;
            this.e = iArr2;
            this.f = 0;
            this.g = -1;
            iArr = iArr3;
            iArr2 = iArr4;
            int i6 = mVar.d[i3];
            int i7 = mVar.e[i3];
            int i8 = iArr[i4];
            int i9 = iArr2[i4];
            for (int i10 = i5; i10 <= i4; i10++) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                int i13 = ((i6 - i) * (i9 - i2)) - ((i7 - i2) * (i8 - i));
                int i14 = ((i6 - i) * (i12 - i2)) - ((i7 - i2) * (i11 - i));
                if (i13 < 0 && i14 < 0) {
                    b(i11, i12);
                } else if ((i13 >= 0) != (i14 >= 0)) {
                    long j = (i * i7) - (i2 * i6);
                    long j2 = (i8 * i12) - (i9 * i11);
                    long j3 = ((i - i6) * (i9 - i12)) - ((i2 - i7) * (i8 - i11));
                    b((int) (((j * ((long) (i8 - i11))) - (((long) (i - i6)) * j2)) / j3), (int) (((j * ((long) (i9 - i12))) - (((long) (i2 - i7)) * j2)) / j3));
                    if (i13 >= 0) {
                        b(i11, i12);
                    }
                }
                i8 = i11;
                i9 = i12;
            }
            i = i6;
            i2 = i7;
        }
    }

    public Rectangle getBounds() {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = this.f; i5 <= this.g; i5++) {
            int i6 = this.d[i5];
            int i7 = this.e[i5];
            if (i6 < i) {
                i = i6;
            }
            if (i6 > i3) {
                i3 = i6;
            }
            if (i7 < i2) {
                i2 = i7;
            }
            if (i7 > i4) {
                i4 = i7;
            }
        }
        return new Rectangle(i, i2, i3 - i, i4 - i2);
    }

    public Rectangle2D getBounds2D() {
        Rectangle bounds = getBounds();
        return new Rectangle2D.Float(bounds.x, bounds.y, bounds.width, bounds.height);
    }

    public boolean contains(double d, double d2) {
        return d() >= 3 && (a(d, d2, false) & 1) != 0;
    }

    private int a(double d, double d2, boolean z) {
        int i = 0;
        int[] iArr = this.d;
        int[] iArr2 = this.e;
        if (z) {
            iArr2 = this.d;
            iArr = this.e;
        }
        int i2 = iArr[this.g];
        int i3 = iArr2[this.g];
        int i4 = this.f;
        while (i4 <= this.g) {
            int i5 = iArr[i4];
            int i6 = iArr2[i4];
            if (i3 != i6) {
                double d3 = i3;
                double d4 = i6;
                if ((d2 <= d3) != (d2 <= d4)) {
                    double d5 = i2;
                    double d6 = i5;
                    boolean z2 = d < d5;
                    if (z2 != (d < d6)) {
                        if ((((d6 - d5) * (d2 - d3)) - ((d - d5) * (d4 - d3)) > 0.0d) == (d3 > d4)) {
                            i++;
                        }
                    } else if (!z2) {
                        i++;
                    }
                }
            }
            i4++;
            i2 = i5;
            i3 = i6;
        }
        return i;
    }

    public boolean contains(Point2D point2D) {
        return contains(point2D.getX(), point2D.getY());
    }

    public boolean intersects(double d, double d2, double d3, double d4) {
        double d5 = d + d3;
        double d6 = d2 + d4;
        return (a(d, d2, false) == a(d5, d2, false) && a(d, d6, false) == a(d5, d6, false) && a(d, d2, true) == a(d, d6, true) && a(d5, d2, true) == a(d5, d6, true)) ? false : true;
    }

    public boolean intersects(Rectangle2D rectangle2D) {
        return intersects(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    public boolean contains(double d, double d2, double d3, double d4) {
        return getBounds().contains(d, d2, d3, d4) && !intersects(d, d2, d3, d4);
    }

    public boolean contains(Rectangle2D rectangle2D) {
        return contains(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight());
    }

    public PathIterator getPathIterator(AffineTransform affineTransform) {
        return affineTransform == null ? new a() : new b(affineTransform);
    }

    public PathIterator getPathIterator(AffineTransform affineTransform, double d) {
        return getPathIterator(affineTransform);
    }

    public m(int[] iArr, int[] iArr2, int i, int i2) {
        this.d = iArr;
        this.e = iArr2;
        this.f = i;
        this.g = i2;
    }

    public int[] f() {
        return this.d;
    }

    public int[] g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public void a(int[] iArr) {
        this.d = iArr;
    }

    public void b(int[] iArr) {
        this.e = iArr;
    }

    public void e(int i) {
        this.f = i;
    }

    public void f(int i) {
        this.g = i;
    }
}
