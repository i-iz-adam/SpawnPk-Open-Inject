package rs.plugins.t;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/n.class */
class n extends MouseAdapter {
    final /* synthetic */ List a;
    final /* synthetic */ Color b;
    final /* synthetic */ m c;

    n(m mVar, List list, Color color) {
        this.c = mVar;
        this.a = list;
        this.b = color;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.c.a((JPanel) it.next(), rs.gui.d.h);
        }
        this.c.setCursor(new Cursor(12));
    }

    public void mouseExited(MouseEvent mouseEvent) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.c.a((JPanel) it.next(), this.b);
        }
        this.c.setCursor(new Cursor(0));
    }

    public void mouseReleased(MouseEvent mouseEvent) {
    }
}
