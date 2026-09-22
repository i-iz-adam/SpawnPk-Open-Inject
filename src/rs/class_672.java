package rs;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_672.class */
public class class_672 {
    private Map<String, class_670> a = new HashMap();

    public boolean a(String str, long j) {
        if (a(str)) {
            return false;
        }
        class_669 class_669Var = new class_669(j);
        class_669Var.a();
        this.a.put(str, class_669Var);
        return true;
    }

    public void b(String str, long j) {
        this.a.remove(str);
        a(str, j);
    }

    public boolean a(String str) {
        if (this.a.get(str) == null) {
            return false;
        }
        return this.a.get(str).b();
    }

    public long b(String str) {
        if (this.a.get(str) == null) {
            return 0L;
        }
        return this.a.get(str).c();
    }

    public void c(String str) {
        this.a.remove(str);
    }

    public void a() {
        this.a.clear();
    }

    public Map<String, class_670> b() {
        return this.a;
    }
}
