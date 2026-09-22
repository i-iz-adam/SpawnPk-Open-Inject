package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_391.class */
class class_391 extends class_553 {
    class_391() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_390.h();
        }
        if (iE == 1) {
            class_390.a(g(), g(), e() == 1);
        }
        if (iE == 2) {
            int iE2 = e();
            Widget.l(6181).as = "";
            Widget.l(6182).as = "";
            Widget.l(6183).as = "";
            Widget.l(6184).as = "";
            if (iE2 == 1) {
                Widget.l(6183).as = h();
                class_494 class_494VarB = class_390.d.b(6183);
                class_494VarB.a(class_494VarB.f(), class_494VarB.g() - 5);
                class_390.d.a();
            } else if (iE2 == 2) {
                Widget.l(6182).as = h();
                Widget.l(6183).as = h();
                for (int i = 6182; i <= 6183; i++) {
                    class_494 class_494VarB2 = class_390.d.b(i);
                    class_494VarB2.a(class_494VarB2.f(), class_494VarB2.g() + 3);
                }
                class_390.d.a();
            } else if (iE2 == 3) {
                Widget.l(6181).as = h();
                Widget.l(6182).as = h();
                Widget.l(6183).as = h();
                for (int i2 = 6181; i2 <= 6183; i2++) {
                    class_494 class_494VarB3 = class_390.d.b(i2);
                    class_494VarB3.a(class_494VarB3.f(), class_494VarB3.g() + 10);
                }
                class_390.d.a();
            } else if (iE2 == 4) {
                Widget.l(6181).as = h();
                Widget.l(6182).as = h();
                Widget.l(6183).as = h();
                Widget.l(6184).as = h();
            }
        }
        if (iE == 3) {
            int iG = g();
            int i3 = 0;
            int i4 = 0;
            if (Configuration.ai == class_151.b) {
                i3 = (Client.ai / 2) - 356;
                i4 = (Client.ah / 2) - 230;
            }
            switch (iG) {
                case -1:
                    class_313.d().g().a(5, 88 + i3, 419 + i4, 16733525, 200);
                    class_313.d().g().a(5, 88 + i3, 419 + i4, 2621184, 200);
                    class_313.d().g().a(5, 88 + i3, 419 + i4, 65535, 200);
                    class_313.d().g().a(10, 88 + i3, 419 + i4, 16770304, 200);
                    break;
                default:
                    class_313.d().g().b(20, 88 + i3, 419 + i4, iG);
                    break;
            }
        }
        if (iE == 4) {
            class_390.m(g());
        }
    }
}
