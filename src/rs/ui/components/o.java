package rs.ui.components;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/o.class */
class o implements DocumentListener {
    final /* synthetic */ k a;

    o(k kVar) {
        this.a = kVar;
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        this.a.d();
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        this.a.d();
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        this.a.d();
    }
}
