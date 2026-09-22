package rs.ui.components.apkg;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/t.class */
class t extends FocusAdapter {
    final /* synthetic */ q a;

    t(q qVar) {
        this.a = qVar;
    }

    public void focusLost(FocusEvent focusEvent) {
        this.a.d();
    }
}
