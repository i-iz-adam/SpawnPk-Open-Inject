package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_466.class */
public class class_466 extends class_553 {
    private class_291 d = new class_291();
    private class_292 e = new class_292();
    private class_306 f = new class_293();

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_463.m(e());
        }
        if (iE == 1) {
            class_465.a();
        }
        if (iE == 2) {
            class_465.a(e());
        }
        if (iE == 3) {
            class_465.a(e(), h(), h());
        }
        if (iE == 4) {
            class_464.a();
        }
        if (iE == 5) {
            class_464.b();
        }
        if (iE == 6) {
            class_463.dB.a(e());
        }
        if (iE == 7) {
            boolean z = e() == 1;
            Widget.l(class_463.di).bd = z;
            Widget.l(class_463.dh).bd = z;
        }
        if (iE == 15) {
            int iE2 = e();
            b();
            if (iE2 == 0) {
                b();
            } else if (iE2 != 1 && iE2 == 2) {
                class_313.d().a(this.e);
                class_313.d().a(this.f);
            }
        }
        if (iE == 16) {
        }
        if (iE == 17) {
            this.e.c(g(), g());
            this.e.b(e() == 1);
        }
        if (iE == 18) {
            int iE3 = e();
            if (iE3 == 0) {
                class_313.d().b(this.d);
            } else {
                this.d.k(false);
                this.d.c("0:00");
                if (iE3 == 1) {
                    this.d.a(System.currentTimeMillis());
                } else if (iE3 == 2) {
                    this.d.a(System.currentTimeMillis() + (((long) g()) * 1000));
                }
                class_313.d().a(this.d);
            }
        }
        if (iE == 19) {
            this.d.b(Client.a(g()));
        }
        if (iE == 20) {
            int iG = (int) ((((long) g()) * 1000) / 1000);
            this.d.c("@gre@" + String.format("%d:%02d", Integer.valueOf((iG % 3600) / 60), Integer.valueOf(iG % 60)));
            this.d.k(true);
        }
        if (iE == 21) {
            boolean z2 = class_463.dz;
            class_463.dz = e() == 1;
            if (z2 != class_463.dz) {
                class_463.m(class_463.dA);
            }
        }
        if (iE == 22) {
            String strH = e() == 0 ? "raids" : h();
            class_343 class_343Var = (class_343) Widget.l(class_463.ch);
            class_343Var.i().get(1).a("Adept (Req. 10+ " + strH + ")");
            class_343Var.i().get(2).a("Expert (Req. 50+ " + strH + ")");
            class_343Var.i().get(3).a("Master (Req. 100+ " + strH + ")");
        }
    }

    private void b() {
        if (this.e != null) {
            class_313.d().b(this.e);
        }
        if (this.f != null) {
            class_313.d().b(this.f);
        }
    }
}
