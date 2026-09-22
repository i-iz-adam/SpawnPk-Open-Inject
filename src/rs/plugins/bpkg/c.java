package rs.plugins.bpkg;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.text.JTextComponent;
import rs.class_134;
import rs.class_138;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/c.class */
class c extends FocusAdapter {
    final /* synthetic */ JTextComponent a;
    final /* synthetic */ class_134 b;
    final /* synthetic */ class_138 c;
    final /* synthetic */ a d;

    c(a aVar, JTextComponent jTextComponent, class_134 class_134Var, class_138 class_138Var) {
        this.d = aVar;
        this.a = jTextComponent;
        this.b = class_134Var;
        this.c = class_138Var;
    }

    public void focusLost(FocusEvent focusEvent) {
        this.d.a((Component) this.a, this.b, this.c);
    }
}
