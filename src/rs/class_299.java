package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_299.class */
public class class_299 extends class_553 {
    @Override // rs.class_553
    public void a() {
        class_300 class_300Var;
        int iE = e();
        if (iE == 0) {
            class_297.m();
        }
        if (iE == 1) {
            int iG = g();
            int iE2 = e();
            int iC = c();
            int iC2 = c();
            boolean z = e() == 1;
            switch (iE2) {
                case 1:
                    class_300Var = class_300.c;
                    break;
                case 2:
                    class_300Var = class_300.d;
                    break;
                case 3:
                    class_300Var = class_300.a;
                    break;
                default:
                    class_300Var = class_300.b;
                    break;
            }
            class_297.a(iG, class_300Var, iC, iC2);
            if (class_297.l() && z) {
                class_297.k().b(true);
            }
        }
        if (iE == 3) {
            class_302 class_302Var = null;
            switch (e()) {
                case 0:
                    class_302Var = null;
                    break;
                case 1:
                    class_302Var = class_302.a;
                    break;
                case 2:
                    class_302Var = class_302.b;
                    break;
                case 3:
                    class_302Var = class_302.c;
                    break;
                case 4:
                    class_302Var = class_302.d;
                    break;
                case 5:
                    class_302Var = class_302.e;
                    break;
                case 6:
                    class_302Var = class_302.f;
                    break;
            }
            class_297.a(class_302Var);
        }
        if (iE == 4) {
            int iG2 = g();
            class_297.k();
            class_297.a(iG2);
        }
    }
}
