package rs.lpkg.apkg;

/* JADX INFO: loaded from: client-final.jar:rs/l/a/a.class */
public enum a {
    a("Disabled", 0),
    b("MSAA x2", 2),
    c("MSAA x4", 4),
    d("MSAA x8", 8),
    e("MSAA x16", 16);

    private final String f;
    private final int g;

    a(String str, int i) {
        this.f = str;
        this.g = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }

    public int a() {
        return this.g;
    }
}
