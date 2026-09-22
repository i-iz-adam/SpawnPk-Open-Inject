package rs.lpkg.bpkg;

import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: client-final.jar:rs/l/b/d.class */
public class d extends LinkedHashMap<Integer, IntBuffer> {
    private final a a;

    public d(a aVar) {
        super(512, 0.7f, true);
        this.a = aVar;
    }

    public boolean a() {
        Iterator it = super.values().iterator();
        if (!it.hasNext()) {
            return false;
        }
        this.a.a((IntBuffer) it.next());
        it.remove();
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator it = super.values().iterator();
        while (it.hasNext()) {
            this.a.a((IntBuffer) it.next());
            it.remove();
        }
    }
}
