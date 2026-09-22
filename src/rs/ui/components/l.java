package rs.ui.components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/l.class */
class l extends MouseAdapter {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        Color colorE;
        if (this.a.c.f() || (colorE = this.a.c.e()) == null) {
            return;
        }
        super/*javax.swing.JPanel*/.setBackground(colorE);
        this.a.c.a(colorE, false);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.a.setBackground(this.a.c.d());
    }
}
