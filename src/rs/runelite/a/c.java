package rs.runelite.a;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/c.class */
public enum c {
    a(-1),
    b(0),
    c(10),
    d(11),
    e(20),
    f(25),
    g(30),
    h(40),
    i(45);

    private final int j;

    c(int i2) {
        this.j = i2;
    }

    public static c a(int i2) {
        for (c cVar : values()) {
            if (cVar.j == i2) {
                return cVar;
            }
        }
        return a;
    }

    public int a() {
        return this.j;
    }
}
