package rs.ui.components.bpkg;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/b/c.class */
class c extends MouseAdapter {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        ((a) mouseEvent.getSource()).setForeground(Color.WHITE);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        a aVar = (a) mouseEvent.getSource();
        if (aVar.d()) {
            return;
        }
        aVar.setForeground(Color.GRAY);
    }
}
