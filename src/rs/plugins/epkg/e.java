package rs.plugins.epkg;

/* JADX INFO: loaded from: client-final.jar:rs/s/e/e.class */
public enum e {
    a("Nearest Neighbor", 0),
    b("Bilinear", 0),
    c("Bicubic (Mitchell)", 1),
    d("Bicubic (Catmull-Rom)", 2),
    e("xBR", 3);

    private final String f;
    private final int g;

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }

    public String a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    e(String str, int i) {
        this.f = str;
        this.g = i;
    }
}
