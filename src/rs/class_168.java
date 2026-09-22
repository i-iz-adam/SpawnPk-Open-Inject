package rs;

import java.awt.event.KeyEvent;

/* JADX INFO: loaded from: client-final.jar:rs/class_168.class */
public class class_168 {
    private int a;
    private String b;
    private Client c;
    private boolean d;

    public class_168(Client client) {
        this.c = client;
    }

    public void a(KeyEvent keyEvent) {
        this.a = this.c.gp;
        int i = Client.cH;
        int keyCode = keyEvent.getKeyCode();
        keyEvent.isControlDown();
        boolean z = i == 23000;
        if (e()) {
            if (keyCode == 77) {
                a("::tm");
            }
            if (!c() && keyCode == 72) {
                a("::home");
            }
            if (!c() && keyCode == 84) {
                a("::opentp");
            }
            if (keyCode == 76 && !d()) {
                a("::loot");
            }
            if (keyCode == 66 && !z) {
                a("::bank");
            }
            if (keyCode == 67 && !c() && !d() && !z) {
                a("::clogs");
            }
            if (keyCode == 69 && !c() && !d()) {
                a("::e");
            }
            if (keyCode != 83 || z) {
                return;
            }
            Client.fL = 13;
            Client client = this.c;
            Client.fb = true;
            Client client2 = this.c;
            Client.fM = true;
            this.c.gb = false;
            this.c.fN = 3;
            this.c.dY = "";
        }
    }

    public void b(KeyEvent keyEvent) {
        this.a = this.c.gp;
        int i = Client.cH;
        int keyCode = keyEvent.getKeyCode();
        if (i != 23000 || c()) {
            return;
        }
        if (e() && keyCode == 83) {
            class_473.a(this.c);
            return;
        }
        if (e() && keyCode == 68) {
            a(38976);
            a(26012);
            a(26016);
        } else if (e() && keyCode == 82) {
            a(5294);
        } else if (e() && keyCode == 67) {
            a(38980);
        }
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(int i) {
        Client.fv.a(185);
        Client.fv.d(i);
    }

    public void a() {
        if (this.b == null) {
            return;
        }
        b(this.b);
        this.b = null;
    }

    private void b(String str) {
        Client.fv.a(103);
        Client.fv.b(str.length() - 1);
        Client.fv.a(str.substring(2));
    }

    private boolean c() {
        return this.a > 0;
    }

    private boolean d() {
        return Client.cH > 0;
    }

    private boolean e() {
        return Client.ch || System.currentTimeMillis() - Client.ci < 100;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }
}
