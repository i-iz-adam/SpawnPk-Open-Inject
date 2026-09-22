package rs.plugins.bpkg;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/s.class */
class s implements DocumentListener {
    final /* synthetic */ q a;

    s(q qVar) {
        this.a = qVar;
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        this.a.f();
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        this.a.f();
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        this.a.f();
    }
}
