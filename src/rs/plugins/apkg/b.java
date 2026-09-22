package rs.plugins.apkg;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.ClientThread;
import rs.Configuration;
import rs.class_139;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;

/* JADX INFO: loaded from: client-final.jar:rs/s/a/b.class */
@rs.plugins.e(a = "Combat overlays", b = a.a, i = true, l = true, d = {"combat", "hits", "hit", "splat", "health", "bar"})
public class b extends rs.plugins.a {

    @Inject
    private a b;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    public void a() {
        g();
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        g();
    }

    private void g() {
        ClientThread.queue(() -> {
            Configuration.ap = this.b.f() == e.c;
            Configuration.al = this.b.g() == d.b;
            Configuration.aq = this.b.f() == e.a;
            Configuration.as = this.b.d() == c.b;
            Configuration.ar = this.b.c() == c.b;
            Configuration.aB = this.b.a();
            Configuration.at = this.b.b();
            Configuration.ak = this.b.h();
        });
    }

    public a f() {
        return this.b;
    }
}
