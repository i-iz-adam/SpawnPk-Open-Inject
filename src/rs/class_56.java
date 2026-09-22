package rs;

import gnu.trove.i.a.i;
import java.util.ArrayList;
import java.util.List;
import rs.plugins.cpkg.d;

/* JADX INFO: loaded from: client-final.jar:rs/class_56.class */
public class class_56 extends class_58 {
    private i b;
    private List<class_57> c = new ArrayList();
    private i a = new i();

    public class_56(int[][][] iArr) {
        if (d.b()) {
            this.b = new i();
        }
        for (int[][] iArr2 : iArr) {
            class_57 class_57Var = new class_57(this);
            class_57Var.c = new i();
            class_57Var.d = iArr2[1];
            for (int i : iArr2[0]) {
                if (d.b()) {
                    this.b.b(i);
                }
                this.a.b(i);
                class_57Var.c.b(i);
            }
            this.c.add(class_57Var);
        }
    }

    @Override // rs.class_58
    public void a(ColorUtility colorUtility) {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).a = 0;
        }
    }

    @Override // rs.class_58
    public void a(ColorUtility colorUtility, int i) {
        if (this.a.a_(colorUtility.ar[i])) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                if (this.c.get(i2).c.a_(colorUtility.ar[i])) {
                    colorUtility.ar[i] = this.c.get(i2).a();
                    return;
                }
            }
        }
    }

    public i a() {
        return this.a;
    }

    public i b() {
        return this.b;
    }
}
