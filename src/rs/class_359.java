package rs;

import gnu.trove.f.b.cc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rs.class_354;

/* JADX INFO: loaded from: client-final.jar:rs/class_359.class */
public class class_359<T extends class_354> {
    private final cc<List<T>> a = new cc<>();

    public void a(int i, T t) {
        if (this.a.b(i) == null) {
            this.a.a(i, new ArrayList());
        }
        this.a.b(i).add(t);
    }

    public void a(int i) {
        if (this.a.b(i) != null) {
            Iterator<T> it = this.a.b(i).iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void a() {
        this.a.clear();
    }

    public cc<List<T>> b() {
        return this.a;
    }
}
