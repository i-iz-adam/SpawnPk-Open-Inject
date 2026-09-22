package rs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/m.class */
class m implements ActionListener {
    final /* synthetic */ e a;

    m(e eVar) {
        this.a = eVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Client.d("http://spawnpk.net/forums/");
    }
}
