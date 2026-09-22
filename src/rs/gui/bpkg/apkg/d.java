package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/d.class */
class d implements ActionListener {
    final /* synthetic */ JFrame a;
    final /* synthetic */ b b;

    d(b bVar, JFrame jFrame) {
        this.b = bVar;
        this.a = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.a.setVisible(false);
        this.a.dispose();
    }
}
