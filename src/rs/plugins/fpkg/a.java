package rs.plugins.fpkg;

import java.awt.Color;
import javax.annotation.Nullable;
import rs.runelite.a.p;

/* JADX INFO: loaded from: client-final.jar:rs/s/f/a.class */
public final class a {
    private final p a;

    @Nullable
    private final Color b;

    @Nullable
    private final String c;

    public a(p pVar, @Nullable Color color, @Nullable String str) {
        this.a = pVar;
        this.b = color;
        this.c = str;
    }

    public p a() {
        return this.a;
    }

    @Nullable
    public Color b() {
        return this.b;
    }

    @Nullable
    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        p pVarA = a();
        p pVarA2 = aVar.a();
        if (pVarA == null) {
            if (pVarA2 != null) {
                return false;
            }
        } else if (!pVarA.equals(pVarA2)) {
            return false;
        }
        Color colorB = b();
        Color colorB2 = aVar.b();
        if (colorB == null) {
            if (colorB2 != null) {
                return false;
            }
        } else if (!colorB.equals(colorB2)) {
            return false;
        }
        String strC = c();
        String strC2 = aVar.c();
        if (strC == null) {
            return strC2 == null;
        }
        return strC.equals(strC2);
    }

    public int hashCode() {
        p pVarA = a();
        int iHashCode = (1 * 59) + (pVarA == null ? 43 : pVarA.hashCode());
        Color colorB = b();
        int iHashCode2 = (iHashCode * 59) + (colorB == null ? 43 : colorB.hashCode());
        String strC = c();
        return (iHashCode2 * 59) + (strC == null ? 43 : strC.hashCode());
    }

    public String toString() {
        return "ColorTileMarker(worldPoint=" + String.valueOf(a()) + ", color=" + String.valueOf(b()) + ", label=" + c() + ")";
    }
}
