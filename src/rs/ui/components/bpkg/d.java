package rs.ui.components.bpkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/b/d.class */
class d extends MouseAdapter {
    final /* synthetic */ a a;

    d(a aVar) {
        this.a = aVar;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        ((a) mouseEvent.getSource()).setBackground(rs.gui.d.g);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        ((a) mouseEvent.getSource()).setBackground(rs.gui.d.c);
    }
}
