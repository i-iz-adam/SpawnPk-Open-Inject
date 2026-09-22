package rs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_265.class */
public class class_265 {
    private static final int b = 3;
    private static final int c = 180;
    private static final int d = 35;
    private static String e;
    public static boolean a = false;
    private static boolean f = false;
    private static class_333 g;
    private static class_333 h;
    private static class_333 i;
    private static class_333 j;
    private static class_333 k;
    private class_333 l;
    private final Client m;
    private final class_266 n;
    private final int o;
    private final int p;
    private String q;
    private long r;
    private int s;
    private int t;
    private int u;
    private final String v;

    public class_265(Client client, class_266 class_266Var, int i2) {
        this.v = class_266Var.name();
        this.m = client;
        this.n = class_266Var;
        this.o = class_266Var.ao;
        this.p = class_266Var.ap;
        this.s = i2;
        this.t = 0;
        this.q = class_266Var.an;
        this.r = System.currentTimeMillis();
        if (class_266Var.am != null) {
            this.l = new class_333(class_266Var.am);
        } else {
            this.u = class_266Var.aq;
            c();
        }
    }

    public class_265(Client client, String str, String str2, int i2, int i3) {
        this.v = str;
        this.m = client;
        this.n = class_266.a;
        this.s = i3;
        this.t = 0;
        this.u = i2;
        this.o = 4;
        this.p = 0;
        this.q = str2;
        this.r = System.currentTimeMillis();
        c();
    }

    public static void a(List<class_265> list) {
        int i2;
        a = false;
        if (list.size() == 0) {
            return;
        }
        if (!f) {
            d();
        }
        Launcher.n().o();
        int i3 = 508 + (Client.ag() ? 0 : 5);
        Launcher.n().o();
        int i4 = User32.WM_QUERYUISTATE + (Client.ag() ? 0 : 4);
        if (Configuration.ai == class_151.b) {
            i4 += Client.ah - 499;
            i3 += 8;
        }
        e = null;
        if (Configuration.aD) {
            ArrayList arrayList = new ArrayList();
            j.g(i3, i4, 180);
            i2 = i3 - 35;
            for (class_265 class_265Var : list) {
                if (class_265Var.a(i2, i4)) {
                    i2 -= 35;
                } else {
                    arrayList.add(class_265Var);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.remove((class_265) it.next());
            }
            h.b(i2 + 25, i4 + 1, 180);
        } else {
            i2 = i3 - 38;
            g.b(i2 + 25, i4, 180);
        }
        Launcher.n().o();
        int i5 = Client.hP;
        Launcher.n().o();
        int i6 = Client.hQ;
        if (i5 >= i2 + 25 && i5 <= i2 + 45 && i6 >= i4 && i6 <= i4 + 40) {
            a = true;
        }
        if (e != null) {
            Launcher.n().o().b(i5 - 55, i6 - 15, e);
        }
    }

    public boolean a(int i2, int i3) {
        i.g(i2, i3, 180);
        if (this.l == null) {
            c();
            return true;
        }
        this.l.g(i2 + this.o, i3 + this.p, 180);
        if (this.s == -1) {
            k.f(i2 + 11, i3 + 22);
        } else {
            long jCurrentTimeMillis = ((long) this.s) - ((System.currentTimeMillis() - this.r) / 1000);
            if (!class_194.a()) {
                if (jCurrentTimeMillis >= 3 && this.t != 255) {
                    this.t += 3;
                } else if (jCurrentTimeMillis < 3) {
                    if (this.t <= 0) {
                        return false;
                    }
                    this.t -= 3;
                }
            }
            String str = new SimpleDateFormat("m:ss").format(new Date(jCurrentTimeMillis * 1000));
            if (jCurrentTimeMillis >= 3600) {
                str = jCurrentTimeMillis >= 36000 ? " " + ((int) Math.floor(jCurrentTimeMillis / 3600)) + "h" : " " + ((int) Math.floor(jCurrentTimeMillis / 3600)) + "h" + (((int) Math.floor(jCurrentTimeMillis / 60)) - ((int) Math.floor((jCurrentTimeMillis / 3600) * 60))) + "m";
            }
            Client.gl.c(str, i2 + 19, i3 + 34, class_492.c, 1);
        }
        Client client = this.m;
        if (Client.hP < i2) {
            return true;
        }
        Client client2 = this.m;
        if (Client.hP > i2 + 43) {
            return true;
        }
        Client client3 = this.m;
        if (Client.hQ < i3) {
            return true;
        }
        Client client4 = this.m;
        if (Client.hQ > i3 + 34) {
            return true;
        }
        String str2 = this.q;
        if (str2 == null) {
            str2 = (this.n.name().toLowerCase().substring(0, 1).toUpperCase() + this.n.name().toLowerCase().substring(1)) + "  ";
        }
        e = " " + str2 + " ";
        return true;
    }

    public void a(int i2) {
        this.r = System.currentTimeMillis();
        this.s = i2;
    }

    private void c() {
        this.l = ItemComposition.a(this.u, 1, -1, 21);
    }

    private static void d() {
        h = new class_333("popups/timer 0");
        g = new class_333("popups/timer 1");
        i = new class_333("popups/timer 2");
        j = new class_333("popups/timer 3");
        k = new class_333("icons/infinite white", false);
        f = true;
    }

    public class_266 a() {
        return this.n;
    }

    public String b() {
        return this.v;
    }
}
