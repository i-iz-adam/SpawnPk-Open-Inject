package rs.plugins.bpkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import rs.class_143;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/b.class */
class b extends MouseAdapter {
    final /* synthetic */ class_143 a;
    final /* synthetic */ JButton b;
    final /* synthetic */ JPanel c;
    final /* synthetic */ a d;

    b(a aVar, class_143 class_143Var, JButton jButton, JPanel jPanel) {
        this.d = aVar;
        this.a = class_143Var;
        this.b = jButton;
        this.c = jPanel;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        this.d.a(this.a, this.b, this.c);
    }
}
