package rs.ui.components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/p.class */
class p extends MouseAdapter {
    final /* synthetic */ JButton a;
    final /* synthetic */ Color b;
    final /* synthetic */ Color c;
    final /* synthetic */ k d;

    p(k kVar, JButton jButton, Color color, Color color2) {
        this.d = kVar;
        this.a = jButton;
        this.b = color;
        this.c = color2;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        this.a.setForeground(this.b);
        this.d.c.dispatchEvent(mouseEvent);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.a.setForeground(this.c);
        this.d.c.dispatchEvent(mouseEvent);
    }
}
