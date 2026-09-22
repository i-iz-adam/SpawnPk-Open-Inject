package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/s.class */
class s implements ActionListener {
    final /* synthetic */ JTextField a;
    final /* synthetic */ JFrame b;
    final /* synthetic */ r c;

    s(r rVar, JTextField jTextField, JFrame jFrame) {
        this.c = rVar;
        this.a = jTextField;
        this.b = jFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.c.a.f().a(this.c.a.f().e(), this.a.getText());
        this.b.setVisible(false);
        this.b.dispose();
    }
}
