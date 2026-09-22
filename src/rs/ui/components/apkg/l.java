package rs.ui.components.apkg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/l.class */
class l extends MouseMotionAdapter {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getY());
    }
}
