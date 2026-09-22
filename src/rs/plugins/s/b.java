package rs.plugins.s;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.Client;
import rs.ClientThread;
import rs.Npc;
import rs.Player;
import rs.class_139;
import rs.class_303;
import rs.class_313;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.a.g;
import rs.runelite.events.ConfigChanged;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/s/b.class */
@e(a = "Hover Descriptions", b = "hoverdesc", i = true)
public class b extends rs.plugins.a {

    @Inject
    private a s;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static int p;
    public static int q;
    public static int r;
    private static final class_303 t = new class_303("", false);

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    public void a() {
        b = true;
        g();
    }

    @Override // rs.s.a
    public void b() {
        b = false;
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        ClientThread.queue(this::g);
    }

    private void g() {
        p = this.s.a().getRGB();
        q = this.s.b().getRGB();
        r = this.s.c().getRGB();
        c = this.s.d();
        d = this.s.e();
        e = this.s.l();
        i = this.s.f();
        f = this.s.g();
        g = this.s.h();
        h = this.s.i();
        j = this.s.j();
        k = this.s.k();
        l = this.s.m();
        n = this.s.o();
        m = this.s.n();
        o = this.s.p();
    }

    public static void f() {
        Npc npc;
        String str;
        Player player;
        if (Client.dj || Client.cH > 0) {
            return;
        }
        Client clientO = Launcher.n().o();
        int i2 = clientO.eV - 1;
        if (i2 < 0) {
            return;
        }
        int i3 = clientO.localPlayer[i2];
        if (clientO.fx[i2] == null) {
            return;
        }
        boolean z = Client.ed == 197;
        if (e && z) {
            return;
        }
        if (l && g.b(i3)) {
            int i4 = clientO.eJ[i2];
            if (i4 < 0 || i4 >= Client.doField.length || (player = Client.doField[i4]) == null || player.o() == null) {
                return;
            }
            t.a(clientO.fx[i2]);
            t.a(false);
            class_313.d().f().a(t);
        }
        if (g.a(i3)) {
            int i5 = clientO.eJ[i2];
            if (i5 < 0 || i5 >= clientO.cA.length || (npc = clientO.cA[i5]) == null || npc.aG == null) {
                return;
            }
            if (m || npc.aG.Y) {
                if (npc.aG.X != null) {
                    str = npc.aG.X;
                    t.a(npc.aG.Z);
                } else {
                    str = clientO.fx[i2];
                    t.a(false);
                }
                t.a(str);
                class_313.d().f().a(t);
            }
        }
        if (n && g.c(i3)) {
            if (clientO.a(clientO.eF[i2], clientO.eG[i2], Client.dw, clientO.eJ[i2]) != null) {
                t.a(clientO.fx[i2]);
                t.a(false);
                class_313.d().f().a(t);
            }
        }
    }
}
