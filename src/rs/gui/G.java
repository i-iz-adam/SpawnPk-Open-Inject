package rs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/g.class */
class g implements ActionListener {
    final /* synthetic */ e a;

    g(e eVar) {
        this.a = eVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (Launcher.n().o() == null || !Launcher.n().o().fc) {
            return;
        }
        Launcher.n().o();
        Client.ap = "::entangle";
    }
}
