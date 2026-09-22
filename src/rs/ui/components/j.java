package rs.ui.components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/j.class */
class j extends MouseAdapter {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        if (this.a.d || this.a.c == null) {
            return;
        }
        this.a.a(this.a.c, false);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.a.setBackground(this.a.b);
    }
}
