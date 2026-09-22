package rs.ui.components;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/m.class */
class m implements ListDataListener {
    final /* synthetic */ k a;

    m(k kVar) {
        this.a = kVar;
    }

    public void intervalAdded(ListDataEvent listDataEvent) {
        this.a.d();
    }

    public void intervalRemoved(ListDataEvent listDataEvent) {
        this.a.d();
    }

    public void contentsChanged(ListDataEvent listDataEvent) {
        this.a.d();
    }
}
