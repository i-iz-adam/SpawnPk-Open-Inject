package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_662.class */
public class class_662 {
    private final List<class_661> a = new ArrayList();
    private final long b;
    private final int c;

    public class_662(int i, long j) {
        this.c = i;
        this.b = j;
    }

    public void a() {
        if (this.b == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (class_661 class_661Var : this.a) {
            if (System.currentTimeMillis() - class_661Var.c() >= this.b) {
                arrayList.add(class_661Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.remove((class_661) it.next());
        }
    }

    public int b() {
        return this.c;
    }

    public void a(int i, long j) {
        this.a.add(new class_661(this.c, i, j));
    }

    public int c() {
        int iB = 0;
        Iterator<class_661> it = this.a.iterator();
        while (it.hasNext()) {
            iB += it.next().b();
        }
        return iB;
    }

    public int d() {
        int i = 0;
        for (class_661 class_661Var : this.a) {
            i++;
        }
        return i;
    }
}
