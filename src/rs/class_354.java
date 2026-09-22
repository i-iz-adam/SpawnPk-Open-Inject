package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_354.class */
public abstract class class_354 {
    public static List<class_359> a = new ArrayList();
    public static class_359<class_357> b = a(new class_359());
    public static class_359<class_355> c = a(new class_359());
    public static class_359<class_358> d = a(new class_359());
    protected long e;
    protected long f;

    public static <T> class_359 a(class_359 class_359Var) {
        a.add(class_359Var);
        return class_359Var;
    }

    public static void a() {
        Iterator<class_359> it = a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void b() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f;
        if (this.e == 0 || jCurrentTimeMillis >= this.e) {
            c();
            this.f = System.currentTimeMillis();
        }
    }

    public abstract void c();
}
