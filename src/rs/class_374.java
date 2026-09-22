package rs;

import java.util.Iterator;

/* JADX INFO: loaded from: client-final.jar:rs/class_374.class */
class class_374 extends class_355 {
    final /* synthetic */ class_371 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    class_374(class_371 class_371Var, long j) {
        super(j);
        this.g = class_371Var;
    }

    @Override // rs.class_355, rs.class_354
    public void c() {
        int i = 30333;
        Iterator it = class_371.g.iterator();
        while (it.hasNext()) {
            Widget.H[i].as = ((class_372) it.next()).a();
            i += 6;
        }
    }
}
