package rs;

import gnu.trove.f.M;
import gnu.trove.f.b.cc;

/* JADX INFO: loaded from: client-final.jar:rs/class_285.class */
public class class_285 extends class_308 {
    private final M<class_286> i;

    public class_285() {
        a(class_268.i);
        class_287.a(this);
        this.i = new cc();
    }

    @Override // rs.class_306
    public void a() {
        if (this.i.w_((int) this.e.aG.x)) {
            class_286 class_286VarB = this.i.b((int) this.e.aG.x);
            a(this.e.ac + class_286VarB.b, this.e.ad + class_286VarB.c, this.e.r + class_286VarB.d);
            Client.fE[class_286VarB.a].f(this.c, this.d);
        }
    }

    @Override // rs.class_306
    public void c() {
        k();
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        this.i.a(i, new class_286(this, i2, i3, i4, i5));
    }

    public void a(int i) {
        this.i.c(i);
    }

    public void k() {
        this.i.clear();
    }
}
