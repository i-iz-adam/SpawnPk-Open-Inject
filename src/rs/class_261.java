package rs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_261.class */
public class class_261 {
    private class_260 a = null;
    private List<class_260> b = new ArrayList();
    private Client c;

    public class_261(Client client) {
        this.c = client;
    }

    public void a() {
        if (this.a == null) {
            if (this.b.isEmpty()) {
                return;
            }
            this.a = new class_260(this.b.get(0).a);
            this.b.remove(0);
            return;
        }
        if (this.a.b <= (-1) * this.c.gm.c(this.a.a)) {
            this.a = null;
            return;
        }
        this.a.b--;
        this.c.gm.b(this.a.a, this.a.b, this.a.c, class_492.c, 0);
    }

    public void a(String str) {
        this.b.add(new class_260(str));
    }
}
