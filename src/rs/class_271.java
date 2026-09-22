package rs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_271.class */
public class class_271 extends class_306 {
    private static final int e = 3;
    private class_269 f = null;
    private List<class_269> g = new ArrayList();

    public class_271() {
        a(class_268.v);
    }

    @Override // rs.class_306
    public void a() {
        if (this.f == null) {
            if (this.g.size() <= 0) {
                return;
            }
            this.f = this.g.get(this.g.size() - 1);
            this.f.a(System.currentTimeMillis());
            this.g.remove(this.g.size() - 1);
        }
        this.f.a();
        if (System.currentTimeMillis() - this.f.e() >= 5000) {
            this.f = null;
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f == null) {
            this.f = new class_269(str, str2, str3);
        } else {
            b(str, str2, str3);
        }
    }

    public void b(String str, String str2, String str3) {
        for (class_269 class_269Var : this.g) {
            if (class_269Var.b().equals(str) && class_269Var.c().equals(str2) && class_269Var.d().equals(str3)) {
                return;
            }
        }
        if (this.g.size() >= 3) {
            this.g.remove(0);
        }
        this.g.add(new class_269(str, str2, str3));
    }
}
