package rs;

import java.util.function.Supplier;

/* JADX INFO: loaded from: client-final.jar:rs/class_318.class */
class class_318 extends class_11 {
    final /* synthetic */ class_317 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    class_318(class_317 class_317Var, Supplier supplier) {
        super(supplier);
        this.a = class_317Var;
    }

    @Override // rs.class_11
    public void b() {
        this.a.s = true;
    }

    @Override // rs.class_11
    public void c() {
        if (this.a.s) {
            this.a.s = false;
            this.a.c();
        }
    }
}
