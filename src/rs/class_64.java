package rs;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: client-final.jar:rs/class_64.class */
public class class_64 {
    CopyOnWriteArrayList<class_65> a = new CopyOnWriteArrayList<>();
    class_65[] b = new class_65[4];

    public boolean a(int i, int i2, int i3, int i4, boolean z) {
        int iNextInt = i2 * ((!Configuration.ak || i2 <= 0) ? 1 : 10);
        if (Configuration.ak && iNextInt > 0 && i != 3 && i != 2) {
            iNextInt += new Random().nextInt(9);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (this.b[i5] == null || this.b[i5].g() <= i3) {
                if (this.b[i5] == null) {
                    this.b[i5] = new class_65(i, iNextInt, i4);
                } else {
                    this.b[i5].e(iNextInt);
                    this.b[i5].c(i4);
                    this.b[i5].d(i);
                }
                this.b[i5].a(0);
                this.b[i5].b(230);
                this.b[i5].g(i3 + 70);
                return true;
            }
        }
        if (!z) {
            return false;
        }
        this.a.add(new class_65(i, iNextInt, i4));
        return false;
    }

    public final void a() {
        for (int i = 0; i < this.a.size(); i++) {
            class_65 class_65Var = this.a.get(i);
            if (a(class_65Var.d(), class_65Var.e(), Client.ff, class_65Var.c(), false)) {
                this.a.remove(class_65Var);
            }
        }
    }

    public boolean a(int i) {
        return this.b[i] != null && this.b[i].g() > Client.ff;
    }

    public void b() {
        this.b = new class_65[4];
        this.a.clear();
    }

    public CopyOnWriteArrayList<class_65> c() {
        return this.a;
    }

    public class_65[] d() {
        return this.b;
    }
}
