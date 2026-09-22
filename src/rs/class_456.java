package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_456.class */
public class class_456 {
    private int a = 0;

    public void a() {
        class_455.d.b();
        Widget.l(32023).V = 0;
        this.a = 0;
    }

    public void a(class_457 class_457Var, String str) {
        int i = this.a;
        int i2 = 32026 + (i * 4);
        class_342.a(i2, class_455.bZ, "View inbox message").b(i2 + 1, class_455.ca).g(149, 30);
        class_455.d.a(i2).a(0, 30 * i);
        class_455.d.a(i2 + 1).a(0, 30 * i);
        class_455.d.a(class_352.a(i2 + 3, str).a()).a(3, (30 * i) + 10);
        a(i, str);
        a(i, class_457Var);
        this.a++;
    }

    public void b() {
        Widget widgetL = class_455.l(32023);
        widgetL.aF = Math.max(class_455.d.d().size() * 30, 300);
        widgetL.V = 0;
        class_455.d.a();
    }

    public void a(int i, class_457 class_457Var) {
        class_352 class_352Var = (class_352) Widget.l(32026 + (i * 4) + 3);
        class_352Var.m(class_457Var.a());
        if (class_457Var != class_457.a) {
            class_352Var.as = class_352Var.as.replace("<img=50> ", "");
        } else {
            if (class_352Var.as.contains("<img=50>")) {
                return;
            }
            class_352Var.as = "<img=50> " + class_352Var.as;
        }
    }

    public void a(int i, String str) {
        int i2 = 32026 + (i * 4) + 3;
        class_352 class_352Var = (class_352) Widget.l(i2);
        String strA = Client.gl.a(str, "", 130, 0, 1);
        class_352Var.as = strA;
        if (strA.contains("\\n")) {
            class_455.d.b(i2).a(3, (30 * i) + 3);
        } else {
            class_455.d.b(i2).a(3, (30 * i) + 10);
        }
    }

    public void a(int i, boolean z) {
        int i2 = 32026 + (i * 4);
        int i3 = 32026 + (i * 4) + 1;
        if (Widget.l(i2) == null || Widget.l(i3) == null || Widget.l(i3 + 1) == null) {
            return;
        }
        if (z) {
            Widget.l(i2).E = class_455.cb;
            Widget.l(i2).aE = class_455.cb;
            Widget.l(i3).E = class_455.cc;
            Widget.l(i3).aE = class_455.cc;
            Widget.l(i3 + 1).E = class_455.cc;
            Widget.l(i3 + 1).aE = class_455.cc;
            return;
        }
        Widget.l(i2).E = class_455.bZ;
        Widget.l(i2).aE = class_455.bZ;
        Widget.l(i3).E = class_455.ca;
        Widget.l(i3).aE = class_455.ca;
        Widget.l(i3 + 1).E = class_455.ca;
        Widget.l(i3 + 1).aE = class_455.ca;
    }

    public void c() {
        for (int i = 0; i < this.a; i++) {
            a(i, false);
        }
    }
}
