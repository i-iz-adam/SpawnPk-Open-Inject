package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_287.class */
public class class_287 extends class_553 {
    private static class_285 d;

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            d.b();
            return;
        }
        if (iE != 1) {
            if (iE == 2) {
                d.a(c());
                return;
            }
            return;
        }
        d.a(c(), c(), c(), c(), c());
    }

    public static class_285 b() {
        return d;
    }

    public static void a(class_285 class_285Var) {
        d = class_285Var;
    }
}
