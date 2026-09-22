package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_405.class */
class class_405 extends class_553 {
    class_405() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_404.bH = 10;
            class_404.bG = 0;
            class_404.g = 40405;
            for (int i = 0; i < 50; i++) {
                Widget.H[40405 + i].an = class_404.e[0];
                Widget.H[40405 + i].as = "";
            }
        }
        if (iE == 1) {
            class_404.b(e(), h(), e() == 1);
        }
        if (iE == 2) {
            class_404.k(c(), h());
        }
    }
}
