package rs;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: client-final.jar:rs/class_3.class */
public final class class_3 {
    private final String a;
    private final int b;

    public class_3(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_3)) {
            return false;
        }
        class_3 class_3Var = (class_3) obj;
        if (b() != class_3Var.b()) {
            return false;
        }
        String strA = a();
        String strA2 = class_3Var.a();
        if (strA == null) {
            return strA2 == null;
        }
        return strA.equals(strA2);
    }

    public int hashCode() {
        int iB = (1 * 59) + b();
        String strA = a();
        return (iB * 59) + (strA == null ? 43 : strA.hashCode());
    }

    public String toString() {
        return "AssetIconManager.SpriteKey(directory=" + a() + ", size=" + b() + ")";
    }
}
