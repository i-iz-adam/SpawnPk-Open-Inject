package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_68.class */
public final class class_68 extends class_48 {
    public final int h;
    public final int i;
    private double q;
    private double r;
    private double s;
    private double t;
    private double u;
    private boolean v;
    private final int w;
    private final int x;
    private final int y;
    public final int j;
    public double k;
    public double l;
    public double m;
    private final int z;
    private final int A;
    public final int n;
    private final class_127 B;
    private int C;
    private int D;
    public int o;
    private int E;
    public final int p;

    public void a(int i, int i2, int i3, int i4) {
        if (!this.v) {
            double d = i4 - this.w;
            double d2 = i2 - this.x;
            double dSqrt = Math.sqrt((d * d) + (d2 * d2));
            this.k = ((double) this.w) + ((d * ((double) this.A)) / dSqrt);
            this.l = ((double) this.x) + ((d2 * ((double) this.A)) / dSqrt);
            this.m = this.y;
        }
        double d3 = (this.i + 1) - i;
        this.q = (((double) i4) - this.k) / d3;
        this.r = (((double) i2) - this.l) / d3;
        this.s = Math.sqrt((this.q * this.q) + (this.r * this.r));
        if (!this.v) {
            this.t = (-this.s) * Math.tan(((double) this.z) * 0.02454369d);
        }
        this.u = (2.0d * ((((double) i3) - this.m) - (this.t * d3))) / (d3 * d3);
    }

    @Override // rs.class_48
    public ColorUtility c() {
        ColorUtility colorUtility;
        ColorUtility colorUtilityA = this.B.a();
        if (colorUtilityA == null) {
            return null;
        }
        int i = -1;
        if (this.B.g != null) {
            i = (this.B.g.e == null || this.B.g.e.length <= 0) ? this.D : this.B.g.e[this.C];
        }
        boolean z = false;
        class_49 class_49Var = ColorUtility.h;
        if (i != -1) {
            if (this.B.g.b()) {
                colorUtility = this.B.g.a(colorUtilityA, i);
            } else {
                class_49Var = (class_49) class_127.q.a(this.B.d);
                if (class_49Var == null) {
                    class_49Var = new class_49(true);
                    z = true;
                    class_49Var.e();
                }
                colorUtility = new ColorUtility(true, class_176.g(i), false, colorUtilityA);
                colorUtility.i = class_49Var;
                colorUtility.n();
                colorUtility.f(i, this.B.g.r);
            }
            colorUtility.aM = null;
            colorUtility.aL = null;
        } else {
            colorUtility = new ColorUtility(true, class_176.g(i), false, colorUtilityA, class_49Var);
            colorUtility.i = class_49Var;
        }
        if (colorUtility != null) {
            if (this.B.j != 128 || this.B.k != 128) {
                colorUtility.b(this.B.j, this.B.j, this.B.k);
            }
            colorUtility.j(this.E);
            colorUtility.b(64 + this.B.m, 850 + this.B.n, -30, -50, -30, true);
            colorUtility.i = ColorUtility.h;
            if (z) {
                class_127.q.a(class_49Var, this.B.d);
            }
        }
        return colorUtility;
    }

    public class_68(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.v = false;
        this.B = class_127.c[i11];
        this.p = i6;
        this.w = i9;
        this.x = i8;
        this.y = i7;
        this.h = i3;
        this.i = i4;
        this.z = i;
        this.A = i5;
        this.n = i10;
        this.j = i2;
        this.v = false;
    }

    public void a(int i) {
        this.v = true;
        this.k += this.q * ((double) i);
        this.l += this.r * ((double) i);
        this.m += (this.t * ((double) i)) + (0.5d * this.u * ((double) i) * ((double) i));
        this.t += this.u * ((double) i);
        this.o = (((int) (Math.atan2(this.q, this.r) * 325.949d)) + 1024) & Client.dn;
        this.E = ((int) (Math.atan2(this.t, this.s) * 325.949d)) & Client.dn;
        if (this.B.g != null) {
            if (this.B.g.b()) {
                this.D += i;
                int iC = this.B.g.c();
                if (this.D >= iC) {
                    this.D = iC - this.B.g.h;
                    return;
                }
                return;
            }
            this.D += i;
            while (this.D > this.B.g.a(this.C)) {
                this.D -= this.B.g.a(this.C) + 1;
                this.C++;
                if (this.C >= this.B.g.d) {
                    this.C = 0;
                }
            }
        }
    }
}
