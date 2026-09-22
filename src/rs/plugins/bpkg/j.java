package rs.plugins.bpkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/j.class */
class j extends MouseAdapter {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 1) {
            this.a.a(l.a);
        }
    }
}
