package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_373.class */
class class_373 extends class_553 {
    class_373() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_371.g.clear();
            int unused = class_371.f = 0;
        }
        if (iE == 1) {
            String strH = h();
            int iE2 = e();
            String[] strArr = new String[iE2];
            for (int i = 0; i < iE2; i++) {
                strArr[i] = h();
            }
            class_371.b(strH, strArr, g(), g(), d());
        }
        if (iE == 2) {
            class_371.j();
        }
    }
}
