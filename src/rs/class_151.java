package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_151.class */
public enum class_151 {
    a,
    b,
    c;

    public static class_151 a(String str) {
        for (class_151 class_151Var : values()) {
            if (class_151Var.name().equalsIgnoreCase(str)) {
                return class_151Var;
            }
        }
        return a;
    }
}
