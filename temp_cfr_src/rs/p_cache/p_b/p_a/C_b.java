/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_b.p_a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import rs.p_cache.p_b.C_d;
import rs.p_cache.p_b.C_e;
import rs.p_f.C_a;

public class C_b
extends C_d {
    private static final String e = C_a.z + "/assets/client.jar";
    private static final String f = rs.p_v.C_a.b() + "client.jar";
    private C_e g = new C_e(f, "client_version");

    public C_b(String string) {
        super(string);
    }

    @Override
    public boolean a() {
        try {
            URL uRL = new URL(e);
            File file = new File(f);
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            rs.p_cache.p_a.C_a c_a = new rs.p_cache.p_a.C_a(this.c, "Downloading client..", uRL, new File(file.getAbsolutePath()));
            File file2 = c_a.b();
            return file2 != null && file2.exists();
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @Override
    public C_e b() {
        return this.g;
    }

    @Override
    public boolean f() {
        return true;
    }
}

