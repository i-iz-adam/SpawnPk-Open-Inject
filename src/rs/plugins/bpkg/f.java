package rs.plugins.bpkg;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;
import rs.class_134;
import rs.class_138;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/f.class */
class f extends FocusAdapter {
    final /* synthetic */ JList a;
    final /* synthetic */ class_134 b;
    final /* synthetic */ class_138 c;
    final /* synthetic */ a d;

    f(a aVar, JList jList, class_134 class_134Var, class_138 class_138Var) {
        this.d = aVar;
        this.a = jList;
        this.b = class_134Var;
        this.c = class_138Var;
    }

    public void focusLost(FocusEvent focusEvent) {
        this.d.a((Component) this.a, this.b, this.c);
    }
}
