package rs;

import java.util.function.Consumer;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: client-final.jar:rs/class_314.class */
public class class_314 {
    private final int b;
    private final String c;
    private final String d;

    @Nullable
    Consumer<class_185> a;

    public class_314(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public String toString() {
        return "OverlayMenuEntry(menuAction=" + a() + ", option=" + b() + ", target=" + c() + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_314)) {
            return false;
        }
        class_314 class_314Var = (class_314) obj;
        if (!class_314Var.a(this) || a() != class_314Var.a()) {
            return false;
        }
        String strB = b();
        String strB2 = class_314Var.b();
        if (strB == null) {
            if (strB2 != null) {
                return false;
            }
        } else if (!strB.equals(strB2)) {
            return false;
        }
        String strC = c();
        String strC2 = class_314Var.c();
        if (strC == null) {
            return strC2 == null;
        }
        return strC.equals(strC2);
    }

    protected boolean a(Object obj) {
        return obj instanceof class_314;
    }

    public int hashCode() {
        int iA = (1 * 59) + a();
        String strB = b();
        int iHashCode = (iA * 59) + (strB == null ? 43 : strB.hashCode());
        String strC = c();
        return (iHashCode * 59) + (strC == null ? 43 : strC.hashCode());
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}
