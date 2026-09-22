package rs.runelite.a;

import java.util.Collection;
import java.util.Collections;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/p.class */
public final class p {
    private static final int[] a = {12894, 8755, 12895, 8756, 13150, 9011, 13151, 9012};
    private final int b;
    private final int c;
    private final int d;

    public p a(int i) {
        return new p(this.b + i, this.c, this.d);
    }

    public p b(int i) {
        return new p(this.b, this.c + i, this.d);
    }

    public p c(int i) {
        return new p(this.b, this.c, this.d + i);
    }

    public static boolean a(int i, int i2) {
        int i3 = Client.eh;
        int i4 = Client.ei;
        return i >= i3 && i < i3 + 104 && i2 >= i4 && i2 < i4 + 104;
    }

    public static boolean a(Client client, int i, int i2) {
        int iAP = client.aP();
        int iAQ = client.aQ();
        return i >= iAP && i < iAP + 104 && i2 >= iAQ && i2 < iAQ + 104;
    }

    public boolean a() {
        return Client.dw == this.d && a(this.b, this.c);
    }

    public static p a(f fVar) {
        return a(fVar.b(), fVar.c(), Client.dw);
    }

    public static p a(int i, int i2, int i3) {
        return new p((i >>> 7) + Client.eh, (i2 >>> 7) + Client.ei, i3);
    }

    private static p a(p pVar, int i) {
        int iE = pVar.e() & (-8);
        int iF = pVar.f() & (-8);
        int iE2 = pVar.e() & 7;
        int iF2 = pVar.f() & 7;
        switch (i) {
            case 1:
                return new p(iE + iF2, iF + (7 - iE2), pVar.g());
            case 2:
                return new p(iE + (7 - iE2), iF + (7 - iF2), pVar.g());
            case 3:
                return new p(iE + (7 - iF2), iF + iE2, pVar.g());
            default:
                return pVar;
        }
    }

    public int a(p pVar) {
        if (pVar.d != this.d) {
            return Integer.MAX_VALUE;
        }
        return b(pVar);
    }

    public int b(p pVar) {
        return Math.max(Math.abs(e() - pVar.e()), Math.abs(f() - pVar.f()));
    }

    public int b() {
        return ((this.b >> 6) << 8) | (this.c >> 6);
    }

    public static p a(int i, int i2, int i3, int i4) {
        return new p(((i >>> 8) << 6) + i2, ((i & 255) << 6) + i3, i4);
    }

    public int c() {
        return d(this.b);
    }

    public int d() {
        return d(this.c);
    }

    private static int d(int i) {
        return i & 63;
    }

    public static p a(p pVar, boolean z) {
        int iB = pVar.b();
        for (int i = 0; i < a.length; i += 2) {
            int i2 = a[i];
            int i3 = a[i + 1];
            if (iB == (z ? i2 : i3)) {
                return a(z ? i3 : i2, pVar.c(), pVar.d(), pVar.g());
            }
        }
        return pVar;
    }

    public static Collection<p> c(p pVar) {
        return Collections.singleton(pVar);
    }

    public p(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return e() == pVar.e() && f() == pVar.f() && g() == pVar.g();
    }

    public int hashCode() {
        return (((((1 * 59) + e()) * 59) + f()) * 59) + g();
    }

    public String toString() {
        return "WorldPoint(x=" + e() + ", y=" + f() + ", plane=" + g() + ")";
    }
}
