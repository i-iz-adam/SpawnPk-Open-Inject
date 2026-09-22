package rs;

import java.awt.Dimension;
import java.awt.Graphics2D;

/* JADX INFO: loaded from: client-final.jar:rs/class_274.class */
public class class_274 extends class_315 {
    private static final Dimension r = new Dimension(40, 40);
    private static final int s = 4;
    private static final int t = 200;
    private static final int u = 100;
    private final String w;
    private final String x;
    private final String y;
    private final int z;
    private final int A;
    private class_333 B;
    private class_333 C;
    private class_276 F;
    private class_275 G;
    private boolean v = true;
    private boolean D = true;
    private int E = 200;

    public class_274(String str, String str2, String str3, int i, int i2) {
        this.y = str;
        this.w = str2;
        this.x = str3;
        this.z = i;
        this.A = i2;
        a(class_268.q);
        a(class_320.e);
        a(r);
        c(false);
        h(false);
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        if (Client.ed == 197) {
            return null;
        }
        if (this.B == null || this.C == null) {
            this.B = new class_333(this.w);
            this.C = new class_333(this.x);
        }
        int i = this.f.x;
        int i2 = this.f.y;
        boolean z = this.f.contains(Client.hP, Client.hQ) && l();
        if (!class_194.a()) {
            if (this.D) {
                this.E -= 4;
                if (this.E <= 100) {
                    this.D = false;
                }
            } else {
                this.E += 4;
                if (this.E >= 200) {
                    this.D = true;
                }
            }
        }
        class_210.b(r.height, i2, i, this.z, r.width, this.E - 25);
        class_210.b(r.height - 6, i2 + 3, i + 3, this.A, r.width - 6, this.E - 100);
        (z ? this.C : this.B).g(i + 2, i2 + 1, this.E + 50);
        if (this.v) {
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = this.E - 50;
                class_192.a.a(i - 4, (i2 - 1) + (i3 * 30), i4);
                class_192.a.a(i + 31, (i2 - 1) + (i3 * 30), i4);
            }
        }
        if (z) {
            this.a.b((Client.hP - r.width) - 20, (Client.hQ + r.height) - 30, " " + this.y);
        }
        if (this.F != null) {
            this.F.draw(i, i2, this.E, z);
        }
        return r;
    }

    @Override // rs.class_315
    public boolean n() {
        if (this.G == null) {
            return true;
        }
        ClientThread.queue(() -> {
            this.G.execute();
        });
        return true;
    }

    public class_274 a(class_276 class_276Var) {
        this.F = class_276Var;
        return this;
    }

    public class_274 a(class_275 class_275Var) {
        this.G = class_275Var;
        return this;
    }

    public boolean L() {
        return this.v;
    }

    public void k(boolean z) {
        this.v = z;
    }
}
