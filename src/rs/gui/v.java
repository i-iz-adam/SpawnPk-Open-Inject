package rs.gui;

/* JADX INFO: loaded from: client-final.jar:rs/gui/v.class */
public enum v {
    a("Keep window size"),
    b("Keep game size");

    private final String c;

    v(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.c;
    }
}
