package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/w.class */
class w implements ActionListener {
    final /* synthetic */ String a;
    final /* synthetic */ JFrame b;
    final /* synthetic */ v c;

    w(v vVar, String str, JFrame jFrame) {
        this.c = vVar;
        this.a = str;
        this.b = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.c.a.f().b(this.a);
        this.b.setVisible(false);
        this.b.dispose();
    }
}
