package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/t.class */
class t implements ActionListener {
    final /* synthetic */ rs.gui.bpkg.h a;

    t(rs.gui.bpkg.h hVar) {
        this.a = hVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String str = null;
        for (String str2 : this.a.f().keySet()) {
            if (str2.equals(this.a.f().e())) {
                break;
            } else {
                str = str2;
            }
        }
        if (str == null) {
            return;
        }
        this.a.f().c(this.a.f().e(), str);
    }
}
