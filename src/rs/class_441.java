package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_441.class */
class class_441 extends class_553 {
    class_441() {
    }

    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_442.k = 0;
            class_442.j = 0;
        }
        if (iE == 1) {
            int iE2 = e();
            int iMax = Math.max(Math.min(c(), class_442.h), 0);
            switch (iE2) {
                case 0:
                    class_442.j = iMax;
                    break;
                case 1:
                    class_442.k = iMax;
                    break;
            }
        }
        if (iE == 2) {
            int iE3 = e();
            int iE4 = e() - 1;
            if (iE4 == -1) {
                class_442.l[iE3] = null;
            } else {
                class_442.l[iE3] = class_442.a.values()[iE4];
            }
        }
    }
}
