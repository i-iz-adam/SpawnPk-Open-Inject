package rs.gui.bpkg.cpkg;

import com.sun.jna.platform.win32.aU;
import rs.gui.x;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/c/c.class */
public enum c {
    a(0, 935, 100, "/assets/gui/slot_helm.png"),
    b(2, 935, 138, "/assets/gui/slot_ammy.png"),
    c(4, 935, 177, "/assets/gui/slot_chest.png"),
    d(7, 935, aU.hy_, "/assets/gui/slot_legs.png"),
    e(10, 935, 256, "/assets/gui/slot_boots.png"),
    f(1, 894, 138, "/assets/gui/slot_cape.png"),
    g(13, 976, 138, "/assets/gui/slot_arrows.png"),
    h(5, 990, 177, "/assets/gui/slot_shield.png"),
    i(3, 880, 177, "/assets/gui/slot_wep.png"),
    j(9, 880, 256, "/assets/gui/slot_gloves.png"),
    k(12, 990, 256, "/assets/gui/slot_ring.png");

    private String l;
    private x m;
    private int n;
    private int o;
    private int p;

    c(int i2, int i3, int i4, String str) {
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.l = str;
    }

    public x a() {
        if (this.m == null) {
            x xVar = new x(0);
            if (xVar.a(this.l)) {
                this.m = xVar;
            }
        }
        return this.m;
    }

    public int b() {
        return this.n;
    }

    public int c() {
        return this.o - 765;
    }

    public int d() {
        return this.p - 100;
    }

    public static c a(int i2) {
        for (c cVar : values()) {
            if (cVar.b() == i2) {
                return cVar;
            }
        }
        return null;
    }
}
