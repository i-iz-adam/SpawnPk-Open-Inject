package rs;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import rs.tools.TextPopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: client-final.jar:rs/class_635.class */
public class class_635 extends FocusAdapter {
    final /* synthetic */ TextPopupWindow a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public class_635(TextPopupWindow textPopupWindow) {
        this.a = textPopupWindow;
    }

    public void focusGained(FocusEvent focusEvent) {
        this.a.e.getCaret().setVisible(true);
    }
}
