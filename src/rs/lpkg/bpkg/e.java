package rs.lpkg.bpkg;

import java.lang.management.ManagementFactory;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/l/b/e.class */
public class e extends LinkedHashMap<Integer, c> {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) e.class);
    private a b;
    private d c;
    private b d;
    private b e;

    public void a(rs.lpkg.e eVar) {
        int i = 403;
        if (!Objects.equals(System.getProperty("sun.arch.data.model"), "64") && 403 > 512) {
            a.error("defaulting model cache to 512MiB due to non 64-bit client");
            i = 512;
        }
        try {
            long totalPhysicalMemorySize = (ManagementFactory.getOperatingSystemMXBean().getTotalPhysicalMemorySize() / 1024) / 1024;
            if (i > totalPhysicalMemorySize / 2) {
                i = (int) (totalPhysicalMemorySize / 2);
                a.error("limiting the cache to " + i + " since the selected amount exceeds half of the total physical memory for the system.");
            }
        } catch (Throwable th) {
            a.error("failed to check physical memory size: " + String.valueOf(th));
        }
        this.b = new a(((long) i) * 1048576, eVar);
        this.b.b();
        this.c = new d(this.b);
        this.d = new b(this.b);
        this.e = new b(this.b);
    }

    public void a() {
        clear();
        if (this.b != null) {
            this.b.c();
        }
    }

    public IntBuffer a(int i) {
        return this.c.get(Integer.valueOf(i));
    }

    public void a(int i, IntBuffer intBuffer) {
        this.c.put(Integer.valueOf(i), intBuffer);
    }

    public FloatBuffer b(int i) {
        return this.d.get(Integer.valueOf(i));
    }

    public void a(int i, FloatBuffer floatBuffer) {
        this.d.put(Integer.valueOf(i), floatBuffer);
    }

    public FloatBuffer c(int i) {
        return this.e.get(Integer.valueOf(i));
    }

    public void b(int i, FloatBuffer floatBuffer) {
        this.e.put(Integer.valueOf(i), floatBuffer);
    }

    public IntBuffer d(int i) {
        if (this.b.a() && !b()) {
            a.error("failed to make room for int buffer");
        }
        return this.b.a(i);
    }

    public FloatBuffer e(int i) {
        if (this.b.a() && !b()) {
            a.error("failed to make room for float buffer");
        }
        return this.b.b(i);
    }

    public boolean b() {
        if (this.e.size() * 16 <= this.d.size() || this.d.size() <= 0) {
            return this.d.size() * 2 > this.c.size() ? this.d.a() : this.c.a();
        }
        return this.e.a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.c != null) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.clear();
        }
        if (this.e != null) {
            this.e.clear();
        }
    }
}
