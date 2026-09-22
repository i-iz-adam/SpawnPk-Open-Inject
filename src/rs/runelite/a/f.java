package rs.runelite.a;

import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/f.class */
public class f {
    private final int a;
    private final int b;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean a() {
        return this.a >= 0 && this.a < 13312 && this.b >= 0 && this.b < 13312;
    }

    public int a(f fVar) {
        return (int) Math.hypot(b() - fVar.b(), c() - fVar.c());
    }

    public static f a(int i, int i2) {
        return new f((i << 7) + 64, (i2 << 7) + 64);
    }

    public static f a(p pVar) {
        if (Client.dw != pVar.g()) {
            return null;
        }
        return b(pVar.e(), pVar.f());
    }

    public static f b(int i, int i2) {
        if (!p.a(i, i2)) {
            return null;
        }
        return a(i - Client.eh, i2 - Client.ei);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.a >>> 7;
    }

    public int e() {
        return this.b >>> 7;
    }
}
