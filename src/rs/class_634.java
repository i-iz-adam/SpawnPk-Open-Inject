package rs;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import rs.tools.TextPopupWindow;
import rs.tools.TextPopupWindow.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: client-final.jar:rs/class_634.class */
public class class_634 extends AbstractAction {
    final /* synthetic */ TextPopupWindow a;
    final /* synthetic */ TextPopupWindow b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public class_634(TextPopupWindow textPopupWindow, TextPopupWindow textPopupWindow2) {
        this.b = textPopupWindow;
        this.a = textPopupWindow2;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.b.g != null && this.b.g.isVisible()) {
            this.b.g.a();
            return;
        }
        this.b.g = this.b.new a(this.a);
        this.b.g.b();
    }
}
