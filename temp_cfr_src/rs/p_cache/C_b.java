/*
 * Decompiled with CFR 0.152.
 */
package rs.p_cache;

import java.io.RandomAccessFile;
import rs.p_cache.C_a;

public class C_b {
    private final C_a[] a;
    private RandomAccessFile b;
    private final RandomAccessFile[] c = new RandomAccessFile[5];

    public C_b() {
        this.a = new C_a[5];
    }

    public void a(String string, String string2) {
        int n;
        try {
            this.b = new RandomAccessFile(rs.p_v.C_a.f() + string, "rw");
            for (n = 0; n < 5; ++n) {
                this.c[n] = new RandomAccessFile(rs.p_v.C_a.f() + string2 + n, "rw");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        for (n = 0; n < 5; ++n) {
            this.a[n] = new C_a(this.b, this.c[n], n + 1);
        }
    }

    public C_a[] a() {
        return this.a;
    }
}

