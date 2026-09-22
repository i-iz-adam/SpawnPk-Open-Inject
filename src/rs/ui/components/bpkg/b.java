package rs.ui.components.bpkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/b/b.class */
class b extends MouseAdapter {
    final /* synthetic */ e a;
    final /* synthetic */ a b;

    b(a aVar, e eVar) {
        this.b = aVar;
        this.a = eVar;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.a.b(this.b);
    }
}
