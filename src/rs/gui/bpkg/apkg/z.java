package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/z.class */
class z implements ActionListener {
    final /* synthetic */ y a;

    z(y yVar) {
        this.a = yVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.a.setVisible(false);
        this.a.dispose();
    }
}
