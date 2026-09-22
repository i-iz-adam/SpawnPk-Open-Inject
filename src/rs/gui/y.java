package rs.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/gui/y.class */
class y extends MouseAdapter {
    final /* synthetic */ Launcher a;

    y(Launcher launcher) {
        this.a = launcher;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        this.a.i().setState(0);
        this.a.i().setVisible(true);
    }
}
