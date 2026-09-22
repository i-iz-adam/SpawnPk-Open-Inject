package rs.ui.components;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;
import javax.swing.JPopupMenu;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/n.class */
class n extends FocusAdapter {
    final /* synthetic */ JPopupMenu a;
    final /* synthetic */ JList b;
    final /* synthetic */ k c;

    n(k kVar, JPopupMenu jPopupMenu, JList jList) {
        this.c = kVar;
        this.a = jPopupMenu;
        this.b = jList;
    }

    public void focusLost(FocusEvent focusEvent) {
        this.a.setVisible(false);
        this.b.clearSelection();
        this.b.getUI().resetRolloverIndex();
    }
}
