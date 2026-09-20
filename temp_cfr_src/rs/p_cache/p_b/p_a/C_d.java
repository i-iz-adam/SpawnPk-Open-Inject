/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_b.p_a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import rs.p_cache.p_a.C_a;
import rs.p_cache.p_b.C_b;
import rs.p_cache.p_b.C_e;

public class C_d
extends rs.p_cache.p_b.C_d {
    private static final String e = rs.p_f.C_a.m + "sprites.zip";
    private static final String f = "sprites.zip";
    private static final String g = rs.p_v.C_a.f() + "sprites";
    private C_e h = new C_e("sprite_version");

    public C_d() {
        super("Sprites");
    }

    @Override
    public boolean a() {
        try {
            URL uRL = new URL(e);
            File file = new File(g);
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            C_a c_a = new C_a(this.c, "Downloading sprites..", uRL, new File(file.getAbsolutePath() + File.separator + f));
            File file2 = c_a.b();
            if (file2 != null) {
                if (!this.a(file.getAbsolutePath(), file2)) {
                    this.a(C_b.b);
                    return false;
                }
                file2.delete();
                return true;
            }
            this.a(C_b.b);
            return false;
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @Override
    public C_e b() {
        return this.h;
    }

    @Override
    public boolean f() {
        return true;
    }
}

