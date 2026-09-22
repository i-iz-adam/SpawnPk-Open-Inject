package rs.gui.bpkg;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import rs.gui.x;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/g.class */
public class g {
    public static final int a = 5;
    public static ConcurrentHashMap<Integer, x> b = new ConcurrentHashMap<>();
    public static ExecutorService c = Executors.newFixedThreadPool(5);
    public static rs.gui.bpkg.bpkg.b[] d = new rs.gui.bpkg.bpkg.b[5];
    private static int e;
    private x f;
    private f g;

    public static void a() {
        for (int i = 0; i < 5; i++) {
            d[i] = new rs.gui.bpkg.bpkg.b();
            c.submit(d[i]);
        }
    }

    public g(f fVar) {
        this.g = fVar;
    }

    public g(int i) {
        this.g = new f(i);
    }

    public x b() {
        if (this.f == null) {
            x xVar = b.get(Integer.valueOf(this.g.a()));
            if (xVar == null) {
                e++;
                if (e >= 5) {
                    e = 0;
                }
                d[e].a(this.g.a());
                return null;
            }
            this.f = xVar;
        }
        return this.f;
    }
}
