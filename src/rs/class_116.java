package rs;

import gnu.trove.f.b.cc;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

/* JADX INFO: loaded from: client-final.jar:rs/class_116.class */
public class class_116 {
    public static final cc<class_117> a = new cc<>();

    public static void a() {
        if (class_205.c) {
            return;
        }
        a.clear();
        File file = new File(class_650.f() + File.separator + "configs" + File.separator + "rarities.yaml");
        if (file.exists()) {
            Map map = (Map) new Yaml().load(new FileInputStream(file));
            if (map == null) {
                return;
            }
            for (Object obj : map.keySet()) {
                String str = (String) map.get(obj);
                if (str.equalsIgnoreCase("uncommon")) {
                    a.a(((Integer) obj).intValue(), class_117.a);
                }
                if (str.equalsIgnoreCase("rare")) {
                    a.a(((Integer) obj).intValue(), class_117.b);
                }
                if (str.equalsIgnoreCase("legendary")) {
                    a.a(((Integer) obj).intValue(), class_117.c);
                }
            }
        }
    }
}
