package rs;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

/* JADX INFO: loaded from: client-final.jar:rs/class_280.class */
public class class_280 extends class_315 {
    private static final int x = 1;
    private static final Dimension y = new Dimension();
    private static final Dimension z = new Dimension(142, 33);
    private static final Dimension A = new Dimension(142, 21);
    public String r;
    public int s;
    public int t;
    public int u;
    public int v;
    public long w;

    public class_280() {
        a("CombatOverlay");
        a(class_268.p);
        c(class_268.A);
        a(class_320.c);
        a(10.0f);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
    }

    @Override // rs.class_315
    public Dimension a(Graphics2D graphics2D) {
        Npc npc;
        if (this.r == null || this.s <= 0) {
            return y;
        }
        if (!class_228.f() && System.currentTimeMillis() - this.w < 20000 && Configuration.aB && !class_253.e.E) {
            int i = this.f.x + 1;
            int i2 = this.f.y;
            int i3 = 0;
            if (Configuration.ar) {
                a(A);
            } else {
                a(z);
            }
            if (Client.eR.m != -1) {
                this.v = Client.eR.m;
            }
            if (this.v != -1 && this.v < 32768 && (npc = this.a.cA[this.v]) != null && npc.aG.o.equalsIgnoreCase(this.r)) {
                i3 = npc.M;
                if (npc.N * 2 == this.s) {
                    i3 *= 2;
                }
            }
            if (this.v >= 32768) {
                int i4 = this.v - 32768;
                Client client = this.a;
                Player player = Client.doField[i4];
                if (player != null && player.aZ.equalsIgnoreCase(this.r)) {
                    i3 = player.M;
                }
            }
            if (i3 > 0 && i3 != this.t) {
                this.u = c((int) ((140 - 4) * (this.t / this.s)), 140);
                this.t = i3;
            }
            if (this.t == 0 && System.currentTimeMillis() - this.w < 17000) {
                this.w = System.currentTimeMillis() - 17000;
            }
            int i5 = (int) ((140 - 4) * (this.t / this.s));
            if (!Configuration.at) {
                this.u = i5;
            } else if (!class_194.a() && this.u > i5) {
                this.u -= 2;
            }
            if (Configuration.ar) {
                int i6 = 32 - 12;
                class_210.b(i6, i2, i, 4077096, 140, 125);
                class_210.d(i, 140, i6, class_228.t, i2);
                class_210.d(i - 1, 140 + 2, i6 + 2, class_228.u, i2 - 1);
                int i7 = i2 - 13;
                class_210.b(15, i7 + 15, i + 2, 13960709, 140 - 4, 150);
                class_210.b(15, i7 + 15, i + 2, 11297536, c(this.u, 140), 255);
                class_210.b(15, i7 + 15, i + 2, 39186, c(i5, 140), 255);
                int i8 = this.t;
                int i9 = this.s;
                if (Configuration.ak) {
                    i8 *= 10;
                    i9 *= 10;
                }
                String str = this.r;
                int i10 = 12;
                if (i9 >= 1000) {
                    i10 = 10;
                }
                if (i9 >= 10000) {
                    i10 = 8;
                }
                Client.gl.c((str.length() > i10 ? str.substring(0, i10).trim() + ".." : str + ":") + " @yel@" + i8 + " / " + i9, i + (140 / 2), i7 + 27, class_492.c, 0);
            } else {
                class_210.b(32, i2, i, 4077096, 140, 125);
                class_210.d(i, 140, 32, class_228.t, i2);
                class_210.d(i - 1, 140 + 2, 32 + 2, class_228.u, i2 - 1);
                Client client2 = this.a;
                Client.gl.c(this.r, i + (140 / 2), i2 + 12, class_492.c, 0);
                class_210.b(15, i2 + 15, i + 2, 13960709, 140 - 4, 150);
                class_210.b(15, i2 + 15, i + 2, 11297536, c(this.u, 140), 255);
                class_210.b(15, i2 + 15, i + 2, 39186, c(i5, 140), 255);
                int i11 = this.t;
                int i12 = this.s;
                if (Configuration.ak) {
                    i11 *= 10;
                    i12 *= 10;
                }
                Client.gl.c(i11 + " / " + i12, i + (140 / 2), i2 + 27, class_492.c, 0);
            }
            return this.j;
        }
        return y;
    }

    public int c(int i, int i2) {
        int i3 = i;
        if (this.t > 0 && i3 <= 0) {
            i3 = 1;
        }
        if (i3 > i2 - 4) {
            i3 = i2 - 4;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return i3;
    }
}
