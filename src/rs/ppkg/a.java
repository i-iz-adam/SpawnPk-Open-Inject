package rs.ppkg;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.File;
import java.util.Collection;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.class_139;
import rs.class_19;
import rs.class_667;
import rs.eventbus.EventBus;
import rs.gui.Launcher;
import rs.plugins.g;
import rs.ui.f;

/* JADX INFO: loaded from: client-final.jar:rs/p/a.class */
@Singleton
public class a {
    private static final Logger d = LoggerFactory.getLogger((Class<?>) a.class);
    public static final File a = new File(System.getProperty("user.home"), ".spawnpk-data");
    public static final File b = new File(a, "plugins");
    public static final File c = new File(a, "screenshots");
    private static Injector e;

    @Inject
    private g f;

    @Inject
    private EventBus g;

    @Inject
    private class_667 h;

    @Inject
    private f i;

    @Inject
    private class_139 j;

    @Inject
    private Client k;

    public static void a() {
        e = Guice.createInjector(new b());
        Launcher.a((Launcher) e.getInstance(Launcher.class));
        try {
            ((a) e.getInstance(a.class)).b();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public void b() {
        this.j.a();
        this.f.b();
        this.f.b((Collection<rs.plugins.a>) null);
        this.i.a();
        this.g.register(this.i);
        this.g.register(this.f);
        this.g.register(this.j);
        this.f.a();
        this.i.b();
        class_19.a(e);
        class_19.a();
    }

    public static Injector c() {
        return e;
    }

    public Client d() {
        return this.k;
    }
}
