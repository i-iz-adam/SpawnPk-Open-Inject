package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_561.class */
public class class_561 extends class_553 {
    @Override // rs.class_553
    public void a() {
        switch (e()) {
            case 0:
                class_420.h();
                break;
            case 1:
                class_420.o(e());
                break;
            case 2:
                class_420.e(e() == 1);
                break;
            case 3:
                class_420.a(e() == 1);
                break;
            case 4:
                int iE = e();
                if (iE == 0) {
                    class_420.j();
                } else {
                    class_420.e(g(), g(), iE == 2 ? h() : "");
                }
                break;
            case 5:
                class_420.c(h());
                break;
            case 6:
                Widget.l(36026).be = e() == 1;
                break;
            case 7:
                class_420.k();
                break;
            case 8:
                class_420.f(e() == 1);
                break;
            case 9:
                Widget.l(36002).as = h();
                break;
            case 10:
                Widget.l(36003).as = h();
                break;
            case 11:
                Widget.l(36019).as = h();
                class_494 class_494VarB = class_420.c.b(36019);
                int i = Widget.l(36019).as.contains("\\n") ? 288 : 293;
                if (class_494VarB.g() != i) {
                    class_494VarB.a(class_494VarB.f(), i);
                    class_420.c.a();
                }
                break;
            case 12:
                int iE2 = e();
                for (int i2 = 0; i2 < 5; i2++) {
                    if (i2 + 1 > iE2) {
                        class_420.bP[i2] = null;
                    } else {
                        class_420.bP[i2] = h();
                    }
                }
                break;
            case 13:
                class_420.b(h());
                break;
            case 14:
                class_420.m(e());
                break;
            case 15:
                class_420.d(e() == 1);
                break;
            case 16:
                class_420.i();
                break;
            case 17:
                Widget.l(36026).V = 0;
                break;
            case 18:
                class_420.c(e() == 1);
                break;
            case 19:
                class_420.g(e(), e());
                break;
            case 20:
                class_420.bH = e() == 1;
                break;
            case 21:
                class_420.n(e());
                break;
            case 22:
                int iC = c();
                int iG = g();
                int iG2 = g();
                class_420.l(36025).ax[iC] = iG + 1;
                class_420.l(36025).av[iC] = iG2;
                break;
            case 23:
                int iE3 = e();
                for (int i3 = 0; i3 < 5; i3++) {
                    if (i3 + 1 > iE3) {
                        class_420.bQ[i3] = null;
                    } else {
                        class_420.bQ[i3] = h();
                    }
                }
                class_420.b(true);
                break;
            case 24:
                class_420.bI = c();
                break;
            case 25:
                class_420.bJ = c();
                break;
        }
    }
}
