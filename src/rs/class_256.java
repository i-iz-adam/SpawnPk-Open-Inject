package rs;

import com.sun.jna.platform.win32.aU;
import java.util.ArrayList;
import java.util.List;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_256.class */
public class class_256 {
    private static final int c = 460;
    private static final int d = 30;
    public final List<class_255> a = new ArrayList();
    public final List<class_255> b = new ArrayList();
    private final List<class_255> e = new ArrayList();
    private class_333 f = new class_333("popups/drop bar");
    private Client g;
    private int h;
    private long i;

    public class_256(Client client) {
        this.g = client;
    }

    public void a(int i, long j) {
        a(i, j, 0);
    }

    public void a(int i, long j, int i2) {
        class_255 class_255Var = new class_255(i, 1);
        class_255Var.g = c;
        class_255Var.h = 15;
        class_255Var.m = j;
        class_255Var.l = i2;
        if (System.currentTimeMillis() - this.i < 100 && !this.a.isEmpty()) {
            this.a.get(this.a.size() - 1).i += i;
            this.a.get(this.a.size() - 1).f = this.a.get(this.a.size() - 1).i == 0 ? new class_333("popups/block drop") : new class_333("popups/hit drop");
            return;
        }
        if (b()) {
            this.a.add(class_255Var);
            this.h += i;
            this.i = System.currentTimeMillis();
        } else {
            if (this.b.size() > 5) {
                this.b.remove(0);
            }
            this.b.add(class_255Var);
        }
    }

    public void a() {
        int i;
        if (b()) {
            class_255 class_255Var = this.b.size() > 0 ? this.b.get(0) : null;
            if (class_255Var != null) {
                this.b.remove(class_255Var);
                this.a.add(class_255Var);
                this.h += class_255Var.i;
            }
        }
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            class_255 class_255Var2 = this.a.get(i2);
            class_255Var2.a();
            if (Configuration.ai == class_151.b) {
                Client client = this.g;
                i = Client.ai - aU.ie;
            } else {
                i = 0;
            }
            int i3 = i;
            Launcher.n().o();
            int i4 = i3 + (Client.ag() ? 0 : 4);
            Launcher.n().o();
            int i5 = Client.ag() ? 0 : 0;
            if (this.g.v.f()) {
                class_255Var2.f.g(class_255Var2.g + 24 + i4, class_255Var2.h - 1, class_255Var2.k);
                if (class_255Var2.l > 0) {
                    class_333 class_333Var = class_255Var2.l == 1 ? class_255.c : class_255Var2.l == 2 ? class_255.d : class_255.e;
                    if (class_255Var2.i == 0) {
                        class_333Var.g(((class_255Var2.g + 24) + i4) - 30, class_255Var2.h - 4, class_255Var2.k);
                    } else {
                        class_333Var.g(((class_255Var2.g + 24) + i4) - 30, class_255Var2.h - 2, class_255Var2.k);
                    }
                }
            }
            int i6 = class_255Var2.i == 0 ? 35 : 35;
            int i7 = class_255Var2.i == 0 ? 14 : 15;
            if (this.g.v.f()) {
                Client.gl.d(Integer.toString(class_255Var2.i), class_255Var2.g + i6 + i4, class_255Var2.h + i7 + i5, class_492.c, class_255Var2.i > 0 ? 3407872 : 100, class_255Var2.k);
            }
            if (255.0d - (((double) class_255Var2.h) * 1.05d) <= -10.0d) {
                this.e.add(class_255Var2);
            }
        }
        if (this.e.size() > 0) {
            for (int i8 = 0; i8 < this.e.size(); i8++) {
                this.a.remove(this.e.get(i8));
            }
            this.e.clear();
        }
    }

    private boolean b() {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).h <= 65) {
                return false;
            }
        }
        return true;
    }
}
