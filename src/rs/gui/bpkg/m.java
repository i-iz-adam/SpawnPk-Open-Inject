package rs.gui.bpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rs.gui.bpkg.apkg.y;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/m.class */
class m implements ActionListener {
    final /* synthetic */ y a;
    final /* synthetic */ a b;
    final /* synthetic */ String c;
    final /* synthetic */ l d;

    m(l lVar, y yVar, a aVar, String str) {
        this.d = lVar;
        this.a = yVar;
        this.b = aVar;
        this.c = str;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String strC = this.a.c();
        this.b.a(this.a.a());
        this.b.a(this.a.b());
        this.d.a.e.a(this.c, this.b, strC);
    }
}
