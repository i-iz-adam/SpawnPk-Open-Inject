package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_144.class */
public enum class_144 {
    a("Off"),
    b("Flash for 2 seconds"),
    c("Solid for 2 seconds"),
    d("Flash until cancelled"),
    e("Solid until cancelled");

    private final String f;

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }

    public String a() {
        return this.f;
    }

    class_144(String str) {
        this.f = str;
    }
}
