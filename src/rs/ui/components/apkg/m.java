package rs.ui.components.apkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/m.class */
class m extends MouseAdapter {
    final /* synthetic */ k a;

    m(k kVar) {
        this.a = kVar;
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getY());
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getY());
    }
}
