package rs;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: client-final.jar:rs/class_2.class */
public final class class_2 {
    private final int a;
    private final int b;
    private final int c;

    public class_2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_2)) {
            return false;
        }
        class_2 class_2Var = (class_2) obj;
        return a() == class_2Var.a() && b() == class_2Var.b() && c() == class_2Var.c();
    }

    public int hashCode() {
        return (((((1 * 59) + a()) * 59) + b()) * 59) + c();
    }

    public String toString() {
        return "AssetIconManager.ItemKey(itemId=" + a() + ", itemQuantity=" + b() + ", size=" + c() + ")";
    }
}
