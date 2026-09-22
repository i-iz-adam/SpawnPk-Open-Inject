package rs.gui.bpkg.apkg;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/o.class */
class o implements ActionListener {
    final /* synthetic */ JPopupMenu a;
    final /* synthetic */ JMenuItem b;
    final /* synthetic */ rs.gui.bpkg.h c;
    final /* synthetic */ String d;

    o(JPopupMenu jPopupMenu, JMenuItem jMenuItem, rs.gui.bpkg.h hVar, String str) {
        this.a = jPopupMenu;
        this.b = jMenuItem;
        this.c = hVar;
        this.d = str;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        for (Component component : this.a.getComponents()) {
            component.setBackground(Color.DARK_GRAY);
        }
        this.b.setBackground(Color.ORANGE);
        this.c.f().a(this.d, 0);
        this.c.b();
    }
}
