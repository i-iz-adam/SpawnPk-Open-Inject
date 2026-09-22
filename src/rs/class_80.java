package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_80.class */
public enum class_80 {
    a(1, "Model"),
    b(2, "Animation"),
    c(3, "Sounds"),
    d(4, "Map");

    private int e;
    private String f;
    private String g;

    class_80(int i, String str) {
        this.e = i;
        this.f = str;
        this.g = class_650.f() + "osrs_idx" + i;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }
}
