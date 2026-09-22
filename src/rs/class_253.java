package rs;

import gnu.trove.f.b.cc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_253.class */
public abstract class class_253 {
    public static final class_253 a = new class_240();
    public static final class_253 b = new class_230();
    public static final class_253 c = new class_245();
    public static final class_253 d = new class_243();
    public static final class_238 e = new class_238();
    public static final class_226 f = new class_226();
    public static final class_247 g = new class_247();
    public static final class_236 h = new class_236();
    public static final class_242 i = new class_242();
    public static final class_246 j = new class_246();
    public static final List<class_253> k = new ArrayList();
    public static final List<class_253> l = new ArrayList();
    public static final List<class_253> m = new ArrayList();
    public static final List<class_225> n = new ArrayList();
    public static int o = 0;
    private cc<class_257> p = new cc<>();
    private boolean q = false;

    public static void a() {
        if (k.size() > 0) {
            k.clear();
        }
        if (l.size() > 0) {
            l.clear();
        }
        a(f);
        a(g);
        a(a);
        a(b);
        a(c);
        a(d);
        a(new class_233());
        a(new class_228());
        a(class_384.bH);
        a(new class_231());
        b(e);
        a(j);
        b(i);
        b(h);
    }

    public static void a(class_253 class_253Var) {
        class_253Var.d().clear();
        class_253Var.b();
        if (class_253Var.d().size() > 0) {
            m.add(class_253Var);
        }
        if (class_253Var instanceof class_225) {
            n.add((class_225) class_253Var);
        }
        k.add(class_253Var);
    }

    public static void b(class_253 class_253Var) {
        class_253Var.d().clear();
        class_253Var.b();
        if (class_253Var.d().size() > 0) {
            m.add(class_253Var);
        }
        if (class_253Var instanceof class_225) {
            n.add((class_225) class_253Var);
        }
        l.add(class_253Var);
    }

    protected void a(int[] iArr, class_257 class_257Var) {
        for (int i2 : iArr) {
            this.p.a(i2, class_257Var);
        }
    }

    protected void a(int i2, class_257 class_257Var) {
        a(new int[]{i2}, class_257Var);
    }

    public void a(Client client, class_254 class_254Var) {
        if (!a(client)) {
            this.q = false;
        } else {
            this.q = true;
            b(client, class_254Var);
        }
    }

    public abstract void b();

    public abstract boolean a(Client client);

    public abstract void b(Client client, class_254 class_254Var);

    public abstract void c();

    public cc<class_257> d() {
        return this.p;
    }

    public boolean e() {
        return this.q;
    }
}
