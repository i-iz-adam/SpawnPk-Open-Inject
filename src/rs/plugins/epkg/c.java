package rs.plugins.epkg;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.ClientThread;
import rs.Configuration;
import rs.class_12;
import rs.class_139;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.events.ConfigChanged;
import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/s/e/c.class */
@rs.plugins.e(a = "GPU Mode (Beta)", b = d.a, c = "Enhance the graphics and performance of the game", d = {"panel"}, i = true, k = true)
public class c extends rs.plugins.a {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) c.class);

    @Inject
    private rs.ui.e c;

    @Inject
    private d d;

    @Inject
    private Client e;
    private l f;
    private b g;

    @Provides
    d a(class_139 class_139Var) {
        return (d) class_139Var.a(d.class);
    }

    @Override // rs.s.a
    protected void a() {
        BufferedImage bufferedImageB = class_12.b(getClass(), "gpu_icon.png");
        this.g = (b) this.a.getInstance(b.class);
        this.f = l.a().a("GPU Mode").a(bufferedImageB).a(1).a(this.g).a();
        this.c.a(this.f);
        Configuration.Q = this.d.a();
        rs.lpkg.b.b = this.d.c();
        rs.lpkg.b.i = this.d.d();
        rs.lpkg.b.j = this.d.e();
        rs.lpkg.b.c = this.d.g();
        rs.lpkg.b.e = this.d.h();
        rs.lpkg.b.k = this.d.f().b();
        rs.lpkg.b.f = this.d.b();
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getGroup().equals(d.a)) {
            ClientThread.queue(() -> {
                boolean z = Configuration.Q;
                boolean z2 = rs.lpkg.b.i;
                boolean z3 = rs.lpkg.b.j;
                Configuration.Q = this.d.a();
                rs.lpkg.b.b = this.d.c();
                rs.lpkg.b.i = this.d.d();
                rs.lpkg.b.j = this.d.e();
                rs.lpkg.b.c = this.d.g();
                rs.lpkg.b.e = this.d.h();
                rs.lpkg.b.k = this.d.f().b();
                rs.lpkg.b.f = this.d.b();
                rs.lpkg.b.d = this.d.i();
                if (this.e.fc) {
                    if (Configuration.Q && !z) {
                        rs.lpkg.b.b();
                    }
                    if (!Configuration.Q && z) {
                        rs.lpkg.b.c();
                    }
                    if (!rs.lpkg.b.i || Client.ag()) {
                        return;
                    }
                    if (rs.lpkg.b.i != z2) {
                        if (rs.lpkg.b.i) {
                            SwingUtilities.invokeLater(rs.l.b::f);
                        } else {
                            SwingUtilities.invokeLater(() -> {
                                Launcher.n().p().a(765, 503);
                            });
                        }
                    }
                    if (rs.lpkg.b.j != z3) {
                        this.e.aY();
                    }
                }
            });
            if (configChanged.getKey().equals("vsyncMode")) {
                ClientThread.queue(() -> {
                    rs.lpkg.b.b = this.d.c();
                    this.e.a.e();
                });
            }
        }
    }
}
