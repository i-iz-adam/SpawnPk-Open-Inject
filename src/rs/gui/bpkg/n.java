package rs.gui.bpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/n.class */
class n implements ActionListener {
    final /* synthetic */ h a;

    n(h hVar) {
        this.a = hVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.e.c() == null) {
            return;
        }
        int selectedIndex = this.a.d.getSelectedIndex();
        this.a.e.a(this.a.e.e(), selectedIndex, selectedIndex - 1);
    }
}
