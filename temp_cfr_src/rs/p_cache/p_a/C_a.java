/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache.p_a;

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import rs.C_Client_mc;
import rs.p_cache.p_a.C_b;

public class C_a
extends C_b {
    private C_Client_mc d;
    private String e;
    private long f;

    public C_a(C_Client_mc c_Client_mc, String string, URL uRL, File file) {
        super(uRL, file);
        this.d = c_Client_mc;
        this.e = string;
    }

    @Override
    public void a() {
        if (this.d != null) {
            double d2 = (double)this.a / (double)this.c;
            int n = (int)(d2 * 100.0);
            if (System.currentTimeMillis() - this.f >= 500L) {
                this.f = System.currentTimeMillis();
            }
            String string = "@yel@Current progress - " + n + "%";
            if (System.currentTimeMillis() - this.b > 1000L) {
                double d3 = (double)this.a / (double)((System.currentTimeMillis() - this.b) / 1000L);
                String string2 = "kb/s";
                double d4 = (int)(d3 / 1000.0);
                if (d4 > 1000.0) {
                    d4 /= 1000.0;
                    string2 = "mb/s";
                }
                string = string + " @or2@(" + new DecimalFormat("#.##").format(d4) + " " + string2 + ")";
            }
            this.d.b(n, this.e, string);
        }
    }
}

