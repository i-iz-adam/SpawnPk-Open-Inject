package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_91.class */
public class class_91 {
    private final class_92 a = new class_86();
    private final class_92 b = new class_89();
    private final class_92 c = new class_88();
    private final List<class_92> d = new ArrayList();
    private Client e;

    public class_91(Client client) {
        this.e = client;
        this.d.add(this.a);
        this.d.add(this.b);
        this.d.add(this.c);
        Iterator<class_92> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(client);
        }
    }

    public boolean a() {
        this.e.G = new class_220(this.e);
        Client client = this.e;
        Client.gl = new class_324(false, "assets/", "assets/p11_full");
        this.e.gm = new class_324(false, "assets/", "assets/p12_full");
        this.e.a(0, "Please wait, checking assets..");
        new Thread(this.e.G).start();
        if (!a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            b(this.b);
            return false;
        }
        this.e.cf = true;
        if (Launcher.n() != null) {
        }
        if (!a(this.a)) {
            this.a.c().add(0, "Error with the cache updater!");
            b(this.a);
            return false;
        }
        if (!a(this.b)) {
            this.b.c().add(0, "Error with the sprite updater!");
            b(this.b);
            return false;
        }
        if (a(this.c)) {
            return true;
        }
        this.c.c().add(0, "Error with configuration updater!");
        b(this.c);
        return false;
    }

    public boolean b() {
        for (class_92 class_92Var : this.d) {
            if (class_92Var.b().c() != class_92Var.b().b()) {
                return true;
            }
        }
        return false;
    }

    public boolean a(class_92 class_92Var) {
        double dC = class_92Var.b().c();
        double dB = class_92Var.b().b();
        if (dB == -1.0d) {
            class_92Var.a(class_90.a);
            return false;
        }
        if (dC == dB) {
            return true;
        }
        System.out.println("Updating outdated game asset: " + class_92Var.d());
        if (class_92Var.a()) {
            return class_92Var.b().a();
        }
        return false;
    }

    public void b(class_92 class_92Var) {
        Iterator<String> it = class_92Var.c().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public class_92 c() {
        return this.a;
    }

    public class_92 d() {
        return this.b;
    }

    public class_92 e() {
        return this.c;
    }
}
