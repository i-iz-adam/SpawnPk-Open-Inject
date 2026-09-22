package rs;

import java.awt.Graphics;
import java.util.Iterator;
import rs.gui.Launcher;
import rs.lpkg.b;
import rs.lpkg.e;
import rs.runelite.a.c;
import rs.runelite.events.GameStateChanged;

/* JADX INFO: loaded from: client-final.jar:rs/class_194.class */
public class class_194 {
    public static boolean a = true;
    public static boolean b = false;
    public static int c = 0;
    public static int d = 0;
    private static long e = System.currentTimeMillis();
    private static int f = 0;

    public static void a(Client client) {
        class_313.d().b();
        client.menuType = -1;
        if (b()) {
            if (client.ck != 0) {
                client.ck = 0;
            }
            if (!b || d != Client.ah || c != Client.ai) {
                if (Configuration.ai == class_151.a) {
                    Client.aj = Client.ai;
                    Client.ak = Client.ah;
                    client.i();
                    client.j();
                }
                c = Client.ai;
                d = Client.ah;
                client.gZ = new class_330(Client.ai, Client.ah, client.z());
                client.gZ.a();
                b = true;
            }
            if (a()) {
                return;
            }
            if (Client.ee == 2) {
                if (Client.cH != -1) {
                    client.j(client.dE, Client.cH);
                }
                if (!a()) {
                    Client.gg++;
                }
                int i = class_332.A;
                ColorUtility.bt = true;
                ColorUtility.bw = 0;
                ColorUtility.bu = Client.hP + (Client.ah() ? 4 : 0);
                ColorUtility.bv = Client.hQ + (Client.ah() ? 4 : 0);
                class_210.d();
                if (e.a()) {
                    client.b.a();
                }
                client.gZ.a();
                client.dF.d();
                client.ga = true;
                class_253.o = 0;
                Iterator<class_253> it = class_253.k.iterator();
                while (it.hasNext()) {
                    it.next().a(client, class_254.a);
                }
                client.a(0, Client.ah() ? e.a() ? 0 : 0 : (Client.ai / 2) - 356, Widget.H[Client.cH], Client.ah() ? e.a() ? 0 : 0 : (Client.ah / 2) - 255);
                client.f(i);
                class_253.o = 0;
                Iterator<class_253> it2 = class_253.k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(client, class_254.b);
                }
                class_253.o = 0;
                Iterator<class_253> it3 = class_253.l.iterator();
                while (it3.hasNext()) {
                    it3.next().a(client, class_254.b);
                }
                if (Client.w.b) {
                    Client.w.b();
                }
                if (Client.dj) {
                    client.b(0, 0);
                } else {
                    client.F();
                    client.V();
                }
                client.dE = 0;
                class_313.d().a(class_268.A);
            }
            client.ck++;
            Graphics graphics = e.a() ? client.z().getGraphics() : client.hG;
            if (client.gZ != null && graphics != null) {
                client.gZ.a(client.ac(), client.hG, client.ad());
                if (e.a()) {
                    int iAi = client.ai();
                    client.gamePulse(0);
                    client.a.g();
                    client.gamePulse(iAi);
                }
            }
            class_313.d().c();
            return;
        }
        if (b) {
            if (Configuration.ai == class_151.a) {
                Client.aj = 512;
                Client.ak = 334;
                client.i();
                client.j();
            }
            b = false;
        }
        if (client.ck != 0) {
            client.ck = 0;
        }
        if (Client.ee < 2) {
            client.a(1, "Loading, please wait..", (String) null);
            client.gZ.a(0, client.hG, 0);
            if (e.a()) {
                client.a.b(false);
                return;
            }
            return;
        }
        if (!client.cd) {
            if (e.a()) {
                e eVar = client.a;
                e.a(true);
                if (b.i && b.g != 0 && b.h != 0 && !Client.ag()) {
                    b.f();
                }
            }
            client.cd = true;
            GameStateChanged gameStateChanged = new GameStateChanged();
            gameStateChanged.setGameState(c.g);
            client.eventBus.post(gameStateChanged);
        }
        if (client.ga) {
            client.ga = false;
            Client.fM = true;
            Client.menuIndex = true;
            if (Client.ee != 2) {
            }
        }
        if (client.fu != -1) {
            client.j(client.dE, client.fu);
        }
        if (Client.ee == 2) {
            class_332.x = client.bx;
        }
        client.O();
        if (client.gp == -1) {
            client.eu.V = (Client.fA - Client.eD) - 110;
            if (Client.hP >= 496 && Client.hP <= 511) {
                if (Client.hQ > (Configuration.ai == class_151.a ? 345 : Client.ah - 158)) {
                    client.a(494, 110, Client.hP, Client.hQ - (Configuration.ai == class_151.a ? 345 : Client.ah - 158), client.eu, 0, false, Client.fA);
                }
            }
            int i2 = (Client.fA - 110) - client.eu.V;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 > Client.fA - 110) {
                i2 = Client.fA - 110;
            }
            if (Client.eD != i2) {
                Client.eD = i2;
                Client.fM = true;
            }
        }
        if (client.gp != -1 && !class_471.c && client.gp == 35112) {
            class_471.c = true;
            Widget.H[39002].E = class_394.c;
        }
        if (client.gp != -1 && client.j(client.dE, client.gp)) {
            Client.fM = true;
        }
        if (client.fX == 3) {
            Client.fM = true;
        }
        if (client.eA == 3) {
            Client.fM = true;
        }
        if (client.cD != null) {
            Client.fM = true;
        }
        if (Client.dj && client.dH == 2) {
            Client.fM = true;
        }
        if (Client.fM) {
            client.g();
            Client.fM = false;
        }
        if (Client.ee == 2) {
            class_208.a(client);
        } else {
            client.W();
        }
        if (!Client.ag()) {
            if (class_207.a == null || class_207.b == null) {
                class_207.a = new class_333("gameframe/backleft1");
                class_207.b = new class_333("gameframe/backtop1");
            }
            class_207.a.f(0, 4);
            class_207.b.f(-4, 0);
        }
        if (client.er != -1) {
            Client.menuIndex = true;
        }
        if (Client.menuIndex) {
            if (client.er != -1 && client.er == Client.fL) {
                client.er = -1;
                Client.fv.a(120);
                Client.fv.b(Client.fL);
            }
            Client.menuIndex = false;
        }
        client.dE = 0;
        class_313.d().a(class_268.A);
        client.gZ.a(client.ac(), client.hG, client.ad());
        if (e.a()) {
            client.a.g();
        }
        class_313.d().c();
    }

    public static boolean a() {
        return Launcher.n().o().as() && !Launcher.n().o().aZ();
    }

    public static boolean b() {
        return a && Client.cH > 0 && Widget.H[Client.cH].bn;
    }
}
