package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_69.class */
public final class class_69 extends class_48 {
    private int j;
    private final int[] k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private class_99 r;
    private int s;
    public static Client h;
    public final int i;
    private final int t;
    private final int u;

    @Override // rs.class_48
    public ColorUtility c() {
        int i = -1;
        if (this.r != null) {
            int iA = Client.ff - this.s;
            if (iA > 100 && this.r.h > 0) {
                iA = 100;
            }
            if (this.r.b()) {
                int iC = this.r.c();
                this.j += iA;
                if (this.j >= iC) {
                    this.j = iC - this.r.h;
                    if (this.j < 0 || this.j > iC) {
                        this.r = null;
                    }
                }
                this.s = Client.ff - 0;
                i = this.j;
            } else {
                while (iA > this.r.a(this.j)) {
                    iA -= this.r.a(this.j);
                    this.j++;
                    if (this.j >= this.r.d) {
                        this.j -= this.r.h;
                        if (this.j < 0 || this.j >= this.r.d) {
                            this.r = null;
                            break;
                        }
                    }
                }
                this.s = Client.ff - iA;
                if (this.r != null) {
                    i = this.r.e[this.j];
                }
            }
        }
        ObjectComposition objectCompositionD = this.k != null ? d() : ObjectComposition.c(this.i);
        if (objectCompositionD == null) {
            return null;
        }
        return objectCompositionD.a(this.t, this.u, this.n, this.o, this.p, this.q, i, this.r != null ? this.r.r : -1);
    }

    private ObjectComposition d() {
        int i = -1;
        if (this.l != -1) {
            try {
                class_128 class_128Var = class_128.a[this.l];
                int i2 = class_128Var.b;
                int i3 = class_128Var.c;
                i = (h.dP[i2] >> i3) & Client.fQ[class_128Var.d - i3];
            } catch (Exception e) {
            }
        } else if (this.m != -1 && this.m < h.dP.length) {
            i = h.dP[this.m];
        }
        int i4 = (i < 0 || i >= this.k.length) ? this.k[this.k.length - 1] : this.k[i];
        if (i == -1 || i4 == -1) {
            return null;
        }
        return ObjectComposition.c(this.k[i]);
    }

    public class_69(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this(i, i2, i3, i4, i5, i6, i7, i8, z, null);
    }

    public class_69(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, class_48 class_48Var) {
        this.i = i;
        this.t = i3;
        this.u = i2;
        this.n = i6;
        this.o = i4;
        this.p = i5;
        this.q = i7;
        ObjectComposition objectCompositionC = ObjectComposition.c(this.i);
        this.l = objectCompositionC.ao;
        this.m = objectCompositionC.Y;
        this.k = objectCompositionC.ad;
        if (i8 != -1) {
            this.r = class_99.a[i8];
            this.j = 0;
            this.s = Client.ff;
            if (this.r.q == 0 && class_48Var != null && (class_48Var instanceof class_69)) {
                class_69 class_69Var = (class_69) class_48Var;
                if (class_69Var.r == this.r) {
                    this.j = class_69Var.j;
                    this.s = class_69Var.s;
                    return;
                }
            }
            if (!z || this.r.h == -1) {
                return;
            }
            if (this.r.b()) {
                this.j = (int) (Math.random() * ((double) this.r.c()));
            } else {
                this.j = (int) (Math.random() * ((double) this.r.d));
                this.s -= (int) (Math.random() * ((double) this.r.a(this.j)));
            }
        }
    }
}
