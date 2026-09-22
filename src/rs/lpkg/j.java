package rs.lpkg;

/* JADX INFO: loaded from: client-final.jar:rs/l/j.class */
public enum j {
    a,
    b,
    c,
    d;

    private static final j e;

    public static j a() {
        return e;
    }

    static {
        String lowerCase = System.getProperty("os.name", "generic").toLowerCase();
        if (lowerCase.contains("mac") || lowerCase.contains("darwin")) {
            e = b;
            return;
        }
        if (lowerCase.contains("win")) {
            e = a;
        } else if (lowerCase.contains("nux")) {
            e = c;
        } else {
            e = d;
        }
    }
}
