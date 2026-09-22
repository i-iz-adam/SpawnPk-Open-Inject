package rs;

import gnu.trove.f.b.cc;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

/* JADX INFO: loaded from: client-final.jar:rs/class_112.class */
public class class_112 {
    public static final cc<String> a = new cc<>();

    public static String a(String str, int i) {
        return str + (a.w_(i) ? a.b(i) : "");
    }

    public static void a(int i, String str) {
        a.a(i, str);
    }

    public static void a() {
        if (class_205.c) {
            return;
        }
        a.clear();
        File file = new File(class_650.f() + File.separator + "configs" + File.separator + "hovers.yaml");
        if (file.exists()) {
            Map map = (Map) new Yaml().load(new FileInputStream(file));
            for (Object obj : map.keySet()) {
                a.a(((Integer) obj).intValue(), (String) map.get(obj));
            }
        }
    }
}
