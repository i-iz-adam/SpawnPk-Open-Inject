package rs;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.plugins.apkg.a;
import rs.plugins.apkg.c;

/* JADX INFO: loaded from: client-final.jar:rs/class_277.class */
public class class_277 extends class_315 {
    private static final Dimension y = new Dimension(220, 40);
    private static final Dimension z = new Dimension(220, 22);
    private static final Dimension A = new Dimension();
    private static final int B = 13960709;
    private static final int C = 30976;
    private final a D;
    int r = 0;
    int s = 13960709;
    int t = 30976;
    String u;
    String v;
    String w;
    String x;
    private boolean E;
    private boolean F;

    public class_277(a aVar) {
        a("BossBarOverlay");
        a(class_268.A);
        a(class_320.d);
        a(10.0f);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
        this.D = aVar;
    }

    public void L() {
        this.s = 13960709;
        this.t = 30976;
        this.r = 0;
        this.v = "100%";
        this.u = "100%";
        this.x = "";
        this.w = "";
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        if (Client.cH == -1 && this.E) {
            int i = 40;
            int i2 = this.f.x;
            int i3 = this.f.y;
            double d = ((double) this.r) / 100.0d;
            if (this.D.e() == c.b) {
                i = 40 - 18;
                a(z);
                this.j = z;
            } else {
                a(y);
                this.j = y;
            }
            class_210.b(i, i3, i2, 5129018, 220, 255);
            class_210.d(i2, 220, i, class_228.t, i3);
            class_210.d(i2 - 1, 220 + 2, i + 2, class_228.u, i3 - 1);
            if (this.D.e() == c.a) {
                Client.gl.c(this.w, i2 + ((220 + 4) / 2), i3 + 14, class_492.e, 0);
                Client.gl.a(this.x, (i2 + 220) - 3, i3 + 14, 3135999, 0);
            }
            if (this.D.e() == c.b) {
                i3 -= 17;
            }
            int i4 = i3 + 18;
            int i5 = i2 + 2;
            int i6 = 220 - 6;
            int iCeil = (int) Math.ceil(((double) i6) * d);
            class_210.b(20, i4, i5, 0, i6 + 2, 255);
            class_210.b(20 - 2, i4 + 1, i5 + 1, this.t, i6, 255);
            class_210.b(20 - 2, i4 + 1, i5 + 1, this.s, iCeil, 255);
            Client.gl.c(this.D.e() == c.b ? this.v : this.u, i5 + ((i6 + 6) / 2), i4 + 15, class_492.c, 0);
            if (this.D.e() == c.b) {
                Client.gl.a(this.x, (i5 + i6) - 3, i4 + 15, 3135999, 0);
            }
            return this.j;
        }
        return A;
    }

    @Override // rs.class_306
    public void c() {
        this.E = false;
        this.F = true;
    }

    public void k(boolean z2) {
        this.E = z2;
    }

    public boolean M() {
        return this.F;
    }
}
