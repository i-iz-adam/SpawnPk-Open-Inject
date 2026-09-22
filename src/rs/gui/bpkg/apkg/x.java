package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/x.class */
class x implements ActionListener {
    final /* synthetic */ JFrame a;
    final /* synthetic */ v b;

    x(v vVar, JFrame jFrame) {
        this.b = vVar;
        this.a = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.a.setVisible(false);
        this.a.dispose();
    }
}
