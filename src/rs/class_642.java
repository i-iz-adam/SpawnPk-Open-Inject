package rs;

import com.a.b.a.b;

/* JADX INFO: loaded from: client-final.jar:rs/class_642.class */
public class class_642 {
    boolean a = true;
    boolean b = true;
    b c = new b();
    b d = new b();
    b e = new b();
    b[] f;
    b[] g;
    float[][] h;
    float[][] i;
    float[][] j;
    float[][] k;
    final b[] l;
    public class_642 m;
    public final int n;

    public class_642(int i, Buffer buffer, boolean z) {
        this.n = buffer.B();
        this.l = new b[i];
        this.f = new b[this.l.length];
        this.g = new b[this.l.length];
        this.k = new float[this.l.length][3];
        for (int i2 = 0; i2 < this.l.length; i2++) {
            this.l[i2] = new b(buffer, z);
            this.k[i2][0] = buffer.s();
            this.k[i2][1] = buffer.s();
            this.k[i2][2] = buffer.s();
        }
        a();
    }

    void a() {
        this.i = new float[this.l.length][3];
        this.h = new float[this.l.length][3];
        this.j = new float[this.l.length][3];
        b bVarA = b.a();
        for (int i = 0; i < this.l.length; i++) {
            b bVarA2 = a(i);
            bVarA.a(bVarA2);
            bVarA.h();
            this.i[i] = bVarA.d();
            this.h[i][0] = bVarA2.e[12];
            this.h[i][1] = bVarA2.e[13];
            this.h[i][2] = bVarA2.e[14];
            this.j[i] = bVarA2.i();
        }
        bVarA.b();
    }

    b a(int i) {
        return this.l[i];
    }

    b b(int i) {
        if (null == this.f[i]) {
            this.f[i] = new b(a(i));
            if (null != this.m) {
                this.f[i].c(this.m.b(i));
            } else {
                this.f[i].c(b.a);
            }
        }
        return this.f[i];
    }

    b c(int i) {
        if (null == this.g[i]) {
            this.g[i] = new b(b(i));
            this.g[i].h();
        }
        return this.g[i];
    }

    void a(b bVar) {
        this.e.a(bVar);
        this.b = true;
        this.a = true;
    }

    b b() {
        return this.e;
    }

    b c() {
        try {
            if (this.b) {
                this.c.a(b());
                if (this.m != null) {
                    this.c.c(this.m.c());
                }
                this.b = false;
            }
        } catch (StackOverflowError e) {
            System.out.println("parent " + this.n + ", " + String.valueOf(this.m) + ", parent parent: " + (this.m != null ? this.m.n : -1) + ", bone_pose_transform: " + String.valueOf(this.c));
            System.exit(1);
        }
        return this.c;
    }

    public b d(int i) {
        if (this.a) {
            this.d.a(c(i));
            this.d.c(c());
            this.a = false;
        }
        return this.d;
    }

    float[] e(int i) {
        return this.i[i];
    }

    float[] f(int i) {
        return this.h[i];
    }

    float[] g(int i) {
        return this.j[i];
    }
}
