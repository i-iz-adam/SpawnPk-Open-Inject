package rs.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/* JADX INFO: loaded from: client-final.jar:rs/ui/g.class */
class g extends WindowAdapter {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    public void windowClosing(WindowEvent windowEvent) {
        int iShowConfirmDialog = 0;
        if (this.a.v()) {
            try {
                iShowConfirmDialog = JOptionPane.showConfirmDialog(this.a.k, "Are you sure you want to exit?", "Exit", 2, 3);
            } catch (Exception e) {
                f.a.warn("Unexpected exception occurred while check for confirm required", (Throwable) e);
            }
        }
        if (iShowConfirmDialog == 0) {
            this.a.u();
        }
    }
}
