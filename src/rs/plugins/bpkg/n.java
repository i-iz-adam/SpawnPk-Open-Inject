package rs.plugins.bpkg;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.swing.JMenuItem;
import rs.class_132;
import rs.class_134;
import rs.class_14;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/n.class */
public final class n {
    private final String a;
    private final String b;
    private final String[] c;

    @Nullable
    private final rs.plugins.a d;

    @Nullable
    private final class_132 e;

    @Nullable
    private final class_134 f;

    @Nullable
    private final List<String> g;

    boolean a() {
        return (this.f == null || this.f.c().stream().allMatch(class_138Var -> {
            return class_138Var.d().e();
        })) ? false : true;
    }

    n(String str, String str2, String[] strArr, class_132 class_132Var, class_134 class_134Var) {
        this(str, str2, strArr, null, class_132Var, class_134Var, null);
    }

    @Nullable
    JMenuItem b() {
        JMenuItem jMenuItem = new JMenuItem("Support");
        jMenuItem.addActionListener(actionEvent -> {
            class_14.a("https://spawnpk.net");
        });
        return jMenuItem;
    }

    @Nullable
    String c() {
        return null;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String[] f() {
        return this.c;
    }

    @Nullable
    public class_132 g() {
        return this.e;
    }

    @Nullable
    public class_134 h() {
        return this.f;
    }

    @Nullable
    public List<String> i() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        String strD = d();
        String strD2 = nVar.d();
        if (strD == null) {
            if (strD2 != null) {
                return false;
            }
        } else if (!strD.equals(strD2)) {
            return false;
        }
        String strE = e();
        String strE2 = nVar.e();
        if (strE == null) {
            if (strE2 != null) {
                return false;
            }
        } else if (!strE.equals(strE2)) {
            return false;
        }
        if (!Arrays.deepEquals(f(), nVar.f())) {
            return false;
        }
        rs.s.a aVarJ = j();
        rs.s.a aVarJ2 = nVar.j();
        if (aVarJ == null) {
            if (aVarJ2 != null) {
                return false;
            }
        } else if (!aVarJ.equals(aVarJ2)) {
            return false;
        }
        class_132 class_132VarG = g();
        class_132 class_132VarG2 = nVar.g();
        if (class_132VarG == null) {
            if (class_132VarG2 != null) {
                return false;
            }
        } else if (!class_132VarG.equals(class_132VarG2)) {
            return false;
        }
        class_134 class_134VarH = h();
        class_134 class_134VarH2 = nVar.h();
        if (class_134VarH == null) {
            if (class_134VarH2 != null) {
                return false;
            }
        } else if (!class_134VarH.equals(class_134VarH2)) {
            return false;
        }
        List<String> listI = i();
        List<String> listI2 = nVar.i();
        if (listI == null) {
            return listI2 == null;
        }
        return listI.equals(listI2);
    }

    public int hashCode() {
        String strD = d();
        int iHashCode = (1 * 59) + (strD == null ? 43 : strD.hashCode());
        String strE = e();
        int iHashCode2 = (((iHashCode * 59) + (strE == null ? 43 : strE.hashCode())) * 59) + Arrays.deepHashCode(f());
        rs.s.a aVarJ = j();
        int iHashCode3 = (iHashCode2 * 59) + (aVarJ == null ? 43 : aVarJ.hashCode());
        class_132 class_132VarG = g();
        int iHashCode4 = (iHashCode3 * 59) + (class_132VarG == null ? 43 : class_132VarG.hashCode());
        class_134 class_134VarH = h();
        int iHashCode5 = (iHashCode4 * 59) + (class_134VarH == null ? 43 : class_134VarH.hashCode());
        List<String> listI = i();
        return (iHashCode5 * 59) + (listI == null ? 43 : listI.hashCode());
    }

    public String toString() {
        return "PluginConfigurationDescriptor(name=" + d() + ", description=" + e() + ", tags=" + Arrays.deepToString(f()) + ", plugin=" + String.valueOf(j()) + ", config=" + String.valueOf(g()) + ", configDescriptor=" + String.valueOf(h()) + ", conflicts=" + String.valueOf(i()) + ")";
    }

    public n(String str, String str2, String[] strArr, @Nullable rs.s.a aVar, @Nullable class_132 class_132Var, @Nullable class_134 class_134Var, @Nullable List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = aVar;
        this.e = class_132Var;
        this.f = class_134Var;
        this.g = list;
    }

    @Nullable
    public rs.plugins.a j() {
        return this.d;
    }
}
