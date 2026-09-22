package rs.plugins.o;

import java.awt.Color;
import java.util.function.Predicate;
import lombok.NonNull;
import rs.Npc;

/* JADX INFO: loaded from: client-final.jar:rs/s/o/a.class */
public final class a {

    @NonNull
    private final Npc a;

    @NonNull
    private final Color b;
    private final Color c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final float l;
    private final int m;
    private final Predicate<Npc> n;

    /* JADX INFO: loaded from: client-final.jar:rs/s/o/a$a.class */
    public static class Builder {
        private Npc a;
        private Color b;
        private boolean c;
        private Color d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private float n;
        private int o;
        private Predicate<Npc> p;

        Builder() {
        }

        public Builder a(@NonNull Npc npc) {
            if (npc == null) {
                throw new NullPointerException("npc is marked non-null but is null");
            }
            this.a = npc;
            return this;
        }

        public Builder a(@NonNull Color color) {
            if (color == null) {
                throw new NullPointerException("highlightColor is marked non-null but is null");
            }
            this.b = color;
            return this;
        }

        public Builder b(Color color) {
            this.d = color;
            this.c = true;
            return this;
        }

        public Builder a(boolean z) {
            this.e = z;
            return this;
        }

        public Builder b(boolean z) {
            this.f = z;
            return this;
        }

        public Builder c(boolean z) {
            this.g = z;
            return this;
        }

        public Builder d(boolean z) {
            this.h = z;
            return this;
        }

        public Builder e(boolean z) {
            this.i = z;
            return this;
        }

        public Builder f(boolean z) {
            this.j = z;
            return this;
        }

        public Builder g(boolean z) {
            this.k = z;
            return this;
        }

        public Builder h(boolean z) {
            this.l = z;
            return this;
        }

        public Builder a(float f) {
            this.n = f;
            this.m = true;
            return this;
        }

        public Builder a(int i) {
            this.o = i;
            return this;
        }

        public Builder a(Predicate<Npc> predicate) {
            this.p = predicate;
            return this;
        }

        public a a() {
            Color colorR = this.d;
            if (!this.c) {
                colorR = a.r();
            }
            float fS = this.n;
            if (!this.m) {
                fS = a.s();
            }
            return new a(this.a, this.b, colorR, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, fS, this.o, this.p);
        }

        public String toString() {
            return "HighlightedNpc.HighlightedNpcBuilder(npc=" + String.valueOf(this.a) + ", highlightColor=" + String.valueOf(this.b) + ", fillColor$value=" + String.valueOf(this.d) + ", hull=" + this.e + ", tile=" + this.f + ", trueTile=" + this.g + ", swTile=" + this.h + ", swTrueTile=" + this.i + ", outline=" + this.j + ", name=" + this.k + ", nameOnMinimap=" + this.l + ", borderWidth$value=" + this.n + ", outlineFeather=" + this.o + ", render=" + String.valueOf(this.p) + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Color r() {
        return new Color(0, 0, 0, 50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float s() {
        return 2.0f;
    }

    a(@NonNull Npc npc, @NonNull Color color, Color color2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, float f, int i, Predicate<Npc> predicate) {
        if (npc == null) {
            throw new NullPointerException("npc is marked non-null but is null");
        }
        if (color == null) {
            throw new NullPointerException("highlightColor is marked non-null but is null");
        }
        this.a = npc;
        this.b = color;
        this.c = color2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = f;
        this.m = i;
        this.n = predicate;
    }

    public static Builder a() {
        return new Builder();
    }

    @NonNull
    public Npc b() {
        return this.a;
    }

    @NonNull
    public Color c() {
        return this.b;
    }

    public Color d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }

    public float m() {
        return this.l;
    }

    public int n() {
        return this.m;
    }

    public Predicate<Npc> o() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (e() != aVar.e() || f() != aVar.f() || g() != aVar.g() || h() != aVar.h() || i() != aVar.i() || j() != aVar.j() || k() != aVar.k() || l() != aVar.l() || Float.compare(m(), aVar.m()) != 0 || n() != aVar.n()) {
            return false;
        }
        Npc npcB = b();
        Npc npcB2 = aVar.b();
        if (npcB == null) {
            if (npcB2 != null) {
                return false;
            }
        } else if (!npcB.equals(npcB2)) {
            return false;
        }
        Color colorC = c();
        Color colorC2 = aVar.c();
        if (colorC == null) {
            if (colorC2 != null) {
                return false;
            }
        } else if (!colorC.equals(colorC2)) {
            return false;
        }
        Color colorD = d();
        Color colorD2 = aVar.d();
        if (colorD == null) {
            if (colorD2 != null) {
                return false;
            }
        } else if (!colorD.equals(colorD2)) {
            return false;
        }
        Predicate<Npc> predicateO = o();
        Predicate<Npc> predicateO2 = aVar.o();
        if (predicateO == null) {
            return predicateO2 == null;
        }
        return predicateO.equals(predicateO2);
    }

    public int hashCode() {
        int iFloatToIntBits = (((((((((((((((((((1 * 59) + (e() ? 79 : 97)) * 59) + (f() ? 79 : 97)) * 59) + (g() ? 79 : 97)) * 59) + (h() ? 79 : 97)) * 59) + (i() ? 79 : 97)) * 59) + (j() ? 79 : 97)) * 59) + (k() ? 79 : 97)) * 59) + (l() ? 79 : 97)) * 59) + Float.floatToIntBits(m())) * 59) + n();
        Npc npcB = b();
        int iHashCode = (iFloatToIntBits * 59) + (npcB == null ? 43 : npcB.hashCode());
        Color colorC = c();
        int iHashCode2 = (iHashCode * 59) + (colorC == null ? 43 : colorC.hashCode());
        Color colorD = d();
        int iHashCode3 = (iHashCode2 * 59) + (colorD == null ? 43 : colorD.hashCode());
        Predicate<Npc> predicateO = o();
        return (iHashCode3 * 59) + (predicateO == null ? 43 : predicateO.hashCode());
    }

    public String toString() {
        return "HighlightedNpc(npc=" + String.valueOf(b()) + ", highlightColor=" + String.valueOf(c()) + ", fillColor=" + String.valueOf(d()) + ", hull=" + e() + ", tile=" + f() + ", trueTile=" + g() + ", swTile=" + h() + ", swTrueTile=" + i() + ", outline=" + j() + ", name=" + k() + ", nameOnMinimap=" + l() + ", borderWidth=" + m() + ", outlineFeather=" + n() + ", render=" + String.valueOf(o()) + ")";
    }
}
