package rs.ui.components.apkg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/i.class */
class i extends MouseMotionAdapter {
    final /* synthetic */ h a;

    i(h hVar) {
        this.a = hVar;
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getX(), true);
    }
}
