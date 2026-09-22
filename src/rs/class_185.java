package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_185.class */
public class class_185 {
    private String a;
    private class_167 b;

    public String a() {
        return this.a;
    }

    public class_167 b() {
        return this.b;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(class_167 class_167Var) {
        this.b = class_167Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_185)) {
            return false;
        }
        class_185 class_185Var = (class_185) obj;
        if (!class_185Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = class_185Var.a();
        if (strA == null) {
            if (strA2 != null) {
                return false;
            }
        } else if (!strA.equals(strA2)) {
            return false;
        }
        class_167 class_167VarB = b();
        class_167 class_167VarB2 = class_185Var.b();
        if (class_167VarB == null) {
            return class_167VarB2 == null;
        }
        return class_167VarB.equals(class_167VarB2);
    }

    protected boolean a(Object obj) {
        return obj instanceof class_185;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = (1 * 59) + (strA == null ? 43 : strA.hashCode());
        class_167 class_167VarB = b();
        return (iHashCode * 59) + (class_167VarB == null ? 43 : class_167VarB.hashCode());
    }

    public String toString() {
        return "CustomMenuEntry(text=" + a() + ", event=" + String.valueOf(b()) + ")";
    }
}
