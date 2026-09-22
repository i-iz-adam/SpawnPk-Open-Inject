package rs;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: client-final.jar:rs/class_138.class */
public final class class_138 implements class_140 {
    private final class_137 a;
    private final Type b;
    private final class_145 c;
    private final class_131 d;
    private final class_147 e;

    @Override // rs.class_140
    public String a() {
        return this.a.b();
    }

    @Override // rs.class_140
    public String b() {
        return this.a.c();
    }

    @Override // rs.class_140
    public int c() {
        return this.a.a();
    }

    public class_138(class_137 class_137Var, Type type, class_145 class_145Var, class_131 class_131Var, class_147 class_147Var) {
        this.a = class_137Var;
        this.b = type;
        this.c = class_145Var;
        this.d = class_131Var;
        this.e = class_147Var;
    }

    public class_137 d() {
        return this.a;
    }

    public Type e() {
        return this.b;
    }

    public class_145 f() {
        return this.c;
    }

    public class_131 g() {
        return this.d;
    }

    public class_147 h() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof class_138)) {
            return false;
        }
        class_138 class_138Var = (class_138) obj;
        class_137 class_137VarD = d();
        class_137 class_137VarD2 = class_138Var.d();
        if (class_137VarD == null) {
            if (class_137VarD2 != null) {
                return false;
            }
        } else if (!class_137VarD.equals(class_137VarD2)) {
            return false;
        }
        Type typeE = e();
        Type typeE2 = class_138Var.e();
        if (typeE == null) {
            if (typeE2 != null) {
                return false;
            }
        } else if (!typeE.equals(typeE2)) {
            return false;
        }
        class_145 class_145VarF = f();
        class_145 class_145VarF2 = class_138Var.f();
        if (class_145VarF == null) {
            if (class_145VarF2 != null) {
                return false;
            }
        } else if (!class_145VarF.equals(class_145VarF2)) {
            return false;
        }
        class_131 class_131VarG = g();
        class_131 class_131VarG2 = class_138Var.g();
        if (class_131VarG == null) {
            if (class_131VarG2 != null) {
                return false;
            }
        } else if (!class_131VarG.equals(class_131VarG2)) {
            return false;
        }
        class_147 class_147VarH = h();
        class_147 class_147VarH2 = class_138Var.h();
        if (class_147VarH == null) {
            return class_147VarH2 == null;
        }
        return class_147VarH.equals(class_147VarH2);
    }

    public int hashCode() {
        class_137 class_137VarD = d();
        int iHashCode = (1 * 59) + (class_137VarD == null ? 43 : class_137VarD.hashCode());
        Type typeE = e();
        int iHashCode2 = (iHashCode * 59) + (typeE == null ? 43 : typeE.hashCode());
        class_145 class_145VarF = f();
        int iHashCode3 = (iHashCode2 * 59) + (class_145VarF == null ? 43 : class_145VarF.hashCode());
        class_131 class_131VarG = g();
        int iHashCode4 = (iHashCode3 * 59) + (class_131VarG == null ? 43 : class_131VarG.hashCode());
        class_147 class_147VarH = h();
        return (iHashCode4 * 59) + (class_147VarH == null ? 43 : class_147VarH.hashCode());
    }

    public String toString() {
        return "ConfigItemDescriptor(item=" + String.valueOf(d()) + ", type=" + String.valueOf(e()) + ", range=" + String.valueOf(f()) + ", alpha=" + String.valueOf(g()) + ", units=" + String.valueOf(h()) + ")";
    }
}
