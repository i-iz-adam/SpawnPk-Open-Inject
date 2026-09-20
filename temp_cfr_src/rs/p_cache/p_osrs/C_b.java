/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.p_cache.p_osrs;

import java.io.File;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_cache.p_osrs.C_a;

public class C_b {
    private static final Logger a = LoggerFactory.getLogger(C_b.class);
    private final rs.p_cache.C_b b;

    public C_b(rs.p_cache.C_b c_b) {
        this.b = c_b;
    }

    public void a() {
        if (!rs.p_f.C_a.c()) {
            return;
        }
        for (C_a c_a : C_a.values()) {
            File file = new File(c_a.c());
            if (!file.exists() || file.listFiles().length <= 0) continue;
            this.a(c_a, file.listFiles());
        }
    }

    public void a(C_a c_a, File[] fileArray) {
        int n = 0;
        a.info("Scanning assets in pack directory {} index (file count: {})", (Object)c_a.b(), (Object)fileArray.length);
        for (File file : fileArray) {
            if (!file.getName().contains(".gz")) continue;
            int n2 = Integer.parseInt(C_Client_mc.e(file.getName()));
            byte[] byArray = this.a(file);
            if (byArray != null && byArray.length > 0) {
                this.b.a()[c_a.a()].a(byArray.length, byArray, n2);
                ++n;
                continue;
            }
            a.info("Unable to locate index {}.", (Object)c_a.b());
        }
        if (n > 0) {
            a.info("Packed new assets into {} index ({} files)", (Object)c_a.b(), (Object)n);
        }
    }

    private byte[] a(File file) {
        try {
            byte[] byArray = new byte[(int)file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(byArray);
            fileInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

