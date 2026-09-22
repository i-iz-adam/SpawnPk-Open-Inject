package rs;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: client-final.jar:rs/class_87.class */
public class class_87 extends class_92 {
    private static final String e = Configuration.z + "/assets/client.jar";
    private static final String f = class_650.b() + "client.jar";
    private class_93 g;

    public class_87(String str) {
        super(str);
        this.g = new class_93(f, "client_version");
    }

    @Override // rs.class_92
    public boolean a() {
        try {
            URL url = new URL(e);
            File file = new File(f);
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            File fileB = new class_77(this.c, "Downloading client..", url, new File(file.getAbsolutePath())).b();
            return fileB != null && fileB.exists();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // rs.class_92
    public class_93 b() {
        return this.g;
    }

    @Override // rs.class_92
    public boolean f() {
        return true;
    }
}
