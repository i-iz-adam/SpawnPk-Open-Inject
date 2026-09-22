package rs.plugins.bpkg;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import rs.class_134;
import rs.class_138;
import rs.class_9;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/d.class */
class d extends MouseAdapter {
    final /* synthetic */ rs.ui.components.b a;
    final /* synthetic */ class_138 b;
    final /* synthetic */ boolean c;
    final /* synthetic */ class_134 d;
    final /* synthetic */ a e;

    d(a aVar, rs.ui.components.b bVar, class_138 class_138Var, boolean z, class_134 class_134Var) {
        this.e = aVar;
        this.a = bVar;
        this.b = class_138Var;
        this.c = z;
        this.d = class_134Var;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        rs.ui.components.apkg.q qVarA = this.e.q.a(SwingUtilities.windowForComponent(this.e), this.a.a(), this.b.d().c(), this.c);
        qVarA.setLocationRelativeTo(this.a);
        rs.ui.components.b bVar = this.a;
        boolean z = this.c;
        qVarA.a(color -> {
            bVar.a(color);
            bVar.setText("#" + (z ? class_9.c(color) : class_9.d(color)).toUpperCase());
        });
        class_134 class_134Var = this.d;
        class_138 class_138Var = this.b;
        qVarA.b(color2 -> {
            this.e.a((Component) qVarA, class_134Var, class_138Var);
        });
        qVarA.setVisible(true);
    }
}
