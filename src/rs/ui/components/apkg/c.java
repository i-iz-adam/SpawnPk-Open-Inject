package rs.ui.components.apkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/c.class */
class c extends MouseAdapter {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getX(), mouseEvent.getY(), true);
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getX(), mouseEvent.getY(), true);
    }
}
