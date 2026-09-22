package rs.ui.components.apkg;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/r.class */
class r extends MouseAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ n b;
    final /* synthetic */ q c;

    r(q qVar, boolean z, n nVar) {
        this.c = qVar;
        this.a = z;
        this.b = nVar;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        if (!this.a) {
            this.c.l.a(this.b.a().getAlpha());
        }
        this.c.a(this.b.a());
        this.c.b();
    }
}
