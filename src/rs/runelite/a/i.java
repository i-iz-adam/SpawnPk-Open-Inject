package rs.runelite.a;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/i.class */
public class i {
    private final int a;
    private final int b;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public String toString() {
        return "Point{x=" + this.a + ", y=" + this.b + "}";
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int a(i iVar) {
        return (int) Math.hypot(a() - iVar.a(), b() - iVar.b());
    }

    public int hashCode() {
        return (23 * ((23 * 3) + this.a)) + this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b;
    }
}
