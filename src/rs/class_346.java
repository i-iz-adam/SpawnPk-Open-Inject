package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_346.class */
public class class_346 {
    String a;
    String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_346)) {
            return false;
        }
        class_346 class_346Var = (class_346) obj;
        if (!class_346Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = class_346Var.a();
        if (strA == null) {
            if (strA2 != null) {
                return false;
            }
        } else if (!strA.equals(strA2)) {
            return false;
        }
        String strB = b();
        String strB2 = class_346Var.b();
        if (strB == null) {
            return strB2 == null;
        }
        return strB.equals(strB2);
    }

    protected boolean a(Object obj) {
        return obj instanceof class_346;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = (1 * 59) + (strA == null ? 43 : strA.hashCode());
        String strB = b();
        return (iHashCode * 59) + (strB == null ? 43 : strB.hashCode());
    }

    public String toString() {
        return "DropDownOption(text=" + a() + ", tooltip=" + b() + ")";
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public class_346(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
