package rs.gui.bpkg.apkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/u.class */
class u implements ActionListener {
    final /* synthetic */ rs.gui.bpkg.h a;

    u(rs.gui.bpkg.h hVar) {
        this.a = hVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String str = null;
        boolean z = false;
        for (String str2 : this.a.f().keySet()) {
            if (z) {
                str = str2;
                break;
            } else if (str2.equals(this.a.f().e())) {
                z = true;
            }
        }
        if (str == null) {
            return;
        }
        this.a.f().c(this.a.f().e(), str);
    }
}
