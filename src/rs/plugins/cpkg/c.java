package rs.plugins.cpkg;

import com.google.inject.Provides;
import java.util.HashMap;
import javax.inject.Inject;
import rs.Client;
import rs.ClientThread;
import rs.class_12;
import rs.class_139;
import rs.class_160;
import rs.class_313;
import rs.class_495;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.events.ConfigChanged;
import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/c.class */
@rs.plugins.e(a = "Developer Tools", b = "devtools", d = {"panel"}, h = true)
public class c extends rs.plugins.a {

    @Inject
    private Client h;

    @Inject
    private rs.ui.e i;

    @Inject
    private a j;

    @Inject
    private class_160 k;
    private e l;
    private b m;
    private f n;
    private l o;
    public static d b = null;
    public static HashMap<Integer, class_495> c = new HashMap<>();
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;

    @Override // rs.s.a
    protected void a() {
        b = new d();
        g gVar = (g) this.a.getInstance(g.class);
        this.l = (e) this.a.getInstance(e.class);
        this.m = (b) this.a.getInstance(b.class);
        this.n = (f) this.a.getInstance(f.class);
        this.k.a(this.m);
        this.o = l.a().a("Developer Tools").a(class_12.b(getClass(), "devtools_icon.png")).a(1).a(gVar).a();
        this.i.a(this.o);
        class_313.d().e().add(this.l);
        class_313.d().a(this.m);
        class_313.d().a(this.n);
        i();
        Launcher.n().p().m().setAlwaysOnTop(this.j.e());
    }

    @Override // rs.s.a
    protected void b() {
        this.i.b(this.o);
        class_313.d().e().remove(this.l);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        i();
        if (configChanged.getKey().equalsIgnoreCase("showObjectIds")) {
            ClientThread.queue(() -> {
                this.h.b();
            });
        }
        if (configChanged.getKey().equalsIgnoreCase("alwaysOnTop")) {
            Launcher.n().p().m().setAlwaysOnTop(this.j.e());
        }
    }

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    private void i() {
        d = this.j.d();
        e = this.j.a();
        f = this.j.b();
        g = this.j.k();
    }

    public e f() {
        return this.l;
    }

    public b g() {
        return this.m;
    }

    public f h() {
        return this.n;
    }
}
