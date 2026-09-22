package rs;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: client-final.jar:rs/class_564.class */
public class class_564 extends class_553 {
    @Override // rs.class_553
    public void a() {
        int iE = e();
        if (iE == 0) {
            int iC = c();
            int iC2 = c();
            int iE2 = e();
            e();
            class_120.a.remove(iC + "," + iC2 + "," + iE2);
            this.c.a(iC, iC2, -1, 0, 10, iE2);
        }
        if (iE == 1) {
            class_121 class_121Var = new class_121();
            class_121Var.a = g();
            class_121Var.b = c();
            class_121Var.c = c();
            class_121Var.d = e();
            class_121Var.f = e();
            class_121Var.e = e();
            class_120.a.put(class_121Var.b + "," + class_121Var.c + "," + class_121Var.d, class_121Var);
            this.c.a(class_121Var.b, class_121Var.c, class_121Var.a, class_121Var.e, class_121Var.f, class_121Var.d);
        }
        if (iE == 2) {
            int iG = g();
            ArrayList arrayList = new ArrayList();
            for (String str : class_120.a.keySet()) {
                if (class_120.a.get(str).a == iG) {
                    arrayList.add(str);
                    this.c.a(class_120.a.get(str).b, class_120.a.get(str).c, -1, 0, 10, class_120.a.get(str).d);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                class_120.a.remove((String) it.next());
            }
        }
    }
}
