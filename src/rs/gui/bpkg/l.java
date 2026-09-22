package rs.gui.bpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.gui.bpkg.apkg.y;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/l.class */
class l implements ActionListener {
    final /* synthetic */ h a;

    l(h hVar) {
        this.a = hVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        a aVarC = this.a.e.c();
        String strE = this.a.e.e();
        if (aVarC == null) {
            return;
        }
        y yVar = new y(this.a.e, "Re-name \"" + aVarC.f() + "\" to..", "Rename");
        yVar.a(new m(this, yVar, aVarC, strE));
        yVar.setName(aVarC.f());
        yVar.a(aVarC.j());
        yVar.a(aVarC.k());
    }
}
