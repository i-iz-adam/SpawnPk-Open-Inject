package rs.plugins.t;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/e.class */
class e extends MouseAdapter {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            this.a.b();
        }
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        this.a.g.setBackground(rs.gui.d.g);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.a.g.setBackground(rs.gui.d.c);
    }
}
