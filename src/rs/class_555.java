package rs;

import java.util.ArrayList;

/* JADX INFO: loaded from: client-final.jar:rs/class_555.class */
public class class_555 extends class_553 {
    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            class_345.b();
        }
        if (iE == 1) {
            int iG = g();
            int iE2 = e();
            ArrayList arrayList = new ArrayList(iE2);
            for (int i = 0; i < iE2; i++) {
                String strH = "Select";
                String strH2 = h();
                if (e() == 1) {
                    strH = h();
                }
                arrayList.add(new class_346(strH2, strH));
            }
            class_343 class_343Var = (class_343) Widget.l(iG);
            class_343Var.a(arrayList);
            class_343Var.as = ((class_346) arrayList.get(0)).a();
        }
        if (iE == 2) {
            int iG2 = g();
            int iE3 = e();
            class_343 class_343Var2 = (class_343) Widget.l(iG2);
            class_343Var2.as = class_343Var2.i().get(iE3).a();
        }
    }
}
