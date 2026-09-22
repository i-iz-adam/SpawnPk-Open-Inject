package rs.plugins.p;

import javax.inject.Inject;
import rs.Client;
import rs.Configuration;
import rs.class_268;
import rs.class_309;

/* JADX INFO: loaded from: client-final.jar:rs/s/p/b.class */
public class b extends class_309 {
    private final a f;

    @Inject
    public b(a aVar) {
        this.f = aVar;
        a(class_268.n);
    }

    @Override // rs.class_306
    public void a() {
        if (Client.eR == null) {
            return;
        }
        boolean z = Configuration.N;
        Configuration.N = true;
        rs.ui.b.b.a().a(Client.eR, this.f.c(), this.f.a(), this.f.d());
        Configuration.N = z;
    }
}
