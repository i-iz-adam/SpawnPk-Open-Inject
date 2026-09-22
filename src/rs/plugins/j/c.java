package rs.plugins.j;

import com.google.inject.Provides;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.ClientThread;
import rs.class_139;
import rs.class_160;
import rs.eventbus.Subscribe;
import rs.runelite.events.GameStateChanged;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/j/c.class */
@e(a = "Key Remapping", b = "keyRemapping", c = "Allows use of WASD keys for camera movement with 'Press Enter to Chat'", d = {"enter", "chat", "wasd", a.a}, f = false)
public class c extends rs.plugins.a {
    private boolean b;

    @Inject
    private class_160 c;

    @Inject
    private b d;

    @Inject
    private Client e;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        this.b = false;
        this.c.a(this.d);
        ClientThread.queue(() -> {
            if (this.e.fc) {
                f();
            }
        });
    }

    @Override // rs.s.a
    protected void b() {
        this.c.b(this.d);
        ClientThread.queue(() -> {
            if (this.e.fc) {
                g();
            }
        });
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.g) {
            f();
        }
    }

    public void f() {
        Client client = this.e;
        Client.dk = "";
        this.e.dl = "Press Enter to Chat...";
        SwingUtilities.invokeLater(() -> {
            a(false);
        });
    }

    public void g() {
        this.e.dl = null;
        SwingUtilities.invokeLater(() -> {
            a(true);
        });
    }

    public boolean h() {
        Client client = this.e;
        if (Client.w != null) {
            Client client2 = this.e;
            if (Client.w.b) {
                return false;
            }
        }
        return (this.e.gp == -1 || this.e.gp == 4882 || this.e.gp == 4887 || this.e.gp == 4893 || this.e.gp == 4900 || this.e.gp == 2459 || this.e.gp == 2469 || this.e.gp == 2480 || this.e.gp == 2492 || this.e.gp == 6179) && !this.e.gb && this.e.fN == 0 && this.e.cc && this.e.cd && this.e.fc;
    }

    public boolean i() {
        return this.e.gb || this.e.fN > 0 || this.e.gp > -1;
    }

    boolean j() {
        return this.b;
    }

    void a(boolean z) {
        this.b = z;
    }
}
