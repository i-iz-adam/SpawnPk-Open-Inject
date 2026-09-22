package rs;

import gnu.trove.i.a.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.msgpack.jackson.dataformat.MessagePackMapper;
import org.yaml.snakeyaml.Yaml;

/* JADX INFO: loaded from: client-final.jar:rs/class_625.class */
public class class_625 extends class_618 {
    public static i c = new i();
    private static final String e = class_650.f() + File.separator + "configs" + File.separator + "wandering_merchant.yaml";
    private static final String f = class_650.f() + File.separator + "configs" + File.separator + "w.bin";
    protected boolean d;

    public class_625() {
        super(e, f);
        this.d = !Configuration.c();
    }

    public void d() {
        Map<String, Map<String, Object>> mapB = b(this.d);
        Iterator<String> it = mapB.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) mapB.get(it.next()).get("items");
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                a(((Integer) ((HashMap) map.get((String) it2.next())).get("id")).intValue());
            }
        }
    }

    private void a(int i) {
        if (i == 995 || i == 20693 || i == 20842) {
            return;
        }
        ItemComposition itemCompositionLookupItem = ItemComposition.lookupItem(i);
        if (itemCompositionLookupItem != null && itemCompositionLookupItem.F > 0 && itemCompositionLookupItem.p == 799) {
            i = itemCompositionLookupItem.F;
        }
        c.b(i);
    }

    private Map<String, Map<String, Object>> b(boolean z) throws IOException {
        if (!z) {
            return (Map) new Yaml().load(Files.newInputStream(new File(this.a).toPath(), new OpenOption[0]));
        }
        InputStream inputStreamNewInputStream = Files.newInputStream(new File(this.b).toPath(), new OpenOption[0]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStreamNewInputStream.read();
            if (i == -1) {
                return (Map) new MessagePackMapper().readValue(byteArrayOutputStream.toByteArray(), new class_630());
            }
            byteArrayOutputStream.write(i);
        }
    }
}
