package rs.ui.components.apkg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/b.class */
class b extends MouseMotionAdapter {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        this.a.a(mouseEvent.getX(), mouseEvent.getY(), true);
    }
}
