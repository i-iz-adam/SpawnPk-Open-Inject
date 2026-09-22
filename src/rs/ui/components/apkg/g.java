package rs.ui.components.apkg;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/g.class */
class g extends FocusAdapter {
    final /* synthetic */ e a;

    g(e eVar) {
        this.a = eVar;
    }

    public void focusLost(FocusEvent focusEvent) {
        this.a.b();
    }
}
