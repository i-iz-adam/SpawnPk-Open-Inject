package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/m.class */
class m implements ActionListener {
    final /* synthetic */ k a;

    m(k kVar) {
        this.a = kVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.a.b.a(this.a.b.e(), this.a.getSelectedIndex());
        Launcher.n().k().repaint();
    }
}
