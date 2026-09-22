package rs;

import gnu.trove.f.b.bU;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import rs.plugins.s.b;

/* JADX INFO: loaded from: client-final.jar:rs/class_125.class */
public class class_125 {
    private static final HashMap<class_126, class_125> a = new HashMap<>();
    private final bU b = new bU();

    public static void a() {
        a.clear();
        for (class_126 class_126Var : class_126.values()) {
            class_125 class_125Var = new class_125();
            a.put(class_126Var, class_125Var);
            File file = new File(class_650.f() + File.separator + "configs" + File.separator + class_126Var.b());
            if (file.exists()) {
                Map map = (Map) new Yaml().load(new FileInputStream(file));
                for (Object obj : map.keySet()) {
                    class_125Var.c().a(((Integer) obj).intValue(), ((Integer) map.get(obj)).intValue());
                }
            }
        }
    }

    public static String a(int i, String str) {
        if (!b.j) {
            return str;
        }
        for (int i2 = 0; i2 < class_126.values().length; i2++) {
            class_126 class_126Var = class_126.values()[i2];
            if (a.get(class_126Var).c().r_(i)) {
                str = str + " @cya@(<img=" + class_126Var.a() + ">" + String.format("%,d", Integer.valueOf(a.get(class_126Var).c().c(i))) + ")";
            }
        }
        return str;
    }

    public static HashMap<class_126, class_125> b() {
        return a;
    }

    public bU c() {
        return this.b;
    }
}
