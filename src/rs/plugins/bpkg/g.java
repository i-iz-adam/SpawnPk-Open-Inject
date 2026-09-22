package rs.plugins.bpkg;

import javax.inject.Inject;
import javax.inject.Provider;
import rs.class_12;
import rs.class_139;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/g.class */
@rs.plugins.e(a = "Configuration", b = "configs", i = true, g = true)
public class g extends rs.plugins.a {

    @Inject
    private rs.ui.e b;

    @Inject
    private Provider<q> c;

    @Inject
    private Provider<w> d;

    @Inject
    private class_139 e;
    private w f;
    private rs.ui.l g;

    @Override // rs.s.a
    protected void a() {
        this.f = this.d.get();
        this.g = rs.ui.l.a().a("Configuration").a(class_12.b(getClass(), "config_icon.png")).a(3).a(this.f).a();
        this.b.a(this.g);
    }

    @Override // rs.s.a
    protected void b() {
        this.b.b(this.g);
    }
}
