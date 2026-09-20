/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_b;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.p_cache.p_b.C_b;
import rs.p_cache.p_b.p_a.C_a;
import rs.p_cache.p_b.p_a.C_d;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_h;

public class C_c {
    private final rs.p_cache.p_b.C_d a = new C_a();
    private final rs.p_cache.p_b.C_d b = new C_d();
    private final rs.p_cache.p_b.C_d c = new rs.p_cache.p_b.p_a.C_c();
    private final List<rs.p_cache.p_b.C_d> d = new ArrayList<rs.p_cache.p_b.C_d>();
    private C_Client_mc e;

    public C_c(C_Client_mc c_Client_mc) {
        this.e = c_Client_mc;
        this.d.add(this.a);
        this.d.add(this.b);
        this.d.add(this.c);
        for (rs.p_cache.p_b.C_d c_d : this.d) {
            c_d.a(c_Client_mc);
        }
    }

    public boolean a() {
        this.e.G = new rs.p_l.p_d.C_c(this.e);
        C_Client_mc.gl = new C_h(false, "assets/", "assets/p11_full");
        this.e.gm = new C_h(false, "assets/", "assets/p12_full");
        this.e.a(0, "Please wait, checking assets..");
        Thread thread = new Thread(this.e.G);
        thread.start();
        if (!this.a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            this.b(this.b);
            return false;
        }
        this.e.cf = true;
        if (C_Launcher_mc.n() != null) {
            // empty if block
        }
        if (!this.a(this.a)) {
            this.a.c().add(0, "Error with the cache updater!");
            this.b(this.a);
            return false;
        }
        if (!this.a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            this.b(this.b);
            return false;
        }
        if (!this.a(this.c)) {
            this.c.c().add(0, "Error with configuration updater!");
            this.b(this.c);
            return false;
        }
        return true;
    }

    public boolean b() {
        for (rs.p_cache.p_b.C_d c_d : this.d) {
            if (c_d.b().c() == c_d.b().b()) continue;
            return true;
        }
        return false;
    }

    public boolean a(rs.p_cache.p_b.C_d c_d) {
        double d2 = c_d.b().c();
        double d3 = c_d.b().b();
        if (d3 == -1.0) {
            c_d.a(C_b.a);
            return false;
        }
        if (d2 != d3) {
            System.out.println("Updating outdated game asset: " + c_d.d());
            if (c_d.a()) {
                return c_d.b().a();
            }
        } else {
            return true;
        }
        return false;
    }

    public void b(rs.p_cache.p_b.C_d c_d) {
        for (String string : c_d.c()) {
            System.out.println(string);
        }
    }

    public rs.p_cache.p_b.C_d c() {
        return this.a;
    }

    public rs.p_cache.p_b.C_d d() {
        return this.b;
    }

    public rs.p_cache.p_b.C_d e() {
        return this.c;
    }
}

