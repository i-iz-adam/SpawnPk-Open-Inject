package rs;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: client-final.jar:rs/class_88.class */
public class class_88 extends class_92 {
    private static final String f = "configs.zip";
    private class_93 h;
    private static final String e = Configuration.m + "configs.zip";
    private static final String g = class_650.f() + "configs";

    public class_88() {
        super("Configs");
        this.h = new class_93("config_version");
    }

    @Override // rs.class_92
    public boolean a() {
        try {
            URL url = new URL(e);
            File file = new File(g);
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            File fileB = new class_77(this.c, "Downloading game configs..", url, new File(file.getAbsolutePath() + File.separator + "configs.zip")).b();
            if (fileB == null) {
                a(class_90.b);
                return false;
            }
            if (a(file.getAbsolutePath(), fileB)) {
                fileB.delete();
                return true;
            }
            a(class_90.b);
            return false;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // rs.class_92
    public class_93 b() {
        return this.h;
    }

    @Override // rs.class_92
    public boolean f() {
        return true;
    }
}
