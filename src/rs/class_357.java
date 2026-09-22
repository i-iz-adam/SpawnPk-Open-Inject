package rs;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: client-final.jar:rs/class_357.class */
public abstract class class_357 extends class_354 {
    public static HashSet<class_357> g = new HashSet<>();
    private boolean h;

    public static void d() {
        if (g.size() == 0) {
            return;
        }
        Iterator<class_357> it = g.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        g.clear();
    }

    public class_357(long j) {
        this.e = j;
    }

    @Override // rs.class_354
    public void c() {
        g.add(this);
    }

    public abstract void e();

    public int f() {
        return Client.hP + (Configuration.ai == class_151.a ? -526 : -10);
    }

    public int g() {
        return Client.hQ + (Configuration.ai == class_151.a ? -178 : -10);
    }
}
