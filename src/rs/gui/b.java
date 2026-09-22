package rs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/* JADX INFO: loaded from: client-final.jar:rs/gui/B.class */
class B implements ActionListener {
    final /* synthetic */ Launcher a;

    B(Launcher launcher) {
        this.a = launcher;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (Launcher.n().m() != null) {
            if (this.a.l.a().d.isPopupVisible()) {
                return;
            } else {
                Launcher.n().m().repaint();
            }
        }
        ((Timer) actionEvent.getSource()).stop();
        this.a.r = false;
    }
}
