package rs;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import rs.tools.TextPopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: client-final.jar:rs/class_636.class */
public class class_636 extends AbstractAction {
    final /* synthetic */ TextPopupWindow.a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public class_636(TextPopupWindow.a aVar) {
        this.a = aVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.a.dispose();
    }
}
