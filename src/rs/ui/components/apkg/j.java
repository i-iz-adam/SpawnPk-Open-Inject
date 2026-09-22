package rs.ui.components.apkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/j.class */
class j extends MouseAdapter {
    final /* synthetic */ h a;

    j(h hVar) {
        this.a = hVar;
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getX(), true);
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getX(), true);
    }
}
