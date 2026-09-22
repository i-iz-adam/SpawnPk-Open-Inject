package rs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_290.class */
public class class_290 extends class_306 {
    private static final int e = 1000;
    private final List<class_288> f = new ArrayList();
    private final List<class_288> g = new ArrayList();

    public class_290() {
        a(class_268.A);
    }

    @Override // rs.class_306
    public void a() {
        if (this.f.size() == 0) {
            return;
        }
        for (int i = 0; i < this.f.size(); i++) {
            class_288 class_288Var = this.f.get(i);
            class_288Var.a();
            if (!class_194.a()) {
                class_288Var.b();
            }
            if (!class_288Var.c()) {
                this.g.add(class_288Var);
            }
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.f.remove(this.g.get(i2));
        }
        this.g.clear();
    }

    public void c(int i, int i2) {
        if (Client.cH == -1) {
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (i6 < 4) {
            for (int i7 = 0; i7 < i; i7++) {
                class_288 class_288Var = new class_288(i2, i3, i4);
                if (i6 == 0 || i6 == 2) {
                    class_288Var.a(class_289.b);
                } else {
                    class_288Var.a(class_289.a);
                }
                class_288Var.b(i6 >= 2 ? -0.25d : 0.25d);
                class_288Var.a(1 + Client.d(25));
                class_288Var.b(3, 3);
                class_288Var.e(1 + Client.d(2));
                class_288Var.i(i5);
                a(class_288Var);
            }
            i6++;
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4, 255);
    }

    public void a(class_288 class_288Var) {
        if (this.f.size() >= 1000) {
            return;
        }
        this.f.add(class_288Var);
    }
}
