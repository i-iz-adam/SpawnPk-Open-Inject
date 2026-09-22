package rs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/class_196.class */
public abstract class class_196 {
    private static int t = 10;
    protected boolean a;
    protected int f;
    protected class_99 g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected int r;
    protected int b = 6208;
    protected int c = 6208;
    protected int d = 0;
    protected int e = 0;
    protected Map<Integer, Boolean> p = new HashMap();
    protected Map<Integer, Boolean> q = new HashMap();
    protected List<Integer> s = new ArrayList();

    public class_196() {
        this.f = 0;
        int i = t + 1;
        t = i;
        this.f = i;
        this.o = true;
    }

    public void a() {
        if (!this.a) {
            b();
            this.a = true;
        }
        try {
            c();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.g != null) {
            this.j++;
            if (this.i < this.g.d && this.j > this.g.a(this.i)) {
                this.j = 1;
                this.i++;
            }
            if (this.i >= this.g.d) {
                this.j = 1;
                this.i = 0;
            }
        }
    }

    protected abstract void b();

    protected abstract void c();

    public void a(int i) {
        this.b = i;
    }

    public void b(int i) {
        this.c = i;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public void c(int i) {
        class_205.b.f.g(this.b, i, this.c);
        this.k = class_205.b.f.dN;
        this.l = class_205.b.f.dO;
    }

    public void d(int i) {
        if (i == -1) {
            i = 0;
        }
        this.h = i;
        this.g = class_99.a[this.h];
        this.i = 0;
        this.j = 0;
    }

    public void f() {
        if (this.q.size() > 0) {
            System.out.println();
            System.out.print("Default color map: \t");
            Iterator<Integer> it = this.q.keySet().iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + ",");
            }
            System.out.println();
        }
        if (this.p.size() > 0) {
            System.out.print("Final color map: \t");
            Iterator<Integer> it2 = this.p.keySet().iterator();
            while (it2.hasNext()) {
                System.out.print(it2.next() + ",");
            }
            System.out.println();
            System.out.println("Selected colors: \t" + Arrays.toString(this.s.stream().mapToInt(num -> {
                return num.intValue();
            }).toArray()).replaceAll(F.a, ""));
        }
    }

    public int g() {
        return this.m;
    }

    public void e(int i) {
        this.m = i;
    }

    public boolean h() {
        return this.n;
    }

    public void a(boolean z) {
        this.n = z;
        this.s.clear();
    }

    public Map<Integer, Boolean> i() {
        return this.p;
    }

    public Map<Integer, Boolean> j() {
        return this.q;
    }

    public List<Integer> k() {
        return this.s;
    }

    public boolean l() {
        return this.o;
    }

    public int m() {
        return this.r;
    }

    public void f(int i) {
        this.r = i;
    }
}
