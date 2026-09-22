package rs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/k.class */
class k implements ActionListener {
    final /* synthetic */ e a;

    k(e eVar) {
        this.a = eVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (Launcher.n().o() == null || !Launcher.n().o().fc) {
            return;
        }
        Launcher.n().o();
        Client.ap = "::range";
    }
}
