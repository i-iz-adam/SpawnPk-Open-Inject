package rs.gui.bpkg.apkg;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/l.class */
class l implements PopupMenuListener {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
        Launcher.n().k().repaint();
    }

    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        Launcher.n().k().a();
    }

    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        Launcher.n().k().repaint();
    }
}
