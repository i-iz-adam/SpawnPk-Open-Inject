package rs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_343.class */
public class class_343 extends Widget {
    public static final int a = 42;
    private class_495 b;
    private List<class_346> c;
    private int d;
    private int e = 0;
    private int f = class_492.e;
    private boolean g = true;
    private int bG;
    private int bH;
    private int bI;

    public static class_343 a(int i, String... strArr) {
        class_343 class_343Var = new class_343(i);
        class_343Var.c = new ArrayList();
        for (String str : strArr) {
            class_343Var.c.add(new class_346(str, "Select"));
        }
        class_343Var.as = strArr[0];
        return class_343Var;
    }

    private class_343(int i) {
        this.Q = "Select";
        this.aG = 42;
        this.J = 0;
        this.M = 1;
        this.aa = -1;
        this.L = class_492.c;
        this.au = i;
        this.P = 120;
        this.aP = 21;
        this.bG = this.aP + 90;
        this.an = class_352.a[0];
        this.S = true;
        this.aQ = true;
        a();
        H[i] = this;
    }

    public void a(int i) {
        int i2 = i - class_344.c;
        if (i2 < 0 || i2 >= h()) {
            return;
        }
        this.d = i2;
        this.as = this.c.get(i2).a();
        if (Client.cI > 0) {
            class_345.b();
        }
    }

    public class_343 g(int i, int i2) {
        this.ac = i;
        this.f = i2;
        return this;
    }

    public class_343 h(int i, int i2) {
        this.P = i;
        this.bH = i2;
        if (i2 > 0) {
            this.bG = i2;
        }
        return this;
    }

    public class_343 a() {
        this.e = 0;
        this.an = class_352.a[this.e];
        return this;
    }

    public class_343 b() {
        this.e = 1;
        this.an = class_352.a[this.e];
        return this;
    }

    public class_343 c() {
        this.e = 2;
        this.an = class_352.a[this.e];
        return this;
    }

    public class_343 m(int i) {
        this.P = i;
        return this;
    }

    public int h() {
        return this.c.size();
    }

    public List<class_346> i() {
        return this.c;
    }

    public void a(List<class_346> list) {
        this.c = list;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    public int l() {
        return this.f;
    }

    public boolean m() {
        return this.g;
    }

    public int n() {
        return this.bG;
    }

    public void n(int i) {
        this.bG = i;
    }

    public int o() {
        return this.bH;
    }

    public int p() {
        return this.bI;
    }

    public void o(int i) {
        this.bI = i;
    }
}
