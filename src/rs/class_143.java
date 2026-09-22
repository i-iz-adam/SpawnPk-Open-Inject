package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_143.class */
public final class class_143 implements class_140 {
    private final String a;
    private final class_142 b;

    @Override // rs.class_140
    public String a() {
        return this.a;
    }

    @Override // rs.class_140
    public String b() {
        return this.b.a();
    }

    @Override // rs.class_140
    public int c() {
        return this.b.c();
    }

    public class_143(String str, class_142 class_142Var) {
        this.a = str;
        this.b = class_142Var;
    }

    public String d() {
        return this.a;
    }

    public class_142 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_143)) {
            return false;
        }
        class_143 class_143Var = (class_143) obj;
        String strD = d();
        String strD2 = class_143Var.d();
        if (strD == null) {
            if (strD2 != null) {
                return false;
            }
        } else if (!strD.equals(strD2)) {
            return false;
        }
        class_142 class_142VarE = e();
        class_142 class_142VarE2 = class_143Var.e();
        if (class_142VarE == null) {
            return class_142VarE2 == null;
        }
        return class_142VarE.equals(class_142VarE2);
    }

    public int hashCode() {
        String strD = d();
        int iHashCode = (1 * 59) + (strD == null ? 43 : strD.hashCode());
        class_142 class_142VarE = e();
        return (iHashCode * 59) + (class_142VarE == null ? 43 : class_142VarE.hashCode());
    }

    public String toString() {
        return "ConfigSectionDescriptor(key=" + d() + ", section=" + String.valueOf(e()) + ")";
    }
}
