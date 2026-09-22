package rs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.Client;

/* JADX INFO: loaded from: client-final.jar:rs/gui/z.class */
class z implements ActionListener {
    final /* synthetic */ Launcher a;

    z(Launcher launcher) {
        this.a = launcher;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Client.i = true;
    }
}
