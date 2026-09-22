package rs.gui.bpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/k.class */
class k implements ActionListener {
    final /* synthetic */ JFrame a;
    final /* synthetic */ h b;

    k(h hVar, JFrame jFrame) {
        this.b = hVar;
        this.a = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.a.setVisible(false);
        this.a.dispose();
    }
}
