package rs.plugins.bpkg;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import rs.class_134;
import rs.class_138;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/e.class */
class e extends FocusAdapter {
    final /* synthetic */ i a;
    final /* synthetic */ class_134 b;
    final /* synthetic */ class_138 c;
    final /* synthetic */ a d;

    e(a aVar, i iVar, class_134 class_134Var, class_138 class_138Var) {
        this.d = aVar;
        this.a = iVar;
        this.b = class_134Var;
        this.c = class_138Var;
    }

    public void focusLost(FocusEvent focusEvent) {
        this.d.a((Component) this.a, this.b, this.c);
    }
}
