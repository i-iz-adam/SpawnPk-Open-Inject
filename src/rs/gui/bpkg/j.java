package rs.gui.bpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/j.class */
class j implements ActionListener {
    final /* synthetic */ String a;
    final /* synthetic */ a b;
    final /* synthetic */ JFrame c;
    final /* synthetic */ h d;

    j(h hVar, String str, a aVar, JFrame jFrame) {
        this.d = hVar;
        this.a = str;
        this.b = aVar;
        this.c = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.d.e.d(this.a, this.b.f());
        this.c.setVisible(false);
        this.c.dispose();
    }
}
