package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/i.class */
class i implements ActionListener {
    final /* synthetic */ y a;
    final /* synthetic */ g b;

    i(g gVar, y yVar) {
        this.b = gVar;
        this.a = yVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        rs.gui.bpkg.a aVarB = this.b.a.b(this.b.a.e(), this.a.c());
        if (aVarB != null) {
            aVarB.a(this.a.b());
            aVarB.a(this.a.a());
            this.b.a.a(this.b.a.e(), this.b.a.d());
        }
    }
}
