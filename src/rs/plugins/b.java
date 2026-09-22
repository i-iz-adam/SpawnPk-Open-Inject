package rs.plugins;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: loaded from: client-final.jar:rs/s/b.class */
class b extends URLClassLoader {
    private final ClassLoader a;

    b(File file, ClassLoader classLoader) {
        super(new URL[]{file.toURI().toURL()}, null);
        this.a = classLoader;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) {
        try {
            return super.loadClass(str);
        } catch (ClassNotFoundException e) {
            return this.a.loadClass(str);
        }
    }
}
