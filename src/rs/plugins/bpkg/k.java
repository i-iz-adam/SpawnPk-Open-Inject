package rs.plugins.bpkg;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/k.class */
class k extends KeyAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ i b;

    k(i iVar, boolean z) {
        this.b = iVar;
        this.a = z;
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (this.a) {
            this.b.a(new l(keyEvent));
        } else {
            this.b.a(new l(keyEvent));
        }
    }
}
