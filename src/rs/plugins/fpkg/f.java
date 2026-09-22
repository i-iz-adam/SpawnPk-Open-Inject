package rs.plugins.fpkg;

import java.awt.Color;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: client-final.jar:rs/s/f/f.class */
final class f {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    @Nullable
    private final Color e;

    @Nullable
    private final String f;

    public f(int i, int i2, int i3, int i4, @Nullable Color color, @Nullable String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = color;
        this.f = str;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    @Nullable
    public Color e() {
        return this.e;
    }

    @Nullable
    public String f() {
        return this.f;
    }

    public String toString() {
        return "GroundMarkerPoint(regionId=" + a() + ", regionX=" + b() + ", regionY=" + c() + ", z=" + d() + ", color=" + String.valueOf(e()) + ", label=" + f() + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a() == fVar.a() && b() == fVar.b() && c() == fVar.c() && d() == fVar.d();
    }

    public int hashCode() {
        return (((((((1 * 59) + a()) * 59) + b()) * 59) + c()) * 59) + d();
    }
}
