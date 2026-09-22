package rs.plugins.p;

import javax.inject.Inject;
import rs.class_268;
import rs.class_308;

/* JADX INFO: loaded from: client-final.jar:rs/s/p/c.class */
public class c extends class_308 {
    private final a i;

    @Inject
    public c(a aVar) {
        this.i = aVar;
        a(class_268.e);
    }

    @Override // rs.class_306
    public void a() {
        if ((this.e == null || this.e.aG != null) && this.e.aG.h) {
            if (this.e.k() || this.e.j()) {
                rs.ui.b.b.a().a(this.e, this.i.c(), this.i.a(), this.i.d());
            }
        }
    }
}
