package rs.gui.bpkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/i.class */
class i extends MouseAdapter {
    final /* synthetic */ h a;

    i(h hVar) {
        this.a = hVar;
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 1) {
            this.a.k.show(mouseEvent.getComponent(), 1, 1);
        }
    }
}
