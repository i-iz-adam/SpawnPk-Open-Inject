package rs;

import java.io.File;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_82.class */
public class class_82 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_82.class);
    private final class_79 b;

    public class_82(class_79 class_79Var) {
        this.b = class_79Var;
    }

    public void a() {
        if (Configuration.c()) {
            for (class_80 class_80Var : class_80.values()) {
                File file = new File(class_80Var.c());
                if (file.exists() && file.listFiles().length > 0) {
                    a(class_80Var, file.listFiles());
                }
            }
        }
    }

    public void a(class_80 class_80Var, File[] fileArr) {
        int i = 0;
        a.info("Scanning assets in pack directory {} index (file count: {})", class_80Var.b(), Integer.valueOf(fileArr.length));
        for (File file : fileArr) {
            if (file.getName().contains(".gz")) {
                int i2 = Integer.parseInt(Client.c(file.getName()));
                byte[] bArrA = a(file);
                if (bArrA == null || bArrA.length <= 0) {
                    a.info("Unable to locate index {}.", class_80Var.b());
                } else {
                    this.b.a()[class_80Var.a()].a(bArrA.length, bArrA, i2);
                    i++;
                }
            }
        }
        if (i > 0) {
            a.info("Packed new assets into {} index ({} files)", class_80Var.b(), Integer.valueOf(i));
        }
    }

    private byte[] a(File file) {
        try {
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e) {
            return null;
        }
    }
}
